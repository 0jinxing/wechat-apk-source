package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Date;

final class WalletBankcardManageUI$8
  implements View.OnClickListener
{
  final int tmc = 1000;

  WalletBankcardManageUI$8(WalletBankcardManageUI paramWalletBankcardManageUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45770);
    if (paramView.getId() == 2131828685)
    {
      paramView = com.tencent.mm.plugin.wallet_core.model.g.cPl();
      if (paramView.aFF())
      {
        com.tencent.mm.ui.base.h.b(this.tlZ, paramView.pbp, this.tlZ.getString(2131297061), true);
        AppMethodBeat.o(45770);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.wallet_core.ui.e.QS(19);
      this.tlZ.cNv();
      com.tencent.mm.plugin.report.service.h.pYm.e(14422, new Object[] { Integer.valueOf(2) });
      AppMethodBeat.o(45770);
      continue;
      if (paramView.getId() == 2131828691)
      {
        Object localObject = paramView.getTag();
        long l = new Date().getTime();
        paramView.setTag(Long.valueOf(l));
        if ((localObject != null) && (l - ((Long)localObject).longValue() < 1000L))
        {
          AppMethodBeat.o(45770);
        }
        else
        {
          paramView = new Intent();
          paramView.putExtra("rawUrl", WalletBankcardManageUI.a(this.tlZ).field_loan_jump_url);
          d.b(this.tlZ, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView);
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xMg, Integer.valueOf(WalletBankcardManageUI.a(this.tlZ).field_red_dot_index));
          com.tencent.mm.wallet_core.ui.e.QS(6);
          AppMethodBeat.o(45770);
        }
      }
      else
      {
        if (paramView.getId() == 2131828696)
        {
          paramView = new Intent();
          paramView.putExtra("rawUrl", "https://kf.qq.com/touch/product/weixinpay_app.html?platform=15&ADTAG=veda.weixinpay.wenti");
          d.b(this.tlZ, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView);
          com.tencent.mm.plugin.report.service.h.pYm.e(14422, new Object[] { Integer.valueOf(3) });
        }
        AppMethodBeat.o(45770);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI.8
 * JD-Core Version:    0.6.2
 */