package com.tencent.rtmp.ui;

import com.tencent.liteav.renderer.TXCGLSurfaceView;
import com.tencent.matrix.trace.core.AppMethodBeat;

class TXCloudVideoView$1
  implements Runnable
{
  TXCloudVideoView$1(TXCloudVideoView paramTXCloudVideoView)
  {
  }

  public void run()
  {
    AppMethodBeat.i(65569);
    if (TXCloudVideoView.access$000(this.a) != null)
      TXCloudVideoView.access$000(this.a).setVisibility(0);
    AppMethodBeat.o(65569);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.ui.TXCloudVideoView.1
 * JD-Core Version:    0.6.2
 */