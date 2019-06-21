package com.tencent.mm.plugin.appbrand.k;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.protocal.protobuf.btd;
import java.util.Locale;

public final class a
{
  public static boolean a(int paramInt1, int paramInt2, btd parambtd)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0) && (parambtd != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean b(a.a<?> parama)
  {
    AppMethodBeat.i(132307);
    boolean bool;
    if ((parama != null) && (a(parama.errType, parama.errCode, parama.fsy)))
    {
      bool = true;
      AppMethodBeat.o(132307);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(132307);
    }
  }

  public static String c(a.a parama)
  {
    AppMethodBeat.i(132308);
    if (parama == null)
    {
      parama = "null";
      AppMethodBeat.o(132308);
    }
    while (true)
    {
      return parama;
      parama = String.format(Locale.US, "%d %d %s", new Object[] { Integer.valueOf(parama.errType), Integer.valueOf(parama.errCode), parama.aIm });
      AppMethodBeat.o(132308);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.k.a
 * JD-Core Version:    0.6.2
 */