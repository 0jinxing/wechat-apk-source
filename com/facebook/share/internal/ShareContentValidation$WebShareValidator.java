package com.facebook.share.internal;

import com.facebook.FacebookException;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideoContent;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ShareContentValidation$WebShareValidator extends ShareContentValidation.Validator
{
  private ShareContentValidation$WebShareValidator()
  {
    super(null);
  }

  public void validate(ShareMediaContent paramShareMediaContent)
  {
    AppMethodBeat.i(97188);
    paramShareMediaContent = new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
    AppMethodBeat.o(97188);
    throw paramShareMediaContent;
  }

  public void validate(SharePhoto paramSharePhoto)
  {
    AppMethodBeat.i(97189);
    ShareContentValidation.access$500(paramSharePhoto, this);
    AppMethodBeat.o(97189);
  }

  public void validate(ShareVideoContent paramShareVideoContent)
  {
    AppMethodBeat.i(97187);
    paramShareVideoContent = new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
    AppMethodBeat.o(97187);
    throw paramShareVideoContent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.ShareContentValidation.WebShareValidator
 * JD-Core Version:    0.6.2
 */