package com.bumptech.glide.c.c;

import com.bumptech.glide.c.a.d;
import com.bumptech.glide.c.h;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

public final class n$a<Data>
{
  public final List<h> aEp;
  public final d<Data> aEq;
  public final h azW;

  public n$a(h paramh, d<Data> paramd)
  {
    this(paramh, Collections.emptyList(), paramd);
    AppMethodBeat.i(92098);
    AppMethodBeat.o(92098);
  }

  private n$a(h paramh, List<h> paramList, d<Data> paramd)
  {
    AppMethodBeat.i(92099);
    this.azW = ((h)i.d(paramh, "Argument must not be null"));
    this.aEp = ((List)i.d(paramList, "Argument must not be null"));
    this.aEq = ((d)i.d(paramd, "Argument must not be null"));
    AppMethodBeat.o(92099);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.n.a
 * JD-Core Version:    0.6.2
 */