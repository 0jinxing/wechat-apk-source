package com.google.android.exoplayer2.source.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedReader;
import java.util.Queue;

final class d$a
{
  private final BufferedReader bkx;
  private final Queue<String> bky;
  private String bkz;

  public d$a(Queue<String> paramQueue, BufferedReader paramBufferedReader)
  {
    this.bky = paramQueue;
    this.bkx = paramBufferedReader;
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(125965);
    boolean bool;
    if (this.bkz != null)
    {
      AppMethodBeat.o(125965);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (!this.bky.isEmpty())
      {
        this.bkz = ((String)this.bky.poll());
        AppMethodBeat.o(125965);
        bool = true;
      }
      else
      {
        do
        {
          String str = this.bkx.readLine();
          this.bkz = str;
          if (str == null)
            break;
          this.bkz = this.bkz.trim();
        }
        while (this.bkz.isEmpty());
        AppMethodBeat.o(125965);
        bool = true;
        continue;
        bool = false;
        AppMethodBeat.o(125965);
      }
    }
  }

  public final String next()
  {
    AppMethodBeat.i(125966);
    String str;
    if (hasNext())
    {
      str = this.bkz;
      this.bkz = null;
    }
    while (true)
    {
      AppMethodBeat.o(125966);
      return str;
      str = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.b.a.d.a
 * JD-Core Version:    0.6.2
 */