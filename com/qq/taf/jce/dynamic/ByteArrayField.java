package com.qq.taf.jce.dynamic;

public class ByteArrayField extends JceField
{
  private byte[] data;

  ByteArrayField(byte[] paramArrayOfByte, int paramInt)
  {
    super(paramInt);
    this.data = paramArrayOfByte;
  }

  public byte[] get()
  {
    return this.data;
  }

  public void set(byte[] paramArrayOfByte)
  {
    this.data = paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.ByteArrayField
 * JD-Core Version:    0.6.2
 */