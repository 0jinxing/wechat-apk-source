package com.tencent.mm.plugin.nearby.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bn.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.storage.bf;
import com.tencent.mm.storage.bg;
import com.tencent.mm.storage.bi.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.p;

final class NearbySayHiListUI$a extends p<bf>
{
  private MMActivity crP;
  protected MMSlideDelView.g jJO;
  protected MMSlideDelView.c jJP;
  protected MMSlideDelView.d jJR;
  int limit;
  private bg oQI;
  protected MMSlideDelView.f oQS;

  public NearbySayHiListUI$a(NearbySayHiListUI paramNearbySayHiListUI, Context paramContext, bg parambg, int paramInt)
  {
    super(paramContext, new bf());
    AppMethodBeat.i(55508);
    this.limit = -1;
    this.jJR = MMSlideDelView.getItemStatusCallBack();
    this.crP = ((MMActivity)paramContext);
    this.limit = paramInt;
    this.oQI = parambg;
    AppMethodBeat.o(55508);
  }

  public final void KC()
  {
    AppMethodBeat.i(55510);
    if (a.dgL())
      setCursor(this.oQI.Mq(this.limit));
    while (true)
    {
      super.notifyDataSetChanged();
      AppMethodBeat.o(55510);
      return;
      setCursor(this.oQI.xm(this.limit));
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(55509);
    KC();
    AppMethodBeat.o(55509);
  }

  public final void a(MMSlideDelView.f paramf)
  {
    this.oQS = paramf;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(55511);
    bf localbf = (bf)getItem(paramInt);
    if (paramView == null)
    {
      paramViewGroup = new NearbySayHiListUI.a.a(this);
      paramView = (MMSlideDelView)View.inflate(this.crP, 2130968832, null);
      localObject = View.inflate(this.crP, 2130970535, null);
      paramViewGroup.eks = ((ImageView)((View)localObject).findViewById(2131823840));
      paramViewGroup.gtG = ((TextView)((View)localObject).findViewById(2131827176));
      paramViewGroup.ooM = ((TextView)((View)localObject).findViewById(2131827177));
      paramViewGroup.jJW = paramView.findViewById(2131821704);
      paramViewGroup.jJX = ((TextView)paramView.findViewById(2131821082));
      paramView.setView((View)localObject);
      paramView.setPerformItemClickListener(this.jJO);
      paramView.setGetViewPositionCallback(this.jJP);
      paramView.setItemStatusCallBack(this.jJR);
      paramView.setEnable(false);
      paramView.setTag(paramViewGroup);
      if (localbf.field_flag == 0)
        break label289;
    }
    label289: for (Object localObject = bi.d.apF(localbf.field_content).nickname; ; localObject = localbf.field_talker)
    {
      paramViewGroup.gtG.setText(j.b(this.crP, (CharSequence)localObject, paramViewGroup.gtG.getTextSize()));
      paramViewGroup.ooM.setText(j.b(this.crP, localbf.field_sayhicontent, paramViewGroup.ooM.getTextSize()));
      paramViewGroup.jJW.setTag(Long.valueOf(localbf.field_svrid));
      paramViewGroup.jJW.setOnClickListener(new NearbySayHiListUI.a.1(this));
      a.b.b(paramViewGroup.eks, localbf.field_sayhiuser);
      AppMethodBeat.o(55511);
      return paramView;
      paramViewGroup = (NearbySayHiListUI.a.a)paramView.getTag();
      break;
    }
  }

  public final void setGetViewPositionCallback(MMSlideDelView.c paramc)
  {
    this.jJP = paramc;
  }

  public final void setPerformItemClickListener(MMSlideDelView.g paramg)
  {
    this.jJO = paramg;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.a
 * JD-Core Version:    0.6.2
 */