package com.tencent.mm.plugin.profile;

import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.n.d;

final class a$11
  implements n.d
{
  a$11(a parama, ad paramad, Context paramContext)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(23216);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(23216);
      Object localObject2;
      while (true)
      {
        return;
        localObject1 = this.emj;
        localObject2 = this.val$context;
        bool = com.tencent.mm.pluginsdk.permission.b.a((Activity)localObject2, "android.permission.RECORD_AUDIO", 82, "", "");
        ab.i("MicroMsg.NewContactWidgetNormal", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), localObject2 });
        if (bool)
        {
          paramMenuItem = new ui();
          paramMenuItem.cQx.cAd = 5;
          paramMenuItem.cQx.talker = ((ap)localObject1).field_username;
          paramMenuItem.cQx.context = ((Context)localObject2);
          paramMenuItem.cQx.cQs = 4;
          com.tencent.mm.sdk.b.a.xxA.m(paramMenuItem);
        }
        AppMethodBeat.o(23216);
      }
      paramMenuItem = this.emj;
      Object localObject1 = this.val$context;
      boolean bool = com.tencent.mm.pluginsdk.permission.b.a((Activity)localObject1, "android.permission.CAMERA", 19, "", "");
      ab.i("MicroMsg.NewContactWidgetNormal", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), localObject1 });
      if (bool)
      {
        bool = com.tencent.mm.pluginsdk.permission.b.a((Activity)localObject1, "android.permission.RECORD_AUDIO", 19, "", "");
        ab.i("MicroMsg.NewContactWidgetNormal", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), localObject1 });
        if (bool)
        {
          localObject2 = new ui();
          ((ui)localObject2).cQx.cAd = 5;
          ((ui)localObject2).cQx.talker = paramMenuItem.field_username;
          ((ui)localObject2).cQx.context = ((Context)localObject1);
          ((ui)localObject2).cQx.cQs = 2;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.a.11
 * JD-Core Version:    0.6.2
 */