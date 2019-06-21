package com.tencent.mm.storage.emotion;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ca;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class o extends ca
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(62868);
    c.a locala = new c.a();
    locala.xDb = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "reqType";
    locala.xDd.put("reqType", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" reqType TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "reqType";
    locala.columns[1] = "cache";
    locala.xDd.put("cache", "BLOB default '' ");
    localStringBuilder.append(" cache BLOB default '' ");
    locala.columns[2] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(62868);
  }

  public o(Cursor paramCursor)
  {
    AppMethodBeat.i(62867);
    if (paramCursor == null)
      AppMethodBeat.o(62867);
    while (true)
    {
      return;
      d(paramCursor);
      AppMethodBeat.o(62867);
    }
  }

  public o(String paramString, byte[] paramArrayOfByte)
  {
    this.field_reqType = paramString;
    this.field_cache = paramArrayOfByte;
  }

  public final c.a Ag()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.o
 * JD-Core Version:    0.6.2
 */