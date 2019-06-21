package com.tencent.mm.plugin.shake.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.shake.c.a.g;
import com.tencent.mm.plugin.shake.d.a.h;
import com.tencent.mm.plugin.shake.d.a.j;

public final class l
{
  protected static long qrP = 16000L;
  protected static int qrQ = 54158;
  public int qrR;
  public l.b qrS;

  public final l.b a(Context paramContext, int paramInt, l.a parama)
  {
    AppMethodBeat.i(24473);
    if (paramInt == this.qrR)
    {
      paramContext = this.qrS;
      AppMethodBeat.o(24473);
      return paramContext;
    }
    if (this.qrS != null)
      this.qrS.cjw();
    switch (paramInt)
    {
    case 2:
    default:
    case 1:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      this.qrR = paramInt;
      this.qrS.init();
      paramContext = this.qrS;
      AppMethodBeat.o(24473);
      break;
      this.qrS = new c(paramContext, parama);
      continue;
      this.qrS = j.a(parama);
      continue;
      this.qrS = new com.tencent.mm.plugin.shake.d.a.l(paramContext, parama);
      continue;
      this.qrS = new h(parama);
      continue;
      this.qrS = new g(parama);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.b.l
 * JD-Core Version:    0.6.2
 */