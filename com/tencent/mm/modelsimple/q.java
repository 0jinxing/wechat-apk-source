package com.tencent.mm.modelsimple;

import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.g.a.jt;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.bk;
import com.tencent.mm.model.r;
import com.tencent.mm.modelmulti.o;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.auth.PluginAuth;
import com.tencent.mm.protocal.j.d;
import com.tencent.mm.protocal.j.e;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ar;
import com.tencent.mm.protocal.protobuf.baf;
import com.tencent.mm.protocal.protobuf.bag;
import com.tencent.mm.protocal.protobuf.bah;
import com.tencent.mm.protocal.protobuf.bdv;
import com.tencent.mm.protocal.protobuf.bzr;
import com.tencent.mm.protocal.protobuf.cfi;
import com.tencent.mm.protocal.protobuf.cjj;
import com.tencent.mm.protocal.protobuf.csd;
import com.tencent.mm.protocal.protobuf.cse;
import com.tencent.mm.protocal.protobuf.cwd;
import com.tencent.mm.protocal.protobuf.cwe;
import com.tencent.mm.protocal.protobuf.fv;
import com.tencent.mm.protocal.protobuf.hh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParserException;

public final class q extends com.tencent.mm.ai.m
  implements k
{
  public String account;
  com.tencent.mm.ai.f ehi;
  private int errCode;
  private int errType;
  private String fPe;
  private String fPf;
  private boolean fPg;
  private boolean fPh;
  private int fPi;
  private int fPj;
  public String fPk;
  private boolean fPl;
  public final com.tencent.mm.network.q ftU;
  private int ftx;

  public q(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this("", "", paramInt, paramString1, paramString2, paramString3, 0, "", false, false);
  }

  public q(String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, String paramString5, int paramInt2, String paramString6, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(123441);
    this.fPe = "";
    this.fPf = "";
    this.account = "";
    this.fPg = false;
    this.fPh = false;
    this.errType = 0;
    this.errCode = 0;
    this.ftx = 3;
    this.fPi = 0;
    this.fPj = 0;
    this.fPl = false;
    ab.d("MicroMsg.NetSceneManualAuth", "summerauth NetSceneManualAuth this: " + this + " account: " + paramString1 + " secCodetype: " + paramInt1 + " secCode: " + paramString3 + " sid: " + paramString4 + " encryptKey: " + paramString5 + " inputType: " + paramInt2 + " authTicket: " + paramString6 + " useRawPwd: " + paramBoolean1 + " isMobileAutoLogin: " + paramBoolean2 + " stack: " + bo.dpG());
    if ((paramBoolean1) && (bo.isNullOrNil(paramString2)))
      ab.d("MicroMsg.NetSceneManualAuth", "summerauth NetSceneManualAuth useRawPwd but [%s]", new Object[] { paramString2 });
    this.account = paramString1;
    int i;
    Object localObject1;
    label327: Object localObject2;
    if (com.tencent.mm.protocal.f.vxx)
    {
      i = 252;
      this.ftU = new ax(i);
      localObject1 = (j.d)this.ftU.acF();
      i = ax.ZQ().getInt("key_auth_update_version", 0);
      ab.d("MicroMsg.NetSceneManualAuth", "summerauth updateVersion:%d, clientVersion:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(com.tencent.mm.protocal.d.vxo) });
      if (i != 0)
        break label881;
      ((l.d)localObject1).vyf = 1;
      com.tencent.mm.plugin.report.e.pXa.a(148L, 0L, 1L, false);
      ((j.d)localObject1).vxT = true;
      ((j.d)localObject1).hB(0);
      bah localbah = new bah();
      localObject2 = new baf();
      ((j.d)localObject1).vxS.wEb = localbah;
      ((j.d)localObject1).vxS.wEc = ((baf)localObject2);
      ((baf)localObject2).wEa = paramInt2;
      localObject1 = new hh();
      ((baf)localObject2).vIg = ((hh)localObject1);
      ((hh)localObject1).vHS = paramString6;
      ((hh)localObject1).vJW = 0;
      ((hh)localObject1).vHN = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
      ((hh)localObject1).vHM = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
      paramString6 = new csd();
      ((hh)localObject1).vJU = paramString6;
      paramString6.vLY = "";
      paramString6.vLX = "";
      paramString6.xpA = "";
      localObject2 = new cwd();
      ((hh)localObject1).vJV = ((cwd)localObject2);
      ((cwd)localObject2).wsM = "";
      ((cwd)localObject2).wsL = "";
      if (paramInt1 != 1)
        break label920;
      paramString6.vLY = paramString3;
      paramString6.vLX = paramString4;
      paramString6.xpA = paramString5;
      ((cwd)localObject2).wsM = "";
      ((cwd)localObject2).wsL = "";
      label550: if ((!bo.isNullOrNil(paramString1)) || (!g.RK()))
        break label971;
      com.tencent.mm.plugin.report.e.pXa.a(148L, 2L, 1L, false);
      this.fPe = ((String)g.RP().Ry().get(3, null));
      this.fPf = ((String)g.RP().Ry().get(19, null));
      paramString1 = (j.e)this.ftU.ZS();
      paramString2 = bo.nullAsNil((String)g.RP().Ry().get(2, null));
      if (!bo.isNullOrNil(paramString2))
        break label963;
      paramString2 = new com.tencent.mm.a.p(bo.a((Integer)g.RP().Ry().get(9, null), 0)).toString();
      label682: localbah.jBB = paramString2;
      paramString4 = null;
      paramString1 = paramString4;
      if (paramInt1 != 1)
      {
        paramString1 = paramString4;
        if (paramInt1 != 3)
        {
          if (paramInt1 != 2)
            break label1023;
          paramString1 = g.RN().QR().d(bo.getLong(paramString2, 0L), paramString3);
        }
      }
      label729: if (paramString1 != null)
        break label1056;
      paramInt1 = -1;
      label735: ab.i("MicroMsg.NetSceneManualAuth", "summerauth loginbuf len:%d content:[%s]", new Object[] { Integer.valueOf(paramInt1), bo.anv(bo.ca(paramString1)) });
      paramString3 = new SKBuiltinBuffer_t();
      paramString2 = paramString1;
      if (bo.cb(paramString1))
        paramString2 = new byte[0];
      ((hh)localObject1).vJT = paramString3.setBuffer(paramString2);
      localbah.vLJ = this.fPf;
      localbah.vLW = this.fPe;
      paramString1 = com.tencent.mm.plugin.report.e.pXa;
      if (!com.tencent.mm.protocal.f.vxx)
        break label1062;
      l = 104L;
      label830: paramString1.a(148L, l, 1L, false);
      paramString1 = com.tencent.mm.plugin.report.e.pXa;
      if (!com.tencent.mm.protocal.f.vxy)
        break label1070;
    }
    label920: label1056: label1062: label1070: for (long l = 106L; ; l = 107L)
    {
      paramString1.a(148L, l, 1L, false);
      AppMethodBeat.o(123441);
      return;
      i = 701;
      break;
      label881: if (i < com.tencent.mm.protocal.d.vxo)
      {
        ((l.d)localObject1).vyf = 16;
        com.tencent.mm.plugin.report.e.pXa.a(148L, 1L, 1L, false);
        break label327;
      }
      ((l.d)localObject1).vyf = 1;
      break label327;
      if (paramInt1 != 3)
        break label550;
      paramString6.vLY = "";
      paramString6.vLX = "";
      paramString6.xpA = "";
      ((cwd)localObject2).wsM = paramString3;
      ((cwd)localObject2).wsL = paramString4;
      break label550;
      label963: paramString1.gcF = paramString2;
      break label682;
      label971: if ((paramBoolean1) || (paramBoolean2))
      {
        this.fPe = paramString2;
        this.fPf = paramString2;
        paramString2 = paramString1;
        break label682;
      }
      this.fPe = bo.and(bo.nullAsNil(paramString2));
      this.fPf = bo.ane(bo.nullAsNil(paramString2));
      paramString2 = paramString1;
      break label682;
      label1023: paramString1 = paramString4;
      if (!bo.amV(paramString2))
        break label729;
      paramString1 = g.RN().QR().a(bo.getLong(paramString2, 0L), this.fPf, true);
      break label729;
      paramInt1 = paramString1.length;
      break label735;
      l = 105L;
      break label830;
    }
  }

  public q(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this(paramString1, paramString2, 0, "", "", "", paramInt, paramString3, false, false);
  }

  public q(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this(paramString2, paramString3, 0, "", "", "", 0, paramString4, true, false);
    this.fPk = paramString1;
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(123443);
    this.ehi = paramf;
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(123443);
    return i;
  }

  public final void a(final int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(123444);
    j.d locald = (j.d)paramq.acF();
    j.e locale = (j.e)paramq.ZS();
    boolean bool;
    label133: cjj localcjj;
    if ((locale.vxV != null) && (locale.vxV.xid != null))
    {
      paramInt1 = locale.vxV.xid.vHW;
      ab.i("MicroMsg.NetSceneManualAuth", "summerauth mmtls manual:%s", new Object[] { Integer.valueOf(paramInt1) });
      g.RQ();
      g.RP().eJH.set(47, Integer.valueOf(paramInt1));
      paramArrayOfByte = g.RO().eJo.ftA;
      if (paramArrayOfByte != null)
      {
        if ((paramInt1 & 0x1) == 0)
        {
          bool = true;
          paramArrayOfByte.cI(bool);
        }
      }
      else
      {
        this.errType = paramInt2;
        this.errCode = paramInt3;
        localcjj = locale.vxV;
        if (localcjj != null)
          break label230;
        ab.w("MicroMsg.NetSceneManualAuth", "summerauth error unifyAuthResp is null!");
        this.ehi.onSceneEnd(4, -1, "", this);
        com.tencent.mm.plugin.report.e.pXa.a(148L, 3L, 1L, false);
        AppMethodBeat.o(123444);
      }
    }
    label271: label285: label1068: 
    while (true)
    {
      return;
      bool = false;
      break;
      ab.i("MicroMsg.NetSceneManualAuth", "summerauth mmtls manual not set as ret:%s", new Object[] { Integer.valueOf(locale.vyl) });
      break label133;
      label230: paramInt1 = localcjj.xic;
      fv localfv = localcjj.xid;
      ar localar = localcjj.xie;
      bdv localbdv = localcjj.xif;
      Object localObject;
      if (localcjj.xid == null)
      {
        paramArrayOfByte = Integer.valueOf(-1);
        if (localcjj.xid != null)
          break label502;
        localObject = Integer.valueOf(-1);
        ab.i("MicroMsg.NetSceneManualAuth", "summerauth errType:%d, errCode:%d, errMsg:%s unifyAuthResp:%s, unifyFlag:%d, auth:%s, acct:%s, network:%s  clientSessionKey[%s], serverSessionKey[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, localcjj, Integer.valueOf(paramInt1), localfv, localar, localbdv, paramArrayOfByte, localObject });
        if ((paramInt2 == 0) && (paramInt3 == 0))
          break label1068;
        if ((paramInt2 != 4) || (paramInt3 != -301))
          break label570;
        ab.d("MicroMsg.NetSceneManualAuth", "summerauth RedirectIDC");
        com.tencent.mm.plugin.report.e.pXa.a(148L, 4L, 1L, false);
        if ((localcjj == null) || (localcjj.xif == null))
          break label515;
        ax.a(true, localcjj.xif.vLL, localcjj.xif.vLM, localcjj.xif.vLK);
      }
      while (true)
      {
        this.ftx -= 1;
        if (this.ftx > 0)
          break label526;
        ab.w("MicroMsg.NetSceneManualAuth", "summerauth err and return with no try!");
        this.ehi.onSceneEnd(3, -1, "", this);
        AppMethodBeat.o(123444);
        break;
        paramArrayOfByte = localcjj.xid.vHY;
        break label271;
        label502: localObject = localcjj.xid.vHZ;
        break label285;
        ab.w("MicroMsg.NetSceneManualAuth", "summerauth RedirectIDC but NetworkSectResp is null");
      }
      ab.i("MicroMsg.NetSceneManualAuth", "summerauth RedirectIDC do scene again redirectCount:%d", new Object[] { Integer.valueOf(this.ftx) });
      a(this.ftf, this.ehi);
      AppMethodBeat.o(123444);
      continue;
      label570: if ((!this.fPl) && (paramInt2 == 4) && (paramInt3 == -102))
      {
        com.tencent.mm.plugin.report.e.pXa.a(148L, 5L, 1L, false);
        paramInt1 = paramq.acF().vyj.ver;
        ab.i("MicroMsg.NetSceneManualAuth", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
        g.RS().aa(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(123437);
            new i().a(q.this.ftf, new q.1.1(this));
            AppMethodBeat.o(123437);
          }

          public final String toString()
          {
            AppMethodBeat.i(123438);
            String str = super.toString() + "|onGYNetEnd1";
            AppMethodBeat.o(123438);
            return str;
          }
        });
        AppMethodBeat.o(123444);
      }
      else
      {
        if ((paramInt2 == 4) && ((paramInt3 == -305) || (paramInt3 == -306)))
        {
          ab.i("MicroMsg.NetSceneManualAuth", "summerauth auth MM_ERR_CERT_SWITCH or MM_ERR_ECDHFAIL_ROLLBACK errCode:%d ver:%d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(com.tencent.mm.protocal.f.vxC) });
          paramString = com.tencent.mm.plugin.report.e.pXa;
          if (paramInt3 == -305);
          for (long l = 108L; ; l = 109L)
          {
            paramString.a(148L, l, 1L, true);
            a(this.ftf, this.ehi);
            AppMethodBeat.o(123444);
            break;
          }
        }
        if ((paramInt2 == 4) && (paramInt3 == -217))
        {
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          com.tencent.mm.plugin.report.e.pXa.a(148L, 47L, 1L, false);
          AppMethodBeat.o(123444);
        }
        else if ((paramInt2 == 4) && (paramInt3 == -218))
        {
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          com.tencent.mm.plugin.report.e.pXa.a(148L, 53L, 1L, false);
          AppMethodBeat.o(123444);
        }
        else if ((paramInt2 == 4) && (paramInt3 == -240))
        {
          ab.i("MicroMsg.NetSceneManualAuth", "summerauth auth MM_ERR_AUTO_RETRY_REQUEST redirectCount:%s", new Object[] { Integer.valueOf(this.ftx) });
          this.ftx -= 1;
          if (this.ftx <= 0)
          {
            this.ehi.onSceneEnd(3, -1, "", this);
            AppMethodBeat.o(123444);
          }
          else
          {
            com.tencent.mm.plugin.report.e.pXa.a(148L, 57L, 1L, false);
            a(this.ftf, this.ehi);
            AppMethodBeat.o(123444);
          }
        }
        else
        {
          ab.w("MicroMsg.NetSceneManualAuth", "summerauth Failed. callback and return now ! [%d ,%d ,%s]", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt2), paramString });
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          com.tencent.mm.plugin.report.e.pXa.a(148L, 6L, 1L, false);
          if ((com.tencent.mm.protocal.f.vxx) && (paramInt3 != -106))
            com.tencent.mm.plugin.report.e.pXa.a(148L, 110L, 1L, false);
          AppMethodBeat.o(123444);
          continue;
          if ((paramInt1 & 0x2) != 0)
          {
            paramArrayOfByte = localcjj.xie;
            if ((paramArrayOfByte == null) || (bo.isNullOrNil(paramArrayOfByte.jBB)))
            {
              ab.w("MicroMsg.NetSceneManualAuth", "summerauth UserName is null and return false!");
              this.ehi.onSceneEnd(4, -1, "", this);
              AppMethodBeat.o(123444);
            }
          }
          else
          {
            ab.w("MicroMsg.NetSceneManualAuth", "summerauth acct resp is null and return false!");
            this.ehi.onSceneEnd(4, -1, "", this);
            AppMethodBeat.o(123444);
            continue;
            if (ax.a(paramq) != 2)
              break label1292;
            com.tencent.mm.plugin.report.e.pXa.a(148L, 7L, 1L, false);
            ab.d("MicroMsg.NetSceneManualAuth", "summerauth decode faild loginDecodeFailedTry:%d", new Object[] { Integer.valueOf(this.fPj) });
            this.fPj += 1;
            if (this.fPj > 1)
            {
              this.ehi.onSceneEnd(4, -1, "", this);
              AppMethodBeat.o(123444);
            }
            else
            {
              ((j.d)this.ftl.acF()).vxS.wEc.vIg.vJW = 1;
              a(this.ftf, this.ehi);
              AppMethodBeat.o(123444);
            }
          }
        }
      }
    }
    label515: label526: g.RS().Bn();
    label1292: ab.d("MicroMsg.NetSceneManualAuth", "summerauth dkidc setAccUin Begin thread:[%s,%d]", new Object[] { Thread.currentThread().getName(), Integer.valueOf(Process.getThreadPriority(Process.myTid())) });
    com.tencent.mm.model.aa.a(locale.vxV, false);
    ((PluginAuth)g.M(PluginAuth.class)).getHandleAuthResponseCallbacks().a(locald, locale, false);
    if (!bo.isNullOrNil(this.account))
    {
      g.RP().Ry().set(ac.a.xVa, this.account);
      av.fly.ak("login_user_name", this.account);
    }
    g.RO().eJo.a(new bk(new q.2(this, locale)), 0);
    if (bo.h((Integer)g.RP().Ry().get(15, null)) != 0)
      ((com.tencent.mm.plugin.zero.b.b)g.K(com.tencent.mm.plugin.zero.b.b.class)).ahW().lN(10);
    paramInt1 = localcjj.xid.vHV;
    if ((paramInt1 & 0x8) == 0)
    {
      paramq = r.Yz();
      if (!TextUtils.isEmpty(paramq))
      {
        paramq = new m(paramq);
        g.RO().eJo.a(paramq, 0);
      }
      label1523: paramInt1 = 4;
      if ((locald.vxS.wEc.vIg.vJT == null) || (locald.vxS.wEc.vIg.vJT.getILen() <= 0))
        break label1689;
      paramInt1 = 1;
    }
    while (true)
    {
      com.tencent.mm.plugin.report.b.d.u(1, paramInt1, locald.vxS.wEb.jBB);
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        ab.i("MicroMsg.NetSceneManualAuth", "publishManualAuthEvent");
        paramq = new jt();
        paramq.cER.csN = true;
        com.tencent.mm.sdk.b.a.xxA.m(paramq);
      }
      g.RS().doM();
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(123444);
      break;
      ab.i("MicroMsg.NetSceneManualAuth", "summerauth not need getProfile authResultFlag:%d", new Object[] { Integer.valueOf(paramInt1) });
      com.tencent.mm.plugin.report.e.pXa.a(148L, 9L, 1L, false);
      break label1523;
      label1689: if (locald.vxS.wEc.wEa == 1)
        paramInt1 = 2;
    }
  }

  public final void a(m.a parama)
  {
  }

  public final int acn()
  {
    return 5;
  }

  public final String agh()
  {
    AppMethodBeat.i(123450);
    String str = ((j.e)this.ftU.ZS()).vxV.xid.vHS;
    AppMethodBeat.o(123450);
    return str;
  }

  public final q ajl()
  {
    this.fPl = true;
    return this;
  }

  public final String ajm()
  {
    AppMethodBeat.i(123445);
    String str;
    if (((j.e)this.ftU.ZS()).vxV.xid == null)
    {
      str = "";
      AppMethodBeat.o(123445);
    }
    while (true)
    {
      return str;
      str = ((j.e)this.ftU.ZS()).vxV.xid.vHQ;
      AppMethodBeat.o(123445);
    }
  }

  public final String ajn()
  {
    AppMethodBeat.i(123446);
    String str;
    if (((j.e)this.ftU.ZS()).vxV.xid == null)
    {
      str = "";
      AppMethodBeat.o(123446);
    }
    while (true)
    {
      return str;
      int i = getSecCodeType();
      if (i == 3)
      {
        if (((j.e)this.ftU.ZS()).vxV.xid.vHL != null)
        {
          str = bo.nullAsNil(((j.e)this.ftU.ZS()).vxV.xid.vHL.wsL);
          AppMethodBeat.o(123446);
        }
      }
      else if ((i == 1) && (((j.e)this.ftU.ZS()).vxV.xid.vHK != null))
      {
        str = bo.nullAsNil(((j.e)this.ftU.ZS()).vxV.xid.vHK.vLX);
        AppMethodBeat.o(123446);
      }
      else
      {
        str = "";
        AppMethodBeat.o(123446);
      }
    }
  }

  public final byte[] ajo()
  {
    AppMethodBeat.i(123447);
    byte[] arrayOfByte;
    if (((j.e)this.ftU.ZS()).vxV.xid == null)
    {
      arrayOfByte = new byte[0];
      AppMethodBeat.o(123447);
    }
    while (true)
    {
      return arrayOfByte;
      int i = getSecCodeType();
      if (i == 3)
      {
        if (((j.e)this.ftU.ZS()).vxV.xid.vHL != null)
        {
          arrayOfByte = com.tencent.mm.platformtools.aa.a(((j.e)this.ftU.ZS()).vxV.xid.vHL.wsO, new byte[0]);
          AppMethodBeat.o(123447);
        }
      }
      else if (i == 1)
      {
        if (((j.e)this.ftU.ZS()).vxV.xid.vHK != null)
        {
          arrayOfByte = com.tencent.mm.platformtools.aa.a(((j.e)this.ftU.ZS()).vxV.xid.vHK.vEF, new byte[0]);
          AppMethodBeat.o(123447);
        }
      }
      else if ((i == 2) && (((j.d)this.ftU.acF()).vxS.wEb != null))
      {
        g.RN().QR().a(bo.getLong(((j.d)this.ftU.acF()).vxS.wEb.jBB, 0L), com.tencent.mm.platformtools.aa.a(((j.e)this.ftU.ZS()).vxV.xid.vHJ));
        arrayOfByte = g.RN().QR().fs(bo.getLong(((j.d)this.ftU.acF()).vxS.wEb.jBB, 0L));
        AppMethodBeat.o(123447);
      }
      else
      {
        arrayOfByte = new byte[0];
        AppMethodBeat.o(123447);
      }
    }
  }

  public final String ajp()
  {
    AppMethodBeat.i(123449);
    String str;
    if (((j.e)this.ftU.ZS()).vxV.xid == null)
    {
      str = "";
      AppMethodBeat.o(123449);
    }
    while (true)
    {
      return str;
      if ((getSecCodeType() == 1) && (((j.e)this.ftU.ZS()).vxV.xid.vHK != null))
      {
        if (((j.e)this.ftU.ZS()).vxV.xid.vHK.xpA != null)
        {
          str = ((j.e)this.ftU.ZS()).vxV.xid.vHK.xpA;
          AppMethodBeat.o(123449);
        }
        else
        {
          str = null;
          AppMethodBeat.o(123449);
        }
      }
      else
      {
        str = "";
        AppMethodBeat.o(123449);
      }
    }
  }

  public final String ajq()
  {
    AppMethodBeat.i(123451);
    String str = ((j.e)this.ftU.ZS()).vxV.xie.vCh;
    AppMethodBeat.o(123451);
    return str;
  }

  public final int ajr()
  {
    int i = 0;
    AppMethodBeat.i(123452);
    if (((j.e)this.ftU.ZS()).vxV.xid == null)
    {
      AppMethodBeat.o(123452);
      return i;
    }
    Object localObject = ((j.e)this.ftU.ZS()).vxV.xid.vHR;
    if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
    {
      Iterator localIterator = ((bzr)localObject).wYM.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localObject = (cfi)localIterator.next();
      }
      while (((cfi)localObject).pXC != 11);
    }
    for (i = bo.getInt(((cfi)localObject).xeN, 0); ; i = 0)
    {
      AppMethodBeat.o(123452);
      break;
    }
  }

  public final BindWordingContent ajs()
  {
    Object localObject1 = null;
    AppMethodBeat.i(123453);
    if (((j.e)this.ftU.ZS()).vxV.xid == null)
    {
      AppMethodBeat.o(123453);
      return localObject1;
    }
    localObject1 = ((j.e)this.ftU.ZS()).vxV.xid.vHR;
    if ((localObject1 != null) && (((bzr)localObject1).wYM != null) && (((bzr)localObject1).wYM.size() > 0))
    {
      Iterator localIterator = ((bzr)localObject1).wYM.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localObject1 = (cfi)localIterator.next();
      }
      while (((cfi)localObject1).pXC != 12);
    }
    Object localObject3;
    for (localObject1 = ((cfi)localObject1).xeN; ; localObject3 = null)
    {
      if (localObject1 != null)
        new a();
      while (true)
      {
        try
        {
          localObject1 = a.tp((String)localObject1);
          AppMethodBeat.o(123453);
        }
        catch (XmlPullParserException localXmlPullParserException)
        {
          ab.printErrStackTrace("MicroMsg.NetSceneManualAuth", localXmlPullParserException, "", new Object[0]);
          Object localObject2 = null;
          continue;
        }
        catch (IOException localIOException)
        {
          ab.printErrStackTrace("MicroMsg.NetSceneManualAuth", localIOException, "", new Object[0]);
        }
        localObject3 = null;
      }
    }
  }

  public final String ajt()
  {
    AppMethodBeat.i(123454);
    Object localObject;
    if (((j.e)this.ftU.ZS()).vxV.xid == null)
    {
      localObject = "";
      AppMethodBeat.o(123454);
    }
    while (true)
    {
      return localObject;
      localObject = ((j.e)this.ftU.ZS()).vxV.xid.vHR;
      if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
      {
        Iterator localIterator = ((bzr)localObject).wYM.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            localObject = (cfi)localIterator.next();
            if (((cfi)localObject).pXC == 16)
            {
              localObject = ((cfi)localObject).xeN;
              AppMethodBeat.o(123454);
              break;
            }
          }
      }
      localObject = "";
      AppMethodBeat.o(123454);
    }
  }

  public final int aju()
  {
    int i = 0;
    AppMethodBeat.i(123455);
    if (((j.e)this.ftU.ZS()).vxV.xid == null)
    {
      AppMethodBeat.o(123455);
      return i;
    }
    Object localObject = ((j.e)this.ftU.ZS()).vxV.xid.vHR;
    cfi localcfi;
    if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
    {
      localObject = ((bzr)localObject).wYM.iterator();
      do
      {
        if (!((Iterator)localObject).hasNext())
          break;
        localcfi = (cfi)((Iterator)localObject).next();
      }
      while (localcfi.pXC != 13);
    }
    for (i = bo.getInt(localcfi.xeN, 0); ; i = 0)
    {
      AppMethodBeat.o(123455);
      break;
    }
  }

  public final boolean ajv()
  {
    AppMethodBeat.i(123456);
    boolean bool;
    if (((j.e)this.ftU.ZS()).vxV.xid == null)
    {
      AppMethodBeat.o(123456);
      bool = true;
    }
    while (true)
    {
      return bool;
      Object localObject = ((j.e)this.ftU.ZS()).vxV.xid.vHR;
      if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
      {
        Iterator localIterator = ((bzr)localObject).wYM.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            localObject = (cfi)localIterator.next();
            if (((cfi)localObject).pXC == 18)
              if (bo.getInt(((cfi)localObject).xeN, 0) == 1)
              {
                AppMethodBeat.o(123456);
                bool = false;
                break;
              }
          }
      }
      AppMethodBeat.o(123456);
      bool = true;
    }
  }

  public final m.b b(com.tencent.mm.network.q paramq)
  {
    return m.b.ftu;
  }

  public final int getSecCodeType()
  {
    AppMethodBeat.i(123448);
    int i;
    if (((j.e)this.ftU.ZS()).vxV.xid == null)
    {
      ab.e("MicroMsg.NetSceneManualAuth", "getSecCodeType ERROR AuthSectResp or WxVerifyCodeRespInfo is null");
      AppMethodBeat.o(123448);
      i = 0;
    }
    while (true)
    {
      return i;
      if (this.errType != 4)
      {
        ab.e("MicroMsg.NetSceneManualAuth", "getSecCodeType ERROR errType :%d", new Object[] { Integer.valueOf(this.errType) });
        AppMethodBeat.o(123448);
        i = 0;
      }
      else if (this.errCode == -311)
      {
        i = 2;
        AppMethodBeat.o(123448);
      }
      else if (this.errCode == -6)
      {
        AppMethodBeat.o(123448);
        i = 1;
      }
      else if (this.errCode == -310)
      {
        i = 3;
        AppMethodBeat.o(123448);
      }
      else
      {
        AppMethodBeat.o(123448);
        i = 0;
      }
    }
  }

  public final int getType()
  {
    if (com.tencent.mm.protocal.f.vxx);
    for (int i = 252; ; i = 701)
      return i;
  }

  public final void tr(String paramString)
  {
    AppMethodBeat.i(123442);
    j.d locald = (j.d)this.ftU.acF();
    locald.vxS.wEb.vLJ = paramString;
    locald.vxS.wEb.vLW = paramString;
    locald.vxS.wEc.vIg.vJT = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
    this.fPe = paramString;
    this.fPf = paramString;
    AppMethodBeat.o(123442);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.q
 * JD-Core Version:    0.6.2
 */