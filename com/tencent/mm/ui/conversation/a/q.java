package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelmulti.k;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class q extends b
{
  private TextView gnB;
  private ImageView iqT;
  private View jAp;
  private boolean zwX;
  boolean zxl;
  private c zxm;

  public q(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(34735);
    this.zwX = false;
    this.jAp = null;
    this.zxl = false;
    if ((!this.zwX) && (this.view != null))
    {
      this.jAp = this.view.findViewById(2131828364);
      this.gnB = ((TextView)this.view.findViewById(2131828366));
      this.iqT = ((ImageView)this.view.findViewById(2131828365));
      this.zwX = true;
      this.zxm = new q.1(this);
      a.xxA.c(this.zxm);
    }
    AppMethodBeat.o(34735);
  }

  public final boolean aMN()
  {
    boolean bool = false;
    AppMethodBeat.i(34736);
    if (!this.zxl)
    {
      ab.i("MicroMsg.TryNewInitBanner", "summerinit update but initFailed[%b] just ret update false", new Object[] { Boolean.valueOf(this.zxl) });
      this.jAp.setVisibility(8);
      AppMethodBeat.o(34736);
    }
    while (true)
    {
      return bool;
      if (k.ahT())
        break;
      ab.i("MicroMsg.TryNewInitBanner", "summerinit update but not need init just update false");
      this.zxl = false;
      this.jAp.setVisibility(8);
      AppMethodBeat.o(34736);
    }
    this.gnB.setText(2131297500);
    this.iqT.setVisibility(0);
    this.jAp.setOnClickListener(new q.2(this));
    this.jAp.setVisibility(0);
    if (this.jAp.getVisibility() == 0);
    for (bool = true; ; bool = false)
    {
      ab.i("MicroMsg.TryNewInitBanner", "summerinit update set visible [%b]", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(34736);
      bool = true;
      break;
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(34738);
    a.xxA.d(this.zxm);
    AppMethodBeat.o(34738);
  }

  public final int getLayoutId()
  {
    return 2130970970;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(34737);
    if (this.jAp != null)
      this.jAp.setVisibility(paramInt);
    AppMethodBeat.o(34737);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.q
 * JD-Core Version:    0.6.2
 */