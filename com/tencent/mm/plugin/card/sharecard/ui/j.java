package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.c;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.widget.CardTagTextView;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.cgf;
import com.tencent.mm.protocal.protobuf.cma;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class j
  implements c
{
  private BaseAdapter khG;
  private long khH;
  private long khI;
  private int khJ;
  private int khK;
  private ArrayList<Integer> khL;
  private ArrayList<String> khM;
  private ArrayList<String> khN;
  protected LinkedList<CardTagTextView> khO;
  private Context mContext;

  public j(Context paramContext, BaseAdapter paramBaseAdapter)
  {
    AppMethodBeat.i(88207);
    this.khH = 0L;
    this.khI = 0L;
    this.khL = new ArrayList();
    this.khM = new ArrayList();
    this.khN = new ArrayList();
    this.khO = new LinkedList();
    this.mContext = paramContext;
    this.khG = paramBaseAdapter;
    this.khJ = this.mContext.getResources().getDimensionPixelSize(2131427815);
    this.khK = this.mContext.getResources().getDimensionPixelSize(2131427796);
    this.khL.clear();
    this.khM.clear();
    this.khN.clear();
    AppMethodBeat.o(88207);
  }

  private CardTagTextView bbY()
  {
    AppMethodBeat.i(88210);
    CardTagTextView localCardTagTextView;
    if (this.khO.size() == 0)
    {
      localCardTagTextView = new CardTagTextView(this.mContext);
      AppMethodBeat.o(88210);
    }
    while (true)
    {
      return localCardTagTextView;
      localCardTagTextView = (CardTagTextView)this.khO.removeFirst();
      AppMethodBeat.o(88210);
    }
  }

  public final void R(View paramView, int paramInt)
  {
  }

  public final void S(View paramView, int paramInt)
  {
  }

  public final View a(int paramInt, View paramView, com.tencent.mm.plugin.card.base.b paramb)
  {
    AppMethodBeat.i(88209);
    long l = System.currentTimeMillis();
    j.a locala;
    Object localObject1;
    int i;
    int j;
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, 2130968974, null);
      locala = new j.a(this);
      locala.khP = ((LinearLayout)paramView.findViewById(2131822295));
      locala.khQ = ((TextView)paramView.findViewById(2131822293));
      locala.khR = ((TextView)paramView.findViewById(2131822294));
      locala.khS = ((RelativeLayout)paramView.findViewById(2131821912));
      locala.khT = ((ImageView)paramView.findViewById(2131821914));
      locala.khU = ((TextView)paramView.findViewById(2131821915));
      locala.khV = ((TextView)paramView.findViewById(2131821917));
      locala.khZ = paramView.findViewById(2131822297);
      locala.khW = ((TextView)paramView.findViewById(2131821920));
      locala.khX = ((TextView)paramView.findViewById(2131822298));
      locala.khY = ((TextView)paramView.findViewById(2131821921));
      locala.kia = ((TextView)paramView.findViewById(2131822296));
      locala.khW.setEllipsize(TextUtils.TruncateAt.MIDDLE);
      paramView.setTag(locala);
      localObject1 = (com.tencent.mm.plugin.card.base.b)this.khG.getItem(paramInt);
      i = ((com.tencent.mm.plugin.card.base.b)localObject1).bae();
      if (!com.tencent.mm.plugin.card.sharecard.a.b.sS(((com.tencent.mm.plugin.card.base.b)localObject1).bae()))
        break label1791;
      if (paramInt != 0)
        break label827;
      if (TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject1).sN(i)))
        break label1791;
      j = 1;
    }
    while (true)
    {
      label274: if (j != 0)
      {
        locala.khQ.setVisibility(0);
        locala.khQ.setText(((com.tencent.mm.plugin.card.base.b)localObject1).sN(i));
        if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject1).bad()))
        {
          locala.khR.setVisibility(0);
          locala.khR.setText(((com.tencent.mm.plugin.card.base.b)localObject1).bad());
          label342: if (!paramb.aZI())
            break label1630;
          locala.khT.setVisibility(0);
          locala.khU.setVisibility(0);
          locala.khP.setVisibility(0);
          locala.khV.setVisibility(0);
          locala.kia.setVisibility(0);
          locala.khZ.setVisibility(0);
          locala.khW.setVisibility(0);
          locala.khX.setVisibility(0);
          locala.khY.setVisibility(8);
          locala.khU.setText(paramb.aZV().kdg);
          if (!paramb.aZF())
            break label1015;
          if ((paramb.aZV().vTW == null) || (paramb.aZV().vTW.size() != 1))
            break label903;
          locala.khV.setText(((tm)paramb.aZV().vTW.get(0)).title);
          j = this.mContext.getResources().getDimensionPixelSize(2131428175);
          m.a(locala.khT, paramb.aZV().kbV, j, 2130839644, true);
          locala.khU.setTextColor(this.mContext.getResources().getColor(2131689823));
          localObject1 = com.tencent.mm.plugin.card.sharecard.a.b.GB(paramb.baa());
          if (TextUtils.isEmpty((CharSequence)localObject1))
            break label1035;
          locala.khX.setText((CharSequence)localObject1);
          label602: localObject1 = com.tencent.mm.plugin.card.sharecard.a.b.rt(paramb.baa());
          boolean bool = com.tencent.mm.plugin.card.sharecard.a.b.sS(paramb.bae());
          if ((TextUtils.isEmpty((CharSequence)localObject1)) || (!bool))
            break label1049;
          locala.khW.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, (CharSequence)localObject1, this.mContext.getResources().getDimensionPixelOffset(2131427864)));
          label667: j = com.tencent.mm.plugin.card.sharecard.a.b.GC(paramb.baa());
          if ((j <= 1) || (!bool))
            break label1165;
          locala.kia.setText("X".concat(String.valueOf(j)));
          locala.kia.setVisibility(0);
        }
      }
      label514: label717: label1015: Object localObject2;
      while (true)
        if (((paramb.aZV().vUp != null) && (!bo.ek(paramb.aZV().vUp.xjK))) || (com.tencent.mm.plugin.card.sharecard.a.b.GE(paramb.baa())))
        {
          locala.khP.setVisibility(0);
          j = 0;
          while (true)
            if (j < locala.khP.getChildCount())
            {
              localObject1 = (CardTagTextView)locala.khP.getChildAt(j);
              this.khO.add(localObject1);
              j++;
              continue;
              locala = (j.a)paramView.getTag();
              break;
              label827: if (i == ((com.tencent.mm.plugin.card.base.b)this.khG.getItem(paramInt - 1)).bae())
                break label1791;
              j = 1;
              break label274;
              locala.khR.setVisibility(8);
              break label342;
              locala.khQ.setVisibility(8);
              locala.khR.setVisibility(8);
              locala.khQ.setText("");
              break label342;
              label903: if ((paramb.aZV().vTW == null) || (paramb.aZV().vTW.size() != 2))
                break label514;
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append(((tm)paramb.aZV().vTW.get(0)).title);
              ((StringBuilder)localObject1).append("-");
              ((StringBuilder)localObject1).append(((tm)paramb.aZV().vTW.get(1)).title);
              locala.khV.setText(((StringBuilder)localObject1).toString());
              break label514;
              locala.khV.setText(paramb.aZV().title);
              break label514;
              label1035: locala.khX.setText("");
              break label602;
              label1049: if (!TextUtils.isEmpty(paramb.bab()))
              {
                localObject1 = l.Hp(paramb.bab());
                if (!TextUtils.isEmpty((CharSequence)localObject1))
                {
                  localObject1 = this.mContext.getResources().getString(2131297967, new Object[] { localObject1 });
                  locala.khW.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, (CharSequence)localObject1, this.mContext.getResources().getDimensionPixelOffset(2131427864)));
                  break label667;
                }
                locala.khW.setText("");
                break label667;
              }
              locala.khW.setText("");
              break label667;
              label1165: locala.kia.setVisibility(8);
              break label717;
            }
          locala.khP.removeAllViews();
          if (com.tencent.mm.plugin.card.sharecard.a.b.GE(paramb.baa()))
          {
            localObject1 = bbY();
            ((CardTagTextView)localObject1).setPadding(this.khK, this.khJ, this.khK, this.khJ);
            ((CardTagTextView)localObject1).setTextColor(this.mContext.getResources().getColor(2131690384));
            ((CardTagTextView)localObject1).setText(this.mContext.getString(2131297978));
            ((CardTagTextView)localObject1).setTextSize(12.0F);
            localObject2 = new LinearLayout.LayoutParams(-2, -2);
            ((LinearLayout.LayoutParams)localObject2).rightMargin = this.mContext.getResources().getDimensionPixelOffset(2131427786);
            locala.khP.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
          }
          if ((paramb.aZV().vUp == null) || (bo.ek(paramb.aZV().vUp.xjK)))
            break label1459;
          localObject1 = paramb.aZV().vUp.xjK.iterator();
        }
      while (((Iterator)localObject1).hasNext())
      {
        cgf localcgf = (cgf)((Iterator)localObject1).next();
        localObject2 = bbY();
        ((CardTagTextView)localObject2).setPadding(this.khK, this.khJ, this.khK, this.khJ);
        ((CardTagTextView)localObject2).setTextColor(l.Hn(localcgf.color));
        ((CardTagTextView)localObject2).setText(localcgf.tag);
        ((CardTagTextView)localObject2).setTextSize(12.0F);
        locala.khP.addView((View)localObject2);
        continue;
        locala.khP.setVisibility(8);
      }
      label1459: if ((paramInt == this.khG.getCount() - 1) && (locala.khS != null))
      {
        localObject1 = (LinearLayout.LayoutParams)locala.khS.getLayoutParams();
        if (((LinearLayout.LayoutParams)localObject1).bottomMargin != this.mContext.getResources().getDimensionPixelOffset(2131427786))
        {
          ((LinearLayout.LayoutParams)localObject1).bottomMargin = this.mContext.getResources().getDimensionPixelOffset(2131427786);
          locala.khS.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        }
      }
      while (true)
      {
        this.khH = (System.currentTimeMillis() - l + this.khH);
        this.khI += 1L;
        if (!this.khM.contains(paramb.aZZ()))
        {
          this.khM.add(paramb.aZZ());
          this.khN.add(paramb.baa());
          this.khL.add(Integer.valueOf(paramInt));
        }
        AppMethodBeat.o(88209);
        return paramView;
        label1630: locala.khT.setVisibility(8);
        locala.khU.setVisibility(8);
        locala.khP.setVisibility(8);
        locala.khV.setVisibility(8);
        locala.kia.setVisibility(8);
        locala.khZ.setVisibility(8);
        locala.khW.setVisibility(8);
        locala.khX.setVisibility(8);
        locala.khY.setVisibility(0);
        locala.khY.setText(this.mContext.getResources().getString(2131297936));
        break;
        if (locala.khS != null)
        {
          localObject1 = (LinearLayout.LayoutParams)locala.khS.getLayoutParams();
          if (((LinearLayout.LayoutParams)localObject1).bottomMargin != 0)
          {
            ((LinearLayout.LayoutParams)localObject1).bottomMargin = 0;
            locala.khS.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          }
        }
      }
      label1791: j = 0;
    }
  }

  public final void a(View paramView, int paramInt, View.OnClickListener paramOnClickListener)
  {
  }

  public final void release()
  {
    AppMethodBeat.i(88208);
    this.mContext = null;
    this.khG = null;
    if (this.khI > 0L)
    {
      ArrayList localArrayList = new ArrayList();
      IDKey localIDKey1 = new IDKey();
      localIDKey1.SetID(281);
      localIDKey1.SetKey(5);
      localIDKey1.SetValue(1L);
      IDKey localIDKey2 = new IDKey();
      localIDKey2.SetID(281);
      localIDKey2.SetKey(6);
      localIDKey2.SetValue((int)(this.khH / this.khI));
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey2);
      h.pYm.b(localArrayList, true);
    }
    if ((this.khL.size() == this.khM.size()) && (this.khM.size() == this.khN.size()) && (this.khL.size() > 0))
    {
      long l = System.currentTimeMillis();
      for (int i = 0; i < this.khL.size(); i++)
        h.pYm.e(13220, new Object[] { this.khN.get(i), this.khM.get(i), this.khL.get(i), Long.valueOf(l) });
    }
    this.khL.clear();
    this.khM.clear();
    this.khN.clear();
    if (this.khO != null)
      this.khO.clear();
    AppMethodBeat.o(88208);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.j
 * JD-Core Version:    0.6.2
 */