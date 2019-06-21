package com.tencent.mm.plugin.card.model.a;

import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.vending.c.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/model/v2/CgiGetCardEntranceStyle$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "triggerGetCardEntrance", "", "force", "", "plugin-card_release"})
public final class f$a
{
  public static void fF(boolean paramBoolean)
  {
    AppMethodBeat.i(89164);
    ab.i(f.access$getTAG$cp(), "trigger get card entrance: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    Object localObject = g.RP();
    j.o(localObject, "MMKernel.storage()");
    localObject = ((e)localObject).Ry().get(ac.a.xWk, Long.valueOf(0L));
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type kotlin.Long");
      AppMethodBeat.o(89164);
      throw ((Throwable)localObject);
    }
    long l1 = ((Long)localObject).longValue();
    long l2 = System.currentTimeMillis();
    if ((paramBoolean) || (l2 - l1 > 86400000L))
    {
      localObject = g.RP();
      j.o(localObject, "MMKernel.storage()");
      ((e)localObject).Ry().set(ac.a.xWk, Long.valueOf(System.currentTimeMillis()));
      new f().acy().h((a)f.a.a.kfi);
    }
    AppMethodBeat.o(89164);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.a.f.a
 * JD-Core Version:    0.6.2
 */