package com.tencent.mm.plugin.fav.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.al;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.bca;
import com.tencent.mm.protocal.protobuf.bcd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.MMTextInputUI;
import java.util.LinkedList;

public class FavTextEditUI extends MMTextInputUI
{
  public final void I(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(74162);
    if ((paramCharSequence == null) || (bo.isNullOrNil(paramCharSequence.toString())))
    {
      ab.w("MicroMsg.FavTextEditUI", "text is null");
      AppMethodBeat.o(74162);
    }
    while (true)
    {
      return;
      int i = getIntent().getIntExtra("key_fav_item_id", -1);
      String str = paramCharSequence.toString();
      if (i <= 0)
      {
        ab.w("MicroMsg.FavTextEditUI", "modEditText favid:%d", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(74162);
      }
      else
      {
        paramCharSequence = new LinkedList();
        Object localObject1 = new bca();
        ((bca)localObject1).wGC = 4;
        ((bca)localObject1).wGD = 0;
        paramCharSequence.add(localObject1);
        localObject1 = new LinkedList();
        Object localObject2 = new bcd();
        ((bcd)localObject2).ncF = "favitem.desc";
        ((bcd)localObject2).pXM = bo.bc(str, "");
        ((LinkedList)localObject1).add(localObject2);
        localObject2 = new bcd();
        ((bcd)localObject2).ncF = "favitem.edittime";
        ((bcd)localObject2).pXM = String.valueOf(bo.anT());
        ((LinkedList)localObject1).add(localObject2);
        localObject2 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iF(i);
        if (localObject2 != null)
        {
          ((com.tencent.mm.plugin.fav.a.g)localObject2).field_edittime = bo.anT();
          ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.mk(((com.tencent.mm.plugin.fav.a.g)localObject2).field_edittime);
          ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.alC(bo.bc(str, ""));
          ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a((com.tencent.mm.plugin.fav.a.g)localObject2, new String[] { "localId" });
        }
        paramCharSequence = new al(i, paramCharSequence, (LinkedList)localObject1);
        com.tencent.mm.kernel.g.Rg().a(paramCharSequence, 0);
        h.pYm.e(10874, new Object[] { Integer.valueOf(1) });
        AppMethodBeat.o(74162);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969499;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(74161);
    this.ylm = true;
    super.onCreate(paramBundle);
    setMMTitle(2131299614);
    AppMethodBeat.o(74161);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavTextEditUI
 * JD-Core Version:    0.6.2
 */