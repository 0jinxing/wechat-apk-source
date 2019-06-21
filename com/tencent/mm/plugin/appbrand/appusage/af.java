package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.kernel.c.a;
import com.tencent.mm.plugin.appbrand.a.c;
import com.tencent.mm.sdk.e.g;
import java.util.List;

@e(c.class)
public abstract interface af extends a, g
{
  public abstract List<LocalUsageInfo> a(int paramInt, a parama);

  public abstract boolean aB(String paramString, int paramInt);

  public abstract int aC(String paramString, int paramInt);

  public abstract boolean aD(String paramString, int paramInt);

  public abstract void awX();

  public abstract int awY();

  public abstract boolean g(List<LocalUsageInfo> paramList, int paramInt);

  public abstract int getCount();

  public static enum a
  {
    static
    {
      AppMethodBeat.i(114907);
      haK = new a("DESC", 0);
      haL = new a("ASC", 1);
      haM = new a("UPATE_TIME_DESC", 2);
      haN = new a[] { haK, haL, haM };
      AppMethodBeat.o(114907);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.af
 * JD-Core Version:    0.6.2
 */