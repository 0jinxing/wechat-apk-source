package com.tencent.youtu.ytagreflectlivecheck;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.youtu.ytagreflectlivecheck.requester.LightDiffResponse;

final class YTAGReflectLiveCheckInterface$1
  implements Runnable
{
  YTAGReflectLiveCheckInterface$1(boolean paramBoolean, LightDiffResponse paramLightDiffResponse)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123133);
    YTAGReflectLiveCheckInterface.access$000().onSuccess(this.val$isAlive, this.val$lightDiffResponse);
    YTAGReflectLiveCheckInterface.access$002(null);
    AppMethodBeat.o(123133);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.1
 * JD-Core Version:    0.6.2
 */