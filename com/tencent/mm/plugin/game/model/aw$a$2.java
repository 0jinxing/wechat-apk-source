package com.tencent.mm.plugin.game.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask;
import com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask;
import com.tencent.mm.plugin.wepkg.model.a;
import com.tencent.mm.plugin.wepkg.utils.d;
import com.tencent.mm.sdk.platformtools.al;

final class aw$a$2 extends a
{
  aw$a$2(aw.a parama, Bundle paramBundle, boolean paramBoolean, c paramc)
  {
  }

  public final void a(BaseWepkgProcessTask paramBaseWepkgProcessTask)
  {
    AppMethodBeat.i(111473);
    if (((paramBaseWepkgProcessTask instanceof WepkgCrossProcessTask)) && (paramBaseWepkgProcessTask.csN))
      d.aNS().aa(new aw.a.2.1(this));
    AppMethodBeat.o(111473);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.aw.a.2
 * JD-Core Version:    0.6.2
 */