package com.tencent.mm.plugin.freewifi.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FreeWifiSuccUI$1
  implements View.OnClickListener
{
  FreeWifiSuccUI$1(FreeWifiSuccUI paramFreeWifiSuccUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21085);
    this.mAn.finish();
    FreeWifiSuccUI.a(this.mAn);
    AppMethodBeat.o(21085);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiSuccUI.1
 * JD-Core Version:    0.6.2
 */