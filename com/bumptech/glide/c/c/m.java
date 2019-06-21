package com.bumptech.glide.c.c;

import com.bumptech.glide.h.f;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class m<A, B>
{
  public final f<m.a<A>, B> aEm;

  public m()
  {
    this(250L);
  }

  public m(long paramLong)
  {
    AppMethodBeat.i(92096);
    this.aEm = new m.1(this, paramLong);
    AppMethodBeat.o(92096);
  }

  public final B Y(A paramA)
  {
    AppMethodBeat.i(92097);
    m.a locala = m.a.Z(paramA);
    paramA = this.aEm.get(locala);
    locala.release();
    AppMethodBeat.o(92097);
    return paramA;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.m
 * JD-Core Version:    0.6.2
 */