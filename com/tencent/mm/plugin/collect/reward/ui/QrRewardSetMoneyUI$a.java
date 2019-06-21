package com.tencent.mm.plugin.collect.reward.ui;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class QrRewardSetMoneyUI$a extends BaseAdapter
{
  private QrRewardSetMoneyUI$a(QrRewardSetMoneyUI paramQrRewardSetMoneyUI)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(41155);
    int i = QrRewardSetMoneyUI.e(this.kFj).size();
    AppMethodBeat.o(41155);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(41156);
    Object localObject = QrRewardSetMoneyUI.e(this.kFj).get(paramInt);
    AppMethodBeat.o(41156);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(41157);
    if (paramView == null)
      paramView = (View)QrRewardSetMoneyUI.f(this.kFj).get(paramInt);
    while (true)
    {
      AppMethodBeat.o(41157);
      return paramView;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI.a
 * JD-Core Version:    0.6.2
 */