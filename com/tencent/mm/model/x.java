package com.tencent.mm.model;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.i.c;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class x
{
  public x.a flf;
  boolean flg;
  String flh;
  BlockingQueue<x.c> fli;
  public x.b flj;
  ak handler;

  public x(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(77803);
    this.flf = null;
    this.flg = false;
    this.flh = "";
    this.fli = new ArrayBlockingQueue(80);
    this.flj = null;
    com.tencent.mm.kernel.g.RQ();
    this.handler = new x.1(this, com.tencent.mm.kernel.g.RS().oAl.getLooper());
    this.flf = null;
    this.flg = paramBoolean;
    this.flh = paramString;
    ab.d("MicroMsg.GetPicService", "getPicService, isFromWebView:%b isFromWebViewReffer:%s", new Object[] { Boolean.valueOf(paramBoolean), paramString });
    AppMethodBeat.o(77803);
  }

  public final String c(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(77804);
    Object localObject;
    if (paramString1 == null)
    {
      localObject = null;
      ab.d("MicroMsg.GetPicService", "getPicfileByUrl type:" + paramInt1 + " url:" + paramString1);
    }
    while (true)
    {
      try
      {
        boolean bool = com.tencent.mm.a.e.ct((String)localObject);
        if (bool)
        {
          AppMethodBeat.o(77804);
          return localObject;
          if (!com.tencent.mm.kernel.g.RK())
          {
            ab.i("MicroMsg.GetPicService", "genFileName, account not ready");
            localObject = new File(com.tencent.mm.kernel.g.RP().eJL + "/imagecache");
            if (!((File)localObject).exists())
              ((File)localObject).mkdirs();
            localObject = ((File)localObject).getAbsolutePath() + "/reader_" + paramInt1 + "_" + com.tencent.mm.a.g.x(paramString1.getBytes()) + ".jpg";
            break;
          }
          localObject = c.XW() + "/reader_" + paramInt1 + "_" + com.tencent.mm.a.g.x(paramString1.getBytes()) + ".jpg";
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.GetPicService", "exception:%s", new Object[] { bo.l(localException) });
      }
      try
      {
        BlockingQueue localBlockingQueue = this.fli;
        x.c localc = new com/tencent/mm/model/x$c;
        localc.<init>(this, paramString1, (String)localObject, paramInt2, paramString2);
        localBlockingQueue.add(localc);
        if ((this.flf == null) || (!d.xDG.ao(this.flf)))
        {
          d.xDG.remove(this.flf);
          paramString1 = new com/tencent/mm/model/x$a;
          paramString1.<init>(this);
          this.flf = paramString1;
          d.post(this.flf, "GetPicService_getPic");
        }
        AppMethodBeat.o(77804);
        localObject = null;
      }
      catch (Exception paramString1)
      {
        while (true)
          ab.e("MicroMsg.GetPicService", "exception:%s", new Object[] { bo.l(paramString1) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.x
 * JD-Core Version:    0.6.2
 */