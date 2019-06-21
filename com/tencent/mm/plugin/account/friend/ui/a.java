package com.tencent.mm.plugin.account.friend.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.LinkedList;

public final class a
  implements View.OnClickListener
{
  private Context context;
  private a.a gwN;

  public a(Context paramContext, a.a parama)
  {
    this.context = paramContext;
    this.gwN = parama;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(108512);
    Object localObject = (a.b)paramView.getTag();
    paramView = ((a.b)localObject).username;
    int i = ((a.b)localObject).gwP;
    int j = ((a.b)localObject).position;
    localObject = ((j)g.K(j.class)).XM().aoO(paramView);
    if (bo.isNullOrNil(((ap)localObject).field_username))
      ((ad)localObject).setUsername(paramView);
    com.tencent.mm.pluginsdk.ui.applet.a locala = new com.tencent.mm.pluginsdk.ui.applet.a(this.context, new a.1(this, (ad)localObject, j, paramView));
    localObject = new LinkedList();
    ((LinkedList)localObject).add(Integer.valueOf(i));
    locala.e(paramView, (LinkedList)localObject);
    AppMethodBeat.o(108512);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.a
 * JD-Core Version:    0.6.2
 */