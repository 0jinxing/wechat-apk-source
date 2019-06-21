package com.tencent.mm.plugin.webview.e;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class c
{
  public HashMap<String, c.a> uKV;

  public c()
  {
    AppMethodBeat.i(10139);
    this.uKV = new HashMap();
    AppMethodBeat.o(10139);
  }

  public static void a(Context paramContext, String paramString, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(10140);
    com.tencent.mm.ui.widget.a.c.a locala = new com.tencent.mm.ui.widget.a.c.a(paramContext);
    locala.rc(false);
    locala.PY(3);
    locala.asD(paramContext.getString(2131305577));
    if (!bo.isNullOrNil(paramString))
    {
      locala.ra(true);
      locala.ak(paramString);
    }
    locala.rb(true);
    locala.asH(paramContext.getString(2131305576));
    locala.asJ(paramContext.getString(2131296994));
    locala.Qe(paramContext.getResources().getColor(2131690208));
    locala.a(paramOnClickListener);
    locala.asK(paramContext.getString(2131296868));
    paramString = as.eg("key_webview_menu_haokan", 2);
    if (paramString.decodeBool("show_first_tips", true))
    {
      paramString.encode("show_first_tips", false);
      paramString.apply();
      locala.aj(paramContext.getString(2131305575));
    }
    locala.aMb().show();
    AppMethodBeat.o(10140);
  }

  public final c.a agE(String paramString)
  {
    AppMethodBeat.i(10141);
    paramString = (c.a)this.uKV.get(paramString);
    AppMethodBeat.o(10141);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.e.c
 * JD-Core Version:    0.6.2
 */