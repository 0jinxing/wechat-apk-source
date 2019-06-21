package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.ui.WxBaseImageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public class WxImageView extends WxBaseImageView
  implements g
{
  private final float[] Bn;
  private float aKB;
  protected Matrix aKo;
  private boolean iXv;
  private int iZn;
  private int iZo;
  private boolean isInited;
  protected ak mHandler;
  private int orientation;
  protected Bitmap rdJ;
  private MultiTouchImageView.a rsT;
  private boolean rsw;
  protected Matrix yyY;
  private final Matrix yyZ;
  int yza;
  int yzb;
  private float yzc;
  private float yzd;
  private float yze;
  private float yzf;
  private float yzg;
  private float yzh;
  private float yzi;
  private boolean yzj;
  private boolean yzk;
  private boolean yzl;
  private float yzm;
  private float yzn;
  private boolean yzp;
  private Drawable yzq;

  public WxImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107098);
    this.yyY = new Matrix();
    this.aKo = new Matrix();
    this.yyZ = new Matrix();
    this.Bn = new float[9];
    this.rdJ = null;
    this.yza = -1;
    this.yzb = -1;
    this.yzc = 0.0F;
    this.yzd = 0.0F;
    this.yze = 0.0F;
    this.isInited = false;
    this.iXv = false;
    this.yzg = 2.0F;
    this.yzh = 0.75F;
    this.yzi = 20.0F;
    this.yzj = false;
    this.yzk = false;
    this.yzl = false;
    this.rsw = true;
    this.yzp = false;
    this.mHandler = new ak();
    this.aKB = 1.0F;
    AppMethodBeat.o(107098);
  }

  public WxImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107099);
    this.yyY = new Matrix();
    this.aKo = new Matrix();
    this.yyZ = new Matrix();
    this.Bn = new float[9];
    this.rdJ = null;
    this.yza = -1;
    this.yzb = -1;
    this.yzc = 0.0F;
    this.yzd = 0.0F;
    this.yze = 0.0F;
    this.isInited = false;
    this.iXv = false;
    this.yzg = 2.0F;
    this.yzh = 0.75F;
    this.yzi = 20.0F;
    this.yzj = false;
    this.yzk = false;
    this.yzl = false;
    this.rsw = true;
    this.yzp = false;
    this.mHandler = new ak();
    this.aKB = 1.0F;
    AppMethodBeat.o(107099);
  }

  private void ai(boolean paramBoolean1, boolean paramBoolean2)
  {
    float f1 = 0.0F;
    AppMethodBeat.i(107112);
    if ((this.yzq == null) && (this.yzp))
    {
      AppMethodBeat.o(107112);
      return;
    }
    Matrix localMatrix = getImageViewMatrix();
    RectF localRectF;
    label67: float f2;
    float f3;
    if (this.yzp)
    {
      localRectF = new RectF(0.0F, 0.0F, this.yzq.getIntrinsicWidth(), this.yzq.getIntrinsicHeight());
      localMatrix.mapRect(localRectF);
      f2 = localRectF.height();
      f3 = localRectF.width();
      if (!paramBoolean2)
        break label254;
      if (f2 >= this.iZo)
        break label203;
      f2 = (this.iZo - f2) / 2.0F - localRectF.top;
    }
    while (true)
    {
      label122: if (paramBoolean1)
        if (f3 < this.iZn)
          f1 = (this.iZn - f3) / 2.0F - localRectF.left;
      while (true)
      {
        aj(f1, f2);
        getImageViewMatrix().mapRect(localRectF);
        AppMethodBeat.o(107112);
        break;
        localRectF = new RectF(0.0F, 0.0F, this.imageWidth, this.imageHeight);
        break label67;
        label203: if (localRectF.top > 0.0F)
        {
          f2 = -localRectF.top;
          break label122;
        }
        if (localRectF.bottom >= this.iZo)
          break label403;
        f2 = this.iZo - localRectF.bottom;
        break label122;
        label254: if (localRectF.top > 0.0F)
        {
          f2 = -localRectF.top;
          break label122;
        }
        if (localRectF.bottom >= this.iZo)
          break label403;
        f2 = this.iZo - localRectF.bottom;
        break label122;
        if (localRectF.left > 0.0F)
        {
          f1 = -localRectF.left;
        }
        else if (localRectF.right < this.iZn)
        {
          f1 = this.iZn - localRectF.right;
          continue;
          if (localRectF.left > 0.0F)
            f1 = -localRectF.left;
          else if (localRectF.right < this.iZn)
            f1 = this.iZn - localRectF.right;
        }
      }
      label403: f2 = 0.0F;
    }
  }

  private void dAo()
  {
    boolean bool1 = true;
    AppMethodBeat.i(107109);
    int i = getImageWidth();
    int j = getImageHeight();
    this.yzm = (this.iZn / i);
    this.yzn = (this.iZo / j);
    boolean bool2;
    if (i > j * 2.2F)
    {
      bool2 = true;
      this.yzk = bool2;
      if (j <= i * 2.2F)
        break label221;
      bool2 = true;
      label75: this.yzl = bool2;
      if ((!this.yzk) || (i <= this.iZn))
        break label227;
      bool2 = true;
      label99: this.yzk = bool2;
      if ((!this.yzl) || (j <= this.iZo))
        break label233;
      bool2 = bool1;
      label123: this.yzl = bool2;
      float f1 = j / i;
      float f2 = 1.8F;
      float f3 = f2;
      if (this.iZn != 0)
      {
        f3 = f2;
        if (this.iZo != 0)
          f3 = this.iZo / this.iZn;
      }
      if ((f1 <= f3) || (f1 > 2.2D))
        break label239;
    }
    label221: label227: label233: label239: for (this.yzf = this.yzn; ; this.yzf = this.yzm)
    {
      setScaleRate(this.yzf);
      AppMethodBeat.o(107109);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label75;
      bool2 = false;
      break label99;
      bool2 = false;
      break label123;
    }
  }

  private void l(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(107119);
    float f = (paramFloat1 - getScale()) / 128.0F;
    paramFloat1 = getScale();
    long l = System.currentTimeMillis();
    this.mHandler.post(new WxImageView.1(this, l, paramFloat1, f, paramFloat2, paramFloat3));
    AppMethodBeat.o(107119);
  }

  public final void ah(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(107107);
    dAo();
    l(this.yzf, paramFloat1, paramFloat2);
    AppMethodBeat.o(107107);
  }

  public final void ai(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(107118);
    this.yzc = getDoubleTabScale();
    l(this.yzc, paramFloat1, paramFloat2);
    AppMethodBeat.o(107118);
  }

  public final void aj(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(107120);
    ab.d("MicroMsg.WxImageView", "alvinluo WxImageView postTranslate dx: %f, dy: %f", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
    this.aKo.postTranslate(paramFloat1, paramFloat2);
    AppMethodBeat.o(107120);
  }

  public final void dzA()
  {
    AppMethodBeat.i(107106);
    ab.d("MicroMsg.WxImageView", "alvinluo adaptViewSize");
    this.aKo.reset();
    dAo();
    PA();
    k(this.yzf, 0.0F, 0.0F);
    AppMethodBeat.o(107106);
  }

  public final void dzB()
  {
    AppMethodBeat.i(107115);
    if ((this.yzj) && (0.0F == this.yzc))
      this.yzc = getDoubleTabScale();
    AppMethodBeat.o(107115);
  }

  public final boolean dzy()
  {
    return this.yzk;
  }

  public final boolean dzz()
  {
    return this.yzl;
  }

  public int getContentLeft()
  {
    int i = 0;
    AppMethodBeat.i(107105);
    if (!this.isInited)
      AppMethodBeat.o(107105);
    while (true)
    {
      return i;
      float f1 = this.yzf;
      float f2 = this.imageWidth;
      int j = (int)((this.iZn - f1 * f2) / 2.0F);
      i = j;
      if (j < 0)
        i = 0;
      ab.i("MicroMsg.WxImageView", "alvinluo scaleRate: %f, imageWidth: %d, viewWidth: %d, left: %d", new Object[] { Float.valueOf(this.yzf), Integer.valueOf(this.imageWidth), Integer.valueOf(this.iZn), Integer.valueOf(i) });
      AppMethodBeat.o(107105);
    }
  }

  public int getContentTop()
  {
    int i = 0;
    AppMethodBeat.i(107104);
    if (!this.isInited)
      AppMethodBeat.o(107104);
    while (true)
    {
      return i;
      float f1 = this.yzf;
      float f2 = getImageHeight();
      int j = (int)((this.iZo - f1 * f2) / 2.0F);
      i = j;
      if (j < 0)
        i = 0;
      ab.i("MicroMsg.WxImageView", "alvinluo scaleRate: %f, imageHeight: %d, viewHeight: %d, top: %d", new Object[] { Float.valueOf(this.yzf), Integer.valueOf(getImageHeight()), Integer.valueOf(this.iZo), Integer.valueOf(i) });
      AppMethodBeat.o(107104);
    }
  }

  public float getDoubleTabScale()
  {
    AppMethodBeat.i(107117);
    float f1 = getScaleRate();
    if (getScaleWidth() * 0.7F > f1)
      f1 = getScaleWidth();
    while (true)
    {
      float f2 = f1;
      if (f1 < 1.0D)
        f2 = 1.0F;
      f1 = f2;
      if (f2 > getMaxZoom())
        f1 = getMaxZoom();
      AppMethodBeat.o(107117);
      return f1;
      if (getScaleHeight() * 0.7F > f1)
        f1 = getScaleHeight();
      else
        f1 = getScaleRate() * this.yzg;
    }
  }

  public int getImageHeight()
  {
    if ((this.orientation == 90) || (this.orientation == 270));
    for (int i = this.imageWidth; ; i = this.imageHeight)
      return i;
  }

  public Matrix getImageMatrix()
  {
    AppMethodBeat.i(107122);
    this.yyZ.set(this.yyY);
    this.yyZ.postConcat(this.aKo);
    Matrix localMatrix = this.yyZ;
    AppMethodBeat.o(107122);
    return localMatrix;
  }

  protected Matrix getImageViewMatrix()
  {
    AppMethodBeat.i(107114);
    this.yyZ.set(this.yyY);
    this.yyZ.postConcat(this.aKo);
    Matrix localMatrix = this.yyZ;
    AppMethodBeat.o(107114);
    return localMatrix;
  }

  public int getImageWidth()
  {
    if ((this.orientation == 90) || (this.orientation == 270));
    for (int i = this.imageHeight; ; i = this.imageWidth)
      return i;
  }

  public float getMaxZoom()
  {
    return this.yzd;
  }

  public float getMinZoom()
  {
    return this.yze;
  }

  public float getScale()
  {
    AppMethodBeat.i(107113);
    float f = super.getScale();
    AppMethodBeat.o(107113);
    return f;
  }

  public float getScaleHeight()
  {
    return this.yzn;
  }

  public float getScaleRate()
  {
    return this.yzf;
  }

  public float getScaleWidth()
  {
    return this.yzm;
  }

  public final void k(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool1 = true;
    AppMethodBeat.i(107116);
    float f1 = getScale();
    float f2;
    label78: boolean bool2;
    if (this.yzj)
    {
      if (0.0F == this.yzc)
      {
        f2 = this.yzi * this.aKB;
        this.yzd = f2;
      }
    }
    else
    {
      if (paramFloat1 <= this.yzd * 2.0F)
        break label228;
      f2 = this.yzd * 2.0F + (paramFloat1 - this.yzd) * 0.1F;
      paramFloat1 = f2 / f1;
      ab.d("MicroMsg.WxImageView", "alvinluo zoomTo mzdt=%f,mz=%f,scale=%f,oldScale=%f,deltaScale=%f", new Object[] { Float.valueOf(this.yzc), Float.valueOf(this.yzd), Float.valueOf(f2), Float.valueOf(f1), Float.valueOf(paramFloat1) });
      if (!this.yzp)
        this.aKo.postScale(paramFloat1, paramFloat1, paramFloat2, paramFloat3);
      if ((this.rsw) && (this.yzk))
        break label249;
      bool2 = true;
      label175: if (this.yzl)
        break label255;
      label182: ai(bool2, bool1);
      if (this.rsT == null)
        break label276;
      if (paramFloat1 <= 1.0F)
        break label261;
      this.rsT.ctr();
      AppMethodBeat.o(107116);
    }
    while (true)
    {
      return;
      f2 = this.yzc;
      break;
      label228: f2 = paramFloat1;
      if (paramFloat1 >= this.yze)
        break label78;
      f2 = this.yze;
      break label78;
      label249: bool2 = false;
      break label175;
      label255: bool1 = false;
      break label182;
      label261: if (paramFloat1 < 1.0F)
        this.rsT.ctq();
      label276: AppMethodBeat.o(107116);
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2))
      this.isInited = false;
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(107110);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      f.c(paramKeyEvent);
      bool = true;
      AppMethodBeat.o(107110);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(107110);
    }
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(107111);
    boolean bool;
    if ((paramInt == 4) && (f.d(paramKeyEvent)) && (!f.e(paramKeyEvent)) && (getScale() > 1.0F))
    {
      k(1.0F, this.iZn / 2.0F, this.iZo / 2.0F);
      bool = true;
      AppMethodBeat.o(107111);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(107111);
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107103);
    super.onMeasure(paramInt1, paramInt2);
    if ((this.iZn != View.MeasureSpec.getSize(paramInt1)) || (this.iZo != View.MeasureSpec.getSize(paramInt2)));
    for (this.iXv = true; ; this.iXv = false)
    {
      this.iZn = View.MeasureSpec.getSize(paramInt1);
      this.iZo = View.MeasureSpec.getSize(paramInt2);
      ab.d("MicroMsg.WxImageView", "alvinluo onMeasure viewWidth: %d, viewHeight: %d", new Object[] { Integer.valueOf(this.iZn), Integer.valueOf(this.iZo) });
      if (!this.isInited)
      {
        this.isInited = true;
        this.yzp = false;
        ab.d("MicroMsg.WxImageView", "init screenWidth:" + this.iZn + " screenHeight :" + this.iZo);
        float f = getContext().getResources().getDisplayMetrics().widthPixels / 720.0F;
        if (f > 1.0F)
          this.aKB = f;
        dzA();
      }
      if (this.iXv)
        dzA();
      AppMethodBeat.o(107103);
      return;
    }
  }

  public void setDoubleTabScaleLimit(float paramFloat)
  {
    AppMethodBeat.i(107102);
    if (Float.compare(paramFloat, 0.0F) < 0)
    {
      ab.w("MicroMsg.WxImageView", "double tab scale limit is less than 0.0, change nothing, return");
      AppMethodBeat.o(107102);
    }
    while (true)
    {
      return;
      this.yzg = paramFloat;
      AppMethodBeat.o(107102);
    }
  }

  public void setEnableHorLongBmpMode(boolean paramBoolean)
  {
    this.rsw = paramBoolean;
  }

  public void setImageHeight(int paramInt)
  {
    this.imageHeight = paramInt;
  }

  public void setImageWidth(int paramInt)
  {
    this.imageWidth = paramInt;
  }

  public void setMaxZoomDoubleTab(boolean paramBoolean)
  {
    this.yzj = paramBoolean;
  }

  public void setMaxZoomLimit(float paramFloat)
  {
    AppMethodBeat.i(107100);
    if (Float.compare(paramFloat, 1.0F) < 0)
    {
      ab.w("MicroMsg.WxImageView", "max scale limit is less than 1.0, change nothing, return");
      AppMethodBeat.o(107100);
    }
    while (true)
    {
      return;
      this.yzi = paramFloat;
      AppMethodBeat.o(107100);
    }
  }

  public void setMinZoomLimit(float paramFloat)
  {
    AppMethodBeat.i(107101);
    if (Float.compare(paramFloat, 1.0F) > 0)
    {
      ab.w("MicroMsg.WxImageView", "min scale limit is greater than 1.0, change nothing, return");
      AppMethodBeat.o(107101);
    }
    while (true)
    {
      return;
      if (Float.compare(paramFloat, 0.0F) < 0)
      {
        ab.w("MicroMsg.WxImageView", "min scale limit is less than 0.0, change nothing, return");
        AppMethodBeat.o(107101);
      }
      else
      {
        this.yzh = paramFloat;
        AppMethodBeat.o(107101);
      }
    }
  }

  public void setOrientation(int paramInt)
  {
    AppMethodBeat.i(107108);
    this.orientation = paramInt;
    dAo();
    AppMethodBeat.o(107108);
  }

  public final void translate(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(107121);
    float f1 = getTranslationX();
    float f2 = getTranslationY();
    setTranslationX(f1 + paramFloat1);
    setTranslationY(f2 + paramFloat2);
    ab.i("MicroMsg.WxImageView", "alvinluo translate x: %f, y: %f, x + dx: %f, y + dy: %f", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f1 + paramFloat1), Float.valueOf(f2 + paramFloat2) });
    AppMethodBeat.o(107121);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.WxImageView
 * JD-Core Version:    0.6.2
 */