package com.tencent.mm.audio.mix.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.d.m;
import com.tencent.mm.g.a.u;
import com.tencent.mm.g.a.u.a;
import java.util.HashMap;

final class d$3
  implements m
{
  d$3(d paramd)
  {
  }

  public final void a(u paramu)
  {
    AppMethodBeat.i(137170);
    int i = paramu.csP.action;
    int j;
    if ((i == 12) || (i == 11) || (i == 10) || (i == 6))
    {
      j = 1;
      if (j != 0)
        break label157;
      if (!this.cnW.cnH.containsKey(paramu.csP.ckD))
        break label175;
      ??? = (e)this.cnW.cnH.get(paramu.csP.ckD);
      if (??? == null)
        break label127;
      if (!((e)???).g(new Integer[] { Integer.valueOf(i) }))
        break label127;
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioMixPlayerImpl", "don't callback again");
      AppMethodBeat.o(137170);
    }
    while (true)
    {
      return;
      j = 0;
      break;
      label127: ((e)???).al(Integer.valueOf(i));
      this.cnW.cnH.put(paramu.csP.ckD, ???);
      while (true)
        label157: if (this.cnW.cnC == null)
        {
          AppMethodBeat.o(137170);
          break;
          label175: synchronized (this.cnW.cnz)
          {
            e locale = new com/tencent/mm/audio/mix/f/e;
            locale.<init>(Integer.valueOf(i));
            this.cnW.cnH.put(paramu.csP.ckD, locale);
          }
        }
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayerImpl", "onEventChange audioId:%s, state:%s", new Object[] { paramu.csP.ckD, paramu.csP.state });
      if (i == 9)
      {
        this.cnW.cnC.b(paramu);
        AppMethodBeat.o(137170);
      }
      else if (i == 7)
      {
        this.cnW.cnC.c(paramu);
        AppMethodBeat.o(137170);
      }
      else if (i == 0)
      {
        this.cnW.cnC.d(paramu);
        AppMethodBeat.o(137170);
      }
      else if (i == 1)
      {
        this.cnW.cnC.d(paramu);
        AppMethodBeat.o(137170);
      }
      else if (i == 2)
      {
        this.cnW.cnC.e(paramu);
        AppMethodBeat.o(137170);
      }
      else if (i == 3)
      {
        this.cnW.cnG.put(paramu.csP.ckD, Boolean.FALSE);
        this.cnW.cnC.f(paramu);
        AppMethodBeat.o(137170);
      }
      else if (i == 5)
      {
        this.cnW.cnG.put(paramu.csP.ckD, Boolean.FALSE);
        this.cnW.cnC.g(paramu);
        AppMethodBeat.o(137170);
      }
      else if (i == 4)
      {
        this.cnW.cnG.put(paramu.csP.ckD, Boolean.FALSE);
        this.cnW.cnC.j(paramu);
        AppMethodBeat.o(137170);
      }
      else if (i == 10)
      {
        this.cnW.cnC.h(paramu);
        AppMethodBeat.o(137170);
      }
      else if (i == 6)
      {
        this.cnW.cnC.i(paramu);
        AppMethodBeat.o(137170);
      }
      else
      {
        if (i == 11)
          this.cnW.cnC.k(paramu);
        AppMethodBeat.o(137170);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.f.d.3
 * JD-Core Version:    0.6.2
 */