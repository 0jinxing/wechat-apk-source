package com.tencent.mm.plugin.wear.model.f;

import com.tencent.mm.g.a.vi;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class c extends d
{
  protected final void execute()
  {
    if (com.tencent.mm.plugin.wear.model.a.cUn().tXt.cUs())
    {
      vi localvi = new vi();
      localvi.cSq.cuy = 11;
      com.tencent.mm.sdk.b.a.xxA.m(localvi);
      send();
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WearBaseSendTask", "can not send message to wear");
    }
  }

  protected abstract void send();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.f.c
 * JD-Core Version:    0.6.2
 */