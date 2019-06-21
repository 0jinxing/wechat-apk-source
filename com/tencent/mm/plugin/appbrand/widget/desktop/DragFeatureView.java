package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.os.Vibrator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.v;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.appbrand.widget.desktop.a.c;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class DragFeatureView extends FrameLayout
  implements GestureDetector.OnGestureListener, View.OnTouchListener
{
  private RecyclerView aiB;
  private boolean canScroll = true;
  private Rect ckf = new Rect();
  private Vibrator iVt;
  private boolean iWH = false;
  protected int iYi;
  private Runnable iYj;
  private c iYk;
  private RecyclerView.v iYl;
  int iYm = -1;
  private View iYn;
  protected Rect iYo = new Rect();
  protected Rect iYp = new Rect();
  private boolean iYq = true;
  private LinearLayout iYr;
  private ImageView iYs;
  private TextView iYt;
  private g iYu = null;
  private Runnable iYv;
  private Animator.AnimatorListener iYw = new DragFeatureView.4(this);
  private GestureDetector iay;
  Paint mPaint = new Paint();
  protected Rect mRect = new Rect();

  public DragFeatureView(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }

  public DragFeatureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }

  public DragFeatureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }

  private boolean M(float paramFloat1, float paramFloat2)
  {
    if ((getRubbishRect().contains((int)paramFloat1, (int)paramFloat2)) || (getRubbishRect().top < (int)paramFloat2));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void aPu()
  {
    try
    {
      this.iYt.setText(2131296597);
      this.iYt.setTextSize(1, getRubbishViewTextSize());
      this.iYs.setImageResource(2130837722);
      this.iYr.setBackgroundColor(getContext().getResources().getColor(2131689695));
      label49: return;
    }
    catch (Exception localException)
    {
      break label49;
    }
  }

  private View aPv()
  {
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setOrientation(1);
    localLinearLayout.setGravity(17);
    localLinearLayout.setBackgroundColor(getContext().getResources().getColor(2131689695));
    Object localObject1 = new FrameLayout.LayoutParams(-1, this.iYi);
    ((FrameLayout.LayoutParams)localObject1).gravity = 80;
    localLinearLayout.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    localLinearLayout.setId(2131820661);
    localLinearLayout.setTranslationY(((FrameLayout.LayoutParams)localObject1).height);
    localObject1 = new ImageView(getContext());
    ((ImageView)localObject1).setImageResource(2130837722);
    ((ImageView)localObject1).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    Object localObject2 = new LinearLayout.LayoutParams(-2, -2);
    ab.i("MicroMsg.DragFeatureView", "alvinluo rubbishView icon size: %d,%d", new Object[] { Integer.valueOf(((ImageView)localObject1).getMeasuredWidth()), Integer.valueOf(((ImageView)localObject1).getMeasuredHeight()) });
    ((LinearLayout.LayoutParams)localObject2).width = ((int)(((ImageView)localObject1).getMeasuredWidth() * d.dm(getContext())));
    ((LinearLayout.LayoutParams)localObject2).height = ((int)(((ImageView)localObject1).getMeasuredHeight() * d.dm(getContext())));
    ((ImageView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
    localObject2 = new TextView(getContext());
    ((TextView)localObject2).setText(2131296597);
    ((TextView)localObject2).setTextSize(1, getRubbishViewTextSize());
    ((TextView)localObject2).setTextColor(getContext().getResources().getColor(2131690691));
    ((TextView)localObject2).setPadding(0, a.fromDPToPix(getContext(), 4), 0, 0);
    ((TextView)localObject2).setGravity(17);
    ((TextView)localObject2).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    localLinearLayout.addView((View)localObject1);
    localLinearLayout.addView((View)localObject2);
    this.iYr = localLinearLayout;
    this.iYs = ((ImageView)localObject1);
    this.iYt = ((TextView)localObject2);
    return localLinearLayout;
  }

  private void eV(final boolean paramBoolean)
  {
    if (this.iYv == null)
    {
      Runnable local2 = new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(133898);
          ab.i("MicroMsg.DragFeatureView", "alvinluo handleAttachEdge isTop: %b", new Object[] { Boolean.valueOf(paramBoolean) });
          RecyclerView localRecyclerView = DragFeatureView.this.getRecyclerView();
          if (paramBoolean)
          {
            i = -10;
            ab.i("MicroMsg.DragFeatureView", "alvinluo handleAttachEdge canScroll: %b", new Object[] { Boolean.valueOf(localRecyclerView.canScrollVertically(i)) });
            localRecyclerView = DragFeatureView.this.getRecyclerView();
            if (!paramBoolean)
              break label111;
          }
          label111: for (int i = -20; ; i = 20)
          {
            localRecyclerView.scrollBy(0, i);
            DragFeatureView.this.post(this);
            AppMethodBeat.o(133898);
            return;
            i = 10;
            break;
          }
        }
      };
      this.iYv = local2;
      postDelayed(local2, 250L);
    }
  }

  private float getRubbishViewTextSize()
  {
    return 12.0F * d.dm(getContext());
  }

  private void init(Context paramContext)
  {
    this.iYi = ((int)getResources().getDimension(2131428610));
    setVisibility(8);
    this.iay = new GestureDetector(paramContext, this);
    this.iVt = ((Vibrator)paramContext.getSystemService("vibrator"));
    addView(aPv());
  }

  private void setItemDragCallback(c paramc)
  {
    this.iYk = paramc;
  }

  protected abstract c N(RecyclerView.v paramv);

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    this.mPaint.setStyle(Paint.Style.FILL);
    this.mPaint.setColor(-65536);
    if (this.iYo != null)
      paramCanvas.drawRect(this.iYo, this.mPaint);
    this.mPaint.setColor(-16711936);
    if (this.iYp != null)
      paramCanvas.drawRect(this.iYp, this.mPaint);
  }

  protected RecyclerView.v e(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    RecyclerView.v localv;
    if (this.iYo.contains((int)paramFloat1, (int)paramFloat2))
      localv = null;
    while (true)
    {
      return localv;
      for (int i = 0; ; i++)
      {
        if (i >= getRecyclerView().getChildCount())
          break label89;
        localv = getRecyclerView().aZ(getRecyclerView().getChildAt(i));
        localv.apJ.getGlobalVisibleRect(this.mRect);
        if (this.mRect.contains((int)paramFloat1, (int)paramFloat2))
          break;
      }
      label89: if (this.iYp.contains((int)paramFloat1, (int)paramFloat2))
        localv = null;
      else
        localv = null;
    }
  }

  public final void ee(boolean paramBoolean)
  {
    ab.i("MicroMsg.DragFeatureView", "alvinluo enableScroll %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.canScroll = paramBoolean;
  }

  public Rect getBottomScrollRect()
  {
    return this.iYo;
  }

  public c getItemDragCallback()
  {
    return this.iYk;
  }

  public g getRecyclerScrollComputer()
  {
    return this.iYu;
  }

  public RecyclerView getRecyclerView()
  {
    return this.aiB;
  }

  public Rect getRubbishRect()
  {
    return this.ckf;
  }

  public Rect getTopScrollRect()
  {
    return this.iYp;
  }

  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    getGlobalVisibleRect(this.iYo);
    this.iYo.set(this.iYo.left, this.iYo.bottom - this.iYi * 2, this.iYo.right, this.iYo.bottom - this.iYi);
    getRecyclerView().getGlobalVisibleRect(this.iYp);
    this.iYp.set(this.iYp.left, 0, this.iYp.right, this.iYp.top + this.iYi);
    findViewById(2131820661).getGlobalVisibleRect(this.ckf);
  }

  public void onLongPress(MotionEvent paramMotionEvent)
  {
    try
    {
      RecyclerView.v localv = e(paramMotionEvent.getRawX(), paramMotionEvent.getRawY(), true);
      setItemDragCallback(N(localv));
      if (localv != null)
      {
        c localc = this.iYk;
        getRecyclerView();
        if (localc.O(localv))
        {
          this.iYn = this.iYk.d(getRecyclerView(), localv);
          this.iYm = localv.kj();
          this.iYl = localv;
          this.iVt.vibrate(30L);
          setRubbishViewVisible(0);
          setVisibility(0);
        }
      }
      while (true)
      {
        paramMotionEvent.setAction(0);
        this.iay.onTouchEvent(paramMotionEvent);
        paramMotionEvent.setAction(3);
        this.iay.onTouchEvent(paramMotionEvent);
        return;
        setVisibility(8);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.DragFeatureView", localException, "alvinluo onLongPress exception", new Object[0]);
        paramMotionEvent.setAction(0);
        this.iay.onTouchEvent(paramMotionEvent);
        paramMotionEvent.setAction(3);
        this.iay.onTouchEvent(paramMotionEvent);
      }
    }
  }

  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    boolean bool = false;
    if (getVisibility() == 8)
      return bool;
    float f1 = paramMotionEvent2.getRawX();
    float f2 = paramMotionEvent2.getRawY();
    getRecyclerView().getGlobalVisibleRect(this.mRect);
    int i;
    if (!this.mRect.contains((int)f1, (int)f2))
      if (f1 < this.mRect.left)
        i = 3;
    while (true)
    {
      paramMotionEvent1 = e(paramMotionEvent2.getRawX(), paramMotionEvent2.getRawY(), false);
      if (this.canScroll)
        break label281;
      paramMotionEvent2 = this.iYk;
      getRecyclerView();
      paramMotionEvent2.a(this.iYn, paramFloat1, paramFloat2, paramMotionEvent1, i);
      break;
      if (f1 > this.mRect.right)
      {
        i = 4;
      }
      else if (this.iYo.contains((int)f1, (int)f2))
      {
        i = 2;
      }
      else if (this.iYp.contains((int)f1, (int)f2))
      {
        i = 1;
      }
      else if (M(f1, f2))
      {
        i = 6;
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= getRecyclerView().getChildCount())
            break label274;
          getRecyclerView().aZ(getRecyclerView().getChildAt(i)).apJ.getGlobalVisibleRect(this.mRect);
          if (this.mRect.contains((int)f1, (int)f2))
          {
            i = 5;
            break;
          }
        }
        label274: i = 7;
      }
    }
    label281: if (paramMotionEvent1 == null)
    {
      bool = true;
      label288: ab.v("MicroMsg.DragFeatureView", "alvinluo onScroll currentArea: %d, viewHolder == null: %b, x: %f, y: %f", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool), Float.valueOf(paramMotionEvent2.getRawX()), Float.valueOf(paramMotionEvent2.getRawY()) });
      if ((i != 1) && (i != 2) && (i != 6))
        break label589;
      if (!getTopScrollRect().contains((int)paramMotionEvent2.getRawX(), (int)paramMotionEvent2.getRawY()))
        break label515;
      eV(true);
      label380: paramMotionEvent2 = this.iYk;
      getRecyclerView();
      paramMotionEvent2.a(this.iYn, paramFloat1, paramFloat2, paramMotionEvent1, i);
      if ((i != 1) && (i != 2))
      {
        removeCallbacks(this.iYv);
        this.iYv = null;
      }
      if ((Math.abs(paramFloat1) >= 3.0F) || (Math.abs(paramFloat2) >= 3.0F))
      {
        removeCallbacks(this.iYj);
        paramMotionEvent2 = this.iYk;
        getRecyclerView();
        if ((!paramMotionEvent2.P(paramMotionEvent1)) || (i == 2))
          break label637;
        this.iYk.m(getRecyclerView());
      }
    }
    while (true)
    {
      bool = true;
      break;
      bool = false;
      break label288;
      label515: if (getBottomScrollRect().contains((int)paramMotionEvent2.getRawX(), (int)paramMotionEvent2.getRawY()))
      {
        eV(false);
        break label380;
      }
      if (!getRubbishRect().contains((int)paramMotionEvent2.getRawX(), (int)paramMotionEvent2.getRawY()))
        break label380;
      removeCallbacks(this.iYj);
      removeCallbacks(this.iYv);
      this.iYv = null;
      break label380;
      label589: if ((i != 3) && (i != 4))
      {
        paramMotionEvent2 = this.iYk;
        getRecyclerView();
        if (!paramMotionEvent2.P(paramMotionEvent1))
          break label380;
      }
      this.iYk.m(getRecyclerView());
      break label380;
      label637: paramMotionEvent1 = new DragFeatureView.a(this, paramMotionEvent1);
      this.iYj = paramMotionEvent1;
      postDelayed(paramMotionEvent1, 250L);
    }
  }

  public void onShowPress(MotionEvent paramMotionEvent)
  {
  }

  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    if (!this.iYq)
      return bool;
    switch (paramMotionEvent.getAction())
    {
    default:
    case 1:
    case 3:
    case 2:
    }
    while (true)
    {
      this.iay.onTouchEvent(paramMotionEvent);
      bool = true;
      break;
      if (M(paramMotionEvent.getRawX(), paramMotionEvent.getRawY()))
      {
        this.iYm = -1;
        this.iWH = false;
        this.iYk.e(getRecyclerView(), this.iYl);
        removeCallbacks(this.iYj);
        removeCallbacks(this.iYv);
        if (this.iYn != null)
          this.iYn.animate().alpha(0.0F).scaleX(0.0F).scaleY(0.0F).setListener(new Animator.AnimatorListener()
          {
            public final void onAnimationCancel(Animator paramAnonymousAnimator)
            {
            }

            public final void onAnimationEnd(Animator paramAnonymousAnimator)
            {
              AppMethodBeat.i(133897);
              DragFeatureView.this.removeView(DragFeatureView.d(DragFeatureView.this));
              DragFeatureView.e(DragFeatureView.this);
              DragFeatureView.this.setRubbishViewVisible(8);
              AppMethodBeat.o(133897);
            }

            public final void onAnimationRepeat(Animator paramAnonymousAnimator)
            {
            }

            public final void onAnimationStart(Animator paramAnonymousAnimator)
            {
            }
          }).setDuration(300L).start();
      }
      else
      {
        removeCallbacks(this.iYj);
        removeCallbacks(this.iYv);
        setRubbishViewVisible(8);
        int i = this.iYm;
        this.iYm = -1;
        this.iWH = false;
        this.iYk.a(getRecyclerView(), this.iYl, i, new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(133899);
            DragFeatureView.this.setVisibility(8);
            DragFeatureView.f(DragFeatureView.this);
            DragFeatureView.g(DragFeatureView.this);
            AppMethodBeat.o(133899);
          }
        });
        continue;
        if (M(paramMotionEvent.getRawX(), paramMotionEvent.getRawY()))
        {
          this.iYr.setBackgroundColor(getContext().getResources().getColor(2131689696));
          this.iYt.setText(2131296602);
          this.iYt.setTextSize(2, getRubbishViewTextSize());
          this.iYs.setImageResource(2130837724);
        }
        else
        {
          aPu();
        }
      }
    }
  }

  public void setRecyclerView(RecyclerView paramRecyclerView)
  {
    this.aiB = paramRecyclerView;
  }

  public void setRecyclerViewScrollComputer(g paramg)
  {
    this.iYu = paramg;
  }

  protected void setRubbishViewVisible(int paramInt)
  {
    View localView = findViewById(2131820661);
    if (localView == null);
    while (true)
    {
      return;
      if (paramInt == 0)
        localView.animate().translationY(0.0F).setDuration(300L).setListener(this.iYw).start();
      else
        localView.animate().translationY(localView.getHeight()).setDuration(300L).setListener(this.iYw).start();
    }
  }

  public void setTouchEnabled(boolean paramBoolean)
  {
    this.iYq = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView
 * JD-Core Version:    0.6.2
 */