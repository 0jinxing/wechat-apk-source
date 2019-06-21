package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.nio.channels.FileChannel;

public final class l extends FilterInputStream
{
  private long aMp = 0L;

  public l(FileInputStream paramFileInputStream)
  {
    super(paramFileInputStream);
  }

  public final void mark(int paramInt)
  {
    AppMethodBeat.i(51984);
    try
    {
      this.aMp = ((FileInputStream)this.in).getChannel().position();
      AppMethodBeat.o(51984);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FileSeekingInputStream", localException, "Failed seeking FileChannel.", new Object[0]);
        AppMethodBeat.o(51984);
      }
    }
  }

  public final boolean markSupported()
  {
    return true;
  }

  public final void reset()
  {
    AppMethodBeat.i(51985);
    ((FileInputStream)this.in).getChannel().position(this.aMp);
    AppMethodBeat.o(51985);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.l
 * JD-Core Version:    0.6.2
 */