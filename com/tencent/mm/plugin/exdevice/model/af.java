package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.vi;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class af
  implements f
{
  c ecA;

  public af()
  {
    AppMethodBeat.i(19410);
    this.ecA = new af.1(this);
    a.xxA.c(this.ecA);
    AppMethodBeat.o(19410);
  }

  private static void ay(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(19412);
    ab.i("MicroMsg.WearHardDeviceLogic", "publish auth response deviceId=%s | isSuccess=%b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    vi localvi = new vi();
    localvi.cSq.cuy = 8;
    localvi.cSq.cxT = paramBoolean;
    localvi.cSq.ceI = paramString;
    a.xxA.m(localvi);
    AppMethodBeat.o(19412);
  }

  private static void az(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(19413);
    ab.i("MicroMsg.WearHardDeviceLogic", "publish send response deviceId=%s | isSuccess=%b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    vi localvi = new vi();
    localvi.cSq.cuy = 5;
    localvi.cSq.cxT = paramBoolean;
    localvi.cSq.ceI = paramString;
    a.xxA.m(localvi);
    AppMethodBeat.o(19413);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(19411);
    if ((paramm instanceof r))
    {
      aw.Rg().b(541, this);
      paramString = (r)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        ay(paramString.ltF, true);
        AppMethodBeat.o(19411);
      }
    }
    while (true)
    {
      return;
      ay(paramString.ltF, false);
      AppMethodBeat.o(19411);
      continue;
      if ((paramm instanceof w))
      {
        aw.Rg().b(538, this);
        paramString = (w)paramm;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          az(paramString.ltH, true);
          AppMethodBeat.o(19411);
        }
        else
        {
          az(paramString.ltH, false);
        }
      }
      else
      {
        AppMethodBeat.o(19411);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.af
 * JD-Core Version:    0.6.2
 */