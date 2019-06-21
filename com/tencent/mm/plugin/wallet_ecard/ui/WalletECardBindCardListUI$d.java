package com.tencent.mm.plugin.wallet_ecard.ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.hb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WalletECardBindCardListUI$d
  implements WalletECardBindCardListUI.b
{
  TextView iDT;
  TextView kiF;
  CdnImageView tQE;

  public WalletECardBindCardListUI$d(WalletECardBindCardListUI paramWalletECardBindCardListUI, View paramView)
  {
    AppMethodBeat.i(48123);
    this.tQE = ((CdnImageView)paramView.findViewById(2131823357));
    this.iDT = ((TextView)paramView.findViewById(2131823358));
    this.kiF = ((TextView)paramView.findViewById(2131823359));
    AppMethodBeat.o(48123);
  }

  public final void a(View paramView, hb paramhb)
  {
    AppMethodBeat.i(48124);
    if (paramhb != null)
    {
      this.tQE.setRoundCorner(true);
      this.tQE.setUrl(paramhb.vJI);
      this.iDT.setText(String.format("%s %s(%s)", new Object[] { paramhb.nuL, paramhb.kmu, paramhb.vJG }));
      if (!bo.isNullOrNil(paramhb.vJK))
      {
        this.kiF.setText(String.format("%s，%s", new Object[] { paramhb.tuk, paramhb.vJK }));
        if (!paramhb.vJJ)
          break label205;
        ab.i("MicroMsg.WalletECardBindCardListUI", "disable card: %s", new Object[] { paramhb.nuL });
        paramView.setEnabled(false);
        this.iDT.setTextColor(this.tQC.getResources().getColor(2131689752));
        this.kiF.setTextColor(this.tQC.getResources().getColor(2131689752));
        AppMethodBeat.o(48124);
      }
    }
    while (true)
    {
      return;
      this.kiF.setText(String.format("%s", new Object[] { paramhb.tuk }));
      break;
      label205: paramView.setEnabled(true);
      this.iDT.setTextColor(this.tQC.getResources().getColor(2131689761));
      this.kiF.setTextColor(this.tQC.getResources().getColor(2131690312));
      AppMethodBeat.o(48124);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI.d
 * JD-Core Version:    0.6.2
 */