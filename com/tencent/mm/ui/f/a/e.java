package com.tencent.mm.ui.f.a;

public final class e extends Throwable
{
  public int mErrorCode = 0;
  public String zxP;

  public e(String paramString)
  {
    super(paramString);
  }

  public e(String paramString1, String paramString2, int paramInt)
  {
    super(paramString1);
    this.zxP = paramString2;
    this.mErrorCode = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.a.e
 * JD-Core Version:    0.6.2
 */