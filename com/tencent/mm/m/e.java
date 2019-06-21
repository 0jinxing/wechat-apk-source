package com.tencent.mm.m;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cq;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class e
{
  private HashMap<String, String> ewb;
  protected boolean ewc;

  public e()
  {
    AppMethodBeat.i(57871);
    this.ewb = new HashMap();
    this.ewc = false;
    AppMethodBeat.o(57871);
  }

  private void b(Map<String, String> paramMap, boolean paramBoolean)
  {
    AppMethodBeat.i(57879);
    if (paramMap == null)
      AppMethodBeat.o(57879);
    while (true)
    {
      return;
      if (!paramBoolean)
        this.ewb.clear();
      int i = 0;
      if (i < 10000)
      {
        Object localObject1;
        label58: String str1;
        String str2;
        HashMap localHashMap;
        if (paramBoolean)
        {
          localObject1 = new StringBuilder(".sysmsg.dynacfg_split.Item");
          if (i == 0)
          {
            localObject2 = "";
            localObject2 = localObject2;
            str1 = (String)localObject2 + ".$key";
            localObject1 = (String)paramMap.get(localObject2);
            str2 = (String)paramMap.get(str1);
            if ((str2 == null) || (bo.isNullOrNil(str2.trim())))
              break label255;
            localHashMap = this.ewb;
            str1 = str2.trim();
            if (localObject1 == null)
              break label248;
          }
        }
        label248: for (Object localObject2 = localObject1; ; localObject2 = "")
        {
          localHashMap.put(str1, localObject2);
          ab.d("MicroMsg.DynamicConfig", "put %s %s", new Object[] { str2.trim(), localObject1 });
          i++;
          break;
          localObject2 = Integer.valueOf(i);
          break label58;
          localObject1 = new StringBuilder(".sysmsg.dynacfg.Item");
          if (i == 0);
          for (localObject2 = ""; ; localObject2 = Integer.valueOf(i))
          {
            localObject2 = localObject2;
            break;
          }
        }
      }
      label255: ab.d("MicroMsg.DynamicConfig", "All dynamicConfig:%s", new Object[] { this.ewb.toString() });
      AppMethodBeat.o(57879);
    }
  }

  public final void a(String paramString, Map<String, String> paramMap, boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(57877);
        if (bo.isNullOrNil(paramString))
        {
          AppMethodBeat.o(57877);
          return;
        }
        ab.i("MicroMsg.DynamicConfig", "update dynacfg. increment:%b, md5:%s", new Object[] { Boolean.valueOf(paramBoolean), com.tencent.mm.a.g.cz(paramString) });
        if (paramBoolean)
        {
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RP().Ry().set(278530, paramString);
          if (paramMap == null)
            break label142;
          b(paramMap, paramBoolean);
          paramString = new com/tencent/mm/g/a/cq;
          paramString.<init>();
          a.xxA.m(paramString);
          AppMethodBeat.o(57877);
          continue;
        }
      }
      finally
      {
      }
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(278529, paramString);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(278530, "");
      continue;
      label142: p(paramString, paramBoolean);
    }
  }

  public final int getInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(57873);
    try
    {
      int i = Integer.parseInt(getValue(paramString));
      paramInt = i;
      AppMethodBeat.o(57873);
      return paramInt;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.DynamicConfig", "parseInt failed, val: ".concat(String.valueOf(paramString)));
    }
  }

  public final String getValue(String paramString)
  {
    try
    {
      AppMethodBeat.i(57872);
      if (!this.ewc)
      {
        ab.e("MicroMsg.DynamicConfig", "DynamicConfig hadnot load");
        sg();
      }
      ab.d("MicroMsg.DynamicConfig", "get configs.get(config) %s %s", new Object[] { paramString.trim(), this.ewb.get(paramString) });
      paramString = (String)this.ewb.get(paramString);
      AppMethodBeat.o(57872);
      return paramString;
    }
    finally
    {
    }
    throw paramString;
  }

  public final List<String> kC(String paramString)
  {
    ArrayList localArrayList;
    try
    {
      AppMethodBeat.i(57874);
      if (!this.ewc)
      {
        ab.e("MicroMsg.DynamicConfig", "DynamicConfig hadnot load");
        sg();
      }
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      if (!bo.isNullOrNil(paramString))
      {
        Iterator localIterator = this.ewb.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (str.matches(paramString))
            localArrayList.add(this.ewb.get(str));
        }
      }
    }
    finally
    {
    }
    ab.d("MicroMsg.DynamicConfig", "searchValues, entry:%s, size:%d", new Object[] { paramString, Integer.valueOf(localArrayList.size()) });
    AppMethodBeat.o(57874);
    return localArrayList;
  }

  protected final void p(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(57878);
    b(br.z(paramString, "sysmsg"), paramBoolean);
    AppMethodBeat.o(57878);
  }

  @Deprecated
  public final void put(String paramString1, String paramString2)
  {
    try
    {
      AppMethodBeat.i(57875);
      if ((paramString1 != null) && (paramString2 != null))
      {
        ab.d("MicroMsg.DynamicConfig", "put configs.put(key,value) %s %s", new Object[] { paramString1.trim(), paramString2 });
        this.ewb.put(paramString1, paramString2);
      }
      AppMethodBeat.o(57875);
      return;
    }
    finally
    {
    }
    throw paramString1;
  }

  public void sg()
  {
    try
    {
      AppMethodBeat.i(57876);
      com.tencent.mm.kernel.g.RQ();
      if (com.tencent.mm.kernel.g.RP() != null)
      {
        com.tencent.mm.kernel.g.RQ();
        if (com.tencent.mm.kernel.g.RP().Ry() != null)
        {
          this.ewc = true;
          com.tencent.mm.kernel.g.RQ();
          p((String)com.tencent.mm.kernel.g.RP().Ry().get(278529, null), false);
        }
      }
      com.tencent.mm.kernel.g.RQ();
      if (com.tencent.mm.kernel.g.RP() != null)
      {
        com.tencent.mm.kernel.g.RQ();
        if (com.tencent.mm.kernel.g.RP().Ry() != null)
        {
          this.ewc = true;
          com.tencent.mm.kernel.g.RQ();
          p((String)com.tencent.mm.kernel.g.RP().Ry().get(278530, null), true);
        }
      }
      AppMethodBeat.o(57876);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.m.e
 * JD-Core Version:    0.6.2
 */