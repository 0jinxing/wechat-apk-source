package com.tencent.mm.plugin.websearch.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.protocal.protobuf.bve;
import com.tencent.mm.protocal.protobuf.bvf;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class af
{
  public static bvf uax;

  public static bvf cVk()
  {
    AppMethodBeat.i(124166);
    Object localObject;
    if (uax == null)
    {
      localObject = cVl();
      uax = new bvf();
      localObject = ah.getContext().getSharedPreferences("fts_history_search_sp", 0).getString((String)localObject, "");
      if (!bo.isNullOrNil((String)localObject))
        localObject = Base64.decode(((String)localObject).getBytes(), 0);
    }
    try
    {
      uax.parseFrom((byte[])localObject);
      label67: localObject = uax;
      AppMethodBeat.o(124166);
      return localObject;
    }
    catch (IOException localIOException)
    {
      break label67;
    }
  }

  public static String cVl()
  {
    AppMethodBeat.i(124167);
    String str = "key_pb_history_list" + r.Yz();
    AppMethodBeat.o(124167);
    return str;
  }

  public static String cVm()
  {
    AppMethodBeat.i(124168);
    bvf localbvf = cVk();
    int i = localbvf.jBw.size();
    Object localObject = new JSONObject();
    try
    {
      JSONArray localJSONArray1 = new org/json/JSONArray;
      localJSONArray1.<init>();
      JSONObject localJSONObject1 = new org/json/JSONObject;
      localJSONObject1.<init>();
      JSONArray localJSONArray2 = new org/json/JSONArray;
      localJSONArray2.<init>();
      for (int j = 0; (j < localbvf.jBw.size()) && (j < i); j++)
      {
        bve localbve = (bve)localbvf.jBw.get(j);
        JSONObject localJSONObject2 = new org/json/JSONObject;
        localJSONObject2.<init>();
        localJSONObject2.put("word", localbve.wWv);
        localJSONArray2.put(localJSONObject2);
      }
      localJSONObject1.put("items", localJSONArray2);
      localJSONObject1.put("count", localJSONArray2.length());
      localJSONObject1.put("type", 4);
      localJSONArray1.put(localJSONObject1);
      ((JSONObject)localObject).put("data", localJSONArray1);
      ((JSONObject)localObject).put("ret", 0);
      label180: localObject = ((JSONObject)localObject).toString();
      AppMethodBeat.o(124168);
      return localObject;
    }
    catch (JSONException localJSONException)
    {
      break label180;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.af
 * JD-Core Version:    0.6.2
 */