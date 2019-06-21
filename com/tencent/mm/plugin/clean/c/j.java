package com.tencent.mm.plugin.clean.c;

import android.os.StatFs;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.f.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.HashSet;

public final class j
  implements at
{
  private static j kwJ;
  public long kvV;
  public long kvW;
  public long kvX;
  public HashMap<String, Long> kwI;
  public HashSet<String> kww;

  public static long bfL()
  {
    AppMethodBeat.i(18723);
    try
    {
      StatFs localStatFs = new android/os/StatFs;
      localStatFs.<init>(e.eSl);
      l = localStatFs.getBlockCount();
      int i = localStatFs.getBlockSize();
      l = i * l;
      if (l <= 0L)
      {
        l = 1L;
        AppMethodBeat.o(18723);
        return l;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        long l = 0L;
        continue;
        AppMethodBeat.o(18723);
      }
    }
  }

  public static long bfM()
  {
    AppMethodBeat.i(18724);
    try
    {
      StatFs localStatFs = new android/os/StatFs;
      localStatFs.<init>(e.eSl);
      l = localStatFs.getAvailableBlocks();
      int i = localStatFs.getBlockSize();
      l = i * l;
      if (l <= 0L)
      {
        l = 1L;
        AppMethodBeat.o(18724);
        return l;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        long l = 0L;
        continue;
        AppMethodBeat.o(18724);
      }
    }
  }

  public static j bgd()
  {
    AppMethodBeat.i(18718);
    if (kwJ == null)
      kwJ = new j();
    j localj = kwJ;
    AppMethodBeat.o(18718);
    return localj;
  }

  public static void bge()
  {
    AppMethodBeat.i(18725);
    b.aZc().aZe();
    AppMethodBeat.o(18725);
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
    AppMethodBeat.i(18721);
    ab.i("MicroMsg.SubCoreClean", "summerclean onSdcardMount mounted[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(18721);
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(18720);
    ab.i("MicroMsg.SubCoreClean", "summerclean onAccountPostReset updated[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
    b.aZc().onAccountInitialized(null);
    AppMethodBeat.o(18720);
  }

  public final void iy(int paramInt)
  {
    AppMethodBeat.i(18719);
    d.bfX();
    AppMethodBeat.o(18719);
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(18722);
    ab.i("MicroMsg.SubCoreClean", "summerclean onAccountRelease");
    this.kvV = 0L;
    this.kvW = 0L;
    this.kvX = 0L;
    if (this.kwI != null)
      this.kwI.clear();
    if (this.kww != null)
      this.kww.clear();
    d.bfX();
    b.aZc().onAccountRelease();
    AppMethodBeat.o(18722);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.c.j
 * JD-Core Version:    0.6.2
 */