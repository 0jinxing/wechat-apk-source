package com.tencent.mm.plugin.account.bind.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.ag;
import com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI;
import com.tencent.mm.protocal.protobuf.aym;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMWizardActivity;
import java.util.Iterator;
import java.util.LinkedList;

final class FindMContactIntroUI$9
  implements f
{
  FindMContactIntroUI$9(FindMContactIntroUI paramFindMContactIntroUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(13605);
    if (FindMContactIntroUI.g(this.gsU) != null)
    {
      FindMContactIntroUI.g(this.gsU).dismiss();
      FindMContactIntroUI.h(this.gsU);
    }
    if (FindMContactIntroUI.i(this.gsU) != null)
    {
      g.Rg().b(431, FindMContactIntroUI.i(this.gsU));
      FindMContactIntroUI.j(this.gsU);
    }
    LinkedList localLinkedList;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      localLinkedList = ((ag)paramm).aqj();
      ((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).setFriendData(localLinkedList);
      if ((localLinkedList == null) || (localLinkedList.size() <= 0))
        break label396;
      paramString = localLinkedList.iterator();
      paramInt1 = 0;
      while (paramString.hasNext())
      {
        paramm = (aym)paramString.next();
        if (paramm != null)
        {
          if (paramm.jBT != 1)
            break label393;
          paramInt1++;
        }
      }
      if (paramInt1 > 0)
        paramInt2 = 1;
    }
    while (true)
    {
      int i;
      if (localLinkedList == null)
      {
        i = 0;
        label176: ab.d("MicroMsg.FindMContactIntroUI", "tigerreg data size=%d, addcount=%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1) });
        if ((FindMContactIntroUI.d(this.gsU) == null) || (!FindMContactIntroUI.d(this.gsU).contains("1")) || (paramInt2 == 0))
          break label330;
        com.tencent.mm.plugin.b.a.wA("R300_300_phone");
        paramString = new Intent(this.gsU, FindMContactAddUI.class);
        paramString.putExtra("regsetinfo_ticket", FindMContactIntroUI.c(this.gsU));
        paramString.putExtra("regsetinfo_NextStep", FindMContactIntroUI.d(this.gsU));
        paramString.putExtra("regsetinfo_NextStyle", FindMContactIntroUI.e(this.gsU));
        paramString.putExtra("login_type", 0);
        MMWizardActivity.J(this.gsU, paramString);
        AppMethodBeat.o(13605);
      }
      while (true)
      {
        return;
        paramInt2 = 0;
        break;
        i = localLinkedList.size();
        break label176;
        label330: FindMContactIntroUI.b(this.gsU);
        AppMethodBeat.o(13605);
        continue;
        Toast.makeText(this.gsU, this.gsU.getString(2131296906, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        AppMethodBeat.o(13605);
      }
      label393: break;
      label396: paramInt2 = 0;
      paramInt1 = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI.9
 * JD-Core Version:    0.6.2
 */