package com.tencent.mm.app;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

public final class n
{
  public static n ceT;
  public boolean ceU;
  public ak ceV;

  public n()
  {
    AppMethodBeat.i(15386);
    this.ceV = new n.1(this, Looper.getMainLooper());
    AppMethodBeat.o(15386);
  }

  public static n Bw()
  {
    AppMethodBeat.i(15387);
    if (ceT == null)
      ceT = new n();
    n localn = ceT;
    AppMethodBeat.o(15387);
    return localn;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.n
 * JD-Core Version:    0.6.2
 */