package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoCompressUI$1
  implements Runnable
{
  VideoCompressUI$1(VideoCompressUI paramVideoCompressUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(3695);
    VideoCompressUI.a(this.ozz, CaptureMMProxy.getInstance().getSnsAlbumVideoTransPara());
    if (VideoCompressUI.a(this.ozz) == null)
    {
      ab.e("MicroMsg.VideoCompressUI", "VideoSendPreprocessTask para is null");
      this.ozz.setResult(0);
      this.ozz.finish();
      AppMethodBeat.o(3695);
    }
    while (true)
    {
      return;
      q.ku(CaptureMMProxy.getInstance().getDeviceInfoConfig());
      d.post(VideoCompressUI.b(this.ozz), "video_remuxing_if_needed");
      AppMethodBeat.o(3695);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoCompressUI.1
 * JD-Core Version:    0.6.2
 */