package com.tencent.mm.plugin.emoji.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.da;
import com.tencent.mm.sdk.b.a;
import java.util.HashMap;
import java.util.Map;

public final class e
{
  private da kVn;
  public final Map<String, Integer> kVo;

  public e()
  {
    AppMethodBeat.i(53045);
    this.kVo = new HashMap();
    this.kVn = new da();
    AppMethodBeat.o(53045);
  }

  public final void g(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(53046);
    this.kVn.cwf.cwg = paramString1;
    this.kVn.cwf.status = paramInt1;
    this.kVn.cwf.progress = paramInt2;
    this.kVn.cwf.cwh = paramString2;
    a.xxA.m(this.kVn);
    if (paramInt1 == 6)
      if ((paramInt2 < 0) || (paramInt2 >= 100))
      {
        this.kVo.remove(paramString1);
        AppMethodBeat.o(53046);
      }
    while (true)
    {
      return;
      this.kVo.put(paramString1, Integer.valueOf(paramInt2));
      AppMethodBeat.o(53046);
      continue;
      this.kVo.remove(paramString1);
      AppMethodBeat.o(53046);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.model.e
 * JD-Core Version:    0.6.2
 */