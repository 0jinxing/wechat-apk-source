package com.tencent.mm.app.plugin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.y;
import com.tencent.mm.model.z;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.storage.bq;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.contact.SelectContactUI;
import java.util.List;

@URISpanHandlerSet.a
class URISpanHandlerSet$ContactUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$ContactUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 23, 21, 22, 2 };
  }

  final boolean a(m paramm, com.tencent.mm.pluginsdk.ui.e.g paramg)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(15643);
    int j = paramm.type;
    y localy;
    if ((j == 23) || (j == 21) || (j == 22) || (j == 2))
    {
      localy = (y)paramm.au(y.class);
      if (paramg != null)
        paramg.a(paramm);
      if (localy == null)
      {
        h.b(URISpanHandlerSet.a(this.cgy), URISpanHandlerSet.a(this.cgy).getString(2131300949), URISpanHandlerSet.a(this.cgy).getString(2131297061), true);
        AppMethodBeat.o(15643);
      }
    }
    while (true)
    {
      return bool;
      if (localy.getType().equals("@t.qq.com"))
      {
        if (((j)com.tencent.mm.kernel.g.K(j.class)).XU().RA("@t.qq.com") == null)
          break label424;
        j = 1;
        label156: if (j == 0)
          h.b(URISpanHandlerSet.a(this.cgy), URISpanHandlerSet.a(this.cgy).getString(2131300949), URISpanHandlerSet.a(this.cgy).getString(2131297061), true);
      }
      Object localObject;
      if (localy.getType().equals("@domain.android"))
      {
        localObject = ((j)com.tencent.mm.kernel.g.K(j.class)).XU().bOJ();
        j = i;
        if (((List)localObject).size() <= 0);
      }
      for (int k = 0; ; k++)
      {
        j = i;
        if (k < ((List)localObject).size())
        {
          if (((bq)((List)localObject).get(k)).isEnable())
            j = 1;
        }
        else
        {
          if (j == 0)
            h.b(URISpanHandlerSet.a(this.cgy), URISpanHandlerSet.a(this.cgy).getString(2131300949), URISpanHandlerSet.a(this.cgy).getString(2131297061), true);
          localObject = new Intent();
          ((Intent)localObject).setClass(URISpanHandlerSet.a(this.cgy), SelectContactUI.class);
          ((Intent)localObject).putExtra("Contact_GroupFilter_Type", localy.getType()).putExtra("Contact_GroupFilter_Str", localy.Zq()).putExtra("Contact_GroupFilter_DisplayName", localy.Oi());
          ((Intent)localObject).addFlags(268435456);
          URISpanHandlerSet.a(this.cgy).startActivity((Intent)localObject);
          if (paramg != null)
            paramg.b(paramm);
          AppMethodBeat.o(15643);
          bool = true;
          break;
          label424: j = 0;
          break label156;
        }
      }
      AppMethodBeat.o(15643);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    AppMethodBeat.i(15644);
    if ((paramString.equals("weixin://contacts/microblog/")) || (paramString.equals("weixin://contacts/micromessenger/")) || (paramString.equals("weixin://contacts/all/")))
    {
      paramv = z.nZ(URISpanHandlerSet.a(this.cgy).getString(2131300426));
      if (paramString.equals("weixin://contacts/microblog/"))
        paramv = z.nZ(URISpanHandlerSet.a(this.cgy).getString(2131300425));
      if (paramString.equals("weixin://contacts/micromessenger/"))
        paramv = z.nZ(URISpanHandlerSet.a(this.cgy).getString(2131300426));
      if (paramString.equals("weixin://contacts/all/"))
        paramv = z.nZ(URISpanHandlerSet.a(this.cgy).getString(2131300422));
      paramString = new Intent();
      paramString.setClass(URISpanHandlerSet.a(this.cgy), SelectContactUI.class);
      paramString.putExtra("Contact_GroupFilter_Type", paramv.getType()).putExtra("Contact_GroupFilter_Str", paramv.Zq()).putExtra("Contact_GroupFilter_DisplayName", paramv.Oi());
      paramString.addFlags(268435456);
      paramBoolean = true;
      AppMethodBeat.o(15644);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(15644);
    }
  }

  final m dr(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(15642);
    if (paramString.trim().equals("weixin://contacts/all/"))
      localObject2 = new m(paramString, 23, new y("@all.android", null, URISpanHandlerSet.a(this.cgy).getString(2131300422), null, true, true));
    while (true)
    {
      AppMethodBeat.o(15642);
      int i;
      while (true)
      {
        return localObject2;
        if (paramString.trim().equals("weixin://contacts/microblog/"))
        {
          localObject2 = new m(paramString, 22, z.nZ(URISpanHandlerSet.a(this.cgy).getString(2131300425)));
          break;
        }
        if (paramString.trim().equals("weixin://contacts/micromessenger/"))
        {
          localObject2 = new m(paramString, 2, new y("@micromsg.qq.com", null, URISpanHandlerSet.a(this.cgy).getString(2131300426), null, true, true));
          break;
        }
        if (!paramString.trim().startsWith("weixin://contacts/"))
          break;
        localObject2 = paramString.trim().substring(0, paramString.trim().length() - 1);
        i = ((String)localObject2).lastIndexOf("/");
        if (i != -1)
          break label212;
        AppMethodBeat.o(15642);
        localObject2 = localObject1;
      }
      label212: localObject2 = new m(paramString, 21, z.ag("@".concat(String.valueOf(((String)localObject2).substring(i + 1))), URISpanHandlerSet.a(this.cgy).getString(2131300424)));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.ContactUriSpanHandler
 * JD-Core Version:    0.6.2
 */