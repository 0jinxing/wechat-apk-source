package com.github.henryye.nativeiv.b;

import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.nio.channels.FileChannel;

public final class b extends FilterInputStream
{
  private long aMp = 0L;

  public b(FileInputStream paramFileInputStream)
  {
    super(paramFileInputStream);
  }

  public final void mark(int paramInt)
  {
    AppMethodBeat.i(115773);
    try
    {
      this.aMp = ((FileInputStream)this.in).getChannel().position();
      AppMethodBeat.o(115773);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        c.c.a("MicroMsg.FileSeekingInputStream", localException, "Failed seeking FileChannel.", new Object[0]);
        AppMethodBeat.o(115773);
      }
    }
  }

  public final boolean markSupported()
  {
    return true;
  }

  public final void reset()
  {
    AppMethodBeat.i(115774);
    ((FileInputStream)this.in).getChannel().position(this.aMp);
    AppMethodBeat.o(115774);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.github.henryye.nativeiv.b.b
 * JD-Core Version:    0.6.2
 */