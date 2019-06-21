package com.tencent.mm.booter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac;
import com.tencent.mm.storage.y;
import java.util.HashSet;

public final class x
{
  public static x ecN;
  public y ecO;
  public c ecP;
  public c ecQ;
  public x.a ecR;
  public int ecS;
  HashSet<Long> ecT;
  HashSet<Long> ecU;
  public long ecV;
  public long ecW;
  public String ecX;
  public long ecY;
  public int ecZ;
  public int eda;
  public int edb;
  public int edc;
  public boolean hasInit;

  static
  {
    AppMethodBeat.i(15881);
    ecN = new x();
    AppMethodBeat.o(15881);
  }

  private x()
  {
    AppMethodBeat.i(15879);
    this.ecP = new x.1(this);
    this.ecQ = new x.2(this);
    this.ecS = 0;
    this.ecT = new HashSet();
    this.ecU = new HashSet();
    this.ecY = -1L;
    this.ecZ = 20;
    this.eda = 24;
    this.edb = 30;
    this.edc = 10800;
    this.hasInit = false;
    this.ecO = new y(ac.eSj + "staytime.cfg");
    AppMethodBeat.o(15879);
  }

  public final void jL(String paramString)
  {
    AppMethodBeat.i(15880);
    a.xxA.d(this.ecP);
    a.xxA.d(this.ecQ);
    this.ecU.clear();
    this.ecT.clear();
    boolean bool;
    if ((paramString == null) || (this.ecR == null))
      if (this.ecR == null)
      {
        bool = true;
        ab.i("MicroMsg.StayTimeReport", "exitChattingUI chatUser or reprotingItem is null, chatUser:%s, reportingItem is null:%b", new Object[] { paramString, Boolean.valueOf(bool) });
        AppMethodBeat.o(15880);
      }
    while (true)
    {
      return;
      bool = false;
      break;
      if (paramString.equals(this.ecR.ede))
        break label144;
      ab.i("MicroMsg.StayTimeReport", "exitChattingUI no startedUI: %s, start:", new Object[] { paramString, this.ecR.ede });
      AppMethodBeat.o(15880);
    }
    label144: paramString = this.ecR;
    paramString.time += ah.az(this.ecV) / 1000L;
    paramString = (String)this.ecO.get(5, "");
    this.ecO.set(5, paramString + this.ecR.toString());
    long l;
    if (this.ecR != null)
    {
      l = this.ecO.getLong(4, 0L);
      i = this.ecO.Ml(6) + 1;
      this.ecO.setInt(6, i);
      ab.i("MicroMsg.StayTimeReport", "exitChattingUI, chatUser:%s, type:%d, stayTime:%d, stayWebTime:%d, chattingReportCnt:%d", new Object[] { this.ecR.ede, Integer.valueOf(this.ecR.type), Long.valueOf(this.ecR.time), Integer.valueOf(this.ecR.edi), Integer.valueOf(i) });
      ab.i("MicroMsg.StayTimeReport", "exitChattingUI goBackHistoryStatus:%d, recnCnt:%d, sendCnt:%d", new Object[] { Integer.valueOf(this.ecR.edj), Integer.valueOf(this.ecR.edk), Integer.valueOf(this.ecR.edl) });
      if ((ah.fp(l) <= this.edc) && (i <= this.edb))
        break label516;
    }
    label516: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        paramString = (String)this.ecO.get(5, "");
        paramString = paramString + "," + l + "," + ah.anT();
        ab.i("MicroMsg.StayTimeReport", "report （13062） %d: %s", new Object[] { Integer.valueOf(13062), paramString });
        h.pYm.X(13062, paramString);
        this.ecO.setInt(6, 0);
        this.ecO.set(5, "");
      }
      AppMethodBeat.o(15880);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.x
 * JD-Core Version:    0.6.2
 */