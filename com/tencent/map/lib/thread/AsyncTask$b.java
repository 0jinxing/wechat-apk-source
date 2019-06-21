package com.tencent.map.lib.thread;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

class AsyncTask$b extends Handler
{
  public AsyncTask$b(Looper paramLooper)
  {
    super(paramLooper);
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(98169);
    AsyncTask.a locala = (AsyncTask.a)paramMessage.obj;
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(98169);
      while (true)
      {
        return;
        AsyncTask.c(locala.a, locala.b[0]);
        AppMethodBeat.o(98169);
      }
      locala.a.onProgressUpdate(locala.b);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.thread.AsyncTask.b
 * JD-Core Version:    0.6.2
 */