package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;

class aq extends Handler
{
  aq(an paraman, Looper paramLooper)
  {
    super(paramLooper);
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(64398);
    QbSdk.setTBSInstallingStatus(true);
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(64398);
      while (true)
      {
        return;
        TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_INSTALL_TBS_CORE");
        paramMessage = (Object[])paramMessage.obj;
        an.a(this.a, (Context)paramMessage[0], (String)paramMessage[1], ((Integer)paramMessage[2]).intValue());
        AppMethodBeat.o(64398);
        continue;
        TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_COPY_TBS_CORE");
        paramMessage = (Object[])paramMessage.obj;
        an.a(this.a, (Context)paramMessage[0], (Context)paramMessage[1], ((Integer)paramMessage[2]).intValue());
        AppMethodBeat.o(64398);
        continue;
        TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_INSTALL_TBS_CORE_EX");
        paramMessage = (Object[])paramMessage.obj;
        this.a.b((Context)paramMessage[0], (Bundle)paramMessage[1]);
        AppMethodBeat.o(64398);
      }
      TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_UNZIP_TBS_CORE");
      Object[] arrayOfObject = (Object[])paramMessage.obj;
      this.a.a((Context)arrayOfObject[0], (File)arrayOfObject[1], ((Integer)arrayOfObject[2]).intValue());
      QbSdk.setTBSInstallingStatus(false);
      super.handleMessage(paramMessage);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.aq
 * JD-Core Version:    0.6.2
 */