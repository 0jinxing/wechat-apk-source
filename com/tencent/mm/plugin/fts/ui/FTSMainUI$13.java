package com.tencent.mm.plugin.fts.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.websearch.api.m;
import org.json.JSONObject;

final class FTSMainUI$13
  implements View.OnClickListener
{
  FTSMainUI$13(FTSMainUI paramFTSMainUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(61882);
    try
    {
      if (paramView.getTag() != null)
      {
        i = ((JSONObject)paramView.getTag()).optInt("businessType");
        if (i != 0)
          break label147;
        paramView = ((TextView)paramView).getText().toString();
        if (!paramView.equals(this.mJJ.getString(2131302836)))
          break label104;
        i = 2;
        if (i != 0)
        {
          paramView = this.mJJ;
          ((m)g.K(m.class)).a(paramView, new FTSMainUI.11(paramView, i));
        }
        AppMethodBeat.o(61882);
      }
    }
    catch (Exception localException)
    {
      label147: 
      while (true)
      {
        int i = 0;
        continue;
        label104: if (paramView.equals(this.mJJ.getString(2131302840)))
          i = 8;
        else if (paramView.equals(this.mJJ.getString(2131302837)))
          i = 1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.13
 * JD-Core Version:    0.6.2
 */