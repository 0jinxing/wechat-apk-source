package com.tencent.matrix.c;

import java.util.HashSet;

public class c
{
  private final a bWx;
  private final HashSet<String> bWy = new HashSet();

  public c(a parama)
  {
    this.bWx = parama;
  }

  protected final void b(b paramb)
  {
    if (this.bWx == null)
      throw new RuntimeException("publish issue, but issue listener is null");
    this.bWx.onDetectIssue(paramb);
  }

  protected void cf(String paramString)
  {
    if (paramString == null);
    while (true)
    {
      return;
      this.bWy.add(paramString);
    }
  }

  protected boolean cg(String paramString)
  {
    if (paramString == null);
    for (boolean bool = false; ; bool = this.bWy.contains(paramString))
      return bool;
  }

  public static abstract interface a
  {
    public abstract void onDetectIssue(b paramb);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.c.c
 * JD-Core Version:    0.6.2
 */