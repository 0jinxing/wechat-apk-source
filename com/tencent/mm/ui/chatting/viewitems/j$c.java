package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.downloader_app.a.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;

public final class j$c extends c
  implements View.OnClickListener
{
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(32933);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969050);
      ((View)localObject).setTag(new j.b().eV((View)localObject));
    }
    AppMethodBeat.o(32933);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(32934);
    Object localObject = parambi.field_content;
    paramString = null;
    if (localObject != null)
      paramString = com.tencent.mm.af.j.b.X((String)localObject, parambi.field_reserved);
    if (paramString == null)
    {
      AppMethodBeat.o(32934);
      return;
    }
    parambi = (j.b)parama;
    paramString = (j.a)paramString.X(j.a.class);
    if (parambi.iVh != null)
      parambi.iVh.setVisibility(8);
    if (parambi.moo != null)
      parambi.moo.setVisibility(8);
    long l;
    if (paramString.state == 1)
    {
      parambi.zdF.setVisibility(0);
      parambi.zdH.setVisibility(8);
      parambi.iPD.setText(paramString.appName);
      localObject = parambi.zdG;
      l = paramString.zdE;
      if (l >= 1073741824L)
      {
        parama = String.format("%.1fGB", new Object[] { Float.valueOf((float)l / 1024.0F / 1024.0F / 1024.0F) });
        label190: ((TextView)localObject).setText(parama);
        o.ahp().a(paramString.iconUrl, parambi.kPq);
        if (!com.tencent.mm.pluginsdk.model.app.g.u(parama1.yTx.getContext(), paramString.appId))
          break label332;
        parambi.zdL.setText(2131298955);
      }
    }
    while (true)
    {
      parambi.jOR.setTag(paramString);
      parambi.jOR.setOnClickListener(this);
      AppMethodBeat.o(32934);
      break;
      if (l >= 1048576L)
      {
        parama = String.format("%.1fMB", new Object[] { Float.valueOf((float)l / 1024.0F / 1024.0F) });
        break label190;
      }
      parama = String.format("%.2fMB", new Object[] { Float.valueOf((float)l / 1024.0F / 1024.0F) });
      break label190;
      label332: parambi.zdL.setText(2131298953);
      continue;
      parambi.zdF.setVisibility(8);
      parambi.zdH.setVisibility(0);
      parambi.zdI.setText(parama1.dDw());
      a.b.b(parambi.zdJ, parama1.getTalkerUserName());
      parambi.zdK.setText(parama1.yTx.getContext().getResources().getString(2131298967, new Object[] { paramString.appName }));
      parambi.zdL.setText(2131298958);
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    return false;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (paramInt == 671088689));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    return false;
  }

  final boolean dHk()
  {
    return false;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(32935);
    j.a locala = (j.a)paramView.getTag();
    if (locala == null)
      AppMethodBeat.o(32935);
    while (true)
    {
      return;
      if (locala.state == 1)
      {
        if (com.tencent.mm.pluginsdk.model.app.g.u(paramView.getContext(), locala.appId))
        {
          ((d)com.tencent.mm.kernel.g.K(d.class)).ak(paramView.getContext(), locala.appId);
          AppMethodBeat.o(32935);
        }
        else
        {
          ((d)com.tencent.mm.kernel.g.K(d.class)).a(paramView.getContext(), new Intent().putExtra("appId", locala.appId), null);
          AppMethodBeat.o(32935);
        }
      }
      else
      {
        ((d)com.tencent.mm.kernel.g.K(d.class)).a(paramView.getContext(), null, null);
        AppMethodBeat.o(32935);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.j.c
 * JD-Core Version:    0.6.2
 */