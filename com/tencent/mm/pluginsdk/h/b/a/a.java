package com.tencent.mm.pluginsdk.h.b.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.k;
import java.io.File;

public final class a
{
  public static boolean b(String paramString, Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(27458);
    o.all();
    paramBoolean = c(t.uh(paramString), paramContext, paramBoolean);
    AppMethodBeat.o(27458);
    return paramBoolean;
  }

  public static boolean c(String paramString, Context paramContext, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(27459);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(27459);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (paramContext == null)
      {
        AppMethodBeat.o(27459);
        paramBoolean = bool;
      }
      else
      {
        Intent localIntent = new Intent("android.intent.action.VIEW").addFlags(268435456);
        localIntent.putExtra("ChannelID", "com.tencent.mm");
        localIntent.putExtra("PosID", 3);
        paramString = new File(paramString);
        if (paramBoolean)
          k.a(paramContext, localIntent, paramString, "video/quicktime");
        while (true)
        {
          if (bo.k(paramContext, localIntent))
            break label129;
          AppMethodBeat.o(27459);
          paramBoolean = bool;
          break;
          k.a(paramContext, localIntent, paramString, "video/*");
        }
        label129: paramContext.startActivity(localIntent);
        paramBoolean = true;
        AppMethodBeat.o(27459);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.h.b.a.a
 * JD-Core Version:    0.6.2
 */