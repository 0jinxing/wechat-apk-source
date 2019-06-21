package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.ic;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.storage.be;

public final class g extends l
  implements n.b
{
  public g(Context paramContext)
  {
    super(paramContext, new r(paramContext));
    AppMethodBeat.i(23522);
    paramContext = new ic();
    a.xxA.m(paramContext);
    AppMethodBeat.o(23522);
  }

  public static void clearData()
  {
    AppMethodBeat.i(23523);
    aw.ZK();
    c.XO().Rh("feedsapp");
    aw.ZK();
    c.XR().aoX("feedsapp");
    AppMethodBeat.o(23523);
  }

  public final boolean IO(String paramString)
  {
    AppMethodBeat.i(23527);
    boolean bool;
    if ("contact_info_plugin_view".equals(paramString))
    {
      paramString = new Intent();
      paramString.putExtra("sns_timeline_NeedFirstLoadint", true);
      d.b(this.context, "sns", ".ui.SnsTimeLineUI", paramString);
      AppMethodBeat.o(23527);
      bool = true;
    }
    while (true)
    {
      return bool;
      Intent localIntent;
      if ("contact_info_plugin_outsize".equals(paramString))
      {
        localIntent = new Intent();
        localIntent.putExtra("k_sns_tag_id", 4L);
        d.b(this.context, "sns", ".ui.SnsBlackDetailUI", localIntent);
      }
      if ("contact_info_plugin_black".equals(paramString))
      {
        localIntent = new Intent();
        localIntent.putExtra("k_sns_tag_id", 5L);
        d.b(this.context, "sns", ".ui.SnsTagDetailUI", localIntent);
      }
      if (paramString.equals("contact_info_plugin_uninstall"))
      {
        com.tencent.mm.ui.base.h.d(this.context, this.context.getString(2131303218), "", this.context.getString(2131297058), this.context.getString(2131296868), new g.2(this), null);
        AppMethodBeat.o(23527);
        bool = true;
      }
      else
      {
        bool = super.IO(paramString);
        AppMethodBeat.o(23527);
      }
    }
  }

  protected final boolean caZ()
  {
    AppMethodBeat.i(23526);
    boolean bool;
    if ((com.tencent.mm.model.r.YK() & 0x8000) == 0)
    {
      bool = true;
      AppMethodBeat.o(23526);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(23526);
    }
  }

  protected final void clear()
  {
    AppMethodBeat.i(23524);
    clearData();
    AppMethodBeat.o(23524);
  }

  protected final void jP(boolean paramBoolean)
  {
    AppMethodBeat.i(23525);
    Context localContext = this.context;
    if (paramBoolean);
    for (String str = localContext.getString(2131303213); ; str = localContext.getString(2131303221))
    {
      localContext.getString(2131297061);
      new ap(new g.1(paramBoolean, com.tencent.mm.ui.base.h.b(localContext, str, true, null)), false).ae(1500L, 1500L);
      AppMethodBeat.o(23525);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.g
 * JD-Core Version:    0.6.2
 */