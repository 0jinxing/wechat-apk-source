package com.tencent.mm.memory.a.a.a;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class a
{
  private static a fep;
  public static boolean feq;
  public int fer;
  public int fes;
  public int fet;
  public double feu;
  public int fev;
  public String few;
  public Class<?> targetClass;

  static
  {
    AppMethodBeat.i(115461);
    fep = new a();
    feq = false;
    AppMethodBeat.o(115461);
  }

  public a()
  {
    AppMethodBeat.i(115459);
    this.fer = 10485760;
    this.fes = 3;
    this.fet = 2000;
    this.feu = 0.15D;
    this.fev = 3;
    this.few = "default";
    int i = ((ActivityManager)ah.getContext().getSystemService("activity")).getLargeMemoryClass();
    ab.i("MicroMsg.CacheInvoke", "BitmapPool %dMB", new Object[] { Integer.valueOf(i) });
    if (i >= 512)
      this.fer = 62914560;
    while (true)
    {
      this.targetClass = com.tencent.mm.memory.a.a.a.class;
      this.fes = 3;
      this.fet = 2000;
      this.fev = 3;
      this.feu = 0.15D;
      AppMethodBeat.o(115459);
      return;
      if (i >= 256)
        this.fer = 31457280;
      else
        this.fer = 15728640;
    }
  }

  public static a Xw()
  {
    return fep;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(115460);
    boolean bool;
    if ((paramObject instanceof a))
    {
      bool = this.few.equals(((a)paramObject).few);
      AppMethodBeat.o(115460);
    }
    while (true)
    {
      return bool;
      bool = super.equals(paramObject);
      AppMethodBeat.o(115460);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.a.a.a.a
 * JD-Core Version:    0.6.2
 */