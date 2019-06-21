package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class c extends m
{
  public double uYv;

  public c(List<l> paramList, String paramString)
  {
    AppMethodBeat.i(48657);
    this.uYv = 0.0D;
    HashMap localHashMap = new HashMap();
    localHashMap.put("session_key", paramString);
    paramString = paramList.iterator();
    int i = 0;
    if (paramString.hasNext())
    {
      paramList = (l)paramString.next();
      localHashMap.put("qt_id_".concat(String.valueOf(i)), paramList.id);
      localHashMap.put("ans_cont_".concat(String.valueOf(i)), paramList.nYb);
      localHashMap.put("level_".concat(String.valueOf(i)), paramList.level);
      localHashMap.put("parent_id_".concat(String.valueOf(i)), paramList.uYQ);
      i++;
      if ((paramList.uYS == null) || (!"Y".equals(paramList.nYb)))
        break label320;
      localHashMap.put("qt_id_".concat(String.valueOf(i)), paramList.uYS.id);
      localHashMap.put("ans_cont_".concat(String.valueOf(i)), paramList.uYS.nYb);
      localHashMap.put("level_".concat(String.valueOf(i)), paramList.uYS.level);
      localHashMap.put("parent_id_".concat(String.valueOf(i)), paramList.uYS.uYQ);
      i++;
    }
    label320: 
    while (true)
    {
      break;
      localHashMap.put("total_num", String.valueOf(i));
      M(localHashMap);
      AppMethodBeat.o(48657);
      return;
    }
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(48658);
    ab.d("Micromsg.NetSceneTenpayCheckPwd", "errCode " + paramInt + " errMsg: " + paramString);
    if (paramInt != 0)
      AppMethodBeat.o(48658);
    while (true)
    {
      return;
      try
      {
        this.uYv = (paramJSONObject.getInt("credit_amount") / 100.0D);
        AppMethodBeat.o(48658);
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", paramString, "", new Object[0]);
        AppMethodBeat.o(48658);
      }
    }
  }

  public final int bgI()
  {
    return 60;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.a.c
 * JD-Core Version:    0.6.2
 */