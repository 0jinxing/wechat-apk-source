package com.tencent.mm.plugin.game.luggage.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.b.b;
import com.tencent.mm.protocal.protobuf.bbb;
import com.tencent.mm.ui.base.l;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class c$1
  implements b.b
{
  c$1(c paramc)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(135894);
    Object localObject = this.mUp;
    b localb = ((c)localObject).mUn;
    localObject = ((c)localObject).mUm;
    Iterator localIterator = localb.mUj.iterator();
    while (localIterator.hasNext())
    {
      bbb localbbb = (bbb)localIterator.next();
      if (localbbb == null)
      {
        paraml.e(-1, "");
      }
      else
      {
        a locala = (a)localb.mUk.get(Integer.valueOf(localbbb.wkB));
        if (locala != null)
          locala.a((d)localObject, paraml, localbbb);
      }
    }
    AppMethodBeat.o(135894);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.c.a.c.1
 * JD-Core Version:    0.6.2
 */