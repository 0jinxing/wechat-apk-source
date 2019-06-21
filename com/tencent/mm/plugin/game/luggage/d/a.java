package com.tencent.mm.plugin.game.luggage.d;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.luggage.d.g;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.j;
import com.tencent.mm.sdk.platformtools.ab;
import me.imid.swipebacklayout.lib.SwipeBackLayout;

public final class a extends e
{
  public a(g paramg, Bundle paramBundle)
  {
    super(paramg, null, paramBundle);
    AppMethodBeat.i(135911);
    if (this.bPO != null)
      this.bPO.setEnableGesture(false);
    ((d)getWebView()).setShouldCleanPkgWhenDestroy(true);
    AppMethodBeat.o(135911);
  }

  public final void NP(String paramString)
  {
    AppMethodBeat.i(135914);
    this.uhR.setPullDownEnabled(false);
    AppMethodBeat.o(135914);
  }

  public final boolean aYc()
  {
    return false;
  }

  public final void bDv()
  {
  }

  public final void bDw()
  {
    AppMethodBeat.i(135916);
    finish();
    AppMethodBeat.o(135916);
  }

  public final void cl(String paramString, int paramInt)
  {
    AppMethodBeat.i(135915);
    super.cl("微信游戏", paramInt);
    AppMethodBeat.o(135915);
  }

  public final void hK(boolean paramBoolean)
  {
  }

  public final View wR()
  {
    AppMethodBeat.i(135912);
    View localView = super.wR();
    this.uhS.setBackgroundColor(0);
    AppMethodBeat.o(135912);
    return localView;
  }

  public final void wU()
  {
    AppMethodBeat.i(135913);
    ab.i("MicroMsg.GameFloatLayerWebPage", "onForeground");
    super.wU();
    cl("微信游戏", 0);
    j localj = this.uhR;
    localj.setPullDownEnabled(false);
    localj.uiW.setVisibility(8);
    localj.uiV.setBackgroundColor(0);
    localj.setBackgroundColor(0);
    AppMethodBeat.o(135913);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.d.a
 * JD-Core Version:    0.6.2
 */