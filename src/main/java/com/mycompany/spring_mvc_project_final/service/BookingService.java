/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_mvc_project_final.service;

import com.mycompany.spring_mvc_project_final.entities.BookingEntity;
import com.mycompany.spring_mvc_project_final.enums.BookingStatus;
import com.mycompany.spring_mvc_project_final.repository.BookingRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import com.mycompany.spring_mvc_project_final.entities.BookingEntity;
import java.awt.Color;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    // add, get, change status, print invoice, export: 
    // get booking: 
    public BookingEntity findBookingById(int id) {
        Optional<BookingEntity> optional = bookingRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            return new BookingEntity();
        }
    }

    //add booking: 
    public void saveBooking(BookingEntity booking) {
        bookingRepository.save(booking);
    }

    //Change status: 
    public void changeBookingStatus(int id, BookingStatus status) {
        BookingEntity booking = findBookingById(id);
        booking.setBookingStatus(status);
        bookingRepository.save(booking);

    }

    //print invoice: 
    public void writeTableHeader(PdfPTable table) {
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.yellow);
        cell.setPadding(5);

        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(Color.WHITE);

        cell.setPhrase(new Phrase("Booking ID", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Check-in Date", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Check-out Date", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Total", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Account ID", font));
        table.addCell(cell);

    }

    private void writeTableData(PdfPTable table) {

        for (BookingEntity booking : bookingRepository.findAll()) {
            table.addCell(String.valueOf(booking.getId()));
            table.addCell(String.valueOf(booking.getCheckin()));
            table.addCell(String.valueOf(booking.getCheckOut()));
            table.addCell(String.valueOf(booking.getTotalPrice()));
            table.addCell(String.valueOf(booking.getUser().getId()));
        }
    }

//      Export: 
    public void export(HttpServletResponse response) throws DocumentException, IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();
        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(18);
        font.setColor(Color.BLUE);

        Paragraph p = new Paragraph("List of Bookings", font);
        p.setAlignment(Paragraph.ALIGN_CENTER);

        document.add(p);

        PdfPTable table = new PdfPTable(5);
        table.setWidthPercentage(100f);
        table.setWidths(new float[]{1.5f, 3.5f, 3.0f, 3.0f, 1.5f});
        table.setSpacingBefore(10);

        writeTableHeader(table);
        writeTableData(table);

        document.add(table);

        document.close();

    }

}
