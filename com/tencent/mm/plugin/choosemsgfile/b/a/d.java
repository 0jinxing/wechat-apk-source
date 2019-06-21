package com.tencent.mm.plugin.choosemsgfile.b.a;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.choosemsgfile.compat.MsgFile;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.choosemsgfile.b.b.e;
import com.tencent.mm.plugin.choosemsgfile.b.b.j;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.vending.e.b;

public final class d extends c
{
  private int Lp;
  private int alq;
  private ap gyS;

  public d(com.tencent.mm.plugin.choosemsgfile.b.b.a parama, a parama1, b paramb)
  {
    super(parama, parama1, paramb);
    AppMethodBeat.i(54257);
    this.Lp = 0;
    this.alq = parama.bfp();
    AppMethodBeat.o(54257);
  }

  private boolean bfl()
  {
    boolean bool;
    if ((this.ktT instanceof j))
      bool = ((j)this.ktT).kuq;
    while (true)
    {
      return bool;
      if ((this.ktT instanceof e))
        bool = ((e)this.ktT).kuq;
      else
        bool = false;
    }
  }

  private boolean bfm()
  {
    boolean bool;
    if ((this.ktT instanceof j))
      bool = ((j)this.ktT).kus;
    while (true)
    {
      return bool;
      if ((this.ktT instanceof e))
        bool = ((e)this.ktT).kus;
      else
        bool = false;
    }
  }

  private void wM()
  {
    AppMethodBeat.i(54260);
    if (bfm())
    {
      MsgFile localMsgFile = new MsgFile();
      localMsgFile.fileSize = this.ktT.bfp();
      localMsgFile.filePath = "only for test";
      localMsgFile.fileName = (this.ktT.getFileName() + "." + localMsgFile.eov);
      localMsgFile.type = "file";
      localMsgFile.eov = this.ktT.bfo();
      localMsgFile.timeStamp = this.ktT.getTimeStamp();
      b(localMsgFile);
      AppMethodBeat.o(54260);
    }
    while (true)
    {
      return;
      bfk();
      AppMethodBeat.o(54260);
    }
  }

  protected final boolean bfh()
  {
    AppMethodBeat.i(54258);
    if (bfl())
      wM();
    boolean bool = bfl();
    AppMethodBeat.o(54258);
    return bool;
  }

  protected final void bfi()
  {
    AppMethodBeat.i(54259);
    boolean bool;
    long l;
    if ((this.ktT instanceof j))
    {
      bool = ((j)this.ktT).kur;
      if (!bool)
        break label164;
      if (this.gyS == null)
        this.gyS = new ap(g.RS().oAl.getLooper(), new ap.a()
        {
          public final boolean BI()
          {
            AppMethodBeat.i(54256);
            d.a(d.this, d.a(d.this) + 1048576);
            if (d.a(d.this) > d.b(d.this))
              d.a(d.this, d.b(d.this));
            d.this.dL(d.a(d.this), d.b(d.this));
            if (d.a(d.this) == d.b(d.this))
            {
              d.c(d.this);
              d.d(d.this).stopTimer();
              d.e(d.this);
            }
            AppMethodBeat.o(54256);
            return true;
          }
        }
        , true);
      ap localap = this.gyS;
      if (!(this.ktT instanceof j))
        break label133;
      l = ((j)this.ktT).kut;
      label92: localap.ae(l, l);
      AppMethodBeat.o(54259);
    }
    while (true)
    {
      return;
      if ((this.ktT instanceof e))
      {
        bool = ((e)this.ktT).kur;
        break;
      }
      bool = false;
      break;
      label133: if ((this.ktT instanceof e))
      {
        l = ((e)this.ktT).kut;
        break label92;
      }
      l = 1000L;
      break label92;
      label164: wM();
      AppMethodBeat.o(54259);
    }
  }

  protected final boolean checkValid()
  {
    boolean bool;
    if ((this.ktT instanceof j))
      bool = ((j)this.ktT).kup;
    while (true)
    {
      return bool;
      if ((this.ktT instanceof e))
        bool = ((e)this.ktT).kup;
      else
        bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.a.d
 * JD-Core Version:    0.6.2
 */