package com.tencent.mm.plugin.webview.ui.tools.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.event.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class GameWebViewUI$1 extends b
{
  GameWebViewUI$1(GameWebViewUI paramGameWebViewUI, String paramString)
  {
  }

  public final void bDB()
  {
    AppMethodBeat.i(8722);
    ab.i("MicroMsg.Wepkg.GameWebViewUI", "onReload");
    GameWebViewUI.a(this.uEh);
    if (GameWebViewUI.b(this.uEh))
      GameWebViewUI.c(this.uEh);
    AppMethodBeat.o(8722);
  }

  public final void bDC()
  {
    AppMethodBeat.i(8723);
    if (!GameWebViewUI.d(this.uEh))
    {
      GameWebViewUI.a(this.uEh, true);
      GameWebViewUI.f(this.uEh).postDelayed(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(8720);
          if (GameWebViewUI.d(GameWebViewUI.1.this.uEh))
            GameWebViewUI.e(GameWebViewUI.1.this.uEh);
          AppMethodBeat.o(8720);
        }
      }
      , 1000L);
    }
    AppMethodBeat.o(8723);
  }

  public final void hL(boolean paramBoolean)
  {
    AppMethodBeat.i(8724);
    GameWebViewUI.k(this.uEh).post(new GameWebViewUI.1.2(this, paramBoolean));
    AppMethodBeat.o(8724);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI.1
 * JD-Core Version:    0.6.2
 */