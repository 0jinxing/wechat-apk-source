package com.tencent.mm.plugin.facedetect.c;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.facedetect.b.e;
import com.tencent.mm.plugin.facedetect.b.n;
import com.tencent.mm.plugin.facedetect.b.o;
import com.tencent.mm.plugin.facedetect.b.s;
import com.tencent.mm.plugin.facedetect.b.t;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public final class c extends a
{
  boolean isRetry = false;
  private String lTl;
  private String lTm;
  private int lTn;

  c(Context paramContext, f paramf, int paramInt1, int paramInt2)
  {
    super(paramContext, paramf, paramInt1, paramInt2);
    this.lTh = true;
    this.lTn = paramInt1;
  }

  private void a(int paramInt1, int paramInt2, String paramString, boolean paramBoolean, Bundle paramBundle)
  {
    AppMethodBeat.i(133);
    b(paramInt1, paramInt2, paramString, paramBundle);
    Object localObject = ah.getContext();
    if (paramString == null);
    for (String str1 = ((Context)localObject).getString(2131299438); ; str1 = paramString)
    {
      String str2;
      if (paramBoolean)
      {
        str2 = ((Context)localObject).getString(2131299514);
        if (!paramBoolean)
          break label132;
      }
      label132: for (localObject = ((Context)localObject).getString(2131296868); ; localObject = null)
      {
        paramString = com.tencent.mm.plugin.facedetect.ui.a.b(2130838637, str1, str2, (String)localObject, new c.2(this, paramBoolean, paramInt1, paramInt2, paramString, paramBundle), new c.3(this, paramInt1, paramInt2, paramString, paramBundle));
        paramString.status = 3;
        a(true, false, paramString);
        AppMethodBeat.o(133);
        return;
        str2 = ((Context)localObject).getString(2131299512);
        break;
      }
    }
  }

  private String getResultKey()
  {
    String str;
    switch (this.lTn)
    {
    case 2:
    case 5:
    default:
      str = "verify_result";
    case 0:
    case 3:
    case 1:
    case 4:
    case 6:
    }
    while (true)
    {
      return str;
      str = "faceregister_ticket";
      continue;
      str = "faceverify_ticket";
    }
  }

  public final void ax(int paramInt, String paramString)
  {
    AppMethodBeat.i(131);
    ab.i("MicroMsg.FaceDetectLoginController", "alvinluo onCancel, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (!FaceDetectReporter.bsJ().lUt)
      FaceDetectReporter.bsJ().c(FaceDetectReporter.vl(this.lTn), this.isRetry, 2, 1, paramInt);
    a(1, paramInt, paramString, null);
    AppMethodBeat.o(131);
  }

  public final m bsn()
  {
    AppMethodBeat.i(124);
    long l = bsl();
    String str = this.lTl;
    Object localObject = this.lTm;
    switch (this.lTn)
    {
    case 2:
    default:
      localObject = null;
      AppMethodBeat.o(124);
    case 0:
    case 1:
    case 3:
    case 4:
    }
    while (true)
    {
      return localObject;
      localObject = new n(l, str, (String)localObject);
      AppMethodBeat.o(124);
      continue;
      localObject = new s(l, str, (String)localObject);
      AppMethodBeat.o(124);
      continue;
      localObject = new o(l, str, (String)localObject);
      AppMethodBeat.o(124);
      continue;
      localObject = new t(l, str, (String)localObject);
      AppMethodBeat.o(124);
    }
  }

  public final Bundle bso()
  {
    AppMethodBeat.i(132);
    Bundle localBundle = new Bundle();
    localBundle.putLong("k_bio_id", bsl());
    AppMethodBeat.o(132);
    return localBundle;
  }

  public final void c(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(130);
    ab.i("MicroMsg.FaceDetectLoginController", "alvinluo onError errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (!FaceDetectReporter.bsJ().lUt)
      FaceDetectReporter.bsJ().c(FaceDetectReporter.vl(this.lTn), this.isRetry, 3, paramInt1, paramInt2);
    if (paramBundle != null)
    {
      Bundle localBundle = new Bundle();
      paramBundle = paramBundle.getString(getResultKey());
      localBundle.putString(getResultKey(), paramBundle);
      a(paramInt1, paramInt2, paramString, localBundle);
      AppMethodBeat.o(130);
    }
    while (true)
    {
      return;
      a(paramInt1, paramInt2, paramString, null);
      AppMethodBeat.o(130);
    }
  }

  public final boolean c(int paramInt, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(128);
    ab.i("MicroMsg.FaceDetectLoginController", "alvinluo onUploadEnd errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(0), paramString });
    boolean bool;
    if (paramInt != 0)
    {
      FaceDetectReporter.bsJ().c(FaceDetectReporter.vl(this.lTn), this.isRetry, 1, 2, 90012);
      a(paramInt, 0, paramString, false, null);
      bool = true;
      AppMethodBeat.o(128);
    }
    while (true)
    {
      return bool;
      if ((paramBundle == null) || (bo.isNullOrNil(paramBundle.getString("key_pic_cdn_id"))))
      {
        ab.e("MicroMsg.FaceDetectLoginController", "hy: not return cdn id!");
        a(4, 6, "not return cdn id", false, null);
        bool = true;
        AppMethodBeat.o(128);
      }
      else
      {
        this.lTl = paramBundle.getString("key_pic_cdn_id");
        this.lTm = paramBundle.getString("key_cdn_aes_key");
        ab.v("MicroMsg.FaceDetectLoginController", "hy: start upload: picCdnId: %s, aes key: %s", new Object[] { this.lTl, this.lTm });
        bool = false;
        AppMethodBeat.o(128);
      }
    }
  }

  public final void g(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(129);
    ab.i("MicroMsg.FaceDetectLoginController", "alvinluo onVerifyEnd sceneType: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    Object localObject;
    FaceDetectReporter localFaceDetectReporter;
    int i;
    boolean bool;
    if ((paramm instanceof e))
    {
      localObject = (e)paramm;
      paramm = new Bundle();
      paramm.putString(getResultKey(), ((e)localObject).bsh());
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        localFaceDetectReporter = FaceDetectReporter.bsJ();
        i = this.lTe;
        bool = ((e)localObject).bsg();
        if (this.lTg != null);
        for (j = this.lTg.lSp; ; j = 0)
        {
          localFaceDetectReporter.a(i, bool, 0, paramInt1, paramInt2, j);
          localObject = com.tencent.mm.plugin.facedetect.ui.a.bti();
          ((com.tencent.mm.plugin.facedetect.ui.c)localObject).lYx = true;
          ((com.tencent.mm.plugin.facedetect.ui.c)localObject).lYF = ah.getResources().getString(2131300874);
          ((com.tencent.mm.plugin.facedetect.ui.c)localObject).status = 2;
          a(false, true, (com.tencent.mm.plugin.facedetect.ui.c)localObject);
          al.n(new c.1(this, paramInt1, paramInt2, paramString, paramm), 1500L);
          AppMethodBeat.o(129);
          return;
        }
      }
      localFaceDetectReporter = FaceDetectReporter.bsJ();
      i = this.lTe;
      bool = ((e)localObject).bsg();
      if (this.lTg == null)
        break label289;
    }
    label289: for (int j = this.lTg.lSp; ; j = 0)
    {
      localFaceDetectReporter.a(i, bool, 1, paramInt1, paramInt2, j);
      a(paramInt1, paramInt2, paramString, ((e)localObject).bsg(), paramm);
      AppMethodBeat.o(129);
      break;
    }
  }

  public final void n(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(127);
    ab.v("MicroMsg.FaceDetectLoginController", "alvinluo onCollectEnd errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    AppMethodBeat.o(127);
  }

  public final void onRelease()
  {
    AppMethodBeat.i(126);
    if (!FaceDetectReporter.bsJ().lUt)
      FaceDetectReporter.bsJ().c(FaceDetectReporter.vl(this.lTn), this.isRetry, 2, 1, 90006);
    AppMethodBeat.o(126);
  }

  public final void onStart()
  {
    AppMethodBeat.i(125);
    ab.i("MicroMsg.FaceDetectLoginController", "alvinluo onStart and create report session");
    FaceDetectReporter.bsJ().bsK();
    FaceDetectReporter.bsJ().R(FaceDetectReporter.vl(this.lTn), this.isRetry);
    AppMethodBeat.o(125);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.c.c
 * JD-Core Version:    0.6.2
 */