package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.i.d;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public final class c
  implements d
{
  private static c lqW;
  private byte[] ecf;
  private al fPG;
  private final Map<Integer, Set<d>> ftE;
  public m lqX;
  c.a lqY;
  Vector<ae> lqZ;

  public c()
  {
    AppMethodBeat.i(19092);
    this.ftE = new HashMap();
    this.ecf = new byte[0];
    this.lqZ = new Vector();
    this.fPG = new al("ExdeviceHandlerThread");
    AppMethodBeat.o(19092);
  }

  public static c boB()
  {
    AppMethodBeat.i(19094);
    if (lqW == null)
      lqW = new c();
    c localc = lqW;
    AppMethodBeat.o(19094);
    return localc;
  }

  public final void a(long paramLong, int paramInt1, int paramInt2, String arg5)
  {
    AppMethodBeat.i(19096);
    ab.i("MicroMsg.exdevice.ExDeviceTaskService", "onTaskSceneEnd, taskid =%d, errType =%d, errCode = %d, errMsg =%s, wattingtask size : %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), ???, Integer.valueOf(this.lqZ.size()) });
    synchronized (this.ecf)
    {
      boC();
      AppMethodBeat.o(19096);
      return;
    }
  }

  public final boolean a(ae paramae)
  {
    AppMethodBeat.i(19093);
    this.fPG.aa(new c.2(this, paramae));
    AppMethodBeat.o(19093);
    return true;
  }

  final void boC()
  {
    AppMethodBeat.i(19095);
    ab.i("MicroMsg.exdevice.ExDeviceTaskService", "now watting task size is %d", new Object[] { Integer.valueOf(this.lqZ.size()) });
    if (!this.lqZ.isEmpty())
      a((ae)this.lqZ.remove(0));
    AppMethodBeat.o(19095);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.c
 * JD-Core Version:    0.6.2
 */