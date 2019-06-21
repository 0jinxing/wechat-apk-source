package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;

final class w$1 extends t
{
  w$1(w paramw, int paramInt)
  {
    super(paramInt);
  }

  final String aHr()
  {
    AppMethodBeat.i(131896);
    String str = this.ihI.aHu();
    AppMethodBeat.o(131896);
    return str;
  }

  protected final void b(WxaPkgLoadProgress paramWxaPkgLoadProgress)
  {
    AppMethodBeat.i(131898);
    super.b(paramWxaPkgLoadProgress);
    this.ihI.c(paramWxaPkgLoadProgress);
    AppMethodBeat.o(131898);
  }

  final void d(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(131897);
    this.ihI.e(paramWxaPkgWrappingInfo);
    this.ihI.f(paramWxaPkgWrappingInfo);
    AppMethodBeat.o(131897);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.w.1
 * JD-Core Version:    0.6.2
 */