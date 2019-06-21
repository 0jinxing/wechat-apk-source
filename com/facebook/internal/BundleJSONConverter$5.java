package com.facebook.internal;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class BundleJSONConverter$5
  implements BundleJSONConverter.Setter
{
  public final void setOnBundle(Bundle paramBundle, String paramString, Object paramObject)
  {
    AppMethodBeat.i(72258);
    paramBundle.putString(paramString, (String)paramObject);
    AppMethodBeat.o(72258);
  }

  public final void setOnJSON(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    AppMethodBeat.i(72259);
    paramJSONObject.put(paramString, paramObject);
    AppMethodBeat.o(72259);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.internal.BundleJSONConverter.5
 * JD-Core Version:    0.6.2
 */