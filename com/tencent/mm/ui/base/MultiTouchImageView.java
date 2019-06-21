package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.e.b.a;
import com.tencent.mm.ui.e.b.c;

public class MultiTouchImageView extends ImageView
  implements g
{
  private final float[] Bn;
  private float aKB;
  protected Matrix aKo;
  private boolean iXv;
  private int iZn;
  private int iZo;
  private int imageHeight;
  private int imageWidth;
  private boolean isInited;
  protected ak mHandler;
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
  public boolean yzk;
  public boolean yzl;
  private float yzm;
  private float yzn;
  float yzo;
  public boolean yzp;
  public Drawable yzq;

  public MultiTouchImageView(Context paramContext, int paramInt1, int paramInt2)
  {
    this(paramContext, paramInt1, paramInt2, null);
  }

  public MultiTouchImageView(Context paramContext, int paramInt1, int paramInt2, MultiTouchImageView.a parama)
  {
    super(paramContext);
    AppMethodBeat.i(106977);
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
    this.mHandler = new ak();
    this.aKB = 1.0F;
    this.yzo = 0.0F;
    this.yzp = false;
    this.imageHeight = paramInt2;
    this.imageWidth = paramInt1;
    this.rsT = parama;
    init();
    AppMethodBeat.o(106977);
  }

  public MultiTouchImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, (byte)0);
  }

  private MultiTouchImageView(Context paramContext, AttributeSet paramAttributeSet, byte paramByte)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106978);
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
    this.mHandler = new ak();
    this.aKB = 1.0F;
    this.yzo = 0.0F;
    this.yzp = false;
    this.imageHeight = 0;
    this.imageWidth = 0;
    init();
    AppMethodBeat.o(106978);
  }

  private void ai(boolean paramBoolean1, boolean paramBoolean2)
  {
    float f1 = 0.0F;
    AppMethodBeat.i(106986);
    if ((this.rdJ == null) && (!this.yzp))
      AppMethodBeat.o(106986);
    while (true)
    {
      return;
      if ((this.yzq != null) || (!this.yzp))
        break;
      AppMethodBeat.o(106986);
    }
    Matrix localMatrix = getImageViewMatrix();
    RectF localRectF;
    label89: float f2;
    float f3;
    if (this.yzp)
    {
      localRectF = new RectF(0.0F, 0.0F, this.yzq.getIntrinsicWidth(), this.yzq.getIntrinsicHeight());
      localMatrix.mapRect(localRectF);
      f2 = localRectF.height();
      f3 = localRectF.width();
      if (!paramBoolean2)
        break label304;
      if (f2 >= this.iZo)
        break label253;
      f2 = (this.iZo - f2) / 2.0F - localRectF.top;
    }
    while (true)
    {
      label144: if (paramBoolean1)
        if (f3 < this.iZn)
          f1 = (this.iZn - f3) / 2.0F - localRectF.left;
      while (true)
      {
        aj(f1, f2);
        localMatrix = getImageViewMatrix();
        setImageMatrix(localMatrix);
        localMatrix.mapRect(localRectF);
        localRectF.height();
        localRectF.width();
        AppMethodBeat.o(106986);
        break;
        localRectF = new RectF(0.0F, 0.0F, this.rdJ.getWidth(), this.rdJ.getHeight());
        break label89;
        label253: if (localRectF.top > 0.0F)
        {
          f2 = -localRectF.top;
          break label144;
        }
        if (localRectF.bottom >= this.iZo)
          break label531;
        f2 = this.iZo - localRectF.bottom;
        break label144;
        label304: f2 = localRectF.top;
        float f4 = this.iZo - localRectF.bottom;
        float f5 = (f2 + f4) / 2.0F;
        f2 = f5;
        if (f5 < 0.0F)
          f2 = 0.0F;
        if (localRectF.top > 0.0F)
        {
          f2 -= localRectF.top;
          break label144;
        }
        if (localRectF.bottom >= this.iZo)
          break label531;
        f2 = f4 - f2;
        break label144;
        if (localRectF.left > 0.0F)
        {
          f1 = -localRectF.left;
        }
        else if (localRectF.right < this.iZn)
        {
          f1 = this.iZn - localRectF.right;
          continue;
          f5 = localRectF.left;
          f4 = this.iZn - localRectF.right;
          f3 = (f5 + f4) / 2.0F;
          f5 = f3;
          if (f3 < 0.0F)
            f5 = 0.0F;
          if (localRectF.left > 0.0F)
            f1 = f5 - localRectF.left;
          else if (localRectF.right < this.iZn)
            f1 = f4 - f5;
        }
      }
      label531: f2 = 0.0F;
    }
  }

  private void dAo()
  {
    boolean bool1 = true;
    this.yzm = (this.iZn / this.imageWidth);
    this.yzn = (this.iZo / this.imageHeight);
    boolean bool2;
    if (this.imageWidth > this.imageHeight * 2.2F)
    {
      bool2 = true;
      this.yzk = bool2;
      if (this.imageHeight <= this.imageWidth * 2.2F)
        break label211;
      bool2 = true;
      label75: this.yzl = bool2;
      if ((!this.yzk) || (this.imageWidth <= this.iZn))
        break label216;
      bool2 = true;
      label100: this.yzk = bool2;
      if ((!this.yzl) || (this.imageHeight <= this.iZo))
        break label221;
      bool2 = bool1;
      label125: this.yzl = bool2;
      float f1 = this.imageHeight / this.imageWidth;
      float f2 = 1.8F;
      float f3 = f2;
      if (this.iZn != 0)
      {
        f3 = f2;
        if (this.iZo != 0)
          f3 = this.iZo / this.iZn;
      }
      if ((f1 <= f3) || (f1 > 2.2D))
        break label226;
    }
    label211: label216: label221: label226: for (this.yzf = this.yzn; ; this.yzf = this.yzm)
    {
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label75;
      bool2 = false;
      break label100;
      bool2 = false;
      break label125;
    }
  }

  private void init()
  {
    AppMethodBeat.i(106987);
    ab.d("dktest", "init screenWidth:" + this.iZn + " screenHeight :" + this.iZo);
    setScaleType(ImageView.ScaleType.MATRIX);
    float f = getContext().getResources().getDisplayMetrics().widthPixels / 720.0F;
    if (f > 1.0F)
      this.aKB = f;
    dzA();
    AppMethodBeat.o(106987);
  }

  private void l(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(106995);
    float f = (paramFloat1 - getScale()) / 128.0F;
    paramFloat1 = getScale();
    long l = System.currentTimeMillis();
    this.mHandler.post(new MultiTouchImageView.1(this, l, paramFloat1, f, paramFloat2, paramFloat3));
    AppMethodBeat.o(106995);
  }

  public final void ah(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(106983);
    dAo();
    l(this.yzf, paramFloat1, paramFloat2);
    AppMethodBeat.o(106983);
  }

  public final void ai(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(106994);
    this.yzc = getDoubleTabScale();
    l(this.yzc, paramFloat1, paramFloat2);
    AppMethodBeat.o(106994);
  }

  public final void aj(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(106997);
    this.aKo.postTranslate(paramFloat1, paramFloat2);
    setImageMatrix(getImageViewMatrix());
    AppMethodBeat.o(106997);
  }

  public final void bW(int paramInt1, int paramInt2)
  {
    this.imageWidth = paramInt1;
    this.imageHeight = paramInt2;
  }

  public final void dAp()
  {
    boolean bool1 = true;
    AppMethodBeat.i(106990);
    boolean bool2;
    if ((!this.rsw) || (!this.yzk))
    {
      bool2 = true;
      if (this.yzl)
        break label49;
    }
    while (true)
    {
      ai(bool2, bool1);
      AppMethodBeat.o(106990);
      return;
      bool2 = false;
      break;
      label49: bool1 = false;
    }
  }

  public final void dzA()
  {
    AppMethodBeat.i(106982);
    this.aKo.reset();
    dAo();
    k(this.yzf, 0.0F, 0.0F);
    AppMethodBeat.o(106982);
  }

  public final void dzB()
  {
    AppMethodBeat.i(106991);
    if ((this.yzj) && (0.0F == this.yzc))
      this.yzc = getDoubleTabScale();
    AppMethodBeat.o(106991);
  }

  public final boolean dzy()
  {
    return this.yzk;
  }

  public final boolean dzz()
  {
    return this.yzl;
  }

  public float getDoubleTabScale()
  {
    AppMethodBeat.i(106993);
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
      AppMethodBeat.o(106993);
      return f1;
      if (getScaleHeight() * 0.7F > f1)
        f1 = getScaleHeight();
      else
        f1 = getScaleRate() * this.yzg;
    }
  }

  public int getImageHeight()
  {
    return this.imageHeight;
  }

  protected Matrix getImageViewMatrix()
  {
    AppMethodBeat.i(106989);
    this.yyZ.set(this.yyY);
    this.yyZ.postConcat(this.aKo);
    Matrix localMatrix = this.yyZ;
    AppMethodBeat.o(106989);
    return localMatrix;
  }

  public int getImageWidth()
  {
    return this.imageWidth;
  }

  public float getMaxZoom()
  {
    return this.yzd;
  }

  public float getMinZoom()
  {
    return this.yze;
  }

  public float getRealWidth()
  {
    AppMethodBeat.i(106996);
    float f1 = getScale();
    float f2 = getImageWidth();
    AppMethodBeat.o(106996);
    return f1 * f2;
  }

  public float getScale()
  {
    AppMethodBeat.i(106988);
    this.aKo.getValues(this.Bn);
    dAo();
    this.yzd = (this.yzi * this.aKB);
    this.yze = (this.yzf * this.yzh);
    if (this.yzd < 1.0F)
      this.yzd = 1.0F;
    if (this.yze > 1.0F)
      this.yze = 1.0F;
    float f = this.Bn[0];
    AppMethodBeat.o(106988);
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

  public final void hk(int paramInt1, int paramInt2)
  {
    this.iZo = paramInt2;
    this.iZn = paramInt1;
  }

  public final void k(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool1 = true;
    AppMethodBeat.i(106992);
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
        break label181;
      f2 = this.yzd * 2.0F + (paramFloat1 - this.yzd) * 0.1F;
      paramFloat1 = f2 / f1;
      if (!this.yzp)
      {
        setImageMatrix(getImageViewMatrix());
        this.aKo.postScale(paramFloat1, paramFloat1, paramFloat2, paramFloat3);
      }
      if ((this.rsw) && (this.yzk))
        break label202;
      bool2 = true;
      label128: if (this.yzl)
        break label208;
      label135: ai(bool2, bool1);
      if (this.rsT == null)
        break label229;
      if (paramFloat1 <= 1.0F)
        break label214;
      this.rsT.ctr();
      AppMethodBeat.o(106992);
    }
    while (true)
    {
      return;
      f2 = this.yzc;
      break;
      label181: f2 = paramFloat1;
      if (paramFloat1 >= this.yze)
        break label78;
      f2 = this.yze;
      break label78;
      label202: bool2 = false;
      break label128;
      label208: bool1 = false;
      break label135;
      label214: if (paramFloat1 < 1.0F)
        this.rsT.ctq();
      label229: AppMethodBeat.o(106992);
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if ((paramConfiguration.orientation == 1) || (paramConfiguration.orientation == 2))
      this.isInited = false;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(106981);
    if ((!this.yzp) && (this.rdJ != null) && (this.rdJ.isRecycled()))
    {
      ab.e("MicroMsg.MultiTouchImageView", "this bitmap is recycled! draw nothing!");
      AppMethodBeat.o(106981);
    }
    while (true)
    {
      return;
      super.onDraw(paramCanvas);
      AppMethodBeat.o(106981);
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(106984);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      f.c(paramKeyEvent);
      bool = true;
      AppMethodBeat.o(106984);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(106984);
    }
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(106985);
    boolean bool;
    if ((paramInt == 4) && (f.d(paramKeyEvent)) && (!f.e(paramKeyEvent)) && (getScale() > 1.0F))
    {
      k(1.0F, this.iZn / 2.0F, this.iZo / 2.0F);
      bool = true;
      AppMethodBeat.o(106985);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(106985);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106979);
    super.onMeasure(paramInt1, paramInt2);
    if ((this.iZn != View.MeasureSpec.getSize(paramInt1)) || (this.iZo != View.MeasureSpec.getSize(paramInt2)));
    for (this.iXv = true; ; this.iXv = false)
    {
      this.iZn = View.MeasureSpec.getSize(paramInt1);
      this.iZo = View.MeasureSpec.getSize(paramInt2);
      if (!this.isInited)
      {
        this.isInited = true;
        init();
      }
      if (this.iXv)
        dzA();
      AppMethodBeat.o(106979);
      return;
    }
  }

  public void setDoubleTabScaleLimit(float paramFloat)
  {
    AppMethodBeat.i(106976);
    if (Float.compare(paramFloat, 0.0F) < 0)
    {
      ab.w("MicroMsg.MultiTouchImageView", "double tab scale limit is less than 0.0, change nothing, return");
      AppMethodBeat.o(106976);
    }
    while (true)
    {
      return;
      this.yzg = paramFloat;
      AppMethodBeat.o(106976);
    }
  }

  public void setEnableHorLongBmpMode(boolean paramBoolean)
  {
    this.rsw = paramBoolean;
  }

  public void setGifDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(106999);
    this.yzp = true;
    this.yzq = paramDrawable;
    setImageDrawable(this.yzq);
    AppMethodBeat.o(106999);
  }

  public void setGifPath(String paramString)
  {
    AppMethodBeat.i(106998);
    this.yzp = true;
    try
    {
      this.yzq = c.io(paramString, paramString);
      setImageDrawable(this.yzq);
      if (this.yzq != null)
        bW(this.yzq.getIntrinsicWidth(), this.yzq.getIntrinsicHeight());
      AppMethodBeat.o(106998);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        this.yzp = false;
        AppMethodBeat.o(106998);
      }
    }
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(106980);
    this.yzp = false;
    this.rdJ = paramBitmap;
    this.isInited = false;
    super.setImageBitmap(paramBitmap);
    AppMethodBeat.o(106980);
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
    AppMethodBeat.i(106974);
    if (Float.compare(paramFloat, 1.0F) < 0)
    {
      ab.w("MicroMsg.MultiTouchImageView", "max scale limit is less than 1.0, change nothing, return");
      AppMethodBeat.o(106974);
    }
    while (true)
    {
      return;
      this.yzi = paramFloat;
      AppMethodBeat.o(106974);
    }
  }

  public void setMinZoomLimit(float paramFloat)
  {
    AppMethodBeat.i(106975);
    if (Float.compare(paramFloat, 1.0F) > 0)
    {
      ab.w("MicroMsg.MultiTouchImageView", "min scale limit is greater than 1.0, change nothing, return");
      AppMethodBeat.o(106975);
    }
    while (true)
    {
      return;
      if (Float.compare(paramFloat, 0.0F) < 0)
      {
        ab.w("MicroMsg.MultiTouchImageView", "min scale limit is less than 0.0, change nothing, return");
        AppMethodBeat.o(106975);
      }
      else
      {
        this.yzh = paramFloat;
        AppMethodBeat.o(106975);
      }
    }
  }

  public final void start()
  {
    AppMethodBeat.i(107000);
    if ((this.yzp) && (this.yzq != null))
      ((a)this.yzq).start();
    AppMethodBeat.o(107000);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MultiTouchImageView
 * JD-Core Version:    0.6.2
 */