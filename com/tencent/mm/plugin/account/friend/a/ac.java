package com.tencent.mm.plugin.account.friend.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.amw;
import com.tencent.mm.protocal.protobuf.amx;
import com.tencent.mm.protocal.protobuf.bmu;
import com.tencent.mm.protocal.protobuf.bmv;
import com.tencent.mm.protocal.protobuf.bmw;
import com.tencent.mm.protocal.protobuf.bmx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ac extends m
  implements com.tencent.mm.network.k
{
  public final com.tencent.mm.ai.b ehh;
  private f ehi;

  public ac(int paramInt)
  {
    AppMethodBeat.i(108450);
    this.ehi = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new amw();
    ((b.a)localObject).fsK = new amx();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getqqgroup";
    ((b.a)localObject).fsI = 143;
    ((b.a)localObject).fsL = 38;
    ((b.a)localObject).fsM = 1000000038;
    this.ehh = ((b.a)localObject).acD();
    localObject = (amw)this.ehh.fsG.fsP;
    ((amw)localObject).nbk = 1;
    ((amw)localObject).wrw = paramInt;
    AppMethodBeat.o(108450);
  }

  private static void a(bmx parambmx)
  {
    AppMethodBeat.i(108453);
    Object localObject1 = ((an)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQGroupStg()).fni.a("select qqgroup.grouopid,qqgroup.membernum,qqgroup.weixinnum,qqgroup.insert_time,qqgroup.lastupdate_time,qqgroup.needupdate,qqgroup.updatekey,qqgroup.groupname from qqgroup ", null, 0);
    HashMap localHashMap;
    int i;
    if (localObject1 == null)
    {
      localHashMap = null;
      i = 0;
      label40: if (i >= parambmx.jBv)
        break label659;
      localObject2 = (bmw)parambmx.wPO.get(i);
      ab.d("MicroMsg.NetSceneGetQQGroup", "id:" + ((bmw)localObject2).wrw + " name:" + ((bmw)localObject2).wkk + " mem:" + ((bmw)localObject2).wep + " wei:" + ((bmw)localObject2).wPN + " md5:" + ((bmw)localObject2).wdO);
      if (((bmw)localObject2).wrw >= 0)
        break label267;
      localObject1 = null;
      label148: if (localObject1 != null)
        break label323;
      ab.e("MicroMsg.NetSceneGetQQGroup", "Error Resp Group Info index:".concat(String.valueOf(i)));
    }
    label267: label323: 
    while (((am)localObject1).gwv == 0)
    {
      i++;
      break label40;
      if (((Cursor)localObject1).getCount() <= 0)
      {
        ((Cursor)localObject1).close();
        localHashMap = null;
        break;
      }
      localHashMap = new HashMap();
      for (i = 0; i < ((Cursor)localObject1).getCount(); i++)
      {
        ((Cursor)localObject1).moveToPosition(i);
        localObject2 = new am();
        ((am)localObject2).d((Cursor)localObject1);
        localHashMap.put(Integer.valueOf(((am)localObject2).gwu), localObject2);
      }
      ((Cursor)localObject1).close();
      break;
      localObject1 = new am();
      ((am)localObject1).gwu = ((bmw)localObject2).wrw;
      ((am)localObject1).gwB = ((bmw)localObject2).wkk;
      ((am)localObject1).gwv = ((bmw)localObject2).wep;
      ((am)localObject1).gww = ((bmw)localObject2).wPN;
      ((am)localObject1).gwA = ((bmw)localObject2).wdO;
      break label148;
    }
    if (localHashMap != null);
    for (Object localObject2 = (am)localHashMap.get(Integer.valueOf(((am)localObject1).gwu)); ; localObject2 = null)
    {
      if (localObject2 == null)
      {
        ((am)localObject1).gwx = ((int)bo.anT());
        ((am)localObject1).gwy = ((int)bo.anT());
        ((am)localObject1).gwz = 1;
        localObject2 = (an)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQGroupStg();
        if (localObject1 != null)
        {
          ab.d("MicroMsg.QQGroupStorage", "insert: name:" + ((am)localObject1).aqm());
          ((am)localObject1).bJt = -1;
          ContentValues localContentValues = ((am)localObject1).aqk();
          if ((int)((an)localObject2).fni.insert("qqgroup", "grouopid", localContentValues) >= 0)
            ((an)localObject2).doNotify();
        }
        for (bool = true; ; bool = false)
        {
          ab.d("MicroMsg.NetSceneGetQQGroup", "Insert name:" + ((am)localObject1).aqm() + " ret:" + bool);
          break;
        }
      }
      ((am)localObject2).gwz = -1;
      ab.d("MicroMsg.NetSceneGetQQGroup", ((am)localObject1).aql() + " " + ((am)localObject2).aql() + " " + ((am)localObject1).gwu);
      if (((am)localObject2).aql().equals(((am)localObject1).aql()))
        break;
      ((am)localObject1).gwy = ((int)bo.anT());
      ((am)localObject1).gwz = 1;
      ((am)localObject1).bJt = -1;
      boolean bool = ((an)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQGroupStg()).a((am)localObject1);
      ab.d("MicroMsg.NetSceneGetQQGroup", "Update name:" + ((am)localObject1).aqm() + " ret:" + bool);
      break;
      label659: if (localHashMap != null)
      {
        localObject1 = localHashMap.keySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          parambmx = (am)localHashMap.get(((Iterator)localObject1).next());
          if (parambmx.gwz == 0)
          {
            localObject2 = (an)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQGroupStg();
            i = parambmx.gwu;
            ab.d("MicroMsg.QQGroupStorage", "delete: id:".concat(String.valueOf(i)));
            if (((an)localObject2).fni.delete("qqgroup", "grouopid= ?", new String[] { String.valueOf(i) }) > 0)
            {
              ((an)localObject2).doNotify();
              bool = true;
              ab.d("MicroMsg.NetSceneGetQQGroup", "delete name:" + parambmx.aqm() + " ret:" + bool);
              localObject2 = (ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg();
              i = parambmx.gwu;
              ab.d("MicroMsg.QQListStorage", "delete: GroupID:".concat(String.valueOf(i)));
              if (((ap)localObject2).fni.delete("qqlist", "groupid= ?", new String[] { String.valueOf(i) }) <= 0)
                break label933;
            }
            label933: for (bool = true; ; bool = false)
            {
              ab.d("MicroMsg.NetSceneGetQQGroup", "delete QQList name:" + parambmx.aqm() + " ret:" + bool);
              break;
              bool = false;
              break label782;
            }
          }
        }
      }
      label782: AppMethodBeat.o(108453);
      return;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(108451);
    this.ehi = paramf;
    paramf = (amw)this.ehh.fsG.fsP;
    int i;
    if ((paramf.nbk == 1) && (((an)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQGroupStg()).mY(paramf.wrw) == null))
    {
      ab.e("MicroMsg.NetSceneGetQQGroup", "Err group not exist");
      i = -1;
      AppMethodBeat.o(108451);
    }
    while (true)
    {
      return i;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(108451);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108452);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneGetQQGroup", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(108452);
      return;
    }
    ab.d("MicroMsg.NetSceneGetQQGroup", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (amw)this.ehh.fsG.fsP;
    Object localObject1 = (amx)this.ehh.fsH.fsP;
    if (paramArrayOfByte.nbk == 0)
      a(((amx)localObject1).wrx);
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(108452);
      break;
      Object localObject2 = new ArrayList();
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      int i = 0;
      while (i < ((amx)localObject1).wry.jBv)
      {
        localObject3 = (bmu)((amx)localObject1).wry.wPM.get(i);
        paramInt1 = paramArrayOfByte.wrw;
        ab.v("MicroMsg.NetSceneGetQQGroup", "friend");
        paramq = new ao();
        paramq.gwC = new p(((bmu)localObject3).wPI).longValue();
        com.tencent.mm.ah.b.d(paramq.gwC, 3);
        paramq.gwE = paramInt1;
        paramq.gwD = ((bmu)localObject3).wPK;
        if (((bmu)localObject3).wPK != 0)
        {
          if ((((bmu)localObject3).jBB == null) || (((bmu)localObject3).jBB.equals("")))
          {
            paramq = null;
            ((List)localObject2).add(paramq);
            paramq = new j();
            paramq.dtS = ((bmu)localObject3).guN;
            paramq.dub = ((bmu)localObject3).guR;
            paramq.duc = ((bmu)localObject3).guO;
            paramq.dud = ((bmu)localObject3).guP;
            paramq.signature = ((bmu)localObject3).guQ;
            paramq.username = ((bmu)localObject3).jBB;
            localArrayList1.add(paramq);
            paramq = new com.tencent.mm.ah.h();
            paramq.dtR = 3;
            paramq.cB(true);
            paramq.username = ((bmu)localObject3).jBB;
            paramq.frW = ((bmu)localObject3).vXm;
            paramq.frV = ((bmu)localObject3).vXn;
            localArrayList2.add(paramq);
            i++;
          }
          else
          {
            ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(((bmu)localObject3).jBB);
            if ((localad != null) && (localad.field_username.equals(((bmu)localObject3).jBB)) && (com.tencent.mm.n.a.jh(localad.field_type)))
              paramq.gwD = 2;
          }
        }
        else
        {
          label551: paramq.username = ((bmu)localObject3).jBB;
          paramq.nickname = ((bmu)localObject3).jCH;
          paramq.gwK = ((bmu)localObject3).wPL;
          paramq.gwL = com.tencent.mm.platformtools.g.vp(((bmu)localObject3).wPL);
          paramq.gwM = com.tencent.mm.platformtools.g.vo(((bmu)localObject3).wPL);
          paramq.gwF = com.tencent.mm.platformtools.g.vp(((bmu)localObject3).jCH);
          paramq.gwG = com.tencent.mm.platformtools.g.vo(((bmu)localObject3).jCH);
          paramq.gwH = ((bmu)localObject3).wPJ;
          paramq.gwI = com.tencent.mm.platformtools.g.vp(((bmu)localObject3).wPJ);
          paramq.gwJ = com.tencent.mm.platformtools.g.vo(((bmu)localObject3).wPJ);
          paramInt1 = 32;
          label693: int j;
          if (!bo.isNullOrNil(paramq.aqs()))
          {
            paramInt1 = paramq.aqs().charAt(0);
            if ((paramInt1 < 97) || (paramInt1 > 122))
              break label862;
            j = (char)(paramInt1 - 32);
          }
          while (true)
          {
            paramq.frS = j;
            com.tencent.mm.plugin.c.a.ask().Yn().ia(((bmu)localObject3).jBB, ((bmu)localObject3).wlF);
            ab.v("MicroMsg.NetSceneGetQQGroup", "QQ Friend nickname: " + paramq.aqo() + "  remark: " + paramq.aqr());
            break;
            paramq.gwD = 1;
            break label551;
            if (!bo.isNullOrNil(paramq.aqt()))
            {
              paramInt1 = paramq.aqt().charAt(0);
              break label693;
            }
            if (!bo.isNullOrNil(paramq.aqp()))
            {
              paramInt1 = paramq.aqp().charAt(0);
              break label693;
            }
            if (bo.isNullOrNil(paramq.aqq()))
              break label693;
            paramInt1 = paramq.aqq().charAt(0);
            break label693;
            label862: if (paramInt1 >= 65)
            {
              j = paramInt1;
              if (paramInt1 <= 90);
            }
            else
            {
              j = 123;
            }
          }
        }
      }
      paramq = new HashMap();
      Object localObject3 = (ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg();
      paramInt1 = paramArrayOfByte.wrw;
      ab.d("MicroMsg.QQListStorage", "getByGroupID: GroupID:".concat(String.valueOf(paramInt1)));
      localObject1 = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid = \"" + paramInt1 + "\"";
      localObject3 = ((ap)localObject3).fni.a((String)localObject1, null, 0);
      while (((Cursor)localObject3).moveToNext())
      {
        localObject1 = new ao();
        ((ao)localObject1).d((Cursor)localObject3);
        paramq.put(Long.valueOf(((ao)localObject1).gwC), localObject1);
      }
      ((Cursor)localObject3).close();
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (ao)((Iterator)localObject2).next();
        if (paramq.containsKey(Long.valueOf(((ao)localObject1).gwC)))
        {
          localObject3 = (ao)paramq.get(Long.valueOf(((ao)localObject1).gwC));
          if (!bo.B(Long.valueOf(((ao)localObject3).gwC), Long.valueOf(((ao)localObject1).gwC)))
            paramInt1 = 0;
          while (true)
          {
            if (paramInt1 != 0)
              break label1524;
            ((ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).a(((ao)localObject1).gwC, (ao)localObject1);
            paramq.remove(Long.valueOf(((ao)localObject1).gwC));
            break;
            if (!bo.B(Integer.valueOf(((ao)localObject3).gwD), Integer.valueOf(((ao)localObject1).gwD)))
              paramInt1 = 0;
            else if (!bo.B(Integer.valueOf(((ao)localObject3).gwE), Integer.valueOf(((ao)localObject1).gwE)))
              paramInt1 = 0;
            else if (!bo.B(((ao)localObject3).username, ((ao)localObject1).username))
              paramInt1 = 0;
            else if (!bo.B(((ao)localObject3).nickname, ((ao)localObject1).nickname))
              paramInt1 = 0;
            else if (!bo.B(((ao)localObject3).gwF, ((ao)localObject1).gwF))
              paramInt1 = 0;
            else if (!bo.B(((ao)localObject3).gwG, ((ao)localObject1).gwG))
              paramInt1 = 0;
            else if (!bo.B(((ao)localObject3).gwH, ((ao)localObject1).gwH))
              paramInt1 = 0;
            else if (!bo.B(((ao)localObject3).gwI, ((ao)localObject1).gwI))
              paramInt1 = 0;
            else if (!bo.B(((ao)localObject3).gwJ, ((ao)localObject1).gwJ))
              paramInt1 = 0;
            else if (!bo.B(((ao)localObject3).gwK, ((ao)localObject1).gwK))
              paramInt1 = 0;
            else if (!bo.B(((ao)localObject3).gwL, ((ao)localObject1).gwL))
              paramInt1 = 0;
            else if (!bo.B(((ao)localObject3).gwM, ((ao)localObject1).gwM))
              paramInt1 = 0;
            else if (!bo.B(((ao)localObject3).frQ, ((ao)localObject1).frQ))
              paramInt1 = 0;
            else if (!bo.B(((ao)localObject3).frR, ((ao)localObject1).frR))
              paramInt1 = 0;
            else if (!bo.B(Integer.valueOf(((ao)localObject3).frS), Integer.valueOf(((ao)localObject1).frS)))
              paramInt1 = 0;
            else if (!bo.B(Integer.valueOf(((ao)localObject3).frT), Integer.valueOf(((ao)localObject1).frT)))
              paramInt1 = 0;
            else
              paramInt1 = 1;
          }
        }
        else
        {
          label1524: ((ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).a((ao)localObject1);
        }
      }
      localObject2 = paramq.keySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        long l = ((Long)((Iterator)localObject2).next()).longValue();
        paramq = (ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg();
        ab.d("MicroMsg.QQListStorage", "delete: QQ:".concat(String.valueOf(l)));
        if (paramq.fni.delete("qqlist", "qq= ?", new String[] { String.valueOf(l) }) > 0)
          paramq.b(5, paramq, String.valueOf(l));
      }
      ((k)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getFrdExtStg()).aa(localArrayList1);
      o.act().aa(localArrayList2);
      paramq = new am();
      paramq.gwu = paramArrayOfByte.wrw;
      paramq.gwz = 0;
      paramq.gwy = ((int)bo.anT());
      paramq.bJt = 48;
      ((an)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQGroupStg()).a(paramq);
    }
  }

  public final int getType()
  {
    return 143;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.ac
 * JD-Core Version:    0.6.2
 */