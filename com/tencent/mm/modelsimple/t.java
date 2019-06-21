package com.tencent.mm.modelsimple;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.at.g;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.pf;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.protocal.protobuf.bti;
import com.tencent.mm.protocal.protobuf.btj;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;

public final class t extends com.tencent.mm.ai.m
  implements com.tencent.mm.network.k
{
  private static final al fPG;
  private final long cvx;
  private f ehi;
  private final com.tencent.mm.ai.b fAT;
  private final String fPH;

  static
  {
    AppMethodBeat.i(16602);
    fPG = new al("deleteRevokeMessageThread");
    AppMethodBeat.o(16602);
  }

  public t(bi parambi, String paramString)
  {
    AppMethodBeat.i(16598);
    aw.ZK();
    Object localObject = com.tencent.mm.model.c.Ry().get(290818, Integer.valueOf(0));
    if (localObject != null);
    for (int i = bo.getInt(localObject.toString(), 0); ; i = 0)
    {
      this.cvx = parambi.field_msgId;
      this.fPH = paramString;
      localObject = null;
      int j = 0;
      int k = (int)(parambi.field_createTime / 1000L);
      long l = parambi.field_msgSvrId;
      String str1 = r.Yz();
      String str2 = parambi.field_talker;
      int m = j;
      paramString = (String)localObject;
      if (parambi.dJz != 1);
      switch (parambi.getType())
      {
      default:
        paramString = (String)localObject;
        m = j;
      case 1:
      case 42:
      case 48:
      case 66:
      case 34:
      case 43:
      case 62:
      case 3:
      case 47:
        while (true)
        {
          parambi = new b.a();
          parambi.fsJ = new bti();
          parambi.fsK = new btj();
          parambi.uri = "/cgi-bin/micromsg-bin/revokemsg";
          parambi.fsI = 594;
          parambi.fsL = 0;
          parambi.fsM = 0;
          this.fAT = parambi.acD();
          parambi = (bti)this.fAT.fsG.fsP;
          parambi.vFF = paramString;
          parambi.wVo = m;
          parambi.wVp = 0;
          parambi.wVr = l;
          parambi.pcX = k;
          parambi.ndG = str1;
          parambi.ndF = str2;
          parambi.wVq = i;
          ab.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][NetSceneRevokeMsg]:clientMsgId:%s,newClientMsgId:%d,svrMsgId:%d,createTime:%d,fromUserName:%s,toUserName:%s,indexOfRequest:%d", new Object[] { parambi.vFF, Integer.valueOf(parambi.wVo), Integer.valueOf(parambi.wVp), Integer.valueOf(parambi.pcX), parambi.ndG, parambi.ndF, Integer.valueOf(parambi.wVq) });
          AppMethodBeat.o(16598);
          return;
          m = com.tencent.mm.model.p.m(r.Yz(), parambi.field_createTime).hashCode();
          ab.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:text,newClientMsgId:%d", new Object[] { Integer.valueOf(m) });
          paramString = (String)localObject;
          continue;
          parambi = com.tencent.mm.modelvoice.m.ama().uZ(parambi.field_imgPath);
          m = j;
          paramString = (String)localObject;
          if (parambi != null)
          {
            paramString = parambi.clientId;
            ab.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:voice,clientMsgId:%s", new Object[] { paramString });
            m = j;
            continue;
            paramString = parambi.field_imgPath;
            ab.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:video,clientMsgId:%s", new Object[] { paramString });
            m = j;
            continue;
            localObject = o.ahl().fJ(parambi.field_msgId);
            paramString = parambi.dJC;
            ab.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:img,talker:%s,hdId:%s,localId:%s,clientMsgId:%s", new Object[] { parambi.field_talker, Integer.valueOf(((com.tencent.mm.at.e)localObject).fDJ), Long.valueOf(((com.tencent.mm.at.e)localObject).fDy), paramString });
            m = j;
            continue;
            paramString = String.valueOf(ap.aps(parambi.field_content).time);
            ab.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:emoji,clientMsgId:%s", new Object[] { paramString });
            m = j;
          }
        }
      case 49:
      case 1048625:
      case 268435505:
      case 553648177:
      case 587202609:
      }
      paramString = am.aUq().lZ(parambi.field_msgId);
      if (paramString != null);
      for (parambi = paramString.field_clientAppDataId; ; parambi = parambi.field_talker + parambi.field_msgId + "T" + parambi.field_createTime)
      {
        ab.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:app msg/emoji/img,clientMsgId:%s", new Object[] { parambi });
        m = j;
        paramString = parambi;
        break;
      }
    }
  }

  public static void a(String paramString1, String paramString2, bi parambi, String paramString3)
  {
    AppMethodBeat.i(16601);
    if ((parambi.getType() == 1) || (parambi.getType() == 16777265))
    {
      parambi.setType(10002);
      parambi.setContent(String.format("<sysmsg type=\"invokeMessage\"><invokeMessage><text><![CDATA[%s]]></text><timestamp><![CDATA[%s]]></timestamp><link><text><![CDATA[%s]]></text></link><preContent><![CDATA[%s]]></preContent></invokeMessage></sysmsg>", new Object[] { paramString1, Long.valueOf(System.currentTimeMillis()), paramString2, paramString3 }));
      AppMethodBeat.o(16601);
    }
    while (true)
    {
      return;
      parambi.setType(10000);
      parambi.setContent(paramString1);
      AppMethodBeat.o(16601);
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(16599);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(16599);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16600);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      aw.ZK();
      paramq = com.tencent.mm.model.c.XO().jf(this.cvx);
      if (paramq.field_msgId != this.cvx)
        break label372;
      paramArrayOfByte = ajB();
      ab.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSceneEnd.revokeMsg] msgId:%s,msgSvrId:%s,responseSysWording:%s", new Object[] { Long.valueOf(paramq.field_msgId), Long.valueOf(paramq.field_msgSvrId), paramArrayOfByte.wVt });
      int i = paramq.getType();
      a(this.fPH, "  " + ah.getContext().getString(2131300702), paramq, paramq.field_content);
      paramq.hO(0);
      paramq.ht(paramq.dqI | 0x4);
      paramArrayOfByte = new pf();
      paramArrayOfByte.cLx.cvx = this.cvx;
      a.xxA.m(paramArrayOfByte);
      aw.ZK();
      com.tencent.mm.model.c.XO().a(paramq.field_msgId, paramq);
      paramInt1 = 0;
      aw.ZK();
      paramArrayOfByte = com.tencent.mm.model.c.Ry().get(290818, Integer.valueOf(0));
      if (paramArrayOfByte != null)
        paramInt1 = bo.getInt(paramArrayOfByte.toString(), 0);
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(290818, Integer.valueOf(paramInt1 + 1));
      paramq.setType(i);
      if (!paramq.bAA())
        break label345;
      paramArrayOfByte = com.tencent.mm.modelstat.b.fRa;
      paramInt1 = com.tencent.mm.af.k.k(paramq);
      if (paramArrayOfByte.aka())
        paramArrayOfByte.a(paramq, com.tencent.mm.modelstat.b.b.fRn, paramInt1);
      fPG.m(new t.1(this, paramq), 300000L);
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(16600);
      return;
      label345: paramArrayOfByte = com.tencent.mm.modelstat.b.fRa;
      if (!paramArrayOfByte.aka())
        break;
      paramArrayOfByte.a(paramq, com.tencent.mm.modelstat.b.b.fRn, 0);
      break;
      label372: ab.e("MicroMsg.NetSceneRevokeMsg", "cannot find the msg:%d after revoke.", new Object[] { Long.valueOf(this.cvx) });
    }
  }

  public final btj ajB()
  {
    return (btj)this.fAT.fsH.fsP;
  }

  public final int getType()
  {
    return 594;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.t
 * JD-Core Version:    0.6.2
 */