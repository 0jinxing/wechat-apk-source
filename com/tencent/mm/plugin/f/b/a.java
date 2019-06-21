package com.tencent.mm.plugin.f.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fu;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends fu
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(18629);
    c.a locala = new c.a();
    locala.xDb = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgId";
    locala.xDd.put("msgId", "LONG");
    localStringBuilder.append(" msgId LONG");
    localStringBuilder.append(", ");
    locala.columns[1] = "username";
    locala.xDd.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "msgType";
    locala.xDd.put("msgType", "INTEGER");
    localStringBuilder.append(" msgType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "msgSubType";
    locala.xDd.put("msgSubType", "INTEGER");
    localStringBuilder.append(" msgSubType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "path";
    locala.xDd.put("path", "TEXT");
    localStringBuilder.append(" path TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "size";
    locala.xDd.put("size", "LONG");
    localStringBuilder.append(" size LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "msgtime";
    locala.xDd.put("msgtime", "LONG");
    localStringBuilder.append(" msgtime LONG");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(18629);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(18627);
    super.d(paramCursor);
    AppMethodBeat.o(18627);
  }

  public final String toString()
  {
    AppMethodBeat.i(18628);
    String str = "{  sys row id: " + this.xDa + " msg id : " + this.field_msgId + " msg talker: " + this.field_username + " msg type : " + this.field_msgType + " msg sub type : " + this.field_msgSubType + " path : " + this.field_path + " size : " + this.field_size + " msgtime : " + this.field_msgtime + " } ";
    AppMethodBeat.o(18628);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.a
 * JD-Core Version:    0.6.2
 */