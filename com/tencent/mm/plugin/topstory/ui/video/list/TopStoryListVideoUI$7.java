package com.tencent.mm.plugin.topstory.ui.video.list;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class TopStoryListVideoUI$7
  implements View.OnTouchListener
{
  TopStoryListVideoUI$7(TopStoryListVideoUI paramTopStoryListVideoUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(2107);
    if (this.sHq.sGz.getVisibility() == 0)
    {
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      if (TopStoryListVideoUI.g(this.sHq.sGB, f1, f2))
      {
        ab.i("MicroMsg.TopStory.TopStoryVideoUI", "touch in mContentViewNotFull");
        AppMethodBeat.o(2107);
      }
    }
    while (true)
    {
      return false;
      this.sHq.sGz.setVisibility(8);
      AppMethodBeat.o(2107);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI.7
 * JD-Core Version:    0.6.2
 */