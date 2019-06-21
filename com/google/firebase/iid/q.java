package com.google.firebase.iid;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

final class q
{
  private static final long bwd;
  final String bwe;
  private final String bwf;
  private final long timestamp;

  static
  {
    AppMethodBeat.i(108764);
    bwd = TimeUnit.DAYS.toMillis(7L);
    AppMethodBeat.o(108764);
  }

  private q(String paramString1, String paramString2, long paramLong)
  {
    this.bwe = paramString1;
    this.bwf = paramString2;
    this.timestamp = paramLong;
  }

  static String b(String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(108762);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("token", paramString1);
      localJSONObject.put("appVersion", paramString2);
      localJSONObject.put("timestamp", paramLong);
      paramString1 = localJSONObject.toString();
      AppMethodBeat.o(108762);
      return paramString1;
    }
    catch (JSONException paramString1)
    {
      while (true)
      {
        paramString1 = String.valueOf(paramString1);
        new StringBuilder(String.valueOf(paramString1).length() + 24).append("Failed to encode token: ").append(paramString1);
        paramString1 = null;
        AppMethodBeat.o(108762);
      }
    }
  }

  static q ba(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(108761);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(108761);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (paramString.startsWith("{"))
      {
        try
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>(paramString);
          paramString = new com/google/firebase/iid/q;
          paramString.<init>(localJSONObject.getString("token"), localJSONObject.getString("appVersion"), localJSONObject.getLong("timestamp"));
          AppMethodBeat.o(108761);
        }
        catch (JSONException paramString)
        {
          paramString = String.valueOf(paramString);
          new StringBuilder(String.valueOf(paramString).length() + 23).append("Failed to parse token: ").append(paramString);
          AppMethodBeat.o(108761);
          paramString = localObject;
        }
      }
      else
      {
        paramString = new q(paramString, null, 0L);
        AppMethodBeat.o(108761);
      }
    }
  }

  final boolean bb(String paramString)
  {
    AppMethodBeat.i(108763);
    boolean bool;
    if ((System.currentTimeMillis() > this.timestamp + bwd) || (!paramString.equals(this.bwf)))
    {
      bool = true;
      AppMethodBeat.o(108763);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(108763);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.q
 * JD-Core Version:    0.6.2
 */