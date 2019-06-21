package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.h.b;
import com.tencent.mm.plugin.exdevice.i.k;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.Iterator;
import java.util.List;

final class e$c
  implements Runnable
{
  List<b> foD;

  public e$c(List<b> paramList)
  {
    Object localObject;
    this.foD = localObject;
  }

  public final void run()
  {
    AppMethodBeat.i(19215);
    ab.i("MicroMsg.exdevice.ExdeviceEventManager", "Wifi device heart beat");
    if ((this.foD != null) && (this.foD.size() > 0))
    {
      Iterator localIterator = this.foD.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (b)localIterator.next();
        localObject = new k(((b)localObject).field_brandName, ((b)localObject).field_deviceType, ((b)localObject).field_deviceID, 1);
        u.bpy().a((ae)localObject);
      }
      this.lsq.mHandler.postDelayed(this, 300000L);
    }
    AppMethodBeat.o(19215);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.e.c
 * JD-Core Version:    0.6.2
 */