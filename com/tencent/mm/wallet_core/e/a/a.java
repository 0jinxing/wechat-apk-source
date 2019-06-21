package com.tencent.mm.wallet_core.e.a;

import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.k;
import com.tencent.mm.model.r;
import com.tencent.mm.network.e;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bjz;
import com.tencent.mm.protocal.protobuf.bka;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.q;
import com.tencent.mm.wallet_core.c.v;
import com.tenpay.android.wechat.TenpayUtil;
import java.net.URLEncoder;

public abstract class a extends q
{
  public final void U(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = dNN();
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new b.a();
      ((b.a)localObject2).fsJ = new bjz();
      ((b.a)localObject2).fsK = new bka();
      ((b.a)localObject2).uri = "/cgi-bin/mmpay-bin/payu";
      ((b.a)localObject2).fsI = 1518;
      ((b.a)localObject2).fsL = 0;
      ((b.a)localObject2).fsM = 0;
      localObject2 = ((b.a)localObject2).acD();
      ((k)localObject2).ftb = true;
    }
    localObject1 = (bjz)((b)localObject2).fsG.fsP;
    if (paramBoolean1)
      ((bjz)localObject1).wxx = cOX();
    if (paramBoolean2)
      ((bjz)localObject1).wxy = 1;
    f((b)localObject2);
  }

  public int a(e parame, f paramf)
  {
    this.ehi = paramf;
    if (!r.YM())
    {
      ab.e("MicroMsg.NetScenePayUBase", "hy: serious error: not payupay");
      paramf.onSceneEnd(1000, -100868, "Pay Method Err", this);
    }
    for (int i = 1; ; i = a(parame, this.ehh, this))
      return i;
  }

  public final void a(b paramb, SKBuiltinBuffer_t paramSKBuiltinBuffer_t)
  {
    ((bjz)paramb.fsG.fsP).wxz = paramSKBuiltinBuffer_t;
  }

  public final String acv(String paramString)
  {
    return TenpayUtil.signWith3Des(paramString);
  }

  public final void b(b paramb, SKBuiltinBuffer_t paramSKBuiltinBuffer_t)
  {
    ((bjz)paramb.fsG.fsP).wNd = paramSKBuiltinBuffer_t;
  }

  public final void b(StringBuilder paramStringBuilder, String paramString)
  {
    paramStringBuilder.append(URLEncoder.encode(paramString));
  }

  public abstract int cOX();

  public final int cOo()
  {
    return cOX();
  }

  public final v e(b paramb)
  {
    bka localbka = (bka)paramb.fsH.fsP;
    paramb = new v();
    paramb.wxD = localbka.wxD;
    paramb.wxC = localbka.wxC;
    paramb.wxB = localbka.wxB;
    paramb.wxA = localbka.wxA;
    paramb.luU = localbka.wNf;
    paramb.AfP = localbka.wNe;
    return paramb;
  }

  public final int getType()
  {
    return 1518;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.e.a.a
 * JD-Core Version:    0.6.2
 */