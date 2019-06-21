package com.tencent.mm.plugin.fav.ui.detail;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ak;

final class FavoriteFileDetailUI$1
  implements View.OnClickListener
{
  FavoriteFileDetailUI$1(FavoriteFileDetailUI paramFavoriteFileDetailUI, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74321);
    Intent localIntent = new Intent();
    paramView = new Bundle();
    paramView.putString("key_snsad_statextstr", FavoriteFileDetailUI.a(this.mlX).cMn);
    localIntent.putExtra("jsapiargs", paramView);
    localIntent.putExtra("rawUrl", this.mlW);
    localIntent.putExtra("useJs", true);
    new ak(Looper.getMainLooper()).post(new FavoriteFileDetailUI.1.1(this, localIntent));
    AppMethodBeat.o(74321);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.1
 * JD-Core Version:    0.6.2
 */