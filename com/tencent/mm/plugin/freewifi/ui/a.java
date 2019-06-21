package com.tencent.mm.plugin.freewifi.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.al;
import java.util.Date;

public final class a extends b
{
  private static Date myi = null;
  private TextView gne;
  private boolean hasInit;
  private View jyC;
  private View jyD;
  private Runnable myj;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(20928);
    this.hasInit = false;
    this.myj = new a.2(this);
    initialize();
    AppMethodBeat.o(20928);
  }

  private void initialize()
  {
    AppMethodBeat.i(20929);
    if (this.view != null)
      if (this.hasInit)
        AppMethodBeat.o(20929);
    while (true)
    {
      return;
      this.jyC = this.view.findViewById(2131824170);
      this.jyD = this.view.findViewById(2131821629);
      this.gne = ((TextView)this.view.findViewById(2131824171));
      this.hasInit = true;
      this.jyC.setOnClickListener(new a.1(this));
      this.jyC.setVisibility(8);
      AppMethodBeat.o(20929);
    }
  }

  public final boolean aMN()
  {
    AppMethodBeat.i(20930);
    boolean bool;
    if ((this.nfA) && (this.eVH))
    {
      this.jyD.setBackgroundResource(2130840456);
      this.jyC.setBackground(null);
      this.gne.setBackground(null);
      if (this.hasInit)
        break label168;
      initialize();
      bool = false;
      AppMethodBeat.o(20930);
    }
    while (true)
    {
      return bool;
      if (this.nfA)
      {
        this.jyD.setBackgroundResource(2130839165);
        this.jyC.setBackgroundResource(2130839164);
        this.gne.setBackgroundResource(2130839162);
        break;
      }
      if (this.eVH)
      {
        this.jyD.setBackgroundResource(2130839165);
        this.jyC.setBackgroundResource(2130839162);
        this.gne.setBackground(null);
        break;
      }
      this.jyD.setBackgroundResource(2130839165);
      this.jyC.setBackground(null);
      this.gne.setBackgroundResource(2130839162);
      break;
      label168: al.af(this.myj);
      al.n(this.myj, 500L);
      bool = true;
      AppMethodBeat.o(20930);
    }
  }

  public final void destroy()
  {
  }

  public final int getLayoutId()
  {
    return 2130969601;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.a
 * JD-Core Version:    0.6.2
 */