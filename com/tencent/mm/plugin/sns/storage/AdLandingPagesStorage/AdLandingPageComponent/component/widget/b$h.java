package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class b$h
  implements Runnable
{
  volatile boolean ovl = false;

  private b$h(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37424);
    if (b.c(this.rct))
    {
      ab.e("MicroMsg.SightPlayController", "is bad fps, do nothing when open file");
      AppMethodBeat.o(37424);
    }
    int i;
    label176: int j;
    while (true)
    {
      return;
      b localb = this.rct;
      String str = b.a(this.rct);
      if (1 == b.d(this.rct));
      for (i = 0; ; i = 1)
      {
        b.a(localb, SightVideoJNI.openFile(str, i, 1, false));
        if (b.e(this.rct) >= 0)
          break label176;
        ab.w("MicroMsg.SightPlayController", "#0x%x-#0x%x error video id %d, path %s", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.rct.hashCode()), Integer.valueOf(b.e(this.rct)), b.a(this.rct) });
        this.rct.cpV();
        if (b.b(this.rct) != null)
          b.b(this.rct).Ds(-1);
        AppMethodBeat.o(37424);
        break;
      }
      if (((Boolean)AdLandingPagesProxy.getInstance().getCfg(344065, Boolean.FALSE)).booleanValue())
      {
        if (b.f(this.rct) == null)
          b.a(this.rct, new b.j(this.rct, (byte)0));
        b.g(this.rct).removeCallbacks(b.f(this.rct));
        b.g(this.rct).post(b.f(this.rct));
      }
      j = Math.max(1, SightVideoJNI.getVideoWidth(b.e(this.rct)));
      i = Math.max(1, SightVideoJNI.getVideoHeight(b.e(this.rct)));
      if (b.d(this.rct) == 0)
      {
        if ((j * i >= 1048576) || (j <= 0) || (i <= 0))
        {
          ab.e("MicroMsg.SightPlayController", "get error info videoWidth %d height  %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
          AppMethodBeat.o(37424);
        }
        else
        {
          b.a(this.rct, j, i);
        }
      }
      else
      {
        this.rct.clc();
        if ((Float.compare(j / i, 5.0F) <= 0) && (Float.compare(i / j, 5.0F) <= 0))
          break;
        ab.w("MicroMsg.SightPlayController", "ERROR Video size %d, %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        if (!bo.isNullOrNil(b.a(this.rct)))
          b.cpW().put(b.a(this.rct), Integer.valueOf(2));
        b.a(this.rct, 0L);
        b.b(this.rct, b.e(this.rct));
        b.a(this.rct, -1);
        b.a(this.rct, "");
        b.b(this.rct, "ERROR#PATH");
        b.a(this.rct, null);
        this.ovl = true;
        if (b.b(this.rct) != null)
          b.b(this.rct).Ds(-1);
        AppMethodBeat.o(37424);
      }
    }
    this.rct.dH(j, i);
    if (1 == b.d(this.rct))
    {
      b.a(this.rct, new b.b(this.rct, (byte)0));
      b.a(this.rct, null);
      if (!this.ovl)
        o.i(b.h(this.rct), 0L);
    }
    while (true)
    {
      if (this.ovl)
        ab.e("MicroMsg.SightPlayController", "#0x%x-#0x%x open file end, match stop %B", new Object[] { Integer.valueOf(this.rct.hashCode()), Integer.valueOf(hashCode()), Boolean.valueOf(this.ovl) });
      AppMethodBeat.o(37424);
      break;
      b.a(this.rct, new b.b(this.rct, (byte)0));
      b.a(this.rct, new b.c(this.rct));
      b.h(this.rct).rcu = b.i(this.rct);
      b.i(this.rct).rcw = b.h(this.rct);
      if (!this.ovl)
        o.i(b.h(this.rct), 0L);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b.h
 * JD-Core Version:    0.6.2
 */