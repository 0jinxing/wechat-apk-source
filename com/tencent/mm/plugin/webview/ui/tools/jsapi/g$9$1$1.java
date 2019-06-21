package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.webview.ui.tools.widget.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.z.a.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

final class g$9$1$1
  implements n.a
{
  g$9$1$1(g.9.1 param1)
  {
  }

  public final void f(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(9050);
    ab.i("MicroMsg.MsgHandler", "onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
      ab.i("MicroMsg.MsgHandler", "press back button!");
      g.a(this.uHl.uHk.uHd, this.uHl.uHk.uqf, "login:fail auth cancel", null);
      this.uHl.uHk.uHi.aCB();
      AppMethodBeat.o(9050);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      g localg = this.uHl.uHk.uHd;
      String str1 = this.uHl.uHk.val$appId;
      String str2 = this.uHl.ukk;
      i locali = this.uHl.uHk.uqf;
      g.a locala = this.uHl.uHk.uHi;
      Object localObject = (ArrayList)paramBundle.getSerializable("key_scope");
      paramBundle = new LinkedList();
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
        paramBundle.add((String)((Iterator)localObject).next());
      com.tencent.mm.kernel.g.Rg().a(new d(str1, paramBundle, str2, paramInt, new g.8(localg, locali, locala, paramInt)), 0);
      if (paramInt != 2)
        break;
      ab.e("MicroMsg.MsgHandler", "fail auth deny!");
      g.a(this.uHl.uHk.uHd, this.uHl.uHk.uqf, "login:fail auth deny", null);
      this.uHl.uHk.uHi.aCB();
      AppMethodBeat.o(9050);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.9.1.1
 * JD-Core Version:    0.6.2
 */