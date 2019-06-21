package android.support.v7.d;

public final class c
{
  public static final c XW;
  public static final c XX;
  public static final c XY;
  public static final c XZ;
  public static final c Ya;
  public static final c Yb;
  public final float[] Yc = new float[3];
  public final float[] Yd = new float[3];
  public final float[] Ye = new float[3];
  public boolean Yf = true;

  static
  {
    c localc = new c();
    XW = localc;
    c(localc);
    d(XW);
    localc = new c();
    XX = localc;
    b(localc);
    d(XX);
    localc = new c();
    XY = localc;
    a(localc);
    d(XY);
    localc = new c();
    XZ = localc;
    c(localc);
    e(XZ);
    localc = new c();
    Ya = localc;
    b(localc);
    e(Ya);
    localc = new c();
    Yb = localc;
    a(localc);
    e(Yb);
  }

  c()
  {
    e(this.Yc);
    e(this.Yd);
    this.Ye[0] = 0.24F;
    this.Ye[1] = 0.52F;
    this.Ye[2] = 0.24F;
  }

  private static void a(c paramc)
  {
    paramc.Yd[1] = 0.26F;
    paramc.Yd[2] = 0.45F;
  }

  private static void b(c paramc)
  {
    paramc.Yd[0] = 0.3F;
    paramc.Yd[1] = 0.5F;
    paramc.Yd[2] = 0.7F;
  }

  private static void c(c paramc)
  {
    paramc.Yd[0] = 0.55F;
    paramc.Yd[1] = 0.74F;
  }

  private static void d(c paramc)
  {
    paramc.Yc[0] = 0.35F;
    paramc.Yc[1] = 1.0F;
  }

  private static void e(c paramc)
  {
    paramc.Yc[1] = 0.3F;
    paramc.Yc[2] = 0.4F;
  }

  private static void e(float[] paramArrayOfFloat)
  {
    paramArrayOfFloat[0] = 0.0F;
    paramArrayOfFloat[1] = 0.5F;
    paramArrayOfFloat[2] = 1.0F;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.d.c
 * JD-Core Version:    0.6.2
 */