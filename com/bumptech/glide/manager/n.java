package com.bumptech.glide.manager;

import com.bumptech.glide.f.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class n
{
  public final Set<b> aGR;
  public final List<b> aGS;
  public boolean isPaused;

  public n()
  {
    AppMethodBeat.i(92408);
    this.aGR = Collections.newSetFromMap(new WeakHashMap());
    this.aGS = new ArrayList();
    AppMethodBeat.o(92408);
  }

  public final boolean a(b paramb, boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(92409);
    if (paramb == null)
    {
      AppMethodBeat.o(92409);
      return bool2;
    }
    boolean bool3 = this.aGR.remove(paramb);
    bool2 = bool1;
    if (!this.aGS.remove(paramb))
      if (!bool3)
        break label87;
    label87: for (bool2 = bool1; ; bool2 = false)
    {
      if (bool2)
      {
        paramb.clear();
        if (paramBoolean)
          paramb.recycle();
      }
      AppMethodBeat.o(92409);
      break;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(92410);
    String str = super.toString() + "{numRequests=" + this.aGR.size() + ", isPaused=" + this.isPaused + "}";
    AppMethodBeat.o(92410);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.manager.n
 * JD-Core Version:    0.6.2
 */