package com.tencent.matrix.iocanary.a;

public final class a
{
  public final com.tencent.mrs.b.a bUG;

  private a(com.tencent.mrs.b.a parama)
  {
    this.bUG = parama;
  }

  public final String toString()
  {
    return String.format("[IOCanary.IOConfig], main_thread:%b, small_buffer:%b, repeat_read:%b, closeable_leak:%b", new Object[] { Boolean.valueOf(zb()), Boolean.valueOf(zd()), Boolean.valueOf(zc()), Boolean.valueOf(ze()) });
  }

  public final boolean zb()
  {
    return this.bUG.get(com.tencent.mrs.b.a.a.Ajo.name(), true);
  }

  public final boolean zc()
  {
    return this.bUG.get(com.tencent.mrs.b.a.a.Ajt.name(), true);
  }

  public final boolean zd()
  {
    return this.bUG.get(com.tencent.mrs.b.a.a.Ajq.name(), true);
  }

  public final boolean ze()
  {
    return this.bUG.get(com.tencent.mrs.b.a.a.Ajv.name(), true);
  }

  public static final class a
  {
    public com.tencent.mrs.b.a bUG;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.iocanary.a.a
 * JD-Core Version:    0.6.2
 */