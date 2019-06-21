package com.tencent.mm.plugin.card.ui;

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
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.widget.CardTagTextView;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class l
  implements com.tencent.mm.plugin.card.base.c
{
  int itemHeight;
  private BaseAdapter khG;
  private int khK;
  protected LinkedList<CardTagTextView> khO;
  private int knQ;
  int knR;
  private Context mContext;

  public l(Context paramContext, BaseAdapter paramBaseAdapter)
  {
    AppMethodBeat.i(88665);
    this.khO = new LinkedList();
    this.mContext = paramContext;
    this.khG = paramBaseAdapter;
    this.knQ = this.mContext.getResources().getDimensionPixelSize(2131427865);
    this.khK = this.mContext.getResources().getDimensionPixelSize(2131427796);
    this.knR = this.mContext.getResources().getDimensionPixelOffset(2131428166);
    this.itemHeight = this.mContext.getResources().getDimensionPixelOffset(2131428167);
    AppMethodBeat.o(88665);
  }

  public final void R(View paramView, int paramInt)
  {
    AppMethodBeat.i(88668);
    ((l.a)paramView.getTag()).knS.setImageResource(paramInt);
    AppMethodBeat.o(88668);
  }

  public final void S(View paramView, int paramInt)
  {
    AppMethodBeat.i(88669);
    ((l.a)paramView.getTag()).knS.setVisibility(paramInt);
    AppMethodBeat.o(88669);
  }

  public final View a(int paramInt, View paramView, b paramb)
  {
    AppMethodBeat.i(88667);
    View localView;
    Object localObject1;
    label256: Object localObject2;
    int i;
    if (paramView == null)
      if (paramb.aZZ().equals("PRIVATE_TICKET_TITLE"))
      {
        localView = View.inflate(this.mContext, 2130968949, null);
        localObject1 = (TextView)localView.findViewById(2131822212);
        paramView = localView;
        if (localObject1 != null)
        {
          ((TextView)localObject1).setText(this.mContext.getString(2131298007));
          paramView = localView;
        }
        localObject1 = new l.a(this);
        ((l.a)localObject1).khS = ((RelativeLayout)paramView.findViewById(2131821912));
        ((l.a)localObject1).khT = ((ImageView)paramView.findViewById(2131821914));
        ((l.a)localObject1).knc = paramView.findViewById(2131822208);
        ((l.a)localObject1).knd = ((ImageView)paramView.findViewById(2131822209));
        ((l.a)localObject1).khU = ((TextView)paramView.findViewById(2131821915));
        ((l.a)localObject1).khV = ((TextView)paramView.findViewById(2131821917));
        ((l.a)localObject1).khY = ((TextView)paramView.findViewById(2131821921));
        ((l.a)localObject1).knS = ((ImageView)paramView.findViewById(2131822211));
        ((l.a)localObject1).knU = ((ImageView)paramView.findViewById(2131822205));
        ((l.a)localObject1).knV = ((ImageView)paramView.findViewById(2131822206));
        ((l.a)localObject1).knW = ((ImageView)paramView.findViewById(2131822207));
        ((l.a)localObject1).knT = ((LinearLayout)paramView.findViewById(2131822210));
        paramView.setTag(localObject1);
        localView = paramView;
        if (((l.a)localObject1).khV != null)
        {
          float f = this.mContext.getResources().getDimension(2131427509);
          ((l.a)localObject1).khV.setTextSize(0, f);
        }
        if (!(this.khG.getItem(paramInt) instanceof CardInfo))
          break label693;
        localObject2 = (CardInfo)this.khG.getItem(paramInt);
        i = 0;
        if (((CardInfo)localObject2).field_stickyIndex % 10 == 0)
          break label503;
        if (((CardInfo)localObject2).field_stickyIndex <= 0)
          break label1641;
        i = 1;
        paramView = j.a(this.mContext, ((CardInfo)localObject2).field_stickyIndex, (CardInfo)localObject2);
      }
    while (true)
    {
      label356: Object localObject3;
      if (i != 0)
      {
        i = 0;
        while (true)
          if (i < ((l.a)localObject1).knT.getChildCount())
          {
            localObject3 = (CardTagTextView)((l.a)localObject1).knT.getChildAt(i);
            this.khO.add(localObject3);
            i++;
            continue;
            if (paramb.aZZ().equals("PRIVATE_INVOICE_TITLE"))
            {
              localView = View.inflate(this.mContext, 2130968949, null);
              localObject1 = (TextView)localView.findViewById(2131822212);
              paramView = localView;
              if (localObject1 == null)
                break;
              ((TextView)localObject1).setText(this.mContext.getString(2131297892));
              paramView = localView;
              break;
            }
            paramView = View.inflate(this.mContext, 2130968947, null);
            break;
            localObject1 = (l.a)paramView.getTag();
            localView = paramView;
            break label256;
            label503: if (bo.isNullOrNil(((CardInfo)localObject2).field_label_wording))
              break label1641;
            i = 1;
            paramView = ((CardInfo)localObject2).field_label_wording;
            break label356;
          }
        ((l.a)localObject1).knT.removeAllViews();
        ((l.a)localObject1).knT.setVisibility(0);
        if (this.khO.size() == 0)
        {
          localObject3 = new CardTagTextView(this.mContext);
          ((CardTagTextView)localObject3).setPadding(this.khK, this.knQ, this.khK, this.knQ);
          ((CardTagTextView)localObject3).setGravity(17);
          ((CardTagTextView)localObject3).setMinWidth(this.mContext.getResources().getDimensionPixelSize(2131428172));
          ((CardTagTextView)localObject3).setMinHeight(this.mContext.getResources().getDimensionPixelSize(2131428171));
          if (!((CardInfo)localObject2).aZD())
            break label1100;
          ((CardTagTextView)localObject3).setTextColor(com.tencent.mm.bz.a.i(this.mContext, 2131690691));
          ((CardTagTextView)localObject3).setFillColor(com.tencent.mm.bz.a.i(this.mContext, 2131689844));
          label668: ((CardTagTextView)localObject3).setText(paramView);
          ((CardTagTextView)localObject3).setTextSize(1, 10.0F);
          ((l.a)localObject1).knT.addView((View)localObject3);
          label693: if (!paramb.aZI())
            break label1502;
          ((l.a)localObject1).khT.setVisibility(0);
          ((l.a)localObject1).khV.setVisibility(0);
          ((l.a)localObject1).khY.setVisibility(8);
          ((l.a)localObject1).khU.setVisibility(0);
          ((l.a)localObject1).khU.setText(paramb.aZV().kdg);
          ((l.a)localObject1).khV.setText(paramb.aZV().title);
          if (!paramb.aZF())
            break label1159;
          ((l.a)localObject1).knc.setVisibility(0);
          ((l.a)localObject1).khT.setVisibility(4);
          paramView = ((l.a)localObject1).knd;
          if (TextUtils.isEmpty(paramb.aZV().vUe))
            break label1137;
          i = this.mContext.getResources().getDimensionPixelSize(2131428175);
          com.tencent.mm.plugin.card.d.m.a(this.mContext, paramView, paramb.aZV().vUe, i, com.tencent.mm.plugin.card.d.l.Hn(paramb.aZV().color));
          label867: if (!paramb.aZD())
            break label1406;
          if (!bo.isNullOrNil(paramb.aZW().vSm))
            break label1219;
          paramView = com.tencent.mm.plugin.card.d.l.dI(com.tencent.mm.plugin.card.d.l.Hn(paramb.aZV().color), this.knR);
          ((l.a)localObject1).khS.setBackgroundDrawable(paramView);
          ((l.a)localObject1).knU.setVisibility(8);
          ((l.a)localObject1).knV.setVisibility(8);
          ((l.a)localObject1).knW.setVisibility(0);
          label949: ((l.a)localObject1).khU.setTextColor(this.mContext.getResources().getColor(2131690691));
          ((l.a)localObject1).khV.setTextColor(this.mContext.getResources().getColor(2131690691));
          label991: paramb.aZV();
          if ((paramInt != this.khG.getCount() - 1) || (((l.a)localObject1).khS == null))
            break label1605;
          paramView = (LinearLayout.LayoutParams)((l.a)localObject1).khS.getLayoutParams();
          if (paramView.bottomMargin != this.mContext.getResources().getDimensionPixelOffset(2131427786))
          {
            paramView.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(2131427786);
            ((l.a)localObject1).khS.setLayoutParams(paramView);
          }
        }
      }
      while (true)
      {
        AppMethodBeat.o(88667);
        return localView;
        localObject3 = (CardTagTextView)this.khO.removeFirst();
        break;
        label1100: ((CardTagTextView)localObject3).setTextColor(com.tencent.mm.bz.a.i(this.mContext, 2131690208));
        ((CardTagTextView)localObject3).setFillColor(0);
        break label668;
        ((l.a)localObject1).knT.setVisibility(8);
        break label693;
        label1137: com.tencent.mm.plugin.card.d.m.a(paramView, 2130838129, com.tencent.mm.plugin.card.d.l.Hn(paramb.aZV().color));
        break label867;
        label1159: ((l.a)localObject1).knc.setVisibility(8);
        ((l.a)localObject1).khT.setVisibility(0);
        i = this.mContext.getResources().getDimensionPixelSize(2131428175);
        com.tencent.mm.plugin.card.d.m.a(((l.a)localObject1).khT, paramb.aZV().kbV, i, 2130839644, true);
        break label867;
        label1219: ((l.a)localObject1).khS.setBackgroundDrawable(this.mContext.getResources().getDrawable(2130838087));
        ((l.a)localObject1).knU.setVisibility(0);
        ((l.a)localObject1).knV.setVisibility(0);
        localObject3 = ((l.a)localObject1).knU;
        paramView = paramb.aZW().vSm;
        localObject2 = new c.a();
        ((c.a)localObject2).ePK = e.eSn;
        o.ahq();
        ((c.a)localObject2).ePY = null;
        ((c.a)localObject2).ePJ = com.tencent.mm.plugin.card.model.m.Gz(paramView);
        ((c.a)localObject2).ePH = true;
        ((c.a)localObject2).eQa = true;
        ((c.a)localObject2).ePF = true;
        ((c.a)localObject2).ePT = 2130838087;
        ((c.a)localObject2).ePO = com.tencent.mm.bz.a.al(this.mContext, 2131428167);
        ((c.a)localObject2).ePN = com.tencent.mm.bz.a.gd(this.mContext);
        localObject2 = ((c.a)localObject2).ahG();
        o.ahp().a(paramView, (ImageView)localObject3, (com.tencent.mm.at.a.a.c)localObject2);
        ((ImageView)localObject3).setImageMatrix(new Matrix());
        ((l.a)localObject1).knW.setVisibility(8);
        break label949;
        label1406: ((l.a)localObject1).knW.setVisibility(8);
        ((l.a)localObject1).knU.setVisibility(8);
        ((l.a)localObject1).knV.setVisibility(8);
        ((l.a)localObject1).khS.setBackgroundDrawable(this.mContext.getResources().getDrawable(2130838087));
        ((l.a)localObject1).khV.setTextColor(this.mContext.getResources().getColor(2131689823));
        ((l.a)localObject1).khU.setTextColor(this.mContext.getResources().getColor(2131689823));
        break label991;
        label1502: ((l.a)localObject1).khT.setVisibility(8);
        ((l.a)localObject1).khV.setVisibility(8);
        ((l.a)localObject1).khU.setVisibility(8);
        ((l.a)localObject1).knT.setVisibility(8);
        ((l.a)localObject1).khY.setVisibility(0);
        paramView = com.tencent.mm.plugin.card.d.l.dI(this.mContext.getResources().getColor(2131689843), this.knR);
        ((l.a)localObject1).khS.setBackgroundDrawable(paramView);
        ((l.a)localObject1).khY.setText(this.mContext.getResources().getString(2131297936));
        break label991;
        label1605: paramView = (LinearLayout.LayoutParams)((l.a)localObject1).khS.getLayoutParams();
        if (paramView.bottomMargin != 0)
        {
          paramView.bottomMargin = 0;
          ((l.a)localObject1).khS.setLayoutParams(paramView);
        }
      }
      label1641: paramView = null;
    }
  }

  public final void a(View paramView, int paramInt, View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(88670);
    paramView = (l.a)paramView.getTag();
    paramView.knS.setTag(Integer.valueOf(paramInt));
    paramView.knS.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(88670);
  }

  public final void release()
  {
    AppMethodBeat.i(88666);
    this.mContext = null;
    this.khG = null;
    if (this.khO != null)
      this.khO.clear();
    AppMethodBeat.o(88666);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.l
 * JD-Core Version:    0.6.2
 */