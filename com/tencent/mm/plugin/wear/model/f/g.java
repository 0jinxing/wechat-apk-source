package com.tencent.mm.plugin.wear.model.f;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.protobuf.ctx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.bi;
import java.io.IOException;

public final class g extends b
{
  private bi cKd;

  public g(bi parambi)
  {
    this.cKd = parambi;
  }

  public final String getName()
  {
    return "WearLuckyCreateTask";
  }

  protected final void send()
  {
    AppMethodBeat.i(26445);
    ctx localctx = new ctx();
    Object localObject = this.cKd.field_content;
    if (localObject != null)
    {
      localObject = j.b.X((String)localObject, this.cKd.field_reserved);
      if ((localObject == null) || (!((j.b)localObject).fhZ.startsWith("wxpay://c2cbizmessagehandler/hongbao/receivehongbao")))
        break label248;
      localctx.vIs = this.cKd.field_msgId;
      localctx.wyw = this.cKd.field_talker;
      if (this.cKd.field_isSend != 1)
        break label222;
      localObject = ((j.b)localObject).fhT;
      localctx.Title = h.adw(this.cKd.field_talker);
      if (!t.kH(this.cKd.field_talker))
        break label230;
      String str = c(this.cKd.field_talker, this.cKd);
      localctx.ncM = String.format(ah.getContext().getString(2131301803), new Object[] { h.adw(str), Character.valueOf('​'), localObject });
    }
    while (true)
    {
      try
      {
        com.tencent.mm.plugin.wear.model.a.cUn();
        r.b(20014, localctx.toByteArray(), true);
        com.tencent.mm.plugin.wear.model.c.a.gn(10, 0);
        com.tencent.mm.plugin.wear.model.c.a.HH(10);
        AppMethodBeat.o(26445);
        return;
        ab.w("MicroMsg.Wear.WearLuckyCreateTask", "xml is null!");
        AppMethodBeat.o(26445);
        continue;
        label222: localObject = ((j.b)localObject).fhS;
        break;
        label230: localctx.ncM = ((String)localObject);
        continue;
      }
      catch (IOException localIOException)
      {
        AppMethodBeat.o(26445);
        continue;
      }
      label248: ab.i("MicroMsg.Wear.WearLuckyCreateTask", "biz c2c message, do not send to watch!");
      AppMethodBeat.o(26445);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.f.g
 * JD-Core Version:    0.6.2
 */