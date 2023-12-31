package com.amazonaws.services.lambda.samples.events.msk;

import java.util.Objects;
import com.google.gson.Gson;

public class KafkaMessage {
	String topic;
	int partition;
	long offset;
	long timestamp;
	String timestampType;
	String key;
	String value;
	String decodedKey;
	String decodedValue;
	Person person;
	/**
	 * 
	 */
	public KafkaMessage() {
		super();
	}
	/**
	 * @param topic
	 * @param partition
	 * @param offset
	 * @param timestamp
	 * @param timestampType
	 * @param key
	 * @param value
	 * @param decodedKey
	 * @param decodedValue
	 * @param person
	 */
	public KafkaMessage(String topic, int partition, long offset, long timestamp, String timestampType, String key, String value,
			String decodedKey, String decodedValue) {
		super();
		this.topic = topic;
		this.partition = partition;
		this.offset = offset;
		this.timestamp = timestamp;
		this.timestampType = timestampType;
		this.key = key;
		this.value = value;
		this.decodedKey = decodedKey;
		this.decodedValue = decodedValue;
		Gson gson = new Gson();
		this.person = gson.fromJson(decodedValue, Person.class);
	}
	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}
	/**
	 * @param topic the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}
	/**
	 * @return the partition
	 */
	public int getPartition() {
		return partition;
	}
	/**
	 * @param partition the partition to set
	 */
	public void setPartition(int partition) {
		this.partition = partition;
	}
	/**
	 * @return the offset
	 */
	public long getOffset() {
		return offset;
	}
	/**
	 * @param offset the offset to set
	 */
	public void setOffset(long offset) {
		this.offset = offset;
	}
	/**
	 * @return the timestamp
	 */
	public long getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the timestampType
	 */
	public String getTimestampType() {
		return timestampType;
	}
	/**
	 * @param timestampType the timestampType to set
	 */
	public void setTimestampType(String timestampType) {
		this.timestampType = timestampType;
	}
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the decodedKey
	 */
	public String getDecodedKey() {
		return decodedKey;
	}
	/**
	 * @param decodedKey the decodedKey to set
	 */
	public void setDecodedKey(String decodedKey) {
		this.decodedKey = decodedKey;
	}
	/**
	 * @return the decodedValue
	 */
	public String getDecodedValue() {
		return decodedValue;
	}
	/**
	 * @param decodedValue the decodedValue to set
	 */
	public void setDecodedValue(String decodedValue) {
		this.decodedValue = decodedValue;
		Gson gson = new Gson();
		this.person = gson.fromJson(decodedValue, Person.class);
	}
	
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public int hashCode() {
		return Objects.hash(decodedKey, decodedValue, key, offset, partition, person, timestamp, timestampType, topic,
				value);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KafkaMessage other = (KafkaMessage) obj;
		return Objects.equals(decodedKey, other.decodedKey) && Objects.equals(decodedValue, other.decodedValue)
				&& Objects.equals(key, other.key) && offset == other.offset && partition == other.partition
				&& Objects.equals(person, other.person) && timestamp == other.timestamp
				&& Objects.equals(timestampType, other.timestampType) && Objects.equals(topic, other.topic)
				&& Objects.equals(value, other.value);
	}
	@Override
	public String toString() {
		return "KafkaMessage [topic=" + topic + ", partition=" + partition + ", offset=" + offset + ", timestamp="
				+ timestamp + ", timestampType=" + timestampType + ", key=" + key + ", value=" + value + ", decodedKey="
				+ decodedKey + ", decodedValue=" + decodedValue + ", person=" + person.toString() + "]";
	}
	
	
}
