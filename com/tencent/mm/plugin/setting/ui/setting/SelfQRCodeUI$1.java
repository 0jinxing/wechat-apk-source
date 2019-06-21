package com.tencent.mm.plugin.setting.ui.setting;

import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SelfQRCodeUI$1
  implements Runnable
{
  SelfQRCodeUI$1(SelfQRCodeUI paramSelfQRCodeUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127014);
    int i = SelfQRCodeUI.a(this.qly).getWidth();
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)SelfQRCodeUI.a(this.qly).getLayoutParams();
    localLayoutParams.width = i;
    localLayoutParams.height = i;
    SelfQRCodeUI.a(this.qly).setLayoutParams(localLayoutParams);
    AppMethodBeat.o(127014);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI.1
 * JD-Core Version:    0.6.2
 */