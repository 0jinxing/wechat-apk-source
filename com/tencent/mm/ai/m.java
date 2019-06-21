package com.tencent.mm.ai;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bi;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import junit.framework.Assert;

public abstract class m
{
  public boolean bqV = false;
  public e ftf;
  protected long ftg = bo.yz();
  protected int fth = -1;
  private s fti;
  f ftj;
  public boolean ftk;
  public q ftl;
  private int limit = -99;
  int priority = 0;

  public abstract int a(e parame, f paramf);

  protected int a(e parame, final q paramq, k paramk)
  {
    c(parame);
    this.ftl = paramq;
    final k localk = bi.a(paramk);
    int i = bi.aag();
    if (i != 0);
    while (true)
    {
      return i;
      if (this.limit == -99)
      {
        this.limit = acn();
        ab.i("MicroMsg.NetSceneBase", "initilized security limit count to " + this.limit);
      }
      if (acn() > 1)
        switch (2.ftp[b(paramq).ordinal()])
        {
        default:
          Assert.assertTrue("invalid security verification status", false);
        case 3:
        case 1:
        case 2:
        }
      while (true)
        if (acJ())
        {
          ab.e("MicroMsg.NetSceneBase", "dispatch failed, scene limited for security, current limit=" + acn());
          a(a.ftr);
          this.fth = -1;
          i = this.fth;
          break;
          Assert.assertTrue("scene security verification not passed, type=" + paramq.getType() + ", uri=" + paramq.getUri() + ", CHECK NOW", false);
          continue;
          ab.e("MicroMsg.NetSceneBase", "scene security verification not passed, type=" + paramq.getType() + ", uri=" + paramq.getUri());
          this.limit -= 1;
          a(a.ftq);
          this.fth = -1;
          i = this.fth;
          break;
        }
      this.limit -= 1;
      paramk = new u(paramq);
      if ((this.fti != null) && (!acK()))
        this.fti.cancel();
      this.fti = new s(paramq, localk, this, this.ftj, parame);
      this.fth = parame.a(paramk, this.fti);
      ab.i("MicroMsg.NetSceneBase", "dispatcher send, %s", new Object[] { Integer.valueOf(this.fth) });
      if (this.fth < 0)
      {
        ab.i("MicroMsg.NetSceneBase", "dispatcher send, %s, ThreadID:%s, getType:%s", new Object[] { Integer.valueOf(this.fth), Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(paramq.getType()) });
        new ak().post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(58162);
            ab.i("MicroMsg.NetSceneBase", "dispatcher send, %s, ThreadID:%s, getType:%s", new Object[] { Integer.valueOf(m.this.fth), Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(paramq.getType()) });
            localk.a(-1, 3, -1, "send to network failed", paramq, null);
            ab.i("MicroMsg.NetSceneBase", "dispatcher send, %s, ThreadID:%s, getType:%s", new Object[] { Integer.valueOf(m.this.fth), Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(paramq.getType()) });
            AppMethodBeat.o(58162);
          }
        });
        i = 99999999;
      }
      else
      {
        parame = this.fti;
        parame.handler.postDelayed(parame.ftX, 330000L);
        i = this.fth;
      }
    }
  }

  protected void a(a parama)
  {
  }

  protected boolean a(m paramm)
  {
    return false;
  }

  public boolean acI()
  {
    return false;
  }

  protected boolean acJ()
  {
    if (this.limit <= 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected boolean acK()
  {
    return false;
  }

  protected final e acL()
  {
    return this.ftf;
  }

  public boolean acM()
  {
    boolean bool = true;
    if (acn() == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final q acN()
  {
    return this.ftl;
  }

  public final int acO()
  {
    if (this.ftl == null);
    for (int i = 0; ; i = this.ftl.hashCode())
      return i;
  }

  protected int acn()
  {
    return 1;
  }

  protected b b(q paramq)
  {
    return b.ftt;
  }

  protected boolean b(m paramm)
  {
    return false;
  }

  protected final void c(e parame)
  {
    this.ftg = bo.yz();
    this.ftf = parame;
  }

  protected void cancel()
  {
    ab.i("MicroMsg.NetSceneBase", "cancel: %d, hash:%d, type:%d", new Object[] { Integer.valueOf(this.fth), Integer.valueOf(hashCode()), Integer.valueOf(getType()) });
    this.bqV = true;
    if (this.fti != null)
      this.fti.cancel();
    if ((this.fth != -1) && (this.ftf != null))
    {
      int i = this.fth;
      this.fth = -1;
      this.ftf.cancel(i);
    }
  }

  public String getInfo()
  {
    return "";
  }

  public abstract int getType();

  public final void reset()
  {
    this.ftg = bo.yz();
    this.fth = -1;
    this.limit = -99;
  }

  public static enum a
  {
    static
    {
      AppMethodBeat.i(58166);
      ftq = new a("EStatusCheckFailed", 0);
      ftr = new a("EReachMaxLimit", 1);
      fts = new a[] { ftq, ftr };
      AppMethodBeat.o(58166);
    }
  }

  public static enum b
  {
    static
    {
      AppMethodBeat.i(58169);
      ftt = new b("EUnchecked", 0);
      ftu = new b("EOk", 1);
      ftv = new b("EFailed", 2);
      ftw = new b[] { ftt, ftu, ftv };
      AppMethodBeat.o(58169);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.m
 * JD-Core Version:    0.6.2
 */