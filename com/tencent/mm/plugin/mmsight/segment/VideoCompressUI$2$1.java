package com.tencent.mm.plugin.mmsight.segment;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VideoCompressUI$2$1
  implements Runnable
{
  VideoCompressUI$2$1(VideoCompressUI.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(3696);
    if (VideoCompressUI.g(this.ozA.ozz) != null)
      VideoCompressUI.g(this.ozA.ozz).dismiss();
    AppMethodBeat.o(3696);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoCompressUI.2.1
 * JD-Core Version:    0.6.2
 */