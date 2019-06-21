package com.tencent.mm.plugin.sns.ui;

import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.QFadeImageView;
import com.tencent.mm.ui.widget.QImageView.a;

final class SnsTimeLineUI$a extends Animation
{
  int DELAY_TIME = 600;
  private ListView nDp;
  float rAa = 0.0F;
  float rAb = 0.0F;
  float rAc = 0.0F;
  float rAd = 0.0F;
  private float rzM;
  private float rzN;
  float rzO = -1.0F;
  float rzP;
  private float rzQ = 50.0F;
  private float rzR = 10.0F;
  float rzS = 0.0F;
  private float rzT = 0.0F;
  private float rzU;
  private float rzV;
  boolean rzW;
  int rzX;
  boolean rzY = false;
  int rzZ = 0;

  public SnsTimeLineUI$a(SnsTimeLineUI paramSnsTimeLineUI, ListView paramListView)
  {
    this.nDp = paramListView;
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    AppMethodBeat.i(39548);
    if (SnsTimeLineUI.rza.booleanValue())
      ab.d("MicroMsg.RefreshAnim", "animtest applyTransformation vis %s interpolatedTime %s isJustUp %s", new Object[] { Integer.valueOf(SnsTimeLineUI.r(this.rzs).getVisibility()), Float.valueOf(paramFloat), Boolean.valueOf(this.rzW) });
    if (SnsTimeLineUI.r(this.rzs).getVisibility() != 0)
      AppMethodBeat.o(39548);
    while (true)
    {
      return;
      f1 = (paramFloat - this.rzU) * (float)getDuration();
      if (f1 < 2.0F)
      {
        if (SnsTimeLineUI.rza.booleanValue())
          ab.d("MicroMsg.RefreshAnim", "applyTransformation wawawa %s", new Object[] { Float.valueOf(f1) });
        AppMethodBeat.o(39548);
      }
      else
      {
        this.rzU = paramFloat;
        SnsTimeLineUI.r(this.rzs).setImageResource(2131231331);
        SnsTimeLineUI.r(this.rzs).setScaleType(QImageView.a.zNN);
        if (((float)getDuration() * paramFloat < (float)(getDuration() - this.DELAY_TIME)) && (!this.rzW))
          break label416;
        paramTransformation = (AbsoluteLayout.LayoutParams)SnsTimeLineUI.r(this.rzs).getLayoutParams();
        if (paramTransformation.y > this.rzT)
          break;
        AppMethodBeat.o(39548);
      }
    }
    if (this.rAc == 0.0F)
    {
      this.rAc = (-this.rzT + paramTransformation.y);
      this.rAd = paramTransformation.y;
      this.rzV = paramFloat;
    }
    float f1 = (paramFloat - this.rzV) / (1.0F - this.rzV);
    paramFloat = this.rAc * f1;
    float f2 = this.rAd - paramFloat;
    if (SnsTimeLineUI.rza.booleanValue())
      ab.i("MicroMsg.RefreshAnim", "animcheck interpolatedTime y %s duration %s factor %s residualTime %s pass %s ", new Object[] { Float.valueOf(f2), Long.valueOf(getDuration()), Float.valueOf(f1), Float.valueOf(paramFloat), Float.valueOf(this.rzV * (float)getDuration()) });
    if (paramTransformation.y > f2)
      paramTransformation.y = ((int)f2);
    this.rzS = paramTransformation.y;
    SnsTimeLineUI.r(this.rzs).setLayoutParams(paramTransformation);
    while (true)
    {
      SnsTimeLineUI.r(this.rzs).invalidate();
      AppMethodBeat.o(39548);
      break;
      label416: if (SnsTimeLineUI.rza.booleanValue())
        ab.d("MicroMsg.RefreshAnim", "animcheck delt Rotate " + f1 / 2.5F);
      SnsTimeLineUI.r(this.rzs).getImageMatrix().postRotate(f1 / 2.5F, this.rzM, this.rzN);
    }
  }

