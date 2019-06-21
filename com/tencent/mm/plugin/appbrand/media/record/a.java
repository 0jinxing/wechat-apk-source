package com.tencent.mm.plugin.appbrand.media.record;

import android.media.MediaRecorder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.b;
import com.tencent.mm.audio.b.b.b;
import com.tencent.mm.compatible.b.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  private static b ikV = null;
  private static String ikW = null;
  private static a ikX = null;
  private static ap ikY = null;

  public static boolean a(String paramString, a parama, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(105585);
    ab.i("MicroMsg.Record.AudioRecorder", "startRecord");
    pg(1);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.Record.AudioRecorder", "startRecord, path is null or nil");
      AppMethodBeat.o(105585);
    }
    while (true)
    {
      return bool;
      b localb = new b(c.a.eoS);
      ikV = localb;
      if (localb.cpa == c.a.eoR)
      {
        if (localb.coY != null)
          localb.coY.reset();
        label83: ikV.EE();
        ikV.EF();
        ikV.ED();
        ikV.setOutputFile(paramString);
        ikV.a(new a.2());
      }
      try
      {
        ikV.prepare();
        ikV.start();
        ikX = parama;
        ikW = paramString;
        long l = paramInt;
        stopTimer();
        paramString = new ap(new a.1(), false);
        ikY = paramString;
        paramString.ae(l, l);
        AppMethodBeat.o(105585);
        bool = true;
        continue;
        if (localb.cpb == b.b.cpn)
          break label83;
        localb.release();
        localb.EG();
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.Record.AudioRecorder", "record prepare, exp = %s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(105585);
      }
    }
  }

  public static void pg(int paramInt)
  {
    AppMethodBeat.i(105586);
    ab.i("MicroMsg.Record.AudioRecorder", "stopRecord what:%d", new Object[] { Integer.valueOf(paramInt) });
    if (bo.isNullOrNil(ikW))
      AppMethodBeat.o(105586);
    while (true)
    {
      return;
      if (ikV == null)
      {
        ab.i("MicroMsg.Record.AudioRecorder", "sRecorder is null,err");
        AppMethodBeat.o(105586);
      }
      else
      {
        ikV.EH();
        ikV.release();
        ikV = null;
        stopTimer();
        ikW = null;
        if (ikX != null)
          ikX.ob(paramInt);
        ikX = null;
        AppMethodBeat.o(105586);
      }
    }
  }

  private static void stopTimer()
  {
    AppMethodBeat.i(105584);
    if (ikY != null)
      ikY.stopTimer();
    ikY = null;
    AppMethodBeat.o(105584);
  }

  public static abstract interface a
  {
    public abstract void ob(int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.a
 * JD-Core Version:    0.6.2
 */