package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.b.d;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.bo;

public final class g extends b
{
  boolean yFW;
  String zwk;
  String zwl;

  public g(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramContext);
    AppMethodBeat.i(34654);
    this.zwk = null;
    this.zwl = null;
    this.yFW = false;
    this.zwk = paramString1;
    this.zwl = paramString2;
    this.yFW = paramBoolean;
    if (this.view != null)
    {
      paramContext = (TextView)this.view.findViewById(2131822696);
      paramString1 = aw.ZK().Yl().ao(this.zwk, "wording");
      paramString2 = aw.ZK().Yl().ao(this.zwl, "wording");
      if (bo.isNullOrNil(paramString1))
        break label204;
      paramContext.setText(paramString1);
    }
    while (true)
    {
      paramContext = aw.ZK().Yl().ao(this.zwk, "linkname");
      paramString1 = aw.ZK().Yl().ao(this.zwk, "linksrc");
      paramString2 = (TextView)this.view.findViewById(2131822697);
      if (!bo.isNullOrNil(paramContext))
        paramString2.setText(paramContext);
      paramString2.setOnClickListener(new g.1(this, paramString1));
      ((ImageView)this.view.findViewById(2131822698)).setOnClickListener(new g.2(this));
      AppMethodBeat.o(34654);
      return;
      label204: if (!bo.isNullOrNil(paramString2))
        paramContext.setText(paramString2);
    }
  }

  public final void destroy()
  {
  }

  public final int getLayoutId()
  {
    return 2130969120;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.g
 * JD-Core Version:    0.6.2
 */