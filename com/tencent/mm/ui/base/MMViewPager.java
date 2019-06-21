package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Looper;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v4.view.p;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.mogic.WxViewPager;
import java.lang.ref.WeakReference;

public class MMViewPager extends WxViewPager
{
  private float aKM;
  private float aKN;
  private int aaF;
  private int alh;
  private int apF;
  private int apG;
  private float ccB;
  private ak handler;
  private GestureDetector iay;
  private int ieu;
  private int iev;
  private View.OnTouchListener jZu;
  private boolean mSp;
  private OverScroller mSq;
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
  private g yye;
  private WxImageView yyf;
  private MMViewPager.k yyg;
  private boolean yyh;
  private boolean yyi;
  private boolean yyj;
  private boolean yyk;
  private boolean yyl;
  private int yym;
  private MMViewPager.a yyn;
  private MMViewPager.e yyo;
  private c yyp;
  private ViewPager.OnPageChangeListener yyq;
  private float yyr;
  private float yys;
  private float yyt;
  private VelocityTracker yyu;
  private MotionEvent yyv;
  private long yyw;
  private MMViewPager.b yyx;
  private GestureDetector.SimpleOnGestureListener yyy;
  private View.OnLongClickListener yyz;

  public MMViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106924);
    this.alh = -1;
    this.aaF = -1;
    this.mSp = false;
    this.yyh = false;
    this.yyi = false;
    this.yyj = false;
    this.yyk = false;
    this.yyl = false;
    this.mSv = false;
    this.mSw = false;
    this.mSx = false;
    this.mSy = false;
    this.mSs = new RectF();
    this.yym = 0;
    this.handler = new ak(Looper.getMainLooper());
    this.yyq = null;
    this.yyr = 0.0F;
    this.yyu = null;
    this.yyw = 0L;
    this.aKM = 0.0F;
    this.aKN = 0.0F;
    this.rvb = false;
    this.rvc = false;
    this.rvd = false;
    this.yyy = new MMViewPager.d(this, (byte)0);
    this.yyz = new MMViewPager.3(this);
    this.yyA = 60;
    this.yyB = 500;
    setStaticTransformationsEnabled(true);
    this.yyg = new MMViewPager.k(new WeakReference(this));
    this.iay = new GestureDetector(paramContext, new MMViewPager.d(this, (byte)0));
    this.mSq = new OverScroller(paramContext, new DecelerateInterpolator(2.0F));
    this.yym = ((int)(getResources().getDisplayMetrics().density * 3000.0F));
    super.setOnPageChangeListener(new MMViewPager.1(this));
    super.setOnTouchListener(new MMViewPager.2(this));
    AppMethodBeat.o(106924);
  }

  public MMViewPager(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106921);
    this.alh = -1;
    this.aaF = -1;
    this.mSp = false;
    this.yyh = false;
    this.yyi = false;
    this.yyj = false;
    this.yyk = false;
    this.yyl = false;
    this.mSv = false;
    this.mSw = false;
    this.mSx = false;
    this.mSy = false;
    this.mSs = new RectF();
    this.yym = 0;
    this.handler = new ak(Looper.getMainLooper());
    this.yyq = null;
    this.yyr = 0.0F;
    this.yyu = null;
    this.yyw = 0L;
    this.aKM = 0.0F;
    this.aKN = 0.0F;
    this.rvb = false;
    this.rvc = false;
    this.rvd = false;
    this.yyy = new MMViewPager.d(this, (byte)0);
    this.yyz = new MMViewPager.3(this);
    this.yyA = 60;
    this.yyB = 500;
    setStaticTransformationsEnabled(true);
    AppMethodBeat.o(106921);
  }

  private boolean a(float paramFloat1, float paramFloat2, View paramView, float paramFloat3)
  {
    boolean bool = true;
    AppMethodBeat.i(106933);
    if (b(paramFloat2, paramView, paramFloat3))
      AppMethodBeat.o(106933);
    while (true)
    {
      return bool;
      if (a(paramFloat1, paramView, paramFloat3))
      {
        AppMethodBeat.o(106933);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(106933);
      }
    }
  }

  private boolean a(float paramFloat1, View paramView, float paramFloat2)
  {
    AppMethodBeat.i(106931);
    boolean bool;
    if (getAdapter().getItemPosition(paramView) == firstItemPosForDetermine())
      if ((this.yye instanceof WxImageView))
      {
        paramFloat1 = ((WxImageView)this.yye).getTranslationX();
        paramFloat2 *= 0.3F;
        ab.d("MicroMsg.MMViewPager", "alvinluo scrollFirst current is WxImageView, distanceX: %f, translateLeft: %f", new Object[] { Float.valueOf(paramFloat2), Float.valueOf(paramFloat1) });
        if ((paramFloat2 < 0.0F) && (paramFloat1 - paramFloat2 > 0.0F))
          this.yyk = true;
        if (this.yyk)
        {
          ((WxImageView)this.yye).translate(-paramFloat2, 0.0F);
          AppMethodBeat.o(106931);
          bool = true;
        }
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(106931);
      bool = false;
      continue;
      if (this.yyk)
      {
        if (paramFloat2 < 0.0F)
        {
          if (paramFloat1 > this.mSs.left)
            break label187;
          this.yye.aj(-paramFloat2, 0.0F);
        }
        label187: 
        while ((paramFloat1 <= this.mSs.left) || (paramFloat1 >= this.ieu * 0.3F))
        {
          AppMethodBeat.o(106931);
          bool = false;
          break;
        }
        this.yye.aj(-(paramFloat2 * 0.3F), 0.0F);
        AppMethodBeat.o(106931);
        bool = true;
      }
      else
      {
        if (paramFloat2 < 0.0F)
        {
          if (paramFloat1 > 0.0F)
            this.yyk = true;
          if (paramFloat1 > this.mSs.left)
            break label308;
          this.yye.aj(-paramFloat2, 0.0F);
        }
        while (true)
          if ((this.yyj) || (this.yyi))
          {
            AppMethodBeat.o(106931);
            bool = false;
            break;
            label308: if ((paramFloat1 > this.mSs.left) && (paramFloat1 < this.ieu * 0.3F))
            {
              this.yye.aj(-(paramFloat2 * 0.3F), 0.0F);
              AppMethodBeat.o(106931);
              bool = true;
              break;
            }
          }
        this.yyk = false;
        AppMethodBeat.o(106931);
        bool = false;
      }
    }
  }

  private boolean b(float paramFloat1, View paramView, float paramFloat2)
  {
    AppMethodBeat.i(106932);
    boolean bool;
    if (getAdapter().getItemPosition(paramView) == lastItemPosForDetermine())
      if ((this.yye instanceof WxImageView))
      {
        paramFloat1 = ((WxImageView)this.yye).getTranslationX();
        paramFloat2 *= 0.3F;
        ab.d("MicroMsg.MMViewPager", "alvinluo scrollLast current is WxImageView, distanceX: %f, translateRight: %f", new Object[] { Float.valueOf(paramFloat2), Float.valueOf(paramFloat1) });
        if ((paramFloat2 > 0.0F) && (paramFloat1 - paramFloat2 < 0.0F))
          this.yyl = true;
        if (this.yyl)
        {
          ((WxImageView)this.yye).translate(-paramFloat2, 0.0F);
          AppMethodBeat.o(106932);
          bool = true;
        }
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(106932);
      bool = false;
      continue;
      if (this.yyl)
      {
        if (paramFloat2 > 0.0F)
        {
          if (paramFloat1 < this.ieu)
            break label185;
          this.yye.aj(-paramFloat2, 0.0F);
        }
        label185: 
        while ((paramFloat1 <= this.ieu * 0.7F) || (paramFloat1 >= this.iev))
        {
          AppMethodBeat.o(106932);
          bool = false;
          break;
        }
        this.yye.aj(-(paramFloat2 * 0.3F), 0.0F);
        AppMethodBeat.o(106932);
        bool = true;
      }
      else
      {
        if (paramFloat2 > 0.0F)
        {
          if (paramFloat1 < this.ieu)
            this.yyl = true;
          if (paramFloat1 < this.ieu)
            break label306;
          this.yye.aj(-paramFloat2, 0.0F);
        }
        while (true)
          if ((this.yyj) || (this.yyi))
          {
            AppMethodBeat.o(106932);
            bool = false;
            break;
            label306: if ((paramFloat1 > this.ieu * 0.7F) && (paramFloat1 < this.iev))
            {
              this.yye.aj(-(paramFloat2 * 0.3F), 0.0F);
              AppMethodBeat.o(106932);
              bool = true;
              break;
            }
          }
        this.yyl = false;
        AppMethodBeat.o(106932);
        bool = false;
      }
    }
  }

  private static boolean b(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2)
  {
    boolean bool = false;
    AppMethodBeat.i(106940);
    if ((paramMotionEvent1 == null) || (paramMotionEvent2 == null))
      AppMethodBeat.o(106940);
    while (true)
    {
      return bool;
      if (paramMotionEvent1.getX() - paramMotionEvent2.getX() < 0.0F)
      {
        bool = true;
        AppMethodBeat.o(106940);
      }
      else
      {
        AppMethodBeat.o(106940);
      }
    }
  }

  private void bCP()
  {
    AppMethodBeat.i(106922);
    this.yyg.removeMessages(1);
    AppMethodBeat.o(106922);
  }

  private void bCQ()
  {
    AppMethodBeat.i(106923);
    bCP();
    MMViewPager.k localk = this.yyg;
    localk.mSL = 15L;
    localk.sendEmptyMessageDelayed(1, 15L);
    AppMethodBeat.o(106923);
  }

  private void dAi()
  {
    AppMethodBeat.i(106925);
    this.yyf = getSelectedWxImageView();
    if (this.yyf != null)
    {
      ab.d("MicroMsg.MMViewPager", "alvinluo ViewPager initWxImageView");
      this.yyf.setGestureDetectorListener(this.yyy);
      this.yyf.setOnLongClickListener(this.yyz);
      this.yyf.dzA();
    }
    AppMethodBeat.o(106925);
  }

  private boolean dAj()
  {
    AppMethodBeat.i(106926);
    g localg = getSelectedImageView();
    boolean bool;
    if ((localg != null) && ((localg instanceof WxImageView)))
    {
      bool = true;
      AppMethodBeat.o(106926);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106926);
    }
  }

  private boolean dAk()
  {
    boolean bool = true;
    AppMethodBeat.i(106930);
    ab.d("MicroMsg.MMViewPager", "dancy scroll left right !!");
    if (this.yyi)
      AppMethodBeat.o(106930);
    while (true)
    {
      return bool;
      this.yyj = true;
      bool = false;
      AppMethodBeat.o(106930);
    }
  }

  private int getCurrentX()
  {
    AppMethodBeat.i(106939);
    int i;
    if (getAdapter() == null)
    {
      i = -1;
      AppMethodBeat.o(106939);
    }
    while (true)
    {
      return i;
      i = getScrollX() - this.ieu * (getAdapter().getCount() - getCurrentItem() - 1);
      AppMethodBeat.o(106939);
    }
  }

  private MultiTouchImageView getSelectedMultiTouchImageView()
  {
    AppMethodBeat.i(106936);
    int i = getCurrentItem();
    MultiTouchImageView localMultiTouchImageView = ((u)getAdapter()).wx(i);
    AppMethodBeat.o(106936);
    return localMultiTouchImageView;
  }

  private View getSelectedView()
  {
    AppMethodBeat.i(106934);
    int i = getCurrentItem();
    View localView = ((u)getAdapter()).Fp(i);
    AppMethodBeat.o(106934);
    return localView;
  }

  private WxImageView getSelectedWxImageView()
  {
    AppMethodBeat.i(106937);
    int i = getCurrentItem();
    WxImageView localWxImageView = ((u)getAdapter()).wy(i);
    if (localWxImageView != null)
    {
      localWxImageView = (WxImageView)localWxImageView;
      AppMethodBeat.o(106937);
    }
    while (true)
    {
      return localWxImageView;
      localWxImageView = null;
      AppMethodBeat.o(106937);
    }
  }

  public void computeScroll()
  {
    int i = 0;
    AppMethodBeat.i(106941);
    super.computeScroll();
    if (this.yye == null)
    {
      AppMethodBeat.o(106941);
      return;
    }
    float f1 = this.yye.getScale();
    float f2 = this.yye.getImageWidth();
    float f3 = this.yye.getScale() * this.yye.getImageHeight();
    int j;
    int m;
    int n;
    if (this.mSq.computeScrollOffset())
    {
      j = this.mSq.getCurrX() - this.apF;
      int k = this.mSq.getCurrY() - this.apG;
      this.apF = this.mSq.getCurrX();
      this.apG = this.mSq.getCurrY();
      float[] arrayOfFloat = new float[9];
      this.yye.getImageMatrix().getValues(arrayOfFloat);
      float f4 = arrayOfFloat[2];
      float f5 = f1 * f2 + f4;
      f2 = arrayOfFloat[5];
      f1 = f2 + f3;
      m = j;
      if (j < 0)
      {
        m = j;
        if (j < this.mSs.right - Math.round(f5))
          m = (int)(this.mSs.right - Math.round(f5));
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
        if (n > this.mSs.top - Math.round(f2))
          m = (int)(this.mSs.top - Math.round(f2));
      }
      if ((Math.round(f4) < this.mSs.left) && (Math.round(f5) > this.mSs.right))
        break label452;
      n = 0;
      label410: if (f3 >= this.iev)
        break label498;
      m = i;
    }
    label452: label498: 
    while (true)
    {
      this.yye.aj(n, m);
      postInvalidate();
      AppMethodBeat.o(106941);
      break;
      if (Math.round(f2) < this.mSs.top)
      {
        n = j;
        if (Math.round(f1) > this.mSs.bottom)
          break label410;
      }
      m = 0;
      n = j;
      break label410;
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    AppMethodBeat.i(106927);
    try
    {
      ab.d("MicroMsg.MMViewPager", "alvinluo dispatchTouchEvent action: %s", new Object[] { Integer.valueOf(paramMotionEvent.getAction()) });
      if (this.yyf == null)
        dAi();
      boolean bool2 = super.dispatchTouchEvent(paramMotionEvent);
      bool1 = bool2;
      AppMethodBeat.o(106927);
      return bool1;
    }
    catch (Exception paramMotionEvent)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMViewPager", paramMotionEvent, "alvinluo MMViewPager dispatchTouchEvent exception", new Object[0]);
        AppMethodBeat.o(106927);
      }
    }
  }

  public int firstItemPosForDetermine()
  {
    AppMethodBeat.i(106944);
    int i = ((u)getAdapter()).firstItemPosForDetermine();
    if (i >= 0)
      AppMethodBeat.o(106944);
    while (true)
    {
      return i;
      i = super.firstItemPosForDetermine();
      AppMethodBeat.o(106944);
    }
  }

  public int getScreenWidth()
  {
    return this.ieu;
  }

  public g getSelectedImageView()
  {
    AppMethodBeat.i(106935);
    Object localObject = getSelectedMultiTouchImageView();
    if (localObject != null)
      AppMethodBeat.o(106935);
    while (true)
    {
      return localObject;
      localObject = getSelectedWxImageView();
      AppMethodBeat.o(106935);
    }
  }

  public boolean isFocused()
  {
    return true;
  }

  public int lastItemPosForDetermine()
  {
    AppMethodBeat.i(106945);
    int i = ((u)getAdapter()).lastItemPosForDetermine();
    if (i >= 0)
      AppMethodBeat.o(106945);
    while (true)
    {
      return i;
      i = super.lastItemPosForDetermine();
      AppMethodBeat.o(106945);
    }
  }

  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    AppMethodBeat.i(106942);
    if (paramBoolean)
      super.onFocusChanged(paramBoolean, paramInt, paramRect);
    AppMethodBeat.o(106942);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106928);
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    if (!dAj())
      AppMethodBeat.o(106928);
    while (true)
    {
      return bool;
      if (!bool)
        break;
      AppMethodBeat.o(106928);
    }
    if (this.yyu == null)
      this.yyu = VelocityTracker.obtain();
    this.yyu.addMovement(paramMotionEvent);
    VelocityTracker localVelocityTracker = this.yyu;
    localVelocityTracker.computeCurrentVelocity(1000);
    int i = (int)localVelocityTracker.getXVelocity();
    int j = (int)localVelocityTracker.getYVelocity();
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default:
      bool = false;
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      if (bool)
      {
        this.aKM = paramMotionEvent.getRawX();
        this.aKN = paramMotionEvent.getRawY();
        this.mSu = this.yyf.getScale();
      }
      AppMethodBeat.o(106928);
      break;
      this.yys = paramMotionEvent.getRawX();
      this.yyt = paramMotionEvent.getRawY();
      bool = false;
      continue;
      float f = paramMotionEvent.getRawX() - this.yys;
      ab.d("MicroMsg.MMViewPager", "alvinluo ViewPager onInterceptTouchEvent action_move tx: %f, ty: %f, velocityX: %d, velocityY: %d", new Object[] { Float.valueOf(f), Float.valueOf(paramMotionEvent.getRawY() - this.yyt), Integer.valueOf(i), Integer.valueOf(j) });
      if ((Math.abs(f) <= 250.0F) && (Math.abs(j) > Math.abs(i)) && (Math.abs(j) > 0))
      {
        ab.i("MicroMsg.MMViewPager", "alvinluo ViewPager onInterceptTouchEvent action: %d", new Object[] { Integer.valueOf(paramMotionEvent.getAction()) });
        bool = true;
      }
      else
      {
        bool = false;
        continue;
        bool = false;
      }
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106929);
    super.onMeasure(paramInt1, paramInt2);
    this.ieu = View.MeasureSpec.getSize(paramInt1);
    this.iev = View.MeasureSpec.getSize(paramInt2);
    this.mSs.set(0.0F, 0.0F, this.ieu, this.iev);
    AppMethodBeat.o(106929);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    AppMethodBeat.i(106943);
    if (paramBoolean)
      super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.o(106943);
  }

  public void setAdapter(p paramp)
  {
    AppMethodBeat.i(106938);
    if ((paramp instanceof u))
    {
      super.setAdapter(paramp);
      AppMethodBeat.o(106938);
      return;
    }
    paramp = new IllegalArgumentException("must be MMViewPagerAdapter");
    AppMethodBeat.o(106938);
    throw paramp;
  }

  public void setGalleryScaleListener(MMViewPager.b paramb)
  {
    this.yyx = paramb;
  }

  public void setLongClickOverListener(c paramc)
  {
    this.yyp = paramc;
  }

  public void setOnPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    this.yyq = paramOnPageChangeListener;
  }

  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    this.jZu = paramOnTouchListener;
  }

  public void setSingleClickOverListener(MMViewPager.e parame)
  {
    this.yyo = parame;
  }

  public static abstract interface c
  {
    public abstract void bvE();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager
 * JD-Core Version:    0.6.2
 */