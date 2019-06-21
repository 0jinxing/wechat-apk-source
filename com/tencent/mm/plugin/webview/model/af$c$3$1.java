package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.e.a;

final class af$c$3$1
  implements Runnable
{
  af$c$3$1(af.c.3 param3, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6662);
    if (this.rcK == 1)
    {
      this.umj.umg.goBack();
      localObject = a.uKJ;
      if (this.umj.umh == null);
      for (localObject = ""; ; localObject = this.umj.umh)
      {
        a.a((String)localObject, this.umj.fEG, 0, 1, 0, 0, this.umj.crd);
        AppMethodBeat.o(6662);
        return;
      }
    }
    this.umj.umg.aeq(this.umj.umi);
    Object localObject = a.uKJ;
    if (this.umj.umh == null);
    for (localObject = ""; ; localObject = this.umj.umh)
    {
      a.a((String)localObject, this.umj.fEG, 1, 1, 0, 0, this.umj.crd);
      AppMethodBeat.o(6662);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.af.c.3.1
 * JD-Core Version:    0.6.2
 */