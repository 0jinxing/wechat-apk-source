package com.tencent.mm.plugin.appbrand.media.record;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d
{
  public static final Long clp;
  public static final Long clr;
  public static final Long cls;
  public static final Long clt;
  private static List<String> clw;
  public static long clx;
  public static final Long ilk;
  public static final Long ill;

  static
  {
    AppMethodBeat.i(105600);
    clp = Long.valueOf(259200000L);
    clr = Long.valueOf(86400000L);
    cls = Long.valueOf(43200000L);
    clt = Long.valueOf(240000L);
    ilk = Long.valueOf(60000L);
    ill = clr;
    clx = 0L;
    clw = new ArrayList(10);
    AppMethodBeat.o(105600);
  }

  public static void aIg()
  {
    AppMethodBeat.i(105597);
    long l = System.currentTimeMillis();
    if (l - clx <= ill.longValue())
    {
      ab.e("MicroMsg.Record.AudioRecordCacheClean", "The last clean time is in AUDIO_RECORD_NO_SCAN_TIME time");
      AppMethodBeat.o(105597);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Record.AudioRecordCacheClean", "start clean audio record file");
      clx = l;
      com.tencent.mm.sdk.g.d.post(new d.1(), "AudioRecordCacheClean");
      AppMethodBeat.o(105597);
    }
  }

  private static boolean dA(String paramString)
  {
    AppMethodBeat.i(105598);
    Iterator localIterator = clw.iterator();
    boolean bool;
    while (localIterator.hasNext())
      if (paramString.contains((String)localIterator.next()))
      {
        bool = true;
        AppMethodBeat.o(105598);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(105598);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.d
 * JD-Core Version:    0.6.2
 */