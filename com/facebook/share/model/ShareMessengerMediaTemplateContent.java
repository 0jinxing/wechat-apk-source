package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ShareMessengerMediaTemplateContent extends ShareContent<ShareMessengerMediaTemplateContent, ShareMessengerMediaTemplateContent.Builder>
{
  public static final Parcelable.Creator<ShareMessengerMediaTemplateContent> CREATOR;
  private final String attachmentId;
  private final ShareMessengerActionButton button;
  private final ShareMessengerMediaTemplateContent.MediaType mediaType;
  private final Uri mediaUrl;

  static
  {
    AppMethodBeat.i(97491);
    CREATOR = new ShareMessengerMediaTemplateContent.1();
    AppMethodBeat.o(97491);
  }

  ShareMessengerMediaTemplateContent(Parcel paramParcel)
  {
    super(paramParcel);
    AppMethodBeat.i(97489);
    this.mediaType = ((ShareMessengerMediaTemplateContent.MediaType)paramParcel.readSerializable());
    this.attachmentId = paramParcel.readString();
    this.mediaUrl = ((Uri)paramParcel.readParcelable(Uri.class.getClassLoader()));
    this.button = ((ShareMessengerActionButton)paramParcel.readParcelable(ShareMessengerActionButton.class.getClassLoader()));
    AppMethodBeat.o(97489);
  }

  private ShareMessengerMediaTemplateContent(ShareMessengerMediaTemplateContent.Builder paramBuilder)
  {
    super(paramBuilder);
    AppMethodBeat.i(97488);
    this.mediaType = ShareMessengerMediaTemplateContent.Builder.access$000(paramBuilder);
    this.attachmentId = ShareMessengerMediaTemplateContent.Builder.access$100(paramBuilder);
    this.mediaUrl = ShareMessengerMediaTemplateContent.Builder.access$200(paramBuilder);
    this.button = ShareMessengerMediaTemplateContent.Builder.access$300(paramBuilder);
    AppMethodBeat.o(97488);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String getAttachmentId()
  {
    return this.attachmentId;
  }

  public final ShareMessengerActionButton getButton()
  {
    return this.button;
  }

  public final ShareMessengerMediaTemplateContent.MediaType getMediaType()
  {
    return this.mediaType;
  }

  public final Uri getMediaUrl()
  {
    return this.mediaUrl;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(97490);
    paramParcel.writeSerializable(this.mediaType);
    paramParcel.writeString(this.attachmentId);
    paramParcel.writeParcelable(this.mediaUrl, paramInt);
    paramParcel.writeParcelable(this.button, paramInt);
    AppMethodBeat.o(97490);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareMessengerMediaTemplateContent
 * JD-Core Version:    0.6.2
 */