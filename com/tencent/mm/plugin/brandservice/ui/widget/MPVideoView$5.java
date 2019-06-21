package com.tencent.mm.plugin.brandservice.ui.widget;

import android.media.ThumbnailUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class MPVideoView$5
  implements Runnable
{
  MPVideoView$5(MPVideoView paramMPVideoView, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14491);
    al.d(new MPVideoView.5.1(this, ThumbnailUtils.createVideoThumbnail(this.hPW, 1)));
    AppMethodBeat.o(14491);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView.5
 * JD-Core Version:    0.6.2
 */