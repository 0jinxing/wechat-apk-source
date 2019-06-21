package com.tencent.mm.plugin.appbrand.widget.b;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RatingBar;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f$6
  implements View.OnClickListener
{
  public f$6(f paramf, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(134258);
    if (f.c(this.jck) != null)
    {
      int i = (int)f.c(this.jck).getRating();
      f.a(this.jck, i);
      Toast.makeText(this.val$context, this.val$context.getString(2131296619), 0).show();
      f.a(this.jck, true);
      this.jck.dismiss();
    }
    AppMethodBeat.o(134258);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.f.6
 * JD-Core Version:    0.6.2
 */