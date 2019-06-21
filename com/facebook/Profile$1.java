package com.facebook;

import android.net.Uri;
import com.facebook.internal.Utility.GraphMeRequestWithCacheCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class Profile$1
  implements Utility.GraphMeRequestWithCacheCallback
{
  public final void onFailure(FacebookException paramFacebookException)
  {
    AppMethodBeat.i(71805);
    Profile.access$000();
    new StringBuilder("Got unexpected exception: ").append(paramFacebookException);
    AppMethodBeat.o(71805);
  }

  public final void onSuccess(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(71804);
    String str1 = paramJSONObject.optString("id");
    if (str1 == null)
    {
      AppMethodBeat.o(71804);
      return;
    }
    String str2 = paramJSONObject.optString("link");
    String str3 = paramJSONObject.optString("first_name");
    String str4 = paramJSONObject.optString("middle_name");
    String str5 = paramJSONObject.optString("last_name");
    String str6 = paramJSONObject.optString("name");
    if (str2 != null);
    for (paramJSONObject = Uri.parse(str2); ; paramJSONObject = null)
    {
      Profile.setCurrentProfile(new Profile(str1, str3, str4, str5, str6, paramJSONObject));
      AppMethodBeat.o(71804);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.Profile.1
 * JD-Core Version:    0.6.2
 */