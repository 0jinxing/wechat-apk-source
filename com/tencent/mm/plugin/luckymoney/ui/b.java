package com.tencent.mm.plugin.luckymoney.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

public final class b
{
  private List<c> oeL;
  private boolean oeM;
  private boolean oeN;
  private TextView oeO;

  public b()
  {
    AppMethodBeat.i(42732);
    this.oeL = new LinkedList();
    this.oeM = false;
    this.oeN = false;
    AppMethodBeat.o(42732);
  }

  private void Qn(String paramString)
  {
    AppMethodBeat.i(42737);
    if ((this.oeO != null) && (!bo.isNullOrNil(paramString)))
    {
      if (!this.oeM)
        this.oeO.setText(paramString);
      this.oeO.setVisibility(0);
      this.oeM = true;
    }
    AppMethodBeat.o(42737);
  }

  public final void Dv(String paramString)
  {
    AppMethodBeat.i(42738);
    if ((this.oeO != null) && (!bo.isNullOrNil(paramString)))
    {
      this.oeO.setText(paramString);
      this.oeO.setVisibility(0);
      this.oeM = true;
      AppMethodBeat.o(42738);
    }
    while (true)
    {
      return;
      if (this.oeO != null)
      {
        this.oeO.setVisibility(8);
        this.oeM = false;
      }
      AppMethodBeat.o(42738);
    }
  }

  public final void a(c paramc)
  {
    AppMethodBeat.i(42733);
    if (paramc == null)
      AppMethodBeat.o(42733);
    while (true)
    {
      return;
      this.oeL.add(paramc);
      AppMethodBeat.o(42733);
    }
  }

  public final boolean bMy()
  {
    AppMethodBeat.i(42735);
    this.oeN = false;
    this.oeM = false;
    int i = 0;
    if (i < this.oeL.size())
    {
      c localc = (c)this.oeL.get(i);
      int j = localc.bKW();
      if (j != 0)
      {
        localc.onError();
        Qn(localc.xH(j));
        this.oeN = true;
      }
      while (true)
      {
        i++;
        break;
        localc.restore();
      }
    }
    if ((!this.oeN) && (this.oeO != null))
    {
      this.oeO.setVisibility(8);
      this.oeM = false;
    }
    boolean bool = this.oeN;
    AppMethodBeat.o(42735);
    return bool;
  }

  public final boolean bMz()
  {
    boolean bool = false;
    AppMethodBeat.i(42736);
    int i = 0;
    if (i < this.oeL.size())
      if (((c)this.oeL.get(i)).bKW() != 0)
      {
        bool = true;
        AppMethodBeat.o(42736);
      }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(42736);
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(42734);
    this.oeL.clear();
    this.oeO = null;
    AppMethodBeat.o(42734);
  }

  public final void i(TextView paramTextView)
  {
    if (paramTextView != null)
      this.oeO = paramTextView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.b
 * JD-Core Version:    0.6.2
 */