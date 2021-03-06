package com.facebook.share.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class ShareStoryContent$Builder extends ShareContent.Builder<ShareStoryContent, Builder>
{
  static final String TAG;
  private String mAttributionLink;
  private ShareMedia mBackgroundAsset;
  private List<String> mBackgroundColorList;
  private SharePhoto mStickerAsset;

  static
  {
    AppMethodBeat.i(97590);
    TAG = Builder.class.getSimpleName();
    AppMethodBeat.o(97590);
  }

  public final ShareStoryContent build()
  {
    AppMethodBeat.i(97585);
    ShareStoryContent localShareStoryContent = new ShareStoryContent(this, null);
    AppMethodBeat.o(97585);
    return localShareStoryContent;
  }

  public final Builder readFrom(ShareStoryContent paramShareStoryContent)
  {
    AppMethodBeat.i(97586);
    if (paramShareStoryContent == null)
    {
      AppMethodBeat.o(97586);
      paramShareStoryContent = this;
    }
    while (true)
    {
      return paramShareStoryContent;
      paramShareStoryContent = ((Builder)super.readFrom(paramShareStoryContent)).setBackgroundAsset(paramShareStoryContent.getBackgroundAsset()).setStickerAsset(paramShareStoryContent.getStickerAsset()).setBackgroundColorList(paramShareStoryContent.getBackgroundColorList()).setAttributionLink(paramShareStoryContent.getAttributionLink());
      AppMethodBeat.o(97586);
    }
  }

  public final Builder setAttributionLink(String paramString)
  {
    this.mAttributionLink = paramString;
    return this;
  }

  public final Builder setBackgroundAsset(ShareMedia paramShareMedia)
  {
    this.mBackgroundAsset = paramShareMedia;
    return this;
  }

  public final Builder setBackgroundColorList(List<String> paramList)
  {
    this.mBackgroundColorList = paramList;
    return this;
  }

  public final Builder setStickerAsset(SharePhoto paramSharePhoto)
  {
    this.mStickerAsset = paramSharePhoto;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareStoryContent.Builder
 * JD-Core Version:    0.6.2
 */