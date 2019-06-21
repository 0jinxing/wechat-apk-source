package com.tencent.mm.plugin.webwx.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class ExtDeviceWXLoginUI$3
  implements View.OnClickListener
{
  ExtDeviceWXLoginUI$3(ExtDeviceWXLoginUI paramExtDeviceWXLoginUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26523);
    boolean bool;
    if (ExtDeviceWXLoginUI.b(this.uLu) == 0)
      if (ExtDeviceWXLoginUI.c(this.uLu))
      {
        bool = ((CheckBox)this.uLu.findViewById(2131823278)).isChecked();
        ExtDeviceWXLoginUI.a(this.uLu, false);
        if (bool)
        {
          aw.ZK();
          c.Ry().set(ac.a.xPz, Boolean.TRUE);
          paramView = this.uLu;
          if ((!ExtDeviceWXLoginUI.c(this.uLu)) || (!bool))
            break label158;
          bool = true;
          label92: ExtDeviceWXLoginUI.b(paramView, bool);
          AppMethodBeat.o(26523);
        }
      }
    while (true)
    {
      return;
      aw.ZK();
      if (((Boolean)c.Ry().get(ac.a.xPz, Boolean.TRUE)).booleanValue())
        ExtDeviceWXLoginUI.a(this.uLu, true);
      aw.ZK();
      c.Ry().set(ac.a.xPz, Boolean.FALSE);
      break;
      label158: bool = false;
      break label92;
      ExtDeviceWXLoginUI.b(this.uLu, false);
      AppMethodBeat.o(26523);
      continue;
      if (ExtDeviceWXLoginUI.b(this.uLu) == -2)
      {
        paramView = new Intent();
        paramView.putExtra("BaseScanUI_select_scan_mode", 1);
        paramView.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
        paramView.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 2);
        paramView.putExtra("from_album", false);
        paramView.putExtra("show_intro", false);
        paramView.setFlags(65536);
        d.b(this.uLu, "scanner", ".ui.BaseScanUI", paramView);
        this.uLu.finish();
      }
      AppMethodBeat.o(26523);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI.3
 * JD-Core Version:    0.6.2
 */