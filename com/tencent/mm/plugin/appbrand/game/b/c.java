package com.tencent.mm.plugin.appbrand.game.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.plugin.appbrand.game.b.a.b;
import com.tencent.mm.plugin.fts.a.a.d;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.a.f;

public final class c extends a
{
  public CharSequence eoj;
  public l hpS;
  public AppBrandRecentTaskInfo hrc;
  public b hrd;
  private c.b hre;
  c.a hrf;

  public c(int paramInt)
  {
    super(20, paramInt);
    AppMethodBeat.i(130080);
    this.hre = new c.b(this);
    this.hrf = new c.a(this);
    AppMethodBeat.o(130080);
  }

  public final a.b Ps()
  {
    return this.hre;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(130081);
    this.hrc = i.At(this.hpS.mDx);
    this.hrd = i.As(this.hpS.mDx);
    if (this.hrd == null)
    {
      AppMethodBeat.o(130081);
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
      this.eoj = f.a(d.a(this.hrd.field_AppName, this.mDz, bool2, bool3)).mDR;
      this.info = this.hrd.field_AppId;
      AppMethodBeat.o(130081);
      break;
      bool2 = true;
      bool3 = bool2;
      bool2 = bool1;
    }
  }

  public final String aAp()
  {
    AppMethodBeat.i(130082);
    String str;
    if (this.hrd != null)
    {
      str = String.format("%s:%s", new Object[] { this.hrd.field_AppId, this.hrd.field_AppName });
      AppMethodBeat.o(130082);
    }
    while (true)
    {
      return str;
      str = ":";
      AppMethodBeat.o(130082);
    }
  }

  public final int aAq()
  {
    return this.hpS.mEK;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.c
 * JD-Core Version:    0.6.2
 */