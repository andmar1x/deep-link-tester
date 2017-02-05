package com.raizlabs.android.dbflow.config;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.andmar1x.deeplinktester.data.Database;
import org.andmar1x.deeplinktester.data.model.DeepLink;
import org.andmar1x.deeplinktester.data.model.DeepLink_Table;

/**
 * This is generated code. Please do not modify */
public final class Databasemain_Database extends DatabaseDefinition {
  public Databasemain_Database(DatabaseHolder holder) {
    holder.putDatabaseForTable(DeepLink.class, this);
    models.add(DeepLink.class);
    modelTableNames.put("DeepLink", DeepLink.class);
    modelAdapters.put(DeepLink.class, new DeepLink_Table(holder, this));
  }

  @Override
  public final Class<?> getAssociatedDatabaseClassFile() {
    return Database.class;
  }

  @Override
  public final boolean isForeignKeysSupported() {
    return false;
  }

  @Override
  public final boolean isInMemory() {
    return false;
  }

  @Override
  public final boolean backupEnabled() {
    return false;
  }

  @Override
  public final boolean areConsistencyChecksEnabled() {
    return false;
  }

  @Override
  public final int getDatabaseVersion() {
    return 1;
  }

  @Override
  public final String getDatabaseName() {
    return "main";
  }
}
