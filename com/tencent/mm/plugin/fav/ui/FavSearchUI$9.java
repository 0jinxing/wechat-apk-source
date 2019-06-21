package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.a.c;
import com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView;
import com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView.a;
import com.tencent.mm.plugin.fav.ui.widget.FavTagPanel;
import com.tencent.mm.plugin.report.service.h;
import java.util.List;

final class FavSearchUI$9 extends c
{
  FavSearchUI$9(FavSearchUI paramFavSearchUI, Context paramContext)
  {
    super(paramContext);
  }

  public final void Ma(String paramString)
  {
    AppMethodBeat.i(74076);
    FavSearchActionView localFavSearchActionView = FavSearchUI.b(this.mjo);
    localFavSearchActionView.mpS.add(paramString);
    if (localFavSearchActionView.mjS == null)
      AppMethodBeat.o(74076);
    while (true)
    {
      return;
      localFavSearchActionView.mjS.setEditHint("");
      localFavSearchActionView.mjS.cc(paramString, true);
      if (localFavSearchActionView.mpU == null)
      {
        AppMethodBeat.o(74076);
      }
      else
      {
        localFavSearchActionView.Mh(localFavSearchActionView.mjS.getEditText());
        localFavSearchActionView.mpU.a(localFavSearchActionView.mlj, localFavSearchActionView.mpT, localFavSearchActionView.mpS, false);
        h.pYm.e(11126, new Object[] { Integer.valueOf(2) });
        AppMethodBeat.o(74076);
      }
    }
  }

  public final void Mb(String paramString)
  {
    AppMethodBeat.i(74077);
    FavSearchActionView localFavSearchActionView = FavSearchUI.b(this.mjo);
    localFavSearchActionView.mpS.remove(paramString);
    if (localFavSearchActionView.mjS == null)
      AppMethodBeat.o(74077);
    while (true)
    {
      return;
      if (localFavSearchActionView.mpS.isEmpty())
        localFavSearchActionView.mjS.setEditHint(localFavSearchActionView.getResources().getString(2131297040));
      localFavSearchActionView.mjS.removeTag(paramString);
      if (localFavSearchActionView.mpU == null)
      {
        AppMethodBeat.o(74077);
      }
      else
      {
        localFavSearchActionView.Mh(localFavSearchActionView.mjS.getEditText());
        localFavSearchActionView.mpU.a(localFavSearchActionView.mlj, localFavSearchActionView.mpT, localFavSearchActionView.mpS, true);
        AppMethodBeat.o(74077);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavSearchUI.9
 * JD-Core Version:    0.6.2
 */