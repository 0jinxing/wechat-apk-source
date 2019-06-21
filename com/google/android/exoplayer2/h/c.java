package com.google.android.exoplayer2.h;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class c
  implements f
{
  private InputStream azC;
  private final AssetManager azj;
  private final u<? super c> bpJ;
  private long bpK;
  private boolean opened;
  private Uri uri;

  public c(Context paramContext, u<? super c> paramu)
  {
    AppMethodBeat.i(95787);
    this.azj = paramContext.getAssets();
    this.bpJ = paramu;
    AppMethodBeat.o(95787);
  }

  public final long a(i parami)
  {
    AppMethodBeat.i(95788);
    while (true)
    {
      String str1;
      try
      {
        this.uri = parami.uri;
        str1 = this.uri.getPath();
        if (str1.startsWith("/android_asset/"))
        {
          str2 = str1.substring(15);
          this.azC = this.azj.open(str2, 1);
          if (this.azC.skip(parami.position) >= parami.position)
            break;
          parami = new java/io/EOFException;
          parami.<init>();
          AppMethodBeat.o(95788);
          throw parami;
        }
      }
      catch (IOException parami)
      {
        parami = new c.a(parami);
        AppMethodBeat.o(95788);
        throw parami;
      }
      String str2 = str1;
      if (str1.startsWith("/"))
        str2 = str1.substring(1);
    }
    if (parami.bgY != -1L)
      this.bpK = parami.bgY;
    while (true)
    {
      this.opened = true;
      if (this.bpJ != null)
        this.bpJ.tq();
      long l = this.bpK;
      AppMethodBeat.o(95788);
      return l;
      this.bpK = this.azC.available();
      if (this.bpK == 2147483647L)
        this.bpK = -1L;
    }
  }

  public final void close()
  {
    AppMethodBeat.i(95790);
    this.uri = null;
    while (true)
    {
      try
      {
        if (this.azC != null)
          this.azC.close();
        return;
      }
      catch (IOException localIOException)
      {
        c.a locala = new com/google/android/exoplayer2/h/c$a;
        locala.<init>(localIOException);
        AppMethodBeat.o(95790);
        throw locala;
      }
      finally
      {
        this.azC = null;
        if (this.opened)
        {
          this.opened = false;
          if (this.bpJ != null)
            this.bpJ.tr();
        }
        AppMethodBeat.o(95790);
      }
      AppMethodBeat.o(95790);
    }
  }

  public final Uri getUri()
  {
    return this.uri;
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = -1;
    AppMethodBeat.i(95789);
    if (paramInt2 == 0)
    {
      paramInt1 = 0;
      AppMethodBeat.o(95789);
    }
    while (true)
    {
      return paramInt1;
      if (this.bpK == 0L)
      {
        AppMethodBeat.o(95789);
        paramInt1 = i;
      }
      else
      {
        try
        {
          if (this.bpK == -1L);
          while (true)
          {
            paramInt1 = this.azC.read(paramArrayOfByte, paramInt1, paramInt2);
            if (paramInt1 != -1)
              break label147;
            if (this.bpK == -1L)
              break;
            paramArrayOfByte = new c.a(new EOFException());
            AppMethodBeat.o(95789);
            throw paramArrayOfByte;
            long l = Math.min(this.bpK, paramInt2);
            paramInt2 = (int)l;
          }
        }
        catch (IOException paramArrayOfByte)
        {
          paramArrayOfByte = new c.a(paramArrayOfByte);
          AppMethodBeat.o(95789);
          throw paramArrayOfByte;
        }
        AppMethodBeat.o(95789);
        paramInt1 = i;
        continue;
        label147: if (this.bpK != -1L)
          this.bpK -= paramInt1;
        if (this.bpJ != null)
          this.bpJ.eK(paramInt1);
        AppMethodBeat.o(95789);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.c
 * JD-Core Version:    0.6.2
 */