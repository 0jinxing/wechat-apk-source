package com.tencent.mm.plugin.shake.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.storage.bi.d;
import com.tencent.mm.storage.bt;
import com.tencent.mm.storage.bu;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.p;

final class b extends p<bt>
{
  private MMActivity crP;
  protected MMSlideDelView.g jJO;
  protected MMSlideDelView.c jJP;
  protected MMSlideDelView.d jJR;
  private int limit;
  protected MMSlideDelView.f oQS;
  private bu qui;

  public b(Context paramContext, bu parambu, int paramInt)
  {
    super(paramContext, new bt());
    AppMethodBeat.i(24701);
    this.limit = -1;
    this.jJR = MMSlideDelView.getItemStatusCallBack();
    this.crP = ((MMActivity)paramContext);
    this.limit = paramInt;
    this.qui = parambu;
    AppMethodBeat.o(24701);
  }

  public final void CA(int paramInt)
  {
    AppMethodBeat.i(24702);
    bIf();
    this.limit = paramInt;
    KC();
    AppMethodBeat.o(24702);
  }

  public final void KC()
  {
    AppMethodBeat.i(24704);
    setCursor(this.qui.xm(this.limit));
    super.notifyDataSetChanged();
    AppMethodBeat.o(24704);
  }

  public final void KD()
  {
    AppMethodBeat.i(24703);
    KC();
    AppMethodBeat.o(24703);
  }

  public final void a(MMSlideDelView.f paramf)
  {
    this.oQS = paramf;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(24705);
    bt localbt = (bt)getItem(paramInt);
    Object localObject;
    if (paramView == null)
    {
      paramView = (MMSlideDelView)View.inflate(this.crP, 2130968832, null);
      paramViewGroup = new b.a();
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
    }
    while (true)
    {
      paramViewGroup.jJW.setTag(Long.valueOf(localbt.field_svrid));
      paramViewGroup.jJW.setOnClickListener(new b.1(this));
      localObject = bi.d.apF(localbt.field_content);
      paramViewGroup.gtG.setText(j.b(this.crP, ((bi.d)localObject).getDisplayName(), paramViewGroup.gtG.getTextSize()));
      paramViewGroup.ooM.setText(localbt.field_sayhicontent);
      a.b.b(paramViewGroup.eks, localbt.field_sayhiuser);
      AppMethodBeat.o(24705);
      return paramView;
      paramViewGroup = (b.a)paramView.getTag();
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.b
 * JD-Core Version:    0.6.2
 */