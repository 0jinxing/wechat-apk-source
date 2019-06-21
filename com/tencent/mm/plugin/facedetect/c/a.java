package com.tencent.mm.plugin.facedetect.c;

import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import com.tencent.mm.ai.m;
import com.tencent.mm.al.b;
import com.tencent.mm.plugin.facedetect.b.u;
import com.tencent.mm.plugin.facedetect.b.v;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

public abstract class a
{
  private com.tencent.mm.remoteservice.d ext = null;
  private int lSf;
  protected com.tencent.mm.plugin.facedetect.b.d lSg = null;
  protected com.tencent.mm.plugin.facedetect.b.c lSh = null;
  protected WeakReference<f> lTc;
  protected boolean lTd = false;
  int lTe = -1;
  public int lTf;
  protected com.tencent.mm.plugin.facedetect.b.a lTg = null;
  protected boolean lTh = false;
  protected int lTi;
  private Context mContext;

  a(Context paramContext, f paramf, int paramInt1, int paramInt2)
  {
    this.mContext = paramContext;
    this.lSf = paramInt1;
    this.lTc = new WeakReference(paramf);
    this.lTf = paramInt2;
    this.lTg = new com.tencent.mm.plugin.facedetect.b.a(paramInt1, paramInt2);
    this.lTe = FaceDetectReporter.vl(paramInt1);
  }

  public final void Lq(String paramString)
  {
    com.tencent.mm.plugin.facedetect.b.a locala;
    if (this.lTg != null)
    {
      locala = this.lTg;
      if (!locala.lSj)
      {
        locala.lSl = 1;
        if (!bo.isNullOrNil(paramString))
          break label48;
        ab.e("MicroMsg.FaceUploadProcessor", "hy: err face file null");
        locala.m(4, 90011, "face file null");
      }
    }
    while (true)
    {
      return;
      label48: if (!com.tencent.mm.vfs.e.ct(paramString))
      {
        ab.e("MicroMsg.FaceUploadProcessor", "hy: file not exist");
        locala.m(4, 90011, "get image failed");
      }
      else if (locala.lSk == 0L)
      {
        ab.e("MicroMsg.FaceUploadProcessor", "hy: err not init");
        locala.m(4, 90014, "uploadId not init");
      }
      else
      {
        ab.i("MicroMsg.FaceUploadProcessor", "hy: start upload file : %s", new Object[] { paramString });
        if (!locala.lSj)
        {
          com.tencent.mm.i.g localg = new com.tencent.mm.i.g();
          localg.egl = locala.lSr;
          localg.field_mediaId = com.tencent.mm.plugin.facedetect.model.p.Lt(paramString);
          localg.field_fullpath = paramString;
          localg.field_thumbpath = "";
          localg.field_fileType = com.tencent.mm.i.a.MediaType_FILE;
          localg.field_talker = "";
          localg.field_priority = com.tencent.mm.i.a.efC;
          localg.field_needStorage = false;
          localg.field_isStreamMedia = false;
          localg.field_appType = 0;
          localg.field_bzScene = 0;
          localg.field_largesvideo = 0;
          if (!com.tencent.mm.al.f.afx().e(localg))
          {
            ab.e("MicroMsg.FaceUploadProcessor", "hy: cdntra addSendTask failed. clientid:%s", new Object[] { localg.field_mediaId });
            locala.m(4, 90019, "add to cdn failed");
          }
        }
      }
    }
  }

  protected final void a(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    boolean bool = true;
    if (this.lTc == null);
    while (true)
    {
      ab.i("MicroMsg.FaceDetectBaseController", "alvinluo finishWithResult mUIModel == null: %b", new Object[] { Boolean.valueOf(bool) });
      if ((this.lTc != null) && (this.lTc.get() != null))
        ((f)this.lTc.get()).a(paramInt1, paramInt2, paramString, paramBundle);
      return;
      bool = false;
    }
  }

  public final void a(com.tencent.mm.plugin.facedetect.b.c paramc)
  {
    if (this.lTg != null)
    {
      this.lSh = paramc;
      this.lTg.lSh = this.lSh;
    }
  }

  public final void a(com.tencent.mm.plugin.facedetect.b.d paramd)
  {
    if (this.lTg != null)
    {
      this.lSg = paramd;
      this.lTg.lSg = paramd;
    }
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, com.tencent.mm.plugin.facedetect.ui.c paramc)
  {
    if ((this.lTc != null) && (this.lTc.get() != null))
      ((f)this.lTc.get()).a(paramBoolean1, paramBoolean2, paramc);
  }

  public abstract void ax(int paramInt, String paramString);

  protected final void b(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    if ((this.lTc != null) && (this.lTc.get() != null))
      ((f)this.lTc.get()).d(paramInt1, paramInt2, paramString, paramBundle);
  }

