package com.tencent.mm.plugin.clean.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class f extends Thread
{
  private boolean isStop = false;
  private HashSet<String> kwE;
  private int kwj = 0;
  private int kwk = 0;
  private h kwz;

  public f(HashSet<String> paramHashSet, h paramh)
  {
    this.kwE = paramHashSet;
    this.kwz = paramh;
  }

  private int a(b paramb, PInt paramPInt, PLong paramPLong)
  {
    int i = 0;
    AppMethodBeat.i(18714);
    int j = paramPInt.value;
    Object localObject;
    if (paramb != null)
    {
      localObject = j.w(paramb.dMD());
      ab.d("MicroMsg.DeleteOtherAccController", "delete [%d] [%s]", new Object[] { Integer.valueOf(j), localObject });
      if (paramPInt.value < 10)
        break label92;
      if (!this.isStop)
        break label87;
      AppMethodBeat.o(18714);
      i = -1;
    }
    while (true)
    {
      return i;
      localObject = "null";
      break;
      label87: paramPInt.value = 0;
      label92: if ((paramb != null) && (paramb.exists()))
        break label112;
      AppMethodBeat.o(18714);
    }
    label112: if (paramb.isDirectory())
    {
      localObject = paramb.dMF();
      if (localObject != null)
        for (i = 0; ; i++)
        {
          if (i >= localObject.length)
            break label174;
          if (a(localObject[i], paramPInt, paramPLong) == -1)
          {
            AppMethodBeat.o(18714);
            i = -1;
            break;
          }
        }
      paramb.delete();
    }
    while (true)
    {
      label174: AppMethodBeat.o(18714);
      i = 1;
      break;
      paramPLong.value += paramb.length();
      paramb.delete();
      paramPInt.value += 1;
    }
  }

  private void bgc()
  {
    AppMethodBeat.i(18712);
    if (this.isStop)
      AppMethodBeat.o(18712);
    while (true)
    {
      return;
      al.d(new f.1(this));
      AppMethodBeat.o(18712);
    }
  }

  private static void e(String paramString, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(18711);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(18711);
    while (true)
    {
      return;
      ab.i("MicroMsg.DeleteOtherAccController", "check paths [%s]", new Object[] { paramString });
      Object localObject = new b(paramString);
      if ((((b)localObject).exists()) && (((b)localObject).isDirectory()))
      {
        localObject = ((b)localObject).list();
        if ((localObject != null) && (localObject.length > 0))
        {
          int i = localObject.length;
          for (int j = 0; j < i; j++)
          {
            String str = localObject[j];
            str = paramString + "/" + str;
            ab.d("MicroMsg.DeleteOtherAccController", "check add path[%s]", new Object[] { str });
            paramArrayList.add(str);
          }
        }
      }
      AppMethodBeat.o(18711);
    }
  }

  private void hh(long paramLong)
  {
    AppMethodBeat.i(18713);
    if (this.isStop)
      AppMethodBeat.o(18713);
    while (true)
    {
      return;
      al.d(new f.2(this, paramLong));
      AppMethodBeat.o(18713);
    }
  }

  public final void run()
  {
    AppMethodBeat.i(18710);
    if ((this.kwE == null) || (this.kwE.isEmpty()))
    {
      ab.w("MicroMsg.DeleteOtherAccController", "delete paths is null.");
      hh(0L);
      AppMethodBeat.o(18710);
    }
    while (true)
    {
      return;
      Object localObject1 = new ArrayList();
      ArrayList localArrayList = new ArrayList();
      Object localObject2 = new StringBuilder("mm");
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RN();
      Object localObject3 = com.tencent.mm.a.g.x(a.QF().getBytes());
      localObject2 = this.kwE.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject4 = (String)((Iterator)localObject2).next();
        ab.i("MicroMsg.DeleteOtherAccController", "uinPath[%s] path[%s]", new Object[] { localObject3, localObject4 });
        if (!bo.isEqual((String)localObject3, (String)localObject4))
        {
          e(com.tencent.mm.kernel.g.RP().eJL + (String)localObject4, (ArrayList)localObject1);
          e(ac.eSj + (String)localObject4, localArrayList);
        }
      }
      this.kwj = (((ArrayList)localObject1).size() + localArrayList.size());
      this.kwk = 0;
      localObject2 = new PLong();
      Object localObject4 = new PLong();
      int i = ((ArrayList)localObject1).size();
      PInt localPInt = new PInt();
      int j = 0;
      while ((!this.isStop) && (j < i))
      {
        localPInt.value = 0;
        localObject3 = (String)((ArrayList)localObject1).get(j);
        j++;
        ab.i("MicroMsg.DeleteOtherAccController", "ready to delete index[%d] path[%s] pDelete[%d]", new Object[] { Integer.valueOf(j), localObject3, Integer.valueOf(localPInt.value) });
        if (a(new b((String)localObject3), localPInt, (PLong)localObject2) == -1)
          break;
        this.kwk += 1;
        bgc();
      }
      i = localArrayList.size();
      localObject3 = new PInt();
      j = 0;
      while ((!this.isStop) && (j < i))
      {
        ((PInt)localObject3).value = 0;
        localObject1 = (String)localArrayList.get(j);
        j++;
        ab.i("MicroMsg.DeleteOtherAccController", "ready to delete index[%d] path[%s] pDelete[%d]", new Object[] { Integer.valueOf(j), localObject1, Integer.valueOf(((PInt)localObject3).value) });
        if (a(new b((String)localObject1), (PInt)localObject3, (PLong)localObject4) == -1)
          break;
        this.kwk += 1;
        bgc();
      }
      ab.i("MicroMsg.DeleteOtherAccController", "delete finish sd[%d] data[%d]", new Object[] { Long.valueOf(((PLong)localObject2).value), Long.valueOf(((PLong)localObject4).value) });
      hh(((PLong)localObject2).value);
      AppMethodBeat.o(18710);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.c.f
 * JD-Core Version:    0.6.2
 */