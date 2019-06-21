package com.tencent.mm.plugin.webview.luggage.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.ui.base.l;

public final class c extends a
{
  public c()
  {
    super(12);
  }

  public final void a(Context paramContext, d paramd)
  {
    AppMethodBeat.i(6425);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_fav_scene", 2);
    localIntent.putExtra("key_fav_item_id", paramd.bPP.getLong("fav_local_id", -1L));
    b.b(paramContext, ".ui.FavTagEditUI", localIntent);
    h.pYm.k(982L, 1L, 1L);
    AppMethodBeat.o(6425);
  }

  public final void a(Context paramContext, d paramd, l paraml)
  {
    AppMethodBeat.i(6424);
    boolean bool1 = paramd.bPP.getBoolean("is_favorite_item", false);
    boolean bool2 = paramd.bPP.getBoolean("key_detail_can_delete", true);
    if ((bool1) && (bool2))
      paraml.a(12, paramContext.getString(2131299590), 2131230982);
    AppMethodBeat.o(6424);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.b.c
 * JD-Core Version:    0.6.2
 */