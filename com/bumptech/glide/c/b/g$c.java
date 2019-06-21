package com.bumptech.glide.c.b;

import com.bumptech.glide.c.b.b.a;
import com.bumptech.glide.c.h;
import com.bumptech.glide.c.j;
import com.bumptech.glide.c.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$c<Z>
{
  l<Z> aAN;
  t<Z> aAO;
  h azP;

  final void a(g.d paramd, j paramj)
  {
    AppMethodBeat.i(91774);
    try
    {
      a locala = paramd.mn();
      paramd = this.azP;
      d locald = new com/bumptech/glide/c/b/d;
      locald.<init>(this.aAN, this.aAO, paramj);
      locala.a(paramd, locald);
      return;
    }
    finally
    {
      this.aAO.unlock();
      AppMethodBeat.o(91774);
    }
    throw paramd;
  }

  final void clear()
  {
    this.azP = null;
    this.aAN = null;
    this.aAO = null;
  }

  final boolean mz()
  {
    if (this.aAO != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.g.c
 * JD-Core Version:    0.6.2
 */