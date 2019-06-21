package com.tencent.tencentmap.mapsdk.a;

import android.os.Handler;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

class aw$1 extends Handler
{
  aw$1(aw paramaw)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(100690);
    if (aw.a(this.a) == true)
      AppMethodBeat.o(100690);
    while (true)
    {
      return;
      Object localObject = paramMessage.obj;
      if (localObject == null)
      {
        AppMethodBeat.o(100690);
      }
      else
      {
        localObject = (aw.b)localObject;
        aw.a(this.a, (aw.b)localObject);
        super.handleMessage(paramMessage);
        AppMethodBeat.o(100690);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.aw.1
 * JD-Core Version:    0.6.2
 */