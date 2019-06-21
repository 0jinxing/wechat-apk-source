package com.google.android.exoplayer2.source;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

final class f$3
  implements Runnable
{
  f$3(f paramf, IOException paramIOException)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(95479);
    this.bhd.bgD.onLoadError(this.bgn);
    AppMethodBeat.o(95479);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.f.3
 * JD-Core Version:    0.6.2
 */