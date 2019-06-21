package com.tencent.smtt.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class c
  implements Closeable
{
  private final RandomAccessFile a;
  private final File b;
  private final byte[] c;
  private boolean d;

  public c(File paramFile)
  {
    AppMethodBeat.i(65189);
    this.c = new byte[8];
    this.b = paramFile;
    this.a = new RandomAccessFile(this.b, "r");
    AppMethodBeat.o(65189);
  }

  public c(String paramString)
  {
    this(new File(paramString));
    AppMethodBeat.i(65188);
    AppMethodBeat.o(65188);
  }

  public final int a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65191);
    int i = this.a.read(paramArrayOfByte);
    AppMethodBeat.o(65191);
    return i;
  }

  public final int a(char[] paramArrayOfChar)
  {
    AppMethodBeat.i(65192);
    byte[] arrayOfByte = new byte[paramArrayOfChar.length];
    int i = this.a.read(arrayOfByte);
    for (int j = 0; j < paramArrayOfChar.length; j++)
      paramArrayOfChar[j] = ((char)(char)arrayOfByte[j]);
    AppMethodBeat.o(65192);
    return i;
  }

  public final short a()
  {
    AppMethodBeat.i(65193);
    int i = this.a.readShort();
    if (this.d)
    {
      i = (short)((i & 0xFF00) >>> 8 | (i & 0xFF) << 8);
      AppMethodBeat.o(65193);
    }
    for (int j = i; ; j = i)
    {
      return j;
      AppMethodBeat.o(65193);
    }
  }

  public void a(long paramLong)
  {
    AppMethodBeat.i(65190);
    this.a.seek(paramLong);
    AppMethodBeat.o(65190);
  }

  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public final int b()
  {
    AppMethodBeat.i(65194);
    int i = this.a.readInt();
    if (this.d)
    {
      i = (i & 0xFF000000) >>> 24 | ((i & 0xFF) << 24 | (0xFF00 & i) << 8 | (0xFF0000 & i) >>> 8);
      AppMethodBeat.o(65194);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(65194);
    }
  }

  public final long c()
  {
    AppMethodBeat.i(65195);
    long l;
    if (this.d)
    {
      this.a.readFully(this.c, 0, 8);
      l = this.c[7] << 56 | (this.c[6] & 0xFF) << 48 | (this.c[5] & 0xFF) << 40 | (this.c[4] & 0xFF) << 32 | (this.c[3] & 0xFF) << 24 | (this.c[2] & 0xFF) << 16 | (this.c[1] & 0xFF) << 8 | this.c[0] & 0xFF;
      AppMethodBeat.o(65195);
    }
    while (true)
    {
      return l;
      l = this.a.readLong();
      AppMethodBeat.o(65195);
    }
  }

  public void close()
  {
    AppMethodBeat.i(65196);
    try
    {
      this.a.close();
      AppMethodBeat.o(65196);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        AppMethodBeat.o(65196);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.c
 * JD-Core Version:    0.6.2
 */