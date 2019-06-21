package com.tencent.mm.plugin.fts.a;

public abstract interface i extends Comparable<i>
{
  public abstract String ck(String paramString, int paramInt);

  public abstract void create();

  public abstract void destroy();

  public abstract String getName();

  public abstract int getPriority();

  public abstract int getType();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.i
 * JD-Core Version:    0.6.2
 */