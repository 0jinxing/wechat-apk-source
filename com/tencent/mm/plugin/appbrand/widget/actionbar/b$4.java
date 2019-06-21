package com.tencent.mm.plugin.appbrand.widget.actionbar;

import android.graphics.Bitmap;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.AppBrandActionBarCustomImageView;

public final class b$4
  implements Runnable
{
  public b$4(b paramb, Bitmap paramBitmap, View.OnClickListener paramOnClickListener)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87452);
    b.b(this.iUQ).setVisibility(0);
    b.b(this.iUQ).setImageBitmap(this.val$bitmap);
    b.b(this.iUQ).setClickable(true);
    b.b(this.iUQ).setOnClickListener(this.val$listener);
    AppMethodBeat.o(87452);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.actionbar.b.4
 * JD-Core Version:    0.6.2
 */