package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a extends BaseAdapter
{
  private final Context mContext;
  private int mCount;
  private ArrayList<Bankcard> tll;
  private int tlm;
  com.tencent.mm.plugin.wallet_core.utils.a tln;
  List<String> tlo;

  public a(Context paramContext, ArrayList<Bankcard> paramArrayList)
  {
    AppMethodBeat.i(45732);
    this.mCount = 0;
    this.mContext = paramContext;
    this.tll = paramArrayList;
    this.tlm = 0;
    this.tln = new com.tencent.mm.plugin.wallet_core.utils.a();
    this.tln.b(this.mContext, this.tll);
    cNr();
    AppMethodBeat.o(45732);
  }

  private Bankcard Hd(int paramInt)
  {
    AppMethodBeat.i(45735);
    Bankcard localBankcard;
    if ((paramInt >= 0) && (paramInt < this.mCount))
    {
      localBankcard = (Bankcard)this.tll.get(paramInt);
      AppMethodBeat.o(45735);
    }
    while (true)
    {
      return localBankcard;
      localBankcard = null;
      AppMethodBeat.o(45735);
    }
  }

  private void cNr()
  {
    AppMethodBeat.i(45734);
    g.RQ();
    this.tlo = bo.P(((String)g.RP().Ry().get(ac.a.xSN, "")).split(","));
    AppMethodBeat.o(45734);
  }

  public final void W(ArrayList<Bankcard> paramArrayList)
  {
    AppMethodBeat.i(45733);
    this.tll = paramArrayList;
    if (paramArrayList != null);
    for (this.mCount = paramArrayList.size(); ; this.mCount = 0)
    {
      if (this.mCount > 0)
        this.tln.b(this.mContext, this.tll);
      cNr();
      AppMethodBeat.o(45733);
      return;
    }
  }

  public int getCount()
  {
    return this.mCount;
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(45736);
    Bankcard localBankcard = Hd(paramInt);
    if (localBankcard == null)
    {
      paramInt = 4;
      AppMethodBeat.o(45736);
    }
    while (true)
    {
      return paramInt;
      if (localBankcard.field_bankcardState == 9)
      {
        if (localBankcard.field_wxcreditState == 0)
        {
          paramInt = 2;
          AppMethodBeat.o(45736);
        }
        else
        {
          paramInt = 3;
          AppMethodBeat.o(45736);
        }
      }
      else if ((localBankcard.cPb()) && ("CITIC_CREDIT".equals(localBankcard.field_bankcardType)))
      {
        paramInt = 5;
        AppMethodBeat.o(45736);
      }
      else if (localBankcard.cPg())
      {
        paramInt = 6;
        AppMethodBeat.o(45736);
      }
      else if ((localBankcard.cPf()) && (!r.YM()))
      {
        paramInt = 0;
        AppMethodBeat.o(45736);
      }
      else
      {
        paramInt = 1;
        AppMethodBeat.o(45736);
      }
    }
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(45737);
    Object localObject = Hd(paramInt);
    if (localObject == null)
      AppMethodBeat.o(45737);
    while (true)
    {
      label22: return paramView;
      int i = getItemViewType(paramInt);
      boolean bool;
      if ((this.tlo == null) || (this.tlo.isEmpty()) || (localObject == null))
        bool = false;
      while (true)
      {
        ab.v("MicroMsg.BankcardListAdapter", "getView, pos: %d, bottom_wording: %s, showNew: %s", new Object[] { Integer.valueOf(paramInt), ((Bankcard)localObject).field_card_bottom_wording, Boolean.valueOf(bool) });
        switch (i)
        {
        default:
          AppMethodBeat.o(45737);
          break label22;
          paramViewGroup = this.tlo.iterator();
          while (true)
            if (paramViewGroup.hasNext())
              if (((String)paramViewGroup.next()).equals(((Bankcard)localObject).field_bindSerial))
              {
                bool = true;
                break;
              }
          bool = false;
        case 0:
        case 1:
        case 3:
        case 2:
        case 5:
        case 4:
        case 6:
        }
      }
      paramView = com.tencent.mm.plugin.wallet_core.ui.view.b.a(this.mContext, paramView, (Bankcard)localObject, 2130971057, this.tln, bool, i);
      AppMethodBeat.o(45737);
      continue;
      paramView = com.tencent.mm.plugin.wallet_core.ui.view.b.a(this.mContext, paramView, (Bankcard)localObject, 2130971064, this.tln, bool, i);
      AppMethodBeat.o(45737);
      continue;
      if ((paramView == null) || (paramView.getTag() == null))
      {
        paramView = View.inflate(this.mContext, 2130971071, null);
        paramViewGroup = new a.a(this);
        paramViewGroup.tlu = ((ImageView)paramView.findViewById(2131828647));
        paramViewGroup.tlq = ((TextView)paramView.findViewById(2131828648));
        paramViewGroup.tlv = ((TextView)paramView.findViewById(2131828655));
        paramViewGroup.tly = ((ImageView)paramView.findViewById(2131828650));
        paramViewGroup.tlz = ((ImageView)paramView.findViewById(2131828651));
        paramViewGroup.tlA = ((ImageView)paramView.findViewById(2131828652));
        paramView.setTag(paramViewGroup);
        label370: switch (((Bankcard)localObject).field_wxcreditState)
        {
        case 2:
        default:
          paramViewGroup.tlv.setVisibility(8);
        case 1:
        case 3:
        }
      }
      while (true)
      {
        paramViewGroup.tlq.setText(((Bankcard)localObject).field_bankName);
        this.tln.a(this.mContext, (Bankcard)localObject, paramViewGroup.tlu);
        AppMethodBeat.o(45737);
        break;
        paramViewGroup = (a.a)paramView.getTag();
        break label370;
        paramViewGroup.tlv.setBackgroundResource(2130840675);
        paramViewGroup.tlv.setVisibility(0);
        continue;
        paramViewGroup.tlv.setBackgroundResource(2130840665);
        paramViewGroup.tlv.setVisibility(0);
      }
      if ((paramView == null) || (paramView.getTag() == null))
      {
        paramView = View.inflate(this.mContext, 2130971068, null);
        paramViewGroup = new a.a(this);
        paramViewGroup.tlu = ((ImageView)paramView.findViewById(2131828647));
        paramViewGroup.tlq = ((TextView)paramView.findViewById(2131828648));
        paramViewGroup.tlx = ((TextView)paramView.findViewById(2131828698));
        paramViewGroup.tly = ((ImageView)paramView.findViewById(2131828650));
        paramViewGroup.tlz = ((ImageView)paramView.findViewById(2131828651));
        paramViewGroup.tlA = ((ImageView)paramView.findViewById(2131828652));
        paramView.setTag(paramViewGroup);
        label618: paramViewGroup.tlq.setText(this.mContext.getString(2131304848, new Object[] { ((Bankcard)localObject).field_bankName }));
        if (!b.b((Bankcard)localObject))
          break label682;
        paramViewGroup.tlx.setVisibility(0);
      }
      while (true)
      {
        AppMethodBeat.o(45737);
        break;
        paramViewGroup = (a.a)paramView.getTag();
        break label618;
        label682: paramViewGroup.tlx.setVisibility(8);
      }
      paramView = com.tencent.mm.plugin.wallet_core.ui.view.b.a(this.mContext, paramView, (Bankcard)localObject, 2130971069, this.tln, bool, i);
      AppMethodBeat.o(45737);
      continue;
      paramView = View.inflate(this.mContext, 2130971058, null);
      AppMethodBeat.o(45737);
    }
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = View.inflate(this.mContext, 2130971062, null);
      paramViewGroup = new a.a(this);
      paramViewGroup.tlu = ((ImageView)paramView.findViewById(2131828647));
      paramViewGroup.tlq = ((TextView)paramView.findViewById(2131828648));
      paramViewGroup.tlr = ((TextView)paramView.findViewById(2131828649));
      paramViewGroup.tlv = ((TextView)paramView.findViewById(2131828655));
      paramViewGroup.tlB = ((WalletTextView)paramView.findViewById(2131828679));
      paramViewGroup.tlt = ((ImageView)paramView.findViewById(2131828646));
      paramViewGroup.tlC = ((TextView)paramView.findViewById(2131828680));
      paramView.setTag(paramViewGroup);
      label876: paramViewGroup.tlu.setImageDrawable(com.tencent.mm.svg.a.a.f(this.mContext.getResources(), 2131231368));
      if (((paramViewGroup.tlu instanceof CdnImageView)) && (!bo.isNullOrNil(((Bankcard)localObject).txk)))
      {
        ((CdnImageView)paramViewGroup.tlu).setUseSdcardCache(true);
        ((CdnImageView)paramViewGroup.tlu).setImgSavedPath(com.tencent.mm.plugin.wallet_core.d.b.cRb());
        ((CdnImageView)paramViewGroup.tlu).eb(((Bankcard)localObject).txk, 2131231368);
      }
      String str = com.tencent.mm.wallet_core.ui.e.eK(com.tencent.mm.wallet_core.ui.e.mJ(((Bankcard)localObject).txg), 10);
      paramViewGroup.tlq.setText(j.b(this.mContext, str, paramViewGroup.tlq.getTextSize()));
      paramViewGroup.tlr.setText(((Bankcard)localObject).txj);
      if (((Bankcard)localObject).txh != 0)
        break label1104;
      localObject = com.tencent.mm.wallet_core.ui.e.a(((Bankcard)localObject).txf, "100", 2, RoundingMode.HALF_UP).toString();
      paramViewGroup.tlB.setPrefix(ae.dOd());
      paramViewGroup.tlB.setText((CharSequence)localObject);
      paramViewGroup.tlB.setVisibility(0);
      paramViewGroup.tlC.setVisibility(0);
    }
    while (true)
    {
      AppMethodBeat.o(45737);
      break;
      paramViewGroup = (a.a)paramView.getTag();
      break label876;
      label1104: paramViewGroup.tlB.setVisibility(4);
      paramViewGroup.tlC.setVisibility(4);
    }
  }

  public int getViewTypeCount()
  {
    return 7;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.a
 * JD-Core Version:    0.6.2
 */