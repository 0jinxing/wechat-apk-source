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

final class FindMContactLearmMoreUI$3
  implements f
{
  FindMContactLearmMoreUI$3(FindMContactLearmMoreUI paramFindMContactLearmMoreUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(13624);
    if (FindMContactLearmMoreUI.c(this.gsY) != null)
    {
      FindMContactLearmMoreUI.c(this.gsY).dismiss();
      FindMContactLearmMoreUI.d(this.gsY);
    }
    if (FindMContactLearmMoreUI.e(this.gsY) != null)
    {
      g.Rg().b(431, FindMContactLearmMoreUI.e(this.gsY));
      FindMContactLearmMoreUI.f(this.gsY);
    }
    LinkedList localLinkedList;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      localLinkedList = ((ag)paramm).aqj();
      ((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).setFriendData(localLinkedList);
      if ((localLinkedList == null) || (localLinkedList.size() <= 0))
        break label403;
      paramm = localLinkedList.iterator();
      paramInt1 = 0;
      while (paramm.hasNext())
      {
        paramString = (aym)paramm.next();
        if (paramString != null)
        {
          if (paramString.jBT != 1)
            break label400;
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
        label176: ab.d("MicroMsg.FindMContactLearmMoreUI", "tigerreg data size=%d, addcount=%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1) });
        if ((FindMContactLearmMoreUI.g(this.gsY) == null) || (!FindMContactLearmMoreUI.g(this.gsY).contains("1")) || (paramInt2 == 0))
          break label330;
        com.tencent.mm.plugin.b.a.wA("R300_300_phone");
        paramString = new Intent(this.gsY, FindMContactAddUI.class);
        paramString.putExtra("regsetinfo_ticket", FindMContactLearmMoreUI.h(this.gsY));
        paramString.putExtra("regsetinfo_NextStep", FindMContactLearmMoreUI.g(this.gsY));
        paramString.putExtra("regsetinfo_NextStyle", FindMContactLearmMoreUI.i(this.gsY));
        paramString.putExtra("login_type", 0);
        MMWizardActivity.J(this.gsY, paramString);
        AppMethodBeat.o(13624);
      }
      while (true)
      {
        return;
        paramInt2 = 0;
        break;
        i = localLinkedList.size();
        break label176;
        label330: FindMContactLearmMoreUI.b(this.gsY);
        AppMethodBeat.o(13624);
        continue;
        Toast.makeText(this.gsY, this.gsY.getString(2131296906, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        FindMContactLearmMoreUI.b(this.gsY);
        AppMethodBeat.o(13624);
      }
      label400: break;
      label403: paramInt2 = 0;
      paramInt1 = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactLearmMoreUI.3
 * JD-Core Version:    0.6.2
 */