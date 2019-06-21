package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.r;
import com.tencent.mm.plugin.luckymoney.model.x;

public final class d extends e
{
  private Context mContext;

  public d(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(42754);
    r localr;
    if (paramView == null)
    {
      paramView = this.mInflater.inflate(2130969986, paramViewGroup, false);
      paramViewGroup = new d.a(this);
      paramViewGroup.niS = ((TextView)paramView.findViewById(2131825550));
      paramViewGroup.nSC = ((TextView)paramView.findViewById(2131825552));
      paramViewGroup.nSD = ((TextView)paramView.findViewById(2131825553));
      paramViewGroup.nSO = ((ImageView)paramView.findViewById(2131825551));
      paramView.setTag(paramViewGroup);
      localr = yb(paramInt);
      x.a(this.mContext, paramViewGroup.niS, localr.nXL);
      paramViewGroup.nSC.setText(localr.nXN);
      paramViewGroup.nSD.setText(this.mContext.getString(2131301173, new Object[] { com.tencent.mm.wallet_core.ui.e.F(localr.nXM / 100.0D) }));
      if (localr.cRT != 1)
        break label202;
      paramViewGroup.nSO.setImageResource(2130839301);
      paramViewGroup.nSO.setVisibility(0);
    }
    while (true)
    {
      AppMethodBeat.o(42754);
      return paramView;
      paramViewGroup = (d.a)paramView.getTag();
      break;
      label202: if (localr.cRT == 2)
      {
        paramViewGroup.nSO.setImageResource(2130839290);
        paramViewGroup.nSO.setVisibility(0);
      }
      else
      {
        paramViewGroup.nSO.setVisibility(8);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.d
 * JD-Core Version:    0.6.2
 */