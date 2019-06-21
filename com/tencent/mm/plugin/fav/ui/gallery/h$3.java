package com.tencent.mm.plugin.fav.ui.gallery;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class h$3
  implements f.b
{
  h$3(h paramh)
  {
  }

  public final void a(boolean paramBoolean, f.c paramc, int paramInt)
  {
    AppMethodBeat.i(74592);
    ab.i("MicroMsg.MediaHistoryGalleryPresenter", "[onCheck] isChecked :%s pos:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if ((paramBoolean) && (e.a.bwv().mnX.size() >= 9))
    {
      Toast.makeText(this.moB.mContext, this.moB.mContext.getResources().getString(2131299579, new Object[] { Integer.valueOf(9) }), 1).show();
      this.moB.mox.cg(paramInt);
      AppMethodBeat.o(74592);
      return;
    }
    e locale;
    if (paramBoolean)
    {
      locale = e.a.bwv();
      paramc = paramc.mof;
      if (paramc != null)
      {
        ab.i("MicroMsg.ImageGallerySelectedHandle", "add : %s", new Object[] { paramc });
        locale.mnX.remove(paramc);
        locale.mnX.remove(locale.Mg(paramc.cAJ.mnd));
        locale.mnX.add(paramc);
        locale.bwu();
      }
    }
    while (true)
    {
      this.moB.mow.vF(e.a.bwv().mnX.size());
      AppMethodBeat.o(74592);
      break;
      locale = e.a.bwv();
      paramc = paramc.mof;
      if (paramc != null)
      {
        ab.i("MicroMsg.ImageGallerySelectedHandle", "remove : %s", new Object[] { paramc.cAJ.mnd });
        locale.mnX.remove(paramc);
        locale.mnX.remove(locale.Mg(paramc.cAJ.mnd));
        locale.bwu();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.h.3
 * JD-Core Version:    0.6.2
 */