package com.tencent.mm.plugin.webview.modelcache;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f
{
  private final SparseArray<f.b<a>> unM;

  public f()
  {
    AppMethodBeat.i(6832);
    this.unM = new SparseArray();
    AppMethodBeat.o(6832);
  }

  public final boolean IM(int paramInt)
  {
    AppMethodBeat.i(6833);
    f.b localb;
    synchronized (this.unM)
    {
      localb = (f.b)this.unM.get(paramInt);
      this.unM.remove(paramInt);
      if (localb == null);
    }
    synchronized (localb.eMl)
    {
      localb.unQ.clear();
      AppMethodBeat.o(6833);
      return true;
      localObject2 = finally;
      AppMethodBeat.o(6833);
      throw localObject2;
    }
  }

  public final boolean a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2)
  {
    AppMethodBeat.i(6834);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (bo.isNullOrNil(paramString3)) || ((paramInt2 != 2) && (paramInt2 != 1) && (paramInt2 != 3)))
      AppMethodBeat.o(6834);
    for (boolean bool = false; ; bool = true)
    {
      while (true)
      {
        return bool;
        f.b localb;
        synchronized (this.unM)
        {
          localb = (f.b)this.unM.get(paramInt1);
          if (localb == null)
          {
            AppMethodBeat.o(6834);
            bool = true;
          }
        }
        synchronized (localb.eMl)
        {
          if (localb.unQ.size() == 0)
          {
            AppMethodBeat.o(6834);
            bool = true;
          }
          else
          {
            LinkedList localLinkedList = new java/util/LinkedList;
            localLinkedList.<init>();
            for (paramInt1 = 0; paramInt1 < localb.unQ.size(); paramInt1++)
            {
              a locala = (a)localb.valueAt(paramInt1);
              if ((bo.nullAsNil(locala.appId).equals(paramString1)) && (bo.nullAsNil(locala.cSx).equals(paramString2)) && (bo.nullAsNil(locala.cSy).equals(paramString3)) && (locala.cSz == paramInt2))
                localLinkedList.add(Integer.valueOf(locala.key));
            }
            paramString1 = localLinkedList.iterator();
            if (paramString1.hasNext())
              localb.remove(((Integer)paramString1.next()).intValue());
          }
        }
      }
      AppMethodBeat.o(6834);
    }
  }

  public final boolean a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, String paramString4)
  {
    AppMethodBeat.i(6835);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (bo.isNullOrNil(paramString3)) || (bo.isNullOrNil(paramString4)) || ((paramInt2 != 2) && (paramInt2 != 1) && (paramInt2 != 3)))
      AppMethodBeat.o(6835);
    for (boolean bool = false; ; bool = true)
    {
      while (true)
      {
        return bool;
        f.b localb;
        synchronized (this.unM)
        {
          localb = (f.b)this.unM.get(paramInt1);
          if (localb == null)
          {
            AppMethodBeat.o(6835);
            bool = true;
          }
        }
        synchronized (localb.eMl)
        {
          if (localb.unQ.size() == 0)
          {
            AppMethodBeat.o(6835);
            bool = true;
          }
          else
          {
            LinkedList localLinkedList = new java/util/LinkedList;
            localLinkedList.<init>();
            for (paramInt1 = 0; paramInt1 < localb.unQ.size(); paramInt1++)
            {
              a locala = (a)localb.valueAt(paramInt1);
              if ((bo.nullAsNil(locala.appId).equals(paramString1)) && (bo.nullAsNil(locala.cSx).equals(paramString2)) && (bo.nullAsNil(locala.cSy).equals(paramString3)) && (bo.nullAsNil(locala.unP).equals(paramString4)) && (locala.cSz == paramInt2))
                localLinkedList.add(Integer.valueOf(locala.key));
            }
            paramString1 = localLinkedList.iterator();
            if (paramString1.hasNext())
              localb.remove(((Integer)paramString1.next()).intValue());
          }
        }
      }
      AppMethodBeat.o(6835);
    }
  }

  public final List<f.c> u(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(6836);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (bo.isNullOrNil(paramString3)) || (bo.isNullOrNil(paramString4)))
    {
      paramString1 = null;
      AppMethodBeat.o(6836);
    }
    while (true)
    {
      return paramString1;
      String str = q.aeM(paramString1);
      if (bo.isNullOrNil(str))
      {
        paramString1 = null;
        AppMethodBeat.o(6836);
      }
      else
      {
        paramString1 = new LinkedList();
        SparseArray localSparseArray = this.unM;
        int i = 0;
        try
        {
          while (true)
            if (i < this.unM.size())
            {
              f.b localb = (f.b)this.unM.valueAt(i);
              byte[] arrayOfByte;
              int j;
              if (localb != null)
              {
                arrayOfByte = localb.eMl;
                j = 0;
              }
              try
              {
                while (j < localb.unQ.size())
                {
                  a locala = (a)localb.valueAt(j);
                  if ((bo.nullAsNil(locala.unP).equals(str)) && (bo.nullAsNil(locala.appId).equals(paramString2)) && (bo.nullAsNil(locala.cSx).equals(paramString3)) && (bo.nullAsNil(locala.cSy).equals(paramString4)))
                  {
                    f.c localc = new com/tencent/mm/plugin/webview/modelcache/f$c;
                    localc.<init>(locala.unO, locala.unN);
                    paramString1.add(localc);
                  }
                  j++;
                }
                i++;
              }
              finally
              {
              }
            }
        }
        finally
        {
          AppMethodBeat.o(6836);
        }
        AppMethodBeat.o(6836);
      }
    }
  }

  static final class a
  {
    public final String appId;
    public final String cSx;
    public final String cSy;
    public final int cSz;
    public final int key;
    public final int unN;
    public final int unO;
    public final String unP;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.f
 * JD-Core Version:    0.6.2
 */