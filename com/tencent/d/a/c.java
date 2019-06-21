package com.tencent.d.a;

import android.content.Context;
import com.tencent.d.b.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class c
{
  private static com.tencent.d.b.a ArE = null;

  public static void a(Context paramContext, c.a parama)
  {
    AppMethodBeat.i(114464);
    if (ArE == null)
      ArE = new com.tencent.d.b.a(paramContext);
    com.tencent.d.b.a locala = ArE;
    try
    {
      List localList = com.tencent.d.f.a.iJ(locala.mContext);
      if (localList.size() == 0)
      {
        parama.f(-10, null);
        AppMethodBeat.o(114464);
      }
      while (true)
      {
        return;
        paramContext = new com/tencent/d/c/b/a;
        paramContext.<init>();
        paramContext.Asl = com.tencent.d.b.a.dQj();
        Object localObject = new com/tencent/d/c/b/c;
        ((com.tencent.d.c.b.c)localObject).<init>();
        paramContext.Asj = ((com.tencent.d.c.b.c)localObject);
        paramContext.Asj.AsM = 6;
        paramContext.Asj.Ase = 1;
        paramContext.Asj.requestType = 0;
        paramContext.Asj.AsN = 0;
        paramContext.Asj.AsO = 0;
        paramContext.Asj.AsP = null;
        paramContext.Asj.AsQ = 0;
        paramContext.Asj.AsU = 1;
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        paramContext.Ask = ((ArrayList)localObject);
        for (int i = 0; i < localList.size(); i++)
        {
          localObject = com.tencent.d.b.a.a(locala.mContext, (a)localList.get(i), i);
          paramContext.Ask.add(localObject);
        }
        paramContext = locala.ArH.a(paramContext);
        if (paramContext != null)
          break;
        parama.f(-20, null);
        AppMethodBeat.o(114464);
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        parama.f(-100, null);
        AppMethodBeat.o(114464);
        continue;
        parama.f(0, paramContext);
        AppMethodBeat.o(114464);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.d.a.c
 * JD-Core Version:    0.6.2
 */