package com.tencent.mm.plugin.shake.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bym;
import com.tencent.mm.protocal.protobuf.byn;
import com.tencent.mm.protocal.protobuf.byo;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.g;
import java.util.LinkedList;
import java.util.List;

public final class a extends com.tencent.mm.ai.m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  private String kfM;
  List<d> qrD;
  private int qrE;
  int ret;

  public a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(24411);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new byn();
    ((b.a)localObject).fsK = new byo();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/shakeget";
    ((b.a)localObject).fsI = 162;
    ((b.a)localObject).fsL = 57;
    ((b.a)localObject).fsM = 1000000057;
    this.ehh = ((b.a)localObject).acD();
    localObject = (byn)this.ehh.fsG.fsP;
    ((byn)localObject).vJd = new SKBuiltinBuffer_t().setBuffer(paramArrayOfByte);
    ((byn)localObject).wXL = 1;
    ((byn)localObject).vIl = new SKBuiltinBuffer_t().setBuffer(com.tencent.mm.plugin.normsg.a.b.oTO.bVS());
    AppMethodBeat.o(24411);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(24412);
    ab.d("MicroMsg.NetSceneShakeGet", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(24412);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(24413);
    ab.d("MicroMsg.NetSceneShakeGet", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    byo localbyo = (byo)this.ehh.fsH.fsP;
    this.qrD = new LinkedList();
    this.qrE = localbyo.wXN;
    this.ret = localbyo.Ret;
    this.kfM = localbyo.phA;
    int i = localbyo.jBv;
    ab.d("MicroMsg.NetSceneShakeGet", "size:".concat(String.valueOf(i)));
    aw.ZK();
    paramq = c.XM();
    if (i > 0)
    {
      paramArrayOfByte = m.cjS();
      paramArrayOfByte.cjI();
      ab.i("MicroMsg.NewShakeItemStorage", "delOldRecord count:".concat(String.valueOf(i)));
      Object localObject1 = new StringBuilder("DELETE FROM shakeitem1 WHERE shakeItemID NOT IN ( SELECT shakeItemID FROM shakeitem1 ORDER BY shakeItemID DESC LIMIT ");
      label232: Object localObject2;
      boolean bool;
      if (100 > i)
      {
        paramInt1 = 100 - i;
        localObject1 = paramInt1 + " )";
        if (paramArrayOfByte.bSd.hY("shakeitem1", (String)localObject1))
        {
          ab.i("MicroMsg.NewShakeItemStorage", "delOldRecord success count:".concat(String.valueOf(i)));
          paramArrayOfByte.doNotify();
        }
        paramInt1 = i - 1;
        if (paramInt1 < 0)
          break label766;
        if (!r.Yz().equals(((bym)localbyo.wXM.get(paramInt1)).jBB))
        {
          localObject2 = z.aeR().qP(((bym)localbyo.wXM.get(paramInt1)).jBB);
          ((com.tencent.mm.aj.d)localObject2).field_username = ((bym)localbyo.wXM.get(paramInt1)).jBB;
          ((com.tencent.mm.aj.d)localObject2).field_brandList = ((bym)localbyo.wXM.get(paramInt1)).guX;
          localObject1 = ((bym)localbyo.wXM.get(paramInt1)).wCa;
          if (localObject1 != null)
          {
            ((com.tencent.mm.aj.d)localObject2).field_brandFlag = ((uy)localObject1).gvb;
            ((com.tencent.mm.aj.d)localObject2).field_brandInfo = ((uy)localObject1).gvd;
            ((com.tencent.mm.aj.d)localObject2).field_brandIconURL = ((uy)localObject1).gve;
            ((com.tencent.mm.aj.d)localObject2).field_extInfo = ((uy)localObject1).gvc;
          }
          if (!z.aeR().e((com.tencent.mm.aj.d)localObject2))
            z.aeR().d((com.tencent.mm.aj.d)localObject2);
        }
        localObject1 = new d((bym)localbyo.wXM.get(paramInt1));
        localObject2 = new h();
        ((h)localObject2).username = ((d)localObject1).field_username;
        if (((d)localObject1).field_hasHDImg <= 0)
          break label754;
        bool = true;
        label456: ((h)localObject2).cB(bool);
        ((h)localObject2).dtR = ((d)localObject1).field_imgstatus;
        ((h)localObject2).frW = ((bym)localbyo.wXM.get(paramInt1)).vXm;
        ((h)localObject2).frV = ((bym)localbyo.wXM.get(paramInt1)).vXn;
        o.act().b((h)localObject2);
        ((h)localObject2).bJt = -1;
        ab.d("MicroMsg.NetSceneShakeGet", "dkhurl search %s b[%s] s[%s]", new Object[] { ((h)localObject2).getUsername(), ((h)localObject2).ack(), ((h)localObject2).acl() });
        if (!paramq.aoJ(((d)localObject1).field_username))
          break label760;
      }
      label754: label760: for (i = 1; ; i = 0)
      {
        ((d)localObject1).field_reserved2 = i;
        localObject2 = paramq.aoO(((d)localObject1).field_username);
        if ((localObject2 != null) && ((int)((com.tencent.mm.n.a)localObject2).ewQ > 0))
        {
          paramArrayOfByte.WC(((ap)localObject2).field_username);
          paramArrayOfByte.WC(((ap)localObject2).field_encryptUsername);
        }
        paramArrayOfByte.a((d)localObject1, false);
        aw.ZK();
        c.Yn().x(((d)localObject1).field_username, this.qrE, ((bym)localbyo.wXM.get(paramInt1)).wlF);
        ((d)localObject1).scene = this.qrE;
        this.qrD.add(localObject1);
        ab.v("MicroMsg.NetSceneShakeGet", "item info: " + ((d)localObject1).field_username + " " + ((d)localObject1).field_nickname);
        paramInt1--;
        break label232;
        paramInt1 = 0;
        break;
        bool = false;
        break label456;
      }
    }
    label766: this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(24413);
  }

  public final int getType()
  {
    return 162;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.b.a
 * JD-Core Version:    0.6.2
 */