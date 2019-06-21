package com.tencent.mm.plugin.wallet_core.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import java.util.List;

final class WalletSelectBankcardUI$a extends BaseAdapter
{
  private WalletSelectBankcardUI$a(WalletSelectBankcardUI paramWalletSelectBankcardUI)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(47656);
    int i;
    if (WalletSelectBankcardUI.a(this.tKF))
      if (WalletSelectBankcardUI.b(this.tKF) == null)
      {
        i = 1;
        AppMethodBeat.o(47656);
      }
    while (true)
    {
      return i;
      i = WalletSelectBankcardUI.b(this.tKF).size() + 1;
      AppMethodBeat.o(47656);
      continue;
      if (WalletSelectBankcardUI.b(this.tKF) == null)
      {
        i = 0;
        AppMethodBeat.o(47656);
      }
      else
      {
        i = WalletSelectBankcardUI.b(this.tKF).size();
        AppMethodBeat.o(47656);
      }
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(47657);
    Object localObject;
    if ((WalletSelectBankcardUI.b(this.tKF) == null) || (WalletSelectBankcardUI.b(this.tKF).size() <= paramInt))
    {
      localObject = null;
      AppMethodBeat.o(47657);
    }
    while (true)
    {
      return localObject;
      localObject = WalletSelectBankcardUI.b(this.tKF).get(paramInt);
      AppMethodBeat.o(47657);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(47658);
    Bankcard localBankcard = (Bankcard)getItem(paramInt);
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.tKF).inflate(2130971166, paramViewGroup, false);
      paramViewGroup = new WalletSelectBankcardUI.a.a(this);
      paramViewGroup.tKI = ((TextView)paramView.findViewById(2131829055));
      paramView.setTag(paramViewGroup);
      if (localBankcard == null)
        break label96;
      paramViewGroup.tKI.setText(localBankcard.field_desc);
    }
    while (true)
    {
      AppMethodBeat.o(47658);
      return paramView;
      paramViewGroup = (WalletSelectBankcardUI.a.a)paramView.getTag();
      break;
      label96: paramViewGroup.tKI.setText(2131305342);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI.a
 * JD-Core Version:    0.6.2
 */