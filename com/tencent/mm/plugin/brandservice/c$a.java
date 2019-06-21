package com.tencent.mm.plugin.brandservice;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class c$a
  implements Runnable
{
  c$a(long paramLong, String paramString, int paramInt1, int paramInt2, Object[] paramArrayOfObject)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14762);
    long l = this.jKi;
    String str = bo.bc(this.jKj, "");
    j.o(str, "Util.nullAs(url, \"\")");
    int i = this.jKk;
    int j = this.jKl;
    Object[] arrayOfObject = this.jKm;
    PreloadLogic.a(l, str, i, j, Arrays.copyOf(arrayOfObject, arrayOfObject.length));
    AppMethodBeat.o(14762);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.c.a
 * JD-Core Version:    0.6.2
 */