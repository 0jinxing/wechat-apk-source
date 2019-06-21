package com.tencent.mm.plugin.voip.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.voip.c;
import com.tencent.mm.plugin.voip.model.h;
import com.tencent.mm.plugin.voip.model.i.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class InviteRemindDialog$1
  implements View.OnClickListener
{
  InviteRemindDialog$1(InviteRemindDialog paramInviteRemindDialog)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(4770);
    Object localObject1;
    Object localObject2;
    if (InviteRemindDialog.a(this.sVP) != null)
    {
      try
      {
        paramView = i.a.abV((String)g.RP().Ry().get(77829, null));
        if (paramView == null)
          break label372;
        if ((paramView != null) && (paramView.size() > 0))
        {
          if (!paramView.containsKey(InviteRemindDialog.a(this.sVP)))
            break label336;
          localObject1 = (i.a)paramView.get(InviteRemindDialog.a(this.sVP));
          ((i.a)localObject1).fMk += 1;
          paramView.put(InviteRemindDialog.a(this.sVP), localObject1);
        }
        g.RP().Ry().set(77829, i.a.ah(paramView));
        localObject2 = paramView.entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (i.a)((Map.Entry)((Iterator)localObject2).next()).getValue();
          paramView = new java/lang/StringBuilder;
          paramView.<init>("val ");
          ab.d("MMInviteRemindDialog", ((i.a)localObject1).hitCount + " " + ((i.a)localObject1).fMk);
        }
      }
      catch (Exception paramView)
      {
        ab.printErrStackTrace("MMInviteRemindDialog", paramView, "", new Object[0]);
      }
    }
    else
    {
      label218: if (InviteRemindDialog.b(this.sVP) != 0)
        break label508;
      paramView = this.sVP.getString(2131304430);
    }
    while (true)
    {
      paramView = new h(InviteRemindDialog.a(this.sVP), paramView, t.nK(InviteRemindDialog.a(this.sVP)));
      g.Rg().a(paramView, 0);
      paramView = new Intent();
      paramView.addFlags(536870912);
      paramView.addFlags(67108864);
      paramView.putExtra("Chat_User", InviteRemindDialog.a(this.sVP));
      c.gkE.d(paramView, this.sVP);
      this.sVP.finish();
      AppMethodBeat.o(4770);
      return;
      label336: localObject1 = new com/tencent/mm/plugin/voip/model/i$a;
      ((i.a)localObject1).<init>();
      ((i.a)localObject1).fMk += 1;
      paramView.put(InviteRemindDialog.a(this.sVP), localObject1);
      break;
      label372: localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      paramView = new com/tencent/mm/plugin/voip/model/i$a;
      paramView.<init>();
      paramView.fMk += 1;
      ((Map)localObject1).put(InviteRemindDialog.a(this.sVP), paramView);
      g.RP().Ry().set(77829, i.a.ah((Map)localObject1));
      localObject1 = ((Map)localObject1).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        paramView = (i.a)((Map.Entry)((Iterator)localObject1).next()).getValue();
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("val ");
        ab.d("MMInviteRemindDialog", paramView.hitCount + " " + paramView.fMk);
      }
      break label218;
      label508: if (InviteRemindDialog.b(this.sVP) == 1)
        paramView = this.sVP.getString(2131304487);
      else
        paramView = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.InviteRemindDialog.1
 * JD-Core Version:    0.6.2
 */