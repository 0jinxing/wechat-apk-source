package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarSpecialSmoothScrollView;", "Landroid/widget/ScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isLayoutChanged", "", "()Z", "isOverScroll", "mLastMotionY", "", "mRect", "Landroid/graphics/Rect;", "mRootChildView", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;", "mScrollInterpolator", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialSmoothScrollView$WorkspaceOvershootInterpolator;", "mTranslateAnimation", "Landroid/view/animation/TranslateAnimation;", "onFinishInflate", "", "onTouchEvent", "ev", "Landroid/view/MotionEvent;", "scaleOverScroll", "", "offset", "startAnimation", "WorkspaceOvershootInterpolator", "plugin-radar_release"})
public class RadarSpecialSmoothScrollView extends ScrollView
{
  private float mLastMotionY;
  private final Rect mRect;
  private RadarSpecialTableLayout pCL;
  private TranslateAnimation pCM;
  private final RadarSpecialSmoothScrollView.a pCN;

  public RadarSpecialSmoothScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(103011);
    this.mRect = new Rect();
    this.pCN = new RadarSpecialSmoothScrollView.a();
    AppMethodBeat.o(103011);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(103009);
    if (getChildCount() > 0)
    {
      View localView1 = getChildAt(0);
      View localView2 = localView1;
      if (!(localView1 instanceof RadarSpecialTableLayout))
        localView2 = null;
      this.pCL = ((RadarSpecialTableLayout)localView2);
    }
    AppMethodBeat.o(103009);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    int j = 1;
    AppMethodBeat.i(103010);
    j.p(paramMotionEvent, "ev");
    boolean bool;
    if (this.pCL == null)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(103010);
      return bool;
    }
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    label665: 
    while (true)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(103010);
      break;
      this.mLastMotionY = paramMotionEvent.getY();
      continue;
      float f = paramMotionEvent.getY();
      if (this.mLastMotionY == 0.0F)
        this.mLastMotionY = f;
      Object localObject1 = this.pCL;
      if (localObject1 == null)
        j.dWJ();
      int k = ((RadarSpecialTableLayout)localObject1).getMeasuredHeight();
      int m = getHeight();
      int n = getScrollY();
      i = j;
      label167: Object localObject2;
      if (n != 0)
      {
        if (n == k - m)
          i = j;
      }
      else
      {
        if (i == 0)
          break label424;
        i = (int)(this.mLastMotionY - f);
        scrollBy(0, i);
        if (this.mRect.isEmpty())
        {
          localObject1 = this.mRect;
          localObject2 = this.pCL;
          if (localObject2 == null)
            j.dWJ();
          k = ((RadarSpecialTableLayout)localObject2).getLeft();
          localObject2 = this.pCL;
          if (localObject2 == null)
            j.dWJ();
          j = ((RadarSpecialTableLayout)localObject2).getTop();
          localObject2 = this.pCL;
          if (localObject2 == null)
            j.dWJ();
          n = ((RadarSpecialTableLayout)localObject2).getRight();
          localObject2 = this.pCL;
          if (localObject2 == null)
            j.dWJ();
          ((Rect)localObject1).set(k, j, n, ((RadarSpecialTableLayout)localObject2).getBottom());
        }
        localObject1 = this.pCL;
        if (localObject1 == null)
          j.dWJ();
        localObject2 = this.pCL;
        if (localObject2 == null)
          j.dWJ();
        n = ((RadarSpecialTableLayout)localObject2).getLeft();
        localObject2 = this.pCL;
        if (localObject2 == null)
          j.dWJ();
        k = ((RadarSpecialTableLayout)localObject2).getTop();
        j = i / 2;
        localObject2 = this.pCL;
        if (localObject2 == null)
          j.dWJ();
        m = ((RadarSpecialTableLayout)localObject2).getRight();
        localObject2 = this.pCL;
        if (localObject2 == null)
          j.dWJ();
        ((RadarSpecialTableLayout)localObject1).D(n, k - j, m, ((RadarSpecialTableLayout)localObject2).getBottom() - i / 2);
      }
      while (true)
      {
        this.mLastMotionY = f;
        break;
        i = 0;
        break label167;
        label424: scrollBy(0, (int)(this.mLastMotionY - f) / 2);
      }
      this.mLastMotionY = 0.0F;
      if (!this.mRect.isEmpty());
      while (true)
      {
        if (i == 0)
          break label665;
        localObject1 = this.pCL;
        if (localObject1 == null)
          j.dWJ();
        this.pCM = new TranslateAnimation(0.0F, 0.0F, ((RadarSpecialTableLayout)localObject1).getTop() - this.mRect.top, 0.0F);
        localObject1 = this.pCM;
        if (localObject1 == null)
          j.dWJ();
        ((TranslateAnimation)localObject1).setInterpolator((Interpolator)this.pCN);
        localObject2 = this.pCM;
        if (localObject2 == null)
          j.dWJ();
        localObject1 = this.pCL;
        if (localObject1 == null)
          j.dWJ();
        ((TranslateAnimation)localObject2).setDuration(Math.abs(((RadarSpecialTableLayout)localObject1).getTop() - this.mRect.top));
        localObject1 = this.pCL;
        if (localObject1 == null)
          j.dWJ();
        ((RadarSpecialTableLayout)localObject1).startAnimation((Animation)this.pCM);
        localObject1 = this.pCL;
        if (localObject1 == null)
          j.dWJ();
        ((RadarSpecialTableLayout)localObject1).D(this.mRect.left, this.mRect.top, this.mRect.right, this.mRect.bottom);
        this.mRect.setEmpty();
        break;
        i = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarSpecialSmoothScrollView
 * JD-Core Version:    0.6.2
 */