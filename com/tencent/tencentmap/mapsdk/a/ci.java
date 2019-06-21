package com.tencent.tencentmap.mapsdk.a;

import android.location.Location;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ci
{
  bv a = null;

  public ci(bv parambv)
  {
    this.a = parambv;
  }

  public void a()
  {
    if (this.a != null)
      this.a = null;
  }

  public final Location b()
  {
    AppMethodBeat.i(100937);
    Location localLocation;
    if (this.a != null)
    {
      localLocation = this.a.d();
      AppMethodBeat.o(100937);
    }
    while (true)
    {
      return localLocation;
      localLocation = null;
      AppMethodBeat.o(100937);
    }
  }

  public void c()
  {
    AppMethodBeat.i(100938);
    if (this.a != null)
      this.a.a();
    AppMethodBeat.o(100938);
  }

  public void d()
  {
    AppMethodBeat.i(100939);
    if (this.a != null)
      this.a.b();
    AppMethodBeat.o(100939);
  }

  public boolean e()
  {
    AppMethodBeat.i(100940);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.c();
      AppMethodBeat.o(100940);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(100940);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ci
 * JD-Core Version:    0.6.2
 */