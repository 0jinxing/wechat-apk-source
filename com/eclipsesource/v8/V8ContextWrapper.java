package com.eclipsesource.v8;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class V8ContextWrapper
  implements InvocationHandler
{
  private static final String TAG = "V8ContextWrapper";
  private final MultiContextV8 multiContextV8;
  private final V8Context proxy;
  private final V8ContextWrapper.V8ContextImpl v8ContextImpl;
  private final long v8ContextPtr;

  V8ContextWrapper(MultiContextV8 paramMultiContextV8, long paramLong)
  {
    AppMethodBeat.i(75487);
    this.multiContextV8 = paramMultiContextV8;
    this.v8ContextPtr = paramLong;
    enterContext();
    this.v8ContextImpl = new V8ContextWrapper.V8ContextImpl(this, paramLong);
    this.proxy = ((V8Context)Proxy.newProxyInstance(V8ContextWrapper.class.getClassLoader(), new Class[] { V8Context.class }, this));
    AppMethodBeat.o(75487);
  }

  private void enterContext()
  {
    AppMethodBeat.i(75488);
    this.multiContextV8.enterContext(this);
    AppMethodBeat.o(75488);
  }

  public V8Context context()
  {
    return this.proxy;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(75489);
    if (this == paramObject)
      AppMethodBeat.o(75489);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(75489);
        bool = false;
      }
      else
      {
        paramObject = (V8ContextWrapper)paramObject;
        if (this.v8ContextPtr == paramObject.v8ContextPtr)
        {
          AppMethodBeat.o(75489);
        }
        else
        {
          AppMethodBeat.o(75489);
          bool = false;
        }
      }
    }
  }

  protected long getPtr()
  {
    return this.v8ContextPtr;
  }

  public int hashCode()
  {
    return (int)(this.v8ContextPtr ^ this.v8ContextPtr >>> 32);
  }

  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(75490);
    if (!paramMethod.getName().equals("isReleased"))
    {
      this.v8ContextImpl.checkReleased();
      enterContext();
    }
    try
    {
      paramObject = paramMethod.invoke(this.v8ContextImpl, paramArrayOfObject);
      AppMethodBeat.o(75490);
      return paramObject;
    }
    catch (InvocationTargetException paramObject)
    {
      paramObject = paramObject.getCause();
      AppMethodBeat.o(75490);
    }
    throw paramObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.V8ContextWrapper
 * JD-Core Version:    0.6.2
 */