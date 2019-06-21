package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.storage.ad;

final class AtSomeoneUI$3
  implements AdapterView.OnItemClickListener
{
  AtSomeoneUI$3(AtSomeoneUI paramAtSomeoneUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = 1;
    AppMethodBeat.i(30389);
    Intent localIntent = new Intent();
    if ((paramInt == 0) && (AtSomeoneUI.access$100()))
    {
      localIntent.putExtra("Select_Conv_User", this.yGM.getString(2131297179, new Object[] { "" }));
      localIntent.putExtra("select_raw_user_name", "notify@all");
      this.yGM.setResult(-1, localIntent);
      this.yGM.finish();
      AppMethodBeat.o(30389);
      return;
    }
    paramAdapterView = AtSomeoneUI.a(this.yGM);
    if (AtSomeoneUI.access$100());
    while (true)
    {
      ad localad = (ad)paramAdapterView.getItem(paramInt - i);
      paramView = AtSomeoneUI.a(AtSomeoneUI.b(this.yGM), localad.field_username);
      paramAdapterView = paramView;
      if (ah.isNullOrNil(paramView))
        paramAdapterView = localad.Oi();
      localIntent.putExtra("select_raw_user_name", localad.field_username);
      localIntent.putExtra("Select_Conv_User", paramAdapterView);
      break;
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AtSomeoneUI.3
 * JD-Core Version:    0.6.2
 */