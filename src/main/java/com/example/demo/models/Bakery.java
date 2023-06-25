package com.example.demo.models;

import java.time.LocalDateTime;

import org.glassfish.jaxb.runtime.v2.schemagen.xmlschema.LocalAttribute;

import jakarta.persistence.*;


@Entity
public class Bakery {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "bakery_name", nullable = false)
    private String bakeryName;
    @Column(name = "slogan", nullable = true)
    private String slogan;
    @Column(name = "description")
    private String description;
    @Column(name = "address_one")
    private String addressOne;
    @Column(name = "address_two")
    private String addressTwo;
    @Column(name = "state")
    private String state;
    @Column(name = "city")
    private String city;
    @Column(name = "zip")
    private String zip;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Long getId() { return id; }
    public String getBakeryName() { return bakeryName; }
    public String getSlogan() { return slogan; }
    public String getDescription() { return description; }
    public String getAddressOne() { return addressOne; }
    public String getAddressTWo() { return addressTwo; }
    public String getState() { return state; }
    public String getCity() { return city; }
    public String getZip() { return zip; }
    public LocalDateTime createdAt() { return createdAt; }
    public LocalDateTime updatedAt() { return updatedAt; }
}
