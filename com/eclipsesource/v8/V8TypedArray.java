package com.eclipsesource.v8;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

public class V8TypedArray extends V8Array
{
  private V8TypedArray(V8 paramV8)
  {
    super(paramV8);
  }

  public V8TypedArray(V8 paramV8, V8ArrayBuffer paramV8ArrayBuffer, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramV8, new V8TypedArray.V8ArrayData(paramV8ArrayBuffer, paramInt2, paramInt3, paramInt1));
    AppMethodBeat.i(75579);
    AppMethodBeat.o(75579);
  }

  private void checkArrayProperties(V8TypedArray.V8ArrayData paramV8ArrayData)
  {
    AppMethodBeat.i(75585);
    checkOffset(paramV8ArrayData);
    checkSize(paramV8ArrayData);
    AppMethodBeat.o(75585);
  }

  private void checkOffset(V8TypedArray.V8ArrayData paramV8ArrayData)
  {
    AppMethodBeat.i(75587);
    if (V8TypedArray.V8ArrayData.access$200(paramV8ArrayData) % getStructureSize(V8TypedArray.V8ArrayData.access$000(paramV8ArrayData)) != 0)
    {
      paramV8ArrayData = new IllegalStateException("RangeError: Start offset of Int32Array must be a multiple of " + getStructureSize(V8TypedArray.V8ArrayData.access$000(paramV8ArrayData)));
      AppMethodBeat.o(75587);
      throw paramV8ArrayData;
    }
    AppMethodBeat.o(75587);
  }

  private void checkSize(V8TypedArray.V8ArrayData paramV8ArrayData)
  {
    AppMethodBeat.i(75586);
    if (V8TypedArray.V8ArrayData.access$300(paramV8ArrayData) < 0)
    {
      paramV8ArrayData = new IllegalStateException("RangeError: Invalid typed array length");
      AppMethodBeat.o(75586);
      throw paramV8ArrayData;
    }
    if (V8TypedArray.V8ArrayData.access$300(paramV8ArrayData) * getStructureSize(V8TypedArray.V8ArrayData.access$000(paramV8ArrayData)) + V8TypedArray.V8ArrayData.access$200(paramV8ArrayData) > V8TypedArray.V8ArrayData.access$100(paramV8ArrayData).getBackingStore().limit())
    {
      paramV8ArrayData = new IllegalStateException("RangeError: Invalid typed array length");
      AppMethodBeat.o(75586);
      throw paramV8ArrayData;
    }
    AppMethodBeat.o(75586);
  }

  private long createTypedArray(long paramLong, V8TypedArray.V8ArrayData paramV8ArrayData)
  {
    AppMethodBeat.i(75583);
    switch (V8TypedArray.V8ArrayData.access$000(paramV8ArrayData))
    {
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 10:
    default:
      paramV8ArrayData = new IllegalArgumentException("Cannot create a typed array of type " + V8Value.getStringRepresentation(V8TypedArray.V8ArrayData.access$000(paramV8ArrayData)));
      AppMethodBeat.o(75583);
      throw paramV8ArrayData;
    case 16:
      paramLong = this.v8.initNewV8Float32Array(paramLong, V8TypedArray.V8ArrayData.access$100(paramV8ArrayData).objectHandle, V8TypedArray.V8ArrayData.access$200(paramV8ArrayData), V8TypedArray.V8ArrayData.access$300(paramV8ArrayData));
      AppMethodBeat.o(75583);
    case 2:
    case 15:
    case 13:
    case 14:
    case 1:
    case 11:
    case 9:
    case 12:
    }
    while (true)
    {
      return paramLong;
      paramLong = this.v8.initNewV8Float64Array(paramLong, V8TypedArray.V8ArrayData.access$100(paramV8ArrayData).objectHandle, V8TypedArray.V8ArrayData.access$200(paramV8ArrayData), V8TypedArray.V8ArrayData.access$300(paramV8ArrayData));
      AppMethodBeat.o(75583);
      continue;
      paramLong = this.v8.initNewV8UInt32Array(paramLong, V8TypedArray.V8ArrayData.access$100(paramV8ArrayData).objectHandle, V8TypedArray.V8ArrayData.access$200(paramV8ArrayData), V8TypedArray.V8ArrayData.access$300(paramV8ArrayData));
      AppMethodBeat.o(75583);
      continue;
      paramLong = this.v8.initNewV8Int16Array(paramLong, V8TypedArray.V8ArrayData.access$100(paramV8ArrayData).objectHandle, V8TypedArray.V8ArrayData.access$200(paramV8ArrayData), V8TypedArray.V8ArrayData.access$300(paramV8ArrayData));
      AppMethodBeat.o(75583);
      continue;
      paramLong = this.v8.initNewV8UInt16Array(paramLong, V8TypedArray.V8ArrayData.access$100(paramV8ArrayData).objectHandle, V8TypedArray.V8ArrayData.access$200(paramV8ArrayData), V8TypedArray.V8ArrayData.access$300(paramV8ArrayData));
      AppMethodBeat.o(75583);
      continue;
      paramLong = this.v8.initNewV8Int32Array(paramLong, V8TypedArray.V8ArrayData.access$100(paramV8ArrayData).objectHandle, V8TypedArray.V8ArrayData.access$200(paramV8ArrayData), V8TypedArray.V8ArrayData.access$300(paramV8ArrayData));
      AppMethodBeat.o(75583);
      continue;
      paramLong = this.v8.initNewV8UInt8Array(paramLong, V8TypedArray.V8ArrayData.access$100(paramV8ArrayData).objectHandle, V8TypedArray.V8ArrayData.access$200(paramV8ArrayData), V8TypedArray.V8ArrayData.access$300(paramV8ArrayData));
      AppMethodBeat.o(75583);
      continue;
      paramLong = this.v8.initNewV8Int8Array(paramLong, V8TypedArray.V8ArrayData.access$100(paramV8ArrayData).objectHandle, V8TypedArray.V8ArrayData.access$200(paramV8ArrayData), V8TypedArray.V8ArrayData.access$300(paramV8ArrayData));
      AppMethodBeat.o(75583);
      continue;
      paramLong = this.v8.initNewV8UInt8ClampedArray(paramLong, V8TypedArray.V8ArrayData.access$100(paramV8ArrayData).objectHandle, V8TypedArray.V8ArrayData.access$200(paramV8ArrayData), V8TypedArray.V8ArrayData.access$300(paramV8ArrayData));
      AppMethodBeat.o(75583);
    }
  }

  public static int getStructureSize(int paramInt)
  {
    AppMethodBeat.i(75584);
    switch (paramInt)
    {
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 10:
    default:
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("Cannot create a typed array of type " + V8Value.getStringRepresentation(paramInt));
      AppMethodBeat.o(75584);
      throw localIllegalArgumentException;
    case 2:
      paramInt = 8;
      AppMethodBeat.o(75584);
    case 1:
    case 15:
    case 16:
    case 13:
    case 14:
    case 9:
    case 11:
    case 12:
    }
    while (true)
    {
      return paramInt;
      paramInt = 4;
      AppMethodBeat.o(75584);
      continue;
      paramInt = 2;
      AppMethodBeat.o(75584);
      continue;
      paramInt = 1;
      AppMethodBeat.o(75584);
    }
  }

  protected V8Value createTwin()
  {
    AppMethodBeat.i(75588);
    V8TypedArray localV8TypedArray = new V8TypedArray(this.v8);
    AppMethodBeat.o(75588);
    return localV8TypedArray;
  }

  public V8ArrayBuffer getBuffer()
  {
    AppMethodBeat.i(75580);
    V8ArrayBuffer localV8ArrayBuffer = (V8ArrayBuffer)get("buffer");
    AppMethodBeat.o(75580);
    return localV8ArrayBuffer;
  }

  public ByteBuffer getByteBuffer()
  {
    AppMethodBeat.i(75581);
    V8ArrayBuffer localV8ArrayBuffer = getBuffer();
    try
    {
      ByteBuffer localByteBuffer = localV8ArrayBuffer.getBackingStore();
      return localByteBuffer;
    }
    finally
    {
      localV8ArrayBuffer.release();
      AppMethodBeat.o(75581);
    }
  }

  protected void initialize(long paramLong, Object paramObject)
  {
    AppMethodBeat.i(75582);
    this.v8.checkThread();
    if (paramObject == null)
    {
      super.initialize(paramLong, paramObject);
      AppMethodBeat.o(75582);
    }
    while (true)
    {
      return;
      paramObject = (V8TypedArray.V8ArrayData)paramObject;
      checkArrayProperties(paramObject);
      paramLong = createTypedArray(paramLong, paramObject);
      this.released = false;
      addObjectReference(paramLong);
      AppMethodBeat.o(75582);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.V8TypedArray
 * JD-Core Version:    0.6.2
 */