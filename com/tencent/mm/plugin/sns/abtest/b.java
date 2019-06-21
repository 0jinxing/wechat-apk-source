package com.tencent.mm.plugin.sns.abtest;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsoluteLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

public final class b
{
  int acV;
  int iJp;
  int mScreenHeight;
  ViewGroup qCA;
  NotInterestMenu.b qCB;
  Animation qCC;
  Animation qCD;
  private Animation qCE;
  private Animation qCF;
  int qCG;
  int qCH;
  int qCI;
  int qCJ;
  int qCK;
  boolean qCL;
  AbsoluteLayout qCM;
  boolean qCN;
  boolean qCO;
  NotInterestMenu.c qCu;
  NotInterestMenu qCz;

  public b(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(35677);
    this.qCB = new b.1(this);
    this.qCC = null;
    this.qCD = null;
    this.qCE = null;
    this.qCF = null;
    this.iJp = 0;
    this.acV = 0;
    this.qCG = 0;
    this.qCH = 0;
    this.qCI = 0;
    this.mScreenHeight = 0;
    this.qCJ = 0;
    this.qCK = 0;
    this.qCL = false;
    this.qCM = null;
    this.qCN = false;
    this.qCO = false;
    this.qCA = paramViewGroup;
    this.qCC = AnimationUtils.loadAnimation(ah.getContext(), 2131034160);
    this.qCC.setFillAfter(true);
    this.qCC.setDuration(100L);
    this.qCC.setAnimationListener(new b.2(this));
    this.qCD = AnimationUtils.loadAnimation(ah.getContext(), 2131034163);
    this.qCD.setFillAfter(true);
    this.qCD.setDuration(100L);
    this.qCD.setAnimationListener(new b.3(this));
    this.qCE = AnimationUtils.loadAnimation(ah.getContext(), 2131034161);
    this.qCE.setFillAfter(true);
    this.qCE.setDuration(100L);
    this.qCE.setAnimationListener(new b.4(this));
    this.qCF = AnimationUtils.loadAnimation(ah.getContext(), 2131034162);
    this.qCF.setFillAfter(true);
    this.qCF.setDuration(100L);
    this.qCF.setAnimationListener(new b.5(this));
    AppMethodBeat.o(35677);
  }

  public final void cma()
  {
    AppMethodBeat.i(35678);
    if ((this.qCM != null) && (this.qCA != null) && (this.qCz != null))
    {
      this.qCM.removeView(this.qCz);
      this.qCA.removeView(this.qCM);
      this.qCM = null;
      this.qCz = null;
      this.qCL = false;
    }
    AppMethodBeat.o(35678);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.abtest.b
 * JD-Core Version:    0.6.2
 */