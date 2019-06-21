package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bd.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;
import java.util.List;
import org.json.JSONObject;

final class FTSSOSHomeWebViewUI$1
  implements View.OnClickListener
{
  FTSSOSHomeWebViewUI$1(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(8423);
    FTSSOSHomeWebViewUI.i(this.uBG);
    if (!this.uBG.uAy)
    {
      AppMethodBeat.o(8423);
      return;
    }
    FTSSOSHomeWebViewUI.a(this.uBG).sendMessage(1);
    Object localObject1 = ((TextView)paramView).getText().toString();
    int i = a.a((JSONObject)paramView.getTag(), (String)localObject1, this.uBG);
    Object localObject2;
    if (i == 64)
    {
      FTSSOSHomeWebViewUI.j(this.uBG);
      FTSSOSHomeWebViewUI.k(this.uBG).setVisibility(0);
      paramView = FTSSOSHomeWebViewUI.m(this.uBG);
      int j = FTSSOSHomeWebViewUI.l(this.uBG).getHeight();
      localObject2 = paramView.uCP.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject2).height = j;
      paramView.uCP.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      FTSSOSHomeWebViewUI.l(this.uBG).setVisibility(8);
    }
    if (i != 0)
    {
      FTSSOSHomeWebViewUI.a(this.uBG, (String)localObject1);
      label165: if (this.uBG.uAO != i)
        h.pYm.e(15521, new Object[] { Integer.valueOf(this.uBG.scene), Integer.valueOf(4), this.uBG.dby().getInEditTextQuery(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(this.uBG.uAO) });
      if ((this.uBG.uAO != i) && (!this.uBG.dby().getTagList().isEmpty()))
      {
        paramView = this.uBG.getTotalQuery();
        this.uBG.dby().clearText();
        this.uBG.dby().n(paramView, null);
        this.uBG.dby().bBs();
      }
      this.uBG.uAO = i;
      this.uBG.dbt();
      FTSSOSHomeWebViewUI.d(this.uBG, i);
    }
    while (true)
    {
      try
      {
        FTSSOSHomeWebViewUI.e(this.uBG, 0);
        paramView = new android/os/Bundle;
        paramView.<init>();
        paramView.putInt("type", i);
        if (i == 0)
        {
          bool = true;
          paramView.putBoolean("isHomePage", bool);
          if ((this.uBG.bFf() != 20) || (FTSSOSHomeWebViewUI.a(this.uBG).dbC()))
            break label522;
          if (i == 0)
            continue;
          this.uBG.uAN = 22;
          paramView.putInt("scene", 22);
          paramView = FTSSOSHomeWebViewUI.n(this.uBG).p(4, paramView);
          localObject1 = FTSSOSHomeWebViewUI.p(this.uBG);
          localObject2 = new com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$1$1;
          ((FTSSOSHomeWebViewUI.1.1)localObject2).<init>(this, i, paramView);
          ((ak)localObject1).post((Runnable)localObject2);
          AppMethodBeat.o(8423);
          break;
          FTSSOSHomeWebViewUI.a(this.uBG, "");
          break label165;
        }
        boolean bool = false;
        continue;
        this.uBG.uAN = 20;
        paramView.putInt("scene", 20);
        continue;
      }
      catch (Exception paramView)
      {
        AppMethodBeat.o(8423);
      }
      break;
      label522: this.uBG.uAN = this.uBG.bFf();
      paramView.putInt("scene", this.uBG.bFf());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.1
 * JD-Core Version:    0.6.2
 */