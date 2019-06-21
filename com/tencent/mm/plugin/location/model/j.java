package com.tencent.mm.plugin.location.model;

import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.location.a;
import com.tencent.mm.pluginsdk.location.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

public final class j
  implements a
{
  int h;
  HashMap<Long, WeakReference<ImageView>> nJU;
  HashMap<Long, bi.b> nJV;
  HashMap<Long, WeakReference<ProgressBar>> nJW;
  HashMap<Long, WeakReference<ImageView>> nJX;
  HashMap<bi.b, bi> nJY;
  HashMap<Long, Integer> nJZ;
  HashSet<Long> nKa;
  int w;

  public j()
  {
    AppMethodBeat.i(113326);
    this.nJU = new HashMap();
    this.nJV = new HashMap();
    this.nJW = new HashMap();
    this.nJX = new HashMap();
    this.nJY = new HashMap();
    this.nJZ = new HashMap();
    this.nKa = new HashSet();
    this.w = 300;
    this.h = 300;
    start();
    AppMethodBeat.o(113326);
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(113329);
    if (paramb == null)
      AppMethodBeat.o(113329);
    while (true)
    {
      return;
      if (!this.nJV.containsKey(Long.valueOf(paramb.itemId)))
      {
        AppMethodBeat.o(113329);
      }
      else
      {
        paramb = (bi.b)this.nJV.get(Long.valueOf(paramb.itemId));
        paramb = (bi)this.nJY.remove(paramb);
        if (paramb == null)
        {
          AppMethodBeat.o(113329);
        }
        else
        {
          this.nJU.get(Long.valueOf(paramb.field_msgId));
          if ((paramb != null) && ((paramb.dJB < 0) || (paramb.dJB > 5)))
          {
            paramb.id(0);
            paramb.id(paramb.dJB + 1);
            if (com.tencent.mm.kernel.g.RK())
            {
              ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(paramb.field_msgId, paramb);
              ab.i("MicroMsg.StaticMapMsgLogic", "on error count %d", new Object[] { Integer.valueOf(paramb.dJB) });
            }
          }
          AppMethodBeat.o(113329);
        }
      }
    }
  }

  public final void a(String paramString, b paramb)
  {
    AppMethodBeat.i(113328);
    if (paramb == null)
      AppMethodBeat.o(113328);
    WeakReference localWeakReference;
    while (true)
    {
      return;
      if (!this.nJV.containsKey(Long.valueOf(paramb.itemId)))
      {
        AppMethodBeat.o(113328);
      }
      else
      {
        paramb = (bi.b)this.nJV.get(Long.valueOf(paramb.itemId));
        paramb = (bi)this.nJY.remove(paramb);
        if (paramb == null)
        {
          AppMethodBeat.o(113328);
        }
        else
        {
          localWeakReference = (WeakReference)this.nJU.get(Long.valueOf(paramb.field_msgId));
          if ((localWeakReference == null) || (localWeakReference.get() == null))
          {
            AppMethodBeat.o(113328);
          }
          else
          {
            if (this.nJZ.containsKey(Long.valueOf(paramb.field_msgId)))
              break;
            AppMethodBeat.o(113328);
          }
        }
      }
    }
    int i = ((Integer)this.nJZ.remove(Long.valueOf(paramb.field_msgId))).intValue();
    if (paramb.field_isSend == 0);
    for (boolean bool = true; ; bool = false)
    {
      ((ImageView)localWeakReference.get()).setImageBitmap(o.ahl().a(paramb.field_msgId, paramString, i, this.w, this.h, bool));
      paramString = (WeakReference)this.nJW.remove(Long.valueOf(paramb.field_msgId));
      if ((paramString != null) && (paramString.get() != null))
        ((ProgressBar)paramString.get()).setVisibility(8);
      paramString = (WeakReference)this.nJX.remove(Long.valueOf(paramb.field_msgId));
      if ((paramString != null) && (paramString.get() != null))
        ((ImageView)paramString.get()).setVisibility(0);
      AppMethodBeat.o(113328);
      break;
    }
  }

  final void start()
  {
    AppMethodBeat.i(113327);
    l.bJw().a(this);
    AppMethodBeat.o(113327);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.j
 * JD-Core Version:    0.6.2
 */