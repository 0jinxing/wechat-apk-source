package com.facebook.appevents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

class AppEvent$SerializationProxyV1
  implements Serializable
{
  private static final long serialVersionUID = -2488473066578201069L;
  private final boolean isImplicit;
  private final String jsonString;

  private AppEvent$SerializationProxyV1(String paramString, boolean paramBoolean)
  {
    this.jsonString = paramString;
    this.isImplicit = paramBoolean;
  }

  private Object readResolve()
  {
    AppMethodBeat.i(71865);
    AppEvent localAppEvent = new AppEvent(this.jsonString, this.isImplicit, null, null);
    AppMethodBeat.o(71865);
    return localAppEvent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEvent.SerializationProxyV1
 * JD-Core Version:    0.6.2
 */