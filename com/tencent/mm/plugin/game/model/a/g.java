package com.tencent.mm.plugin.game.model.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public final class g extends j<d>
{
  public static final String[] fnj;

  static
  {
    AppMethodBeat.i(111533);
    fnj = new String[] { j.a(d.ccO, "GameSilentDownload") };
    AppMethodBeat.o(111533);
  }

  public g(e parame)
  {
    super(parame, d.ccO, "GameSilentDownload", null);
  }

  public final boolean H(String paramString, long paramLong)
  {
    AppMethodBeat.i(111526);
    boolean bool;
    if ((bo.isNullOrNil(paramString)) || (paramLong < 0L))
    {
      ab.i("MicroMsg.GameSilentDownloadStorage", "updateNextCheckTime: appid is null");
      AppMethodBeat.o(111526);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = hY("GameSilentDownload", String.format("update %s set %s=%s where %s='%s'", new Object[] { "GameSilentDownload", "nextCheckTime", String.valueOf(paramLong), "appId", paramString }));
      ab.i("MicroMsg.GameSilentDownloadStorage", "updateNextCheckTime ret:%b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(111526);
    }
  }

  public final d Ob(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(111524);
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfo: appid is null");
      AppMethodBeat.o(111524);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = rawQuery(String.format("select * from %s where %s=?", new Object[] { "GameSilentDownload", "appId" }), new String[] { paramString });
      if (localCursor == null)
      {
        ab.i("MicroMsg.GameSilentDownloadStorage", "cursor is null");
        AppMethodBeat.o(111524);
        paramString = localObject;
      }
      else if (localCursor.moveToFirst())
      {
        paramString = new d();
        paramString.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(111524);
      }
      else
      {
        ab.i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfo appid:%s, no record in DB", new Object[] { paramString });
        localCursor.close();
        AppMethodBeat.o(111524);
        paramString = localObject;
      }
    }
  }

  public final boolean Oc(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(111528);
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.GameSilentDownloadStorage", "updateWifiState: appid is null");
      AppMethodBeat.o(111528);
    }
    while (true)
    {
      return bool;
      paramString = Ob(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(111528);
      }
      else
      {
        paramString.field_noWifi = false;
        bool = super.c(paramString, new String[0]);
        ab.i("MicroMsg.GameSilentDownloadStorage", "updateWifiState, ret:%b", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(111528);
      }
    }
  }

  public final boolean Od(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(111529);
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.GameSilentDownloadStorage", "updateSdcardAvailableState: appid is null");
      AppMethodBeat.o(111529);
    }
    while (true)
    {
      return bool;
      paramString = Ob(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(111529);
      }
      else
      {
        paramString.field_noSdcard = false;
        bool = super.c(paramString, new String[0]);
        ab.i("MicroMsg.GameSilentDownloadStorage", "updateSdcardAvailableState, ret:%b", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(111529);
      }
    }
  }

  public final boolean Oe(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(111530);
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.GameSilentDownloadStorage", "updateSdcardSpaceState: appid is null");
      AppMethodBeat.o(111530);
    }
    while (true)
    {
      return bool;
      paramString = Ob(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(111530);
      }
      else
      {
        paramString.field_noEnoughSpace = false;
        bool = super.c(paramString, new String[0]);
        ab.i("MicroMsg.GameSilentDownloadStorage", "updateSdcardSpaceState, ret:%b", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(111530);
      }
    }
  }

  public final boolean Of(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(111531);
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.GameSilentDownloadStorage", "updateBatteryState: appid is null");
      AppMethodBeat.o(111531);
    }
    while (true)
    {
      return bool;
      paramString = Ob(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(111531);
      }
      else
      {
        paramString.field_lowBattery = false;
        bool = super.c(paramString, new String[0]);
        ab.i("MicroMsg.GameSilentDownloadStorage", "updateBatteryState, ret:%b", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(111531);
      }
    }
  }

  public final boolean Og(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(111532);
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.GameSilentDownloadStorage", "updateDelayState: appid is null");
      AppMethodBeat.o(111532);
    }
    while (true)
    {
      return bool;
      paramString = Ob(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(111532);
      }
      else
      {
        paramString.field_continueDelay = false;
        bool = super.c(paramString, new String[0]);
        ab.i("MicroMsg.GameSilentDownloadStorage", "updateDelayState, ret:%b", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(111532);
      }
    }
  }

  public final boolean aQ(String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(111527);
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.GameSilentDownloadStorage", "updateRunningState: appid is null");
      AppMethodBeat.o(111527);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      paramString = Ob(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(111527);
        paramBoolean = bool;
      }
      else
      {
        paramString.field_isRunning = paramBoolean;
        paramBoolean = super.c(paramString, new String[0]);
        ab.i("MicroMsg.GameSilentDownloadStorage", "updateRunningState, ret:%b", new Object[] { Boolean.valueOf(paramBoolean) });
        AppMethodBeat.o(111527);
      }
    }
  }

  public final d bEY()
  {
    d locald = null;
    AppMethodBeat.i(111523);
    Cursor localCursor = rawQuery(String.format("select * from %s where %s=1 limit 1", new Object[] { "GameSilentDownload", "isRunning" }), new String[0]);
    if (localCursor == null)
    {
      ab.i("MicroMsg.GameSilentDownloadStorage", "first cursor is null");
      AppMethodBeat.o(111523);
    }
    while (true)
    {
      return locald;
      if (localCursor.moveToFirst())
      {
        locald = new d();
        locald.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(111523);
      }
      else
      {
        ab.i("MicroMsg.GameSilentDownloadStorage", "no running task");
        localCursor.close();
        localCursor = rawQuery(String.format("select * from %s where %s < ? limit 1", new Object[] { "GameSilentDownload", "nextCheckTime" }), new String[] { String.valueOf(bo.anT()) });
        if (localCursor == null)
        {
          ab.i("MicroMsg.GameSilentDownloadStorage", "second cursor is null");
          AppMethodBeat.o(111523);
        }
        else if (localCursor.moveToFirst())
        {
          locald = new d();
          locald.d(localCursor);
          localCursor.close();
          AppMethodBeat.o(111523);
        }
        else
        {
          localCursor.close();
          ab.i("MicroMsg.GameSilentDownloadStorage", "no record");
          AppMethodBeat.o(111523);
        }
      }
    }
  }

  public final List<d> bEZ()
  {
    Object localObject = null;
    AppMethodBeat.i(111525);
    Cursor localCursor = rawQuery(String.format("select * from %s", new Object[] { "GameSilentDownload" }), new String[0]);
    if (localCursor == null)
    {
      ab.i("MicroMsg.GameSilentDownloadStorage", "cursor is null");
      AppMethodBeat.o(111525);
    }
    while (true)
    {
      return localObject;
      if (localCursor.moveToFirst())
      {
        localObject = new ArrayList();
        do
        {
          d locald = new d();
          locald.d(localCursor);
          ((List)localObject).add(locald);
        }
        while (localCursor.moveToNext());
        localCursor.close();
        ab.i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfoList size:%s", new Object[] { Integer.valueOf(((List)localObject).size()) });
        AppMethodBeat.o(111525);
      }
      else
      {
        localCursor.close();
        ab.i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfoList no record");
        AppMethodBeat.o(111525);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.a.g
 * JD-Core Version:    0.6.2
 */