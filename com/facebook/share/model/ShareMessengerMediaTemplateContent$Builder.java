package com.facebook.share.model;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ShareMessengerMediaTemplateContent$Builder extends ShareContent.Builder<ShareMessengerMediaTemplateContent, Builder>
{
  private String attachmentId;
  private ShareMessengerActionButton button;
  private ShareMessengerMediaTemplateContent.MediaType mediaType;
  private Uri mediaUrl;

  public ShareMessengerMediaTemplateContent build()
  {
    AppMethodBeat.i(97481);
    ShareMessengerMediaTemplateContent localShareMessengerMediaTemplateContent = new ShareMessengerMediaTemplateContent(this, null);
    AppMethodBeat.o(97481);
    return localShareMessengerMediaTemplateContent;
  }

  public Builder readFrom(ShareMessengerMediaTemplateContent paramShareMessengerMediaTemplateContent)
  {
    AppMethodBeat.i(97480);
    if (paramShareMessengerMediaTemplateContent == null)
    {
      AppMethodBeat.o(97480);
      paramShareMessengerMediaTemplateContent = this;
    }
    while (true)
    {
      return paramShareMessengerMediaTemplateContent;
      paramShareMessengerMediaTemplateContent = ((Builder)super.readFrom(paramShareMessengerMediaTemplateContent)).setMediaType(paramShareMessengerMediaTemplateContent.getMediaType()).setAttachmentId(paramShareMessengerMediaTemplateContent.getAttachmentId()).setMediaUrl(paramShareMessengerMediaTemplateContent.getMediaUrl()).setButton(paramShareMessengerMediaTemplateContent.getButton());
      AppMethodBeat.o(97480);
    }
  }

  public Builder setAttachmentId(String paramString)
  {
    this.attachmentId = paramString;
    return this;
  }

  public Builder setButton(ShareMessengerActionButton paramShareMessengerActionButton)
  {
    this.button = paramShareMessengerActionButton;
    return this;
  }

  public Builder setMediaType(ShareMessengerMediaTemplateContent.MediaType paramMediaType)
  {
    this.mediaType = paramMediaType;
    return this;
  }

  public Builder setMediaUrl(Uri paramUri)
  {
    this.mediaUrl = paramUri;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareMessengerMediaTemplateContent.Builder
 * JD-Core Version:    0.6.2
 */