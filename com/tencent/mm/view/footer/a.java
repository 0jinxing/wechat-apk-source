package com.tencent.mm.view.footer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.e;
import com.tencent.mm.api.r;
import com.tencent.mm.sdk.platformtools.d;

public abstract class a extends View
{
  public static final int[] AcD = { -1, -16777216, -707825, -17592, -16535286, -15172610, -7054596, -449092 };
  protected Paint Aat;
  protected Rect AcA;
  protected boolean AcB;
  protected Paint AcC;
  protected int AcE = -1;
  protected int AcF = -1;
  private boolean AcG = true;
  private final float Acn = getResources().getDimension(2131428403);
  private Bitmap Aco;
  private Bitmap Acp;
  private Bitmap Acq;
  private Bitmap Acr;
  private Bitmap Acs;
  private Bitmap Act;
  protected Bitmap Acu;
  protected Bitmap Acv;
  protected int Acw = -1;
  protected int Acx = -1;
  private Rect[] Acy;
  private Rect[] Acz;
  private com.tencent.mm.br.b cjc;
  private Paint eHe;
  protected int jpc = -1;

  public a(Context paramContext, com.tencent.mm.br.b paramb)
  {
    super(paramContext);
    setId(2131820578);
    this.cjc = paramb;
    dMO();
  }

  private Bitmap b(e parame, boolean paramBoolean)
  {
    Bitmap localBitmap1 = null;
    switch (a.3.vwX[parame.ordinal()])
    {
    default:
    case 2:
    case 3:
    case 1:
    }
    while (true)
    {
      Bitmap localBitmap2 = localBitmap1;
      if (localBitmap1 == null)
        localBitmap2 = a(parame, paramBoolean);
      return localBitmap2;
      if (paramBoolean)
      {
        localBitmap1 = this.Acr;
      }
      else
      {
        localBitmap1 = this.Acq;
        continue;
        if (paramBoolean)
        {
          localBitmap1 = this.Act;
        }
        else
        {
          localBitmap1 = this.Acs;
          continue;
          if (paramBoolean)
            localBitmap1 = this.Acp;
          else
            localBitmap1 = this.Aco;
        }
      }
    }
  }

  private boolean dMP()
  {
    if (getDetailHeight() > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void dMR()
  {
    if (this.Acz == null)
      this.Acz = new Rect[AcD.length];
    if (this.AcA == null)
      this.AcA = new Rect();
    float f1 = getResources().getDimension(2131428305);
    float f2 = (getMeasuredWidth() - getPaddingLeftAndRight() - this.Acu.getWidth() - 2.0F * f1 * AcD.length) / AcD.length;
    int i = (int)(f1 * 2.0F);
    int j = (int)(getPaddingLeftAndRight() / 2 + f1 + 5.0F);
    int k = (int)((getDetailHeight() - f1 * 2.0F) / 2.0F + f1);
    for (int m = 0; m < AcD.length; m++)
    {
      this.Acz[m] = new Rect(j - i, k - i, j + i, k + i);
      j = (int)(j + (2.0F * f1 + f2));
    }
    m = getMeasuredWidth() - getPaddingLeftAndRight() / 2 - this.Acu.getWidth() / 2;
    this.AcA.set(m - this.Acu.getWidth(), 0, m + this.Acu.getWidth(), getDetailHeight());
  }

  public static int getColor(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < AcD.length));
    for (paramInt = AcD[paramInt]; ; paramInt = -65536)
      return paramInt;
  }

  protected final boolean CL()
  {
    com.tencent.mm.e.b localb = getPresenter().b(getCurFeatureType());
    if (localb == null);
    for (boolean bool = false; ; bool = localb.CL())
      return bool;
  }

