package com.tencent.mm.plugin.wallet_ecard.ui;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.v4.a.a.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class WalletECardBindCardListUI$a
{
  TextView iUx;

  public WalletECardBindCardListUI$a(WalletECardBindCardListUI paramWalletECardBindCardListUI, View paramView)
  {
    AppMethodBeat.i(48117);
    this.iUx = ((TextView)paramView.findViewById(2131823361));
    paramWalletECardBindCardListUI = (ImageView)paramView.findViewById(2131823360);
    paramView = a.f(paramWalletECardBindCardListUI.getDrawable());
    a.a(paramView, ColorStateList.valueOf(ah.getResources().getColor(2131690208)));
    paramWalletECardBindCardListUI.setImageDrawable(paramView);
    AppMethodBeat.o(48117);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI.a
 * JD-Core Version:    0.6.2
 */