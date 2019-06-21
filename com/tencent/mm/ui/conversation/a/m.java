package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.t.a;
import com.tencent.mm.modelvideo.t.a.a;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class m extends b
  implements t.a
{
  ViewGroup mContainer;
  Map<String, Long> zwD;
  Map<Long, m.b> zwE;

  public m(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(34695);
    this.zwD = new HashMap();
    this.zwE = new HashMap();
    o.all().a(this, Looper.getMainLooper());
    this.mContainer = ((ViewGroup)this.view);
    AppMethodBeat.o(34695);
  }

  private void aMk()
  {
    AppMethodBeat.i(34697);
    ab.i("MicroMsg.MassSightBanner", "call update status");
    m.a locala = new m.a((byte)0);
    locala.zwF = new WeakReference(this);
    aw.RS().aa(locala);
    AppMethodBeat.o(34697);
  }

  public final void a(t.a.a parama)
  {
    AppMethodBeat.i(34698);
    parama = parama.fileName;
    Long localLong = (Long)this.zwD.get(parama);
    if (localLong == null)
    {
      ab.d("MicroMsg.MassSightBanner", "massSendId is null, fileName %s", new Object[] { parama });
      if (bo.bc(parama, "").startsWith("DELETE_"))
        aMk();
      AppMethodBeat.o(34698);
    }
    while (true)
    {
      return;
      m.b localb = (m.b)this.zwE.get(localLong);
      if (localb == null)
      {
        ab.d("MicroMsg.MassSightBanner", "find massSendId %d, but holder is null", new Object[] { localLong });
        AppMethodBeat.o(34698);
      }
      else
      {
        s locals = u.ut(parama);
        if (locals == null)
        {
          ab.w("MicroMsg.MassSightBanner", "on nofify changed, filename %s, massSendId %d, but videoinfo is null", new Object[] { parama, localLong });
          AppMethodBeat.o(34698);
        }
        else if (locals.status == 199)
        {
          ab.i("MicroMsg.MassSightBanner", "fileName %s, massSendId %d, done", new Object[] { parama, localLong });
          aMk();
          AppMethodBeat.o(34698);
        }
        else
        {
          m.c.a(localb, locals);
          AppMethodBeat.o(34698);
        }
      }
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(34696);
    o.all().a(this);
    AppMethodBeat.o(34696);
  }

  public final int getLayoutId()
  {
    return 2130970078;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.m
 * JD-Core Version:    0.6.2
 */