  public final void bb(float paramFloat)
  {
    AppMethodBeat.i(39542);
    if (this.nDp != null)
    {
      if (this.nDp.getFirstVisiblePosition() != 0)
        break label122;
      if (SnsTimeLineUI.j(this.rzs).qQt.getTop() >= SnsTimeLineUI.h(this.rzs).rzX)
        SnsTimeLineUI.b(this.rzs, 0);
    }
    while (true)
    {
      if (SnsTimeLineUI.rza.booleanValue())
        ab.d("MicroMsg.RefreshAnim", "animtest setDistanceY %s %s %s", new Object[] { Float.valueOf(paramFloat), Float.valueOf(this.rzP), Float.valueOf(this.rzO) });
      if (SnsTimeLineUI.r(this.rzs).getVisibility() == 0)
        break;
      AppMethodBeat.o(39542);
      return;
      label122: SnsTimeLineUI.b(this.rzs, 8);
    }
    SnsTimeLineUI.r(this.rzs).clearAnimation();
    init();
    float f1 = paramFloat;
    if (paramFloat <= -this.rzQ)
      f1 = -this.rzQ;
    float f2 = f1;
    if (f1 >= this.rzQ)
      f2 = this.rzQ;
    if (f2 < 0.0F)
    {
      this.rzS -= f2 * 2.0F;
      label200: f1 = this.rzS;
      paramFloat = f1;
      if (f1 < this.rzP)
      {
        paramFloat = this.rzP;
        this.rzS = this.rzP;
      }
      f1 = paramFloat;
      if (paramFloat > this.rzO)
      {
        f1 = this.rzO;
        this.rzS = this.rzO;
      }
      if (SnsTimeLineUI.rza.booleanValue())
        ab.d("MicroMsg.RefreshAnim", "animtest setDistanceY %s %s %s sumY %s translateY %s distanceY %s", new Object[] { Float.valueOf(f2), Float.valueOf(this.rzP), Float.valueOf(this.rzO), Float.valueOf(this.rzS), Float.valueOf(f1), Float.valueOf(this.rzQ) });
      if (f1 != this.rzO)
        break label457;
    }
    label457: for (paramFloat = f2 * 2.0F; ; paramFloat = 5.0F * f2)
    {
      SnsTimeLineUI.r(this.rzs).setScaleType(QImageView.a.zNN);
      SnsTimeLineUI.r(this.rzs).getImageMatrix().postRotate(paramFloat, this.rzM, this.rzN);
      SnsTimeLineUI.r(this.rzs).setImageResource(2131231331);
      AbsoluteLayout.LayoutParams localLayoutParams = (AbsoluteLayout.LayoutParams)SnsTimeLineUI.r(this.rzs).getLayoutParams();
      localLayoutParams.y = ((int)f1);
      SnsTimeLineUI.r(this.rzs).setLayoutParams(localLayoutParams);
      SnsTimeLineUI.r(this.rzs).invalidate();
      AppMethodBeat.o(39542);
      break;
      this.rzS -= f2 / 2.0F;
      break label200;
    }
  }

  public final void cur()
  {
    AppMethodBeat.i(39543);
    if (SnsTimeLineUI.rza.booleanValue())
      ab.d("MicroMsg.RefreshAnim", "animtest playLoading");
    if (SnsTimeLineUI.r(this.rzs).getVisibility() != 0)
      AppMethodBeat.o(39543);
    while (true)
    {
      return;
      init();
      this.rzS = (this.rzO + 20.0F);
      AbsoluteLayout.LayoutParams localLayoutParams = (AbsoluteLayout.LayoutParams)SnsTimeLineUI.r(this.rzs).getLayoutParams();
      localLayoutParams.y = ((int)this.rzO);
      SnsTimeLineUI.r(this.rzs).setLayoutParams(localLayoutParams);
      cut();
      AppMethodBeat.o(39543);
    }
  }

