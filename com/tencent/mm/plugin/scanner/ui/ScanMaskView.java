package com.tencent.mm.plugin.scanner.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.g.a;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;

public class ScanMaskView extends View
{
  private Path lkh;
  private Paint mPaint;
  private Bitmap qdG;
  private Bitmap qdH;
  private Bitmap qdI;
  private Bitmap qdJ;
  int qdK;
  int qdL;
  private boolean qdM;
  private Rect qdN;
  private Rect qdO;
  private Rect qdP;
  private Rect qdQ;
  private Rect qdR;
  private Rect qdS;
  private Rect qdT;
  private Rect qdU;
  private Rect qdV;
  private Rect qdW;
  private PorterDuffXfermode qdX;
  private int qdY;
  private long qdZ;
  private boolean qea;
  private Rect qeb;
  private int qec;
  private float qed;
  private float qee;
  private float qef;
  private float qeg;
  private Paint qeh;
  private ValueAnimator qei;
  private ScanMaskView.a qej;

  public ScanMaskView(Context paramContext, Rect paramRect)
  {
    super(paramContext);
    AppMethodBeat.i(81150);
    this.qdG = null;
    this.qdH = null;
    this.qdI = null;
    this.qdJ = null;
    this.qdK = 0;
    this.qdL = 0;
    this.qdM = false;
    this.qdN = new Rect();
    this.qdO = new Rect();
    this.qdP = new Rect();
    this.qdQ = new Rect();
    this.qdR = new Rect();
    this.qdS = new Rect();
    this.qdT = new Rect();
    this.qdU = new Rect();
    this.qdV = new Rect();
    this.lkh = new Path();
    this.qdY = 2131690402;
    this.qdZ = 0L;
    this.qea = false;
    this.qec = 300;
    this.qed = 0.0F;
    this.qee = 0.0F;
    this.qef = 0.0F;
    this.qeg = 0.0F;
    this.qei = null;
    this.qdW = paramRect;
    getDrawingRect(this.qdN);
    this.mPaint = new Paint();
    this.qdG = a.decodeResource(getResources(), 2130840085);
    this.qdH = a.decodeResource(getResources(), 2130840086);
    this.qdI = a.decodeResource(getResources(), 2130840087);
    this.qdJ = a.decodeResource(getResources(), 2130840088);
    this.qdK = this.qdG.getWidth();
    this.qdL = this.qdG.getHeight();
    this.qeh = new Paint();
    this.qdX = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    AppMethodBeat.o(81150);
  }

