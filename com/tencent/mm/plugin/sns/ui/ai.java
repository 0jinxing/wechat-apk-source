package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class ai
{
  String lQD = "";
  int position = 0;
  long qMB = 0L;
  long rmK = 0L;
  String rmL = "";
  int rmM = 0;

  public final boolean csu()
  {
    boolean bool = false;
    AppMethodBeat.i(38545);
    long l = bo.az(this.rmK);
    ab.i("MicroMsg.ResumeSnsControl", "resume time %d", new Object[] { Long.valueOf(l) });
    ab.i("MicroMsg.ResumeSnsControl", "lastSnsTime %s limitSeq %s respMinSeq %s timeLastId %s position %s topy %s", new Object[] { Long.valueOf(this.rmK), this.lQD, this.rmL, Long.valueOf(this.qMB), Integer.valueOf(this.position), Integer.valueOf(this.rmM) });
    if ((l < 180000L) && (this.position > 0))
    {
      ab.i("MicroMsg.ResumeSnsControl", "timeLastId is %d ", new Object[] { Long.valueOf(this.qMB) });
      if (this.qMB == 0L)
        AppMethodBeat.o(38545);
    }
    while (true)
    {
      return bool;
      af.cnv().B(this.qMB, -1);
      AppMethodBeat.o(38545);
      bool = true;
      continue;
      AppMethodBeat.o(38545);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ai
 * JD-Core Version:    0.6.2
 */