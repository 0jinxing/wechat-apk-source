package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMFragment;

public final class e
{
  public static boolean a(String paramString1, Context paramContext, MMFragment paramMMFragment, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(30456);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(30456);
    while (true)
    {
      return bool;
      Object localObject = null;
      if (paramString1.startsWith("weixin://openNativeUrl/weixinHB"))
        localObject = new e.a();
      while (true)
      {
        if ((localObject == null) || (!((e.c)localObject).a(paramString1, paramContext, paramMMFragment, paramString2)))
          break label115;
        bool = true;
        AppMethodBeat.o(30456);
        break;
        if (e.b.ara(paramString1))
          localObject = new e.b();
        else if (e.d.ara(paramString1))
          localObject = new e.d();
      }
      label115: AppMethodBeat.o(30456);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.e
 * JD-Core Version:    0.6.2
 */