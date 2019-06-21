package com.tencent.mm.openim.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.openim.PluginOpenIM;
import com.tencent.mm.openim.e.a;
import com.tencent.mm.openim.e.d;
import com.tencent.mm.protocal.protobuf.alm;
import com.tencent.mm.protocal.protobuf.aln;
import com.tencent.mm.protocal.protobuf.as;
import com.tencent.mm.protocal.protobuf.bha;
import com.tencent.mm.protocal.protobuf.cvz;
import com.tencent.mm.protocal.protobuf.dr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class i extends m
  implements k
{
  String aOt;
  public final com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  String gfc;
  private LinkedList<String> gfd;

  public i(String paramString1, String paramString2, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(78858);
    this.gfd = new LinkedList();
    if ((!bo.isNullOrNil(paramString1)) && (paramString1.equals("wework")))
      ab.e("MicroMsg.Openim.NetSceneGetOpenIMResource", "NetSceneGetOpenIMResource error %s stack %s", new Object[] { paramString1, bo.dpG().toString() });
    while (true)
    {
      Object localObject = new b.a();
      ((b.a)localObject).fsJ = new alm();
      ((b.a)localObject).fsK = new aln();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getopenimresource";
      ((b.a)localObject).fsI = 453;
      this.ehh = ((b.a)localObject).acD();
      this.gfc = paramString1;
      this.aOt = paramString2;
      this.gfd.addAll(paramLinkedList);
      int i = 10 - this.gfd.size();
      if (i > 0)
        this.gfd.addAll(((PluginOpenIM)g.M(PluginOpenIM.class)).getWordingInfoStg().B(i, paramString2));
      localObject = (alm)this.ehh.fsG.fsP;
      ((alm)localObject).app_id = paramString1;
      ((alm)localObject).aOt = paramString2;
      ((alm)localObject).wqM = this.gfd;
      ab.i("MicroMsg.Openim.NetSceneGetOpenIMResource", "init NetSceneGetOpenIMResource appid:%s, lang:%s, initWordingIDs:%s, wordidList:%s", new Object[] { paramString1, paramString2, p(paramLinkedList), p(this.gfd) });
      AppMethodBeat.o(78858);
      return;
      ab.w("MicroMsg.Openim.NetSceneGetOpenIMResource", "NetSceneGetOpenIMResource normal %s stack %s", new Object[] { paramString1, bo.dpG().toString() });
    }
  }

  private static String p(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(78861);
    String str = "size:" + paramLinkedList.size() + "[";
    Iterator localIterator = paramLinkedList.iterator();
    for (paramLinkedList = str; localIterator.hasNext(); paramLinkedList = paramLinkedList + str + ",")
      str = (String)localIterator.next();
    paramLinkedList = paramLinkedList + "]";
    AppMethodBeat.o(78861);
    return paramLinkedList;
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(78859);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78859);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78860);
    ab.i("MicroMsg.Openim.NetSceneGetOpenIMResource", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, appid:%s, lang:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.gfc, this.aOt });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78860);
    }
    while (true)
    {
      return;
      paramq = (aln)this.ehh.fsH.fsP;
      paramArrayOfByte = paramq.wqO;
      ab.i("MicroMsg.Openim.NetSceneGetOpenIMResource", "onGYNetEnd acct_type_resource  url:%d, word:%d", new Object[] { Integer.valueOf(paramArrayOfByte.ckO.size()), Integer.valueOf(paramArrayOfByte.vCr.size()) });
      Object localObject = new a();
      ((a)localObject).field_acctTypeId = paramArrayOfByte.vCq;
      ((a)localObject).field_language = this.aOt;
      g.RQ();
      ((PluginOpenIM)g.M(PluginOpenIM.class)).getAccTypeInfoStg().b((com.tencent.mm.sdk.e.c)localObject, new String[] { "acctTypeId", "language" });
      ((a)localObject).field_accTypeRec = paramArrayOfByte;
      g.RQ();
      ((PluginOpenIM)g.M(PluginOpenIM.class)).getAccTypeInfoStg().a((a)localObject);
      localObject = paramq.wqN;
      ab.i("MicroMsg.Openim.NetSceneGetOpenIMResource", "onGYNetEnd appid_resource funcFlag:%d, url:%d, word:%d", new Object[] { Integer.valueOf(((dr)localObject).vFv), Integer.valueOf(((dr)localObject).ckO.size()), Integer.valueOf(((dr)localObject).vCr.size()) });
      com.tencent.mm.openim.e.c localc = new com.tencent.mm.openim.e.c();
      localc.field_appid = this.gfc;
      localc.field_language = this.aOt;
      g.RQ();
      ((PluginOpenIM)g.M(PluginOpenIM.class)).getAppIdInfoStg().b(localc, new String[] { "appid", "language" });
      localc.field_appRec = ((dr)localObject);
      localc.field_acctTypeId = paramArrayOfByte.vCq;
      g.RQ();
      ((PluginOpenIM)g.M(PluginOpenIM.class)).getAppIdInfoStg().a(localc);
      paramArrayOfByte = ((dr)localObject).ckO.iterator();
      while (paramArrayOfByte.hasNext())
      {
        localObject = (bha)paramArrayOfByte.next();
        if ("openim_desc_icon".equals(((bha)localObject).key))
          ((com.tencent.mm.openim.a.b)g.K(com.tencent.mm.openim.a.b.class)).vh(((bha)localObject).url);
      }
      ab.i("MicroMsg.Openim.NetSceneGetOpenIMResource", "onGYNetEnd wording_id_resource   word:%d", new Object[] { Integer.valueOf(paramq.wqP.size()) });
      localObject = paramq.wqP.iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramq = (cvz)((Iterator)localObject).next();
        paramArrayOfByte = new com.tencent.mm.openim.e.e();
        paramArrayOfByte.field_appid = this.gfc;
        paramArrayOfByte.field_wordingId = paramq.xrS;
        paramArrayOfByte.field_language = this.aOt;
        g.RQ();
        ((PluginOpenIM)g.M(PluginOpenIM.class)).getWordingInfoStg().b(paramArrayOfByte, new String[] { "appid", "wordingId", "language" });
        paramArrayOfByte.field_wording = paramq.cEh;
        paramArrayOfByte.field_pinyin = paramq.puh;
        paramArrayOfByte.field_quanpin = paramq.xrT;
        g.RQ();
        ((PluginOpenIM)g.M(PluginOpenIM.class)).getWordingInfoStg().a(paramArrayOfByte);
      }
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78860);
    }
  }

  public final int getType()
  {
    return 453;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.i
 * JD-Core Version:    0.6.2
 */