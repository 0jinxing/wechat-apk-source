package com.tencent.mm.plugin.exdevice.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.Vector;

final class c$2
  implements Runnable
{
  c$2(c paramc, ae paramae)
  {
  }

  public final void run()
  {
    int i = 1;
    AppMethodBeat.i(19091);
    c localc = this.lra;
    ae localae = this.lrb;
    if (localc.lqX == null)
    {
      ab.w("MicroMsg.exdevice.ExDeviceTaskService", "dispathcer is null, now try to reset it");
      if (localc.lqY != null)
      {
        ab.i("MicroMsg.exdevice.ExDeviceTaskService", "prepare dispatcher is not null. not prepare it");
        localc.lqY.boD();
        new ap(Looper.getMainLooper(), new c.1(localc), true).ae(100L, 100L);
        i = 0;
      }
    }
    else
    {
      if (i == 0)
        break label116;
      localae.a(localc.lqX, localc);
      AppMethodBeat.o(19091);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.exdevice.ExDeviceTaskService", "prepare dispatcher is null");
      break;
      label116: localc.lqZ.add(localae);
      AppMethodBeat.o(19091);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.c.2
 * JD-Core Version:    0.6.2
 */