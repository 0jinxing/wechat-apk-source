package com.facebook.share.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum AppGroupCreationContent$AppGroupPrivacy
{
  static
  {
    AppMethodBeat.i(97326);
    Open = new AppGroupPrivacy("Open", 0);
    Closed = new AppGroupPrivacy("Closed", 1);
    $VALUES = new AppGroupPrivacy[] { Open, Closed };
    AppMethodBeat.o(97326);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.AppGroupCreationContent.AppGroupPrivacy
 * JD-Core Version:    0.6.2
 */