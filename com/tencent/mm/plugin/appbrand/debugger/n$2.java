package com.tencent.mm.plugin.appbrand.debugger;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.appbrand.l.k.b;
import com.tencent.mm.plugin.appbrand.r.d;
import com.tencent.mm.protocal.protobuf.cqs;
import com.tencent.mm.protocal.protobuf.cqz;
import com.tencent.mm.protocal.protobuf.crf;
import com.tencent.mm.protocal.protobuf.crh;
import com.tencent.mm.protocal.protobuf.crk;
import com.tencent.mm.protocal.protobuf.crl;
import com.tencent.mm.protocal.protobuf.crm;
import com.tencent.mm.protocal.protobuf.cro;
import com.tencent.mm.protocal.protobuf.crr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Timer;

final class n$2
  implements k.b
{
  n$2(n paramn)
  {
  }

  public final void K(int paramInt, String paramString)
  {
    int i = 1;
    AppMethodBeat.i(101834);
    ab.i("MicroMsg.RemoteDebugJsEngine", "onSocketClose code:%d reason:%s ", new Object[] { Integer.valueOf(paramInt), paramString });
    l locall = this.hjY.hjR;
    if ((!locall.azc()) && (locall.hjJ < 10L));
    for (paramInt = i; ; paramInt = 0)
    {
      if (paramInt != 0)
      {
        com.tencent.mm.plugin.appbrand.r.m.aNS().m(new n.2.1(this), 1000L);
        locall = this.hjY.hjR;
        locall.hjJ += 1;
      }
      this.hjY.hjU.azo();
      this.hjY.hjR.hjx = System.currentTimeMillis();
      this.hjY.hjW.azw();
      this.hjY.hjR.setStatus(5);
      this.hjY.hjW.zQ(paramString);
      AppMethodBeat.o(101834);
      return;
    }
  }

  public final void azg()
  {
    AppMethodBeat.i(101830);
    ab.i("MicroMsg.RemoteDebugJsEngine", "onSocketOpen");
    this.hjY.hjR.hjx = System.currentTimeMillis();
    this.hjY.hjR.hjJ = 0;
    if (!bo.isNullOrNil(this.hjY.hjR.ayY()))
      n.a(this.hjY);
    p localp = this.hjY.hjU;
    localp.azo();
    localp.mTimer = new Timer();
    p.4 local4 = new p.4(localp);
    localp.mTimer.schedule(local4, 100L, 1000L);
    AppMethodBeat.o(101830);
  }

  public final void azh()
  {
    AppMethodBeat.i(101832);
    this.hjY.hjR.hjx = System.currentTimeMillis();
    AppMethodBeat.o(101832);
  }

  public final void l(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(101833);
    this.hjY.hjR.hjx = System.currentTimeMillis();
    try
    {
      localObject1 = d.q(paramByteBuffer);
      paramByteBuffer = new com/tencent/mm/protocal/protobuf/cqs;
      paramByteBuffer.<init>();
      paramByteBuffer = (cqs)paramByteBuffer.parseFrom((byte[])localObject1);
      if (paramByteBuffer.wdt == null)
      {
        ab.w("MicroMsg.RemoteDebugJsEngine", "dataFormat.data is null");
        AppMethodBeat.o(101833);
        return;
      }
      localObject1 = paramByteBuffer.wdt.wR;
      switch (paramByteBuffer.Cn)
      {
      default:
      case 1006:
        while (true)
        {
          ab.i("MicroMsg.RemoteDebugJsEngine", "onSocketMessage cmd: %d", new Object[] { Integer.valueOf(paramByteBuffer.Cn) });
          AppMethodBeat.o(101833);
          break;
          localObject2 = new com/tencent/mm/protocal/protobuf/crh;
          ((crh)localObject2).<init>();
          localObject1 = (crh)((crh)localObject2).parseFrom((byte[])localObject1);
          localObject2 = this.hjY.hjU;
          if (t.a(((p)localObject2).hjR, paramByteBuffer, ((crh)localObject1).xoW, ((p)localObject2).hjW, (p)localObject2))
          {
            ab.d("MicroMsg.RemoteDebugMsgMrg", "onSendMsgResult %d/%d", new Object[] { Integer.valueOf(((crh)localObject1).xoX), Integer.valueOf(((crh)localObject1).xoY) });
            ((p)localObject2).hjR.cU(((crh)localObject1).xoX, ((crh)localObject1).xoY);
            ((p)localObject2).cW(((crh)localObject1).xoX, ((crh)localObject1).xoY);
          }
          q.a(paramByteBuffer, (k)this.hjY.hjR.hjG.get(paramByteBuffer.eCq));
        }
      case 1001:
      case 1002:
      case 1003:
      case 1004:
      case 1005:
      case 2006:
      case 3001:
      case 3002:
      }
    }
    catch (Throwable paramByteBuffer)
    {
      while (true)
      {
        ab.e("MicroMsg.RemoteDebugJsEngine", "onSocketMessage %s", new Object[] { Log.getStackTraceString(paramByteBuffer) });
        AppMethodBeat.o(101833);
        continue;
        Object localObject2 = new com/tencent/mm/protocal/protobuf/crk;
        ((crk)localObject2).<init>();
        Object localObject1 = (crk)((crk)localObject2).parseFrom((byte[])localObject1);
        t.a(this.hjY.hjR, paramByteBuffer, ((crk)localObject1).xoW, this.hjY.hjW, this.hjY.hjU);
        this.hjY.hjR.hjx = System.currentTimeMillis();
        continue;
        localObject2 = new com/tencent/mm/protocal/protobuf/cro;
        ((cro)localObject2).<init>();
        localObject2 = (cro)((cro)localObject2).parseFrom((byte[])localObject1);
        localObject1 = this.hjY;
        if (t.a(((n)localObject1).hjR, paramByteBuffer, ((cro)localObject2).xoW, ((n)localObject1).hjW, ((n)localObject1).hjU))
        {
          ab.i("MicroMsg.RemoteDebugJsEngine", "onLogin");
          if (((cro)localObject2).xpg == null)
          {
            ab.e("MicroMsg.RemoteDebugJsEngine", "onLogin room info is null");
          }
          else if (((cro)localObject2).xpg.xoO)
          {
            ((n)localObject1).hjR.hjs = ((cro)localObject2).xpg;
            ((n)localObject1).onReady();
          }
          else
          {
            ab.i("MicroMsg.RemoteDebugJsEngine", "joinRoom");
            ((n)localObject1).hjR.setStatus(2);
            localObject2 = new com/tencent/mm/protocal/protobuf/crl;
            ((crl)localObject2).<init>();
            ((crl)localObject2).xoU = ((n)localObject1).hjR.hjo;
            ((crl)localObject2).xoP = ((n)localObject1).hjR.hjt.ehq;
            ((crl)localObject2).username = "";
            ((crl)localObject2).xpf = ((n)localObject1).hjR.hjt.hjM;
            localObject2 = t.a(1003, (a)localObject2);
            ((n)localObject1).hjT.a((cqs)localObject2);
            continue;
            localObject2 = new com/tencent/mm/protocal/protobuf/crm;
            ((crm)localObject2).<init>();
            localObject1 = (crm)((crm)localObject2).parseFrom((byte[])localObject1);
            if (t.a(this.hjY.hjR, paramByteBuffer, ((crm)localObject1).xoW, this.hjY.hjW, this.hjY.hjU))
            {
              n.b(this.hjY);
              continue;
              if (this.hjY.hjV.isRunning())
              {
                localObject1 = this.hjY.hjU;
                ab.i("MicroMsg.RemoteDebugMsgMrg", "onQuit");
                ((p)localObject1).azm();
                localObject2 = ((p)localObject1).hjW;
                ((u)localObject2).azw();
                localObject1 = new com/tencent/mm/plugin/appbrand/debugger/u$6;
                ((u.6)localObject1).<init>((u)localObject2);
                al.d((Runnable)localObject1);
              }
              else
              {
                localObject1 = this.hjY.hjU;
                ab.i("MicroMsg.RemoteDebugMsgMrg", "onQuitSilent");
                ((p)localObject1).azm();
                localObject1 = ((p)localObject1).hjW;
                ((u)localObject1).setVisibility(8);
                if ((((u)localObject1).getParent() instanceof ViewGroup))
                {
                  ((ViewGroup)((u)localObject1).getParent()).removeView((View)localObject1);
                  ((u)localObject1).removeAllViews();
                }
                ((u)localObject1).hkC = null;
                continue;
                localObject2 = new com/tencent/mm/protocal/protobuf/crr;
                ((crr)localObject2).<init>();
                localObject1 = (crr)((crr)localObject2).parseFrom((byte[])localObject1);
                localObject2 = this.hjY.hjU;
                ab.d("MicroMsg.RemoteDebugMsgMrg", "onSync");
                if (t.a(((p)localObject2).hjR, paramByteBuffer, ((crr)localObject1).xoW, ((p)localObject2).hjW, (p)localObject2))
                {
                  ((p)localObject2).u(((crr)localObject1).xoJ);
                  ((p)localObject2).hjR.nH(((crr)localObject1).xpj);
                  ((p)localObject2).azn();
                  continue;
                  localObject2 = new com/tencent/mm/protocal/protobuf/cqz;
                  ((cqz)localObject2).<init>();
                  localObject1 = (cqz)((cqz)localObject2).parseFrom((byte[])localObject1);
                  this.hjY.hjU.u(((cqz)localObject1).xoJ);
                  continue;
                  this.hjY.onReady();
                  continue;
                  this.hjY.hjR.setStatus(4);
                  this.hjY.hjU.quit();
                }
              }
            }
          }
        }
      }
    }
  }

  public final void zJ(String paramString)
  {
    AppMethodBeat.i(101831);
    ab.i("MicroMsg.RemoteDebugJsEngine", "onSocketError message:%s ", new Object[] { paramString });
    this.hjY.hjW.zQ(paramString);
    AppMethodBeat.o(101831);
  }

  public final void zK(String paramString)
  {
    AppMethodBeat.i(101835);
    ab.i("MicroMsg.RemoteDebugJsEngine", "onSocketConnectFail reason:%s ", new Object[] { paramString });
    AppMethodBeat.o(101835);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.n.2
 * JD-Core Version:    0.6.2
 */