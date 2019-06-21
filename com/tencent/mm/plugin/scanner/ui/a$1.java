package com.tencent.mm.plugin.scanner.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.f;

final class a$1
  implements Runnable
{
  a$1(a parama, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(80898);
    a.a(this.qaK).setImageBitmap(this.val$bitmap);
    a.a(this.qaK).setVisibility(0);
    if (a.b(this.qaK) != null)
      a.b(this.qaK).notifyDataSetChanged();
    AppMethodBeat.o(80898);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.a.1
 * JD-Core Version:    0.6.2
 */