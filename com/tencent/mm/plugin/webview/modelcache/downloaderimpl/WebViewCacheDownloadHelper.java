package com.tencent.mm.plugin.webview.modelcache.downloaderimpl;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.vm;
import com.tencent.mm.vfs.e;

public final class WebViewCacheDownloadHelper
{
  private static final byte[] uot = new byte[0];
  private static volatile WebViewCacheDownloadHelper uou = null;

  static void a(f paramf)
  {
    AppMethodBeat.i(6903);
    vm localvm = new vm();
    localvm.cSw.url = paramf.url;
    localvm.cSw.filePath = paramf.filePath;
    localvm.cSw.version = paramf.version;
    localvm.cSw.appId = paramf.appId;
    localvm.cSw.cSx = paramf.cSx;
    localvm.cSw.cSy = paramf.cSy;
    localvm.cSw.cSz = paramf.cSz;
    localvm.cSw.bqF = paramf.bqF;
    localvm.cSw.exception = paramf.exception;
    localvm.cSw.aHW = paramf.aHW;
    com.tencent.mm.sdk.b.a.xxA.a(localvm, Looper.getMainLooper());
    AppMethodBeat.o(6903);
  }

  public static WebViewCacheDownloadHelper cYr()
  {
    AppMethodBeat.i(6901);
    if (uou == null);
    synchronized (uot)
    {
      if (uou == null)
      {
        WebViewCacheDownloadHelper localWebViewCacheDownloadHelper = new com/tencent/mm/plugin/webview/modelcache/downloaderimpl/WebViewCacheDownloadHelper;
        localWebViewCacheDownloadHelper.<init>();
        uou = localWebViewCacheDownloadHelper;
      }
      ??? = uou;
      AppMethodBeat.o(6901);
      return ???;
    }
  }

  public static void cYs()
  {
    AppMethodBeat.i(6902);
    e.N(a.uos, true);
    AppMethodBeat.o(6902);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.downloaderimpl.WebViewCacheDownloadHelper
 * JD-Core Version:    0.6.2
 */