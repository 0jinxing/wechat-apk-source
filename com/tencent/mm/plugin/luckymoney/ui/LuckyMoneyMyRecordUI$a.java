package com.tencent.mm.plugin.luckymoney.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.List;

final class LuckyMoneyMyRecordUI$a extends BaseAdapter
{
  int biG;
  List<String> ofa;

  LuckyMoneyMyRecordUI$a(LuckyMoneyMyRecordUI paramLuckyMoneyMyRecordUI)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(42766);
    int i = this.ofa.size();
    AppMethodBeat.o(42766);
    return i;
  }

  public final String getItem(int paramInt)
  {
    AppMethodBeat.i(42767);
    String str = (String)this.ofa.get(paramInt);
    AppMethodBeat.o(42767);
    return str;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(42768);
    paramView = (CheckedTextView)LayoutInflater.from(this.ofb.mController.ylL).inflate(2130971115, paramViewGroup, false);
    paramView.setText(getItem(paramInt));
    if (paramInt == this.biG)
      paramView.setChecked(true);
    while (true)
    {
      AppMethodBeat.o(42768);
      return paramView;
      paramView.setChecked(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.a
 * JD-Core Version:    0.6.2
 */