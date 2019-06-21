package com.tencent.mm.ui.tools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.a;
import com.tencent.mm.ui.base.n.b;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.v;

public final class k extends p
{
  private LayoutInflater mInflater;
  public n.c rBl;
  public n.d rBm;
  private l rBn;
  private boolean rpm;
  private n.a zFT;
  private n.b zFU;
  private k.a zFY;

  public k(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(107719);
    this.rpm = true;
    this.mInflater = v.hu(paramContext);
    this.rBn = new l(paramContext);
    AppMethodBeat.o(107719);
  }

  protected final BaseAdapter Kw()
  {
    AppMethodBeat.i(107722);
    if (this.zFY == null)
      this.zFY = new k.a(this, (byte)0);
    k.a locala = this.zFY;
    AppMethodBeat.o(107722);
    return locala;
  }

  public final boolean gP()
  {
    AppMethodBeat.i(107720);
    if (this.rBl != null)
      this.rBl.a(this.rBn);
    if ((this.rBn.abz != null) && (this.rBn.abz.length() > 0));
    for (boolean bool = true; ; bool = false)
    {
      this.rpm = bool;
      bool = super.gP();
      AppMethodBeat.o(107720);
      return bool;
    }
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(107721);
    if ((this.rpm) && (paramInt == 0))
      AppMethodBeat.o(107721);
    while (true)
    {
      return;
      int i = paramInt;
      if (this.rpm)
        i = paramInt - 1;
      if (this.rBm != null)
        this.rBm.onMMMenuItemSelected(this.rBn.getItem(i), i);
      dismiss();
      AppMethodBeat.o(107721);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.k
 * JD-Core Version:    0.6.2
 */