package com.bumptech.glide.c.c;

import com.bumptech.glide.c.a;
import com.bumptech.glide.c.a.d;
import com.bumptech.glide.c.a.d.a;
import com.bumptech.glide.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

final class e$b<Data>
  implements d<Data>
{
  private final String aDT;
  private final e.a<Data> aDU;
  private Data data;

  e$b(String paramString, e.a<Data> parama)
  {
    this.aDT = paramString;
    this.aDU = parama;
  }

  public final void a(g paramg, d.a<? super Data> parama)
  {
    AppMethodBeat.i(92048);
    try
    {
      this.data = this.aDU.aa(this.aDT);
      parama.S(this.data);
      AppMethodBeat.o(92048);
      return;
    }
    catch (IllegalArgumentException paramg)
    {
      while (true)
      {
        parama.b(paramg);
        AppMethodBeat.o(92048);
      }
    }
  }

  public final void cancel()
  {
  }

  public final void cleanup()
  {
    AppMethodBeat.i(92049);
    try
    {
      this.aDU.R(this.data);
      AppMethodBeat.o(92049);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        AppMethodBeat.o(92049);
    }
  }

  public final Class<Data> mg()
  {
    AppMethodBeat.i(92050);
    Class localClass = this.aDU.mg();
    AppMethodBeat.o(92050);
    return localClass;
  }

  public final a mh()
  {
    return a.ayD;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.e.b
 * JD-Core Version:    0.6.2
 */