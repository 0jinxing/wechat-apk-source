package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;

final class RemittanceBusiUI$a
{
  private View jAp;
  private float pUl;
  private float pUm;
  private float pUn;
  private TenpaySecureEditText pUo;
  private TextView pUp;
  private View pUq;

  RemittanceBusiUI$a(RemittanceBusiUI paramRemittanceBusiUI, int paramInt1, int paramInt2, float paramFloat)
  {
    AppMethodBeat.i(44930);
    this.pUl = paramInt1;
    this.pUm = paramInt2;
    this.pUn = paramFloat;
    AppMethodBeat.o(44930);
  }

  final void update()
  {
    AppMethodBeat.i(44931);
    RemittanceBusiUI.b(this.pUd).setTextSize(1, RemittanceBusiUI.a(this.pUd).pUm);
    RemittanceBusiUI.c(this.pUd).setTextSize(1, RemittanceBusiUI.a(this.pUd).pUl);
    if (this.pUp == null)
      this.pUp = ((TextView)RemittanceBusiUI.d(this.pUd).findViewById(2131820694));
    if (this.pUp != null)
      this.pUp.setTextSize(this.pUl);
    if (this.pUo == null)
      this.pUo = ((TenpaySecureEditText)RemittanceBusiUI.d(this.pUd).findViewById(2131820687));
    if (this.pUo != null)
      this.pUo.setTextSize(this.pUm);
    if (this.jAp == null)
      this.jAp = this.pUo.findViewById(2131829044);
    if (this.jAp != null)
      this.jAp.setMinimumHeight(BackwardSupportUtil.b.b(this.pUd, RemittanceBusiUI.a(this.pUd).pUm));
    if (this.pUq == null)
      this.pUq = this.pUd.findViewById(2131827003);
    if (this.pUq != null)
      ((LinearLayout.LayoutParams)this.pUq.getLayoutParams()).topMargin = BackwardSupportUtil.b.b(this.pUd, this.pUn);
    AppMethodBeat.o(44931);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.a
 * JD-Core Version:    0.6.2
 */