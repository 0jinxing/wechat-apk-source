package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.ipcall.a.e.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;

final class IPCallUserProfileUI$9
  implements View.OnClickListener
{
  IPCallUserProfileUI$9(IPCallUserProfileUI paramIPCallUserProfileUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22381);
    IPCallUserProfileUI.d(this.nGq).start();
    IPCallUserProfileUI.d(this.nGq).nyP = 1L;
    IPCallUserProfileUI.d(this.nGq).nyQ = 5L;
    IPCallUserProfileUI.d(this.nGq).finish();
    h.pYm.e(12766, new Object[] { Integer.valueOf(3) });
    if (!bo.isNullOrNil(IPCallUserProfileUI.e(this.nGq)))
    {
      paramView = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + IPCallUserProfileUI.Pl(IPCallUserProfileUI.e(this.nGq))));
      paramView.putExtra("sms_body", this.nGq.getString(2131300735, new Object[] { r.Zd().Oi() }));
      this.nGq.startActivity(paramView);
      AppMethodBeat.o(22381);
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(IPCallUserProfileUI.f(this.nGq)))
      {
        paramView = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + IPCallUserProfileUI.f(this.nGq)));
        paramView.putExtra("sms_body", this.nGq.getString(2131300735, new Object[] { r.Zd().Oi() }));
        this.nGq.startActivity(paramView);
      }
      AppMethodBeat.o(22381);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI.9
 * JD-Core Version:    0.6.2
 */