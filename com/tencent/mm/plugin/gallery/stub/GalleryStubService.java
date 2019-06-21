package com.tencent.mm.plugin.gallery.stub;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.iu;
import com.tencent.mm.m.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public class GalleryStubService extends Service
{
  private a.a mOD;

  public GalleryStubService()
  {
    AppMethodBeat.i(21349);
    this.mOD = new a.a()
    {
      public final int ND(String paramAnonymousString)
      {
        AppMethodBeat.i(21348);
        PInt localPInt = new PInt();
        u.a(paramAnonymousString, localPInt, new PInt());
        int i = localPInt.value;
        AppMethodBeat.o(21348);
        return i;
      }

      public final int Na()
      {
        AppMethodBeat.i(21346);
        int i = b.Na();
        AppMethodBeat.o(21346);
        return i;
      }

      public final int Nb()
      {
        AppMethodBeat.i(21345);
        int i = b.Nb();
        AppMethodBeat.o(21345);
        return i;
      }

      public final int Nd()
      {
        AppMethodBeat.i(21344);
        int i = b.Nd();
        AppMethodBeat.o(21344);
        return i;
      }

      public final void a(String paramAnonymousString1, String paramAnonymousString2, boolean paramAnonymousBoolean1, int paramAnonymousInt, boolean paramAnonymousBoolean2)
      {
        AppMethodBeat.i(21342);
        if (a.xxA != null)
        {
          iu localiu = new iu();
          localiu.cDU.cDV = Boolean.valueOf(paramAnonymousBoolean1);
          localiu.cDU.imagePath = paramAnonymousString1;
          localiu.cDU.cDW = paramAnonymousInt;
          localiu.cDU.toUser = paramAnonymousString2;
          localiu.cDU.cDX = Boolean.valueOf(paramAnonymousBoolean2);
          a.xxA.m(localiu);
        }
        AppMethodBeat.o(21342);
      }

      public final void aK(int paramAnonymousInt, String paramAnonymousString)
      {
        AppMethodBeat.i(21341);
        h.pYm.X(paramAnonymousInt, paramAnonymousString);
        AppMethodBeat.o(21341);
      }

      public final void bCv()
      {
        AppMethodBeat.i(21343);
        g.BO(19);
        AppMethodBeat.o(21343);
      }

      public final boolean hC(boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(21347);
        aw.ZK();
        paramAnonymousBoolean = c.Ry().getBoolean(ac.a.xPU, paramAnonymousBoolean);
        AppMethodBeat.o(21347);
        return paramAnonymousBoolean;
      }
    };
    AppMethodBeat.o(21349);
  }

  public IBinder onBind(Intent paramIntent)
  {
    AppMethodBeat.i(21350);
    ab.d("MicroMsg.GalleryStubService", "on bind, intent[%s]", new Object[] { paramIntent });
    paramIntent = this.mOD;
    AppMethodBeat.o(21350);
    return paramIntent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.stub.GalleryStubService
 * JD-Core Version:    0.6.2
 */