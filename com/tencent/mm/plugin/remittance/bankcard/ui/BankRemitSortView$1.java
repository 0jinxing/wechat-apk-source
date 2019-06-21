package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.d.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.hd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.sortview.BaseSortView;
import com.tencent.mm.ui.base.sortview.c.a;
import com.tencent.mm.ui.base.sortview.d;

final class BankRemitSortView$1
  implements c.a
{
  BankRemitSortView$1(BankRemitSortView paramBankRemitSortView)
  {
  }

  public final View a(d paramd, View paramView, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(44698);
    Object localObject = this.pOv.getContext();
    View localView = paramView;
    if (paramView == null)
    {
      localView = LayoutInflater.from((Context)localObject).inflate(2130968829, null);
      paramView = new BankRemitSortView.a(this.pOv, (byte)0);
      paramView.pOw = ((TextView)localView.findViewById(2131821694));
      paramView.pMc = ((TextView)localView.findViewById(2131821697));
      paramView.pMa = ((CdnImageView)localView.findViewById(2131821696));
      localView.setTag(paramView);
    }
    paramView = (BankRemitSortView.a)localView.getTag();
    localObject = (hd)paramd.data;
    if (localObject != null)
      if ((this.pOv.yDy) && (paramBoolean1))
        if (paramd.yDG.equals("☆"))
        {
          paramView.pOw.setText(2131297478);
          paramView.pOw.setVisibility(0);
          label162: paramView.pMa.setUseSdcardCache(true);
          paramView.pMa.hI(((hd)localObject).pLH, b.UK(((hd)localObject).pLH));
          paramView.pMc.setText(((hd)localObject).nuL);
        }
    while (true)
    {
      AppMethodBeat.o(44698);
      return localView;
      paramView.pOw.setText(paramd.yDG);
      break;
      paramView.pOw.setVisibility(8);
      break label162;
      ab.w("MicroMsg.BankcardSortView", "elem is null: %s", new Object[] { Integer.valueOf(paramInt) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSortView.1
 * JD-Core Version:    0.6.2
 */