package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Gallery;
import android.widget.OverScroller;
import android.widget.SpinnerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.MultiTouchImageView;
import java.lang.ref.WeakReference;

public class MMGestureGallery extends Gallery
{
  private float aKM;
  private float aKN;
  private int apF;
  private int apG;
  private float ccB;
  private int count;
  private ak handler;
  private int ieu;
  private int iev;
  private MultiTouchImageView mSF;
  private long mSj;
  private long mSk;
  private float mSl;
  private float mSm;
  private long mSn;
  private boolean mSp;
  private OverScroller mSq;
  private GestureDetector mSr;
  private RectF mSs;
  private float mSu;
  private boolean mSv;
  private boolean mSw;
  private boolean mSx;
  private boolean mSy;
  private VelocityTracker mVelocityTracker;
  private boolean rvb;
  private boolean rvc;
  private boolean rvd;
  private final int yyA;
  private final int yyB;
  public boolean yyh;
  private boolean yyi;
  private boolean yyj;
  private boolean yyk;
  private boolean yyl;
  private int yym;
  public MMGestureGallery.l zFB;
  public MMGestureGallery.l zFC;
  public MMGestureGallery.l zFD;
  private MMGestureGallery.a zFE;
  private MMGestureGallery.f zFF;
  private MMGestureGallery.c zFG;
  private MMGestureGallery.e zFH;
  private boolean zFI;
  private MMGestureGallery.b zFJ;

