package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.b;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.vfs.e;
import java.util.HashMap;

final class j$3
  implements Runnable
{
  j$3(long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111249);
    a locala = c.hv(this.kOJ);
    if (locala == null)
    {
      ab.e("MicroMsg.GameDownloadEventBus", "fInfo is null");
      AppMethodBeat.o(111249);
      return;
    }
    b localb;
    String str1;
    int i;
    long l1;
    long l2;
    long l3;
    long l4;
    String str2;
    int j;
    String str3;
    long l5;
    int k;
    long l6;
    Object localObject;
    if (locala.field_status == 3)
    {
      if (e.ct(locala.field_filePath))
      {
        ab.i("MicroMsg.GameDownloadEventBus", "onInstallFinish, delete file: %s", new Object[] { locala.field_filePath });
        e.deleteFile(locala.field_filePath);
      }
      c.hw(this.kOJ);
      localb = b.eBF;
      str1 = locala.field_appId;
      i = locala.field_scene;
      l1 = locala.field_startSize;
      l2 = locala.field_downloadedSize;
      l3 = locala.field_startSize;
      l4 = locala.field_totalSize;
      str2 = locala.field_downloadUrl;
      j = locala.field_downloaderType;
      str3 = locala.field_channelId;
      l5 = (locala.field_finishTime - locala.field_startTime) / 1000L;
      k = locala.field_startState;
      l6 = locala.field_downloadId;
      localObject = locala.field_extInfo;
      if (locala.field_reserveInWifi);
      for (m = 1; ; m = 0)
      {
        localb.a(str1, i, 5, l1, l2 - l3, l4, str2, 0, j, str3, l5, k, l6, (String)localObject, m);
        b.eBF.j(locala.field_appId, 8L);
        localObject = (j.b)j.bEi().get(locala.field_downloadUrl);
        if (localObject != null)
          break label292;
        b.eBF.a(locala.field_appId, locala.field_scene, 5, locala.field_md5, locala.field_downloadUrl, "", locala.field_extInfo);
        AppMethodBeat.o(111249);
        break;
      }
      label292: b.eBF.a(((j.b)localObject).appId, ((j.b)localObject).scene, 5, ((j.b)localObject).cvZ, locala.field_downloadUrl, ((j.b)localObject).mVX, ((j.b)localObject).cvq);
      str3 = locala.field_packageName;
      localObject = ah.getContext().getSharedPreferences("install_begin_time", 0);
      if (localObject == null)
        break label518;
      l3 = ((SharedPreferences)localObject).getLong(str3, 0L);
      label362: if (System.currentTimeMillis() - l3 <= 600000L)
      {
        localb = b.eBF;
        str1 = locala.field_appId;
        k = locala.field_scene;
        l5 = locala.field_startSize;
        l4 = locala.field_downloadedSize;
        l3 = locala.field_startSize;
        l1 = locala.field_totalSize;
        localObject = locala.field_downloadUrl;
        i = locala.field_downloaderType;
        str3 = locala.field_channelId;
        l2 = (locala.field_finishTime - locala.field_startTime) / 1000L;
        j = locala.field_startState;
        l6 = locala.field_downloadId;
        str2 = locala.field_extInfo;
        if (!locala.field_reserveInWifi)
          break label524;
      }
    }
    label518: label524: for (int m = 1; ; m = 0)
    {
      localb.a(str1, k, 17, l5, l4 - l3, l1, (String)localObject, 0, i, str3, l2, j, l6, str2, m);
      AppMethodBeat.o(111249);
      break;
      l3 = 0L;
      break label362;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.j.3
 * JD-Core Version:    0.6.2
 */