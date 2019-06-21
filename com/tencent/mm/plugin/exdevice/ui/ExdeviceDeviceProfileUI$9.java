package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class ExdeviceDeviceProfileUI$9
  implements View.OnClickListener
{
  ExdeviceDeviceProfileUI$9(ExdeviceDeviceProfileUI paramExdeviceDeviceProfileUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(19946);
    h.a(this.lAM, this.lAM.getString(2131299320), ExdeviceDeviceProfileUI.d(this.lAM), "", 50, ExdeviceDeviceProfileUI.e(this.lAM));
    AppMethodBeat.o(19946);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI.9
 * JD-Core Version:    0.6.2
 */