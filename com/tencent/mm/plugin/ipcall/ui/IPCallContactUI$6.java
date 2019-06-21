package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class IPCallContactUI$6
  implements AdapterView.OnItemClickListener
{
  IPCallContactUI$6(IPCallContactUI paramIPCallContactUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(22080);
    if (IPCallContactUI.d(this.nBH).wK(paramInt))
      AppMethodBeat.o(22080);
    while (true)
    {
      return;
      paramView = IPCallContactUI.d(this.nBH).xn(paramInt);
      if (paramView != null)
      {
        if (!IPCallContactUI.e(this.nBH))
          h.pYm.e(12767, new Object[] { Integer.valueOf(2) });
        paramAdapterView = new Intent(this.nBH.mController.ylL, IPCallUserProfileUI.class);
        paramAdapterView.putExtra("IPCallProfileUI_contactid", paramView.field_contactId);
        paramAdapterView.putExtra("IPCallProfileUI_systemUsername", paramView.field_systemAddressBookUsername);
        paramAdapterView.putExtra("IPCallProfileUI_wechatUsername", paramView.field_wechatUsername);
        this.nBH.mController.ylL.startActivity(paramAdapterView);
      }
      AppMethodBeat.o(22080);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallContactUI.6
 * JD-Core Version:    0.6.2
 */