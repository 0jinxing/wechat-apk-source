package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.game.d.ap;
import com.tencent.mm.sdk.platformtools.ab;

final class CreateOrJoinChatroomUI$2
  implements w.a
{
  CreateOrJoinChatroomUI$2(CreateOrJoinChatroomUI paramCreateOrJoinChatroomUI)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(111703);
    paramb = (ap)paramb.fsH.fsP;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.CreateOrJoinChatroomUI", "CGI return is not OK. (%d, %d)(%s)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if (paramInt1 == 4)
      {
        CreateOrJoinChatroomUI.a(this.nev, paramb.luT);
        CreateOrJoinChatroomUI.a(this.nev);
        this.nev.finish();
        AppMethodBeat.o(111703);
      }
    }
    while (true)
    {
      return 0;
      CreateOrJoinChatroomUI.a(this.nev, -1);
      break;
      paramString = paramb.nbf;
      ab.i("MicroMsg.CreateOrJoinChatroomUI", "Join Url: %s", new Object[] { paramString });
      CreateOrJoinChatroomUI.a(this.nev);
      CreateOrJoinChatroomUI.a(this.nev, paramString);
      AppMethodBeat.o(111703);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.CreateOrJoinChatroomUI.2
 * JD-Core Version:    0.6.2
 */