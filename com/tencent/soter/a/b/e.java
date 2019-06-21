package com.tencent.soter.a.b;

import com.tencent.soter.core.c.f;
import com.tencent.soter.core.c.g;

public abstract class e<T> extends f
{
  public T AvM = null;

  e()
  {
    super(-1);
  }

  protected e(int paramInt)
  {
    this(paramInt, "", null);
  }

  protected e(int paramInt, String paramString)
  {
    this(paramInt, paramString, null);
  }

  protected e(int paramInt, String paramString, T paramT)
  {
    super(paramInt, paramString);
    switch (paramInt)
    {
    case 11:
    case 12:
    case 13:
    case 15:
    case 16:
    case 20:
    case 21:
    case 22:
    default:
    case 8:
    case 9:
    case 10:
    case 14:
    case 17:
    case 18:
    case 19:
    case 23:
    }
    while (true)
    {
      if (!g.isNullOrNil(paramString))
        this.aIm = paramString;
      this.AvM = paramT;
      return;
      this.aIm = "get support soter failed remotely";
      continue;
      this.aIm = "upload app secure key";
      continue;
      this.aIm = "upload auth key failed";
      continue;
      this.aIm = "not initialized yet. please make sure you've already called SoterWrapperApi.init(...) and call backed";
      continue;
      this.aIm = "context instance already released. should not happen normally, you can try to call again";
      continue;
      this.aIm = "there must be at least 1 biometric enrolled in system to complete this process. please check it previously";
      continue;
      this.aIm = "get challenge failed";
      continue;
      this.aIm = "upload or verify signature in server side failed";
    }
  }

  protected e(T paramT)
  {
    this(0, "", paramT);
  }

  public String toString()
  {
    if (this.AvM == null);
    for (String str = super.toString(); ; str = String.format("total: %s, extData: %s", new Object[] { super.toString(), this.AvM.toString() }))
      return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.b.e
 * JD-Core Version:    0.6.2
 */