  protected final e QF(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < getFeatureCount()));
    for (e locale = getPresenter().getFeatures()[paramInt]; ; locale = e.ccG)
      return locale;
  }

  protected boolean QG(int paramInt)
  {
    boolean bool1 = false;
    e locale = QF(paramInt);
    boolean bool2 = bool1;
    switch (a.3.vwX[locale.ordinal()])
    {
    default:
    case 2:
    case 3:
    case 1:
    }
    for (bool2 = bool1; ; bool2 = true)
      return bool2;
  }

  protected abstract Bitmap a(e parame, boolean paramBoolean);

  protected void dMO()
  {
    this.Aat = new Paint(1);
    this.Aat.setColor(-16711936);
    this.AcC = new Paint(1);
    this.AcC.setColor(getResources().getColor(2131689964));
    this.AcC.setStrokeWidth(0.6F);
    this.eHe = new Paint(1);
    this.eHe.setStyle(Paint.Style.FILL);
    this.eHe.setStrokeCap(Paint.Cap.ROUND);
    this.Acv = d.v(getResources().getDrawable(2131232083));
    this.Acu = d.v(getResources().getDrawable(2131232082));
    this.Aco = d.v(getResources().getDrawable(2131231217));
    this.Acp = d.v(getResources().getDrawable(2131231216));
    this.Acq = d.v(getResources().getDrawable(2131232020));
    this.Acr = d.v(getResources().getDrawable(2131232019));
    this.Acs = BitmapFactory.decodeResource(getResources(), 2130838592);
    this.Act = BitmapFactory.decodeResource(getResources(), 2130838588);
  }

  protected void dMQ()
  {
    if (this.Acy == null)
      this.Acy = new Rect[getFeatureCount()];
    int i = (int)(this.Acn + getIconWidth() / 2.0F);
    int j = (int)getIconWidth();
    for (int k = 0; k < getFeatureCount(); k++)
    {
      this.Acy[k] = new Rect(i - j, getDetailHeight(), i + j, getDetailHeight() + getMeasuredHeight());
      i = (int)(i + (getWidthSpacing() + getIconWidth()));
    }
    if (QF(this.jpc) == e.ccH)
      dMR();
  }

  public final void dMS()
  {
    this.Acw = this.Acx;
    requestLayout();
    invalidate();
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0;
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    case 2:
    default:
      return true;
      if (dMP())
      {
        if ((this.AcA == null) || (!this.AcA.contains(j, k)))
          break label124;
        this.AcB = true;
        postInvalidate();
      }
    case 0:
      while (true)
      {
        label50: i++;
        if (i >= getFeatureCount())
          break;
        if (!this.Acy[i].contains(j, k))
          break label50;
        this.AcE = i;
        postInvalidate();
        break;
        label124: hJ(j, k);
      }
    case 1:
    case 3:
    }
    i = 0;
    label136: if (i < getFeatureCount())
    {
      if ((!this.Acy[i].contains(j, k)) || (this.AcE != i))
        break label353;
      if (QG(i))
      {
        if (this.AcE != this.jpc)
          this.jpc = this.AcE;
      }
      else
      {
        label194: this.Acx = this.Acw;
        if (!QG(i))
          break label326;
        this.Acw = this.jpc;
        getPresenter().getSelectedFeatureListener().a(QF(this.jpc));
      }
    }
    else
    {
      label240: if (dMP())
      {
        if ((this.AcA == null) || (!this.AcA.contains(j, k)) || (!this.AcB))
          break label359;
        getPresenter().getSelectedFeatureListener().a(QF(this.jpc), -1);
      }
    }
    while (true)
    {
      this.AcB = false;
      this.AcE = -1;
      requestLayout();
      postInvalidate();
      break;
      this.jpc = -1;
      break label194;
      label326: this.Acw = i;
      getPresenter().getSelectedFeatureListener().a(QF(i));
      break label240;
      label353: i++;
      break label136;
      label359: hK(j, k);
    }
  }

  public e getCurFeatureType()
  {
    return QF(this.Acw);
  }

  protected int getDetailHeight()
  {
    if (QF(this.jpc) == e.ccH);
    for (int i = (int)getResources().getDimension(2131428405); ; i = 0)
      return i;
  }

  protected int getFeatureCount()
  {
    return getPresenter().getFeatures().length;
  }

  protected float getHeightSpacing()
  {
    return (getMeasuredHeight() - getDetailHeight() - getIconWidth()) / 2.0F;
  }

  protected float getIconWidth()
  {
    Bitmap localBitmap = b(e.ccH, false);
    if (localBitmap == null);
    for (float f = 0.0F; ; f = localBitmap.getWidth())
      return f;
  }

  public int getPaddingLeftAndRight()
  {
    return (int)(2.0F * this.Acn);
  }

  protected com.tencent.mm.br.b getPresenter()
  {
    return this.cjc;
  }

  protected float getWidthSpacing()
  {
    return (getMeasuredWidth() - getFeatureCount() * getIconWidth() - getPaddingLeftAndRight()) / (getFeatureCount() - 1);
  }

  protected void hJ(int paramInt1, int paramInt2)
  {
    switch (a.3.vwX[QF(this.jpc).ordinal()])
    {
    default:
    case 1:
    }
    label82: 
    while (true)
    {
      return;
      if (this.Acz != null);
      for (int i = 0; ; i++)
      {
        if (i >= this.Acz.length)
          break label82;
        if (this.Acz[i].contains(paramInt1, paramInt2))
        {
          this.AcF = i;
          this.AcG = false;
          break;
          break;
        }
      }
    }
  }

  protected void hK(int paramInt1, int paramInt2)
  {
    switch (a.3.vwX[QF(this.jpc).ordinal()])
    {
    default:
    case 1:
    }
    label98: 
    while (true)
    {
      return;
      for (int i = 0; ; i++)
      {
        if ((this.Acz == null) || (i >= this.Acz.length))
          break label98;
        if ((this.Acz[i].contains(paramInt1, paramInt2)) && (i == this.AcF))
        {
          getPresenter().getSelectedFeatureListener().a(e.ccH, i);
          break;
        }
      }
    }
  }

  protected void n(Canvas paramCanvas)
  {
    if (dMP())
    {
      paramCanvas.drawLine(0.0F, getDetailHeight(), getMeasuredWidth(), getDetailHeight(), this.AcC);
      o(paramCanvas);
    }
    float f1 = this.Acn;
    float f2 = getHeightSpacing();
    float f3 = getDetailHeight();
    int i = 0;
    if (i < getFeatureCount())
    {
      Object localObject = getPresenter().getFeatures()[i];
      if ((this.AcE == i) || (i == this.jpc));
      for (boolean bool = true; ; bool = false)
      {
        localObject = b((e)localObject, bool);
        if (localObject != null)
          paramCanvas.drawBitmap((Bitmap)localObject, f1, f2 + f3, null);
        f1 += getWidthSpacing() + getIconWidth();
        i++;
        break;
      }
    }
  }

  protected void o(Canvas paramCanvas)
  {
    Paint localPaint;
    if (QF(this.jpc) == e.ccH)
    {
      float f1 = getResources().getDimension(2131428305);
      float f2 = (getMeasuredWidth() - getPaddingLeftAndRight() - this.Acu.getWidth() - 2.0F * f1 * AcD.length) / AcD.length;
      float f3 = getPaddingLeftAndRight() / 2;
      float f4 = com.tencent.mm.ch.a.bu(1.5F) + (f3 + f1);
      float f5 = (getDetailHeight() - f1 * 2.0F) / 2.0F + f1;
      int i = 0;
      if (i < AcD.length)
      {
        float f6 = 0.0F;
        if (this.AcF == i)
        {
          f3 = com.tencent.mm.ch.a.bu(2.0F);
          this.AcG = false;
        }
        while (true)
        {
          this.eHe.setColor(-1);
          paramCanvas.drawCircle(f4, f5, com.tencent.mm.ch.a.bu(1.5F) + f1 + f3, this.eHe);
          this.eHe.setColor(AcD[i]);
          paramCanvas.drawCircle(f4, f5, f3 + f1, this.eHe);
          f4 += 2.0F * f1 + f2;
          i++;
          break;
          f3 = f6;
          if (this.AcG)
          {
            f3 = f6;
            if (i == 2)
              f3 = com.tencent.mm.ch.a.bu(2.0F);
          }
        }
      }
      localPaint = new Paint();
      if (!CL())
        break label329;
      localPaint.setAlpha(255);
      if ((!this.AcB) || (!CL()))
        break label340;
    }
    label329: label340: for (Bitmap localBitmap = this.Acv; ; localBitmap = this.Acu)
    {
      paramCanvas.drawBitmap(localBitmap, getMeasuredWidth() - getPaddingLeftAndRight() / 2 - this.Acu.getWidth(), (getDetailHeight() - this.Acu.getHeight()) / 2, localPaint);
      return;
      localPaint.setAlpha(160);
      break;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawColor(0);
    n(paramCanvas);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = getPaddingLeft();
    int k = getPaddingRight();
    paramInt2 = (int)getResources().getDimension(2131428406);
    paramInt1 = paramInt2;
    if (dMP())
      paramInt1 = paramInt2 + getDetailHeight();
    paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i - j - k, 1073741824), paramInt1);
    dMQ();
  }

  public void setCurFeatureType(e parame)
  {
    int i = 0;
    if (i < getFeatureCount())
      if (getPresenter().getFeatures()[i] == parame)
        label25: if (!QG(i))
          break label63;
    label63: for (this.jpc = i; ; this.jpc = -1)
    {
      this.Acw = i;
      requestLayout();
      invalidate();
      return;
      i++;
      break;
      i = -1;
      break label25;
    }
  }

  public void setFooterVisible(boolean paramBoolean)
  {
    Animation localAnimation;
    if (paramBoolean)
    {
      localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034125);
      localAnimation.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          AppMethodBeat.i(116423);
          a.this.setVisibility(0);
          AppMethodBeat.o(116423);
        }

        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
        }

        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
        }
      });
      startAnimation(localAnimation);
    }
    while (true)
    {
      return;
      localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034126);
      localAnimation.setAnimationListener(new a.2(this));
      startAnimation(localAnimation);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.footer.a
 * JD-Core Version:    0.6.2
 */