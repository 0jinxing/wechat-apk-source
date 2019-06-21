package com.eclipsesource.v8;

import java.util.Map;

public abstract class V8Value
  implements Releasable
{
  public static final int BOOLEAN = 3;
  public static final int BYTE = 9;
  public static final int DOUBLE = 2;
  public static final int FLOAT_32_ARRAY = 16;
  public static final int FLOAT_64_ARRAY = 2;
  public static final int INTEGER = 1;
  public static final int INT_16_ARRAY = 13;
  public static final int INT_32_ARRAY = 1;
  public static final int INT_8_ARRAY = 9;
  public static final int NULL = 0;
  public static final int STRING = 4;
  public static final int UNDEFINED = 99;
  public static final int UNKNOWN = 0;
  public static final int UNSIGNED_INT_16_ARRAY = 14;
  public static final int UNSIGNED_INT_32_ARRAY = 15;
  public static final int UNSIGNED_INT_8_ARRAY = 11;
  public static final int UNSIGNED_INT_8_CLAMPED_ARRAY = 12;
  public static final int V8_ARRAY = 5;
  public static final int V8_ARRAY_BUFFER = 10;
  public static final int V8_FUNCTION = 7;
  public static final int V8_OBJECT = 6;
  public static final int V8_TYPED_ARRAY = 8;
  protected long objectHandle;
  protected boolean released = true;
  protected V8 v8;

  protected V8Value()
  {
  }

  protected V8Value(V8 paramV8)
  {
    if (paramV8 == null);
    for (this.v8 = ((V8)this); ; this.v8 = paramV8)
      return;
  }

  @Deprecated
  public static String getStringRepresentaion(int paramInt)
  {
    return getStringRepresentation(paramInt);
  }

  public static String getStringRepresentation(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Invalid V8 type: ".concat(String.valueOf(paramInt)));
    case 0:
      str = "Null";
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 99:
    }
    while (true)
    {
      return str;
      str = "Integer";
      continue;
      str = "Double";
      continue;
      str = "Boolean";
      continue;
      str = "String";
      continue;
      str = "V8Array";
      continue;
      str = "V8Object";
      continue;
      str = "V8Function";
      continue;
      str = "V8TypedArray";
      continue;
      str = "Byte";
      continue;
      str = "V8ArrayBuffer";
      continue;
      str = "UInt8Array";
      continue;
      str = "UInt8ClampedArray";
      continue;
      str = "Int16Array";
      continue;
      str = "UInt16Array";
      continue;
      str = "UInt32Array";
      continue;
      str = "Float32Array";
      continue;
      str = "Undefined";
    }
  }

  protected void addObjectReference(long paramLong)
  {
    this.objectHandle = paramLong;
    try
    {
      this.v8.addObjRef(this);
      return;
    }
    catch (Error localError)
    {
      release();
      throw localError;
    }
    catch (RuntimeException localRuntimeException)
    {
      release();
      throw localRuntimeException;
    }
  }

  protected void checkReleased()
  {
    if (this.released)
      throw new IllegalStateException("Object released");
  }

  protected abstract V8Value createTwin();

  public boolean equals(Object paramObject)
  {
    return strictEquals(paramObject);
  }

  protected long getHandle()
  {
    checkReleased();
    return this.objectHandle;
  }

  public V8 getRuntime()
  {
    return this.v8;
  }

  public int getV8Type()
  {
    if (isUndefined());
    for (int i = 99; ; i = this.v8.getType(this.v8.getV8RuntimePtr(), this.objectHandle))
    {
      return i;
      this.v8.checkThread();
      this.v8.checkReleased();
    }
  }

  public int hashCode()
  {
    this.v8.checkThread();
    checkReleased();
    return this.v8.identityHash(this.v8.getV8RuntimePtr(), getHandle());
  }

  protected void initialize(long paramLong, Object paramObject)
  {
    paramLong = this.v8.initNewV8Object(paramLong);
    this.released = false;
    addObjectReference(paramLong);
  }

  public boolean isReleased()
  {
    return this.released;
  }

  public boolean isUndefined()
  {
    return false;
  }

  public boolean isWeak()
  {
    this.v8.checkThread();
    this.v8.checkReleased();
    return this.v8.isWeak(this.v8.getV8RuntimePtr(), getHandle());
  }

  public boolean jsEquals(Object paramObject)
  {
    this.v8.checkThread();
    checkReleased();
    boolean bool;
    if (paramObject == this)
      bool = true;
    while (true)
    {
      return bool;
      if (paramObject == null)
        bool = false;
      else if (!(paramObject instanceof V8Value))
        bool = false;
      else if ((isUndefined()) && (((V8Value)paramObject).isUndefined()))
        bool = true;
      else if (((V8Value)paramObject).isUndefined())
        bool = false;
      else
        bool = this.v8.equals(this.v8.getV8RuntimePtr(), getHandle(), ((V8Value)paramObject).getHandle());
    }
  }

  public void release()
  {
    this.v8.checkThread();
    if (!this.released);
    try
    {
      this.v8.releaseObjRef(this);
      return;
    }
    finally
    {
      this.released = true;
      this.v8.release(this.v8.getV8RuntimePtr(), this.objectHandle);
    }
  }

  public V8Value setWeak()
  {
    this.v8.checkThread();
    this.v8.checkReleased();
    this.v8.v8WeakReferences.put(Long.valueOf(getHandle()), this);
    this.v8.setWeak(this.v8.getV8RuntimePtr(), getHandle());
    return this;
  }

  public boolean strictEquals(Object paramObject)
  {
    this.v8.checkThread();
    checkReleased();
    boolean bool;
    if (paramObject == this)
      bool = true;
    while (true)
    {
      return bool;
      if (paramObject == null)
        bool = false;
      else if (!(paramObject instanceof V8Value))
        bool = false;
      else if ((isUndefined()) && (((V8Value)paramObject).isUndefined()))
        bool = true;
      else if (((V8Value)paramObject).isUndefined())
        bool = false;
      else
        bool = this.v8.strictEquals(this.v8.getV8RuntimePtr(), getHandle(), ((V8Value)paramObject).getHandle());
    }
  }

  public V8Value twin()
  {
    V8Value localV8Value;
    if (isUndefined())
      localV8Value = this;
    while (true)
    {
      return localV8Value;
      this.v8.checkThread();
      this.v8.checkReleased();
      localV8Value = createTwin();
      this.v8.createTwin(this, localV8Value);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.V8Value
 * JD-Core Version:    0.6.2
 */