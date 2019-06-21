package com.tencent.mm.plugin.exdevice.b;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ce;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.exdevice.i.h;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.model.e;
import com.tencent.mm.plugin.exdevice.model.w;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.protobuf.asu;
import com.tencent.mm.protocal.protobuf.bwh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import junit.framework.Assert;

final class k$a extends ak
{
  public k$a(k paramk, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(19054);
    ab.i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "handleMessage msg.what = %d", new Object[] { Integer.valueOf(paramMessage.what) });
    switch (paramMessage.what)
    {
    default:
      ab.f("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "unknown message type = %d", new Object[] { Integer.valueOf(paramMessage.what) });
      AppMethodBeat.o(19054);
    case 1:
    case 2:
    case 0:
    case 3:
    }
    while (true)
    {
      return;
      Object localObject1 = (f)paramMessage.obj;
      if (!u.bpx().hX(((c)localObject1).jJa))
      {
        ab.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "This device send other cmd before do auth, device id = %d", new Object[] { Long.valueOf(((c)localObject1).jJa) });
        ((f)localObject1).f(-2, "", new byte[0]);
        paramMessage = new h((f)localObject1);
        u.bpy().a(paramMessage);
        AppMethodBeat.o(19054);
      }
      else if ((-5 == paramMessage.arg1) || (-3 == paramMessage.arg1) || (-4 == paramMessage.arg1))
      {
        ab.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Error Code = %d, reply errorcode to device and close channel", new Object[] { Integer.valueOf(paramMessage.arg1) });
        ((f)localObject1).f(-1, "", new byte[0]);
        paramMessage = new h((f)localObject1);
        u.bpy().a(paramMessage);
        AppMethodBeat.o(19054);
      }
      else
      {
        com.tencent.mm.plugin.exdevice.h.b localb = ad.boW().Ku(((c)localObject1).jJa);
        if (localb == null)
        {
          ab.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
          AppMethodBeat.o(19054);
        }
        else
        {
          long l = localb.dFi;
          if (System.currentTimeMillis() / 1000L < l)
          {
            ab.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "device has been blocked");
            ((f)localObject1).f(-5, "Device Is Block", null);
            paramMessage = new h((f)localObject1);
            u.bpy().a(paramMessage);
            AppMethodBeat.o(19054);
          }
          else
          {
            l = k.f.boz();
            com.tencent.mm.plugin.exdevice.e.k localk = (com.tencent.mm.plugin.exdevice.e.k)((f)localObject1).bou();
            if (localk == null)
            {
              ab.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "SendDataToManufacturerSvr Request parse failed!!!, Tell device before stop this task");
              ((f)localObject1).f(-4, "Decode failed", null);
              paramMessage = new h((f)localObject1);
              u.bpy().a(paramMessage);
              AppMethodBeat.o(19054);
            }
            else
            {
              Object localObject2 = (Integer)k.b(this.lqK).get(localb.field_deviceID);
              paramMessage = (Message)localObject2;
              if (localObject2 == null)
                paramMessage = Integer.valueOf(0);
              ab.i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "SendDataDirection = %s", new Object[] { paramMessage });
              if (paramMessage.intValue() == 0)
              {
                if (localk.jCt == 10001)
                {
                  ad.bph();
                  e.d(localb.field_deviceID, localb.field_brandName, localk.jBi.toByteArray());
                  AppMethodBeat.o(19054);
                }
                else
                {
                  paramMessage = new w(((c)localObject1).jJa, localb.field_deviceType, localb.field_deviceID, l, bo.anU(), localk.jBi.toByteArray(), localk.jCt);
                  aw.Rg().a(paramMessage, 0);
                  localObject2 = new k.d(this.lqK, l);
                  k.a(this.lqK).postDelayed((Runnable)localObject2, 30000L);
                  paramMessage = new k.e((byte)0);
                  paramMessage.a((f)localObject1);
                  paramMessage.a((k.d)localObject2);
                  paramMessage.lqQ = 0;
                  k.c(this.lqK).put(Long.valueOf(l), paramMessage);
                  AppMethodBeat.o(19054);
                }
              }
              else
              {
                if ((paramMessage.intValue() & 0x1) != 0)
                {
                  ad.bph();
                  e.d(localb.field_deviceID, localb.field_brandName, localk.jBi.toByteArray());
                }
                if ((paramMessage.intValue() & 0x2) != 0)
                {
                  paramMessage = new w(((c)localObject1).jJa, localb.field_deviceType, localb.field_deviceID, l, bo.anU(), localk.jBi.toByteArray(), localk.jCt);
                  aw.Rg().a(paramMessage, 0);
                  paramMessage = new k.d(this.lqK, l);
                  k.a(this.lqK).postDelayed(paramMessage, 30000L);
                  localObject2 = new k.e((byte)0);
                  ((k.e)localObject2).a((f)localObject1);
                  ((k.e)localObject2).a(paramMessage);
                  ((k.e)localObject2).lqQ = 0;
                  k.c(this.lqK).put(Long.valueOf(l), localObject2);
                }
                AppMethodBeat.o(19054);
                continue;
                localObject2 = (k.b)paramMessage.obj;
                if ((((k.b)localObject2).lqL == 0) && (((k.b)localObject2).lqz == 0))
                {
                  AppMethodBeat.o(19054);
                }
                else
                {
                  paramMessage = (w)((k.b)localObject2).lqM;
                  Assert.assertNotNull(paramMessage.lty);
                  l = ((bwh)paramMessage.lty.fsG.fsP).wWW.wwE;
                  paramMessage = (k.e)k.c(this.lqK).get(Long.valueOf(l));
                  if (paramMessage == null)
                  {
                    ab.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId = %d", new Object[] { Long.valueOf(l) });
                    AppMethodBeat.o(19054);
                  }
                  else
                  {
                    localObject1 = paramMessage.box();
                    switch (((k.b)localObject2).lqz)
                    {
                    default:
                    case -417:
                    }
                    for (int i = -1; ; i = -5)
                    {
                      ((f)localObject1).f(i, ((k.b)localObject2).hxN, null);
                      localObject2 = new h(paramMessage.box());
                      u.bpy().a((ae)localObject2);
                      k.a(this.lqK).removeCallbacks(paramMessage.boy());
                      k.c(this.lqK).remove(Long.valueOf(l));
                      AppMethodBeat.o(19054);
                      break;
                    }
                    l = ((Long)paramMessage.obj).longValue();
                    paramMessage = (k.e)k.c(this.lqK).get(Long.valueOf(l));
                    if (paramMessage == null)
                    {
                      ab.w("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId(%d), or response has been send", new Object[] { Long.valueOf(l) });
                      AppMethodBeat.o(19054);
                    }
                    else
                    {
                      paramMessage.box().f(-1, "", null);
                      paramMessage = new h(paramMessage.box());
                      u.bpy().a(paramMessage);
                      k.c(this.lqK).remove(Long.valueOf(l));
                      AppMethodBeat.o(19054);
                      continue;
                      localObject2 = (k.c)paramMessage.obj;
                      paramMessage = (k.e)k.c(this.lqK).get(Long.valueOf(((k.c)localObject2).mSessionId));
                      if (paramMessage == null)
                      {
                        ab.w("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId = %d", new Object[] { Long.valueOf(((k.c)localObject2).mSessionId) });
                        AppMethodBeat.o(19054);
                      }
                      else
                      {
                        paramMessage.lqO.f(0, "", ((k.c)localObject2).mData);
                        localObject1 = new h(paramMessage.box());
                        u.bpy().a((ae)localObject1);
                        k.a(this.lqK).removeCallbacks(paramMessage.boy());
                        k.c(this.lqK).remove(Long.valueOf(((k.c)localObject2).mSessionId));
                        AppMethodBeat.o(19054);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.k.a
 * JD-Core Version:    0.6.2
 */