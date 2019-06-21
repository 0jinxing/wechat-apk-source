package com.tencent.liteav.network;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

class TXCStreamUploader$1 extends Handler
{
  TXCStreamUploader$1(TXCStreamUploader paramTXCStreamUploader, Looper paramLooper)
  {
    super(paramLooper);
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(67477);
    switch (paramMessage.what)
    {
    case 102:
    default:
    case 101:
    case 103:
    case 104:
    }
    while (true)
    {
      AppMethodBeat.o(67477);
      while (true)
      {
        return;
        TXCStreamUploader localTXCStreamUploader = this.a;
        String str = (String)paramMessage.obj;
        if (paramMessage.arg1 == 2);
        for (boolean bool = true; ; bool = false)
        {
          TXCStreamUploader.access$000(localTXCStreamUploader, str, bool, 0);
          AppMethodBeat.o(67477);
          break;
        }
        TXCStreamUploader.access$100(this.a);
        AppMethodBeat.o(67477);
      }
      TXCStreamUploader.access$200(this.a);
      if (TXCStreamUploader.access$300(this.a) != null)
        TXCStreamUploader.access$300(this.a).sendEmptyMessageDelayed(104, 2000L);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.TXCStreamUploader.1
 * JD-Core Version:    0.6.2
 */