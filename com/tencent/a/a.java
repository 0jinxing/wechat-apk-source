package com.tencent.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.a.bk;
import com.tencent.filter.art.BokehFilter;
import com.tencent.filter.art.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.e;

public final class a extends e
{
  public static BaseFilter createFilter(int paramInt)
  {
    AppMethodBeat.i(86273);
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = e.createFilter(paramInt);
    case 218:
    case 231:
    case 126:
    case 203:
    case 82:
    case 109:
    }
    while (true)
    {
      AppMethodBeat.o(86273);
      return localObject;
      localObject = new bk();
      continue;
      localObject = new com.tencent.a.a.a();
      continue;
      localObject = new com.microrapid.opencv.a();
      continue;
      localObject = new com.microrapid.lensFlare.a();
      continue;
      localObject = new BokehFilter();
      continue;
      localObject = new c();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.a.a
 * JD-Core Version:    0.6.2
 */