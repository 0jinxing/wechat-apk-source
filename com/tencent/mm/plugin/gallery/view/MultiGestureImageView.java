package com.tencent.mm.plugin.gallery.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.OverScroller;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.f;
import java.lang.ref.WeakReference;

public class MultiGestureImageView extends LinearLayout
{
  private int apF;
  private int apG;
  private float ccB;
  private int count;
  private int ieu;
  private int iev;
  private MultiGestureImageView.j mSA;
  private MultiGestureImageView.j mSB;
  private MultiGestureImageView.d mSC;
  private MultiGestureImageView.b mSD;
  private MultiTouchImageView mSi;
  private long mSj;
  private long mSk;
  private float mSl;
  private float mSm;
  private long mSn;
  private boolean mSp;
  private OverScroller mSq;
  private GestureDetector mSr;
  private RectF mSs;
  private MultiGestureImageView.a mSt;
  private float mSu;
  private boolean mSv;
  private boolean mSw;
  private boolean mSx;
  private boolean mSy;
  private MultiGestureImageView.j mSz;

  public MultiGestureImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(21640);
    this.count = 0;
    this.mSj = 0L;
    this.mSk = 0L;
    this.mSl = 0.0F;
    this.mSm = 0.0F;
    this.mSn = 0L;
    this.mSp = false;
    this.mSs = new RectF();
    this.mSv = false;
    this.mSw = false;
    this.mSx = false;
    this.mSy = false;
    init(paramContext, paramAttributeSet);
    AppMethodBeat.o(21640);
  }

  public MultiGestureImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(21641);
    this.count = 0;
    this.mSj = 0L;
    this.mSk = 0L;
    this.mSl = 0.0F;
    this.mSm = 0.0F;
    this.mSn = 0L;
    this.mSp = false;
    this.mSs = new RectF();
    this.mSv = false;
    this.mSw = false;
    this.mSx = false;
    this.mSy = false;
    init(paramContext, paramAttributeSet);
    AppMethodBeat.o(21641);
  }

  private void bCP()
  {
    AppMethodBeat.i(21646);
    this.mSz.removeMessages(1);
    AppMethodBeat.o(21646);
  }

  private void bCQ()
  {
    AppMethodBeat.i(21647);
    bCP();
    this.mSz.j(1, 15L, 15L);
    AppMethodBeat.o(21647);
  }

  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(21642);
    this.mSi = new MultiTouchImageView(paramContext, paramAttributeSet);
    this.mSr = new GestureDetector(paramContext, new MultiGestureImageView.c(this, (byte)0));
    this.mSq = new OverScroller(paramContext, new DecelerateInterpolator(2.0F));
    paramContext = new LinearLayout.LayoutParams(-1, -1);
    this.mSi.setLayoutParams(paramContext);
    addView(this.mSi);
    this.mSz = new MultiGestureImageView.j(this, new WeakReference(this));
    this.mSA = new MultiGestureImageView.j(this, new WeakReference(this));
    this.mSB = new MultiGestureImageView.j(this, new WeakReference(this));
    AppMethodBeat.o(21642);
  }

  public void computeScroll()
  {
    int i = 0;
    AppMethodBeat.i(21645);
    if (this.mSi == null)
    {
      AppMethodBeat.o(21645);
      return;
    }
    float f2;
    float f5;
    int m;
    int n;
    if (this.mSq.computeScrollOffset())
    {
      j = this.mSq.getCurrX() - this.apF;
      int k = this.mSq.getCurrY() - this.apG;
      this.apF = this.mSq.getCurrX();
      this.apG = this.mSq.getCurrY();
      float f1 = this.mSi.getScale();
      f2 = this.mSi.getImageWidth();
      float f3 = f1 * this.mSi.getImageHeight();
      float[] arrayOfFloat = new float[9];
      this.mSi.getImageMatrix().getValues(arrayOfFloat);
      float f4 = arrayOfFloat[2];
      f1 = f2 * f1 + f4;
      f5 = arrayOfFloat[5];
      f2 = f5 + f3;
      m = j;
      if (j < 0)
      {
        m = j;
        if (j < this.mSs.right - Math.round(f1))
          m = (int)(this.mSs.right - Math.round(f1));
      }
      j = m;
      if (m > 0)
      {
        j = m;
        if (m > this.mSs.left - Math.round(f4))
          j = (int)(this.mSs.left - Math.round(f4));
      }
      n = k;
      if (k < 0)
      {
        n = k;
        if (k < this.mSs.bottom - Math.round(f2))
          n = (int)(this.mSs.bottom - Math.round(f2));
      }
      m = n;
      if (n > 0)
      {
        m = n;
        if (n > this.mSs.top - Math.round(f5))
          m = (int)(this.mSs.top - Math.round(f5));
      }
      if ((Math.round(f4) < this.mSs.left) && (Math.round(f1) > this.mSs.right))
        break label427;
      n = 0;
      label389: if (f3 >= this.iev)
        break label473;
    }
    label427: label473: for (int j = i; ; j = m)
    {
      this.mSi.aj(n, j);
      postInvalidate();
      AppMethodBeat.o(21645);
      break;
      if (Math.round(f5) < this.mSs.top)
      {
        n = j;
        if (Math.round(f2) > this.mSs.bottom)
          break label389;
      }
      m = 0;
      n = j;
      break label389;
    }
  }

  public int getImageHeight()
  {
    AppMethodBeat.i(21651);
    int i = this.mSi.getImageHeight();
    AppMethodBeat.o(21651);
    return i;
  }

  public int getImageWidth()
  {
    AppMethodBeat.i(21649);
    int i = this.mSi.getImageWidth();
    AppMethodBeat.o(21649);
    return i;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(21643);
    super.onMeasure(paramInt1, paramInt2);
    this.ieu = View.MeasureSpec.getSize(paramInt1);
    this.iev = View.MeasureSpec.getSize(paramInt2);
    this.mSs.set(0.0F, 0.0F, this.ieu, this.iev);
    ab.v("MicroMsg.MuitlGestureImageView", "MMGestureGallery width:" + this.ieu + " height:" + this.iev);
    AppMethodBeat.o(21643);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(21644);
    this.mSr.onTouchEvent(paramMotionEvent);
    float f1;
    float f2;
    float f4;
    if (paramMotionEvent.getAction() == 0)
    {
      this.mSq.forceFinished(true);
      this.mSB.removeMessages(2);
      this.mSB.j(2, 500L, 0L);
      this.mSi.dzB();
      this.count += 1;
      if (this.count == 1)
      {
        this.mSj = System.currentTimeMillis();
        this.mSl = f.c(paramMotionEvent, 0);
        this.mSm = f.d(paramMotionEvent, 0);
      }
    }
    else
    {
      if ((paramMotionEvent.getAction() == 6) || (paramMotionEvent.getAction() == 262))
      {
        this.mSB.removeMessages(2);
        this.ccB = 0.0F;
        this.mSu = this.mSi.getScale();
        this.mSp = true;
        float f3;
        if (this.mSu < this.mSi.getScaleRate())
        {
          f1 = f.c(paramMotionEvent, 0);
          f2 = f.c(paramMotionEvent, 1);
          f3 = f.d(paramMotionEvent, 0);
          f4 = f.d(paramMotionEvent, 1);
          this.mSi.ah(f1 - f2 + f.c(paramMotionEvent, 1), f3 - f4 + f.d(paramMotionEvent, 1));
        }
        if (this.mSu > this.mSi.getDoubleTabScale())
        {
          f1 = f.c(paramMotionEvent, 0);
          f3 = f.c(paramMotionEvent, 1);
          f2 = f.d(paramMotionEvent, 0);
          f4 = f.d(paramMotionEvent, 1);
          this.mSi.ai(f1 - f3 + f.c(paramMotionEvent, 1), f2 - f4 + f.d(paramMotionEvent, 1));
        }
      }
      if (paramMotionEvent.getAction() == 1)
      {
        this.mSB.removeMessages(2);
        if (((!this.mSx) && (!this.mSy)) || ((!this.mSv) && (!this.mSw)))
          break label777;
        this.mSt = new MultiGestureImageView.f(this, this.mSi);
        bCQ();
        this.mSx = false;
        this.mSy = false;
        this.mSv = false;
        this.mSw = false;
        label368: this.ccB = 0.0F;
        this.mSu = this.mSi.getScale();
        if (this.count == 1)
        {
          this.mSk = System.currentTimeMillis();
          if (this.mSk - this.mSj >= 350L)
            break label908;
          if ((Math.abs(this.mSl - f.c(paramMotionEvent, 0)) < 10.0F) && (Math.abs(this.mSm - f.d(paramMotionEvent, 0)) < 10.0F))
          {
            MultiGestureImageView.j localj = this.mSA;
            localj.cOV = false;
            localj.j(0, 350L, 0L);
          }
        }
      }
      label477: if ((paramMotionEvent.getAction() == 5) || (paramMotionEvent.getAction() == 261))
      {
        this.ccB = 0.0F;
        this.mSu = this.mSi.getScale();
        this.mSp = true;
      }
      if (paramMotionEvent.getAction() == 2)
      {
        if (f.O(paramMotionEvent) != 2)
          break label972;
        this.mSB.removeMessages(2);
        this.mSp = true;
        this.count = 0;
        f1 = f.c(paramMotionEvent, 0) - f.c(paramMotionEvent, 1);
        f2 = f.d(paramMotionEvent, 0) - f.d(paramMotionEvent, 1);
        f4 = (float)Math.sqrt(f1 * f1 + f2 * f2);
        if (this.ccB != 0.0F)
          break label925;
        this.ccB = f4;
      }
    }
    while (true)
    {
      AppMethodBeat.o(21644);
      return true;
      if (this.count != 2)
        break;
      this.mSn = System.currentTimeMillis();
      if (this.mSn - this.mSk < 350L)
      {
        if ((Math.abs(this.mSl - f.c(paramMotionEvent, 0)) < 35.0F) && (Math.abs(this.mSm - f.d(paramMotionEvent, 0)) < 35.0F))
        {
          this.count = 0;
          ab.d("MicroMsg.MuitlGestureImageView", "double click!");
          if (this.mSi.getScale() <= this.mSi.getScaleRate())
          {
            this.mSi.ai(f.c(paramMotionEvent, 0), f.d(paramMotionEvent, 0));
            break;
          }
          this.mSi.ah(f.c(paramMotionEvent, 0), f.d(paramMotionEvent, 0));
          this.mSi.dAp();
          break;
        }
        this.count = 1;
        break;
      }
      this.count = 1;
      break;
      label777: if (this.mSx)
      {
        this.mSx = false;
        this.mSt = new MultiGestureImageView.g(this, this.mSi);
        bCQ();
      }
      if (this.mSy)
      {
        this.mSy = false;
        this.mSt = new MultiGestureImageView.h(this, this.mSi);
        bCQ();
      }
      if (this.mSv)
      {
        this.mSv = false;
        this.mSt = new MultiGestureImageView.i(this, this.mSi);
        bCQ();
      }
      if (!this.mSw)
        break label368;
      this.mSw = false;
      this.mSt = new MultiGestureImageView.e(this, this.mSi);
      bCQ();
      break label368;
      label908: this.count = 0;
      ab.d("MicroMsg.MuitlGestureImageView", "single long click over!");
      break label477;
      label925: f4 /= this.ccB;
      if (this.mSp)
      {
        this.mSi.k(f4 * this.mSu, f1 + f.c(paramMotionEvent, 1), f2 + f.d(paramMotionEvent, 1));
        continue;
        label972: if ((Math.abs(this.mSl - f.c(paramMotionEvent, 0)) > 10.0F) || (Math.abs(this.mSm - f.d(paramMotionEvent, 0)) > 10.0F))
        {
          this.mSB.removeMessages(2);
          this.count = 0;
          computeScroll();
        }
      }
    }
  }

  public void setEnableHorLongBmpMode(boolean paramBoolean)
  {
    AppMethodBeat.i(21648);
    this.mSi.setEnableHorLongBmpMode(paramBoolean);
    AppMethodBeat.o(21648);
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(21653);
    this.mSi.setImageBitmap(paramBitmap);
    this.mSi.dzA();
    AppMethodBeat.o(21653);
  }

  public void setImageHeight(int paramInt)
  {
    AppMethodBeat.i(21652);
    this.mSi.setImageHeight(paramInt);
    AppMethodBeat.o(21652);
  }

  public void setImageWidth(int paramInt)
  {
    AppMethodBeat.i(21650);
    this.mSi.setImageWidth(paramInt);
    AppMethodBeat.o(21650);
  }

  public void setLongClickOverListener(MultiGestureImageView.b paramb)
  {
    this.mSD = paramb;
  }

  public void setSingleClickOverListener(MultiGestureImageView.d paramd)
  {
    this.mSC = paramd;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.view.MultiGestureImageView
 * JD-Core Version:    0.6.2
 */