package com.tencent.mm.plugin.wenote.model;

import android.os.Message;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.j.a;
import com.tencent.mm.audio.b.j;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.plugin.wenote.model.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

public final class k
{
  private static k uNN = null;
  public long duration;
  public com.tencent.mm.compatible.util.b gar;
  public long ljM;
  public boolean miB;
  public boolean miC;
  public long miD;
  private Toast miE;
  public j miM;
  private final ak miO;
  public final ap miP;
  public TextView mkf;
  public String path;
  public com.tencent.mm.modelvoice.k uNL;
  public String uNM;
  public int uNO;
  public a uNP;
  public l uNQ;
  public final ak uNR;

  private k()
  {
    AppMethodBeat.i(26669);
    this.miD = -1L;
    this.uNM = "";
    this.path = "";
    this.uNO = 0;
    this.uNQ = null;
    this.miO = new ak()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(26666);
        super.handleMessage(paramAnonymousMessage);
        k.b(k.this);
        AppMethodBeat.o(26666);
      }
    };
    this.uNR = new k.4(this);
    this.miP = new ap(new k.5(this), true);
    this.gar = new com.tencent.mm.compatible.util.b(ah.getContext());
    AppMethodBeat.o(26669);
  }

  private void bvG()
  {
    AppMethodBeat.i(26674);
    if (!this.miB)
    {
      AppMethodBeat.o(26674);
      return;
    }
    this.uNR.removeMessages(4096);
    stopRecord();
    this.duration = getDuration();
    if (this.duration < 800L);
    for (int i = 1; ; i = 0)
    {
      this.miP.stopTimer();
      if (i != 0)
      {
        bvI();
        ddN();
      }
      this.miB = false;
      AppMethodBeat.o(26674);
      break;
    }
  }

  private void bvI()
  {
    AppMethodBeat.i(26677);
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(this.path);
    if (localb.exists())
      localb.delete();
    AppMethodBeat.o(26677);
  }

  public static k ddK()
  {
    AppMethodBeat.i(26670);
    if (uNN == null)
      uNN = new k();
    k localk = uNN;
    AppMethodBeat.o(26670);
    return localk;
  }

  private void ddN()
  {
    AppMethodBeat.i(26675);
    this.miO.sendEmptyMessageDelayed(0, 500L);
    AppMethodBeat.o(26675);
  }

  public static k ddO()
  {
    return uNN;
  }

  public static void destroy()
  {
    uNN = null;
  }

  private long getDuration()
  {
    long l = 0L;
    AppMethodBeat.i(26676);
    if (this.ljM == 0L)
      AppMethodBeat.o(26676);
    while (true)
    {
      return l;
      l = bo.az(this.ljM);
      AppMethodBeat.o(26676);
    }
  }

  private void stopRecord()
  {
    AppMethodBeat.i(26673);
    if (this.uNM.equals("speex"))
      this.uNL.EB();
    while (true)
    {
      if (this.gar != null)
        this.gar.Mm();
      AppMethodBeat.o(26673);
      return;
      this.miM.EB();
    }
  }

  public final void ddL()
  {
    AppMethodBeat.i(26671);
    if (!this.miB)
      AppMethodBeat.o(26671);
    while (true)
    {
      return;
      if (!this.miC)
        bvG();
      AppMethodBeat.o(26671);
    }
  }

  public final String ddM()
  {
    AppMethodBeat.i(26672);
    String str;
    if (e.ct(this.path))
    {
      str = this.path;
      AppMethodBeat.o(26672);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(26672);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.k
 * JD-Core Version:    0.6.2
 */