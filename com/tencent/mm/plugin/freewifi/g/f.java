package com.tencent.mm.plugin.freewifi.g;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedHashMap;

public final class f extends j<e>
{
  public static final String[] fnj;
  public static LinkedHashMap<String, Class> mxM;

  static
  {
    AppMethodBeat.i(20888);
    fnj = new String[] { j.a(e.ccO, "FreeWifiLog"), "CREATE INDEX IF NOT EXISTS idx_FreeWifiLog_key  on FreeWifiLog  (  id )" };
    mxM = new f.1();
    AppMethodBeat.o(20888);
  }

  public f(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, e.ccO, "FreeWifiLog", null);
  }

  public final boolean a(String paramString1, int paramInt, String paramString2, long paramLong)
  {
    boolean bool1 = false;
    AppMethodBeat.i(20887);
    ab.i("MicroMsg.FreeWifi.FreeWifiLogStorage", "save. id=%s, protocolNumber=%d, logContent=%s, createTime=%d", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2, Long.valueOf(paramLong) });
    if (m.isEmpty(paramString1))
      AppMethodBeat.o(20887);
    while (true)
    {
      return bool1;
      Cursor localCursor = rawQuery("select * from FreeWifiLog where id = '" + paramString1 + "'", new String[0]);
      try
      {
        e locale = new com/tencent/mm/plugin/freewifi/g/e;
        locale.<init>();
        locale.field_id = paramString1;
        locale.field_protocolNumber = paramInt;
        locale.field_logContent = paramString2;
        locale.field_createTime = paramLong;
        boolean bool2;
        if (localCursor.getCount() == 0)
        {
          bool2 = b(locale);
          ab.i("MicroMsg.FreeWifi.FreeWifiLogStorage", "insert ret".concat(String.valueOf(bool2)));
          localCursor.close();
          AppMethodBeat.o(20887);
          bool1 = bool2;
        }
        else
        {
          bool2 = c(locale, new String[0]);
          ab.i("MicroMsg.FreeWifi.FreeWifiLogStorage", "update ret".concat(String.valueOf(bool2)));
          localCursor.close();
          AppMethodBeat.o(20887);
          bool1 = bool2;
        }
      }
      catch (Exception paramString1)
      {
        ab.e("MicroMsg.FreeWifi.FreeWifiLogStorage", m.h(paramString1));
        localCursor.close();
        AppMethodBeat.o(20887);
      }
      finally
      {
        localCursor.close();
        AppMethodBeat.o(20887);
      }
    }
    throw paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.g.f
 * JD-Core Version:    0.6.2
 */