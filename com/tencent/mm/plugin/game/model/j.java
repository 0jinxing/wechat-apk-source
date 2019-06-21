package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

public final class j
  implements k
{
  private static Set<a> jfv;
  private static j mVT;
  private static HashMap<String, j.b> mVU;

  static
  {
    AppMethodBeat.i(111270);
    mVT = null;
    jfv = Collections.synchronizedSet(new HashSet());
    mVU = new HashMap();
    AppMethodBeat.o(111270);
  }

  public static void a(a parama)
  {
    AppMethodBeat.i(111251);
    synchronized (jfv)
    {
      jfv.add(parama);
      AppMethodBeat.o(111251);
      return;
    }
  }

  public static void a(String paramString1, int paramInt, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(111267);
    int i;
    if (paramInt != 710)
    {
      i = paramInt;
      if (paramInt != 711);
    }
    else
    {
      i = com.tencent.mm.plugin.downloader.a.a.kJY;
    }
    ab.i("MicroMsg.GameDownloadEventBus", "appid = %s, errCode = %d", new Object[] { paramString1, Integer.valueOf(i) });
    if (!paramBoolean)
    {
      ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCW();
      t.b(paramString1, 2, i, null, paramString2);
      AppMethodBeat.o(111267);
    }
    while (true)
    {
      return;
      ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCW();
      t.b(paramString1, 4, i, null, paramString2);
      AppMethodBeat.o(111267);
    }
  }

  public static void a(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4)
  {
    AppMethodBeat.i(111256);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(111256);
    while (true)
    {
      return;
      paramString2 = new j.b(paramString2, paramInt, paramString3, "", paramString4);
      paramString2.mVY = true;
      mVU.put(paramString1, paramString2);
      AppMethodBeat.o(111256);
    }
  }

  public static void a(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(111258);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(111258);
    while (true)
    {
      return;
      mVU.put(paramString1, new j.b(paramString2, paramInt, paramString3, paramString4, paramString5));
      AppMethodBeat.o(111258);
    }
  }

  public static void b(a parama)
  {
    AppMethodBeat.i(111252);
    synchronized (jfv)
    {
      jfv.remove(parama);
      ab.d("MicroMsg.GameDownloadEventBus", "removeListener, size:%d, listener:%s", new Object[] { Integer.valueOf(jfv.size()), parama });
      AppMethodBeat.o(111252);
      return;
    }
  }

  public static j bEg()
  {
    AppMethodBeat.i(111250);
    if (mVT == null)
      mVT = new j();
    j localj = mVT;
    AppMethodBeat.o(111250);
    return localj;
  }

  public static void bgr()
  {
    AppMethodBeat.i(111254);
    d.bij();
    com.tencent.mm.plugin.downloader.model.b.b(mVT);
    mVT = null;
    jfv.clear();
    mVU.clear();
    AppMethodBeat.o(111254);
  }

  public static void bie()
  {
    AppMethodBeat.i(111253);
    if (mVT == null)
      mVT = new j();
    com.tencent.mm.plugin.downloader.b.a.a(new j.1());
    d.bij();
    com.tencent.mm.plugin.downloader.model.b.a(mVT);
    AppMethodBeat.o(111253);
  }

  private static void e(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(111266);
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    String str1;
    String str2;
    if (locala != null)
    {
      str1 = null;
      str2 = null;
      if (paramInt == com.tencent.mm.plugin.downloader.a.a.kJW)
        str2 = str1;
    }
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      str2 = str1;
      localJSONObject.<init>();
      str2 = str1;
      localJSONObject.put("ChannelId", locala.field_channelId);
      str2 = str1;
      localJSONObject.put("DownloadSize", locala.field_downloadedSize);
      str2 = str1;
      str1 = com.tencent.mm.plugin.game.e.a.kY(localJSONObject.toString());
      str2 = str1;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      str2 = str1;
      localStringBuilder.<init>("extInfo = ");
      str2 = str1;
      ab.d("MicroMsg.GameDownloadEventBus", localJSONObject.toString());
      str2 = str1;
      a(locala.field_appId, paramInt, paramBoolean, str2);
      AppMethodBeat.o(111266);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.GameDownloadEventBus", "reportDownloadFailed, e = " + localException.getMessage());
    }
  }

  public static void ex(String paramString1, String paramString2)
  {
    AppMethodBeat.i(111268);
    ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCW();
    t.b(paramString1, 6, 0, null, paramString2);
    AppMethodBeat.o(111268);
  }

  public static void n(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(111257);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(111257);
    while (true)
    {
      return;
      mVU.put(paramString1, new j.b(paramString2, 1002, paramString3, "", paramString4));
      AppMethodBeat.o(111257);
    }
  }

  private void y(long paramLong, int paramInt)
  {
    AppMethodBeat.i(111255);
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    j.b localb;
    int i;
    Object localObject;
    if (locala != null)
    {
      localb = (j.b)mVU.get(locala.field_downloadUrl);
      i = 0;
      switch (paramInt)
      {
      default:
        localObject = com.tencent.mm.game.report.api.b.eBF.eZ(locala.field_downloadId);
        if (localObject != null)
        {
          i = ((com.tencent.mm.game.report.api.a)localObject).eBE;
          ab.i("MicroMsg.GameDownloadEventBus", "downloadReportInfo.opId: %d", new Object[] { Integer.valueOf(i) });
        }
        break;
      case 6:
      case 1:
      case 7:
      case 2:
      case 4:
      case 3:
      case 5:
      }
    }
    while (true)
    {
      label141: int i1;
      if (locala.field_finishTime > 0L)
      {
        paramLong = locala.field_finishTime;
        com.tencent.mm.game.report.api.b localb1 = com.tencent.mm.game.report.api.b.eBF;
        String str1 = locala.field_appId;
        int j = locala.field_scene;
        long l1 = locala.field_startSize;
        long l2 = locala.field_downloadedSize;
        long l3 = locala.field_startSize;
        long l4 = locala.field_totalSize;
        String str2 = locala.field_downloadUrl;
        int k = locala.field_errCode;
        int m = locala.field_downloaderType;
        String str3 = locala.field_channelId;
        paramLong = (paramLong - locala.field_startTime) / 1000L;
        int n = locala.field_startState;
        long l5 = locala.field_downloadId;
        localObject = locala.field_extInfo;
        if (!locala.field_reserveInWifi)
          break label640;
        i1 = 1;
        label260: localb1.a(str1, j, i, l1, l2 - l3, l4, str2, k, m, str3, paramLong, n, l5, (String)localObject, i1);
        if ((locala.field_status == 2) || (locala.field_status == 5) || (locala.field_status == 4) || (locala.field_status == 3) || (locala.field_status == 0))
        {
          paramLong = locala.field_downloadId;
          ab.d("MicroMsg.FileDownloadSP", "clearDownloadSpeedStr");
          localObject = ah.getContext().getSharedPreferences("download_pref", 0);
          if (localObject != null)
            ((SharedPreferences)localObject).edit().remove(String.valueOf(paramLong)).apply();
        }
        if (localb != null)
          break label646;
        com.tencent.mm.game.report.api.b.eBF.a(locala.field_appId, locala.field_scene, i, locala.field_md5, locala.field_downloadUrl, "", locala.field_extInfo);
      }
      while (true)
      {
        al.d(new j.2(this, paramInt, locala.field_appId));
        AppMethodBeat.o(111255);
        return;
        i1 = 1;
        com.tencent.mm.game.report.api.b.eBF.j(locala.field_appId, 0L);
        i = i1;
        if (localb == null)
          break;
        if (localb.mVY)
        {
          com.tencent.mm.game.report.api.b.eBF.j(locala.field_appId, 1L);
          i = i1;
          break;
        }
        com.tencent.mm.game.report.api.b.eBF.j(locala.field_appId, 2L);
        i = i1;
        break;
        i = 7;
        com.tencent.mm.game.report.api.b.eBF.j(locala.field_appId, 4L);
        break;
        i = 6;
        com.tencent.mm.game.report.api.b.eBF.j(locala.field_appId, 3L);
        break;
        i = 2;
        com.tencent.mm.game.report.api.b.eBF.j(locala.field_appId, 5L);
        break;
        i = 3;
        com.tencent.mm.game.report.api.b.eBF.j(locala.field_appId, 6L);
        break;
        i = 8;
        com.tencent.mm.game.report.api.b.eBF.j(locala.field_appId, 7L);
        break;
        paramLong = System.currentTimeMillis();
        break label141;
        label640: i1 = 0;
        break label260;
        label646: com.tencent.mm.game.report.api.b.eBF.a(localb.appId, localb.scene, i, localb.cvZ, locala.field_downloadUrl, localb.mVX, localb.cvq);
      }
    }
  }

  public final void b(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(111261);
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    if ((locala != null) && (locala.field_downloadInWifi) && (!at.isWifi(ah.getContext())))
    {
      ab.i("MicroMsg.GameDownloadEventBus", "wifi pause, return");
      locala.field_status = 2;
      locala.field_errCode = 0;
      c.e(locala);
      com.tencent.mm.game.report.api.b localb = com.tencent.mm.game.report.api.b.eBF;
      String str1 = locala.field_appId;
      int i = locala.field_scene;
      long l1 = locala.field_startSize;
      long l2 = locala.field_downloadedSize;
      long l3 = locala.field_startSize;
      long l4 = locala.field_totalSize;
      String str2 = locala.field_downloadUrl;
      int j = locala.field_errCode;
      int k = locala.field_downloaderType;
      String str3 = locala.field_channelId;
      paramLong = (System.currentTimeMillis() - locala.field_startTime) / 1000L;
      int m = locala.field_startState;
      long l5 = locala.field_downloadId;
      String str4 = locala.field_extInfo;
      if (locala.field_reserveInWifi)
      {
        paramInt = 1;
        localb.a(str1, i, 13, l1, l2 - l3, l4, str2, j, k, str3, paramLong, m, l5, str4, paramInt);
        AppMethodBeat.o(111261);
      }
    }
    while (true)
    {
      return;
      paramInt = 0;
      break;
      y(paramLong, 5);
      e(paramLong, paramInt, paramBoolean);
      com.tencent.mm.plugin.game.c.a.iN(paramLong);
      AppMethodBeat.o(111261);
    }
  }

  public final void b(long paramLong, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(111260);
    ab.i("MicroMsg.GameDownloadEventBus", "onTaskFinished, path = %s, fileExists = %b", new Object[] { paramString, Boolean.valueOf(com.tencent.mm.vfs.e.ct(paramString)) });
    if ((!bo.isNullOrNil(paramString)) && (com.tencent.mm.vfs.e.ct(paramString)))
    {
      y(paramLong, 3);
      if (paramBoolean)
      {
        paramString = c.hv(paramLong);
        if (paramString != null)
        {
          paramString = paramString.field_appId;
          ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCW();
          t.b(paramString, 5, 0, null, null);
        }
      }
      com.tencent.mm.plugin.game.c.a.iN(paramLong);
      AppMethodBeat.o(111260);
    }
    while (true)
    {
      return;
      paramString = c.hv(paramLong);
      if (paramString != null)
      {
        paramString.field_status = 4;
        paramString.field_errCode = com.tencent.mm.plugin.downloader.a.a.kJZ;
        c.e(paramString);
      }
      b(paramLong, com.tencent.mm.plugin.downloader.a.a.kJZ, paramBoolean);
      if (paramString != null)
        com.tencent.mm.game.report.api.b.eBF.j(paramString.field_appId, 9L);
      AppMethodBeat.o(111260);
    }
  }

  public final void gm(long paramLong)
  {
    AppMethodBeat.i(111264);
    y(paramLong, 6);
    AppMethodBeat.o(111264);
  }

  public final void gn(long paramLong)
  {
  }

  public final void i(long paramLong, String paramString)
  {
    AppMethodBeat.i(111265);
    y(paramLong, 7);
    AppMethodBeat.o(111265);
  }

  public final void onTaskPaused(long paramLong)
  {
    AppMethodBeat.i(111263);
    y(paramLong, 2);
    AppMethodBeat.o(111263);
  }

  public final void onTaskRemoved(long paramLong)
  {
    AppMethodBeat.i(111262);
    y(paramLong, 4);
    com.tencent.mm.plugin.downloader.f.a locala = c.hv(paramLong);
    if (locala != null)
      e.as(ah.getContext(), locala.field_appId);
    AppMethodBeat.o(111262);
  }

  public final void onTaskStarted(long paramLong, String paramString)
  {
    AppMethodBeat.i(111259);
    y(paramLong, 1);
    AppMethodBeat.o(111259);
  }

  public static abstract interface a
  {
    public abstract void f(int paramInt, String paramString, boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.j
 * JD-Core Version:    0.6.2
 */