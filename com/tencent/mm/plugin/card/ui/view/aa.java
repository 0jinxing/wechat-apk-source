package com.tencent.mm.plugin.card.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.j;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.ui.l.a;
import com.tencent.mm.plugin.card.widget.CardTagTextView;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class aa
  implements com.tencent.mm.plugin.card.base.c
{
  int itemHeight;
  private BaseAdapter khG;
  private int khK;
  protected LinkedList<CardTagTextView> khO;
  private int knQ;
  int knR;
  private Context mContext;

  public aa(Context paramContext, BaseAdapter paramBaseAdapter)
  {
    AppMethodBeat.i(88794);
    this.khO = new LinkedList();
    this.mContext = paramContext;
    this.khG = paramBaseAdapter;
    this.knQ = this.mContext.getResources().getDimensionPixelSize(2131427865);
    this.khK = this.mContext.getResources().getDimensionPixelSize(2131427796);
    this.knR = this.mContext.getResources().getDimensionPixelOffset(2131428166);
    this.itemHeight = this.mContext.getResources().getDimensionPixelOffset(2131428167);
    AppMethodBeat.o(88794);
  }

  public final void R(View paramView, int paramInt)
  {
    AppMethodBeat.i(88797);
    ((l.a)paramView.getTag()).knS.setImageResource(paramInt);
    AppMethodBeat.o(88797);
  }

  public final void S(View paramView, int paramInt)
  {
    AppMethodBeat.i(88798);
    ((l.a)paramView.getTag()).knS.setVisibility(paramInt);
    AppMethodBeat.o(88798);
  }

  public final View a(int paramInt, View paramView, b paramb)
  {
    AppMethodBeat.i(88796);
    Object localObject1;
    label107: Object localObject2;
    if (paramView == null)
      switch (this.khG.getItemViewType(paramInt))
      {
      default:
        paramView = View.inflate(this.mContext, 2130968947, null);
        localObject1 = new aa.a(this);
        if ((paramb.aZZ().equals("PRIVATE_TICKET_TITLE")) || (paramb.aZZ().equals("PRIVATE_INVOICE_TITLE")))
        {
          ((aa.a)localObject1).krv = ((TextView)paramView.findViewById(2131822212));
          paramView.setTag(localObject1);
          localObject2 = paramView;
          label116: if (((aa.a)localObject1).khV != null)
          {
            float f = this.mContext.getResources().getDimension(2131427509);
            ((aa.a)localObject1).khV.setTextSize(0, f);
          }
          if (!paramb.aZI())
            break label2013;
          if (!paramb.aZZ().equals("PRIVATE_TICKET_TITLE"))
            break label783;
          ((aa.a)localObject1).krv.setText(this.mContext.getString(2131298007));
        }
        break;
      case 0:
      case 1:
      case 2:
      }
    label310: Object localObject3;
    label783: Object localObject4;
    while (true)
    {
      if ((!paramb.aZZ().equals("PRIVATE_TICKET_TITLE")) && (!paramb.aZZ().equals("PRIVATE_INVOICE_TITLE")) && (!paramb.aZH()))
      {
        paramb.aZV();
        if ((paramInt != this.khG.getCount() - 1) || (((aa.a)localObject1).khS == null))
          break label2153;
        paramView = (LinearLayout.LayoutParams)((aa.a)localObject1).khS.getLayoutParams();
        if (paramView.bottomMargin != this.mContext.getResources().getDimensionPixelOffset(2131427786))
        {
          paramView.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(2131427786);
          ((aa.a)localObject1).khS.setLayoutParams(paramView);
        }
      }
      AppMethodBeat.o(88796);
      return localObject2;
      localObject1 = View.inflate(this.mContext, 2130968949, null);
      if (paramb.aZZ().equals("PRIVATE_TICKET_TITLE"))
      {
        localObject2 = (TextView)((View)localObject1).findViewById(2131822212);
        paramView = (View)localObject1;
        if (localObject2 == null)
          break;
        ((TextView)localObject2).setText(this.mContext.getString(2131298007));
        paramView = (View)localObject1;
        break;
      }
      paramView = (View)localObject1;
      if (!paramb.aZZ().equals("PRIVATE_INVOICE_TITLE"))
        break;
      localObject2 = (TextView)((View)localObject1).findViewById(2131822212);
      paramView = (View)localObject1;
      if (localObject2 == null)
        break;
      ((TextView)localObject2).setText(this.mContext.getString(2131297892));
      paramView = (View)localObject1;
      break;
      paramView = View.inflate(this.mContext, 2130968947, null);
      break;
      paramView = View.inflate(this.mContext, 2130968952, null);
      break;
      if (paramb.aZH())
      {
        ((aa.a)localObject1).krw = ((TextView)paramView.findViewById(2131822216));
        ((aa.a)localObject1).krx = ((TextView)paramView.findViewById(2131822217));
        ((aa.a)localObject1).kry = ((TextView)paramView.findViewById(2131822218));
        ((aa.a)localObject1).krz = ((TextView)paramView.findViewById(2131822219));
        break label107;
      }
      ((aa.a)localObject1).khS = ((RelativeLayout)paramView.findViewById(2131821912));
      ((aa.a)localObject1).khT = ((ImageView)paramView.findViewById(2131821914));
      ((aa.a)localObject1).knc = paramView.findViewById(2131822208);
      ((aa.a)localObject1).knd = ((ImageView)paramView.findViewById(2131822209));
      ((aa.a)localObject1).khU = ((TextView)paramView.findViewById(2131821915));
      ((aa.a)localObject1).khV = ((TextView)paramView.findViewById(2131821917));
      ((aa.a)localObject1).khY = ((TextView)paramView.findViewById(2131821921));
      ((aa.a)localObject1).knS = ((ImageView)paramView.findViewById(2131822211));
      ((aa.a)localObject1).knU = ((ImageView)paramView.findViewById(2131822205));
      ((aa.a)localObject1).knV = ((ImageView)paramView.findViewById(2131822206));
      ((aa.a)localObject1).knW = ((ImageView)paramView.findViewById(2131822207));
      ((aa.a)localObject1).knT = ((LinearLayout)paramView.findViewById(2131822210));
      break label107;
      localObject1 = (aa.a)paramView.getTag();
      if (((aa.a)localObject1).krv != null)
      {
        if (paramb.aZZ().equals("PRIVATE_TICKET_TITLE"))
        {
          ((aa.a)localObject1).krv.setText(this.mContext.getString(2131298007));
          localObject2 = paramView;
          break label116;
        }
        ((aa.a)localObject1).krv.setText(this.mContext.getString(2131297892));
      }
      localObject2 = paramView;
      break label116;
      if (paramb.aZZ().equals("PRIVATE_INVOICE_TITLE"))
      {
        ((aa.a)localObject1).krv.setText(this.mContext.getString(2131297892));
      }
      else if (paramb.aZH())
      {
        paramView = paramb.aZV().vTW;
        ((aa.a)localObject1).krw.setText(((tm)paramView.get(0)).kbW);
        ((aa.a)localObject1).kry.setText(((tm)paramView.get(1)).kbW);
        paramView = paramb.aZW().vSc;
        localObject3 = String.format(this.mContext.getString(2131297903), new Object[] { ((tm)paramView.get(0)).kbW });
        ((aa.a)localObject1).krz.setText((CharSequence)localObject3);
        if (paramView.size() >= 2)
          ((aa.a)localObject1).krx.setText(((tm)paramView.get(1)).kbW);
      }
      else
      {
        if ((this.khG.getItem(paramInt) instanceof CardInfo))
        {
          localObject4 = (CardInfo)this.khG.getItem(paramInt);
          if ((!((CardInfo)localObject4).field_card_id.equals("PRIVATE_TICKET_TITLE")) && (!((CardInfo)localObject4).field_card_id.equals("PRIVATE_INVOICE_TITLE")))
            break label1311;
        }
        label1010: ((aa.a)localObject1).khS.setVisibility(0);
        ((aa.a)localObject1).khT.setVisibility(0);
        ((aa.a)localObject1).khV.setVisibility(0);
        ((aa.a)localObject1).khY.setVisibility(8);
        ((aa.a)localObject1).khU.setVisibility(0);
        ((aa.a)localObject1).khU.setText(paramb.aZV().kdg);
        ((aa.a)localObject1).khV.setText(paramb.aZV().title);
        if (!paramb.aZF())
          break label1670;
        ((aa.a)localObject1).knc.setVisibility(0);
        ((aa.a)localObject1).khT.setVisibility(4);
        paramView = ((aa.a)localObject1).knd;
        if (TextUtils.isEmpty(paramb.aZV().vUe))
          break label1648;
        i = this.mContext.getResources().getDimensionPixelSize(2131428175);
        com.tencent.mm.plugin.card.d.m.a(this.mContext, paramView, paramb.aZV().vUe, i, l.Hn(paramb.aZV().color));
        label1184: if (!paramb.aZD())
          break label1917;
        if (!bo.isNullOrNil(paramb.aZW().vSm))
          break label1730;
        paramView = l.dI(l.Hn(paramb.aZV().color), this.knR);
        ((aa.a)localObject1).khS.setBackgroundDrawable(paramView);
        ((aa.a)localObject1).knU.setVisibility(8);
        ((aa.a)localObject1).knV.setVisibility(8);
        ((aa.a)localObject1).knW.setVisibility(0);
        label1266: ((aa.a)localObject1).khU.setTextColor(this.mContext.getResources().getColor(2131690691));
        ((aa.a)localObject1).khV.setTextColor(this.mContext.getResources().getColor(2131690691));
      }
    }
    label1311: int i = 0;
    if (((CardInfo)localObject4).field_stickyIndex % 10 != 0)
    {
      if (((CardInfo)localObject4).field_stickyIndex <= 0)
        break label2189;
      i = 1;
      paramView = j.a(this.mContext, ((CardInfo)localObject4).field_stickyIndex, (CardInfo)localObject4);
    }
    while (true)
    {
      if (i != 0)
      {
        i = 0;
        while (true)
          if (i < ((aa.a)localObject1).knT.getChildCount())
          {
            localObject3 = (CardTagTextView)((aa.a)localObject1).knT.getChildAt(i);
            this.khO.add(localObject3);
            i++;
            continue;
            if (bo.isNullOrNil(((CardInfo)localObject4).field_label_wording))
              break label2189;
            i = 1;
            paramView = ((CardInfo)localObject4).field_label_wording;
            break;
          }
        ((aa.a)localObject1).knT.removeAllViews();
        ((aa.a)localObject1).knT.setVisibility(0);
        if (this.khO.size() == 0)
        {
          localObject3 = new CardTagTextView(this.mContext);
          label1466: ((CardTagTextView)localObject3).setPadding(this.khK, this.knQ, this.khK, this.knQ);
          ((CardTagTextView)localObject3).setGravity(17);
          ((CardTagTextView)localObject3).setMinWidth(this.mContext.getResources().getDimensionPixelSize(2131428172));
          ((CardTagTextView)localObject3).setMinHeight(this.mContext.getResources().getDimensionPixelSize(2131428171));
          if (!((CardInfo)localObject4).aZD())
            break label1611;
          ((CardTagTextView)localObject3).setTextColor(com.tencent.mm.bz.a.i(this.mContext, 2131690691));
          ((CardTagTextView)localObject3).setFillColor(com.tencent.mm.bz.a.i(this.mContext, 2131689844));
        }
        while (true)
        {
          ((CardTagTextView)localObject3).setText(paramView);
          ((CardTagTextView)localObject3).setTextSize(1, 10.0F);
          ((aa.a)localObject1).knT.addView((View)localObject3);
          break;
          localObject3 = (CardTagTextView)this.khO.removeFirst();
          break label1466;
          label1611: ((CardTagTextView)localObject3).setTextColor(com.tencent.mm.bz.a.i(this.mContext, 2131690208));
          ((CardTagTextView)localObject3).setFillColor(0);
        }
      }
      ((aa.a)localObject1).knT.setVisibility(8);
      break label1010;
      label1648: com.tencent.mm.plugin.card.d.m.a(paramView, 2130838129, l.Hn(paramb.aZV().color));
      break label1184;
      label1670: ((aa.a)localObject1).knc.setVisibility(8);
      ((aa.a)localObject1).khT.setVisibility(0);
      i = this.mContext.getResources().getDimensionPixelSize(2131428175);
      com.tencent.mm.plugin.card.d.m.a(((aa.a)localObject1).khT, paramb.aZV().kbV, i, 2130839644, true);
      break label1184;
      label1730: ((aa.a)localObject1).khS.setBackgroundDrawable(this.mContext.getResources().getDrawable(2130838087));
      ((aa.a)localObject1).knU.setVisibility(0);
      ((aa.a)localObject1).knV.setVisibility(0);
      localObject3 = ((aa.a)localObject1).knU;
      paramView = paramb.aZW().vSm;
      localObject4 = new c.a();
      ((c.a)localObject4).ePK = e.eSn;
      o.ahq();
      ((c.a)localObject4).ePY = null;
      ((c.a)localObject4).ePJ = com.tencent.mm.plugin.card.model.m.Gz(paramView);
      ((c.a)localObject4).ePH = true;
      ((c.a)localObject4).eQa = true;
      ((c.a)localObject4).ePF = true;
      ((c.a)localObject4).ePT = 2130838087;
      ((c.a)localObject4).ePO = com.tencent.mm.bz.a.al(this.mContext, 2131428167);
      ((c.a)localObject4).ePN = com.tencent.mm.bz.a.gd(this.mContext);
      localObject4 = ((c.a)localObject4).ahG();
      o.ahp().a(paramView, (ImageView)localObject3, (com.tencent.mm.at.a.a.c)localObject4);
      ((ImageView)localObject3).setImageMatrix(new Matrix());
      ((aa.a)localObject1).knW.setVisibility(8);
      break label1266;
      label1917: ((aa.a)localObject1).knW.setVisibility(8);
      ((aa.a)localObject1).knU.setVisibility(8);
      ((aa.a)localObject1).knV.setVisibility(8);
      ((aa.a)localObject1).khS.setBackgroundDrawable(this.mContext.getResources().getDrawable(2130838087));
      ((aa.a)localObject1).khV.setTextColor(this.mContext.getResources().getColor(2131689823));
      ((aa.a)localObject1).khU.setTextColor(this.mContext.getResources().getColor(2131689823));
      break;
      label2013: if ((paramb.aZZ().equals("PRIVATE_TICKET_TITLE")) || (paramb.aZZ().equals("PRIVATE_INVOICE_TITLE")) || (paramb.aZH()))
        break;
      ((aa.a)localObject1).khT.setVisibility(8);
      ((aa.a)localObject1).khV.setVisibility(8);
      ((aa.a)localObject1).khU.setVisibility(8);
      ((aa.a)localObject1).knT.setVisibility(8);
      ((aa.a)localObject1).khY.setVisibility(0);
      paramView = l.dI(this.mContext.getResources().getColor(2131689843), this.knR);
      ((aa.a)localObject1).khS.setBackgroundDrawable(paramView);
      ((aa.a)localObject1).khY.setText(this.mContext.getResources().getString(2131297936));
      break;
      label2153: paramView = (LinearLayout.LayoutParams)((aa.a)localObject1).khS.getLayoutParams();
      if (paramView.bottomMargin == 0)
        break label310;
      paramView.bottomMargin = 0;
      ((aa.a)localObject1).khS.setLayoutParams(paramView);
      break label310;
      label2189: paramView = null;
    }
  }

  public final void a(View paramView, int paramInt, View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(88799);
    CardInfo localCardInfo = (CardInfo)this.khG.getItem(paramInt);
    if ((localCardInfo.field_card_id.equals("PRIVATE_TICKET_TITLE")) || (localCardInfo.field_card_id.equals("PRIVATE_INVOICE_TITLE")))
      AppMethodBeat.o(88799);
    while (true)
    {
      return;
      paramView = (aa.a)paramView.getTag();
      paramView.knS.setTag(Integer.valueOf(paramInt));
      paramView.knS.setOnClickListener(paramOnClickListener);
      AppMethodBeat.o(88799);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(88795);
    this.mContext = null;
    this.khG = null;
    if (this.khO != null)
      this.khO.clear();
    AppMethodBeat.o(88795);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.aa
 * JD-Core Version:    0.6.2
 */