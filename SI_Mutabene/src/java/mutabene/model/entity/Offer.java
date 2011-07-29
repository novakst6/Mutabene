/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mutabene.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Anysek
 */
@Entity
@Table(name = "OFFERS")
public class Offer implements Serializable {
    private Long id;
    private String text;
    private String title;
    private Date dateOfInsert;
    private User user;
    private OfferType offerType;
    private OfferState offerState;
    private Card card;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OFFER_ID")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "DATE_OF_INSERT")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDate() {
        return dateOfInsert;
    }

    public void setDate(Date dateOfInsert) {
        this.dateOfInsert = dateOfInsert;
    }

    @Column(name = "TEXT")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //@Column(name = "CARD_ID")
    @ManyToOne @PrimaryKeyJoinColumn
    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    //@Column(name = "OFFER_STATE_ID")
    @ManyToOne @PrimaryKeyJoinColumn
    public OfferState getOfferState() {
        return offerState;
    }

    public void setOfferState(OfferState offerState) {
        this.offerState = offerState;
    }

    //@Column(name = "OFFER_TYPE_ID")
    @ManyToOne @PrimaryKeyJoinColumn
    public OfferType getOfferType() {
        return offerType;
    }

    public void setOfferType(OfferType offerType) {
        this.offerType = offerType;
    }

    //@Column(name = "USER_ID")
    @ManyToOne @PrimaryKeyJoinColumn
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
