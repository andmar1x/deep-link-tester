package org.andmar1x.deeplinktester.data.model;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import org.andmar1x.deeplinktester.data.Database;

@Table(database = Database.class)
public class DeepLink {

    @PrimaryKey(autoincrement = true)
    protected long id;

    @Column
    public String uriString;

    @Column
    public long timestamp;

    @Column
    public int status;

    public DeepLink() {
    }

    public DeepLink(String uriString, long timestamp, int status) {
        this(0, uriString, timestamp, status);
    }

    public DeepLink(long id, String uriString, long timestamp, int status) {
        this.id = id;
        this.uriString = uriString;
        this.timestamp = timestamp;
        this.status = status;
    }
}
