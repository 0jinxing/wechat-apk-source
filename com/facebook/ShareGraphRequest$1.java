package com.facebook;

import android.net.Uri;
import com.facebook.share.internal.OpenGraphJSONUtility.PhotoJSONProcessor;
import com.facebook.share.model.SharePhoto;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

final class ShareGraphRequest$1
  implements OpenGraphJSONUtility.PhotoJSONProcessor
{
  public final JSONObject toJSONObject(SharePhoto paramSharePhoto)
  {
    AppMethodBeat.i(96595);
    paramSharePhoto = paramSharePhoto.getImageUrl();
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("url", paramSharePhoto.toString());
      AppMethodBeat.o(96595);
      return localJSONObject;
    }
    catch (Exception paramSharePhoto)
    {
      paramSharePhoto = new FacebookException("Unable to attach images", paramSharePhoto);
      AppMethodBeat.o(96595);
    }
    throw paramSharePhoto;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.ShareGraphRequest.1
 * JD-Core Version:    0.6.2
 */