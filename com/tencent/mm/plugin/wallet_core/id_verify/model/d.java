package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.k;
import com.tencent.mm.network.e;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cgr;
import com.tencent.mm.protocal.protobuf.cgs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.q;
import com.tencent.mm.wallet_core.c.v;
import com.tenpay.android.wechat.TenpayUtil;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d extends q
{
  public String token;

  public d(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(46641);
    HashMap localHashMap = new HashMap();
    localHashMap.put("flag", "1");
    localHashMap.put("true_name", paramString1);
    localHashMap.put("identify_card", paramString2);
    localHashMap.put("cre_type", "1");
    localHashMap.put("realname_scene", String.valueOf(paramInt));
    ab.i("MicroMsg.NetSceneRealNameVerify", "realname_scene=%d", new Object[] { Integer.valueOf(paramInt) });
    M(localHashMap);
    AppMethodBeat.o(46641);
  }

  public final void U(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(46643);
    Object localObject1 = dNN();
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new b.a();
      ((b.a)localObject2).fsJ = new cgr();
      ((b.a)localObject2).fsK = new cgs();
      ((b.a)localObject2).uri = "/cgi-bin/mmpay-bin/tenpay/realnameauthen";
      ((b.a)localObject2).fsI = 1616;
      ((b.a)localObject2).fsL = 185;
      ((b.a)localObject2).fsM = 1000000185;
      localObject2 = ((b.a)localObject2).acD();
      ((k)localObject2).ftb = true;
    }
    localObject1 = (cgr)((b)localObject2).fsG.fsP;
    if (paramBoolean2)
      ((cgr)localObject1).wxy = 1;
    f((b)localObject2);
    AppMethodBeat.o(46643);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(46646);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(46646);
    return i;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46642);
    if (paramInt == 0)
      this.token = paramJSONObject.optString("token");
    AppMethodBeat.o(46642);
  }

  public final void a(b paramb, SKBuiltinBuffer_t paramSKBuiltinBuffer_t)
  {
    ((cgr)paramb.fsG.fsP).wxz = paramSKBuiltinBuffer_t;
  }

  public final String acv(String paramString)
  {
    AppMethodBeat.i(46644);
    paramString = TenpayUtil.signWith3Des(paramString);
    AppMethodBeat.o(46644);
    return paramString;
  }

  public final void b(b paramb, SKBuiltinBuffer_t paramSKBuiltinBuffer_t)
  {
    ((cgr)paramb.fsG.fsP).wNd = paramSKBuiltinBuffer_t;
  }

  public final int cOo()
  {
    return 0;
  }

  public final v e(b paramb)
  {
    AppMethodBeat.i(46645);
    paramb = (cgs)paramb.fsH.fsP;
    v localv = new v();
    localv.wxD = paramb.wxD;
    localv.wxC = paramb.wxC;
    localv.wxB = paramb.wxB;
    localv.wxA = paramb.wxA;
    localv.luU = paramb.wNf;
    localv.AfP = paramb.wNe;
    AppMethodBeat.o(46645);
    return localv;
  }

  public final int getType()
  {
    return 1616;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.model.d
 * JD-Core Version:    0.6.2
 */