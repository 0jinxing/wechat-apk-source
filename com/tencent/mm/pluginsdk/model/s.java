package com.tencent.mm.pluginsdk.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.c;
import com.tencent.mm.m.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;

public final class s
{
  private static volatile s vbB = null;

  public static int Kq(int paramInt)
  {
    int i = 5;
    AppMethodBeat.i(125831);
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(125831);
      paramInt = i;
    case 0:
    case 1:
    }
    while (true)
    {
      return paramInt;
      paramInt = bo.getInt(g.Nv().O("QQBroswer", "RecommendCount"), 5);
      AppMethodBeat.o(125831);
      continue;
      paramInt = 2147483647;
      AppMethodBeat.o(125831);
    }
  }

  public static void Kr(int paramInt)
  {
    AppMethodBeat.i(125832);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(125832);
      while (true)
      {
        return;
        h.pYm.e(10998, new Object[] { Integer.valueOf(0) });
        AppMethodBeat.o(125832);
      }
      h.pYm.e(11091, new Object[] { Integer.valueOf(0) });
    }
  }

  public static void Ks(int paramInt)
  {
    AppMethodBeat.i(125833);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(125833);
      while (true)
      {
        return;
        h.pYm.e(10998, new Object[] { Integer.valueOf(1) });
        AppMethodBeat.o(125833);
      }
      h.pYm.e(11091, new Object[] { Integer.valueOf(1) });
    }
  }

  public static void Kt(int paramInt)
  {
    AppMethodBeat.i(125834);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(125834);
      while (true)
      {
        return;
        h.pYm.e(10998, new Object[] { Integer.valueOf(3) });
        AppMethodBeat.o(125834);
      }
      h.pYm.e(11091, new Object[] { Integer.valueOf(3) });
    }
  }

  public static void Ku(int paramInt)
  {
    AppMethodBeat.i(125835);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(125835);
      while (true)
      {
        return;
        h.pYm.e(10998, new Object[] { Integer.valueOf(2) });
        AppMethodBeat.o(125835);
      }
      h.pYm.e(11091, new Object[] { Integer.valueOf(2) });
    }
  }

  public static s dhn()
  {
    AppMethodBeat.i(125829);
    if (vbB == null);
    try
    {
      if (vbB == null)
      {
        locals = new com/tencent/mm/pluginsdk/model/s;
        locals.<init>();
        vbB = locals;
      }
      s locals = vbB;
      AppMethodBeat.o(125829);
      return locals;
    }
    finally
    {
      AppMethodBeat.o(125829);
    }
  }

  public static r y(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(125830);
    switch (paramInt)
    {
    default:
      paramBundle = new o();
      AppMethodBeat.o(125830);
    case 2:
    case 1:
    }
    while (true)
    {
      return paramBundle;
      paramBundle = new a(paramBundle);
      AppMethodBeat.o(125830);
      continue;
      paramBundle = new w();
      AppMethodBeat.o(125830);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.s
 * JD-Core Version:    0.6.2
 */