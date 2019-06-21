package com.facebook.internal;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

final class BundleJSONConverter$7
  implements BundleJSONConverter.Setter
{
  public final void setOnBundle(Bundle paramBundle, String paramString, Object paramObject)
  {
    AppMethodBeat.i(72262);
    JSONArray localJSONArray = (JSONArray)paramObject;
    paramObject = new ArrayList();
    if (localJSONArray.length() == 0)
    {
      paramBundle.putStringArrayList(paramString, paramObject);
      AppMethodBeat.o(72262);
    }
    while (true)
    {
      return;
      int i = 0;
      while (i < localJSONArray.length())
      {
        Object localObject = localJSONArray.get(i);
        if ((localObject instanceof String))
        {
          paramObject.add((String)localObject);
          i++;
        }
        else
        {
          paramBundle = new IllegalArgumentException("Unexpected type in an array: " + localObject.getClass());
          AppMethodBeat.o(72262);
          throw paramBundle;
        }
      }
      paramBundle.putStringArrayList(paramString, paramObject);
      AppMethodBeat.o(72262);
    }
  }

  public final void setOnJSON(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    AppMethodBeat.i(72263);
    paramJSONObject = new IllegalArgumentException("JSONArray's are not supported in bundles.");
    AppMethodBeat.o(72263);
    throw paramJSONObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.BundleJSONConverter.7
 * JD-Core Version:    0.6.2
 */