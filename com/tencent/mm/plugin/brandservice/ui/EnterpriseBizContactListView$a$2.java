package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import java.lang.ref.WeakReference;

final class EnterpriseBizContactListView$a$2
  implements n.d
{
  EnterpriseBizContactListView$a$2(EnterpriseBizContactListView.a parama)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(13959);
    if (bo.isNullOrNil(this.jMd.jMa))
      AppMethodBeat.o(13959);
    while (true)
    {
      return;
      if (paramMenuItem.getItemId() == 1)
      {
        paramMenuItem = this.jMd;
        String str = this.jMd.jMa;
        Object localObject = (EnterpriseBizContactListView)paramMenuItem.jMc.get();
        if (localObject != null)
        {
          localObject = ((EnterpriseBizContactListView)localObject).getContext();
          h.d((Context)localObject, ((Context)localObject).getString(2131299218), "", ((Context)localObject).getString(2131299217), ((Context)localObject).getString(2131296868), new EnterpriseBizContactListView.a.3(paramMenuItem, str, (Context)localObject), null);
        }
      }
      AppMethodBeat.o(13959);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView.a.2
 * JD-Core Version:    0.6.2
 */