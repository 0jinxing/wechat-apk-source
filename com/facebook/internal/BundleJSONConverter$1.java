package com.facebook.internal;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class BundleJSONConverter$1
  implements BundleJSONConverter.Setter
{
  public final void setOnBundle(Bundle paramBundle, String paramString, Object paramObject)
  {
    AppMethodBeat.i(72250);
    paramBundle.putBoolean(paramString, ((Boolean)paramObject).booleanValue());
    AppMethodBeat.o(72250);
  }

  public final void setOnJSON(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    AppMethodBeat.i(72251);
    paramJSONObject.put(paramString, paramObject);
    AppMethodBeat.o(72251);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.internal.BundleJSONConverter.1
 * JD-Core Version:    0.6.2
 */