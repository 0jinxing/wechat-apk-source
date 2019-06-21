package com.tencent.tinker.a.a;

import com.tencent.tinker.a.a.a.a;
import com.tencent.tinker.a.a.b.d;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.Adler32;

public final class i
{
  static final short[] AxX = new short[0];
  public final t AxY = new t();
  private final i.f AxZ = new i.f(this, (byte)0);
  private final i.g Aya = new i.g(this, (byte)0);
  private final i.h Ayb = new i.h(this, (byte)0);
  private final i.d Ayc = new i.d(this, (byte)0);
  private final i.b Ayd = new i.b(this, (byte)0);
  private final i.c Aye = new i.c(this, (byte)0);
  private final i.a Ayf = new i.a(this, (byte)0);
  private int Ayg = 0;
  public ByteBuffer aEY;
  private byte[] nTL = null;

  public i(int paramInt)
  {
    this.aEY = ByteBuffer.wrap(new byte[paramInt]);
    this.aEY.order(ByteOrder.LITTLE_ENDIAN);
    this.AxY.fileSize = paramInt;
  }

  public i(InputStream paramInputStream)
  {
    this.aEY = ByteBuffer.wrap(d.c(paramInputStream, 0));
    this.aEY.order(ByteOrder.LITTLE_ENDIAN);
    t localt = this.AxY;
    i.e locale = a(localt.Ays);
    paramInputStream = locale.Rr(8);
    int j = i;
    if (paramInputStream.length == 8)
    {
      j = i;
      if (paramInputStream[0] == 100)
      {
        j = i;
        if (paramInputStream[1] == 101)
        {
          j = i;
          if (paramInputStream[2] == 120)
          {
            j = i;
            if (paramInputStream[3] == 10)
            {
              if (paramInputStream[7] == 0)
                break label262;
              j = i;
            }
          }
        }
      }
    }
    while (j != 13)
    {
      throw new j("Unexpected magic: " + Arrays.toString(paramInputStream));
      label262: String str = (char)paramInputStream[4] + (char)paramInputStream[5] + (char)paramInputStream[6];
      if (str.equals("036"))
      {
        j = 14;
      }
      else
      {
        j = i;
        if (str.equals("035"))
          j = 13;
      }
    }
    localt.gai = locale.aEY.getInt();
    localt.nTL = locale.Rr(20);
    localt.fileSize = locale.aEY.getInt();
    j = locale.aEY.getInt();
    if (j != 112)
      throw new j("Unexpected header: 0x" + Integer.toHexString(j));
    j = locale.aEY.getInt();
    if (j != 305419896)
      throw new j("Unexpected endian tag: 0x" + Integer.toHexString(j));
    localt.AyL = locale.aEY.getInt();
    localt.AyM = locale.aEY.getInt();
    localt.Ayz.off = locale.aEY.getInt();
    if (localt.Ayz.off == 0)
      throw new j("Cannot merge dex files that do not contain a map");
    localt.Ayt.size = locale.aEY.getInt();
    localt.Ayt.off = locale.aEY.getInt();
    localt.Ayu.size = locale.aEY.getInt();
    localt.Ayu.off = locale.aEY.getInt();
    localt.Ayv.size = locale.aEY.getInt();
    localt.Ayv.off = locale.aEY.getInt();
    localt.Ayw.size = locale.aEY.getInt();
    localt.Ayw.off = locale.aEY.getInt();
    localt.Ayx.size = locale.aEY.getInt();
    localt.Ayx.off = locale.aEY.getInt();
    localt.Ayy.size = locale.aEY.getInt();
    localt.Ayy.off = locale.aEY.getInt();
    localt.lgV = locale.aEY.getInt();
    localt.AyN = locale.aEY.getInt();
    localt.a(Rm(localt.Ayz.off));
    localt.dRV();
  }

  private static void hV(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= paramInt2))
      throw new IndexOutOfBoundsException("index:" + paramInt1 + ", length=" + paramInt2);
  }

  public final i.e Rm(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.aEY.capacity()))
      throw new IllegalArgumentException("position=" + paramInt + " length=" + this.aEY.capacity());
    ByteBuffer localByteBuffer = this.aEY.duplicate();
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.position(paramInt);
    localByteBuffer.limit(this.aEY.capacity());
    return new i.e(this, "temp-section", localByteBuffer, (byte)0);
  }

  public final int Rn(int paramInt)
  {
    hV(paramInt, this.AxY.Ayu.size);
    int i = this.AxY.Ayu.off;
    return this.aEY.getInt(i + paramInt * 4);
  }

  public final i.e a(t.a parama)
  {
    int i = parama.off;
    if ((i < 0) || (i >= this.aEY.capacity()))
      throw new IllegalArgumentException("position=" + i + " length=" + this.aEY.capacity());
    ByteBuffer localByteBuffer = this.aEY.duplicate();
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.position(i);
    localByteBuffer.limit(i + parama.byteCount);
    return new i.e(this, "section", localByteBuffer, (byte)0);
  }

  public final void dRw()
  {
    Rm(12).write(rs(true));
    i.e locale = Rm(8);
    Adler32 localAdler32 = new Adler32();
    byte[] arrayOfByte = new byte[8192];
    ByteBuffer localByteBuffer = this.aEY.duplicate();
    localByteBuffer.limit(localByteBuffer.capacity());
    localByteBuffer.position(12);
    while (localByteBuffer.hasRemaining())
    {
      int i = Math.min(8192, localByteBuffer.remaining());
      localByteBuffer.get(arrayOfByte, 0, i);
      localAdler32.update(arrayOfByte, 0, i);
    }
    locale.writeInt((int)localAdler32.getValue());
  }

  public final byte[] rs(boolean paramBoolean)
  {
    byte[] arrayOfByte1;
    if ((this.nTL != null) && (!paramBoolean))
      arrayOfByte1 = this.nTL;
    while (true)
    {
      return arrayOfByte1;
      MessageDigest localMessageDigest;
      try
      {
        localMessageDigest = MessageDigest.getInstance("SHA-1");
        arrayOfByte1 = new byte[8192];
        ByteBuffer localByteBuffer = this.aEY.duplicate();
        localByteBuffer.limit(localByteBuffer.capacity());
        localByteBuffer.position(32);
        while (localByteBuffer.hasRemaining())
        {
          int i = Math.min(8192, localByteBuffer.remaining());
          localByteBuffer.get(arrayOfByte1, 0, i);
          localMessageDigest.update(arrayOfByte1, 0, i);
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        throw new AssertionError();
      }
      byte[] arrayOfByte2 = localMessageDigest.digest();
      this.nTL = arrayOfByte2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.a.i
 * JD-Core Version:    0.6.2
 */