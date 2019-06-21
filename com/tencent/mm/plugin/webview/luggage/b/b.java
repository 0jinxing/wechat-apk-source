package com.tencent.mm.plugin.webview.luggage.b;

import android.content.Context;
import android.text.ClipboardManager;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.luggage.permission.LuggageGetA8Key;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;

public final class b extends a
{
  public b()
  {
    super(6);
  }

  public final void a(Context paramContext, d paramd)
  {
    AppMethodBeat.i(6423);
    Object localObject = paramd.cWM().aek(paramd.getUrl());
    if (bo.isNullOrNil((String)localObject));
    for (paramd = paramd.getUrl(); ; paramd = (d)localObject)
    {
      localObject = (ClipboardManager)ah.getContext().getSystemService("clipboard");
      if (localObject != null);
      try
      {
        ((ClipboardManager)localObject).setText(paramd);
        Toast.makeText(paramContext, paramContext.getString(2131305688), 0).show();
        h.pYm.k(982L, 0L, 1L);
        AppMethodBeat.o(6423);
        return;
      }
      catch (Exception paramContext)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.MenuDelegate_CopyLink", paramContext, "clip.setText error", new Object[0]);
      }
    }
  }

  public final void a(Context paramContext, d paramd, l paraml)
  {
    AppMethodBeat.i(6422);
    if (paramd.wD(44))
      paraml.a(6, paramContext.getString(2131305687), 2131230988);
    AppMethodBeat.o(6422);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.b.b
 * JD-Core Version:    0.6.2
 */