package com.tencent.mm.plugin.freewifi.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class FreeWifiManufacturerLoadingUI$2
  implements View.OnClickListener
{
  FreeWifiManufacturerLoadingUI$2(FreeWifiManufacturerLoadingUI paramFreeWifiManufacturerLoadingUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21010);
    this.mzG.mzF.postDelayed(new FreeWifiManufacturerLoadingUI.2.1(this), 0L);
    this.mzG.bzP();
    AppMethodBeat.o(21010);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiManufacturerLoadingUI.2
 * JD-Core Version:    0.6.2
 */