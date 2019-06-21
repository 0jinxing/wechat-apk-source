package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class TopStoryFSVideoUI$12
  implements View.OnTouchListener
{
  TopStoryFSVideoUI$12(TopStoryFSVideoUI paramTopStoryFSVideoUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(1966);
    if (this.sGF.sGz.getVisibility() == 0)
    {
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      if (TopStoryFSVideoUI.f(this.sGF.sGB, f1, f2))
      {
        ab.i("MicroMsg.TopStory.TopStoryFSVideoUI", "touch in mContentViewNotFull");
        AppMethodBeat.o(1966);
      }
    }
    while (true)
    {
      return false;
      this.sGF.sGz.setVisibility(8);
      AppMethodBeat.o(1966);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI.12
 * JD-Core Version:    0.6.2
 */