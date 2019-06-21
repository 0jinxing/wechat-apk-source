package com.tencent.mm.plugin.fts.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.b.b;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g
{
  private static final g.a mEd;
  public String mDY;
  public String mDZ;
  public String[] mEa;
  public String[] mEb;
  public List<g.c> mEc;

  static
  {
    AppMethodBeat.i(114265);
    mEd = new g.1();
    AppMethodBeat.o(114265);
  }

  private g()
  {
    AppMethodBeat.i(114260);
    this.mEc = new ArrayList();
    AppMethodBeat.o(114260);
  }

  public static g a(String paramString, boolean paramBoolean, g.a parama)
  {
    AppMethodBeat.i(114264);
    g localg = new g();
    localg.mDY = paramString;
    localg.mDZ = d.Nb(paramString);
    localg.mEa = parama.split(localg.mDZ);
    localg.mEb = parama.Nh(localg.mDZ);
    for (parama : localg.mEa)
      localg.mEc.add(aN(parama, paramBoolean));
    AppMethodBeat.o(114264);
    return localg;
  }

  private static g.c aN(String paramString, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(114262);
    boolean bool = paramBoolean;
    if (paramBoolean);
    g.c localc;
    Object localObject1;
    Object localObject3;
    for (int j = 0; ; j++)
    {
      bool = paramBoolean;
      if (j < paramString.length())
      {
        if (!com.tencent.mm.plugin.fts.a.g.u(paramString.charAt(j)))
          bool = false;
      }
      else
      {
        localc = new g.c();
        if (!bool)
          break label360;
        localObject1 = com.tencent.mm.plugin.fts.a.g.mDm;
        localObject2 = new ArrayList();
        localObject3 = paramString.toLowerCase().toCharArray();
        for (j = i; ; j++)
        {
          if (j >= localObject3.length)
            break label145;
          i = localObject3[j];
          if (localObject1.mER.mES[(i - 97)] == null)
            break;
          ((List)localObject2).add(String.valueOf(localObject3[j]));
        }
      }
    }
    ((List)localObject2).clear();
    label145: if (((List)localObject2).size() > 0)
    {
      localObject3 = new g.b();
      ((g.b)localObject3).mEe = d.mEi;
      ((g.b)localObject3).content = bo.c((List)localObject2, "​");
      ((g.b)localObject3).mEf = ((List)localObject2);
      localc.mEg.add(localObject3);
    }
    Object localObject2 = com.tencent.mm.plugin.fts.a.g.mDm.Nj(paramString);
    if (((List)localObject2).size() > 0)
    {
      localObject1 = ((List)localObject2).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (List)((Iterator)localObject1).next();
        if (((List)localObject3).size() > 0)
        {
          localObject2 = new g.b();
          ((g.b)localObject2).mEe = d.mEh;
          ((g.b)localObject2).content = bo.c((List)localObject3, "​");
          ((g.b)localObject2).mEf = ((List)localObject3);
          localc.mEg.add(localObject2);
        }
      }
    }
    localObject2 = new g.b();
    ((g.b)localObject2).mEe = d.mEj;
    ((g.b)localObject2).content = paramString;
    localc.mEg.add(localObject2);
    while (true)
    {
      AppMethodBeat.o(114262);
      return localc;
      label360: localObject2 = new g.b();
      ((g.b)localObject2).mEe = d.mEj;
      ((g.b)localObject2).content = paramString;
      localc.mEg.add(localObject2);
    }
  }

  public static g aO(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(114263);
    paramString = a(paramString, paramBoolean, mEd);
    AppMethodBeat.o(114263);
    return paramString;
  }

  public final String bAl()
  {
    AppMethodBeat.i(114261);
    Object localObject = new StringBuffer();
    for (int i = 0; i < this.mEc.size(); i++)
    {
      ((StringBuffer)localObject).append("(");
      ((StringBuffer)localObject).append(((g.c)this.mEc.get(i)).bAn());
      ((StringBuffer)localObject).append(")");
      if (i != this.mEc.size() - 1)
        ((StringBuffer)localObject).append(" AND ");
    }
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(114261);
    return localObject;
  }

  public static enum d
  {
    static
    {
      AppMethodBeat.i(114259);
      mEh = new d("FullPY", 0);
      mEi = new d("ShortPY", 1);
      mEj = new d("OTHER", 2);
      mEk = new d[] { mEh, mEi, mEj };
      AppMethodBeat.o(114259);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.a.g
 * JD-Core Version:    0.6.2
 */