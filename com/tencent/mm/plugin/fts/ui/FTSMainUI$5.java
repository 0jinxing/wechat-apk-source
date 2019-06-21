package com.tencent.mm.plugin.fts.ui;

import android.content.Intent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.api.j;
import com.tencent.mm.bp.d;
import com.tencent.mm.h.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.but;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import java.util.LinkedList;

final class FTSMainUI$5
  implements com.tencent.mm.ai.f
{
  FTSMainUI$5(FTSMainUI paramFTSMainUI, String paramString)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(61870);
    g.Rg().b(106, this);
    if ((paramInt1 == 4) && (paramInt2 == -4))
    {
      FTSMainUI.o(this.mJJ);
      h.a(this.mJJ, 2131302820, 0, true, null);
      AppMethodBeat.o(61870);
    }
    while (true)
    {
      return;
      FTSMainUI.o(this.mJJ);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        switch (paramInt2)
        {
        default:
        case -4:
        case -24:
        }
        while (true)
        {
          ab.w("MicroMsg.FTS.FTSMainUI", String.format("Search contact failed: %d, %d.", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
          AppMethodBeat.o(61870);
          break;
          Toast.makeText(this.mJJ, this.mJJ.getString(2131302815), 0).show();
          continue;
          paramString = a.jY(paramString);
          if (paramString != null)
            h.a(this.mJJ, paramString.desc, paramString.Title, true, null);
        }
      }
      paramString = ((com.tencent.mm.plugin.messenger.a.f)paramm).bOj();
      if (paramString.wod <= 0)
        break;
      if (paramString.woe.isEmpty())
      {
        h.a(this.mJJ, 2131302820, 0, true, null);
        AppMethodBeat.o(61870);
      }
      else
      {
        paramm = new Intent();
        ((j)g.K(j.class)).a(paramm, (but)paramString.woe.getFirst(), this.mJJ.mIa);
        d.b(this.mJJ, "profile", ".ui.ContactInfoUI", paramm);
        AppMethodBeat.o(61870);
      }
    }
    if (bo.nullAsNil(aa.a(paramString.wcB)).length() > 0)
    {
      if (2 != paramString.wWh)
        break label427;
      this.mJJ.mIa = 15;
    }
    while (true)
    {
      paramm = new Intent();
      ((j)g.K(j.class)).a(paramm, paramString, this.mJJ.mIa);
      if (this.mJJ.mIa == 15)
        paramm.putExtra("Contact_Search_Mobile", this.IP.trim());
      paramm.putExtra("Contact_Scene", this.mJJ.mIa);
      paramm.putExtra("add_more_friend_search_scene", 2);
      d.b(this.mJJ, "profile", ".ui.ContactInfoUI", paramm);
      AppMethodBeat.o(61870);
      break;
      label427: if (1 == paramString.wWh)
        this.mJJ.mIa = 1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.5
 * JD-Core Version:    0.6.2
 */