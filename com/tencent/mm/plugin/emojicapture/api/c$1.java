package com.tencent.mm.plugin.emojicapture.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ContextThemeWrapper;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1
  implements b.a
{
  c$1(Context paramContext, Intent paramIntent)
  {
  }

  public final void gA(boolean paramBoolean)
  {
    AppMethodBeat.i(57468);
    if (paramBoolean)
      if ((this.val$context instanceof Activity))
      {
        ((Activity)this.val$context).startActivityForResult(this.val$intent, this.val$requestCode);
        AppMethodBeat.o(57468);
      }
    while (true)
    {
      return;
      if ((this.val$context instanceof ContextThemeWrapper))
      {
        Context localContext = ((ContextThemeWrapper)this.val$context).getBaseContext();
        if ((localContext instanceof Activity))
        {
          ((Activity)localContext).startActivityForResult(this.val$intent, this.val$requestCode);
          AppMethodBeat.o(57468);
        }
        else
        {
          this.val$context.startActivity(this.val$intent);
          AppMethodBeat.o(57468);
        }
      }
      else
      {
        this.val$context.startActivity(this.val$intent);
        AppMethodBeat.o(57468);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.api.c.1
 * JD-Core Version:    0.6.2
 */