  public MMGestureGallery(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107685);
    this.mSp = false;
    this.yyi = false;
    this.yyj = false;
    this.yyk = false;
    this.yyl = false;
    this.mSv = false;
    this.mSw = false;
    this.mSx = false;
    this.mSy = false;
    this.yym = 0;
    this.count = 0;
    this.mSj = 0L;
    this.mSk = 0L;
    this.mSl = 0.0F;
    this.mSm = 0.0F;
    this.mSn = 0L;
    this.mSs = new RectF();
    this.handler = new ak(Looper.getMainLooper());
    this.zFI = true;
    this.aKM = 0.0F;
    this.aKN = 0.0F;
    this.rvb = false;
    this.rvc = false;
    this.rvd = false;
    this.yyh = false;
    this.yyA = 60;
    this.yyB = 500;
    setStaticTransformationsEnabled(true);
    this.mSr = new GestureDetector(paramContext, new MMGestureGallery.d(this, (byte)0));
    this.zFB = new MMGestureGallery.l(new WeakReference(this));
    this.zFC = new MMGestureGallery.l(new WeakReference(this));
    this.zFD = new MMGestureGallery.l(new WeakReference(this));
    this.mSq = new OverScroller(paramContext, new DecelerateInterpolator(2.0F));
    this.yym = ((int)(getResources().getDisplayMetrics().density * 3000.0F));
    setOnTouchListener(new MMGestureGallery.1(this));
    AppMethodBeat.o(107685);
  }

  public MMGestureGallery(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107683);
    this.mSp = false;
    this.yyi = false;
    this.yyj = false;
    this.yyk = false;
    this.yyl = false;
    this.mSv = false;
    this.mSw = false;
    this.mSx = false;
    this.mSy = false;
    this.yym = 0;
    this.count = 0;
    this.mSj = 0L;
    this.mSk = 0L;
    this.mSl = 0.0F;
    this.mSm = 0.0F;
    this.mSn = 0L;
    this.mSs = new RectF();
    this.handler = new ak(Looper.getMainLooper());
    this.zFI = true;
    this.aKM = 0.0F;
    this.aKN = 0.0F;
    this.rvb = false;
    this.rvc = false;
    this.rvd = false;
    this.yyh = false;
    this.yyA = 60;
    this.yyB = 500;
    setStaticTransformationsEnabled(true);
    AppMethodBeat.o(107683);
  }

  private void a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat)
  {
    AppMethodBeat.i(107694);
    float f1 = paramMotionEvent1.getX();
    float f2 = paramMotionEvent2.getX();
    float f3 = paramMotionEvent1.getY();
    float f4 = paramMotionEvent2.getY();
    boolean bool = b(paramMotionEvent1, paramMotionEvent2);
    f2 = Math.abs(f1 - f2);
    f4 = Math.abs(f3 - f4);
    if (Math.abs(paramFloat) <= 500.0F)
      AppMethodBeat.o(107694);
    while (true)
    {
      return;
      if (f2 < 60.0F)
      {
        AppMethodBeat.o(107694);
      }
      else if (f2 < f4)
      {
        AppMethodBeat.o(107694);
      }
      else if (bool)
      {
        onKeyDown(21, null);
        AppMethodBeat.o(107694);
      }
      else
      {
        onKeyDown(22, null);
        AppMethodBeat.o(107694);
      }
    }
  }

  private boolean a(float paramFloat1, float paramFloat2, View paramView, float paramFloat3)
  {
    boolean bool = true;
    AppMethodBeat.i(107688);
    int i;
    if ((this.yyj) || (this.yyi))
    {
      i = 0;
      if (i == 0)
        break label250;
      AppMethodBeat.o(107688);
    }
    while (true)
    {
      return bool;
      if (getPositionForView(paramView) == getAdapter().getCount() - 1)
      {
        if (this.yyl)
        {
          if (paramFloat3 > 0.0F)
          {
            if (paramFloat2 >= this.ieu)
              this.mSF.aj(-paramFloat3, 0.0F);
            while (true)
            {
              i = 1;
              break;
              if ((paramFloat2 > this.ieu * 0.7F) && (paramFloat2 < this.iev))
                this.mSF.aj(-(paramFloat3 * 0.3F), 0.0F);
            }
          }
          i = 0;
          break;
        }
        if (paramFloat3 > 0.0F)
        {
          if (paramFloat2 < this.ieu)
            this.yyl = true;
          if (paramFloat2 >= this.ieu)
            this.mSF.aj(-paramFloat3, 0.0F);
          while (true)
          {
            i = 1;
            break;
            if ((paramFloat2 > this.ieu * 0.7F) && (paramFloat2 < this.iev))
              this.mSF.aj(-(paramFloat3 * 0.3F), 0.0F);
          }
        }
      }
      this.yyl = false;
      i = 0;
      break;
      label250: if ((this.yyj) || (this.yyi))
        i = 0;
      while (true)
      {
        if (i == 0)
          break label460;
        AppMethodBeat.o(107688);
        break;
        if (getPositionForView(paramView) == 0)
        {
          if (this.yyk)
          {
            if (paramFloat3 < 0.0F)
            {
              if ((paramFloat1 > 0.0F) && (paramFloat1 < this.ieu * 0.3F))
                this.mSF.aj(-(paramFloat3 * 0.3F), 0.0F);
              while (true)
              {
                i = 1;
                break;
                if (paramFloat1 <= 0.0F)
                  this.mSF.aj(-paramFloat3, 0.0F);
              }
            }
            i = 0;
          }
          else if (paramFloat3 < 0.0F)
          {
            if (paramFloat1 > 0.0F)
              this.yyk = true;
            if ((paramFloat1 > 0.0F) && (paramFloat1 < this.ieu * 0.3F))
              this.mSF.aj(-(paramFloat3 * 0.3F), 0.0F);
            while (true)
            {
              i = 1;
              break;
              if (paramFloat1 <= 0.0F)
                this.mSF.aj(-paramFloat3, 0.0F);
            }
          }
        }
        else
        {
          this.yyk = false;
          i = 0;
        }
      }
      label460: AppMethodBeat.o(107688);
      bool = false;
    }
  }

  private boolean a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    boolean bool = true;
    AppMethodBeat.i(107687);
    if (this.yyi)
      AppMethodBeat.o(107687);
    while (true)
    {
      return bool;
      this.yyj = true;
      if (this.zFH != null)
        this.zFH.ctp();
      bool = super.onScroll(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
      AppMethodBeat.o(107687);
    }
  }

  private static boolean b(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2)
  {
    AppMethodBeat.i(107693);
    boolean bool;
    if (paramMotionEvent1.getX() - paramMotionEvent2.getX() < 0.0F)
    {
      bool = true;
      AppMethodBeat.o(107693);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107693);
    }
  }

  private void bCP()
  {
    AppMethodBeat.i(107684);
    this.zFB.removeMessages(1);
    AppMethodBeat.o(107684);
  }

  public void computeScroll()
  {
    int i = 0;
    AppMethodBeat.i(107698);
    if (this.mSF == null)
    {
      AppMethodBeat.o(107698);
      return;
    }
    int j;
    float f1;
    float f5;
    int m;
    int n;
    if (this.mSq.computeScrollOffset())
    {
      j = this.mSq.getCurrX() - this.apF;
      int k = this.mSq.getCurrY() - this.apG;
      this.apF = this.mSq.getCurrX();
      this.apG = this.mSq.getCurrY();
      f1 = this.mSF.getScale();
      float f2 = this.mSF.getImageWidth();
      float f3 = this.mSF.getScale() * this.mSF.getImageHeight();
      float[] arrayOfFloat = new float[9];
      this.mSF.getImageMatrix().getValues(arrayOfFloat);
      float f4 = arrayOfFloat[2];
      f2 = f1 * f2 + f4;
      f5 = arrayOfFloat[5];
      f1 = f5 + f3;
      m = j;
      if (j < 0)
      {
        m = j;
        if (j < this.mSs.right - Math.round(f2))
          m = (int)(this.mSs.right - Math.round(f2));
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
        if (k < this.mSs.bottom - Math.round(f1))
          n = (int)(this.mSs.bottom - Math.round(f1));
      }
      m = n;
      if (n > 0)
      {
        m = n;
        if (n > this.mSs.top - Math.round(f5))
          m = (int)(this.mSs.top - Math.round(f5));
      }
      if ((Math.round(f4) < this.mSs.left) && (Math.round(f2) > this.mSs.right))
        break label434;
      n = 0;
      label394: if (f3 >= this.iev)
        break label480;
      m = i;
    }
    label434: label480: 
    while (true)
    {
      this.mSF.aj(n, m);
      postInvalidate();
      AppMethodBeat.o(107698);
      break;
      if (Math.round(f5) < this.mSs.top)
      {
        n = j;
        if (Math.round(f1) > this.mSs.bottom)
          break label394;
      }
      m = 0;
      n = j;
      break label394;
    }
  }

  public int getScreenWidth()
  {
    return this.ieu;
  }

  public int getXDown()
  {
    return (int)this.aKM;
  }

  public int getYDown()
  {
    return (int)this.aKN;
  }

  public boolean isFocused()
  {
    return true;
  }

  public boolean onDown(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(107690);
    if (this.mSq != null)
      this.mSq.forceFinished(true);
    boolean bool = super.onDown(paramMotionEvent);
    AppMethodBeat.o(107690);
    return bool;
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(107691);
    Object localObject1 = getSelectedView();
    Object localObject2 = localObject1;
    boolean bool;
    if ((localObject1 instanceof ViewGroup))
    {
      localObject2 = ((View)localObject1).findViewById(2131820630);
      if ((localObject2 == null) || (((View)localObject2).getVisibility() == 8))
      {
        a(paramMotionEvent1, paramMotionEvent2, paramFloat1);
        bool = false;
        AppMethodBeat.o(107691);
      }
      while (true)
      {
        return bool;
        localObject1 = ((View)localObject2).findViewById(2131820629);
        localObject2 = localObject1;
        if (localObject1 != null)
          break;
        a(paramMotionEvent1, paramMotionEvent2, paramFloat1);
        bool = false;
        AppMethodBeat.o(107691);
      }
    }
    float f1;
    float f2;
    float f3;
    float f4;
    float f5;
    if ((localObject2 instanceof MultiTouchImageView))
    {
      localObject2 = (MultiTouchImageView)localObject2;
      f1 = ((MultiTouchImageView)localObject2).getScale() * ((MultiTouchImageView)localObject2).getImageWidth();
      f2 = ((MultiTouchImageView)localObject2).getScale() * ((MultiTouchImageView)localObject2).getImageHeight();
      if ((((MultiTouchImageView)localObject2).yzk) || (((MultiTouchImageView)localObject2).yzl) || ((int)f1 > this.ieu) || ((int)f2 > this.iev))
      {
        localObject1 = new float[9];
        ((MultiTouchImageView)localObject2).getImageMatrix().getValues((float[])localObject1);
        f3 = localObject1[2];
        f4 = f3 + f1;
        f5 = localObject1[5];
        ab.d("MicroMsg.MMGestureGallery", "jacks left: %f,right: %f isGestureRight=> %B, vX: %s, vY: %s", new Object[] { Float.valueOf(f3), Float.valueOf(f4), Boolean.valueOf(b(paramMotionEvent1, paramMotionEvent2)), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
        if ((Math.round(f3) < this.mSs.left) && (Math.round(f4) > this.mSs.right))
          break label685;
      }
    }
    label647: label685: for (float f6 = 0.0F; ; f6 = paramFloat1)
    {
      if ((Math.round(f5) >= this.mSs.top) || (Math.round(f5 + f2) <= this.mSs.bottom))
        paramFloat2 = 0.0F;
      label374: int i;
      int j;
      int k;
      int m;
      if (Math.round(f5) < this.mSs.top)
      {
        this.yyh = true;
        i = (int)(this.mSs.right - f1);
        j = (int)(f1 + this.mSs.right);
        k = (int)(this.mSs.bottom - f2);
        m = (int)(this.mSs.bottom + f2);
        if (f6 < 0.0F)
          break label589;
        f5 = f6;
        if (Math.abs(f6) >= this.yym)
          f5 = this.yym;
        label458: if (paramFloat2 < 0.0F)
          break label618;
        f6 = paramFloat2;
        if (Math.abs(paramFloat2) >= this.yym)
          f6 = this.yym;
      }
      while (true)
      {
        this.mSq.forceFinished(true);
        this.mSq.fling(this.mSq.getCurrX(), this.mSq.getCurrY(), (int)f5, (int)f6, i, j, k, m, 0, 0);
        if (((b(paramMotionEvent1, paramMotionEvent2)) && (f3 >= 0.0F)) || ((!b(paramMotionEvent1, paramMotionEvent2)) && (f4 <= this.ieu)))
          break label647;
        bool = true;
        AppMethodBeat.o(107691);
        break;
        this.yyh = false;
        break label374;
        label589: f5 = f6;
        if (Math.abs(f6) >= this.yym)
          f5 = -this.yym;
        break label458;
        label618: f6 = paramFloat2;
        if (Math.abs(paramFloat2) >= this.yym)
          f6 = -this.yym;
      }
      if (this.mSp)
      {
        bool = true;
        AppMethodBeat.o(107691);
        break;
      }
      a(paramMotionEvent1, paramMotionEvent2, paramFloat1);
      bool = true;
      AppMethodBeat.o(107691);
      break;
    }
  }

  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    AppMethodBeat.i(107696);
    if (paramBoolean)
      super.onFocusChanged(paramBoolean, paramInt, paramRect);
    AppMethodBeat.o(107696);
  }

  public void onLongPress(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(107692);
    this.rvd = true;
    super.onLongPress(paramMotionEvent);
    AppMethodBeat.o(107692);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107686);
    super.onMeasure(paramInt1, paramInt2);
    this.ieu = View.MeasureSpec.getSize(paramInt1);
    this.iev = View.MeasureSpec.getSize(paramInt2);
    this.mSs.set(0.0F, 0.0F, this.ieu, this.iev);
    ab.v("MicroMsg.MMGestureGallery", "MMGestureGallery width:" + this.ieu + " height:" + this.iev);
    AppMethodBeat.o(107686);
  }

  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(107689);
    boolean bool;
    if ((this.mSp) || (this.rvb))
    {
      bool = true;
      AppMethodBeat.o(107689);
    }
    Object localObject2;
    float f1;
    float f3;
    float f4;
    float f5;
    float f6;
    while (true)
    {
      return bool;
      Object localObject1 = getSelectedView();
      localObject2 = localObject1;
      if ((localObject1 instanceof ViewGroup))
      {
        localObject2 = ((View)localObject1).findViewById(2131820630);
        if ((localObject2 == null) || (((View)localObject2).getVisibility() == 8))
        {
          bool = a(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
          AppMethodBeat.o(107689);
        }
        else
        {
          localObject1 = ((View)localObject2).findViewById(2131820629);
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            bool = a(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
            AppMethodBeat.o(107689);
          }
        }
      }
      else
      {
        if (!(localObject2 instanceof MultiTouchImageView))
          break label1604;
        this.mSF = ((MultiTouchImageView)localObject2);
        localObject1 = new float[9];
        this.mSF.getImageMatrix().getValues((float[])localObject1);
        f1 = this.mSF.getScale() * this.mSF.getImageWidth();
        float f2 = this.mSF.getScale() * this.mSF.getImageHeight();
        f3 = localObject1[2];
        f4 = f3 + f1;
        f5 = localObject1[5];
        f6 = f5 + f2;
        localObject1 = new Rect();
        this.mSF.getGlobalVisibleRect((Rect)localObject1);
        if (((int)f1 <= this.ieu) && ((int)f2 <= this.iev))
        {
          if (a(f3, f4, (View)localObject2, paramFloat1))
          {
            bool = true;
            AppMethodBeat.o(107689);
          }
          else if (paramFloat1 > 0.0F)
          {
            if (f4 <= this.ieu)
            {
              bool = a(paramMotionEvent1, paramMotionEvent2, paramFloat1, 0.0F);
              AppMethodBeat.o(107689);
            }
          }
          else if (f3 >= 0.0F)
          {
            bool = a(paramMotionEvent1, paramMotionEvent2, paramFloat1, 0.0F);
            AppMethodBeat.o(107689);
          }
          else
          {
            if (!this.yyj)
              this.mSF.aj(-paramFloat1, 0.0F);
            bool = true;
            AppMethodBeat.o(107689);
          }
        }
        else if (((int)f1 <= this.ieu) && ((int)f2 > this.iev))
        {
          if (Math.abs(paramFloat2) > Math.abs(paramFloat1))
          {
            if ((this.yyj) || (this.yyk) || (this.yyl))
            {
              bool = true;
              AppMethodBeat.o(107689);
            }
            else
            {
              this.yyi = true;
              f2 = 0.0F;
              float f7 = 0.0F;
              if (paramFloat2 < 0.0F)
              {
                if (f5 > this.mSs.top)
                  this.mSv = true;
                if ((f5 <= this.mSs.top) || (f6 < this.iev))
                {
                  f1 = -paramFloat2;
                  label518: if ((paramFloat1 >= 0.0F) || (f3 <= this.mSs.left))
                    break label711;
                  this.mSx = true;
                  paramFloat2 = -(0.3F * paramFloat1);
                }
              }
              while (true)
              {
                this.mSF.aj(paramFloat2, f1);
                bool = true;
                AppMethodBeat.o(107689);
                break;
                f1 = f7;
                if (f5 <= this.mSs.top)
                  break label518;
                f1 = f7;
                if (f5 >= this.iev * 0.3F)
                  break label518;
                f1 = -(0.3F * paramFloat2);
                break label518;
                if (f6 < this.mSs.bottom)
                  this.mSw = true;
                if ((f5 > 0.0F) || (f6 >= this.iev))
                {
                  f1 = -paramFloat2;
                  break label518;
                }
                f1 = f7;
                if (f6 <= this.iev * 0.7F)
                  break label518;
                f1 = f7;
                if (f6 >= this.iev)
                  break label518;
                f1 = -(0.3F * paramFloat2);
                break label518;
                label711: paramFloat2 = f2;
                if (paramFloat1 > 0.0F)
                {
                  paramFloat2 = f2;
                  if (f4 < this.mSs.right)
                  {
                    this.mSy = true;
                    paramFloat2 = -(0.3F * paramFloat1);
                  }
                }
              }
            }
          }
          else if (a(f3, f4, (View)localObject2, paramFloat1))
          {
            bool = true;
            AppMethodBeat.o(107689);
          }
          else if (paramFloat1 > 0.0F)
          {
            if (f4 <= this.ieu)
            {
              if (f4 > this.ieu * 0.7F)
              {
                bool = a(paramMotionEvent1, paramMotionEvent2, 0.3F * paramFloat1, 0.0F);
                AppMethodBeat.o(107689);
                continue;
              }
              bool = a(paramMotionEvent1, paramMotionEvent2, 0.0F, 0.0F);
              AppMethodBeat.o(107689);
            }
          }
          else if (f3 >= 0.0F)
          {
            if (f3 < this.ieu * 0.3F)
            {
              bool = a(paramMotionEvent1, paramMotionEvent2, 0.3F * paramFloat1, 0.0F);
              AppMethodBeat.o(107689);
            }
            else
            {
              bool = a(paramMotionEvent1, paramMotionEvent2, 0.0F, 0.0F);
              AppMethodBeat.o(107689);
            }
          }
          else
          {
            if (!this.yyj)
              this.mSF.aj(-paramFloat1, 0.0F);
            bool = true;
            AppMethodBeat.o(107689);
          }
        }
        else
        {
          if (((int)f1 <= this.ieu) || ((int)f2 > this.iev))
            break;
          if (a(f3, f4, (View)localObject2, paramFloat1))
          {
            bool = true;
            AppMethodBeat.o(107689);
          }
          else if (paramFloat1 > 0.0F)
          {
            if (f4 <= this.ieu)
            {
              bool = a(paramMotionEvent1, paramMotionEvent2, paramFloat1, 0.0F);
              AppMethodBeat.o(107689);
            }
          }
          else if (f3 >= 0.0F)
          {
            bool = a(paramMotionEvent1, paramMotionEvent2, paramFloat1, 0.0F);
            AppMethodBeat.o(107689);
          }
          else
          {
            if (!this.yyj)
              this.mSF.aj(-paramFloat1, 0.0F);
            bool = true;
            AppMethodBeat.o(107689);
          }
        }
      }
    }
    if (Math.abs(paramFloat2) > Math.abs(paramFloat1))
    {
      if (paramFloat1 == 0.0F)
        break label1629;
      this.yyj = true;
      if (paramFloat1 < 0.0F)
      {
        if (f3 > this.mSs.left)
          this.mSx = true;
        f1 = paramFloat1;
        if (f3 > this.mSs.left)
        {
          if (f4 >= this.ieu)
            break label1253;
          f1 = paramFloat1;
        }
      }
    }
    while (true)
    {
      label1162: if (paramFloat2 != 0.0F)
      {
        this.yyi = true;
        if (paramFloat2 < 0.0F)
        {
          if (f5 > this.mSs.top)
            this.mSv = true;
          paramFloat1 = paramFloat2;
          if (f5 > this.mSs.top)
          {
            if (f6 >= this.iev)
              break label1369;
            paramFloat1 = paramFloat2;
          }
        }
      }
      while (true)
      {
        this.mSF.aj(-f1, -paramFloat1);
        bool = true;
        AppMethodBeat.o(107689);
        break;
        label1253: if ((f3 <= this.mSs.left) || (f3 >= this.ieu * 0.3F))
          break label1629;
        f1 = paramFloat1 * 0.3F;
        break label1162;
        if (f4 < this.mSs.right)
          this.mSy = true;
        f1 = paramFloat1;
        if (f3 > 0.0F)
          break label1162;
        f1 = paramFloat1;
        if (f4 >= this.ieu)
          break label1162;
        if ((f4 <= this.ieu * 0.7F) || (f4 >= this.ieu))
          break label1629;
        f1 = paramFloat1 * 0.3F;
        break label1162;
        label1369: if ((f5 > this.mSs.top) && (f5 < this.iev * 0.3F))
        {
          paramFloat1 = paramFloat2 * 0.3F;
          continue;
          if (f6 < this.mSs.bottom)
            this.mSw = true;
          paramFloat1 = paramFloat2;
          if (f5 > 0.0F)
            continue;
          paramFloat1 = paramFloat2;
          if (f6 >= this.iev)
            continue;
          if ((f6 > this.iev * 0.7F) && (f6 < this.iev))
          {
            paramFloat1 = paramFloat2 * 0.3F;
            continue;
            if (a(f3, f4, (View)localObject2, paramFloat1))
            {
              bool = true;
              AppMethodBeat.o(107689);
              break;
            }
            if (paramFloat1 > 0.0F)
            {
              if (f4 > this.ieu)
                break label1573;
              bool = a(paramMotionEvent1, paramMotionEvent2, paramFloat1, 0.0F);
              AppMethodBeat.o(107689);
              break;
            }
            if (f3 >= 0.0F)
            {
              bool = a(paramMotionEvent1, paramMotionEvent2, paramFloat1, 0.0F);
              AppMethodBeat.o(107689);
              break;
            }
            if (!this.yyj)
              this.mSF.aj(-paramFloat1, -paramFloat2);
            bool = true;
            AppMethodBeat.o(107689);
            break;
            bool = a(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
            AppMethodBeat.o(107689);
            break;
          }
        }
        label1573: label1604: paramFloat1 = 0.0F;
      }
      label1629: f1 = 0.0F;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(107695);
    this.mSr.onTouchEvent(paramMotionEvent);
    ab.d("dktest", "onTouchEvent event.getAction()" + paramMotionEvent.getAction());
    switch (paramMotionEvent.getAction())
    {
    default:
    case 1:
    }
    while (true)
    {
      computeScroll();
      boolean bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(107695);
      return bool;
      Object localObject = getSelectedView();
      if ((localObject instanceof MultiTouchImageView))
      {
        this.mSF = ((MultiTouchImageView)localObject);
        float f1 = this.mSF.getScale() * this.mSF.getImageWidth();
        float f2 = this.mSF.getScale() * this.mSF.getImageHeight();
        if (((int)f1 <= this.ieu) && ((int)f2 <= this.iev))
        {
          ab.i("dktest", "onTouchEvent width:" + f1 + "height:" + f2);
        }
        else
        {
          localObject = new float[9];
          this.mSF.getImageMatrix().getValues((float[])localObject);
          f1 = localObject[5];
          ab.d("dktest", "onTouchEvent top:" + f1 + " height:" + f2 + " bottom:" + (f1 + f2));
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    AppMethodBeat.i(107697);
    if (paramBoolean)
      super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.o(107697);
  }

  public void setGalleryScaleListener(MMGestureGallery.b paramb)
  {
    this.zFJ = paramb;
  }

  public void setLoadQuit(boolean paramBoolean)
  {
    this.zFI = paramBoolean;
  }

  public void setLongClickOverListener(MMGestureGallery.c paramc)
  {
    this.zFG = paramc;
  }

  public void setScrollLeftRightListener(MMGestureGallery.e parame)
  {
    this.zFH = parame;
  }

  public void setSingleClickOverListener(MMGestureGallery.f paramf)
  {
    this.zFF = paramf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMGestureGallery
 * JD-Core Version:    0.6.2
 */