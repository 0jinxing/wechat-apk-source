package com.tencent.rtmp;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

class TXLivePusher$11
  implements Runnable
{
  TXLivePusher$11(TXLivePusher paramTXLivePusher, int paramInt, Bundle paramBundle)
  {
  }

  public void run()
  {
    AppMethodBeat.i(65971);
    if (TXLivePusher.access$1000(this.this$0) != null)
      TXLivePusher.access$1000(this.this$0).onPushEvent(this.val$finalEvent, this.val$param);
    AppMethodBeat.o(65971);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.TXLivePusher.11
 * JD-Core Version:    0.6.2
 */