package com.google.android.exoplayer2.c.f;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

public final class g
  implements h
{
  private int aUG;
  private final List<v.a> bbF;
  private final m[] bbG;
  private boolean bbH;
  private int bbI;
  private long bbJ;

  public g(List<v.a> paramList)
  {
    AppMethodBeat.i(95106);
    this.bbF = paramList;
    this.bbG = new m[paramList.size()];
    AppMethodBeat.o(95106);
  }

  private boolean e(l paraml, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(95110);
    if (paraml.tB() == 0)
      AppMethodBeat.o(95110);
    while (true)
    {
      return bool;
      if (paraml.readUnsignedByte() != paramInt)
        this.bbH = false;
      this.bbI -= 1;
      bool = this.bbH;
      AppMethodBeat.o(95110);
    }
  }

  public final void a(com.google.android.exoplayer2.c.g paramg, v.d paramd)
  {
    AppMethodBeat.i(95107);
    for (int i = 0; i < this.bbG.length; i++)
    {
      v.a locala = (v.a)this.bbF.get(i);
      paramd.rz();
      m localm = paramg.dM(paramd.rA());
      localm.f(Format.a(paramd.rB(), "application/dvbsubs", Collections.singletonList(locala.bdI), locala.aOt, null));
      this.bbG[i] = localm;
    }
    AppMethodBeat.o(95107);
  }

  public final void d(long paramLong, boolean paramBoolean)
  {
    if (!paramBoolean);
    while (true)
    {
      return;
      this.bbH = true;
      this.bbJ = paramLong;
      this.aUG = 0;
      this.bbI = 2;
    }
  }

  public final void rn()
  {
    this.bbH = false;
  }

  public final void ro()
  {
    AppMethodBeat.i(95108);
    if (this.bbH)
    {
      m[] arrayOfm = this.bbG;
      int i = arrayOfm.length;
      for (int j = 0; j < i; j++)
        arrayOfm[j].a(this.bbJ, 1, this.aUG, 0, null);
      this.bbH = false;
    }
    AppMethodBeat.o(95108);
  }

  public final void t(l paraml)
  {
    int i = 0;
    AppMethodBeat.i(95109);
    if (this.bbH)
      if ((this.bbI == 2) && (!e(paraml, 32)))
        AppMethodBeat.o(95109);
    while (true)
    {
      return;
      if ((this.bbI == 1) && (!e(paraml, 0)))
      {
        AppMethodBeat.o(95109);
      }
      else
      {
        int j = paraml.position;
        int k = paraml.tB();
        m[] arrayOfm = this.bbG;
        int m = arrayOfm.length;
        while (i < m)
        {
          m localm = arrayOfm[i];
          paraml.setPosition(j);
          localm.a(paraml, k);
          i++;
        }
        this.aUG += k;
        AppMethodBeat.o(95109);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.g
 * JD-Core Version:    0.6.2
 */