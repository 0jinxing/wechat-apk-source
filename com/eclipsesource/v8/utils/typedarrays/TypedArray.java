package com.eclipsesource.v8.utils.typedarrays;

import com.eclipsesource.v8.V8TypedArray;
import java.nio.ByteBuffer;

public abstract class TypedArray
{
  protected ByteBuffer buffer;

  protected TypedArray(ByteBuffer paramByteBuffer)
  {
    if (!paramByteBuffer.isDirect())
      throw new IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
    if (paramByteBuffer.limit() % V8TypedArray.getStructureSize(getType()) != 0)
      throw new IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
    this.buffer = paramByteBuffer;
  }

  public ByteBuffer getByteBuffer()
  {
    return this.buffer;
  }

  public abstract int getType();

  public abstract int length();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.utils.typedarrays.TypedArray
 * JD-Core Version:    0.6.2
 */