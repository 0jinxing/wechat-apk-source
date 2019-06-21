package com.google.android.exoplayer2.h;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class e
  implements f
{
  private InputStream azC;
  private final u<? super e> bpJ;
  private long bpK;
  private final ContentResolver bpL;
  private AssetFileDescriptor bpM;
  private boolean opened;
  private Uri uri;

  public e(Context paramContext, u<? super e> paramu)
  {
    AppMethodBeat.i(95791);
    this.bpL = paramContext.getContentResolver();
    this.bpJ = paramu;
    AppMethodBeat.o(95791);
  }

  public final long a(i parami)
  {
    AppMethodBeat.i(95792);
    try
    {
      this.uri = parami.uri;
      this.bpM = this.bpL.openAssetFileDescriptor(this.uri, "r");
      if (this.bpM == null)
      {
        parami = new java/io/FileNotFoundException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("Could not open file descriptor for: ");
        parami.<init>(this.uri);
        AppMethodBeat.o(95792);
        throw parami;
      }
    }
    catch (IOException parami)
    {
      parami = new e.a(parami);
      AppMethodBeat.o(95792);
      throw parami;
    }
    Object localObject = new java/io/FileInputStream;
    ((FileInputStream)localObject).<init>(this.bpM.getFileDescriptor());
    this.azC = ((InputStream)localObject);
    long l1 = this.bpM.getStartOffset();
    long l2 = this.azC.skip(parami.position + l1) - l1;
    if (l2 != parami.position)
    {
      parami = new java/io/EOFException;
      parami.<init>();
      AppMethodBeat.o(95792);
      throw parami;
    }
    if (parami.bgY != -1L)
      this.bpK = parami.bgY;
    while (true)
    {
      this.opened = true;
      if (this.bpJ != null)
        this.bpJ.tq();
      l1 = this.bpK;
      AppMethodBeat.o(95792);
      return l1;
      l1 = this.bpM.getLength();
      if (l1 == -1L)
      {
        this.bpK = this.azC.available();
        if (this.bpK == 0L)
          this.bpK = -1L;
      }
      else
      {
        this.bpK = (l1 - l2);
      }
    }
  }

  public final void close()
  {
    AppMethodBeat.i(95794);
    this.uri = null;
    try
    {
      if (this.azC != null)
        this.azC.close();
      this.azC = null;
      while (true)
      {
        try
        {
          if (this.bpM != null)
            this.bpM.close();
          return;
        }
        catch (IOException localIOException1)
        {
          e.a locala2 = new com/google/android/exoplayer2/h/e$a;
          locala2.<init>(localIOException1);
          AppMethodBeat.o(95794);
          throw locala2;
        }
        finally
        {
          this.bpM = null;
          if (this.opened)
          {
            this.opened = false;
            if (this.bpJ != null)
              this.bpJ.tr();
          }
          AppMethodBeat.o(95794);
        }
        AppMethodBeat.o(95794);
      }
    }
    catch (IOException localIOException3)
    {
      e.a locala1 = new com/google/android/exoplayer2/h/e$a;
      locala1.<init>(localIOException3);
      AppMethodBeat.o(95794);
      throw locala1;
    }
    finally
    {
      this.azC = null;
      try
      {
        if (this.bpM != null)
          this.bpM.close();
        throw localObject2;
      }
      catch (IOException localIOException2)
      {
        e.a locala3 = new com/google/android/exoplayer2/h/e$a;
        locala3.<init>(localIOException2);
        AppMethodBeat.o(95794);
        throw locala3;
      }
      finally
      {
        this.bpM = null;
        if (this.opened)
        {
          this.opened = false;
          if (this.bpJ != null)
            this.bpJ.tr();
        }
        AppMethodBeat.o(95794);
      }
    }
  }

  public final Uri getUri()
  {
    return this.uri;
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = -1;
    AppMethodBeat.i(95793);
    if (paramInt2 == 0)
    {
      paramInt1 = 0;
      AppMethodBeat.o(95793);
    }
    while (true)
    {
      return paramInt1;
      if (this.bpK == 0L)
      {
        AppMethodBeat.o(95793);
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
            paramArrayOfByte = new e.a(new EOFException());
            AppMethodBeat.o(95793);
            throw paramArrayOfByte;
            long l = Math.min(this.bpK, paramInt2);
            paramInt2 = (int)l;
          }
        }
        catch (IOException paramArrayOfByte)
        {
          paramArrayOfByte = new e.a(paramArrayOfByte);
          AppMethodBeat.o(95793);
          throw paramArrayOfByte;
        }
        AppMethodBeat.o(95793);
        paramInt1 = i;
        continue;
        label147: if (this.bpK != -1L)
          this.bpK -= paramInt1;
        if (this.bpJ != null)
          this.bpJ.eK(paramInt1);
        AppMethodBeat.o(95793);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.e
 * JD-Core Version:    0.6.2
 */