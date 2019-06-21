package com.tencent.mm.plugin.exdevice.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ExdeviceBindDeviceGuideUI$2
  implements View.OnClickListener
{
  ExdeviceBindDeviceGuideUI$2(ExdeviceBindDeviceGuideUI paramExdeviceBindDeviceGuideUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(19812);
    paramView = new Intent();
    paramView.putExtra("device_scan_mode", ExdeviceBindDeviceGuideUI.a(this.lyM));
    paramView.putExtra("device_scan_conn_proto", ExdeviceBindDeviceGuideUI.b(this.lyM));
    paramView.putExtra("device_id", ExdeviceBindDeviceGuideUI.c(this.lyM));
    paramView.putExtra("device_type", ExdeviceBindDeviceGuideUI.d(this.lyM));
    paramView.putExtra("device_title", ExdeviceBindDeviceGuideUI.e(this.lyM));
    paramView.putExtra("device_desc", ExdeviceBindDeviceGuideUI.f(this.lyM));
    paramView.putExtra("device_icon_url", ExdeviceBindDeviceGuideUI.g(this.lyM));
    paramView.putExtra("device_category_id", ExdeviceBindDeviceGuideUI.h(this.lyM));
    paramView.putExtra("device_brand_name", ExdeviceBindDeviceGuideUI.i(this.lyM));
    paramView.putExtra("bind_ticket", ExdeviceBindDeviceGuideUI.j(this.lyM));
    paramView.putExtra("device_ble_simple_proto", ExdeviceBindDeviceGuideUI.k(this.lyM));
    paramView.putExtra("encryptKey", ExdeviceBindDeviceGuideUI.l(this.lyM));
    paramView.putExtra("jumpToBindDevice", true);
    if ((ExdeviceBindDeviceGuideUI.m(this.lyM)) && (!ExdeviceBindDeviceGuideUI.n(this.lyM)))
    {
      d.b(this.lyM.mController.ylL, "exdevice", ".ui.ExdeviceBindDeviceUI", paramView);
      AppMethodBeat.o(19812);
    }
    while (true)
    {
      return;
      if ((ExdeviceBindDeviceGuideUI.n(this.lyM)) && (!ExdeviceBindDeviceGuideUI.m(this.lyM)))
      {
        paramView.putExtra("exdevice_airkiss_open_type", 2);
        d.b(this.lyM.mController.ylL, "exdevice", ".ui.ExdeviceConnectWifiUI", paramView);
      }
      AppMethodBeat.o(19812);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI.2
 * JD-Core Version:    0.6.2
 */