package com.facebook.internal;

import android.content.Intent;
import com.facebook.CallbackManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class CallbackManagerImpl
  implements CallbackManager
{
  private static final String INAPP_PURCHASE_DATA = "INAPP_PURCHASE_DATA";
  private static final String TAG;
  private static Map<Integer, CallbackManagerImpl.Callback> staticCallbacks;
  private Map<Integer, CallbackManagerImpl.Callback> callbacks;

  static
  {
    AppMethodBeat.i(72278);
    TAG = CallbackManagerImpl.class.getSimpleName();
    staticCallbacks = new HashMap();
    AppMethodBeat.o(72278);
  }

  public CallbackManagerImpl()
  {
    AppMethodBeat.i(72271);
    this.callbacks = new HashMap();
    AppMethodBeat.o(72271);
  }

  private static CallbackManagerImpl.Callback getStaticCallback(Integer paramInteger)
  {
    try
    {
      AppMethodBeat.i(72273);
      paramInteger = (CallbackManagerImpl.Callback)staticCallbacks.get(paramInteger);
      AppMethodBeat.o(72273);
      return paramInteger;
    }
    finally
    {
      paramInteger = finally;
    }
    throw paramInteger;
  }

  public static void registerStaticCallback(int paramInt, CallbackManagerImpl.Callback paramCallback)
  {
    try
    {
      AppMethodBeat.i(72272);
      Validate.notNull(paramCallback, "callback");
      if (staticCallbacks.containsKey(Integer.valueOf(paramInt)))
        AppMethodBeat.o(72272);
      while (true)
      {
        return;
        staticCallbacks.put(Integer.valueOf(paramInt), paramCallback);
        AppMethodBeat.o(72272);
      }
    }
    finally
    {
    }
    throw paramCallback;
  }

  private static boolean runStaticCallback(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(72274);
    CallbackManagerImpl.Callback localCallback = getStaticCallback(Integer.valueOf(paramInt1));
    boolean bool;
    if (localCallback != null)
    {
      bool = localCallback.onActivityResult(paramInt2, paramIntent);
      AppMethodBeat.o(72274);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72274);
    }
  }

  public final boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(72277);
    CallbackManagerImpl.Callback localCallback = (CallbackManagerImpl.Callback)this.callbacks.get(Integer.valueOf(paramInt1));
    boolean bool;
    if (localCallback != null)
    {
      bool = localCallback.onActivityResult(paramInt2, paramIntent);
      AppMethodBeat.o(72277);
    }
    while (true)
    {
      return bool;
      bool = runStaticCallback(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(72277);
    }
  }

  public final void registerCallback(int paramInt, CallbackManagerImpl.Callback paramCallback)
  {
    AppMethodBeat.i(72275);
    Validate.notNull(paramCallback, "callback");
    this.callbacks.put(Integer.valueOf(paramInt), paramCallback);
    AppMethodBeat.o(72275);
  }

  public final void unregisterCallback(int paramInt)
  {
    AppMethodBeat.i(72276);
    this.callbacks.remove(Integer.valueOf(paramInt));
    AppMethodBeat.o(72276);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.internal.CallbackManagerImpl
 * JD-Core Version:    0.6.2
 */