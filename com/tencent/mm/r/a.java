package com.tencent.mm.r;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.kc;
import com.tencent.mm.g.a.kc.b;
import com.tencent.mm.g.a.uh;
import com.tencent.mm.g.a.uh.a;
import com.tencent.mm.model.ae;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  private static ae cfL;

  public static ae Cc()
  {
    AppMethodBeat.i(77700);
    if (cfL == null)
      cfL = com.tencent.mm.booter.a.Ib();
    ae localae = cfL;
    AppMethodBeat.o(77700);
    return localae;
  }

  public static boolean Oo()
  {
    AppMethodBeat.i(77696);
    kc localkc = new kc();
    localkc.cFw.action = 1;
    com.tencent.mm.sdk.b.a.xxA.m(localkc);
    boolean bool = localkc.cFx.cFy;
    AppMethodBeat.o(77696);
    return bool;
  }

  public static boolean bH(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(77695);
    if (Oo())
    {
      ab.i("MicroMsg.DeviceOccupy", "isMultiTalking");
      Toast.makeText(paramContext, 2131301546, 0).show();
      bool = true;
      AppMethodBeat.o(77695);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(77695);
    }
  }

  public static boolean bI(Context paramContext)
  {
    AppMethodBeat.i(77697);
    uh localuh = new uh();
    com.tencent.mm.sdk.b.a.xxA.m(localuh);
    if (localuh.cQt.cQv)
    {
      ab.i("MicroMsg.DeviceOccupy", "isCameraUsing");
      Toast.makeText(paramContext, l(paramContext, localuh.cQt.cQu), 0).show();
    }
    boolean bool = localuh.cQt.cQv;
    AppMethodBeat.o(77697);
    return bool;
  }

  public static boolean bJ(Context paramContext)
  {
    AppMethodBeat.i(77698);
    uh localuh = new uh();
    com.tencent.mm.sdk.b.a.xxA.m(localuh);
    if (localuh.cQt.cQw)
    {
      ab.i("MicroMsg.DeviceOccupy", "isVoiceUsing");
      Toast.makeText(paramContext, l(paramContext, localuh.cQt.cQu), 0).show();
    }
    boolean bool = localuh.cQt.cQw;
    AppMethodBeat.o(77698);
    return bool;
  }

  private static String l(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(77699);
    if (paramBoolean)
    {
      paramContext = paramContext.getString(2131297780);
      AppMethodBeat.o(77699);
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getString(2131297781);
      AppMethodBeat.o(77699);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.r.a
 * JD-Core Version:    0.6.2
 */