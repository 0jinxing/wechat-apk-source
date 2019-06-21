package com.facebook.share.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum ShareMessengerMediaTemplateContent$MediaType
{
  static
  {
    AppMethodBeat.i(97487);
    IMAGE = new MediaType("IMAGE", 0);
    VIDEO = new MediaType("VIDEO", 1);
    $VALUES = new MediaType[] { IMAGE, VIDEO };
    AppMethodBeat.o(97487);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType
 * JD-Core Version:    0.6.2
 */