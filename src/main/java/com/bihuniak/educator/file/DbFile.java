package com.bihuniak.educator.file;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class DbFile {
    @Id
    @GeneratedValue
    private long id;

    @Lob
    private byte[] content;

    public DbFile() {
    }

    public DbFile(byte[] content) {
        this.content = content;
    }

    public byte[] getContent() {
        return content;
    }
}