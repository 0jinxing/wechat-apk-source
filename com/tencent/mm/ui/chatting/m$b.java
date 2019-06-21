package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.c;
import com.tencent.mm.aj.a.d;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.widget.snackbar.b;
import java.util.Iterator;
import java.util.List;

final class m$b
  implements az.a
{
  private com.tencent.mm.ui.chatting.d.a cgL;
  private Context context;
  private String fuO;
  private long jMj;
  private boolean mgP;
  private m.a yIZ;

  public m$b(com.tencent.mm.ui.chatting.d.a parama, Context paramContext, String paramString, long paramLong, m.a parama1)
  {
    AppMethodBeat.i(30606);
    this.cgL = parama;
    this.context = paramContext;
    this.fuO = paramString;
    this.jMj = paramLong;
    this.yIZ = parama1;
    this.mgP = f.kq(paramString);
    AppMethodBeat.o(30606);
  }

  private void a(Context paramContext, bi parambi, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(30608);
    if (parambi.isText())
    {
      j.a(paramContext, paramString, parambi, paramBoolean);
      AppMethodBeat.o(30608);
    }
    while (true)
    {
      return;
      if (parambi.drE())
      {
        j.b(paramContext, paramString, parambi);
        AppMethodBeat.o(30608);
      }
      else if ((parambi.bws()) && (!this.mgP))
      {
        j.c(paramContext, paramString, parambi);
        AppMethodBeat.o(30608);
      }
      else if (parambi.bAC())
      {
        j.c(paramContext, paramString, parambi, paramBoolean);
        AppMethodBeat.o(30608);
      }
      else if (((parambi.dtx()) || (parambi.dty())) && (!this.mgP))
      {
        if (!j.av(parambi))
        {
          j.a(paramContext, paramString, parambi);
          AppMethodBeat.o(30608);
        }
      }
      else if (parambi.bAA())
      {
        if ((this.mgP) && (!j.aD(parambi)))
          AppMethodBeat.o(30608);
        else if (j.aE(parambi))
          AppMethodBeat.o(30608);
        else if (parambi.getType() == 318767153)
          AppMethodBeat.o(30608);
        else if (j.aI(parambi))
          AppMethodBeat.o(30608);
        else if (!j.ax(parambi))
          j.b(paramContext, paramString, parambi, paramBoolean);
      }
      else
      {
        AppMethodBeat.o(30608);
      }
    }
  }

  private void dCe()
  {
    AppMethodBeat.i(30609);
    Iterator localIterator = this.yIZ.yIP.iterator();
    while (localIterator.hasNext())
    {
      bi localbi = (bi)localIterator.next();
      a(this.context, localbi, this.yIZ.yFW, this.fuO);
    }
    AppMethodBeat.o(30609);
  }

  private void dCf()
  {
    AppMethodBeat.i(30610);
    m.bR(this.context, this.fuO);
    nt localnt = new nt();
    localnt.cJY.type = 5;
    localnt.cJY.cKe = this.yIZ.yIP;
    localnt.cJY.toUser = this.fuO;
    localnt.cJY.cKf = this.yIZ.cKf;
    localnt.cJY.context = this.context;
    localnt.cJY.cJy = this.yIZ.cJy;
    localnt.cJY.cKh = this.yIZ.yIQ;
    com.tencent.mm.sdk.b.a.xxA.m(localnt);
    AppMethodBeat.o(30610);
  }

  public final boolean acf()
  {
    AppMethodBeat.i(30607);
    if (this.mgP)
    {
      c localc = z.aeT().aK(this.jMj);
      synchronized (e.fxC)
      {
        String str = e.aae();
        e.d(localc);
        if (this.yIZ.yIY)
        {
          dCe();
          e.rx(str);
          AppMethodBeat.o(30607);
          return true;
        }
        dCf();
      }
    }
    if (this.yIZ.yIY)
      dCe();
    while (true)
    {
      AppMethodBeat.o(30607);
      break;
      dCf();
    }
  }

  public final boolean acg()
  {
    AppMethodBeat.i(30611);
    if (m.dCd() != null)
      m.dCd().dismiss();
    b.a(this.context, this.cgL.findViewById(2131825953), this.context.getString(2131299884), null);
    AppMethodBeat.o(30611);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.m.b
 * JD-Core Version:    0.6.2
 */