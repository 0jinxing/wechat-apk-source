package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.em;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;
import java.util.Map;

public final class p extends em
{
  protected static c.a ccO;
  public int reX;

  static
  {
    AppMethodBeat.i(37971);
    c.a locala = new c.a();
    locala.xDb = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "logtime";
    locala.xDd.put("logtime", "LONG");
    localStringBuilder.append(" logtime LONG");
    localStringBuilder.append(", ");
    locala.columns[1] = "offset";
    locala.xDd.put("offset", "INTEGER default '0' ");
    localStringBuilder.append(" offset INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "logsize";
    locala.xDd.put("logsize", "INTEGER");
    localStringBuilder.append(" logsize INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "errorcount";
    locala.xDd.put("errorcount", "INTEGER");
    localStringBuilder.append(" errorcount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "value";
    locala.xDd.put("value", "BLOB");
    localStringBuilder.append(" value BLOB");
    locala.columns[5] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(37971);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(37970);
    try
    {
      super.d(paramCursor);
      this.reX = ((int)this.xDa);
      AppMethodBeat.o(37970);
      return;
    }
    catch (Exception paramCursor)
    {
      while (true)
      {
        String str = paramCursor.getMessage();
        ab.e("MicroMsg.SnsKvReport", "error ".concat(String.valueOf(str)));
        if ((str != null) && (str.contains("Unable to convert")))
          af.cnK().cqH();
        try
        {
          AppMethodBeat.o(37970);
          throw paramCursor;
        }
        catch (Exception paramCursor)
        {
          ab.printErrStackTrace("MicroMsg.SnsKvReport", paramCursor, "", new Object[0]);
          AppMethodBeat.o(37970);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.p
 * JD-Core Version:    0.6.2
 */