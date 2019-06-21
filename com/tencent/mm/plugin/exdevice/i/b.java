package com.tencent.mm.plugin.exdevice.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.b.h;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends a
  implements d
{
  private final d lxx;

  public b(com.tencent.mm.plugin.exdevice.b.c paramc, d paramd)
  {
    super(paramc, paramd);
    AppMethodBeat.i(19729);
    a(this);
    this.lxx = paramd;
    AppMethodBeat.o(19729);
  }

  public final void a(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(19730);
    ab.i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "onTaskSceneEnd, SwitchViewPush taskId = %d, errType = %d, errCode = %d, errMsg = %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    com.tencent.mm.plugin.exdevice.h.b localb;
    if (2 == ((h)this.lxu).bov())
    {
      ab.i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "Switch view push has been sended to device, now try to check close strategy");
      localb = ad.boW().Ku(this.lxu.jJa);
      if (localb == null)
      {
        ab.e("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "get hdinfo by mac failed!!!, Mac = %d", new Object[] { Long.valueOf(this.lxu.jJa) });
        if (this.lxx != null)
          this.lxx.a(paramLong, paramInt1, paramInt2, paramString);
        AppMethodBeat.o(19730);
        return;
      }
      switch (localb.field_closeStrategy)
      {
      default:
        ab.e("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "Error close strategy(%d)", new Object[] { Integer.valueOf(localb.field_closeStrategy) });
      case 1:
      case 2:
      }
    }
    while (true)
    {
      if (this.lxx != null)
        this.lxx.a(paramLong, paramInt1, paramInt2, paramString);
      AppMethodBeat.o(19730);
      break;
      ab.i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "the close Strategy is %d, stop channel(device id = %d)", new Object[] { Integer.valueOf(localb.field_closeStrategy), Long.valueOf(this.lxu.jJa) });
      if (u.bpy().lqX != null)
      {
        u.bpy().lqX.hZ(this.lxu.jJa);
        continue;
        ab.i("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "the close Strategy is %d, Record it(%d) in the shut down device list", new Object[] { Integer.valueOf(localb.field_closeStrategy), Long.valueOf(this.lxu.jJa) });
        if (!com.tencent.mm.plugin.exdevice.h.a.D("shut_down_device", this.lxu.jJa))
          ab.e("MicroMsg.exdevice.ExDeviceTaskSwitchViewPush", "MMExDeviceCore.getDeviceInfoManager().addShutDownDevice failed!!!");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.i.b
 * JD-Core Version:    0.6.2
 */