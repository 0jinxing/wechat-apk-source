package com.tencent.mm.plugin.webview.ui.tools;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class l
  implements LogoWebViewWrapper.b
{
  static final int utW = 2130840775;
  private boolean aIA = false;
  boolean hfA = false;
  l.a utS;
  ImageView utT;
  LogoWebViewWrapper utU;
  int utV = 0;
  private boolean utX = false;
  private int utY = 0;
  private float utZ = 0.0F;
  private ValueAnimator uua;
  private ViewPropertyAnimator uub;
  private float uuc;
  View uud;
  View uue;
  TextView uuf;
  boolean uug = true;
  boolean uuh = false;

  public final void Jp(int paramInt)
  {
    AppMethodBeat.i(7702);
    if (this.uud != null)
      this.uud.setBackgroundColor(paramInt);
    AppMethodBeat.o(7702);
  }

  public final void as(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(7703);
    Object localObject;
    String str1;
    label27: String str2;
    if (this.utT == null)
    {
      localObject = "null";
      if (this.utT != null)
        break label105;
      str1 = "null";
      if (this.utT != null)
        break label120;
      str2 = "null";
      label38: ab.v("MicroMsg.WebViewPullDownLogoDelegate", "onOverScrollOffset, offset = %d, pointerDown = %b, refreshImage.visibility = %s, refreshImage.drawable = %s, refreshImage.alpha = %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean), localObject, str1, str2 });
      if (this.hfA)
        break label135;
      AppMethodBeat.o(7703);
    }
    while (true)
    {
      return;
      localObject = String.valueOf(this.utT.getVisibility());
      break;
      label105: str1 = this.utT.getDrawable().toString();
      break label27;
      label120: str2 = String.valueOf(this.utT.getAlpha());
      break label38;
      label135: if (paramInt == 0)
        this.utX = false;
      if (this.utT == null)
      {
        AppMethodBeat.o(7703);
      }
      else
      {
        if (paramBoolean)
          break label218;
        if ((Math.abs(paramInt) > this.utV) && (!this.aIA))
        {
          ab.d("MicroMsg.WebViewPullDownLogoDelegate", "startLoading()");
          startLoading();
          AppMethodBeat.o(7703);
        }
        else
        {
          if (!this.aIA)
            break label247;
          AppMethodBeat.o(7703);
        }
      }
    }
    label218: label247: int i;
    if (Math.abs(paramInt) >= this.utV)
    {
      if (this.utU != null)
        this.utU.setReleaseTargetHeight(this.utV);
      if ((this.utT != null) && (this.utT.getAlpha() < 1.0F) && (this.uub == null) && (paramBoolean))
      {
        ab.d("MicroMsg.WebViewPullDownLogoDelegate", "refreshImage alpha to 1.0f");
        this.uub = this.utT.animate().alpha(1.0F).setDuration(500L);
        this.uub.setListener(new l.1(this));
        this.uub.start();
      }
      if (!this.utX)
      {
        i = -paramInt - this.utY;
        if (Math.abs(paramInt) < this.utV)
          break label486;
        i *= 5;
      }
    }
    while (true)
    {
      this.utY = (-paramInt);
      float f1 = this.utT.getHeight() / 2.0F;
      float f2 = this.utT.getWidth() / 2.0F;
      this.utZ -= i;
      this.utT.setScaleType(ImageView.ScaleType.MATRIX);
      localObject = this.utT.getImageMatrix();
      ((Matrix)localObject).postRotate(-i, f2, f1);
      this.utT.setImageMatrix((Matrix)localObject);
      this.utT.setImageResource(utW);
      this.utT.invalidate();
      AppMethodBeat.o(7703);
      break;
      if (this.utU == null)
        break label247;
      this.utU.setReleaseTargetHeight(0);
      break label247;
      label486: i *= 2;
    }
  }

  public final void cZU()
  {
    AppMethodBeat.i(7698);
    this.hfA = false;
    stopLoading();
    if ((this.uug) && (this.uue != null) && (!this.uuh))
    {
      nM(false);
      this.utU.setReleaseTargetHeight(0);
      this.uue.setVisibility(0);
    }
    AppMethodBeat.o(7698);
  }

  public final float getStartLoadingStep()
  {
    return this.uuc;
  }

  public final void nM(boolean paramBoolean)
  {
    AppMethodBeat.i(7705);
    if ((this.utU != null) && (this.utU.uru != paramBoolean))
    {
      this.utU.nM(paramBoolean);
      if (this.uue != null)
        this.uue.setVisibility(8);
      this.uuh = paramBoolean;
    }
    AppMethodBeat.o(7705);
  }

  public final void release()
  {
    AppMethodBeat.i(7701);
    if (this.utU != null)
    {
      LogoWebViewWrapper localLogoWebViewWrapper = this.utU;
      if (localLogoWebViewWrapper.uro != null)
      {
        localLogoWebViewWrapper.uro.removeView(localLogoWebViewWrapper.ejN);
        localLogoWebViewWrapper.ejN = null;
      }
      localLogoWebViewWrapper = this.utU;
      localLogoWebViewWrapper.ury = null;
      localLogoWebViewWrapper.urx = null;
    }
    if (this.uud != null)
      ((ViewGroup)this.uud).removeAllViews();
    this.utU = null;
    this.utT = null;
    this.utY = 0;
    if (this.uua != null)
    {
      this.uua.cancel();
      this.uua = null;
    }
    AppMethodBeat.o(7701);
  }

  public final void setCurrentURL(String paramString)
  {
    AppMethodBeat.i(7706);
    if ((!this.uug) || (this.uuh))
    {
      nM(true);
      if ((this.uue != null) && (this.uue.getVisibility() == 0))
        this.uue.setVisibility(8);
      AppMethodBeat.o(7706);
    }
    while (true)
    {
      return;
      if (this.uuf != null)
      {
        if (!bo.isNullOrNil(paramString))
        {
          paramString = Uri.parse(paramString).getHost();
          if (!bo.isNullOrNil(paramString))
          {
            paramString = this.uuf.getContext().getString(2131305572, new Object[] { paramString });
            this.uuf.setVisibility(0);
            this.uuf.setText(paramString);
            nM(false);
            AppMethodBeat.o(7706);
          }
        }
        else
        {
          this.uuf.setVisibility(8);
        }
      }
      else
        AppMethodBeat.o(7706);
    }
  }

  public final void setStartLoadingStep(float paramFloat)
  {
    float f1 = 0.0F;
    AppMethodBeat.i(7704);
    this.uuc = paramFloat;
    this.utT.setScaleType(ImageView.ScaleType.MATRIX);
    Matrix localMatrix = this.utT.getImageMatrix();
    float f2;
    if (this.utT == null)
    {
      f2 = 0.0F;
      if (this.utT != null)
        break label90;
    }
    while (true)
    {
      localMatrix.setRotate(paramFloat, f2, f1);
      this.utZ = paramFloat;
      this.utT.invalidate();
      AppMethodBeat.o(7704);
      return;
      f2 = this.utT.getWidth() / 2.0F;
      break;
      label90: f1 = this.utT.getHeight() / 2.0F;
    }
  }

  public final void startLoading()
  {
    AppMethodBeat.i(7699);
    if (this.aIA)
      AppMethodBeat.o(7699);
    while (true)
    {
      return;
      if ((this.utT == null) || (this.utU == null))
      {
        AppMethodBeat.o(7699);
      }
      else
      {
        this.aIA = true;
        this.utU.nM(true);
        this.utT.clearAnimation();
        if (this.uua != null)
          this.uua.cancel();
        this.uua = ObjectAnimator.ofFloat(this, "startLoadingStep", new float[] { this.utZ + 0.0F, this.utZ + 354.0F });
        this.uua.setDuration(960L);
        this.uua.setRepeatMode(1);
        this.uua.setRepeatCount(-1);
        this.uua.setInterpolator(new LinearInterpolator());
        this.uua.start();
        if (this.utS != null)
          this.utS.cZV();
        AppMethodBeat.o(7699);
      }
    }
  }

  public final void stopLoading()
  {
    AppMethodBeat.i(7700);
    if (!this.aIA)
      AppMethodBeat.o(7700);
    while (true)
    {
      return;
      ab.d("MicroMsg.WebViewPullDownLogoDelegate", "stopLoading()");
      this.utX = true;
      this.aIA = false;
      if ((this.utU != null) && (this.hfA))
        this.utU.nM(false);
      if (this.uua != null)
        this.uua.cancel();
      if (this.utU != null)
        this.utU.z(0, 250L);
      if (this.utT != null)
      {
        ab.d("MicroMsg.WebViewPullDownLogoDelegate", "refreshImage, alpha to 0f");
        this.utT.animate().alpha(0.0F).setDuration(500L).start();
      }
      AppMethodBeat.o(7700);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.l
 * JD-Core Version:    0.6.2
 */