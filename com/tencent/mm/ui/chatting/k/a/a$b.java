package com.tencent.mm.ui.chatting.k.a;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.Spannable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.b.b.b;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.e.n;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.Iterator;

final class a$b
  implements Runnable
{
  private bi csG;
  private int scene;
  private CharSequence text;

  a$b(CharSequence paramCharSequence, bi parambi, int paramInt)
  {
    this.text = paramCharSequence;
    this.csG = parambi;
    this.scene = paramInt;
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(32678);
    if ((this.text instanceof Spannable))
      try
      {
        Spannable localSpannable = (Spannable)this.text;
        System.nanoTime();
        Object[] arrayOfObject = localSpannable.getSpans(0, localSpannable.length(), Object.class);
        Object localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>(1);
        if ((arrayOfObject != null) && (arrayOfObject.length != 0))
        {
          int j = arrayOfObject.length;
          while (true)
          {
            localObject2 = localObject1;
            if (i >= j)
              break;
            Object localObject3 = arrayOfObject[i];
            if ((localObject3 != null) && (com.tencent.mm.plugin.normsg.a.b.oTO.c(localObject3, n.class)))
            {
              localObject2 = new com/tencent/mm/ui/chatting/k/a/a$b$a$a;
              ((a.b.a.a)localObject2).<init>((byte)0);
              ((ArrayList)localObject1).add(((a.b.b)localObject2).a(localObject3, localSpannable));
            }
            i++;
          }
        }
        Object localObject2 = null;
        if ((localObject2 == null) || (((ArrayList)localObject2).size() == 0))
          break label404;
        this.csG = ((j)g.K(j.class)).bOr().jf(this.csG.field_msgId);
        if ((this.csG != null) && (!bo.isNullOrNil(this.csG.field_talker)))
        {
          this.csG.hY(this.csG.field_flag | 0x10);
          ((j)g.K(j.class)).bOr().a(this.csG.field_msgId, this.csG);
        }
        aw.ZK().Ym().aaV();
        aw.ZK().Ym().b(b.b.foi);
        localObject1 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = ((a.b.c)((Iterator)localObject1).next()).extInfo;
          com.tencent.mm.plugin.report.service.h.pYm.e(14237, new Object[] { "msg", Long.valueOf(this.csG.field_msgId), Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, Build.VERSION.INCREMENTAL, Build.DISPLAY, Integer.valueOf(this.scene), localObject2 });
          com.tencent.mm.plugin.report.service.h.pYm.a(587L, 0L, 1L, false);
        }
      }
      catch (Exception localException)
      {
      }
    else
      AppMethodBeat.o(32678);
    while (true)
    {
      return;
      label404: AppMethodBeat.o(32678);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.k.a.a.b
 * JD-Core Version:    0.6.2
 */