package com.google.android.exoplayer2.h;

import java.io.IOException;

public class r$c extends IOException
{
  public final i bib;
  public final int type;

  public r$c(IOException paramIOException, i parami, int paramInt)
  {
    super(paramIOException);
    this.bib = parami;
    this.type = paramInt;
  }

  public r$c(String paramString, i parami)
  {
    super(paramString);
    this.bib = parami;
    this.type = 1;
  }

  public r$c(String paramString, IOException paramIOException, i parami)
  {
    super(paramString, paramIOException);
    this.bib = parami;
    this.type = 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.r.c
 * JD-Core Version:    0.6.2
 */