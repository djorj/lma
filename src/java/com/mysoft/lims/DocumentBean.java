// --------------------------------------------------------
// Generated by sql2java - http://sql2java.sourceforge.net/
// jdbc driver used at code generation time: org.postgresql.Driver
// 
// Please help us improve this tool by reporting:
//    problems,
//    suggestions,
//    feedbacks,
//    ideas,
//  to http://sourceforge.net/projects/sql2java/
// --------------------------------------------------------

package com.mysoft.lims;

// imports+ 

// imports- 

public class DocumentBean
// extends+ 

// extends- 
{
    private Long documentid;
    private boolean documentid_is_modified = false;
    private boolean documentid_is_initialized = false;
    
    private String name;
    private boolean name_is_modified = false;
    private boolean name_is_initialized = false;
    
    private String filename;
    private boolean filename_is_modified = false;
    private boolean filename_is_initialized = false;
    
    private String path;
    private boolean path_is_modified = false;
    private boolean path_is_initialized = false;
    
    private String url;
    private boolean url_is_modified = false;
    private boolean url_is_initialized = false;
    
    private String type;
    private boolean type_is_modified = false;
    private boolean type_is_initialized = false;
    
    private Long size;
    private boolean size_is_modified = false;
    private boolean size_is_initialized = false;
    
    private java.sql.Timestamp regdate;
    private boolean regdate_is_modified = false;
    private boolean regdate_is_initialized = false;
    
    private Integer regbyid;
    private boolean regbyid_is_modified = false;
    private boolean regbyid_is_initialized = false;
    
    private boolean _isNew = true;
    
    /**
     * Do not use this constructor directly, please use the factory method
     * available in the associated manager.
     */
    DocumentBean()
    {
    }
    
    /**
     * Getter method for documentid.
     * <br>
     * PRIMARY KEY.<br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: document.documentid
     * <li>column size: 8
     * <li>jdbc type returned by the driver: Types.BIGINT
     * </ul>
     *
     * @return the value of documentid
     */
    public Long getDocumentid()
    {
        return documentid; 
    }

    /**
     * Setter method for documentid.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to documentid
     */
    public void setDocumentid(Long newVal) {
        if ((newVal != null && this.documentid != null && (newVal.compareTo(this.documentid) == 0)) || 
            (newVal == null && this.documentid == null && documentid_is_initialized)) {
            return; 
        } 
        this.documentid = newVal; 
        documentid_is_modified = true; 
        documentid_is_initialized = true; 
    }

    /**
     * Setter method for documentid.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to documentid
     */
    public void setDocumentid(long newVal) {
        setDocumentid(new Long(newVal));
    }

    /**
     * Determines if the documentid has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isDocumentidModified() {
        return documentid_is_modified; 
    }

    /**
     * Determines if the documentid has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isDocumentidInitialized() {
        return documentid_is_initialized; 
    }

    /**
     * Getter method for name.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: document.name
     * <li>column size: -1
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of name
     */
    public String getName()
    {
        return name; 
    }

    /**
     * Setter method for name.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to name
     */
    public void setName(String newVal) {
        if ((newVal != null && this.name != null && (newVal.compareTo(this.name) == 0)) || 
            (newVal == null && this.name == null && name_is_initialized)) {
            return; 
        } 
        this.name = newVal; 
        name_is_modified = true; 
        name_is_initialized = true; 
    }

    /**
     * Determines if the name has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isNameModified() {
        return name_is_modified; 
    }

    /**
     * Determines if the name has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isNameInitialized() {
        return name_is_initialized; 
    }

    /**
     * Getter method for filename.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: document.filename
     * <li>column size: -1
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of filename
     */
    public String getFilename()
    {
        return filename; 
    }

    /**
     * Setter method for filename.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to filename
     */
    public void setFilename(String newVal) {
        if ((newVal != null && this.filename != null && (newVal.compareTo(this.filename) == 0)) || 
            (newVal == null && this.filename == null && filename_is_initialized)) {
            return; 
        } 
        this.filename = newVal; 
        filename_is_modified = true; 
        filename_is_initialized = true; 
    }

    /**
     * Determines if the filename has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isFilenameModified() {
        return filename_is_modified; 
    }

    /**
     * Determines if the filename has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isFilenameInitialized() {
        return filename_is_initialized; 
    }

    /**
     * Getter method for path.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: document.path
     * <li>column size: 0
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of path
     */
    public String getPath()
    {
        return path; 
    }

    /**
     * Setter method for path.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to path
     */
    public void setPath(String newVal) {
        if ((newVal != null && this.path != null && (newVal.compareTo(this.path) == 0)) || 
            (newVal == null && this.path == null && path_is_initialized)) {
            return; 
        } 
        this.path = newVal; 
        path_is_modified = true; 
        path_is_initialized = true; 
    }

    /**
     * Determines if the path has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isPathModified() {
        return path_is_modified; 
    }

    /**
     * Determines if the path has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isPathInitialized() {
        return path_is_initialized; 
    }

    /**
     * Getter method for url.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: document.url
     * <li>column size: 0
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of url
     */
    public String getUrl()
    {
        return url; 
    }

    /**
     * Setter method for url.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to url
     */
    public void setUrl(String newVal) {
        if ((newVal != null && this.url != null && (newVal.compareTo(this.url) == 0)) || 
            (newVal == null && this.url == null && url_is_initialized)) {
            return; 
        } 
        this.url = newVal; 
        url_is_modified = true; 
        url_is_initialized = true; 
    }

    /**
     * Determines if the url has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isUrlModified() {
        return url_is_modified; 
    }

    /**
     * Determines if the url has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isUrlInitialized() {
        return url_is_initialized; 
    }

    /**
     * Getter method for type.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: document.type
     * <li>column size: 0
     * <li>jdbc type returned by the driver: Types.VARCHAR
     * </ul>
     *
     * @return the value of type
     */
    public String getType()
    {
        return type; 
    }

    /**
     * Setter method for type.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to type
     */
    public void setType(String newVal) {
        if ((newVal != null && this.type != null && (newVal.compareTo(this.type) == 0)) || 
            (newVal == null && this.type == null && type_is_initialized)) {
            return; 
        } 
        this.type = newVal; 
        type_is_modified = true; 
        type_is_initialized = true; 
    }

    /**
     * Determines if the type has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isTypeModified() {
        return type_is_modified; 
    }

    /**
     * Determines if the type has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isTypeInitialized() {
        return type_is_initialized; 
    }

    /**
     * Getter method for size.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: document.size
     * <li>column size: 8
     * <li>jdbc type returned by the driver: Types.BIGINT
     * </ul>
     *
     * @return the value of size
     */
    public Long getSize()
    {
        return size; 
    }

    /**
     * Setter method for size.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to size
     */
    public void setSize(Long newVal) {
        if ((newVal != null && this.size != null && (newVal.compareTo(this.size) == 0)) || 
            (newVal == null && this.size == null && size_is_initialized)) {
            return; 
        } 
        this.size = newVal; 
        size_is_modified = true; 
        size_is_initialized = true; 
    }

    /**
     * Setter method for size.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to size
     */
    public void setSize(long newVal) {
        setSize(new Long(newVal));
    }

    /**
     * Determines if the size has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isSizeModified() {
        return size_is_modified; 
    }

    /**
     * Determines if the size has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isSizeInitialized() {
        return size_is_initialized; 
    }

    /**
     * Getter method for regdate.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: document.regdate
     * <li>default value: now()
     * <li>column size: 8
     * <li>jdbc type returned by the driver: Types.TIMESTAMP
     * </ul>
     *
     * @return the value of regdate
     */
    public java.sql.Timestamp getRegdate()
    {
        return regdate; 
    }

    /**
     * Setter method for regdate.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to regdate
     */
    public void setRegdate(java.sql.Timestamp newVal) {
        if ((newVal != null && this.regdate != null && (newVal.compareTo(this.regdate) == 0)) || 
            (newVal == null && this.regdate == null && regdate_is_initialized)) {
            return; 
        } 
        this.regdate = newVal; 
        regdate_is_modified = true; 
        regdate_is_initialized = true; 
    }

    /**
     * Setter method for regdate.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to regdate
     */
    public void setRegdate(long newVal) {
        setRegdate(new java.sql.Timestamp(newVal));
    }

    /**
     * Determines if the regdate has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isRegdateModified() {
        return regdate_is_modified; 
    }

    /**
     * Determines if the regdate has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isRegdateInitialized() {
        return regdate_is_initialized; 
    }

    /**
     * Getter method for regbyid.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: document.regbyid
     * <li> foreign key: personell.personellid
     * <li>column size: 4
     * <li>jdbc type returned by the driver: Types.INTEGER
     * </ul>
     *
     * @return the value of regbyid
     */
    public Integer getRegbyid()
    {
        return regbyid; 
    }

    /**
     * Setter method for regbyid.
     * <br>
     * The new value is set only if compareTo() says it is different,
     * or if one of either the new value or the current value is null.
     * In case the new value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to regbyid
     */
    public void setRegbyid(Integer newVal) {
        if ((newVal != null && this.regbyid != null && (newVal.compareTo(this.regbyid) == 0)) || 
            (newVal == null && this.regbyid == null && regbyid_is_initialized)) {
            return; 
        } 
        this.regbyid = newVal; 
        regbyid_is_modified = true; 
        regbyid_is_initialized = true; 
    }

    /**
     * Setter method for regbyid.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to regbyid
     */
    public void setRegbyid(int newVal) {
        setRegbyid(new Integer(newVal));
    }

    /**
     * Determines if the regbyid has been modified.
     *
     * @return true if the field has been modified, false if the field has not been modified
     */
    public boolean isRegbyidModified() {
        return regbyid_is_modified; 
    }

    /**
     * Determines if the regbyid has been initialized.
     * <br>
     * It is useful to determine if a field is null on purpose or just because it has not been initialized.
     *
     * @return true if the field has been initialized, false otherwise
     */
    public boolean isRegbyidInitialized() {
        return regbyid_is_initialized; 
    }

    /**
     * Determines if the current object is new.
     *
     * @return true if the current object is new, false if the object is not new
     */
    public boolean isNew() {
        return _isNew;
    }

    /**
     * Specifies to the object if it has been set as new.
     *
     * @param isNew the boolean value to be assigned to the isNew field
     */
    public void isNew(boolean isNew) {
        this._isNew = isNew;
    }

    /**
     * Determines if the object has been modified since the last time this method was called.
     * <br>
     * We can also determine if this object has ever been modified since its creation.
     *
     * @return true if the object has been modified, false if the object has not been modified
     */
    public boolean isModified() {
        return documentid_is_modified || 
		name_is_modified || 
		filename_is_modified || 
		path_is_modified || 
		url_is_modified || 
		type_is_modified || 
		size_is_modified || 
		regdate_is_modified || 
		regbyid_is_modified;
    }

    /**
     * Resets the object modification status to 'not modified'.
     */
    public void resetIsModified() {
        documentid_is_modified = false;
        name_is_modified = false;
        filename_is_modified = false;
        path_is_modified = false;
        url_is_modified = false;
        type_is_modified = false;
        size_is_modified = false;
        regdate_is_modified = false;
        regbyid_is_modified = false;
    }

    /**
     * Copies the passed bean into the current bean.
     *
     * @param bean the bean to copy into the current bean
     */
    public void copy(DocumentBean bean) {
        setDocumentid(bean.getDocumentid());
        setName(bean.getName());
        setFilename(bean.getFilename());
        setPath(bean.getPath());
        setUrl(bean.getUrl());
        setType(bean.getType());
        setSize(bean.getSize());
        setRegdate(bean.getRegdate());
        setRegbyid(bean.getRegbyid());
    }

    /**
     * Returns the object string representation.
     *
     * @return the object as a string
     */
    public String toString() {
        return   "\n[document] "
                 + "\n - document.documentid = " + (documentid_is_initialized ? ("[" + (documentid == null ? null : documentid.toString()) + "]") : "not initialized") + ""
                 + "\n - document.name = " + (name_is_initialized ? ("[" + (name == null ? null : name.toString()) + "]") : "not initialized") + ""
                 + "\n - document.filename = " + (filename_is_initialized ? ("[" + (filename == null ? null : filename.toString()) + "]") : "not initialized") + ""
                 + "\n - document.path = " + (path_is_initialized ? ("[" + (path == null ? null : path.toString()) + "]") : "not initialized") + ""
                 + "\n - document.url = " + (url_is_initialized ? ("[" + (url == null ? null : url.toString()) + "]") : "not initialized") + ""
                 + "\n - document.type = " + (type_is_initialized ? ("[" + (type == null ? null : type.toString()) + "]") : "not initialized") + ""
                 + "\n - document.size = " + (size_is_initialized ? ("[" + (size == null ? null : size.toString()) + "]") : "not initialized") + ""
                 + "\n - document.regdate = " + (regdate_is_initialized ? ("[" + (regdate == null ? null : regdate.toString()) + "]") : "not initialized") + ""
                 + "\n - document.regbyid = " + (regbyid_is_initialized ? ("[" + (regbyid == null ? null : regbyid.toString()) + "]") : "not initialized") + ""
            ;
    }

// class+ 

// class- 
}