package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.l;
import com.google.android.exoplayer2.i.e;
import com.google.android.exoplayer2.i.i;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$1
  implements Runnable
{
  f$1(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(95477);
    f localf = this.bhd;
    if ((localf.released) || (localf.prepared) || (localf.bgN == null) || (!localf.bgQ))
      AppMethodBeat.o(95477);
    while (true)
    {
      return;
      Object localObject1 = localf.bgO;
      int i = localObject1.length;
      for (int j = 0; j < i; j++)
        if (localObject1[j].bhG.sl() == null)
          break label277;
      localf.bgK.tw();
      i = localf.bgO.length;
      localObject1 = new o[i];
      localf.bgW = new boolean[i];
      localf.bgV = new boolean[i];
      localf.aOz = localf.bgN.getDurationUs();
      j = 0;
      if (j < i)
      {
        Object localObject2 = localf.bgO[j].bhG.sl();
        localObject1[j] = new o(new Format[] { localObject2 });
        localObject2 = ((Format)localObject2).aOd;
        if ((i.aI((String)localObject2)) || (i.aH((String)localObject2)));
        for (int k = 1; ; k = 0)
        {
          localf.bgW[j] = k;
          localf.bgX = (k | localf.bgX);
          j++;
          break;
        }
      }
      localf.bgU = new p((o[])localObject1);
      localf.prepared = true;
      localf.bgE.e(localf.aOz, localf.bgN.qX());
      localf.bgq.a(localf);
      label277: AppMethodBeat.o(95477);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.f.1
 * JD-Core Version:    0.6.2
 */