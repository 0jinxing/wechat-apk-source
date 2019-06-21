package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.an;
import com.tencent.mm.plugin.fav.a.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.j;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

public final class c
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private com.tencent.mm.sdk.b.c gRa;
  private com.tencent.mm.plugin.wenote.a.b uMK;
  private com.tencent.mm.plugin.wenote.a.c uML;
  private com.tencent.mm.plugin.wenote.a.a uMM;
  public d uMN;

  static
  {
    AppMethodBeat.i(26604);
    eaA = new HashMap();
    AppMethodBeat.o(26604);
  }

  public c()
  {
    AppMethodBeat.i(26600);
    this.uMK = new com.tencent.mm.plugin.wenote.a.b();
    this.uML = new com.tencent.mm.plugin.wenote.a.c();
    this.uMM = new com.tencent.mm.plugin.wenote.a.a();
    this.uMN = null;
    this.gRa = new c.1(this);
    AppMethodBeat.o(26600);
  }

  public static c ddG()
  {
    AppMethodBeat.i(26601);
    aw.ZE();
    c localc1 = (c)bw.oJ("plugin.wenote");
    c localc2 = localc1;
    if (localc1 == null)
    {
      localc2 = new c();
      aw.ZE().a("plugin.wenote", localc2);
    }
    AppMethodBeat.o(26601);
    return localc2;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    Object localObject1 = null;
    AppMethodBeat.i(26602);
    ab.d("MicroMsg.SubCoreWNNoteMsg", "on account post reset");
    com.tencent.mm.sdk.b.a.xxA.c(this.uMK);
    ((com.tencent.mm.plugin.record.a.a)g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().a(this.uML);
    ((ae)g.M(ae.class)).getFavCdnStorage().a(this.uML);
    com.tencent.mm.sdk.b.a.xxA.c(this.uMM);
    com.tencent.mm.sdk.b.a.xxA.c(this.gRa);
    Object localObject2 = new com.tencent.mm.vfs.b(i.Yi());
    if ((!((com.tencent.mm.vfs.b)localObject2).exists()) || (!((com.tencent.mm.vfs.b)localObject2).isDirectory()))
    {
      ab.d("MicroMsg.SubCoreWNNoteMsg", "record stg dir[%s] not exsit, create it");
      ((com.tencent.mm.vfs.b)localObject2).mkdirs();
    }
    Object localObject3 = new com.tencent.mm.vfs.b(an.bvi());
    ab.i("MicroMsg.SubCoreWNNoteMsg", "copy to path %s", new Object[] { j.w(((com.tencent.mm.vfs.b)localObject3).dMD()) });
    if (com.tencent.mm.protocal.d.vxr)
    {
      ab.i("MicroMsg.SubCoreWNNoteMsg", "copyAssertTemplateFile develop version delete template");
      com.tencent.mm.vfs.e.N(j.w(((com.tencent.mm.vfs.b)localObject3).mUri), true);
      if (!((com.tencent.mm.vfs.b)localObject3).exists())
        ((com.tencent.mm.vfs.b)localObject3).mkdirs();
      localObject2 = ah.getContext().getAssets();
    }
    while (true)
    {
      int i;
      Closeable localCloseable;
      com.tencent.mm.vfs.b localb;
      try
      {
        localObject2 = ((AssetManager)localObject2).open("WNNote.zip");
        if (localObject2 == null)
        {
          ab.e("MicroMsg.SubCoreWNNoteMsg", "file inputStream not found");
          AppMethodBeat.o(26602);
          return;
          an.mgz = an.afW();
          if (paramBoolean)
          {
            i = an.afX();
            ab.i("MicroMsg.SubCoreWNNoteMsg", "copyAssertTemplateFile need update assetVersion=%d currentVersion=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(an.mgz) });
            if (an.mgz >= i)
              break;
            com.tencent.mm.vfs.e.N(j.w(((com.tencent.mm.vfs.b)localObject3).mUri), true);
            break;
          }
          if (an.mgz == 1)
          {
            ab.i("MicroMsg.SubCoreWNNoteMsg", "copyAssertTemplateFile need init template");
            com.tencent.mm.vfs.e.N(j.w(((com.tencent.mm.vfs.b)localObject3).mUri), true);
            break;
          }
          ab.i("MicroMsg.SubCoreWNNoteMsg", "copyAssertTemplateFile currentVersion=%d", new Object[] { Integer.valueOf(an.mgz) });
        }
      }
      catch (IOException localIOException1)
      {
        ab.printErrStackTrace("MicroMsg.SubCoreWNNoteMsg", localIOException1, "", new Object[0]);
        localCloseable = null;
        continue;
        localb = new com.tencent.mm.vfs.b((com.tencent.mm.vfs.b)localObject3, "WNNote.zip");
        if (localb.exists())
        {
          ab.i("MicroMsg.SubCoreWNNoteMsg", "wenote template already exists");
          bo.b(localCloseable);
          AppMethodBeat.o(26602);
          continue;
        }
      }
      try
      {
        localObject3 = com.tencent.mm.vfs.e.q(localb);
        localObject1 = localObject3;
        if (localObject1 != null)
          try
          {
            localObject3 = new byte[1024];
            while (true)
            {
              i = localCloseable.read((byte[])localObject3);
              if (i == -1)
                break;
              localObject1.write((byte[])localObject3, 0, i);
            }
          }
          catch (IOException localIOException2)
          {
            ab.printErrStackTrace("MicroMsg.SubCoreWNNoteMsg", localIOException2, "", new Object[0]);
          }
        bo.b(localCloseable);
        bo.b(localObject1);
        i = com.tencent.mm.vfs.e.iu(j.w(localb.dMD()), localb.getParent());
        if (i < 0)
          ab.e("MicroMsg.SubCoreWNNoteMsg", "unzip fail, ret = " + i + ", zipFilePath = " + j.w(localb.dMD()) + ", unzipPath = " + localb.getParent());
        AppMethodBeat.o(26602);
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.SubCoreWNNoteMsg", localFileNotFoundException, "", new Object[0]);
      }
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(26603);
    ab.d("MicroMsg.SubCoreWNNoteMsg", "on account post release");
    com.tencent.mm.sdk.b.a.xxA.d(this.uMK);
    if (((com.tencent.mm.plugin.record.a.a)g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage() != null)
      ((com.tencent.mm.plugin.record.a.a)g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b(this.uML);
    if (((ae)g.M(ae.class)).getFavCdnStorage() != null)
      ((ae)g.M(ae.class)).getFavCdnStorage().b(this.uML);
    com.tencent.mm.sdk.b.a.xxA.d(this.uMM);
    com.tencent.mm.sdk.b.a.xxA.d(this.gRa);
    AppMethodBeat.o(26603);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.c
 * JD-Core Version:    0.6.2
 */