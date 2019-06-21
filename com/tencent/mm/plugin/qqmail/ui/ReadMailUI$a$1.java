package com.tencent.mm.plugin.qqmail.ui;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.v;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.Map;

final class ReadMailUI$a$1
  implements Runnable
{
  ReadMailUI$a$1(ReadMailUI.a parama, Map paramMap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(68439);
    Object localObject1;
    Object localObject2;
    if (ReadMailUI.b(this.pAj.pzZ).equals(ReadMailUI.a(this.pAj.pzZ)))
    {
      if (ReadMailUI.c(this.pAj.pzZ).getSize() == 0)
      {
        i = bo.getInt((String)this.pAi.get(".Response.result.tolistlen"), 0);
        localObject1 = ReadMailUI.c(this.pAi, ".Response.result.tolist", i);
        ReadMailUI.c(this.pAj.pzZ).b((String[])localObject1, true);
      }
      if (ReadMailUI.d(this.pAj.pzZ).getSize() == 0)
      {
        i = bo.getInt((String)this.pAi.get(".Response.result.cclistlen"), 0);
        localObject1 = ReadMailUI.c(this.pAi, ".Response.result.cclist", i);
        localObject2 = ReadMailUI.e(this.pAj.pzZ);
        if ((localObject1 != null) && (localObject1.length != 0))
          break label404;
      }
    }
    label404: for (int i = 8; ; i = 0)
    {
      ((LinearLayout)localObject2).setVisibility(i);
      ReadMailUI.d(this.pAj.pzZ).b((String[])localObject1, true);
      localObject1 = (String)this.pAi.get(".Response.result.content");
      ReadMailUI.a(this.pAj.pzZ, this.pAi);
      localObject2 = (String)this.pAi.get(".Response.result.tips.wording");
      if (!bo.isNullOrNil((String)localObject2))
      {
        if ("1".equals((String)this.pAi.get(".Response.result.tips.color")))
        {
          ReadMailUI.f(this.pAj.pzZ).setBackgroundColor(-13627);
          ReadMailUI.f(this.pAj.pzZ).setTextColor(-7515315);
        }
        ReadMailUI.f(this.pAj.pzZ).setText((CharSequence)localObject2);
        ((View)ReadMailUI.f(this.pAj.pzZ).getParent()).setVisibility(0);
      }
      localObject1 = "<html style=\"margin-top:" + ReadMailUI.aUn() + "px\">" + (String)localObject1 + "</html>";
      ReadMailUI.g(this.pAj.pzZ).loadDataWithBaseURL(v.ccw() + "?pageWidth=" + ReadMailUI.cdr(), (String)localObject1, "text/html", "utf-8", null);
      AppMethodBeat.o(68439);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ReadMailUI.a.1
 * JD-Core Version:    0.6.2
 */