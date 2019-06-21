package com.tencent.mm.pluginsdk.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.c.a;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cnf;
import com.tencent.mm.protocal.protobuf.cnh;
import com.tencent.mm.protocal.protobuf.cni;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.g;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public class m extends com.tencent.mm.ai.m
  implements k
{
  public int cAd;
  public final com.tencent.mm.ai.b ehh;
  private f ehi;
  public String gwh;
  public List<String> vbm;
  public String vbn;
  private List<String> vbo;

  public m(int paramInt, List<String> paramList, List<Integer> paramList1, String paramString1, String paramString2)
  {
    this(paramInt, paramList, paramList1, null, paramString1, paramString2, null, null, "");
  }

  public m(int paramInt, List<String> paramList1, List<Integer> paramList, List<String> paramList2, String paramString1, String paramString2, Map<String, Integer> paramMap, String paramString3, String paramString4)
  {
    AppMethodBeat.i(79218);
    this.vbm = null;
    this.cAd = 0;
    this.vbo = null;
    boolean bool;
    Object localObject;
    if (paramInt != 3)
    {
      bool = true;
      Assert.assertTrue("This NetSceneVerifyUser init NEVER use opcode == MM_VERIFYUSER_VERIFYOK", bool);
      this.cAd = paramInt;
      this.vbm = paramList1;
      if (paramList2 != null)
      {
        localObject = paramList2;
        if (paramList2.size() != 0);
      }
      else
      {
        localObject = new LinkedList();
      }
      paramList2 = new b.a();
      paramList2.fsJ = new cnh();
      paramList2.fsK = new cni();
      paramList2.uri = "/cgi-bin/micromsg-bin/verifyuser";
      paramList2.fsI = 137;
      paramList2.fsL = 44;
      paramList2.fsM = 1000000044;
      this.ehh = paramList2.acD();
      if ((localObject != null) && (((List)localObject).size() > 0))
      {
        if (((List)localObject).size() == paramList1.size())
          break label279;
        ab.e("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify Error lstAntispamTicket:%d lstVerifyUser:%d", new Object[] { Integer.valueOf(((List)localObject).size()), Integer.valueOf(paramList1.size()) });
      }
    }
    while (true)
    {
      if (paramInt != 2)
        break label334;
      for (int i = 0; i < paramList1.size(); i++)
        ((List)localObject).add(bo.bc(a.ask().Yn().aoh((String)paramList1.get(i)), ""));
      bool = false;
      break;
      label279: for (i = 0; i < ((List)localObject).size(); i++)
        a.ask().Yn().x((String)paramList1.get(i), 2147483633, (String)((List)localObject).get(i));
    }
    label334: cnh localcnh = (cnh)this.ehh.fsG.fsP;
    localcnh.vIJ = paramInt;
    localcnh.wsM = paramString1;
    this.vbn = paramString1;
    paramString1 = new LinkedList();
    paramInt = 0;
    if (paramInt < paramList1.size())
    {
      cnf localcnf = new cnf();
      localcnf.pXM = ((String)paramList1.get(paramInt));
      if (paramString2 == null);
      for (paramList2 = ""; ; paramList2 = paramString2)
      {
        localcnf.xkE = paramList2;
        g localg = a.ask().Yn();
        paramList2 = localcnf.pXM;
        ((Integer)paramList.get(paramInt)).intValue();
        localcnf.wlF = bo.bc(localg.aoh(paramList2), "");
        if ((TextUtils.isEmpty(localcnf.wlF)) && (localObject != null) && (((List)localObject).size() > paramInt))
          localcnf.wlF = ((String)((List)localObject).get(paramInt));
        localcnf.wVn = paramString3;
        if ((paramMap != null) && (paramMap.containsKey(localcnf.pXM)))
          localcnf.xkF = ((Integer)paramMap.get(localcnf.pXM)).intValue();
        localcnf.xkJ = paramString4;
        ab.i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify op:%s idx:%s user:%s anti:%s chatroom:%s, reportInfo:%s", new Object[] { Integer.valueOf(this.cAd), Integer.valueOf(paramInt), localcnf.pXM, localcnf.wlF, paramString3, paramString4 });
        paramString1.add(localcnf);
        paramInt++;
        break;
      }
    }
    localcnh.xkN = paramString1;
    localcnh.xkM = paramString1.size();
    paramList1 = new LinkedList();
    paramList1.addAll(paramList);
    localcnh.xkP = paramList1;
    localcnh.xkO = paramList1.size();
    localcnh.vIl = new SKBuiltinBuffer_t().setBuffer(com.tencent.mm.plugin.normsg.a.b.oTO.bVS());
    ab.i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify op:%d scene:%d user:%d antitickets:%s chatroom:%s stack:%s", new Object[] { Integer.valueOf(this.cAd), Integer.valueOf(localcnh.xkN.size()), Integer.valueOf(localcnh.xkP.size()), bo.c((List)localObject, ","), paramString3, bo.dpG() });
    AppMethodBeat.o(79218);
  }

  private m(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(79217);
    this.vbm = null;
    this.cAd = 0;
    this.vbo = null;
    Assert.assertTrue("This NetSceneVerifyUser init MUST use opcode == MM_VERIFYUSER_VERIFYOK", true);
    this.vbm = new LinkedList();
    this.vbm.add(paramString1);
    this.cAd = 3;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cnh();
    ((b.a)localObject).fsK = new cni();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/verifyuser";
    ((b.a)localObject).fsI = 137;
    ((b.a)localObject).fsL = 44;
    ((b.a)localObject).fsM = 1000000044;
    this.ehh = ((b.a)localObject).acD();
    cnh localcnh = (cnh)this.ehh.fsG.fsP;
    localcnh.vIJ = 3;
    localcnh.wsM = "";
    LinkedList localLinkedList = new LinkedList();
    localObject = new cnf();
    ((cnf)localObject).pXM = paramString1;
    ((cnf)localObject).xkE = paramString2;
    ((cnf)localObject).wlF = a.ask().Yn().aoh(paramString1);
    ((cnf)localObject).wVn = null;
    localLinkedList.add(localObject);
    localcnh.xkN = localLinkedList;
    localcnh.xkM = localLinkedList.size();
    paramString1 = new LinkedList();
    paramString1.add(Integer.valueOf(paramInt));
    localcnh.xkP = paramString1;
    localcnh.xkO = paramString1.size();
    localcnh.vIl = new SKBuiltinBuffer_t().setBuffer(com.tencent.mm.plugin.normsg.a.b.oTO.bVS());
    ab.i("MicroMsg.NetSceneVerifyUser.dkverify", "dkverify scene:%d user:%d ticket:%s anti:%s", new Object[] { Integer.valueOf(localcnh.xkN.size()), Integer.valueOf(localcnh.xkP.size()), paramString2, ((cnf)localObject).wlF });
    AppMethodBeat.o(79217);
  }

  public m(String paramString1, String paramString2, int paramInt, byte paramByte)
  {
    this(paramString1, paramString2, paramInt);
  }

  public m(List<String> paramList, List<Integer> paramList1, String paramString1, String paramString2, Map<String, Integer> paramMap, String paramString3)
  {
    this(2, paramList, paramList1, null, paramString1, paramString2, paramMap, paramString3, "");
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(79222);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(79222);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(79223);
    if ((paramInt2 != 0) || (paramInt3 != 0))
      ab.e("MicroMsg.NetSceneVerifyUser.dkverify", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(79223);
  }

  public final String dhl()
  {
    if ((this.ehh != null) && (this.ehh.fsH != null));
    for (String str = ((cni)this.ehh.fsH.fsP).jBB; ; str = "")
      return str;
  }

  public final int dhm()
  {
    return this.cAd;
  }

  public final int getType()
  {
    return 30;
  }

  public final void hB(String paramString1, String paramString2)
  {
    AppMethodBeat.i(79219);
    Iterator localIterator = ((cnh)this.ehh.fsG.fsP).xkN.iterator();
    while (localIterator.hasNext())
    {
      cnf localcnf = (cnf)localIterator.next();
      localcnf.xkG = paramString1;
      localcnf.xkH = paramString2;
    }
    AppMethodBeat.o(79219);
  }

  public final void lV(int paramInt)
  {
    AppMethodBeat.i(79221);
    Iterator localIterator = ((cnh)this.ehh.fsG.fsP).xkN.iterator();
    while (localIterator.hasNext())
      ((cnf)localIterator.next()).vGB = paramInt;
    AppMethodBeat.o(79221);
  }

  public final void tq(String paramString)
  {
    AppMethodBeat.i(79220);
    Iterator localIterator = ((cnh)this.ehh.fsG.fsP).xkN.iterator();
    while (localIterator.hasNext())
      ((cnf)localIterator.next()).wlx = paramString;
    AppMethodBeat.o(79220);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.m
 * JD-Core Version:    0.6.2
 */