package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

public class jr extends hz
  implements jt.b
{
  private jq a;

  public jr(jq paramjq)
  {
    AppMethodBeat.i(100099);
    this.a = paramjq;
    paramjq.a();
    AppMethodBeat.o(100099);
  }

  public void a(GL10 paramGL10)
  {
  }

  public boolean a()
  {
    return false;
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void b()
  {
  }

  public void b_()
  {
    AppMethodBeat.i(100102);
    if (this.a != null)
      this.a.b_();
    AppMethodBeat.o(100102);
  }

  public void c()
  {
  }

  public void d()
  {
    AppMethodBeat.i(100100);
    e();
    AppMethodBeat.o(100100);
  }

  public void e()
  {
    AppMethodBeat.i(100101);
    if (this.a != null)
      this.a.b();
    AppMethodBeat.o(100101);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jr
 * JD-Core Version:    0.6.2
 */