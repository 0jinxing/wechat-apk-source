package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareMessengerGenericTemplateElement$1
  implements Parcelable.Creator<ShareMessengerGenericTemplateElement>
{
  public final ShareMessengerGenericTemplateElement createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(97465);
    paramParcel = new ShareMessengerGenericTemplateElement(paramParcel);
    AppMethodBeat.o(97465);
    return paramParcel;
  }

  public final ShareMessengerGenericTemplateElement[] newArray(int paramInt)
  {
    return new ShareMessengerGenericTemplateElement[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareMessengerGenericTemplateElement.1
 * JD-Core Version:    0.6.2
 */