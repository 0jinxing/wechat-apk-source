package com.tencent.mm.plugin.choosemsgfile.b.a;

import com.tencent.mm.choosemsgfile.compat.MsgFile;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.vending.e.b;

public abstract class c
  implements com.tencent.mm.vending.e.a, Runnable
{
  private static long ktV = 2000L;
  private int frO;
  protected com.tencent.mm.plugin.choosemsgfile.b.b.a ktT;
  protected a ktU;
  private boolean ktW = false;
  private Runnable ktX = new c.1(this);
  private int offset;

  public c(com.tencent.mm.plugin.choosemsgfile.b.b.a parama, a parama1, b paramb)
  {
    this.ktT = parama;
    this.ktU = parama1;
    if (paramb != null)
      paramb.keep(this);
  }

  protected final void b(MsgFile paramMsgFile)
  {
    try
    {
      ab.i("MicroMsg.MsgFileWorker_Base", "onDownloadSuccess msgFile:%s", new Object[] { paramMsgFile });
      if (this.ktU != null)
      {
        this.ktU.a(paramMsgFile);
        this.ktU = null;
      }
      return;
    }
    finally
    {
      paramMsgFile = finally;
    }
    throw paramMsgFile;
  }

  protected abstract boolean bfh();

  protected abstract void bfi();

  protected final void bfj()
  {
    try
    {
      ab.i("MicroMsg.MsgFileWorker_Base", "onDownloadStop");
      if (this.ktU != null)
      {
        this.ktU.bff();
        this.ktU = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected final void bfk()
  {
    try
    {
      ab.i("MicroMsg.MsgFileWorker_Base", "onDownloadFail");
      if (this.ktU != null)
      {
        this.ktU.bfe();
        this.ktU = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected abstract boolean checkValid();

  protected final void dL(int paramInt1, int paramInt2)
  {
    try
    {
      ab.v("MicroMsg.MsgFileWorker_Base", "onDownloadProgress offset:%d totalLen:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.offset = paramInt1;
      this.frO = paramInt2;
      if ((this.ktW) && (this.ktU != null))
        this.ktU.dK(paramInt1, paramInt2);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void dead()
  {
  }

  public void run()
  {
    al.n(this.ktX, ktV);
    bfi();
  }

  public String toString()
  {
    return "MsgFileWorker_Base{mMsgItem=" + this.ktT + '}';
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.a.c
 * JD-Core Version:    0.6.2
 */