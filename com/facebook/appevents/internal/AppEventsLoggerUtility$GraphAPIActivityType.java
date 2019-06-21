package com.facebook.appevents.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum AppEventsLoggerUtility$GraphAPIActivityType
{
  static
  {
    AppMethodBeat.i(72168);
    MOBILE_INSTALL_EVENT = new GraphAPIActivityType("MOBILE_INSTALL_EVENT", 0);
    CUSTOM_APP_EVENTS = new GraphAPIActivityType("CUSTOM_APP_EVENTS", 1);
    $VALUES = new GraphAPIActivityType[] { MOBILE_INSTALL_EVENT, CUSTOM_APP_EVENTS };
    AppMethodBeat.o(72168);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType
 * JD-Core Version:    0.6.2
 */