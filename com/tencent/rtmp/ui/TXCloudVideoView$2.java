package com.tencent.rtmp.ui;

import com.tencent.liteav.renderer.TXCGLSurfaceView;
import com.tencent.matrix.trace.core.AppMethodBeat;

class TXCloudVideoView$2
  implements Runnable
{
  TXCloudVideoView$2(TXCloudVideoView paramTXCloudVideoView)
  {
  }

  public void run()
  {
    AppMethodBeat.i(65586);
    if (TXCloudVideoView.access$000(this.a) != null)
      TXCloudVideoView.access$000(this.a).setVisibility(8);
    AppMethodBeat.o(65586);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.ui.TXCloudVideoView.2
 * JD-Core Version:    0.6.2
 */