package com.tencent.liteav;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

class a$a extends Handler
{
  private int b = 300;
  private long c = 0L;

  public a$a(a parama, Looper paramLooper, int paramInt, long paramLong)
  {
    super(paramLooper);
    this.b = paramInt;
    this.c = paramLong;
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(66380);
    if (paramMessage.what == 1001);
    while (true)
    {
      try
      {
        a.a(this.a);
        if (System.currentTimeMillis() < this.c)
        {
          sendEmptyMessageDelayed(1001, this.b);
          AppMethodBeat.o(66380);
          return;
        }
        TXCLog.w(a.b(), "bkgpush:stop background publish when timeout");
        if ((a.b(this.a) != null) && (a.c(this.a)))
        {
          paramMessage = (a.b)a.b(this.a).get();
          if (paramMessage != null)
            paramMessage.a();
          a.a(this.a, false);
        }
        AppMethodBeat.o(66380);
        continue;
      }
      catch (Exception paramMessage)
      {
      }
      AppMethodBeat.o(66380);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.a.a
 * JD-Core Version:    0.6.2
 */