package com.tencent.qqmusic.mediaplayer;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class FloatBufferInfo
{
  public int bufferSize;
  public float[] floatBuffer;
  public float[] tempFloatBuffer;

  public void appendFloat(float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(111096);
    if ((paramArrayOfFloat != null) && (paramInt1 >= 0) && (paramInt2 > 0) && (paramInt1 + paramInt2 <= paramArrayOfFloat.length))
    {
      setFloatBufferCapacity(this.bufferSize + paramInt2);
      System.arraycopy(paramArrayOfFloat, paramInt1, this.floatBuffer, this.bufferSize, paramInt2);
    }
    AppMethodBeat.o(111096);
  }

  public FloatBufferInfo copy(FloatBufferInfo paramFloatBufferInfo)
  {
    paramFloatBufferInfo.bufferSize = this.bufferSize;
    paramFloatBufferInfo.floatBuffer = this.floatBuffer;
    paramFloatBufferInfo.tempFloatBuffer = this.tempFloatBuffer;
    return paramFloatBufferInfo;
  }

  public void fillFloat(float[] paramArrayOfFloat, int paramInt)
  {
    if ((paramArrayOfFloat == null) || (paramInt <= 0) || (paramInt > paramArrayOfFloat.length));
    while (true)
    {
      return;
      this.floatBuffer = paramArrayOfFloat;
      this.bufferSize = paramInt;
    }
  }

  public void setFloatBufferCapacity(int paramInt)
  {
    if ((this.floatBuffer == null) || (this.floatBuffer.length < paramInt))
      this.floatBuffer = new float[paramInt];
  }

  public void setTempFloatBufferCapacity(int paramInt)
  {
    if ((this.tempFloatBuffer == null) || (this.tempFloatBuffer.length < paramInt))
      this.tempFloatBuffer = new float[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.FloatBufferInfo
 * JD-Core Version:    0.6.2
 */