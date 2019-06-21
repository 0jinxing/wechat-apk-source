package com.tencent.mm.plugin.appbrand.f;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.a.f;

public final class d extends a
{
  public CharSequence eoj;
  public l hpS;
  public AppBrandRecentTaskInfo hpT;
  private d.b hpU;
  d.a hpV;

  public d(int paramInt)
  {
    super(16, paramInt);
    AppMethodBeat.i(129973);
    this.hpU = new d.b(this);
    this.hpV = new d.a(this);
    AppMethodBeat.o(129973);
  }

  public final a.b Ps()
  {
    return this.hpU;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(129974);
    this.hpT = i.An(this.hpS.mDx);
    if (this.hpT == null)
    {
      AppMethodBeat.o(129974);
      return;
    }
    boolean bool3;
    switch (this.hpS.mDw)
    {
    default:
      bool2 = false;
      bool3 = false;
    case 3:
    case 2:
    }
    while (true)
    {
      this.eoj = f.a(com.tencent.mm.plugin.fts.a.a.d.a(this.hpT.appName, this.mDz, bool2, bool3)).mDR;
      this.info = this.hpT.csl;
      AppMethodBeat.o(129974);
      break;
      bool2 = true;
      bool3 = bool2;
      bool2 = bool1;
    }
  }

  public final String aAp()
  {
    return this.hpT.appName;
  }

  public final int aAq()
  {
    return this.hpS.mEK;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f.d
 * JD-Core Version:    0.6.2
 */