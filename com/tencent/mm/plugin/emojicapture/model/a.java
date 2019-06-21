package com.tencent.mm.plugin.emojicapture.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.ttpic.util.ResourcePathMapper;
import java.io.IOException;

public final class a
{
  public static final String lhq;

  static
  {
    AppMethodBeat.i(2559);
    lhq = com.tencent.mm.compatible.util.e.eSk + "bgcut/";
    AppMethodBeat.o(2559);
  }

  public static void bmF()
  {
    int i = 0;
    AppMethodBeat.i(2554);
    try
    {
      if (com.tencent.mm.vfs.e.ct("assets:///bgcut/version.txt"))
        j = bo.ank(com.tencent.mm.vfs.e.cy("assets:///bgcut/version.txt"));
    }
    catch (IOException localIOException1)
    {
      while (true)
      {
        try
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          int k = i;
          int m = j;
          if (com.tencent.mm.vfs.e.ct(lhq + "version.txt"))
          {
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            k = bo.ank(com.tencent.mm.vfs.e.cy(lhq + "version.txt"));
            m = j;
          }
          if (m > k)
          {
            ab.i("MicroMsg.BgCutSoLogic", "checkFile: version upgrade");
            com.tencent.mm.vfs.e.N(lhq, true);
            com.tencent.mm.vfs.e.tf(lhq);
            com.tencent.mm.vfs.e.y("assets:///bgcut/version.txt", lhq + "version.txt");
          }
          if (!com.tencent.mm.vfs.e.ct(lhq + "libsegmentern.so"))
            com.tencent.mm.vfs.e.y("assets:///bgcut/libsegmentern.so", lhq + "libsegmentern.so");
          if (!com.tencent.mm.vfs.e.ct(lhq + "libsegmentero.so"))
            com.tencent.mm.vfs.e.y("assets:///bgcut/libsegmentero.so", lhq + "libsegmentero.so");
          ResourcePathMapper.setResPath("so3", lhq);
          ResourcePathMapper.setResPath("so4", lhq);
          ResourcePathMapper.setResPath("model5", "assets://");
          AppMethodBeat.o(2554);
          return;
          localIOException1 = localIOException1;
          j = 0;
          ab.printErrStackTrace("MicroMsg.BgCutSoLogic", localIOException1, "", new Object[0]);
          k = i;
          m = j;
          continue;
        }
        catch (IOException localIOException2)
        {
          continue;
        }
        int j = 0;
      }
    }
  }

  public static void bmG()
  {
    AppMethodBeat.i(2555);
    ResourcePathMapper.setResPath("so3", null);
    ResourcePathMapper.setResPath("so4", null);
    ResourcePathMapper.setResPath("model5", null);
    AppMethodBeat.o(2555);
  }

  public static void bmH()
  {
    AppMethodBeat.i(2556);
    int i = as.amF("emoji_segment_so").getInt("load_start", 0);
    as.amF("emoji_segment_so").putInt("load_start", i + 1);
    as.amF("emoji_segment_so").commit();
    ab.i("MicroMsg.BgCutSoLogic", "markStart:%s", new Object[] { Integer.valueOf(i + 1) });
    AppMethodBeat.o(2556);
  }

  public static void bmI()
  {
    AppMethodBeat.i(2557);
    int i = as.amF("emoji_segment_so").getInt("load_start", 0);
    as.amF("emoji_segment_so").putInt("load_end", i);
    as.amF("emoji_segment_so").commit();
    ab.i("MicroMsg.BgCutSoLogic", "markEnd:%s", new Object[] { Integer.valueOf(i) });
    AppMethodBeat.o(2557);
  }

  public static boolean bmJ()
  {
    int i = 5;
    AppMethodBeat.i(2558);
    int j = as.amF("emoji_segment_so").getInt("load_start", 0);
    int k = as.amF("emoji_segment_so").getInt("load_end", 0);
    try
    {
      m = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIQ, 5);
      if (j - k <= m);
      for (boolean bool = true; ; bool = false)
      {
        ab.i("MicroMsg.BgCutSoLogic", "checkManualStart: %s, %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(m) });
        if (!bool)
        {
          d locald = d.lhz;
          d.bnq();
        }
        AppMethodBeat.o(2558);
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
        int m = i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.a
 * JD-Core Version:    0.6.2
 */