package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.sns.b.h;

final class SnsLabelContactListUI$2
  implements AdapterView.OnItemClickListener
{
  SnsLabelContactListUI$2(SnsLabelContactListUI paramSnsLabelContactListUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(33939);
    Intent localIntent = new Intent();
    paramAdapterView = (a)SnsLabelContactListUI.a(this.zpm).getItem(paramInt);
    paramView = com.tencent.mm.plugin.sns.b.n.qFC;
    if (paramView == null)
    {
      this.zpm.finish();
      AppMethodBeat.o(33939);
    }
    while (true)
    {
      return;
      paramView = paramView.e(localIntent, paramAdapterView.field_username);
      if (paramView == null)
      {
        this.zpm.finish();
        AppMethodBeat.o(33939);
      }
      else
      {
        paramView.putExtra("Contact_User", paramAdapterView.field_username);
        WorkerProfile.Ca().cfV.c(paramView, this.zpm);
        AppMethodBeat.o(33939);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SnsLabelContactListUI.2
 * JD-Core Version:    0.6.2
 */