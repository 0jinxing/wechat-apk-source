package com.tencent.mm.plugin.topstory.ui.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class TopStoryViewPager extends ViewPager
{
  private boolean canScroll = true;

  public TopStoryViewPager(Context paramContext)
  {
    super(paramContext);
  }

  public TopStoryViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(2269);
    boolean bool;
    if (!this.canScroll)
    {
      bool = false;
      AppMethodBeat.o(2269);
    }
    while (true)
    {
      return bool;
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(2269);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(2268);
    boolean bool;
    if (!this.canScroll)
    {
      bool = false;
      AppMethodBeat.o(2268);
    }
    while (true)
    {
      return bool;
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(2268);
    }
  }

  public void setScrollEnable(boolean paramBoolean)
  {
    this.canScroll = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.TopStoryViewPager
 * JD-Core Version:    0.6.2
 */