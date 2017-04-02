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

@DynamoDBTable(tableName="ratings")
public class Ratingdb {
    

private String id;
@DynamoDBHashKey(attributeName="id")

public String getid() {
	return id;
}

public void setid(String uid) {
	id = uid;
}

public String getvenueid() {
	return venueid;
}

public void setvenueid(String vid) {
	venueid = vid;
}

public String getrating() {
	return rating;
}

public void setrating(String rting) {
	rating = rting;
}



@DynamoDBAttribute(attributeName="venueid")
private String venueid;

@DynamoDBAttribute(attributeName="rating")
private String rating;

}
