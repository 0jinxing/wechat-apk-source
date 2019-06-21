package com.tencent.mm.bf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.g.a;
import com.tencent.mm.audio.d.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class c
  implements az.a
{
  public BlockingQueue<g.a> fQA;
  public String mFileName;

  public c()
  {
    AppMethodBeat.i(116541);
    this.mFileName = null;
    this.fQA = new ArrayBlockingQueue(1024);
    AppMethodBeat.o(116541);
  }

  public final boolean acf()
  {
    AppMethodBeat.i(116542);
    ab.d("MicroMsg.SpeexEncoderWorker", "doEncode");
    Object localObject1 = new d();
    String str = b.ajO();
    Object localObject2;
    try
    {
      ab.i("MicroMsg.SpeexEncoderWorker", "path ".concat(String.valueOf(str)));
      localObject2 = new java/io/File;
      ((File)localObject2).<init>(str);
      if (!((File)localObject2).exists())
        ((File)localObject2).mkdir();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((d)localObject1).eo(str + this.mFileName + ".temp");
      while (this.fQA.size() > 0)
      {
        localObject2 = (g.a)this.fQA.poll();
        if ((((g.a)localObject2).buf != null) && (((g.a)localObject2).cqs > 0))
          ((d)localObject1).a((g.a)localObject2, 0, false);
      }
    }
    catch (Exception localException1)
    {
      ab.e("MicroMsg.SpeexEncoderWorker", "filename open failed, ", new Object[] { localException1 });
    }
    while (true)
    {
      AppMethodBeat.o(116542);
      return true;
      ((d)localObject1).Fe();
      try
      {
        localObject1 = new java/io/File;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((File)localObject1).<init>(localException1 + this.mFileName + ".temp");
        File localFile = new java/io/File;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localFile.<init>(localException1 + this.mFileName + ".spx");
        ((File)localObject1).renameTo(localFile);
        e.ajY().start();
      }
      catch (Exception localException2)
      {
        while (true)
          ab.e("MicroMsg.SpeexEncoderWorker", "exception:%s", new Object[] { bo.l(localException2) });
      }
    }
  }

  public final boolean acg()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bf.c
 * JD-Core Version:    0.6.2
 */