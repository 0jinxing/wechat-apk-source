package com.tencent.mm.plugin.freewifi.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import java.lang.ref.WeakReference;
import java.util.Date;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20920);
    paramView = new Date();
    if ((a.bzH() != null) && (paramView.getTime() - a.bzH().getTime() < 1000L))
      AppMethodBeat.o(20920);
    while (true)
    {
      return;
      a.a(paramView);
      paramView = new Intent();
      paramView.putExtra("free_wifi_source", 2);
      paramView.addFlags(67108864);
      d.b((Context)a.a(this.myk).get(), "freewifi", ".ui.FreeWifiEntryUI", paramView);
      AppMethodBeat.o(20920);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.a.1
 * JD-Core Version:    0.6.2
 */