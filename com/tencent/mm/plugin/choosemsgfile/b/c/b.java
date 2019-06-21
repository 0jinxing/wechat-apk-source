package com.tencent.mm.plugin.choosemsgfile.b.c;

import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public abstract class b
  implements h
{
  protected String edV;
  protected ArrayList<com.tencent.mm.plugin.choosemsgfile.b.b.a> iPr = new ArrayList();
  protected com.tencent.mm.plugin.choosemsgfile.ui.a kuT;

  public b(com.tencent.mm.plugin.choosemsgfile.ui.a parama)
  {
    this.kuT = parama;
    this.edV = parama.getUserName();
  }

  protected final com.tencent.mm.vending.e.b bfA()
  {
    if ((this.kuT.getContext() instanceof com.tencent.mm.vending.e.b));
    for (com.tencent.mm.vending.e.b localb = (com.tencent.mm.vending.e.b)this.kuT.getContext(); ; localb = null)
      return localb;
  }

  public void dx(String paramString1, String paramString2)
  {
    ab.i("MicroMsg.BaseChooseMsgFileUIController", "onCreate type:%s extension:%s", new Object[] { paramString1, paramString2 });
    b(true, paramString1, paramString2);
  }

  public void onDestroy()
  {
    ab.i("MicroMsg.BaseChooseMsgFileUIController", "onDestroy");
  }

  public void onPause()
  {
    ab.i("MicroMsg.BaseChooseMsgFileUIController", "onPause");
  }

  public void onResume()
  {
    ab.i("MicroMsg.BaseChooseMsgFileUIController", "onResume");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.c.b
 * JD-Core Version:    0.6.2
 */