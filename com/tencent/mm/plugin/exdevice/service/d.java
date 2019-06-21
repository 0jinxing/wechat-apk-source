package com.tencent.mm.plugin.exdevice.service;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.l;
import com.tencent.mm.sdk.platformtools.ab;

public final class d
{
  public static boolean dI(Context paramContext)
  {
    AppMethodBeat.i(19576);
    boolean bool;
    if (l.bL(paramContext))
    {
      ab.i("MicroMsg.exdevice.ExDeviceServiceHelper", "fully exited, no need to start service");
      bool = false;
      AppMethodBeat.o(19576);
    }
    while (true)
    {
      return bool;
      paramContext = new Intent(paramContext, ExDeviceService.class);
      paramContext.setFlags(268435456);
      com.tencent.mm.bp.d.j(paramContext, "exdevice");
      bool = true;
      AppMethodBeat.o(19576);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.d
 * JD-Core Version:    0.6.2
 */