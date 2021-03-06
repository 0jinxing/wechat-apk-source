package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8ResultUndefined;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class Mirror
  implements Releasable
{
  private static final String IS_ARRAY = "isArray";
  private static final String IS_BOOLEAN = "isBoolean";
  private static final String IS_FUNCTION = "isFunction";
  private static final String IS_NULL = "isNull";
  private static final String IS_NUMBER = "isNumber";
  private static final String IS_OBJECT = "isObject";
  private static final String IS_STRING = "isString";
  private static final String IS_UNDEFINED = "isUndefined";
  private static final String IS_VALUE = "isValue";
  protected V8Object v8Object;

  Mirror(V8Object paramV8Object)
  {
    AppMethodBeat.i(74870);
    this.v8Object = paramV8Object.twin();
    AppMethodBeat.o(74870);
  }

  protected static ValueMirror createMirror(V8Object paramV8Object)
  {
    AppMethodBeat.i(74882);
    if (isNull(paramV8Object))
    {
      paramV8Object = new NullMirror(paramV8Object);
      AppMethodBeat.o(74882);
    }
    while (true)
    {
      return paramV8Object;
      if (isUndefined(paramV8Object))
      {
        paramV8Object = new UndefinedMirror(paramV8Object);
        AppMethodBeat.o(74882);
      }
      else if (isFunction(paramV8Object))
      {
        paramV8Object = new FunctionMirror(paramV8Object);
        AppMethodBeat.o(74882);
      }
      else if (isArray(paramV8Object))
      {
        paramV8Object = new ArrayMirror(paramV8Object);
        AppMethodBeat.o(74882);
      }
      else if (isObject(paramV8Object))
      {
        paramV8Object = new ObjectMirror(paramV8Object);
        AppMethodBeat.o(74882);
      }
      else if (isString(paramV8Object))
      {
        paramV8Object = new StringMirror(paramV8Object);
        AppMethodBeat.o(74882);
      }
      else if (isNumber(paramV8Object))
      {
        paramV8Object = new NumberMirror(paramV8Object);
        AppMethodBeat.o(74882);
      }
      else if (isBoolean(paramV8Object))
      {
        paramV8Object = new BooleanMirror(paramV8Object);
        AppMethodBeat.o(74882);
      }
      else
      {
        paramV8Object = new ValueMirror(paramV8Object);
        AppMethodBeat.o(74882);
      }
    }
  }

  private static boolean isArray(V8Object paramV8Object)
  {
    AppMethodBeat.i(74878);
    try
    {
      bool = paramV8Object.executeBooleanFunction("isArray", null);
      AppMethodBeat.o(74878);
      return bool;
    }
    catch (V8ResultUndefined paramV8Object)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(74878);
      }
    }
  }

  private static boolean isBoolean(V8Object paramV8Object)
  {
    AppMethodBeat.i(74876);
    try
    {
      bool = paramV8Object.executeBooleanFunction("isBoolean", null);
      AppMethodBeat.o(74876);
      return bool;
    }
    catch (V8ResultUndefined paramV8Object)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(74876);
      }
    }
  }

  private static boolean isFunction(V8Object paramV8Object)
  {
    AppMethodBeat.i(74877);
    try
    {
      bool = paramV8Object.executeBooleanFunction("isFunction", null);
      AppMethodBeat.o(74877);
      return bool;
    }
    catch (V8ResultUndefined paramV8Object)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(74877);
      }
    }
  }

  private static boolean isNull(V8Object paramV8Object)
  {
    AppMethodBeat.i(74881);
    try
    {
      bool = paramV8Object.executeBooleanFunction("isNull", null);
      AppMethodBeat.o(74881);
      return bool;
    }
    catch (V8ResultUndefined paramV8Object)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(74881);
      }
    }
  }

  private static boolean isNumber(V8Object paramV8Object)
  {
    AppMethodBeat.i(74875);
    try
    {
      bool = paramV8Object.executeBooleanFunction("isNumber", null);
      AppMethodBeat.o(74875);
      return bool;
    }
    catch (V8ResultUndefined paramV8Object)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(74875);
      }
    }
  }

  private static boolean isObject(V8Object paramV8Object)
  {
    AppMethodBeat.i(74874);
    try
    {
      bool = paramV8Object.executeBooleanFunction("isObject", null);
      AppMethodBeat.o(74874);
      return bool;
    }
    catch (V8ResultUndefined paramV8Object)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(74874);
      }
    }
  }

  private static boolean isString(V8Object paramV8Object)
  {
    AppMethodBeat.i(74879);
    try
    {
      bool = paramV8Object.executeBooleanFunction("isString", null);
      AppMethodBeat.o(74879);
      return bool;
    }
    catch (V8ResultUndefined paramV8Object)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(74879);
      }
    }
  }

  private static boolean isUndefined(V8Object paramV8Object)
  {
    AppMethodBeat.i(74880);
    try
    {
      bool = paramV8Object.executeBooleanFunction("isUndefined", null);
      AppMethodBeat.o(74880);
      return bool;
    }
    catch (V8ResultUndefined paramV8Object)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(74880);
      }
    }
  }

  protected static boolean isValue(V8Object paramV8Object)
  {
    AppMethodBeat.i(74873);
    try
    {
      bool = paramV8Object.executeBooleanFunction("isValue", null);
      AppMethodBeat.o(74873);
      return bool;
    }
    catch (V8ResultUndefined paramV8Object)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(74873);
      }
    }
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(74884);
    if (paramObject == null)
      AppMethodBeat.o(74884);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof Mirror))
      {
        AppMethodBeat.o(74884);
      }
      else
      {
        bool = this.v8Object.equals(((Mirror)paramObject).v8Object);
        AppMethodBeat.o(74884);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(74885);
    int i = this.v8Object.hashCode();
    AppMethodBeat.o(74885);
    return i;
  }

  public boolean isArray()
  {
    return false;
  }

  public boolean isBoolean()
  {
    return false;
  }

  public boolean isFrame()
  {
    return false;
  }

  public boolean isFunction()
  {
    return false;
  }

  public boolean isNull()
  {
    return false;
  }

  public boolean isNumber()
  {
    return false;
  }

  public boolean isObject()
  {
    return false;
  }

  public boolean isProperty()
  {
    return false;
  }

  public boolean isString()
  {
    return false;
  }

  public boolean isUndefined()
  {
    AppMethodBeat.i(74871);
    boolean bool = this.v8Object.executeBooleanFunction("isUndefined", null);
    AppMethodBeat.o(74871);
    return bool;
  }

  public boolean isValue()
  {
    return false;
  }

  public void release()
  {
    AppMethodBeat.i(74872);
    if ((this.v8Object != null) && (!this.v8Object.isReleased()))
    {
      this.v8Object.release();
      this.v8Object = null;
    }
    AppMethodBeat.o(74872);
  }

  public String toString()
  {
    AppMethodBeat.i(74883);
    String str = this.v8Object.toString();
    AppMethodBeat.o(74883);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.debug.mirror.Mirror
 * JD-Core Version:    0.6.2
 */