package com.tencent.mm.ui.chatting.c;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.ae;
import com.tencent.mm.ui.chatting.af;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.c.b.i;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.f.d.a;
import com.tencent.mm.ui.chatting.u;

final class ag$10
  implements AdapterView.OnItemClickListener
{
  ag$10(ag paramag)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(31652);
    paramAdapterView = (bi)ag.d(this.yRH).getItem(paramInt);
    if ((paramAdapterView != null) && (!bo.isNullOrNil(paramAdapterView.field_talker)))
    {
      this.yRH.dEP();
      ((i)this.yRH.cgL.aF(i.class)).bd(paramAdapterView);
      if (!this.yRH.yRy)
      {
        this.yRH.yRy = true;
        this.yRH.cgL.yTz.setBottomViewVisible(true);
        this.yRH.cgL.yTy.dCC();
      }
      this.yRH.cgL.yTz.dCA();
      this.yRH.cgL.yTz.setIsBottomShowAll(false);
      ((h)this.yRH.cgL.aF(h.class)).a(paramAdapterView.field_msgId, false, d.a.yYw);
    }
    AppMethodBeat.o(31652);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ag.10
 * JD-Core Version:    0.6.2
 */