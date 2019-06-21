package com.tencent.wework.api;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WWAPIFactory
{
  public static IWWAPI jv(Context paramContext)
  {
    AppMethodBeat.i(80490);
    paramContext = new WWAPIImpl(paramContext);
    AppMethodBeat.o(80490);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.wework.api.WWAPIFactory
 * JD-Core Version:    0.6.2
 */