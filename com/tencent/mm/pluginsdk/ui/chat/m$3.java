package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.base.o;

final class m$3
  implements AdapterView.OnItemClickListener
{
  m$3(m paramm)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(62456);
    if (this.voP.voL == null);
    for (paramAdapterView = null; ; paramAdapterView = this.voP.voL.uf(paramInt))
    {
      if ((paramAdapterView != null) && (this.voP.voG != null) && (this.voP.vnn != null))
      {
        this.voP.voG.A(paramAdapterView);
        this.voP.vnn.clear();
        h.pYm.e(10994, new Object[] { Integer.valueOf(1), this.voP.voH, "", Integer.valueOf(paramInt), paramAdapterView.Aq(), Integer.valueOf(this.voP.voL.getCount()) });
      }
      this.voP.voE.dismiss();
      AppMethodBeat.o(62456);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.m.3
 * JD-Core Version:    0.6.2
 */