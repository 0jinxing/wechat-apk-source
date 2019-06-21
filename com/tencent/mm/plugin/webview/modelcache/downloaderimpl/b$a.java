package com.tencent.mm.plugin.webview.modelcache.downloaderimpl;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.c.m;
import com.tencent.mm.pluginsdk.g.a.c.q;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.sdk.platformtools.ab;

final class b$a
{
  static void c(String paramString, m paramm)
  {
    AppMethodBeat.i(6904);
    s locals = q.a.diy().ajg(paramString);
    if (locals == null)
    {
      ab.e("MicroMsg.ResDownloader.WebViewCache.DoResponseLogic", "networkRequest already completed, but get null record with urlKey = %s", new Object[] { paramString });
      AppMethodBeat.o(6904);
    }
    while (true)
    {
      return;
      if (!"WebViewCache".equals(locals.field_groupId1))
      {
        ab.e("MicroMsg.ResDownloader.WebViewCache.DoResponseLogic", "mismatch groupId, urlKey = %s, record.groupId = %s", new Object[] { paramString, locals.field_groupId1 });
        AppMethodBeat.o(6904);
      }
      else
      {
        locals.field_contentType = paramm.bqF;
        q.a.diy().h(locals);
        paramString = new f(locals.field_url, locals.field_filePath, locals.field_fileVersion, locals.field_appId, locals.field_groupId2, locals.field_packageId, locals.field_wvCacheType, paramm.bqF, paramm.aHW, paramm.vfo);
        WebViewCacheDownloadHelper.cYr();
        WebViewCacheDownloadHelper.a(paramString);
        AppMethodBeat.o(6904);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.downloaderimpl.b.a
 * JD-Core Version:    0.6.2
 */