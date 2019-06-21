package com.tencent.mm.plugin.offline.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class WalletOfflineCoinPurseUI$a extends BaseAdapter
{
  ArrayList<String> iPr;
  ArrayList<Boolean> paT;

  public WalletOfflineCoinPurseUI$a(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI)
  {
    AppMethodBeat.i(43556);
    this.iPr = new ArrayList();
    this.paT = new ArrayList();
    AppMethodBeat.o(43556);
  }

  public final int getCount()
  {
    AppMethodBeat.i(43557);
    int i = this.iPr.size();
    AppMethodBeat.o(43557);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(43558);
    Object localObject = this.iPr.get(paramInt);
    AppMethodBeat.o(43558);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(43560);
    paramView = (CheckedTextView)View.inflate(this.pav, 2130971115, null);
    paramView.setText((String)this.iPr.get(paramInt));
    if (WalletOfflineCoinPurseUI.bXZ() == paramInt)
    {
      paramView.setChecked(true);
      if (!isEnabled(paramInt))
        break label90;
      paramView.setTextColor(this.pav.getResources().getColor(2131690316));
      paramView.setEnabled(true);
    }
    while (true)
    {
      AppMethodBeat.o(43560);
      return paramView;
      paramView.setChecked(false);
      break;
      label90: paramView.setTextColor(this.pav.getResources().getColor(2131690164));
      paramView.setEnabled(false);
    }
  }

  public final boolean isEnabled(int paramInt)
  {
    AppMethodBeat.i(43559);
    boolean bool = ((Boolean)this.paT.get(paramInt)).booleanValue();
    AppMethodBeat.o(43559);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.a
 * JD-Core Version:    0.6.2
 */