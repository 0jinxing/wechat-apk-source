package com.tencent.mm.plugin.wenote.model.nativenote.c;

import android.support.v7.widget.RecyclerView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class e$9
  implements ap.a
{
  e$9(e parame)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(26866);
    ab.d("NoteSelectManager", "onTimerExpired: ");
    RecyclerView localRecyclerView = e.a(this.uRO);
    int i;
    int j;
    if ((e.c(this.uRO) != null) && (e.c(this.uRO).uQV < e.a(this.uRO, localRecyclerView)))
    {
      i = 1;
      if ((e.c(this.uRO) == null) || (e.c(this.uRO).uQV <= e.d(this.uRO)))
        break label208;
      j = 1;
      label90: if ((!e.dfx()) || (localRecyclerView == null) || (e.c(this.uRO) == null) || (e.c(this.uRO).getType() != 1) || ((i == 0) && (j == 0)))
        break label258;
      if ((i == 0) || (!localRecyclerView.canScrollVertically(-1)))
        break label213;
      if (e.c(this.uRO).klY == 3)
        e.e(this.uRO);
      e.f(this.uRO);
      this.uRO.dfj();
      this.uRO.dfh();
      localRecyclerView.a(0, -300, null);
    }
    label258: 
    while (true)
    {
      AppMethodBeat.o(26866);
      return true;
      i = 0;
      break;
      label208: j = 0;
      break label90;
      label213: if ((j != 0) && (localRecyclerView.canScrollVertically(1)))
      {
        e.f(this.uRO);
        this.uRO.dfj();
        this.uRO.dfh();
        localRecyclerView.a(0, 300, null);
        continue;
        if (e.g(this.uRO) != null)
          e.g(this.uRO).stopTimer();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.c.e.9
 * JD-Core Version:    0.6.2
 */