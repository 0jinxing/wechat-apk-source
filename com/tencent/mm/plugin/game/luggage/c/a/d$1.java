package com.tencent.mm.plugin.game.luggage.c.a;

import android.content.Context;
import android.widget.Toast;
import com.tencent.luggage.d.k;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask;
import com.tencent.mm.ui.base.h;

final class d$1
  implements Runnable
{
  d$1(d paramd, AddShortcutTask paramAddShortcutTask, com.tencent.mm.plugin.webview.luggage.d paramd1, Context paramContext)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135899);
    this.mUq.aBW();
    this.mUr.bPN.a(new d.1.1(this));
    if (this.mUq.success)
    {
      h.a(this.val$context, 2131305684, 2131297061, false, new d.1.2(this));
      AppMethodBeat.o(135899);
    }
    while (true)
    {
      return;
      Toast.makeText(this.val$context, this.val$context.getString(2131305683), 0).show();
      AppMethodBeat.o(135899);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.c.a.d.1
 * JD-Core Version:    0.6.2
 */