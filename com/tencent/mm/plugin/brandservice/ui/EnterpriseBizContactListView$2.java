package com.tencent.mm.plugin.brandservice.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

final class EnterpriseBizContactListView$2
  implements AdapterView.OnItemLongClickListener
{
  EnterpriseBizContactListView$2(EnterpriseBizContactListView paramEnterpriseBizContactListView)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(13956);
    if (EnterpriseBizContactListView.a(this.jLZ) == null)
      EnterpriseBizContactListView.a(this.jLZ, new EnterpriseBizContactListView.a(this.jLZ));
    EnterpriseBizContactListView.a locala = EnterpriseBizContactListView.a(this.jLZ);
    int i = EnterpriseBizContactListView.b(this.jLZ);
    int j = EnterpriseBizContactListView.c(this.jLZ);
    Object localObject;
    boolean bool;
    if (locala.jMb == null)
    {
      localObject = (EnterpriseBizContactListView)locala.jMc.get();
      if (localObject == null)
      {
        bool = false;
        AppMethodBeat.o(13956);
      }
    }
    while (true)
    {
      return bool;
      locala.jMb = new com.tencent.mm.ui.widget.f(((EnterpriseBizContactListView)localObject).getContext());
      localObject = paramView.getTag();
      if ((localObject == null) || (!(localObject instanceof EnterpriseBizContactListView.c)))
      {
        bool = false;
        AppMethodBeat.o(13956);
      }
      else
      {
        locala.jMa = ((EnterpriseBizContactListView.c)localObject).username;
        if ((bo.isNullOrNil(locala.jMa)) || (com.tencent.mm.aj.f.kq(locala.jMa)))
        {
          bool = false;
          AppMethodBeat.o(13956);
        }
        else
        {
          locala.jMb.zRY = paramView;
          locala.jMb.a(paramAdapterView, paramInt, paramLong, new EnterpriseBizContactListView.a.1(locala, paramInt), new EnterpriseBizContactListView.a.2(locala), i, j);
          bool = true;
          AppMethodBeat.o(13956);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView.2
 * JD-Core Version:    0.6.2
 */