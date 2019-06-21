package com.tencent.recovery.wx.util;

class MyByteArray
{
  public byte[] cca;
  public int ccb = 0;

  public MyByteArray()
  {
    this.cca = new byte[256];
  }

  public MyByteArray(byte paramByte)
  {
    this.cca = new byte[] { paramByte };
  }

  public MyByteArray(byte[] paramArrayOfByte)
  {
    this.cca = paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.wx.util.MyByteArray
 * JD-Core Version:    0.6.2
 */