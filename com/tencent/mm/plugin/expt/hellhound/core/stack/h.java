package com.tencent.mm.plugin.expt.hellhound.core.stack;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.chm;
import com.tencent.mm.sdk.platformtools.ab;

public final class h
{
  public static boolean a(chm paramchm1, chm paramchm2)
  {
    boolean bool = false;
    AppMethodBeat.i(73386);
    if ((paramchm1 == null) || (paramchm2 == null))
      AppMethodBeat.o(73386);
    while (true)
    {
      return bool;
      if ((TextUtils.isEmpty(paramchm1.activityName)) || (TextUtils.isEmpty(paramchm2.activityName)))
      {
        AppMethodBeat.o(73386);
      }
      else
      {
        bool = l(paramchm1.activityName, paramchm1.wkp, paramchm2.activityName, paramchm2.wkp);
        AppMethodBeat.o(73386);
      }
    }
  }

  public static boolean l(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(73387);
    ab.d("TokenWrapper", "habbyge-mali, TokenWrapper.equals: " + paramString1 + "=" + paramString2 + "/" + paramString3 + "=" + paramString4);
    boolean bool = paramString1.equals(paramString3);
    AppMethodBeat.o(73387);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.core.stack.h
 * JD-Core Version:    0.6.2
 */