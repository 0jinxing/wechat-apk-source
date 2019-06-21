package com.tencent.mm.plugin.wallet_core.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Promotions;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

final class WalletOrderInfoOldUI$c extends BaseAdapter
{
  protected List<Orders.Promotions> tBa;

  public WalletOrderInfoOldUI$c(List<Orders.Promotions> paramList)
  {
    AppMethodBeat.i(47493);
    this.tBa = null;
    this.tBa = new ArrayList();
    Object localObject;
    int i = localObject.size();
    for (int j = 0; j < i; j++)
    {
      paramList = (Orders.Promotions)localObject.get(j);
      if ((paramList != null) && ((!bo.isNullOrNil(paramList.pcm)) || (paramList.tBo == 2) || (paramList.tBo == 1)))
        this.tBa.add(localObject.get(j));
    }
    AppMethodBeat.o(47493);
  }

  public final Orders.Promotions Hx(int paramInt)
  {
    AppMethodBeat.i(47495);
    Orders.Promotions localPromotions = (Orders.Promotions)this.tBa.get(paramInt);
    AppMethodBeat.o(47495);
    return localPromotions;
  }

  public final int getCount()
  {
    AppMethodBeat.i(47494);
    int i;
    if (this.tBa != null)
    {
      i = this.tBa.size();
      AppMethodBeat.o(47494);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(47494);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(47496);
    Orders.Promotions localPromotions = Hx(paramInt);
    Object localObject;
    if ((bo.isNullOrNil(localPromotions.pcm)) && (localPromotions.ttW > 0L))
    {
      localObject = this.tIW.lJ(localPromotions.ttW);
      h localh = h.pYm;
      String str = WalletOrderInfoOldUI.b(this.tIW);
      paramInt = localPromotions.tBo;
      paramViewGroup = (ViewGroup)localObject;
      if ("-1".equals(localObject))
        paramViewGroup = Integer.valueOf(5);
      localh.e(13471, new Object[] { str, Integer.valueOf(1), Integer.valueOf(paramInt), paramViewGroup, Long.valueOf(localPromotions.ttW), Long.valueOf(localPromotions.tzR) });
    }
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramViewGroup.type = localPromotions.type;
      if (localPromotions.type == Orders.tAQ)
        if (localPromotions.tBn == 1)
        {
          paramView = View.inflate(this.tIW, 2130971140, null);
          paramViewGroup.kqn = ((CdnImageView)paramView.findViewById(2131828947));
          paramViewGroup.gne = ((TextView)paramView.findViewById(2131828949));
          paramViewGroup.tJp = ((TextView)paramView.findViewById(2131828951));
          paramViewGroup.gtb = ((TextView)paramView.findViewById(2131828950));
          if (!TextUtils.isEmpty(localPromotions.url))
            this.tIW.tIP.put(localPromotions.url, paramViewGroup.tJp);
          paramView.setTag(paramViewGroup);
          paramViewGroup.tBn = localPromotions.tBn;
        }
    }
    label293: label1592: 
    while (true)
    {
      if (localPromotions != null)
      {
        localObject = (WalletOrderInfoOldUI.b)WalletOrderInfoOldUI.c(this.tIW).get(localPromotions.ttW);
        ab.i("MicroMsg.WalletOrderInfoOldUI", "try get result ".concat(String.valueOf(localObject)));
        if (localObject == null)
          break label1312;
        paramViewGroup.kqn.setUrl(((WalletOrderInfoOldUI.b)localObject).cIY);
        paramViewGroup.gtb.setText(((WalletOrderInfoOldUI.b)localObject).cEh);
        paramViewGroup.tJp.setText(((WalletOrderInfoOldUI.b)localObject).tID);
        if (bo.isNullOrNil(localPromotions.pcm))
          break label1362;
        paramViewGroup.tJp.setVisibility(8);
        if (paramViewGroup.tJq != null)
        {
          paramViewGroup.tJq.setVisibility(0);
          if (!this.tIW.tIc.contains(localPromotions.pcm))
            break label1351;
          paramViewGroup.tJq.setChecked(true);
        }
        label450: if ((paramViewGroup.gne == null) || (localObject == null) || (bo.isNullOrNil(((WalletOrderInfoOldUI.b)localObject).title)))
          break label1389;
        paramViewGroup.gne.setText(((WalletOrderInfoOldUI.b)localObject).title);
        label485: if ((!bo.isNullOrNil(this.tIW.tEI)) && (paramViewGroup.tJp != null))
        {
          paramViewGroup.tJp.setClickable(this.tIW.ctK);
          paramViewGroup.tJp.setEnabled(this.tIW.ctK);
          paramViewGroup.tJp.setOnClickListener(null);
          if (this.tIW.ctL)
            paramViewGroup.tJp.setVisibility(8);
        }
        long l = localPromotions.ttW;
        localObject = this.tIW.lJ(l);
        if (!((String)localObject).equals("0"))
          break label1441;
        paramViewGroup.tJp.setBackgroundColor(this.tIW.getResources().getColor(2131690597));
        paramViewGroup.tJp.setTextColor(this.tIW.getResources().getColor(2131690683));
      }
      while (true)
      {
        if (paramViewGroup.tJp != null)
        {
          paramInt = BackwardSupportUtil.b.b(this.tIW.mController.ylL, 15.0F);
          i = BackwardSupportUtil.b.b(this.tIW.mController.ylL, 5.0F);
          paramViewGroup.tJp.setPadding(paramInt, i, paramInt, i);
        }
        AppMethodBeat.o(47496);
        return paramView;
        paramView = View.inflate(this.tIW, 2130971141, null);
        paramViewGroup.kqn = ((CdnImageView)paramView.findViewById(2131828947));
        paramViewGroup.tJp = ((TextView)paramView.findViewById(2131828951));
        paramViewGroup.gtb = ((TextView)paramView.findViewById(2131828950));
        paramViewGroup.gne = ((TextView)paramView.findViewById(2131828949));
        if (!TextUtils.isEmpty(localPromotions.url))
          this.tIW.tIP.put(localPromotions.url, paramViewGroup.tJp);
        paramView.setTag(paramViewGroup);
        break;
        paramView = View.inflate(this.tIW, 2130971142, null);
        paramViewGroup.kqn = ((CdnImageView)paramView.findViewById(2131828947));
        paramViewGroup.tJp = ((TextView)paramView.findViewById(2131828951));
        paramViewGroup.gtb = ((TextView)paramView.findViewById(2131828950));
        paramViewGroup.tJq = ((CheckBox)paramView.findViewById(2131828739));
        if (!TextUtils.isEmpty(localPromotions.url))
          this.tIW.tIP.put(localPromotions.url, paramViewGroup.tJp);
        paramView.setTag(paramViewGroup);
        break label293;
        paramViewGroup = (a)paramView.getTag();
        int i = 0;
        paramInt = i;
        if (localPromotions.type == paramViewGroup.type)
          if (localPromotions.type == Orders.tAQ)
          {
            paramInt = i;
            if (localPromotions.tBn != paramViewGroup.tBn);
          }
          else
          {
            paramInt = 1;
          }
        if (paramInt != 0)
          break label1592;
        paramViewGroup = new a();
        paramViewGroup.type = localPromotions.type;
        if (localPromotions.type == Orders.tAQ)
        {
          if (localPromotions.tBn == 1)
          {
            paramView = View.inflate(this.tIW, 2130971140, null);
            paramViewGroup.kqn = ((CdnImageView)paramView.findViewById(2131828947));
            paramViewGroup.gne = ((TextView)paramView.findViewById(2131828949));
            paramViewGroup.tJp = ((TextView)paramView.findViewById(2131828951));
            paramViewGroup.gtb = ((TextView)paramView.findViewById(2131828950));
            if (!TextUtils.isEmpty(localPromotions.url))
              this.tIW.tIP.put(localPromotions.url, paramViewGroup.tJp);
            paramView.setTag(paramViewGroup);
          }
          while (true)
          {
            paramViewGroup.tBn = localPromotions.tBn;
            break;
            paramView = View.inflate(this.tIW, 2130971141, null);
            paramViewGroup.kqn = ((CdnImageView)paramView.findViewById(2131828947));
            paramViewGroup.tJp = ((TextView)paramView.findViewById(2131828951));
            paramViewGroup.gtb = ((TextView)paramView.findViewById(2131828950));
            paramViewGroup.gne = ((TextView)paramView.findViewById(2131828949));
            if (!TextUtils.isEmpty(localPromotions.url))
              this.tIW.tIP.put(localPromotions.url, paramViewGroup.tJp);
            paramView.setTag(paramViewGroup);
          }
        }
        paramView = View.inflate(this.tIW, 2130971142, null);
        paramViewGroup.kqn = ((CdnImageView)paramView.findViewById(2131828947));
        paramViewGroup.tJp = ((TextView)paramView.findViewById(2131828951));
        paramViewGroup.gtb = ((TextView)paramView.findViewById(2131828950));
        paramViewGroup.tJq = ((CheckBox)paramView.findViewById(2131828739));
        if (!TextUtils.isEmpty(localPromotions.url))
          this.tIW.tIP.put(localPromotions.url, paramViewGroup.tJp);
        paramView.setTag(paramViewGroup);
        break label293;
        paramViewGroup.kqn.setUrl(localPromotions.pia);
        paramViewGroup.gtb.setText(localPromotions.name);
        paramViewGroup.tJp.setText(localPromotions.tzS);
        break label387;
        label1351: paramViewGroup.tJq.setChecked(false);
        break label450;
        label1362: paramViewGroup.tJp.setVisibility(0);
        if (paramViewGroup.tJq == null)
          break label450;
        paramViewGroup.tJq.setVisibility(8);
        break label450;
        label1389: if ((paramViewGroup.gne != null) && (!bo.isNullOrNil(localPromotions.title)))
        {
          paramViewGroup.gne.setText(localPromotions.title);
          break label485;
        }
        if (paramViewGroup.gne == null)
          break label485;
        paramViewGroup.gne.setVisibility(8);
        break label485;
        if ((((String)localObject).equals("-1")) || (((String)localObject).equals("3")))
        {
          paramViewGroup.tJp.setBackgroundDrawable(this.tIW.getResources().getDrawable(2130838009));
          paramViewGroup.tJp.setTextColor(this.tIW.getResources().getColor(2131690683));
        }
        else if ((((String)localObject).equals("4")) || (((String)localObject).equals("2")) || (((String)localObject).equals("1")))
        {
          paramViewGroup.tJp.setBackgroundColor(this.tIW.getResources().getColor(2131690597));
          paramViewGroup.tJp.setTextColor(this.tIW.getResources().getColor(2131690164));
        }
        else
        {
          ab.e("MicroMsg.WalletOrderInfoOldUI", "PromotionsAdapter unknow award state");
        }
      }
    }
  }

  final class a
  {
    TextView gne;
    TextView gtb;
    CdnImageView kqn;
    int tBn;
    TextView tJp;
    CheckBox tJq;
    int type;

    a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.c
 * JD-Core Version:    0.6.2
 */