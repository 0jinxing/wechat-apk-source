package com.bumptech.glide.c.c;

import android.util.Log;
import com.bumptech.glide.c.a.d;
import com.bumptech.glide.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

final class d$a
  implements d<ByteBuffer>
{
  private final File file;

  d$a(File paramFile)
  {
    this.file = paramFile;
  }

  public final void a(g paramg, com.bumptech.glide.c.a.d.a<? super ByteBuffer> parama)
  {
    AppMethodBeat.i(92045);
    try
    {
      paramg = com.bumptech.glide.h.a.p(this.file);
      parama.S(paramg);
      AppMethodBeat.o(92045);
      return;
    }
    catch (IOException paramg)
    {
      while (true)
      {
        Log.isLoggable("ByteBufferFileLoader", 3);
        parama.b(paramg);
        AppMethodBeat.o(92045);
      }
    }
  }

  public final void cancel()
  {
  }

  public final void cleanup()
  {
  }

  public final Class<ByteBuffer> mg()
  {
    return ByteBuffer.class;
  }

  public final com.bumptech.glide.c.a mh()
  {
    return com.bumptech.glide.c.a.ayD;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.d.a
 * JD-Core Version:    0.6.2
 */