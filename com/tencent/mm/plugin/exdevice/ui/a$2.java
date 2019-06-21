package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$2
  implements View.OnClickListener
{
  a$2(a parama, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20003);
    paramView = a.b(this.lBA);
    Intent localIntent = new Intent(paramView, ExdeviceProfileUI.class);
    localIntent.putExtra("username", this.fwC);
    paramView.startActivity(localIntent);
    AppMethodBeat.o(20003);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.a.2
 * JD-Core Version:    0.6.2
 */