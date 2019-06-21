package com.tencent.mm.plugin.webview.luggage.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class LuggageGetA8Key$1
  implements Runnable
{
  LuggageGetA8Key$1(LuggageGetA8Key paramLuggageGetA8Key, String paramString, int paramInt, LuggageGetA8Key.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6458);
    ab.i("MicroMsg.LuggageGetA8Key", "callback: %s", new Object[] { this.val$url });
    if (LuggageGetA8Key.a(this.ulh) != null)
      LuggageGetA8Key.a(this.ulh, this.val$url, this.ulf, LuggageGetA8Key.a(this.ulh).errType, LuggageGetA8Key.a(this.ulh).errCode, LuggageGetA8Key.a(this.ulh).aIm, LuggageGetA8Key.a(this.ulh).uli, this.ulg);
    AppMethodBeat.o(6458);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.permission.LuggageGetA8Key.1
 * JD-Core Version:    0.6.2
 */