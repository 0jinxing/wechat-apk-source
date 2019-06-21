package com.tencent.mm.plugin.account.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.plugin.account.a.a.b;
import com.tencent.mm.plugin.account.friend.a.al;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class a
  implements f
{
  b fAY;
  boolean fPO;
  c gyA;
  ak gyB;
  Set<String> gyz;

  public a()
  {
    AppMethodBeat.i(124657);
    this.gyz = Collections.synchronizedSet(new HashSet());
    this.fPO = false;
    this.gyA = new a.1(this);
    this.gyB = new a.2(this);
    this.fAY = new a.3(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.gyA);
    AppMethodBeat.o(124657);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(124658);
    if (paramm.getType() == 133)
    {
      g.Rg().b(133, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ContactsAutoSyncLogic ", "MMFunc_UploadMContact onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
        this.fPO = false;
      }
    }
    else
    {
      if (paramm.getType() != 32)
        break label193;
      this.fPO = false;
      g.Rg().b(32, this);
      if ((paramInt1 == 0) && (paramInt2 == 0))
        break label180;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ContactsAutoSyncLogic ", "rtGETMFRIEND onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
      AppMethodBeat.o(124658);
    }
    while (true)
    {
      return;
      g.Rg().a(32, this);
      paramString = (al)paramm;
      paramString = new com.tencent.mm.plugin.account.friend.a.ab(paramString.gwp, paramString.gwq);
      g.Rg().a(paramString, 0);
      break;
      label180: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ContactsAutoSyncLogic ", "update All Contact");
      w.co(ah.getContext());
      label193: AppMethodBeat.o(124658);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.a
 * JD-Core Version:    0.6.2
 */