package com.tencent.mm.audio.mix.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.d.h;
import com.tencent.mm.audio.mix.d.i;
import com.tencent.mm.audio.mix.h.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e
{
  public static final Long cln;
  public static final Long clo;
  public static final Long clp;
  public static final Long clq;
  public static final Long clr;
  public static final Long cls;
  public static final Long clt;
  public static final Long clu;
  public static final Long clv;
  public static long clx;
  private List<String> clw;

  static
  {
    AppMethodBeat.i(137031);
    cln = Long.valueOf(2592000000L);
    clo = Long.valueOf(604800000L);
    clp = Long.valueOf(259200000L);
    clq = Long.valueOf(172800000L);
    clr = Long.valueOf(86400000L);
    cls = Long.valueOf(43200000L);
    clt = Long.valueOf(240000L);
    clu = clr;
    clv = Long.valueOf(60000L);
    clx = 0L;
    AppMethodBeat.o(137031);
  }

  public e()
  {
    AppMethodBeat.i(137027);
    this.clw = new ArrayList(10);
    AppMethodBeat.o(137027);
  }

  private boolean dA(String paramString)
  {
    AppMethodBeat.i(137029);
    Iterator localIterator = this.clw.iterator();
    boolean bool;
    while (localIterator.hasNext())
      if (paramString.contains((String)localIterator.next()))
      {
        bool = true;
        AppMethodBeat.o(137029);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(137029);
    }
  }

  private void dz(String paramString)
  {
    AppMethodBeat.i(137028);
    Object localObject1 = new File(paramString);
    if ((((File)localObject1).exists()) && (((File)localObject1).isDirectory()))
    {
      localObject1 = ((File)localObject1).list();
      if ((localObject1 == null) || (localObject1.length == 0))
      {
        b.i("MicroMsg.Mix.AudioScanConvertCacheController", "none files exist");
        AppMethodBeat.o(137028);
      }
    }
    while (true)
    {
      return;
      int i = localObject1.length;
      int j = 0;
      if (j < i)
      {
        Object localObject2 = localObject1[j];
        if (dA((String)localObject2))
          b.i("MicroMsg.Mix.AudioScanConvertCacheController", "file is the block file, don't delete");
        while (true)
        {
          j++;
          break;
          String str = paramString + File.separator + (String)localObject2;
          localObject2 = new File(str);
          if (!((File)localObject2).exists())
          {
            b.i("MicroMsg.Mix.AudioScanConvertCacheController", "file not exist");
          }
          else if (((File)localObject2).isDirectory())
          {
            b.i("MicroMsg.Mix.AudioScanConvertCacheController", "file is directory, scan and delete");
            dz(str);
          }
          else if (System.currentTimeMillis() - ((File)localObject2).lastModified() > clq.longValue())
          {
            b.e("MicroMsg.Mix.AudioScanConvertCacheController", "Clean 2 days file in mix convert file name=%s, path:%s", new Object[] { ((File)localObject2).getName(), ((File)localObject2).getAbsolutePath() });
            ((File)localObject2).delete();
          }
        }
      }
      AppMethodBeat.o(137028);
      continue;
      b.i("MicroMsg.Mix.AudioScanConvertCacheController", "%s is not exist or not Directory", new Object[] { paramString });
      AppMethodBeat.o(137028);
    }
  }

  public final class a extends i
  {
    public a(String arg2)
    {
      super();
    }

    public final void run()
    {
      AppMethodBeat.i(137026);
      e.a(e.this);
      h.b(this);
      AppMethodBeat.o(137026);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.c.e
 * JD-Core Version:    0.6.2
 */