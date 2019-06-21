package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.sortview.BaseSortView;
import com.tencent.mm.ui.base.sortview.c.a;
import com.tencent.mm.ui.base.sortview.d;

final class BankCardSelectSortView$1
  implements c.a
{
  BankCardSelectSortView$1(BankCardSelectSortView paramBankCardSelectSortView)
  {
  }

  public final View a(d paramd, View paramView, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(47866);
    Context localContext = this.tNh.getContext();
    View localView = paramView;
    if (paramView == null)
    {
      localView = LayoutInflater.from(localContext).inflate(2130968829, null);
      paramView = new BankCardSelectSortView.b((byte)0);
      paramView.pOw = ((TextView)localView.findViewById(2131821694));
      paramView.pMc = ((TextView)localView.findViewById(2131821697));
      paramView.pMa = ((CdnImageView)localView.findViewById(2131821696));
      localView.setTag(paramView);
    }
    paramView = (BankCardSelectSortView.b)localView.getTag();
    if ((this.tNh.yDy) && (paramBoolean1))
    {
      paramView.pOw.setText(paramd.yDG);
      paramView.pOw.setVisibility(0);
      paramd = (BankCardSelectSortView.a)paramd.data;
      paramView.pMc.setText(paramd.pcj);
      if (bo.isNullOrNil(paramd.cIY))
        break label206;
      paramView.pMa.setUseSdcardCache(true);
      paramView.pMa.hI(paramd.cIY, paramd.tNi);
    }
    while (true)
    {
      AppMethodBeat.o(47866);
      return localView;
      paramView.pOw.setVisibility(8);
      break;
      label206: paramView.pMa.setImageBitmap(null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView.1
 * JD-Core Version:    0.6.2
 */