package com.tencent.mm.plugin.webview.e;

import android.arch.lifecycle.MutableLiveData;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.c;
import com.tencent.mm.al.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.i.a;
import com.tencent.mm.i.g;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public final class b
{
  String appId;
  public String hWL;
  private b.a uKL;
  Map<String, String> uKM;
  public MutableLiveData<String> uKN;
  public b.b uKO;

  public b()
  {
    AppMethodBeat.i(10136);
    this.uKL = new b.a(this, (byte)0);
    this.uKM = new HashMap();
    this.uKN = new MutableLiveData();
    this.uKO = b.b.uKQ;
    AppMethodBeat.o(10136);
  }

  private void hp(String paramString1, String paramString2)
  {
    AppMethodBeat.i(10138);
    g localg = new g();
    localg.egl = this.uKL;
    localg.field_mediaId = paramString2;
    localg.field_fullpath = paramString1;
    localg.field_fileType = a.efN;
    localg.field_priority = a.efB;
    localg.field_needStorage = true;
    localg.field_isStreamMedia = false;
    localg.field_appType = 200;
    localg.field_bzScene = 2;
    if (!f.afx().e(localg))
    {
      ab.e("MicroMsg.VestImgUploadEngine", "hy: cdntra addSendTask failed. clientid:%s", new Object[] { paramString2 });
      this.uKO = b.b.uKT;
    }
    AppMethodBeat.o(10138);
  }

  public final void ho(String paramString1, String paramString2)
  {
    AppMethodBeat.i(10137);
    this.appId = paramString2;
    this.hWL = paramString1;
    this.uKO = b.b.uKR;
    long l = System.currentTimeMillis();
    paramString2 = c.a("vestacountavatar", l, r.Zd().field_username, String.valueOf(l));
    this.uKM.put(bo.nullAsNil(paramString2), paramString1);
    hp(paramString1, paramString2);
    AppMethodBeat.o(10137);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.e.b
 * JD-Core Version:    0.6.2
 */