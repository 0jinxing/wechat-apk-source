package com.tencent.mm.plugin.sns.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.plugin.sns.storage.a.b.a;
import com.tencent.mm.plugin.sns.storage.i;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cae;
import com.tencent.mm.protocal.protobuf.cah;
import com.tencent.mm.protocal.protobuf.cam;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.cbe;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbi;
import com.tencent.mm.protocal.protobuf.cbj;
import com.tencent.mm.protocal.protobuf.cbk;
import com.tencent.mm.protocal.protobuf.cbl;
import com.tencent.mm.protocal.protobuf.cbm;
import com.tencent.mm.protocal.protobuf.cbs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;

public final class r extends m
  implements com.tencent.mm.network.k
{
  public int cNE;
  private com.tencent.mm.ai.b ehh;
  public com.tencent.mm.ai.f ehi;
  private ak handler;
  private long qJi;
  private cat qJj;
  private Object qJk;
  private int qJl;
  public int type;

  public r(long paramLong, int paramInt)
  {
    this(paramLong, paramInt, null, null);
  }

  public r(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(36277);
    this.type = -1;
    this.qJi = 0L;
    this.cNE = -1;
    this.qJl = 0;
    this.handler = new ak(Looper.getMainLooper());
    this.qJj = null;
    this.type = 9;
    this.qJi = paramLong;
    ab.i("MicroMsg.NetSceneSnsObjectOp", "snsId : " + paramLong + "  op : " + this.type);
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new cbl();
    ((b.a)localObject1).fsK = new cbm();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/mmsnsobjectop";
    ((b.a)localObject1).fsI = 218;
    ((b.a)localObject1).fsL = 104;
    ((b.a)localObject1).fsM = 1000000104;
    this.ehh = ((b.a)localObject1).acD();
    localObject1 = (cbl)this.ehh.fsG.fsP;
    Object localObject2 = af.cnF().kD(paramLong);
    if (localObject2 != null)
      this.cNE = ((n)localObject2).reX;
    localObject2 = A(paramLong, this.type);
    Object localObject3 = new cbk();
    ((cbk)localObject3).Scene = paramInt1;
    ((cbk)localObject3).xaJ = paramInt2;
    ((cbk)localObject3).xaK = aa.vy(paramString);
    try
    {
      localObject3 = ((cbk)localObject3).toByteArray();
      paramString = new com/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
      paramString.<init>();
      ((cbi)localObject2).wLt = paramString.setBuffer((byte[])localObject3);
      paramString = new LinkedList();
      paramString.add(localObject2);
      ((cbl)localObject1).xaM = paramString;
      ((cbl)localObject1).xaL = paramString.size();
      AppMethodBeat.o(36277);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramString, "", new Object[0]);
    }
  }

  public r(long paramLong, int paramInt, cat paramcat)
  {
    this(paramLong, paramInt, paramcat, null);
  }

  private r(long paramLong, int paramInt, cat paramcat, Object paramObject)
  {
    AppMethodBeat.i(36276);
    this.type = -1;
    this.qJi = 0L;
    this.cNE = -1;
    this.qJl = 0;
    this.handler = new ak(Looper.getMainLooper());
    this.qJj = paramcat;
    this.type = paramInt;
    this.qJi = paramLong;
    this.qJk = paramObject;
    ab.i("MicroMsg.NetSceneSnsObjectOp", "snsId : " + paramLong + "  op : " + paramInt);
    if (paramcat != null)
      ab.i("MicroMsg.NetSceneSnsObjectOp", paramcat.wZG + " " + paramcat.wZJ);
    paramcat = new b.a();
    paramcat.fsJ = new cbl();
    paramcat.fsK = new cbm();
    paramcat.uri = "/cgi-bin/micromsg-bin/mmsnsobjectop";
    paramcat.fsI = 218;
    paramcat.fsL = 104;
    paramcat.fsM = 1000000104;
    this.ehh = paramcat.acD();
    paramcat = (cbl)this.ehh.fsG.fsP;
    Object localObject = af.cnF().kD(paramLong);
    if (localObject != null)
      this.cNE = ((n)localObject).reX;
    localObject = a(paramLong, paramInt, this.qJj, paramObject);
    paramObject = new LinkedList();
    paramObject.add(localObject);
    paramcat.xaM = paramObject;
    paramcat.xaL = paramObject.size();
    AppMethodBeat.o(36276);
  }

  public r(long paramLong, int paramInt, Object paramObject)
  {
    this(paramLong, paramInt, null, paramObject);
  }

  private static cbi A(long paramLong, int paramInt)
  {
    AppMethodBeat.i(36279);
    cbi localcbi = new cbi();
    localcbi.wLt = new SKBuiltinBuffer_t();
    localcbi.vQE = paramLong;
    localcbi.nbk = paramInt;
    AppMethodBeat.o(36279);
    return localcbi;
  }

  private static cbi a(long paramLong, int paramInt, cat paramcat, Object paramObject)
  {
    AppMethodBeat.i(36278);
    cbi localcbi = A(paramLong, paramInt);
    Object localObject1 = new StringBuilder("getSnsObjectOp ").append(paramInt).append(" ");
    Object localObject2;
    if (paramObject == null)
    {
      localObject2 = "";
      ab.i("MicroMsg.NetSceneSnsObjectOp", (String)localObject2);
      localObject1 = "";
      if ((paramInt != 8) && (paramInt != 10) && (paramInt != 7) && (paramInt != 8) && (paramInt != 6))
        break label1079;
      localObject2 = af.cnI().ku(paramLong);
      if (localObject2 == null)
        break label1073;
      localObject2 = ((com.tencent.mm.plugin.sns.storage.e)localObject2).cqB();
      label113: if ((localObject2 == null) || (!((n)localObject2).DI(32)))
        break label1070;
      localObject1 = ((n)localObject2).cqq();
      if (localObject1 != null)
        break label205;
      localObject1 = "";
      label144: ab.i("MicroMsg.NetSceneSnsObjectOp", "aduxinfo ".concat(String.valueOf(localObject1)));
    }
    while (true)
    {
      if (paramInt == 6)
      {
        if ((paramcat == null) || ((paramcat.wZG == 0) && (paramcat.wZJ == 0L)))
        {
          AppMethodBeat.o(36278);
          return localcbi;
          localObject2 = paramObject.toString();
          break;
          label205: localObject1 = ((a)localObject1).qPj;
          break label144;
        }
        paramObject = new cam();
        paramObject.wZC = paramcat.wZJ;
        paramObject.wZq = aa.vy(bo.bc((String)localObject1, ""));
      }
      while (true)
      {
        try
        {
          paramcat = paramObject.toByteArray();
          paramObject = new com/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
          paramObject.<init>();
          localcbi.wLt = paramObject.setBuffer(paramcat);
          label275: AppMethodBeat.o(36278);
        }
        catch (Exception paramcat)
        {
          ab.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramcat, "", new Object[0]);
          continue;
        }
        if (paramInt != 7)
          break label372;
        paramcat = new cae();
        paramcat.wZq = aa.vy(bo.bc((String)localObject1, ""));
        try
        {
          paramObject = paramcat.toByteArray();
          paramcat = new com/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
          paramcat.<init>();
          localcbi.wLt = paramcat.setBuffer(paramObject);
        }
        catch (Exception paramcat)
        {
          ab.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramcat, "", new Object[0]);
        }
      }
      label372: if (paramInt == 8)
        if ((paramObject != null) && ((paramObject instanceof a.b.a)))
        {
          paramInt = 1;
          if (paramInt == 0)
            break label1064;
          paramcat = (a.b.a)paramObject;
          localObject1 = bo.bc((String)localObject1, "");
        }
      label393: label531: label1053: label1064: for (paramcat = (String)localObject1 + new StringBuilder("&").append(paramcat.qFI).append("|").append(paramcat.qUd).toString(); ; paramcat = (cat)localObject1)
      {
        while (true)
        {
          while (true)
          {
            localObject1 = new cah();
            ((cah)localObject1).wZq = aa.vy(bo.bc(paramcat, ""));
            if (localObject2 != null)
            {
              ((cah)localObject1).vFH = ((n)localObject2).cre();
              paramcat = ((n)localObject2).cqA();
              localObject2 = af.cnF().YS(paramcat);
              if (localObject2 != null)
              {
                paramcat = com.tencent.mm.plugin.sns.a.b.f.a(((n)localObject2).cqu());
                ((cah)localObject1).wZs = aa.vy(bo.bc(paramcat, ""));
              }
            }
            else
            {
              if ((paramInt == 0) || (((a.b.a)paramObject).qUc != a.b.a.qTY))
                break label645;
              ((cah)localObject1).wZt = a.b.a.qTY;
            }
            while (true)
            {
              try
              {
                paramcat = ((cah)localObject1).toByteArray();
                paramObject = new com/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
                paramObject.<init>();
                localcbi.wLt = paramObject.setBuffer(paramcat);
              }
              catch (Exception paramcat)
              {
                ab.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramcat, "", new Object[0]);
              }
              break;
              paramInt = 0;
              break label393;
              ab.v("SnsAdExtUtil", "getSnsStatExtBySnsId snsInfo null, snsId %s", new Object[] { paramcat });
              paramcat = "";
              break label531;
              af.cnI().delete(paramLong);
              af.cnK().ky(paramLong);
              i.kx(paramLong);
              if (paramInt != 0)
                ((cah)localObject1).wZt = ((a.b.a)paramObject).qUc;
            }
            if (paramInt != 4)
              break label782;
            if ((paramcat == null) || ((paramcat.wZG == 0) && (paramcat.wZJ == 0L)))
            {
              AppMethodBeat.o(36278);
              break;
            }
            paramObject = new cbj();
            paramObject.wZG = paramcat.wZG;
            try
            {
              paramObject = paramObject.toByteArray();
              paramcat = new com/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
              paramcat.<init>();
              localcbi.wLt = paramcat.setBuffer(paramObject);
            }
            catch (Exception paramcat)
            {
              ab.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramcat, "", new Object[0]);
            }
          }
          break label275;
          if (paramInt == 10)
          {
            paramcat = new cbs();
            if ((paramObject instanceof com.tencent.mm.bt.b))
            {
              paramObject = (com.tencent.mm.bt.b)paramObject;
              paramcat.xbe = aa.ad(paramObject.wR);
              ab.i("MicroMsg.NetSceneSnsObjectOp", "NetSceneSnsObjectOpticket " + paramObject.wR.length);
            }
            while (true)
            {
              try
              {
                paramcat = paramcat.toByteArray();
                paramObject = new com/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
                paramObject.<init>();
                localcbi.wLt = paramObject.setBuffer(paramcat);
                paramObject = new java/lang/StringBuilder;
                paramObject.<init>("opFree ");
                ab.i("MicroMsg.NetSceneSnsObjectOp", paramcat.length);
              }
              catch (Exception paramcat)
              {
                ab.e("MicroMsg.NetSceneSnsObjectOp", "error ticket " + paramcat.getMessage());
                ab.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramcat, "", new Object[0]);
              }
              break;
              ab.e("MicroMsg.NetSceneSnsObjectOp", "error ticket");
            }
          }
          if (paramInt != 12)
            break label275;
          if (!(paramObject instanceof cbe))
            break label1053;
          paramObject = (cbe)paramObject;
          try
          {
            localcbi.wLt = aa.ad(paramObject.toByteArray());
            paramcat = new java/lang/StringBuilder;
            paramcat.<init>("snsMetionBlockOp, switch:%d ");
            ab.i("MicroMsg.NetSceneSnsObjectOp", paramObject.xal);
          }
          catch (Exception paramcat)
          {
            ab.e("MicroMsg.NetSceneSnsObjectOp", "error snsMetionBlockOp " + paramcat.getMessage());
          }
        }
        break label275;
        ab.e("MicroMsg.NetSceneSnsObjectOp", "error snsMetionBlockOp");
        break label275;
      }
      label645: label782: label1070: continue;
      label1073: localObject2 = null;
      break label113;
      label1079: localObject2 = null;
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(36280);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(36280);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36281);
    ab.i("MicroMsg.NetSceneSnsObjectOp", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if ((paramInt2 == 4) && (this.type == 1))
        switch (this.type)
        {
        default:
        case 1:
        case 5:
        case 7:
        }
      while (true)
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(36281);
        return;
        af.cnE().kn(this.qJi);
        continue;
        af.cnE().kp(this.qJi);
      }
    }
    switch (this.type)
    {
    case 10:
    default:
    case 1:
    case 2:
    case 3:
    case 5:
    case 4:
      do
      {
        while (true)
        {
          af.cnE().cnf();
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(36281);
          break;
          af.cnE().kn(this.qJi);
          af.cnF().delete(this.qJi);
          continue;
          paramq = af.cnF().kD(this.qJi);
          if (paramq != null)
          {
            paramq.field_pravited = 1;
            paramq.cqO();
            af.cnF().b(this.qJi, paramq);
            continue;
            paramq = af.cnF().kD(this.qJi);
            if (paramq != null)
            {
              paramq.field_pravited = 0;
              paramq.field_localPrivate = 0;
              paramq.cqR();
              af.cnF().b(this.qJi, paramq);
              continue;
              af.cnE().kp(this.qJi);
            }
          }
        }
        paramArrayOfByte = af.cnF().kD(this.qJi);
      }
      while (paramArrayOfByte == null);
    case 6:
    case 7:
    case 8:
    case 9:
    case 11:
    case 12:
    }
    while (true)
    {
      cbf localcbf;
      Iterator localIterator;
      try
      {
        paramq = new com/tencent/mm/protocal/protobuf/cbf;
        paramq.<init>();
        localcbf = (cbf)paramq.parseFrom(paramArrayOfByte.field_attrBuf);
        localIterator = localcbf.xat.iterator();
        if (!localIterator.hasNext())
          break label1317;
        paramq = (cat)localIterator.next();
        if ((this.qJj == null) || (paramq.wZG != this.qJj.wZG))
          continue;
        if (paramq != null)
          localcbf.xat.remove(paramq);
        paramArrayOfByte.bi(localcbf.toByteArray());
        af.cnF().B(paramArrayOfByte);
        af.cnK().g(paramArrayOfByte.field_snsId, this.qJj.wZG, this.qJj.jCt);
      }
      catch (Exception paramq)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramq, "", new Object[0]);
      }
      break;
      paramArrayOfByte = af.cnI().ku(this.qJi);
      if (paramArrayOfByte == null)
        break;
      while (true)
      {
        try
        {
          paramq = new com/tencent/mm/protocal/protobuf/cbf;
          paramq.<init>();
          localcbf = (cbf)paramq.parseFrom(paramArrayOfByte.field_attrBuf);
          localIterator = localcbf.xat.iterator();
          if (!localIterator.hasNext())
            break label1311;
          paramq = (cat)localIterator.next();
          if ((this.qJj == null) || (paramq.wZJ != this.qJj.wZJ))
            continue;
          if (paramq != null)
            localcbf.xat.remove(paramq);
          paramArrayOfByte.bi(localcbf.toByteArray());
          af.cnI().a(paramArrayOfByte);
          af.cnK().g(paramArrayOfByte.field_snsId, this.qJj.wZJ, this.qJj.jCt);
        }
        catch (Exception paramq)
        {
          ab.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramq, "", new Object[0]);
        }
        break;
        af.cnE().kp(this.qJi);
        break;
        if ((this.qJk != null) && ((this.qJk instanceof a.b.a)) && (((a.b.a)this.qJk).qUc == a.b.a.qTY))
          break;
        af.cnI().delete(this.qJi);
        af.cnK().ky(this.qJi);
        i.kx(this.qJi);
        break;
        paramq = af.cnF().kD(this.qJi);
        if (paramq == null)
          break;
        paramq.DJ(2);
        af.cnF().b(this.qJi, paramq);
        break;
        ab.i("MicroMsg.NetSceneSnsObjectOp", "scene end switch " + this.qJl);
        label924: int i;
        int j;
        if (this.qJl == 0)
        {
          g.RQ();
          g.RP().Ry().set(ac.a.xMU, Boolean.TRUE);
          g.RQ();
          paramInt1 = ((Integer)g.RP().Ry().get(ac.a.xMW, Integer.valueOf(0))).intValue();
          g.RQ();
          g.RP().Ry().set(ac.a.xMW, Integer.valueOf(paramInt1 + 1));
          g.RQ();
          i = ((Integer)g.RP().Ry().get(ac.a.xMX, Integer.valueOf(0))).intValue();
          if (this.qJl != 0)
            break label1135;
          i++;
          j = i * 2 + 198;
          paramInt1 = j;
          if (j >= 216)
            paramInt1 = 216;
          if (paramInt1 >= 200)
            com.tencent.mm.plugin.sns.lucky.a.b.kT(paramInt1);
          ab.i("MicroMsg.NetSceneSnsObjectOp", "opcount open " + paramInt1 + " " + i);
          paramInt1 = i;
        }
        while (true)
        {
          g.RQ();
          g.RP().Ry().set(ac.a.xMX, Integer.valueOf(paramInt1));
          break;
          if (this.qJl != 1)
            break label924;
          g.RQ();
          g.RP().Ry().set(ac.a.xMU, Boolean.FALSE);
          break label924;
          label1135: paramInt1 = i;
          if (this.qJl == 1)
          {
            i++;
            j = i * 2 + 198 + 1;
            paramInt1 = j;
            if (j >= 217)
              paramInt1 = 217;
            if (paramInt1 >= 201)
              com.tencent.mm.plugin.sns.lucky.a.b.kT(paramInt1);
            ab.i("MicroMsg.NetSceneSnsObjectOp", "opcount close " + paramInt1 + " " + i);
            paramInt1 = i;
          }
        }
        if ((this.qJk == null) || (!(this.qJk instanceof cbe)))
          break;
        if (((cbe)this.qJk).xal == 1);
        for (boolean bool = true; ; bool = false)
        {
          af.cnK().y(this.qJi, bool);
          ab.i("MicroMsg.NetSceneSnsObjectOp", "remind  update [snsId:%d] ->isSilence: %b", new Object[] { Long.valueOf(this.qJi), Boolean.valueOf(bool) });
          break;
        }
        label1311: paramq = null;
      }
      label1317: paramq = null;
    }
  }

  public final int getType()
  {
    return 218;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.r
 * JD-Core Version:    0.6.2
 */