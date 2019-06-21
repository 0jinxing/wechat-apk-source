package com.tencent.youtu.ytcommon.tools;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Callable;

final class YTThreadOperate$3
  implements Runnable
{
  YTThreadOperate$3(Callable paramCallable, YTThreadOperate.UiThreadCallback paramUiThreadCallback)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(118105);
    Object localObject1 = null;
    try
    {
      Object localObject2 = this.val$callable.call();
      localObject1 = localObject2;
      label19: YTThreadOperate.access$000().post(new YTThreadOperate.3.1(this, localObject1));
      AppMethodBeat.o(118105);
      return;
    }
    catch (Exception localException)
    {
      break label19;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytcommon.tools.YTThreadOperate.3
 * JD-Core Version:    0.6.2
 */