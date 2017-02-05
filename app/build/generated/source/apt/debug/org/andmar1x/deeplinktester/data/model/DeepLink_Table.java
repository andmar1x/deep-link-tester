package org.andmar1x.deeplinktester.data.model;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.DatabaseHolder;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.IntProperty;
import com.raizlabs.android.dbflow.sql.language.property.LongProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class DeepLink_Table extends ModelAdapter<DeepLink> {
  /**
   * Primary Key AutoIncrement */
  public static final LongProperty id = new LongProperty(DeepLink.class, "id");

  public static final Property<String> uriString = new Property<String>(DeepLink.class, "uriString");

  public static final LongProperty timestamp = new LongProperty(DeepLink.class, "timestamp");

  public static final IntProperty status = new IntProperty(DeepLink.class, "status");

  public static final IProperty[] ALL_COLUMN_PROPERTIES = new IProperty[]{id,uriString,timestamp,status};

  public DeepLink_Table(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<DeepLink> getModelClass() {
    return DeepLink.class;
  }

  public final String getTableName() {
    return "`DeepLink`";
  }

  @Override
  public final BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`uriString`":  {
        return uriString;
      }
      case "`timestamp`":  {
        return timestamp;
      }
      case "`status`":  {
        return status;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }

  @Override
  public final void updateAutoIncrement(DeepLink model, Number id) {
    model.id = id.longValue();
  }

  @Override
  public final Number getAutoIncrementingId(DeepLink model) {
    return model.id;
  }

  @Override
  public final String getAutoIncrementingColumnName() {
    return "id";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ALL_COLUMN_PROPERTIES;
  }

  @Override
  public final void bindToInsertValues(ContentValues values, DeepLink model) {
    values.put("`uriString`", model.uriString != null ? model.uriString : null);
    values.put("`timestamp`", model.timestamp);
    values.put("`status`", model.status);
  }

  @Override
  public final void bindToContentValues(ContentValues values, DeepLink model) {
    values.put("`id`", model.id);
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, DeepLink model, int start) {
    if (model.uriString != null)  {
      statement.bindString(1 + start, model.uriString);
    } else {
      statement.bindNull(1 + start);
    }
    statement.bindLong(2 + start, model.timestamp);
    statement.bindLong(3 + start, model.status);
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, DeepLink model) {
    int start = 0;
    statement.bindLong(1 + start, model.id);
    bindToInsertStatement(statement, model, 1);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `DeepLink`(`uriString`,`timestamp`,`status`) VALUES (?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `DeepLink`(`id`,`uriString`,`timestamp`,`status`) VALUES (?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `DeepLink`(`id` INTEGER PRIMARY KEY AUTOINCREMENT,`uriString` TEXT,`timestamp` INTEGER,`status` INTEGER" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, DeepLink model) {
    int index_id = cursor.getColumnIndex("id");
    if (index_id != -1 && !cursor.isNull(index_id)) {
      model.id = cursor.getLong(index_id);
    } else {
      model.id = (long) 0;
    }
    int index_uriString = cursor.getColumnIndex("uriString");
    if (index_uriString != -1 && !cursor.isNull(index_uriString)) {
      model.uriString = cursor.getString(index_uriString);
    } else {
      model.uriString = null;
    }
    int index_timestamp = cursor.getColumnIndex("timestamp");
    if (index_timestamp != -1 && !cursor.isNull(index_timestamp)) {
      model.timestamp = cursor.getLong(index_timestamp);
    } else {
      model.timestamp = (long) 0;
    }
    int index_status = cursor.getColumnIndex("status");
    if (index_status != -1 && !cursor.isNull(index_status)) {
      model.status = cursor.getInt(index_status);
    } else {
      model.status = (int) 0;
    }
  }

  @Override
  public final boolean exists(DeepLink model, DatabaseWrapper wrapper) {
    return model.id > 0
    && SQLite.selectCountOf()
    .from(DeepLink.class)
    .where(getPrimaryConditionClause(model))
    .hasData(wrapper);
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(DeepLink model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(id.eq(model.id));
    return clause;
  }

  @Override
  public final DeepLink newInstance() {
    return new DeepLink();
  }
}
