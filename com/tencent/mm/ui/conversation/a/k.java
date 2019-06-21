package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.be;
import com.tencent.mm.model.be.b;
import com.tencent.mm.pluginsdk.ui.b.b;

public final class k extends b
{
  LinearLayout zwx;

  public k(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(34673);
    this.zwx = null;
    this.zwx = new LinearLayout(paramContext);
    this.zwx.setVisibility(8);
    be.ZV().fmc = new k.1(this, paramContext);
    be.ZV().fmc.ZZ();
    AppMethodBeat.o(34673);
  }

  public final boolean aMN()
  {
    AppMethodBeat.i(34674);
    boolean bool;
    if ((this.zwx != null) && (this.zwx.getVisibility() == 0))
    {
      bool = true;
      AppMethodBeat.o(34674);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(34674);
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(34675);
    be.ZV().fmc = null;
    AppMethodBeat.o(34675);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final View getView()
  {
    return this.zwx;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.k
 * JD-Core Version:    0.6.2
 */