package com.tencent.mm.plugin.subapp.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ao.c;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class b
  implements ao.c
{
  private static int Fm(int paramInt)
  {
    if (paramInt == 0)
    {
      i = -1;
      return i;
    }
    int i = 0;
    int j = paramInt;
    for (paramInt = i; ; paramInt++)
    {
      i = paramInt;
      if (paramInt >= 32)
        break;
      j = j >> 1 & 0x7FFFFFFF;
      i = paramInt;
      if (j == 0)
        break;
    }
  }

  private static int Fn(int paramInt)
  {
    AppMethodBeat.i(25234);
    paramInt = Fm(paramInt);
    if (paramInt == -1)
    {
      paramInt = 0;
      AppMethodBeat.o(25234);
    }
    while (true)
    {
      return paramInt;
      paramInt = 1 << paramInt;
      AppMethodBeat.o(25234);
    }
  }

  private String aj(int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(25229);
    aw.ZK();
    if (!c.isSDCardAvailable())
      AppMethodBeat.o(25229);
    while (true)
    {
      return localObject;
      String str = ak(paramInt, paramBoolean);
      if (com.tencent.mm.a.e.ct(str))
      {
        AppMethodBeat.o(25229);
        localObject = str;
      }
      else
      {
        Zv();
        AppMethodBeat.o(25229);
      }
    }
  }

  private String ak(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(25232);
    paramInt = Fn(paramInt);
    String str;
    if (paramInt == 0)
    {
      str = null;
      AppMethodBeat.o(25232);
    }
    while (true)
    {
      return str;
      str = B(paramInt, paramBoolean);
      AppMethodBeat.o(25232);
    }
  }

  public final String B(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(25233);
    if (paramInt == 0)
    {
      str = null;
      AppMethodBeat.o(25233);
      return str;
    }
    StringBuilder localStringBuilder = new StringBuilder().append(com.tencent.mm.compatible.util.e.euS).append("vuserpic_").append(Integer.toHexString(paramInt));
    if (paramBoolean);
    for (String str = "_HD"; ; str = "")
    {
      str = str + ".png";
      AppMethodBeat.o(25233);
      break;
    }
  }

  public final void Zv()
  {
    AppMethodBeat.i(25230);
    aw.ZK();
    if (!c.isSDCardAvailable())
      AppMethodBeat.o(25230);
    while (true)
    {
      return;
      aw.ZK();
      long l1 = bo.a((Long)c.Ry().get(66051, null), 0L);
      long l2 = bo.anU();
      if (432000000L > l2 - l1)
      {
        AppMethodBeat.o(25230);
      }
      else
      {
        aw.ZK();
        c.Ry().set(66051, Long.valueOf(l2));
        new b.a();
        AppMethodBeat.o(25230);
      }
    }
  }

  public final boolean kA(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(25231);
    if (paramInt == 0)
      AppMethodBeat.o(25231);
    while (true)
    {
      return bool;
      for (int i = 0; ; i++)
      {
        if (i >= 32)
          break label75;
        if ((!com.tencent.mm.a.e.ct(B(1 << i & paramInt, false))) || (!com.tencent.mm.a.e.ct(B(1 << i & paramInt, true))))
        {
          AppMethodBeat.o(25231);
          break;
        }
      }
      label75: AppMethodBeat.o(25231);
      bool = true;
    }
  }

  public final String ky(int paramInt)
  {
    AppMethodBeat.i(25227);
    String str = aj(paramInt, true);
    AppMethodBeat.o(25227);
    return str;
  }

  public final String kz(int paramInt)
  {
    AppMethodBeat.i(25228);
    String str = aj(paramInt, false);
    AppMethodBeat.o(25228);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.a.b
 * JD-Core Version:    0.6.2
 */