package com.facebook.appevents;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum AppEventsLogger$ProductCondition
{
  static
  {
    AppMethodBeat.i(71927);
    NEW = new ProductCondition("NEW", 0);
    REFURBISHED = new ProductCondition("REFURBISHED", 1);
    USED = new ProductCondition("USED", 2);
    $VALUES = new ProductCondition[] { NEW, REFURBISHED, USED };
    AppMethodBeat.o(71927);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEventsLogger.ProductCondition
 * JD-Core Version:    0.6.2
 */