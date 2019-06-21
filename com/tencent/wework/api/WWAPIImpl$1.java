package com.tencent.wework.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wework.api.model.BaseMessage;
import com.tencent.wework.api.model.WWBaseRespMessage;

class WWAPIImpl$1 extends BroadcastReceiver
{
  WWAPIImpl$1(WWAPIImpl paramWWAPIImpl)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(80492);
    try
    {
      boolean bool = WWAPIImpl.a(this.ALB).equals(paramIntent.getScheme());
      if (!bool)
        AppMethodBeat.o(80492);
      while (true)
      {
        return;
        paramIntent = BaseMessage.x(paramIntent.getData());
        if ((paramIntent instanceof WWBaseRespMessage))
        {
          paramContext = new android/os/Handler;
          paramContext.<init>(Looper.getMainLooper());
          WWAPIImpl.1.1 local1 = new com/tencent/wework/api/WWAPIImpl$1$1;
          local1.<init>(this, paramIntent);
          paramContext.post(local1);
        }
        AppMethodBeat.o(80492);
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
        AppMethodBeat.o(80492);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.wework.api.WWAPIImpl.1
 * JD-Core Version:    0.6.2
 */