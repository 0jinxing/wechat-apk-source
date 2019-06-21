package com.tencent.mm.plugin.downloader.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader.a.d;
import com.tencent.mm.plugin.downloader.f.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class c
{
  public static com.tencent.mm.plugin.downloader.f.a In(String paramString)
  {
    AppMethodBeat.i(2397);
    b localb = XS();
    if (localb == null)
    {
      paramString = null;
      AppMethodBeat.o(2397);
    }
    while (true)
    {
      return paramString;
      paramString = localb.In(paramString);
      AppMethodBeat.o(2397);
    }
  }

  public static boolean Io(String paramString)
  {
    AppMethodBeat.i(2400);
    b localb = XS();
    boolean bool;
    if (localb == null)
    {
      bool = false;
      AppMethodBeat.o(2400);
    }
    while (true)
    {
      return bool;
      bool = localb.Io(paramString);
      AppMethodBeat.o(2400);
    }
  }

  public static boolean Ip(String paramString)
  {
    AppMethodBeat.i(2401);
    b localb = XS();
    boolean bool;
    if (localb == null)
    {
      bool = false;
      AppMethodBeat.o(2401);
    }
    while (true)
    {
      return bool;
      bool = localb.Ip(paramString);
      AppMethodBeat.o(2401);
    }
  }

  public static com.tencent.mm.plugin.downloader.f.a Iq(String paramString)
  {
    AppMethodBeat.i(2402);
    b localb = XS();
    if (localb == null)
    {
      paramString = null;
      AppMethodBeat.o(2402);
    }
    while (true)
    {
      return paramString;
      paramString = localb.Iq(paramString);
      AppMethodBeat.o(2402);
    }
  }

  public static b XS()
  {
    b localb = null;
    AppMethodBeat.i(2405);
    if (g.RN().QY())
    {
      g.RN();
      if (!com.tencent.mm.kernel.a.QT());
    }
    else
    {
      ab.e("MicroMsg.FileDownloadInfoDBHelper", "no user login");
      AppMethodBeat.o(2405);
    }
    while (true)
    {
      return localb;
      if (g.K(d.class) == null)
      {
        ab.e("MicroMsg.FileDownloadInfoDBHelper", "service not ready");
        AppMethodBeat.o(2405);
      }
      else
      {
        localb = ((d)g.K(d.class)).XS();
        AppMethodBeat.o(2405);
      }
    }
  }

  public static LinkedList<com.tencent.mm.plugin.downloader.f.a> bii()
  {
    AppMethodBeat.i(2404);
    Object localObject = XS();
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(2404);
    }
    while (true)
    {
      return localObject;
      ab.i("MicroMsg.FileDownloadInfoStorage", "getDownloadInWifiRunningTasks, sql = ".concat(String.valueOf("select * from FileDownloadInfo where status=1 and downloadInWifi=1")));
      Cursor localCursor = ((b)localObject).rawQuery("select * from FileDownloadInfo where status=1 and downloadInWifi=1", new String[0]);
      localObject = new LinkedList();
      if (localCursor == null)
      {
        AppMethodBeat.o(2404);
      }
      else
      {
        while (localCursor.moveToNext())
        {
          com.tencent.mm.plugin.downloader.f.a locala = new com.tencent.mm.plugin.downloader.f.a();
          locala.d(localCursor);
          ((LinkedList)localObject).add(locala);
        }
        localCursor.close();
        AppMethodBeat.o(2404);
      }
    }
  }

  public static long d(com.tencent.mm.plugin.downloader.f.a parama)
  {
    long l = -1L;
    AppMethodBeat.i(2398);
    if (parama == null)
      AppMethodBeat.o(2398);
    while (true)
    {
      return l;
      b localb = XS();
      if (localb == null)
      {
        AppMethodBeat.o(2398);
      }
      else
      {
        parama.field_updateTime = System.currentTimeMillis();
        boolean bool = localb.b(parama);
        ab.i("MicroMsg.FileDownloadInfoDBHelper", "insert downloadinfo: " + parama.field_downloadId + ", ret=" + bool);
        l = parama.field_downloadId;
        AppMethodBeat.o(2398);
      }
    }
  }

  public static long e(com.tencent.mm.plugin.downloader.f.a parama)
  {
    long l = -1L;
    AppMethodBeat.i(2399);
    if (parama == null)
      AppMethodBeat.o(2399);
    while (true)
    {
      return l;
      b localb = XS();
      if (localb == null)
      {
        AppMethodBeat.o(2399);
      }
      else
      {
        parama.field_updateTime = System.currentTimeMillis();
        boolean bool = localb.c(parama, new String[0]);
        ab.i("MicroMsg.FileDownloadInfoDBHelper", "Update Downloadinfo, ID: %d, ret: %b, Status: %d", new Object[] { Long.valueOf(parama.field_downloadId), Boolean.valueOf(bool), Integer.valueOf(parama.field_status) });
        l = parama.field_downloadId;
        AppMethodBeat.o(2399);
      }
    }
  }

  public static com.tencent.mm.plugin.downloader.f.a hv(long paramLong)
  {
    AppMethodBeat.i(2396);
    Object localObject = XS();
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(2396);
    }
    while (true)
    {
      return localObject;
      localObject = ((b)localObject).hC(paramLong);
      AppMethodBeat.o(2396);
    }
  }

  public static boolean hw(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(2403);
    b localb = XS();
    if (localb == null)
      AppMethodBeat.o(2403);
    while (true)
    {
      return bool;
      com.tencent.mm.plugin.downloader.f.a locala = new com.tencent.mm.plugin.downloader.f.a();
      locala.field_downloadId = paramLong;
      bool = localb.a(locala, new String[0]);
      AppMethodBeat.o(2403);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.c
 * JD-Core Version:    0.6.2
 */