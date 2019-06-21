package com.tencent.mm.plugin.exdevice.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.exdevice.e.e;
import com.tencent.mm.plugin.exdevice.service.p;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import junit.framework.Assert;

public class a
  implements c
{
  private long lwo = -1L;
  protected com.tencent.mm.plugin.exdevice.b.c lxu = null;
  protected d lxv = null;
  private m lxw = null;

  public a(com.tencent.mm.plugin.exdevice.b.c paramc, d paramd)
  {
    this.lxu = paramc;
    this.lxv = paramd;
  }

  public final void a(long paramLong, int paramInt1, int paramInt2, String paramString, p paramp)
  {
    AppMethodBeat.i(19728);
    ab.i("MicroMsg.exdevice.ExDeviceTask", "------onTaskEnd------ taskId = %d, errType = %d, errCode = %d, errMsg = %s, deviceId = %d, reqCmdId = %d, respCmdId = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Long.valueOf(this.lxu.jJa), Short.valueOf(this.lxu.bor()), Short.valueOf(this.lxu.lqB) });
    long l = this.lxu.jJa;
    if (paramInt1 == 0);
    for (int i = 1; ; i = 0)
    {
      com.tencent.mm.plugin.exdevice.g.a.n(l, i);
      if ((paramp == null) || (paramp == this.lxw))
        break;
      ab.e("MicroMsg.exdevice.ExDeviceTask", "netCmd != mRemoteTask");
      AppMethodBeat.o(19728);
      return;
    }
    if ((-1 == paramInt1) && (-2 == paramInt2))
      ab.e("MicroMsg.exdevice.ExDeviceTask", "Time Out in local!!!");
    if (this.lxu.lqC != null)
    {
      i = this.lxu.lqC.luT;
      label183: if ((-5 == i) || (-3 == i) || (-4 == i))
      {
        ab.w("MicroMsg.exdevice.ExDeviceTask", "ErrorCode = %d, destroy channel(deviceId = %d)", new Object[] { Integer.valueOf(this.lxu.lqC.luT), Long.valueOf(this.lxu.jJa) });
        if ((u.bpy().lqX == null) || (!u.bpy().lqX.hZ(this.lxu.jJa)))
          break label331;
      }
    }
    label331: for (i = 1; ; i = 0)
    {
      if (i == 0)
        ab.e("MicroMsg.exdevice.ExDeviceTask", "stopChannel Failed!!!");
      if (this.lxv != null)
        this.lxv.a(paramLong, paramInt1, paramInt2, paramString);
      this.lxw = null;
      AppMethodBeat.o(19728);
      break;
      i = 0;
      break label183;
    }
  }

  public final void a(d paramd)
  {
    this.lxv = paramd;
  }

  public final boolean b(com.tencent.mm.plugin.exdevice.service.m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(19727);
    if (paramm == null)
    {
      ab.e("MicroMsg.exdevice.ExDeviceTask", "dispatcher is null");
      AppMethodBeat.o(19727);
    }
    while (true)
    {
      return bool;
      if (this.lxw != null)
      {
        ab.e("MicroMsg.exdevice.ExDeviceTask", "Prev task is still working!!!");
        AppMethodBeat.o(19727);
      }
      else
      {
        ab.i("MicroMsg.exdevice.ExDeviceTask", "------startTask begin------cmdReqId = %d, cmdRespId = %d, deviceId = %d", new Object[] { Short.valueOf(this.lxu.bor()), Short.valueOf(this.lxu.lqB), Long.valueOf(this.lxu.jJa) });
        m localm = new m(this.lxu, this);
        long l = paramm.a(localm);
        if (-1L == l)
        {
          ab.e("MicroMsg.exdevice.ExDeviceTask", "dispatcher.startTask Failed!!!");
          AppMethodBeat.o(19727);
        }
        else
        {
          this.lxw = localm;
          this.lwo = l;
          paramm = this.lxw;
          Assert.assertNotNull(paramm.lxR);
          paramm = paramm.lxR;
          paramm.lxK = false;
          paramm.lxL = false;
          aw.RS().doN().postDelayed(paramm.lxM, 15000L);
          AppMethodBeat.o(19727);
          bool = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.i.a
 * JD-Core Version:    0.6.2
 */