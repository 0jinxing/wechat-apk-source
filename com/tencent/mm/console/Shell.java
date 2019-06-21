package com.tencent.mm.console;

import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelmulti.n;
import com.tencent.mm.modelmulti.o;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashMap;

public final class Shell
{
  private static HashMap<String, Shell.a> eww;
  public static IntentFilter ewx;
  private static Runnable ewy;
  public Shell.Receiver ewv = null;

  static
  {
    AppMethodBeat.i(16123);
    eww = new HashMap();
    ewx = new IntentFilter();
    a("wechat.shell.SET_NEXTRET", new Shell.1());
    a("wechat.shell.SET_LOGLEVEL", new Shell.a()
    {
      public final void s(Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(16113);
        int i = paramAnonymousIntent.getIntExtra("level", 0);
        ab.w("MicroMsg.Shell", "kiro set Log.level=%d", new Object[] { Integer.valueOf(ab.getLogLevel()) });
        ab.LZ(i);
        AppMethodBeat.o(16113);
      }
    });
    a("wechat.shell.SET_CDNTRANS", new Shell.6());
    a("wechat.shell.SET_DKTEST", new Shell.a()
    {
      public final void s(Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(16115);
        ae.giz = paramAnonymousIntent.getIntExtra("key", 0);
        ae.giA = paramAnonymousIntent.getIntExtra("val", 0);
        ae.giB = paramAnonymousIntent.getStringExtra("str");
        ab.w("MicroMsg.Shell", "dkshell set [%d %d] [%s]", new Object[] { Integer.valueOf(ae.giz), Integer.valueOf(ae.giA), ae.giB });
        if (10009 == ae.giz)
        {
          int i = ae.giA;
          Shell.Nw();
          AppMethodBeat.o(16115);
        }
        while (true)
        {
          return;
          if ((10014 == ae.giz) && (ah.bqo()))
          {
            n.ahW().a(7L, 1, "");
            AppMethodBeat.o(16115);
          }
          else
          {
            if (10015 == ae.giz)
              ah.doE();
            AppMethodBeat.o(16115);
          }
        }
      }
    });
    a("wechat.shell.NET_DNS_TEST", new Shell.8());
    a("wechat.shell.IDC_ERROR", new Shell.9());
    a("wechat.shell.SET_DK_WT_TEST", new Shell.10());
    a("wechat.shell.SET_MUTE_ROOM_TEST", new Shell.11());
    a("wechat.shell.HOTPATCH_TEST", new Shell.12());
    a("wechat.shell.EXEC_SQL", new Shell.2());
    a("wechat.shell.DUMP_HPROF", new Shell.3());
    ewy = new Shell.4();
    AppMethodBeat.o(16123);
  }

  private static void a(String paramString, Shell.a parama)
  {
    AppMethodBeat.i(16122);
    ewx.addAction(paramString);
    eww.put(paramString, parama);
    AppMethodBeat.o(16122);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.Shell
 * JD-Core Version:    0.6.2
 */