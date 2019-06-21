package com.tencent.mm.plugin.appbrand;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class k$2
  implements Runnable
{
  k$2(k paramk, i parami, MiniProgramNavigationBackResult paramMiniProgramNavigationBackResult)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(86712);
    if (!this.gOH.g(this.gOI))
    {
      d.e("MicroMsg.AppBrandRuntimeContainer", "close with appId(%s), not top of stack, ignore", new Object[] { this.gOI.mAppId });
      AppMethodBeat.o(86712);
      return;
    }
    i locali = this.gOH.d(this.gOI);
    if (locali != null)
      locali.a(this.gOI.yf(), this.gOJ);
    String str1 = this.gOI.mAppId;
    if (locali == null);
    for (String str2 = "null"; ; str2 = locali.mAppId)
    {
      d.i("MicroMsg.AppBrandRuntimeContainer", "close before run(), out.appId[%s], willAppear.appId[%s], mIsActivityResumed[%b]", new Object[] { str1, str2, Boolean.valueOf(this.gOH.gOF) });
      this.gOH.b(locali, this.gOI, new k.2.1(this, locali));
      AppMethodBeat.o(86712);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.k.2
 * JD-Core Version:    0.6.2
 */