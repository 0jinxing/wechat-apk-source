package com.tencent.mm.plugin.hp.tinker;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tinkerboots.sdk.a.a;
import com.tinkerboots.sdk.tinker.service.TinkerServerResultService;

public final class d
{
  private static boolean nue = false;

  public static void OG(String paramString)
  {
    AppMethodBeat.i(90649);
    if (!nue)
    {
      paramString = new RuntimeException("upgrade patch but tinker is not installed");
      AppMethodBeat.o(90649);
      throw paramString;
    }
    com.tencent.tinker.lib.e.c.cf(com.tencent.mm.app.b.cdV.getApplication(), paramString);
    AppMethodBeat.o(90649);
  }

  public static void b(ApplicationLike paramApplicationLike)
  {
    AppMethodBeat.i(90646);
    ab.i("Tinker.TinkerPatchManager", "try installing tinker");
    if (nue)
    {
      ab.w("Tinker.TinkerPatchManager", "install tinker, but has installed, ignore");
      AppMethodBeat.o(90646);
      return;
    }
    long l1 = 0L;
    boolean bool;
    try
    {
      long l2 = com.tencent.mm.kernel.a.Ra() & 0xFFFFFFFF;
      l1 = l2;
      ab.i("Tinker.TinkerPatchManager", "uin is %s", new Object[] { bo.anv(String.valueOf(l2)) });
      l1 = l2;
      a.a locala = new a.a(paramApplicationLike);
      localObject = new c(paramApplicationLike.getApplication());
      if (locala.ABE != null)
      {
        paramApplicationLike = new TinkerRuntimeException("loadReporter is already set.");
        AppMethodBeat.o(90646);
        throw paramApplicationLike;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("Tinker.TinkerPatchManager", localException, "tinker patch manager get uin failed.", new Object[0]);
      localException.ABE = ((com.tencent.tinker.lib.d.c)localObject);
      Object localObject = new e(paramApplicationLike.getApplication());
      if (localException.ABF != null)
      {
        paramApplicationLike = new TinkerRuntimeException("patchReporter is already set.");
        AppMethodBeat.o(90646);
        throw paramApplicationLike;
      }
      localException.ABF = ((com.tencent.tinker.lib.d.d)localObject);
      paramApplicationLike = new b(paramApplicationLike.getApplication());
      if (localException.ABD != null)
      {
        paramApplicationLike = new TinkerRuntimeException("listener is already set.");
        AppMethodBeat.o(90646);
        throw paramApplicationLike;
      }
      localException.ABD = paramApplicationLike;
      if (localException.ATW != null)
      {
        paramApplicationLike = new TinkerRuntimeException("resultServiceClass is already set.");
        AppMethodBeat.o(90646);
        throw paramApplicationLike;
      }
      localException.ATW = TinkerPatchResultService.class;
      if (localException.ABE == null)
        localException.ABE = new com.tinkerboots.sdk.tinker.b.a(localException.context);
      if (localException.ABF == null)
        localException.ABF = new com.tinkerboots.sdk.tinker.b.c(localException.context);
      if (localException.ABD == null)
        localException.ABD = new com.tinkerboots.sdk.tinker.b.b(localException.context);
      if (localException.ATV == null)
        localException.ATV = new com.tencent.tinker.lib.c.f();
      if (localException.ATW == null)
        localException.ATW = TinkerServerResultService.class;
      if (localException.ATX == null)
        localException.ATX = new com.tinkerboots.sdk.a.a.a();
      paramApplicationLike = new com.tinkerboots.sdk.a(localException.context, localException.cdV, localException.ABE, localException.ABF, localException.ABD, localException.ATV, localException.ATW, localException.ATX);
      if (com.tinkerboots.sdk.a.ATQ != null)
      {
        paramApplicationLike = new TinkerRuntimeException("TinkerClient instance is already set.");
        AppMethodBeat.o(90646);
        throw paramApplicationLike;
      }
      com.tinkerboots.sdk.a.ATQ = paramApplicationLike;
      paramApplicationLike = com.tinkerboots.sdk.a.dWj().SG(g.em(ah.getContext()));
      bool = com.tencent.mm.sdk.a.b.dnO();
      if (paramApplicationLike.ATS == null)
        break label497;
    }
    label497: int i;
    label512: label551: com.tinkerboots.sdk.a locala1;
    if (paramApplicationLike.ATR == null)
    {
      com.tencent.tinker.lib.util.a.e("Tinker.TinkerClient", "setDebugger, tinkerServerClient or tinkerClient is null, just return", new Object[0]);
      paramApplicationLike = com.tinkerboots.sdk.a.ATQ;
      paramApplicationLike = paramApplicationLike.iN("uin", String.valueOf(l1)).iN("code-version", com.tencent.mm.sdk.platformtools.f.CLIENT_VERSION).iN("code-reversion", com.tencent.mm.sdk.platformtools.f.REV);
      if (!at.isWifi(ah.getContext()))
        break label695;
      i = 3;
      locala1 = paramApplicationLike.iN("network", String.valueOf(i)).iN("sdk", String.valueOf(Build.VERSION.SDK_INT)).iN("os-name", com.tencent.mm.protocal.d.vxl).iN("device-brand", com.tencent.mm.protocal.d.vxi).iN("device-name", com.tencent.mm.protocal.d.DEVICE_NAME);
      paramApplicationLike = new f();
      if ((locala1.ATS != null) && (locala1.ATR != null))
        break label701;
      com.tencent.tinker.lib.util.a.e("Tinker.TinkerClient", "setPatchRequestCallback, tinkerServerClient or tinkerClient is null, just return", new Object[0]);
    }
    while (true)
    {
      ab.i("Tinker.TinkerPatchManager", "try installing end");
      nue = true;
      AppMethodBeat.o(90646);
      break;
      com.tencent.tinker.lib.util.a.i("Tinker.TinkerClient", "set debugger to %b", new Object[] { Boolean.valueOf(bool) });
      paramApplicationLike.ATS.isDebug = bool;
      paramApplicationLike = com.tinkerboots.sdk.a.ATQ;
      break label512;
      label695: i = 2;
      break label551;
      label701: com.tencent.tinker.lib.util.a.i("Tinker.TinkerClient", "setPatchRequestCallback with hashcode %d", new Object[] { Integer.valueOf(paramApplicationLike.hashCode()) });
      locala1.ATS.ATX = paramApplicationLike;
    }
  }

  public static void bGq()
  {
    AppMethodBeat.i(90647);
    com.tencent.tinker.lib.util.a.a(new d.1());
    AppMethodBeat.o(90647);
  }

  public static void bGr()
  {
    AppMethodBeat.i(90648);
    if (!nue)
    {
      RuntimeException localRuntimeException = new RuntimeException("cleanPatch but tinker is not installed");
      AppMethodBeat.o(90648);
      throw localRuntimeException;
    }
    com.tencent.tinker.lib.e.a.iX(com.tencent.mm.app.b.cdV.getApplication()).bGr();
    AppMethodBeat.o(90648);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.tinker.d
 * JD-Core Version:    0.6.2
 */