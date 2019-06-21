package com.tencent.qqmusic.mediaplayer.upstream;

import android.os.Handler;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.downstream.IDataSink;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.IOException;

class DefaultLoader$2
  implements UriLoader.Callback
{
  DefaultLoader$2(DefaultLoader paramDefaultLoader)
  {
  }

  public void onCancelled()
  {
    AppMethodBeat.i(104548);
    DefaultLoader.access$300(this.this$0).obtainMessage(5).sendToTarget();
    AppMethodBeat.o(104548);
  }

  public void onFailed(Throwable paramThrowable)
  {
    AppMethodBeat.i(104547);
    DefaultLoader.access$300(this.this$0).obtainMessage(4, new IOException("failed to load uri", paramThrowable)).sendToTarget();
    AppMethodBeat.o(104547);
  }

  public void onSucceed(StreamingRequest paramStreamingRequest)
  {
    AppMethodBeat.i(104546);
    Logger.i("DefaultLoader", "[startLoading] uriLoader.startLoading onSucceed");
    IDataSource localIDataSource = this.this$0.createUpStream(paramStreamingRequest);
    try
    {
      localIDataSource.open();
      DefaultLoader.access$202(this.this$0, localIDataSource.getSize());
      localIDataSink = this.this$0.createCacheSink(paramStreamingRequest);
    }
    catch (IOException localIOException)
    {
      try
      {
        IDataSink localIDataSink;
        localIDataSink.open();
        DefaultLoader.access$402(this.this$0, localIDataSink);
        DefaultLoader.access$502(this.this$0, localIDataSource);
        this.this$0.start();
        AppMethodBeat.o(104546);
        return;
        localIOException = localIOException;
        DefaultLoader.access$300(this.this$0).obtainMessage(4, localIOException).sendToTarget();
      }
      catch (IOException paramStreamingRequest)
      {
        while (true)
          DefaultLoader.access$300(this.this$0).obtainMessage(4, paramStreamingRequest).sendToTarget();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.DefaultLoader.2
 * JD-Core Version:    0.6.2
 */