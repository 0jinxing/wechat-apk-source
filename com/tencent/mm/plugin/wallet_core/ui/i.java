package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.c;
import com.tencent.mm.plugin.wallet.a.d;
import com.tencent.mm.plugin.wallet.a.h;
import com.tencent.mm.plugin.wallet.a.n;
import com.tencent.mm.plugin.wallet.a.o;
import com.tencent.mm.plugin.wallet_core.d.b;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class i extends BaseAdapter
{
  private Context mContext;
  private Orders pWy;
  private int tGK;
  public String tGL;
  public boolean tGM;
  private boolean tGN;
  protected ArrayList<Bankcard> tgB;
  private com.tencent.mm.plugin.wallet_core.utils.a tln;
  private int toE;

  public i(Context paramContext, ArrayList<Bankcard> paramArrayList, int paramInt, Orders paramOrders)
  {
    AppMethodBeat.i(47313);
    this.pWy = null;
    this.tGK = -1;
    this.tGL = "";
    this.tGM = true;
    this.tGN = false;
    this.mContext = paramContext;
    this.tgB = paramArrayList;
    this.toE = paramInt;
    this.pWy = paramOrders;
    this.tln = new com.tencent.mm.plugin.wallet_core.utils.a();
    this.tln.b(this.mContext, this.tgB);
    if ((paramOrders != null) && (paramOrders.tAy == 1))
      this.tGN = true;
    AppMethodBeat.o(47313);
  }

  private LinkedList<String> g(Bankcard paramBankcard)
  {
    AppMethodBeat.i(47318);
    LinkedList localLinkedList = new LinkedList();
    if ((this.pWy != null) && (this.pWy.tAr != null) && (this.pWy.tAr.tnf != null))
    {
      Iterator localIterator = this.pWy.tAr.tnf.tmA.iterator();
      while (localIterator.hasNext())
      {
        c localc = (c)localIterator.next();
        if (localc.pbo.equals(paramBankcard.field_bindSerial))
        {
          paramBankcard = localc.tmL.iterator();
          while (paramBankcard.hasNext())
            localLinkedList.add(((d)paramBankcard.next()).pOz);
          AppMethodBeat.o(47318);
        }
      }
    }
    while (true)
    {
      return localLinkedList;
      AppMethodBeat.o(47318);
    }
  }

  public Bankcard Hd(int paramInt)
  {
    AppMethodBeat.i(47315);
    Bankcard localBankcard;
    if (this.tGN)
    {
      localBankcard = (Bankcard)this.tgB.get(paramInt);
      AppMethodBeat.o(47315);
    }
    while (true)
    {
      return localBankcard;
      int i = getCount();
      int j;
      if (this.pWy != null)
      {
        j = i;
        if (this.pWy.tAm.equals("CFT"));
      }
      else
      {
        j = i - 1;
      }
      if (paramInt < j)
      {
        localBankcard = (Bankcard)this.tgB.get(paramInt);
        AppMethodBeat.o(47315);
      }
      else
      {
        localBankcard = null;
        AppMethodBeat.o(47315);
      }
    }
  }

  public final void f(ArrayList<Bankcard> paramArrayList, boolean paramBoolean)
  {
    AppMethodBeat.i(47319);
    if (paramArrayList == null);
    for (this.tgB = new ArrayList(); ; this.tgB = paramArrayList)
    {
      this.tGM = paramBoolean;
      if (this.tgB.size() > 0)
        this.tln.b(this.mContext, this.tgB);
      notifyDataSetChanged();
      AppMethodBeat.o(47319);
      return;
    }
  }

  public int getCount()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(47314);
    if (this.tGN)
    {
      if (this.tgB == null)
        AppMethodBeat.o(47314);
      while (true)
      {
        return j;
        j = this.tgB.size();
        AppMethodBeat.o(47314);
      }
    }
    if ((this.pWy != null) && (this.pWy.tAm.equals("CFT")));
    for (j = i; ; j = 1)
    {
      if (this.tgB != null)
      {
        j += this.tgB.size();
        AppMethodBeat.o(47314);
        break;
      }
      AppMethodBeat.o(47314);
      break;
    }
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(47317);
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, 2130971080, null);
      paramViewGroup = new i.a(this);
      paramViewGroup.gne = ((TextView)paramView.findViewById(2131820678));
      paramViewGroup.pnu = ((TextView)paramView.findViewById(2131821841));
      paramViewGroup.tGQ = ((CheckedTextView)paramView.findViewById(2131826057));
      paramViewGroup.tGR = ((CdnImageView)paramView.findViewById(2131828647));
      paramViewGroup.tGP = ((FavourLayout)paramView.findViewById(2131828748));
      paramViewGroup.pnu.setText("");
      paramView.setTag(paramViewGroup);
    }
    Object localObject1;
    Object localObject2;
    while (true)
    {
      paramViewGroup.pnu.setTextColor(ah.getResources().getColor(2131690164));
      paramViewGroup.tGP.setVisibility(8);
      localObject1 = Hd(paramInt);
      if (localObject1 != null)
        break label342;
      paramViewGroup.tGQ.setVisibility(4);
      paramViewGroup.pnu.setVisibility(8);
      paramViewGroup.gne.setText(2131305157);
      paramViewGroup.tGR.setVisibility(8);
      localObject1 = new LinkedList();
      if ((this.pWy == null) || (this.pWy.tAr == null) || (this.pWy.tAr.tnf == null))
        break label339;
      localObject2 = this.pWy.tAr.tnf.tmB;
      if (localObject2 == null)
        break label339;
      localObject2 = ((n)localObject2).tns.iterator();
      while (((Iterator)localObject2).hasNext())
        ((LinkedList)localObject1).add(((o)((Iterator)localObject2).next()).pOz);
      paramViewGroup = (i.a)paramView.getTag();
    }
    if ((this.tGM) && (((LinkedList)localObject1).size() > 0))
    {
      paramViewGroup.tGP.setVisibility(0);
      paramViewGroup.pnu.setVisibility(8);
      paramViewGroup.tGP.setWording((LinkedList)localObject1);
    }
    while (true)
    {
      AppMethodBeat.o(47317);
      return paramView;
      label339: break;
      label342: paramViewGroup.tGR.setVisibility(0);
      paramViewGroup.tGQ.setVisibility(0);
      paramViewGroup.pnu.setVisibility(0);
      paramViewGroup.pnu.setText("");
      if (((Bankcard)localObject1).cPg())
      {
        paramViewGroup.gne.setText(j.b(this.mContext, ((Bankcard)localObject1).field_desc, paramViewGroup.gne.getTextSize()));
        label409: if (!((Bankcard)localObject1).cPc())
          break label902;
        localObject2 = r.cPI().thy;
        if (bo.isNullOrNil(((Bankcard)localObject2).twT))
          break label837;
        paramViewGroup.gne.setText(((Bankcard)localObject2).twT);
        label448: paramViewGroup.pnu.setVisibility(0);
        switch (((Bankcard)localObject1).a(this.toE, this.pWy))
        {
        default:
          if (!bo.isNullOrNil(((Bankcard)localObject1).field_tips))
          {
            paramViewGroup.pnu.setText(((Bankcard)localObject1).field_tips);
            label539: localObject2 = paramViewGroup.pnu.getText().toString();
            paramViewGroup.gne.setTextColor(this.mContext.getResources().getColor(2131690316));
            if (!this.tGL.equalsIgnoreCase(((Bankcard)localObject1).field_bindSerial))
              break label1127;
            paramViewGroup.tGQ.setChecked(true);
            paramViewGroup.tGQ.setEnabled(true);
            label604: paramViewGroup.tGR.setTag(2131820688, null);
            paramViewGroup.tGR.setTag(null);
            paramViewGroup.tGR.setImageDrawable(null);
            paramViewGroup.pnu.setOnClickListener(null);
            if (!((Bankcard)localObject1).cPc())
              break label1192;
            com.tencent.mm.plugin.wallet_core.utils.a.j(paramViewGroup.tGR);
          }
          break;
        case 8:
        case 1:
        case 3:
        case 2:
        case 4:
        case 5:
        case 6:
        case 7:
        }
      }
      while (true)
      {
        if ((bo.isNullOrNil(((Bankcard)localObject1).field_forbid_title)) || (bo.isNullOrNil(((Bankcard)localObject1).field_forbid_url)))
          break label1307;
        localObject2 = (String)localObject2 + "  ";
        SpannableString localSpannableString = new SpannableString((String)localObject2 + ((Bankcard)localObject1).field_forbid_title);
        paramViewGroup.pnu.setOnClickListener(new i.1(this));
        paramInt = ((String)localObject2).length();
        int i = ((String)localObject2).length();
        int j = ((Bankcard)localObject1).field_forbid_title.length();
        localSpannableString.setSpan(new ForegroundColorSpan(ah.getResources().getColor(2131690624)), paramInt, i + j, 34);
        paramViewGroup.pnu.setText(localSpannableString);
        paramViewGroup.pnu.setTag(((Bankcard)localObject1).field_forbid_url);
        break;
        paramViewGroup.gne.setText(((Bankcard)localObject1).field_desc);
        break label409;
        label837: if (((Bankcard)localObject2).twS >= 0.0D)
        {
          paramViewGroup.gne.setText(this.mContext.getString(ae.dOh(), new Object[] { e.G(((Bankcard)localObject2).twS) }));
          break label448;
        }
        paramViewGroup.gne.setText(this.mContext.getText(2131304841));
        break label448;
        label902: if (!((Bankcard)localObject1).cPd())
          break label448;
        localObject2 = r.cPI().tCZ;
        if (!bo.isNullOrNil(((Bankcard)localObject2).twT))
        {
          paramViewGroup.gne.setText(((Bankcard)localObject2).twT);
          break label448;
        }
        if (((Bankcard)localObject2).twS >= 0.0D)
        {
          paramViewGroup.gne.setText(this.mContext.getString(2131304913, new Object[] { e.G(((Bankcard)localObject2).twS) }));
          break label448;
        }
        paramViewGroup.gne.setText(this.mContext.getText(2131304841));
        break label448;
        paramViewGroup.pnu.setText(((Bankcard)localObject1).field_forbidWord);
        break label539;
        paramViewGroup.pnu.setText(2131305163);
        break label539;
        paramViewGroup.pnu.setText(2131305174);
        break label539;
        paramViewGroup.pnu.setText(2131305169);
        break label539;
        paramViewGroup.pnu.setText(2131305165);
        break label539;
        paramViewGroup.pnu.setText(2131305161);
        break label539;
        paramViewGroup.pnu.setText(2131305167);
        break label539;
        paramViewGroup.pnu.setText(2131305172);
        break label539;
        paramViewGroup.pnu.setVisibility(8);
        break label539;
        label1127: if (isEnabled(paramInt))
        {
          paramViewGroup.tGQ.setChecked(false);
          paramViewGroup.tGQ.setEnabled(true);
          break label604;
        }
        paramViewGroup.tGQ.setEnabled(false);
        paramViewGroup.tGQ.setChecked(false);
        paramViewGroup.gne.setTextColor(this.mContext.getResources().getColor(2131690164));
        break label604;
        label1192: if (((Bankcard)localObject1).cPd())
        {
          this.tln.a((Bankcard)localObject1, paramViewGroup.tGR);
        }
        else if (((Bankcard)localObject1).cPg())
        {
          paramViewGroup.tGR.setImageDrawable(com.tencent.mm.svg.a.a.f(ah.getResources(), 2131231368));
          if (!bo.isNullOrNil(((Bankcard)localObject1).txk))
          {
            paramViewGroup.tGR.setUseSdcardCache(true);
            paramViewGroup.tGR.setImgSavedPath(b.cRb());
            paramViewGroup.tGR.eb(((Bankcard)localObject1).txk, 2131231368);
          }
        }
        else
        {
          this.tln.a(this.mContext, (Bankcard)localObject1, paramViewGroup.tGR);
        }
      }
      label1307: if ((this.tGM) && (bo.isNullOrNil(((Bankcard)localObject1).field_forbidWord)) && (bo.isNullOrNil((String)localObject2)))
      {
        localObject1 = g((Bankcard)localObject1);
        if (((LinkedList)localObject1).size() > 0)
        {
          paramViewGroup.tGP.setVisibility(0);
          paramViewGroup.pnu.setVisibility(8);
          paramViewGroup.tGP.setWording((LinkedList)localObject1);
        }
      }
    }
  }

  public boolean isEnabled(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(47316);
    Bankcard localBankcard = Hd(paramInt);
    if (localBankcard == null)
      AppMethodBeat.o(47316);
    while (true)
    {
      return bool;
      if (localBankcard.a(this.toE, this.pWy) != 0)
      {
        bool = false;
        AppMethodBeat.o(47316);
      }
      else
      {
        AppMethodBeat.o(47316);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.i
 * JD-Core Version:    0.6.2
 */