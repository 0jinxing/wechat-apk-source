package com.facebook.share.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ShareVideoContent$Builder extends ShareContent.Builder<ShareVideoContent, Builder>
{
  private String contentDescription;
  private String contentTitle;
  private SharePhoto previewPhoto;
  private ShareVideo video;

  public final ShareVideoContent build()
  {
    AppMethodBeat.i(97615);
    ShareVideoContent localShareVideoContent = new ShareVideoContent(this, null);
    AppMethodBeat.o(97615);
    return localShareVideoContent;
  }

  public final Builder readFrom(ShareVideoContent paramShareVideoContent)
  {
    AppMethodBeat.i(97616);
    if (paramShareVideoContent == null)
    {
      AppMethodBeat.o(97616);
      paramShareVideoContent = this;
    }
    while (true)
    {
      return paramShareVideoContent;
      paramShareVideoContent = ((Builder)super.readFrom(paramShareVideoContent)).setContentDescription(paramShareVideoContent.getContentDescription()).setContentTitle(paramShareVideoContent.getContentTitle()).setPreviewPhoto(paramShareVideoContent.getPreviewPhoto()).setVideo(paramShareVideoContent.getVideo());
      AppMethodBeat.o(97616);
    }
  }

  public final Builder setContentDescription(String paramString)
  {
    this.contentDescription = paramString;
    return this;
  }

  public final Builder setContentTitle(String paramString)
  {
    this.contentTitle = paramString;
    return this;
  }

  public final Builder setPreviewPhoto(SharePhoto paramSharePhoto)
  {
    AppMethodBeat.i(97613);
    if (paramSharePhoto == null);
    for (paramSharePhoto = null; ; paramSharePhoto = new SharePhoto.Builder().readFrom(paramSharePhoto).build())
    {
      this.previewPhoto = paramSharePhoto;
      AppMethodBeat.o(97613);
      return this;
    }
  }

  public final Builder setVideo(ShareVideo paramShareVideo)
  {
    AppMethodBeat.i(97614);
    if (paramShareVideo == null)
      AppMethodBeat.o(97614);
    while (true)
    {
      return this;
      this.video = new ShareVideo.Builder().readFrom(paramShareVideo).build();
      AppMethodBeat.o(97614);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareVideoContent.Builder
 * JD-Core Version:    0.6.2
 */