package com.tencent.mm.plugin.luckymoney.ui;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyAutoScrollItem$a extends BaseAdapter
{
  private LuckyMoneyAutoScrollItem$a(LuckyMoneyAutoScrollItem paramLuckyMoneyAutoScrollItem)
  {
  }

  public final int getCount()
  {
    return 2147483646;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(42562);
    AppMethodBeat.o(42562);
    return Integer.valueOf(paramInt % 10);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(42563);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(LuckyMoneyAutoScrollItem.c(this.ocd)).inflate(2130969966, null);
      paramViewGroup = new LuckyMoneyAutoScrollItem.a.a(this);
      paramViewGroup.ocf = ((ImageView)paramView.findViewById(2131825380));
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      paramViewGroup.ocf.setImageResource(((Integer)LuckyMoneyAutoScrollItem.ocb.get(paramInt % 10)).intValue());
      AppMethodBeat.o(42563);
      return paramView;
      paramViewGroup = (LuckyMoneyAutoScrollItem.a.a)paramView.getTag();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem.a
 * JD-Core Version:    0.6.2
 */