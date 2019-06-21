package com.tencent.mm.ui.chatting.c;

import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.AbsListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.al.f;
import com.tencent.mm.at.d;
import com.tencent.mm.at.d.a;
import com.tencent.mm.at.e;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.me;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.q;
import com.tencent.mm.ui.chatting.gallery.g.a;
import java.util.HashSet;
import java.util.LinkedList;

@com.tencent.mm.ui.chatting.c.a.a(dFp=q.class)
public class s extends a
  implements d.a, x.a, q
{
  private com.tencent.mm.sdk.b.c kvj;
  private com.tencent.mm.sdk.platformtools.ap yQf;
  private com.tencent.mm.ui.chatting.gallery.g yQg;

  public s()
  {
    AppMethodBeat.i(31458);
    this.kvj = new s.1(this);
    this.yQf = new com.tencent.mm.sdk.platformtools.ap(new s.2(this), false);
    this.yQg = g.a.yVD;
    AppMethodBeat.o(31458);
  }

  private void djt()
  {
    AppMethodBeat.i(31461);
    stopTimer();
    com.tencent.mm.sdk.b.a.xxA.d(this.kvj);
    com.tencent.mm.ui.chatting.gallery.g localg = this.yQg;
    localg.mQM.clear();
    localg.bCH();
    AppMethodBeat.o(31461);
  }

  private void stopTimer()
  {
    AppMethodBeat.i(31460);
    if (aw.RK())
      o.ahm().a(this);
    this.yQf.stopTimer();
    AppMethodBeat.o(31460);
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject)
  {
    AppMethodBeat.i(31463);
    ((com.tencent.mm.plugin.comm.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.comm.a.b.class)).b(paramLong2, false, true);
    AppMethodBeat.o(31463);
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, m paramm)
  {
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, m paramm)
  {
    AppMethodBeat.i(31462);
    if (!com.tencent.mm.plugin.priority.a.a.a.a.bZv())
      o.ahm().a(this);
    boolean bool;
    if ((paramInt3 == 0) && (paramInt4 == 0))
    {
      bool = true;
      ((com.tencent.mm.plugin.comm.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.comm.a.b.class)).b(paramLong2, bool, false);
      if (!com.tencent.mm.plugin.priority.a.a.a.bZu())
        break label117;
      o.ahn();
      com.tencent.mm.at.b.a(paramLong1, paramLong2, bool);
    }
    while (true)
    {
      aw.ZK();
      paramObject = com.tencent.mm.model.c.XO().jf(paramLong2);
      ((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).a(paramLong2, paramObject, bool);
      AppMethodBeat.o(31462);
      return;
      bool = false;
      break;
      label117: ((com.tencent.mm.plugin.priority.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.priority.a.a.class)).getC2CImgAutoDownloader().b(paramLong1, paramLong2, bool);
    }
  }

  public final void dDh()
  {
    AppMethodBeat.i(31466);
    super.dDh();
    djt();
    AppMethodBeat.o(31466);
  }

  public final void dxA()
  {
    AppMethodBeat.i(31468);
    me localme = new me();
    localme.cHX.cHY = true;
    localme.cHX.talker = this.cgL.sRl.field_username;
    com.tencent.mm.sdk.b.a.xxA.a(localme, Looper.getMainLooper());
    x.b(this);
    AppMethodBeat.o(31468);
  }

  public final void dxB()
  {
    AppMethodBeat.i(31469);
    me localme = new me();
    localme.cHX.cHY = false;
    localme.cHX.talker = this.cgL.sRl.field_username;
    com.tencent.mm.sdk.b.a.xxA.a(localme, Looper.getMainLooper());
    x.c(this);
    stopTimer();
    AppMethodBeat.o(31469);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31470);
    djt();
    AppMethodBeat.o(31470);
  }

  public final void dxy()
  {
  }

  public final void dxz()
  {
    AppMethodBeat.i(31467);
    com.tencent.mm.sdk.b.a.xxA.c(this.kvj);
    AppMethodBeat.o(31467);
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(31464);
    if ((bo.isNullOrNil(paramString)) || (paramBitmap == null) || (this.cgL == null))
      AppMethodBeat.o(31464);
    while (true)
    {
      return;
      com.tencent.mm.ui.chatting.d.a.dFz().post(new s.3(this));
      AppMethodBeat.o(31464);
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(31465);
    super.onScrollStateChanged(paramAbsListView, paramInt);
    o.ahp().cm(paramInt);
    if (paramInt == 0)
    {
      startTimer();
      AppMethodBeat.o(31465);
    }
    while (true)
    {
      return;
      if (paramInt == 2)
        stopTimer();
      AppMethodBeat.o(31465);
    }
  }

  public final void startTimer()
  {
    AppMethodBeat.i(31459);
    this.yQf.stopTimer();
    this.yQf.ae(1000L, 1000L);
    AppMethodBeat.o(31459);
  }

  final class a
    implements Runnable
  {
    private bi cKd;
    private int i;
    private e pza;

    a(bi parame, e paramInt, int arg4)
    {
      this.cKd = parame;
      this.pza = paramInt;
      int j;
      this.i = j;
    }

    public final void run()
    {
      AppMethodBeat.i(31457);
      f.afx().fyQ.add("image_" + this.cKd.field_msgId);
      o.ahm().a(this.pza.fDy, this.cKd.field_msgId, 0, Integer.valueOf(this.i), 2130838182, s.this, -1, true);
      AppMethodBeat.o(31457);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.s
 * JD-Core Version:    0.6.2
 */