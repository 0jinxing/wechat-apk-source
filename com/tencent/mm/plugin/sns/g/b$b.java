package com.tencent.mm.plugin.sns.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.sdk.platformtools.ab;

final class b$b
{
  long qDh;
  StringBuffer qPi;
  String qPj;
  long qPk;
  long qPl;
  String qPm;
  String qPn;

  public b$b(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36762);
    this.qPi = new StringBuffer();
    this.qPj = paramString1;
    this.qPm = paramString2;
    this.qPn = paramString3;
    this.qDh = paramLong;
    this.qPk = System.currentTimeMillis();
    this.qPi.append("0:0:");
    AppMethodBeat.o(36762);
  }

  public b$b(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(36761);
    this.qPi = new StringBuffer();
    this.qPj = paramString1;
    this.qPm = paramString2;
    this.qPn = paramString3;
    this.qDh = paramLong;
    this.qPk = System.currentTimeMillis();
    this.qPi.append("1:0:".concat(String.valueOf(paramString4)));
    AppMethodBeat.o(36761);
  }

  public final void IF()
  {
    AppMethodBeat.i(36766);
    this.qPl = System.currentTimeMillis();
    ab.d("MicroMsg.AdNotLikeAbTestHelper", "report abtestnotlike " + this.qDh + " uxinfo:" + this.qPj + " actionresult: " + this.qPi + " " + this.qPk + " " + this.qPl);
    h.pYm.e(11988, new Object[] { this.qPn, this.qPm, "", "", i.jV(this.qDh), this.qPj, this.qPi, Long.valueOf(this.qPk / 1000L), Long.valueOf(this.qPl / 1000L) });
    AppMethodBeat.o(36766);
  }

  public final void YA(String paramString)
  {
    AppMethodBeat.i(36763);
    ab.d("MicroMsg.AdNotLikeAbTestHelper", "addactionResult ".concat(String.valueOf(paramString)));
    if (this.qPi.length() != 0)
      this.qPi.append("|");
    this.qPi.append(paramString);
    AppMethodBeat.o(36763);
  }

  public final boolean coy()
  {
    boolean bool = false;
    AppMethodBeat.i(36764);
    if ((this.qPi == null) || (this.qPi.length() == 0))
      AppMethodBeat.o(36764);
    while (true)
    {
      return bool;
      if (this.qPi.toString().startsWith("1:0"))
      {
        bool = true;
        AppMethodBeat.o(36764);
      }
      else
      {
        AppMethodBeat.o(36764);
      }
    }
  }

  public final boolean coz()
  {
    AppMethodBeat.i(36765);
    boolean bool;
    if ((this.qPi == null) || (this.qPi.length() == 0))
    {
      bool = false;
      AppMethodBeat.o(36765);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(36765);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.g.b.b
 * JD-Core Version:    0.6.2
 */