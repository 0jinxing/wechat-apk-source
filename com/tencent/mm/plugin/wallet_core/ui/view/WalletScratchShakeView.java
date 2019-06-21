package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.i.d;
import com.tencent.mm.sdk.platformtools.ab;

public class WalletScratchShakeView extends FrameLayout
{
  WalletScratchShakeView.b tNW;
  boolean tNX;
  boolean tNY;
  private WalletScratchShakeView.a tNZ;

  public WalletScratchShakeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public WalletScratchShakeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(47936);
    if (this.tNW != null)
    {
      WalletScratchShakeView.b localb = this.tNW;
      ab.i("MicroMsg.WalletScratchShakeView", "onDestroy");
      if (localb.oOS != null)
        localb.oOS.bgr();
    }
    AppMethodBeat.o(47936);
  }

  public void setScratchShakeCallback(WalletScratchShakeView.a parama)
  {
    this.tNZ = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView
 * JD-Core Version:    0.6.2
 */