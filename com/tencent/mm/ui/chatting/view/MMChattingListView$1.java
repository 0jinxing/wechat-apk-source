package com.tencent.mm.ui.chatting.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMChattingListView$1 extends ListView
{
  MMChattingListView$1(MMChattingListView paramMMChattingListView, Context paramContext)
  {
    super(paramContext);
  }

  public final void onDrawForeground(Canvas paramCanvas)
  {
    AppMethodBeat.i(32761);
    super.onDrawForeground(paramCanvas);
    if (!MMChattingListView.a(this.zaS).isEmpty())
    {
      Rect localRect1 = new Rect();
      MMChattingListView.b(this.zaS).getLocalVisibleRect(localRect1);
      Rect localRect2 = new Rect(localRect1);
      Rect localRect3 = new Rect(localRect1);
      localRect2.bottom = MMChattingListView.a(this.zaS).top;
      localRect3.top = MMChattingListView.a(this.zaS).bottom;
      paramCanvas.drawRect(localRect2, MMChattingListView.c(this.zaS));
      paramCanvas.drawRect(localRect3, MMChattingListView.c(this.zaS));
      ab.d("MicroMsg.MMChattingListView", "[onDrawForeground] drawingRect:%s mHighLightItemRect:%s", new Object[] { localRect1, MMChattingListView.a(this.zaS) });
    }
    AppMethodBeat.o(32761);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.view.MMChattingListView.1
 * JD-Core Version:    0.6.2
 */