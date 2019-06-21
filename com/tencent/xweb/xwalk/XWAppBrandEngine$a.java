package com.tencent.xweb.xwalk;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.TimerTask;

public final class XWAppBrandEngine$a extends TimerTask
{
  public int ARN;
  public boolean ARO;

  public XWAppBrandEngine$a(XWAppBrandEngine paramXWAppBrandEngine, int paramInt, boolean paramBoolean)
  {
    this.ARN = paramInt;
    this.ARO = paramBoolean;
  }

  public final void run()
  {
    AppMethodBeat.i(4167);
    if (XWAppBrandEngine.a(this.ARP))
      if (this.ARO)
        AppMethodBeat.o(4167);
    while (true)
    {
      return;
      synchronized (this.ARP.ARL)
      {
        ArrayList localArrayList2 = this.ARP.ARL;
        XWAppBrandEngine.a.1 local1 = new com/tencent/xweb/xwalk/XWAppBrandEngine$a$1;
        local1.<init>(this);
        localArrayList2.add(local1);
        AppMethodBeat.o(4167);
      }
      XWAppBrandEngine.c(this.ARP).post(new XWAppBrandEngine.a.2(this));
      AppMethodBeat.o(4167);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.XWAppBrandEngine.a
 * JD-Core Version:    0.6.2
 */