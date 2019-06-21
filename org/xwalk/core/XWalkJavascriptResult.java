package org.xwalk.core;

public abstract interface XWalkJavascriptResult
{
  public abstract void cancel();

  public abstract void confirm();

  public abstract void confirmWithResult(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkJavascriptResult
 * JD-Core Version:    0.6.2
 */