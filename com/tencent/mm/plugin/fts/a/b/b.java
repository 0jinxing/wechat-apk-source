package com.tencent.mm.plugin.fts.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

public final class b
{
  private HashSet<String> mEQ;
  public c mER;

  public b()
  {
    AppMethodBeat.i(114284);
    this.mER = new c(' ');
    this.mEQ = new HashSet();
    AppMethodBeat.o(114284);
  }

  public final void Ni(String paramString)
  {
    AppMethodBeat.i(114285);
    if (!this.mEQ.add(paramString))
      AppMethodBeat.o(114285);
    while (true)
    {
      return;
      c localc = this.mER;
      char[] arrayOfChar = paramString.toLowerCase().toCharArray();
      int i = 0;
      paramString = localc;
      while (i < arrayOfChar.length)
      {
        int j = arrayOfChar[i] - 'a';
        if (paramString.mES[j] == null)
          paramString.mES[j] = new c(arrayOfChar[i]);
        paramString = paramString.mES[j];
        i++;
      }
      paramString.mEP = true;
      AppMethodBeat.o(114285);
    }
  }

  public final List<List<String>> Nj(String paramString)
  {
    AppMethodBeat.i(114286);
    ArrayDeque localArrayDeque = new ArrayDeque();
    localArrayDeque.offer(new a(0, 0, null));
    char[] arrayOfChar = paramString.toLowerCase().toCharArray();
    ArrayList localArrayList = new ArrayList();
    while (!localArrayDeque.isEmpty())
    {
      a locala = (a)localArrayDeque.poll();
      if (locala == null)
        break;
      int i = locala.end;
      Object localObject1 = this.mER;
      Object localObject2;
      while (i < arrayOfChar.length)
      {
        int j = arrayOfChar[i] - 'a';
        if (localObject1.mES[j] == null)
          break;
        localObject1 = localObject1.mES[j];
        if ((((c)localObject1).mEP) || (i == arrayOfChar.length - 1))
        {
          if (locala.bnR == null)
            locala.bnR = new ArrayList();
          localObject2 = new a(locala.end, i + 1, locala);
          locala.bnR.add(localObject2);
          if (((a)localObject2).end == arrayOfChar.length)
            ((a)localObject2).mEP = true;
          localArrayDeque.offer(localObject2);
        }
        i++;
      }
      if (locala.mEP)
      {
        localObject2 = new ArrayList();
        for (localObject1 = locala; localObject1 != null; localObject1 = ((a)localObject1).mEO)
          if (((a)localObject1).end > ((a)localObject1).start)
            ((List)localObject2).add(paramString.substring(((a)localObject1).start, ((a)localObject1).end));
        Collections.reverse((List)localObject2);
        localArrayList.add(localObject2);
      }
    }
    AppMethodBeat.o(114286);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.b.b
 * JD-Core Version:    0.6.2
 */