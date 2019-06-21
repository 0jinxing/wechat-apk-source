package com.tencent.mm.sdk.a;

import com.tencent.mm.sdk.platformtools.bp;

public final class b
{
  public static boolean foreground = false;
  public static String xxv = "unknow";
  private static c xxw = null;
  private static boolean xxx = false;
  private static boolean xxy = false;

  public static void A(String paramString1, String paramString2)
  {
    if (xxw != null)
      xxw.A(paramString1, paramString2);
  }

  public static void a(a parama)
  {
    if (xxw != null)
      xxw.a(parama);
  }

  public static void a(c paramc)
  {
    xxw = paramc;
  }

  public static void ame(String paramString)
  {
    xxv = paramString;
  }

  @Deprecated
  public static void amf(String paramString)
  {
    bp.anC(paramString);
  }

  public static void cE(boolean paramBoolean)
  {
    foreground = paramBoolean;
  }

  public static void dnL()
  {
  }

  @Deprecated
  public static boolean dnM()
  {
    return bp.dnM();
  }

  @Deprecated
  public static void dnN()
  {
    bp.dpK();
  }

  @Deprecated
  public static boolean dnO()
  {
    return bp.dpL();
  }

  @Deprecated
  public static String dnP()
  {
    return bp.dpM();
  }

  public static boolean dnQ()
  {
    return xxx;
  }

  public static boolean dnR()
  {
    return xxy;
  }

  public static void g(int paramInt, String paramString)
  {
    if (xxw != null)
      xxw.g(paramInt, paramString);
  }

  public static void pf(boolean paramBoolean)
  {
    xxx = paramBoolean;
  }

  public static void pg(boolean paramBoolean)
  {
    xxy = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.a.b
 * JD-Core Version:    0.6.2
 */