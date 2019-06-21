package com.tencent.mm.plugin.fav.ui.detail;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class FavoriteFileDetailUI$13
  implements View.OnClickListener
{
  FavoriteFileDetailUI$13(FavoriteFileDetailUI paramFavoriteFileDetailUI, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74335);
    ab.d("MicroMsg.FavoriteFileDetailUI", "start video preview, fav id %d, fav local id %d", new Object[] { Integer.valueOf(FavoriteFileDetailUI.b(this.mlX).field_id), Long.valueOf(FavoriteFileDetailUI.b(this.mlX).field_localId) });
    paramView = new Intent();
    paramView.putExtra("rawUrl", this.mmb);
    paramView.putExtra("is_favorite_item", true);
    paramView.putExtra("fav_local_id", FavoriteFileDetailUI.b(this.mlX).field_localId);
    paramView.putExtra("geta8key_scene", 14);
    paramView.putExtra("geta8key_scene", 14);
    d.b(this.mlX.mController.ylL, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(74335);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.13
 * JD-Core Version:    0.6.2
 */