package com.facebook;

import com.facebook.internal.CallbackManagerImpl;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class CallbackManager$Factory
{
  public static CallbackManager create()
  {
    AppMethodBeat.i(71572);
    CallbackManagerImpl localCallbackManagerImpl = new CallbackManagerImpl();
    AppMethodBeat.o(71572);
    return localCallbackManagerImpl;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.CallbackManager.Factory
 * JD-Core Version:    0.6.2
 */