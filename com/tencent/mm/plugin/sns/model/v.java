package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cbz;
import com.tencent.mm.protocal.protobuf.cca;
import com.tencent.mm.protocal.protobuf.ccb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class v extends com.tencent.mm.ai.m
  implements k
{
  private String cvZ;
  private int czE;
  private b ehh;
  public f ehi;
  public LinkedList<cbz> qJN;
  public int qJO;

  public v(int paramInt)
  {
    AppMethodBeat.i(36323);
    this.qJN = null;
    this.czE = paramInt;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cca();
    ((b.a)localObject).fsK = new ccb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnstaglist";
    ((b.a)localObject).fsI = 292;
    ((b.a)localObject).fsL = 116;
    ((b.a)localObject).fsM = 1000000116;
    this.ehh = ((b.a)localObject).acD();
    localObject = af.cnJ().YX("@__weixintsnstag").field_md5;
    if (localObject == null)
      localObject = "";
    while (true)
    {
      this.cvZ = ((String)localObject);
      cca localcca = (cca)this.ehh.fsG.fsP;
      localcca.OpCode = paramInt;
      localcca.xbu = ((String)localObject);
      AppMethodBeat.o(36323);
      return;
    }
  }

  public static t a(t paramt, cbz paramcbz)
  {
    AppMethodBeat.i(36325);
    paramt.field_tagId = paramcbz.xbt;
    paramt.field_tagName = bo.bc(paramcbz.ncF, "");
    paramt.field_count = paramcbz.jBv;
    paramt.jdMethod_do(paramcbz.jBw);
    ab.d("MicroMsg.NetSceneSnsTagList", "tagInfo getList: " + paramcbz.toString());
    AppMethodBeat.o(36325);
    return paramt;
  }

  private static boolean a(List<Long> paramList, Long paramLong)
  {
    AppMethodBeat.i(36326);
    paramList = paramList.iterator();
    boolean bool;
    while (paramList.hasNext())
      if (((Long)paramList.next()).longValue() == paramLong.longValue())
      {
        bool = true;
        AppMethodBeat.o(36326);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(36326);
    }
  }

  private static boolean b(t paramt, cbz paramcbz)
  {
    boolean bool1 = false;
    AppMethodBeat.i(36329);
    paramt = paramt.field_memberList.split(",");
    Iterator localIterator = paramcbz.jBw.iterator();
    label87: label93: label97: 
    while (true)
    {
      boolean bool2 = bool1;
      if (localIterator.hasNext())
      {
        paramcbz = (bts)localIterator.next();
        i = 0;
        if (i >= paramt.length)
          break label93;
        if (!paramt[i].equals(paramcbz))
          break label87;
      }
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label97;
        bool2 = true;
        AppMethodBeat.o(36329);
        return bool2;
        i++;
        break;
      }
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(36324);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(36324);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36328);
    ab.d("MicroMsg.NetSceneSnsTagList", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36328);
    }
    Object localObject1;
    while (true)
    {
      return;
      localObject1 = (ccb)((b)paramq).fsH.fsP;
      ab.d("MicroMsg.NetSceneSnsTagList", "[onGYNetEnd]State：%s", new Object[] { Integer.valueOf(this.qJO) });
      this.qJO = ((ccb)localObject1).qJO;
      this.qJN = ((ccb)localObject1).jBw;
      paramq = ((ccb)localObject1).xbu;
      if (!this.cvZ.equals(paramq))
        break;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36328);
    }
    paramArrayOfByte = af.cnL().cru();
    Object localObject2;
    if (this.czE != 3)
      localObject2 = paramArrayOfByte.iterator();
    label204: label508: 
    while (true)
    {
      Long localLong;
      Iterator localIterator;
      if (((Iterator)localObject2).hasNext())
      {
        localLong = (Long)((Iterator)localObject2).next();
        localIterator = ((ccb)localObject1).jBw.iterator();
        cbz localcbz;
        do
        {
          if (!localIterator.hasNext())
            break;
          localcbz = (cbz)localIterator.next();
        }
        while (localLong.longValue() != localcbz.xbt);
      }
      for (paramInt1 = 1; ; paramInt1 = 0)
      {
        if (paramInt1 != 0)
          break label508;
        ((Iterator)localObject2).remove();
        af.cnL().kG(localLong.longValue());
        break label204;
        localIterator = ((ccb)localObject1).jBw.iterator();
        while (localIterator.hasNext())
        {
          localObject1 = (cbz)localIterator.next();
          if (!a(paramArrayOfByte, Long.valueOf(((cbz)localObject1).xbt)))
          {
            localObject2 = new t();
            a((t)localObject2, (cbz)localObject1);
            af.cnL().a((t)localObject2);
          }
          else
          {
            localObject2 = af.cnL().kF(((cbz)localObject1).xbt);
            if (((((t)localObject2).field_tagName != null) && (!((t)localObject2).field_tagName.equals(((cbz)localObject1).ncF))) || (((t)localObject2).field_count != ((cbz)localObject1).jBv) || (b((t)localObject2, (cbz)localObject1)))
            {
              a((t)localObject2, (cbz)localObject1);
              af.cnL().a((t)localObject2);
            }
          }
        }
        paramArrayOfByte = af.cnJ().YX("@__weixintsnstag");
        paramArrayOfByte.field_md5 = paramq;
        af.cnJ().a(paramArrayOfByte);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(36328);
        break;
      }
    }
  }

  public final int getType()
  {
    return 292;
  }

  public final List<String> kk(long paramLong)
  {
    AppMethodBeat.i(36327);
    LinkedList localLinkedList = new LinkedList();
    if (this.qJN == null)
      AppMethodBeat.o(36327);
    while (true)
    {
      return localLinkedList;
      Iterator localIterator = this.qJN.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          cbz localcbz = (cbz)localIterator.next();
          if (localcbz.xbt == paramLong)
          {
            localIterator = localcbz.jBw.iterator();
            while (localIterator.hasNext())
              localLinkedList.add(((bts)localIterator.next()).wVI);
            AppMethodBeat.o(36327);
            break;
          }
        }
      AppMethodBeat.o(36327);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.v
 * JD-Core Version:    0.6.2
 */