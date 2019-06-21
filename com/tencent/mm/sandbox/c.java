package com.tencent.mm.sandbox;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

public final class c
{
  private static c xvk;
  private static Map<Integer, Boolean> xvl;

  static
  {
    AppMethodBeat.i(28778);
    xvk = null;
    xvl = new HashMap();
    AppMethodBeat.o(28778);
  }

  public static void l(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(28776);
    ab.i("MicroMsg.SandBoxCore", "regLifeCycle, id=" + paramInt + ", class=%s", new Object[] { paramObject.getClass().getName() });
    xvl.put(Integer.valueOf(paramInt), Boolean.TRUE);
    ab.i("MicroMsg.SandBoxCore", "regLifeCycle, map size=" + xvl.size());
    AppMethodBeat.o(28776);
  }

  public static void m(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(28777);
    ab.i("MicroMsg.SandBoxCore", "unregLifeCycle, id=" + paramInt + ", class=%s", new Object[] { paramObject.getClass().getName() });
    xvl.remove(Integer.valueOf(paramInt));
    ab.i("MicroMsg.SandBoxCore", "unregLifeCycle, map size=" + xvl.size());
    if (xvl.size() == 0)
    {
      Process.killProcess(Process.myPid());
      ab.w("MicroMsg.SandBoxCore", "Sandbox exit Now.");
      ab.dou();
    }
    AppMethodBeat.o(28777);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.c
 * JD-Core Version:    0.6.2
 */