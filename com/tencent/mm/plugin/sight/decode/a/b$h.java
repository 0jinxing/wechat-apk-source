package com.tencent.mm.plugin.sight.decode.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.Map;
import java.util.Queue;

final class b$h
  implements Runnable
{
  volatile boolean ovl = false;

  private b$h(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(70241);
    if (b.c(this.qxW))
    {
      ab.e("MicroMsg.SightPlayController", "is bad fps, do nothing when open file");
      AppMethodBeat.o(70241);
    }
    int i;
    label238: int j;
    while (true)
    {
      return;
      b localb = this.qxW;
      String str = b.a(this.qxW);
      if (1 == b.d(this.qxW));
      for (i = 0; ; i = 1)
      {
        b.a(localb, SightVideoJNI.openFile(str, i, 1, false));
        ab.i("MicroMsg.SightPlayController", "SightVideoJNI.openFile mVideoPath:%s mVideoId:%s", new Object[] { b.a(this.qxW), Integer.valueOf(b.e(this.qxW)) });
        b.f(this.qxW).offer(Integer.valueOf(b.e(this.qxW)));
        if (b.e(this.qxW) >= 0)
          break label238;
        ab.w("MicroMsg.SightPlayController", "#0x%x-#0x%x error video id %d, path %s", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.qxW.hashCode()), Integer.valueOf(b.e(this.qxW)), b.a(this.qxW) });
        this.qxW.T(null);
        if (b.b(this.qxW) != null)
          b.b(this.qxW).c(this.qxW, -1);
        AppMethodBeat.o(70241);
        break;
      }
      if (((Boolean)g.RP().Ry().get(344065, Boolean.FALSE)).booleanValue())
      {
        if (b.g(this.qxW) == null)
          b.a(this.qxW, new b.j(this.qxW, (byte)0));
        b.h(this.qxW).removeCallbacks(b.g(this.qxW));
        b.h(this.qxW).post(b.g(this.qxW));
      }
      i = Math.max(1, SightVideoJNI.getVideoWidth(b.e(this.qxW)));
      j = Math.max(1, SightVideoJNI.getVideoHeight(b.e(this.qxW)));
      if (b.d(this.qxW) == 0)
      {
        if ((i * j >= 1048576) || (i <= 0) || (j <= 0))
        {
          ab.e("MicroMsg.SightPlayController", "get error info videoWidth %d height  %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          AppMethodBeat.o(70241);
        }
        else
        {
          b.a(this.qxW, i, j);
        }
      }
      else
      {
        this.qxW.clc();
        if ((Float.compare(i / j, 5.0F) <= 0) && (Float.compare(j / i, 5.0F) <= 0))
          break;
        ab.w("MicroMsg.SightPlayController", "ERROR Video size %d, %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        if (!bo.isNullOrNil(b.a(this.qxW)))
          b.clf().put(b.a(this.qxW), Integer.valueOf(2));
        b.a(this.qxW, 0L);
        b.a(this.qxW, b.f(this.qxW));
        b.a(this.qxW, -1);
        b.a(this.qxW, "");
        b.b(this.qxW, "ERROR#PATH");
        b.a(this.qxW, null);
        this.ovl = true;
        if (b.b(this.qxW) != null)
          b.b(this.qxW).c(this.qxW, -1);
        AppMethodBeat.o(70241);
      }
    }
    this.qxW.dH(i, j);
    if (1 == b.d(this.qxW))
    {
      b.a(this.qxW, new b.b(this.qxW, (byte)0));
      b.a(this.qxW, null);
      if (!this.ovl)
        o.i(b.i(this.qxW), 0L);
    }
    while (true)
    {
      if (this.ovl)
        ab.e("MicroMsg.SightPlayController", "#0x%x-#0x%x open file end, match stop %B", new Object[] { Integer.valueOf(this.qxW.hashCode()), Integer.valueOf(hashCode()), Boolean.valueOf(this.ovl) });
      AppMethodBeat.o(70241);
      break;
      b.a(this.qxW, new b.b(this.qxW, (byte)0));
      b.a(this.qxW, new b.c(this.qxW));
      b.i(this.qxW).qyb = b.j(this.qxW);
      b.j(this.qxW).qye = b.i(this.qxW);
      if (!this.ovl)
        o.i(b.i(this.qxW), 0L);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.a.b.h
 * JD-Core Version:    0.6.2
 */