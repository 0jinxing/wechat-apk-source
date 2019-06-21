package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.v;
import a.y;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView.v;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.card.ui.CardDetailUI;
import com.tencent.mm.plugin.card.widget.CardTagTextView;
import com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.np;
import com.tencent.mm.protocal.protobuf.nq;
import com.tencent.mm.protocal.protobuf.nr;
import com.tencent.mm.protocal.protobuf.ns;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "viewType", "", "(Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI;Landroid/view/View;I)V", "chpiCouponLayout", "Landroid/widget/LinearLayout;", "getChpiCouponLayout", "()Landroid/widget/LinearLayout;", "setChpiCouponLayout", "(Landroid/widget/LinearLayout;)V", "chpiDescTv", "Landroid/widget/TextView;", "getChpiDescTv", "()Landroid/widget/TextView;", "setChpiDescTv", "(Landroid/widget/TextView;)V", "chpiExpandIv", "Landroid/widget/ImageView;", "getChpiExpandIv", "()Landroid/widget/ImageView;", "setChpiExpandIv", "(Landroid/widget/ImageView;)V", "chpiExpandLayout", "getChpiExpandLayout", "setChpiExpandLayout", "chpiExpandTv", "getChpiExpandTv", "setChpiExpandTv", "chpiHeaderLayout", "getChpiHeaderLayout", "setChpiHeaderLayout", "chpiLabelLayout", "getChpiLabelLayout", "setChpiLabelLayout", "chpiLogoIv", "Lcom/tencent/mm/pluginsdk/ui/applet/CdnImageView;", "getChpiLogoIv", "()Lcom/tencent/mm/pluginsdk/ui/applet/CdnImageView;", "setChpiLogoIv", "(Lcom/tencent/mm/pluginsdk/ui/applet/CdnImageView;)V", "chpiMchLabelTv", "Lcom/tencent/mm/plugin/card/ui/v2/CardLabelTextView;", "getChpiMchLabelTv", "()Lcom/tencent/mm/plugin/card/ui/v2/CardLabelTextView;", "setChpiMchLabelTv", "(Lcom/tencent/mm/plugin/card/ui/v2/CardLabelTextView;)V", "chpiNameTv", "getChpiNameTv", "setChpiNameTv", "chtiDescTv", "getChtiDescTv", "setChtiDescTv", "chtiIconIv", "getChtiIconIv", "setChtiIconIv", "chtiRightIv", "getChtiRightIv", "setChtiRightIv", "chtiTitleTv", "getChtiTitleTv", "setChtiTitleTv", "model", "Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$CardListModel;", "Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI;", "getModel", "()Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$CardListModel;", "setModel", "(Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$CardListModel;)V", "sectionTitleTv", "getSectionTitleTv", "setSectionTitleTv", "addCouponView", "", "view", "appendCouponView", "offset", "len", "position", "collapseCouponLayout", "expandCouponLayout", "gotoCardDetailUI", "cardId", "", "setCardBg", "imageView", "url", "radius", "", "useBackendExpandState", "", "showCollapseLayout", "showExpandLayout", "showMiniAppLayout", "updateCardLabelLayout", "couponLabelList", "", "Lcom/tencent/mm/protocal/protobuf/CardElementCouponLabel;", "labelLayout", "labelList", "Lcom/tencent/mm/protocal/protobuf/CardElementMchLabel;", "updateExpandLayout", "isExpended", "plugin-card_release"})
public final class CardHomePageNewUI$e extends RecyclerView.v
{
  public TextView koZ;
  public CdnImageView kpa;
  public TextView kpb;
  public TextView kpc;
  public LinearLayout kpd;
  public LinearLayout kpe;
  public LinearLayout kpf;
  public LinearLayout kpg;
  public TextView kph;
  public ImageView kpi;
  public CardLabelTextView kpj;
  public ImageView kpk;
  public TextView kpl;
  public TextView kpm;
  public ImageView kpn;
  CardHomePageNewUI.a kpo;

