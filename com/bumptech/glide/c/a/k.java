package com.bumptech.glide.c.a;

import com.bumptech.glide.c.b.a.b;
import com.bumptech.glide.c.d.a.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public final class k
  implements e<InputStream>
{
  private final m azw;

  k(InputStream paramInputStream, b paramb)
  {
    AppMethodBeat.i(91726);
    this.azw = new m(paramInputStream, paramb);
    this.azw.mark(5242880);
    AppMethodBeat.o(91726);
  }

  public final void cleanup()
  {
    AppMethodBeat.i(91727);
    this.azw.release();
    AppMethodBeat.o(91727);
  }

  public static final class a
    implements e.a<InputStream>
  {
    private final b azx;

    public a(b paramb)
    {
      this.azx = paramb;
    }

    public final Class<InputStream> mg()
    {
      return InputStream.class;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.a.k
 * JD-Core Version:    0.6.2
 */