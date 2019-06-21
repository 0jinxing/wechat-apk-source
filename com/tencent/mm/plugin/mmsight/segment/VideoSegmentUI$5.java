package com.tencent.mm.plugin.mmsight.segment;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VideoSegmentUI$5
  implements MenuItem.OnMenuItemClickListener
{
  VideoSegmentUI$5(VideoSegmentUI paramVideoSegmentUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(55034);
    this.ozN.finish();
    VideoSegmentUI.b(this.ozN);
    AppMethodBeat.o(55034);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoSegmentUI.5
 * JD-Core Version:    0.6.2
 */