package com.google.android.exoplayer2.c.f;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class s
{
  private final List<Format> bbD;
  private final m[] bbG;

  public s(List<Format> paramList)
  {
    AppMethodBeat.i(95160);
    this.bbD = paramList;
    this.bbG = new m[paramList.size()];
    AppMethodBeat.o(95160);
  }

  public final void a(long paramLong, l paraml)
  {
    AppMethodBeat.i(95162);
    com.google.android.exoplayer2.f.a.g.a(paramLong, paraml, this.bbG);
    AppMethodBeat.o(95162);
  }

  public final void a(com.google.android.exoplayer2.c.g paramg, v.d paramd)
  {
    AppMethodBeat.i(95161);
    int i = 0;
    if (i < this.bbG.length)
    {
      paramd.rz();
      m localm = paramg.dM(paramd.rA());
      Format localFormat = (Format)this.bbD.get(i);
      String str1 = localFormat.aOd;
      boolean bool;
      if (("application/cea-608".equals(str1)) || ("application/cea-708".equals(str1)))
      {
        bool = true;
        label77: a.checkArgument(bool, "Invalid closed caption mime type provided: ".concat(String.valueOf(str1)));
        if (localFormat.id == null)
          break label156;
      }
      label156: for (String str2 = localFormat.id; ; str2 = paramd.rB())
      {
        localm.f(Format.a(str2, str1, localFormat.aOs, localFormat.aOt, localFormat.aOu));
        this.bbG[i] = localm;
        i++;
        break;
        bool = false;
        break label77;
      }
    }
    AppMethodBeat.o(95161);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.s
 * JD-Core Version:    0.6.2
 */