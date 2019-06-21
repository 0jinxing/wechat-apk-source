package com.tencent.mm.plugin.fav.ui.detail;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.a.h.a;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class FavoriteImgDetailUI$5
  implements View.OnClickListener
{
  FavoriteImgDetailUI$5(FavoriteImgDetailUI paramFavoriteImgDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74385);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_detail_info_id", FavoriteImgDetailUI.b(this.mmn).field_localId);
    localIntent.putExtra("key_detail_data_id", ((aar)paramView.getTag()).mnd);
    b.b(this.mmn.mController.ylL, ".ui.FavImgGalleryUI", localIntent);
    paramView = this.mmn.mlz;
    paramView.meY += 1;
    AppMethodBeat.o(74385);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.5
 * JD-Core Version:    0.6.2
 */