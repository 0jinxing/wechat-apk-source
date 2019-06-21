package com.tencent.tinker.d.a;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.zip.ZipException;

public final class h extends FilterOutputStream
{
  public static final byte[] AFA = new byte[0];
  private static final byte[] AFB = { -1, -1, -1, -1 };
  private final HashSet<String> AFC = new HashSet();
  private final boolean AFD = false;
  public byte[] AFE = AFA;
  private int AFF = 8;
  private ByteArrayOutputStream AFG = new ByteArrayOutputStream();
  private f AFH;
  private byte[] AFI;
  private byte[] AFJ;
  private boolean AFK;
  private long xb = 0L;

  public h(OutputStream paramOutputStream)
  {
    this(paramOutputStream, (byte)0);
  }

  private h(OutputStream paramOutputStream, byte paramByte)
  {
    super(paramOutputStream);
  }

  public static void G(String paramString, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length > 65535)
      throw new IllegalArgumentException(paramString + " too long in UTF-8:" + paramArrayOfByte.length + " bytes");
  }

  private static int c(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write(paramInt & 0xFF);
    paramOutputStream.write(paramInt >> 8 & 0xFF);
    return paramInt;
  }

  private static long c(OutputStream paramOutputStream, long paramLong)
  {
    paramOutputStream.write((int)(0xFF & paramLong));
    paramOutputStream.write((int)(paramLong >> 8) & 0xFF);
    paramOutputStream.write((int)(paramLong >> 16) & 0xFF);
    paramOutputStream.write((int)(paramLong >> 24) & 0xFF);
    return paramLong;
  }

  private void dSw()
  {
    if (this.AFG == null)
      throw new IOException("Stream is closed");
  }

  public final void b(f paramf)
  {
    if (this.AFH != null)
      closeEntry();
    int i = paramf.AFq;
    if (i == -1)
      i = this.AFF;
    while (true)
    {
      if (i == 0)
      {
        if (paramf.AFp == -1L)
          paramf.AFp = paramf.size;
        while (paramf.AFe == -1L)
        {
          throw new ZipException("STORED entry missing CRC");
          if (paramf.size == -1L)
            paramf.setSize(paramf.AFp);
        }
        if (paramf.size == -1L)
          throw new ZipException("STORED entry missing size");
        if (paramf.size != paramf.AFp)
          throw new ZipException("STORED entry size/compressed size mismatch");
      }
      dSw();
      paramf.vGv = null;
      paramf.AFs = null;
      paramf.oyB = 40691;
      paramf.AFr = 18698;
      this.AFI = paramf.name.getBytes(d.UTF_8);
      G("Name", this.AFI);
      this.AFJ = AFA;
      if (paramf.vGv != null)
      {
        this.AFJ = paramf.vGv.getBytes(d.UTF_8);
        G("Comment", this.AFJ);
      }
      paramf.setMethod(i);
      this.AFH = paramf;
      this.AFH.AFt = this.xb;
      this.AFC.add(this.AFH.name);
      int j;
      if (i == 0)
      {
        j = 0;
        c(this.out, 67324752L);
        c(this.out, 20);
        c(this.out, j | 0x800);
        c(this.out, i);
        c(this.out, this.AFH.oyB);
        c(this.out, this.AFH.AFr);
        if (i != 0)
          break label467;
        c(this.out, this.AFH.AFe);
        c(this.out, this.AFH.size);
        c(this.out, this.AFH.size);
        label386: c(this.out, this.AFI.length);
        if (this.AFH.AFs == null)
          break label497;
        c(this.out, this.AFH.AFs.length);
      }
      while (true)
      {
        this.out.write(this.AFI);
        if (this.AFH.AFs != null)
          this.out.write(this.AFH.AFs);
        return;
        j = 8;
        break;
        label467: c(this.out, 0L);
        c(this.out, 0L);
        c(this.out, 0L);
        break label386;
        label497: c(this.out, 0);
      }
    }
  }

  public final void close()
  {
    int i;
    if (this.out != null)
    {
      if (this.out == null)
        throw new IOException("Stream is closed");
      if (this.AFG != null)
      {
        if (this.AFC.isEmpty())
          throw new ZipException("No entries");
        if (this.AFH != null)
          closeEntry();
        i = this.AFG.size();
        c(this.AFG, 101010256L);
        c(this.AFG, 0);
        c(this.AFG, 0);
        if (!this.AFK)
          break label209;
        c(this.AFG, 65535);
        c(this.AFG, 65535);
        c(this.AFG, -1L);
        c(this.AFG, -1L);
      }
    }
    while (true)
    {
      c(this.AFG, this.AFE.length);
      if (this.AFE.length > 0)
        this.AFG.write(this.AFE);
      this.AFG.writeTo(this.out);
      this.AFG = null;
      this.out.close();
      this.out = null;
      return;
      label209: c(this.AFG, this.AFC.size());
      c(this.AFG, this.AFC.size());
      c(this.AFG, i);
      c(this.AFG, this.xb);
    }
  }

  public final void closeEntry()
  {
    dSw();
    if (this.AFH == null)
      return;
    long l = 30L;
    if (this.AFH.AFq != 0)
    {
      l = 46L;
      c(this.out, 134695760L);
      c(this.out, this.AFH.AFe);
      c(this.out, this.AFH.AFp);
      c(this.out, this.AFH.size);
    }
    int i;
    if (this.AFH.AFq == 0)
    {
      i = 0;
      label98: c(this.AFG, 33639248L);
      c(this.AFG, 20);
      c(this.AFG, 20);
      c(this.AFG, i | 0x800);
      c(this.AFG, this.AFH.AFq);
      c(this.AFG, this.AFH.oyB);
      c(this.AFG, this.AFH.AFr);
      c(this.AFG, this.AFH.AFe);
      if (this.AFH.AFq != 8)
        break label444;
      l += this.AFH.AFp;
      label224: c(this.AFG, this.AFH.AFp);
      c(this.AFG, this.AFH.size);
      l += c(this.AFG, this.AFI.length);
      if (this.AFH.AFs == null)
        break label457;
      l += c(this.AFG, this.AFH.AFs.length);
    }
    while (true)
    {
      c(this.AFG, this.AFJ.length);
      c(this.AFG, 0);
      c(this.AFG, 0);
      c(this.AFG, 0L);
      c(this.AFG, this.AFH.AFt);
      this.AFG.write(this.AFI);
      this.AFI = null;
      if (this.AFH.AFs != null)
        this.AFG.write(this.AFH.AFs);
      this.xb = (l + this.xb);
      if (this.AFJ.length > 0)
      {
        this.AFG.write(this.AFJ);
        this.AFJ = AFA;
      }
      this.AFH = null;
      break;
      i = 8;
      break label98;
      label444: l += this.AFH.size;
      break label224;
      label457: c(this.AFG, 0);
    }
  }

  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a.aH(paramArrayOfByte.length, paramInt1, paramInt2);
    if (this.AFH == null)
      throw new ZipException("No active entry");
    this.out.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.d.a.h
 * JD-Core Version:    0.6.2
 */