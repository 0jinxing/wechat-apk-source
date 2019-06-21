package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.f.b.f;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.protocal.protobuf.ach;
import com.tencent.mm.protocal.protobuf.aps;
import com.tencent.mm.protocal.protobuf.apt;
import com.tencent.mm.protocal.protobuf.cyi;
import com.tencent.mm.protocal.protobuf.cyj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class j extends com.tencent.mm.plugin.exdevice.a.a<aps, apt>
{
  public String appName;
  public String lvA;
  public boolean lvJ;
  public boolean lvK;
  public String lvL;
  public String lvM;
  public com.tencent.mm.plugin.exdevice.f.b.a.a lvN;
  public ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> lvO;
  public ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.c> lvP;
  public ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.e> lvQ;
  public ArrayList<String> lvR;
  public String lvS;
  public String lvT;
  public boolean lvU;
  public boolean lvV;
  public String lvW;
  private final WeakReference<com.tencent.mm.plugin.exdevice.a.b<j>> lvX;
  public a lvY;
  public String lvz;

  public j(String paramString1, String paramString2, String paramString3, boolean paramBoolean, com.tencent.mm.plugin.exdevice.a.b<j> paramb)
  {
    AppMethodBeat.i(19458);
    this.lvX = new WeakReference(paramb);
    this.lvS = paramString1;
    this.lvL = paramString1;
    this.appName = bo.nullAsNil(paramString2);
    this.lvK = paramBoolean;
    this.lvM = paramString3;
    AppMethodBeat.o(19458);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19459);
    ab.d("MicroMsg.NetSceneGetRankInfo", "hy: get rank info end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    apt localapt;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    String str;
    Object localObject4;
    Object localObject5;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      localapt = (apt)aTS();
      localObject1 = "";
      this.lvP = new ArrayList();
      if (localapt.vEx != null)
      {
        localObject2 = localapt.vEx.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (ach)((Iterator)localObject2).next();
          aw.ZK();
          if (com.tencent.mm.model.c.XM().aoJ(((ach)localObject3).username))
          {
            str = localapt.fha;
            localObject4 = this.appName;
            if ((bo.isNullOrNil(str)) || (localObject3 == null))
            {
              ab.w("MicroMsg.ExdeviceRankConverter", "hy: param error");
              localObject5 = null;
            }
            while (true)
            {
              if (localObject5 == null)
                break label226;
              this.lvP.add(localObject5);
              break;
              localObject5 = new com.tencent.mm.plugin.exdevice.f.b.a.c();
              ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject5).field_rankID = str;
              ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject5).field_username = ((ach)localObject3).username;
              ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject5).field_step = ((ach)localObject3).hzv;
              ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject5).field_appusername = ((String)localObject4);
            }
          }
          else
          {
            label226: aw.Rg().a(new h(((ach)localObject3).username, null), 0);
          }
        }
      }
      this.lvO = new ArrayList();
      localObject5 = localObject1;
      if (localapt.wtN != null)
      {
        localObject2 = localapt.wtN.iterator();
        localObject5 = localObject1;
        if (((Iterator)localObject2).hasNext())
        {
          localObject4 = (cyi)((Iterator)localObject2).next();
          localObject3 = localapt.fha;
          str = this.appName;
          if ((bo.isNullOrNil((String)localObject3)) || (localObject4 == null))
          {
            ab.w("MicroMsg.ExdeviceRankConverter", "hy: param error");
            localObject5 = null;
            label347: if (localObject5 == null)
              break label455;
            if (((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject5).field_ranknum != 1)
              break label1235;
            localObject1 = ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject5).field_username;
          }
        }
      }
    }
    label455: label1223: label1229: label1235: 
    while (true)
    {
      this.lvO.add(localObject5);
      break;
      localObject5 = new com.tencent.mm.plugin.exdevice.f.b.a.d();
      ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject5).field_appusername = str;
      ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject5).field_rankID = ((String)localObject3);
      ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject5).field_likecount = ((cyi)localObject4).xtH;
      ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject5).field_ranknum = ((cyi)localObject4).xtG;
      ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject5).field_score = ((cyi)localObject4).score;
      ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject5).field_selfLikeState = ((cyi)localObject4).xtI;
      ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject5).field_username = ((cyi)localObject4).username;
      break label347;
      break;
      this.lvQ = new ArrayList();
      if (localapt.wtO != null)
      {
        localObject2 = localapt.wtO.iterator();
        label606: 
        while (((Iterator)localObject2).hasNext())
        {
          localObject4 = (cyj)((Iterator)localObject2).next();
          str = localapt.fha;
          localObject3 = this.appName;
          if ((bo.isNullOrNil(str)) || (localObject4 == null))
          {
            ab.w("MicroMsg.ExdeviceRankConverter", "hy: param error");
            localObject1 = null;
          }
          while (true)
          {
            if (localObject1 == null)
              break label606;
            this.lvQ.add(localObject1);
            break;
            localObject1 = new com.tencent.mm.plugin.exdevice.f.b.a.e();
            ((com.tencent.mm.plugin.exdevice.f.b.a.e)localObject1).field_appusername = ((String)localObject3);
            ((com.tencent.mm.plugin.exdevice.f.b.a.e)localObject1).field_rankID = str;
            ((com.tencent.mm.plugin.exdevice.f.b.a.e)localObject1).field_timestamp = ((cyj)localObject4).timestamp;
            ((com.tencent.mm.plugin.exdevice.f.b.a.e)localObject1).field_username = ((cyj)localObject4).username;
          }
        }
      }
      this.lvR = new ArrayList();
      if (localapt.wtG != null)
      {
        localObject1 = localapt.wtG.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          this.lvR.add(localObject2);
        }
      }
      if (!bo.isNullOrNil(this.lvM))
        localObject5 = this.lvM;
      localObject2 = localapt.wtP;
      localObject4 = localapt.wtQ;
      boolean bool;
      int i;
      int j;
      if (bo.isNullOrNil((String)localObject5))
      {
        ab.w("MicroMsg.ExdeviceRankConverter", "hy: param error");
        localObject1 = null;
        this.lvN = ((com.tencent.mm.plugin.exdevice.f.b.a.a)localObject1);
        this.lvS = localapt.fha;
        this.lvA = localapt.wtI;
        this.lvz = localapt.wtH;
        this.lvT = localapt.wtR;
        this.lvU = localapt.lvU;
        if (localapt.wtU != 1)
          break label1159;
        bool = true;
        this.lvV = bool;
        this.lvW = localapt.wtV;
        this.lvJ = localapt.wtK;
        ab.d("MicroMsg.NetSceneGetRankInfo", "hy: get score info ok.");
        if ((this.lvL == null) || (!this.lvL.equals(this.lvS)))
        {
          localObject1 = ad.bpe().lwf;
          if (localObject1 != null)
            ((f)localObject1).Ko(this.lvS);
        }
        if ((this.lvY != null) && (this.lvK))
          this.lvY.a(this);
        if (this.lvK)
          ad.boY().by(this.lvP);
        localObject5 = ad.boX();
        localObject1 = this.lvS;
        if (!bo.isNullOrNil((String)localObject1))
          break label1165;
        ab.w("MicroMsg.ExdeviceRankInfoStg", "delete rankInfo by rankId failed, rankId is null or nil.");
        ad.boX().g(this.lvS, this.lvO);
        bool = this.lvU;
        if (this.lvP == null)
          break label1217;
        i = this.lvP.size();
        if (this.lvO == null)
          break label1223;
        j = this.lvO.size();
        label981: if (this.lvQ == null)
          break label1229;
      }
      for (int k = this.lvQ.size(); ; k = 0)
      {
        ab.i("MicroMsg.NetSceneGetRankInfo", "isCacheExist(%s), RankFollowInfo size(%s), RankInfo size(%d), LikeInfo size(%d).", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
        ad.bpb().a(this.lvS, this.appName, this.lvQ);
        if (this.lvN != null)
          ad.bpa().a(this.lvN);
        super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
        paramq = (com.tencent.mm.plugin.exdevice.a.b)this.lvX.get();
        if (paramq != null)
          paramq.a(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(19459);
        return;
        localObject1 = new com.tencent.mm.plugin.exdevice.f.b.a.a();
        ((com.tencent.mm.plugin.exdevice.f.b.a.a)localObject1).field_username = ((String)localObject5);
        ((com.tencent.mm.plugin.exdevice.f.b.a.a)localObject1).field_championUrl = ((String)localObject2);
        ((com.tencent.mm.plugin.exdevice.f.b.a.a)localObject1).field_championMotto = ((String)localObject4);
        break;
        bool = false;
        break label783;
        ab.i("MicroMsg.ExdeviceRankInfoStg", "delete rankInfo by rankId (%s).(r : %d)", new Object[] { localObject1, Integer.valueOf(((com.tencent.mm.plugin.exdevice.f.b.b.d)localObject5).bSd.delete("HardDeviceRankInfo", "rankID = ? ", new String[] { localObject1 })) });
        break label929;
        i = 0;
        break label965;
        j = 0;
        break label981;
      }
    }
  }

  public final int getType()
  {
    return 1042;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmbiz-bin/rank/getuserranklike";
  }

  public static abstract interface a
  {
    public abstract void a(j paramj);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.a.j
 * JD-Core Version:    0.6.2
 */