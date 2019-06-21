package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.e;
import com.tencent.mm.plugin.profile.ui.newbizinfo.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class NewBizInfoMenuPreference$1
  implements View.OnClickListener
{
  NewBizInfoMenuPreference$1(NewBizInfoMenuPreference paramNewBizInfoMenuPreference, e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23870);
    if (this.pqc == null)
    {
      ab.w("MicroMsg.NewBizInfoServicePreference", "onClick serviceInfo is null, err");
      AppMethodBeat.o(23870);
      return;
    }
    com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.cP(NewBizInfoMenuPreference.a(this.pqd).field_username, 1100);
    ab.i("MicroMsg.NewBizInfoServicePreference", "onClick serviceInfo.type:%d", new Object[] { Integer.valueOf(this.pqc.type) });
    switch (this.pqc.type)
    {
    case 1:
    case 3:
    case 4:
    default:
    case 0:
    case 2:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(23870);
      break;
      NewBizInfoMenuPreference.a(this.pqd, this.pqc);
      AppMethodBeat.o(23870);
      break;
      com.tencent.mm.plugin.profile.ui.newbizinfo.b.c.a(this.pqc, NewBizInfoMenuPreference.b(this.pqd), NewBizInfoMenuPreference.a(this.pqd).field_username);
      b.b(NewBizInfoMenuPreference.a(this.pqd).field_username, this.pqc.id, this.pqc.key, b.pqI, this.pqc.name, b.fa(NewBizInfoMenuPreference.c(this.pqd).indexOf(this.pqc), -1), this.pqc.cRS);
      AppMethodBeat.o(23870);
      break;
      com.tencent.mm.plugin.profile.ui.newbizinfo.b.c.b(this.pqc, NewBizInfoMenuPreference.b(this.pqd), NewBizInfoMenuPreference.a(this.pqd).field_username);
      b.b(NewBizInfoMenuPreference.a(this.pqd).field_username, this.pqc.id, this.pqc.key, b.pqI, this.pqc.name, b.fa(NewBizInfoMenuPreference.c(this.pqd).indexOf(this.pqc), -1), this.pqc.value);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoMenuPreference.1
 * JD-Core Version:    0.6.2
 */