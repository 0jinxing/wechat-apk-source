package com.tencent.mm.plugin.music.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.model.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class LyricView$a extends GestureDetector.SimpleOnGestureListener
{
  private LyricView$a(LyricView paramLyricView)
  {
  }

  public final void onLongPress(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(105043);
    paramMotionEvent = LyricView.a(this.oOo, paramMotionEvent.getX(), paramMotionEvent.getY());
    if (!bo.isNullOrNil(paramMotionEvent))
    {
      e.bUl().setPrimaryClip(ClipData.newPlainText("MicroMsg.Music", paramMotionEvent));
      Toast.makeText(this.oOo.getContext(), this.oOo.getContext().getString(2131301586, new Object[] { paramMotionEvent }), 0).show();
      AppMethodBeat.o(105043);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Music.LyricView", "onLongPress not found sentence");
      AppMethodBeat.o(105043);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.LyricView.a
 * JD-Core Version:    0.6.2
 */