package com.tencent.mm.plugin.masssend.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.n;
import java.util.HashSet;
import java.util.Iterator;

final class MassSendSelectContactUI$2
  implements View.OnClickListener
{
  MassSendSelectContactUI$2(MassSendSelectContactUI paramMassSendSelectContactUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22875);
    ab.i("MicroMsg.MassSendSelectContactUI", "Click SelectAll");
    paramView = (n)((HeaderViewListAdapter)this.opp.getContentLV().getAdapter()).getWrappedAdapter();
    if (!MassSendSelectContactUI.b(this.opp))
    {
      MassSendSelectContactUI.c(this.opp).setText(2131301400);
      int i = paramView.getCount();
      for (int j = 0; j < i; j++)
      {
        localObject = paramView.Pn(j);
        if ((localObject != null) && (((a)localObject).ehM != null) && (!MassSendSelectContactUI.a(this.opp).contains(((a)localObject).ehM.field_username)))
        {
          MassSendSelectContactUI.a(this.opp).add(((a)localObject).ehM.field_username);
          MassSendSelectContactUI.d(this.opp).ajq(((a)localObject).ehM.field_username);
        }
      }
    }
    MassSendSelectContactUI.c(this.opp).setText(2131301412);
    Object localObject = MassSendSelectContactUI.a(this.opp).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      MassSendSelectContactUI.d(this.opp).ajq(str);
    }
    MassSendSelectContactUI.a(this.opp).clear();
    localObject = this.opp;
    if (!MassSendSelectContactUI.b(this.opp));
    for (boolean bool = true; ; bool = false)
    {
      MassSendSelectContactUI.a((MassSendSelectContactUI)localObject, bool);
      MassSendSelectContactUI.a(this.opp, MassSendSelectContactUI.a(this.opp).size());
      paramView.notifyDataSetChanged();
      AppMethodBeat.o(22875);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI.2
 * JD-Core Version:    0.6.2
 */