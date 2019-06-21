package com.tencent.recovery.handler;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.recovery.Recovery;

public class RecoveryMessageHandler extends Handler
{
  public RecoveryMessageHandler()
  {
    super(Looper.getMainLooper());
  }

  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      Recovery.dPV();
      continue;
      Recovery.QY(1);
      continue;
      Recovery.QY(1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.handler.RecoveryMessageHandler
 * JD-Core Version:    0.6.2
 */