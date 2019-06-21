package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$3
  implements Runnable
{
  a$3(a parama, Context paramContext)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6266);
    Toast.makeText(this.val$context, this.val$context.getString(2131300252), 0).show();
    AppMethodBeat.o(6266);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.a.3
 * JD-Core Version:    0.6.2
 */