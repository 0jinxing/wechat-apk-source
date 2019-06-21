package com.tencent.mm.plugin.music.ui;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;

final class MusicItemLayout$a extends GestureDetector.SimpleOnGestureListener
{
  private MusicItemLayout$a(MusicItemLayout paramMusicItemLayout)
  {
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(105065);
    if (Math.abs(paramFloat2) > Math.abs(paramFloat1))
    {
      paramMotionEvent1 = (b.a)this.oOr.getTag();
      if (paramFloat2 <= 0.0F)
        break label47;
      paramMotionEvent1.bUO();
    }
    while (true)
    {
      AppMethodBeat.o(105065);
      return false;
      label47: paramMotionEvent1.bUN();
    }
  }

  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(105066);
    b.a locala = (b.a)this.oOr.getTag();
    if (locala.bUM())
      if ((paramMotionEvent.getY() <= locala.oOD.getMeasuredHeight()) && (paramMotionEvent.getY() > 100.0F))
        locala.bUP();
    while (true)
    {
      AppMethodBeat.o(105066);
      return false;
      if ((paramMotionEvent.getY() >= locala.oOG.getY() - 100.0F) && (paramMotionEvent.getY() < locala.oOG.getMeasuredHeight() + locala.oOG.getY()))
        locala.bUP();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicItemLayout.a
 * JD-Core Version:    0.6.2
 */