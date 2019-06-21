package com.tencent.liteav.videoencoder;

import android.media.MediaCodec;
import com.tencent.matrix.trace.core.AppMethodBeat;

class a$5
  implements Runnable
{
  a$5(a parama)
  {
  }

  public void run()
  {
    AppMethodBeat.i(67363);
    if (a.b(this.a) == null)
      AppMethodBeat.o(67363);
    while (true)
    {
      return;
      try
      {
        a.b(this.a).signalEndOfInputStream();
        label31: 
        while (a.c(this.a, 10) >= 0);
        a.a(this.a);
        AppMethodBeat.o(67363);
      }
      catch (Exception localException)
      {
        break label31;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.videoencoder.a.5
 * JD-Core Version:    0.6.2
 */