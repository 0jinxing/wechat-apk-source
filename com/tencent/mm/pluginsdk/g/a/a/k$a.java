package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.c.f.d;
import com.tencent.mm.pluginsdk.g.a.c.q;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class k$a extends f.d<a>
{
  protected k$a(a parama)
  {
    super(parama);
  }

  public final void run()
  {
    AppMethodBeat.i(79545);
    ab.i("MicroMsg.ResDownloader.CheckResUpdate.DecryptTask", "%s: decryptTask, entered", new Object[] { ((a)awh()).vdC });
    Object localObject1 = (a)awh();
    int i = ((a)localObject1).cut;
    int j = ((a)localObject1).cuu;
    int k = ((a)localObject1).cuv;
    while (true)
    {
      Object localObject4;
      try
      {
        localObject4 = (a)awh();
        localObject1 = new com/tencent/mm/pluginsdk/g/a/a/l;
        ((l)localObject1).<init>(((a)localObject4).cut, ((a)localObject4).cuu, ((a)localObject4).filePath, ((a)localObject4).vdD, ((a)localObject4).vdE, ((a)localObject4).vdF, ((a)localObject4).vdG, ((a)localObject4).vdJ, ((a)localObject4).cuw, ((a)localObject4).vdH, ((a)localObject4).vdI, ((a)localObject4).vdL, ((a)localObject4).vdK, ((a)localObject4).url, ((a)localObject4).vdM, ((a)localObject4).vdN, ((a)localObject4).cuv);
        if (((l)localObject1).vei)
        {
          ab.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkFileExists(), do fileDecompress", new Object[] { ((l)localObject1).vdC });
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((l)localObject1).veM = (((l)localObject1).filePath + ".decompressed");
          ((l)localObject1).state = 32;
          if (((l)localObject1).din() != null)
          {
            ((l)localObject1).state = 16;
            ab.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkFileExists(), file already valid", new Object[] { ((l)localObject1).vdC });
          }
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("%s: verify(), file_state ");
          ab.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", ((l)localObject1).dip(), new Object[] { ((l)localObject1).vdC });
          if (16 == ((l)localObject1).state)
          {
            localObject1 = ((l)localObject1).dil().dim().din();
            if (bo.isNullOrNil((String)localObject1))
              break label842;
            b.c.dif().e(i, j, (String)localObject1, k);
          }
        }
        else
        {
          if (((l)localObject1).vej)
          {
            ab.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkFileExists(), do fileDecrypt", new Object[] { ((l)localObject1).vdC });
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((l)localObject1).veM = (((l)localObject1).filePath + ".decrypted");
            ((l)localObject1).state = 32;
            if (((l)localObject1).din() != null)
            {
              ((l)localObject1).state = 16;
              ab.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkFileExists(), file already valid", new Object[] { ((l)localObject1).vdC });
            }
            continue;
          }
          ab.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkFileExists(), just check sum", new Object[] { ((l)localObject1).vdC });
          ((l)localObject1).veM = ((l)localObject1).filePath;
          ((l)localObject1).state = 32;
          if (((l)localObject1).din() != null)
          {
            ((l)localObject1).state = 16;
            ab.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkFileExists(), file already valid", new Object[] { ((l)localObject1).vdC });
          }
          continue;
        }
        if (((l)localObject1).vej)
        {
          ((l)localObject1).veM = ((l)localObject1).filePath;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((l)localObject1).veN = (((l)localObject1).filePath + ".decrypted");
          ((l)localObject1).state = 1;
          continue;
        }
      }
      finally
      {
        if (Thread.interrupted())
        {
          ab.i("MicroMsg.ResDownloader.CheckResUpdate.DecryptTask", "%s: decrypting and interrupted", new Object[] { ((a)awh()).vdC });
          com.tencent.mm.pluginsdk.g.a.d.a.ajj(((a)awh()).filePath);
          com.tencent.mm.pluginsdk.g.a.d.a.ajj(((a)awh()).filePath + ".decrypted");
          com.tencent.mm.pluginsdk.g.a.d.a.ajj(((a)awh()).filePath + ".decompressed");
        }
        AppMethodBeat.o(79545);
      }
      if (localObject2.vei)
      {
        localObject2.veM = localObject2.filePath;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject2.veN = (localObject2.filePath + ".decompressed");
        localObject2.state = 2;
      }
      else
      {
        localObject2.veM = localObject2.filePath;
        localObject2.state = 4;
        continue;
        label842: Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        com.tencent.mm.pluginsdk.g.a.d.a.ajj(((a)awh()).filePath + ".decrypted");
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        com.tencent.mm.pluginsdk.g.a.d.a.ajj(((a)awh()).filePath + ".decompressed");
        if (Thread.interrupted())
        {
          ab.i("MicroMsg.ResDownloader.CheckResUpdate.DecryptTask", "%s: decrypting and interrupted", new Object[] { ((a)awh()).vdC });
          com.tencent.mm.pluginsdk.g.a.d.a.ajj(((a)awh()).filePath);
          com.tencent.mm.pluginsdk.g.a.d.a.ajj(((a)awh()).filePath + ".decrypted");
          com.tencent.mm.pluginsdk.g.a.d.a.ajj(((a)awh()).filePath + ".decompressed");
        }
        localObject3 = (a)awh();
        q.a.diy().handler.post(new k.a.1(this, (a)localObject3));
        AppMethodBeat.o(79545);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.k.a
 * JD-Core Version:    0.6.2
 */