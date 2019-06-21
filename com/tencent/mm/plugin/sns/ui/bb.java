package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.c.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class bb
{
  private String nJy;
  private LinearLayout rDh;
  public TextView rDi;
  public TextView rDj;
  private View rDk;
  private View rDl;
  public com.tencent.mm.plugin.sns.storage.b rDm;
  public com.tencent.mm.plugin.sns.storage.a rDn;
  private View view;

  public bb(View paramView)
  {
    AppMethodBeat.i(39857);
    this.view = paramView;
    this.nJy = aa.gw(ah.getContext());
    ab.i("MicroMsg.TimeLineAdView", "adView init lan " + this.nJy);
    this.rDi = ((TextView)this.view.findViewById(2131827660));
    this.rDj = ((TextView)this.view.findViewById(2131827661));
    this.rDk = this.view.findViewById(2131827714);
    this.rDl = this.view.findViewById(2131827713);
    this.rDh = ((LinearLayout)this.view.findViewById(2131827712));
    paramView = " " + this.view.getResources().getString(2131303584) + " ";
    this.rDi.setText(paramView);
    AppMethodBeat.o(39857);
  }

  public final void a(View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(39858);
    this.rDj.setOnClickListener(paramOnClickListener1);
    this.rDi.setOnClickListener(paramOnClickListener2);
    if (this.rDk != null)
      this.rDk.setOnClickListener(paramOnClickListener2);
    if (this.rDh != null)
      this.rDh.setOnClickListener(paramOnClickListener2);
    AppMethodBeat.o(39858);
  }

  public final void a(com.tencent.mm.plugin.sns.storage.b paramb, com.tencent.mm.plugin.sns.storage.a parama)
  {
    AppMethodBeat.i(39860);
    this.rDn = parama;
    this.rDm = paramb;
    Object localObject1 = "";
    Context localContext;
    if (paramb != null)
    {
      if ("zh_CN".equals(this.nJy))
        localObject1 = paramb.qUk;
    }
    else
    {
      Object localObject2 = localObject1;
      if (paramb != null)
      {
        localObject2 = localObject1;
        if (bo.isNullOrNil((String)localObject1))
          localObject2 = paramb.qUi;
      }
      localContext = this.rDj.getContext();
      localObject1 = localObject2;
      if (bo.isNullOrNil((String)localObject2))
        localObject1 = localContext.getString(2131303590);
      localObject1 = (String)localObject1 + " ";
      int i = ((String)localObject1).length();
      localObject2 = new SpannableString((String)localObject1 + "ad_");
      if ((parama == null) || (!parama.coI()))
        break label369;
      localObject1 = localContext.getResources().getDrawable(2131230769);
      ((Drawable)localObject1).setBounds(0, 0, (int)(this.rDj.getTextSize() * 0.8D), (int)(this.rDj.getTextSize() * 0.8D));
      localObject1 = new ImageSpan((Drawable)localObject1, 1);
      label208: if (!bo.isNullOrNil(paramb.qUj))
        h.c("adId", paramb.qUj, false, 41, new bb.1(this, (SpannableString)localObject2, i));
      ((SpannableString)localObject2).setSpan(localObject1, i, i + 3, 33);
      this.rDj.setText((CharSequence)localObject2);
      if ((parama == null) || (bo.isNullOrNil(parama.qTD)))
        break label425;
      this.rDl.setVisibility(0);
      label287: if (paramb != null)
      {
        if (!"zh_CN".equals(this.nJy))
          break label437;
        paramb = paramb.qUt;
      }
    }
    while (true)
    {
      if (!bo.isNullOrNil(paramb))
        this.rDi.setText(paramb);
      AppMethodBeat.o(39860);
      return;
      if (("zh_TW".equals(this.nJy)) || ("zh_HK".equals(this.nJy)))
      {
        localObject1 = paramb.qUm;
        break;
      }
      localObject1 = paramb.qUl;
      break;
      label369: localObject1 = localContext.getResources().getDrawable(2131230770);
      ((Drawable)localObject1).setBounds(0, 0, (int)(this.rDj.getTextSize() * 1.3D), (int)(this.rDj.getTextSize() * 1.3D));
      localObject1 = new ImageSpan((Drawable)localObject1, 0);
      break label208;
      label425: this.rDl.setVisibility(8);
      break label287;
      label437: if (("zh_TW".equals(this.nJy)) || ("zh_HK".equals(this.nJy)))
        paramb = paramb.qUv;
      else
        paramb = paramb.qUu;
    }
  }

  public final String cuH()
  {
    String str;
    if (this.rDn == null)
      str = "";
    while (true)
    {
      return str;
      if (this.rDn.qPj == null)
        str = "";
      else
        str = this.rDn.qPj;
    }
  }

  public final int[] cuI()
  {
    AppMethodBeat.i(39856);
    int[] arrayOfInt = new int[2];
    if (this.rDh != null)
    {
      this.rDk.getLocationInWindow(arrayOfInt);
      arrayOfInt[0] += this.rDk.getMeasuredWidth();
    }
    while (true)
    {
      AppMethodBeat.o(39856);
      return arrayOfInt;
      if (this.rDk != null)
      {
        this.rDk.getLocationInWindow(arrayOfInt);
        arrayOfInt[0] += this.rDk.getMeasuredWidth();
      }
    }
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(39861);
    com.tencent.mm.storage.a locala;
    if ((this.rDm != null) && (this.rDm.qUh == 1))
    {
      this.rDj.setVisibility(8);
      locala = c.abj().aoe("Sns_CanvasAd_DetailLink_JumpWay");
      if (!locala.isValid())
        break label204;
    }
    label204: for (int i = bo.getInt(locala.field_value, -1); ; i = -1)
    {
      if ((i != -1) && (this.rDm != null) && (this.rDm.coK()) && (i.YO(this.rDm.cHz)))
        this.rDj.setVisibility(paramInt);
      this.rDi.setVisibility(paramInt);
      if (this.rDk != null)
        this.rDk.setVisibility(paramInt);
      if (this.rDh != null)
        this.rDh.setVisibility(paramInt);
      if ((this.rDn != null) && (!bo.isNullOrNil(this.rDn.qTD)))
      {
        this.rDl.setVisibility(paramInt);
        AppMethodBeat.o(39861);
      }
      while (true)
      {
        return;
        this.rDj.setVisibility(paramInt);
        break;
        this.rDl.setVisibility(8);
        AppMethodBeat.o(39861);
      }
    }
  }

  public final void z(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(39859);
    this.rDj.setTag(paramObject1);
    this.rDi.setTag(paramObject2);
    if (this.rDk != null)
      this.rDk.setTag(paramObject2);
    if (this.rDh != null)
      this.rDh.setTag(paramObject2);
    AppMethodBeat.o(39859);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.bb
 * JD-Core Version:    0.6.2
 */