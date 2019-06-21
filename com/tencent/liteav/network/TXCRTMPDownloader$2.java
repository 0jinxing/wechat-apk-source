package com.tencent.liteav.network;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

class TXCRTMPDownloader$2 extends Handler
{
  TXCRTMPDownloader$2(TXCRTMPDownloader paramTXCRTMPDownloader, Looper paramLooper)
  {
    super(paramLooper);
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(67594);
    if (paramMessage.what == 101)
      TXCRTMPDownloader.access$600(this.a);
    AppMethodBeat.o(67594);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.TXCRTMPDownloader.2
 * JD-Core Version:    0.6.2
 */