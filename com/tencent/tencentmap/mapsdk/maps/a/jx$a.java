package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.cs;
import com.tencent.tencentmap.mapsdk.a.cu.c;
import java.util.List;

class jx$a
  implements Runnable
{
  private List<cs> b;

  public jx$a(List<cs> paramList)
  {
    Object localObject;
    this.b = localObject;
  }

  public void run()
  {
    AppMethodBeat.i(100137);
    jx.a(this.a, this.a.b);
    jx.a(this.a, this.a.c);
    jx.a(this.a).a(this.b);
    if (jx.b(this.a) != null)
      jx.b(this.a).a();
    jx.d(this.a).b().j(jx.c(this.a));
    AppMethodBeat.o(100137);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jx.a
 * JD-Core Version:    0.6.2
 */