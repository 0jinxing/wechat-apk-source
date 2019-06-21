package com.tencent.mm.plugin.qmessage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.g.a.sw;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ie;
import com.tencent.mm.protocal.protobuf.if;
import com.tencent.mm.protocal.protobuf.ud;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;

public final class b extends m
  implements k
{
  private f ehi;
  private Set<String> psI;

  public b(Set<String> paramSet)
  {
    AppMethodBeat.i(24072);
    Assert.assertTrue(true);
    this.psI = paramSet;
    AppMethodBeat.o(24072);
  }

  private boolean h(q paramq)
  {
    boolean bool = false;
    AppMethodBeat.i(24075);
    Object localObject1 = (if)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    if (localObject1 == null)
    {
      ab.e("MicroMsg.NetSceneBatchGetContactProfile", "dealResp: resp is null");
      AppMethodBeat.o(24075);
    }
    while (true)
    {
      return bool;
      if (paramq.ZS().vyl == 1)
      {
        ab.e("MicroMsg.NetSceneBatchGetContactProfile", "dealResp : endless loop, should stop");
        AppMethodBeat.o(24075);
      }
      else if (paramq.ZS().vyl == -1)
      {
        ab.e("MicroMsg.NetSceneBatchGetContactProfile", "dealResp : server err, can try again");
        AppMethodBeat.o(24075);
        bool = true;
      }
      else
      {
        localObject1 = ((if)localObject1).vKA;
        if (localObject1 == null)
        {
          AppMethodBeat.o(24075);
        }
        else
        {
          int i = 0;
          while (true)
            while (true)
            {
              if (i >= ((List)localObject1).size())
                break label662;
              try
              {
                paramq = new com/tencent/mm/protocal/protobuf/ud;
                paramq.<init>();
                paramq = (ud)paramq.parseFrom(aa.a((SKBuiltinBuffer_t)((List)localObject1).get(i)));
                if ((paramq == null) || (paramq.jBB == null))
                {
                  ab.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile: profile name is null");
                  j = 0;
                  if (j != 0)
                    break label656;
                  AppMethodBeat.o(24075);
                }
              }
              catch (IOException paramq)
              {
                while (true)
                {
                  int j;
                  ab.printErrStackTrace("MicroMsg.NetSceneBatchGetContactProfile", paramq, "", new Object[0]);
                  ab.e("MicroMsg.NetSceneBatchGetContactProfile", "ContactProfile.parseFrom fail");
                  paramq = null;
                  continue;
                  if (!this.psI.contains(paramq.jBB))
                  {
                    ab.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile: resp data not in req");
                    j = 0;
                  }
                  else
                  {
                    this.psI.remove(paramq.jBB);
                    aw.ZK();
                    Object localObject2 = c.XM().aoO(paramq.jBB);
                    if ((localObject2 == null) || ((int)((com.tencent.mm.n.a)localObject2).ewQ == 0))
                    {
                      ab.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile: did not find this contact");
                      j = 0;
                    }
                    else
                    {
                      ((ad)localObject2).setUsername(paramq.jBB);
                      ((ad)localObject2).iy(paramq.guS);
                      ((ad)localObject2).setType(paramq.wbu & paramq.wbv);
                      ((ad)localObject2).iB(paramq.jCH);
                      ((ad)localObject2).iC(paramq.wbs);
                      ((ad)localObject2).iD(paramq.wbt);
                      ((ad)localObject2).hA(paramq.guN);
                      ((ad)localObject2).iz(paramq.wbw);
                      ((ad)localObject2).iF(paramq.wbz);
                      ((ad)localObject2).iG(paramq.wby);
                      ((ad)localObject2).hD(paramq.wbA);
                      ((ad)localObject2).iA(paramq.wbD);
                      ((ad)localObject2).hE(paramq.wbE);
                      aw.ZK();
                      if (c.XM().b(((ap)localObject2).field_username, (ad)localObject2) == -1)
                        ab.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile:update contact failed");
                      if (ad.aow(paramq.jBB))
                      {
                        localObject2 = g.cca().Vb(paramq.jBB);
                        if ((localObject2 == null) || (bo.nullAsNil(((d)localObject2).getUsername()).length() <= 0))
                        {
                          ab.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile: did not find qcontact");
                          j = 0;
                        }
                        else
                        {
                          ((d)localObject2).extInfo = paramq.ndT;
                          ((d)localObject2).psL = paramq.wbG;
                          ((d)localObject2).psM = paramq.wbH;
                          ((d)localObject2).bJt = 52;
                          if (!g.cca().a(paramq.jBB, (d)localObject2))
                            ab.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile:update qcontact failed");
                        }
                      }
                      else
                      {
                        if (ad.aou(paramq.jBB))
                        {
                          localObject2 = new sw();
                          ((sw)localObject2).cOY.opType = 0;
                          ((sw)localObject2).cOY.cIS = paramq.jBB;
                          ((sw)localObject2).cOY.cIT = paramq.wbG;
                          ((sw)localObject2).cOY.cIU = paramq.wbx;
                          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
                        }
                        j = 1;
                      }
                    }
                  }
                }
                label656: i++;
              }
            }
          label662: AppMethodBeat.o(24075);
          bool = true;
        }
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(24073);
    this.ehi = paramf;
    paramf = new LinkedList();
    Object localObject = this.psI.iterator();
    while (((Iterator)localObject).hasNext())
      paramf.add((String)((Iterator)localObject).next());
    int i;
    if (paramf.size() == 0)
    {
      ab.e("MicroMsg.NetSceneBatchGetContactProfile", com.tencent.mm.compatible.util.g.Mq() + "doScene reqSize ==0");
      i = -1;
      AppMethodBeat.o(24073);
    }
    while (true)
    {
      return i;
      localObject = new b.a();
      ((b.a)localObject).fsJ = new ie();
      ((b.a)localObject).fsK = new if();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/batchgetcontactprofile";
      ((b.a)localObject).fsI = 140;
      ((b.a)localObject).fsL = 28;
      ((b.a)localObject).fsM = 1000000028;
      localObject = ((b.a)localObject).acD();
      LinkedList localLinkedList = new LinkedList();
      paramf = paramf.iterator();
      while (paramf.hasNext())
        localLinkedList.add(aa.vy((String)paramf.next()));
      ((ie)((com.tencent.mm.ai.b)localObject).fsG.fsP).vEg = localLinkedList;
      ((ie)((com.tencent.mm.ai.b)localObject).fsG.fsP).vKz = 1;
      ((ie)((com.tencent.mm.ai.b)localObject).fsG.fsP).jBv = localLinkedList.size();
      i = a(parame, (q)localObject, this);
      AppMethodBeat.o(24073);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(24074);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(24074);
    }
    while (true)
    {
      return;
      if ((h(paramq)) && (this.psI.size() > 0))
        a(this.ftf, this.ehi);
      ab.d("MicroMsg.NetSceneBatchGetContactProfile", "left cnt = " + this.psI.size());
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(24074);
    }
  }

  public final int acn()
  {
    return 50;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 140;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.a.b
 * JD-Core Version:    0.6.2
 */