  public final void cus()
  {
    AppMethodBeat.i(39544);
    if (SnsTimeLineUI.rza.booleanValue())
      ab.i("MicroMsg.RefreshAnim", "play end vis: %d, sumY %f MAX_Y %f", new Object[] { Integer.valueOf(SnsTimeLineUI.r(this.rzs).getVisibility()), Float.valueOf(this.rzS), Float.valueOf(this.rzO) });
    if (SnsTimeLineUI.r(this.rzs).getVisibility() != 0)
      AppMethodBeat.o(39544);
    while (true)
    {
      return;
      init();
      if (this.rzS < this.rzO - this.rzR)
      {
        AppMethodBeat.o(39544);
      }
      else
      {
        SnsTimeLineUI.r(this.rzs).clearAnimation();
        kK(this.DELAY_TIME + 100);
        SnsTimeLineUI.r(this.rzs).startAnimation(this);
        this.rzW = false;
        AppMethodBeat.o(39544);
      }
    }
  }

  public final void cut()
  {
    AppMethodBeat.i(39546);
    if (SnsTimeLineUI.rza.booleanValue())
      ab.d("MicroMsg.RefreshAnim", "animtest setAcitonUp");
    if (SnsTimeLineUI.r(this.rzs).getVisibility() != 0)
      AppMethodBeat.o(39546);
    while (true)
    {
      return;
      init();
      SnsTimeLineUI.r(this.rzs).clearAnimation();
      if (SnsTimeLineUI.rza.booleanValue())
        ab.v("MicroMsg.RefreshAnim", "setAcitonUp1 sumY  %s MAX_Y %s %s", new Object[] { Float.valueOf(this.rzS), Float.valueOf(this.rzO), bo.dpG().toString() });
      SnsTimeLineUI.r(this.rzs).startAnimation(this);
      if (this.rzS >= this.rzO - this.rzR)
      {
        kK(20000L);
        this.rzW = false;
        AppMethodBeat.o(39546);
      }
      else
      {
        kK(this.DELAY_TIME + 100);
        this.rzW = true;
        AppMethodBeat.o(39546);
      }
    }
  }

  final void init()
  {
    AppMethodBeat.i(39547);
    if ((this.rzO == -1.0F) || (this.rzN < 0.1D))
    {
      this.rzO = BackwardSupportUtil.b.b(this.rzs, 70.0F);
      this.rzQ = BackwardSupportUtil.b.b(this.rzs, 16.0F);
      this.rzM = (SnsTimeLineUI.r(this.rzs).getWidth() / 2);
      this.rzN = (SnsTimeLineUI.r(this.rzs).getHeight() / 2);
      this.rzT = (-SnsTimeLineUI.r(this.rzs).getHeight() * 2);
      if (this.rzT == 0.0F)
        this.rzT = (-BackwardSupportUtil.b.b(this.rzs, 40.0F));
      this.rzP = this.rzT;
      if (SnsTimeLineUI.rza.booleanValue())
        ab.d("MicroMsg.RefreshAnim", "init MIN_Y %s MAX_Y %s targetInitY %s distanceY %s", new Object[] { Float.valueOf(this.rzP), Float.valueOf(this.rzO), Float.valueOf(this.rzT), Float.valueOf(this.rzQ) });
      this.rzS = this.rzP;
      if (!this.rzY)
      {
        if (SnsTimeLineUI.rza.booleanValue())
          ab.i("MicroMsg.RefreshAnim", "initState");
        this.rzZ = ((AbsoluteLayout.LayoutParams)SnsTimeLineUI.r(this.rzs).getLayoutParams()).y;
        this.rAa = this.rzO;
        this.rAb = this.rzS;
      }
      this.rzY = true;
    }
    AppMethodBeat.o(39547);
  }

  public final void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(39549);
    super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
    if (SnsTimeLineUI.rza.booleanValue())
      ab.i("MicroMsg.RefreshAnim", "anim initialize %s", new Object[] { bo.dpG().toString() });
    this.rzU = 0.0F;
    this.rzV = 0.0F;
    this.rAc = 0.0F;
    this.rAd = 0.0F;
    AppMethodBeat.o(39549);
  }

  final void kK(long paramLong)
  {
    AppMethodBeat.i(39545);
    if (SnsTimeLineUI.rza.booleanValue())
      ab.d("MicroMsg.RefreshAnim", "setDurationTime durationMillis %s %s", new Object[] { Long.valueOf(paramLong), bo.dpG().toString() });
    setDuration(paramLong);
    AppMethodBeat.o(39545);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.a
 * JD-Core Version:    0.6.2
 */