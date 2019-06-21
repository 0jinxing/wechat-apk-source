package com.tencent.luggage.bridge;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import org.json.JSONObject;

final class c extends e
{
  c(int paramInt, String paramString, JSONObject paramJSONObject, boolean paramBoolean)
  {
    super(b.bOj);
    AppMethodBeat.i(90715);
    HashMap localHashMap = new HashMap();
    localHashMap.put("callbackId", Integer.valueOf(paramInt));
    if (!TextUtils.isEmpty(paramString))
      localHashMap.put("error", paramString);
    if (paramJSONObject != null)
      localHashMap.put("data", paramJSONObject);
    localHashMap.put("keepCallback", Boolean.valueOf(paramBoolean));
    c(localHashMap);
    AppMethodBeat.o(90715);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.c
 * JD-Core Version:    0.6.2
 */