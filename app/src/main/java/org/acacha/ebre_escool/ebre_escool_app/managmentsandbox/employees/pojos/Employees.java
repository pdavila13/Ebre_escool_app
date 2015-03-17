package org.acacha.ebre_escool.ebre_escool_app.managmentsandbox.employees.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Employees {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("person_id")
    @Expose
    private String personId;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("type_id")
    @Expose
    private String typeId;
    @SerializedName("entry_date")
    @Expose
    private String entryDate;
    @SerializedName("last_update")
    @Expose
    private String lastUpdate;
    @SerializedName("creation_user_id")
    @Expose
    private String creationUserId;
    @SerializedName("last_update_user_id")
    @Expose
    private String lastupdateUserId;
    @SerializedName("maked_for_deletion")
    @Expose
    private String markedForDeletion;
    @SerializedName("marked_for_deletion_date")
    @Expose
    private String markedForDeletionDate;

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The personId
     */
    public String getPersonId() {
        return personId;
    }

    /**
     *
     * @param personId
     * The person_id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     *
     * @return
     * The code
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code
     * The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *
     * @return
     * The typeId
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     *
     * @param typeId
     * The type_id
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    /**
     *
     * @return
     * The entryDate
     */
    public String getEntryDate() {
        return entryDate;
    }

    /**
     *
     * @param entryDate
     * The entryDate
     */
    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    /**
     *
     * @return
     * The lastUpdate
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    /**
     *
     * @param lastUpdate
     * The last_update
     */
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     *
     * @return
     * The creationUserId
     */
    public String getCreationUserId() {
        return creationUserId;
    }

    /**
     *
     * @param creationUserId
     * The creationUserId
     */
    public void setCreationUserId(String creationUserId) {
        this.creationUserId = creationUserId;
    }

    /**
     *
     * @return
     * The lastupdateUserId
     */
    public String getLastupdateUserId() {
        return lastupdateUserId;
    }

    /**
     *
     * @param lastupdateUserId
     * The lastupdateUserId
     */
    public void setLastupdateUserId(String lastupdateUserId) {
        this.lastupdateUserId = lastupdateUserId;
    }

    /**
     *
     * @return
     * The markedForDeletion
     */
    public String getMarkedForDeletion() {
        return markedForDeletion;
    }

    /**
     *
     * @param markedForDeletion
     * The markedForDeletion
     */
    public void setMarkedForDeletion(String markedForDeletion) {
        this.markedForDeletion = markedForDeletion;
    }

    /**
     *
     * @return
     * The markedForDeletionDate
     */
    public String getMarkedForDeletionDate() {
        return markedForDeletionDate;
    }

    /**
     *
     * @param markedForDeletionDate
     * The markedForDeletionDate
     */
    public void setMarkedForDeletionDate(String markedForDeletionDate) {
        this.markedForDeletionDate = markedForDeletionDate;
    }

}