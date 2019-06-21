package com.tencent.rtmp;

import android.graphics.Bitmap;
import android.os.Handler;
import com.tencent.liteav.basic.e.n;
import com.tencent.matrix.trace.core.AppMethodBeat;

class TXLivePusher$1
  implements n
{
  TXLivePusher$1(TXLivePusher paramTXLivePusher, TXLivePusher.ITXSnapshotListener paramITXSnapshotListener)
  {
  }

  public void onTakePhotoComplete(Bitmap paramBitmap)
  {
    AppMethodBeat.i(65989);
    TXLivePusher.access$000(this.this$0, this.val$listener, paramBitmap);
    TXLivePusher.access$102(this.this$0, false);
    TXLivePusher.access$300(this.this$0).removeCallbacks(TXLivePusher.access$200(this.this$0));
    AppMethodBeat.o(65989);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.TXLivePusher.1
 * JD-Core Version:    0.6.2
 */