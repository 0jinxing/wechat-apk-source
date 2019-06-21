package com.tencent.mm.plugin.wallet_core.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ff;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class ab extends ff
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(46913);
    c.a locala = new c.a();
    locala.xDb = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "mNativeUrl";
    locala.xDd.put("mNativeUrl", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" mNativeUrl TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "mNativeUrl";
    locala.columns[1] = "hbType";
    locala.xDd.put("hbType", "INTEGER");
    localStringBuilder.append(" hbType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "receiveAmount";
    locala.xDd.put("receiveAmount", "LONG");
    localStringBuilder.append(" receiveAmount LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "receiveTime";
    locala.xDd.put("receiveTime", "LONG");
    localStringBuilder.append(" receiveTime LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "receiveStatus";
    locala.xDd.put("receiveStatus", "INTEGER");
    localStringBuilder.append(" receiveStatus INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "hbStatus";
    locala.xDd.put("hbStatus", "INTEGER");
    localStringBuilder.append(" hbStatus INTEGER");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(46913);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(46912);
    super.d(paramCursor);
    AppMethodBeat.o(46912);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.ab
 * JD-Core Version:    0.6.2
 */