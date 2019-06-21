package com.tencent.mm.plugin.appbrand.game.e.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.game.widget.input.a;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.s;

final class d$1
  implements Runnable
{
  d$1(d paramd, s params)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130203);
    Object localObject = this.hsj.aun();
    if (localObject == null)
      AppMethodBeat.o(130203);
    while (true)
    {
      return;
      localObject = a.ck(((u)localObject).getContentView());
      if (localObject != null)
        ((a)localObject).hide();
      AppMethodBeat.o(130203);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.e.a.d.1
 * JD-Core Version:    0.6.2
 */