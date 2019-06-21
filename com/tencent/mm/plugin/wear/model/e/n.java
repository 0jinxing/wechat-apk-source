package com.tencent.mm.plugin.wear.model.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wear.model.h;
import java.util.ArrayList;
import java.util.List;

public final class n extends a
{
  public final List<Integer> cUA()
  {
    AppMethodBeat.i(26414);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11033));
    localArrayList.add(Integer.valueOf(11030));
    AppMethodBeat.o(26414);
    return localArrayList;
  }

  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26415);
    switch (paramInt)
    {
    case 11031:
    case 11032:
    default:
      paramArrayOfByte = null;
      AppMethodBeat.o(26415);
    case 11030:
    case 11033:
    }
    while (true)
    {
      return paramArrayOfByte;
      if (new String(paramArrayOfByte).equals("arm_v7"))
      {
        paramArrayOfByte = h.adx("wechatvoicesilk_v7a");
        AppMethodBeat.o(26415);
      }
      else
      {
        paramArrayOfByte = h.adx("wechatvoicesilk");
        AppMethodBeat.o(26415);
        continue;
        paramArrayOfByte = h.adx("stlport_shared");
        AppMethodBeat.o(26415);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.n
 * JD-Core Version:    0.6.2
 */