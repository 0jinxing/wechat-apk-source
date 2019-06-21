package com.tencent.mm.plugin.wallet.balance.ui;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

@SuppressLint({"ViewHolder"})
final class WalletSelectBankcardModeUI$b extends BaseAdapter
{
  WalletSelectBankcardModeUI$b(WalletSelectBankcardModeUI paramWalletSelectBankcardModeUI)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(45491);
    int i = WalletSelectBankcardModeUI.b(this.thS).size();
    AppMethodBeat.o(45491);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(45492);
    View localView = View.inflate(this.thS, 2130971165, null);
    paramViewGroup = (WalletSelectBankcardModeUI.a)WalletSelectBankcardModeUI.b(this.thS).get(paramInt);
    paramView = (TextView)localView.findViewById(2131829052);
    TextView localTextView = (TextView)localView.findViewById(2131829053);
    ImageView localImageView = (ImageView)localView.findViewById(2131829054);
    paramView.setText(paramViewGroup.title);
    if (!TextUtils.isEmpty(paramViewGroup.kfM))
    {
      localTextView.setVisibility(0);
      localTextView.setText(paramViewGroup.kfM);
      if (WalletSelectBankcardModeUI.c(this.thS) != paramInt)
        break label136;
      localImageView.setImageResource(2131231853);
    }
    while (true)
    {
      AppMethodBeat.o(45492);
      return localView;
      localTextView.setVisibility(8);
      break;
      label136: localImageView.setImageResource(2131231852);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI.b
 * JD-Core Version:    0.6.2
 */