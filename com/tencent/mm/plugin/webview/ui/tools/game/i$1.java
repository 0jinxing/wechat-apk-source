package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$1
  implements Runnable
{
  i$1(Context paramContext)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8781);
    Toast.makeText(this.val$context, this.val$context.getString(2131300251), 0).show();
    AppMethodBeat.o(8781);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.i.1
 * JD-Core Version:    0.6.2
 */