package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.model.r;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.pluginsdk.a;
import com.tencent.mm.protocal.protobuf.azc;
import com.tencent.mm.protocal.protobuf.bbl;
import com.tencent.mm.protocal.protobuf.cle;
import com.tencent.mm.protocal.protobuf.clf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class al extends m
  implements k
{
  private int cAd;
  private f ehi;
  public final List<String> gwp;
  public final List<String> gwq;
  private final String gwr;
  private int gws;
  private int gwt;

  public al(List<String> paramList1, List<String> paramList2)
  {
    AppMethodBeat.i(108487);
    this.gwr = ((String)com.tencent.mm.kernel.g.RP().Ry().get(6, null));
    this.gwt = 0;
    this.gws = 0;
    this.gwp = paramList1;
    this.gwq = paramList2;
    this.cAd = 1;
    AppMethodBeat.o(108487);
  }

  private static List<String> av(List<azc> paramList)
  {
    AppMethodBeat.i(108491);
    ArrayList localArrayList = new ArrayList();
    if ((paramList == null) || (paramList.size() == 0))
    {
      ab.i("MicroMsg.NetSceneUploadMContact", "the req emai list is empty");
      AppMethodBeat.o(108491);
    }
    while (true)
    {
      return localArrayList;
      paramList = paramList.iterator();
      while (paramList.hasNext())
        localArrayList.add(((azc)paramList.next()).v);
      AppMethodBeat.o(108491);
    }
  }

  private static List<String> aw(List<bbl> paramList)
  {
    AppMethodBeat.i(108492);
    ArrayList localArrayList = new ArrayList();
    if ((paramList == null) || (paramList.size() == 0))
    {
      ab.i("MicroMsg.NetSceneUploadMContact", "the req mobile list is empty");
      AppMethodBeat.o(108492);
    }
    while (true)
    {
      return localArrayList;
      paramList = paramList.iterator();
      while (paramList.hasNext())
        localArrayList.add(com.tencent.mm.a.g.x(a.ws(((bbl)paramList.next()).v).getBytes()));
      AppMethodBeat.o(108492);
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    int i = 0;
    AppMethodBeat.i(108488);
    this.ehi = paramf;
    if (((this.gwp == null) || (this.gwp.size() == 0)) && ((this.gwq == null) || (this.gwq.size() == 0)))
    {
      ab.i("MicroMsg.NetSceneUploadMContact", "listMobile or listEmile is null or zero");
      j = -1;
      AppMethodBeat.o(108488);
      return j;
    }
    paramf = new b.a();
    paramf.fsJ = new cle();
    paramf.fsK = new clf();
    paramf.uri = "/cgi-bin/micromsg-bin/uploadmcontact";
    paramf.fsI = 133;
    paramf.fsL = 0;
    paramf.fsM = 0;
    paramf = paramf.acD();
    cle localcle = (cle)paramf.fsG.fsP;
    localcle.vLs = this.gwr;
    localcle.jBB = r.Yz();
    localcle.vIJ = this.cAd;
    int k = 200;
    LinkedList localLinkedList = new LinkedList();
    Object localObject1 = new LinkedList();
    do
    {
      int m;
      do
      {
        if (k <= 0)
          break label448;
        j = k;
        Object localObject2;
        if (this.gwp != null)
        {
          j = k;
          if (this.gws < this.gwp.size())
          {
            if (this.gwp.get(this.gws) != null)
            {
              localObject2 = new bbl();
              ((bbl)localObject2).v = ((String)this.gwp.get(this.gws));
              localLinkedList.add(localObject2);
            }
            this.gws += 1;
            j = k - 1;
          }
        }
        m = j;
        if (this.gwq != null)
        {
          m = j;
          if (this.gwt < this.gwq.size())
          {
            if (this.gwq.get(this.gwt) != null)
            {
              localObject2 = new azc();
              ((azc)localObject2).v = ((String)this.gwq.get(this.gwt));
              ((LinkedList)localObject1).add(localObject2);
            }
            this.gwt += 1;
            m = j - 1;
          }
        }
        if (this.gwq == null)
          break;
        k = m;
      }
      while (this.gwt < this.gwq.size());
      if (this.gwp == null)
        break;
      k = m;
    }
    while (this.gws < this.gwp.size());
    label448: localcle.wCo = localLinkedList;
    localcle.xiQ = localLinkedList.size();
    localcle.xiS = ((LinkedList)localObject1);
    localcle.xiR = ((LinkedList)localObject1).size();
    localObject1 = new StringBuilder("doscene in:[");
    if (this.gwq == null)
    {
      j = 0;
      label503: localObject1 = ((StringBuilder)localObject1).append(j).append(",");
      if (this.gwp != null)
        break label634;
    }
    label634: for (int j = i; ; j = this.gwp.size())
    {
      ab.v("MicroMsg.NetSceneUploadMContact", j + "] index:[" + this.gwt + "," + this.gws + "] req:[" + localcle.xiS.size() + "," + localcle.wCo.size() + "]");
      j = a(parame, paramf, this);
      AppMethodBeat.o(108488);
      break;
      j = this.gwq.size();
      break label503;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108490);
    ab.i("MicroMsg.NetSceneUploadMContact", "onSceneEnd: errType = " + paramInt2 + " errCode = " + paramInt3 + " errMsg = " + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneUploadMContact", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(108490);
    }
    while (true)
    {
      return;
      paramq = (cle)((b)paramq).fsG.fsP;
      l.at(av(paramq.xiS));
      l.at(aw(paramq.wCo));
      if (((this.gwq == null) || (this.gwt >= this.gwq.size())) && ((this.gwp == null) || (this.gws >= this.gwp.size())))
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(108490);
      }
      else
      {
        if (a(this.ftf, this.ehi) < 0)
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(108490);
      }
    }
  }

  public final boolean acI()
  {
    return true;
  }

  public final int acn()
  {
    return 10;
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(108489);
    paramq = (cle)((b)paramq).fsG.fsP;
    int i = paramq.xiS.size() + paramq.wCo.size();
    if ((i == 0) || (i > 200))
    {
      ab.e("MicroMsg.NetSceneUploadMContact", "security checked failed : exceed max send count");
      paramq = m.b.ftv;
      AppMethodBeat.o(108489);
    }
    while (true)
    {
      return paramq;
      if ((paramq.vLs == null) || (paramq.vLs.length() <= 0))
      {
        ab.e("MicroMsg.NetSceneUploadMContact", "security checked failed : moblie null");
        paramq = m.b.ftv;
        AppMethodBeat.o(108489);
      }
      else if ((paramq.jBB == null) || (paramq.jBB.length() <= 0))
      {
        ab.e("MicroMsg.NetSceneUploadMContact", "security checked failed : username null");
        paramq = m.b.ftv;
        AppMethodBeat.o(108489);
      }
      else
      {
        paramq = m.b.ftu;
        AppMethodBeat.o(108489);
      }
    }
  }

  public final int getType()
  {
    return 133;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.al
 * JD-Core Version:    0.6.2
 */