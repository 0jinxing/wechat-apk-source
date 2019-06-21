package com.tencent.mm.plugin.offline.a;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.alb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.wallet_core.c.u;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends u
{
  private final b ehh;
  private f ehi;
  private ArrayList<String> hUW;
  private String oXT;
  private String oXU;

  private void aa(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(43383);
    this.oXT = paramJSONObject.optString("micropay_tips");
    try
    {
      JSONArray localJSONArray = paramJSONObject.getJSONArray("head_url_list");
      int i;
      if (localJSONArray != null)
      {
        i = localJSONArray.length();
        if (i != 0);
      }
      else
      {
        AppMethodBeat.o(43383);
      }
      while (true)
      {
        return;
        for (i = 0; i < localJSONArray.length(); i++)
        {
          paramJSONObject = (String)localJSONArray.get(i);
          this.hUW.add(paramJSONObject);
        }
        AppMethodBeat.o(43383);
      }
    }
    catch (JSONException paramJSONObject)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneGetOffLineInfo", paramJSONObject, "", new Object[0]);
        AppMethodBeat.o(43383);
      }
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(43381);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(43381);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(43382);
    if (paramInt1 != 0)
      ab.e("MicroMsg.NetSceneGetOffLineInfo", "Cmd : 606, errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
    alb localalb = (alb)((b)paramq).fsH.fsP;
    int i = paramInt1;
    int j = paramInt2;
    paramq = paramString;
    if (paramInt1 == 0)
    {
      i = paramInt1;
      j = paramInt2;
      paramq = paramString;
      if (paramInt2 != 0);
    }
    try
    {
      if (!TextUtils.isEmpty(localalb.wqA))
      {
        paramq = new org/json/JSONObject;
        paramq.<init>(localalb.wqA);
        i = paramq.optInt("InitValue");
        j = paramq.optInt("FastChangedLimit");
        this.oXU = paramq.optString("guide_tips");
        com.tencent.mm.plugin.offline.c.a.AB(i);
        com.tencent.mm.plugin.offline.c.a.AC(j);
        paramq = new java/lang/StringBuilder;
        paramq.<init>("initValue:");
        ab.v("MicroMsg.NetSceneGetOffLineInfo", i + " fastChangeValue:" + j);
      }
      i = paramInt1;
      j = paramInt2;
      paramq = paramString;
      if (!TextUtils.isEmpty(localalb.wqB))
      {
        paramq = new org/json/JSONObject;
        paramq.<init>(localalb.wqB);
        aa(paramq);
        paramq = paramString;
        j = paramInt2;
        i = paramInt1;
      }
      if (this.ehi != null)
        this.ehi.onSceneEnd(i, j, paramq, this);
      AppMethodBeat.o(43382);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneGetOffLineInfo", paramString, "", new Object[0]);
        i = 1000;
        j = 2;
        paramq = ah.getContext().getString(2131304763);
      }
    }
  }

  public final int getType()
  {
    return 606;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.a.a
 * JD-Core Version:    0.6.2
 */