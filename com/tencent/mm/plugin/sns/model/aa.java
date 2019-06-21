package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.protocal.protobuf.ccm;
import com.tencent.mm.protocal.protobuf.ccn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.Vector;

public final class aa extends com.tencent.mm.ai.m
  implements k, d
{
  private static Vector<String> qKd;
  private final int cvp;
  private boolean czr;
  private b ehh;
  public f ehi;
  private boolean qIW;
  private long qIX;
  long qIY;
  private String qJA;
  private long qJR;
  private boolean qJS;
  private boolean qJT;
  public int qJa;
  private int qKe;
  private boolean qKf;
  private String qKg;
  private boolean qKh;
  public long qKi;
  String userName;

  static
  {
    AppMethodBeat.i(36362);
    qKd = new Vector();
    AppMethodBeat.o(36362);
  }

  public aa(String paramString, long paramLong, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(36357);
    this.qJR = 0L;
    this.qIX = 0L;
    this.qIY = 0L;
    this.qKe = 0;
    this.qKf = false;
    this.qJA = "";
    this.qKg = "";
    this.qJS = false;
    this.qJT = false;
    this.qKh = false;
    this.qJa = 0;
    this.userName = paramString;
    this.qIX = paramLong;
    this.czr = paramBoolean;
    int i;
    label116: Object localObject;
    ccm localccm;
    int j;
    if (paramLong == 0L)
    {
      ab.i("MicroMsg.NetSceneSnsUserPage", "fp userName ".concat(String.valueOf(paramString)));
      if (!paramBoolean)
        break label446;
      i = 4;
      this.cvp = i;
      localObject = new b.a();
      ((b.a)localObject).fsJ = new ccm();
      ((b.a)localObject).fsK = new ccn();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnsuserpage";
      ((b.a)localObject).fsI = 212;
      ((b.a)localObject).fsL = 99;
      ((b.a)localObject).fsM = 1000000099;
      this.ehh = ((b.a)localObject).acD();
      localccm = (ccm)this.ehh.fsG.fsP;
      localccm.vHl = paramString;
      localccm.wZU = paramLong;
      if (paramLong == 0L)
        bool = true;
      this.qIW = bool;
      j = af.cnv().Yc(paramString);
      localObject = af.cnF();
      if (!this.qIW)
        break label453;
    }
    while (true)
    {
      this.qIY = ((o)localObject).a(l, j, paramString, paramBoolean);
      localccm.xbw = this.qIY;
      i = c.a(this.qIY, paramLong, paramString);
      localccm.xbx = i;
      localccm.vFH = paramInt;
      if (this.qIW)
      {
        this.qJA = af.cnJ().YX(paramString).field_md5;
        if (this.qJA == null)
          this.qJA = "";
        localccm.wZT = this.qJA;
      }
      this.qJR = paramLong;
      ab.i("MicroMsg.NetSceneSnsUserPage", "nextCount: " + j + " maxId:" + i.jV(paramLong) + " minId:" + i.jV(this.qIY) + " lastReqTime:" + i + " snsSource " + paramInt);
      AppMethodBeat.o(36357);
      return;
      ab.i("MicroMsg.NetSceneSnsUserPage", "np userName ".concat(String.valueOf(paramString)));
      break;
      label446: i = 8;
      break label116;
      label453: l = paramLong;
    }
  }

  public static boolean XR(String paramString)
  {
    try
    {
      AppMethodBeat.i(36355);
      boolean bool;
      if (qKd.contains(paramString))
      {
        bool = false;
        AppMethodBeat.o(36355);
      }
      while (true)
      {
        return bool;
        qKd.add(paramString);
        bool = true;
        AppMethodBeat.o(36355);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public static boolean XS(String paramString)
  {
    try
    {
      AppMethodBeat.i(36356);
      qKd.remove(paramString);
      AppMethodBeat.o(36356);
      return true;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  private void a(ccn paramccn, String paramString)
  {
    AppMethodBeat.i(36359);
    aj.a(this.userName, this.cvp, paramccn.vKB, paramString);
    if (this.qIX == 0L);
    for (this.qIX = ((cbf)paramccn.vKB.getFirst()).vQE; ; this.qIX = c.ka(this.qIX))
    {
      this.qIY = ((cbf)paramccn.vKB.getLast()).vQE;
      ab.i("MicroMsg.NetSceneSnsUserPage", "insertListAndUpdateFaultInfo userName %s maxId %s minId %s NewRequestTime %s", new Object[] { this.userName, Long.valueOf(this.qIX), Long.valueOf(this.qIY), Integer.valueOf(paramccn.xbC) });
      c.f(this.userName, this.qIX, this.qIY, paramccn.xbC);
      AppMethodBeat.o(36359);
      return;
    }
  }

  private void fj(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(138379);
    Object localObject = af.cnF();
    String str = this.userName;
    boolean bool = this.czr;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select snsId from SnsInfo ").append(o.bm(str, bool)).append(" AND type in ( 1,2 , 3 , 4 , 18 , 5 , 12 , 9 , 14 , 15 , 13 , 21 , 25 , 26) and  (snsId != 0  )  limit 4");
    str = localStringBuilder.toString();
    localObject = ((o)localObject).bSd.rawQuery(str, null);
    int i = ((Cursor)localObject).getCount();
    ((Cursor)localObject).close();
    if ((i <= 3) && (i > 0) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      this.qJT = true;
      AppMethodBeat.o(138379);
    }
    while (true)
    {
      return;
      if (i == 0)
        this.qJS = true;
      AppMethodBeat.o(138379);
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(36361);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(36361);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36360);
    ab.i("MicroMsg.NetSceneSnsUserPage", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    ccn localccn = (ccn)((b)paramq).fsH.fsP;
    if ((paramq.ZS().vyl != 207) && (paramq.ZS().vyl != 203) && (paramq.ZS().vyl != 0) && (paramq.ZS().vyl != 2001) && (paramq.ZS().vyl != 2004) && (paramq.ZS().vyl != 2005) && (paramq.ZS().vyl != 2003))
    {
      XS(this.userName);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36360);
    }
    while (true)
    {
      return;
      Object localObject2;
      boolean bool;
      if (paramq.ZS().vyl == 2003)
      {
        localObject1 = af.cnF();
        paramArrayOfByte = this.userName;
        localObject2 = "DELETE FROM SnsInfo" + " where SnsInfo.userName=\"" + bo.vA(paramArrayOfByte) + "\"";
        bool = ((o)localObject1).bSd.hY("SnsInfo", (String)localObject2);
        ab.d("MicroMsg.SnsInfoStorage", "del snsinfo " + paramArrayOfByte + " res " + bool);
      }
      this.qKg = localccn.xbV;
      this.qJa = localccn.wZX;
      ab.i("MicroMsg.NetSceneSnsUserPage", "for same md5 count: " + localccn.wZX + " , objCount:  " + localccn.wGG + ", retTips:" + this.qKg);
      this.qKi = localccn.xbT;
      Object localObject1 = i.jW(this.qIX);
      if (!this.qIW)
      {
        ab.d("MicroMsg.NetSceneSnsUserPage", "np  " + localccn.vKB.size());
        if (localccn.vKB.isEmpty())
          if (paramq.ZS().vyl == 203)
          {
            bool = true;
            label485: this.qKh = bool;
            af.cnF().d(this.userName, this.czr, (String)localObject1);
            this.qJS = true;
            this.qIY = this.qIX;
          }
        while (true)
        {
          XS(this.userName);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(36360);
          break;
          bool = false;
          break label485;
          a(localccn, (String)localObject1);
        }
      }
      if (this.qJA.equals(localccn.wZT))
      {
        paramq = af.cnF();
        if (this.qIW);
        for (long l = 0L; ; l = this.qJR)
        {
          this.qIY = paramq.a(l, this.qJa, this.userName, this.czr);
          ab.i("MicroMsg.NetSceneSnsUserPage", "md5 is nochange the new minid %s", new Object[] { Long.valueOf(this.qIY) });
          fj(paramInt2, paramInt3);
          XS(this.userName);
          paramq = af.cnJ().YX(this.userName);
          this.ehi.onSceneEnd(paramq.field_lastFirstPageRequestErrType, paramq.field_lastFirstPageRequestErrCode, paramString, this);
          AppMethodBeat.o(36360);
          break;
        }
      }
      ab.i("MicroMsg.NetSceneSnsUserPage", "fp  " + localccn.vKB.size());
      if ((!this.qIW) || (this.qJA.equals(localccn.wZT)))
      {
        label760: af.cnJ().k(this.userName, localccn.wZT, paramInt2, paramInt3);
        if ((paramq.ZS().vyl != 207) && (paramq.ZS().vyl != 2001) && (paramq.ZS().vyl != 2004) && (paramq.ZS().vyl != 2005))
          break label1415;
        af.cnJ().gq(this.userName, "");
        if (!localccn.vKB.isEmpty())
          break label1255;
        paramq = af.cnF();
        paramArrayOfByte = this.userName;
        bool = this.czr;
        paramq.q(bool, o.bm(paramArrayOfByte, bool) + " AND  (snsId != 0  ) ");
        this.qIY = this.qIX;
      }
      while (true)
      {
        fj(paramInt2, paramInt3);
        XS(this.userName);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(36360);
        break;
        this.qKe = localccn.xbS;
        localObject2 = af.cnJ().YX(this.userName);
        ((l)localObject2).field_icount = this.qKe;
        Object localObject3 = localccn.wBZ;
        if (localObject3 != null)
        {
          String str1 = i.jV(((ccl)localObject3).gva);
          String str2 = af.getAccSnsPath();
          paramArrayOfByte = this.userName + "bg_";
          String str3 = this.userName + "tbg_";
          if ((((l)localObject2).field_bgUrl == null) || (!((l)localObject2).field_bgId.equals(str1)))
          {
            ((l)localObject2).field_older_bgId = ((l)localObject2).field_bgId;
            if (com.tencent.mm.vfs.e.ct(an.fZ(str2, this.userName) + paramArrayOfByte))
            {
              com.tencent.mm.vfs.e.deleteFile(an.fZ(str2, this.userName) + str3);
              com.tencent.mm.vfs.e.h(an.fZ(str2, this.userName), paramArrayOfByte, str3);
            }
            this.qKf = true;
            ((l)localObject2).cqI();
            ab.d("MicroMsg.NetSceneSnsUserPage", "get new  bgid " + ((ccl)localObject3).guZ);
          }
          ((l)localObject2).field_bgId = str1;
          ((l)localObject2).field_bgUrl = ((ccl)localObject3).guZ;
          ((l)localObject2).field_snsBgId = ((ccl)localObject3).gva;
        }
        af.cnJ().a((l)localObject2);
        break label760;
        label1255: localObject2 = af.cnF();
        paramq = this.userName;
        bool = this.czr;
        localObject3 = i.jW(((cbf)localccn.vKB.getFirst()).vQE);
        paramArrayOfByte = o.bm(paramq, bool) + " AND  (snsId != 0  ) ";
        paramq = paramArrayOfByte;
        if (o.Zb((String)localObject3))
          paramq = paramArrayOfByte + " AND " + ((o)localObject2).Ze((String)localObject3);
        ((o)localObject2).q(bool, paramq);
        af.cnF().d(this.userName, this.czr, i.jW(((cbf)localccn.vKB.getLast()).vQE));
        a(localccn, (String)localObject1);
      }
      label1415: if (localccn.vKB.size() == 0)
      {
        ab.d("MicroMsg.NetSceneSnsUserPage", "error: server give size zero");
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(36360);
      }
      else
      {
        a(localccn, (String)localObject1);
        XS(this.userName);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(36360);
      }
    }
  }

  public final boolean cmM()
  {
    return this.qIW;
  }

  public final boolean cmN()
  {
    return this.qJS;
  }

  public final boolean cmO()
  {
    return this.qJT;
  }

  public final boolean cmP()
  {
    return this.qKh;
  }

  public final long cmQ()
  {
    return this.qIY;
  }

  public final boolean cmR()
  {
    return this.qKf;
  }

  public final long cmS()
  {
    return this.qKi;
  }

  public final String cmT()
  {
    return this.qKg;
  }

  public final int getType()
  {
    return 212;
  }

  public final String getUserName()
  {
    return this.userName;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.aa
 * JD-Core Version:    0.6.2
 */