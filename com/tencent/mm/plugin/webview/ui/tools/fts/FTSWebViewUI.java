package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.app.Activity;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.an;

public class FTSWebViewUI extends FTSBaseWebViewUI
{
  private void dbN()
  {
    AppMethodBeat.i(8546);
    if (this.scene == 21)
      an.Il(19);
    AppMethodBeat.o(8546);
  }

  public final void aMh()
  {
    AppMethodBeat.i(8540);
    super.aMh();
    an.Ij(this.scene);
    if (this.scene == 21)
      an.Il(17);
    AppMethodBeat.o(8540);
  }

  public final void daC()
  {
    AppMethodBeat.i(8547);
    dbN();
    super.daC();
    AppMethodBeat.o(8547);
  }

  protected final String getHint()
  {
    AppMethodBeat.i(8539);
    String str = getString(2131297040);
    AppMethodBeat.o(8539);
    return str;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(8544);
    super.onBackPressed();
    dbN();
    AppMethodBeat.o(8544);
  }

  public void onClickCancelBtn(View paramView)
  {
    AppMethodBeat.i(8545);
    super.onClickCancelBtn(paramView);
    finish();
    AppMethodBeat.o(8545);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(8543);
    super.onDestroy();
    an.cVx();
    an.cVy();
    if (this.scene == 21)
      an.Il(18);
    AppMethodBeat.o(8543);
  }

  public void onPause()
  {
    AppMethodBeat.i(8542);
    super.onPause();
    an.cVw();
    AppMethodBeat.o(8542);
  }

  public void onResume()
  {
    AppMethodBeat.i(8541);
    super.onResume();
    an.cVv();
    AppMethodBeat.o(8541);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSWebViewUI
 * JD-Core Version:    0.6.2
 */