package com.tencent.wework.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wework.api.model.BaseMessage;
import com.tencent.wework.api.model.WWBaseRespMessage;
import java.util.Map;

class WWAPIImpl$1$1
  implements Runnable
{
  WWAPIImpl$1$1(WWAPIImpl.1 param1, BaseMessage paramBaseMessage)
  {
  }

  public void run()
  {
    AppMethodBeat.i(80491);
    try
    {
      WWAPIImpl.b(this.ALD.ALB).get(((WWBaseRespMessage)this.ALC).transaction);
      WWAPIImpl.b(this.ALD.ALB).remove(((WWBaseRespMessage)this.ALC).transaction);
      AppMethodBeat.o(80491);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(80491);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.wework.api.WWAPIImpl.1.1
 * JD-Core Version:    0.6.2
 */