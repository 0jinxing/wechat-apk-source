package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.x;
import com.tencent.mm.plugin.sns.storage.y;
import com.tencent.mm.protocal.protobuf.adw;
import com.tencent.mm.protocal.protobuf.adx;
import com.tencent.mm.protocal.protobuf.akz;
import com.tencent.mm.protocal.protobuf.ala;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public final class m
{
  private static final m reM;
  private Map<Long, String> cache;
  private com.tencent.mm.plugin.sns.storage.d reN;
  public y reO;
  public Map<String, String> reP;

  static
  {
    AppMethodBeat.i(37800);
    reM = new m();
    AppMethodBeat.o(37800);
  }

  private m()
  {
    AppMethodBeat.i(37791);
    this.reN = af.cnG();
    this.cache = new HashMap();
    this.reO = af.cnH();
    this.reP = new HashMap();
    HandlerThread localHandlerThread = com.tencent.mm.sdk.g.d.anM("OpenCanvasMgr");
    localHandlerThread.start();
    new ak(localHandlerThread.getLooper()).postDelayed(new m.1(this), 5000L);
    AppMethodBeat.o(37791);
  }

  private void C(final long paramLong, int paramInt)
  {
    AppMethodBeat.i(37794);
    final com.tencent.mm.plugin.sns.storage.c localc = new com.tencent.mm.plugin.sns.storage.c();
    localc.field_canvasId = paramLong;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new adw();
    ((b.a)localObject).fsK = new adx();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/adplayinfo/get_adcanvasinfo";
    ((b.a)localObject).fsI = 1286;
    localObject = ((b.a)localObject).acD();
    ((adw)((b)localObject).fsG.fsP).wlV = paramLong;
    w.a((b)localObject, new w.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, com.tencent.mm.ai.m paramAnonymousm)
      {
        AppMethodBeat.i(37789);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          ab.e("OpenCanvasMgr", "cgi fail page id %d,preLoad %d, errType %d,errCode %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(localc), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          AppMethodBeat.o(37789);
        }
        while (true)
        {
          return 0;
          paramAnonymousString = (adx)paramAnonymousb.fsH.fsP;
          ab.i("OpenCanvasMgr", "getCanvasInfo pageid %d ,xml %s", new Object[] { Long.valueOf(paramLong), paramAnonymousString.wlW });
          if (!TextUtils.isEmpty(paramAnonymousString.wlW))
          {
            m.b(m.this).put(Long.valueOf(paramLong), paramAnonymousString.wlW);
            this.reT.field_canvasXml = paramAnonymousString.wlW;
            m.c(m.this).a(this.reT);
          }
          AppMethodBeat.o(37789);
        }
      }
    });
    AppMethodBeat.o(37794);
  }

  private void I(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(37798);
    x localx = new x();
    localx.field_canvasId = paramString1;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new akz();
    ((b.a)localObject).fsK = new ala();
    ((b.a)localObject).uri = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_getofficialcanvasinfo";
    ((b.a)localObject).fsI = 1890;
    b localb = ((b.a)localObject).acD();
    localObject = (akz)localb.fsG.fsP;
    ((akz)localObject).wqx = paramString1;
    ((akz)localObject).wqy = paramString2;
    w.a(localb, new m.3(this, paramString1, paramInt, localx));
    AppMethodBeat.o(37798);
  }

  public static m cqn()
  {
    return reM;
  }

  private String gp(String paramString1, String paramString2)
  {
    AppMethodBeat.i(37797);
    if (!bo.isNullOrNil(paramString2));
    for (String str = paramString1 + paramString2; ; str = paramString1)
    {
      if (this.reP.containsKey(str))
      {
        paramString1 = (String)this.reP.get(str);
        AppMethodBeat.o(37797);
      }
      while (true)
      {
        return paramString1;
        x localx = new x();
        localx.field_canvasId = paramString1;
        localx.field_canvasExt = paramString2;
        this.reO.b(localx, new String[] { "canvasId", "canvasExt" });
        if (!TextUtils.isEmpty(localx.field_canvasXml))
        {
          this.reP.put(str, localx.field_canvasXml);
          paramString1 = localx.field_canvasXml;
          AppMethodBeat.o(37797);
        }
        else
        {
          paramString1 = "";
          AppMethodBeat.o(37797);
        }
      }
    }
  }

  private String kt(long paramLong)
  {
    AppMethodBeat.i(37793);
    Object localObject;
    if (this.cache.containsKey(Long.valueOf(paramLong)))
    {
      localObject = (String)this.cache.get(Long.valueOf(paramLong));
      AppMethodBeat.o(37793);
    }
    while (true)
    {
      return localObject;
      localObject = new com.tencent.mm.plugin.sns.storage.c();
      ((com.tencent.mm.plugin.sns.storage.c)localObject).field_canvasId = paramLong;
      this.reN.b((com.tencent.mm.sdk.e.c)localObject, new String[0]);
      if (!TextUtils.isEmpty(((com.tencent.mm.plugin.sns.storage.c)localObject).field_canvasXml))
      {
        this.cache.put(Long.valueOf(paramLong), ((com.tencent.mm.plugin.sns.storage.c)localObject).field_canvasXml);
        localObject = ((com.tencent.mm.plugin.sns.storage.c)localObject).field_canvasXml;
        AppMethodBeat.o(37793);
      }
      else
      {
        localObject = "";
        AppMethodBeat.o(37793);
      }
    }
  }

  public final String j(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37796);
    ab.i("OpenCanvasMgr", "open pageId %s, canvasExt %s, preLoad %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1) });
    String str;
    if (bo.isNullOrNil(paramString1))
    {
      str = "";
      AppMethodBeat.o(37796);
    }
    while (true)
    {
      return str;
      str = "";
      if (paramInt2 != 1)
        str = gp(paramString1, paramString2);
      if (paramInt1 != 1)
      {
        AppMethodBeat.o(37796);
      }
      else if (TextUtils.isEmpty(str))
      {
        I(paramString1, paramString2, paramInt1);
        str = "";
        AppMethodBeat.o(37796);
      }
      else
      {
        AppMethodBeat.o(37796);
      }
    }
  }

  public final String n(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37792);
    ab.i("OpenCanvasMgr", "open pageId %d, preLoad %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1) });
    String str;
    if (paramLong <= 0L)
    {
      str = "";
      AppMethodBeat.o(37792);
    }
    while (true)
    {
      return str;
      str = "";
      if (paramInt2 != 1)
        str = kt(paramLong);
      if (paramInt1 != 1)
      {
        AppMethodBeat.o(37792);
      }
      else if (TextUtils.isEmpty(str))
      {
        C(paramLong, paramInt1);
        str = "";
        AppMethodBeat.o(37792);
      }
      else
      {
        AppMethodBeat.o(37792);
      }
    }
  }

  public final void u(long paramLong, String paramString)
  {
    AppMethodBeat.i(37795);
    if ((!TextUtils.isEmpty(paramString)) && (paramLong > 0L))
    {
      this.cache.put(Long.valueOf(paramLong), paramString);
      com.tencent.mm.plugin.sns.storage.c localc = new com.tencent.mm.plugin.sns.storage.c();
      localc.field_canvasId = paramLong;
      localc.field_canvasXml = paramString;
      this.reN.a(localc);
    }
    AppMethodBeat.o(37795);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.m
 * JD-Core Version:    0.6.2
 */