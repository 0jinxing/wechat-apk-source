package com.tencent.ttpic.util;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GpuInfoUtil$1
  implements Runnable
{
  GpuInfoUtil$1(Object paramObject)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(83928);
    if (GpuInfoUtil.access$000() == null)
    {
      String str1 = GLES20.glGetString(7937);
      String str2 = GLES20.glGetString(7936);
      ??? = GLES20.glGetString(7938);
      GpuInfoUtil.access$002(str1 + "; " + str2 + "; " + (String)???);
    }
    synchronized (this.val$waitDoneLock)
    {
      this.val$waitDoneLock.notifyAll();
      AppMethodBeat.o(83928);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.GpuInfoUtil.1
 * JD-Core Version:    0.6.2
 */