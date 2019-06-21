package com.tencent.mm.pluginsdk.g.a.c;

public abstract class a$a<T extends a>
{
  protected String cvZ;
  protected long fRS;
  protected int networkType;
  protected int priority;
  protected final String url;
  protected String vdC;
  protected int vdM;

  public a$a(String paramString)
  {
    this.url = paramString;
  }

  public final a<T> KG(int paramInt)
  {
    this.networkType = paramInt;
    return this;
  }

  public final a<T> KH(int paramInt)
  {
    this.vdM = paramInt;
    return this;
  }

  public final a<T> KI(int paramInt)
  {
    this.priority = paramInt;
    return this;
  }

  public final a<T> aja(String paramString)
  {
    this.vdC = paramString;
    return this;
  }

  public final a<T> ajb(String paramString)
  {
    this.cvZ = paramString;
    return this;
  }

  public final a<T> md(long paramLong)
  {
    this.fRS = paramLong;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.a.a
 * JD-Core Version:    0.6.2
 */