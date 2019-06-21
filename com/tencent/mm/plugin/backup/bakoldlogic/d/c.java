package com.tencent.mm.plugin.backup.bakoldlogic.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.b;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bs;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.storage.z;

public final class c
{
  String eJM;
  public com.tencent.mm.cd.h eJN = null;
  bs jBd;
  com.tencent.mm.cd.g jBe = null;
  Boolean jBf = null;
  z jym;
  bd jyn;
  com.tencent.mm.plugin.messenger.foundation.a.a.h jyo;
  be jyp;
  com.tencent.mm.at.g jyq;
  d jyr;
  public com.tencent.mm.plugin.messenger.foundation.a.a.k jys;
  t jyt;
  ag jyu;
  public com.tencent.mm.pluginsdk.model.app.k jyv;
  public i jyw;
  com.tencent.mm.pluginsdk.model.app.c jyx;
  public int uin = 0;

  public final z Ry()
  {
    AppMethodBeat.i(18025);
    if (this.uin == 0)
    {
      localObject = new b();
      AppMethodBeat.o(18025);
      throw ((Throwable)localObject);
    }
    Object localObject = this.jym;
    AppMethodBeat.o(18025);
    return localObject;
  }

  public final bd XM()
  {
    AppMethodBeat.i(18026);
    if (this.uin == 0)
    {
      localObject = new b();
      AppMethodBeat.o(18026);
      throw ((Throwable)localObject);
    }
    Object localObject = this.jyn;
    AppMethodBeat.o(18026);
    return localObject;
  }

  public final com.tencent.mm.plugin.messenger.foundation.a.a.h XO()
  {
    AppMethodBeat.i(18027);
    if (this.uin == 0)
    {
      localObject = new b();
      AppMethodBeat.o(18027);
      throw ((Throwable)localObject);
    }
    Object localObject = this.jyo;
    AppMethodBeat.o(18027);
    return localObject;
  }

  public final be XR()
  {
    AppMethodBeat.i(18028);
    if (this.uin == 0)
    {
      localObject = new b();
      AppMethodBeat.o(18028);
      throw ((Throwable)localObject);
    }
    Object localObject = this.jyp;
    AppMethodBeat.o(18028);
    return localObject;
  }

  public final ag XV()
  {
    AppMethodBeat.i(18031);
    if (this.uin == 0)
    {
      localObject = new b();
      AppMethodBeat.o(18031);
      throw ((Throwable)localObject);
    }
    Object localObject = this.jyu;
    AppMethodBeat.o(18031);
    return localObject;
  }

  public final String XY()
  {
    AppMethodBeat.i(18034);
    if (this.uin == 0)
    {
      localObject = new b();
      AppMethodBeat.o(18034);
      throw ((Throwable)localObject);
    }
    Object localObject = this.eJM + "voice2/";
    AppMethodBeat.o(18034);
    return localObject;
  }

  public final String Yb()
  {
    AppMethodBeat.i(18035);
    if (this.uin == 0)
    {
      localObject = new b();
      AppMethodBeat.o(18035);
      throw ((Throwable)localObject);
    }
    Object localObject = this.eJM + "emoji/";
    AppMethodBeat.o(18035);
    return localObject;
  }

  public final com.tencent.mm.at.g aUo()
  {
    AppMethodBeat.i(18029);
    if (this.uin == 0)
    {
      localObject = new b();
      AppMethodBeat.o(18029);
      throw ((Throwable)localObject);
    }
    Object localObject = this.jyq;
    AppMethodBeat.o(18029);
    return localObject;
  }

  public final d aUp()
  {
    AppMethodBeat.i(18030);
    if (this.uin == 0)
    {
      localObject = new b();
      AppMethodBeat.o(18030);
      throw ((Throwable)localObject);
    }
    Object localObject = this.jyr;
    AppMethodBeat.o(18030);
    return localObject;
  }

  public final com.tencent.mm.pluginsdk.model.app.c aUq()
  {
    AppMethodBeat.i(18036);
    if (this.uin == 0)
    {
      localObject = new b();
      AppMethodBeat.o(18036);
      throw ((Throwable)localObject);
    }
    Object localObject = this.jyx;
    AppMethodBeat.o(18036);
    return localObject;
  }

  public final void aVf()
  {
    AppMethodBeat.i(18037);
    ab.i("MicroMsg.BakOldTempStorage", "closeDB isTempDb:%s datadb:%s memdb:%s %s", new Object[] { this.jBf, this.eJN, this.jBe, bo.dpG() });
    if ((this.jBf != null) && (!this.jBf.booleanValue()))
    {
      this.jBf = null;
      AppMethodBeat.o(18037);
    }
    while (true)
    {
      return;
      if (this.eJN != null)
      {
        ab.i("MicroMsg.BakOldTempStorage", "closeDB true DB[%s]!!! ", new Object[] { this.eJN });
        this.eJN.closeDB();
        this.eJN = null;
      }
      if (this.jBe != null)
      {
        this.jBe.closeDB();
        this.jBe = null;
      }
      this.jBf = null;
      AppMethodBeat.o(18037);
    }
  }

  public final t all()
  {
    AppMethodBeat.i(18032);
    if (this.uin == 0)
    {
      localObject = new b();
      AppMethodBeat.o(18032);
      throw ((Throwable)localObject);
    }
    Object localObject = this.jyt;
    AppMethodBeat.o(18032);
    return localObject;
  }

  public final String amg()
  {
    AppMethodBeat.i(18033);
    if (this.uin == 0)
    {
      localObject = new b();
      AppMethodBeat.o(18033);
      throw ((Throwable)localObject);
    }
    Object localObject = this.eJM + "voice/";
    AppMethodBeat.o(18033);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.d.c
 * JD-Core Version:    0.6.2
 */