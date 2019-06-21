package com.google.android.exoplayer2.c.f;

import android.util.SparseArray;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.i.k;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.s;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class u$a
  implements q
{
  private final k bdD;

  public u$a(u paramu)
  {
    AppMethodBeat.i(95166);
    this.bdD = new k(new byte[4]);
    AppMethodBeat.o(95166);
  }

  public final void a(s params, g paramg, v.d paramd)
  {
  }

  public final void t(l paraml)
  {
    AppMethodBeat.i(95167);
    if (paraml.readUnsignedByte() != 0)
      AppMethodBeat.o(95167);
    while (true)
    {
      return;
      paraml.eM(7);
      int i = paraml.tB() / 4;
      int j = 0;
      if (j < i)
      {
        paraml.c(this.bdD, 4);
        int k = this.bdD.ed(16);
        this.bdD.ee(3);
        if (k == 0)
          this.bdD.ee(13);
        while (true)
        {
          j++;
          break;
          k = this.bdD.ed(13);
          u.a(this.bdE).put(k, new r(new u.b(this.bdE, k)));
          u.b(this.bdE);
        }
      }
      if (u.c(this.bdE) != 2)
        u.a(this.bdE).remove(0);
      AppMethodBeat.o(95167);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.u.a
 * JD-Core Version:    0.6.2
 */