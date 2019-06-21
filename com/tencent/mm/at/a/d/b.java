package com.tencent.mm.at.a.d;

import android.graphics.Bitmap;

public final class b
{
  public Bitmap bitmap;
  public String bqF;
  public byte[] data;
  public int from;
  public int status;

  public b()
  {
    this.status = -1;
  }

  public b(Bitmap paramBitmap)
  {
    this.status = 0;
    this.from = 0;
    this.bitmap = paramBitmap;
  }

  public b(byte[] paramArrayOfByte, String paramString)
  {
    this.data = paramArrayOfByte;
    this.bqF = paramString;
  }

  public b(byte[] paramArrayOfByte, String paramString, byte paramByte)
  {
    this.data = paramArrayOfByte;
    this.from = 2;
    this.bqF = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.d.b
 * JD-Core Version:    0.6.2
 */