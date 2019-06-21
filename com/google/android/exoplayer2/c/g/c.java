package com.google.android.exoplayer2.c.g;

import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c
{
  public static b m(f paramf)
  {
    AppMethodBeat.i(95191);
    a.checkNotNull(paramf);
    l locall = new l(16);
    if (c.a.a(paramf, locall).id != v.aT("RIFF"))
    {
      AppMethodBeat.o(95191);
      paramf = null;
    }
    while (true)
    {
      return paramf;
      paramf.b(locall.data, 0, 4);
      locall.setPosition(0);
      if (locall.readInt() != v.aT("WAVE"))
      {
        AppMethodBeat.o(95191);
        paramf = null;
      }
      else
      {
        c.a locala;
        while (true)
        {
          locala = c.a.a(paramf, locall);
          if (locala.id == v.aT("fmt "))
            break;
          paramf.dH((int)locala.size);
        }
        if (locala.size >= 16L);
        int i;
        int j;
        int k;
        int m;
        int n;
        int i1;
        for (boolean bool = true; ; bool = false)
        {
          a.checkState(bool);
          paramf.b(locall.data, 0, 16);
          locall.setPosition(0);
          i = locall.tC();
          j = locall.tC();
          k = locall.tJ();
          m = locall.tJ();
          n = locall.tC();
          i1 = locall.tC();
          i2 = j * i1 / 8;
          if (n == i2)
            break;
          paramf = new o("Expected block alignment: " + i2 + "; got: " + n);
          AppMethodBeat.o(95191);
          throw paramf;
        }
        int i2 = v.eR(i1);
        if (i2 == 0)
        {
          AppMethodBeat.o(95191);
          paramf = null;
        }
        else if ((i != 1) && (i != 65534))
        {
          AppMethodBeat.o(95191);
          paramf = null;
        }
        else
        {
          paramf.dH((int)locala.size - 16);
          paramf = new b(j, k, m, n, i1, i2);
          AppMethodBeat.o(95191);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.g.c
 * JD-Core Version:    0.6.2
 */