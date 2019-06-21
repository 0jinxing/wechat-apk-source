package com.tencent.mm.modelstat;

import android.net.wifi.WifiManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

final class e$c
{
  WifiManager bJj;
  int fSL;
  boolean fSM;
  List<String> fSN;
  int fSk;
  long startTime;
  Thread thread;

  e$c(e parame)
  {
    AppMethodBeat.i(78724);
    this.fSL = 0;
    this.fSk = 0;
    this.fSM = false;
    this.startTime = 0L;
    this.fSN = new ArrayList();
    this.thread = d.h(new e.c.1(this), "MicroMsg.IndoorReporter_WIFI_Scan");
    AppMethodBeat.o(78724);
  }

  public final String akg()
  {
    AppMethodBeat.i(78725);
    this.fSM = false;
    try
    {
      if ((this.thread != null) && (this.thread.isAlive()))
        this.thread.join(500L);
      String str = this.fSN.size() + ";#";
      for (int i = 0; i < this.fSN.size(); i++)
        str = str + (String)this.fSN.get(i) + "#";
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.IndoorReporter", "stop, join Thread failed:%s ", new Object[] { localException.getMessage() });
      AppMethodBeat.o(78725);
      return localException;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.e.c
 * JD-Core Version:    0.6.2
 */