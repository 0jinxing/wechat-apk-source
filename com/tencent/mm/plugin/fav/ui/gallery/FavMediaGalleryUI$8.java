package com.tencent.mm.plugin.fav.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.g.a.nr.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.h;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.f;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import java.util.Map;

final class FavMediaGalleryUI$8
  implements n.d
{
  FavMediaGalleryUI$8(FavMediaGalleryUI paramFavMediaGalleryUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(74515);
    Object localObject1 = FavMediaGalleryUI.d(this.mnH).vC(FavMediaGalleryUI.c(this.mnH));
    if (localObject1 == null)
      AppMethodBeat.o(74515);
    Object localObject2;
    while (true)
    {
      return;
      localObject2 = b.b(((f)localObject1).cAv);
      if ((e.ct((String)localObject2)) || (paramMenuItem.getItemId() == 4))
        break;
      ab.w("MicroMsg.FavMediaGalleryUI", "file not exists");
      AppMethodBeat.o(74515);
    }
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(74515);
      break;
      h.j(FavMediaGalleryUI.e(this.mnH), 1, 0);
      if (((f)localObject1).cAv.dataType == 2)
      {
        if (r.amo((String)localObject2))
        {
          paramMenuItem = new Intent();
          paramMenuItem.putExtra("Select_Conv_Type", 3);
          paramMenuItem.putExtra("select_is_ret", true);
          d.b(this.mnH, ".ui.transmit.SelectConversationUI", paramMenuItem, 1);
          AppMethodBeat.o(74515);
          break;
        }
        b.c((String)localObject2, this.mnH);
        AppMethodBeat.o(74515);
        break;
      }
      paramMenuItem = b.c(((f)localObject1).cAv);
      localObject2 = b.b(((f)localObject1).cAv);
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("Select_Conv_Type", 3);
      ((Intent)localObject1).putExtra("select_is_ret", true);
      ((Intent)localObject1).putExtra("mutil_select_is_ret", true);
      if (e.ct(paramMenuItem))
        ((Intent)localObject1).putExtra("image_path", paramMenuItem);
      while (true)
      {
        ((Intent)localObject1).putExtra("Retr_Msg_Type", 1);
        d.b(this.mnH.mController.ylL, ".ui.transmit.SelectConversationUI", (Intent)localObject1, 1);
        AppMethodBeat.o(74515);
        break;
        ((Intent)localObject1).putExtra("image_path", (String)localObject2);
      }
      b.d((String)localObject2, this.mnH);
      h.j(FavMediaGalleryUI.e(this.mnH), 0, 0);
      AppMethodBeat.o(74515);
      break;
      if (((f)localObject1).cAv.dataType == 2)
      {
        FavMediaGalleryUI.a(this.mnH, (String)localObject2);
        AppMethodBeat.o(74515);
        break;
      }
      FavMediaGalleryUI.b(this.mnH, (String)localObject2);
      AppMethodBeat.o(74515);
      break;
      localObject2 = (nr)FavMediaGalleryUI.f(this.mnH).get(localObject2);
      if (localObject2 != null)
      {
        paramMenuItem = new cf();
        paramMenuItem.cvm.activity = this.mnH;
        paramMenuItem.cvm.ctB = ((nr)localObject2).cJX.result;
        paramMenuItem.cvm.cvn = ((nr)localObject2).cJX.cvn;
        paramMenuItem.cvm.cvp = 7;
        if ((localObject1 != null) && (((f)localObject1).cAv != null))
        {
          paramMenuItem.cvm.imagePath = ((f)localObject1).cAv.wfZ;
          paramMenuItem.cvm.cvr = ((f)localObject1).cAv.wgb;
        }
        paramMenuItem.cvm.cvo = ((nr)localObject2).cJX.cvo;
        localObject1 = new Bundle(1);
        ((Bundle)localObject1).putInt("stat_scene", 5);
        paramMenuItem.cvm.cvs = ((Bundle)localObject1);
        a.xxA.m(paramMenuItem);
        AppMethodBeat.o(74515);
        break;
        this.mnH.mnG.index = (FavMediaGalleryUI.d(this.mnH).getCount() - FavMediaGalleryUI.c(this.mnH));
        ((y)g.K(y.class)).a(this.mnH.mController.ylL, ((f)localObject1).mij, this.mnH.mnG);
        this.mnH.finish();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI.8
 * JD-Core Version:    0.6.2
 */