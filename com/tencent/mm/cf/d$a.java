package com.tencent.mm.cf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class d$a
{
  int cPw;
  String className;
  String savePath;
  int ydP;
  int ydQ;

  public d$a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(76906);
    this.className = paramString;
    this.cPw = paramInt1;
    this.ydP = paramInt2;
    this.ydQ = paramInt3;
    StringBuilder localStringBuilder1 = new StringBuilder();
    if (bo.isNullOrNil(paramString))
    {
      localStringBuilder1.append(d.ydJ).append("WEIXIN_").append(System.currentTimeMillis()).append(".trace");
      ab.i("MicroMsg.TraceDebugManager", "TRACE startMethod path %s traceSize : %d", new Object[] { localStringBuilder1.toString(), Integer.valueOf(paramInt2) });
      this.savePath = localStringBuilder1.toString();
      AppMethodBeat.o(76906);
      return;
    }
    StringBuilder localStringBuilder2 = localStringBuilder1.append(d.ydJ).append(paramString).append("_");
    paramString = "";
    switch (paramInt1)
    {
    default:
    case 1:
    case 3:
    case 2:
    case 4:
    case 5:
    }
    while (true)
    {
      localStringBuilder2.append(paramString).append(".trace");
      break;
      paramString = "onResume";
      continue;
      paramString = "onCreate";
      continue;
      paramString = "onPause";
      continue;
      paramString = "onScrool";
      continue;
      paramString = "all";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cf.d.a
 * JD-Core Version:    0.6.2
 */