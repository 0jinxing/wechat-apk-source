package com.tencent.mm.plugin.fav.ui.gallery;

import android.content.Context;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.r;

final class f$d$4$2
  implements View.OnCreateContextMenuListener
{
  f$d$4$2(f.d.4 param4, f.c paramc)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(74573);
    paramView = b.b(this.mot.mof.cAJ);
    boolean bool1 = e.ct(paramView);
    boolean bool2 = r.amo(paramView);
    if ((!this.mot.mog) && (bool1) && (!bool2))
    {
      paramContextMenu.add(0, 0, 0, this.mos.mor.moe.mContext.getString(2131299734));
      paramContextMenu.add(0, 1, 0, this.mos.mor.moe.mContext.getString(2131299688));
      paramContextMenu.add(0, 2, 0, this.mos.mor.moe.mContext.getString(2131299727));
    }
    while (true)
    {
      paramContextMenu.add(0, 4, 0, this.mos.mor.moe.mContext.getString(2131299647));
      AppMethodBeat.o(74573);
      return;
      if ((this.mot.mog) && (bool1) && (!bool2))
      {
        paramContextMenu.add(0, 0, 0, this.mos.mor.moe.mContext.getString(2131299734));
        paramContextMenu.add(0, 2, 0, this.mos.mor.moe.mContext.getString(2131302712));
      }
      else
      {
        ab.d("MicroMsg.MediaHistoryGalleryAdapter", "openPopupMenu, isVideo:%s, exist:%s, isGif:%s", new Object[] { Boolean.valueOf(this.mot.mog), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.f.d.4.2
 * JD-Core Version:    0.6.2
 */