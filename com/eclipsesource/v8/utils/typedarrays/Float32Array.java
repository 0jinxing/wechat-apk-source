package com.eclipsesource.v8.utils.typedarrays;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public class Float32Array extends TypedArray
{
  public Float32Array(ArrayBuffer paramArrayBuffer)
  {
    this(paramArrayBuffer.getByteBuffer());
    AppMethodBeat.i(75048);
    AppMethodBeat.o(75048);
  }

  public Float32Array(ByteBuffer paramByteBuffer)
  {
    super(paramByteBuffer);
  }

  public float get(int paramInt)
  {
    AppMethodBeat.i(75049);
    float f = this.buffer.asFloatBuffer().get(paramInt);
    AppMethodBeat.o(75049);
    return f;
  }

  public int getType()
  {
    return 16;
  }

  public int length()
  {
    AppMethodBeat.i(75050);
    int i = this.buffer.asFloatBuffer().limit();
    AppMethodBeat.o(75050);
    return i;
  }

  public void put(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(75051);
    this.buffer.asFloatBuffer().put(paramInt, paramFloat);
    AppMethodBeat.o(75051);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.utils.typedarrays.Float32Array
 * JD-Core Version:    0.6.2
 */