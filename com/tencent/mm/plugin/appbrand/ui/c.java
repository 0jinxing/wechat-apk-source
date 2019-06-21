package com.tencent.mm.plugin.appbrand.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.a.f;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.a.a.b;
import com.tencent.mm.plugin.appbrand.game.preload.e;
import com.tencent.mm.plugin.appbrand.game.preload.ui.BootstrapProgressBar;
import com.tencent.mm.plugin.appbrand.launching.j;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.widget.actionbar.f.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.Timer;

@SuppressLint({"ViewConstructor"})
final class c extends com.tencent.mm.ui.statusbar.b
  implements j, q
{
  private o gOq;
  private ThreeDotsLoadingView iDW;
  private ImageView iFV;
  private ImageView iFW;
  private TextView iFX;
  private LinearLayout iFY;
  private com.tencent.mm.plugin.appbrand.widget.actionbar.b iFZ;
  private TextView iGa;
  private a.b iGb;
  private TextView iGc;
  private boolean iGd;
  private Runnable iGe;
  private RelativeLayout iGf;
  private boolean iGg;
  private boolean iGh;
  private boolean iGi;
  private int iGj;
  private boolean iGk;
  private int iGl;
  private RelativeLayout iGm;
  private ImageView iGn;
  private BootstrapProgressBar iGo;
  private boolean iGp;
  private boolean iGq;
  private ImageView kU;

  public c(Context paramContext, o paramo)
  {
    super(paramContext);
    AppMethodBeat.i(132947);
    this.iGb = a.b.hiK;
    this.iGe = null;
    this.iGg = false;
    this.iGh = false;
    this.iGi = false;
    this.iGk = false;
    this.iGl = 30;
    this.gOq = paramo;
    ab.i("MicroMsg.AppBrandGameUILoadingSplash", "init");
    setClickable(true);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    LayoutInflater.from(getContext()).inflate(2130968736, this);
    this.iGm = ((RelativeLayout)findViewById(2131821382));
    this.iGn = ((ImageView)findViewById(2131821383));
    this.iGo = ((BootstrapProgressBar)findViewById(2131821384));
    e.aBD().cY(999, 1);
    label297: RelativeLayout.LayoutParams localLayoutParams;
    Object localObject;
    if ((((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lJk, false)) && (this.gOq != null))
    {
      long l = bo.yz();
      paramContext = this.gOq.atI();
      paramo = paramContext.hgL;
      if (!com.tencent.magicbrush.c.isNullOrNil(paramo))
      {
        this.iGg = true;
        ab.i("MicroMsg.AppBrandGameUILoadingSplash", "loadingImgUrl:%s", new Object[] { paramo });
        e.aBD().cY(1000, 1);
        com.tencent.mm.ce.a.post(new c.2(this, paramo, new c.1(this, l)));
        if (bo.isNullOrNil(paramContext.hgM))
          break label900;
        this.iGj = Color.parseColor(paramContext.hgM);
        this.iGo.setProgressColor(this.iGj);
        ab.i("MicroMsg.AppBrandGameUILoadingSplash", "loadingProgressBarColor:%s", new Object[] { Integer.valueOf(this.iGj) });
        al.n(new c.3(this), 1000L);
        al.n(new c.4(this), 2000L);
      }
    }
    else
    {
      this.iGf = ((RelativeLayout)findViewById(2131821373));
      this.kU = ((ImageView)findViewById(2131821379));
      this.kU.setImageDrawable(com.tencent.mm.modelappbrand.a.a.abQ());
      this.iFX = ((TextView)findViewById(2131821374));
      this.iFV = ((ImageView)findViewById(2131821381));
      this.iDW = ((ThreeDotsLoadingView)findViewById(2131821376));
      this.iFW = ((ImageView)findViewById(2131821375));
      this.iFY = ((LinearLayout)findViewById(2131821372));
      this.iGa = ((TextView)findViewById(2131821377));
      this.iGc = ((TextView)findViewById(2131821378));
      localLayoutParams = (RelativeLayout.LayoutParams)this.iDW.getLayoutParams();
      paramContext = (RelativeLayout.LayoutParams)this.iFW.getLayoutParams();
      paramo = (RelativeLayout.LayoutParams)this.iFV.getLayoutParams();
      this.iFZ = f.a.dh(getContext());
      localObject = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject).gravity = 21;
      ((LinearLayout.LayoutParams)localObject).rightMargin = com.tencent.mm.bz.a.am(getContext(), 2131428004);
      ((LinearLayout.LayoutParams)localObject).topMargin = com.tencent.mm.bz.a.am(getContext(), 2131428005);
      this.iFY.addView(this.iFZ.getActionView(), (ViewGroup.LayoutParams)localObject);
      if (this.gOq.atI().hgD != 1)
        break label931;
      this.iFW.setVisibility(0);
      label594: localObject = (RelativeLayout.LayoutParams)this.iGo.getLayoutParams();
      this.iGb = com.tencent.mm.plugin.appbrand.config.a.a.t(this.gOq.atM()).dI(com.tencent.mm.plugin.appbrand.config.a.a.ayQ());
      ab.i("MicroMsg.AppBrandGameUILoadingSplash", "mLastDeviceOrientation :%s", new Object[] { this.iGb });
      if ((this.iGb != a.b.hiM) && (this.iGb != a.b.hiN) && (this.iGb != a.b.hiO) && (this.iGb != a.b.hiP))
        break label975;
      if (this.iFW.getVisibility() != 0)
        break label943;
      localLayoutParams.topMargin = com.tencent.mm.bz.a.am(getContext(), 2131428010);
      paramo.bottomMargin = com.tencent.mm.bz.a.am(getContext(), 2131428006);
      paramContext.topMargin = com.tencent.mm.bz.a.am(getContext(), 2131428013);
      this.iFW.setLayoutParams(paramContext);
      label746: ((RelativeLayout.LayoutParams)localObject).bottomMargin = com.tencent.mm.bz.a.am(getContext(), 2131428000);
      ((RelativeLayout.LayoutParams)localObject).width = com.tencent.mm.bz.a.am(getContext(), 2131428001);
      this.iDW.setLayoutParams(localLayoutParams);
      this.iGo.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.iFV.setLayoutParams(paramo);
      K(-1, true);
      this.iFZ.setBackgroundColor(0);
      this.iFZ.setForegroundStyle("black");
      this.iFZ.setNavBackOrClose(false);
      paramContext = new c.7(this);
      this.iFZ.setCloseButtonClickListener(paramContext);
      this.iFZ.setBackButtonClickListener(paramContext);
      n.q(getContext(), true);
      if (this.iGg)
        break label1101;
      this.iDW.dKS();
      AppMethodBeat.o(132947);
    }
    while (true)
    {
      return;
      e.aBD().cY(1000, 0);
      break;
      label900: this.iGj = getContext().getResources().getColor(2131689689);
      this.iGo.setProgressColor(this.iGj);
      break label297;
      label931: this.iFW.setVisibility(8);
      break label594;
      label943: localLayoutParams.topMargin = com.tencent.mm.bz.a.am(getContext(), 2131428014);
      paramo.bottomMargin = com.tencent.mm.bz.a.am(getContext(), 2131428007);
      break label746;
      label975: if (this.iFW.getVisibility() == 0)
      {
        localLayoutParams.topMargin = com.tencent.mm.bz.a.am(getContext(), 2131428012);
        paramo.bottomMargin = com.tencent.mm.bz.a.am(getContext(), 2131428007);
        paramContext.topMargin = com.tencent.mm.bz.a.am(getContext(), 2131428015);
        this.iFW.setLayoutParams(paramContext);
      }
      while (true)
      {
        ((RelativeLayout.LayoutParams)localObject).width = com.tencent.mm.bz.a.am(getContext(), 2131428003);
        ((RelativeLayout.LayoutParams)localObject).bottomMargin = com.tencent.mm.bz.a.am(getContext(), 2131428002);
        break;
        localLayoutParams.topMargin = com.tencent.mm.bz.a.am(getContext(), 2131428011);
        paramo.bottomMargin = com.tencent.mm.bz.a.am(getContext(), 2131428007);
      }
      label1101: this.iDW.setVisibility(4);
      this.iGa.setVisibility(4);
      AppMethodBeat.o(132947);
    }
  }

  public final void aHS()
  {
    AppMethodBeat.i(132949);
    ab.w("MicroMsg.AppBrandGameUILoadingSplash", "animateHide");
    post(new c.5(this));
    AppMethodBeat.o(132949);
  }

  public final void aHT()
  {
  }

  public final void cz(String paramString1, String paramString2)
  {
    AppMethodBeat.i(132948);
    com.tencent.mm.modelappbrand.a.b.abR().a(this.kU, paramString1, null, f.fqH);
    this.iFX.setText(paramString2);
    AppMethodBeat.o(132948);
  }

  public final View getView()
  {
    return this;
  }

  public final void nm(final int paramInt)
  {
    AppMethodBeat.i(132952);
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(132941);
        ab.i("MicroMsg.AppBrandGameUILoadingSplash", "onDataTransferState  state=" + paramInt);
        if (paramInt == 3)
          if (c.m(c.this))
          {
            c.n(c.this).setVisibility(0);
            c.n(c.this).setText(2131297094);
            c.k(c.this).setVisibility(4);
            AppMethodBeat.o(132941);
          }
        while (true)
        {
          return;
          c.a(c.this, this);
          AppMethodBeat.o(132941);
        }
      }
    });
    AppMethodBeat.o(132952);
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(132950);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    a.b localb = com.tencent.mm.plugin.appbrand.config.a.a.t(this.gOq.atM()).dI(com.tencent.mm.plugin.appbrand.config.a.a.ayQ());
    RelativeLayout.LayoutParams localLayoutParams1;
    RelativeLayout.LayoutParams localLayoutParams2;
    RelativeLayout.LayoutParams localLayoutParams3;
    RelativeLayout.LayoutParams localLayoutParams4;
    if (localb != this.iGb)
    {
      this.iGb = localb;
      localLayoutParams1 = (RelativeLayout.LayoutParams)this.iDW.getLayoutParams();
      localLayoutParams2 = (RelativeLayout.LayoutParams)this.iFW.getLayoutParams();
      localLayoutParams3 = (RelativeLayout.LayoutParams)this.iGo.getLayoutParams();
      localLayoutParams4 = (RelativeLayout.LayoutParams)this.iFV.getLayoutParams();
      if ((localb != a.b.hiM) && (localb != a.b.hiN) && (localb != a.b.hiO) && (localb != a.b.hiP))
        break label295;
      if (this.iFW.getVisibility() != 0)
        break label262;
      localLayoutParams1.topMargin = com.tencent.mm.bz.a.am(getContext(), 2131428010);
      localLayoutParams4.bottomMargin = com.tencent.mm.bz.a.am(getContext(), 2131428006);
      localLayoutParams2.topMargin = com.tencent.mm.bz.a.am(getContext(), 2131428013);
      this.iFW.setLayoutParams(localLayoutParams2);
    }
    while (true)
    {
      localLayoutParams3.width = com.tencent.mm.bz.a.am(getContext(), 2131428001);
      localLayoutParams3.bottomMargin = com.tencent.mm.bz.a.am(getContext(), 2131428000);
      this.iGo.setLayoutParams(localLayoutParams3);
      this.iDW.setLayoutParams(localLayoutParams1);
      this.iFV.setLayoutParams(localLayoutParams4);
      requestLayout();
      AppMethodBeat.o(132950);
      return;
      label262: localLayoutParams1.topMargin = com.tencent.mm.bz.a.am(getContext(), 2131428014);
      localLayoutParams4.bottomMargin = com.tencent.mm.bz.a.am(getContext(), 2131428007);
    }
    label295: if (this.iFW.getVisibility() == 0)
    {
      localLayoutParams1.topMargin = com.tencent.mm.bz.a.am(getContext(), 2131428012);
      localLayoutParams4.bottomMargin = com.tencent.mm.bz.a.am(getContext(), 2131428007);
      localLayoutParams2.topMargin = com.tencent.mm.bz.a.am(getContext(), 2131428015);
      this.iFW.setLayoutParams(localLayoutParams2);
    }
    while (true)
    {
      localLayoutParams3.width = com.tencent.mm.bz.a.am(getContext(), 2131428003);
      localLayoutParams3.bottomMargin = com.tencent.mm.bz.a.am(getContext(), 2131428002);
      break;
      localLayoutParams1.topMargin = com.tencent.mm.bz.a.am(getContext(), 2131428011);
      localLayoutParams4.bottomMargin = com.tencent.mm.bz.a.am(getContext(), 2131428007);
    }
  }

  public final void setProgress(int paramInt)
  {
    AppMethodBeat.i(132951);
    if (!this.iGg)
      if (paramInt < 100)
      {
        this.iGa.setText(String.format("%d%%", new Object[] { Integer.valueOf(paramInt / 2) }));
        AppMethodBeat.o(132951);
      }
    while (true)
    {
      return;
      if (!this.iGp)
      {
        this.iGp = true;
        new Timer(true).scheduleAtFixedRate(new c.b(this), 0L, 50L);
        AppMethodBeat.o(132951);
        continue;
        if ((!this.iGh) && (this.iGk))
        {
          if (paramInt < 100)
          {
            this.iGa.setText(String.format("%d%%", new Object[] { Integer.valueOf(paramInt / 2) }));
            AppMethodBeat.o(132951);
          }
          else if (!this.iGp)
          {
            this.iGp = true;
            new Timer(true).scheduleAtFixedRate(new c.b(this), 0L, 100L);
            AppMethodBeat.o(132951);
          }
        }
        else if (paramInt < 100)
        {
          if (this.iGm.getVisibility() == 0)
          {
            this.iGo.setProgress(paramInt / 2);
            AppMethodBeat.o(132951);
          }
        }
        else if (!this.iGq)
        {
          this.iGq = true;
          new Timer(true).scheduleAtFixedRate(new c.a(this), 0L, 1000 / this.iGl);
        }
      }
      else
      {
        AppMethodBeat.o(132951);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.c
 * JD-Core Version:    0.6.2
 */