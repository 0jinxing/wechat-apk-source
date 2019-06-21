package com.tencent.mm.plugin.sns.ui.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sns.a.b.g;
import com.tencent.mm.plugin.sns.storage.b.c;
import com.tencent.mm.plugin.sns.storage.b.c.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class c$2
  implements b.f
{
  c$2(c paramc, long paramLong)
  {
  }

  public final void b(com.tencent.mm.plugin.sight.decode.a.b paramb, long paramLong)
  {
    AppMethodBeat.i(40095);
    if (paramLong >= 3L)
    {
      i = (int)paramb.cle();
      this.rHb.rqn.c(this.rHa, bo.yz(), false);
      this.rHb.rqn.f(this.rHa, i, false);
      this.rHb.rqn.T(this.rHa, this.rHa);
    }
    ab.d("MicroMsg.FullCardAdDetailItem", "sight play %d", new Object[] { Long.valueOf(paramLong) });
    int i = (int)paramLong;
    c localc = this.rHb;
    Object localObject = this.rHb.rGZ;
    paramb = this.rHb.ros;
    i *= 1000;
    localObject = ((b.c)localObject).qVn;
    if ((!bo.isNullOrNil(paramb.cqo().coW())) && (localObject != null) && (((b.c.a)localObject).startTime >= 0L) && (((b.c.a)localObject).endTime > ((b.c.a)localObject).startTime))
    {
      ab.i("MicroMsg.FullCardAdDetailItem", "%d-%d,%d", new Object[] { Long.valueOf(((b.c.a)localObject).startTime), Long.valueOf(((b.c.a)localObject).endTime), Integer.valueOf(i) });
      if ((((b.c.a)localObject).startTime <= i) && (((b.c.a)localObject).endTime >= i))
      {
        if (localc.rGY.getOnGestureListener() != null)
          break label284;
        al.d(new c.4(localc, (b.c.a)localObject, paramb));
        AppMethodBeat.o(40095);
      }
    }
    while (true)
    {
      return;
      al.d(new c.5(localc));
      label284: AppMethodBeat.o(40095);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.c.a.c.2
 * JD-Core Version:    0.6.2
 */