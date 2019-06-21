package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareMessengerMediaTemplateContent$1
  implements Parcelable.Creator<ShareMessengerMediaTemplateContent>
{
  public final ShareMessengerMediaTemplateContent createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(97477);
    paramParcel = new ShareMessengerMediaTemplateContent(paramParcel);
    AppMethodBeat.o(97477);
    return paramParcel;
  }

  public final ShareMessengerMediaTemplateContent[] newArray(int paramInt)
  {
    return new ShareMessengerMediaTemplateContent[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareMessengerMediaTemplateContent.1
 * JD-Core Version:    0.6.2
 */