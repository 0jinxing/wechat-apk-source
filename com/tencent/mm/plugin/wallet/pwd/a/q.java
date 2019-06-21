package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import org.json.JSONObject;

public final class q extends m
{
  public String cKT;
  public String cQY;
  public String packageName;
  public int scene;
  public String tqI;
  public int tqJ;
  public int tqK;
  public int tqL;

  public q(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(46202);
    this.tqK = -1;
    this.scene = -1;
    this.packageName = "";
    this.tqL = -1;
    this.cKT = "";
    this.tqI = paramString1;
    this.tqJ = paramInt;
    this.cQY = paramString2;
    HashMap localHashMap = new HashMap();
    localHashMap.put("cre_id", com.tencent.mm.compatible.util.q.encode(paramString1));
    localHashMap.put("cre_type", com.tencent.mm.compatible.util.q.encode(String.valueOf(paramInt)));
    localHashMap.put("true_name", com.tencent.mm.compatible.util.q.encode(paramString2));
    localHashMap.put("verifyScene", "1");
    M(localHashMap);
    AppMethodBeat.o(46202);
  }

  public final int ZU()
  {
    return 2784;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46203);
    ab.i("MicroMsg.NetSceneVerifyUserRealNameInfo", "onGYNetEnd, errCode: %s, errMsg: %s, json: %s", new Object[] { Integer.valueOf(paramInt), paramString, paramJSONObject });
    if (paramInt == 0)
    {
      paramJSONObject.optString("retcode");
      paramJSONObject.optString("retmsg");
      this.tqK = paramJSONObject.optInt("is_support_face", 0);
      this.scene = paramJSONObject.optInt("scene", 0);
      this.packageName = paramJSONObject.optString("package");
      this.tqL = paramJSONObject.optInt("is_need_cert");
      this.cKT = paramJSONObject.optString("packagesign");
    }
    AppMethodBeat.o(46203);
  }

  public final int bgI()
  {
    return 2784;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/verifyuserrealnameinfo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.q
 * JD-Core Version:    0.6.2
 */