package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeItemListUI$2
  implements View.OnClickListener
{
  ShakeItemListUI$2(ShakeItemListUI paramShakeItemListUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24721);
    ShakeItemListUI.a(this.quC, ShakeItemListUI.a(this.quC) ^ 0xFFFFFFFF);
    this.quC.CB(ShakeItemListUI.a(this.quC));
    AppMethodBeat.o(24721);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeItemListUI.2
 * JD-Core Version:    0.6.2
 */