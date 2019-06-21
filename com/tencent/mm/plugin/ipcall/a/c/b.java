package com.tencent.mm.plugin.ipcall.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
{
  public String countryCode = "";
  public String gyD = "";
  public long nvh = 0L;
  public int nwu = 0;
  public long nwv = 0L;
  public int nwx = 0;
  public int nxE = 0;
  public int nxF = 0;
  public int nxG = 0;
  public int nxH = 0;
  public int nxI = 0;
  public long nxJ = 0L;
  public long nxK = 0L;
  public int nxL = 0;
  public long nxM = 0L;
  public int nxN = 0;
  public long nxO = 0L;
  public int nxP = 0;
  public String nxQ = "";
  public long nxR = 0L;
  public long nxS = 0L;
  public long nxT = 0L;
  public long nxU = 0L;
  public String nxV = "";
  public String nxW = "";
  public String nxX = "";
  public long nxY = 0L;
  public long nxZ = 0L;
  public long nya = 0L;
  public int nyb = 0;
  public int nyc = 0;
  public int nyd = 0;
  public int nye = 0;

  public final void bHN()
  {
    AppMethodBeat.i(21831);
    ab.i("MicroMsg.IPCallReportHelper", "selfShutdown");
    this.nxI = 1;
    AppMethodBeat.o(21831);
  }

  public final void bHO()
  {
    AppMethodBeat.i(21832);
    ab.i("MicroMsg.IPCallReportHelper", "selfCancel");
    this.nxH = 1;
    if ((this.nya == 0L) && (this.nxR != 0L))
    {
      this.nya = (System.currentTimeMillis() - this.nxR);
      ab.d("MicroMsg.IPCallReportHelper", "cancelTime: %d", new Object[] { Long.valueOf(this.nya) });
    }
    AppMethodBeat.o(21832);
  }

  public final void bHP()
  {
    AppMethodBeat.i(21833);
    ab.i("MicroMsg.IPCallReportHelper", "channelConnect");
    this.nxL = 1;
    AppMethodBeat.o(21833);
  }

  public final void bHQ()
  {
    if (this.nyd == 0)
      this.nyd = 1;
  }

  public final void bHR()
  {
    AppMethodBeat.i(21834);
    ab.d("MicroMsg.IPCallReportHelper", "markConnect");
    if (this.nxY == 0L)
    {
      this.nxY = System.currentTimeMillis();
      this.nxZ = (this.nxY - this.nxR);
      ab.d("MicroMsg.IPCallReportHelper", "connectTime: %d", new Object[] { Long.valueOf(this.nxZ) });
    }
    AppMethodBeat.o(21834);
  }

  public final void bHS()
  {
    AppMethodBeat.i(21835);
    ab.d("MicroMsg.IPCallReportHelper", "markStartTalk");
    if (this.nxT == 0L)
      this.nxT = System.currentTimeMillis();
    AppMethodBeat.o(21835);
  }

  public final void ep(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(21830);
    if (this.nwx == paramInt1)
    {
      ab.d("MicroMsg.IPCallReportHelper", "setInviteCgiRet: %d", new Object[] { Integer.valueOf(paramInt2) });
      this.nxP = paramInt2;
    }
    AppMethodBeat.o(21830);
  }

  public final void setCountryCode(String paramString)
  {
    AppMethodBeat.i(21829);
    ab.d("MicroMsg.IPCallReportHelper", "setCountryCode: %s", new Object[] { paramString });
    if (!bo.isNullOrNil(paramString))
      this.countryCode = paramString;
    AppMethodBeat.o(21829);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.c.b
 * JD-Core Version:    0.6.2
 */