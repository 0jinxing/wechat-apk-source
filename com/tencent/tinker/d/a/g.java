package com.tencent.tinker.d.a;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.zip.ZipException;

public final class g
  implements Closeable
{
  private final LinkedHashMap<String, f> AFv = new LinkedHashMap();
  private File AFw;
  private RandomAccessFile AFx;
  private final String filename;
  public String vGv;

  public g(File paramFile)
  {
    this(paramFile, (byte)0);
  }

  private g(File paramFile, byte paramByte)
  {
    this.filename = paramFile.getPath();
    this.AFw = null;
    this.AFx = new RandomAccessFile(this.filename, "r");
    dSv();
  }

  public g(String paramString)
  {
    this(new File(paramString), (byte)0);
  }

  static void a(String paramString1, long paramLong1, String paramString2, long paramLong2, String paramString3, int paramInt)
  {
    String str = Integer.toHexString(paramInt);
    throw new ZipException("file name:" + paramString1 + ", file size" + paramLong1 + ", entry name:" + paramString2 + ", entry localHeaderRelOffset:" + paramLong2 + ", " + paramString3 + " signature not found; was " + str);
  }

  private void dSv()
  {
    long l1 = 0L;
    long l2 = this.AFx.length() - 22L;
    if (l2 < 0L)
      throw new ZipException("File too short to be a zip file: " + this.AFx.length());
    this.AFx.seek(0L);
    if (Integer.reverseBytes(this.AFx.readInt()) != 67324752L)
      throw new ZipException("Not a zip archive");
    long l3 = l2 - 65536L;
    if (l3 < 0L);
    while (true)
    {
      this.AFx.seek(l2);
      if (Integer.reverseBytes(this.AFx.readInt()) != 101010256L)
      {
        l2 -= 1L;
        if (l2 < l1)
          throw new ZipException("End Of Central Directory signature not found");
      }
      else
      {
        Object localObject = new byte[18];
        this.AFx.readFully((byte[])localObject);
        localObject = c.a((byte[])localObject, 18, ByteOrder.LITTLE_ENDIAN);
        int i = ((b)localObject).readShort();
        int j = ((b)localObject).readShort();
        int k = ((b)localObject).readShort() & 0xFFFF;
        int m = ((b)localObject).readShort();
        ((b)localObject).dSu();
        l1 = ((b)localObject).readInt() & 0xFFFFFFFF;
        int n = ((b)localObject).readShort() & 0xFFFF;
        if ((k != (m & 0xFFFF)) || ((i & 0xFFFF) != 0) || ((j & 0xFFFF) != 0))
          throw new ZipException("Spanned archives not supported");
        if (n > 0)
        {
          localObject = new byte[n];
          this.AFx.readFully((byte[])localObject);
          this.vGv = new String((byte[])localObject, 0, localObject.length, d.UTF_8);
        }
        BufferedInputStream localBufferedInputStream = new BufferedInputStream(new a(this.AFx, l1), 4096);
        byte[] arrayOfByte = new byte[46];
        for (j = 0; j < k; j++)
        {
          f localf = new f(arrayOfByte, localBufferedInputStream, d.UTF_8);
          if (localf.AFt >= l1)
            throw new ZipException("Local file header offset is after central directory");
          localObject = localf.name;
          if (this.AFv.put(localObject, localf) != null)
            throw new ZipException("Duplicate entry name: ".concat(String.valueOf(localObject)));
        }
        return;
      }
      continue;
      l1 = l3;
    }
  }

  public final InputStream a(f paramf)
  {
    f localf = auw(paramf.name);
    if (localf == null)
    {
      paramf = null;
      return paramf;
    }
    DataInputStream localDataInputStream;
    synchronized (this.AFx)
    {
      paramf = new com/tencent/tinker/d/a/g$a;
      paramf.<init>(???, localf.AFt);
      localDataInputStream = new java/io/DataInputStream;
      localDataInputStream.<init>(paramf);
      i = Integer.reverseBytes(localDataInputStream.readInt());
      if (i != 67324752L)
        a(this.filename, ???.length(), localf.name, localf.AFt, "Local File Header", i);
      localDataInputStream.skipBytes(2);
      i = Short.reverseBytes(localDataInputStream.readShort()) & 0xFFFF;
      if ((i & 0x1) != 0)
      {
        paramf = new java/util/zip/ZipException;
        paramf.<init>("Invalid General Purpose Bit Flag: ".concat(String.valueOf(i)));
        throw paramf;
      }
    }
    localDataInputStream.skipBytes(18);
    int i = Short.reverseBytes(localDataInputStream.readShort());
    int j = Short.reverseBytes(localDataInputStream.readShort());
    localDataInputStream.close();
    paramf.skip((i & 0xFFFF) + (j & 0xFFFF));
    if (localf.AFq == 0)
      a.a(paramf, a.a(paramf) + localf.size);
    while (true)
    {
      break;
      a.a(paramf, a.a(paramf) + localf.AFp);
    }
  }

  public final f auw(String paramString)
  {
    lO();
    if (paramString == null)
      throw new NullPointerException("entryName == null");
    f localf1 = (f)this.AFv.get(paramString);
    f localf2 = localf1;
    if (localf1 == null)
      localf2 = (f)this.AFv.get(paramString + "/");
    return localf2;
  }

  public final void close()
  {
    RandomAccessFile localRandomAccessFile = this.AFx;
    if (localRandomAccessFile != null);
    try
    {
      this.AFx = null;
      localRandomAccessFile.close();
      if (this.AFw != null)
      {
        this.AFw.delete();
        this.AFw = null;
      }
      return;
    }
    finally
    {
    }
  }

  public final Enumeration<? extends f> entries()
  {
    lO();
    return new Enumeration()
    {
      public final boolean hasMoreElements()
      {
        g.a(g.this);
        return this.aLl.hasNext();
      }
    };
  }

  public final void lO()
  {
    if (this.AFx == null)
      throw new IllegalStateException("Zip file closed");
  }

  public static final class a extends InputStream
  {
    private final RandomAccessFile AFz;
    private long bfq;
    private long xb;

    public a(RandomAccessFile paramRandomAccessFile, long paramLong)
    {
      this(paramRandomAccessFile, paramLong, paramRandomAccessFile.length());
    }

    private a(RandomAccessFile paramRandomAccessFile, long paramLong1, long paramLong2)
    {
      this.AFz = paramRandomAccessFile;
      this.xb = paramLong1;
      this.bfq = paramLong2;
    }

    public final int available()
    {
      if (this.xb < this.bfq);
      for (int i = 1; ; i = 0)
        return i;
    }

    public final int read()
    {
      return e.N(this);
    }

    public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      synchronized (this.AFz)
      {
        long l = this.bfq - this.xb;
        int i = paramInt2;
        if (paramInt2 > l)
          i = (int)l;
        this.AFz.seek(this.xb);
        paramInt1 = this.AFz.read(paramArrayOfByte, paramInt1, i);
        if (paramInt1 > 0)
        {
          this.xb += paramInt1;
          return paramInt1;
        }
        paramInt1 = -1;
      }
    }

    public final long skip(long paramLong)
    {
      long l = paramLong;
      if (paramLong > this.bfq - this.xb)
        l = this.bfq - this.xb;
      this.xb += l;
      return l;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.d.a.g
 * JD-Core Version:    0.6.2
 */