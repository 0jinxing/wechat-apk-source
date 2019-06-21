package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.vt;
import com.tencent.mm.g.a.vt.a;
import com.tencent.mm.model.p;
import com.tencent.mm.model.r;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.protocal.protobuf.ch;
import com.tencent.mm.protocal.protobuf.ci;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class af extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  public g mfY;

  public af(g paramg)
  {
    AppMethodBeat.i(102716);
    this.ehi = null;
    ab.i("MicroMsg.Fav.NetSceneAddFav", "NetSceneAddFavItem %s", new Object[] { Long.valueOf(paramg.field_localId) });
    b.a locala = new b.a();
    locala.fsJ = new ch();
    locala.fsK = new ci();
    locala.uri = "/cgi-bin/micromsg-bin/addfavitem";
    locala.fsI = 401;
    locala.fsL = 193;
    locala.fsM = 1000000193;
    this.ehh = locala.acD();
    this.mfY = paramg;
    AppMethodBeat.o(102716);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(102717);
    ch localch = (ch)this.ehh.fsG.fsP;
    localch.ptv = p.m(this.mfY.field_xml, System.currentTimeMillis());
    localch.jCt = this.mfY.field_type;
    localch.vEt = this.mfY.field_sourceType;
    this.mfY.field_xml = g.s(this.mfY);
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(this.mfY, new String[] { "localId" });
    localch.vEv = this.mfY.field_xml;
    localch.vEu = this.mfY.field_sourceId;
    this.mfY.LI("MicroMsg.Fav.NetSceneAddFav");
    this.ehi = paramf;
    ab.i("MicroMsg.Fav.NetSceneAddFav", "ADD FavItem, sourceId:%s localId:%d favId:%d", new Object[] { this.mfY.field_sourceId, Long.valueOf(this.mfY.field_localId), Integer.valueOf(this.mfY.field_id) });
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(102717);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(102718);
    ab.i("MicroMsg.Fav.NetSceneAddFav", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if (((paramInt2 == 0) && (paramInt3 == 0)) || (paramInt3 == -400))
    {
      paramq = (ci)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      ab.i("MicroMsg.Fav.NetSceneAddFav", "fav id %d, local id %d, itemStatus %d, update seq %d", new Object[] { Integer.valueOf(paramq.vEp), Long.valueOf(this.mfY.field_localId), Integer.valueOf(this.mfY.field_itemStatus), Integer.valueOf(paramq.vEs) });
      this.mfY.field_id = paramq.vEp;
      this.mfY.field_localSeq = paramq.vEs;
      if (this.mfY.field_itemStatus == 12)
      {
        ab.v("MicroMsg.Fav.NetSceneAddFav", "onGYNetEnd wait server upload sent");
        this.mfY.field_itemStatus = 13;
      }
      if (this.mfY.field_itemStatus == 9)
      {
        ab.v("MicroMsg.Fav.NetSceneAddFav", "onGYNetEnd item done");
        this.mfY.field_itemStatus = 10;
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().iB(this.mfY.field_localId);
        com.tencent.mm.plugin.report.service.h.pYm.e(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(this.mfY.field_type), Integer.valueOf(0), Long.valueOf(b.b(this.mfY)), Long.valueOf(h.ix(this.mfY.field_localId)) });
      }
      paramArrayOfByte = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iF(paramq.vEp);
      if (paramArrayOfByte != null)
      {
        this.mfY.field_updateSeq = paramArrayOfByte.field_updateSeq;
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().z(paramArrayOfByte);
        ab.i("MicroMsg.Fav.NetSceneAddFav", "onGYNetEnd aleady exist, delete old info, favId:%d", new Object[] { Integer.valueOf(paramArrayOfByte.field_id) });
      }
      paramArrayOfByte = v.Zp().nV(this.mfY.field_sessionId);
      if ((!bo.isNullOrNil(this.mfY.field_sessionId)) && (this.mfY.field_type == 5) && (paramArrayOfByte != null))
      {
        vt localvt = new vt();
        localvt.cSG.cSH = paramArrayOfByte.getString("prePublishId", "");
        if ((this.mfY.field_favProto != null) && (this.mfY.field_favProto.wit != null))
          localvt.cSG.url = this.mfY.field_favProto.wit.link;
        if ((bo.isNullOrNil(localvt.cSG.url)) && (this.mfY.field_favProto != null) && (this.mfY.field_favProto.whA != null) && (this.mfY.field_favProto.whA.wiY != null))
          localvt.cSG.url = this.mfY.field_favProto.whA.wiY;
        if (bo.isNullOrNil(localvt.cSG.url))
          localvt.cSG.url = paramArrayOfByte.getString("url", "");
        localvt.cSG.cSJ = paramArrayOfByte.getString("preUsername", "");
        localvt.cSG.cSK = paramArrayOfByte.getString("preChatName", "");
        localvt.cSG.cSL = paramArrayOfByte.getInt("preMsgIndex", 0);
        localvt.cSG.cSP = paramArrayOfByte.getInt("sendAppMsgScene", 0);
        localvt.cSG.cSQ = paramArrayOfByte.getInt("getA8KeyScene", 0);
        localvt.cSG.cSR = paramArrayOfByte.getString("referUrl", null);
        localvt.cSG.cSS = paramArrayOfByte.getString("adExtStr", null);
        localvt.cSG.cSM = "";
        localvt.cSG.cSN = "";
        localvt.cSG.cSO = 0;
        localvt.cSG.cSI = ("fav_" + r.Yz() + "_" + this.mfY.field_id);
        a.xxA.m(localvt);
      }
      this.mfY.field_sessionId = null;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(this.mfY, new String[] { "localId" });
      b.in(paramq.vEw);
    }
    if ((paramInt2 == 4) && (paramInt3 == -401))
    {
      ab.i("MicroMsg.Fav.NetSceneAddFav", "fav fail, full size");
      if (!this.mfY.buz())
        break label965;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(16, this.mfY.field_localId);
    }
    while (true)
    {
      b.d(this.mfY);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(102718);
      return;
      label965: ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(6, this.mfY.field_localId);
    }
  }

  public final int getType()
  {
    return 401;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.af
 * JD-Core Version:    0.6.2
 */