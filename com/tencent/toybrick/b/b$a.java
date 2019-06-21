package com.tencent.toybrick.b;

import android.support.v7.widget.RecyclerView.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;
import com.tencent.toybrick.c.f;
import com.tencent.toybrick.c.g;
import com.tencent.toybrick.e.c;
import com.tencent.toybrick.e.c.d;

final class b$a extends RecyclerView.c
{
  private b$a(b paramb)
  {
  }

  public final void av(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(113181);
    super.av(paramInt1, paramInt2);
    ai.d("NotifyObserver", "[onItemRangeChanged] positionStart:%d, itemCount:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    g localg = this.AFU.Sg(paramInt1);
    if ((localg != null) && (localg.AGD != null))
      c.execute(new c.d(c.AHh, localg, localg.AGD, new b.a.1(this)));
    AppMethodBeat.o(113181);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.b.b.a
 * JD-Core Version:    0.6.2
 */