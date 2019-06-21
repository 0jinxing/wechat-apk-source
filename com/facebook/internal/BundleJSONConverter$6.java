package com.facebook.internal;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONArray;
import org.json.JSONObject;

final class BundleJSONConverter$6
  implements BundleJSONConverter.Setter
{
  public final void setOnBundle(Bundle paramBundle, String paramString, Object paramObject)
  {
    AppMethodBeat.i(72260);
    paramBundle = new IllegalArgumentException("Unexpected type from JSON");
    AppMethodBeat.o(72260);
    throw paramBundle;
  }

  public final void setOnJSON(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    AppMethodBeat.i(72261);
    JSONArray localJSONArray = new JSONArray();
    paramObject = (String[])paramObject;
    int i = paramObject.length;
    for (int j = 0; j < i; j++)
      localJSONArray.put(paramObject[j]);
    paramJSONObject.put(paramString, localJSONArray);
    AppMethodBeat.o(72261);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.BundleJSONConverter.6
 * JD-Core Version:    0.6.2
 */