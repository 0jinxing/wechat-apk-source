package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ShareMessengerURLActionButton extends ShareMessengerActionButton
{
  public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR;
  private final Uri fallbackUrl;
  private final boolean isMessengerExtensionURL;
  private final boolean shouldHideWebviewShareButton;
  private final Uri url;
  private final ShareMessengerURLActionButton.WebviewHeightRatio webviewHeightRatio;

  static
  {
    AppMethodBeat.i(97517);
    CREATOR = new Parcelable.Creator()
    {
      public final ShareMessengerURLActionButton createFromParcel(Parcel paramAnonymousParcel)
      {
        AppMethodBeat.i(97504);
        paramAnonymousParcel = new ShareMessengerURLActionButton(paramAnonymousParcel);
        AppMethodBeat.o(97504);
        return paramAnonymousParcel;
      }

      public final ShareMessengerURLActionButton[] newArray(int paramAnonymousInt)
      {
        return new ShareMessengerURLActionButton[paramAnonymousInt];
      }
    };
    AppMethodBeat.o(97517);
  }

  ShareMessengerURLActionButton(Parcel paramParcel)
  {
    super(paramParcel);
    AppMethodBeat.i(97516);
    this.url = ((Uri)paramParcel.readParcelable(Uri.class.getClassLoader()));
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.isMessengerExtensionURL = bool2;
      this.fallbackUrl = ((Uri)paramParcel.readParcelable(Uri.class.getClassLoader()));
      this.webviewHeightRatio = ((ShareMessengerURLActionButton.WebviewHeightRatio)paramParcel.readSerializable());
      if (paramParcel.readByte() == 0)
        break label94;
    }
    label94: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.shouldHideWebviewShareButton = bool2;
      AppMethodBeat.o(97516);
      return;
      bool2 = false;
      break;
    }
  }

  private ShareMessengerURLActionButton(ShareMessengerURLActionButton.Builder paramBuilder)
  {
    super(paramBuilder);
    AppMethodBeat.i(97515);
    this.url = ShareMessengerURLActionButton.Builder.access$000(paramBuilder);
    this.isMessengerExtensionURL = ShareMessengerURLActionButton.Builder.access$100(paramBuilder);
    this.fallbackUrl = ShareMessengerURLActionButton.Builder.access$200(paramBuilder);
    this.webviewHeightRatio = ShareMessengerURLActionButton.Builder.access$300(paramBuilder);
    this.shouldHideWebviewShareButton = ShareMessengerURLActionButton.Builder.access$400(paramBuilder);
    AppMethodBeat.o(97515);
  }

  public final Uri getFallbackUrl()
  {
    return this.fallbackUrl;
  }

  public final boolean getIsMessengerExtensionURL()
  {
    return this.isMessengerExtensionURL;
  }

  public final boolean getShouldHideWebviewShareButton()
  {
    return this.shouldHideWebviewShareButton;
  }

  public final Uri getUrl()
  {
    return this.url;
  }

  public final ShareMessengerURLActionButton.WebviewHeightRatio getWebviewHeightRatio()
  {
    return this.webviewHeightRatio;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareMessengerURLActionButton
 * JD-Core Version:    0.6.2
 */