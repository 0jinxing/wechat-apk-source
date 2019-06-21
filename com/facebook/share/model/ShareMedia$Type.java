package com.facebook.share.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum ShareMedia$Type
{
  static
  {
    AppMethodBeat.i(97433);
    PHOTO = new Type("PHOTO", 0);
    VIDEO = new Type("VIDEO", 1);
    $VALUES = new Type[] { PHOTO, VIDEO };
    AppMethodBeat.o(97433);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareMedia.Type
 * JD-Core Version:    0.6.2
 */