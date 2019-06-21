package com.tencent.mm.plugin.fav.ui.gallery;

import android.content.Context;
import android.view.MenuItem;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.platformtools.q;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.h;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.n.d;
import java.util.ArrayList;
import java.util.List;

final class f$d$4$3
  implements n.d
{
  f$d$4$3(f.d.4 param4, f.c paramc, int paramInt)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(74574);
    String str = b.b(this.mot.mof.cAJ);
    switch (paramMenuItem.getItemId())
    {
    case 3:
    default:
    case 0:
    case 1:
    case 2:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(74574);
      while (true)
      {
        return;
        paramMenuItem = new ArrayList();
        paramMenuItem.add(this.mot.mof);
        this.mos.mor.moe.mob.bS(paramMenuItem);
        AppMethodBeat.o(74574);
        continue;
        h.j(this.mot.mof.mnW.field_localId, 0, 0);
        b.d(str, this.mos.mor.moe.mContext);
        AppMethodBeat.o(74574);
        continue;
        if (bo.isNullOrNil(str))
        {
          ab.w("MicroMsg.MediaHistoryGalleryAdapter", "save image fail, path is null");
          AppMethodBeat.o(74574);
        }
        else
        {
          if (!this.mot.mog)
          {
            if (q.a(str, this.mos.mor.moe.mContext, 2131298807))
              break;
            Toast.makeText(this.mos.mor.moe.mContext, this.mos.mor.moe.mContext.getString(2131299726), 1).show();
            AppMethodBeat.o(74574);
            continue;
          }
          paramMenuItem = u.uu(str);
          ab.i("MicroMsg.MediaHistoryGalleryAdapter", "save video now video path %s out path %s", new Object[] { str, paramMenuItem });
          if (bo.isNullOrNil(paramMenuItem))
          {
            Toast.makeText(this.mos.mor.moe.mContext, this.mos.mor.moe.mContext.getString(2131304256), 1).show();
            AppMethodBeat.o(74574);
          }
          else
          {
            Toast.makeText(this.mos.mor.moe.mContext, this.mos.mor.moe.mContext.getString(2131304257, new Object[] { paramMenuItem }), 1).show();
            n.a(paramMenuItem, this.mos.mor.moe.mContext);
            AppMethodBeat.o(74574);
          }
        }
      }
      this.mos.mor.moe.mnG.index = (this.mos.mor.moe.getItemCount() - this.gvp);
      ((y)com.tencent.mm.kernel.g.K(y.class)).a(this.mos.mor.moe.mContext, this.mot.mof.mnW, this.mos.mor.moe.mnG);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.f.d.4.3
 * JD-Core Version:    0.6.2
 */