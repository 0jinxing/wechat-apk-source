package com.tencent.mm.plugin.voip;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.g.a.ui.a;
import com.tencent.mm.g.a.ui.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.voip.model.k;
import com.tencent.mm.plugin.voip.model.n;
import com.tencent.mm.plugin.voip.model.o.a;
import com.tencent.mm.plugin.voip.model.q;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.plugin.voip.model.s;
import com.tencent.mm.plugin.voip.model.t;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.protobuf.cpm;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class d extends c<ui>
{
  public d()
  {
    AppMethodBeat.i(4318);
    this.xxI = ui.class.getName().hashCode();
    AppMethodBeat.o(4318);
  }

  private static boolean a(ui paramui)
  {
    int i = 1;
    int j = 1;
    AppMethodBeat.i(4319);
    if ((paramui instanceof ui))
    {
      if (!com.tencent.mm.kernel.g.RK())
      {
        AppMethodBeat.o(4319);
        return false;
      }
      switch (paramui.cQx.cAd)
      {
      case 7:
      case 8:
      default:
      case 2:
      case 5:
      case 3:
      case 1:
      case 4:
      case 6:
      case 9:
      case 10:
      }
    }
    while (true)
    {
      AppMethodBeat.o(4319);
      break;
      paramui.cQy.cQz = b.cIj().con;
      continue;
      if (com.tencent.mm.r.a.Oo())
      {
        com.tencent.mm.ui.base.h.g(paramui.cQx.context, 2131304437, 2131297061);
      }
      else if (paramui.cQx.cQs == 2)
      {
        q.aW(paramui.cQx.context, paramui.cQx.talker);
      }
      else if (paramui.cQx.cQs == 3)
      {
        q.aX(paramui.cQx.context, paramui.cQx.talker);
      }
      else if (paramui.cQx.cQs == 4)
      {
        q.aY(paramui.cQx.context, paramui.cQx.talker);
        continue;
        Object localObject1 = b.cIj();
        Object localObject2 = paramui.cQx.cQr;
        if ((localObject2 != null) && (localObject2.length >= 10) && (localObject2[0] == 1))
        {
          paramui = new byte[localObject2.length - 1];
          System.arraycopy(localObject2, 1, paramui, 0, paramui.length);
          localObject2 = ((r)localObject1).sSP.sNl.sPp.sVH;
          ((n)localObject2).sQK = System.currentTimeMillis();
          com.tencent.mm.plugin.voip.a.a.Logd("MicroMsg.VoipDailReport", "devin:recvInvite:" + ((n)localObject2).sQK);
          try
          {
            localObject2 = new com/tencent/mm/protocal/protobuf/cpm;
            ((cpm)localObject2).<init>();
            paramui = (cpm)((cpm)localObject2).parseFrom(paramui);
            ab.d("MicroMsg.Voip.VoipService", "doTaskCallin in onInviteNotify");
            if (!((r)localObject1).sTe)
            {
              com.tencent.mm.plugin.voip.a.a.c(paramui.wem, paramui.wen, 1, 2);
              ((r)localObject1).sTe = true;
            }
            if (((r)localObject1).sSP.cKg())
              break label481;
            com.tencent.mm.plugin.report.service.h.pYm.a(11523, true, true, new Object[] { Integer.valueOf(paramui.wem), Long.valueOf(paramui.wen), Integer.valueOf(paramui.xmL), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
            ((r)localObject1).b(paramui);
          }
          catch (IOException paramui)
          {
            ab.printErrStackTrace("MicroMsg.Voip.VoipService", paramui, "", new Object[0]);
          }
          continue;
          label481: com.tencent.mm.plugin.report.service.h.pYm.a(11523, true, true, new Object[] { Integer.valueOf(paramui.wem), Long.valueOf(paramui.wen), Integer.valueOf(paramui.xmL), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
          continue;
          b.cIj();
          localObject1 = r.abW(paramui.cQx.content);
          if (localObject1 != null)
            if (((o.a)localObject1).cJh())
            {
              paramui.cQy.type = 2;
            }
            else
            {
              if (((o.a)localObject1).sQU == o.a.sRb);
              for (i = j; i != 0; i = 0)
              {
                paramui.cQy.type = 3;
                break;
              }
              localObject2 = paramui.cQy;
              paramui = b.cIj();
              localObject1 = ah.getContext();
              if ((paramui.con) && (paramui.sTa) && (!paramui.sTb))
              {
                ab.d("MicroMsg.Voip.VoipService", "isVideoCalling " + paramui.sSR + " isAudioCalling " + paramui.sSS);
                if ((!bo.isNullOrNil(paramui.talker)) && (((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(paramui.talker) != null))
                  r.a((Context)localObject1, paramui.talker, true, paramui.sSR, true);
              }
              for (boolean bool = true; ; bool = false)
              {
                ((ui.b)localObject2).cQA = bool;
                break;
              }
              localObject1 = b.cIj();
              paramui = paramui.cQx.cQr;
              if (paramui == null)
              {
                ab.i("MicroMsg.Voip.VoipService", "sidney:notify content null");
              }
              else
              {
                ab.i("MicroMsg.Voip.VoipService", "____voipNotify with data size:" + paramui.length);
                j = ByteBuffer.wrap(paramui, 0, 4).getInt();
                long l = ByteBuffer.wrap(paramui, 4, 8).getLong();
                ab.i("MicroMsg.Voip.VoipService", "voipNotify roomid:" + j + " roomkey:" + l);
                if (((r)localObject1).sTc == null)
                {
                  localObject2 = ((r)localObject1).sSP;
                  ab.i("MicroMsg.Voip.VoipServiceEx", "current roomid:%d, params roomid:%d", new Object[] { Integer.valueOf(((s)localObject2).sNl.sPp.nwu), Integer.valueOf(j) });
                  if ((j != 0) && (((s)localObject2).sNl.sPp.nwu == j));
                  while (true)
                  {
                    if (i != 0)
                      break label950;
                    ab.e("MicroMsg.Voip.VoipService", "voipSyncStatus ignored , not current roomid");
                    break;
                    i = 0;
                  }
                }
                label950: if (paramui.length > 12)
                  ((r)localObject1).b(r.U(paramui, paramui.length - 12), j, l);
                paramui = ((r)localObject1).sSP;
                com.tencent.mm.plugin.voip.a.a.Logi("MicroMsg.Voip.VoipServiceEx", com.tencent.mm.compatible.util.g.Mq() + " need doSync by notify, status:" + paramui.sNl.mStatus);
                paramui.sNl.sPs.a(null, false, 7);
                continue;
                localObject1 = b.cIj();
                localObject2 = paramui.cQx.cQr;
                if ((!bo.cb((byte[])localObject2)) && (localObject2[0] == 3))
                {
                  try
                  {
                    ab.i("MicroMsg.Voip.VoipService", "onCancelNotify");
                    paramui = new byte[localObject2.length - 1];
                    System.arraycopy(localObject2, 1, paramui, 0, paramui.length);
                    localObject2 = new com/tencent/mm/protocal/protobuf/cpm;
                    ((cpm)localObject2).<init>();
                    ((cpm)localObject2).parseFrom(paramui);
                    ((r)localObject1).Gv(((cpm)localObject2).wem);
                    if ((((r)localObject1).sTc != null) && (((cpm)localObject2).wem == ((r)localObject1).sTc.wem) && (!((r)localObject1).oGx.doT()))
                    {
                      ((r)localObject1).sTc = null;
                      ((r)localObject1).sTd = 0L;
                      ((r)localObject1).oGx.stopTimer();
                    }
                    paramui = ((r)localObject1).sSP;
                    ab.i("MicroMsg.Voip.VoipServiceEx", "onCancelInviteNotify, roomId: %s", new Object[] { Integer.valueOf(((cpm)localObject2).wem) });
                    if ((paramui.sNl.sPu == null) || (((cpm)localObject2).wem != paramui.sNl.sPu.wem))
                      continue;
                    paramui.cKn();
                    paramui.sNl.shutdown();
                  }
                  catch (Exception paramui)
                  {
                    ab.e("MicroMsg.Voip.VoipService", "onCancelNotify error: %s", new Object[] { paramui.getMessage() });
                  }
                  continue;
                  localObject1 = b.cIj();
                  localObject2 = paramui.cQx.cQr;
                  if ((!bo.cb((byte[])localObject2)) && (localObject2[0] == 2))
                  {
                    try
                    {
                      ab.i("MicroMsg.Voip.VoipService", "onAnswerNotify");
                      paramui = new byte[localObject2.length - 1];
                      System.arraycopy(localObject2, 1, paramui, 0, paramui.length);
                      localObject2 = new com/tencent/mm/protocal/protobuf/cpm;
                      ((cpm)localObject2).<init>();
                      ((cpm)localObject2).parseFrom(paramui);
                      paramui = ((r)localObject1).sSP;
                      ab.i("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, roomId: %s", new Object[] { Integer.valueOf(((cpm)localObject2).wem) });
                      if (((cpm)localObject2).wem != paramui.sNl.sPu.wem)
                        continue;
                      if (!paramui.sNl.cJn)
                        break label1424;
                      ab.i("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, already accept, ignore it");
                    }
                    catch (Exception paramui)
                    {
                      ab.e("MicroMsg.Voip.VoipService", "onAnswerNotify error: %s", new Object[] { paramui.getMessage() });
                    }
                    continue;
                    label1424: ab.i("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, not accept, hangout");
                    paramui.cKn();
                    paramui.sNl.shutdown();
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
 * Qualified Name:     com.tencent.mm.plugin.voip.d
 * JD-Core Version:    0.6.2
 */