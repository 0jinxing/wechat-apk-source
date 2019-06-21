package com.tencent.mm.plugin.card.ui.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.ui.e.a;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;

public final class h extends a
{
  public h(MMActivity paramMMActivity)
  {
    super(paramMMActivity);
  }

  protected final void bdD()
  {
    AppMethodBeat.i(88723);
    super.bdD();
    AppMethodBeat.o(88723);
  }

  public final boolean bdN()
  {
    boolean bool = true;
    AppMethodBeat.i(88724);
    ArrayList localArrayList = com.tencent.mm.plugin.card.sharecard.a.b.GD(this.kaS.baa());
    if (((!this.kjF.kcf) || (this.kjF.emC == 4)) && (!TextUtils.isEmpty(this.kaS.bab())))
      AppMethodBeat.o(88724);
    while (true)
    {
      return bool;
      if (((this.kjF.kcf) && (localArrayList != null) && (localArrayList.size() > 0)) || ((!TextUtils.isEmpty(this.kaS.bab())) && (bdO())))
      {
        AppMethodBeat.o(88724);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(88724);
      }
    }
  }

  public final boolean bdO()
  {
    if (this.kjF.emC == 3);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean bdP()
  {
    return false;
  }

  public final boolean bdR()
  {
    return this.kok;
  }

  public final boolean bdS()
  {
    return false;
  }

  public final boolean bdU()
  {
    return false;
  }

  public final boolean bdV()
  {
    AppMethodBeat.i(88725);
    boolean bool;
    if ((this.kok) && (super.bdV()))
    {
      bool = true;
      AppMethodBeat.o(88725);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88725);
    }
  }

  public final boolean bdZ()
  {
    return false;
  }

  public final boolean bea()
  {
    return false;
  }

  public final boolean beb()
  {
    boolean bool = true;
    AppMethodBeat.i(88726);
    if (super.beb())
      AppMethodBeat.o(88726);
    while (true)
    {
      return bool;
      if (bec())
      {
        AppMethodBeat.o(88726);
      }
      else if ((this.kaS.aZC()) && (this.kok))
      {
        AppMethodBeat.o(88726);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(88726);
      }
    }
  }

  public final boolean bec()
  {
    boolean bool = true;
    AppMethodBeat.i(88727);
    if ((!this.kok) && (this.kaS.aZV().vUt == 1))
      AppMethodBeat.o(88727);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88727);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.a.h
 * JD-Core Version:    0.6.2
 */