  public CardHomePageNewUI$e(View paramView, int paramInt)
  {
    super(paramInt);
    AppMethodBeat.i(89210);
    int i;
    switch (i)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(89210);
      while (true)
      {
        return;
        paramView = paramInt.findViewById(2131822148);
        j.o(paramView, "itemView.findViewById(R.id.chpi_logo_iv)");
        this.kpa = ((CdnImageView)paramView);
        paramView = paramInt.findViewById(2131822150);
        j.o(paramView, "itemView.findViewById(R.id.chpi_username_tv)");
        this.kpb = ((TextView)paramView);
        paramView = paramInt.findViewById(2131822152);
        j.o(paramView, "itemView.findViewById(R.id.chpi_desc_tv)");
        this.kpc = ((TextView)paramView);
        paramView = paramInt.findViewById(2131822167);
        j.o(paramView, "itemView.findViewById(R.id.chpi_label_layout)");
        this.kpe = ((LinearLayout)paramView);
        paramView = paramInt.findViewById(2131822168);
        j.o(paramView, "itemView.findViewById(R.id.chpi_coupon_layout)");
        this.kpf = ((LinearLayout)paramView);
        paramView = paramInt.findViewById(2131822169);
        j.o(paramView, "itemView.findViewById(R.id.chpi_expand_layout)");
        this.kpg = ((LinearLayout)paramView);
        paramView = paramInt.findViewById(2131822171);
        j.o(paramView, "itemView.findViewById(R.id.chpi_expand_iv)");
        this.kpi = ((ImageView)paramView);
        paramView = paramInt.findViewById(2131822170);
        j.o(paramView, "itemView.findViewById(R.id.chpi_expand_tv)");
        this.kph = ((TextView)paramView);
        paramView = paramInt.findViewById(2131822151);
        j.o(paramView, "itemView.findViewById(R.id.chpi_mch_label_tv)");
        this.kpj = ((CardLabelTextView)paramView);
        paramView = paramInt.findViewById(2131822166);
        j.o(paramView, "itemView.findViewById(R.id.chpi_header_layout)");
        this.kpd = ((LinearLayout)paramView);
        paramView = this.kpa;
        if (paramView == null)
          j.avw("chpiLogoIv");
        paramView.setUseSdcardCache(true);
        AppMethodBeat.o(89210);
        continue;
        paramView = paramInt.findViewById(2131822173);
        j.o(paramView, "itemView.findViewById(R.id.chpi_section_title)");
        this.koZ = ((TextView)paramView);
        AppMethodBeat.o(89210);
        continue;
        paramView = paramInt.findViewById(2131822148);
        j.o(paramView, "itemView.findViewById(R.id.chpi_logo_iv)");
        this.kpa = ((CdnImageView)paramView);
        paramView = paramInt.findViewById(2131822150);
        j.o(paramView, "itemView.findViewById(R.id.chpi_username_tv)");
        this.kpb = ((TextView)paramView);
        paramView = paramInt.findViewById(2131822152);
        j.o(paramView, "itemView.findViewById(R.id.chpi_desc_tv)");
        this.kpc = ((TextView)paramView);
        paramView = paramInt.findViewById(2131822151);
        j.o(paramView, "itemView.findViewById(R.id.chpi_mch_label_tv)");
        this.kpj = ((CardLabelTextView)paramView);
        paramView = this.kpa;
        if (paramView == null)
          j.avw("chpiLogoIv");
        paramView.setUseSdcardCache(true);
        AppMethodBeat.o(89210);
        continue;
        paramView = paramInt.findViewById(2131822148);
        j.o(paramView, "itemView.findViewById(R.id.chpi_logo_iv)");
        this.kpa = ((CdnImageView)paramView);
        paramView = paramInt.findViewById(2131822150);
        j.o(paramView, "itemView.findViewById(R.id.chpi_username_tv)");
        this.kpb = ((TextView)paramView);
        paramView = paramInt.findViewById(2131822152);
        j.o(paramView, "itemView.findViewById(R.id.chpi_desc_tv)");
        this.kpc = ((TextView)paramView);
        paramView = this.kpa;
        if (paramView == null)
          j.avw("chpiLogoIv");
        paramView.setUseSdcardCache(true);
        AppMethodBeat.o(89210);
        continue;
        paramView = paramInt.findViewById(2131822153);
        j.o(paramView, "itemView.findViewById(R.id.chti_icon_iv)");
        this.kpk = ((ImageView)paramView);
        paramView = paramInt.findViewById(2131822154);
        j.o(paramView, "itemView.findViewById(R.id.chti_title_tv)");
        this.kpl = ((TextView)paramView);
        paramView = paramInt.findViewById(2131822155);
        j.o(paramView, "itemView.findViewById(R.id.chti_desc_tv)");
        this.kpm = ((TextView)paramView);
        paramView = paramInt.findViewById(2131822156);
        j.o(paramView, "itemView.findViewById(R.id.chti_right_iv)");
        this.kpn = ((ImageView)paramView);
        AppMethodBeat.o(89210);
      }
      paramView = paramInt.findViewById(2131822153);
      j.o(paramView, "itemView.findViewById(R.id.chti_icon_iv)");
      this.kpk = ((ImageView)paramView);
      paramView = paramInt.findViewById(2131822154);
      j.o(paramView, "itemView.findViewById(R.id.chti_title_tv)");
      this.kpl = ((TextView)paramView);
      paramView = paramInt.findViewById(2131822155);
      j.o(paramView, "itemView.findViewById(R.id.chti_desc_tv)");
      this.kpm = ((TextView)paramView);
      paramView = paramInt.findViewById(2131822156);
      j.o(paramView, "itemView.findViewById(R.id.chti_right_iv)");
      this.kpn = ((ImageView)paramView);
    }
  }

  private final void P(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(89201);
    Object localObject1 = this.kpo;
    if (localObject1 == null)
      j.dWJ();
    localObject1 = ((CardHomePageNewUI.a)localObject1).koU;
    if (localObject1 == null)
      j.dWJ();
    Object localObject2 = ((ns)localObject1).vTa;
    j.o(localObject2, "el!!.card_element_coupon_list");
    localObject2 = ((Iterable)localObject2).iterator();
    int i = 0;
    int j = 0;
    if (((Iterator)localObject2).hasNext())
    {
      nq localnq = (nq)((Iterator)localObject2).next();
      int k = j;
      if (i >= paramInt1)
      {
        if (localnq.vSE != 1)
          break label484;
        localObject3 = this.kpf;
        if (localObject3 == null)
          j.avw("chpiCouponLayout");
        localObject3 = LayoutInflater.from(((LinearLayout)localObject3).getContext());
        localObject4 = this.kpf;
        if (localObject4 == null)
          j.avw("chpiCouponLayout");
        localObject3 = ((LayoutInflater)localObject3).inflate(2130968932, (ViewGroup)localObject4, false);
        if (localObject3 == null)
        {
          localObject1 = new v("null cannot be cast to non-null type android.view.ViewGroup");
          AppMethodBeat.o(89201);
          throw ((Throwable)localObject1);
        }
        localObject3 = (ViewGroup)localObject3;
        localObject5 = (TextView)((ViewGroup)localObject3).findViewById(2131822159);
        localObject6 = (CdnImageView)((ViewGroup)localObject3).findViewById(2131822162);
        localObject7 = (TextView)((ViewGroup)localObject3).findViewById(2131822160);
        localObject4 = (LinearLayout)((ViewGroup)localObject3).findViewById(2131822161);
        if (!bo.isNullOrNil(localnq.vSH))
          ((TextView)localObject5).setTextColor(com.tencent.mm.plugin.card.d.l.bT(localnq.vSH, localnq.vSI));
        j.o(localObject5, "titleTv");
        ((TextView)localObject5).setText((CharSequence)localnq.vSy);
        ((CdnImageView)localObject6).setUrl(localnq.vSF);
        if (!bo.isNullOrNil(localnq.vSJ))
          ((TextView)localObject7).setTextColor(com.tencent.mm.plugin.card.d.l.bT(localnq.vSJ, localnq.vSK));
        j.o(localObject7, "descTv");
        ((TextView)localObject7).setText((CharSequence)localnq.vSz);
        localObject6 = localnq.vSD;
        j.o(localObject6, "coupon.coupon_label");
        localObject6 = (List)localObject6;
        j.o(localObject4, "labelLayout");
        a((List)localObject6, (LinearLayout)localObject4);
        localObject4 = this.kpf;
        if (localObject4 == null)
          j.avw("chpiCouponLayout");
        ((ViewGroup)localObject3).setOnClickListener((View.OnClickListener)new CardHomePageNewUI.e.a(this, (ns)localObject1, localnq, ((LinearLayout)localObject4).getChildCount(), paramInt3));
        db((View)localObject3);
      }
      label484: 
      while (localnq.vSE != 2)
      {
        k = j;
        if (paramInt2 > 0)
        {
          k = j + 1;
          if (k >= paramInt2)
            break label1078;
        }
        i++;
        j = k;
        break;
      }
      Object localObject3 = this.kpf;
      if (localObject3 == null)
        j.avw("chpiCouponLayout");
      Object localObject4 = LayoutInflater.from(((LinearLayout)localObject3).getContext());
      localObject3 = this.kpf;
      if (localObject3 == null)
        j.avw("chpiCouponLayout");
      localObject3 = ((LayoutInflater)localObject4).inflate(2130968931, (ViewGroup)localObject3, false);
      if (localObject3 == null)
      {
        localObject1 = new v("null cannot be cast to non-null type android.view.ViewGroup");
        AppMethodBeat.o(89201);
        throw ((Throwable)localObject1);
      }
      localObject3 = (ViewGroup)localObject3;
      Object localObject5 = (TextView)((ViewGroup)localObject3).findViewById(2131822159);
      Object localObject8 = (TextView)((ViewGroup)localObject3).findViewById(2131822160);
      localObject4 = (LinearLayout)((ViewGroup)localObject3).findViewById(2131822161);
      Object localObject7 = (MemberCardTopCropImageView)((ViewGroup)localObject3).findViewById(2131822157);
      Object localObject6 = (ImageView)((ViewGroup)localObject3).findViewById(2131822158);
      if (!bo.isNullOrNil(localnq.vSH))
        ((TextView)localObject5).setTextColor(com.tencent.mm.plugin.card.d.l.bT(localnq.vSH, localnq.vSI));
      j.o(localObject5, "titleTv");
      ((TextView)localObject5).setText((CharSequence)localnq.vSy);
      j.o(localObject8, "descTv");
      ((TextView)localObject8).setText((CharSequence)localnq.vSz);
      j.o(localObject7, "bgIv");
      ((MemberCardTopCropImageView)localObject7).setRadius(com.tencent.mm.bz.a.fromDPToPix(((MemberCardTopCropImageView)localObject7).getContext(), 2));
      if (!bo.isNullOrNil(localnq.vSC))
      {
        localObject7 = (ImageView)localObject7;
        localObject5 = localnq.vSC;
        j.o(localObject5, "coupon.coupon_back_url");
        j.p(localObject7, "imageView");
        j.p(localObject5, "url");
        localObject8 = new c.a();
        ((c.a)localObject8).sD(e.eSn);
        ((c.a)localObject8).a(o.ahq());
        ((c.a)localObject8).sC(com.tencent.mm.plugin.card.model.m.Gz((String)localObject5));
        ((c.a)localObject8).ahD();
        ((c.a)localObject8).ahF();
        ((c.a)localObject8).ahC();
        ((c.a)localObject8).lK(2130838087);
        ((c.a)localObject8).lJ(com.tencent.mm.bz.a.fromDPToPix(((ImageView)localObject7).getContext(), 84));
        ((c.a)localObject8).lI(com.tencent.mm.bz.a.gd(((ImageView)localObject7).getContext()));
        localObject8 = ((c.a)localObject8).ahG();
        o.ahp().a((String)localObject5, (ImageView)localObject7, (c)localObject8);
        ((ImageView)localObject7).setImageMatrix(new Matrix());
        j.o(localObject6, "shadowBgIv");
        ((ImageView)localObject6).setVisibility(0);
      }
      while (true)
      {
        localObject6 = localnq.vSD;
        j.o(localObject6, "coupon.coupon_label");
        localObject6 = (List)localObject6;
        j.o(localObject4, "labelLayout");
        a((List)localObject6, (LinearLayout)localObject4);
        localObject4 = this.kpf;
        if (localObject4 == null)
          j.avw("chpiCouponLayout");
        ((ViewGroup)localObject3).setOnClickListener((View.OnClickListener)new CardHomePageNewUI.e.b(this, (ns)localObject1, localnq, ((LinearLayout)localObject4).getChildCount(), paramInt3));
        db((View)localObject3);
        break;
        if (!bo.isNullOrNil(localnq.vSB))
        {
          ((MemberCardTopCropImageView)localObject7).setImageDrawable((Drawable)new ColorDrawable(Color.parseColor(localnq.vSB)));
          j.o(localObject6, "shadowBgIv");
          ((ImageView)localObject6).setVisibility(0);
        }
      }
    }
    label1078: AppMethodBeat.o(89201);
  }

  private void a(List<? extends np> paramList, LinearLayout paramLinearLayout)
  {
    AppMethodBeat.i(89205);
    j.p(paramList, "couponLabelList");
    j.p(paramLinearLayout, "labelLayout");
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      paramList = (np)localIterator.next();
      Object localObject1 = this.kpf;
      if (localObject1 == null)
        j.avw("chpiCouponLayout");
      localObject1 = new CardTagTextView(((LinearLayout)localObject1).getContext());
      Object localObject2 = this.kpf;
      if (localObject2 == null)
        j.avw("chpiCouponLayout");
      localObject2 = ((LinearLayout)localObject2).getContext();
      ((CardTagTextView)localObject1).setMinHeight(com.tencent.mm.bz.a.fromDPToPix((Context)localObject2, 18));
      ((CardTagTextView)localObject1).setMinWidth(com.tencent.mm.bz.a.fromDPToPix((Context)localObject2, 56));
      int i = com.tencent.mm.bz.a.fromDPToPix((Context)localObject2, 8);
      int j = com.tencent.mm.bz.a.fromDPToPix((Context)localObject2, 4);
      ((CardTagTextView)localObject1).setPadding(i, j, i, j);
      ((CardTagTextView)localObject1).setText((CharSequence)paramList.vSs);
      ((CardTagTextView)localObject1).setTextSize(1, 10.0F);
      if (!bo.isNullOrNil(paramList.vSt))
      {
        ((CardTagTextView)localObject1).setTextColor(Color.parseColor(paramList.vSt));
        label198: if (bo.isNullOrNil(paramList.vSu))
          break label245;
        ((CardTagTextView)localObject1).setFillColor(com.tencent.mm.plugin.card.d.l.bT(paramList.vSu, paramList.vSx));
      }
      while (true)
      {
        paramLinearLayout.addView((View)localObject1);
        break;
        ((CardTagTextView)localObject1).setTextColor(-1);
        break label198;
        label245: ((CardTagTextView)localObject1).setFillColor(com.tencent.mm.plugin.card.d.l.dJ(-16777216, 26));
      }
    }
    AppMethodBeat.o(89205);
  }

  private void bi(List<? extends nr> paramList)
  {
    AppMethodBeat.i(89204);
    j.p(paramList, "labelList");
    Object localObject1 = this.kpe;
    if (localObject1 == null)
      j.avw("chpiLabelLayout");
    ((LinearLayout)localObject1).removeAllViews();
    if (paramList.isEmpty())
    {
      paramList = this.kpe;
      if (paramList == null)
        j.avw("chpiLabelLayout");
      paramList.setVisibility(8);
      AppMethodBeat.o(89204);
    }
    while (true)
    {
      return;
      paramList = ((Iterable)paramList).iterator();
      int i = 0;
      if (paramList.hasNext())
      {
        Object localObject2 = (nr)paramList.next();
        localObject1 = this.kpe;
        if (localObject1 == null)
          j.avw("chpiLabelLayout");
        localObject1 = ((LinearLayout)localObject1).getContext();
        j.o(localObject1, "chpiLabelLayout.context");
        localObject1 = new CardLabelTextView((Context)localObject1);
        Object localObject3 = this.kpe;
        if (localObject3 == null)
          j.avw("chpiLabelLayout");
        localObject3 = ((LinearLayout)localObject3).getContext();
        ((CardLabelTextView)localObject1).setTextSize(1, 12.0F);
        ((CardLabelTextView)localObject1).setText((CharSequence)((nr)localObject2).vSL);
        int j = com.tencent.mm.bz.a.fromDPToPix((Context)localObject3, 4);
        ((CardLabelTextView)localObject1).setPadding(j, 0, j, 0);
        ((CardLabelTextView)localObject1).setGravity(16);
        if (!bo.isNullOrNil(((nr)localObject2).vSM))
        {
          ((CardLabelTextView)localObject1).setTextColor(Color.parseColor(((nr)localObject2).vSM));
          label228: if (bo.isNullOrNil(((nr)localObject2).vSN))
            break label343;
          ((CardLabelTextView)localObject1).setFillColor(com.tencent.mm.plugin.card.d.l.bT(((nr)localObject2).vSN, ((nr)localObject2).vSQ));
          label256: if (i <= 0)
            break label351;
          localObject2 = new ViewGroup.MarginLayoutParams(-2, -2);
          ((ViewGroup.MarginLayoutParams)localObject2).leftMargin = com.tencent.mm.bz.a.fromDPToPix((Context)localObject3, 4);
          localObject2 = (ViewGroup.MarginLayoutParams)new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams)localObject2);
          localObject3 = this.kpe;
          if (localObject3 == null)
            j.avw("chpiLabelLayout");
          ((LinearLayout)localObject3).addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
        }
        while (true)
        {
          i++;
          break;
          ((CardLabelTextView)localObject1).setTextColor(-1);
          break label228;
          label343: ((CardLabelTextView)localObject1).setFillColor(0);
          break label256;
          label351: localObject2 = this.kpe;
          if (localObject2 == null)
            j.avw("chpiLabelLayout");
          ((LinearLayout)localObject2).addView((View)localObject1);
        }
      }
      paramList = this.kpe;
      if (paramList == null)
        j.avw("chpiLabelLayout");
      paramList.setVisibility(0);
      AppMethodBeat.o(89204);
    }
  }

  private void db(View paramView)
  {
    AppMethodBeat.i(89203);
    j.p(paramView, "view");
    LinearLayout localLinearLayout = this.kpf;
    if (localLinearLayout == null)
      j.avw("chpiCouponLayout");
    if (localLinearLayout.getChildCount() == 0)
    {
      localLinearLayout = this.kpf;
      if (localLinearLayout == null)
        j.avw("chpiCouponLayout");
      localLinearLayout.addView(paramView);
      AppMethodBeat.o(89203);
    }
    while (true)
    {
      return;
      localLinearLayout = this.kpf;
      if (localLinearLayout == null)
        j.avw("chpiCouponLayout");
      ViewGroup.MarginLayoutParams localMarginLayoutParams = new ViewGroup.MarginLayoutParams(-1, com.tencent.mm.bz.a.fromDPToPix(localLinearLayout.getContext(), 84));
      localLinearLayout = this.kpf;
      if (localLinearLayout == null)
        j.avw("chpiCouponLayout");
      localMarginLayoutParams.topMargin = com.tencent.mm.bz.a.fromDPToPix(localLinearLayout.getContext(), 8);
      localMarginLayoutParams = (ViewGroup.MarginLayoutParams)new LinearLayout.LayoutParams(localMarginLayoutParams);
      localLinearLayout = this.kpf;
      if (localLinearLayout == null)
        j.avw("chpiCouponLayout");
      localLinearLayout.addView(paramView, (ViewGroup.LayoutParams)localMarginLayoutParams);
      AppMethodBeat.o(89203);
    }
  }

  private final void o(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(89209);
    Object localObject = this.kpo;
    if (localObject == null)
      j.dWJ();
    localObject = ((CardHomePageNewUI.a)localObject).koU;
    if (paramBoolean)
      if (localObject != null)
      {
        localObject = ((ns)localObject).vTb;
        if (bo.isNullOrNil((String)localObject))
          break label60;
        ti(paramInt);
        AppMethodBeat.o(89209);
      }
    while (true)
    {
      return;
      localObject = null;
      break;
      label60: tk(paramInt);
      AppMethodBeat.o(89209);
      continue;
      tj(paramInt);
      AppMethodBeat.o(89209);
    }
  }

  private final void ti(int paramInt)
  {
    AppMethodBeat.i(89206);
    Object localObject1 = this.kpo;
    if (localObject1 == null)
      j.dWJ();
    localObject1 = ((CardHomePageNewUI.a)localObject1).koU;
    if (localObject1 == null)
      j.dWJ();
    if (!bo.isNullOrNil(((ns)localObject1).vTb))
    {
      if (!bo.isNullOrNil(((ns)localObject1).vTc))
      {
        localObject2 = this.kph;
        if (localObject2 == null)
          j.avw("chpiExpandTv");
        ((TextView)localObject2).setTextColor(Color.parseColor(((ns)localObject1).vTc));
      }
      Object localObject2 = this.kph;
      if (localObject2 == null)
        j.avw("chpiExpandTv");
      ((TextView)localObject2).setText((CharSequence)((ns)localObject1).vTb);
      localObject2 = this.kpi;
      if (localObject2 == null)
        j.avw("chpiExpandIv");
      ((ImageView)localObject2).setImageResource(2130838062);
      localObject2 = this.kpg;
      if (localObject2 == null)
        j.avw("chpiExpandLayout");
      ((LinearLayout)localObject2).setOnClickListener((View.OnClickListener)new CardHomePageNewUI.e.h((ns)localObject1, this, paramInt));
    }
    AppMethodBeat.o(89206);
  }

  private final void tj(final int paramInt)
  {
    AppMethodBeat.i(89207);
    Object localObject1 = this.kpo;
    if (localObject1 == null)
      j.dWJ();
    localObject1 = ((CardHomePageNewUI.a)localObject1).koU;
    TextView localTextView = this.kph;
    if (localTextView == null)
      j.avw("chpiExpandTv");
    Object localObject2 = ah.getResources();
    if (localObject1 == null)
      j.dWJ();
    localTextView.setText((CharSequence)((Resources)localObject2).getString(2131297880, new Object[] { Integer.valueOf(((ns)localObject1).vTg - ((ns)localObject1).vTh) }));
    localObject2 = this.kpg;
    if (localObject2 == null)
      j.avw("chpiExpandLayout");
    ((LinearLayout)localObject2).setOnClickListener((View.OnClickListener)new g(this, paramInt, (ns)localObject1));
    localObject1 = this.kpi;
    if (localObject1 == null)
      j.avw("chpiExpandIv");
    ((ImageView)localObject1).setImageResource(2130838120);
    localObject1 = this.kpi;
    if (localObject1 == null)
      j.avw("chpiExpandIv");
    ((ImageView)localObject1).setVisibility(0);
    AppMethodBeat.o(89207);
  }

  private final void tk(int paramInt)
  {
    AppMethodBeat.i(89208);
    Object localObject1 = this.kpo;
    if (localObject1 == null)
      j.dWJ();
    localObject1 = ((CardHomePageNewUI.a)localObject1).koU;
    Object localObject2 = this.kph;
    if (localObject2 == null)
      j.avw("chpiExpandTv");
    ((TextView)localObject2).setText((CharSequence)ah.getResources().getString(2131297878));
    localObject2 = this.kpg;
    if (localObject2 == null)
      j.avw("chpiExpandLayout");
    ((LinearLayout)localObject2).setOnClickListener((View.OnClickListener)new CardHomePageNewUI.e.f(this, paramInt, (ns)localObject1));
    localObject1 = this.kpi;
    if (localObject1 == null)
      j.avw("chpiExpandIv");
    ((ImageView)localObject1).setImageResource(2130838121);
    localObject1 = this.kpi;
    if (localObject1 == null)
      j.avw("chpiExpandIv");
    ((ImageView)localObject1).setVisibility(0);
    AppMethodBeat.o(89208);
  }

  public final void GY(String paramString)
  {
    AppMethodBeat.i(89202);
    j.p(paramString, "cardId");
    ab.i("MicroMsg.CardHomePageNewUI", "go to card detail: %s", new Object[] { paramString });
    Object localObject = this.apJ;
    j.o(localObject, "itemView");
    localObject = new Intent(((View)localObject).getContext(), CardDetailUI.class);
    ((Intent)localObject).putExtra("key_card_id", paramString);
    ((Intent)localObject).addFlags(131072);
    ((Intent)localObject).putExtra("key_from_scene", 3);
    paramString = this.apJ;
    j.o(paramString, "itemView");
    paramString.getContext().startActivity((Intent)localObject);
    AppMethodBeat.o(89202);
  }

  public final void a(CardHomePageNewUI.a parama, int paramInt)
  {
    AppMethodBeat.i(89199);
    j.p(parama, "model");
    this.kpo = parama;
    Object localObject1 = parama.koU;
    switch (parama.type)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      parama.koW = true;
      AppMethodBeat.o(89199);
      return;
      if (localObject1 == null)
        j.dWJ();
      Object localObject2 = this.kpa;
      if (localObject2 == null)
        j.avw("chpiLogoIv");
      ((CdnImageView)localObject2).setRoundCorner(true);
      label143: label446: label595: label618: boolean bool;
      label543: int i;
      if (!bo.isNullOrNil(((ns)localObject1).vSS))
      {
        localObject2 = this.kpa;
        if (localObject2 == null)
          j.avw("chpiLogoIv");
        ((CdnImageView)localObject2).eb(((ns)localObject1).vSS, 2131231054);
        localObject2 = (View.OnClickListener)new CardHomePageNewUI.e.c((ns)localObject1, this, (ns)localObject1, paramInt, parama);
        Object localObject3 = this.kpa;
        if (localObject3 == null)
          j.avw("chpiLogoIv");
        ((CdnImageView)localObject3).setOnClickListener((View.OnClickListener)localObject2);
        localObject3 = this.koY;
        Object localObject4 = this.koY.dxU();
        j.o(localObject4, "context");
        localObject4 = new CardHomePageNewUI.b((CardHomePageNewUI)localObject3, ((AppCompatActivity)localObject4).getResources().getColor(2131690480), (com.tencent.mm.pluginsdk.ui.e.h)new CardHomePageNewUI.e.d((View.OnClickListener)localObject2));
        localObject3 = new SpannableString((CharSequence)((ns)localObject1).vST);
        ((SpannableString)localObject3).setSpan(localObject4, 0, ((SpannableString)localObject3).length(), 18);
        localObject4 = this.kpb;
        if (localObject4 == null)
          j.avw("chpiNameTv");
        ((TextView)localObject4).setClickable(true);
        localObject4 = this.kpb;
        if (localObject4 == null)
          j.avw("chpiNameTv");
        ((TextView)localObject4).setOnTouchListener((View.OnTouchListener)new com.tencent.mm.pluginsdk.ui.e.m((Context)this.koY));
        localObject4 = this.kpb;
        if (localObject4 == null)
          j.avw("chpiNameTv");
        ((TextView)localObject4).setText((CharSequence)localObject3);
        if (bo.isNullOrNil(((ns)localObject1).vSU))
          break label831;
        localObject3 = this.kpc;
        if (localObject3 == null)
          j.avw("chpiDescTv");
        ((TextView)localObject3).setText((CharSequence)((ns)localObject1).vSU);
        localObject3 = this.kpc;
        if (localObject3 == null)
          j.avw("chpiDescTv");
        ((TextView)localObject3).setVisibility(0);
        localObject3 = this.kpc;
        if (localObject3 == null)
          j.avw("chpiDescTv");
        ((TextView)localObject3).setOnClickListener((View.OnClickListener)localObject2);
        if (((ns)localObject1).vTe == null)
          break label937;
        if (bo.isNullOrNil(((ns)localObject1).vTe.vSL))
          break label910;
        localObject2 = this.kpj;
        if (localObject2 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject2).setText((CharSequence)((ns)localObject1).vTe.vSL);
        if (bo.isNullOrNil(((ns)localObject1).vTe.vSM))
          break label858;
        localObject2 = this.kpj;
        if (localObject2 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject2).setTextColor(Color.parseColor(((ns)localObject1).vTe.vSM));
        if (bo.isNullOrNil(((ns)localObject1).vTe.vSN))
          break label884;
        localObject2 = this.kpj;
        if (localObject2 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject2).setFillColor(com.tencent.mm.plugin.card.d.l.bT(((ns)localObject1).vTe.vSN, ((ns)localObject1).vTe.vSQ));
        localObject2 = this.kpj;
        if (localObject2 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject2).setVisibility(0);
        localObject2 = this.kpf;
        if (localObject2 == null)
          j.avw("chpiCouponLayout");
        ((LinearLayout)localObject2).removeAllViews();
        if (parama.koW)
          break label998;
        if (((ns)localObject1).vTf != 1)
          break label992;
        bool = true;
        label658: if (!bool)
          break label1089;
        localObject2 = ((ns)localObject1).vTa;
        j.o(localObject2, "card_element_coupon_list");
        if (((Collection)localObject2).isEmpty())
          break label1007;
        i = 1;
        label693: if (i == 0)
          break label1013;
        P(-1, ((ns)localObject1).vTa.size(), paramInt);
        localObject2 = this.kpf;
        if (localObject2 == null)
          j.avw("chpiCouponLayout");
        ((LinearLayout)localObject2).setVisibility(0);
        parama.koX = true;
        label739: if (bo.isNullOrNil(((ns)localObject1).vTb))
          break label1040;
        ti(paramInt);
        localObject2 = this.kpg;
        if (localObject2 == null)
          j.avw("chpiExpandLayout");
        ((LinearLayout)localObject2).setVisibility(0);
      }
      while (true)
      {
        localObject1 = ((ns)localObject1).vSV;
        j.o(localObject1, "card_element_mch_label");
        bi((List)localObject1);
        localObject1 = y.AUy;
        break;
        localObject2 = this.kpa;
        if (localObject2 == null)
          j.avw("chpiLogoIv");
        ((CdnImageView)localObject2).setImageResource(2131231054);
        break label143;
        label831: localObject2 = this.kpc;
        if (localObject2 == null)
          j.avw("chpiDescTv");
        ((TextView)localObject2).setVisibility(8);
        break label446;
        label858: localObject2 = this.kpj;
        if (localObject2 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject2).setTextColor(-1);
        break label543;
        label884: localObject2 = this.kpj;
        if (localObject2 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject2).setFillColor(0);
        break label595;
        label910: localObject2 = this.kpj;
        if (localObject2 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject2).setVisibility(8);
        break label618;
        label937: localObject2 = this.kpj;
        if (localObject2 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject2).setText((CharSequence)"");
        localObject2 = this.kpj;
        if (localObject2 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject2).setVisibility(8);
        break label618;
        label992: bool = false;
        break label658;
        label998: bool = parama.koX;
        break label658;
        label1007: i = 0;
        break label693;
        label1013: localObject2 = this.kpf;
        if (localObject2 == null)
          j.avw("chpiCouponLayout");
        ((LinearLayout)localObject2).setVisibility(8);
        break label739;
        label1040: if (((ns)localObject1).vTh < ((ns)localObject1).vTa.size())
        {
          tk(paramInt);
        }
        else
        {
          localObject2 = this.kpg;
          if (localObject2 == null)
            j.avw("chpiExpandLayout");
          ((LinearLayout)localObject2).setVisibility(8);
          continue;
          label1089: localObject2 = ((ns)localObject1).vTa;
          j.o(localObject2, "card_element_coupon_list");
          if (!((Collection)localObject2).isEmpty())
          {
            i = 1;
            label1119: if (i == 0)
              break label1223;
            P(-1, ((ns)localObject1).vTh, paramInt);
            localObject2 = this.kpf;
            if (localObject2 == null)
              j.avw("chpiCouponLayout");
            ((LinearLayout)localObject2).setVisibility(0);
            parama.koX = false;
          }
          while (true)
            if (((ns)localObject1).vTh >= ((ns)localObject1).vTa.size())
            {
              if (!bo.isNullOrNil(((ns)localObject1).vTb))
              {
                ti(paramInt);
                localObject2 = this.kpg;
                if (localObject2 == null)
                  j.avw("chpiExpandLayout");
                ((LinearLayout)localObject2).setVisibility(0);
                break;
                i = 0;
                break label1119;
                label1223: localObject2 = this.kpf;
                if (localObject2 == null)
                  j.avw("chpiCouponLayout");
                ((LinearLayout)localObject2).setVisibility(8);
                continue;
              }
              localObject2 = this.kpg;
              if (localObject2 == null)
                j.avw("chpiExpandLayout");
              ((LinearLayout)localObject2).setVisibility(8);
              break;
            }
          tj(paramInt);
          localObject2 = this.kpg;
          if (localObject2 == null)
            j.avw("chpiExpandLayout");
          ((LinearLayout)localObject2).setVisibility(0);
        }
      }
      localObject1 = this.koZ;
      if (localObject1 == null)
        j.avw("sectionTitleTv");
      ((TextView)localObject1).setText((CharSequence)parama.bek());
      continue;
      if (localObject1 == null)
        j.dWJ();
      localObject2 = this.kpa;
      if (localObject2 == null)
        j.avw("chpiLogoIv");
      ((CdnImageView)localObject2).setRoundCorner(true);
      localObject2 = this.kpa;
      if (localObject2 == null)
        j.avw("chpiLogoIv");
      ((CdnImageView)localObject2).setUrl(((ns)localObject1).vSS);
      localObject2 = this.kpb;
      if (localObject2 == null)
        j.avw("chpiNameTv");
      ((TextView)localObject2).setText((CharSequence)((ns)localObject1).vST);
      if (!bo.isNullOrNil(((ns)localObject1).vSU))
      {
        localObject2 = this.kpc;
        if (localObject2 == null)
          j.avw("chpiDescTv");
        ((TextView)localObject2).setText((CharSequence)((ns)localObject1).vSU);
        localObject2 = this.kpc;
        if (localObject2 == null)
          j.avw("chpiDescTv");
        ((TextView)localObject2).setVisibility(0);
        label1482: if (((ns)localObject1).vTe == null)
          break label1758;
        if (bo.isNullOrNil(((ns)localObject1).vTe.vSL))
          break label1734;
        localObject2 = this.kpj;
        if (localObject2 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject2).setText((CharSequence)((ns)localObject1).vTe.vSL);
        if (bo.isNullOrNil(((ns)localObject1).vTe.vSM))
          break label1685;
        localObject2 = this.kpj;
        if (localObject2 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject2).setTextColor(Color.parseColor(((ns)localObject1).vTe.vSM));
        label1579: if (bo.isNullOrNil(((ns)localObject1).vTe.vSN))
          break label1711;
        localObject2 = this.kpj;
        if (localObject2 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject2).setFillColor(com.tencent.mm.plugin.card.d.l.bT(((ns)localObject1).vTe.vSN, ((ns)localObject1).vTe.vSQ));
        label1631: localObject1 = this.kpj;
        if (localObject1 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject1).setVisibility(0);
      }
      while (true)
      {
        localObject1 = y.AUy;
        break;
        localObject2 = this.kpc;
        if (localObject2 == null)
          j.avw("chpiDescTv");
        ((TextView)localObject2).setVisibility(8);
        break label1482;
        label1685: localObject2 = this.kpj;
        if (localObject2 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject2).setTextColor(-1);
        break label1579;
        label1711: localObject1 = this.kpj;
        if (localObject1 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject1).setFillColor(0);
        break label1631;
        label1734: localObject1 = this.kpj;
        if (localObject1 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject1).setVisibility(8);
        continue;
        label1758: localObject1 = this.kpj;
        if (localObject1 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject1).setText((CharSequence)"");
        localObject1 = this.kpj;
        if (localObject1 == null)
          j.avw("chpiMchLabelTv");
        ((CardLabelTextView)localObject1).setVisibility(8);
      }
      localObject1 = this.kpa;
      if (localObject1 == null)
        j.avw("chpiLogoIv");
      ((CdnImageView)localObject1).setRoundCorner(true);
      localObject1 = this.kpa;
      if (localObject1 == null)
        j.avw("chpiLogoIv");
      ((CdnImageView)localObject1).setImageResource(2131231054);
      localObject1 = this.kpb;
      if (localObject1 == null)
        j.avw("chpiNameTv");
      ((TextView)localObject1).setText((CharSequence)ah.getResources().getString(2131297881));
      localObject1 = this.kpc;
      if (localObject1 == null)
        j.avw("chpiDescTv");
      ((TextView)localObject1).setVisibility(8);
      continue;
      localObject1 = this.kpl;
      if (localObject1 == null)
        j.avw("chtiTitleTv");
      ((TextView)localObject1).setText(2131304053);
      if (CardHomePageNewUI.l(this.koY) != null)
      {
        localObject1 = this.kpm;
        if (localObject1 == null)
          j.avw("chtiDescTv");
        ((TextView)localObject1).setText((CharSequence)CardHomePageNewUI.l(this.koY));
        localObject1 = y.AUy;
        continue;
        localObject1 = this.kpl;
        if (localObject1 == null)
          j.avw("chtiTitleTv");
        ((TextView)localObject1).setText(2131297937);
        if ((CardHomePageNewUI.m(this.koY) == 1) && (CardHomePageNewUI.k(this.koY) != 0))
        {
          localObject1 = this.kpm;
          if (localObject1 == null)
            j.avw("chtiDescTv");
          ((TextView)localObject1).setVisibility(0);
          localObject1 = this.kpn;
          if (localObject1 == null)
            j.avw("chtiRightIv");
          ((ImageView)localObject1).setVisibility(0);
          if (CardHomePageNewUI.k(this.koY) == 1)
          {
            localObject1 = this.kpm;
            if (localObject1 == null)
              j.avw("chtiDescTv");
            ((TextView)localObject1).setText(2131305848);
          }
          while (true)
          {
            localObject1 = this.kpm;
            if (localObject1 == null)
              j.avw("chtiDescTv");
            ((TextView)localObject1).setOnClickListener((View.OnClickListener)new CardHomePageNewUI.e.e(this));
            break;
            if (CardHomePageNewUI.k(this.koY) == 2)
            {
              localObject1 = this.kpm;
              if (localObject1 == null)
                j.avw("chtiDescTv");
              ((TextView)localObject1).setText(2131305850);
            }
          }
        }
        localObject1 = this.kpm;
        if (localObject1 == null)
          j.avw("chtiDescTv");
        ((TextView)localObject1).setVisibility(8);
        localObject1 = this.kpn;
        if (localObject1 == null)
          j.avw("chtiRightIv");
        ((ImageView)localObject1).setVisibility(8);
      }
    }
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
  static final class g
    implements View.OnClickListener
  {
    g(CardHomePageNewUI.e parame, int paramInt, ns paramns)
    {
    }

    public final void onClick(View paramView)
    {
      AppMethodBeat.i(89197);
      ab.d("MicroMsg.CardHomePageNewUI", "do expand coupon layout");
      CardHomePageNewUI.e.a(this.kpp, paramInt);
      paramView = this.kpp.kpo;
      if (paramView != null)
        paramView.koX = true;
      paramView = com.tencent.mm.plugin.report.service.h.pYm;
      ns localns = this.kpq;
      if (localns == null)
        j.dWJ();
      paramView.e(16324, new Object[] { Integer.valueOf(1), localns.vSR, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(4), Integer.valueOf(paramInt), Integer.valueOf(CardHomePageNewUI.k(this.kpp.koY)) });
      AppMethodBeat.o(89197);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.e
 * JD-Core Version:    0.6.2
 */