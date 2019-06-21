package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.afx;
import com.tencent.mm.protocal.protobuf.afy;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class t extends m
  implements k
{
  private Object data;
  public com.tencent.mm.ai.b ehh;
  private f ehi;

  private t(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11447);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new afx();
    ((b.a)localObject).fsK = new afy();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/getbizjsapiresult";
    ((b.a)localObject).fsI = 1285;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (afx)this.ehh.fsG.fsP;
    ((afx)localObject).wbO = paramString1;
    ((afx)localObject).Cn = 1;
    ((afx)localObject).data = paramString2;
    this.data = null;
    AppMethodBeat.o(11447);
  }

  public static void a(f paramf)
  {
    AppMethodBeat.i(11444);
    g.RO().eJo.a(1285, paramf);
    AppMethodBeat.o(11444);
  }

  public static void b(f paramf)
  {
    AppMethodBeat.i(11445);
    g.RO().eJo.b(1285, paramf);
    AppMethodBeat.o(11445);
  }

  public static boolean o(String paramString1, String paramString2, String paramString3)
  {
    boolean bool = false;
    AppMethodBeat.i(11446);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("brand_user_name", paramString2);
      localJSONObject.put("bizchat_id", paramString3);
      paramString1 = new t(paramString1, localJSONObject.toString());
      bool = g.RO().eJo.a(paramString1, 0);
      AppMethodBeat.o(11446);
      return bool;
    }
    catch (Exception paramString1)
    {
      while (true)
        AppMethodBeat.o(11446);
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11449);
    this.ehi = paramf;
    ab.i("MicroMsg.NetSceneGetBizJsApiResult", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11449);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11448);
    ab.d("MicroMsg.NetSceneGetBizJsApiResult", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11448);
  }

  public final int getType()
  {
    return 1285;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.t
 * JD-Core Version:    0.6.2
 */