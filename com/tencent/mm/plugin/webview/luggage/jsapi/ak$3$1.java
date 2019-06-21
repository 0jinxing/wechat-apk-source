package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class ak$3$1
  implements Runnable
{
  ak$3$1(ak.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6351);
    Toast.makeText(ah.getContext(), this.uks.val$context.getString(2131299997, new Object[] { Integer.valueOf(3), Integer.valueOf(-1) }), 0).show();
    AppMethodBeat.o(6351);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ak.3.1
 * JD-Core Version:    0.6.2
 */