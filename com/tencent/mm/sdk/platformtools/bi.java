package com.tencent.mm.sdk.platformtools;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class bi
{
  @TargetApi(8)
  public static void c(ListView paramListView)
  {
    AppMethodBeat.i(93591);
    if (paramListView.getFirstVisiblePosition() > 10)
      paramListView.setSelection(10);
    if (Build.VERSION.SDK_INT >= 8)
      paramListView.smoothScrollToPosition(0);
    AppMethodBeat.o(93591);
  }

  @TargetApi(8)
  public static void d(ListView paramListView, int paramInt)
  {
    AppMethodBeat.i(93592);
    int i = paramListView.getFirstVisiblePosition();
    if ((i > paramInt) && (i - paramInt > 10))
      paramListView.setSelection(paramInt + 10);
    while (true)
    {
      if (Build.VERSION.SDK_INT >= 8)
        paramListView.smoothScrollToPosition(paramInt);
      AppMethodBeat.o(93592);
      return;
      if ((i < paramInt) && (paramInt - i > 10))
        paramListView.setSelection(paramInt - 10);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bi
 * JD-Core Version:    0.6.2
 */