package com.tencent.mm.plugin.sport.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sport.PluginSport;
import com.tencent.mm.plugin.sport.a.a;
import com.tencent.mm.sdk.platformtools.ah;

public final class k
{
  public static void ZT(String paramString)
  {
    AppMethodBeat.i(93692);
    if (ah.bqo())
    {
      ((PluginSport)g.M(PluginSport.class)).getSportFileStorage().setString(2, paramString);
      AppMethodBeat.o(93692);
      return;
    }
    paramString = new RuntimeException(String.format("not support set value in %s process", new Object[] { ah.getProcessName() }));
    AppMethodBeat.o(93692);
    throw paramString;
  }

  public static void ZU(String paramString)
  {
    AppMethodBeat.i(93693);
    if (ah.doE())
    {
      ((PluginSport)g.M(PluginSport.class)).getSportFileStorage().setString(301, paramString);
      AppMethodBeat.o(93693);
      return;
    }
    paramString = new RuntimeException(String.format("not support set value in %s process", new Object[] { ah.getProcessName() }));
    AppMethodBeat.o(93693);
    throw paramString;
  }

  public static long aa(int paramInt, long paramLong)
  {
    AppMethodBeat.i(93690);
    if (ah.bqo())
    {
      paramLong = ((PluginSport)g.M(PluginSport.class)).getSportFileStorage().getLong(paramInt, paramLong);
      AppMethodBeat.o(93690);
    }
    while (true)
    {
      return paramLong;
      paramLong = new j(a.rOY).getLong(paramInt, paramLong);
      AppMethodBeat.o(93690);
    }
  }

  public static void ab(int paramInt, long paramLong)
  {
    AppMethodBeat.i(93691);
    if (ah.bqo())
    {
      ((PluginSport)g.M(PluginSport.class)).getSportFileStorage().setLong(paramInt, paramLong);
      AppMethodBeat.o(93691);
      return;
    }
    RuntimeException localRuntimeException = new RuntimeException(String.format("not support set value in %s process", new Object[] { ah.getProcessName() }));
    AppMethodBeat.o(93691);
    throw localRuntimeException;
  }

  public static j cwx()
  {
    AppMethodBeat.i(93688);
    j localj;
    if (ah.bqo())
    {
      localj = new j(a.rOY);
      AppMethodBeat.o(93688);
    }
    while (true)
    {
      return localj;
      if (ah.doE())
      {
        localj = new j(a.rOZ);
        AppMethodBeat.o(93688);
      }
      else
      {
        localj = null;
        AppMethodBeat.o(93688);
      }
    }
  }

  public static String cwy()
  {
    AppMethodBeat.i(93689);
    String str;
    if (ah.doE())
    {
      str = ((PluginSport)g.M(PluginSport.class)).getSportFileStorage().getString(301, "");
      AppMethodBeat.o(93689);
    }
    while (true)
    {
      return str;
      str = new j(a.rOZ).getString(301, "");
      AppMethodBeat.o(93689);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.k
 * JD-Core Version:    0.6.2
 */