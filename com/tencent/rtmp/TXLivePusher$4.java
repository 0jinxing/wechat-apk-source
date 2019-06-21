package com.tencent.rtmp;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.rtmp.ui.TXCloudVideoView;

class TXLivePusher$4
  implements Runnable
{
  TXLivePusher$4(TXLivePusher paramTXLivePusher, Bundle paramBundle, int paramInt)
  {
  }

  public void run()
  {
    AppMethodBeat.i(65932);
    if (TXLivePusher.access$500(this.this$0) != null)
      TXLivePusher.access$500(this.this$0).setLogText(null, this.val$param, this.val$event);
    AppMethodBeat.o(65932);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.TXLivePusher.4
 * JD-Core Version:    0.6.2
 */