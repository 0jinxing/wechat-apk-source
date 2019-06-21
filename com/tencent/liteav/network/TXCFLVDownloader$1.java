package com.tencent.liteav.network;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

class TXCFLVDownloader$1 extends Handler
{
  TXCFLVDownloader$1(TXCFLVDownloader paramTXCFLVDownloader, Looper paramLooper)
  {
    super(paramLooper);
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(67478);
    switch (paramMessage.what)
    {
    case 104:
    case 105:
    default:
    case 100:
    case 101:
    case 102:
    case 103:
    case 106:
    }
    while (true)
    {
      AppMethodBeat.o(67478);
      while (true)
      {
        return;
        TXCFLVDownloader.access$000(this.a);
        AppMethodBeat.o(67478);
        continue;
        TXCFLVDownloader.access$100(this.a);
        AppMethodBeat.o(67478);
        continue;
        TXCFLVDownloader.access$200(this.a);
        AppMethodBeat.o(67478);
        continue;
        TXCFLVDownloader.access$300(this.a);
        AppMethodBeat.o(67478);
        continue;
        try
        {
          Looper.myLooper().quit();
          AppMethodBeat.o(67478);
        }
        catch (Exception paramMessage)
        {
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.TXCFLVDownloader.1
 * JD-Core Version:    0.6.2
 */