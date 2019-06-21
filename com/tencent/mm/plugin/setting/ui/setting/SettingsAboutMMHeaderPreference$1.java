package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.r;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.g;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.Preference;

final class SettingsAboutMMHeaderPreference$1
  implements View.OnClickListener
{
  private long qlT = 0L;

  SettingsAboutMMHeaderPreference$1(SettingsAboutMMHeaderPreference paramSettingsAboutMMHeaderPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127085);
    long l = bo.anU();
    if ((this.qlT > l) || (l - this.qlT > 300L))
    {
      this.qlT = l;
      AppMethodBeat.o(127085);
    }
    while (true)
    {
      return;
      this.qlT = l;
      Context localContext = this.qlU.mContext;
      paramView = new StringBuilder();
      paramView.append(String.format("[ver  ] %s %08X\n", new Object[] { g.d(localContext, d.vxo, true), Integer.valueOf(d.vxo) }));
      paramView.append(f.aZm());
      paramView.append(String.format("[cid  ] %d\n", new Object[] { Integer.valueOf(g.cdf) }));
      paramView.append(String.format("[s.ver] %d\n", new Object[] { Integer.valueOf(aa.HV(0)) }));
      paramView.append(String.format("[l.ver] %d\n", new Object[] { Integer.valueOf(aa.HV(1)) }));
      paramView.append(String.format("[ws.ver] %d\n", new Object[] { Integer.valueOf(r.aLE()) }));
      paramView.append(String.format("[r.ver] %s\n", new Object[] { "0x27000435" }));
      TextView localTextView = new TextView(localContext);
      localTextView.setText(paramView);
      localTextView.setGravity(19);
      localTextView.setTextSize(1, 10.0F);
      localTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      localTextView.setTextColor(-16777216);
      localTextView.setTypeface(Typeface.MONOSPACE);
      int i = localContext.getResources().getDimensionPixelSize(2131427776);
      localTextView.setPadding(i, i, i, i);
      h.a(localContext, null, localTextView, null);
      AppMethodBeat.o(127085);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMMHeaderPreference.1
 * JD-Core Version:    0.6.2
 */