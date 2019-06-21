package com.tencent.mm.plugin.wear.model.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.protocal.protobuf.cuf;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public final class i extends c
{
  private boolean FL;
  private ArrayList<Integer> tYN;

  public i()
  {
    this.FL = true;
  }

  public i(ArrayList<Integer> paramArrayList)
  {
    this.tYN = paramArrayList;
    this.FL = false;
  }

  public final String getName()
  {
    return "WearCancelNotificationTask";
  }

  protected final void send()
  {
    AppMethodBeat.i(26447);
    ab.i("MicroMsg.WearCancelNotificationTask", "Id List=%s", new Object[] { this.tYN });
    cuf localcuf = new cuf();
    if (this.tYN != null)
      localcuf.xqG.addAll(this.tYN);
    localcuf.xqH = this.FL;
    try
    {
      a.cUn();
      r.b(20004, localcuf.toByteArray(), false);
      AppMethodBeat.o(26447);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        AppMethodBeat.o(26447);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.f.i
 * JD-Core Version:    0.6.2
 */