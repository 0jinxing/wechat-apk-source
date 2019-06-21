package com.tencent.mm.platformtools;

import android.util.SparseBooleanArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class t
{
  private static ConcurrentHashMap<Integer, a> ghk;

  static
  {
    AppMethodBeat.i(58725);
    ghk = new ConcurrentHashMap();
    AppMethodBeat.o(58725);
  }

  public static final a a(int paramInt, String paramString, HashMap<Integer, h.d> paramHashMap, boolean paramBoolean)
  {
    AppMethodBeat.i(58724);
    if ((!bo.isNullOrNil(paramString)) && (paramHashMap != null));
    int i;
    a locala;
    long l;
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      i = paramString.hashCode();
      locala = (a)ghk.get(Integer.valueOf(i));
      if (locala != null)
        break label197;
      locala = new a(paramString, paramBoolean);
      if (!paramBoolean)
        break;
      g.RN();
      l = a.QF();
      q.LK();
      if (locala.b("", paramString, "", l, paramHashMap, true))
        break label146;
      paramString = new b((byte)0);
      AppMethodBeat.o(58724);
      throw paramString;
    }
    if (!locala.b(paramString, paramHashMap, false))
    {
      paramString = new b((byte)0);
      AppMethodBeat.o(58724);
      throw paramString;
    }
    label146: ghk.put(Integer.valueOf(i), locala);
    for (paramString = locala; ; paramString = locala)
    {
      ab.d("MicroMsg.GeneralDBHelper", "addRef %d", new Object[] { Integer.valueOf(paramInt) });
      paramString.ghl.put(paramInt, true);
      AppMethodBeat.o(58724);
      return paramString;
      label197: if (paramBoolean == locala.frq)
        paramBoolean = true;
      while (true)
      {
        Assert.assertTrue(paramBoolean);
        l = locala.iV(-1L);
        Iterator localIterator = paramHashMap.values().iterator();
        while (true)
          if (localIterator.hasNext())
          {
            String[] arrayOfString = ((h.d)localIterator.next()).Af();
            int j = arrayOfString.length;
            i = 0;
            label268: if (i < j)
            {
              paramString = arrayOfString[i];
              ab.d("MicroMsg.GeneralDBHelper", "init sql:".concat(String.valueOf(paramString)));
              try
              {
                locala.hY(null, paramString);
                i++;
                break label268;
                paramBoolean = false;
              }
              catch (Exception paramHashMap)
              {
                while (true)
                  Assert.assertTrue("CreateTable failed:[" + paramString + "][" + paramHashMap.getMessage() + "]", false);
              }
            }
          }
      }
      locala.mB(l);
    }
  }

  public static final class a extends h
  {
    public final boolean frq;
    SparseBooleanArray ghl;
    private final String path;

    public a(String paramString, boolean paramBoolean)
    {
      AppMethodBeat.i(58720);
      this.ghl = new SparseBooleanArray();
      ab.d("MicroMsg.GeneralDBHelper", "create db %s", new Object[] { paramString });
      this.frq = paramBoolean;
      this.path = paramString;
      AppMethodBeat.o(58720);
    }

    @Deprecated
    public final void closeDB()
    {
      AppMethodBeat.i(58722);
      ab.e("MicroMsg.GeneralDBHelper", "forbid to use this method %s", new Object[] { bo.dpG() });
      if (this.ghl.size() <= 1)
        super.closeDB();
      AppMethodBeat.o(58722);
    }

    @Deprecated
    public final void jC(String paramString)
    {
      AppMethodBeat.i(58723);
      ab.e("MicroMsg.GeneralDBHelper", "forbid to use this method");
      if (this.ghl.size() <= 1)
        super.jC(paramString);
      AppMethodBeat.o(58723);
    }

    public final void mJ(int paramInt)
    {
      AppMethodBeat.i(58721);
      ab.d("MicroMsg.GeneralDBHelper", "try close db %d", new Object[] { Integer.valueOf(paramInt) });
      this.ghl.delete(paramInt);
      if (this.ghl.size() <= 0)
      {
        ab.d("MicroMsg.GeneralDBHelper", "close db %d succ", new Object[] { Integer.valueOf(paramInt) });
        super.closeDB();
        t.anH().remove(Integer.valueOf(this.path.hashCode()));
      }
      AppMethodBeat.o(58721);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.t
 * JD-Core Version:    0.6.2
 */