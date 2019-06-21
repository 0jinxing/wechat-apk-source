package com.tencent.mm.plugin.shake.c.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.model.aw;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.akf;
import com.tencent.mm.protocal.protobuf.akg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class b extends com.tencent.mm.ai.m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  public e qsm;

  public b(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(24511);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new akf();
    ((b.a)localObject).fsK = new akg();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/getlbscard";
    ((b.a)localObject).fsI = 1251;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (akf)this.ehh.fsG.fsP;
    ((akf)localObject).cEB = paramFloat2;
    ((akf)localObject).cGm = paramFloat1;
    AppMethodBeat.o(24511);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(24512);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(24512);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(24513);
    ab.i("MicroMsg.NetSceneGetLbsCard", "onGYNetEnd, getType = 1251 errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (akg)this.ehh.fsH.fsP;
      if (paramq == null)
        break label837;
      paramInt1 = (int)(System.currentTimeMillis() / 1000L);
      if (paramq.wpH)
        break label109;
      ab.e("MicroMsg.NetSceneGetLbsCard", "getlbscard have_card is false, no card , don't handle");
    }
    label203: label743: 
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(24513);
      return;
      label109: if (paramq.wpL <= paramInt1)
      {
        ab.e("MicroMsg.NetSceneGetLbsCard", "getlbscard entrance_endtime: " + paramq.wpL + " is <= currentTime:" + paramInt1 + " , don't handle");
      }
      else if (TextUtils.isEmpty(paramq.kbU))
      {
        ab.e("MicroMsg.NetSceneGetLbsCard", "getlbscard card_tp_id is empty , don't handle");
      }
      else
      {
        ab.i("MicroMsg.NetSceneGetLbsCard", "getlbscard have_card is true");
        if (paramq.wpI)
        {
          ab.i("MicroMsg.NetSceneGetLbsCard", "getlbscard have_red_dot is true");
          this.qsm = new e();
          this.qsm.kdC = 1;
          this.qsm.kbU = paramq.kbU;
          this.qsm.cMD = paramq.cMD;
          this.qsm.title = paramq.title;
          this.qsm.kbW = paramq.kbW;
          this.qsm.kbX = paramq.kbX;
          this.qsm.kdg = paramq.kdg;
          this.qsm.kbV = paramq.kbV;
          this.qsm.color = paramq.color;
          this.qsm.qsn = 0;
          this.qsm.qsq = paramq.qsq;
          this.qsm.qsr = paramq.qsr;
          this.qsm.qss = paramq.qss;
          this.qsm.qst = paramq.qst;
          this.qsm.qsu = "";
          this.qsm.kbZ = paramq.kbZ;
          this.qsm.qsv = paramq.qsv;
          this.qsm.qsw = paramq.qsw;
          com.tencent.mm.plugin.shake.b.m.cjY().qsp = this.qsm.qsu;
          ab.i("MicroMsg.NetSceneGetLbsCard", "getlbscard entrance_endtime: " + paramq.wpL + " is <= currentTime:" + paramInt1);
          ab.i("MicroMsg.NetSceneGetLbsCard", "getlbscard activity_type: " + paramq.wpN);
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xIN, Integer.valueOf(paramInt1));
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xIO, Integer.valueOf(paramq.wpL));
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xIP, paramq.wpO);
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xIS, paramq.wpM);
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xIT, Integer.valueOf(paramq.wpN));
          paramArrayOfByte = com.tencent.mm.plugin.shake.c.c.a.ckq();
          ab.i("MicroMsg.NetSceneGetLbsCard", "getlbscard msg reddotid is " + paramq.wpJ);
          ab.i("MicroMsg.NetSceneGetLbsCard", "getlbscard pre reddotid is ".concat(String.valueOf(paramArrayOfByte)));
          if (TextUtils.isEmpty(paramq.wpJ))
            ab.i("MicroMsg.NetSceneGetLbsCard", "getlbscard resp.red_dot_id is empty");
          if (!TextUtils.isEmpty(paramArrayOfByte))
            break label743;
          ab.i("MicroMsg.NetSceneGetLbsCard", "getlbscard pre_red_dot_id is empty, resp.red_dot_id is not empty");
          com.tencent.mm.x.c.PK().y(262155, true);
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xIX, paramq.wpJ);
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xIY, paramq.wpK);
        }
        while (true)
        {
          h.pYm.X(11721, paramq.kbU);
          break;
          ab.i("MicroMsg.NetSceneGetLbsCard", "getlbscard have_red_dot is false");
          break label203;
          if (!paramArrayOfByte.equals(paramq.wpJ))
          {
            ab.i("MicroMsg.NetSceneGetLbsCard", "getlbscard redDotId and msg.reddotid is not empty, but no equals");
            com.tencent.mm.x.c.PK().y(262155, true);
            aw.ZK();
            com.tencent.mm.model.c.Ry().set(ac.a.xIX, paramq.wpJ);
            aw.ZK();
            com.tencent.mm.model.c.Ry().set(ac.a.xIY, paramq.wpK);
          }
          else if (paramArrayOfByte.equals(paramq.wpJ))
          {
            ab.i("MicroMsg.NetSceneGetLbsCard", "redDotId equals msg.reddotid");
          }
        }
        ab.e("MicroMsg.NetSceneGetLbsCard", "getlbscard resp is null");
      }
    }
  }

  public final int getType()
  {
    return 1251;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.c.a.b
 * JD-Core Version:    0.6.2
 */