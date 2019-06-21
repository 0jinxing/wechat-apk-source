package com.tencent.mm.ui.chatting.m;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.a.e.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.Map;

final class a$1
  implements e.b
{
  a$1(a parama)
  {
  }

  public final CharSequence a(Map<String, String> paramMap, String paramString, Bundle paramBundle, WeakReference<Context> paramWeakReference)
  {
    Object localObject = null;
    AppMethodBeat.i(32740);
    String str = paramBundle.getString("conv_talker_username", "");
    if (paramMap == null)
    {
      ab.w("MicroMsg.SysMsgHandlerBase", "hy: non map!!");
      AppMethodBeat.o(32740);
      paramMap = localObject;
    }
    while (true)
    {
      return paramMap;
      if (bo.isNullOrNil(paramString))
      {
        ab.w("MicroMsg.SysMsgHandlerBase", "hy: non header!!");
        AppMethodBeat.o(32740);
        paramMap = localObject;
      }
      else if (bo.isNullOrNil(str))
      {
        ab.w("MicroMsg.SysMsgHandlerBase", "hy: not resolved talker!!");
        AppMethodBeat.o(32740);
        paramMap = localObject;
      }
      else
      {
        paramMap = this.zaG.b(paramMap, paramString, paramBundle, paramWeakReference);
        AppMethodBeat.o(32740);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.m.a.1
 * JD-Core Version:    0.6.2
 */