package com.tencent.mm.game.report.api;

public abstract class b
{
  public static b eBF;

  public abstract void a(long paramLong, a parama);

  public abstract void a(String paramString1, int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, String paramString2, int paramInt3, int paramInt4, String paramString3, long paramLong4, int paramInt5, long paramLong5, String paramString4, int paramInt6);

  public final void a(String paramString1, int paramInt1, int paramInt2, long paramLong, String paramString2, String paramString3)
  {
    a(paramString1, paramInt1, paramInt2, 0L, 0L, 0L, "", 0, 0, paramString2, 0L, 0, paramLong, paramString3, 0);
  }

  public abstract void a(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5);

  public final void a(String paramString1, int paramInt1, long paramLong1, String paramString2, long paramLong2, int paramInt2)
  {
    a(paramString1, 0, paramInt1, 0L, 0L, 0L, "", 0, 0, paramString2, paramLong2, 0, paramLong1, "", paramInt2);
  }

  public abstract a eZ(long paramLong);

  public abstract void j(String paramString, long paramLong);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.game.report.api.b
 * JD-Core Version:    0.6.2
 */