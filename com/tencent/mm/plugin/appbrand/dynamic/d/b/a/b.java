package com.tencent.mm.plugin.appbrand.dynamic.d.b.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
  implements e<String>
{
  private String hnX;

  public final boolean Ai(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(10893);
    if (this.hnX == null)
      AppMethodBeat.o(10893);
    while (true)
    {
      return bool;
      if ((!TextUtils.isEmpty(paramString)) && (paramString.hashCode() != this.hnX.hashCode()))
      {
        AppMethodBeat.o(10893);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(10893);
      }
    }
  }

  public final void F(Runnable paramRunnable)
  {
    AppMethodBeat.i(10894);
    paramRunnable.run();
    AppMethodBeat.o(10894);
  }

  public final void a(com.tencent.mm.plugin.appbrand.dynamic.d.b.b paramb)
  {
    AppMethodBeat.i(10892);
    paramb.run();
    AppMethodBeat.o(10892);
  }

  public final void azU()
  {
  }

  public final int azV()
  {
    return 1;
  }

  public final void reset()
  {
    this.hnX = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.b.a.b
 * JD-Core Version:    0.6.2
 */