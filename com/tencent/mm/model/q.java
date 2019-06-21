package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.api.a;
import com.tencent.mm.kernel.api.h;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class q
  implements a, com.tencent.mm.kernel.api.c, com.tencent.mm.kernel.api.f, h, com.tencent.mm.kernel.b.c
{
  private static ConcurrentHashMap<String, q> fkM;
  private volatile a fkI;
  private volatile Class<? extends at> fkJ;
  private volatile at fkK;
  private volatile boolean fkL;

  static
  {
    AppMethodBeat.i(59738);
    fkM = new ConcurrentHashMap();
    AppMethodBeat.o(59738);
  }

  public q(a parama)
  {
    this.fkL = false;
    this.fkI = parama;
  }

  public q(Class<? extends at> paramClass)
  {
    AppMethodBeat.i(59723);
    this.fkL = false;
    this.fkJ = paramClass;
    a(this.fkJ.getName(), this);
    AppMethodBeat.o(59723);
  }

  public static <T extends at> T Y(Class<T> paramClass)
  {
    AppMethodBeat.i(59731);
    q localq1 = mF(paramClass.getName());
    q localq2 = localq1;
    if (localq1 == null)
    {
      localq2 = new q(paramClass);
      a(paramClass.getName(), localq2);
    }
    paramClass = localq2.Yw();
    AppMethodBeat.o(59731);
    return paramClass;
  }

  public static void Yx()
  {
    AppMethodBeat.i(59729);
    Iterator localIterator = fkM.values().iterator();
    while (localIterator.hasNext())
      ((q)localIterator.next()).reset();
    AppMethodBeat.o(59729);
  }

  public static q a(String paramString, q paramq)
  {
    AppMethodBeat.i(59727);
    q localq = (q)fkM.putIfAbsent(paramString, paramq);
    if (localq == null)
      com.tencent.mm.kernel.a.c.Sa().aC(paramq);
    while (true)
    {
      ab.i("MicroMsg.CompatSubCore", "registerCompatSubCoreWithNameIfAbsent %s, %s", new Object[] { paramString, paramq });
      AppMethodBeat.o(59727);
      return paramq;
      paramq = localq;
    }
  }

  private at createSubCore()
  {
    AppMethodBeat.i(59726);
    try
    {
      ab.i("MicroMsg.CompatSubCore", "createSubCore(), %s %s", new Object[] { this.fkJ, this.fkI });
      at localat;
      if (this.fkI != null)
      {
        localat = this.fkI.createSubCore();
        AppMethodBeat.o(59726);
      }
      while (true)
      {
        return localat;
        localat = (at)this.fkJ.newInstance();
        AppMethodBeat.o(59726);
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      ab.printErrStackTrace("MicroMsg.CompatSubCore", localInstantiationException, "", new Object[0]);
      IllegalAccessError localIllegalAccessError1 = new IllegalAccessError(localInstantiationException.getMessage());
      AppMethodBeat.o(59726);
      throw localIllegalAccessError1;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      ab.printErrStackTrace("MicroMsg.CompatSubCore", localIllegalAccessException, "", new Object[0]);
      IllegalAccessError localIllegalAccessError2 = new IllegalAccessError(localIllegalAccessException.getMessage());
      AppMethodBeat.o(59726);
      throw localIllegalAccessError2;
    }
  }

  public static void kt(int paramInt)
  {
    AppMethodBeat.i(59730);
    Iterator localIterator = fkM.values().iterator();
    while (localIterator.hasNext())
    {
      at localat = ((q)localIterator.next()).Yw();
      if (localat != null)
        localat.iy(paramInt);
    }
    AppMethodBeat.o(59730);
  }

  public static q mF(String paramString)
  {
    AppMethodBeat.i(59728);
    q localq = (q)fkM.get(paramString);
    if (localq == null)
      ab.i("MicroMsg.CompatSubCore", "compatSubCore is null by name %s", new Object[] { paramString });
    while (true)
    {
      AppMethodBeat.o(59728);
      return localq;
      com.tencent.mm.kernel.a.c.Sa().aB(localq);
    }
  }

  private void reset()
  {
    try
    {
      this.fkK = null;
      this.fkL = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void RV()
  {
    AppMethodBeat.i(59735);
    at localat = Yw();
    if (localat == null)
      AppMethodBeat.o(59735);
    while (true)
    {
      return;
      if (!this.fkL)
      {
        AppMethodBeat.o(59735);
      }
      else
      {
        localat.bA(com.tencent.mm.compatible.util.f.Mn());
        AppMethodBeat.o(59735);
      }
    }
  }

  public final void RW()
  {
    AppMethodBeat.i(59736);
    Yw();
    AppMethodBeat.o(59736);
  }

  public final at Yw()
  {
    try
    {
      AppMethodBeat.i(59724);
      if (this.fkK == null)
        a(createSubCore());
      at localat = this.fkK;
      AppMethodBeat.o(59724);
      return localat;
    }
    finally
    {
    }
  }

  public final void a(at paramat)
  {
    AppMethodBeat.i(59725);
    try
    {
      this.fkK = paramat;
      if ((this.fkJ == null) && (this.fkK != null))
        this.fkJ = this.fkK.getClass();
      return;
    }
    finally
    {
      AppMethodBeat.o(59725);
    }
    throw paramat;
  }

  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    AppMethodBeat.i(59732);
    Object localObject = Yw();
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(59732);
    }
    while (true)
    {
      return localObject;
      localObject = ((at)localObject).Jx();
      AppMethodBeat.o(59732);
    }
  }

  public void lM(String paramString)
  {
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(59733);
    at localat = Yw();
    if (localat == null)
      AppMethodBeat.o(59733);
    while (true)
    {
      return;
      localat.bz(paramc.eKe);
      this.fkL = true;
      AppMethodBeat.o(59733);
    }
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(59734);
    at localat = Yw();
    if (localat == null)
      AppMethodBeat.o(59734);
    while (true)
    {
      return;
      localat.onAccountRelease();
      AppMethodBeat.o(59734);
    }
  }

  public String toString()
  {
    AppMethodBeat.i(59737);
    String str = super.toString() + " " + this.fkJ + " " + this.fkI + " " + this.fkK;
    AppMethodBeat.o(59737);
    return str;
  }

  public static abstract interface a
  {
    public abstract at createSubCore();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.q
 * JD-Core Version:    0.6.2
 */