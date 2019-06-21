package com.tencent.mm.plugin.appbrand.game;

import android.webkit.JavascriptInterface;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.PartialFile;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.game.f.a;
import com.tencent.mm.plugin.appbrand.h.g;
import com.tencent.mm.plugin.appbrand.h.s;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.s.n;
import com.tencent.mm.plugin.appbrand.s.n.a;
import com.tencent.mm.plugin.appbrand.s.o.a;
import com.tencent.mm.plugin.appbrand.s.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public final class d extends com.tencent.mm.plugin.appbrand.e
{
  private boolean hqu = false;
  boolean hqv = false;

  d(com.tencent.mm.plugin.appbrand.q paramq, com.tencent.mm.plugin.appbrand.h.q paramq1)
  {
    super(paramq, paramq1);
  }

  private static String Ao(String paramString)
  {
    AppMethodBeat.i(138121);
    Object localObject = null;
    try
    {
      paramString = com.tencent.mm.vfs.e.cy(paramString);
      AppMethodBeat.o(138121);
      return paramString;
    }
    catch (IOException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WAGameJsContextInterface", paramString, "getGameEngineScript exception:%s", new Object[] { paramString.toString() });
        paramString = localObject;
      }
    }
  }

  public final void a(g paramg)
  {
    AppMethodBeat.i(130050);
    if (this.hqu)
    {
      String str1 = com.tencent.mm.plugin.appbrand.r.d.Eb("wxa_library/NativeGlobal-WAGame.js");
      String str2 = str1;
      if (this.hqv)
        str2 = str1 + com.tencent.mm.plugin.appbrand.r.d.Eb("wxa_library/commandbuffer.js");
      n.a(paramg, str2, new n.a()
      {
        public final void lo(String paramAnonymousString)
        {
          AppMethodBeat.i(130041);
          ab.i("MicroMsg.WAGameJsContextInterface", "onInjectSdkBefore failed: %s", new Object[] { paramAnonymousString });
          AppMethodBeat.o(130041);
        }

        public final void onSuccess(String paramAnonymousString)
        {
          AppMethodBeat.i(130040);
          ab.i("MicroMsg.WAGameJsContextInterface", "onInjectSdkBefore suc: %s", new Object[] { paramAnonymousString });
          AppMethodBeat.o(130040);
        }
      });
    }
    AppMethodBeat.o(130050);
  }

  public final void a(g paramg, String paramString1, String paramString2)
  {
    AppMethodBeat.i(130053);
    ab.i("MicroMsg.WAGameJsContextInterface", "hy: injectSdkScript %s [%d]", new Object[] { paramString1, Integer.valueOf(paramg.aGT()) });
    long l = System.currentTimeMillis();
    boolean bool = this.gMN.atU();
    com.tencent.mm.plugin.appbrand.s.o.a(this.gMN, paramg, paramString1, paramString1, "v" + WxaCommLibRuntimeReader.avQ().gVu, paramString2, o.a.iRz, new d.6(this, paramString1, bool, l, paramString2));
    u.a(this.gMN.getRuntime(), paramg);
    AppMethodBeat.o(130053);
  }

  public final void a(g paramg, String paramString1, String paramString2, n.a parama)
  {
    AppMethodBeat.i(130052);
    ab.i("MicroMsg.WAGameJsContextInterface", "hy: inject appscript from js context interface: %s %d", new Object[] { paramString1, Integer.valueOf(paramg.aGT()) });
    PartialFile[] arrayOfPartialFile = this.gMN.getRuntime().ye().hhd.gSR;
    label236: long l1;
    if ((paramString1.equals("game.js")) && (arrayOfPartialFile != null) && (arrayOfPartialFile.length > 0))
    {
      ab.i("MicroMsg.WAGameJsContextInterface", "inject codeLib size:%s", new Object[] { Integer.valueOf(arrayOfPartialFile.length) });
      int i = arrayOfPartialFile.length;
      int j = 0;
      if (j < i)
      {
        Object localObject1 = arrayOfPartialFile[j];
        int k = ((PartialFile)localObject1).version;
        String str1 = ((PartialFile)localObject1).bIy;
        localObject2 = str1 + "_" + k;
        String str2 = ((PartialFile)localObject1).cvZ;
        localObject1 = ((PartialFile)localObject1).filePath;
        if ((!bo.isNullOrNil(str1)) && (!bo.isNullOrNil((String)localObject1)))
        {
          ab.i("MicroMsg.WAGameJsContextInterface", "provider:%s,version:%s", new Object[] { str1, Integer.valueOf(k) });
          localObject1 = Ao((String)localObject1);
          if (!com.tencent.magicbrush.c.isNullOrNil((String)localObject1))
            break label236;
          ab.e("MicroMsg.WAGameJsContextInterface", "game engine null!");
        }
        while (true)
        {
          j++;
          break;
          ab.i("MicroMsg.WAGameJsContextInterface", "game engine:%s", new Object[] { ((String)localObject1).substring(0, 20) });
          l1 = System.currentTimeMillis();
          com.tencent.mm.plugin.appbrand.s.o.a(this.gMN.getRuntime(), paramg, paramString1, (String)localObject2, str2, (String)localObject1, o.a.iRA, new d.4(this, str1, (String)localObject1, l1));
        }
      }
    }
    long l2 = System.currentTimeMillis();
    Object localObject2 = com.tencent.mm.plugin.appbrand.game.preload.d.aBz();
    if ((!com.tencent.magicbrush.c.isNullOrNil(paramString1)) && (paramString1.equals("game.js")))
    {
      long l3 = bo.anU();
      l1 = ((com.tencent.mm.plugin.appbrand.game.preload.d)localObject2).htn.atI().startTime;
      com.tencent.mm.plugin.appbrand.game.preload.e.aBD().cY(2000, (int)(l3 - l1));
      com.tencent.mm.plugin.appbrand.game.preload.e.aBD().cY(3001, ((com.tencent.mm.plugin.appbrand.game.preload.d)localObject2).htv.intValue());
      com.tencent.mm.plugin.appbrand.game.preload.e.aBD().cY(3003, ((com.tencent.mm.plugin.appbrand.game.preload.d)localObject2).htu.intValue());
      com.tencent.mm.plugin.appbrand.game.preload.e.aBD().cY(4001, ((com.tencent.mm.plugin.appbrand.game.preload.d)localObject2).htw.intValue());
    }
    com.tencent.mm.plugin.appbrand.s.o.a(this.gMN.getRuntime(), paramg, paramString1, paramString1.replace('/', '_') + "_" + this.gMN.getAppId(), this.gMN.getRuntime().ye().hhd.cvZ, paramString2, o.a.iRA, new d.5(this, paramString1, paramString2, l2, parama));
    AppMethodBeat.o(130052);
  }

  @JavascriptInterface
  public final int allocNativeGlobal()
  {
    AppMethodBeat.i(130048);
    this.hqu = true;
    int i = super.alloc();
    ab.i("MicroMsg.WAGameJsContextInterface", "alloc injectNativeGlobal = [%b], ret = [%d]", new Object[] { Boolean.valueOf(this.hqu), Integer.valueOf(i) });
    this.hqu = false;
    AppMethodBeat.o(130048);
    return i;
  }

  public final void asH()
  {
    AppMethodBeat.i(130051);
    super.asH();
    ab.i("MicroMsg.WAGameJsContextInterface", "hy: injected WAGameJSContextInterface");
    AppMethodBeat.o(130051);
  }

  public final g asI()
  {
    AppMethodBeat.i(130049);
    g localg = super.asI();
    if (localg != null)
    {
      localg.setJsExceptionHandler(new d.2(this, localg));
      if (!this.hqu)
        break label136;
    }
    while (true)
    {
      try
      {
        s locals = (s)localg.af(s.class);
        ((b)this.gMN).getMBRuntime().bindTo(locals.getIsolatePtr(), locals.aGW());
        bool = true;
        ab.i("MicroMsg.WAGameJsContextInterface", "alloc injectNativeGlobal = [%b], ret = [%b]", new Object[] { Boolean.valueOf(this.hqu), Boolean.valueOf(bool) });
        AppMethodBeat.o(130049);
        return localg;
      }
      catch (NullPointerException localNullPointerException)
      {
        ab.e("MicroMsg.WAGameJsContextInterface", "injectNativeGlobal failed [%s]", new Object[] { localNullPointerException });
        bool = false;
        continue;
      }
      label136: boolean bool = true;
    }
  }

  public final String asJ()
  {
    return "WAGameSubContext.js";
  }

  public final String asK()
  {
    AppMethodBeat.i(130055);
    String str = WxaCommLibRuntimeReader.xu("WAGameSubContext.js");
    AppMethodBeat.o(130055);
    return str;
  }

  public final int asL()
  {
    AppMethodBeat.i(138694);
    int i = WxaCommLibRuntimeReader.avQ().gVu;
    AppMethodBeat.o(138694);
    return i;
  }

  public final void asM()
  {
  }

  public final void asN()
  {
  }

  // ERROR //
  public final void ds(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_2
    //   2: ldc_w 423
    //   5: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: getstatic 74	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   11: ldc2_w 424
    //   14: ldc2_w 426
    //   17: lconst_1
    //   18: iconst_0
    //   19: invokevirtual 81	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   22: iload_1
    //   23: ifeq +24 -> 47
    //   26: getstatic 74	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   29: ldc2_w 424
    //   32: ldc2_w 428
    //   35: lconst_1
    //   36: iconst_0
    //   37: invokevirtual 81	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   40: ldc_w 423
    //   43: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: return
    //   47: aload_0
    //   48: getfield 150	com/tencent/mm/plugin/appbrand/e:gMN	Lcom/tencent/mm/plugin/appbrand/q;
    //   51: invokevirtual 190	com/tencent/mm/plugin/appbrand/q:getRuntime	()Lcom/tencent/mm/plugin/appbrand/i;
    //   54: invokevirtual 205	com/tencent/mm/plugin/appbrand/i:ye	()Lcom/tencent/mm/plugin/appbrand/config/h;
    //   57: getfield 211	com/tencent/mm/plugin/appbrand/config/h:hhd	Lcom/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo;
    //   60: getfield 167	com/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo:gVu	I
    //   63: istore_3
    //   64: aload_0
    //   65: getfield 150	com/tencent/mm/plugin/appbrand/e:gMN	Lcom/tencent/mm/plugin/appbrand/q;
    //   68: invokevirtual 190	com/tencent/mm/plugin/appbrand/q:getRuntime	()Lcom/tencent/mm/plugin/appbrand/i;
    //   71: invokevirtual 205	com/tencent/mm/plugin/appbrand/i:ye	()Lcom/tencent/mm/plugin/appbrand/config/h;
    //   74: getfield 211	com/tencent/mm/plugin/appbrand/config/h:hhd	Lcom/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo;
    //   77: getfield 432	com/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo:gVt	I
    //   80: istore 4
    //   82: iload 4
    //   84: istore_2
    //   85: getstatic 74	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   88: ldc2_w 424
    //   91: ldc2_w 433
    //   94: lconst_1
    //   95: iconst_0
    //   96: invokevirtual 81	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   99: aload_0
    //   100: getfield 150	com/tencent/mm/plugin/appbrand/e:gMN	Lcom/tencent/mm/plugin/appbrand/q;
    //   103: invokevirtual 335	com/tencent/mm/plugin/appbrand/q:getAppId	()Ljava/lang/String;
    //   106: bipush 24
    //   108: invokestatic 440	com/tencent/mm/plugin/appbrand/report/c:br	(Ljava/lang/String;I)V
    //   111: aload_0
    //   112: getfield 150	com/tencent/mm/plugin/appbrand/e:gMN	Lcom/tencent/mm/plugin/appbrand/q;
    //   115: invokevirtual 335	com/tencent/mm/plugin/appbrand/q:getAppId	()Ljava/lang/String;
    //   118: iload_3
    //   119: iload_2
    //   120: sipush 778
    //   123: bipush 18
    //   125: invokestatic 443	com/tencent/mm/plugin/appbrand/report/c:a	(Ljava/lang/String;IIII)V
    //   128: ldc_w 423
    //   131: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   134: goto -88 -> 46
    //   137: astore 5
    //   139: iconst_m1
    //   140: istore_3
    //   141: goto -56 -> 85
    //   144: astore 5
    //   146: goto -5 -> 141
    //
    // Exception table:
    //   from	to	target	type
    //   47	64	137	java/lang/NullPointerException
    //   64	82	144	java/lang/NullPointerException
  }

  public final void dt(boolean paramBoolean)
  {
    AppMethodBeat.i(130058);
    com.tencent.mm.plugin.report.service.h.pYm.a(778L, 21L, 1L, false);
    if (paramBoolean)
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(778L, 23L, 1L, false);
      AppMethodBeat.o(130058);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(778L, 22L, 1L, false);
      com.tencent.mm.plugin.appbrand.report.c.br(this.gMN.getAppId(), 24);
      com.tencent.mm.plugin.appbrand.report.c.a(this.gMN.getAppId(), this.gMN.getRuntime().ye().hhd.gVu, this.gMN.getRuntime().ye().hhd.gVt, 778, 22);
      AppMethodBeat.o(130058);
    }
  }

  public final void wL(String paramString)
  {
    AppMethodBeat.i(130057);
    ab.i("MicroMsg.WAGameJsContextInterface", "hy: onAppScriptInjectBegin path:%s", new Object[] { paramString });
    if ((!bo.isNullOrNil(paramString)) && (paramString.equals("game.js")))
      a.aBG().huc = bo.yz();
    AppMethodBeat.o(130057);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d
 * JD-Core Version:    0.6.2
 */