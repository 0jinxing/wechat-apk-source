package com.tencent.mm.plugin.wear.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wear.model.e.i;
import com.tencent.mm.pluginsdk.p.c.a;
import com.tencent.mm.protocal.protobuf.ctv;
import com.tencent.mm.sdk.platformtools.bo;

public final class c
  implements p.c.a
{
  public final String cUp()
  {
    AppMethodBeat.i(26286);
    Object localObject = a.cUn().tXt.tXK.tYz;
    if (localObject != null)
    {
      localObject = ((ctv)localObject).xqv + "\n" + ((ctv)localObject).xqw + "\n" + ((ctv)localObject).xqx;
      AppMethodBeat.o(26286);
    }
    while (true)
    {
      return localObject;
      localObject = "Not Connect";
      AppMethodBeat.o(26286);
    }
  }

  public final void cUq()
  {
    AppMethodBeat.i(26287);
    a.cUn().tXz.a(new com.tencent.mm.plugin.wear.model.f.a());
    AppMethodBeat.o(26287);
  }

  public final boolean cUr()
  {
    boolean bool = true;
    AppMethodBeat.i(26288);
    Object localObject = a.cUn().tXt.tXK.tYz;
    if ((bo.isNullOrNil(null)) && (bo.isNullOrNil(null)))
      if (localObject != null)
        AppMethodBeat.o(26288);
    while (true)
    {
      return bool;
      AppMethodBeat.o(26288);
      bool = false;
      continue;
      if (bo.isNullOrNil(null))
      {
        if (localObject != null)
          throw new NullPointerException();
        AppMethodBeat.o(26288);
        bool = false;
      }
      else if (bo.isNullOrNil(null))
      {
        if (localObject != null)
        {
          localObject = ((ctv)localObject).xqs;
          throw new NullPointerException();
        }
        AppMethodBeat.o(26288);
        bool = false;
      }
      else
      {
        if (localObject != null)
          throw new NullPointerException();
        AppMethodBeat.o(26288);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.c
 * JD-Core Version:    0.6.2
 */