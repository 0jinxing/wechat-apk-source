package com.google.android.exoplayer2.h;

import android.net.Uri;
import com.google.android.exoplayer2.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class i
{
  public final long bgY;
  public final byte[] bpP;
  public final long bpQ;
  public final int flags;
  public final String key;
  public final long position;
  public final Uri uri;

  public i(Uri paramUri)
  {
    this(paramUri, (byte)0);
  }

  public i(Uri paramUri, byte paramByte)
  {
    this(paramUri, 0L, 0L, -1L, null, 1);
  }

  private i(Uri paramUri, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt)
  {
    this(paramUri, null, paramLong1, paramLong2, paramLong3, paramString, paramInt);
  }

  public i(Uri paramUri, long paramLong1, long paramLong2, String paramString)
  {
    this(paramUri, paramLong1, paramLong1, paramLong2, paramString, 0);
    AppMethodBeat.i(95801);
    AppMethodBeat.o(95801);
  }

  private i(Uri paramUri, byte[] paramArrayOfByte, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt)
  {
    AppMethodBeat.i(95802);
    if (paramLong1 >= 0L)
    {
      bool = true;
      a.checkArgument(bool);
      if (paramLong2 < 0L)
        break label113;
      bool = true;
      label33: a.checkArgument(bool);
      if ((paramLong3 <= 0L) && (paramLong3 != -1L))
        break label119;
    }
    label113: label119: for (boolean bool = true; ; bool = false)
    {
      a.checkArgument(bool);
      this.uri = paramUri;
      this.bpP = paramArrayOfByte;
      this.bpQ = paramLong1;
      this.position = paramLong2;
      this.bgY = paramLong3;
      this.key = paramString;
      this.flags = paramInt;
      AppMethodBeat.o(95802);
      return;
      bool = false;
      break;
      bool = false;
      break label33;
    }
  }

  private i k(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95805);
    i locali;
    if ((paramLong1 == 0L) && (this.bgY == paramLong2))
    {
      AppMethodBeat.o(95805);
      locali = this;
    }
    while (true)
    {
      return locali;
      locali = new i(this.uri, this.bpP, this.bpQ + paramLong1, this.position + paramLong1, paramLong2, this.key, this.flags);
      AppMethodBeat.o(95805);
    }
  }

  public final i am(long paramLong)
  {
    long l = -1L;
    AppMethodBeat.i(95804);
    if (this.bgY == -1L);
    while (true)
    {
      i locali = k(paramLong, l);
      AppMethodBeat.o(95804);
      return locali;
      l = this.bgY - paramLong;
    }
  }

  public final boolean to()
  {
    boolean bool = true;
    if ((this.flags & 0x1) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(95803);
    String str = "DataSpec[" + this.uri + ", " + Arrays.toString(this.bpP) + ", " + this.bpQ + ", " + this.position + ", " + this.bgY + ", " + this.key + ", " + this.flags + "]";
    AppMethodBeat.o(95803);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.i
 * JD-Core Version:    0.6.2
 */