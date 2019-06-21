package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.z;
import java.lang.ref.WeakReference;

public final class a extends com.tencent.mm.pluginsdk.ui.b.b
{
  int aLB;
  private View jAp;
  b zvN;
  private d zvO;
  a zvP;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(34632);
    this.aLB = 0;
    this.jAp = null;
    if (this.view != null)
    {
      this.jAp = this.view.findViewById(2131821092);
      this.zvO = new d();
      this.zvO.zvT = this.jAp;
      this.zvO.zvU = ((Button)this.view.findViewById(2131821093));
      this.zvO.zvU.setOnClickListener(new a.1(this));
      this.jAp.setOnClickListener(new a.2(this));
    }
    AppMethodBeat.o(34632);
  }

  public final boolean aMN()
  {
    AppMethodBeat.i(34635);
    this.zvN = new b((Context)this.vlu.get());
    this.zvP = new a.3(this);
    com.tencent.mm.pluginsdk.h.a.a locala = com.tencent.mm.pluginsdk.h.a.a.fO(ah.getContext());
    int i;
    if (this.zvN != null)
      if (locala != null)
      {
        this.zvN.zvR = locala;
        this.zvN.KC();
        if ((this.zvN != null) && (this.zvN.getCount() > 0) && (this.zvN.Pz(0).a(this.zvO) == 0))
        {
          i = 1;
          if (i == 0)
            break label138;
          ab.i("MicroMsg.ADBanner", "refreshAndReturnIsVisible[true]");
          setVisibility(0);
          AppMethodBeat.o(34635);
        }
      }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      i = 0;
      break;
      label138: setVisibility(8);
      setVisibility(8);
      AppMethodBeat.o(34635);
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(34633);
    if (g.RN().QY())
    {
      aw.ZK();
      com.tencent.mm.model.c.Ry().b(this.zvN);
    }
    AppMethodBeat.o(34633);
  }

  public final int getLayoutId()
  {
    return 2130968644;
  }

  public final void release()
  {
    this.zvN = null;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(34634);
    if (this.jAp != null)
      this.jAp.setVisibility(paramInt);
    AppMethodBeat.o(34634);
  }

  public static abstract interface a
  {
    public abstract void aeT(String paramString);

    public abstract void in(String paramString1, String paramString2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.a
 * JD-Core Version:    0.6.2
 */