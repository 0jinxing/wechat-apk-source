package com.google.android.exoplayer2.source.b;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.b.e;
import com.google.android.exoplayer2.source.a.a;
import com.google.android.exoplayer2.source.a.a.5;
import com.google.android.exoplayer2.source.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class i
  implements l
{
  public final int bjl;
  private final j bjm;

  public i(j paramj, int paramInt)
  {
    this.bjm = paramj;
    this.bjl = paramInt;
  }

  public final void Z(long paramLong)
  {
    AppMethodBeat.i(125940);
    j localj = this.bjm;
    int i = this.bjl;
    com.google.android.exoplayer2.source.k localk = localj.bgO[i];
    if ((localj.bhc) && (paramLong > localk.bhG.sc()))
    {
      localk.bhG.sm();
      AppMethodBeat.o(125940);
    }
    while (true)
    {
      return;
      localk.g(paramLong, true);
      AppMethodBeat.o(125940);
    }
  }

  public final int b(com.google.android.exoplayer2.k paramk, e parame, boolean paramBoolean)
  {
    AppMethodBeat.i(125939);
    j localj = this.bjm;
    int i = this.bjl;
    int j;
    if (localj.sd())
    {
      j = -3;
      AppMethodBeat.o(125939);
    }
    while (true)
    {
      return j;
      if (!localj.bjr.isEmpty())
      {
        label79: int m;
        if (localj.bjr.size() > 1)
        {
          int k = ((f)localj.bjr.getFirst()).uid;
          j = 0;
          if (j < localj.bgO.length)
            if (localj.bjw[j] != 0)
            {
              localObject1 = localj.bgO[j].bhG;
              m = ((com.google.android.exoplayer2.source.j)localObject1).ep(((com.google.android.exoplayer2.source.j)localObject1).bhy);
              if (((com.google.android.exoplayer2.source.j)localObject1).sk())
              {
                m = localObject1.bht[m];
                label144: if (m != k)
                  break label181;
              }
            }
          for (j = 0; ; j = 1)
          {
            if (j == 0)
              break label193;
            localj.bjr.removeFirst();
            break;
            m = ((com.google.android.exoplayer2.source.j)localObject1).bhE;
            break label144;
            label181: j++;
            break label79;
          }
        }
        label193: f localf = (f)localj.bjr.getFirst();
        Object localObject1 = localf.bic;
        if (!((Format)localObject1).equals(localj.bjs))
        {
          a.a locala = localj.bjc;
          j = localj.aMr;
          m = localf.bid;
          Object localObject2 = localf.bie;
          long l = localf.bif;
          if (locala.bfZ != null)
            locala.handler.post(new a.a.5(locala, j, (Format)localObject1, m, localObject2, l));
        }
        localj.bjs = ((Format)localObject1);
      }
      j = localj.bgO[i].a(paramk, parame, paramBoolean, localj.bhc, localj.bgZ);
      AppMethodBeat.o(125939);
    }
  }

  public final boolean isReady()
  {
    AppMethodBeat.i(125937);
    j localj = this.bjm;
    int i = this.bjl;
    boolean bool;
    if ((localj.bhc) || ((!localj.sd()) && (localj.bgO[i].bhG.sk())))
    {
      bool = true;
      AppMethodBeat.o(125937);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125937);
    }
  }

  public final void rW()
  {
    AppMethodBeat.i(125938);
    this.bjm.bjo.rW();
    AppMethodBeat.o(125938);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.b.i
 * JD-Core Version:    0.6.2
 */