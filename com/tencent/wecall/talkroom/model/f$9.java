package com.tencent.wecall.talkroom.model;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.b.d;
import com.tencent.pb.common.c.c;

final class f$9
  implements Runnable
{
  f$9(f paramf)
  {
  }

  public final void run()
  {
    Object localObject1 = null;
    AppMethodBeat.i(127878);
    int i = f.a(this.AKd);
    Object localObject2;
    if (f.t(this.AKd) == null)
    {
      localObject2 = null;
      c.d("TalkRoomService", new Object[] { "beginSenceCircle state: ", Integer.valueOf(i), " mCircleScene: ", localObject2, " mIsAck: ", Boolean.valueOf(f.u(this.AKd)) });
      if (f.t(this.AKd) != null)
        break label140;
      f.w(this.AKd).removeCallbacks(f.v(this.AKd));
      c.w("TalkRoomService", new Object[] { "beginSenceCircle removeCallbacks" });
      AppMethodBeat.o(127878);
    }
    while (true)
    {
      return;
      localObject2 = Integer.valueOf(f.t(this.AKd).getType());
      break;
      label140: if (!this.AKd.cIJ())
      {
        f.w(this.AKd).removeCallbacks(f.v(this.AKd));
        c.w("TalkRoomService", new Object[] { "beginSenceCircle removeCallbacks" });
        AppMethodBeat.o(127878);
      }
      else
      {
        localObject2 = localObject1;
        if (f.t(this.AKd) != null)
        {
          localObject2 = localObject1;
          if (f.t(this.AKd).getType() == 202)
          {
            localObject2 = localObject1;
            if (f.a(this.AKd) == 3)
            {
              com.tencent.wecall.talkroom.a.e locale = (com.tencent.wecall.talkroom.a.e)f.t(this.AKd);
              localObject2 = localObject1;
              if (f.a(this.AKd, locale.neq, locale.nCF, locale.sZg, f.Sp(locale.ALs)))
              {
                localObject2 = new com.tencent.wecall.talkroom.a.e(locale);
                c.w("TalkRoomService", new Object[] { "beginSenceCircle enter" });
              }
            }
          }
        }
        if (localObject2 != null)
        {
          com.tencent.pb.common.b.e.dPu().a((d)localObject2);
          AppMethodBeat.o(127878);
        }
        else
        {
          f.w(this.AKd).removeCallbacks(f.v(this.AKd));
          c.w("TalkRoomService", new Object[] { "beginSenceCircle removeCallbacks" });
          AppMethodBeat.o(127878);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.f.9
 * JD-Core Version:    0.6.2
 */