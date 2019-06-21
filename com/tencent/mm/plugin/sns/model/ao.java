package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.av;
import com.tencent.mm.g.a.rn;
import com.tencent.mm.m.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class ao
{
  boolean fVW;
  boolean fVX;
  long qMH;
  private boolean qMI;
  int qMJ;
  int qMK;
  c<rn> qML;
  c qMM;
  c qMN;

  ao()
  {
    AppMethodBeat.i(36607);
    this.qMH = 0L;
    this.fVW = false;
    this.fVX = false;
    this.qMI = false;
    this.qMJ = 0;
    this.qMK = 1440;
    this.qML = new ao.1(this);
    this.qMM = new c()
    {
    };
    this.qMN = new c()
    {
    };
    AppMethodBeat.o(36607);
  }

  final boolean cof()
  {
    boolean bool = false;
    AppMethodBeat.i(36608);
    Object localObject = g.Nu().getValue("SnsImgPreLoadingTimeLimit");
    ab.i("MicroMsg.SnsPreTimelineService", "preloadLimit:%s", new Object[] { localObject });
    if (bo.isNullOrNil((String)localObject))
      AppMethodBeat.o(36608);
    while (true)
    {
      return bool;
      try
      {
        localObject = ((String)localObject).split("-");
        String[] arrayOfString = localObject[0].split(":");
        int i = bo.ank(arrayOfString[0]);
        this.qMJ = (bo.ank(arrayOfString[1]) + i * 60);
        localObject = localObject[1].split(":");
        i = bo.ank(localObject[0]);
        this.qMK = (bo.ank(localObject[1]) + i * 60);
        ab.d("MicroMsg.SnsPreTimelineService", "preloadLimit:%d-%d", new Object[] { Integer.valueOf(this.qMJ), Integer.valueOf(this.qMK) });
        AppMethodBeat.o(36608);
        bool = true;
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(36608);
      }
    }
  }

  public final void start()
  {
    AppMethodBeat.i(36609);
    a.xxA.c(this.qML);
    a.xxA.c(this.qMM);
    a.xxA.c(this.qMN);
    AppMethodBeat.o(36609);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ao
 * JD-Core Version:    0.6.2
 */