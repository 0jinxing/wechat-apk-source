package com.qq.wx.voice.embed.recognizer;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$a
  implements Runnable
{
  private e$a(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123210);
    if (this.bCs.bCz.begin() != 0)
    {
      this.bCs.bCA.a(-102);
      AppMethodBeat.o(123210);
    }
    while (true)
    {
      return;
      if (this.bCs.bCz.recognize(this.bCs.c, this.bCs.c.length) != 0)
      {
        this.bCs.bCA.a(-103);
        AppMethodBeat.o(123210);
      }
      else if (this.bCs.bCz.end() != 0)
      {
        this.bCs.bCA.a(-104);
        AppMethodBeat.o(123210);
      }
      else
      {
        a locala = new a();
        if (this.bCs.bCz.getResult(locala) != 0)
          this.bCs.bCA.a(-105);
        g localg = this.bCs.bCA;
        localg.b.sendMessage(localg.b.obtainMessage(200, locala));
        AppMethodBeat.o(123210);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.qq.wx.voice.embed.recognizer.e.a
 * JD-Core Version:    0.6.2
 */