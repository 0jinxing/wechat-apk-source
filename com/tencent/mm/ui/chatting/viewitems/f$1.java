package com.tencent.mm.ui.chatting.viewitems;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.i;

final class f$1
  implements i
{
  public final void a(String paramString, View paramView, Bitmap paramBitmap, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(32876);
    if ((paramBitmap != null) && (paramString.equals(paramView.getTag(2131824220))))
      paramView.setBackground(f.aq(paramBitmap));
    AppMethodBeat.o(32876);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.f.1
 * JD-Core Version:    0.6.2
 */