package com.tencent.mm.plugin.downloader.f;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class b extends j<a>
{
  public static final String[] fnj;

  static
  {
    AppMethodBeat.i(2489);
    fnj = new String[] { j.a(a.ccO, "FileDownloadInfo"), "CREATE INDEX IF NOT EXISTS filedownloadinfo_appId  on FileDownloadInfo  (  appId )", "CREATE INDEX IF NOT EXISTS filedownloadinfo_status  on FileDownloadInfo  (  status )" };
    AppMethodBeat.o(2489);
  }

  public b(e parame)
  {
    super(parame, a.ccO, "FileDownloadInfo", null);
  }

  public static String N(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(2483);
    String str = "";
    if (bo.ek(paramLinkedList))
    {
      paramLinkedList = "1=1";
      AppMethodBeat.o(2483);
    }
    while (true)
    {
      return paramLinkedList;
      for (int i = 0; i < paramLinkedList.size() - 1; i++)
        str = str + "appId=\"" + (String)paramLinkedList.get(i) + "\" or ";
      paramLinkedList = str + "appId=\"" + (String)paramLinkedList.get(paramLinkedList.size() - 1) + "\"";
      AppMethodBeat.o(2483);
    }
  }

  public final a In(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(2482);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.FileDownloadInfoStorage", "appId is null");
      AppMethodBeat.o(2482);
      paramString = localObject2;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = rawQuery("select * from FileDownloadInfo where appId=\"" + paramString + "\"", new String[0]);
      if (localCursor == null)
      {
        AppMethodBeat.o(2482);
        paramString = localObject2;
      }
      else
      {
        paramString = localObject1;
        if (localCursor.moveToFirst())
        {
          paramString = new a();
          paramString.d(localCursor);
        }
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(2482);
      }
    }
  }

  public final boolean Io(String paramString)
  {
    AppMethodBeat.i(2487);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.FileDownloadInfoStorage", "deledonloadinfo failed, url is null");
      bool = false;
      AppMethodBeat.o(2487);
    }
    while (true)
    {
      return bool;
      bool = hY("FileDownloadInfo", "delete from FileDownloadInfo where downloadUrl=\"" + paramString + "\"");
      AppMethodBeat.o(2487);
    }
  }

  public final boolean Ip(String paramString)
  {
    AppMethodBeat.i(2488);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.FileDownloadInfoStorage", "deledonloadinfo failed, appId is null");
      bool = false;
      AppMethodBeat.o(2488);
    }
    while (true)
    {
      return bool;
      bool = hY("FileDownloadInfo", "delete from FileDownloadInfo where appId=\"" + paramString + "\"");
      AppMethodBeat.o(2488);
    }
  }

  public final a Iq(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(2485);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.FileDownloadInfoStorage", "Null or nil url");
      AppMethodBeat.o(2485);
      paramString = localObject2;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = rawQuery("select * from FileDownloadInfo where downloadUrlHashCode=" + paramString.hashCode(), new String[0]);
      if (localCursor == null)
      {
        AppMethodBeat.o(2485);
        paramString = localObject2;
      }
      else
      {
        paramString = localObject1;
        if (localCursor.moveToFirst())
        {
          paramString = new a();
          paramString.d(localCursor);
        }
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(2485);
      }
    }
  }

  public final boolean bit()
  {
    AppMethodBeat.i(2486);
    boolean bool = hY("FileDownloadInfo", "delete from FileDownloadInfo");
    AppMethodBeat.o(2486);
    return bool;
  }

  public final a hC(long paramLong)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(2484);
    if (paramLong < 0L)
    {
      ab.e("MicroMsg.FileDownloadInfoStorage", "download id is not avaiable");
      AppMethodBeat.o(2484);
    }
    while (true)
    {
      return localObject2;
      Cursor localCursor = rawQuery("select * from FileDownloadInfo where downloadId=".concat(String.valueOf(paramLong)), new String[0]);
      if (localCursor == null)
      {
        AppMethodBeat.o(2484);
      }
      else
      {
        localObject2 = localObject1;
        if (localCursor.moveToFirst())
        {
          localObject2 = new a();
          ((a)localObject2).d(localCursor);
        }
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(2484);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.f.b
 * JD-Core Version:    0.6.2
 */