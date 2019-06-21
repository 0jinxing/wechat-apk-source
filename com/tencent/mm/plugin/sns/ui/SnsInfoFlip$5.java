package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.h.b;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.MMGestureGallery;

final class SnsInfoFlip$5
  implements AdapterView.OnItemLongClickListener
{
  SnsInfoFlip$5(SnsInfoFlip paramSnsInfoFlip)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(38971);
    boolean bool;
    if (!SnsInfoFlip.i(this.rsU))
    {
      AppMethodBeat.o(38971);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((SnsInfoFlip.g(this.rsU) instanceof MMGestureGallery))
      {
        paramAdapterView = v.Zp().y("basescanui@datacenter", true);
        paramAdapterView.j("key_basescanui_screen_x", Integer.valueOf(((MMGestureGallery)SnsInfoFlip.g(this.rsU)).getXDown()));
        paramAdapterView.j("key_basescanui_screen_y", Integer.valueOf(((MMGestureGallery)SnsInfoFlip.g(this.rsU)).getYDown()));
      }
      paramView = ((b)SnsInfoFlip.d(this.rsU).getItem(paramInt)).qQd;
      if (bo.isNullOrNil(paramView))
      {
        bool = false;
        AppMethodBeat.o(38971);
      }
      else
      {
        String str = ((b)SnsInfoFlip.d(this.rsU).getItem(paramInt)).cNr.Id;
        paramAdapterView = an.fZ(af.getAccSnsPath(), str) + i.l(((b)SnsInfoFlip.d(this.rsU).getItem(paramInt)).cNr);
        this.rsU.f(paramAdapterView, paramView, str, true);
        AppMethodBeat.o(38971);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsInfoFlip.5
 * JD-Core Version:    0.6.2
 */