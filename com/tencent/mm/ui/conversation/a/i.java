package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;

public final class i extends com.tencent.mm.pluginsdk.ui.b.b
  implements k.a
{
  private View jyC;
  private View jyD;
  private View zwq;
  private TextView zwr;
  private TextView zws;

  public i(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(34659);
    ab.i("MicroMsg.ForceNotifyBanner", "[initialize]");
    this.jyD = this.view.findViewById(2131821629);
    this.jyC = this.view.findViewById(2131824110);
    this.zwq = this.view.findViewById(2131824113);
    this.zwr = ((TextView)this.view.findViewById(2131824112));
    this.zws = ((TextView)this.view.findViewById(2131824114));
    paramContext = new i.1(this);
    this.view.setOnClickListener(paramContext);
    paramContext = (com.tencent.mm.plugin.forcenotify.a.b)g.K(com.tencent.mm.plugin.forcenotify.a.b.class);
    if (paramContext != null)
      paramContext.bxV().c(this);
    dIY();
    AppMethodBeat.o(34659);
  }

  private boolean dIY()
  {
    int i = 8;
    boolean bool1 = false;
    AppMethodBeat.i(34661);
    Object localObject = (com.tencent.mm.plugin.forcenotify.a.b)g.K(com.tencent.mm.plugin.forcenotify.a.b.class);
    if (localObject != null);
    for (boolean bool2 = ((com.tencent.mm.plugin.forcenotify.a.b)localObject).bxU(); ; bool2 = false)
    {
      boolean bool3 = ((com.tencent.mm.plugin.forcenotify.a.b)g.K(com.tencent.mm.plugin.forcenotify.a.b.class)).hasError();
      int j;
      if (bool3)
      {
        localObject = this.zwq;
        if (bool2)
        {
          j = 0;
          ((View)localObject).setVisibility(j);
          localObject = this.jyC;
          j = i;
          label78: ((View)localObject).setVisibility(j);
          if ((!bool2) || (bool3))
            break label147;
          bool2 = true;
          AppMethodBeat.o(34661);
        }
      }
      while (true)
      {
        return bool2;
        j = 8;
        break;
        this.zwq.setVisibility(8);
        View localView = this.jyC;
        localObject = localView;
        j = i;
        if (!bool2)
          break label78;
        j = 0;
        localObject = localView;
        break label78;
        label147: AppMethodBeat.o(34661);
        bool2 = bool1;
      }
    }
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(34663);
    dIY();
    AppMethodBeat.o(34663);
  }

  public final boolean aMN()
  {
    AppMethodBeat.i(34662);
    boolean bool = ((com.tencent.mm.plugin.forcenotify.a.b)g.K(com.tencent.mm.plugin.forcenotify.a.b.class)).hasError();
    if ((this.nfA) && (this.eVH))
      if (bool)
        this.zwq.setBackgroundResource(2130840455);
    while (true)
    {
      bool = super.aMN();
      AppMethodBeat.o(34662);
      return bool;
      this.jyC.setBackgroundResource(2130840456);
      continue;
      if (this.nfA)
      {
        if (bool)
        {
          this.jyD.setBackgroundResource(2130840011);
          this.zwq.setBackgroundResource(2130839164);
          this.zws.setBackgroundResource(2130839162);
        }
        else
        {
          this.jyD.setBackgroundResource(2130839165);
          this.jyC.setBackgroundResource(2130839164);
          this.zwr.setBackgroundResource(2130839162);
        }
      }
      else if (this.eVH)
        if (bool)
        {
          this.jyD.setBackgroundResource(2130840011);
          this.zwq.setBackgroundResource(2130839162);
          this.zws.setBackground(null);
        }
        else
        {
          this.jyD.setBackgroundResource(2130839165);
          this.jyC.setBackgroundResource(2130839162);
          this.zwr.setBackground(null);
        }
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(34660);
    if ((com.tencent.mm.plugin.forcenotify.a.b)g.K(com.tencent.mm.plugin.forcenotify.a.b.class) != null)
    {
      j localj = ((com.tencent.mm.plugin.forcenotify.a.b)g.K(com.tencent.mm.plugin.forcenotify.a.b.class)).bxV();
      if (localj != null)
        localj.d(this);
    }
    AppMethodBeat.o(34660);
  }

  public final int getLayoutId()
  {
    return 2130969585;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.i
 * JD-Core Version:    0.6.2
 */