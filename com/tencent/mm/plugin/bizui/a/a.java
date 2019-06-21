package com.tencent.mm.plugin.bizui.a;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

public final class a
{
  public static c a(q paramq, String paramString1, String paramString2, String paramString3, q.a parama1, q.a parama2)
  {
    AppMethodBeat.i(70044);
    Object localObject = new c.a(paramq.ylL);
    ((c.a)localObject).a(com.tencent.mm.compatible.g.a.decodeResource(paramq.ylL.getResources(), 2131231214), false, 3);
    ((c.a)localObject).rc(false);
    ((c.a)localObject).rd(false);
    ((c.a)localObject).asG(paramString1).Qb(17);
    localObject = ((c.a)localObject).aMb();
    AppCompatActivity localAppCompatActivity = paramq.ylL;
    if (!bo.isNullOrNil(paramString3))
    {
      paramString1 = paramString3;
      if (paramString3.length() != 0);
    }
    else
    {
      paramString1 = localAppCompatActivity.getResources().getString(2131298423);
    }
    if (!bo.isNullOrNil(paramString2))
    {
      paramString3 = paramString2;
      if (paramString2.length() != 0);
    }
    else
    {
      paramString3 = localAppCompatActivity.getResources().getString(2131296868);
    }
    ((c)localObject).a(paramString1, true, new a.1((c)localObject, parama2));
    ((c)localObject).b(paramString3, true, new a.2((c)localObject, parama1));
    ((c)localObject).PU(paramq.ylL.getResources().getColor(2131689776));
    ((c)localObject).show();
    AppMethodBeat.o(70044);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bizui.a.a
 * JD-Core Version:    0.6.2
 */