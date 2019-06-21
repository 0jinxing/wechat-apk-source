package com.facebook;

import android.os.Bundle;
import com.facebook.share.internal.OpenGraphJSONUtility;
import com.facebook.share.internal.OpenGraphJSONUtility.PhotoJSONProcessor;
import com.facebook.share.model.ShareOpenGraphObject;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class ShareGraphRequest
{
  public static GraphRequest createOpenGraphObject(ShareOpenGraphObject paramShareOpenGraphObject)
  {
    AppMethodBeat.i(96596);
    String str = paramShareOpenGraphObject.getString("type");
    if (str == null)
      str = paramShareOpenGraphObject.getString("og:type");
    while (true)
    {
      if (str == null)
      {
        paramShareOpenGraphObject = new FacebookException("Open graph object type cannot be null");
        AppMethodBeat.o(96596);
        throw paramShareOpenGraphObject;
      }
      try
      {
        Object localObject = new com/facebook/ShareGraphRequest$1;
        ((ShareGraphRequest.1)localObject).<init>();
        localObject = (JSONObject)OpenGraphJSONUtility.toJSONValue(paramShareOpenGraphObject, (OpenGraphJSONUtility.PhotoJSONProcessor)localObject);
        paramShareOpenGraphObject = new android/os/Bundle;
        paramShareOpenGraphObject.<init>();
        paramShareOpenGraphObject.putString("object", ((JSONObject)localObject).toString());
        str = String.format(Locale.ROOT, "%s/%s", new Object[] { "me", "objects/".concat(String.valueOf(str)) });
        paramShareOpenGraphObject = new GraphRequest(AccessToken.getCurrentAccessToken(), str, paramShareOpenGraphObject, HttpMethod.POST);
        AppMethodBeat.o(96596);
        return paramShareOpenGraphObject;
      }
      catch (JSONException paramShareOpenGraphObject)
      {
        paramShareOpenGraphObject = new FacebookException(paramShareOpenGraphObject.getMessage());
        AppMethodBeat.o(96596);
        throw paramShareOpenGraphObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.ShareGraphRequest
 * JD-Core Version:    0.6.2
 */