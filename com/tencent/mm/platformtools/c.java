package com.tencent.mm.platformtools;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.Set;

public final class c
{
  private n ggR;
  private o ggS;
  private p ggT;
  private l ggU;
  private m ggV;
  private k ggW;

  private static void a(d paramd)
  {
    AppMethodBeat.i(124516);
    if (paramd != null)
    {
      Iterator localIterator = paramd.ggX.iterator();
      while (localIterator.hasNext())
      {
        Integer localInteger = (Integer)localIterator.next();
        g.Rg().b(localInteger.intValue(), paramd);
      }
      paramd.activity = null;
    }
    AppMethodBeat.o(124516);
  }

  public final boolean a(Activity paramActivity, ag paramag)
  {
    boolean bool = false;
    AppMethodBeat.i(124515);
    if ((paramag.type == 0) || (paramag.action == 0))
      AppMethodBeat.o(124515);
    while (true)
    {
      return bool;
      if (this.ggW == null)
        this.ggW = new k(paramActivity);
      if (!this.ggW.a(paramag))
        break;
      bool = true;
      AppMethodBeat.o(124515);
    }
    switch (paramag.type)
    {
    default:
      ab.e("MicroMsg.BaseErrorHelper", "Unkown error type");
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(124515);
      break;
      if (this.ggR == null)
        this.ggR = new n(paramActivity);
      this.ggR.a(paramag);
      continue;
      if (this.ggS == null)
        this.ggS = new o(paramActivity);
      this.ggS.a(paramag);
      continue;
      if (this.ggT == null)
        this.ggT = new p(paramActivity);
      this.ggT.a(paramag);
      continue;
      if (this.ggU == null)
        this.ggU = new l(paramActivity);
      this.ggU.a(paramag);
      continue;
      if (this.ggV == null)
        this.ggV = new m(paramActivity);
      this.ggV.a(paramag);
      continue;
      if (this.ggW == null)
        this.ggW = new k(paramActivity);
      this.ggW.a(paramag);
    }
  }

  public final void close()
  {
    AppMethodBeat.i(124517);
    a(this.ggR);
    a(this.ggS);
    a(this.ggT);
    a(this.ggU);
    a(this.ggV);
    a(this.ggW);
    AppMethodBeat.o(124517);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.c
 * JD-Core Version:    0.6.2
 */