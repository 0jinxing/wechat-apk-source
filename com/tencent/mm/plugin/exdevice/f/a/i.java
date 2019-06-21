package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.protocal.protobuf.ach;
import com.tencent.mm.protocal.protobuf.apq;
import com.tencent.mm.protocal.protobuf.apr;
import com.tencent.mm.protocal.protobuf.cdo;
import com.tencent.mm.protocal.protobuf.cyk;
import com.tencent.mm.protocal.protobuf.cyl;
import com.tencent.mm.protocal.protobuf.mq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class i extends com.tencent.mm.plugin.exdevice.a.a<apq, apr>
{
  public String appName;
  private final WeakReference<com.tencent.mm.plugin.exdevice.a.b<i>> lqU;
  public String lvA;
  public List<cdo> lvB;
  public List<cyl> lvC;
  public cyk lvD;
  public ArrayList<String> lvE;
  public List<ach> lvF;
  public List<mq> lvG;
  public boolean lvH;
  public int lvI;
  public boolean lvJ;
  public String lvw;
  public String lvx;
  public String lvy;
  public String lvz;
  public String source;
  public String username;

  public i(String paramString1, String paramString2, com.tencent.mm.plugin.exdevice.a.b<i> paramb)
  {
    AppMethodBeat.i(19454);
    ab.d("MicroMsg.NetSceneGetProfileDetail", "appusername: %s, username: %s", new Object[] { paramString2, paramString1 });
    this.username = paramString1;
    this.appName = paramString2;
    this.lqU = new WeakReference(paramb);
    AppMethodBeat.o(19454);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19455);
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    ab.d("MicroMsg.NetSceneGetProfileDetail", "hy: getdetail scene gy end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (apr)aTS();
      this.lvx = paramq.wtC;
      this.lvy = paramq.lvy;
      this.lvC = paramq.wtF;
      this.lvD = paramq.wtD;
      this.lvz = paramq.wtH;
      this.source = paramq.source;
      this.lvA = paramq.wtI;
      this.lvB = paramq.vFi;
      this.lvH = paramq.lvH;
      this.lvF = paramq.vEx;
      this.lvG = paramq.wtJ;
      this.lvE = new ArrayList();
      this.lvI = paramq.lCg;
      this.lvJ = paramq.wtK;
      this.lvw = paramq.lvw;
      if (paramq.wtG != null)
        this.lvE.addAll(paramq.wtG);
      this.lvB = new LinkedList();
      if (paramq.vFi != null)
        this.lvB.addAll(paramq.vFi);
      Object localObject1;
      Iterator localIterator;
      if ((this.username != null) && (!this.username.equalsIgnoreCase(r.Yz())))
      {
        if (!this.lvH)
          ad.boY().Kq(this.username);
      }
      else
      {
        if (paramq.vEx == null)
          break label560;
        localObject1 = new ArrayList();
        localIterator = paramq.vEx.iterator();
      }
      while (true)
      {
        if (!localIterator.hasNext())
          break label508;
        paramArrayOfByte = (ach)localIterator.next();
        aw.ZK();
        if (com.tencent.mm.model.c.XM().aoJ(paramArrayOfByte.username))
        {
          Object localObject2 = new com.tencent.mm.plugin.exdevice.f.b.a.c();
          ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject2).field_username = paramArrayOfByte.username;
          ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject2).field_step = paramArrayOfByte.hzv;
          ((ArrayList)localObject1).add(localObject2);
          continue;
          localObject2 = ad.boY();
          localObject1 = this.username;
          if (((com.tencent.mm.plugin.exdevice.f.b.b.a)localObject2).a(new com.tencent.mm.plugin.exdevice.f.b.b("hardcode_rank_id", "hardcode_app_name", (String)localObject1)) != null)
            break;
          paramArrayOfByte = new com.tencent.mm.plugin.exdevice.f.b.a.c();
          paramArrayOfByte.field_rankID = "hardcode_rank_id";
          paramArrayOfByte.field_appusername = "hardcode_app_name";
          paramArrayOfByte.field_username = ((String)localObject1);
          paramArrayOfByte.field_step = 0;
          ((com.tencent.mm.plugin.exdevice.f.b.b.a)localObject2).b(paramArrayOfByte);
          break;
        }
        aw.Rg().a(new h(paramArrayOfByte.username, null), 0);
      }
      label508: ab.d("MicroMsg.NetSceneGetProfileDetail", "follows %d %s", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()), ((ArrayList)localObject1).toString() });
      if (r.Yz().equalsIgnoreCase(this.username))
        ad.boY().by((List)localObject1);
      label560: this.lvG = new ArrayList();
      if (paramq.wtJ != null)
        this.lvG.addAll(paramq.wtJ);
      this.lvH = paramq.lvH;
      paramq = new com.tencent.mm.plugin.exdevice.f.b.a.a();
      paramq.field_championMotto = this.lvy;
      paramq.field_championUrl = this.lvx;
      paramq.field_username = this.username;
      ad.bpa().a(paramq);
    }
    paramq = (com.tencent.mm.plugin.exdevice.a.b)this.lqU.get();
    if (paramq != null)
      paramq.a(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19455);
  }

  public final int getType()
  {
    return 1043;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmbiz-bin/rank/getuserrankdetail";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.a.i
 * JD-Core Version:    0.6.2
 */