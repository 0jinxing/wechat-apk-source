package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.webview.ui.tools.widget.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.z.a.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

final class g$11$1$1
  implements n.a
{
  g$11$1$1(g.11.1 param1)
  {
  }

  public final void f(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(9054);
    ab.i("MicroMsg.MsgHandler", "stev onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
      ab.d("MicroMsg.MsgHandler", "press back button!");
      g.a(this.uHo.uHn.uHd, this.uHo.uHn.uqf, "authorize:fail auth cancel", null);
      this.uHo.uHn.uHi.aCB();
      AppMethodBeat.o(9054);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      g localg = this.uHo.uHn.uHd;
      String str = this.uHo.uHn.val$appId;
      i locali = this.uHo.uHn.uqf;
      g.a locala = this.uHo.uHn.uHi;
      Object localObject = (ArrayList)paramBundle.getSerializable("key_scope");
      paramBundle = new LinkedList();
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
        paramBundle.add((String)((Iterator)localObject).next());
      com.tencent.mm.kernel.g.Rg().a(new b(str, paramBundle, paramInt, new g.10(localg, locali, locala, paramInt)), 0);
      if (paramInt != 2)
        break;
      g.a(this.uHo.uHn.uHd, this.uHo.uHn.uqf, "authorize:fail auth deny", null);
      this.uHo.uHn.uHi.aCB();
      AppMethodBeat.o(9054);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.11.1.1
 * JD-Core Version:    0.6.2
 */