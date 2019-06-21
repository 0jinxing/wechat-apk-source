package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.mogic.WxViewPager;

public class CustomViewPager extends WxViewPager
{
  private static final String TAG = "MicroMsg.CustomViewPager";
  private boolean mCanSlide = true;
  private boolean mCanSlideBySide = true;

  public CustomViewPager(Context paramContext)
  {
    super(paramContext);
  }

  public CustomViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public boolean isGutterDrag(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(106259);
    boolean bool;
    if (this.mCanSlideBySide)
    {
      bool = super.isGutterDrag(paramFloat1, paramFloat2);
      AppMethodBeat.o(106259);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106259);
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    AppMethodBeat.i(106260);
    if (!this.mCanSlide)
      AppMethodBeat.o(106260);
    while (true)
    {
      return bool1;
      try
      {
        boolean bool2 = super.onInterceptTouchEvent(paramMotionEvent);
        bool1 = bool2;
        AppMethodBeat.o(106260);
      }
      catch (Exception paramMotionEvent)
      {
        ab.printErrStackTrace("MicroMsg.CustomViewPager", paramMotionEvent, "get a Exception", new Object[0]);
        AppMethodBeat.o(106260);
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    AppMethodBeat.i(106261);
    if (!this.mCanSlide)
      AppMethodBeat.o(106261);
    while (true)
    {
      return bool1;
      try
      {
        boolean bool2 = super.onTouchEvent(paramMotionEvent);
        bool1 = bool2;
        AppMethodBeat.o(106261);
      }
      catch (Exception paramMotionEvent)
      {
        ab.printErrStackTrace("MicroMsg.CustomViewPager", paramMotionEvent, "get a Exception", new Object[0]);
        AppMethodBeat.o(106261);
      }
    }
  }

  public void setCanSlide(boolean paramBoolean)
  {
    this.mCanSlide = paramBoolean;
  }

  public void setCanSlideBySide(boolean paramBoolean)
  {
    this.mCanSlideBySide = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.CustomViewPager
 * JD-Core Version:    0.6.2
 */