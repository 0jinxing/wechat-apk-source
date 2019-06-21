package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class XWalkViewDatabase
{
  private static ReflectMethod clearFormDataMethod;
  private static XWalkCoreWrapper coreWrapper;
  private static ReflectMethod hasFormDataMethod;

  static
  {
    AppMethodBeat.i(86048);
    hasFormDataMethod = new ReflectMethod(null, "hasFormData", new Class[0]);
    clearFormDataMethod = new ReflectMethod(null, "clearFormData", new Class[0]);
    AppMethodBeat.o(86048);
  }

  public static void clearFormData()
  {
    AppMethodBeat.i(86046);
    reflectionInit();
    try
    {
      clearFormDataMethod.invoke(new Object[0]);
      AppMethodBeat.o(86046);
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
        if (coreWrapper == null)
        {
          clearFormDataMethod.setArguments(new Object[0]);
          XWalkCoreWrapper.reserveReflectMethod(clearFormDataMethod);
          AppMethodBeat.o(86046);
        }
        else
        {
          XWalkCoreWrapper.handleRuntimeError(localUnsupportedOperationException);
          AppMethodBeat.o(86046);
        }
    }
  }

  public static boolean hasFormData()
  {
    AppMethodBeat.i(86045);
    reflectionInit();
    try
    {
      bool = ((Boolean)hasFormDataMethod.invoke(new Object[0])).booleanValue();
      AppMethodBeat.o(86045);
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      while (true)
      {
        RuntimeException localRuntimeException;
        if (coreWrapper == null)
        {
          localRuntimeException = new RuntimeException("Crosswalk's APIs are not ready yet");
          AppMethodBeat.o(86045);
          throw localRuntimeException;
        }
        XWalkCoreWrapper.handleRuntimeError(localRuntimeException);
        AppMethodBeat.o(86045);
        boolean bool = false;
      }
    }
  }

  static void reflectionInit()
  {
    AppMethodBeat.i(86047);
    if (coreWrapper != null)
      AppMethodBeat.o(86047);
    while (true)
    {
      return;
      XWalkCoreWrapper.initEmbeddedMode();
      Object localObject = XWalkCoreWrapper.getInstance();
      coreWrapper = (XWalkCoreWrapper)localObject;
      if (localObject == null)
      {
        XWalkCoreWrapper.reserveReflectClass(XWalkViewDatabase.class);
        AppMethodBeat.o(86047);
      }
      else
      {
        localObject = coreWrapper.getBridgeClass("XWalkViewDatabaseBridge");
        hasFormDataMethod.init(null, (Class)localObject, "hasFormData", new Class[0]);
        clearFormDataMethod.init(null, (Class)localObject, "clearFormData", new Class[0]);
        AppMethodBeat.o(86047);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkViewDatabase
 * JD-Core Version:    0.6.2
 */