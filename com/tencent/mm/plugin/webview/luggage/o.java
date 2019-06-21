package com.tencent.mm.plugin.webview.luggage;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.bo;

public final class o
{
  public static void C(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(6223);
    if (bo.isNullOrNil(paramIntent.getStringExtra("rawUrl")))
      AppMethodBeat.o(6223);
    while (true)
    {
      return;
      d.b(paramContext, "game", ".luggage.LuggageGameWebViewUI", paramIntent);
      AppMethodBeat.o(6223);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.o
 * JD-Core Version:    0.6.2
 */