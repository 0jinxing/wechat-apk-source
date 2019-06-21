package com.tencent.mm.plugin.profile.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.openim.b.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.e.b;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class SayHiWithSnsPermissionUI$6
  implements MenuItem.OnMenuItemClickListener
{
  SayHiWithSnsPermissionUI$6(SayHiWithSnsPermissionUI paramSayHiWithSnsPermissionUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(23775);
    if ((SayHiWithSnsPermissionUI.d(this.ppC) != null) && (SayHiWithSnsPermissionUI.d(this.ppC).isShowing()))
    {
      AppMethodBeat.o(23775);
      return false;
    }
    LinkedList localLinkedList;
    Object localObject1;
    Object localObject2;
    if (SayHiWithSnsPermissionUI.e(this.ppC))
    {
      localLinkedList = new LinkedList();
      localLinkedList.add(SayHiWithSnsPermissionUI.f(this.ppC));
      localObject1 = new LinkedList();
      ((LinkedList)localObject1).add(Integer.valueOf(SayHiWithSnsPermissionUI.g(this.ppC)));
      paramMenuItem = SayHiWithSnsPermissionUI.h(this.ppC);
      localObject2 = new HashMap();
      if (!SayHiWithSnsPermissionUI.i(this.ppC).zMU)
        break label626;
    }
    label626: for (int i = 1; ; i = 0)
    {
      ((Map)localObject2).put(SayHiWithSnsPermissionUI.f(this.ppC), Integer.valueOf(i));
      ab.d("MicroMsg.SayHiWithSnsPermissionUI", "select sns permission, %s", new Object[] { Integer.valueOf(i) });
      if (ad.aox(SayHiWithSnsPermissionUI.f(this.ppC)))
      {
        localObject2 = this.ppC.getIntent().getStringExtra(e.b.yfT);
        localObject1 = new o(SayHiWithSnsPermissionUI.f(this.ppC), paramMenuItem, (String)localObject2);
        aw.Rg().a((com.tencent.mm.ai.m)localObject1, 0);
        localObject2 = this.ppC;
        paramMenuItem = this.ppC.mController.ylL;
        this.ppC.getString(2131297061);
        SayHiWithSnsPermissionUI.a((SayHiWithSnsPermissionUI)localObject2, h.b(paramMenuItem, this.ppC.getString(2131302962), true, new SayHiWithSnsPermissionUI.6.1(this, (o)localObject1)));
      }
      while (true)
      {
        AppMethodBeat.o(23775);
        break;
        paramMenuItem = new com.tencent.mm.pluginsdk.model.m(localLinkedList, (List)localObject1, paramMenuItem, "", (Map)localObject2, SayHiWithSnsPermissionUI.j(this.ppC));
        localObject1 = this.ppC.getIntent().getStringExtra("source_from_user_name");
        localObject2 = this.ppC.getIntent().getStringExtra("source_from_nick_name");
        if (!bo.isNullOrNil((String)localObject1))
          paramMenuItem.hB((String)localObject1, (String)localObject2);
        aw.Rg().a(paramMenuItem, 0);
        localObject2 = this.ppC;
        localObject1 = this.ppC.mController.ylL;
        this.ppC.getString(2131297061);
        SayHiWithSnsPermissionUI.a((SayHiWithSnsPermissionUI)localObject2, h.b((Context)localObject1, this.ppC.getString(2131302962), true, new SayHiWithSnsPermissionUI.6.2(this, paramMenuItem)));
        continue;
        if (SayHiWithSnsPermissionUI.k(this.ppC))
        {
          paramMenuItem = this.ppC.getIntent().getStringExtra("Verify_ticket");
          if (ad.aox(SayHiWithSnsPermissionUI.f(this.ppC)))
          {
            localObject1 = new com.tencent.mm.openim.b.q(SayHiWithSnsPermissionUI.f(this.ppC), paramMenuItem);
            aw.Rg().a((com.tencent.mm.ai.m)localObject1, 0);
            localObject2 = this.ppC;
            paramMenuItem = this.ppC.mController.ylL;
            this.ppC.getString(2131297061);
            SayHiWithSnsPermissionUI.a((SayHiWithSnsPermissionUI)localObject2, h.b(paramMenuItem, this.ppC.getString(2131298501), true, new SayHiWithSnsPermissionUI.6.3(this, (com.tencent.mm.openim.b.q)localObject1)));
          }
          else
          {
            localObject2 = new com.tencent.mm.pluginsdk.model.m(SayHiWithSnsPermissionUI.f(this.ppC), paramMenuItem, SayHiWithSnsPermissionUI.g(this.ppC), (byte)0);
            aw.Rg().a((com.tencent.mm.ai.m)localObject2, 0);
            localObject1 = this.ppC;
            paramMenuItem = this.ppC.mController.ylL;
            this.ppC.getString(2131297061);
            SayHiWithSnsPermissionUI.a((SayHiWithSnsPermissionUI)localObject1, h.b(paramMenuItem, this.ppC.getString(2131298501), true, new SayHiWithSnsPermissionUI.6.4(this, (com.tencent.mm.pluginsdk.model.m)localObject2)));
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI.6
 * JD-Core Version:    0.6.2
 */