package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletSelectBankcardUI$2
  implements AdapterView.OnItemClickListener
{
  WalletSelectBankcardUI$2(WalletSelectBankcardUI paramWalletSelectBankcardUI)
  {
  }

  public final void onItemClick(final AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(47655);
    paramAdapterView = (Bankcard)paramAdapterView.getItemAtPosition(paramInt);
    if (paramAdapterView != null)
    {
      com.tencent.mm.ui.base.h.a(this.tKF, true, this.tKF.getString(2131305338, new Object[] { paramAdapterView.field_desc, paramAdapterView.field_mobile }), this.tKF.getString(2131305340), this.tKF.getString(2131305337), this.tKF.getString(2131305339), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(47653);
          WalletSelectBankcardUI.2.this.tKF.mBundle.putBoolean("key_balance_change_phone_need_confirm_phone", false);
          WalletSelectBankcardUI.a(WalletSelectBankcardUI.2.this.tKF, paramAdapterView);
          com.tencent.mm.plugin.report.service.h.pYm.e(11977, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0) });
          AppMethodBeat.o(47653);
        }
      }
      , new WalletSelectBankcardUI.2.2(this, paramAdapterView));
      AppMethodBeat.o(47655);
    }
    while (true)
    {
      return;
      this.tKF.mBundle.putBoolean("key_balance_change_phone_need_confirm_phone", false);
      WalletSelectBankcardUI.a(this.tKF, null);
      AppMethodBeat.o(47655);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI.2
 * JD-Core Version:    0.6.2
 */