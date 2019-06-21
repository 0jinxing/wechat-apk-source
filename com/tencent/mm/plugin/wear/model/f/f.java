package com.tencent.mm.plugin.wear.model.f;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.g;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.protobuf.cts;
import com.tencent.mm.protocal.protobuf.ctt;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.IOException;
import java.util.LinkedList;

public final class f extends c
{
  private String nickname;
  private int type;
  private String username;

  public f(String paramString1, String paramString2, int paramInt)
  {
    this.username = paramString1;
    this.nickname = paramString2;
    this.type = paramInt;
  }

  public final String getName()
  {
    return "WearFriendCreateTask";
  }

  protected final void send()
  {
    AppMethodBeat.i(26444);
    Object localObject = a.cUn().tXv.adr(this.username);
    ctt localctt = new ctt();
    if (this.type == 1)
    {
      cts localcts = new cts();
      localcts.ndE = ((com.tencent.mm.plugin.wear.model.f)localObject).id;
      localcts.jBB = this.username;
      localcts.jCH = this.nickname;
      localcts.ncM = ah.getContext().getString(2131301809);
      localObject = com.tencent.mm.ah.b.a(this.username, false, -1);
      if (localObject != null)
        localcts.xqr = new com.tencent.mm.bt.b(h.ad((Bitmap)localObject));
      localctt.jBw.add(localcts);
    }
    try
    {
      a.cUn();
      r.b(20006, localctt.toByteArray(), true);
      AppMethodBeat.o(26444);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        AppMethodBeat.o(26444);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.f.f
 * JD-Core Version:    0.6.2
 */