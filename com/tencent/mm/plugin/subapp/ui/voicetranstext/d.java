package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoice.h;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.protocal.protobuf.coa;

public final class d
{
  public static coa bm(int paramInt, String paramString)
  {
    AppMethodBeat.i(25590);
    coa localcoa = new coa();
    switch (paramInt)
    {
    case 2:
    case 3:
    default:
      localcoa.vHq = 0;
      localcoa.vHr = 0;
      localcoa.vHo = 0;
      localcoa.vHp = 0;
    case 0:
    case 1:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(25590);
      return localcoa;
      localcoa.vHq = 8000;
      localcoa.vHr = 16;
      localcoa.vHo = 5;
      localcoa.vHp = 5;
      continue;
      localcoa.vHq = 16000;
      localcoa.vHr = 16;
      localcoa.vHo = 4;
      localcoa.vHp = 4;
      continue;
      localcoa.vHq = 16000;
      paramString = q.uN(paramString);
      if ((paramString != null) && ((paramString instanceof h)))
      {
        paramInt = ((h)paramString).getSampleRate();
        if (paramInt >= 8000)
          localcoa.vHq = paramInt;
      }
      localcoa.vHr = 16;
      localcoa.vHo = 6;
      localcoa.vHp = 6;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.voicetranstext.d
 * JD-Core Version:    0.6.2
 */