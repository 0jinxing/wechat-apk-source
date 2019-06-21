package com.tencent.mm.plugin.honey_pay.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.protocal.protobuf.bir;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.util.List;

final class HoneyPayCardManagerUI$a extends BaseAdapter
{
  private HoneyPayCardManagerUI$a(HoneyPayCardManagerUI paramHoneyPayCardManagerUI)
  {
  }

  private bir wT(int paramInt)
  {
    AppMethodBeat.i(41807);
    bir localbir = (bir)HoneyPayCardManagerUI.j(this.nrS).get(paramInt);
    AppMethodBeat.o(41807);
    return localbir;
  }

  public final int getCount()
  {
    AppMethodBeat.i(41806);
    int i = HoneyPayCardManagerUI.j(this.nrS).size();
    AppMethodBeat.o(41806);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(41809);
    View localView = paramView;
    if (paramView == null)
    {
      localView = LayoutInflater.from(this.nrS.mController.ylL).inflate(2130969827, paramViewGroup, false);
      paramView = new HoneyPayCardManagerUI.b(this.nrS, (byte)0);
      paramView.kvI = ((TextView)localView.findViewById(2131824894));
      paramView.nrY = ((WalletTextView)localView.findViewById(2131824895));
      paramView.nrY.setPrefix(ae.dOd());
      localView.setTag(paramView);
    }
    paramViewGroup = wT(paramInt);
    paramView = (HoneyPayCardManagerUI.b)localView.getTag();
    paramView.kvI.setText(paramViewGroup.qkq);
    paramView.nrY.setText(c.iR(paramViewGroup.wMc));
    AppMethodBeat.o(41809);
    return localView;
  }

  public final boolean isEnabled(int paramInt)
  {
    AppMethodBeat.i(41808);
    boolean bool;
    if (!bo.isNullOrNil(wT(paramInt).url))
    {
      bool = true;
      AppMethodBeat.o(41808);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(41808);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI.a
 * JD-Core Version:    0.6.2
 */