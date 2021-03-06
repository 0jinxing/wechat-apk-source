package com.facebook.share.model;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ShareLinkContent$Builder extends ShareContent.Builder<ShareLinkContent, Builder>
{
  static final String TAG;

  @Deprecated
  private String contentDescription;

  @Deprecated
  private String contentTitle;

  @Deprecated
  private Uri imageUrl;
  private String quote;

  static
  {
    AppMethodBeat.i(97426);
    TAG = Builder.class.getSimpleName();
    AppMethodBeat.o(97426);
  }

  public final ShareLinkContent build()
  {
    AppMethodBeat.i(97421);
    ShareLinkContent localShareLinkContent = new ShareLinkContent(this, null);
    AppMethodBeat.o(97421);
    return localShareLinkContent;
  }

  public final Builder readFrom(ShareLinkContent paramShareLinkContent)
  {
    AppMethodBeat.i(97422);
    if (paramShareLinkContent == null)
    {
      AppMethodBeat.o(97422);
      paramShareLinkContent = this;
    }
    while (true)
    {
      return paramShareLinkContent;
      paramShareLinkContent = ((Builder)super.readFrom(paramShareLinkContent)).setContentDescription(paramShareLinkContent.getContentDescription()).setImageUrl(paramShareLinkContent.getImageUrl()).setContentTitle(paramShareLinkContent.getContentTitle()).setQuote(paramShareLinkContent.getQuote());
      AppMethodBeat.o(97422);
    }
  }

  @Deprecated
  public final Builder setContentDescription(String paramString)
  {
    return this;
  }

  @Deprecated
  public final Builder setContentTitle(String paramString)
  {
    return this;
  }

  @Deprecated
  public final Builder setImageUrl(Uri paramUri)
  {
    return this;
  }

  public final Builder setQuote(String paramString)
  {
    this.quote = paramString;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareLinkContent.Builder
 * JD-Core Version:    0.6.2
 */