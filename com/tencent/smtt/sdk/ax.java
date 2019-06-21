package com.tencent.smtt.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ax extends Handler
{
  ax(TbsLogReport paramTbsLogReport, Looper paramLooper)
  {
    super(paramLooper);
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(64478);
    if (paramMessage.what == 600)
      if (!(paramMessage.obj instanceof TbsLogReport.TbsLogInfo));
    while (true)
    {
      try
      {
        TbsLogReport.TbsLogInfo localTbsLogInfo = (TbsLogReport.TbsLogInfo)paramMessage.obj;
        int i = paramMessage.arg1;
        TbsLogReport.a(this.a, i, localTbsLogInfo);
        AppMethodBeat.o(64478);
        return;
      }
      catch (Exception paramMessage)
      {
      }
      AppMethodBeat.o(64478);
      continue;
      if (paramMessage.what == 601)
        TbsLogReport.a(this.a);
      AppMethodBeat.o(64478);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ax
 * JD-Core Version:    0.6.2
 */