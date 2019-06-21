package com.facebook.share.internal;

import com.facebook.share.model.ShareStoryContent;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ShareContentValidation$StoryShareValidator extends ShareContentValidation.Validator
{
  private ShareContentValidation$StoryShareValidator()
  {
    super(null);
  }

  public void validate(ShareStoryContent paramShareStoryContent)
  {
    AppMethodBeat.i(97170);
    ShareContentValidation.access$400(paramShareStoryContent, this);
    AppMethodBeat.o(97170);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.ShareContentValidation.StoryShareValidator
 * JD-Core Version:    0.6.2
 */