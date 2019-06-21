package com.tencent.xweb.xwalk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.k.a;
import java.util.HashMap;

public final class n$a
  implements k.a
{
  public final void a(Context paramContext, HashMap<String, String> paramHashMap)
  {
    AppMethodBeat.i(85375);
    n.a(paramContext, paramHashMap);
    AppMethodBeat.o(85375);
  }

  public final boolean isBusy()
  {
    AppMethodBeat.i(85376);
    boolean bool = n.isBusy();
    AppMethodBeat.o(85376);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.n.a
 * JD-Core Version:    0.6.2
 */