package com.tencent.mm.plugin.freewifi.g;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b extends j<a>
{
  public static final String[] fnj;
  public static Map<String, String> mxL;

  static
  {
    AppMethodBeat.i(20878);
    fnj = new String[] { j.a(a.ccO, "FreeWifiConfig"), "CREATE INDEX IF NOT EXISTS idx_freewificonfig_key  on FreeWifiConfig  (  key )" };
    mxL = new ConcurrentHashMap();
    AppMethodBeat.o(20878);
  }

  public b(e parame)
  {
    super(parame, a.ccO, "FreeWifiConfig", null);
  }

  public final String MJ(String paramString)
  {
    AppMethodBeat.i(20875);
    if (m.isEmpty(paramString))
    {
      paramString = "";
      AppMethodBeat.o(20875);
    }
    while (true)
    {
      return paramString;
      try
      {
        if (mxL != null)
        {
          String str = (String)mxL.get(paramString);
          if (str != null)
          {
            AppMethodBeat.o(20875);
            paramString = str;
          }
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.FreeWifi.FreeWifiConfigStorage", "Map get error!");
        Cursor localCursor = rawQuery("select * from FreeWifiConfig where key = '" + paramString + "'", new String[0]);
        if (localCursor == null)
        {
          paramString = "";
          if (localCursor != null)
            localCursor.close();
          AppMethodBeat.o(20875);
          continue;
        }
        try
        {
          if (localCursor.moveToFirst())
          {
            paramString = new com/tencent/mm/plugin/freewifi/g/a;
            paramString.<init>();
            paramString.d(localCursor);
            paramString = paramString.field_value;
            if (localCursor != null)
              localCursor.close();
            AppMethodBeat.o(20875);
            continue;
          }
          paramString = "";
          if (localCursor != null)
            localCursor.close();
          AppMethodBeat.o(20875);
        }
        finally
        {
          if (localCursor != null)
            localCursor.close();
          AppMethodBeat.o(20875);
        }
      }
    }
  }

  public final void axQ()
  {
    AppMethodBeat.i(20877);
    if (mxL != null)
      mxL.clear();
    super.hY("FreeWifiConfig", "delete from FreeWifiConfig");
    AppMethodBeat.o(20877);
  }

  public final String bzw()
  {
    AppMethodBeat.i(20874);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("key\tvalue\tmodifyTime\r\n");
    Cursor localCursor = rawQuery("select key, value, modifyTime from FreeWifiConfig", new String[0]);
    try
    {
      while (localCursor.moveToNext())
        localStringBuilder.append(localCursor.getString(0)).append("\t").append(localCursor.getString(1)).append("\t").append(localCursor.getLong(2)).append("\r\n");
    }
    catch (Exception localException)
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("FreeWifiConfig Table :\r\n");
      ab.i("MicroMsg.FreeWifi.FreeWifiConfigStorage", localException.getMessage());
      localObject1 = localException.getMessage();
      while (true)
      {
        return localObject1;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("FreeWifiConfig Table :\r\n");
        ab.i("MicroMsg.FreeWifi.FreeWifiConfigStorage", localException.toString());
        localObject1 = localException.toString();
        localCursor.close();
        AppMethodBeat.o(20874);
      }
    }
    finally
    {
      localCursor.close();
      AppMethodBeat.o(20874);
    }
  }

  public final void et(String paramString1, String paramString2)
  {
    AppMethodBeat.i(20876);
    if ((m.isEmpty(paramString1)) || (m.isEmpty(paramString2)))
      AppMethodBeat.o(20876);
    while (true)
    {
      return;
      try
      {
        if (mxL != null)
        {
          if (mxL.size() < 1000)
            mxL.put(paramString1, paramString2);
        }
        else
          label58: localCursor = rawQuery("select * from FreeWifiConfig where key = '" + paramString1 + "'", new String[0]);
      }
      catch (Exception localException)
      {
        try
        {
          Cursor localCursor;
          a locala = new com/tencent/mm/plugin/freewifi/g/a;
          locala.<init>();
          locala.field_key = paramString1;
          locala.field_value = paramString2;
          locala.field_modifyTime = System.currentTimeMillis();
          if (localCursor.getCount() == 0)
            b(locala);
          while (true)
          {
            localCursor.close();
            AppMethodBeat.o(20876);
            break;
            mxL.clear();
            mxL.put(paramString1, paramString2);
            break label58;
            localException = localException;
            ab.e("MicroMsg.FreeWifi.FreeWifiConfigStorage", "Map put error!");
            break label58;
            c(locala, new String[0]);
          }
        }
        finally
        {
          localException.close();
          AppMethodBeat.o(20876);
        }
      }
    }
    throw paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.g.b
 * JD-Core Version:    0.6.2
 */