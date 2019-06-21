package com.google.android.exoplayer2.c;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.EOFException;

public final class d
  implements m
{
  public final int a(f paramf, int paramInt, boolean paramBoolean)
  {
    int i = -1;
    AppMethodBeat.i(94859);
    paramInt = paramf.dF(paramInt);
    if (paramInt == -1)
      if (paramBoolean)
      {
        AppMethodBeat.o(94859);
        paramInt = i;
      }
    while (true)
    {
      return paramInt;
      paramf = new EOFException();
      AppMethodBeat.o(94859);
      throw paramf;
      AppMethodBeat.o(94859);
    }
  }

  public final void a(long paramLong, int paramInt1, int paramInt2, int paramInt3, m.a parama)
  {
  }

  public final void a(l paraml, int paramInt)
  {
    AppMethodBeat.i(94860);
    paraml.eM(paramInt);
    AppMethodBeat.o(94860);
  }

  public final void f(Format paramFormat)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d
 * JD-Core Version:    0.6.2
 */