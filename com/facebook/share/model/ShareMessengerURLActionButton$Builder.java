package com.facebook.share.model;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ShareMessengerURLActionButton$Builder extends ShareMessengerActionButton.Builder<ShareMessengerURLActionButton, Builder>
{
  private Uri fallbackUrl;
  private boolean isMessengerExtensionURL;
  private boolean shouldHideWebviewShareButton;
  private Uri url;
  private ShareMessengerURLActionButton.WebviewHeightRatio webviewHeightRatio;

  public final ShareMessengerURLActionButton build()
  {
    AppMethodBeat.i(97508);
    ShareMessengerURLActionButton localShareMessengerURLActionButton = new ShareMessengerURLActionButton(this, null);
    AppMethodBeat.o(97508);
    return localShareMessengerURLActionButton;
  }

  public final Builder readFrom(ShareMessengerURLActionButton paramShareMessengerURLActionButton)
  {
    AppMethodBeat.i(97507);
    if (paramShareMessengerURLActionButton == null)
    {
      AppMethodBeat.o(97507);
      paramShareMessengerURLActionButton = this;
    }
    while (true)
    {
      return paramShareMessengerURLActionButton;
      paramShareMessengerURLActionButton = setUrl(paramShareMessengerURLActionButton.getUrl()).setIsMessengerExtensionURL(paramShareMessengerURLActionButton.getIsMessengerExtensionURL()).setFallbackUrl(paramShareMessengerURLActionButton.getFallbackUrl()).setWebviewHeightRatio(paramShareMessengerURLActionButton.getWebviewHeightRatio()).setShouldHideWebviewShareButton(paramShareMessengerURLActionButton.getShouldHideWebviewShareButton());
      AppMethodBeat.o(97507);
    }
  }

  public final Builder setFallbackUrl(Uri paramUri)
  {
    this.fallbackUrl = paramUri;
    return this;
  }

  public final Builder setIsMessengerExtensionURL(boolean paramBoolean)
  {
    this.isMessengerExtensionURL = paramBoolean;
    return this;
  }

  public final Builder setShouldHideWebviewShareButton(boolean paramBoolean)
  {
    this.shouldHideWebviewShareButton = paramBoolean;
    return this;
  }

  public final Builder setUrl(Uri paramUri)
  {
    this.url = paramUri;
    return this;
  }

  public final Builder setWebviewHeightRatio(ShareMessengerURLActionButton.WebviewHeightRatio paramWebviewHeightRatio)
  {
    this.webviewHeightRatio = paramWebviewHeightRatio;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareMessengerURLActionButton.Builder
 * JD-Core Version:    0.6.2
 */