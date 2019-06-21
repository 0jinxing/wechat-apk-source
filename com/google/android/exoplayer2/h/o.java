package com.google.android.exoplayer2.h;

public final class o extends r.a
{
  private final u<? super f> bpJ;
  private final boolean bqt;
  private final int bqu;
  private final int bqv;
  private final String userAgent;

  public o(String paramString)
  {
    this(paramString, null);
  }

  public o(String paramString, u<? super f> paramu)
  {
    this(paramString, paramu, (byte)0);
  }

  private o(String paramString, u<? super f> paramu, byte paramByte)
  {
    this.userAgent = paramString;
    this.bpJ = paramu;
    this.bqu = 8000;
    this.bqv = 8000;
    this.bqt = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.o
 * JD-Core Version:    0.6.2
 */