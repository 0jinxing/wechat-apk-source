package com.tencent.youtu.ytfacetrace;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class YTFaceTraceInterface$4
  implements Runnable
{
  YTFaceTraceInterface$4(int paramInt, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(117792);
    YTFaceTraceInterface.access$400().onFailed(this.val$resultCode, this.val$message, this.val$tips);
    YTFaceTraceInterface.access$402(null);
    AppMethodBeat.o(117792);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytfacetrace.YTFaceTraceInterface.4
 * JD-Core Version:    0.6.2
 */