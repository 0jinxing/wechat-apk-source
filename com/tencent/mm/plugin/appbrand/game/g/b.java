package com.tencent.mm.plugin.appbrand.game.g;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
{
  private static boolean hrA = false;

  public static void cH(Context paramContext)
  {
    AppMethodBeat.i(130340);
    String str1 = q.etl.epF;
    if (hrA)
    {
      ab.i("MicroMsg.WAGameShowFailDialogUtil", "hy: already shown");
      AppMethodBeat.o(130340);
      return;
    }
    String str2 = ah.getResources().getString(2131297098);
    String str3 = ah.getResources().getString(2131297061);
    if (!bo.isNullOrNil(str1))
      str2 = str1;
    while (true)
    {
      com.tencent.mm.plugin.appbrand.ipc.a.a(paramContext, str2, str3, ah.getResources().getString(2131296994), "", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(130337);
          b.Pu();
          AppMethodBeat.o(130337);
        }
      }
      , new b.2(), new b.3());
      hrA = true;
      AppMethodBeat.o(130340);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.g.b
 * JD-Core Version:    0.6.2
 */