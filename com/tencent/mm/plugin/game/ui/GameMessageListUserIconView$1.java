package com.tencent.mm.plugin.game.ui;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.game.f.e.b;

final class GameMessageListUserIconView$1 extends e.b
{
  GameMessageListUserIconView$1(GameMessageListUserIconView paramGameMessageListUserIconView, String paramString)
  {
  }

  public final void a(View paramView, Bitmap paramBitmap)
  {
    AppMethodBeat.i(112090);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
      GameMessageListUserIconView.a(this.nlk).put(this.val$url, paramBitmap);
    AppMethodBeat.o(112090);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameMessageListUserIconView.1
 * JD-Core Version:    0.6.2
 */