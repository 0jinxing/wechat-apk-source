package com.tencent.tmassistantsdk.util;

abstract class Base64$Coder
{
  public int op;
  public byte[] output;

  public abstract int maxOutputSize(int paramInt);

  public abstract boolean process(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.util.Base64.Coder
 * JD-Core Version:    0.6.2
 */