  public ScanMaskView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(81149);
    this.qdG = null;
    this.qdH = null;
    this.qdI = null;
    this.qdJ = null;
    this.qdK = 0;
    this.qdL = 0;
    this.qdM = false;
    this.qdN = new Rect();
    this.qdO = new Rect();
    this.qdP = new Rect();
    this.qdQ = new Rect();
    this.qdR = new Rect();
    this.qdS = new Rect();
    this.qdT = new Rect();
    this.qdU = new Rect();
    this.qdV = new Rect();
    this.lkh = new Path();
    this.qdY = 2131690402;
    this.qdZ = 0L;
    this.qea = false;
    this.qec = 300;
    this.qed = 0.0F;
    this.qee = 0.0F;
    this.qef = 0.0F;
    this.qeg = 0.0F;
    this.qei = null;
    AppMethodBeat.o(81149);
  }

  public final void cht()
  {
    AppMethodBeat.i(81151);
    this.qdM = true;
    if (this.qdG != null)
    {
      ab.i("ScanMaskView", "bitmap recycle %s", new Object[] { this.qdG.toString() });
      this.qdG.recycle();
      this.qdG = null;
    }
    if (this.qdH != null)
    {
      ab.i("ScanMaskView", "bitmap recycle %s", new Object[] { this.qdH.toString() });
      this.qdH.recycle();
      this.qdH = null;
    }
    if (this.qdI != null)
    {
      ab.i("ScanMaskView", "bitmap recycle %s", new Object[] { this.qdI.toString() });
      this.qdI.recycle();
      this.qdI = null;
    }
    if (this.qdJ != null)
    {
      ab.i("ScanMaskView", "bitmap recycle %s", new Object[] { this.qdJ.toString() });
      this.qdJ.recycle();
      this.qdJ = null;
    }
    AppMethodBeat.o(81151);
  }

  public int getMaskAnimDuration()
  {
    return this.qec;
  }

  public Rect getMaskRect()
  {
    return this.qdW;
  }

  public final void k(Rect paramRect)
  {
    AppMethodBeat.i(81152);
    if ((paramRect.left == this.qdW.left) && (paramRect.right == this.qdW.right) && (paramRect.top == this.qdW.top) && (paramRect.bottom == this.qdW.bottom))
      AppMethodBeat.o(81152);
    while (true)
    {
      return;
      this.qed = (paramRect.left - this.qdW.left);
      this.qee = (paramRect.right - this.qdW.right);
      this.qef = (paramRect.top - this.qdW.top);
      this.qeg = (paramRect.bottom - this.qdW.bottom);
      this.qeb = new Rect(this.qdW.left, this.qdW.top, this.qdW.right, this.qdW.bottom);
      this.qea = true;
      this.qei = new ValueAnimator();
      this.qei.setFloatValues(new float[] { 0.0F, 1.0F });
      this.qei.setDuration(this.qec);
      this.qei.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          AppMethodBeat.i(81147);
          float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
          ScanMaskView.b(ScanMaskView.this).left += (int)(ScanMaskView.c(ScanMaskView.this) * f);
          ScanMaskView.b(ScanMaskView.this).right += (int)(ScanMaskView.d(ScanMaskView.this) * f);
          ScanMaskView.b(ScanMaskView.this).top += (int)(ScanMaskView.e(ScanMaskView.this) * f);
          paramAnonymousValueAnimator = ScanMaskView.a(ScanMaskView.this);
          int i = ScanMaskView.b(ScanMaskView.this).bottom;
          paramAnonymousValueAnimator.bottom = ((int)(f * ScanMaskView.f(ScanMaskView.this)) + i);
          ScanMaskView.this.invalidate();
          AppMethodBeat.o(81147);
        }
      });
      this.qei.start();
      this.qei.addListener(new ScanMaskView.2(this));
      AppMethodBeat.o(81152);
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(81153);
    if ((this.qdW == null) || (this.qdM))
    {
      AppMethodBeat.o(81153);
      return;
    }
    System.currentTimeMillis();
    System.currentTimeMillis();
    int i = paramCanvas.save();
    this.mPaint.reset();
    if (d.fP(18))
    {
      this.qdS.left = 0;
      this.qdS.top = this.qdW.top;
      this.qdS.right = this.qdW.left;
      this.qdS.bottom = this.qdW.bottom;
      this.qdT.left = this.qdW.left;
      this.qdT.top = 0;
      this.qdT.right = this.qdW.right;
      this.qdT.bottom = this.qdW.top;
      this.qdU.left = this.qdW.right;
      this.qdU.top = this.qdW.top;
      this.qdU.right = getWidth();
      this.qdU.bottom = this.qdW.bottom;
      this.qdV.left = this.qdW.left;
      this.qdV.top = this.qdW.bottom;
      this.qdV.right = this.qdW.right;
      this.qdV.bottom = getHeight();
      this.qdO.left = 0;
      this.qdO.top = 0;
      this.qdO.right = this.qdW.left;
      this.qdO.bottom = this.qdW.top;
      this.qdP.left = this.qdW.right;
      this.qdP.top = 0;
      this.qdP.right = getWidth();
      this.qdP.bottom = this.qdW.top;
      this.qdQ.left = 0;
      this.qdQ.top = this.qdW.bottom;
      this.qdQ.right = this.qdW.left;
      this.qdQ.bottom = getHeight();
      this.qdR.left = this.qdW.right;
      this.qdR.top = this.qdW.bottom;
      this.qdR.right = getWidth();
      this.qdR.bottom = getHeight();
      paramCanvas.save();
      paramCanvas.clipRect(this.qdS, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.qdY));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.qdT, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.qdY));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.qdU, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.qdY));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.qdV, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.qdY));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.qdO, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.qdY));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.qdP, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.qdY));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.qdQ, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.qdY));
      paramCanvas.restore();
      paramCanvas.save();
      paramCanvas.clipRect(this.qdR, Region.Op.REPLACE);
      paramCanvas.drawColor(getResources().getColor(this.qdY));
      paramCanvas.restore();
    }
    while (true)
    {
      System.currentTimeMillis();
      System.currentTimeMillis();
      paramCanvas.restoreToCount(i);
      this.mPaint.reset();
      this.mPaint.setStyle(Paint.Style.STROKE);
      this.mPaint.setStrokeWidth(1.0F);
      this.mPaint.setColor(-3355444);
      this.mPaint.setAntiAlias(true);
      paramCanvas.drawRect(this.qdW, this.mPaint);
      System.currentTimeMillis();
      System.currentTimeMillis();
      paramCanvas.drawBitmap(this.qdG, this.qdW.left, this.qdW.top, this.qeh);
      paramCanvas.drawBitmap(this.qdH, this.qdW.right - this.qdK, this.qdW.top, this.qeh);
      paramCanvas.drawBitmap(this.qdI, this.qdW.left, this.qdW.bottom - this.qdL, this.qeh);
      paramCanvas.drawBitmap(this.qdJ, this.qdW.right - this.qdK, this.qdW.bottom - this.qdL, this.qeh);
      System.currentTimeMillis();
      super.onDraw(paramCanvas);
      System.currentTimeMillis();
      AppMethodBeat.o(81153);
      break;
      paramCanvas.clipRect(this.qdW, Region.Op.DIFFERENCE);
      paramCanvas.drawColor(getResources().getColor(this.qdY));
    }
  }

  public void setMaskAnimaListener(ScanMaskView.a parama)
  {
    this.qej = parama;
  }

  public void setMaskColorRsid(int paramInt)
  {
    this.qdY = paramInt;
  }

  public void setMastAnimaDuration(int paramInt)
  {
    this.qec = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScanMaskView
 * JD-Core Version:    0.6.2
 */