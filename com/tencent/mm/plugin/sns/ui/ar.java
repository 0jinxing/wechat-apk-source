package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.ap;
import com.tencent.mm.plugin.sns.model.ap.b;
import com.tencent.mm.pluginsdk.ui.d.a;

public final class ar
  implements a
{
  public String cFc;
  public String czD;
  public boolean rvm = false;
  public boolean rvn = false;
  public int scene;
  public String userName;

  public ar(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    this.cFc = paramString1;
    this.rvm = paramBoolean1;
    this.rvn = paramBoolean2;
    this.scene = paramInt;
    this.czD = paramString2;
  }

  public final boolean ctI()
  {
    int i = 2;
    AppMethodBeat.i(39186);
    if (this.scene == 1);
    while (true)
    {
      ap.b localb = ap.Ye(this.cFc);
      boolean bool;
      if ((localb != null) && (localb.foa) && (!localb.aAR) && ((i & localb.dtW) != 0))
      {
        AppMethodBeat.o(39186);
        bool = true;
      }
      while (true)
      {
        return bool;
        if (this.scene != 2)
          break label82;
        i = 4;
        break;
        bool = false;
        AppMethodBeat.o(39186);
      }
      label82: i = -1;
    }
  }

  public final String getUserName()
  {
    return this.userName;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ar
 * JD-Core Version:    0.6.2
 */