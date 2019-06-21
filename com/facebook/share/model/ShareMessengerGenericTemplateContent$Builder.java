package com.facebook.share.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class ShareMessengerGenericTemplateContent$Builder extends ShareContent.Builder<ShareMessengerGenericTemplateContent, Builder>
{
  private ShareMessengerGenericTemplateElement genericTemplateElement;
  private ShareMessengerGenericTemplateContent.ImageAspectRatio imageAspectRatio;
  private boolean isSharable;

  public ShareMessengerGenericTemplateContent build()
  {
    AppMethodBeat.i(97453);
    ShareMessengerGenericTemplateContent localShareMessengerGenericTemplateContent = new ShareMessengerGenericTemplateContent(this);
    AppMethodBeat.o(97453);
    return localShareMessengerGenericTemplateContent;
  }

  public Builder readFrom(ShareMessengerGenericTemplateContent paramShareMessengerGenericTemplateContent)
  {
    AppMethodBeat.i(97454);
    if (paramShareMessengerGenericTemplateContent == null)
    {
      AppMethodBeat.o(97454);
      paramShareMessengerGenericTemplateContent = this;
    }
    while (true)
    {
      return paramShareMessengerGenericTemplateContent;
      paramShareMessengerGenericTemplateContent = ((Builder)super.readFrom(paramShareMessengerGenericTemplateContent)).setIsSharable(paramShareMessengerGenericTemplateContent.getIsSharable()).setImageAspectRatio(paramShareMessengerGenericTemplateContent.getImageAspectRatio()).setGenericTemplateElement(paramShareMessengerGenericTemplateContent.getGenericTemplateElement());
      AppMethodBeat.o(97454);
    }
  }

  public Builder setGenericTemplateElement(ShareMessengerGenericTemplateElement paramShareMessengerGenericTemplateElement)
  {
    this.genericTemplateElement = paramShareMessengerGenericTemplateElement;
    return this;
  }

  public Builder setImageAspectRatio(ShareMessengerGenericTemplateContent.ImageAspectRatio paramImageAspectRatio)
  {
    this.imageAspectRatio = paramImageAspectRatio;
    return this;
  }

  public Builder setIsSharable(boolean paramBoolean)
  {
    this.isSharable = paramBoolean;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareMessengerGenericTemplateContent.Builder
 * JD-Core Version:    0.6.2
 */