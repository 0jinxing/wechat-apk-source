package com.tencent.mm.plugin.ipcall.a.c;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.plugin.ipcall.a.d.o;
import com.tencent.mm.plugin.ipcall.a.g;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class a$1 extends ak
{
  a$1(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(21822);
    if ((paramMessage == null) || (paramMessage.what != 59998))
    {
      super.handleMessage(paramMessage);
      AppMethodBeat.o(21822);
      return;
    }
    ab.d("MicroMsg.IPCallEngineManager", "msg.what: %d, msg.obj: %s, msg.arg1: %s, msg.arg2: %s", new Object[] { Integer.valueOf(paramMessage.what), paramMessage.obj, Integer.valueOf(paramMessage.arg1), Integer.valueOf(paramMessage.arg2) });
    switch (paramMessage.arg1)
    {
    case 7:
    case 8:
    default:
    case 6:
    case 3:
    case 4:
    case 5:
    case 9:
    case 10:
    }
    while (true)
    {
      AppMethodBeat.o(21822);
      break;
      paramMessage = this.nxD;
      ab.d("MicroMsg.IPCallEngineManager", "channel connect!");
      if (paramMessage.nxA)
      {
        ab.d("MicroMsg.IPCallEngineManager", "channel already connect! do call not startEngine again");
        AppMethodBeat.o(21822);
        break;
      }
      int i = paramMessage.nxx.startEngine();
      ab.d("MicroMsg.IPCallEngineManager", "startNativeEngine, ret: %d", new Object[] { Integer.valueOf(i) });
      if (i == 0);
      for (paramMessage.nxx.sUA = 0; ; paramMessage.nxx.sUA = 1)
      {
        paramMessage.nxx.setInactive();
        paramMessage.nxA = true;
        if (paramMessage.nxC != null)
          paramMessage.nxC.bGQ();
        AppMethodBeat.o(21822);
        break;
      }
      ab.d("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_STARTDEV");
      AppMethodBeat.o(21822);
      break;
      ab.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_STARTDEVFAILED");
      paramMessage = this.nxD;
      ab.d("MicroMsg.IPCallEngineManager", "handleStartDevFailed");
      if (paramMessage.nxC != null)
        paramMessage.nxC.bGP();
      AppMethodBeat.o(21822);
      break;
      ab.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_RESET");
      if (paramMessage.arg2 == 4)
      {
        ab.i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_BROKEN");
        a.a(this.nxD, 34);
        AppMethodBeat.o(21822);
        break;
      }
      if (paramMessage.arg2 == 1)
      {
        ab.i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_FAIL");
        a.a(this.nxD, 20);
        AppMethodBeat.o(21822);
        break;
      }
      if (paramMessage.arg2 == 5)
      {
        ab.i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_NETWORK_ERROR");
        a.a(this.nxD, 30);
        AppMethodBeat.o(21822);
        break;
        ab.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_FIRST_PKT");
        AppMethodBeat.o(21822);
        break;
        ab.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_ANSWER_MARK");
        ab.i("MicroMsg.IPCallEngineManager", "handleChannelAccept");
        paramMessage = i.bHq();
        ab.i("MicroMsg.IPCallSvrLogic", "handleChannelAccept");
        if (paramMessage.cJn)
        {
          ab.i("MicroMsg.IPCallSvrLogic", "current status has accepted, ignore channel accept");
          AppMethodBeat.o(21822);
          break;
        }
        paramMessage.nvP = true;
        if (paramMessage.nvN != null)
        {
          paramMessage.nvN.hGH = 2;
          o localo = new o(paramMessage.nvN.nwu, paramMessage.nvN.nwv, paramMessage.nvN.bHG(), paramMessage.nvN.nww, true);
          aw.Rg().a(localo, 0);
        }
        paramMessage.xj(2);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.c.a.1
 * JD-Core Version:    0.6.2
 */