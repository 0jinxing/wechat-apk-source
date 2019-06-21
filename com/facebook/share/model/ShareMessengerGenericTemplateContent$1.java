package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareMessengerGenericTemplateContent$1
  implements Parcelable.Creator<ShareMessengerGenericTemplateContent>
{
  public final ShareMessengerGenericTemplateContent createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(97450);
    paramParcel = new ShareMessengerGenericTemplateContent(paramParcel);
    AppMethodBeat.o(97450);
    return paramParcel;
  }

  public final ShareMessengerGenericTemplateContent[] newArray(int paramInt)
  {
    return new ShareMessengerGenericTemplateContent[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareMessengerGenericTemplateContent.1
 * JD-Core Version:    0.6.2
 */