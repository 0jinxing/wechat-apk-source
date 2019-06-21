package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.d.b;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import java.util.HashMap;

final class au$6
  implements View.OnClickListener
{
  au$6(au paramau)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39408);
    if (!(paramView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
      AppMethodBeat.o(39408);
    while (true)
    {
      return;
      paramView = (BaseTimeLineItem.BaseViewHolder)paramView.getTag();
      if (paramView == null)
      {
        AppMethodBeat.o(39408);
      }
      else if ((this.ryd.rhW.containsKey(paramView.cwT)) && (((Integer)this.ryd.rhW.get(paramView.cwT)).equals(Integer.valueOf(1))))
      {
        this.ryd.rhW.put(paramView.cwT, Integer.valueOf(2));
        this.ryd.rxO.notifyDataSetChanged();
        AppMethodBeat.o(39408);
      }
      else
      {
        this.ryd.rhW.put(paramView.cwT, Integer.valueOf(1));
        if (paramView.mRR.getTop() < 0)
        {
          this.ryd.qOL.b(paramView.mRR, paramView.position, paramView.mRR.getTop(), paramView.rHz.getSpreadHeight());
          AppMethodBeat.o(39408);
        }
        else
        {
          this.ryd.rxO.notifyDataSetChanged();
          AppMethodBeat.o(39408);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.au.6
 * JD-Core Version:    0.6.2
 */