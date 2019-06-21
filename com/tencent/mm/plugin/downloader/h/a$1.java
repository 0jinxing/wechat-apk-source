package com.tencent.mm.plugin.downloader.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.b;
import com.tencent.mm.sdk.platformtools.ah;

final class a$1
  implements com.tencent.mm.pluginsdk.permission.a
{
  a$1(com.tencent.mm.plugin.downloader.f.a parama, boolean paramBoolean, com.tencent.mm.pluginsdk.permission.a parama1)
  {
  }

  public final void dT(boolean paramBoolean)
  {
    AppMethodBeat.i(2522);
    if (paramBoolean)
    {
      localObject1 = this.kMF.field_packageName;
      localObject2 = ah.getContext().getSharedPreferences("install_begin_time", 0);
      if (localObject2 != null)
        ((SharedPreferences)localObject2).edit().putLong((String)localObject1, System.currentTimeMillis()).apply();
      b.eBF.a(this.kMF.field_appId, this.kMF.field_scene, 4, this.kMF.field_md5, this.kMF.field_downloadUrl, null, this.kMF.field_extInfo);
      localObject1 = b.eBF;
      str1 = this.kMF.field_appId;
      i = this.kMF.field_scene;
      l1 = this.kMF.field_startSize;
      l2 = this.kMF.field_downloadedSize;
      l3 = this.kMF.field_startSize;
      l4 = this.kMF.field_totalSize;
      str2 = this.kMF.field_downloadUrl;
      j = this.kMF.field_errCode;
      k = this.kMF.field_downloaderType;
      str3 = this.kMF.field_channelId;
      l5 = (System.currentTimeMillis() - this.kMF.field_startTime) / 1000L;
      m = this.kMF.field_startState;
      l6 = this.kMF.field_downloadId;
      localObject2 = this.kMF.field_extInfo;
      if (!this.kMF.field_reserveInWifi)
        break label497;
      n = 1;
      ((b)localObject1).a(str1, i, 4, l1, l2 - l3, l4, str2, j, k, str3, l5, m, l6, (String)localObject2, n);
      if (!this.kNM)
        break label509;
      localObject1 = b.eBF;
      str2 = this.kMF.field_appId;
      k = this.kMF.field_scene;
      l1 = this.kMF.field_startSize;
      l2 = this.kMF.field_downloadedSize;
      l6 = this.kMF.field_startSize;
      l4 = this.kMF.field_totalSize;
      str1 = this.kMF.field_downloadUrl;
      i = this.kMF.field_errCode;
      m = this.kMF.field_downloaderType;
      str3 = this.kMF.field_channelId;
      l5 = (System.currentTimeMillis() - this.kMF.field_startTime) / 1000L;
      j = this.kMF.field_startState;
      l3 = this.kMF.field_downloadId;
      localObject2 = this.kMF.field_extInfo;
      if (!this.kMF.field_reserveInWifi)
        break label503;
    }
    label497: label503: for (int n = 1; ; n = 0)
    {
      ((b)localObject1).a(str2, k, 15, l1, l2 - l6, l4, str1, i, m, str3, l5, j, l3, (String)localObject2, n);
      if (this.kNN != null)
        this.kNN.dT(paramBoolean);
      AppMethodBeat.o(2522);
      return;
      n = 0;
      break;
    }
    label509: Object localObject2 = b.eBF;
    String str2 = this.kMF.field_appId;
    int j = this.kMF.field_scene;
    long l3 = this.kMF.field_startSize;
    long l4 = this.kMF.field_downloadedSize;
    long l1 = this.kMF.field_startSize;
    long l2 = this.kMF.field_totalSize;
    String str1 = this.kMF.field_downloadUrl;
    int m = this.kMF.field_errCode;
    int k = this.kMF.field_downloaderType;
    String str3 = this.kMF.field_channelId;
    long l5 = (System.currentTimeMillis() - this.kMF.field_startTime) / 1000L;
    int i = this.kMF.field_startState;
    long l6 = this.kMF.field_downloadId;
    Object localObject1 = this.kMF.field_extInfo;
    if (this.kMF.field_reserveInWifi);
    for (n = 1; ; n = 0)
    {
      ((b)localObject2).a(str2, j, 16, l3, l4 - l1, l2, str1, m, k, str3, l5, i, l6, (String)localObject1, n);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.h.a.1
 * JD-Core Version:    0.6.2
 */