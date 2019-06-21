package com.tencent.mm.plugin.collect.reward.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.List;

final class QrRewardSelectMoneyUI$a extends BaseAdapter
{
  private QrRewardSelectMoneyUI$a(QrRewardSelectMoneyUI paramQrRewardSelectMoneyUI)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(41138);
    int i = QrRewardSelectMoneyUI.a(this.kEU).size();
    AppMethodBeat.o(41138);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(41139);
    Object localObject = QrRewardSelectMoneyUI.a(this.kEU).get(paramInt);
    AppMethodBeat.o(41139);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(41140);
    View localView = paramView;
    if (paramView == null)
      localView = LayoutInflater.from(this.kEU.mController.ylL).inflate(2130970433, paramViewGroup, false);
    int i = ((Integer)getItem(paramInt)).intValue();
    paramView = (TextView)localView.findViewById(2131826765);
    paramInt = i / 100;
    double d = i / 100.0D;
    if (d > paramInt)
      paramView.setText(String.format("%.2f", new Object[] { Double.valueOf(d) }) + this.kEU.getString(2131302087));
    while (true)
    {
      AppMethodBeat.o(41140);
      return localView;
      paramView.setText(String.format("%d", new Object[] { Integer.valueOf(paramInt) }) + this.kEU.getString(2131302087));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI.a
 * JD-Core Version:    0.6.2
 */