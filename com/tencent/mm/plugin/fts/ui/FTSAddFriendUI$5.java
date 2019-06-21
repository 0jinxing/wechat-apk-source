package com.tencent.mm.plugin.fts.ui;

import android.content.Intent;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.api.j;
import com.tencent.mm.bp.d;
import com.tencent.mm.h.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.but;
import com.tencent.mm.protocal.protobuf.buu;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.io.IOException;
import java.util.LinkedList;

final class FTSAddFriendUI$5
  implements com.tencent.mm.ai.f
{
  FTSAddFriendUI$5(FTSAddFriendUI paramFTSAddFriendUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(61729);
    g.Rg().b(106, this);
    FTSAddFriendUI.d(this.mIb);
    if ((paramInt1 != 0) || (paramInt2 != 0))
      switch (paramInt2)
      {
      default:
        FTSAddFriendUI.e(this.mIb).setText(2131301725);
        label68: FTSAddFriendUI.a(this.mIb, -1);
        FTSAddFriendUI.b(this.mIb, 1);
      case -4:
      case -24:
      }
    while (true)
    {
      FTSAddFriendUI.h(this.mIb);
      AppMethodBeat.o(61729);
      while (true)
      {
        return;
        if (paramInt1 == 4)
          break;
        FTSAddFriendUI.e(this.mIb).setText(this.mIb.getString(2131302815));
        break label68;
        paramString = a.jY(paramString);
        if (paramString != null)
        {
          FTSAddFriendUI.e(this.mIb).setText(paramString.desc);
          break label68;
        }
        FTSAddFriendUI.e(this.mIb).setText(2131301725);
        break label68;
        FTSAddFriendUI.a(this.mIb, ((com.tencent.mm.plugin.messenger.a.f)paramm).bOj());
        FTSAddFriendUI localFTSAddFriendUI = this.mIb;
        paramString = (buu)((com.tencent.mm.plugin.messenger.a.f)paramm).ehh.fsG.fsP;
        if (paramString != null);
        for (paramString = aa.a(paramString.wcB); ; paramString = "")
        {
          FTSAddFriendUI.a(localFTSAddFriendUI, paramString);
          if (FTSAddFriendUI.f(this.mIb).wod <= 0)
            break label416;
          if (!FTSAddFriendUI.f(this.mIb).woe.isEmpty())
            break label282;
          h.a(this.mIb, 2131302820, 0, true, null);
          AppMethodBeat.o(61729);
          break;
        }
        label282: paramString = new Intent();
        paramString.putExtra("add_more_friend_search_scene", 3);
        if (FTSAddFriendUI.f(this.mIb).woe.size() <= 1)
          break label379;
        try
        {
          paramString.putExtra("result", FTSAddFriendUI.f(this.mIb).toByteArray());
          d.b(this.mIb.mController.ylL, "subapp", ".ui.pluginapp.ContactSearchResultUI", paramString);
          AppMethodBeat.o(61729);
        }
        catch (IOException paramString)
        {
          ab.printErrStackTrace("MicroMsg.FTS.FTSAddFriendUI", paramString, "", new Object[0]);
          AppMethodBeat.o(61729);
        }
      }
      label379: ((j)g.K(j.class)).a(paramString, (but)FTSAddFriendUI.f(this.mIb).woe.getFirst(), this.mIb.mIa);
      label416: FTSAddFriendUI.a(this.mIb, 1);
      FTSAddFriendUI.g(this.mIb);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSAddFriendUI.5
 * JD-Core Version:    0.6.2
 */