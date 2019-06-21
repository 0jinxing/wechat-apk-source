package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;

public abstract class DragRecyclerView extends RecyclerView
  implements GestureDetector.OnGestureListener
{
  private boolean iYA = false;
  DragFeatureView iYz;
  private GestureDetector iay;

  public DragRecyclerView(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }

  public DragRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }

  public DragRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }

  private void init(Context paramContext)
  {
    this.iay = new GestureDetector(paramContext, this);
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    this.iay.onTouchEvent(paramMotionEvent);
    if (this.iYA)
    {
      if (this.iYz != null)
        this.iYz.onTouch(this, paramMotionEvent);
      int i = paramMotionEvent.getAction();
      paramMotionEvent.setAction(3);
      for (int j = 0; j < getChildCount(); j++)
        getChildAt(j).dispatchTouchEvent(paramMotionEvent);
      paramMotionEvent.setAction(i);
    }
    if ((paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 1))
      this.iYA = false;
    if ((this.iYA) || (super.dispatchTouchEvent(paramMotionEvent)))
      bool = true;
    return bool;
  }

  public DragFeatureView getDragRubbishView()
  {
    return this.iYz;
  }

  public final void h(DragFeatureView paramDragFeatureView)
  {
    this.iYz = paramDragFeatureView;
  }

  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void onLongPress(MotionEvent paramMotionEvent)
  {
    if (this.iYz != null)
    {
      this.iYz.onLongPress(paramMotionEvent);
      if (this.iYz.getVisibility() != 0)
        break label33;
    }
    label33: for (boolean bool = true; ; bool = false)
    {
      this.iYA = bool;
      return;
    }
  }

  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void onShowPress(MotionEvent paramMotionEvent)
  {
  }

  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.DragRecyclerView
 * JD-Core Version:    0.6.2
 */