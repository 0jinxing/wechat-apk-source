package com.tencent.mm.wallet_core.tenpay.model;

import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.k;
import com.tencent.mm.model.r;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.wallet.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cgr;
import com.tencent.mm.protocal.protobuf.cgs;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.wallet_core.c.ac;
import com.tencent.mm.wallet_core.c.q;
import com.tencent.mm.wallet_core.c.v;
import com.tenpay.android.wechat.TenpayUtil;
import java.util.Vector;
import org.json.JSONObject;

public abstract class m extends q
{
  public static Vector<String> AgC = new Vector();
  protected boolean AgB = false;

  static
  {
    for (int i = 0; i < d.vwq.length; i++)
      AgC.add(d.vwq[i]);
  }

  private int g(com.tencent.mm.ai.b paramb)
  {
    int i = 1;
    Object localObject1 = (cgr)paramb.fsG.fsP;
    if (((cgr)localObject1).wxz != null)
      new String(((cgr)localObject1).wxz.getBufferToBytes());
    if (((cgr)localObject1).wNd != null)
      new String(((cgr)localObject1).wNd.getBufferToBytes());
    ah.getContext();
    ac.dOb();
    Object localObject2;
    if (this.AgB)
    {
      localObject2 = (cgs)paramb.fsH.fsP;
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = new cgs();
      localObject2 = "".getBytes();
      ((cgs)localObject1).wxA = new SKBuiltinBuffer_t().setBuffer((byte[])localObject2);
      ((cgs)localObject1).wxD = cOo();
      ((cgs)localObject1).wxB = 0;
    }
    while (true)
    {
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(null);
        ((cgs)localObject1).wNe = ((JSONObject)localObject2).optInt("TenpayErrType");
        ((cgs)localObject1).wNf = ((JSONObject)localObject2).optString("TenpayErrMsg");
        a(1, 0, 0, "", paramb, null);
        return i;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.NetSenceTenPayBase", localException, "", new Object[0]);
        continue;
      }
      i = -1;
    }
  }

  public void U(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = dNN();
    Object localObject2;
    boolean bool;
    if (localObject1 == null)
    {
      localObject1 = new b.a();
      ((b.a)localObject1).fsJ = new cgr();
      ((b.a)localObject1).fsK = new cgs();
      localObject2 = getUri();
      int i = ZU();
      ((b.a)localObject1).uri = ((String)localObject2);
      ((b.a)localObject1).fsI = i;
      ((b.a)localObject1).fsL = 185;
      ((b.a)localObject1).fsM = 1000000185;
      localObject1 = ((b.a)localObject1).acD();
      if (!dOi())
      {
        bool = true;
        ((k)localObject1).ftb = bool;
      }
    }
    while (true)
    {
      localObject2 = (cgr)((com.tencent.mm.ai.b)localObject1).fsG.fsP;
      if (paramBoolean1)
        ((cgr)localObject2).wxx = bgI();
      if (paramBoolean2)
        ((cgr)localObject2).wxy = 1;
      f((com.tencent.mm.ai.b)localObject1);
      return;
      bool = false;
      break;
    }
  }

  public int ZU()
  {
    return 385;
  }

  public int a(e parame, f paramf)
  {
    this.ehi = paramf;
    String str1 = this.ehh.uri;
    int i;
    if (AgC.contains(str1))
    {
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.NetSenceTenPayBase", "black cgi bye bye %s", new Object[] { str1 });
      if (!this.AgB)
        break label373;
      i = g(this.ehh);
      if (i == -1)
        break label373;
    }
    while (true)
    {
      return i;
      com.tencent.mm.wallet_core.c.b.dNJ();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSenceTenPayBase", "cert try get errormsg %s", new Object[] { Integer.valueOf(com.tencent.mm.wallet_core.c.b.getLastError()) });
      long l = System.currentTimeMillis();
      com.tencent.mm.wallet_core.c.b.dNJ();
      com.tencent.mm.wallet_core.c.b.init(ah.getContext());
      cgr localcgr = (cgr)this.ehh.fsG.fsP;
      str1 = "";
      String str2 = "";
      if (localcgr.wxz != null)
        str1 = new String(localcgr.wxz.getBufferToBytes());
      if (localcgr.wNd != null)
        str2 = new String(localcgr.wNd.getBufferToBytes());
      String str3 = new String((str1 + "&&" + str2).getBytes());
      com.tencent.mm.wallet_core.c.ab.dNZ();
      str1 = com.tencent.mm.wallet_core.c.ab.dNY();
      com.tencent.mm.wallet_core.c.b.dNJ();
      if (com.tencent.mm.wallet_core.c.b.isCertExist(str1))
      {
        h.pYm.a(414L, 20L, 1L, true);
        com.tencent.mm.wallet_core.c.b.dNJ();
        str2 = com.tencent.mm.wallet_core.c.b.genUserSig(str1, str3);
        h.pYm.a(414L, 21L, System.currentTimeMillis() - l, true);
        com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.NetSenceTenPayBase", "sign ret src:%s sign:%s", new Object[] { str3, str2 });
        localcgr.sign = str2;
        localcgr.xfz = str1;
      }
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSenceTenPayBase", "sign cost time %s cn %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), str1 });
        break;
        com.tencent.mm.wallet_core.c.b.dNJ();
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSenceTenPayBase", "cert not exist cn %s %s", new Object[] { str1, Integer.valueOf(com.tencent.mm.wallet_core.c.b.getLastError()) });
      }
      label373: if (r.YM())
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.NetSenceTenPayBase", "hy: serious error: is payupay");
        paramf.onSceneEnd(1000, -100868, "Pay Method Err", this);
        i = 1;
      }
      else
      {
        i = a(parame, this.ehh, this);
      }
    }
  }

  public final void a(com.tencent.mm.ai.b paramb, SKBuiltinBuffer_t paramSKBuiltinBuffer_t)
  {
    ((cgr)paramb.fsG.fsP).wxz = paramSKBuiltinBuffer_t;
  }

  public final String acv(String paramString)
  {
    return TenpayUtil.signWith3Des(paramString);
  }

  public final void b(com.tencent.mm.ai.b paramb, SKBuiltinBuffer_t paramSKBuiltinBuffer_t)
  {
    ((cgr)paramb.fsG.fsP).wNd = paramSKBuiltinBuffer_t;
  }

  public abstract int bgI();

  public int cOo()
  {
    return bgI();
  }

  public boolean dOi()
  {
    return true;
  }

  public final void dOq()
  {
    this.AgB = true;
  }

  public final v e(com.tencent.mm.ai.b paramb)
  {
    paramb = (cgs)paramb.fsH.fsP;
    v localv = new v();
    localv.wxD = paramb.wxD;
    localv.wxC = paramb.wxC;
    localv.wxB = paramb.wxB;
    localv.wxA = paramb.wxA;
    localv.luU = paramb.wNf;
    localv.AfP = paramb.wNe;
    return localv;
  }

  public int getType()
  {
    return 385;
  }

  public String getUri()
  {
    return "/cgi-bin/micromsg-bin/tenpay";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.tenpay.model.m
 * JD-Core Version:    0.6.2
 */