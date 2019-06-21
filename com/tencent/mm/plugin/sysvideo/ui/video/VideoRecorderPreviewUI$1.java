package com.tencent.mm.plugin.sysvideo.ui.video;

import android.app.Activity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VideoRecorderPreviewUI$1
  implements MenuItem.OnMenuItemClickListener
{
  VideoRecorderPreviewUI$1(VideoRecorderPreviewUI paramVideoRecorderPreviewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(25630);
    this.swE.finish();
    this.swE.overridePendingTransition(0, 0);
    AppMethodBeat.o(25630);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sysvideo.ui.video.VideoRecorderPreviewUI.1
 * JD-Core Version:    0.6.2
 */