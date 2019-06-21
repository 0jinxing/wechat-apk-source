package com.tencent.mm.plugin.fav.ui.detail;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.a.h;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.vfs.e;

final class FavoriteImgDetailUI$8
  implements n.d
{
  FavoriteImgDetailUI$8(FavoriteImgDetailUI paramFavoriteImgDetailUI, FavoriteImgDetailUI.a parama)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(74388);
    Object localObject = com.tencent.mm.plugin.fav.a.b.b(this.mms.cAv);
    if (!e.ct((String)localObject))
    {
      ab.w("MicroMsg.FavoriteImgDetailUI", "file not exists");
      AppMethodBeat.o(74388);
      return;
    }
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(74388);
      break;
      com.tencent.mm.plugin.fav.a.b.d((String)localObject, this.mmn.mController.ylL);
      h.j(FavoriteImgDetailUI.b(this.mmn).field_localId, 0, 0);
      AppMethodBeat.o(74388);
      break;
      if (r.amo((String)localObject))
      {
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("Select_Conv_Type", 3);
        paramMenuItem.putExtra("select_is_ret", true);
        d.b(this.mmn, ".ui.transmit.SelectConversationUI", paramMenuItem, 1);
      }
      while (true)
      {
        h.j(FavoriteImgDetailUI.b(this.mmn).field_localId, 1, 0);
        AppMethodBeat.o(74388);
        break;
        com.tencent.mm.plugin.fav.a.b.c((String)localObject, this.mmn.mController.ylL);
      }
      FavoriteImgDetailUI.a((String)localObject, this.mmn.getString(2131299726), this.mmn.mController.ylL);
      AppMethodBeat.o(74388);
      break;
      ab.i("MicroMsg.FavoriteImgDetailUI", "request deal QBAR string");
      localObject = new cf();
      ((cf)localObject).cvm.activity = this.mmn;
      ((cf)localObject).cvm.ctB = this.mms.mmw;
      ((cf)localObject).cvm.cvn = this.mms.cvn;
      ((cf)localObject).cvm.cvp = 7;
      if (this.mms.cAv != null)
      {
        ((cf)localObject).cvm.imagePath = this.mms.cAv.wfZ;
        ((cf)localObject).cvm.cvr = this.mms.cAv.wgb;
      }
      ((cf)localObject).cvm.cvo = this.mms.cvo;
      paramMenuItem = new Bundle(1);
      paramMenuItem.putInt("stat_scene", 5);
      ((cf)localObject).cvm.cvs = paramMenuItem;
      a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.8
 * JD-Core Version:    0.6.2
 */