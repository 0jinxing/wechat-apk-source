package com.tencent.mm.plugin.card.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.aj;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class i extends aj
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(87839);
    c.a locala = new c.a();
    locala.xDb = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "card_id";
    locala.xDd.put("card_id", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" card_id TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "card_id";
    locala.columns[1] = "lower_bound";
    locala.xDd.put("lower_bound", "INTEGER");
    localStringBuilder.append(" lower_bound INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "need_insert_show_timestamp";
    locala.xDd.put("need_insert_show_timestamp", "INTEGER default 'false' ");
    localStringBuilder.append(" need_insert_show_timestamp INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "show_timestamp_encrypt_key";
    locala.xDd.put("show_timestamp_encrypt_key", "TEXT");
    localStringBuilder.append(" show_timestamp_encrypt_key TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "expire_time_interval";
    locala.xDd.put("expire_time_interval", "INTEGER");
    localStringBuilder.append(" expire_time_interval INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "show_expire_interval";
    locala.xDd.put("show_expire_interval", "INTEGER");
    localStringBuilder.append(" show_expire_interval INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "fetch_time";
    locala.xDd.put("fetch_time", "LONG");
    localStringBuilder.append(" fetch_time LONG");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(87839);
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.i
 * JD-Core Version:    0.6.2
 */