package com.tencent.mm.plugin.music.ui;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MusicViewPager$b extends GestureDetector.SimpleOnGestureListener
{
  private MusicViewPager$b(MusicViewPager paramMusicViewPager)
  {
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(105141);
    boolean bool;
    if (Math.abs(paramFloat2) < Math.abs(paramFloat1))
    {
      bool = true;
      AppMethodBeat.o(105141);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(105141);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicViewPager.b
 * JD-Core Version:    0.6.2
 */