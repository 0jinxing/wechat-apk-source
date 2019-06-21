package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e extends m
{
  public String token;
  public List<l> uYx;
  public int uYy;

  public e(String paramString)
  {
    AppMethodBeat.i(48661);
    HashMap localHashMap = new HashMap();
    localHashMap.put("bind_serialno", paramString);
    M(localHashMap);
    AppMethodBeat.o(48661);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48662);
    ab.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
      AppMethodBeat.o(48662);
    while (true)
    {
      return;
      try
      {
        this.token = paramJSONObject.getString("session_key");
        this.uYy = paramJSONObject.optInt("answer_times_left", -1);
        JSONArray localJSONArray = paramJSONObject.getJSONArray("Array");
        if ((localJSONArray == null) || (localJSONArray.length() <= 0))
          break label319;
        paramString = new java/util/HashMap;
        paramString.<init>();
        int i = localJSONArray.length();
        paramInt = 0;
        if (paramInt >= i)
          break label294;
        paramJSONObject = localJSONArray.getJSONObject(paramInt);
        l locall = new com/tencent/mm/plugin/wxcredit/a/l;
        locall.<init>();
        locall.id = paramJSONObject.getString("qt_id");
        locall.uYQ = paramJSONObject.getString("parent_id");
        locall.type = paramJSONObject.getString("qt_type");
        locall.desc = paramJSONObject.getString("qt_cont");
        locall.uYR = paramJSONObject.getInt("ans_len");
        locall.kfM = paramJSONObject.getString("wording");
        locall.level = paramJSONObject.getInt("level");
        if ((paramString.containsKey(locall.uYQ)) && (!"0".equals(locall.uYQ)))
          ((l)paramString.get(locall.uYQ)).uYS = locall;
        while (true)
        {
          paramInt++;
          break;
          paramString.put(locall.id, locall);
        }
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", paramString, "", new Object[0]);
        AppMethodBeat.o(48662);
      }
      continue;
      label294: paramJSONObject = new java/util/ArrayList;
      paramJSONObject.<init>(paramString.values());
      this.uYx = paramJSONObject;
      paramString.clear();
      label319: AppMethodBeat.o(48662);
    }
  }

  public final int bgI()
  {
    return 59;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.a.e
 * JD-Core Version:    0.6.2
 */