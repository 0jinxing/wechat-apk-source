package com.facebook.share.internal;

import android.net.Uri;
import com.facebook.internal.Utility.Mapper;
import com.facebook.share.model.SharePhoto;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebDialogParameters$1
  implements Utility.Mapper<SharePhoto, String>
{
  public final String apply(SharePhoto paramSharePhoto)
  {
    AppMethodBeat.i(97311);
    paramSharePhoto = paramSharePhoto.getImageUrl().toString();
    AppMethodBeat.o(97311);
    return paramSharePhoto;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.WebDialogParameters.1
 * JD-Core Version:    0.6.2
 */