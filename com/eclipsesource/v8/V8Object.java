package com.eclipsesource.v8;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

public class V8Object extends V8Value
{
  protected V8Object()
  {
  }

  public V8Object(V8 paramV8)
  {
    this(paramV8, null);
  }

  protected V8Object(V8 paramV8, Object paramObject)
  {
    super(paramV8);
    AppMethodBeat.i(75541);
    if (paramV8 != null)
    {
      this.v8.checkThread();
      initialize(this.v8.getV8RuntimePtr(), paramObject);
    }
    AppMethodBeat.o(75541);
  }

  private void checkKey(String paramString)
  {
    AppMethodBeat.i(75577);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("Key cannot be null");
      AppMethodBeat.o(75577);
      throw paramString;
    }
    AppMethodBeat.o(75577);
  }

  public V8Object add(String paramString, double paramDouble)
  {
    AppMethodBeat.i(75566);
    this.v8.checkThread();
    checkReleased();
    this.v8.add(this.v8.getV8RuntimePtr(), this.objectHandle, paramString, paramDouble);
    AppMethodBeat.o(75566);
    return this;
  }

  public V8Object add(String paramString, int paramInt)
  {
    AppMethodBeat.i(75564);
    this.v8.checkThread();
    checkReleased();
    this.v8.add(this.v8.getV8RuntimePtr(), this.objectHandle, paramString, paramInt);
    AppMethodBeat.o(75564);
    return this;
  }

  public V8Object add(String paramString, V8Value paramV8Value)
  {
    AppMethodBeat.i(75568);
    this.v8.checkThread();
    checkReleased();
    this.v8.checkRuntime(paramV8Value);
    if (paramV8Value == null)
      this.v8.addNull(this.v8.getV8RuntimePtr(), this.objectHandle, paramString);
    while (true)
    {
      AppMethodBeat.o(75568);
      return this;
      if (paramV8Value.equals(V8.getUndefined()))
        this.v8.addUndefined(this.v8.getV8RuntimePtr(), this.objectHandle, paramString);
      else
        this.v8.addObject(this.v8.getV8RuntimePtr(), this.objectHandle, paramString, paramV8Value.getHandle());
    }
  }

  public V8Object add(String paramString1, String paramString2)
  {
    AppMethodBeat.i(75567);
    this.v8.checkThread();
    checkReleased();
    if (paramString2 == null)
      this.v8.addNull(this.v8.getV8RuntimePtr(), this.objectHandle, paramString1);
    while (true)
    {
      AppMethodBeat.o(75567);
      return this;
      if (paramString2.equals(V8.getUndefined()))
        this.v8.addUndefined(this.v8.getV8RuntimePtr(), this.objectHandle, paramString1);
      else
        this.v8.add(this.v8.getV8RuntimePtr(), this.objectHandle, paramString1, paramString2);
    }
  }

  public V8Object add(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(75565);
    this.v8.checkThread();
    checkReleased();
    this.v8.add(this.v8.getV8RuntimePtr(), this.objectHandle, paramString, paramBoolean);
    AppMethodBeat.o(75565);
    return this;
  }

  public V8Object addNull(String paramString)
  {
    AppMethodBeat.i(75570);
    this.v8.checkThread();
    checkReleased();
    this.v8.addNull(this.v8.getV8RuntimePtr(), this.objectHandle, paramString);
    AppMethodBeat.o(75570);
    return this;
  }

  public V8Object addUndefined(String paramString)
  {
    AppMethodBeat.i(75569);
    this.v8.checkThread();
    checkReleased();
    this.v8.addUndefined(this.v8.getV8RuntimePtr(), this.objectHandle, paramString);
    AppMethodBeat.o(75569);
    return this;
  }

  public boolean contains(String paramString)
  {
    AppMethodBeat.i(75544);
    this.v8.checkThread();
    checkReleased();
    checkKey(paramString);
    boolean bool = this.v8.contains(this.v8.getV8RuntimePtr(), this.objectHandle, paramString);
    AppMethodBeat.o(75544);
    return bool;
  }

  protected V8Value createTwin()
  {
    AppMethodBeat.i(75542);
    V8Object localV8Object = new V8Object(this.v8);
    AppMethodBeat.o(75542);
    return localV8Object;
  }

  public V8Array executeArrayFunction(String paramString, V8Array paramV8Array)
  {
    AppMethodBeat.i(75558);
    this.v8.checkThread();
    checkReleased();
    this.v8.checkRuntime(paramV8Array);
    if (paramV8Array == null);
    for (long l = 0L; ; l = paramV8Array.getHandle())
    {
      paramString = this.v8.executeFunction(this.v8.getV8RuntimePtr(), 5, this.objectHandle, paramString, l);
      if (!(paramString instanceof V8Array))
        break;
      paramString = (V8Array)paramString;
      AppMethodBeat.o(75558);
      return paramString;
    }
    paramString = new V8ResultUndefined();
    AppMethodBeat.o(75558);
    throw paramString;
  }

  public boolean executeBooleanFunction(String paramString, V8Array paramV8Array)
  {
    AppMethodBeat.i(75557);
    this.v8.checkThread();
    checkReleased();
    this.v8.checkRuntime(paramV8Array);
    if (paramV8Array == null);
    for (long l = 0L; ; l = paramV8Array.getHandle())
    {
      boolean bool = this.v8.executeBooleanFunction(this.v8.getV8RuntimePtr(), getHandle(), paramString, l);
      AppMethodBeat.o(75557);
      return bool;
    }
  }

  public double executeDoubleFunction(String paramString, V8Array paramV8Array)
  {
    AppMethodBeat.i(75555);
    this.v8.checkThread();
    checkReleased();
    this.v8.checkRuntime(paramV8Array);
    if (paramV8Array == null);
    for (long l = 0L; ; l = paramV8Array.getHandle())
    {
      double d = this.v8.executeDoubleFunction(this.v8.getV8RuntimePtr(), getHandle(), paramString, l);
      AppMethodBeat.o(75555);
      return d;
    }
  }

  public Object executeFunction(String paramString, V8Array paramV8Array)
  {
    AppMethodBeat.i(75560);
    this.v8.checkThread();
    checkReleased();
    this.v8.checkRuntime(paramV8Array);
    if (paramV8Array == null);
    for (long l = 0L; ; l = paramV8Array.getHandle())
    {
      paramString = this.v8.executeFunction(this.v8.getV8RuntimePtr(), 0, this.objectHandle, paramString, l);
      AppMethodBeat.o(75560);
      return paramString;
    }
  }

  public int executeIntegerFunction(String paramString, V8Array paramV8Array)
  {
    AppMethodBeat.i(75554);
    this.v8.checkThread();
    checkReleased();
    this.v8.checkRuntime(paramV8Array);
    if (paramV8Array == null);
    for (long l = 0L; ; l = paramV8Array.getHandle())
    {
      int i = this.v8.executeIntegerFunction(this.v8.getV8RuntimePtr(), getHandle(), paramString, l);
      AppMethodBeat.o(75554);
      return i;
    }
  }

  public Object executeJSFunction(String paramString)
  {
    AppMethodBeat.i(75561);
    paramString = executeFunction(paramString, null);
    AppMethodBeat.o(75561);
    return paramString;
  }

  public Object executeJSFunction(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(75562);
    if (paramArrayOfObject == null)
    {
      paramString = executeFunction(paramString, null);
      AppMethodBeat.o(75562);
    }
    while (true)
    {
      return paramString;
      V8Array localV8Array = new V8Array(this.v8.getRuntime());
      while (true)
      {
        Object localObject;
        try
        {
          int i = paramArrayOfObject.length;
          int j = 0;
          if (j >= i)
            break;
          localObject = paramArrayOfObject[j];
          if (localObject == null)
          {
            localV8Array.pushNull();
            j++;
            continue;
          }
          if ((localObject instanceof V8Value))
          {
            localV8Array.push((V8Value)localObject);
            continue;
          }
        }
        finally
        {
          localV8Array.release();
          AppMethodBeat.o(75562);
        }
        if ((localObject instanceof Integer))
        {
          localV8Array.push((Integer)localObject);
        }
        else if ((localObject instanceof Double))
        {
          localV8Array.push((Double)localObject);
        }
        else if ((localObject instanceof Long))
        {
          localV8Array.push(((Long)localObject).doubleValue());
        }
        else if ((localObject instanceof Float))
        {
          localV8Array.push(((Float)localObject).floatValue());
        }
        else if ((localObject instanceof Boolean))
        {
          localV8Array.push((Boolean)localObject);
        }
        else if ((localObject instanceof String))
        {
          localV8Array.push((String)localObject);
        }
        else
        {
          paramArrayOfObject = new java/lang/IllegalArgumentException;
          paramString = new java/lang/StringBuilder;
          paramString.<init>("Unsupported Object of type: ");
          paramArrayOfObject.<init>(localObject.getClass());
          AppMethodBeat.o(75562);
          throw paramArrayOfObject;
        }
      }
      paramString = executeFunction(paramString, localV8Array);
      localV8Array.release();
      AppMethodBeat.o(75562);
    }
  }

  public V8Object executeObjectFunction(String paramString, V8Array paramV8Array)
  {
    AppMethodBeat.i(75559);
    this.v8.checkThread();
    checkReleased();
    this.v8.checkRuntime(paramV8Array);
    if (paramV8Array == null);
    for (long l = 0L; ; l = paramV8Array.getHandle())
    {
      paramString = this.v8.executeFunction(this.v8.getV8RuntimePtr(), 6, this.objectHandle, paramString, l);
      if (!(paramString instanceof V8Object))
        break;
      paramString = (V8Object)paramString;
      AppMethodBeat.o(75559);
      return paramString;
    }
    paramString = new V8ResultUndefined();
    AppMethodBeat.o(75559);
    throw paramString;
  }

  public String executeStringFunction(String paramString, V8Array paramV8Array)
  {
    AppMethodBeat.i(75556);
    this.v8.checkThread();
    checkReleased();
    this.v8.checkRuntime(paramV8Array);
    if (paramV8Array == null);
    for (long l = 0L; ; l = paramV8Array.getHandle())
    {
      paramString = this.v8.executeStringFunction(this.v8.getV8RuntimePtr(), getHandle(), paramString, l);
      AppMethodBeat.o(75556);
      return paramString;
    }
  }

  public void executeVoidFunction(String paramString, V8Array paramV8Array)
  {
    AppMethodBeat.i(75563);
    this.v8.checkThread();
    checkReleased();
    this.v8.checkRuntime(paramV8Array);
    if (paramV8Array == null);
    for (long l = 0L; ; l = paramV8Array.getHandle())
    {
      this.v8.executeVoidFunction(this.v8.getV8RuntimePtr(), this.objectHandle, paramString, l);
      AppMethodBeat.o(75563);
      return;
    }
  }

  public Object get(String paramString)
  {
    AppMethodBeat.i(75547);
    this.v8.checkThread();
    checkReleased();
    checkKey(paramString);
    paramString = this.v8.get(this.v8.getV8RuntimePtr(), 6, this.objectHandle, paramString);
    AppMethodBeat.o(75547);
    return paramString;
  }

  public V8Array getArray(String paramString)
  {
    AppMethodBeat.i(75552);
    this.v8.checkThread();
    checkReleased();
    checkKey(paramString);
    paramString = this.v8.get(this.v8.getV8RuntimePtr(), 5, this.objectHandle, paramString);
    if ((paramString == null) || ((paramString instanceof V8Array)))
    {
      paramString = (V8Array)paramString;
      AppMethodBeat.o(75552);
      return paramString;
    }
    paramString = new V8ResultUndefined();
    AppMethodBeat.o(75552);
    throw paramString;
  }

  public boolean getBoolean(String paramString)
  {
    AppMethodBeat.i(75549);
    this.v8.checkThread();
    checkReleased();
    checkKey(paramString);
    boolean bool = this.v8.getBoolean(this.v8.getV8RuntimePtr(), this.objectHandle, paramString);
    AppMethodBeat.o(75549);
    return bool;
  }

  public double getDouble(String paramString)
  {
    AppMethodBeat.i(75550);
    this.v8.checkThread();
    checkReleased();
    checkKey(paramString);
    double d = this.v8.getDouble(this.v8.getV8RuntimePtr(), this.objectHandle, paramString);
    AppMethodBeat.o(75550);
    return d;
  }

  public int getInteger(String paramString)
  {
    AppMethodBeat.i(75548);
    this.v8.checkThread();
    checkReleased();
    checkKey(paramString);
    int i = this.v8.getInteger(this.v8.getV8RuntimePtr(), this.objectHandle, paramString);
    AppMethodBeat.o(75548);
    return i;
  }

  public String[] getKeys()
  {
    AppMethodBeat.i(75545);
    this.v8.checkThread();
    checkReleased();
    String[] arrayOfString = this.v8.getKeys(this.v8.getV8RuntimePtr(), this.objectHandle);
    AppMethodBeat.o(75545);
    return arrayOfString;
  }

  public V8Object getObject(String paramString)
  {
    AppMethodBeat.i(75553);
    this.v8.checkThread();
    checkReleased();
    checkKey(paramString);
    paramString = this.v8.get(this.v8.getV8RuntimePtr(), 6, this.objectHandle, paramString);
    if ((paramString == null) || ((paramString instanceof V8Object)))
    {
      paramString = (V8Object)paramString;
      AppMethodBeat.o(75553);
      return paramString;
    }
    paramString = new V8ResultUndefined();
    AppMethodBeat.o(75553);
    throw paramString;
  }

  public String getString(String paramString)
  {
    AppMethodBeat.i(75551);
    this.v8.checkThread();
    checkReleased();
    checkKey(paramString);
    paramString = this.v8.getString(this.v8.getV8RuntimePtr(), this.objectHandle, paramString);
    AppMethodBeat.o(75551);
    return paramString;
  }

  public int getType(String paramString)
  {
    AppMethodBeat.i(75546);
    this.v8.checkThread();
    checkReleased();
    checkKey(paramString);
    int i = this.v8.getType(this.v8.getV8RuntimePtr(), this.objectHandle, paramString);
    AppMethodBeat.o(75546);
    return i;
  }

  public V8Object registerJavaMethod(JavaCallback paramJavaCallback, String paramString)
  {
    AppMethodBeat.i(75572);
    this.v8.checkThread();
    checkReleased();
    this.v8.registerCallback(paramJavaCallback, getHandle(), paramString);
    AppMethodBeat.o(75572);
    return this;
  }

  public V8Object registerJavaMethod(JavaVoidCallback paramJavaVoidCallback, String paramString)
  {
    AppMethodBeat.i(75573);
    this.v8.checkThread();
    checkReleased();
    this.v8.registerVoidCallback(paramJavaVoidCallback, getHandle(), paramString);
    AppMethodBeat.o(75573);
    return this;
  }

  public V8Object registerJavaMethod(Object paramObject, String paramString1, String paramString2, Class<?>[] paramArrayOfClass)
  {
    AppMethodBeat.i(75574);
    paramObject = registerJavaMethod(paramObject, paramString1, paramString2, paramArrayOfClass, false);
    AppMethodBeat.o(75574);
    return paramObject;
  }

  public V8Object registerJavaMethod(Object paramObject, String paramString1, String paramString2, Class<?>[] paramArrayOfClass, boolean paramBoolean)
  {
    AppMethodBeat.i(75575);
    this.v8.checkThread();
    checkReleased();
    try
    {
      paramString1 = paramObject.getClass().getMethod(paramString1, paramArrayOfClass);
      paramString1.setAccessible(true);
      this.v8.registerCallback(paramObject, paramString1, getHandle(), paramString2, paramBoolean);
      AppMethodBeat.o(75575);
      return this;
    }
    catch (NoSuchMethodException paramObject)
    {
      paramObject = new IllegalStateException(paramObject);
      AppMethodBeat.o(75575);
      throw paramObject;
    }
    catch (SecurityException paramObject)
    {
      paramObject = new IllegalStateException(paramObject);
      AppMethodBeat.o(75575);
    }
    throw paramObject;
  }

  public V8Object setPrototype(V8Object paramV8Object)
  {
    AppMethodBeat.i(75571);
    this.v8.checkThread();
    checkReleased();
    this.v8.setPrototype(this.v8.getV8RuntimePtr(), this.objectHandle, paramV8Object.getHandle());
    AppMethodBeat.o(75571);
    return this;
  }

  public String toString()
  {
    AppMethodBeat.i(75576);
    String str;
    if ((isReleased()) || (this.v8.isReleased()))
    {
      str = "[Object released]";
      AppMethodBeat.o(75576);
    }
    while (true)
    {
      return str;
      this.v8.checkThread();
      str = this.v8.toString(this.v8.getV8RuntimePtr(), getHandle());
      AppMethodBeat.o(75576);
    }
  }

  public V8Object twin()
  {
    AppMethodBeat.i(75543);
    V8Object localV8Object = (V8Object)super.twin();
    AppMethodBeat.o(75543);
    return localV8Object;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.V8Object
 * JD-Core Version:    0.6.2
 */