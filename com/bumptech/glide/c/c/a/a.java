package com.bumptech.glide.c.c.a;

import com.bumptech.glide.c.c.g;
import com.bumptech.glide.c.c.m;
import com.bumptech.glide.c.c.n;
import com.bumptech.glide.c.c.o;
import com.bumptech.glide.c.c.r;
import com.bumptech.glide.c.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public final class a
  implements n<g, InputStream>
{
  public static final i<Integer> aEO;
  private final m<g, g> aEP;

  static
  {
    AppMethodBeat.i(92161);
    aEO = i.c("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(2500));
    AppMethodBeat.o(92161);
  }

  public a()
  {
    this(null);
  }

  public a(m<g, g> paramm)
  {
    this.aEP = paramm;
  }

  public static final class a
    implements o<g, InputStream>
  {
    private final m<g, g> aEP;

    public a()
    {
      AppMethodBeat.i(92158);
      this.aEP = new m(500L);
      AppMethodBeat.o(92158);
    }

    public final n<g, InputStream> a(r paramr)
    {
      AppMethodBeat.i(92159);
      paramr = new a(this.aEP);
      AppMethodBeat.o(92159);
      return paramr;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.a.a
 * JD-Core Version:    0.6.2
 */