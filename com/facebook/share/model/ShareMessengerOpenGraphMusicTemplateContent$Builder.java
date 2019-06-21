package com.facebook.share.model;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ShareMessengerOpenGraphMusicTemplateContent$Builder extends ShareContent.Builder<ShareMessengerOpenGraphMusicTemplateContent, Builder>
{
  private ShareMessengerActionButton button;
  private Uri url;

  public ShareMessengerOpenGraphMusicTemplateContent build()
  {
    AppMethodBeat.i(97496);
    ShareMessengerOpenGraphMusicTemplateContent localShareMessengerOpenGraphMusicTemplateContent = new ShareMessengerOpenGraphMusicTemplateContent(this, null);
    AppMethodBeat.o(97496);
    return localShareMessengerOpenGraphMusicTemplateContent;
  }

  public Builder readFrom(ShareMessengerOpenGraphMusicTemplateContent paramShareMessengerOpenGraphMusicTemplateContent)
  {
    AppMethodBeat.i(97495);
    if (paramShareMessengerOpenGraphMusicTemplateContent == null)
    {
      AppMethodBeat.o(97495);
      paramShareMessengerOpenGraphMusicTemplateContent = this;
    }
    while (true)
    {
      return paramShareMessengerOpenGraphMusicTemplateContent;
      paramShareMessengerOpenGraphMusicTemplateContent = ((Builder)super.readFrom(paramShareMessengerOpenGraphMusicTemplateContent)).setUrl(paramShareMessengerOpenGraphMusicTemplateContent.getUrl()).setButton(paramShareMessengerOpenGraphMusicTemplateContent.getButton());
      AppMethodBeat.o(97495);
    }
  }

  public Builder setButton(ShareMessengerActionButton paramShareMessengerActionButton)
  {
    this.button = paramShareMessengerActionButton;
    return this;
  }

  public Builder setUrl(Uri paramUri)
  {
    this.url = paramUri;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent.Builder
 * JD-Core Version:    0.6.2
 */