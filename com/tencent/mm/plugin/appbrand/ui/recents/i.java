package com.tencent.mm.plugin.appbrand.ui.recents;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.plugin.appbrand.appusage.q;
import com.tencent.mm.plugin.appbrand.appusage.q.b;
import com.tencent.mm.plugin.appbrand.appusage.r.d;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandNearbyEmptyUI;
import com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;
import com.tencent.mm.protocal.protobuf.are;
import com.tencent.mm.protocal.protobuf.bdt;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.LinkedList;

final class i extends a
  implements View.OnClickListener, q.b
{
  View apJ;
  private Activity czX;
  private b.f eoo;
  private final int eop;
  private final int eoq;
  private final int eor;
  private final int eos;
  private ImageView iMf;
  private ThreeDotsLoadingView iNB;
  private View iOd;
  private i.a iOi;
  private final int iOj;
  private TextView iOk;
  private AppBrandNearbyShowcaseView iOl;
  private View iOm;
  private ImageView iOn;
  private boolean iOo;

  i(Activity paramActivity, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(133454);
    this.iOi = i.a.iOt;
    this.eos = -1;
    this.iOo = false;
    this.czX = paramActivity;
    this.eop = com.tencent.mm.bz.a.fromDPToPix(paramActivity, 25);
    this.eoq = com.tencent.mm.bz.a.fromDPToPix(paramActivity, 19);
    this.eor = com.tencent.mm.bz.a.fromDPToPix(paramActivity, 2);
    this.apJ = LayoutInflater.from(paramActivity).inflate(2130968716, paramViewGroup, false);
    paramViewGroup = this.apJ.findViewById(2131821333);
    this.iOm = paramViewGroup;
    paramViewGroup.setOnClickListener(this);
    this.iOd = this.apJ.findViewById(2131821329);
    this.iOk = ((TextView)this.apJ.findViewById(2131821331));
    this.iOl = ((AppBrandNearbyShowcaseView)this.apJ.findViewById(2131821330));
    this.iOl.setIconLayerCount(4);
    this.iOl.setIconSize(this.eop + this.eor * 2);
    this.iOl.setIconGap(this.eoq);
    this.iMf = ((ImageView)this.apJ.findViewById(2131821332));
    this.iNB = ((ThreeDotsLoadingView)this.apJ.findViewById(2131821334));
    this.iOn = ((ImageView)this.apJ.findViewById(2131821335));
    this.iOj = com.tencent.mm.bz.a.i(paramActivity, 2131690152);
    if (!com.tencent.mm.pluginsdk.permission.b.o(paramActivity, "android.permission.ACCESS_COARSE_LOCATION"))
      this.iOi = i.a.iOv;
    AppMethodBeat.o(133454);
  }

  private void aNt()
  {
    AppMethodBeat.i(133460);
    this.iOi = i.a.iOu;
    cw(this.iOd);
    cw(this.iOn);
    cx(this.iNB);
    this.iNB.dKS();
    AppMethodBeat.o(133460);
  }

  private void aNu()
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(133461);
    if (this.apJ == null)
      AppMethodBeat.o(133461);
    while (true)
    {
      return;
      if (q.axm())
      {
        eG(true);
        localObject = ((AppBrandLauncherUI)this.czX).iGM;
        if (localObject != null)
          ((r.d)localObject).axA();
      }
      while (true)
      {
        this.iNB.dKT();
        cw(this.iNB);
        if (i.a.iOv != this.iOi)
          break label109;
        cw(this.iOd);
        cw(this.iOn);
        AppMethodBeat.o(133461);
        break;
        eG(false);
      }
      label109: Object localObject = q.axq();
      if (localObject == null)
      {
        this.iOi = i.a.iOr;
        cw(this.iOd);
        cx(this.iOn);
        AppMethodBeat.o(133461);
      }
      else if ((((are)localObject).jsN <= 0) || (bo.ek(((are)localObject).wuW)))
      {
        this.iOi = i.a.iOt;
        cw(this.iOd);
        AppMethodBeat.o(133461);
      }
      else
      {
        this.iOi = i.a.iOs;
        r.d locald = ((AppBrandLauncherUI)this.czX).iGM;
        if (locald != null)
          locald.axz();
        if (this.iOk != null)
        {
          this.iOk.setText(((are)localObject).wvc);
          this.iOk.setTextColor(bx(((are)localObject).wvd, this.iOj));
        }
        this.iOl.setIconLayerCount(Math.min(((are)localObject).wuW.size(), 4));
        if (this.iOd.getVisibility() != 0);
        while (true)
        {
          if (i != 0)
            this.iOl.eO(false);
          int k = j;
          if (this.eoo == null)
            this.eoo = new com.tencent.mm.plugin.appbrand.ui.widget.a(this.eop, this.eor);
          for (k = j; k < this.iOl.getChildCount(); k++)
            com.tencent.mm.modelappbrand.a.b.abR().a(this.iOl.qf(k), ((bdt)((are)localObject).wuW.get(k)).wHu, com.tencent.mm.modelappbrand.a.a.abQ(), this.eoo);
          i = 0;
        }
        cx(this.iOd);
        cw(this.iNB);
        cw(this.iOn);
        if (i != 0)
        {
          if (this.iOl != null)
            this.iOl.aOB();
          if (this.iOk != null)
          {
            this.iOk.setAlpha(0.0F);
            this.iOk.animate().alpha(1.0F).setDuration(500L).start();
          }
        }
        AppMethodBeat.o(133461);
      }
    }
  }

  private void aNv()
  {
    AppMethodBeat.i(133467);
    if (this.czX == null)
      AppMethodBeat.o(133467);
    while (true)
    {
      return;
      r.d locald = ((AppBrandLauncherUI)this.czX).iGM;
      if (locald != null)
        locald.axB();
      AppMethodBeat.o(133467);
    }
  }

  private static int bx(String paramString, int paramInt)
  {
    AppMethodBeat.i(133462);
    try
    {
      int i = Color.parseColor(paramString);
      paramInt = i;
      AppMethodBeat.o(133462);
      return paramInt;
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(133462);
    }
  }

  private void cw(View paramView)
  {
    AppMethodBeat.i(133463);
    if (paramView.getVisibility() == 0)
      paramView.animate().setDuration(200L).alpha(0.0F).withEndAction(new i.3(this, paramView)).start();
    AppMethodBeat.o(133463);
  }

  private static void cx(View paramView)
  {
    AppMethodBeat.i(133464);
    if (paramView.getVisibility() != 0)
    {
      paramView.setAlpha(0.0F);
      paramView.setVisibility(0);
    }
    paramView.animate().setDuration(200L).alpha(1.0F).withEndAction(null).start();
    AppMethodBeat.o(133464);
  }

  public final void aNh()
  {
    AppMethodBeat.i(133456);
    eG(q.axm());
    if (i.a.iOv == this.iOi)
    {
      aNu();
      AppMethodBeat.o(133456);
    }
    while (true)
    {
      return;
      q.a(this);
      if (!q.axr())
      {
        this.apJ.post(new i.2(this));
        AppMethodBeat.o(133456);
      }
      else if (q.refresh())
      {
        aNt();
        AppMethodBeat.o(133456);
      }
      else
      {
        eG(false);
        AppMethodBeat.o(133456);
      }
    }
  }

  public final View aNi()
  {
    return this.apJ;
  }

  public final void axs()
  {
    AppMethodBeat.i(133465);
    if (this.apJ != null)
      this.apJ.post(new i.4(this));
    AppMethodBeat.o(133465);
  }

  public final void eH(boolean paramBoolean)
  {
    AppMethodBeat.i(133453);
    this.iOd.post(new i.1(this, paramBoolean));
    AppMethodBeat.o(133453);
  }

  public final void onClick(View paramView)
  {
    int i = 0;
    AppMethodBeat.i(133466);
    if (paramView.getId() == 2131821333)
      if (this.czX == null)
        AppMethodBeat.o(133466);
    while (true)
    {
      return;
      if (i.a.iOu == this.iOi)
      {
        AppMethodBeat.o(133466);
      }
      else if (i.a.iOt == this.iOi)
      {
        aNv();
        this.czX.startActivityForResult(new Intent(this.czX, AppBrandNearbyEmptyUI.class).putExtra("extra_enter_reason", 0), 3);
        AppMethodBeat.o(133466);
      }
      else if (i.a.iOv == this.iOi)
      {
        aNv();
        this.czX.startActivityForResult(new Intent(this.czX, AppBrandNearbyEmptyUI.class).putExtra("extra_enter_reason", 1), 3);
        AppMethodBeat.o(133466);
      }
      else
      {
        if ((q.axq() != null) && (q.axr()));
        for (boolean bool = true; ; bool = false)
        {
          this.iOo = bool;
          if ((i.a.iOr == this.iOi) || (this.iOo))
            i = 1;
          paramView = new i.5(this);
          if (i == 0)
            break label227;
          aNt();
          q.refresh();
          AppMethodBeat.o(133466);
          break;
        }
        label227: paramView.run();
        if ((q.axq() != null) && (q.axq().wve == 1) && (this.iOk != null))
          this.iOk.animate().alpha(0.0F).setDuration(200L);
        AppMethodBeat.o(133466);
      }
    }
  }

  public final void onDetached()
  {
    AppMethodBeat.i(133457);
    q.b(this);
    this.czX = null;
    this.apJ = null;
    this.iOl = null;
    this.iOd = null;
    AppMethodBeat.o(133457);
  }

  public final void onResume()
  {
    AppMethodBeat.i(133455);
    if ((i.a.iOv == this.iOi) && (com.tencent.mm.pluginsdk.permission.b.o(this.czX, "android.permission.ACCESS_COARSE_LOCATION")))
    {
      this.iOi = i.a.iOt;
      aNh();
    }
    AppMethodBeat.o(133455);
  }

  public final void pS(int paramInt)
  {
    AppMethodBeat.i(133458);
    if (this.iMf != null)
    {
      this.iMf.setVisibility(paramInt);
      localObject = this.iOd.getParent();
      if ((localObject instanceof FrameLayout))
      {
        localObject = (FrameLayout)localObject;
        localLayoutParams = (LinearLayout.LayoutParams)((FrameLayout)localObject).getLayoutParams();
        localLayoutParams.rightMargin = this.czX.getResources().getDimensionPixelOffset(2131428081);
        ((FrameLayout)localObject).setLayoutParams(localLayoutParams);
      }
    }
    Object localObject = (TextView)this.apJ.findViewById(2131820678);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)((TextView)localObject).getLayoutParams();
    localLayoutParams.leftMargin = this.czX.getResources().getDimensionPixelOffset(2131428018);
    ((TextView)localObject).setLayoutParams(localLayoutParams);
    AppMethodBeat.o(133458);
  }

  public final void pT(int paramInt)
  {
    AppMethodBeat.i(133459);
    this.iOm.setBackgroundResource(paramInt);
    AppMethodBeat.o(133459);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.i
 * JD-Core Version:    0.6.2
 */