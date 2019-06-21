package com.tencent.tinker.d.a;

import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.zip.ZipException;

public final class f
  implements Cloneable
{
  public long AFe = -1L;
  long AFp = -1L;
  int AFq = -1;
  int AFr = -1;
  byte[] AFs;
  long AFt = -1L;
  long AFu = -1L;
  public String name;
  int oyB = -1;
  long size = -1L;
  String vGv;

  public f(f paramf)
  {
    this.name = paramf.name;
    this.vGv = paramf.vGv;
    this.oyB = paramf.oyB;
    this.size = paramf.size;
    this.AFp = paramf.AFp;
    this.AFe = paramf.AFe;
    this.AFq = paramf.AFq;
    this.AFr = paramf.AFr;
    this.AFs = paramf.AFs;
    this.AFt = paramf.AFt;
    this.AFu = paramf.AFu;
  }

  public f(f paramf, String paramString)
  {
    this.name = paramString;
    this.vGv = paramf.vGv;
    this.oyB = paramf.oyB;
    this.size = paramf.size;
    this.AFp = paramf.AFp;
    this.AFe = paramf.AFe;
    this.AFq = paramf.AFq;
    this.AFr = paramf.AFr;
    this.AFs = paramf.AFs;
    this.AFt = paramf.AFt;
    this.AFu = paramf.AFu;
  }

  public f(String paramString)
  {
    if (paramString == null)
      throw new NullPointerException("name == null");
    byte[] arrayOfByte = paramString.getBytes(Charset.forName("UTF-8"));
    if (arrayOfByte.length > 65535)
      throw new IllegalArgumentException("Name" + " too long: " + arrayOfByte.length);
    this.name = paramString;
  }

  f(byte[] paramArrayOfByte, InputStream paramInputStream, Charset paramCharset)
  {
    e.b(paramInputStream, paramArrayOfByte, 0, 46);
    paramArrayOfByte = c.a(paramArrayOfByte, 46, ByteOrder.LITTLE_ENDIAN);
    int i = paramArrayOfByte.readInt();
    if (i != 33639248L)
      g.a("unknown", paramInputStream.available(), "unknown", 0L, "Central Directory Entry", i);
    paramArrayOfByte.seek(8);
    i = paramArrayOfByte.readShort() & 0xFFFF;
    if ((i & 0x1) != 0)
      throw new ZipException("Invalid General Purpose Bit Flag: ".concat(String.valueOf(i)));
    if ((i & 0x800) != 0)
      paramCharset = Charset.forName("UTF-8");
    this.AFq = (paramArrayOfByte.readShort() & 0xFFFF);
    this.oyB = (paramArrayOfByte.readShort() & 0xFFFF);
    this.AFr = (paramArrayOfByte.readShort() & 0xFFFF);
    this.AFe = (paramArrayOfByte.readInt() & 0xFFFFFFFF);
    this.AFp = (paramArrayOfByte.readInt() & 0xFFFFFFFF);
    this.size = (paramArrayOfByte.readInt() & 0xFFFFFFFF);
    int j = paramArrayOfByte.readShort();
    int k = paramArrayOfByte.readShort() & 0xFFFF;
    i = paramArrayOfByte.readShort() & 0xFFFF;
    paramArrayOfByte.seek(42);
    this.AFt = (paramArrayOfByte.readInt() & 0xFFFFFFFF);
    paramArrayOfByte = new byte[j & 0xFFFF];
    e.b(paramInputStream, paramArrayOfByte, 0, paramArrayOfByte.length);
    if (cr(paramArrayOfByte))
      throw new ZipException("Filename contains NUL byte: " + Arrays.toString(paramArrayOfByte));
    this.name = new String(paramArrayOfByte, 0, paramArrayOfByte.length, paramCharset);
    if (k > 0)
    {
      this.AFs = new byte[k];
      e.b(paramInputStream, this.AFs, 0, k);
    }
    if (i > 0)
    {
      paramArrayOfByte = new byte[i];
      e.b(paramInputStream, paramArrayOfByte, 0, i);
      this.vGv = new String(paramArrayOfByte, 0, paramArrayOfByte.length, paramCharset);
    }
  }

  private static boolean cr(byte[] paramArrayOfByte)
  {
    boolean bool1 = false;
    int i = paramArrayOfByte.length;
    for (int j = 0; ; j++)
    {
      boolean bool2 = bool1;
      if (j < i)
      {
        if (paramArrayOfByte[j] == 0)
          bool2 = true;
      }
      else
        return bool2;
    }
  }

  public final Object clone()
  {
    try
    {
      f localf = (f)super.clone();
      if (this.AFs != null);
      for (byte[] arrayOfByte = (byte[])this.AFs.clone(); ; arrayOfByte = null)
      {
        localf.AFs = arrayOfByte;
        return localf;
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
  }

  public final int hashCode()
  {
    return this.name.hashCode();
  }

  public final void setMethod(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 8))
      throw new IllegalArgumentException("Bad method: ".concat(String.valueOf(paramInt)));
    this.AFq = paramInt;
  }

  public final void setSize(long paramLong)
  {
    if (paramLong < 0L)
      throw new IllegalArgumentException("Bad size: ".concat(String.valueOf(paramLong)));
    this.size = paramLong;
  }

  public final String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("name:" + this.name);
    localStringBuffer.append("\ncomment:" + this.vGv);
    localStringBuffer.append("\ntime:" + this.oyB);
    localStringBuffer.append("\nsize:" + this.size);
    localStringBuffer.append("\ncompressedSize:" + this.AFp);
    localStringBuffer.append("\ncrc:" + this.AFe);
    localStringBuffer.append("\ncompressionMethod:" + this.AFq);
    localStringBuffer.append("\nmodDate:" + this.AFr);
    localStringBuffer.append("\nextra length:" + this.AFs.length);
    localStringBuffer.append("\nlocalHeaderRelOffset:" + this.AFt);
    localStringBuffer.append("\ndataOffset:" + this.AFu);
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.d.a.f
 * JD-Core Version:    0.6.2
 */