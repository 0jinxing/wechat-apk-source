package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g extends m
{
  public int tup;
  public int tuq;
  public Profession[] tvM;

  public g()
  {
    AppMethodBeat.i(46650);
    this.tvM = null;
    HashMap localHashMap = new HashMap();
    if (!bo.isNullOrNil(null))
      localHashMap.put("scene", null);
    M(localHashMap);
    AppMethodBeat.o(46650);
  }

  public final int ZU()
  {
    return 1976;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    int i = 0;
    AppMethodBeat.i(46651);
    ab.i("MicroMsg.NetSceneTenpayGetUserExInfo", "errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    ab.d("MicroMsg.NetSceneTenpayGetUserExInfo", "json: %s", new Object[] { paramJSONObject.toString() });
    this.tup = paramJSONObject.optInt("need_area");
    this.tuq = paramJSONObject.optInt("need_profession");
    paramString = paramJSONObject.optJSONArray("array");
    if (paramString != null)
    {
      this.tvM = new Profession[paramString.length()];
      paramInt = i;
      if (paramInt < paramString.length())
      {
        paramJSONObject = paramString.optJSONObject(paramInt);
        if (paramJSONObject != null)
        {
          String str = paramJSONObject.optString("profession_name");
          i = paramJSONObject.optInt("profession_type");
          if (bo.isNullOrNil(str))
            break label160;
          paramJSONObject = new Profession(str, i);
          this.tvM[paramInt] = paramJSONObject;
        }
        while (true)
        {
          paramInt++;
          break;
          label160: ab.i("MicroMsg.NetSceneTenpayGetUserExInfo", "empty profession_name!");
        }
      }
    }
    AppMethodBeat.o(46651);
  }

  public final int bgI()
  {
    return 1976;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/getuserexinfo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.model.g
 * JD-Core Version:    0.6.2
 */