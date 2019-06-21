package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.Promotions;
import com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaxListView;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;
import java.util.List;

public final class WalletOrderInfoOldUI$a extends BaseAdapter
{
  public WalletOrderInfoOldUI$a(WalletOrderInfoOldUI paramWalletOrderInfoOldUI)
  {
  }

  private Orders.Commodity Hw(int paramInt)
  {
    AppMethodBeat.i(47488);
    Orders.Commodity localCommodity = (Orders.Commodity)this.tIW.tId.get(paramInt);
    AppMethodBeat.o(47488);
    return localCommodity;
  }

  public final int getCount()
  {
    AppMethodBeat.i(47487);
    int i;
    if (this.tIW.tId != null)
    {
      i = this.tIW.tId.size();
      AppMethodBeat.o(47487);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(47487);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(47489);
    Orders.Commodity localCommodity;
    label398: LinearLayout localLinearLayout;
    Object localObject1;
    label436: Orders.DiscountInfo localDiscountInfo;
    TextView localTextView;
    Object localObject2;
    if (paramView == null)
    {
      paramView = View.inflate(this.tIW, 2130971139, null);
      paramViewGroup = new WalletOrderInfoOldUI.a.a(this);
      paramViewGroup.tIZ = ((TextView)paramView.findViewById(2131828937));
      paramViewGroup.gnC = ((TextView)paramView.findViewById(2131828930));
      paramViewGroup.tJc = ((TextView)paramView.findViewById(2131828923));
      paramViewGroup.tJa = ((TextView)paramView.findViewById(2131828925));
      paramViewGroup.tJb = ((TextView)paramView.findViewById(2131828926));
      paramViewGroup.tJb.getPaint().setFlags(16);
      paramViewGroup.tJd = ((TextView)paramView.findViewById(2131828940));
      paramViewGroup.tJe = ((TextView)paramView.findViewById(2131828936));
      paramViewGroup.tJf = ((TextView)paramView.findViewById(2131828938));
      paramViewGroup.tJh = ((MaxListView)paramView.findViewById(2131828942));
      paramViewGroup.tJi = paramView.findViewById(2131828927);
      paramViewGroup.tJg = paramView.findViewById(2131828941);
      paramViewGroup.tJk = ((TextView)paramView.findViewById(2131828932));
      paramViewGroup.tJj = ((TextView)paramView.findViewById(2131828931));
      paramViewGroup.tJl = ((TextView)paramView.findViewById(2131828934));
      paramViewGroup.tJm = ((TextView)paramView.findViewById(2131828933));
      paramViewGroup.tJo = ((ViewGroup)paramView.findViewById(2131828944));
      paramViewGroup.tEO = ((CdnImageView)paramView.findViewById(2131827112));
      paramViewGroup.tEP = ((TextView)paramView.findViewById(2131828946));
      paramViewGroup.tEQ = ((TextView)paramView.findViewById(2131828945));
      paramViewGroup.tJn = paramView.findViewById(2131828943);
      paramView.setTag(paramViewGroup);
      localCommodity = Hw(paramInt);
      if ((localCommodity == null) || (paramViewGroup == null))
        break label1196;
      WalletOrderInfoOldUI.a(this.tIW, localCommodity.cAa);
      paramViewGroup.tJa.setText(e.e(localCommodity.kCJ, localCommodity.pcl));
      if ((localCommodity.tAR < 0.0D) || (localCommodity.kCJ >= localCommodity.tAR))
        break label640;
      paramViewGroup.tJb.setText(e.e(localCommodity.tAR, localCommodity.pcl));
      paramViewGroup.tJb.setVisibility(0);
      localLinearLayout = (LinearLayout)paramViewGroup.tJi;
      localObject1 = localCommodity.tAU;
      localLinearLayout.removeAllViews();
      if ((localObject1 == null) || (((List)localObject1).size() <= 0))
        break label665;
      paramInt = 0;
      if (paramInt >= ((List)localObject1).size())
        break label665;
      localDiscountInfo = (Orders.DiscountInfo)((List)localObject1).get(paramInt);
      localTextView = new TextView(this.tIW.mController.ylL);
      localObject2 = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject2).bottomMargin = this.tIW.mController.ylL.getResources().getDimensionPixelOffset(2131427500);
      localTextView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localTextView.setTextAppearance(this.tIW.mController.ylL, 2131493464);
      if (localDiscountInfo.tBm <= 0.0D)
        break label652;
      localTextView.setText(localDiscountInfo.pOz + e.e(localDiscountInfo.tBm / 100.0D, this.tIW.tog.pcl));
    }
    while (true)
    {
      localLinearLayout.addView(localTextView);
      localTextView.setTextColor(this.tIW.getResources().getColor(2131690623));
      paramInt++;
      break label436;
      paramViewGroup = (WalletOrderInfoOldUI.a.a)paramView.getTag();
      break;
      label640: paramViewGroup.tJb.setVisibility(8);
      break label398;
      label652: localTextView.setText(localDiscountInfo.pOz);
    }
    label665: if (localLinearLayout.getChildCount() > 0)
    {
      localLinearLayout.setVisibility(0);
      localObject1 = paramViewGroup.tIZ;
      localObject2 = this.tIW;
      if (!r.YM())
        break label1213;
      localObject2 = ((Context)localObject2).getString(2131305063);
      label707: ((TextView)localObject1).setText((CharSequence)localObject2);
      paramViewGroup.tJc.setText(localCommodity.pca);
      paramViewGroup.gnC.setText(localCommodity.desc);
      paramViewGroup.gnC.setTag(localCommodity.desc);
      paramViewGroup.gnC.setOnLongClickListener(WalletOrderInfoOldUI.a(this.tIW));
      paramViewGroup.gnC.setBackgroundResource(2130840728);
      paramViewGroup.tJd.setText(localCommodity.cAa);
      paramViewGroup.tJd.setTag(localCommodity.cAa);
      paramViewGroup.tJd.setOnLongClickListener(WalletOrderInfoOldUI.a(this.tIW));
      paramViewGroup.tJd.setBackgroundResource(2130840728);
      paramViewGroup.tJe.setText(e.kC(localCommodity.pch));
      paramViewGroup.tJf.setText(localCommodity.pcj);
      localObject2 = localCommodity.tAV;
      if (paramViewGroup.tJl != null)
      {
        if (bo.isNullOrNil((String)localObject2))
          break label1226;
        paramViewGroup.tJl.setText((CharSequence)localObject2);
        paramViewGroup.tJl.setVisibility(0);
        paramViewGroup.tJm.setVisibility(0);
      }
      localObject2 = localCommodity.tAX;
      if (paramViewGroup.tJk != null)
      {
        if (bo.isNullOrNil((String)localObject2))
          break label1247;
        paramViewGroup.tJk.setText((CharSequence)localObject2);
        paramViewGroup.tJk.setVisibility(0);
        paramViewGroup.tJj.setVisibility(0);
      }
      label943: if (localCommodity.tBa.size() <= 0)
        break label1268;
      localObject2 = (Orders.Promotions)localCommodity.tBa.get(0);
      h.pYm.e(13033, new Object[] { Integer.valueOf(1), ((Orders.Promotions)localObject2).pcm, ((Orders.Promotions)localObject2).url, ((Orders.Promotions)localObject2).name, WalletOrderInfoOldUI.b(this.tIW) });
      this.tIW.tIQ = new WalletOrderInfoOldUI.c(this.tIW, localCommodity.tBa);
      paramViewGroup.tJh.setAdapter(this.tIW.tIQ);
      paramViewGroup.tJh.setOnItemClickListener(new WalletOrderInfoOldUI.a.1(this));
      this.tIW.tIQ.notifyDataSetChanged();
      paramViewGroup.tJh.setVisibility(0);
      paramViewGroup.tJg.setVisibility(0);
      label1104: if ((localCommodity.tAY == null) || (bo.isNullOrNil(localCommodity.tAY.tzW)))
        break label1298;
      paramViewGroup.tEO.setUrl(localCommodity.tAY.tzU);
      paramViewGroup.tEP.setText(localCommodity.tAY.tzV);
      paramViewGroup.tEQ.setText(localCommodity.tAY.ttf);
      paramViewGroup.tJo.setOnClickListener(new WalletOrderInfoOldUI.a.2(this, localCommodity));
      paramViewGroup.tJn.setVisibility(0);
    }
    while (true)
    {
      label896: label1196: AppMethodBeat.o(47489);
      return paramView;
      localLinearLayout.setVisibility(8);
      break;
      label1213: localObject2 = ((Context)localObject2).getString(2131305062);
      break label707;
      label1226: paramViewGroup.tJm.setVisibility(8);
      paramViewGroup.tJl.setVisibility(8);
      break label896;
      label1247: paramViewGroup.tJj.setVisibility(8);
      paramViewGroup.tJk.setVisibility(8);
      break label943;
      label1268: paramViewGroup.tJh.setVisibility(8);
      paramViewGroup.tJo.setVisibility(8);
      paramViewGroup.tJg.setVisibility(8);
      break label1104;
      label1298: paramViewGroup.tJo.setVisibility(8);
      paramViewGroup.tJn.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.a
 * JD-Core Version:    0.6.2
 */