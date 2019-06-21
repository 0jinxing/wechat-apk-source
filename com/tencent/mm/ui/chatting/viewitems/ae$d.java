package com.tencent.mm.ui.chatting.viewitems;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.g;
import com.tencent.mm.at.o;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.ie;
import com.tencent.mm.g.a.jj;
import com.tencent.mm.g.a.jj.b;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.h;

final class ae$d extends c.a
{
  ImageView zci;
  TextView zfC;
  LinearLayout zgc;
  TextView zgd;
  ProgressBar zge;
  ImageView zgf;
  ProgressBar zgg;
  ImageView zgh;

  public static void a(d paramd, bi parambi, boolean paramBoolean, int paramInt, com.tencent.mm.ui.chatting.d.a parama, ae.c paramc, View.OnLongClickListener paramOnLongClickListener)
  {
    AppMethodBeat.i(33262);
    if (paramd == null)
    {
      AppMethodBeat.o(33262);
      return;
    }
    paramd.zgc.setVisibility(8);
    int i = com.tencent.mm.bz.a.fromDPToPix(parama.yTx.getContext(), 236);
    int j = com.tencent.mm.bz.a.fromDPToPix(parama.yTx.getContext(), 90);
    paramd.zgd.setMaxLines(1);
    paramd.zfC.setMaxLines(1);
    paramd.zfC.setText("");
    Object localObject1;
    Object localObject2;
    if (d.afj("location"))
    {
      ab.d("MicroMsg.LocationItemHolder", "plugin found!");
      localObject1 = new jj();
      ((jj)localObject1).cEF.cEA = 1;
      ((jj)localObject1).cEF.csG = parambi;
      com.tencent.mm.sdk.b.a.xxA.m((b)localObject1);
      localObject2 = ((jj)localObject1).cEG.cBp;
      localObject1 = ((jj)localObject1).cEG.cEI;
      if (((localObject2 == null) && (!b((String)localObject1, parama))) || ((localObject2 != null) && (((String)localObject2).equals("")) && (!b((String)localObject1, parama))) || ((localObject2 != null) && (((String)localObject2).equals("err_not_started"))))
      {
        ab.d("MicroMsg.LocationItemHolder", "info error or subcore not started!");
        paramd.zgg.setVisibility(8);
        paramd.zgc.setVisibility(0);
        paramd.zgd.setText(2131300970);
        paramd.zfC.setText("");
      }
    }
    while (true)
    {
      paramd.zgf.setImageBitmap(o.ahl().g(i, j, paramBoolean));
      localObject2 = new ie();
      ((ie)localObject2).cDf.csG = parambi;
      ((ie)localObject2).cDf.w = i;
      ((ie)localObject2).cDf.h = j;
      ((ie)localObject2).cDf.cDk = 2130839489;
      ((ie)localObject2).cDf.cDh = paramd.zgf;
      ((ie)localObject2).cDf.cDj = paramd.zge;
      ((ie)localObject2).cDf.cDi = paramd.zgh;
      com.tencent.mm.sdk.b.a.xxA.m((b)localObject2);
      paramd.jPL.setTag(new ay(parambi, parama.dFx(), paramInt, null, '\000'));
      paramd.jPL.setOnClickListener(paramc);
      paramd.jPL.setOnLongClickListener(paramOnLongClickListener);
      paramd.jPL.setOnTouchListener(((h)parama.aF(h.class)).dCZ());
      AppMethodBeat.o(33262);
      break;
      paramd.zgg.setVisibility(8);
      paramd.zgc.setVisibility(0);
      ab.d("MicroMsg.LocationItemHolder", "location info : ".concat(String.valueOf(localObject2)));
      if (b((String)localObject1, parama))
      {
        paramd.zgd.setVisibility(0);
        paramd.zgd.setText((CharSequence)localObject1);
        if ((localObject2 == null) || (((String)localObject2).equals("")))
        {
          paramd.zfC.setVisibility(8);
        }
        else
        {
          paramd.zfC.setVisibility(0);
          paramd.zfC.setText((CharSequence)localObject2);
        }
      }
      else
      {
        paramd.zgd.setMaxLines(2);
        paramd.zgd.setText(String.valueOf(localObject2));
        paramd.zfC.setVisibility(8);
        continue;
        paramd.zge.setVisibility(0);
        paramd.zgc.setVisibility(8);
      }
    }
  }

  private static boolean b(String paramString, com.tencent.mm.ui.chatting.d.a parama)
  {
    AppMethodBeat.i(33263);
    boolean bool;
    if ((paramString != null) && (!paramString.equals("")) && (!paramString.equals(parama.yTx.getMMResources().getString(2131300987))))
    {
      bool = true;
      AppMethodBeat.o(33263);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(33263);
    }
  }

  public final c.a z(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(33261);
    super.eP(paramView);
    this.enf = ((TextView)paramView.findViewById(2131820587));
    this.zfC = ((TextView)paramView.findViewById(2131822610));
    this.zgd = ((TextView)paramView.findViewById(2131822609));
    this.zgc = ((LinearLayout)paramView.findViewById(2131822608));
    this.zge = ((ProgressBar)paramView.findViewById(2131822172));
    this.jPL = paramView.findViewById(2131822515);
    this.qkY = ((TextView)paramView.findViewById(2131821102));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.iVh = paramView.findViewById(2131820586);
    this.zgf = ((ImageView)paramView.findViewById(2131822612));
    this.zgg = ((ProgressBar)paramView.findViewById(2131822611));
    this.zgh = ((ImageView)paramView.findViewById(2131822613));
    if (!paramBoolean)
    {
      this.zby = ((ImageView)paramView.findViewById(2131822629));
      this.zci = ((ImageView)paramView.findViewById(2131822661));
    }
    this.zgd.setTextSize(1, 16.0F);
    this.zfC.setTextSize(1, 12.0F);
    AppMethodBeat.o(33261);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ae.d
 * JD-Core Version:    0.6.2
 */