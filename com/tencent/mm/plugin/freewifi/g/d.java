package com.tencent.mm.plugin.freewifi.g;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;

public final class d extends j<c>
{
  public static final String[] fnj;

  static
  {
    AppMethodBeat.i(20884);
    fnj = new String[] { j.a(c.ccO, "FreeWifiInfo"), "CREATE INDEX IF NOT EXISTS freewifi_md5_ssid  on FreeWifiInfo  (  ssidmd5 )" };
    AppMethodBeat.o(20884);
  }

  public d(e parame)
  {
    super(parame, c.ccO, "FreeWifiInfo", null);
  }

  public final c MK(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(20880);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiInfoStorage", "ssid is null");
      AppMethodBeat.o(20880);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = "select * from FreeWifiInfo where ssidmd5 = '" + ag.ck(paramString) + "' and wifiType = 1";
      ab.d("MicroMsg.FreeWifi.FreeWifiInfoStorage", "getFreeWifiInfoBySSID, sql : %s", new Object[] { paramString });
      Cursor localCursor = rawQuery(paramString, new String[0]);
      if (localCursor == null)
      {
        ab.e("MicroMsg.FreeWifi.FreeWifiInfoStorage", "cursor is null");
        AppMethodBeat.o(20880);
        paramString = localObject;
      }
      else if (localCursor.moveToFirst())
      {
        paramString = new c();
        paramString.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(20880);
      }
      else
      {
        localCursor.close();
        AppMethodBeat.o(20880);
        paramString = localObject;
      }
    }
  }

  public final c ML(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(20881);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiInfoStorage", "ssid is null");
      AppMethodBeat.o(20881);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = "select * from FreeWifiInfo where ssidmd5 = '" + ag.ck(paramString) + "'";
      ab.d("MicroMsg.FreeWifi.FreeWifiInfoStorage", "getFreeWifiInfoBySSID, sql : %s", new Object[] { paramString });
      Cursor localCursor = rawQuery(paramString, new String[0]);
      if (localCursor == null)
      {
        ab.e("MicroMsg.FreeWifi.FreeWifiInfoStorage", "cursor is null");
        AppMethodBeat.o(20881);
        paramString = localObject;
      }
      else if (localCursor.moveToFirst())
      {
        paramString = new c();
        paramString.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(20881);
      }
      else
      {
        localCursor.close();
        AppMethodBeat.o(20881);
        paramString = localObject;
      }
    }
  }

  public final void MM(String paramString)
  {
    AppMethodBeat.i(20883);
    paramString = "update FreeWifiInfo set connectState = -1 where ssidmd5 !='" + ag.ck(paramString) + "'";
    ab.d("MicroMsg.FreeWifi.FreeWifiInfoStorage", "updateOtherAp : %s", new Object[] { paramString });
    ab.d("MicroMsg.FreeWifi.FreeWifiInfoStorage", "update other ap  ret = %b", new Object[] { Boolean.valueOf(hY("FreeWifiInfo", paramString)) });
    AppMethodBeat.o(20883);
  }

  public final c bzx()
  {
    c localc = null;
    AppMethodBeat.i(20882);
    ab.d("MicroMsg.FreeWifi.FreeWifiInfoStorage", "getLastConnectSuccessWifiInfo, sql : %s", new Object[] { "select * from FreeWifiInfo where connectState = 2" });
    Cursor localCursor = rawQuery("select * from FreeWifiInfo where connectState = 2", new String[0]);
    if (localCursor == null)
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiInfoStorage", "no connected sucess wifi info");
      AppMethodBeat.o(20882);
    }
    while (true)
    {
      return localc;
      if (localCursor.moveToFirst())
      {
        localc = new c();
        localc.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(20882);
      }
      else
      {
        localCursor.close();
        AppMethodBeat.o(20882);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.g.d
 * JD-Core Version:    0.6.2
 */