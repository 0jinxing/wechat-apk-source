package com.tencent.mm.plugin.sight.decode.ui;

import android.util.Base64;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.sight.base.d;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class c$1
  implements e.a
{
  c$1(c paramc)
  {
  }

  public final void EA()
  {
    AppMethodBeat.i(70281);
    ab.d("MicroMsg.VideoPopupHelper", "on completion");
    c.d(this.qyT).post(new c.1.2(this));
    c.b(this.qyT).setLoop(true);
    c.a(this.qyT);
    AppMethodBeat.o(70281);
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    return 0;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(70280);
    ab.e("MicroMsg.VideoPopupHelper", "on play video error, what %d extra %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    c.b(this.qyT).stop();
    b.A(Base64.encodeToString((d.ckW() + "[SightPopupHelper] on play video error, what " + paramInt1 + " extra " + paramInt2 + ", path=" + bo.bc(c.c(this.qyT), "")).getBytes(), 2), "FullScreenPlaySight");
    String str = c.c(this.qyT);
    al.d(new c.1.1(this, o.ahl().a(str, a.getDensity(this.qyT.getContext()), this.qyT.getContext(), -1), str));
    AppMethodBeat.o(70280);
  }

  public final void pL()
  {
    AppMethodBeat.i(70279);
    ab.d("MicroMsg.VideoPopupHelper", com.tencent.mm.compatible.util.g.Mp() + " onPrepared");
    c.a(this.qyT);
    AppMethodBeat.o(70279);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.c.1
 * JD-Core Version:    0.6.2
 */