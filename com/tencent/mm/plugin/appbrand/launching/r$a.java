package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.atomic.AtomicInteger;

abstract class r$a
  implements n.b
{
  private int iho = 0;

  private r$a(r paramr)
  {
  }

  public final void a(WxaPkgLoadProgress paramWxaPkgLoadProgress)
  {
    r.a(this.ihs);
    ab.i("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibHandler", aHq() + " progress=" + paramWxaPkgLoadProgress.progress);
    long l = aHp();
    if (l == 0L)
      r.b(this.ihs).set(100);
    while (true)
    {
      this.iho = paramWxaPkgLoadProgress.progress;
      r.c(this.ihs);
      return;
      r.b(this.ihs).addAndGet(Math.round(Math.max(0, paramWxaPkgLoadProgress.progress - this.iho) / (float)l));
    }
  }

  abstract long aHp();

  abstract String aHq();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.r.a
 * JD-Core Version:    0.6.2
 */