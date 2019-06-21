package com.tencent.mm.plugin.webview.ui.tools.game;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI.h;
import com.tencent.xweb.WebView;

public class GameBaseWebViewUI extends WebViewUI
{
  private c mUY;
  protected a uCU;

  public GameBaseWebViewUI()
  {
    AppMethodBeat.i(8637);
    this.mUY = new GameBaseWebViewUI.1(this);
    AppMethodBeat.o(8637);
  }

  public final boolean aMj()
  {
    return true;
  }

  public final void ab(Bundle paramBundle)
  {
    AppMethodBeat.i(8638);
    this.mUY.uDp.ao(paramBundle);
    AppMethodBeat.o(8638);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(8639);
    super.onCreate(paramBundle);
    AppMethodBeat.o(8639);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(8642);
    c.a(this.mUY.uDp.uDq);
    if (this.uCU != null)
      this.uCU.onDestroy();
    super.onDestroy();
    AppMethodBeat.o(8642);
  }

  public void onPause()
  {
    AppMethodBeat.i(8641);
    super.onPause();
    this.mUY.uDp.onPause();
    if (this.uCU != null)
    {
      a locala = this.uCU;
      locala.mUY.uDp.onPause();
      GameWebPerformanceInfo localGameWebPerformanceInfo = locala.mUN;
      localGameWebPerformanceInfo.eCj += System.currentTimeMillis() - locala.mUZ;
      locala.mUZ = System.currentTimeMillis();
    }
    AppMethodBeat.o(8641);
  }

  public void onResume()
  {
    AppMethodBeat.i(8640);
    this.mUY.uDp.onResume();
    if (this.uCU != null)
    {
      a locala = this.uCU;
      locala.mUY.uDp.onResume();
      locala.mUZ = System.currentTimeMillis();
    }
    super.onResume();
    AppMethodBeat.o(8640);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected class a extends WebViewUI.h
  {
    protected a()
    {
      super();
    }

    public void b(WebView paramWebView, String paramString)
    {
      AppMethodBeat.i(8636);
      super.b(paramWebView, paramString);
      GameBaseWebViewUI.c(GameBaseWebViewUI.this).uDp.dbZ();
      AppMethodBeat.o(8636);
    }

    public void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      AppMethodBeat.i(8635);
      GameBaseWebViewUI.c(GameBaseWebViewUI.this).uDp.dbY();
      super.b(paramWebView, paramString, paramBitmap);
      AppMethodBeat.o(8635);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI
 * JD-Core Version:    0.6.2
 */