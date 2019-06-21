package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.akp;
import com.tencent.mm.protocal.protobuf.akq;
import com.tencent.mm.protocal.protobuf.azc;
import com.tencent.mm.protocal.protobuf.azd;
import com.tencent.mm.protocal.protobuf.bbl;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.protocal.protobuf.zs;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class ab extends m
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ai.b ehh;
  private f ehi;
  private List<String> gsD;
  private List<String> gwb;

  public ab()
  {
    AppMethodBeat.i(108444);
    this.ehi = null;
    aqf();
    akp localakp = (akp)this.ehh.fsG.fsP;
    localakp.wdO = "";
    localakp.wqj = null;
    localakp.wqi = 0;
    localakp.wqh = null;
    localakp.wqg = 0;
    localakp.nbk = 0;
    localakp.Scene = 1;
    AppMethodBeat.o(108444);
  }

  public ab(List<String> paramList1, List<String> paramList2)
  {
    AppMethodBeat.i(108445);
    this.ehi = null;
    aqf();
    if (((paramList1 == null) || (paramList1.size() == 0)) && ((paramList2 == null) || (paramList2.size() == 0)))
      AppMethodBeat.o(108445);
    while (true)
    {
      return;
      this.gsD = paramList1;
      this.gwb = paramList2;
      paramList1 = (akp)this.ehh.fsG.fsP;
      paramList1.wdO = "";
      paramList1.nbk = 2;
      paramList1.Scene = 1;
      AppMethodBeat.o(108445);
    }
  }

  private static void a(a parama, azd paramazd)
  {
    parama.guM = paramazd.guM;
    parama.guN = paramazd.guN;
    parama.guO = paramazd.guO;
    parama.guP = paramazd.guP;
    parama.guQ = paramazd.guQ;
    parama.guR = paramazd.guR;
    parama.guS = paramazd.guS;
    parama.guT = paramazd.guT;
    parama.guV = paramazd.guV;
    parama.guU = paramazd.guU;
    parama.guW = paramazd.guW;
    parama.guX = paramazd.guX;
    ccl localccl = paramazd.wBZ;
    if (localccl != null)
    {
      parama.guY = localccl.guY;
      parama.guZ = localccl.guZ;
      parama.gva = localccl.gva;
    }
    paramazd = paramazd.wCa;
    if (paramazd != null)
    {
      parama.gvb = paramazd.gvb;
      parama.gvc = paramazd.gvc;
      parama.gvd = paramazd.gvd;
      parama.gve = paramazd.gve;
    }
  }

  private void aqf()
  {
    AppMethodBeat.i(108446);
    b.a locala = new b.a();
    locala.fsJ = new akp();
    locala.fsK = new akq();
    locala.uri = "/cgi-bin/micromsg-bin/getmfriend";
    locala.fsI = 142;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(108446);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(108448);
    this.ehi = paramf;
    paramf = (akp)this.ehh.fsG.fsP;
    int i;
    if (paramf.nbk == 2)
      if (((this.gsD == null) || (this.gsD.size() == 0)) && ((this.gwb == null) || (this.gwb.size() == 0)))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneGetMFriend", "doScene failed, mobile list and email list empty.");
        i = -1;
        AppMethodBeat.o(108448);
      }
    while (true)
    {
      return i;
      Object localObject1;
      Object localObject2;
      Object localObject3;
      Object localObject4;
      if ((this.gsD != null) && (this.gsD.size() > 0))
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneGetMFriend", "doScene get mobile list size:%d", new Object[] { Integer.valueOf(this.gsD.size()) });
        localObject1 = new LinkedList();
        localObject2 = this.gsD.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (String)((Iterator)localObject2).next();
          localObject4 = new bbl();
          ((bbl)localObject4).v = ((String)localObject3);
          ((LinkedList)localObject1).add(localObject4);
        }
        paramf.wqh = ((LinkedList)localObject1);
        paramf.wqg = ((LinkedList)localObject1).size();
      }
      if ((this.gwb != null) && (this.gwb.size() > 0))
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneGetMFriend", "doScene get email list size:%d", new Object[] { Integer.valueOf(this.gwb.size()) });
        localObject3 = new LinkedList();
        localObject4 = this.gwb.iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject1 = (String)((Iterator)localObject4).next();
          localObject2 = new azc();
          ((azc)localObject2).v = ((String)localObject1);
          ((LinkedList)localObject3).add(localObject2);
        }
        paramf.wqj = ((LinkedList)localObject3);
        paramf.wqi = ((LinkedList)localObject3).size();
      }
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(108448);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108449);
    akq localakq = (akq)this.ehh.fsH.fsP;
    paramArrayOfByte = (akp)this.ehh.fsG.fsP;
    if ((paramInt2 == 4) && (paramInt3 == -68))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, localakq.getBaseResponse().ErrMsg.wVI, this);
      AppMethodBeat.o(108449);
    }
    while (true)
    {
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneGetMFriend", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(108449);
      }
      else
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSceneGetMFriend", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
        paramq = bo.nullAsNil((String)com.tencent.mm.kernel.g.RP().Ry().get(65828, null));
        if ((paramArrayOfByte.nbk == 1) && (!bo.isNullOrNil(localakq.wdO)) && (!localakq.wdO.equals(paramq)))
        {
          com.tencent.mm.kernel.g.RP().Ry().set(65828, localakq.wdO);
          ((h)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getFacebookFrdStg()).apM();
        }
        if (localakq.ndm != null)
          break;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneGetMFriend", "onGYNetEnd  friendlist null");
        AppMethodBeat.o(108449);
      }
    }
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneGetMFriend", "onGYNetEnd friend list size:%d", new Object[] { Integer.valueOf(localakq.ndm.size()) });
    long l = com.tencent.mm.kernel.g.RP().eJN.iV(Thread.currentThread().getId());
    paramInt1 = 0;
    azd localazd;
    a locala;
    g localg;
    label499: j localj;
    if (paramInt1 < localakq.ndm.size())
    {
      localazd = (azd)localakq.ndm.get(paramInt1);
      if (localazd == null)
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneGetMFriend", "Err getFriendList null");
      while (true)
      {
        paramInt1++;
        break;
        locala = ((b)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).vW(localazd.guM);
        if ((locala == null) && (paramArrayOfByte.nbk != 1))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneGetMFriend", "Err MD5 %s not found in AddrUploadStg, md5: ", new Object[] { localazd.guM });
        }
        else
        {
          com.tencent.mm.plugin.c.a.ask().Yn().ia(localazd.vHl, localazd.wlF);
          localg = new g();
          if (paramArrayOfByte.nbk != 1)
            break label964;
          if (localazd.wCX != null)
            break label499;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSceneGetMFriend", "ERR: facebook friend return null info");
        }
      }
      localg.dtU = localazd.wCX.lhy;
      localg.gvh = localazd.wCX.wfb;
      com.tencent.mm.ah.b.pR(localazd.wCX.lhy);
      localg.gvg = localazd.wCX.Name;
      localg.dFl = localazd.guS;
      localg.dud = localazd.guP;
      localg.duc = localazd.guO;
      localg.signature = localazd.guQ;
      localg.dub = localazd.guR;
      localg.dtS = localazd.guN;
      localg.bCu = localazd.wCW;
      localg.guG = com.tencent.mm.platformtools.g.vp(localazd.wCX.Name);
      localg.guH = com.tencent.mm.platformtools.g.vo(localazd.wCX.Name);
      localg.username = localazd.vHl;
      label674: localj = new j();
      localj.username = localazd.vHl;
      localj.duc = localazd.guO;
      localj.dud = localazd.guP;
      localj.signature = localazd.guQ;
      localj.dtS = localazd.guN;
      localj.dub = localazd.guR;
      paramq = null;
      if (!bo.isNullOrNil(localazd.vHl))
      {
        paramq = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(localazd.vHl);
        if ((paramq == null) || (!localazd.vHl.equals(paramq.field_username)))
          break label986;
        if ((bo.isNullOrNil(localazd.guS)) || (localazd.guS.equals(paramq.Hq())))
          break label1335;
        paramq.iy(localazd.guS);
        ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().b(paramq.field_username, paramq);
      }
    }
    label1335: 
    while (true)
    {
      label868: boolean bool;
      if (bo.isNullOrNil(localazd.vHl))
        if (paramArrayOfByte.nbk == 1)
        {
          bool = true;
          label891: Assert.assertTrue("mobile friend never go here", bool);
          localg.status = 102;
        }
      while (true)
      {
        if (paramArrayOfByte.nbk == 1)
          ((h)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getFacebookFrdStg()).a(localg);
        ((k)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getFrdExtStg()).a(localj);
        break;
        label964: if (!bo.isNullOrNil(localazd.vHl))
          break label674;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.NetSceneGetMFriend", "username null for mobile");
        break;
        label986: paramq = null;
        break label868;
        bool = false;
        break label891;
        if ((paramq == null) || (!com.tencent.mm.n.a.jh(paramq.field_type)))
        {
          localg.status = 100;
          if (locala != null)
          {
            locala.status = 1;
            locala.username = localazd.vHl;
            locala.bCu = localazd.wCW;
            locala.guG = com.tencent.mm.platformtools.g.vp(localazd.wCX.Name);
            locala.guH = com.tencent.mm.platformtools.g.vo(localazd.wCX.Name);
            locala.guL = locala.Ny();
            a(locala, localazd);
            locala.bJt = -1;
            ((b)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).a(locala.Aq(), locala);
            paramq = new com.tencent.mm.ah.h();
            paramq.username = localazd.vHl;
            paramq.frW = localazd.vXm;
            paramq.frV = localazd.vXn;
            paramq.cB(true);
            paramq.dtR = 3;
            o.act().b(paramq);
          }
        }
        else
        {
          localg.status = 101;
          if (locala != null)
          {
            locala.status = 2;
            locala.username = localazd.vHl;
            locala.bCu = localazd.wCW;
            locala.guL = locala.Ny();
            a(locala, localazd);
            locala.bJt = -1;
            ((b)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).a(locala.Aq(), locala);
            com.tencent.mm.ah.b.U(localazd.vHl, 3);
          }
        }
      }
      com.tencent.mm.kernel.g.RP().eJN.mB(l);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(108449);
      break;
    }
  }

  public final void aqg()
  {
    AppMethodBeat.i(108447);
    akp localakp = (akp)this.ehh.fsG.fsP;
    localakp.wdO = ((String)com.tencent.mm.kernel.g.RP().Ry().get(65828, null));
    localakp.nbk = 1;
    AppMethodBeat.o(108447);
  }

  public final int getType()
  {
    return 32;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.ab
 * JD-Core Version:    0.6.2
 */