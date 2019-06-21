package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.List;

final class FTSSOSHomeWebViewUI$a extends BaseAdapter
{
  private List<FTSSOSHomeWebViewUI.c> uBK;

  private FTSSOSHomeWebViewUI$a(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI)
  {
    AppMethodBeat.i(8452);
    this.uBK = new ArrayList();
    AppMethodBeat.o(8452);
  }

  public final FTSSOSHomeWebViewUI.c JF(int paramInt)
  {
    AppMethodBeat.i(8455);
    FTSSOSHomeWebViewUI.c localc = (FTSSOSHomeWebViewUI.c)this.uBK.get(paramInt);
    AppMethodBeat.o(8455);
    return localc;
  }

  public final void clear()
  {
    AppMethodBeat.i(8453);
    al.d(new FTSSOSHomeWebViewUI.a.4(this));
    AppMethodBeat.o(8453);
  }

  public final int getCount()
  {
    int i = 6;
    AppMethodBeat.i(8454);
    if (this.uBK.size() > 6)
      AppMethodBeat.o(8454);
    while (true)
    {
      return i;
      i = this.uBK.size();
      AppMethodBeat.o(8454);
    }
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(8456);
    FTSSOSHomeWebViewUI.c localc;
    if (paramView == null)
    {
      paramViewGroup = new FTSSOSHomeWebViewUI.a.a(this, (byte)0);
      paramView = LayoutInflater.from(this.uBG.mController.ylL).inflate(2130970839, null);
      paramViewGroup.iqT = ((ImageView)paramView.findViewById(2131821226));
      paramViewGroup.ene = ((TextView)paramView.findViewById(2131822953));
      paramViewGroup.uBO = ((ImageView)paramView.findViewById(2131827968));
      paramView.setTag(paramViewGroup);
      localc = JF(paramInt);
      localc.position = paramInt;
      if (localc.icon == 0)
        break label207;
      paramViewGroup.iqT.setVisibility(0);
      paramViewGroup.iqT.setImageResource(localc.icon);
      label125: if (localc.uBV == 0)
        break label218;
      paramViewGroup.uBO.setVisibility(0);
      paramViewGroup.uBO.setImageResource(localc.uBV);
      paramViewGroup.uBO.setTag(localc);
      paramViewGroup.uBO.setOnClickListener(FTSSOSHomeWebViewUI.x(this.uBG));
    }
    while (true)
    {
      paramViewGroup.ene.setText(localc.content);
      AppMethodBeat.o(8456);
      return paramView;
      paramViewGroup = (FTSSOSHomeWebViewUI.a.a)paramView.getTag();
      break;
      label207: paramViewGroup.iqT.setVisibility(4);
      break label125;
      label218: paramViewGroup.uBO.setVisibility(4);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.a
 * JD-Core Version:    0.6.2
 */