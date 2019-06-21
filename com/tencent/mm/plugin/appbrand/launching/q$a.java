package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.atomic.AtomicInteger;

abstract class q$a
  implements n.b
{
  private int iho = 0;

  private q$a(q paramq)
  {
  }

  public final void a(WxaPkgLoadProgress paramWxaPkgLoadProgress)
  {
    q.a(this.ihl);
    ab.i("MicroMsg.AppBrand.LaunchCheckPkgModularizingHandler", aHq() + " progress=" + paramWxaPkgLoadProgress.progress);
    long l = aHp();
    if (l == 0L)
      q.b(this.ihl).set(100);
    while (true)
    {
      this.iho = paramWxaPkgLoadProgress.progress;
      q.c(this.ihl);
      return;
      q.b(this.ihl).addAndGet(Math.round(Math.max(0, paramWxaPkgLoadProgress.progress - this.iho) / (float)l));
    }
  }

  abstract long aHp();

  abstract String aHq();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.q.a
 * JD-Core Version:    0.6.2
 */