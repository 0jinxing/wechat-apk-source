package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import android.graphics.Matrix;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/ui/v2/CardTicketVH;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "viewType", "", "(Landroid/view/View;I)V", "bgIv", "Lcom/tencent/mm/plugin/card/widget/MemberCardTopCropImageView;", "getBgIv", "()Lcom/tencent/mm/plugin/card/widget/MemberCardTopCropImageView;", "setBgIv", "(Lcom/tencent/mm/plugin/card/widget/MemberCardTopCropImageView;)V", "descTv", "Landroid/widget/TextView;", "getDescTv", "()Landroid/widget/TextView;", "setDescTv", "(Landroid/widget/TextView;)V", "logoIv", "Lcom/tencent/mm/pluginsdk/ui/applet/CdnImageView;", "getLogoIv", "()Lcom/tencent/mm/pluginsdk/ui/applet/CdnImageView;", "setLogoIv", "(Lcom/tencent/mm/pluginsdk/ui/applet/CdnImageView;)V", "rightLabelLayout", "Landroid/widget/LinearLayout;", "getRightLabelLayout", "()Landroid/widget/LinearLayout;", "setRightLabelLayout", "(Landroid/widget/LinearLayout;)V", "shadowIv", "Landroid/widget/ImageView;", "getShadowIv", "()Landroid/widget/ImageView;", "setShadowIv", "(Landroid/widget/ImageView;)V", "titleTv", "getTitleTv", "setTitleTv", "setCardBg", "", "imageView", "url", "", "radius", "", "setModel", "model", "Lcom/tencent/mm/plugin/card/ui/v2/CardTicketListModel;", "updateCardLabelLayout", "couponLabelList", "", "Lcom/tencent/mm/protocal/protobuf/CardElementCouponLabel;", "labelLayout", "plugin-card_release"})
public final class f extends RecyclerView.v
{
  public TextView gne;
  public TextView hrg;
  public CdnImageView kqn;
  public MemberCardTopCropImageView kqo;
  public LinearLayout kqp;
  public ImageView kqq;

  public f(View paramView, int paramInt)
  {
    super(paramView);
    AppMethodBeat.i(89330);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(89330);
      while (true)
      {
        return;
        paramView = paramView.findViewById(2131822212);
        j.o(paramView, "itemView.findViewById(R.id.card_list_header_text)");
        this.gne = ((TextView)paramView);
        AppMethodBeat.o(89330);
        continue;
        localView = paramView.findViewById(2131822202);
        j.o(localView, "itemView.findViewById(R.id.clni_icon_iv)");
        this.kqn = ((CdnImageView)localView);
        localView = paramView.findViewById(2131822203);
        j.o(localView, "itemView.findViewById(R.id.clni_title_tv)");
        this.gne = ((TextView)localView);
        paramView = paramView.findViewById(2131822204);
        j.o(paramView, "itemView.findViewById(R.id.clni_desc_tv)");
        this.hrg = ((TextView)paramView);
        paramView = this.kqn;
        if (paramView == null)
          j.avw("logoIv");
        paramView.setUseSdcardCache(true);
        AppMethodBeat.o(89330);
      }
      View localView = paramView.findViewById(2131822326);
      j.o(localView, "itemView.findViewById(R.id.ctci_logo_iv)");
      this.kqn = ((CdnImageView)localView);
      localView = paramView.findViewById(2131822327);
      j.o(localView, "itemView.findViewById(R.id.ctci_title_tv)");
      this.gne = ((TextView)localView);
      localView = paramView.findViewById(2131822328);
      j.o(localView, "itemView.findViewById(R.id.ctci_desc_tv)");
      this.hrg = ((TextView)localView);
      localView = paramView.findViewById(2131822324);
      j.o(localView, "itemView.findViewById(R.id.ctci_bg_iv)");
      this.kqo = ((MemberCardTopCropImageView)localView);
      localView = paramView.findViewById(2131822325);
      j.o(localView, "itemView.findViewById(R.id.ctci_bg_shadow_iv)");
      this.kqq = ((ImageView)localView);
      paramView = paramView.findViewById(2131822329);
      j.o(paramView, "itemView.findViewById(R.….ctci_right_label_layout)");
      this.kqp = ((LinearLayout)paramView);
      paramView = this.kqn;
      if (paramView == null)
        j.avw("logoIv");
      paramView.setUseSdcardCache(true);
    }
  }

  public static void a(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(89329);
    j.p(paramImageView, "imageView");
    j.p(paramString, "url");
    Object localObject = new c.a();
    ((c.a)localObject).sD(e.eSn);
    ((c.a)localObject).a(o.ahq());
    ((c.a)localObject).sC(m.Gz(paramString));
    ((c.a)localObject).ahD();
    ((c.a)localObject).ahF();
    ((c.a)localObject).ahC();
    ((c.a)localObject).lK(2130838087);
    ((c.a)localObject).lJ(com.tencent.mm.bz.a.fromDPToPix(paramImageView.getContext(), 84));
    ((c.a)localObject).lI(com.tencent.mm.bz.a.gd(paramImageView.getContext()));
    localObject = ((c.a)localObject).ahG();
    o.ahp().a(paramString, paramImageView, (c)localObject);
    paramImageView.setImageMatrix(new Matrix());
    AppMethodBeat.o(89329);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.f
 * JD-Core Version:    0.6.2
 */