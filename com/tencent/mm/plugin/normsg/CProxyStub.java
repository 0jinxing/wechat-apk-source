package com.tencent.mm.plugin.normsg;

import android.support.annotation.Keep;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Keep
public class CProxyStub
  implements InvocationHandler
{

  @Keep
  private final long mNativePtr;

  private CProxyStub(long paramLong)
  {
    AppMethodBeat.i(10251);
    try
    {
      this.mNativePtr = paramLong;
      return;
    }
    finally
    {
      AppMethodBeat.o(10251);
    }
  }

  private native void nativeFinalize();

  protected void finalize()
  {
    AppMethodBeat.i(10252);
    try
    {
      try
      {
        nativeFinalize();
        return;
      }
      finally
      {
        AppMethodBeat.o(10252);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        super.finalize();
        AppMethodBeat.o(10252);
      }
    }
    finally
    {
      super.finalize();
      AppMethodBeat.o(10252);
    }
  }

  public native Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.CProxyStub
 * JD-Core Version:    0.6.2
 */