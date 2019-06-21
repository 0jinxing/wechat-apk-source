package com.tencent.mm.plugin.favorite;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.a.c.a.b;

final class d$9
  implements c.a.b
{
  d$9(g paramg, Context paramContext)
  {
  }

  public final void bwF()
  {
    AppMethodBeat.i(20507);
    aar localaar = b.c(this.meI);
    if (localaar == null)
    {
      ab.e("MicroMsg.FavItemLogic", "goPlayView, but dataitem is null , exit");
      AppMethodBeat.o(20507);
    }
    while (true)
    {
      return;
      Intent localIntent;
      if ((localaar.wgZ != null) && ((!bo.isNullOrNil(localaar.wgZ.fiG)) || (!bo.isNullOrNil(localaar.wgZ.fiK))))
      {
        ab.i("MicroMsg.FavItemLogic", "it is ad sight.use sight play");
        localIntent = new Intent();
        localIntent.putExtra("key_detail_info_id", this.meI.field_localId);
        localIntent.putExtra("key_detail_data_id", localaar.mnd);
        localIntent.putExtra("key_detail_can_delete", false);
        b.b(this.val$context, ".ui.detail.FavoriteFileDetailUI", localIntent);
        AppMethodBeat.o(20507);
      }
      else
      {
        localIntent = new Intent();
        localIntent.putExtra("key_detail_info_id", this.meI.field_localId);
        localIntent.putExtra("key_detail_fav_path", b.b(localaar));
        localIntent.putExtra("key_detail_fav_thumb_path", b.c(localaar));
        localIntent.putExtra("key_detail_fav_video_duration", localaar.duration);
        localIntent.putExtra("key_detail_statExtStr", localaar.cMn);
        localIntent.putExtra("show_share", false);
        b.b(this.val$context, ".ui.detail.FavoriteVideoPlayUI", localIntent);
        AppMethodBeat.o(20507);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.favorite.d.9
 * JD-Core Version:    0.6.2
 */