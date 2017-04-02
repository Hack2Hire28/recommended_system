/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbs;

/**
 *
 * @author Ranjan Kumar
 */
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="venues")
public class vanuedb {
    

private String venueid;
@DynamoDBHashKey(attributeName="venueid")

public String getid() {
	return venueid;
}

public void setid(String vid) {
	venueid = vid;
}

public String getlatitude() {
	return latitude;
}
public String getaggregate() {
    return aggrating;
}
public void setaggrating (String agg) {
    aggrating = agg;
}

public void setlatitude(String ulatitude) {
	latitude = ulatitude;
}

public String getlongitude() {
	return longitude;
}

public void setlongitude(String ulongitude) {
	longitude = ulongitude;
}
public String getType() {
    return type;
}
public void setType(String t) {
    type = t;
}

@DynamoDBAttribute(attributeName="aggrating")
private String aggrating;
@DynamoDBAttribute(attributeName="latitude")
private String latitude;

@DynamoDBAttribute(attributeName="longitude")
private String longitude;
@DynamoDBAttribute(attributeName="type")
private String type;

}

