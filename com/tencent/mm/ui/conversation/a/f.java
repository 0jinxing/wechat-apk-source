package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f extends com.tencent.mm.pluginsdk.ui.b.b
{
  String zwk;
  String zwl;

  public f(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext);
    AppMethodBeat.i(34651);
    this.zwk = null;
    this.zwl = null;
    this.zwk = paramString1;
    this.zwl = paramString2;
    if (this.view != null)
    {
      paramContext = (ImageView)this.view.findViewById(2131822695);
      this.view.setOnClickListener(new f.1(this));
      paramContext.setImageBitmap(com.tencent.mm.ah.b.a(this.zwk, true, -1));
    }
    AppMethodBeat.o(34651);
  }

  public final void destroy()
  {
  }

  public final int getLayoutId()
  {
    return 2130969119;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.f
 * JD-Core Version:    0.6.2
 */