package com.tencent.mm.d.a;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class x$2
  implements ComponentCallbacks2
{
  x$2(x paramx)
  {
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
  }

  public final void onLowMemory()
  {
    AppMethodBeat.i(113921);
    ab.i(x.access$100(), "onLowMemory");
    this.ciU.gr(2);
    ab.i(x.access$100(), "onLowMemory notification with CRITICAL end");
    AppMethodBeat.o(113921);
  }

  public final void onTrimMemory(int paramInt)
  {
    AppMethodBeat.i(113920);
    ab.i(x.access$100(), "onTrimMemory level = [%d]", new Object[] { Integer.valueOf(paramInt) });
    Integer localInteger = x.gt(paramInt);
    if (localInteger != null)
      this.ciU.gr(localInteger.intValue());
    AppMethodBeat.o(113920);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.x.2
 * JD-Core Version:    0.6.2
 */