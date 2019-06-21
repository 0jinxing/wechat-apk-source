package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zze
  implements View.OnClickListener
{
  zze(Context paramContext, Intent paramIntent)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(61639);
    try
    {
      this.val$context.startActivity(this.zzabl);
      AppMethodBeat.o(61639);
      return;
    }
    catch (ActivityNotFoundException paramView)
    {
      while (true)
        AppMethodBeat.o(61639);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.zze
 * JD-Core Version:    0.6.2
 */