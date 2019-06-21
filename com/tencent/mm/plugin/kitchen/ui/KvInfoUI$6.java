package com.tencent.mm.plugin.kitchen.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.d;
import com.tencent.mm.plugin.report.service.j;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;
import java.util.HashMap;

final class KvInfoUI$6
  implements AdapterView.OnItemClickListener
{
  KvInfoUI$6(KvInfoUI paramKvInfoUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(114448);
    paramAdapterView = (d)KvInfoUI.b(this.nHk).getItem(paramInt);
    if (paramAdapterView == null)
      AppMethodBeat.o(114448);
    while (true)
    {
      return;
      if ((paramAdapterView.cvZ == null) || (paramAdapterView.cvZ.length() <= 0))
        paramAdapterView.cvZ = ag.ck(paramAdapterView.value);
      paramAdapterView = paramAdapterView.cvZ;
      paramAdapterView = (String)j.cgu().pYE.get(paramAdapterView);
      if (KvInfoUI.c(this.nHk) != null)
        KvInfoUI.c(this.nHk).dismiss();
      if (!bo.isNullOrNil(paramAdapterView))
        KvInfoUI.a(this.nHk, h.a(this.nHk, paramAdapterView, "", this.nHk.getString(2131296994), this.nHk.getString(2131296875), true, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(114446);
            paramAnonymousDialogInterface.cancel();
            AppMethodBeat.o(114446);
          }
        }
        , new KvInfoUI.6.2(this, paramAdapterView), -1));
      AppMethodBeat.o(114448);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.kitchen.ui.KvInfoUI.6
 * JD-Core Version:    0.6.2
 */