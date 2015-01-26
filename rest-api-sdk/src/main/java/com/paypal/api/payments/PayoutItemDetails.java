package com.paypal.api.payments;

import java.util.List;

import com.paypal.base.rest.JSONFormatter;

public class PayoutItemDetails {

	/**
	 * An ID for an individual payout. Provided by PayPal, such as in the case
	 * of getting the status of a batch request. 30 characters max.
	 */
	private String payoutItemId;

	/**
	 * Generated ID for the transaction. 30 characters max.
	 */
	private String transactionId;

	/**
	 * Status of a transaction.
	 */
	private String transactionStatus;

	/**
	 * Amount of money in U.S. dollars for fees.
	 */
	private Currency payoutItemFee;

	/**
	 * An ID for the batch payout. Generated by PayPal. 30 characters max.
	 */
	private String payoutBatchId;

	/**
	 * Sender-created ID for tracking the batch in an accounting system. 30
	 * characters max.
	 */
	private String senderBatchId;

	/**
	 * The data for a payout item that the sender initially provided.
	 */
	private PayoutItem payoutItem;

	/**
	 * Time of the last processing for this item.
	 */
	private String timeProcessed;

	/**
	 * 
	 */
	private Error error;

	/**
	 * HATEOAS links
	 */
	private List<Links> links;

	/**
	 * Default Constructor
	 */
	public PayoutItemDetails() {
	}

	/**
	 * Parameterized Constructor
	 */
	public PayoutItemDetails(String payoutItemId, String payoutBatchId,
			PayoutItem payoutItem, String timeProcessed) {
		this.payoutItemId = payoutItemId;
		this.payoutBatchId = payoutBatchId;
		this.payoutItem = payoutItem;
		this.timeProcessed = timeProcessed;
	}

	/**
	 * Setter for payoutItemId
	 */
	public PayoutItemDetails setPayoutItemId(String payoutItemId) {
		this.payoutItemId = payoutItemId;
		return this;
	}

	/**
	 * Getter for payoutItemId
	 */
	public String getPayoutItemId() {
		return this.payoutItemId;
	}

	/**
	 * Setter for transactionId
	 */
	public PayoutItemDetails setTransactionId(String transactionId) {
		this.transactionId = transactionId;
		return this;
	}

	/**
	 * Getter for transactionId
	 */
	public String getTransactionId() {
		return this.transactionId;
	}

	/**
	 * Setter for transactionStatus
	 */
	public PayoutItemDetails setTransactionStatus(
			String transactionStatus) {
		this.transactionStatus = transactionStatus;
		return this;
	}

	/**
	 * Getter for transactionStatus
	 */
	public String getTransactionStatus() {
		return this.transactionStatus;
	}

	/**
	 * Setter for payoutItemFee
	 */
	public PayoutItemDetails setPayoutItemFee(Currency payoutItemFee) {
		this.payoutItemFee = payoutItemFee;
		return this;
	}

	/**
	 * Getter for payoutItemFee
	 */
	public Currency getPayoutItemFee() {
		return this.payoutItemFee;
	}

	/**
	 * Setter for payoutBatchId
	 */
	public PayoutItemDetails setPayoutBatchId(String payoutBatchId) {
		this.payoutBatchId = payoutBatchId;
		return this;
	}

	/**
	 * Getter for payoutBatchId
	 */
	public String getPayoutBatchId() {
		return this.payoutBatchId;
	}

	/**
	 * Setter for senderBatchId
	 */
	public PayoutItemDetails setSenderBatchId(String senderBatchId) {
		this.senderBatchId = senderBatchId;
		return this;
	}

	/**
	 * Getter for senderBatchId
	 */
	public String getSenderBatchId() {
		return this.senderBatchId;
	}

	/**
	 * Setter for payoutItem
	 */
	public PayoutItemDetails setPayoutItem(PayoutItem payoutItem) {
		this.payoutItem = payoutItem;
		return this;
	}

	/**
	 * Getter for payoutItem
	 */
	public PayoutItem getPayoutItem() {
		return this.payoutItem;
	}

	/**
	 * Setter for timeProcessed
	 */
	public PayoutItemDetails setTimeProcessed(String timeProcessed) {
		this.timeProcessed = timeProcessed;
		return this;
	}

	/**
	 * Getter for timeProcessed
	 */
	public String getTimeProcessed() {
		return this.timeProcessed;
	}

	/**
	 * Setter for error
	 */
	public PayoutItemDetails setError(Error error) {
		this.error = error;
		return this;
	}

	/**
	 * Getter for error
	 */
	public Error getError() {
		return this.error;
	}

	/**
	 * Setter for links
	 */
	public PayoutItemDetails setLinks(List<Links> links) {
		this.links = links;
		return this;
	}

	/**
	 * Getter for links
	 */
	public List<Links> getLinks() {
		return this.links;
	}

	/**
	 * Returns a JSON string corresponding to object state
	 *
	 * @return JSON representation
	 */
	public String toJSON() {
		return JSONFormatter.toJSON(this);
	}

	@Override
	public String toString() {
		return toJSON();
	}
}
