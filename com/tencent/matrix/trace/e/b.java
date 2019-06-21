package com.tencent.matrix.trace.e;

import android.os.Handler;
import android.os.HandlerThread;

public class b
{
  private Handler handler;

  public void a(String paramString, long paramLong, int paramInt)
  {
  }

  public Handler getHandler()
  {
    if (this.handler == null)
      this.handler = new Handler(com.tencent.matrix.d.b.zL().getLooper());
    return this.handler;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.trace.e.b
 * JD-Core Version:    0.6.2
 */