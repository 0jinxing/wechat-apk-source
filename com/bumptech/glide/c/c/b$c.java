package com.bumptech.glide.c.c;

import com.bumptech.glide.c.a;
import com.bumptech.glide.c.a.d;
import com.bumptech.glide.c.a.d.a;
import com.bumptech.glide.g;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$c<Data>
  implements d<Data>
{
  private final b.b<Data> aDO;
  private final byte[] aDQ;

  b$c(byte[] paramArrayOfByte, b.b<Data> paramb)
  {
    this.aDQ = paramArrayOfByte;
    this.aDO = paramb;
  }

  public final void a(g paramg, d.a<? super Data> parama)
  {
    AppMethodBeat.i(92038);
    parama.S(this.aDO.h(this.aDQ));
    AppMethodBeat.o(92038);
  }

  public final void cancel()
  {
  }

  public final void cleanup()
  {
  }

  public final Class<Data> mg()
  {
    AppMethodBeat.i(92039);
    Class localClass = this.aDO.mg();
    AppMethodBeat.o(92039);
    return localClass;
  }

  public final a mh()
  {
    return a.ayD;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.b.c
 * JD-Core Version:    0.6.2
 */