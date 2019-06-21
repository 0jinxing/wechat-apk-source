package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.r;

public final class f extends e
{
  private Context mContext = null;

  public f(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(42782);
    if (paramView == null)
    {
      paramView = this.mInflater.inflate(2130969988, paramViewGroup, false);
      paramViewGroup = new a();
      paramViewGroup.iDT = ((TextView)paramView.findViewById(2131825556));
      paramViewGroup.kEq = ((TextView)paramView.findViewById(2131825559));
      paramViewGroup.nSC = ((TextView)paramView.findViewById(2131825557));
      paramViewGroup.nSD = ((TextView)paramView.findViewById(2131825558));
      paramViewGroup.Lp = paramInt;
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      r localr = yb(paramInt);
      paramViewGroup.iDT.setText(localr.nXO);
      paramViewGroup.nSC.setText(localr.nXP);
      paramViewGroup.nSD.setText(this.mContext.getString(2131301079, new Object[] { com.tencent.mm.wallet_core.ui.e.F(localr.nWW / 100.0D) }));
      String str1 = this.mContext.getString(2131301194, new Object[] { Long.valueOf(localr.nWU), Long.valueOf(localr.nXQ) });
      String str2 = str1;
      if (localr.status == 5)
        str2 = this.mContext.getString(2131301195) + " " + str1;
      paramViewGroup.kEq.setText(str2);
      AppMethodBeat.o(42782);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
  }

  final class a
  {
    int Lp;
    TextView iDT;
    TextView kEq;
    TextView nSC;
    TextView nSD;

    a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.f
 * JD-Core Version:    0.6.2
 */