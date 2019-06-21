package com.tencent.mm.ai;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.l.a;
import com.tencent.mm.network.q;
import com.tencent.mm.network.r;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

public final class s extends l.a
{
  private final m cwn;
  private boolean eVT;
  private final long ftT;
  private q ftU;
  private k ftV;
  private boolean ftW;
  Runnable ftX;
  private final e ftf;
  private final f ftj;
  final ak handler;

  public s(q paramq, k paramk, m paramm, f paramf, e parame)
  {
    AppMethodBeat.i(58261);
    this.ftT = 330000L;
    this.eVT = false;
    this.ftW = false;
    this.ftX = new Runnable()
    {
      public final void run()
      {
        int i = 0;
        int j = 0;
        AppMethodBeat.i(58259);
        int k;
        if ((s.a(s.this)) || (s.b(s.this)))
        {
          if (s.c(s.this) == null)
          {
            k = 0;
            if (s.c(s.this) != null)
              break label96;
          }
          while (true)
          {
            ab.e("MicroMsg.RemoteOnGYNetEnd", "time exceed But removeCallbacks failed hash:%d type:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(j) });
            AppMethodBeat.o(58259);
            return;
            k = s.c(s.this).hashCode();
            break;
            label96: j = s.c(s.this).getType();
          }
        }
        final boolean bool1 = s.a(s.this);
        final boolean bool2 = s.b(s.this);
        if (s.c(s.this) == null)
        {
          k = 0;
          label140: if (s.c(s.this) != null)
            break label249;
        }
        label249: for (j = i; ; j = s.c(s.this).getType())
        {
          ab.w("MicroMsg.RemoteOnGYNetEnd", "time exceed, force to callback hash:%d type:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(j) });
          s.d(s.this);
          d.post(new Runnable()
          {
            public final void run()
            {
              int i = 0;
              AppMethodBeat.i(58258);
              s.e(s.this).qt("push process's network haven't callback in 5.5min!!!! cancelStatus:" + bool1 + " hasCallbackStatus:" + bool2);
              int j;
              if (s.c(s.this) == null)
              {
                j = 0;
                if (s.c(s.this) != null)
                  break label129;
              }
              while (true)
              {
                ab.w("MicroMsg.RemoteOnGYNetEnd", "time exceed, force to callback . kill push fin. hash:%d type:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
                AppMethodBeat.o(58258);
                return;
                j = s.c(s.this).hashCode();
                break;
                label129: i = s.c(s.this).getType();
              }
            }
          }
          , "RemoteOnGYNetEnd_killPush");
          s.g(s.this).a(-1, 3, -1, "time exceed, force to callback", s.f(s.this), null);
          AppMethodBeat.o(58259);
          break;
          k = s.c(s.this).hashCode();
          break label140;
        }
      }
    };
    this.ftU = paramq;
    this.ftV = paramk;
    this.cwn = paramm;
    this.ftj = paramf;
    if (Looper.myLooper() == null);
    for (paramq = new ak(Looper.getMainLooper()); ; paramq = new ak())
    {
      this.handler = paramq;
      this.ftf = parame;
      AppMethodBeat.o(58261);
      return;
    }
  }

  public final void a(final int paramInt1, final int paramInt2, final int paramInt3, final String paramString, r paramr, final byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58263);
    ab.i("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd netId:%d, errType:%d, errCode:%d, isCancel:%b, hash[%d,%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Boolean.valueOf(this.eVT), Integer.valueOf(this.cwn.hashCode()), Integer.valueOf(this.ftU.hashCode()) });
    this.cwn.fth = -1;
    if (this.eVT)
      AppMethodBeat.o(58263);
    while (true)
    {
      return;
      if (!this.ftW)
      {
        this.ftW = true;
        this.handler.removeCallbacks(this.ftX);
        this.handler.post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(58260);
            if (s.a(s.this))
            {
              ab.w("MicroMsg.RemoteOnGYNetEnd", "netId:%d has been canceled", new Object[] { Integer.valueOf(paramInt1) });
              AppMethodBeat.o(58260);
            }
            while (true)
            {
              return;
              int i = paramInt2;
              int j = paramInt3;
              int k = i;
              int m = j;
              if (10016 == ae.giz)
              {
                k = i;
                m = j;
                if (!bo.isNullOrNil(ae.giB))
                {
                  ab.i("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd DK TEST SET : %s ", new Object[] { ae.giB });
                  String[] arrayOfString = ae.giB.split(",");
                  k = i;
                  m = j;
                  if (arrayOfString != null)
                  {
                    k = i;
                    m = j;
                    if (arrayOfString.length == 3)
                    {
                      k = i;
                      m = j;
                      if (bo.getInt(arrayOfString[0], -1) == s.c(s.this).getType())
                      {
                        j = bo.getInt(arrayOfString[1], 0);
                        m = bo.getInt(arrayOfString[2], 0);
                        k = j;
                        if (j == 999)
                        {
                          ab.w("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd DK TEST SET syncservice : %s  NOT  CALLBACK !!!", new Object[] { ae.giB });
                          AppMethodBeat.o(58260);
                        }
                      }
                    }
                  }
                }
              }
              else
              {
                ab.i("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd after post to worker netId:%d, errType:%d, errCode:%d, isCancel:%b, hashcode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(k), Integer.valueOf(m), Boolean.valueOf(s.a(s.this)), Integer.valueOf(s.c(s.this).hashCode()) });
                s.g(s.this).a(paramInt1, k, m, paramString, s.f(s.this), paramArrayOfByte);
                if ((s.c(s.this).acM()) && (!s.c(s.this).ftk))
                {
                  ab.e("MicroMsg.RemoteOnGYNetEnd", "the netscene hasn't call callback to onSceneEnd, type:%d", new Object[] { Integer.valueOf(s.c(s.this).getType()) });
                  ab.dot();
                }
                AppMethodBeat.o(58260);
              }
            }
          }
        });
        AppMethodBeat.o(58263);
      }
      else
      {
        AppMethodBeat.o(58263);
      }
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(58262);
    this.eVT = true;
    this.handler.removeCallbacks(this.ftX);
    AppMethodBeat.o(58262);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.s
 * JD-Core Version:    0.6.2
 */