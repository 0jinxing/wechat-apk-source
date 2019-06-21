package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

class br$1 extends Handler
{
  br$1(br parambr, Looper paramLooper)
  {
    super(paramLooper);
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(100884);
    if ((paramMessage != null) && (paramMessage.what == 0))
    {
      if (br.a(this.a) != null)
      {
        paramMessage = (Bitmap)paramMessage.obj;
        br.a(this.a).a(paramMessage);
      }
      br.a(this.a, null);
    }
    AppMethodBeat.o(100884);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.br.1
 * JD-Core Version:    0.6.2
 */