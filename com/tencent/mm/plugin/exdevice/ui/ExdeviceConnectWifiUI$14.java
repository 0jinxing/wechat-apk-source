package com.tencent.mm.plugin.exdevice.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ExdeviceConnectWifiUI$14
  implements TextView.OnEditorActionListener
{
  ExdeviceConnectWifiUI$14(ExdeviceConnectWifiUI paramExdeviceConnectWifiUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(19890);
    boolean bool;
    if ((paramInt == 6) || (paramInt == 5))
    {
      ab.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "on next Key down.");
      ExdeviceConnectWifiUI.k(this.lAf);
      bool = true;
      AppMethodBeat.o(19890);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(19890);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.14
 * JD-Core Version:    0.6.2
 */