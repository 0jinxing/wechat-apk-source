package com.tencent.mm.bf;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.j;

public final class e
{
  private static e fQQ = null;
  private byte[] eHH;
  public az fBz;
  private String fQR;
  private f fQS;

  public e()
  {
    AppMethodBeat.i(116559);
    this.fBz = new az(1, "speex_worker");
    this.eHH = new byte[0];
    this.fQS = new f()
    {
      public final void onSceneEnd(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
      {
        AppMethodBeat.i(116558);
        if (e.c(e.this) == null)
          AppMethodBeat.o(116558);
        while (true)
        {
          return;
          ab.d("MicroMsg.SpeexUploadCore", "onSceneEnd " + ((a)paramAnonymousm).filename + " filepath " + e.c(e.this) + " errCode " + paramAnonymousInt2);
          if (((a)paramAnonymousm).filename.equals(e.c(e.this)))
          {
            g.Rg().b(240, e.d(e.this));
            if (paramAnonymousInt2 == 0)
            {
              d.ajP();
              d.ajR();
            }
            paramAnonymousString = new com.tencent.mm.vfs.b(e.c(e.this));
            try
            {
              boolean bool = paramAnonymousString.delete();
              paramAnonymousString = new java/lang/StringBuilder;
              paramAnonymousString.<init>("delete ");
              ab.d("MicroMsg.SpeexUploadCore", e.c(e.this) + " delete " + bool + " errCode " + paramAnonymousInt2);
              e.ajY().start();
              e.e(e.this);
              AppMethodBeat.o(116558);
              continue;
            }
            catch (Exception paramAnonymousString)
            {
              ab.e("MicroMsg.SpeexUploadCore", "exception:%s", new Object[] { bo.l(paramAnonymousString) });
              e.ajY().start();
              e.e(e.this);
              AppMethodBeat.o(116558);
              continue;
            }
            finally
            {
              e.ajY().start();
              e.e(e.this);
              AppMethodBeat.o(116558);
            }
          }
          else
          {
            AppMethodBeat.o(116558);
          }
        }
      }
    };
    AppMethodBeat.o(116559);
  }

  public static e ajY()
  {
    AppMethodBeat.i(116560);
    if (fQQ == null)
      fQQ = new e();
    e locale = fQQ;
    AppMethodBeat.o(116560);
    return locale;
  }

  private static com.tencent.mm.vfs.b cB(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116563);
    Object localObject1 = new com.tencent.mm.vfs.b(b.ajO());
    if ((!((com.tencent.mm.vfs.b)localObject1).exists()) || (!((com.tencent.mm.vfs.b)localObject1).isDirectory()))
    {
      AppMethodBeat.o(116563);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      com.tencent.mm.vfs.b[] arrayOfb = ((com.tencent.mm.vfs.b)localObject1).dMF();
      int i = 0;
      Object localObject2 = null;
      localObject1 = localObject2;
      if (arrayOfb != null)
      {
        localObject1 = localObject2;
        if (i < arrayOfb.length)
        {
          localObject2 = arrayOfb[i];
          localObject1 = localObject2;
          String str;
          long l;
          if (localObject2 != null)
          {
            localObject1 = localObject2;
            if (((com.tencent.mm.vfs.b)localObject2).isFile())
            {
              ab.d("MicroMsg.SpeexUploadCore", "file " + j.w(((com.tencent.mm.vfs.b)localObject2).mUri));
              str = j.w(((com.tencent.mm.vfs.b)localObject2).mUri);
              l = ((com.tencent.mm.vfs.b)localObject2).length();
              if (((com.tencent.mm.vfs.b)localObject2).getName().endsWith(".spx"))
                break label164;
            }
          }
          for (localObject1 = null; ; localObject1 = null)
          {
            i++;
            localObject2 = localObject1;
            break;
            label164: if (l >= paramInt1)
            {
              localObject1 = localObject2;
              if (l <= paramInt2)
                break label225;
            }
            ab.d("MicroMsg.SpeexUploadCore", "unfit delete %s, minsize: %d, maxSize: %d", new Object[] { str, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
            com.tencent.mm.vfs.e.deleteFile(str);
          }
        }
      }
      label225: AppMethodBeat.o(116563);
    }
  }

  public final void b(az.a parama)
  {
    AppMethodBeat.i(116561);
    ab.d("MicroMsg.SpeexUploadCore", "pushWork");
    this.fBz.e(parama);
    AppMethodBeat.o(116561);
  }

  public final void start()
  {
    AppMethodBeat.i(116562);
    if (!at.isWifi(ah.getContext()))
      AppMethodBeat.o(116562);
    while (true)
    {
      return;
      new ak(Looper.getMainLooper()).postDelayed(new e.2(this), 100L);
      AppMethodBeat.o(116562);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bf.e
 * JD-Core Version:    0.6.2
 */