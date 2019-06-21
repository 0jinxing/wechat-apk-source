package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.plugin.voip.model.a.h;
import com.tencent.mm.plugin.voip.model.a.j;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cmm;
import com.tencent.mm.protocal.protobuf.con;
import com.tencent.mm.protocal.protobuf.cpf;
import com.tencent.mm.protocal.protobuf.cpg;
import com.tencent.mm.protocal.protobuf.cpx;
import com.tencent.mm.protocal.protobuf.cqi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.at;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;

final class k$3 extends ak
{
  k$3(k paramk, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(4393);
    if ((paramMessage == null) || (paramMessage.what != 59998))
    {
      super.handleMessage(paramMessage);
      AppMethodBeat.o(4393);
    }
    while (true)
    {
      return;
      Object localObject1;
      Object localObject3;
      int i;
      Object localObject5;
      if (paramMessage.arg1 == 1)
      {
        if (this.sPI.sPp.nwu == 0)
        {
          a.Loge("MicroMsg.Voip.VoipContext", "JNI_DOSYNC without roomid , igored!");
          AppMethodBeat.o(4393);
        }
        else
        {
          a.Logi("MicroMsg.Voip.VoipContext", "need dosync for cmd from channel...");
          localObject1 = (byte[])paramMessage.obj;
          localObject3 = this.sPI.sPs;
          i = paramMessage.arg2;
          paramMessage = new cpx();
          paramMessage.jCt = 1;
          localObject5 = new SKBuiltinBuffer_t();
          ((SKBuiltinBuffer_t)localObject5).setBuffer((byte[])localObject1);
          paramMessage.vJd = ((SKBuiltinBuffer_t)localObject5);
          localObject1 = new SKBuiltinBuffer_t();
          try
          {
            ((SKBuiltinBuffer_t)localObject1).setBuffer(paramMessage.toByteArray());
            paramMessage = new cpf();
            paramMessage.wat = i;
            paramMessage.wau = ((SKBuiltinBuffer_t)localObject1);
            paramMessage.ndG = r.Yz();
            localObject1 = new cpg();
            ((cpg)localObject1).jBv = 1;
            ((cpg)localObject1).jBw.add(paramMessage);
            ((t)localObject3).a((cpg)localObject1, true, 2);
            AppMethodBeat.o(4393);
          }
          catch (IOException paramMessage)
          {
            ab.printErrStackTrace("MicroMsg.Voip.VoipSyncHandle", paramMessage, "", new Object[0]);
            AppMethodBeat.o(4393);
          }
        }
      }
      else if (paramMessage.arg1 == 4)
      {
        if (this.sPI.sPp.nwu == 0)
        {
          a.Loge("MicroMsg.Voip.VoipContext", "JNI_STARTDEVFAILED without roomid , igored!");
          AppMethodBeat.o(4393);
        }
        else
        {
          a.Logi("MicroMsg.Voip.VoipContext", "need hangUP for startTalk failed. ");
          this.sPI.sPp.sVH.sQe = 107;
          this.sPI.v(1, -9004, "");
          AppMethodBeat.o(4393);
        }
      }
      else if (paramMessage.arg1 == 6)
      {
        a.Logi("MicroMsg.Voip.VoipContext", "OnChannelConnected from JNI");
        if (this.sPI.sPp.nwu == 0)
        {
          a.Logi("MicroMsg.Voip.VoipContext", "OnChannelConnected roomid null, ignored");
          AppMethodBeat.o(4393);
        }
        else
        {
          this.sPI.sON = true;
          this.sPI.sPp.sVH.sQu = 1;
          if ((!this.sPI.cJn) && (!this.sPI.sOO));
          for (this.sPI.sPp.sUD = 1; ; this.sPI.sPp.sUD = 0)
          {
            this.sPI.sPp.setInactive();
            a.Logi("MicroMsg.Voip.VoipContext", "Voip.Channel setInactive");
            this.sPI.cIO();
            AppMethodBeat.o(4393);
            break;
          }
        }
      }
      else if (paramMessage.arg1 == 3)
      {
        this.sPI.mStatus = 5;
        AppMethodBeat.o(4393);
      }
      else
      {
        if (paramMessage.arg1 == 5)
        {
          a.Logi("MicroMsg.Voip.VoipContext", "need hangUP for disconnect from channel..envent = " + paramMessage.arg2);
          if (this.sPI.mStatus >= 5)
          {
            this.sPI.sPp.sVH.sQe = 108;
            label546: if (paramMessage.arg2 != 4)
              break label615;
            this.sPI.sPp.sVH.sQw = 1;
            a.Logi("MicroMsg.Voip.VoipContext", "channel broken...");
          }
          while (true)
          {
            this.sPI.v(1, -9000, "");
            AppMethodBeat.o(4393);
            break;
            this.sPI.sPp.sVH.sQe = 106;
            break label546;
            label615: if (paramMessage.arg2 == 1)
            {
              if (this.sPI.sOR == true)
              {
                a.Logi("MicroMsg.Voip.VoipContext", "channel connect fail while pre-connect");
                this.sPI.sOQ = true;
                AppMethodBeat.o(4393);
                break;
              }
              a.Logi("MicroMsg.Voip.VoipContext", "channel connect fail...");
              this.sPI.sON = false;
              this.sPI.sPp.sVH.sQw = 5;
              continue;
            }
            if (paramMessage.arg2 == 5)
            {
              if (this.sPI.sOQ == true)
              {
                this.sPI.sPp.sVH.sQw = 6;
                a.Logi("MicroMsg.Voip.VoipContext", "channel network fail while pre-connect...");
                this.sPI.sOQ = true;
                AppMethodBeat.o(4393);
                break;
              }
              a.Logi("MicroMsg.Voip.VoipContext", "channel network fail");
              this.sPI.sPp.sVH.sQw = 6;
            }
          }
        }
        if (paramMessage.arg1 == 100)
        {
          a.outputJniLog((byte[])paramMessage.obj, "MicroMsg.Voip.VoipContext", paramMessage.arg2);
          AppMethodBeat.o(4393);
        }
        else if (paramMessage.arg1 == 101)
        {
          a.outputJniLog((byte[])paramMessage.obj, "MicroMsg.v2Core", paramMessage.arg2);
          AppMethodBeat.o(4393);
        }
        else if (paramMessage.arg1 == 7)
        {
          localObject5 = (int[])paramMessage.obj;
          i = paramMessage.arg2;
          paramMessage = null;
          try
          {
            localObject3 = at.gE(ah.getContext());
            paramMessage = (Message)localObject3;
            localObject3 = null;
          }
          catch (Exception localException2)
          {
            try
            {
              localObject1 = ((TelephonyManager)ah.getContext().getSystemService("phone")).getSimOperatorName();
              localObject3 = localObject1;
              new j(this.sPI.sOW, this.sPI.sOV, this.sPI.sOX, (String)localObject3, paramMessage, this.sPI.sOY, i, (int[])localObject5).cKw();
              AppMethodBeat.o(4393);
              continue;
              localException2 = localException2;
              a.Logi("MicroMsg.Voip.VoipContext", "Get wifiName failed in voip speedTest!");
            }
            catch (Exception localException1)
            {
              while (true)
                a.Logi("MicroMsg.Voip.VoipContext", "Get netName failed in voip speedTest!");
            }
          }
        }
        else
        {
          Object localObject4;
          if (paramMessage.arg1 == 8)
          {
            localObject4 = (byte[])paramMessage.obj;
            paramMessage = this.sPI;
            while (true)
            {
              Object localObject2;
              try
              {
                localObject2 = new com/tencent/mm/protocal/protobuf/cmm;
                ((cmm)localObject2).<init>();
                localObject2 = (cmm)((cmm)localObject2).parseFrom((byte[])localObject4);
                if ((!paramMessage.sPA) || (((cmm)localObject2).xko != 1))
                {
                  localObject4 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject4).<init>("steve: onRecvRUDPCmd:");
                  a.Logi("MicroMsg.Voip.VoipContext", ((cmm)localObject2).xko);
                }
                i = ((cmm)localObject2).xko;
                switch (i)
                {
                default:
                  AppMethodBeat.o(4393);
                  break;
                case 2:
                  a.Logi("MicroMsg.Voip.VoipContext", "steve:[HW]:OnTransportChannelData: the other client tells us to end HWEnc!!");
                  paramMessage.sPr.sPU = true;
                  AppMethodBeat.o(4393);
                case 1:
                case 3:
                case 4:
                case 5:
                }
              }
              catch (Exception paramMessage)
              {
                a.Logi("MicroMsg.Voip.VoipContext", "rudp cmd processing Error");
                AppMethodBeat.o(4393);
              }
              break;
              if (!paramMessage.sPA)
              {
                a.Logi("MicroMsg.Voip.VoipContext", "steve:[HW]:OnTransportChannelData: the other client end HWEnc!!");
                paramMessage.am(8, false);
                if (((cmm)localObject2).xkp == null)
                  break label1275;
                localObject4 = ByteBuffer.wrap(((cmm)localObject2).xkp.wR, 0, 4);
                ((ByteBuffer)localObject4).order(ByteOrder.LITTLE_ENDIAN);
                i = Math.min(((ByteBuffer)localObject4).getInt(), 6);
                localObject4 = ByteBuffer.allocate(4);
                ((ByteBuffer)localObject4).order(ByteOrder.LITTLE_ENDIAN);
                ((ByteBuffer)localObject4).putInt(i);
                a.Logi("MicroMsg.Voip.VoipContext", "steve:[HW]:CMD_VOIP_CloseHWEnc:reset maxsizeformat: ".concat(String.valueOf(i)));
                paramMessage.sPp.setAppCmd(30, ((ByteBuffer)localObject4).array(), 4);
              }
              while (true)
              {
                paramMessage.sPA = true;
                AppMethodBeat.o(4393);
                break;
                label1275: a.Logi("MicroMsg.Voip.VoipContext", "steve:[HW]:OnTransportChannelData: cmdBuffer is nil!!");
              }
              if (((cmm)localObject2).xkp != null)
              {
                localObject2 = ((cmm)localObject2).xkp.wR;
                a.Logi("MicroMsg.Voip.VoipContext", "steve: remote new network type:".concat(String.valueOf(localObject2)));
                i = paramMessage.sPp.setAppCmd(302, (byte[])localObject2, 4);
                if (i < 0)
                {
                  localObject4 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject4).<init>("steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteNetType] update remote network type ");
                  a.Logi("MicroMsg.Voip.VoipContext", localObject2 + "fail:" + i + ", [roomid=" + paramMessage.sPp.nwC + ", roomkey=" + paramMessage.sPp.nwv + "]");
                }
                AppMethodBeat.o(4393);
                break;
              }
              a.Logi("MicroMsg.Voip.VoipContext", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetRemoteNetType] empty buffer");
              AppMethodBeat.o(4393);
              break;
              if (((cmm)localObject2).xkp != null)
              {
                localObject2 = ((cmm)localObject2).xkp.wR;
                localObject4 = new com/tencent/mm/protocal/protobuf/con;
                ((con)localObject4).<init>();
                localObject4 = (con)((con)localObject4).parseFrom((byte[])localObject2);
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>("zhengxue: remote audio dev occupied stat :");
                a.Logi("MicroMsg.Voip.VoipContext", ((con)localObject4).xmt);
                localObject2 = new byte[4];
                localObject2[0] = ((byte)(byte)((con)localObject4).xmt);
                paramMessage.sPp.setJNIAppCmd(2, (byte[])localObject2, 4);
                AppMethodBeat.o(4393);
                break;
              }
              a.Logi("MicroMsg.Voip.VoipContext", "zhengxue:[CHANNEL]EMethod_AudioDevOccupiedStatsSync empty buffer");
              AppMethodBeat.o(4393);
              break;
              if (((cmm)localObject2).xkp != null)
              {
                localObject4 = ((cmm)localObject2).xkp.wR;
                if (paramMessage.sPp != null)
                  paramMessage.sPp.setAppCmd(35, (byte[])localObject4, 4);
                AppMethodBeat.o(4393);
                break;
              }
              a.Logi("MicroMsg.Voip.VoipContext", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodDisableCodec] empty buffer");
            }
          }
          if (paramMessage.arg1 == 9)
          {
            paramMessage = this.sPI.sPp.sVH;
            if (0L == paramMessage.sQI)
            {
              paramMessage.sQI = System.currentTimeMillis();
              a.Logi("MicroMsg.VoipDailReport", "first pkt received timestamp:" + paramMessage.sQI);
            }
            a.Logi("MicroMsg.Voip.VoipContext", "get first pkt for voip");
            if (1 == this.sPI.sPp.sVk)
            {
              paramMessage = new cqi();
              paramMessage.jBT = 1;
              this.sPI.sPs.a(paramMessage, 2);
              AppMethodBeat.o(4393);
            }
          }
          else if (paramMessage.arg1 == 11)
          {
            this.sPI.sPC = 2;
            AppMethodBeat.o(4393);
          }
          else if (paramMessage.arg1 == 12)
          {
            this.sPI.sPC = 1;
            AppMethodBeat.o(4393);
          }
          else if (paramMessage.arg1 == 13)
          {
            localObject4 = (int[])paramMessage.obj;
            i = paramMessage.arg2;
            new h(this.sPI.sPp.nwu, this.sPI.sPp.nwv, this.sPI.sPp.nwC, 1, i, (int[])localObject4).cKw();
            AppMethodBeat.o(4393);
          }
          else
          {
            if (paramMessage.arg1 == 14)
            {
              localObject4 = (int[])paramMessage.obj;
              i = paramMessage.arg2;
              new h(this.sPI.sPp.nwu, this.sPI.sPp.nwv, this.sPI.sPp.nwC, 2, i, (int[])localObject4).cKw();
            }
            AppMethodBeat.o(4393);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.k.3
 * JD-Core Version:    0.6.2
 */