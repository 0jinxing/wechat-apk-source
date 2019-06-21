package com.tencent.mm.plugin.mall.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.z;

final class MallIndexUI$14
  implements View.OnClickListener
{
  MallIndexUI$14(MallIndexUI paramMallIndexUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43219);
    paramView = new Intent();
    paramView.putExtra("key_from_scene", 1);
    d.b(this.onu.mController.ylL, "offline", ".ui.WalletOfflineEntranceUI", paramView);
    z.hL(9, 0);
    h.pYm.e(11850, new Object[] { Integer.valueOf(5), Integer.valueOf(0) });
    h.pYm.e(14419, new Object[] { this.onu.eCq, Integer.valueOf(1) });
    AppMethodBeat.o(43219);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexUI.14
 * JD-Core Version:    0.6.2
 */