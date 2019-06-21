package com.tencent.mm.plugin.appbrand.ui.recents;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView.f;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;

class RecentsRecyclerView extends LoadMoreRecyclerView
{
  private View iPn;

  public RecentsRecyclerView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(133544);
    setChildrenDrawingOrderEnabled(true);
    AppMethodBeat.o(133544);
  }

  public RecentsRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(133545);
    setChildrenDrawingOrderEnabled(true);
    AppMethodBeat.o(133545);
  }

  public RecentsRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(133546);
    setChildrenDrawingOrderEnabled(true);
    AppMethodBeat.o(133546);
  }

  final void cy(View paramView)
  {
    AppMethodBeat.i(133551);
    if (paramView.getParent() != this)
      AppMethodBeat.o(133551);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramView.setZ(1.0F);
        AppMethodBeat.o(133551);
      }
      else
      {
        this.iPn = paramView;
        AppMethodBeat.o(133551);
      }
    }
  }

  final void cz(View paramView)
  {
    AppMethodBeat.i(133552);
    if (paramView.getParent() != this)
      AppMethodBeat.o(133552);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramView.setZ(0.0F);
        AppMethodBeat.o(133552);
      }
      else
      {
        if (this.iPn == paramView)
          this.iPn = null;
        AppMethodBeat.o(133552);
      }
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(133549);
    boolean bool;
    if ((getItemAnimator() != null) && (getItemAnimator().isRunning()))
    {
      bool = false;
      AppMethodBeat.o(133549);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(133549);
    }
  }

  public int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(133547);
    if (this.iPn == null)
    {
      paramInt1 = super.getChildDrawingOrder(paramInt1, paramInt2);
      AppMethodBeat.o(133547);
    }
    while (true)
    {
      return paramInt1;
      int i = indexOfChild(this.iPn);
      if (i < 0)
      {
        paramInt1 = super.getChildDrawingOrder(paramInt1, paramInt2);
        AppMethodBeat.o(133547);
      }
      else if (paramInt2 == paramInt1 - 1)
      {
        AppMethodBeat.o(133547);
        paramInt1 = i;
      }
      else if (paramInt2 == i)
      {
        paramInt1--;
        AppMethodBeat.o(133547);
      }
      else
      {
        paramInt1 = super.getChildDrawingOrder(paramInt1, paramInt2);
        AppMethodBeat.o(133547);
      }
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(133548);
    boolean bool;
    if ((getItemAnimator() != null) && (getItemAnimator().isRunning()))
    {
      bool = false;
      AppMethodBeat.o(133548);
    }
    while (true)
    {
      return bool;
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(133548);
    }
  }

  @SuppressLint({"ClickableViewAccessibility"})
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(133550);
    boolean bool;
    if ((getItemAnimator() != null) && (getItemAnimator().isRunning()))
    {
      bool = false;
      AppMethodBeat.o(133550);
    }
    while (true)
    {
      return bool;
      try
      {
        bool = super.onTouchEvent(paramMotionEvent);
        AppMethodBeat.o(133550);
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
        paramMotionEvent.setAction(3);
        bool = super.onTouchEvent(paramMotionEvent);
        AppMethodBeat.o(133550);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.RecentsRecyclerView
 * JD-Core Version:    0.6.2
 */