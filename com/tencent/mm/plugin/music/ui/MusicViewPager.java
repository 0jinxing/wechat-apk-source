package com.tencent.mm.plugin.music.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.CustomViewPager;

public class MusicViewPager extends CustomViewPager
{
  private GestureDetector lCs;

  public MusicViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(105142);
    this.lCs = new GestureDetector(getContext(), new MusicViewPager.b(this, (byte)0));
    setScroller(new MusicViewPager.a(this, getContext()));
    AppMethodBeat.o(105142);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(105143);
    boolean bool;
    if ((super.onInterceptTouchEvent(paramMotionEvent)) && (this.lCs.onTouchEvent(paramMotionEvent)))
    {
      bool = true;
      AppMethodBeat.o(105143);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(105143);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicViewPager
 * JD-Core Version:    0.6.2
 */