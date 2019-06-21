package com.tencent.mm.plugin.sns.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class i
{
  public static void h(Long paramLong)
  {
    AppMethodBeat.i(37840);
    g.RP().Ry().set(ac.a.xVv, paramLong);
    AppMethodBeat.o(37840);
  }

  public static boolean kw(long paramLong)
  {
    int i = 2;
    int j = 0;
    boolean bool1 = false;
    AppMethodBeat.i(37838);
    n localn = af.cnF().kD(paramLong);
    boolean bool2;
    if (localn == null)
    {
      AppMethodBeat.o(37838);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      Object localObject = ((String)g.RP().Ry().get(ac.a.xVu, "")).split("&");
      if ((localObject.length > 0) && (bo.getBoolean(localObject[0], false)))
      {
        bool2 = true;
        if ((localObject.length < 2) || (!bo.getBoolean(localObject[1], false)))
          break label161;
      }
      ArrayList localArrayList;
      label161: for (boolean bool3 = true; ; bool3 = false)
      {
        localArrayList = new ArrayList();
        while (i < localObject.length)
        {
          long l = bo.getLong(localObject[i], 0L);
          if (l != 0L)
            localArrayList.add(Long.valueOf(l));
          i++;
        }
        bool2 = false;
        break;
      }
      if (localn.cqu().xfI.wbJ == 15)
        if (!bool2)
          bool2 = true;
      while (true)
      {
        if (!localArrayList.contains(Long.valueOf(paramLong)))
          localArrayList.add(Long.valueOf(paramLong));
        localObject = new StringBuilder().append(bool2).append("&").append(bool3);
        for (i = j; i < localArrayList.size(); i++)
          ((StringBuilder)localObject).append("&").append(localArrayList.get(i));
        AppMethodBeat.o(37838);
        bool2 = bool1;
        break;
        if (localn.cqu().xfI.wbJ != 1)
          break label329;
        if (bool3)
          break label317;
        bool3 = true;
      }
      label317: AppMethodBeat.o(37838);
      bool2 = bool1;
      continue;
      label329: AppMethodBeat.o(37838);
      bool2 = bool1;
      continue;
      g.RP().Ry().set(ac.a.xVu, ((StringBuilder)localObject).toString());
      h(Long.valueOf(paramLong));
      AppMethodBeat.o(37838);
      bool2 = true;
    }
  }

  public static void kx(long paramLong)
  {
    boolean bool1 = true;
    int i = 0;
    AppMethodBeat.i(37839);
    Object localObject = ((String)g.RP().Ry().get(ac.a.xVu, "")).split("&");
    boolean bool2;
    if ((localObject.length > 0) && (bo.getBoolean(localObject[0], false)))
    {
      bool2 = true;
      if ((localObject.length < 2) || (!bo.getBoolean(localObject[1], false)))
        break label134;
    }
    ArrayList localArrayList;
    int j;
    while (true)
    {
      localArrayList = new ArrayList();
      for (j = 2; j < localObject.length; j++)
      {
        long l = bo.getLong(localObject[j], 0L);
        if (l != 0L)
          localArrayList.add(Long.valueOf(l));
      }
      bool2 = false;
      break;
      label134: bool1 = false;
    }
    localArrayList.remove(Long.valueOf(paramLong));
    Collections.reverse(localArrayList);
    if (localArrayList.size() > 0);
    for (localObject = (Long)localArrayList.get(0); ; localObject = null)
    {
      h((Long)localObject);
      localObject = new StringBuilder().append(bool2).append("&").append(bool1);
      for (j = i; j < localArrayList.size(); j++)
        ((StringBuilder)localObject).append("&").append(localArrayList.get(j));
    }
    g.RP().Ry().set(ac.a.xVu, ((StringBuilder)localObject).toString());
    AppMethodBeat.o(37839);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.i
 * JD-Core Version:    0.6.2
 */