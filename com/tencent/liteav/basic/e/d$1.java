package com.tencent.liteav.basic.e;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;

class d$1
  implements Runnable
{
  d$1(d paramd, int paramInt1, boolean paramBoolean1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean2)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66206);
    try
    {
      d.a(this.i, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
      AppMethodBeat.o(66206);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        TXCLog.e("TXGLSurfaceRenderThread", "render texture error occurred!");
        AppMethodBeat.o(66206);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.e.d.1
 * JD-Core Version:    0.6.2
 */