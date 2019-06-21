package com.qq.wx.voice.embed.recognizer;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class h extends Handler
{
  h(g paramg)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(123224);
    switch (paramMessage.what)
    {
    default:
    case 100:
    case 200:
    }
    while (true)
    {
      AppMethodBeat.o(123224);
      while (true)
      {
        return;
        int i = paramMessage.getData().getInt("errorCode");
        this.bCA.bCB.fM(i);
        AppMethodBeat.o(123224);
      }
      paramMessage = (a)paramMessage.obj;
      this.bCA.bCB.a(paramMessage);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.qq.wx.voice.embed.recognizer.h
 * JD-Core Version:    0.6.2
 */