package com.tencent.mm.plugin.game.luggage;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.luggage.d.k;
import com.tencent.luggage.g.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.luggage.d.d;
import com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.xweb.WebView;

public class e extends d
{
  public e(Context paramContext)
  {
    super(paramContext);
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(135845);
    super.b(paramWebView, paramString);
    AppMethodBeat.o(135845);
  }

  public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(135844);
    super.b(paramWebView, paramString, paramBitmap);
    AppMethodBeat.o(135844);
  }

  public void onAttachedToWindow()
  {
    AppMethodBeat.i(135841);
    super.onAttachedToWindow();
    getWebCore().a(new e.1(this));
    AppMethodBeat.o(135841);
  }

  public void onDetachedFromWindow()
  {
    AppMethodBeat.i(135842);
    super.onDetachedFromWindow();
    AppMethodBeat.o(135842);
  }

  public final void xo()
  {
    AppMethodBeat.i(135843);
    getWebCore().bPz = new e.2(this);
    if (getWebCore().bPD != null)
    {
      getWebCore().bPD.a(new LuggageMMLocalResourceProvider());
      getWebCore().bPD.a(new com.tencent.mm.plugin.webview.luggage.b(i.p(ah.getContext(), "preload_game_adapter.js")));
    }
    AppMethodBeat.o(135843);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.e
 * JD-Core Version:    0.6.2
 */