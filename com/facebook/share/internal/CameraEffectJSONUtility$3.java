package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments.Builder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONArray;
import org.json.JSONObject;

final class CameraEffectJSONUtility$3
  implements CameraEffectJSONUtility.Setter
{
  public final void setOnArgumentsBuilder(CameraEffectArguments.Builder paramBuilder, String paramString, Object paramObject)
  {
    AppMethodBeat.i(96948);
    JSONArray localJSONArray = (JSONArray)paramObject;
    String[] arrayOfString = new String[localJSONArray.length()];
    int i = 0;
    while (i < localJSONArray.length())
    {
      paramObject = localJSONArray.get(i);
      if ((paramObject instanceof String))
      {
        arrayOfString[i] = ((String)paramObject);
        i++;
      }
      else
      {
        paramBuilder = new IllegalArgumentException("Unexpected type in an array: " + paramObject.getClass());
        AppMethodBeat.o(96948);
        throw paramBuilder;
      }
    }
    paramBuilder.putArgument(paramString, arrayOfString);
    AppMethodBeat.o(96948);
  }

  public final void setOnJSON(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    AppMethodBeat.i(96949);
    paramJSONObject = new IllegalArgumentException("JSONArray's are not supported in bundles.");
    AppMethodBeat.o(96949);
    throw paramJSONObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.CameraEffectJSONUtility.3
 * JD-Core Version:    0.6.2
 */