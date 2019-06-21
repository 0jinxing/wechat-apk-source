package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.sns.b.h;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SnsTagContactListUI$1
  implements AdapterView.OnItemClickListener
{
  SnsTagContactListUI$1(SnsTagContactListUI paramSnsTagContactListUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(33955);
    paramAdapterView = new Intent();
    a locala = (a)SnsTagContactListUI.a(this.zpu).getItem(paramInt);
    paramView = n.qFC;
    if (paramView == null)
    {
      this.zpu.finish();
      AppMethodBeat.o(33955);
    }
    while (true)
    {
      return;
      paramAdapterView = paramView.e(paramAdapterView, locala.field_username);
      if (paramAdapterView == null)
      {
        this.zpu.finish();
        AppMethodBeat.o(33955);
      }
      else
      {
        paramAdapterView.putExtra("sns_adapter_type", 1);
        d.b(this.zpu.mController.ylL, "sns", ".ui.SnsTimeLineUserPagerUI", paramAdapterView);
        AppMethodBeat.o(33955);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SnsTagContactListUI.1
 * JD-Core Version:    0.6.2
 */