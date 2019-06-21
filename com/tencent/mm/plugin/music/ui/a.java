package com.tencent.mm.plugin.music.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.e;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ah;

public final class a extends b
{
  private c hAA;
  private View jyC;
  private View jyD;
  private TextView oOp;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(105058);
    if (this.view != null)
    {
      this.oOp = ((TextView)this.view.findViewById(2131826252));
      this.jyC = this.view.findViewById(2131826251);
      this.jyD = this.view.findViewById(2131821629);
      this.oOp.setTextSize(0, com.tencent.mm.bz.a.al(ah.getContext(), 2131427762));
      this.view.setOnClickListener(new a.1(this));
    }
    this.hAA = new a.2(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.hAA);
    AppMethodBeat.o(105058);
  }

  private void Tt(String paramString)
  {
    AppMethodBeat.i(105062);
    if (this.oOp != null)
      this.oOp.setText(paramString);
    AppMethodBeat.o(105062);
  }

  private boolean bUK()
  {
    boolean bool = false;
    AppMethodBeat.i(105063);
    int i;
    if ((this.nfA) && (this.eVH))
    {
      this.jyD.setBackgroundResource(2130840456);
      this.jyC.setBackground(null);
      this.oOp.setBackground(null);
      if (!com.tencent.mm.aw.a.aie())
        break label245;
      e locale = com.tencent.mm.aw.a.aih();
      Tt(ah.getContext().getString(2131301587) + ah.getContext().getString(2131301588) + locale.fJW);
      if (!locale.fKq)
        break label232;
      i = 8;
      label109: setVisibility(i);
      if (locale.fKq)
        break label237;
      bool = true;
      AppMethodBeat.o(105063);
    }
    while (true)
    {
      return bool;
      if (this.nfA)
      {
        this.jyD.setBackgroundResource(2130839165);
        this.jyC.setBackgroundResource(2130839164);
        this.oOp.setBackgroundResource(2130839162);
        break;
      }
      if (this.eVH)
      {
        this.jyD.setBackgroundResource(2130839165);
        this.jyC.setBackgroundResource(2130839162);
        this.oOp.setBackground(null);
        break;
      }
      this.jyD.setBackgroundResource(2130839165);
      this.jyC.setBackground(null);
      this.oOp.setBackgroundResource(2130839162);
      break;
      label232: i = 0;
      break label109;
      label237: AppMethodBeat.o(105063);
      continue;
      label245: if (com.tencent.mm.aw.a.aif())
      {
        setVisibility(0);
        bool = true;
        AppMethodBeat.o(105063);
      }
      else
      {
        setVisibility(8);
        AppMethodBeat.o(105063);
      }
    }
  }

  public final boolean aMN()
  {
    AppMethodBeat.i(105060);
    boolean bool = bUK();
    AppMethodBeat.o(105060);
    return bool;
  }

  public final void destroy()
  {
    AppMethodBeat.i(105061);
    com.tencent.mm.sdk.b.a.xxA.d(this.hAA);
    AppMethodBeat.o(105061);
  }

  public final int getLayoutId()
  {
    return 2130970271;
  }

  public final int getOrder()
  {
    return 1;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(105059);
    if (this.view != null)
      this.view.findViewById(2131826251).setVisibility(paramInt);
    AppMethodBeat.o(105059);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.a
 * JD-Core Version:    0.6.2
 */