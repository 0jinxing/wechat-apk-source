package com.tencent.mm.plugin.collect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

public final class f
  implements com.tencent.mm.ai.f
{
  public static f kBJ;
  private final String TAG;
  public Map<l, f.a> jxd;

  public f()
  {
    AppMethodBeat.i(40932);
    this.TAG = "MicroMsg.F2fGetPayUrlManager";
    this.jxd = new HashMap();
    AppMethodBeat.o(40932);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(40933);
    l locall;
    if ((paramm instanceof l))
    {
      locall = (l)paramm;
      paramString = (f.a)this.jxd.get(paramm);
      if (paramString == null)
      {
        ab.w("MicroMsg.F2fGetPayUrlManager", "no match callback");
        AppMethodBeat.o(40933);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label92;
      paramString.a(true, locall.kCk);
    }
    while (true)
    {
      this.jxd.remove(paramm);
      AppMethodBeat.o(40933);
      break;
      label92: ab.e("MicroMsg.F2fGetPayUrlManager", "net error: %s", new Object[] { locall });
      paramString.a(false, locall.kCk);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.f
 * JD-Core Version:    0.6.2
 */