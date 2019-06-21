package com.tencent.mm.plugin.card.sharecard.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.b.e;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.ui.MMActivity;

public final class i
{
  private View jcl;
  MMActivity jiE;
  View khC;
  TextView khD;
  TextView khE;
  private boolean khF = false;

  public i(MMActivity paramMMActivity, View paramView)
  {
    this.jiE = paramMMActivity;
    this.jcl = paramView;
  }

  public final void bbX()
  {
    AppMethodBeat.i(88205);
    this.khC.setVisibility(8);
    AppMethodBeat.o(88205);
  }

  public final void cu()
  {
    AppMethodBeat.i(88206);
    Integer localInteger = (Integer)am.bbb().getValue("key_share_card_show_type");
    Object localObject = localInteger;
    if (localInteger == null)
      localObject = Integer.valueOf(0);
    if ((((Integer)localObject).intValue() != 0) && (!b.bbw()))
    {
      this.khC.setVisibility(0);
      this.khD.setVisibility(0);
      localObject = new ShareCardInfo();
      if (!TextUtils.isEmpty(((ShareCardInfo)localObject).sN(10)))
      {
        this.khD.setVisibility(0);
        this.khD.setText(((ShareCardInfo)localObject).sN(10));
        if (TextUtils.isEmpty(""))
          break label141;
        this.khE.setVisibility(0);
        this.khE.setText("");
        AppMethodBeat.o(88206);
      }
    }
    while (true)
    {
      return;
      this.khD.setVisibility(8);
      break;
      label141: this.khE.setVisibility(8);
      AppMethodBeat.o(88206);
      continue;
      this.khC.setVisibility(8);
      AppMethodBeat.o(88206);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.i
 * JD-Core Version:    0.6.2
 */