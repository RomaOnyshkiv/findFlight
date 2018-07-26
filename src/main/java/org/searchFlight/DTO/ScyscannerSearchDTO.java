package org.searchFlight.DTO;

public class ScyscannerSearchDTO {

    private String country;
    private String currency;
    private String locale;
    private String originalPlace;
    private String destinationPlace;
    private String outboundPartialDate;
    private String inboundPartialDate;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getOriginalPlace() {
        return originalPlace;
    }

    public void setOriginalPlace(String originalPlace) {
        this.originalPlace = originalPlace;
    }

    public String getDestinationPlace() {
        return destinationPlace;
    }

    public void setDestinationPlace(String destinationPlace) {
        this.destinationPlace = destinationPlace;
    }

    public String getOutboundPartialDate() {
        return outboundPartialDate;
    }

    public void setOutboundPartialDate(String outboundPartialDate) {
        this.outboundPartialDate = outboundPartialDate;
    }

    public String getInboundPartialDate() {
        return inboundPartialDate;
    }

    public void setInboundPartialDate(String inboundPartialDate) {
        this.inboundPartialDate = inboundPartialDate;
    }
}
