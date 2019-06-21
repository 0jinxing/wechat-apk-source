package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.y;
import com.tencent.mm.sdk.g.d;

public abstract class u
  implements n
{
  public volatile n.c ihx;
  private volatile n.b ihy;
  final y ihz;

  u(y paramy)
  {
    this.ihz = paramy;
  }

  public final void a(n.b paramb)
  {
    this.ihy = paramb;
  }

  public final void a(n.c paramc)
  {
    this.ihx = paramc;
  }

  final void aHs()
  {
    if (this.ihx != null)
      this.ihx.aHm();
  }

  final void aHt()
  {
    if (this.ihx != null)
      this.ihx.aHo();
  }

  public abstract String aHu();

  final void c(WxaPkgLoadProgress paramWxaPkgLoadProgress)
  {
    n.b localb = this.ihy;
    if (localb != null)
      localb.a(paramWxaPkgLoadProgress);
  }

  final void e(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    if (this.ihx != null)
      this.ihx.b(paramWxaPkgWrappingInfo);
  }

  final void f(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    if (this.ihx != null)
      this.ihx.c(paramWxaPkgWrappingInfo);
  }

  public abstract void prepare();

  public final void prepareAsync()
  {
    d.post(new u.1(this), "AppBrandLaunchPrepareJob#" + aHu());
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.u
 * JD-Core Version:    0.6.2
 */