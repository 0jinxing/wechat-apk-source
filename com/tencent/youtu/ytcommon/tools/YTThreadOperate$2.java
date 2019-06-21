package com.tencent.youtu.ytcommon.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Callable;

final class YTThreadOperate$2
  implements Callable<T>
{
  YTThreadOperate$2(Callable paramCallable)
  {
  }

  public final T call()
  {
    AppMethodBeat.i(118103);
    try
    {
      Object localObject1 = this.val$runnable.call();
      AppMethodBeat.o(118103);
      return localObject1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject2 = null;
        AppMethodBeat.o(118103);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytcommon.tools.YTThreadOperate.2
 * JD-Core Version:    0.6.2
 */