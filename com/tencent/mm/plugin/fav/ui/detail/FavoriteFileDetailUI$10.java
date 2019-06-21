package com.tencent.mm.plugin.fav.ui.detail;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.a.m;
import com.tencent.mm.plugin.fav.a.m.a;
import com.tencent.mm.plugin.fav.a.m.b;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aau;

final class FavoriteFileDetailUI$10
  implements View.OnClickListener
{
  FavoriteFileDetailUI$10(FavoriteFileDetailUI paramFavoriteFileDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74332);
    m.a(m.a.mfu, FavoriteFileDetailUI.b(this.mlX));
    paramView = FavoriteFileDetailUI.a(this.mlX).wgZ;
    String str = b.c(FavoriteFileDetailUI.a(this.mlX));
    Intent localIntent = new Intent();
    localIntent.putExtra("IsAd", false);
    localIntent.putExtra("KStremVideoUrl", paramView.fiG);
    localIntent.putExtra("StreamWording", paramView.fiJ);
    localIntent.putExtra("StremWebUrl", paramView.fiK);
    localIntent.putExtra("KBlockFav", true);
    localIntent.putExtra("KThumUrl", paramView.fiL);
    localIntent.putExtra("KThumbPath", str);
    localIntent.putExtra("KMediaId", "fakeid_" + FavoriteFileDetailUI.b(this.mlX).field_id);
    localIntent.putExtra("KMediaVideoTime", paramView.wid);
    localIntent.putExtra("KMediaTitle", FavoriteFileDetailUI.a(this.mlX).title);
    localIntent.putExtra("KSta_StremVideoAduxInfo", paramView.fiM);
    localIntent.putExtra("KSta_StremVideoPublishId", paramView.fiN);
    localIntent.putExtra("KSta_SourceType", 1);
    localIntent.putExtra("KSta_Scene", m.b.mfE.value);
    localIntent.putExtra("KSta_FromUserName", FavoriteFileDetailUI.b(this.mlX).field_fromUser);
    localIntent.putExtra("KSta_FavID", FavoriteFileDetailUI.b(this.mlX).field_id);
    localIntent.putExtra("KSta_SnsStatExtStr", FavoriteFileDetailUI.a(this.mlX).cMn);
    d.b(this.mlX, "sns", ".ui.VideoAdPlayerUI", localIntent);
    AppMethodBeat.o(74332);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.10
 * JD-Core Version:    0.6.2
 */