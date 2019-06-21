package com.tencent.mm.plugin.record.ui.b;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.plugin.record.ui.a.b;
import com.tencent.mm.plugin.record.ui.h.a;
import com.tencent.mm.plugin.record.ui.h.a.b;
import com.tencent.mm.plugin.record.ui.h.a.c;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class a$3
  implements Runnable
{
  a$3(a parama, b paramb, ImageView paramImageView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24341);
    Object localObject = (com.tencent.mm.plugin.record.ui.a.a)this.pKY;
    final int i;
    if (((com.tencent.mm.plugin.record.ui.a.a)localObject).dataType == 0)
    {
      if (!n.g(((com.tencent.mm.plugin.record.ui.a.a)localObject).cAv, ((com.tencent.mm.plugin.record.ui.a.a)localObject).cvx))
        break label230;
      i = 2131231863;
      if (i != -1)
        break label310;
      i = 2131231262;
    }
    label302: label305: label310: 
    while (true)
    {
      com.tencent.mm.plugin.record.ui.a.a locala = (com.tencent.mm.plugin.record.ui.a.a)this.pKY;
      h.a locala1 = this.pKU.pKt;
      int j = this.pKU.pKT;
      localObject = new h.a.b();
      ((h.a.b)localObject).cAv = locala.cAv;
      ((h.a.b)localObject).cAy = false;
      ((h.a.b)localObject).maxWidth = j;
      h.a.c localc = new h.a.c();
      localc.cAv = locala.cAv;
      Bitmap localBitmap;
      if (locala.dataType == 0)
      {
        if (n.g(locala.cAv, locala.cvx))
          break label305;
        ((h.a.b)localObject).pKv = locala.cvx;
        localBitmap = locala1.a((h.a.b)localObject);
        localObject = localBitmap;
        if (localBitmap != null)
          break label302;
        localc.pKv = locala.cvx;
        localObject = locala1.a(localc);
      }
      while (true)
      {
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(24340);
            a.3.this.pKU.a(a.3.this.pKZ, this.mmt, i, a.3.this.pKY.cAv.mnd);
            AppMethodBeat.o(24340);
          }
        });
        AppMethodBeat.o(24341);
        return;
        if ((((com.tencent.mm.plugin.record.ui.a.a)localObject).dataType == 1) && (bo.isNullOrNil(((com.tencent.mm.plugin.record.ui.a.a)localObject).cAv.wfZ)))
        {
          i = 2131231863;
          break;
        }
        label230: i = -1;
        break;
        if (locala.dataType == 1)
        {
          ((h.a.b)localObject).pKv = locala.mnW.field_localId;
          ((h.a.b)localObject).cAz = false;
          localBitmap = locala1.a((h.a.b)localObject);
          localObject = localBitmap;
          if (localBitmap == null)
          {
            localc.pKv = locala.mnW.field_localId;
            localObject = locala1.a(localc);
          }
        }
        else
        {
          localObject = null;
        }
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(24342);
    String str = super.toString() + "|fillView";
    AppMethodBeat.o(24342);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.a.3
 * JD-Core Version:    0.6.2
 */