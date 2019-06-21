package com.tencent.mm.ui.tools;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class e
{
  private float aKw;
  private float aKx;
  private final Context context;
  private ak mHandler;
  int mHeight;
  int mWidth;
  private int xJ;
  private int xL;
  int zES;
  int zET;
  private int zEU;
  private int zEV;
  float zEW;
  float zEX;
  private float zEY;
  public float zEZ;
  private int zFa;
  int zFb;
  float zFc;
  public int zFd;
  int zFe;
  int zFf;
  int zFg;
  int zFh;
  private int zFi;
  private int zFj;
  int zFk;
  int zFl;
  int zFm;
  int zFn;
  int zFo;
  int zFp;

  public e(Context paramContext)
  {
    AppMethodBeat.i(107646);
    this.xJ = 0;
    this.xL = 0;
    this.mWidth = 0;
    this.mHeight = 0;
    this.zES = 0;
    this.zET = 0;
    this.zEU = 0;
    this.zEV = 0;
    this.aKw = 0.0F;
    this.aKx = 0.0F;
    this.zEW = 0.0F;
    this.zEX = 0.0F;
    this.zEY = 1.0F;
    this.zEZ = 1.0F;
    this.zFa = 0;
    this.zFb = 0;
    this.zFc = 1.0F;
    this.zFd = 0;
    this.zFe = 0;
    this.zFf = 0;
    this.zFg = 0;
    this.zFh = 0;
    this.zFi = 300;
    this.zFj = 10;
    this.zFk = 0;
    this.zFl = 1;
    this.zFm = 2;
    this.zFn = 3;
    this.zFo = 4;
    this.zFp = this.zFk;
    this.mHandler = new ak();
    this.context = paramContext;
    AppMethodBeat.o(107646);
  }

  private void E(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(107647);
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    if ((this.xJ == 0) && (this.xL == 0))
    {
      this.xJ = (paramView.getWidth() / 2);
      this.xL = (paramView.getHeight() / 2);
    }
    this.zEU = (this.xJ - arrayOfInt[0]);
    this.zEV = (this.xL - arrayOfInt[1]);
    int i = paramView.getWidth();
    int j = paramView.getHeight();
    if ((i == 0) || (j == 0))
    {
      i = this.zES;
      j = this.zET;
    }
    while (true)
    {
      if ((i != 0) && (j != 0))
      {
        this.aKw = (this.mWidth / i);
        this.aKx = (this.mHeight / j);
      }
      float f1 = this.zEY;
      if ((this.zFe != 0) || (this.zFf != 0) || (this.zFg != 0) || (this.zFh != 0))
        f1 = 1.1F;
      float f2;
      if (paramBoolean)
      {
        f2 = 1.0F;
        f1 = f2;
        if (this.zES != 0)
        {
          f1 = f2;
          if (this.zET != 0)
          {
            this.aKw = (this.mWidth / this.zES);
            this.aKx = (this.mHeight / this.zET);
            f1 = f2;
          }
        }
      }
      if (this.zEZ != 1.0D)
      {
        this.zEU += arrayOfInt[0];
        this.zEV += arrayOfInt[1];
        this.zEW = (this.aKw * this.zEZ);
        this.zEX = this.zEW;
        this.zEV = ((int)(this.zEV - this.zFb * this.zEW));
        this.zEU = ((int)(this.zEU - this.zFa * this.zEW));
        AppMethodBeat.o(107647);
        return;
      }
      if (this.aKw > this.aKx)
      {
        this.zEW = (this.aKw * f1);
        this.zEV = ((int)(this.zEV - (j * this.zEW - this.mHeight * f1) / 2.0F));
        label399: this.zEV = ((int)(this.zEV - this.mHeight * (f1 - 1.0F) / 2.0F - this.zFd * this.zEW / 2.0F));
        this.zEU = ((int)(this.zEU - this.mWidth * (f1 - 1.0F) / 2.0F));
        if ((this.zET == 0) || (this.xL >= (j - this.zET) / 2))
          break label686;
        f2 = this.zEV;
      }
      for (this.zEV = ((int)((f1 - 1.0F) * this.mHeight / 2.0F + f2)); ; this.zEV = ((int)(this.zEV - (f1 - 1.0F) * this.mHeight / 2.0F)))
        label686: 
        do
        {
          if ((this.mWidth == 0) && (this.mHeight == 0))
          {
            this.zEW = 0.5F;
            this.zFc = 0.0F;
            this.zEU = ((int)(this.zEU - i * this.zEW / 2.0F));
            this.zEV = ((int)(this.zEV - j * this.zEW / 2.0F - this.zFd * this.zEW / 2.0F));
          }
          AppMethodBeat.o(107647);
          break;
          this.zEW = (this.aKx * f1);
          this.zEU = ((int)(this.zEU - (i * this.zEW - this.mWidth * f1) / 2.0F));
          if ((this.zET == 0) || (this.zET >= j))
            break label399;
          this.zEV = ((int)(this.zEV - (j * this.zEW - this.mHeight * f1) / 2.0F));
          break label399;
        }
        while ((this.zET == 0) || (this.xL + this.mHeight <= (this.zET + j) / 2));
    }
  }

  public final void L(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.xJ = paramInt1;
    this.xL = paramInt2;
    this.mWidth = paramInt3;
    this.mHeight = paramInt4;
  }

  public final void PJ(int paramInt)
  {
    this.zFi = paramInt;
  }

  @TargetApi(16)
  public final void a(View paramView1, View paramView2, e.b paramb)
  {
    AppMethodBeat.i(107648);
    if ((Build.VERSION.SDK_INT < 12) || (paramView1 == null) || (this.zFp == this.zFm) || (this.zFp == this.zFo) || (this.zFp == this.zFn))
      AppMethodBeat.o(107648);
    while (true)
    {
      return;
      E(paramView1, false);
      paramView1.setPivotX(0.0F);
      paramView1.setPivotY(0.0F);
      paramView1.setScaleX(this.zEW);
      paramView1.setScaleY(this.zEW);
      paramView1.setTranslationX(this.zEU);
      paramView1.setTranslationY(this.zEV);
      if (paramView2 != null)
      {
        paramView2.setAlpha(0.0F);
        paramView2.animate().setDuration(this.zFi).setInterpolator(new DecelerateInterpolator(1.2F)).alpha(1.0F);
      }
      paramView1.animate().setDuration(this.zFi).setInterpolator(new DecelerateInterpolator(1.2F)).scaleX(1.0F).scaleY(1.0F).translationX(0.0F).translationY(0.0F).setListener(new e.1(this, paramb));
      this.mHandler.postDelayed(new e.2(this, paramView1), this.zFj);
      AppMethodBeat.o(107648);
    }
  }

  @TargetApi(16)
  public final void a(View paramView1, View paramView2, e.b paramb, e.a parama)
  {
    AppMethodBeat.i(107649);
    if ((Build.VERSION.SDK_INT < 12) || (paramView1 == null) || (this.zFp == this.zFm) || (this.zFp == this.zFo) || (this.zFp == this.zFl))
    {
      ab.i("MicroMsg.ImagePreviewAnimation", "ExitAnimation not run! animationState: %s , gallery:%s", new Object[] { Integer.valueOf(this.zFp), paramView1 });
      AppMethodBeat.o(107649);
    }
    while (true)
    {
      return;
      E(paramView1, true);
      if (paramView2 != null)
        paramView2.animate().setDuration(200L).setInterpolator(new DecelerateInterpolator(1.2F)).alpha(0.0F);
      paramView2 = new AnimationSet(true);
      parama = new e.3(this, this.zEW, this.zEW, paramView1, parama);
      parama.setDuration(200L);
      parama.setInterpolator(new DecelerateInterpolator(1.2F));
      paramView2.addAnimation(parama);
      parama = new TranslateAnimation(0.0F, this.zEU, 0.0F, this.zEV);
      parama.setDuration(200L);
      parama.setInterpolator(new DecelerateInterpolator(1.2F));
      paramView2.addAnimation(parama);
      parama = new AlphaAnimation(1.0F, this.zFc);
      parama.setDuration(200L);
      parama.setInterpolator(new DecelerateInterpolator(1.2F));
      paramView2.addAnimation(parama);
      paramView2.setFillAfter(true);
      paramView2.setAnimationListener(new e.4(this, paramb));
      paramView1.startAnimation(paramView2);
      AppMethodBeat.o(107649);
    }
  }

  public final void hw(int paramInt1, int paramInt2)
  {
    this.zES = paramInt1;
    this.zET = paramInt2;
  }

  public final void hx(int paramInt1, int paramInt2)
  {
    this.zFe = paramInt1;
    this.zFf = paramInt2;
    this.zFg = 0;
    this.zFh = 0;
  }

  public final void hy(int paramInt1, int paramInt2)
  {
    this.zFa = paramInt1;
    this.zFb = paramInt2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.e
 * JD-Core Version:    0.6.2
 */