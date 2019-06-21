package com.tencent.mm.ui.chatting.c.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.appbrand.b;

final class a$2$1
  implements Runnable
{
  a$2$1(a.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31889);
    String str1 = b.aqJ(this.yTr.yTp.cgL.getTalkerUserName());
    String str2;
    if (bo.isNullOrNil(str1))
    {
      str1 = this.yTr.yTp.cgL.getTalkerUserName();
      if (bo.isNullOrNil(this.yTr.yTp.cgL.dDw()))
      {
        str2 = b.aqK(this.yTr.yTp.cgL.getTalkerUserName());
        a.b(this.yTr.yTp).username = this.yTr.yTp.cgL.getTalkerUserName();
        a.b(this.yTr.yTp).jnK = false;
        a.b(this.yTr.yTp).scene = a.c(this.yTr.yTp);
        a.b(this.yTr.yTp).yrk = a.d(this.yTr.yTp);
        if (a.c(this.yTr.yTp) != 2)
          break label285;
        a.b(this.yTr.yTp).iIa = a.e(this.yTr.yTp);
        if (!a.a(this.yTr.yTp))
          break label262;
        a.b(this.yTr.yTp).show(1);
        AppMethodBeat.o(31889);
      }
    }
    while (true)
    {
      return;
      str2 = this.yTr.yTp.cgL.dDw();
      break;
      str2 = b.aqK(str1);
      break;
      label262: a.b(this.yTr.yTp).show(2);
      AppMethodBeat.o(31889);
      continue;
      label285: WxaExposedParams.a locala = new WxaExposedParams.a();
      locala.appId = b.zm(str1);
      locala.from = 4;
      locala.username = str1;
      locala.nickname = str2;
      a.b(this.yTr.yTp).iIa = locala.ayP();
      a.b(this.yTr.yTp).appId = this.yTr.yTp.getAppId();
      if (a.a(this.yTr.yTp))
      {
        a.b(this.yTr.yTp).show(5);
        AppMethodBeat.o(31889);
      }
      else
      {
        a.b(this.yTr.yTp).show(6);
        AppMethodBeat.o(31889);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.c.a.2.1
 * JD-Core Version:    0.6.2
 */