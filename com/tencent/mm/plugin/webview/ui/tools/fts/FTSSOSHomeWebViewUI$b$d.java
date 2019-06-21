package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.res.Resources;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.fts.ui.widget.FTSMainUIEducationLayout;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.fts.widget.FTSMainUIHotWordLayout;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;

final class FTSSOSHomeWebViewUI$b$d extends com.tencent.mm.sdk.d.b
{
  private FTSSOSHomeWebViewUI$b$d(FTSSOSHomeWebViewUI.b paramb)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(8468);
    super.enter();
    this.uBT.uBG.dby().bBq();
    FTSSOSHomeWebViewUI.K(this.uBT.uBG).setVisibility(0);
    this.uBT.uBG.uAr.setPadding(FTSSOSHomeWebViewUI.L(this.uBT.uBG), 0, 0, 0);
    FTSSOSHomeWebViewUI.T(this.uBT.uBG).setVisibility(8);
    this.uBT.uBG.uAs.setSearchBarCancelTextContainerVisibile(8);
    this.uBT.uBG.uAs.setVoiceImageButtonVisibile(8);
    FTSSOSHomeWebViewUI.i(this.uBT.uBG);
    FTSSOSHomeWebViewUI.c(this.uBT.uBG).setVisibility(8);
    FTSSOSHomeWebViewUI.s(this.uBT.uBG).setVisibility(8);
    FTSSOSHomeWebViewUI.N(this.uBT.uBG).setVisibility(0);
    if (!this.uBT.uBG.dby().mLL.hasFocus())
    {
      this.uBT.uBG.dby().bBo();
      this.uBT.uBG.showVKB();
    }
    if ((d.iW(23)) && (!com.tencent.mm.sdk.h.b.Mt()))
      FTSSOSHomeWebViewUI.i(this.uBT.uBG, this.uBT.uBG.getResources().getColor(2131690691));
    if (!TextUtils.isEmpty(this.uBT.uBG.getInEditTextQuery()))
      this.uBT.uBG.dby().bBt();
    FTSSOSHomeWebViewUI.h(this.uBT.uBG, this.uBT.uBG.uAO);
    AppMethodBeat.o(8468);
  }

  public final void exit()
  {
    AppMethodBeat.i(8469);
    super.exit();
    this.uBT.uBG.aqX();
    AppMethodBeat.o(8469);
  }

  public final String getName()
  {
    return "SearchWithFocusState";
  }

  public final boolean k(Message paramMessage)
  {
    AppMethodBeat.i(8470);
    switch (paramMessage.what)
    {
    case 1:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    default:
    case 2:
    case 3:
    case 4:
    case 5:
    case 0:
    case 11:
    }
    while (true)
    {
      boolean bool = super.k(paramMessage);
      AppMethodBeat.o(8470);
      return bool;
      if (!this.uBT.uBG.uBp)
      {
        FTSSOSHomeWebViewUI.S(this.uBT.uBG);
        FTSSOSHomeWebViewUI.T(this.uBT.uBG).setVisibility(8);
        FTSSOSHomeWebViewUI.d(this.uBT.uBG, 0);
        FTSSOSHomeWebViewUI.I(this.uBT.uBG).b(a.b.uCH);
        FTSSOSHomeWebViewUI.a(this.uBT.uBG, a.b.uCH);
      }
      else
      {
        this.uBT.uBG.finish();
        continue;
        this.uBT.b(this.uBT.uBP);
        continue;
        if (!this.uBT.uBG.dby().getEditText().hasFocus())
        {
          this.uBT.b(this.uBT.uBR);
        }
        else
        {
          h.pYm.e(15521, new Object[] { Integer.valueOf(this.uBT.uBG.scene), Integer.valueOf(2), this.uBT.uBG.dby().getInEditTextQuery(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(this.uBT.uBG.uAO) });
          continue;
          if (this.uBT.uBG.getTotalQuery().length() > 0)
            this.uBT.b(this.uBT.uBR);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.b.d
 * JD-Core Version:    0.6.2
 */