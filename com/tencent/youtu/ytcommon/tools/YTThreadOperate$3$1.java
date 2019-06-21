package com.tencent.youtu.ytcommon.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;

class YTThreadOperate$3$1
  implements Runnable
{
  YTThreadOperate$3$1(YTThreadOperate.3 param3, Object paramObject)
  {
  }

  public void run()
  {
    AppMethodBeat.i(118104);
    if (this.this$0.val$uiCallback != null);
    while (true)
    {
      try
      {
        this.this$0.val$uiCallback.callback(this.val$temp);
        AppMethodBeat.o(118104);
        return;
      }
      catch (Exception localException)
      {
        YTException.report(localException);
      }
      AppMethodBeat.o(118104);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytcommon.tools.YTThreadOperate.3.1
 * JD-Core Version:    0.6.2
 */