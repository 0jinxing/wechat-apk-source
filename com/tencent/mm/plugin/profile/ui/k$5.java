package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.o;
import com.tencent.mm.openim.a.c.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.base.preference.KeyValuePreference;

final class k$5 extends KeyValuePreference
{
  k$5(k paramk, Context paramContext, c.b paramb)
  {
    super(paramContext);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23569);
    super.onBindView(paramView);
    if (this.pnu != null)
      if ((this.pkz.action != 2) && (this.pkz.action != 3))
        break label113;
    label113: for (int i = 1; ; i = 0)
    {
      if (i != 0)
        this.pnu.setTextColor(ah.getResources().getColorStateList(2131690763));
      if ((this.yCq != null) && (!TextUtils.isEmpty(this.pkz.cIY)))
      {
        this.yCq.setVisibility(0);
        o.ahp().a(this.pkz.cIY, this.yCq);
      }
      AppMethodBeat.o(23569);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.k.5
 * JD-Core Version:    0.6.2
 */