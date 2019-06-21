package com.tencent.mm.ui.voicesearch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

final class b$5
  implements Runnable
{
  b$5(b paramb, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(35331);
    if (b.a(this.zLA) == null)
      b.a(this.zLA, new ArrayList());
    b.a(this.zLA).clear();
    b.a(this.zLA).addAll(this.ibp);
    b.a(this.zLA).add("officialaccounts");
    b.a(this.zLA).add("helper_entry");
    AppMethodBeat.o(35331);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.b.5
 * JD-Core Version:    0.6.2
 */