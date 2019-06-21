package com.tencent.ugc;

import java.nio.ByteBuffer;

public class TXAudioFrame
{
  private ByteBuffer mByteBuffer;
  private int mLength;

  public ByteBuffer getByteBuffer()
  {
    return this.mByteBuffer;
  }

  public int getLength()
  {
    return this.mLength;
  }

  public void setByteBuffer(ByteBuffer paramByteBuffer)
  {
    this.mByteBuffer = paramByteBuffer;
  }

  public void setLength(int paramInt)
  {
    this.mLength = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ugc.TXAudioFrame
 * JD-Core Version:    0.6.2
 */