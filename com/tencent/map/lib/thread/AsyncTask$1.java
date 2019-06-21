package com.tencent.map.lib.thread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicBoolean;

class AsyncTask$1 extends AsyncTask.e<Params, Result>
{
  AsyncTask$1(AsyncTask paramAsyncTask)
  {
    super(null);
  }

  public Result call()
  {
    AppMethodBeat.i(98165);
    AsyncTask.a(this.a).set(true);
    Object localObject = this.a.doInBackground(this.b);
    localObject = AsyncTask.a(this.a, localObject);
    AppMethodBeat.o(98165);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.thread.AsyncTask.1
 * JD-Core Version:    0.6.2
 */