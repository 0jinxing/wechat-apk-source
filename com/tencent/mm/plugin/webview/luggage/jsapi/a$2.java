package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$2
  implements Runnable
{
  a$2(a parama, Context paramContext)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6265);
    Toast.makeText(this.val$context, this.val$context.getString(2131300255), 0).show();
    AppMethodBeat.o(6265);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.a.2
 * JD-Core Version:    0.6.2
 */