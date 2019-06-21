package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.n.a;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.protobuf.ayj;
import com.tencent.mm.protocal.protobuf.bbv;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.protocal.protobuf.cw;
import com.tencent.mm.protocal.protobuf.im;
import com.tencent.mm.protocal.protobuf.in;
import com.tencent.mm.protocal.protobuf.io;
import com.tencent.mm.protocal.protobuf.ip;
import com.tencent.mm.protocal.protobuf.iq;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import java.util.Iterator;
import java.util.LinkedList;

public final class k extends m
  implements com.tencent.mm.network.k
{
  private f eIc;
  private com.tencent.mm.ai.b lty;
  private String[] ltz;

  public k(String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(19311);
    this.lty = null;
    this.eIc = null;
    this.ltz = paramArrayOfString;
    ab.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "NetSceneBatchSearchHardDevice, %s, list = %d", new Object[] { paramString, Integer.valueOf(1) });
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new io();
    ((b.a)localObject).fsK = new ip();
    ((b.a)localObject).fsI = 542;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/batchsearchharddevice";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    localObject = (io)this.lty.fsG.fsP;
    LinkedList localLinkedList = new LinkedList();
    for (int i = 0; i <= 0; i++)
    {
      String str = paramArrayOfString[0];
      if (str != null)
      {
        in localin = new in();
        localin.vKF = str;
        localLinkedList.add(localin);
        ab.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "NetSceneBatchSearchHardDevice, item = %s", new Object[] { str });
      }
    }
    ((io)localObject).vKG = localLinkedList;
    if (!bo.isNullOrNil(paramString))
    {
      paramArrayOfString = new im();
      paramArrayOfString.vKE = paramString;
      ((io)localObject).vKH = paramArrayOfString;
    }
    ((io)localObject).vKI = 3;
    AppMethodBeat.o(19311);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(19313);
    this.eIc = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(19313);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19312);
    ab.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "onGYNetEnd, netId = %d, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((this.ltz != null) && (this.ltz.length == 1))
      ab.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "device mac is  = %s", new Object[] { this.ltz[0] });
    if (paramq == null)
    {
      ab.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "null == rr");
      AppMethodBeat.o(19312);
    }
    while (true)
    {
      return;
      if (this.lty.fsI != paramq.getType())
      {
        ab.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "mReqResp.getType(%d) != rr.getType(%d)", new Object[] { Integer.valueOf(this.lty.fsI), Integer.valueOf(paramq.getType()) });
        AppMethodBeat.o(19312);
      }
      else
      {
        if ((paramInt2 == 0) && (paramInt3 == 0))
        {
          paramq = boO().vKJ.iterator();
          while (paramq.hasNext())
          {
            paramArrayOfByte = (iq)paramq.next();
            ab.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "BatchSearchHardDeviceResp, ret = %d, bind ticket = %s, mac = %s, device name = %s", new Object[] { Integer.valueOf(paramArrayOfByte.Ret), paramArrayOfByte.vKK, paramArrayOfByte.vKF, paramArrayOfByte.jBF });
            if (paramArrayOfByte.vKL == null)
            {
              ab.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "null == item.Contact");
            }
            else
            {
              paramArrayOfByte = paramArrayOfByte.vKL;
              if (paramArrayOfByte == null)
              {
                ab.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "unable to parse mod contact");
              }
              else
              {
                String str1 = aa.a(paramArrayOfByte.wcB);
                String str2 = bo.nullAsNil(paramArrayOfByte.wGl);
                if ((bo.isNullOrNil(str1)) && (bo.isNullOrNil(str2)))
                {
                  ab.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "processModContact user is null user:%s enuser:%s", new Object[] { str1, str2 });
                }
                else
                {
                  ab.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "processModContact : %s", new Object[] { str1 });
                  aw.ZK();
                  ad localad1 = com.tencent.mm.model.c.XM().aoO(str1);
                  if ((localad1 != null) && (str1.equals(localad1.field_encryptUsername)))
                  {
                    ab.w("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "cat's replace user with stranger");
                  }
                  else
                  {
                    ad localad2 = new ad(str1);
                    localad2.iy(paramArrayOfByte.guS);
                    localad2.setType(paramArrayOfByte.wbu & paramArrayOfByte.wbv);
                    label462: long l;
                    if (!bo.isNullOrNil(str2))
                    {
                      localad2.iH(str2);
                      if (localad1 != null)
                        break label1026;
                      l = 0L;
                      label470: localad2.ewQ = l;
                      localad2.iB(aa.a(paramArrayOfByte.wyX));
                      localad2.iC(aa.a(paramArrayOfByte.wce));
                      localad2.iD(aa.a(paramArrayOfByte.wcf));
                      localad2.hA(paramArrayOfByte.guN);
                      localad2.hD(paramArrayOfByte.wbA);
                      localad2.iA(aa.a(paramArrayOfByte.wGf));
                      localad2.hE(paramArrayOfByte.wbE);
                      localad2.hF(paramArrayOfByte.guR);
                      localad2.iW(RegionCodeDecoder.aC(paramArrayOfByte.guW, paramArrayOfByte.guO, paramArrayOfByte.guP));
                      localad2.iQ(paramArrayOfByte.guQ);
                      localad2.hw(paramArrayOfByte.wBT);
                      localad2.iV(paramArrayOfByte.wBU);
                      localad2.setSource(paramArrayOfByte.vFH);
                      localad2.hv(paramArrayOfByte.wBX);
                      localad2.iE(paramArrayOfByte.wBW);
                      if (t.nO(paramArrayOfByte.wBV))
                        localad2.iU(paramArrayOfByte.wBV);
                      localad2.hH((int)bo.anT());
                      localad2.iz(aa.a(paramArrayOfByte.wFK));
                      localad2.iF(aa.a(paramArrayOfByte.wFM));
                      localad2.iG(aa.a(paramArrayOfByte.wFL));
                      localad2.iX(paramArrayOfByte.vEA);
                      localad2.iY(paramArrayOfByte.wGv);
                      if ((localad1 != null) && (!bo.nullAsNil(localad1.dum).equals(bo.nullAsNil(paramArrayOfByte.wGv))))
                      {
                        com.tencent.mm.bc.c.aiB();
                        com.tencent.mm.bc.c.sY(str1);
                      }
                      aw.ZK();
                      com.tencent.mm.model.c.XM().aoT(str1);
                      if (!bo.isNullOrNil(localad2.field_username))
                        break label1038;
                      ab.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "dkinit dealModContactExtInfo failed invalid contact");
                      label812: localad2.hy(paramArrayOfByte.wGu);
                      if ((paramArrayOfByte.wGq != null) && (paramArrayOfByte.wGq.vEU != null))
                      {
                        localad2.iZ(paramArrayOfByte.wGq.vEU.vLl);
                        localad2.ja(paramArrayOfByte.wGq.vEU.vLm);
                        localad2.jb(paramArrayOfByte.wGq.vEU.vLn);
                      }
                      if (t.nI(str1))
                        localad2.NK();
                      if (localad2.dsf())
                        localad2.NN();
                      if (bo.isNullOrNil(str2))
                        break label1373;
                      aw.ZK();
                      com.tencent.mm.model.c.XM().c(str2, localad2);
                    }
                    while (true)
                    {
                      if ((localad1 == null) || ((localad1.field_type & 0x800) == (localad2.field_type & 0x800)))
                        break label1389;
                      if ((localad2.field_type & 0x800) == 0)
                        break label1391;
                      aw.ZK();
                      com.tencent.mm.model.c.XR().apf(localad2.field_username);
                      break;
                      if ((localad1 == null) || ((int)localad1.ewQ <= 0))
                        break label462;
                      localad2.iH(localad1.field_encryptUsername);
                      break label462;
                      label1026: l = (int)localad1.ewQ;
                      break label470;
                      label1038: Object localObject1 = localad2.field_username;
                      Object localObject2 = com.tencent.mm.ah.b.a((String)localObject1, paramArrayOfByte);
                      o.act().b((h)localObject2);
                      localObject2 = paramArrayOfByte.wBZ;
                      if ((!localad2.field_username.endsWith("@chatroom")) && (localObject2 != null))
                      {
                        ab.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsFlag modcontact " + ((ccl)localObject2).guY + " " + paramArrayOfByte.wcB);
                        ab.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsBg modcontact " + ((ccl)localObject2).guZ);
                        ab.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsBgId modcontact " + ((ccl)localObject2).gva);
                        ab.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsBgId modcontact " + ((ccl)localObject2).xbQ);
                        if (n.qFy != null)
                          n.qFy.a(localad2.field_username, (ccl)localObject2);
                      }
                      localObject2 = r.Yz();
                      if ((localObject2 == null) || (((String)localObject2).equals(localObject1)))
                        break label812;
                      localObject2 = z.aeR().qP((String)localObject1);
                      ((d)localObject2).field_username = ((String)localObject1);
                      ((d)localObject2).field_brandList = paramArrayOfByte.guX;
                      localObject1 = paramArrayOfByte.wCa;
                      if (localObject1 != null)
                      {
                        ((d)localObject2).field_brandFlag = ((uy)localObject1).gvb;
                        ((d)localObject2).field_brandInfo = ((uy)localObject1).gvd;
                        ((d)localObject2).field_brandIconURL = ((uy)localObject1).gve;
                        ((d)localObject2).field_extInfo = ((uy)localObject1).gvc;
                        ((d)localObject2).field_attrSyncVersion = null;
                        ((d)localObject2).field_incrementUpdateTime = 0L;
                      }
                      if (!z.aeR().e((d)localObject2))
                        z.aeR().d((d)localObject2);
                      localad2.hI(((d)localObject2).field_type);
                      break label812;
                      label1373: aw.ZK();
                      com.tencent.mm.model.c.XM().Y(localad2);
                    }
                    label1389: continue;
                    label1391: aw.ZK();
                    com.tencent.mm.model.c.XR().apg(localad2.field_username);
                  }
                }
              }
            }
          }
        }
        this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(19312);
      }
    }
  }

  public final ip boO()
  {
    if ((this.lty != null) && (this.lty.fsH.fsP != null));
    for (ip localip = (ip)this.lty.fsH.fsP; ; localip = null)
      return localip;
  }

  public final int getType()
  {
    return 542;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.k
 * JD-Core Version:    0.6.2
 */