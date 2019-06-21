package com.tencent.mm.plugin.voip_cs.b.b;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.plugin.voip_cs.b.c;
import com.tencent.mm.plugin.voip_cs.b.e;
import com.tencent.mm.protocal.protobuf.cmm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

final class a$1 extends ak
{
  a$1(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(135367);
    if (paramMessage == null)
    {
      super.handleMessage(paramMessage);
      AppMethodBeat.o(135367);
    }
    label148: int i;
    Object localObject2;
    while (true)
    {
      return;
      ab.d("MicroMsg.VoipCSEngine", "msg.what: %d, msg.obj: %s, msg.arg1: %s, msg.arg2: %s", new Object[] { Integer.valueOf(paramMessage.what), paramMessage.obj, Integer.valueOf(paramMessage.arg1), Integer.valueOf(paramMessage.arg2) });
      switch (paramMessage.arg1)
      {
      default:
        AppMethodBeat.o(135367);
        break;
      case 6:
        ab.i("MicroMsg.VoipCSEngine", "jni throw NOTIFY_FROM_JNI_CHANNEL_CONNECTED");
        paramMessage = c.cMg();
        ab.d("MicroMsg.VoipCSReportHelper", "channelConnect");
        paramMessage.tdj = 1;
        localObject1 = this.tez;
        ab.i("MicroMsg.VoipCSEngine", "channel connect!");
        if (((a)localObject1).nxA)
        {
          ab.i("MicroMsg.VoipCSEngine", "channel already connect! do call not startEngine again");
          AppMethodBeat.o(135367);
        }
        else
        {
          ((a)localObject1).nxA = true;
          ab.i("MicroMsg.VoipCSEngine", "start engine");
          ((a)localObject1).tew.setInactive();
          ab.d("MicroMsg.VoipCSEngine", "setChannelActiveAfterAccept");
          if (!((a)localObject1).nxA)
            ab.d("MicroMsg.VoipCSEngine", "channel not connect now");
          ((a)localObject1).tew.setActive();
          i = ((a)localObject1).tew.startEngine();
          if (i == 0)
          {
            ab.i("MicroMsg.VoipCSEngine", "start engine suc!");
            paramMessage = new int[2];
            paramMessage[0] = c.cMe().tew.sVi;
            paramMessage[1] = c.cMe().tew.sVj;
            ab.i("MicroMsg.VoipCSEngine", "steve: Get server config! MaxBR:" + paramMessage[0] + ", MaxFps:" + paramMessage[1]);
            if ((paramMessage[0] > 0) && (paramMessage[1] > 0))
            {
              localObject2 = ByteBuffer.allocate(8);
              ((ByteBuffer)localObject2).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().put(paramMessage);
              localObject2 = ((ByteBuffer)localObject2).array();
              if (c.cMe().tew.setAppCmd(34, (byte[])localObject2, localObject2.length) < 0)
                ab.i("MicroMsg.VoipCSEngine", "setAppCmd: type:34,qosparam:" + paramMessage[0] + "," + paramMessage[1] + ",ret:" + i);
            }
          }
          for (c.cMg().tdh = 1; ; c.cMg().tdh = 0)
          {
            if ((((a)localObject1).tey != null) && (c.cMf().tdM != 2))
            {
              ((a)localObject1).tey.bGQ();
              c.cMf().tdM = 2;
            }
            AppMethodBeat.o(135367);
            break;
            ab.i("MicroMsg.VoipCSEngine", "start engine fail!");
          }
        }
        break;
      case 5:
        ab.i("MicroMsg.VoipCSEngine", "jni throw NOTIFY_FROM_JNI_RESET");
        if (paramMessage.arg2 == 4)
        {
          ab.i("MicroMsg.VoipCSEngine", "channel broken...");
          c.cMg().tdg = 1;
        }
        while (true)
        {
          paramMessage = this.tez;
          ab.i("MicroMsg.VoipCSEngine", "channel connect failed!");
          c.cMg().dataType = 1;
          if (paramMessage.tey != null)
            paramMessage.tey.cMy();
          AppMethodBeat.o(135367);
          break;
          if (paramMessage.arg2 == 5)
          {
            ab.i("MicroMsg.VoipCSEngine", "channel event network failer...");
            c.cMg().tdg = 6;
          }
          else
          {
            ab.i("MicroMsg.VoipCSEngine", "channel connect fail...");
            c.cMg().tdg = 5;
          }
        }
      case 3:
        ab.d("MicroMsg.VoipCSEngine", "start dev!");
        AppMethodBeat.o(135367);
        break;
      case 1:
        AppMethodBeat.o(135367);
        break;
      case 4:
        AppMethodBeat.o(135367);
        break;
      case 100:
        com.tencent.mm.plugin.voip.a.a.outputJniLog((byte[])paramMessage.obj, "MicroMsg.VoipCSEngine", paramMessage.arg2);
        AppMethodBeat.o(135367);
        break;
      case 101:
        com.tencent.mm.plugin.voip.a.a.outputJniLog((byte[])paramMessage.obj, "MicroMsg.VoipCSEngine-JNI_CORE", paramMessage.arg2);
        AppMethodBeat.o(135367);
      case 8:
      }
    }
    Object localObject1 = (byte[])paramMessage.obj;
    paramMessage = this.tez;
    while (true)
    {
      try
      {
        localObject2 = new com/tencent/mm/protocal/protobuf/cmm;
        ((cmm)localObject2).<init>();
        localObject2 = (cmm)((cmm)localObject2).parseFrom((byte[])localObject1);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("steve: onRecvRUDPCmd:");
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.VoipCSEngine", ((cmm)localObject2).xko);
        i = ((cmm)localObject2).xko;
        switch (i)
        {
        default:
          AppMethodBeat.o(135367);
          break;
        case 3:
          if (((cmm)localObject2).xkp == null)
            break label945;
          localObject2 = ((cmm)localObject2).xkp.wR;
          com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.VoipCSEngine", "steve: remote new network type:".concat(String.valueOf(localObject2)));
          i = paramMessage.tew.setAppCmd(302, (byte[])localObject2, 4);
          if (i < 0)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteNetType] update remote network type ");
            com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.VoipCSEngine", localObject2 + "fail:" + i + ", [roomid=" + paramMessage.tew.sTZ + ", roomkey=" + paramMessage.tew.nwv + "]");
          }
          AppMethodBeat.o(135367);
        }
      }
      catch (Exception paramMessage)
      {
        com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.VoipCSEngine", "onVoipLocalNetTypeChange Error");
      }
      break label148;
      label945: com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.VoipCSEngine", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteNetType] empty buffer");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.b.a.1
 * JD-Core Version:    0.6.2
 */