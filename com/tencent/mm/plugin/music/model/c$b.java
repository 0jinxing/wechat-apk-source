package com.tencent.mm.plugin.music.model;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.model.e.a;
import com.tencent.mm.plugin.music.model.e.b;
import com.tencent.mm.plugin.sns.b.f;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.ae;

final class c$b
  implements Runnable
{
  a oMw;

  c$b(c paramc, a parama)
  {
    this.oMw = parama;
  }

  public final void run()
  {
    AppMethodBeat.i(104878);
    Object localObject = new bau();
    ((bau)localObject).Id = this.oMw.field_songMediaId;
    ((bau)localObject).wEH = this.oMw.field_songAlbumUrl;
    ((bau)localObject).wEI = this.oMw.field_songAlbumType;
    ((bau)localObject).Url = ((bau)localObject).wEH;
    localObject = n.qFx.b((bau)localObject);
    if (localObject != null)
    {
      localObject = d.e((Bitmap)localObject, 10);
      this.oMt.a(this.oMw, (Bitmap)localObject);
      localObject = ae.ao((Bitmap)localObject);
      if (!this.oMw.w((int[])localObject))
        this.oMw = e.bUk().ac(this.oMw.field_musicId, localObject[0], localObject[1]);
      if ((this.oMt.oMq != null) && (this.oMw != null))
        this.oMt.oMq.a(this.oMw, (int[])localObject);
    }
    AppMethodBeat.o(104878);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.c.b
 * JD-Core Version:    0.6.2
 */