package com.mycompany.myapp.domain;


import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Contact.
 */
@Entity
@Table(name = "contact")
@Document(indexName = "contact")
public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "nif", nullable = false)
    private String nif;

    @Column(name = "title")
    private String title;

    @Column(name = "address")
    private String address;

    @Column(name = "postal_code_4")
    private String postalCode4;

    @Column(name = "postal_code_3")
    private String postalCode3;

    @Column(name = "activity")
    private String activity;

    @Column(name = "cae")
    private String cae;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "website")
    private String website;

    @Column(name = "fax")
    private String fax;

    @Column(name = "region")
    private String region;

    @Column(name = "county")
    private String county;

    @Column(name = "parish")
    private String parish;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public Contact nif(String nif) {
        this.nif = nif;
        return this;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getTitle() {
        return title;
    }

    public Contact title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public Contact address(String address) {
        this.address = address;
        return this;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode4() {
        return postalCode4;
    }

    public Contact postalCode4(String postalCode4) {
        this.postalCode4 = postalCode4;
        return this;
    }

    public void setPostalCode4(String postalCode4) {
        this.postalCode4 = postalCode4;
    }

    public String getPostalCode3() {
        return postalCode3;
    }

    public Contact postalCode3(String postalCode3) {
        this.postalCode3 = postalCode3;
        return this;
    }

    public void setPostalCode3(String postalCode3) {
        this.postalCode3 = postalCode3;
    }

    public String getActivity() {
        return activity;
    }

    public Contact activity(String activity) {
        this.activity = activity;
        return this;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getCae() {
        return cae;
    }

    public Contact cae(String cae) {
        this.cae = cae;
        return this;
    }

    public void setCae(String cae) {
        this.cae = cae;
    }

    public String getEmail() {
        return email;
    }

    public Contact email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public Contact phone(String phone) {
        this.phone = phone;
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public Contact website(String website) {
        this.website = website;
        return this;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFax() {
        return fax;
    }

    public Contact fax(String fax) {
        this.fax = fax;
        return this;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getRegion() {
        return region;
    }

    public Contact region(String region) {
        this.region = region;
        return this;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCounty() {
        return county;
    }

    public Contact county(String county) {
        this.county = county;
        return this;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getParish() {
        return parish;
    }

    public Contact parish(String parish) {
        this.parish = parish;
        return this;
    }

    public void setParish(String parish) {
        this.parish = parish;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contact contact = (Contact) o;
        if (contact.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), contact.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Contact{" +
            "id=" + getId() +
            ", nif='" + getNif() + "'" +
            ", title='" + getTitle() + "'" +
            ", address='" + getAddress() + "'" +
            ", postalCode4='" + getPostalCode4() + "'" +
            ", postalCode3='" + getPostalCode3() + "'" +
            ", activity='" + getActivity() + "'" +
            ", cae='" + getCae() + "'" +
            ", email='" + getEmail() + "'" +
            ", phone='" + getPhone() + "'" +
            ", website='" + getWebsite() + "'" +
            ", fax='" + getFax() + "'" +
            ", region='" + getRegion() + "'" +
            ", county='" + getCounty() + "'" +
            ", parish='" + getParish() + "'" +
            "}";
    }
}
