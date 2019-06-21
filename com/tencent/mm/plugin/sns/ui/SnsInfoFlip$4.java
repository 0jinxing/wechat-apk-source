package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.h.b;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.ui.base.MMPageControlView;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.tools.MMGestureGallery;

final class SnsInfoFlip$4
  implements AdapterView.OnItemSelectedListener
{
  SnsInfoFlip$4(SnsInfoFlip paramSnsInfoFlip)
  {
  }

  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(38970);
    if (SnsInfoFlip.d(this.rsU) != null)
    {
      if ((SnsInfoFlip.e(this.rsU)) && (SnsInfoFlip.d(this.rsU).getCount() > 1))
      {
        SnsInfoFlip.f(this.rsU).setVisibility(0);
        SnsInfoFlip.f(this.rsU).setPage(paramInt);
      }
      bau localbau = ((b)SnsInfoFlip.d(this.rsU).getItem(paramInt)).cNr;
      paramAdapterView = ((b)SnsInfoFlip.d(this.rsU).getItem(paramInt)).qQd;
      SnsInfoFlip.a(this.rsU, localbau, paramInt, paramAdapterView);
      if ((paramView instanceof MultiTouchImageView))
        ((MultiTouchImageView)paramView).dzA();
      if (((SnsInfoFlip.g(this.rsU) instanceof MMGestureGallery)) && ((SnsInfoFlip.h(this.rsU) instanceof SnsBrowseUI)))
        ((SnsBrowseUI)SnsInfoFlip.h(this.rsU)).csT();
    }
    AppMethodBeat.o(38970);
  }

  public final void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsInfoFlip.4
 * JD-Core Version:    0.6.2
 */