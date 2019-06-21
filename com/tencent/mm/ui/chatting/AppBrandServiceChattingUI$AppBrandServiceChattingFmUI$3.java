package com.tencent.mm.ui.chatting;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.viewitems.c;
import com.tencent.mm.ui.chatting.viewitems.c.d;

public final class AppBrandServiceChattingUI$AppBrandServiceChattingFmUI$3 extends c.d
{
  public AppBrandServiceChattingUI$AppBrandServiceChattingFmUI$3(AppBrandServiceChattingUI.AppBrandServiceChattingFmUI paramAppBrandServiceChattingFmUI, a parama, c paramc)
  {
    super(parama, paramc);
  }

  public final void a(View paramView, a parama, bi parambi)
  {
    AppMethodBeat.i(30351);
    ab.d("MicroMsg.AppBrandServiceChattingUI", "clickListener ChattingListClickListener onClick");
    paramView.getTag();
    if (parambi.drE())
    {
      super.a(paramView, parama, parambi);
      AppMethodBeat.o(30351);
    }
    while (true)
    {
      return;
      if (parambi.bAA())
      {
        Object localObject = parambi.field_content;
        if (localObject == null)
        {
          AppMethodBeat.o(30351);
        }
        else
        {
          localObject = j.b.me((String)localObject);
          if (localObject == null)
          {
            AppMethodBeat.o(30351);
          }
          else if ((AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.b(this.yGB) == 2) && (((j.b)localObject).type == 33) && (AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.c(this.yGB).appId.equals(((j.b)localObject).fiQ)))
          {
            AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.a(this.yGB, ((j.b)localObject).fiO);
            AppMethodBeat.o(30351);
          }
          else
          {
            super.a(paramView, parama, parambi);
            AppMethodBeat.o(30351);
          }
        }
      }
      else
      {
        super.a(paramView, parama, parambi);
        AppMethodBeat.o(30351);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.3
 * JD-Core Version:    0.6.2
 */