  public final void b(int paramInt, String paramString, Bundle paramBundle)
  {
    if ((paramInt == 0) && (!c(paramInt, paramString, paramBundle)))
    {
      ab.i("MicroMsg.FaceDetectBaseController", "alvinluo onUploadSuccess");
      this.lTd = true;
      if (this.lTh)
      {
        paramBundle = bsn();
        if (paramBundle != null)
          break label50;
        ab.e("MicroMsg.FaceDetectBaseController", "alvinluo verifyNetScene is null, stop verify");
      }
    }
    while (true)
    {
      return;
      label50: ab.i("MicroMsg.FaceDetectBaseController", "alvinluo start verify, sceneType: %d", new Object[] { Integer.valueOf(paramBundle.getType()) });
      if (!this.lTd)
      {
        ab.e("MicroMsg.FaceDetectBaseController", "isUploadDone: %b, upload not done, can't startVerify", new Object[] { Boolean.valueOf(this.lTd) });
      }
      else if (this.lTg != null)
      {
        paramString = this.lTg;
        if (paramBundle == null)
        {
          ab.e("MicroMsg.FaceUploadProcessor", "alvinluo verifyNetScene is null");
        }
        else
        {
          ab.i("MicroMsg.FaceUploadProcessor", "uploader start verify, sceneType: %d", new Object[] { Integer.valueOf(paramBundle.getType()) });
          paramString.bsd();
          paramString.lSn = paramBundle;
          paramString.lSl = 2;
          com.tencent.mm.kernel.g.Rg().a(paramBundle.getType(), paramString);
          com.tencent.mm.kernel.g.Rg().a(paramBundle, 0);
          paramString.lSo = System.currentTimeMillis();
        }
      }
    }
  }

  public final void bsj()
  {
    com.tencent.mm.plugin.facedetect.b.a locala;
    if (this.lTg != null)
    {
      this.lTg.lSq = this.lTf;
      locala = this.lTg;
      com.tencent.mm.kernel.g.RN();
      locala.lSi = com.tencent.mm.kernel.a.QX();
      ab.i("MicroMsg.FaceUploadProcessor", "alvinluo isLogin: %b", new Object[] { Boolean.valueOf(locala.lSi) });
      if (!locala.lSi)
        break label157;
      com.tencent.mm.kernel.g.Rg().a(732, locala);
      locala = this.lTg;
      locala.lSk = 0L;
      locala.lSl = 0;
      if (locala.lSm != null)
        com.tencent.mm.kernel.g.Rg().c(locala.lSm);
      if (com.tencent.mm.plugin.facedetect.model.e.bst())
        com.tencent.mm.plugin.facedetect.model.e.il(locala.lSk);
      if (!locala.lSi)
        break label170;
    }
    label157: label170: for (locala.lSm = new u(locala.lSf, locala.lSq); ; locala.lSm = new v(locala.lSf, locala.lSq))
    {
      com.tencent.mm.kernel.g.Rg().a(locala.lSm, 0);
      return;
      com.tencent.mm.kernel.g.Rg().a(733, locala);
      break;
    }
  }

  public final void bsk()
  {
    if ((this.lTc != null) && (this.lTc.get() != null))
      ((f)this.lTc.get()).bsk();
    onStart();
  }

  public final long bsl()
  {
    if (this.lTg != null);
    for (long l = this.lTg.lSk; ; l = -1L)
      return l;
  }

  public final void bsm()
  {
    ab.i("MicroMsg.FaceDetectBaseController", "alvinluo controller releaseFaceDetect");
    if ((this.lTc != null) && (this.lTc.get() != null))
      ((f)this.lTc.get()).bsm();
    this.lTc = null;
    Object localObject = bo.aw(ah.getContext(), Process.myPid());
    String str = ah.getPackageName();
    ab.i("MicroMsg.FaceDetectBaseController", "process name: %s", new Object[] { localObject });
    boolean bool;
    if (((String)localObject).equalsIgnoreCase(str))
      if (this.lTg != null)
      {
        localObject = this.lTg;
        if (((com.tencent.mm.plugin.facedetect.b.a)localObject).lSm != null)
          break label201;
        bool = true;
        ab.v("MicroMsg.FaceUploadProcessor", "alvinluo uinit mCurrentNetScene == null: %b", new Object[] { Boolean.valueOf(bool) });
        ((com.tencent.mm.plugin.facedetect.b.a)localObject).lSj = true;
        if (((com.tencent.mm.plugin.facedetect.b.a)localObject).lSm != null)
        {
          ab.i("MicroMsg.FaceUploadProcessor", "alvinluo hy: current scene: %s is not finished yet. cancel.", new Object[] { ((com.tencent.mm.plugin.facedetect.b.a)localObject).lSm.getClass().getSimpleName() });
          com.tencent.mm.kernel.g.Rg().c(((com.tencent.mm.plugin.facedetect.b.a)localObject).lSm);
        }
        if (!((com.tencent.mm.plugin.facedetect.b.a)localObject).lSi)
          break label206;
        com.tencent.mm.kernel.g.Rg().b(732, (com.tencent.mm.ai.f)localObject);
      }
    while (true)
    {
      ((com.tencent.mm.plugin.facedetect.b.a)localObject).bsd();
      this.lTg = null;
      onRelease();
      return;
      label201: bool = false;
      break;
      label206: com.tencent.mm.kernel.g.Rg().b(733, (com.tencent.mm.ai.f)localObject);
    }
  }

  protected abstract m bsn();

  public abstract Bundle bso();

  public abstract void c(int paramInt1, int paramInt2, String paramString, Bundle paramBundle);

  public abstract boolean c(int paramInt, String paramString, Bundle paramBundle);

  public abstract void g(int paramInt1, int paramInt2, String paramString, m paramm);

  public abstract void n(int paramInt1, int paramInt2, String paramString);

  public abstract void onRelease();

  protected abstract void onStart();

  public final void vg(int paramInt)
  {
    this.lTi = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.c.a
 * JD-Core Version:    0.6.2
 */