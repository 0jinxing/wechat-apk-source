package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.atomic.AtomicInteger;

abstract class s$a
  implements n.b
{
  private int iho = 0;

  private s$a(s params)
  {
  }

  public final void a(WxaPkgLoadProgress paramWxaPkgLoadProgress)
  {
    s.a(this.ihv);
    ab.i("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibModuleHandler", aHq() + " progress=" + paramWxaPkgLoadProgress.progress);
    long l = aHp();
    if (l == 0L)
      s.b(this.ihv).set(100);
    while (true)
    {
      this.iho = paramWxaPkgLoadProgress.progress;
      s.c(this.ihv);
      return;
      s.b(this.ihv).addAndGet(Math.round(Math.max(0, paramWxaPkgLoadProgress.progress - this.iho) / (float)l));
    }
  }

  abstract long aHp();

  abstract String aHq();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.s.a
 * JD-Core Version:    0.6.2
 */