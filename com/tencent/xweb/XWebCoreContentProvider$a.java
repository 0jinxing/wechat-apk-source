package com.tencent.xweb;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.util.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xwalk.core.Log;

public final class XWebCoreContentProvider$a
{
  private static List<XWebCoreContentProvider.b> ANf;
  private static final Object ANg;

  static
  {
    AppMethodBeat.i(3946);
    ANf = new ArrayList();
    ANg = new Object();
    AppMethodBeat.o(3946);
  }

  public static void a(XWebCoreContentProvider.b paramb)
  {
    AppMethodBeat.i(3944);
    synchronized (ANg)
    {
      ANf.add(paramb);
      AppMethodBeat.o(3944);
      return;
    }
  }

  public static void dUn()
  {
    AppMethodBeat.i(3945);
    Log.i("XWebCoreContentProvider", "CachedInfoMgr process cached info");
    synchronized (ANg)
    {
      Iterator localIterator = ANf.iterator();
      if (localIterator.hasNext())
      {
        XWebCoreContentProvider.b localb = (XWebCoreContentProvider.b)localIterator.next();
        f.bX(localb.key, localb.value);
      }
    }
    ANf.clear();
    AppMethodBeat.o(3945);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.XWebCoreContentProvider.a
 * JD-Core Version:    0.6.2
 */