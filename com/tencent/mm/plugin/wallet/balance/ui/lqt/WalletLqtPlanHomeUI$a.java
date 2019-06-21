package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bdg;
import com.tencent.mm.protocal.protobuf.bkm;
import com.tencent.mm.protocal.protobuf.cij;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.e;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

final class WalletLqtPlanHomeUI$a extends BaseAdapter
{
  private WalletLqtPlanHomeUI$a(WalletLqtPlanHomeUI paramWalletLqtPlanHomeUI)
  {
  }

  private bkm Hc(int paramInt)
  {
    AppMethodBeat.i(45616);
    bkm localbkm = (bkm)WalletLqtPlanHomeUI.c(this.tjK).get(paramInt);
    AppMethodBeat.o(45616);
    return localbkm;
  }

  public final int getCount()
  {
    AppMethodBeat.i(45615);
    int i = WalletLqtPlanHomeUI.c(this.tjK).size();
    AppMethodBeat.o(45615);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(45617);
    View localView = paramView;
    if (paramView == null)
    {
      localView = LayoutInflater.from(this.tjK.mController.ylL).inflate(2130969959, paramViewGroup, false);
      localView.setTag(new WalletLqtPlanHomeUI.b(this.tjK, localView));
    }
    bkm localbkm = Hc(paramInt);
    paramView = (WalletLqtPlanHomeUI.b)localView.getTag();
    paramView.tjR.setPrefix(ae.dOd());
    paramViewGroup = e.a(localbkm.cSh, "100", 2, RoundingMode.HALF_UP);
    if (paramViewGroup.intValue() == paramViewGroup.doubleValue())
    {
      paramView.tjR.setText(paramViewGroup.intValue());
      paramView.tjT.setText(paramView.tjK.getString(2131304983, new Object[] { localbkm.ehf, localbkm.nuL, localbkm.pck }));
      if ((localbkm.wNE == null) || (bo.isNullOrNil(localbkm.wNE.xhq)))
        break label420;
      paramView.tjU.setText(localbkm.wNE.xhq);
      if (bo.isNullOrNil(localbkm.wNE.color))
        break label397;
      paramView.tjU.setTextColor(Color.parseColor(localbkm.wNE.color));
      label269: paramView.tjU.setVisibility(0);
      label277: if (localbkm.wNF != null)
      {
        paramView.tjV.setText(localbkm.wNF.title);
        paramView.tjX.setOnClickListener(new WalletLqtPlanHomeUI.b.1(paramView, localbkm));
      }
      if (localbkm.state == 1)
        break label432;
      paramView.tjW.setVisibility(0);
      paramView.tjT.setTextColor(Color.parseColor("#d1d1d1"));
      paramView.tjR.setTextColor(Color.parseColor("#d1d1d1"));
    }
    while (true)
    {
      paramView.tjS.setOnClickListener(new WalletLqtPlanHomeUI.b.2(paramView, localbkm));
      AppMethodBeat.o(45617);
      return localView;
      paramView.tjR.setText(paramViewGroup.toString());
      break;
      label397: paramView.tjU.setTextColor(paramView.tjK.getResources().getColor(2131690312));
      break label269;
      label420: paramView.tjU.setVisibility(8);
      break label277;
      label432: paramView.tjW.setVisibility(8);
      paramView.tjT.setTextColor(paramView.tjK.getResources().getColor(2131689761));
      paramView.tjR.setTextColor(paramView.tjK.getResources().getColor(2131689761));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI.a
 * JD-Core Version:    0.6.2
 */