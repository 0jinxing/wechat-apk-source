package com.facebook.share.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum GameRequestContent$Filters
{
  static
  {
    AppMethodBeat.i(97388);
    APP_USERS = new Filters("APP_USERS", 0);
    APP_NON_USERS = new Filters("APP_NON_USERS", 1);
    $VALUES = new Filters[] { APP_USERS, APP_NON_USERS };
    AppMethodBeat.o(97388);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.GameRequestContent.Filters
 * JD-Core Version:    0.6.2
 */