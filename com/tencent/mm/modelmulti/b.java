package com.tencent.mm.modelmulti;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.l;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.booter.CoreService;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.network.a;
import com.tencent.mm.network.k;
import com.tencent.mm.network.t;
import com.tencent.mm.plugin.zero.PluginZero;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.bej;
import com.tencent.mm.protocal.protobuf.bek;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.protocal.protobuf.tc;
import com.tencent.mm.protocal.t.a;
import com.tencent.mm.protocal.t.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class b extends m
  implements k
{
  protected static int fHJ = 7;
  private String aIm;
  private g.a eOm;
  private com.tencent.mm.ai.f ehi;
  private int errCode;
  private int errType;
  private int fHK;
  private StringBuilder fHL;
  private long fHM;
  private boolean fHN;
  private ap frk;

  public b()
  {
    AppMethodBeat.i(58352);
    this.errType = 0;
    this.errCode = 0;
    this.aIm = "";
    this.fHK = 0;
    this.fHL = new StringBuilder();
    this.fHM = -1L;
    this.fHN = false;
    ab.d("MicroMsg.NetPushSync", "dksord NetSceneSync hash:%d stack:%s", new Object[] { Integer.valueOf(hashCode()), bo.dpG() });
    this.eOm = new g.a();
    this.fHL.append("stack:" + bo.dpG() + " time:" + bo.anT());
    AppMethodBeat.o(58352);
  }

  public b(t.b paramb, int paramInt, long paramLong)
  {
    this();
    AppMethodBeat.i(58353);
    this.fHK = paramInt;
    this.fHM = paramLong;
    ab.d("MicroMsg.NetPushSync", "dkpush do scene resp SCENE_SYNC_WAIT");
    this.frk = new ap(com.tencent.mm.network.aa.anr(), new b.1(this, paramb), false);
    AppMethodBeat.o(58353);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    boolean bool = false;
    AppMethodBeat.i(58357);
    this.ehi = paramf;
    this.fHL.append(" lastd:" + this.ftg + " dotime:" + bo.anT() + " net:" + at.getNetType(ah.getContext()));
    int i = hashCode();
    int j = fHJ;
    if (this.frk != null)
      bool = true;
    ab.i("MicroMsg.NetPushSync", "doScene[%d] selector:%d pusher:%b ", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool) });
    if (this.frk != null)
    {
      c(parame);
      this.frk.ae(0L, 0L);
      this.frk = null;
      j = -1;
      AppMethodBeat.o(58357);
    }
    while (true)
    {
      return j;
      b.a locala = new b.a();
      locala.uin = com.tencent.mm.network.aa.ano().gcU.QF();
      paramf = ((t.a)locala.acF()).vyG;
      paramf.vTN = fHJ;
      paramf.vTO = com.tencent.mm.platformtools.aa.ad(bo.anf(ah.getContext().getSharedPreferences("notify_sync_pref", h.Mu()).getString("notify_sync_key_keybuf", "")));
      paramf.Scene = 1;
      paramf.wIw = new tc();
      paramf.vIk = d.eSg;
      j = a(parame, locala, this);
      AppMethodBeat.o(58357);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58358);
    if ((paramq == null) || (paramq.getType() != 138))
    {
      if (paramq == null);
      for (paramInt1 = -2; ; paramInt1 = paramq.getType())
      {
        ab.e("MicroMsg.NetPushSync", "onGYNetEnd error type:%d", new Object[] { Integer.valueOf(paramInt1) });
        AppMethodBeat.o(58358);
        return;
      }
    }
    this.fHL.append(" endtime:" + bo.anT());
    ab.i("MicroMsg.NetPushSync", "onGYNetEnd: %d [%d,%d,%s] hash isnotifydata:%b time:%d [%s]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Boolean.valueOf(this.fHN), Long.valueOf(this.eOm.Mr()), this.fHL });
    if ((paramInt2 == 4) && (paramInt3 == -2006))
    {
      paramInt2 = 0;
      paramInt3 = 0;
    }
    label518: for (paramInt1 = 1; ; paramInt1 = 0)
    {
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(58358);
        break;
      }
      t.b localb = (t.b)paramq.ZS();
      if (paramInt1 == 0)
      {
        paramString = com.tencent.mm.platformtools.aa.a(((t.a)paramq.acF()).vyG.vTO);
        if (paramString != null)
          break label722;
        paramInt1 = -1;
        ab.d("MicroMsg.NetPushSync", "dkpush req Key : %d[%s]", new Object[] { Integer.valueOf(paramInt1), bo.ca(paramString) });
        if (!bo.cb(paramString))
          break label1874;
        paramString = bo.anf(ah.getContext().getSharedPreferences("notify_sync_pref", h.Mu()).getString("notify_sync_key_keybuf", ""));
        ab.d("MicroMsg.NetPushSync", "dkpush userinfo key : %d[%s]", new Object[] { Integer.valueOf(paramString.length), bo.ca(paramString) });
      }
      label440: label1734: label1874: 
      while (true)
        while (true)
        {
          paramq = com.tencent.mm.platformtools.aa.a(localb.vyH.vTO);
          paramArrayOfByte = com.tencent.mm.protocal.aa.j(paramString, paramq);
          if (paramArrayOfByte != null)
          {
            paramString = paramArrayOfByte;
            if (paramArrayOfByte.length > 0);
          }
          else
          {
            ab.w("MicroMsg.NetPushSync", "merge key failed, use server side instead");
            paramString = paramq;
          }
          localb.vyH.vTO = com.tencent.mm.platformtools.aa.ad(paramString);
          label466: Object localObject1;
          if ((localb.vyH.vTR == null) || (localb.vyH.vTR.jBw == null))
          {
            paramInt1 = 0;
            ab.i("MicroMsg.NetPushSync", "newMsgSize:%d", new Object[] { Integer.valueOf(paramInt1) });
            if (paramString != null)
              break label747;
            paramInt2 = -1;
            ab.d("MicroMsg.NetPushSync", "newMsgSize:%d, mergeKey: %d[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), bo.ca(paramString) });
            paramArrayOfByte = localb.vyH.vTR.jBw.iterator();
            paramInt2 = 0;
            do
            {
              if (!paramArrayOfByte.hasNext())
                break;
              localObject1 = (tb)paramArrayOfByte.next();
            }
            while (((tb)localObject1).wat != 5);
            paramString = com.tencent.mm.platformtools.aa.a(((tb)localObject1).wau);
          }
          Object localObject2;
          while (true)
          {
            long l;
            label722: label747: String str;
            try
            {
              localObject2 = new com/tencent/mm/protocal/protobuf/cm;
              ((cm)localObject2).<init>();
              ((cm)localObject2).parseFrom(paramString);
              int i = ((cm)localObject2).nao;
              paramString = ((cm)localObject2).vEB.wVI;
              l = ((cm)localObject2).ptF;
              if (((cm)localObject2).vEH == null)
              {
                paramInt1 = 0;
                if (((cm)localObject2).vED.wVI != null)
                  continue;
                paramInt3 = 0;
                ab.i("MicroMsg.NetPushSync", "oreh msgType:%d, talker:%s, newmsgID:%d, pushContent.len:%d, content.len:%d", new Object[] { Integer.valueOf(i), paramString, Long.valueOf(l), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3) });
                paramInt1 = ((cm)localObject2).nao;
                paramq = ((cm)localObject2).vEB.wVI;
                paramString = ((cm)localObject2).vED.wVI;
                if (paramInt1 != 50)
                  continue;
                ab.i("MicroMsg.NetPushSync", "hit voip");
                paramInt1 = 1;
                if (paramInt1 == 0)
                  continue;
                paramInt2 = 1;
                break label518;
                paramInt1 = paramString.length;
                break;
                paramInt1 = localb.vyH.vTR.jBw.size();
                break label440;
                paramInt2 = paramString.length;
                break label466;
              }
              paramInt1 = ((cm)localObject2).vEH.length();
              continue;
              paramInt3 = ((cm)localObject2).vED.wVI.length();
              continue;
              if ((bo.isNullOrNil(paramString)) || (bo.isNullOrNil(paramq)))
              {
                ab.w("MicroMsg.NetPushSync", "check should launch to mm ,content or from username is null.");
                paramInt1 = 0;
                continue;
              }
              if ((paramInt1 == 9998) && (paramq.equalsIgnoreCase("weixin")))
              {
                ab.i("MicroMsg.NetPushSync", "hit ipxx");
                paramInt1 = 1;
                continue;
              }
              if ((paramInt1 != 10002) || (!paramString.contains("revokemsg")))
                continue;
              ab.i("MicroMsg.NetPushSync", "hit MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE");
              paramInt1 = 1;
              continue;
              l = ((cm)localObject2).ptF;
              str = ((cm)localObject2).vEB.wVI;
              paramString = ((cm)localObject2).vEH;
              paramInt3 = ((cm)localObject2).nao;
              if (!bo.isNullOrNil(paramString))
                break label983;
              ab.i("MicroMsg.NetPushSync", "showNotifyCation pushContent is null, skip");
              if (((cm)localObject2).nao != 10002)
                break label1248;
              paramInt1 = 1;
              if (paramInt1 == 0)
                break label518;
              ab.i("MicroMsg.NetPushSync", "need remove pushContent");
              ((cm)localObject2).vEH = null;
              ((tb)localObject1).wau = com.tencent.mm.platformtools.aa.ad(((cm)localObject2).toByteArray());
            }
            catch (IOException paramString)
            {
              ab.printErrStackTrace("MicroMsg.NetPushSync", paramString, "", new Object[0]);
            }
            break label518;
            label983: Object localObject3 = new com/tencent/mm/pointers/PString;
            ((PString)localObject3).<init>();
            Object localObject4 = new com/tencent/mm/pointers/PString;
            ((PString)localObject4).<init>();
            paramq = bo.anj(paramString);
            paramInt1 = paramq.indexOf("<pushcontent");
            paramString = paramq;
            if (paramInt1 > 0)
              paramString = paramq.substring(paramInt1);
            paramString = br.z(paramString, "pushcontent");
            if (paramString == null)
              ab.e("MicroMsg.NetPushSync", "inval xml");
            while (true)
            {
              paramq = (PluginZero)com.tencent.mm.kernel.g.M(PluginZero.class);
              if (paramq.uZT == null)
                break;
              paramString = new java/lang/StringBuilder;
              paramString.<init>();
              paramString = paramString.append(com.tencent.mm.compatible.util.e.eSi);
              Object localObject5 = new java/lang/StringBuilder;
              ((StringBuilder)localObject5).<init>("mm");
              paramString = com.tencent.mm.a.g.x(((StringBuilder)localObject5).append(com.tencent.mm.network.aa.ano().gcU.QF()).toString().getBytes());
              paramq = paramq.uZT;
              localObject4 = ((PString)localObject4).value;
              localObject5 = ((PString)localObject3).value;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              paramq.a(l, str, (String)localObject4, (String)localObject5, paramString + "/avatar/", paramInt3);
              break;
              ((PString)localObject3).value = ((String)paramString.get(".pushcontent.$content"));
              ((PString)localObject4).value = ((String)paramString.get(".pushcontent.$nickname"));
            }
            label1248: paramInt1 = 0;
          }
          try
          {
            paramq = localb.vyH.toByteArray();
            paramInt3 = com.tencent.mm.network.aa.ano().gcU.QF();
            paramString = com.tencent.mm.booter.g.ij(paramInt3);
            paramInt1 = com.tencent.mm.booter.g.jH(paramString) + 1;
            paramArrayOfByte = new java/lang/StringBuilder;
            paramArrayOfByte.<init>();
            paramArrayOfByte = paramString + "/syncResp.bin" + paramInt1;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject1 = com.tencent.mm.a.g.x((com.tencent.mm.compatible.e.q.LK() + paramInt3).getBytes());
            localObject2 = l.d(paramq, ((String)localObject1).getBytes());
            ab.i("MicroMsg.NotifySyncMgr", "writeFile %d, len:%d, resultLen:%d, file:%s, dump %s -> %s, key:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramq.length), Integer.valueOf(localObject2.length), paramArrayOfByte, com.tencent.mm.booter.g.J(paramq), com.tencent.mm.booter.g.J((byte[])localObject2), com.tencent.mm.booter.g.J(((String)localObject1).getBytes()) });
            if (bo.cb((byte[])localObject2))
              ab.e("MicroMsg.NotifySyncMgr", "encry failed");
            while (true)
            {
              ab.d("MicroMsg.NetPushSync", "onRespHandled sync");
              ah.getContext().getSharedPreferences("notify_sync_pref", h.Mu()).edit().putString("notify_sync_key_keybuf", bo.cd(com.tencent.mm.platformtools.aa.a(localb.vyH.vTO))).commit();
              ab.d("MicroMsg.NetPushSync", "dkpush pushSyncFlag:%d", new Object[] { Integer.valueOf(this.fHK) });
              if (paramInt2 != 0)
                break label1786;
              if (((localb.vyH.vQe & fHJ) == 0) || (super.acJ()))
                break label1781;
              paramInt1 = 1;
              ab.i("MicroMsg.NetPushSync", "continue flag=" + localb.vyH.vQe + ", selector=" + fHJ + ", limit reach=" + super.acJ());
              if (paramInt1 == 0)
                break label1786;
              a(this.ftf, this.ehi);
              if (paramInt2 != 0)
                CoreService.Ie();
              AppMethodBeat.o(58358);
              break;
              paramInt3 = com.tencent.mm.a.e.b(paramArrayOfByte, (byte[])localObject2, localObject2.length);
              boolean bool = com.tencent.mm.a.e.ct(paramArrayOfByte);
              if ((paramInt3 == 0) && (bool))
                break label1734;
              ab.e("MicroMsg.NotifySyncMgr", "writeFile failed:!!!!!, writeResult:%d, writedFileExit:%b", new Object[] { Integer.valueOf(paramInt3), Boolean.valueOf(bool) });
            }
          }
          catch (IOException paramString)
          {
            while (true)
            {
              ab.e("MicroMsg.NetPushSync", "write syncResp buf err:%s", new Object[] { paramString });
              ab.printErrStackTrace("MicroMsg.NetPushSync", paramString, "", new Object[0]);
              continue;
              paramq = String.valueOf(paramInt1).getBytes();
              paramArrayOfByte = new java/lang/StringBuilder;
              paramArrayOfByte.<init>();
              com.tencent.mm.a.e.b(paramString + "/syncResp.ini", paramq, paramq.length);
              continue;
              label1781: paramInt1 = 0;
              continue;
              label1786: if ((this.fHK & 0x1) > 0)
              {
                ab.i("MicroMsg.NetPushSync", "oreh NotifyData ack");
                new f(this.fHM, com.tencent.mm.platformtools.aa.a(localb.vyH.vTO), com.tencent.mm.network.aa.ano().gcU.QF()).a(com.tencent.mm.network.aa.ano(), new b.2(this));
              }
              this.ehi.onSceneEnd(this.errType, this.errCode, this.aIm, this);
            }
          }
        }
    }
  }

  public final boolean acJ()
  {
    AppMethodBeat.i(58355);
    boolean bool = super.acJ();
    AppMethodBeat.o(58355);
    return bool;
  }

  public final int acn()
  {
    return 500;
  }

  public final m.b b(com.tencent.mm.network.q paramq)
  {
    return m.b.ftu;
  }

  public final void cancel()
  {
    AppMethodBeat.i(58356);
    super.cancel();
    AppMethodBeat.o(58356);
  }

  public final String getInfo()
  {
    AppMethodBeat.i(58354);
    String str = this.fHL.toString();
    AppMethodBeat.o(58354);
    return str;
  }

  public final int getType()
  {
    return 138;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.b
 * JD-Core Version:    0.6.2
 */