package com.tencent.mm.plugin.luggage.natives.component.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class LuPagerView extends ViewPager
{
  private static final String TAG = "LuPagerView";
  private int mOrientation;

  public LuPagerView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(116893);
    this.mOrientation = 0;
    init();
    AppMethodBeat.o(116893);
  }

  public LuPagerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(116894);
    this.mOrientation = 0;
    init();
    AppMethodBeat.o(116894);
  }

  private MotionEvent swapXY(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(116897);
    if (this.mOrientation == 1)
    {
      float f1 = getWidth();
      float f2 = getHeight();
      paramMotionEvent.setLocation(f2 * (paramMotionEvent.getY() / f2), f1 * (paramMotionEvent.getX() / f1));
    }
    AppMethodBeat.o(116897);
    return paramMotionEvent;
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(116899);
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    AppMethodBeat.o(116899);
    return bool;
  }

  public void init()
  {
    AppMethodBeat.i(116895);
    setOverScrollMode(2);
    AppMethodBeat.o(116895);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(116898);
    boolean bool = super.onInterceptTouchEvent(swapXY(paramMotionEvent));
    swapXY(paramMotionEvent);
    AppMethodBeat.o(116898);
    return bool;
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116901);
    paramInt2 = 0;
    int k;
    for (int i = 0; paramInt2 < getChildCount(); i = k)
    {
      View localView = getChildAt(paramInt2);
      localView.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, 0));
      int j = localView.getMeasuredHeight();
      k = i;
      if (j > i)
        k = j;
      paramInt2++;
    }
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(i, 1073741824));
    AppMethodBeat.o(116901);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(116900);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      boolean bool = super.onTouchEvent(swapXY(paramMotionEvent));
      AppMethodBeat.o(116900);
      return bool;
      getParent().requestDisallowInterceptTouchEvent(true);
      continue;
      getParent().requestDisallowInterceptTouchEvent(false);
    }
  }

  public void setPageOrientation(int paramInt)
  {
    AppMethodBeat.i(116896);
    this.mOrientation = paramInt;
    if (this.mOrientation == 1)
    {
      setPageTransformer(true, new LuPagerView.b(this, (byte)0));
      AppMethodBeat.o(116896);
    }
    while (true)
    {
      return;
      setPageTransformer(true, new LuPagerView.a(this, (byte)0));
      AppMethodBeat.o(116896);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luggage.natives.component.widget.LuPagerView
 * JD-Core Version:    0.6.2
 */