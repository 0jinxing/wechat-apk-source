package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.al.a;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aaq;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.qo;
import com.tencent.mm.protocal.protobuf.qp;
import com.tencent.mm.protocal.protobuf.qq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class ai extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  private int mge;
  public g mgf;
  private boolean mgg;
  private boolean mgh;
  HashMap<aar, Boolean> mgi;

  public ai(g paramg)
  {
    AppMethodBeat.i(102731);
    this.mge = 0;
    this.ehi = null;
    this.mgg = true;
    this.mgh = false;
    this.mgi = new HashMap();
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new qp();
    ((b.a)localObject).fsK = new qq();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkcdn";
    ((b.a)localObject).fsI = 404;
    ((b.a)localObject).fsL = 197;
    ((b.a)localObject).fsM = 1000000197;
    this.ehh = ((b.a)localObject).acD();
    this.mgf = paramg;
    localObject = paramg.field_favProto.wiv.iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramg = (aar)((Iterator)localObject).next();
      this.mgi.put(paramg, Boolean.FALSE);
    }
    AppMethodBeat.o(102731);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(102732);
    this.ehi = paramf;
    Object localObject = this.mgi.keySet().iterator();
    int i = 0;
    if (((Iterator)localObject).hasNext())
    {
      paramf = (aar)((Iterator)localObject).next();
      if (((Boolean)this.mgi.get(paramf)).booleanValue())
        break label668;
    }
    label143: label658: label665: label668: for (int j = i + 1; ; j = i)
    {
      i = j;
      break;
      if (i == 0)
      {
        ab.e("MicroMsg.NetSceneCheckCDN", "klem doScene data list null");
        this.mge = -100;
        j = -100;
        AppMethodBeat.o(102732);
        return j;
      }
      localObject = (qp)this.ehh.fsG.fsP;
      ((qp)localObject).jBw.clear();
      paramf = this.mgf.field_favProto.wiv;
      int k = 0;
      j = 0;
      int m;
      if (k < paramf.size())
      {
        aar localaar = (aar)paramf.get(k);
        if (((Boolean)this.mgi.get(localaar)).booleanValue())
          break label665;
        m = j;
        if (!localaar.wgL)
        {
          localqo = new qo();
          localqo.vXE = ((int)localaar.wgu);
          localqo.vXC = localaar.wgq;
          localqo.vXD = localaar.wgs;
          localqo.vXB = String.valueOf(k);
          localqo.vXG = localaar.wgH;
          localqo.vXF = this.mgf.field_sourceType;
          localqo.vXH = 0;
          ((qp)localObject).jBw.add(localqo);
          m = j + 1;
          ab.i("MicroMsg.NetSceneCheckCDN", "check CDN, dataId %s, dataSourceId %s, DataSourceType %s, FullSize %d, FullMd5 %s, Head256Md5 %s", new Object[] { localqo.vXB, localqo.vXG, Integer.valueOf(localqo.vXF), Integer.valueOf(localqo.vXE), localqo.vXC, localqo.vXD });
        }
        if (localaar.wgN)
          break label658;
        qo localqo = new qo();
        localqo.vXE = ((int)localaar.wgF);
        localqo.vXC = localaar.wgB;
        localqo.vXD = localaar.wgD;
        localqo.vXG = localaar.wgH;
        localqo.vXF = this.mgf.field_sourceType;
        localqo.vXB = (k + "t");
        localqo.vXH = 1;
        ((qp)localObject).jBw.add(localqo);
        j = m + 1;
        ab.i("MicroMsg.NetSceneCheckCDN", "check CDN thumb, dataId %s, dataSourceId %s, DataSourceType %s, FullSize %d, FullMd5 %s, Head256Md5 %s", new Object[] { localqo.vXB, localqo.vXG, Integer.valueOf(localqo.vXF), Integer.valueOf(localqo.vXE), localqo.vXC, localqo.vXD });
        label542: m = j;
        if (j >= 19)
          break label563;
      }
      while (true)
      {
        k++;
        break label143;
        m = j;
        label563: ab.i("MicroMsg.NetSceneCheckCDN", "doScene:  usedCount %d, dataSize %d, nextBegIndex %d", new Object[] { Integer.valueOf(m), Integer.valueOf(i), Integer.valueOf(k + 1) });
        ((qp)localObject).jBv = m;
        if (m == 0)
        {
          ab.w("MicroMsg.NetSceneCheckCDN", "no more data, must not check cdn!");
          this.mge = -101;
          j = -101;
          AppMethodBeat.o(102732);
          break;
        }
        j = a(parame, this.ehh, this);
        AppMethodBeat.o(102732);
        break;
        j = m;
        break label542;
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(102733);
    ab.i("MicroMsg.NetSceneCheckCDN", "netId %d errType %d errCode %d localErrCode %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.mge), paramString });
    int i;
    if (paramInt2 == 0)
    {
      i = paramInt3;
      if (paramInt3 == 0);
    }
    else
    {
      if ((paramInt2 == 3) && (this.mge == -100))
      {
        ab.d("MicroMsg.NetSceneCheckCDN", "need not check cdn, add fav now");
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().J(9, this.mgf.field_localId);
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getSendService().run();
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(102733);
        return;
      }
      if ((paramInt2 != 3) || (this.mge != -101))
        break label827;
      i = 0;
    }
    if ((this.mge != -101) && (paramInt2 == 0) && (i == 0))
    {
      paramArrayOfByte = ((qq)((com.tencent.mm.ai.b)paramq).fsH.fsP).jBw;
      paramq = this.mgf.field_favProto.wiv;
      paramInt1 = 0;
      label223: Object localObject1;
      if (paramInt1 < paramArrayOfByte.size())
      {
        localObject1 = (aaq)paramArrayOfByte.get(paramInt1);
        localObject2 = ((aaq)localObject1).vXB;
        aar localaar;
        if (!bo.isNullOrNil((String)localObject2))
        {
          ab.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet status:%d, tmpId %s", new Object[] { Integer.valueOf(((aaq)localObject1).jBT), localObject2 });
          if (((aaq)localObject1).jBT == 1)
          {
            if (((String)localObject2).endsWith("t"))
              break label850;
            localaar = (aar)paramq.get(bo.getInt((String)localObject2, 0));
            ab.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn data exist, update url:%s, key:%s, DataId %s, FullMd5 %s, FullSize %d, Head256Md5 %s", new Object[] { ((aaq)localObject1).wfP, ((aaq)localObject1).vRw, ((aaq)localObject1).vXB, ((aaq)localObject1).vXC, Integer.valueOf(((aaq)localObject1).vXE), ((aaq)localObject1).vXD });
            localaar.akM(((aaq)localObject1).vRw);
            localaar.akL(((aaq)localObject1).wfP);
            if (!bo.isNullOrNil(((aaq)localObject1).wfQ))
              localaar.ala(((aaq)localObject1).wfQ);
            if (bo.isNullOrNil(localaar.wgq))
            {
              ab.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn exist, local not exist");
              localaar.akS(((aaq)localObject1).vXC);
              localaar.mf(((aaq)localObject1).vXE);
              localaar.akT(((aaq)localObject1).vXD);
              b.a(localaar, this.mgf, 1, false);
            }
            if ((!bo.isNullOrNil(((aaq)localObject1).vXC)) && (!((aaq)localObject1).vXC.equals(localaar.wgq)))
            {
              ab.w("MicroMsg.NetSceneCheckCDN", "svrFullMd5 %s, localMd5 %s", new Object[] { ((aaq)localObject1).vXC, localaar.wgq });
              localaar.akS(((aaq)localObject1).vXC);
            }
            if ((!bo.isNullOrNil(((aaq)localObject1).vXD)) && (!((aaq)localObject1).vXD.equals(localaar.wgs)))
            {
              ab.w("MicroMsg.NetSceneCheckCDN", "svrHead256md5 %s, localHead256md5 %s", new Object[] { ((aaq)localObject1).vXD, localaar.wgs });
              localaar.akT(((aaq)localObject1).vXD);
            }
            if ((((aaq)localObject1).vXE > 0) && (((aaq)localObject1).vXE != localaar.wgu))
            {
              ab.w("MicroMsg.NetSceneCheckCDN", "svrFullSize %d, localFullSize %d", new Object[] { Integer.valueOf(((aaq)localObject1).vXE), Long.valueOf(localaar.wgu) });
              localaar.mf(((aaq)localObject1).vXE);
            }
          }
          label701: if (((String)localObject2).endsWith("t"))
            break label1120;
          localaar = (aar)paramq.get(bo.getInt((String)localObject2, 0));
          this.mgi.put(localaar, Boolean.TRUE);
          label743: if ((((aaq)localObject1).jBT == 1) || (((aaq)localObject1).jBT == 2))
            break label1254;
          if (((String)localObject2).endsWith("t"))
            break label1595;
          localaar = (aar)paramq.get(bo.getInt((String)localObject2, 0));
          if (!bo.isNullOrNil(localaar.wgq))
            break label1165;
          ab.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet data cdn not exist, local not exist ", new Object[] { localaar.wgq });
        }
        while (true)
        {
          paramInt1++;
          break label223;
          label827: this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(102733);
          break;
          label850: localaar = (aar)paramq.get(bo.getInt(((String)localObject2).substring(0, ((String)localObject2).length() - 1), 0));
          ab.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn thumb exist, update url:%s, key:%s, DataId %s, FullMd5 %s, FullSize %d, Head256Md5 %s", new Object[] { ((aaq)localObject1).wfP, ((aaq)localObject1).vRw, ((aaq)localObject1).vXB, ((aaq)localObject1).vXC, Integer.valueOf(((aaq)localObject1).vXE), ((aaq)localObject1).vXD });
          localaar.akK(((aaq)localObject1).vRw);
          localaar.akJ(((aaq)localObject1).wfP);
          if (((aaq)localObject1).vXE <= 0)
            break label701;
          localaar.mg(((aaq)localObject1).vXE);
          if ((!bo.isNullOrNil(((aaq)localObject1).vXC)) && (!((aaq)localObject1).vXC.equals(localaar.wgB)))
          {
            ab.w("MicroMsg.NetSceneCheckCDN", "svrThumbMd5 %s, localThumbMd5 %s", new Object[] { ((aaq)localObject1).vXC, localaar.wgB });
            localaar.akX(((aaq)localObject1).vXC);
          }
          if ((bo.isNullOrNil(((aaq)localObject1).vXD)) || (((aaq)localObject1).vXD.equals(localaar.wgD)))
            break label701;
          ab.w("MicroMsg.NetSceneCheckCDN", "svrThumbHead256md5 %s, localThumbHead256md5 %s", new Object[] { ((aaq)localObject1).vXD, localaar.wgD });
          localaar.akY(((aaq)localObject1).vXD);
          break label701;
          label1120: localaar = (aar)paramq.get(bo.getInt(((String)localObject2).substring(0, ((String)localObject2).length() - 1), 0));
          this.mgi.put(localaar, Boolean.TRUE);
          break label743;
          label1165: this.mgg = false;
          String str;
          if (bo.isNullOrNil(localaar.wgb))
          {
            com.tencent.mm.al.f.afy();
            str = a.afp();
            localaar.akM(str);
            ab.i("MicroMsg.NetSceneCheckCDN", "local not exist cdn data key, generate %s", new Object[] { str });
          }
          ab.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn not exist, insert data md5:%s cdnkey:%s", new Object[] { localaar.wgq, localaar.wgb });
          b.a(localaar, this.mgf, 0, false);
          while (true)
          {
            label1254: if (((aaq)localObject1).jBT != 2)
              break label1747;
            this.mgh = true;
            if (((String)localObject2).endsWith("t"))
              break label1749;
            ab.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet data cdn not exist svr upload, dataStatus:%d, CdnUrl:%s, CdnKey:%s", new Object[] { Integer.valueOf(((aaq)localObject1).wfR), ((aaq)localObject1).wfP, ((aaq)localObject1).vRw });
            localObject2 = (aar)paramq.get(bo.getInt((String)localObject2, 0));
            ((aar)localObject2).LF(((aaq)localObject1).wfR);
            ((aar)localObject2).akM(((aaq)localObject1).vRw);
            ((aar)localObject2).akL(((aaq)localObject1).wfP);
            if (!bo.isNullOrNil(((aaq)localObject1).wfQ))
              ((aar)localObject2).ala(((aaq)localObject1).wfQ);
            if ((!bo.isNullOrNil(((aaq)localObject1).vXC)) && (!((aaq)localObject1).vXC.equals(((aar)localObject2).wgq)))
            {
              ab.w("MicroMsg.NetSceneCheckCDN", "SVR_UPLOADING::svrFullMd5 %s, localMd5 %s", new Object[] { ((aaq)localObject1).vXC, ((aar)localObject2).wgq });
              ((aar)localObject2).akS(((aaq)localObject1).vXC);
            }
            if ((!bo.isNullOrNil(((aaq)localObject1).vXD)) && (!((aaq)localObject1).vXD.equals(((aar)localObject2).wgs)))
            {
              ab.w("MicroMsg.NetSceneCheckCDN", "SVR_UPLOADING::svrHead256md5 %s, localHead256md5 %s", new Object[] { ((aaq)localObject1).vXD, ((aar)localObject2).wgs });
              ((aar)localObject2).akT(((aaq)localObject1).vXD);
            }
            if ((((aaq)localObject1).vXE <= 0) || (((aaq)localObject1).vXE == ((aar)localObject2).wgu))
              break;
            ab.w("MicroMsg.NetSceneCheckCDN", "SVR_UPLOADING::svrFullSize %d, localFullSize %d", new Object[] { Integer.valueOf(((aaq)localObject1).vXE), Long.valueOf(((aar)localObject2).wgu) });
            ((aar)localObject2).mf(((aaq)localObject1).vXE);
            break;
            label1595: localaar = (aar)paramq.get(bo.getInt(((String)localObject2).substring(0, ((String)localObject2).length() - 1), 0));
            if (bo.isNullOrNil(localaar.wgB))
            {
              ab.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet thumb cdn not exist, local not exist ", new Object[] { localaar.wgB });
              break;
            }
            this.mgg = false;
            if (bo.isNullOrNil(localaar.wgb))
            {
              com.tencent.mm.al.f.afy();
              str = a.afp();
              localaar.akM(str);
              ab.i("MicroMsg.NetSceneCheckCDN", "local not exist cdn data key, generate %s", new Object[] { str });
            }
            ab.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn not exist, insert thumb md5:%s cdnkey:%s", new Object[] { localaar.wgq, localaar.wgb });
            b.a(localaar, this.mgf, 0);
          }
          label1747: continue;
          label1749: ab.e("MicroMsg.NetSceneCheckCDN", "klem OnGYNet svr uploading thumb?! should not reach here!!");
        }
      }
      Object localObject2 = this.mgi.keySet().iterator();
      paramInt1 = 0;
      label1776: if (((Iterator)localObject2).hasNext())
      {
        localObject1 = (aar)((Iterator)localObject2).next();
        if (((Boolean)this.mgi.get(localObject1)).booleanValue())
          break label2317;
        paramInt1++;
      }
    }
    label2317: 
    while (true)
    {
      break label1776;
      ab.i("MicroMsg.NetSceneCheckCDN", "onGYSceneEnd:  resultCount %d, dataSize %d", new Object[] { Integer.valueOf(paramArrayOfByte.size()), Integer.valueOf(paramq.size()) });
      if (paramInt1 > 0)
      {
        ab.w("MicroMsg.NetSceneCheckCDN", "check cdn list not end, continues");
        paramInt1 = a(this.ftf, this.ehi);
        if ((paramInt1 != -100) && (paramInt1 != -101))
        {
          AppMethodBeat.o(102733);
          break;
        }
      }
      if (this.mgh)
      {
        ab.i("MicroMsg.NetSceneCheckCDN", "klem onGYNet waitServerUpload, send item now");
        this.mgf.field_itemStatus = 12;
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(this.mgf, new String[] { "localId" });
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getSendService().run();
        this.ehi.onSceneEnd(paramInt2, i, paramString, this);
        AppMethodBeat.o(102733);
        break;
      }
      if (this.mgg)
      {
        ab.i("MicroMsg.NetSceneCheckCDN", "klem onGYNet all data exist, start send item");
        if (this.mgf.field_id > 0)
        {
          this.mgf.field_itemStatus = 17;
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(this.mgf, new String[] { "localId" });
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getModService().run();
        }
        while (true)
        {
          this.ehi.onSceneEnd(paramInt2, i, paramString, this);
          AppMethodBeat.o(102733);
          break;
          if (this.mgf.field_type == 18)
            this.mgf.field_favProto.LM(1);
          this.mgf.field_itemStatus = 9;
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(this.mgf, new String[] { "localId" });
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getSendService().run();
        }
      }
      if (this.mgf.field_id > 0);
      for (this.mgf.field_itemStatus = 15; ; this.mgf.field_itemStatus = 4)
      {
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(this.mgf, new String[] { "localId" });
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnService().run();
        break;
        if (this.mgf.field_type == 18)
          this.mgf.field_favProto.LM(1);
      }
    }
  }

  public final int acn()
  {
    return 10;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 404;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.ai
 * JD-Core Version:    0.6.2
 */