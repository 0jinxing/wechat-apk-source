package com.tencent.mm.plugin.story.model;

import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.cb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/OneDayPostChecker;", "", "()V", "TAG", "", "TIME_ONE_DAY", "", "mYesterdayTime", "", "canPostStory", "", "nextCount", "", "preCount", "updateCount", "count", "plugin-story_release"})
public final class d
{
  private static final String TAG = "MicroMsg.OneDayPostChecker";
  private static final int rSe = 86400000;
  private static long rSf;
  public static final d rSg;

  static
  {
    AppMethodBeat.i(109017);
    rSg = new d();
    TAG = "MicroMsg.OneDayPostChecker";
    rSe = 86400000;
    Object localObject = g.RP();
    j.o(localObject, "MMKernel.storage()");
    localObject = ((com.tencent.mm.kernel.e)localObject).Ry().get(ac.a.xWz, Long.valueOf(0L));
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type kotlin.Long");
      AppMethodBeat.o(109017);
      throw ((Throwable)localObject);
    }
    rSf = ((Long)localObject).longValue();
    AppMethodBeat.o(109017);
  }

  public static void EK(int paramInt)
  {
    AppMethodBeat.i(109016);
    com.tencent.mm.kernel.e locale = g.RP();
    j.o(locale, "MMKernel.storage()");
    locale.Ry().set(ac.a.xWy, Integer.valueOf(Math.min(paramInt, ((Number)com.tencent.mm.plugin.story.c.a.e.rRA.Uw()).intValue())));
    AppMethodBeat.o(109016);
  }

  public static boolean canPostStory()
  {
    AppMethodBeat.i(109013);
    ab.d(TAG, "lastTimestamp: " + rSf);
    long l = cb.aaE();
    if (l - rSf > rSe)
    {
      localObject = g.RP();
      j.o(localObject, "MMKernel.storage()");
      ((com.tencent.mm.kernel.e)localObject).Ry().set(ac.a.xWy, Integer.valueOf(0));
      rSf = l;
      localObject = g.RP();
      j.o(localObject, "MMKernel.storage()");
      ((com.tencent.mm.kernel.e)localObject).Ry().set(ac.a.xWz, Long.valueOf(rSf));
      ab.d(TAG, "count reset to 0, lastTimestamp update to now: " + rSf);
    }
    Object localObject = g.RP();
    j.o(localObject, "MMKernel.storage()");
    localObject = ((com.tencent.mm.kernel.e)localObject).Ry().get(ac.a.xWy, Integer.valueOf(0));
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type kotlin.Int");
      AppMethodBeat.o(109013);
      throw ((Throwable)localObject);
    }
    int i = ((Integer)localObject).intValue();
    boolean bool;
    if (i < ((Number)com.tencent.mm.plugin.story.c.a.e.rRA.Uw()).intValue())
    {
      ab.d(TAG, "pass, count=".concat(String.valueOf(i)));
      bool = true;
      AppMethodBeat.o(109013);
    }
    while (true)
    {
      return bool;
      ab.d(TAG, "goodbye, count=".concat(String.valueOf(i)));
      AppMethodBeat.o(109013);
      bool = false;
    }
  }

  public static void cxA()
  {
    AppMethodBeat.i(109014);
    Object localObject = g.RP();
    j.o(localObject, "MMKernel.storage()");
    localObject = ((com.tencent.mm.kernel.e)localObject).Ry().get(ac.a.xWy, Integer.valueOf(0));
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type kotlin.Int");
      AppMethodBeat.o(109014);
      throw ((Throwable)localObject);
    }
    int i = ((Integer)localObject).intValue();
    localObject = g.RP();
    j.o(localObject, "MMKernel.storage()");
    ((com.tencent.mm.kernel.e)localObject).Ry().set(ac.a.xWy, Integer.valueOf(i + 1));
    AppMethodBeat.o(109014);
  }

  public static void cxB()
  {
    AppMethodBeat.i(109015);
    Object localObject = g.RP();
    j.o(localObject, "MMKernel.storage()");
    localObject = ((com.tencent.mm.kernel.e)localObject).Ry().get(ac.a.xWy, Integer.valueOf(0));
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type kotlin.Int");
      AppMethodBeat.o(109015);
      throw ((Throwable)localObject);
    }
    int i = ((Integer)localObject).intValue();
    localObject = g.RP();
    j.o(localObject, "MMKernel.storage()");
    ((com.tencent.mm.kernel.e)localObject).Ry().set(ac.a.xWy, Integer.valueOf(Math.max(0, i - 1)));
    AppMethodBeat.o(109015);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.d
 * JD-Core Version:    0.6.2
 */