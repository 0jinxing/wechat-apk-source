package com.tencent.mm.plugin.webview.model;

import android.content.ContentValues;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.g.c.co;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.bb.b;
import com.tencent.mm.sdk.platformtools.bb.c;

public final class e
  implements bb.c<Integer, Long>
{
  public static final String[] fnj;
  private static final c.a gSs;
  public final h fni;
  public final bb<Integer, Long> ulM;
  private long ulN;

  static
  {
    AppMethodBeat.i(6578);
    gSs = co.Hm();
    fnj = new String[] { j.a(gSs, "JsLogBlockList") };
    AppMethodBeat.o(6578);
  }

  public e(h paramh)
  {
    AppMethodBeat.i(6573);
    this.fni = paramh;
    this.ulM = new bb(this, g.RS().oAl.getLooper(), 100, 20);
    AppMethodBeat.o(6573);
  }

  public final void a(bb.b<Integer, Long> paramb)
  {
    AppMethodBeat.i(6576);
    switch (paramb.xBj)
    {
    default:
    case 2:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(6576);
      while (true)
      {
        return;
        this.fni.delete("JsLogBlockList", "logId=" + paramb.aCx, null);
        AppMethodBeat.o(6576);
      }
      ContentValues localContentValues = new ContentValues(2);
      localContentValues.put("logId", (Integer)paramb.aCx);
      localContentValues.put("liftTime", (Long)paramb.values);
      this.fni.replace("JsLogBlockList", "logId", localContentValues);
    }
  }

  public final boolean akm()
  {
    boolean bool = false;
    AppMethodBeat.i(6575);
    if (this.fni.inTransaction())
      AppMethodBeat.o(6575);
    while (true)
    {
      return bool;
      this.ulN = this.fni.iV(Thread.currentThread().getId());
      if (this.ulN > 0L)
      {
        bool = true;
        AppMethodBeat.o(6575);
      }
      else
      {
        AppMethodBeat.o(6575);
      }
    }
  }

  public final void akn()
  {
    AppMethodBeat.i(6577);
    if (this.ulN > 0L)
      this.fni.mB(this.ulN);
    AppMethodBeat.o(6577);
  }

  public final void cXu()
  {
    AppMethodBeat.i(6574);
    this.ulM.pl(true);
    AppMethodBeat.o(6574);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.e
 * JD-Core Version:    0.6.2
 */