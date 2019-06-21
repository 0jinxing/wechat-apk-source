package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoSegmentUI$1
  implements Runnable
{
  VideoSegmentUI$1(VideoSegmentUI paramVideoSegmentUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55027);
    ab.i("MicroMsg.VideoSegmentUI", "has connect");
    if (CaptureMMProxy.getInstance() != null)
      q.ku(CaptureMMProxy.getInstance().getDeviceInfoConfig());
    VideoSegmentUI.a(this.ozN);
    AppMethodBeat.o(55027);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoSegmentUI.1
 * JD-Core Version:    0.6.2
 */