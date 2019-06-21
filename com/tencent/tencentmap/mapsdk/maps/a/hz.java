package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.tencentmap.mapsdk.a.az;
import com.tencent.tencentmap.mapsdk.a.cw;
import com.tencent.tencentmap.mapsdk.a.cx;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class hz extends az
  implements io
{
  private static AtomicInteger a = new AtomicInteger(1);
  protected boolean I = false;
  protected cx J;
  private final String b = String.valueOf(a.incrementAndGet());

  public final String A()
  {
    return this.b;
  }

  public cx B()
  {
    return this.J;
  }

  public void C()
  {
    if (this.J != null)
      this.I = false;
    c();
  }

  public void a(cw paramcw)
  {
    if (this.J != null)
      this.I = this.J.toString().equals(paramcw.toString());
    c();
  }

  public abstract void d();

  public boolean r()
  {
    return false;
  }

  public boolean y()
  {
    return false;
  }

  public void z()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hz
 * JD-Core Version:    0.6.2
 */