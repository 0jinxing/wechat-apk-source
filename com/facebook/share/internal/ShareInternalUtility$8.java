package com.facebook.share.internal;

import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.share.model.SharePhoto;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

final class ShareInternalUtility$8
  implements OpenGraphJSONUtility.PhotoJSONProcessor
{
  public final JSONObject toJSONObject(SharePhoto paramSharePhoto)
  {
    AppMethodBeat.i(97271);
    paramSharePhoto = paramSharePhoto.getImageUrl();
    if (!Utility.isWebUri(paramSharePhoto))
    {
      paramSharePhoto = new FacebookException("Only web images may be used in OG objects shared via the web dialog");
      AppMethodBeat.o(97271);
      throw paramSharePhoto;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("url", paramSharePhoto.toString());
      AppMethodBeat.o(97271);
      return localJSONObject;
    }
    catch (JSONException paramSharePhoto)
    {
      paramSharePhoto = new FacebookException("Unable to attach images", paramSharePhoto);
      AppMethodBeat.o(97271);
    }
    throw paramSharePhoto;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.ShareInternalUtility.8
 * JD-Core Version:    0.6.2
 */