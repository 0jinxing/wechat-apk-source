package com.tencent.rtmp;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;

class TXLivePusher$8
  implements Runnable
{
  TXLivePusher$8(TXLivePusher paramTXLivePusher, TXLivePusher.ITXSnapshotListener paramITXSnapshotListener, Bitmap paramBitmap)
  {
  }

  public void run()
  {
    AppMethodBeat.i(65928);
    if (this.val$listener != null)
      this.val$listener.onSnapshot(this.val$bmp);
    AppMethodBeat.o(65928);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.TXLivePusher.8
 * JD-Core Version:    0.6.2
 */