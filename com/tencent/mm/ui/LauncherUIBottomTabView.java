package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.kiss.a.b;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.tools.r;

public class LauncherUIBottomTabView extends RelativeLayout
  implements c
{
  protected int lWS;
  private long nlj;
  private c.a yjX;
  protected LauncherUIBottomTabView.a yjY;
  protected LauncherUIBottomTabView.a yjZ;
  protected LauncherUIBottomTabView.a yka;
  protected LauncherUIBottomTabView.a ykb;
  private int ykc;
  private int ykd;
  private int yke;
  private int ykf;
  private int ykg;
  private int ykh;
  private int yki;
  private int ykj;
  private int ykk;
  private int ykl;
  private int ykm;
  private int ykn;
  private int yko;
  protected View.OnClickListener ykp;
  private ak ykq;
  private int ykr;
  private int yks;
  private int ykt;
  private boolean yku;
  private boolean ykv;
  private int ykw;
  private boolean ykx;

  public LauncherUIBottomTabView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(29488);
    this.lWS = 0;
    this.ykc = 0;
    this.ykg = 0;
    this.nlj = 0L;
    this.ykn = -1;
    this.yko = 0;
    this.ykp = new LauncherUIBottomTabView.1(this);
    this.ykq = new LauncherUIBottomTabView.2(this);
    this.ykr = 0;
    this.yks = 0;
    this.ykt = 0;
    this.yku = false;
    this.ykv = false;
    this.ykw = 0;
    this.ykx = false;
    init();
    AppMethodBeat.o(29488);
  }

  public LauncherUIBottomTabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(29489);
    this.lWS = 0;
    this.ykc = 0;
    this.ykg = 0;
    this.nlj = 0L;
    this.ykn = -1;
    this.yko = 0;
    this.ykp = new LauncherUIBottomTabView.1(this);
    this.ykq = new LauncherUIBottomTabView.2(this);
    this.ykr = 0;
    this.yks = 0;
    this.ykt = 0;
    this.yku = false;
    this.ykv = false;
    this.ykw = 0;
    this.ykx = false;
    init();
    AppMethodBeat.o(29489);
  }

  public LauncherUIBottomTabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(29490);
    this.lWS = 0;
    this.ykc = 0;
    this.ykg = 0;
    this.nlj = 0L;
    this.ykn = -1;
    this.yko = 0;
    this.ykp = new LauncherUIBottomTabView.1(this);
    this.ykq = new LauncherUIBottomTabView.2(this);
    this.ykr = 0;
    this.yks = 0;
    this.ykt = 0;
    this.yku = false;
    this.ykv = false;
    this.ykw = 0;
    this.ykx = false;
    init();
    AppMethodBeat.o(29490);
  }

  private LauncherUIBottomTabView.a MW(int paramInt)
  {
    AppMethodBeat.i(29491);
    LauncherUIBottomTabView.a locala = new LauncherUIBottomTabView.a(this);
    if (a.ga(getContext()));
    for (locala.ykz = b.SM().a((Activity)getContext(), "R.layout.mm_bottom_tabitem_large", 2130970103); ; locala.ykz = b.SM().a((Activity)getContext(), "R.layout.mm_bottom_tabitem", 2130970102))
    {
      locala.ykA = ((TabIconView)locala.ykz.findViewById(2131821226));
      locala.ykB = ((TextView)locala.ykz.findViewById(2131825993));
      locala.ykC = ((TextView)locala.ykz.findViewById(2131825992));
      locala.ykC.setBackgroundResource(r.ik(getContext()));
      locala.ykD = ((ImageView)locala.ykz.findViewById(2131820961));
      locala.ykz.setTag(Integer.valueOf(paramInt));
      locala.ykz.setOnClickListener(this.ykp);
      float f1 = a.am(getContext(), 2131427866);
      float f2 = a.fY(getContext());
      locala.ykB.setTextSize(0, f1 * f2);
      AppMethodBeat.o(29491);
      return locala;
    }
  }

  private LauncherUIBottomTabView.a b(LinearLayout paramLinearLayout)
  {
    AppMethodBeat.i(29492);
    LauncherUIBottomTabView.a locala = MW(0);
    locala.ykz.setId(-16777215);
    locala.ykB.setText(2131301308);
    locala.ykB.setTextColor(getResources().getColor(2131690302));
    locala.ykA.h(2131231406, 2131231449, 2131231448, a.ga(getContext()));
    locala.ykC.setVisibility(4);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, this.yko);
    localLayoutParams.weight = 1.0F;
    paramLinearLayout.addView(locala.ykz, localLayoutParams);
    AppMethodBeat.o(29492);
    return locala;
  }

  private LauncherUIBottomTabView.a c(LinearLayout paramLinearLayout)
  {
    AppMethodBeat.i(29493);
    LauncherUIBottomTabView.a locala = MW(1);
    locala.ykz.setId(-16777214);
    locala.ykB.setText(2131301270);
    locala.ykB.setTextColor(getResources().getColor(2131690303));
    locala.ykA.h(2131231409, 2131231454, 2131231453, a.ga(getContext()));
    locala.ykC.setVisibility(4);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, this.yko);
    localLayoutParams.weight = 1.0F;
    paramLinearLayout.addView(locala.ykz, localLayoutParams);
    AppMethodBeat.o(29493);
    return locala;
  }

  private LauncherUIBottomTabView.a d(LinearLayout paramLinearLayout)
  {
    AppMethodBeat.i(29494);
    LauncherUIBottomTabView.a locala = MW(2);
    locala.ykz.setId(-16777213);
    locala.ykB.setText(2131301268);
    locala.ykB.setTextColor(getResources().getColor(2131690303));
    locala.ykA.h(2131231413, 2131231456, 2131231455, a.ga(getContext()));
    locala.ykC.setVisibility(4);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, this.yko);
    localLayoutParams.weight = 1.0F;
    paramLinearLayout.addView(locala.ykz, localLayoutParams);
    AppMethodBeat.o(29494);
    return locala;
  }

  private LauncherUIBottomTabView.a e(LinearLayout paramLinearLayout)
  {
    AppMethodBeat.i(29495);
    LauncherUIBottomTabView.a locala = MW(3);
    locala.ykz.setId(-16777212);
    locala.ykB.setText(2131301302);
    locala.ykB.setTextColor(getResources().getColor(2131690303));
    locala.ykA.h(2131231418, 2131231466, 2131231466, a.ga(getContext()));
    locala.ykC.setVisibility(4);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, this.yko);
    localLayoutParams.weight = 1.0F;
    paramLinearLayout.addView(locala.ykz, localLayoutParams);
    AppMethodBeat.o(29495);
    return locala;
  }

  private void init()
  {
    AppMethodBeat.i(29496);
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setBackgroundColor(getResources().getColor(2131689498));
    localLinearLayout.setOrientation(0);
    addView(localLinearLayout, new RelativeLayout.LayoutParams(-1, -2));
    this.yko = ((int)(a.am(getContext(), 2131427567) * a.fY(getContext())));
    this.yjY = b(localLinearLayout);
    this.yka = c(localLinearLayout);
    this.yjZ = d(localLinearLayout);
    this.ykb = e(localLinearLayout);
    this.ykc = getResources().getColor(2131690302);
    this.ykd = ((this.ykc & 0xFF0000) >> 16);
    this.yke = ((this.ykc & 0xFF00) >> 8);
    this.ykf = (this.ykc & 0xFF);
    this.ykg = getResources().getColor(2131690303);
    this.ykh = ((this.ykg & 0xFF0000) >> 16);
    this.yki = ((this.ykg & 0xFF00) >> 8);
    this.ykj = (this.ykg & 0xFF);
    this.ykk = (this.ykd - this.ykh);
    this.ykl = (this.yke - this.yki);
    this.ykm = (this.ykf - this.ykj);
    AppMethodBeat.o(29496);
  }

  public final void MM(int paramInt)
  {
    AppMethodBeat.i(29497);
    ab.d("MicroMsg.LauncherUITabView", "updateMainTabUnread %d", new Object[] { Integer.valueOf(paramInt) });
    this.ykr = paramInt;
    if (paramInt > 0)
      if (paramInt > 99)
      {
        this.yjY.ykC.setText("");
        this.yjY.ykC.setBackgroundResource(2131230952);
        this.yjY.ykC.setTextSize(0, a.am(getContext(), 2131428728));
        this.yjY.ykC.setVisibility(0);
        this.yjY.ykD.setVisibility(4);
        AppMethodBeat.o(29497);
      }
    while (true)
    {
      return;
      this.yjY.ykC.setText(String.valueOf(paramInt));
      this.yjY.ykC.setBackgroundResource(r.ik(getContext()));
      this.yjY.ykC.setTextSize(0, a.am(getContext(), 2131428728) * a.fY(getContext()));
      this.yjY.ykC.setVisibility(0);
      this.yjY.ykD.setVisibility(4);
      AppMethodBeat.o(29497);
      continue;
      this.yjY.ykC.setText("");
      this.yjY.ykC.setVisibility(4);
      AppMethodBeat.o(29497);
    }
  }

  public final void MN(int paramInt)
  {
    AppMethodBeat.i(29498);
    this.yks = paramInt;
    if (paramInt > 0)
      if (paramInt > 99)
      {
        this.yka.ykC.setText("");
        this.yka.ykC.setBackgroundResource(2131230952);
        this.yka.ykC.setTextSize(0, a.am(getContext(), 2131428728));
        this.yka.ykC.setVisibility(0);
        this.yka.ykD.setVisibility(4);
        AppMethodBeat.o(29498);
      }
    while (true)
    {
      return;
      this.yka.ykC.setText(String.valueOf(paramInt));
      this.yka.ykC.setTextSize(0, a.am(getContext(), 2131428728) * a.fY(getContext()));
      this.yka.ykC.setBackgroundResource(r.ik(getContext()));
      this.yka.ykC.setVisibility(0);
      this.yka.ykD.setVisibility(4);
      AppMethodBeat.o(29498);
      continue;
      this.yka.ykC.setText("");
      this.yka.ykC.setVisibility(4);
      AppMethodBeat.o(29498);
    }
  }

  public final void MO(int paramInt)
  {
    AppMethodBeat.i(29499);
    this.ykt = paramInt;
    if (paramInt > 0)
      if (paramInt > 99)
      {
        this.yjZ.ykC.setText("");
        this.yjZ.ykC.setBackgroundResource(2131230952);
        this.yjZ.ykC.setTextSize(0, a.am(getContext(), 2131428728));
        this.yjZ.ykC.setVisibility(0);
        this.yjZ.ykD.setVisibility(4);
        AppMethodBeat.o(29499);
      }
    while (true)
    {
      return;
      this.yjZ.ykC.setText(String.valueOf(paramInt));
      this.yjZ.ykC.setTextSize(0, a.am(getContext(), 2131428728) * a.fY(getContext()));
      this.yjZ.ykC.setVisibility(0);
      this.yjZ.ykC.setBackgroundResource(r.ik(getContext()));
      this.yjZ.ykD.setVisibility(4);
      AppMethodBeat.o(29499);
      continue;
      this.yjZ.ykC.setText("");
      this.yjZ.ykC.setVisibility(4);
      AppMethodBeat.o(29499);
    }
  }

  public final void MP(int paramInt)
  {
    AppMethodBeat.i(29502);
    if (this.ykv)
      AppMethodBeat.o(29502);
    while (true)
    {
      return;
      this.ykw = paramInt;
      if (paramInt > 0)
      {
        if (paramInt > 99)
        {
          this.ykb.ykC.setText("");
          this.ykb.ykC.setBackgroundResource(2131230952);
          this.ykb.ykC.setTextSize(0, a.am(getContext(), 2131428728));
          this.ykb.ykC.setVisibility(0);
          this.ykb.ykD.setVisibility(4);
          AppMethodBeat.o(29502);
        }
        else
        {
          this.ykb.ykC.setText(String.valueOf(paramInt));
          this.ykb.ykC.setTextSize(0, a.am(getContext(), 2131428728) * a.fY(getContext()));
          this.ykb.ykC.setVisibility(0);
          this.ykb.ykC.setBackgroundResource(r.ik(getContext()));
          this.ykb.ykD.setVisibility(4);
          AppMethodBeat.o(29502);
        }
      }
      else
      {
        this.ykb.ykC.setText("");
        this.ykb.ykC.setVisibility(4);
        AppMethodBeat.o(29502);
      }
    }
  }

  public final void dwp()
  {
    if ((this.yjY != null) && (this.yka != null) && (this.yjZ == null));
  }

  public int getContactTabUnread()
  {
    return this.yks;
  }

  public int getCurIdx()
  {
    return this.lWS;
  }

  public int getFriendTabUnread()
  {
    return this.ykt;
  }

  public int getMainTabUnread()
  {
    return this.ykr;
  }

  public boolean getSettingsPoint()
  {
    return this.ykx;
  }

  public int getSettingsTabUnread()
  {
    return this.ykw;
  }

  public boolean getShowFriendPoint()
  {
    return this.yku;
  }

  public final void l(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(29504);
    int i = (int)(255.0F * paramFloat);
    int j = 255 - i;
    int k = ((int)(this.ykk * paramFloat + this.ykh) << 16) + ((int)(this.ykl * paramFloat + this.yki) << 8) + (int)(this.ykm * paramFloat + this.ykj) - 16777216;
    int m = ((int)(this.ykk * (1.0F - paramFloat) + this.ykh) << 16) + ((int)(this.ykl * (1.0F - paramFloat) + this.yki) << 8) + (int)(this.ykm * (1.0F - paramFloat) + this.ykj) - 16777216;
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(29504);
      while (true)
      {
        return;
        this.yjY.ykA.setFocusAlpha(j);
        this.yka.ykA.setFocusAlpha(i);
        this.yjY.ykB.setTextColor(m);
        this.yka.ykB.setTextColor(k);
        AppMethodBeat.o(29504);
        continue;
        this.yka.ykA.setFocusAlpha(j);
        this.yjZ.ykA.setFocusAlpha(i);
        this.yka.ykB.setTextColor(m);
        this.yjZ.ykB.setTextColor(k);
        AppMethodBeat.o(29504);
      }
      this.yjZ.ykA.setFocusAlpha(j);
      this.ykb.ykA.setFocusAlpha(i);
      this.yjZ.ykB.setTextColor(m);
      this.ykb.ykB.setTextColor(k);
    }
  }

  public final void px(boolean paramBoolean)
  {
    int i = 4;
    AppMethodBeat.i(29500);
    this.yku = paramBoolean;
    this.yjZ.ykC.setVisibility(4);
    ImageView localImageView = this.yjZ.ykD;
    if (paramBoolean)
      i = 0;
    localImageView.setVisibility(i);
    AppMethodBeat.o(29500);
  }

  public final void py(boolean paramBoolean)
  {
    AppMethodBeat.i(29503);
    if (this.ykv)
    {
      AppMethodBeat.o(29503);
      return;
    }
    Object localObject = h.scu;
    long l;
    if (paramBoolean)
    {
      l = 1L;
      label30: h.ln(l);
      this.ykx = paramBoolean;
      this.ykb.ykC.setVisibility(4);
      localObject = this.ykb.ykD;
      if (!paramBoolean)
        break label85;
    }
    label85: for (int i = 0; ; i = 4)
    {
      ((ImageView)localObject).setVisibility(i);
      AppMethodBeat.o(29503);
      break;
      l = 0L;
      break label30;
    }
  }

  public final void pz(boolean paramBoolean)
  {
    AppMethodBeat.i(29501);
    this.ykv = paramBoolean;
    if (this.ykb == null)
      AppMethodBeat.o(29501);
    while (true)
    {
      return;
      h localh;
      if (paramBoolean)
      {
        localh = h.scu;
        h.ln(1L);
        this.ykb.ykC.setText(getResources().getString(2131304135));
        this.ykb.ykC.setBackgroundResource(2130839673);
        this.ykb.ykC.setTextSize(0, a.am(getContext(), 2131427578));
        this.ykb.ykC.setVisibility(0);
        this.ykb.ykD.setVisibility(4);
        AppMethodBeat.o(29501);
      }
      else
      {
        if (!this.ykx)
        {
          localh = h.scu;
          h.ln(0L);
        }
        MP(this.ykw);
        AppMethodBeat.o(29501);
      }
    }
  }

  public void setOnTabClickListener(c.a parama)
  {
    this.yjX = parama;
  }

  public void setTo(int paramInt)
  {
    AppMethodBeat.i(29505);
    this.lWS = paramInt;
    switch (paramInt)
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      this.nlj = System.currentTimeMillis();
      this.ykn = this.lWS;
      AppMethodBeat.o(29505);
      return;
      this.yjY.ykA.setFocusAlpha(255);
      this.yjZ.ykA.setFocusAlpha(0);
      this.yka.ykA.setFocusAlpha(0);
      this.ykb.ykA.setFocusAlpha(0);
      this.yjY.ykB.setTextColor(this.ykc);
      this.yjZ.ykB.setTextColor(this.ykg);
      this.yka.ykB.setTextColor(this.ykg);
      this.ykb.ykB.setTextColor(this.ykg);
      continue;
      this.yjY.ykA.setFocusAlpha(0);
      this.yjZ.ykA.setFocusAlpha(255);
      this.yka.ykA.setFocusAlpha(0);
      this.ykb.ykA.setFocusAlpha(0);
      this.yjY.ykB.setTextColor(this.ykg);
      this.yjZ.ykB.setTextColor(this.ykc);
      this.yka.ykB.setTextColor(this.ykg);
      this.ykb.ykB.setTextColor(this.ykg);
      continue;
      this.yjY.ykA.setFocusAlpha(0);
      this.yjZ.ykA.setFocusAlpha(0);
      this.yka.ykA.setFocusAlpha(255);
      this.ykb.ykA.setFocusAlpha(0);
      this.yjY.ykB.setTextColor(this.ykg);
      this.yjZ.ykB.setTextColor(this.ykg);
      this.yka.ykB.setTextColor(this.ykc);
      this.ykb.ykB.setTextColor(this.ykg);
      continue;
      this.yjY.ykA.setFocusAlpha(0);
      this.yjZ.ykA.setFocusAlpha(0);
      this.yka.ykA.setFocusAlpha(0);
      this.ykb.ykA.setFocusAlpha(255);
      this.yjY.ykB.setTextColor(this.ykg);
      this.yjZ.ykB.setTextColor(this.ykg);
      this.yka.ykB.setTextColor(this.ykg);
      this.ykb.ykB.setTextColor(this.ykc);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.LauncherUIBottomTabView
 * JD-Core Version:    0.6.2
 */