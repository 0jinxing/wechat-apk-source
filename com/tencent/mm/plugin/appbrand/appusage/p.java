package com.tencent.mm.plugin.appbrand.appusage;

import a.f.b.j;
import a.l;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collections;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandLocalUsageStorageNewImpl;", "Lcom/tencent/mm/sdk/storage/MStorage;", "Lcom/tencent/mm/plugin/appbrand/appusage/IAppBrandLocalUsageStorage;", "()V", "TAG", "", "add", "", "listener", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "looper", "Landroid/os/Looper;", "getCount", "", "query", "", "Lcom/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo;", "count", "remove", "removeUsage", "", "username", "versionType", "plugin-appbrand-integration_release"})
public final class p extends k
  implements ag
{
  private final String TAG = "MicroMsg.AppBrandLocalUsageStorageNewImpl";

  public final void a(k.a parama, Looper paramLooper)
  {
    AppMethodBeat.i(134542);
    f.auT().a(parama, paramLooper);
    f.auO().a(parama, paramLooper);
    AppMethodBeat.o(134542);
  }

  public final boolean aE(String paramString, int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(134539);
    al.j(paramString, null, paramInt);
    if (!f.auT().aL(paramString, paramInt));
    try
    {
      boolean bool2 = f.auT().aM(paramString, paramInt);
      if (!bool2);
      for (bool1 = true; ; bool1 = false)
      {
        AppMethodBeat.o(134539);
        return bool1;
      }
    }
    catch (Exception paramString)
    {
      while (true)
        ab.printErrStackTrace(this.TAG, (Throwable)paramString, "removeUsage", new Object[0]);
    }
  }

  public final void c(k.a parama)
  {
    AppMethodBeat.i(134541);
    a(parama, Looper.getMainLooper());
    AppMethodBeat.o(134541);
  }

  public final void d(k.a parama)
  {
    AppMethodBeat.i(134543);
    f.auT().d(parama);
    f.auO().d(parama);
    AppMethodBeat.o(134543);
  }

  public final List<? extends LocalUsageInfo> nA(int paramInt)
  {
    AppMethodBeat.i(134540);
    Object localObject;
    if (paramInt <= 0)
    {
      localObject = Collections.emptyList();
      j.o(localObject, "Collections.emptyList<LocalUsageInfo>()");
      AppMethodBeat.o(134540);
    }
    while (true)
    {
      return localObject;
      localObject = w.f(f.auT().a(null, paramInt, 0));
      j.o(localObject, "obtainHistoryList(SubCor…istories(null, count, 0))");
      localObject = (List)localObject;
      AppMethodBeat.o(134540);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.p
 * JD-Core Version:    0.6.2
 */