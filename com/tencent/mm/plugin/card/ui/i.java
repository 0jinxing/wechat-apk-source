package com.tencent.mm.plugin.card.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.card.b.k;
import com.tencent.mm.plugin.card.b.k.a;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;

public final class i
  implements k.a
{
  View jcl;
  MMActivity jiE;
  boolean khF = false;
  View kmK;
  TextView kmL;
  ImageView kmM;
  View kmN;
  TextView kmO;
  ImageView kmP;

  public i(MMActivity paramMMActivity, View paramView)
  {
    this.jiE = paramMMActivity;
    this.jcl = paramView;
  }

  public final void a(com.tencent.mm.plugin.card.model.g paramg)
  {
    AppMethodBeat.i(88590);
    bdm();
    AppMethodBeat.o(88590);
  }

  public final void aVU()
  {
  }

  final void bdm()
  {
    AppMethodBeat.i(88591);
    int i = am.bba().kbN;
    if ((i > 0) && (this.khF))
    {
      String str1 = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xKn, "");
      String str2 = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xKo, "");
      int j = this.jiE.getResources().getDimensionPixelOffset(2131428165);
      if (!TextUtils.isEmpty(str2))
      {
        m.a(this.kmM, str2, j, 2130838109, true);
        if (TextUtils.isEmpty(str1))
          break label184;
        this.kmL.setText(str1);
        label108: this.kmK.setVisibility(0);
        if (this.kmN != null)
        {
          if (TextUtils.isEmpty(str2))
            break label214;
          m.a(this.kmP, str2, j, 2130838109, true);
          label143: if (TextUtils.isEmpty(str1))
            break label226;
          this.kmO.setText(str1);
          label158: this.kmN.setVisibility(0);
        }
        AppMethodBeat.o(88591);
      }
    }
    while (true)
    {
      return;
      this.kmM.setImageResource(2130838109);
      break;
      label184: this.kmL.setText(this.jiE.getString(2131297884, new Object[] { Integer.valueOf(i) }));
      break label108;
      label214: this.kmP.setImageResource(2130838109);
      break label143;
      label226: this.kmO.setText(this.jiE.getString(2131297884, new Object[] { Integer.valueOf(i) }));
      break label158;
      this.kmK.setVisibility(8);
      if (this.kmN != null)
        this.kmN.setVisibility(8);
      AppMethodBeat.o(88591);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.i
 * JD-Core Version:    0.6.2
 */