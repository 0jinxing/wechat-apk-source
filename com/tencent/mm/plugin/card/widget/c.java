package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import java.util.LinkedList;

public final class c extends a
{
  protected TextView ksp;
  protected TextView ksq;

  public c(Context paramContext)
  {
    super(paramContext);
  }

  protected final void beJ()
  {
    AppMethodBeat.i(88974);
    this.ksq = ((TextView)beI().findViewById(2131822336));
    this.ksp = ((TextView)beI().findViewById(2131822335));
    AppMethodBeat.o(88974);
  }

  protected final void beK()
  {
    AppMethodBeat.i(88975);
    if ((this.kaS.aZV().vTW != null) && (this.kaS.aZV().vTW.size() > 0))
    {
      tm localtm = (tm)this.kaS.aZV().vTW.get(0);
      if (this.iPD != null)
        this.iPD.setText(localtm.title);
      if (this.ksp != null)
      {
        if (!TextUtils.isEmpty(localtm.kbW))
          this.ksp.setText(localtm.kbW);
      }
      else
      {
        if (this.ksq == null)
          break label159;
        if (TextUtils.isEmpty(localtm.kbX))
          break label150;
        this.ksq.setText(localtm.kbX);
        AppMethodBeat.o(88975);
      }
    }
    while (true)
    {
      return;
      this.ksp.setVisibility(8);
      break;
      label150: this.ksq.setVisibility(8);
      label159: AppMethodBeat.o(88975);
    }
  }

  public final void x(boolean paramBoolean1, boolean paramBoolean2)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.widget.c
 * JD-Core Version:    0.6.2
 */