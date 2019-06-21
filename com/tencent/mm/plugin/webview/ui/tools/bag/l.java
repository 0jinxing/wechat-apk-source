package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

public enum l
{
  private long qBy;
  private WebViewBag uzr;
  private a uzs;
  private boolean uzt;
  public l.a uzu;
  public LinkedList<l.b> uzv;

  static
  {
    AppMethodBeat.i(8242);
    uzq = new l("INSTANCE");
    uzw = new l[] { uzq };
    AppMethodBeat.o(8242);
  }

  private l()
  {
    AppMethodBeat.i(8220);
    this.qBy = -1L;
    this.uzu = new l.a();
    this.uzv = new LinkedList();
    AppMethodBeat.o(8220);
  }

  private void Jy(int paramInt)
  {
    AppMethodBeat.i(8235);
    ab.v("MicroMsg.WebViewBagMgr", "kvReport op:%d", new Object[] { Integer.valueOf(paramInt) });
    h.pYm.e(11576, new Object[] { this.uzu.url, Integer.valueOf(paramInt), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis() - this.uzu.fAx), this.uzu.id });
    AppMethodBeat.o(8235);
  }

  private boolean dbf()
  {
    AppMethodBeat.i(8221);
    if (System.currentTimeMillis() - this.qBy > 500L);
    for (boolean bool = true; ; bool = false)
    {
      if (!bool)
        ab.w("MicroMsg.WebViewBagMgr", "click to fast!!!");
      AppMethodBeat.o(8221);
      return bool;
    }
  }

  private void dbj()
  {
    AppMethodBeat.i(8232);
    ab.i("MicroMsg.WebViewBagMgr", "attachBag");
    WindowManager localWindowManager = (WindowManager)ah.getContext().getSystemService("window");
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    if (d.iW(26))
      localLayoutParams.type = 2038;
    while (true)
    {
      localLayoutParams.format = 1;
      localLayoutParams.packageName = ah.getContext().getPackageName();
      localLayoutParams.flags = 40;
      localLayoutParams.gravity = 51;
      localLayoutParams.width = b.uyj;
      localLayoutParams.height = b.uyj;
      localLayoutParams.x = this.uzu.uzB;
      localLayoutParams.y = this.uzu.uzA;
      try
      {
        localWindowManager.addView(this.uzr, localLayoutParams);
        dbl();
        AppMethodBeat.o(8232);
        return;
        localLayoutParams.type = 2002;
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.WebViewBagMgr", "add failed %s", new Object[] { localException });
          AppMethodBeat.o(8232);
        }
      }
    }
  }

  private void dbk()
  {
    AppMethodBeat.i(8233);
    ab.i("MicroMsg.WebViewBagMgr", "unAttachBag");
    WindowManager localWindowManager;
    if (this.uzr != null)
      localWindowManager = (WindowManager)ah.getContext().getSystemService("window");
    while (true)
    {
      try
      {
        localWindowManager.removeView(this.uzr);
        this.uzr = null;
        if (this.uzs != null)
        {
          this.uzs.daX();
          this.uzs = null;
        }
        AppMethodBeat.o(8233);
        return;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.WebViewBagMgr", "remove failed %s", new Object[] { localException });
        continue;
      }
      ab.e("MicroMsg.WebViewBagMgr", "unAttachBag mBag null");
    }
  }

  private void dbl()
  {
    AppMethodBeat.i(8234);
    ab.i("MicroMsg.WebViewBagMgr", "setAngryInfo mBagInfo.lastActiveTime:%d", new Object[] { Long.valueOf(this.uzu.fAx) });
    if (this.uzr == null)
      AppMethodBeat.o(8234);
    while (true)
    {
      return;
      if (dbm())
      {
        this.uzr.j(60000, 100, this.uzu.fAx + 2000L);
        AppMethodBeat.o(8234);
      }
      else
      {
        this.uzr.j(3600000, 30000, this.uzu.fAx + 3600000L);
        AppMethodBeat.o(8234);
      }
    }
  }

  private static boolean dbm()
  {
    AppMethodBeat.i(8236);
    boolean bool = "1".equals((String)g.RP().Ry().get(ac.a.xVq, "0"));
    AppMethodBeat.o(8236);
    return bool;
  }

  final void a(String paramString1, int paramInt, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(8231);
    if ((!paramBoolean) || (bo.isNullOrNil(this.uzu.id)))
    {
      Jy(23);
      this.uzu.id = ag.ck(String.format("bagId#%d#%s", new Object[] { Long.valueOf(System.currentTimeMillis()), this.uzu.url }));
    }
    this.uzu.url = paramString1;
    this.uzu.cIY = paramString2;
    this.uzu.scene = paramInt;
    this.uzu.fAx = bo.anU();
    this.uzu.uzC = k.ae(paramBundle);
    this.uzu.save();
    AppMethodBeat.o(8231);
  }

  public final boolean afZ(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(8224);
    ab.i("MicroMsg.WebViewBagMgr", "hasBagOfThePage targetId:%s currentId:%s", new Object[] { paramString, this.uzu.id });
    if ((!bo.isNullOrNil(this.uzu.url)) && (bo.nullAsNil(paramString).equals(this.uzu.id)))
      AppMethodBeat.o(8224);
    while (true)
    {
      return bool;
      AppMethodBeat.o(8224);
      bool = false;
    }
  }

  public final void bi(float paramFloat)
  {
    AppMethodBeat.i(8230);
    if (this.uzr == null)
      AppMethodBeat.o(8230);
    while (true)
    {
      return;
      this.uzr.setAlpha(paramFloat);
      if (paramFloat == 0.0F)
      {
        this.uzr.setVisibility(8);
        AppMethodBeat.o(8230);
      }
      else
      {
        this.uzr.setVisibility(0);
        AppMethodBeat.o(8230);
      }
    }
  }

  public final void cYT()
  {
    AppMethodBeat.i(8229);
    if (this.uzr == null)
      AppMethodBeat.o(8229);
    while (true)
    {
      return;
      this.uzr.setVisibility(8);
      AppMethodBeat.o(8229);
    }
  }

  public final void dbg()
  {
    AppMethodBeat.i(8223);
    ab.i("MicroMsg.WebViewBagMgr", "clearBag mCurrentUrl:%s", new Object[] { this.uzu.url });
    cYT();
    Object localObject = this.uzu;
    ((l.a)localObject).id = null;
    ((l.a)localObject).url = null;
    ((l.a)localObject).cIY = null;
    ((l.a)localObject).fAx = 0L;
    ((l.a)localObject).scene = 0;
    ((l.a)localObject).uzC = new JSONObject();
    ((l.a)localObject).save();
    dbk();
    localObject = this.uzv.iterator();
    while (((Iterator)localObject).hasNext())
      ((l.b)((Iterator)localObject).next()).cXm();
    AppMethodBeat.o(8223);
  }

  public final Point dbh()
  {
    AppMethodBeat.i(8226);
    Point localPoint = new Point(this.uzu.uzB, this.uzu.uzA);
    AppMethodBeat.o(8226);
    return localPoint;
  }

  public final void dbi()
  {
    AppMethodBeat.i(8228);
    ab.i("MicroMsg.WebViewBagMgr", "removeBag");
    if (this.uzr == null)
      AppMethodBeat.o(8228);
    while (true)
    {
      return;
      this.uzr.a(new l.5(this));
      al.n(new l.6(this), 120L);
      AppMethodBeat.o(8228);
    }
  }

  public final void nU(boolean paramBoolean)
  {
    AppMethodBeat.i(8222);
    ab.i("MicroMsg.WebViewBagMgr", "checkResumeBag mInWebViewUIFromBag:%b", new Object[] { Boolean.valueOf(this.uzt) });
    if ((!bo.isNullOrNil(this.uzu.url)) && (!this.uzt) && (dbf()))
      if ((this.uzr != null) && (this.uzr.getVisibility() == 0))
      {
        ab.i("MicroMsg.WebViewBagMgr", "already show");
        this.uzr.setTouchEnable(true);
        AppMethodBeat.o(8222);
      }
    while (true)
    {
      return;
      nW(paramBoolean);
      ab.i("MicroMsg.WebViewBagMgr", "checkResumeBag show bag");
      AppMethodBeat.o(8222);
      continue;
      cYT();
      ab.i("MicroMsg.WebViewBagMgr", "checkResumeBag hide bag");
      AppMethodBeat.o(8222);
    }
  }

  public final void nV(boolean paramBoolean)
  {
    AppMethodBeat.i(8225);
    ab.i("MicroMsg.WebViewBagMgr", "markInWebViewUIFromBag inWebViewUIFromBag:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.uzt = paramBoolean;
    AppMethodBeat.o(8225);
  }

  final void nW(boolean paramBoolean)
  {
    AppMethodBeat.i(8227);
    ab.i("MicroMsg.WebViewBagMgr", "showBag url:%s", new Object[] { this.uzu.url });
    if (!com.tencent.mm.compatible.f.b.bF(ah.getContext()))
    {
      ab.w("MicroMsg.WebViewBagMgr", "showBag: no float window permission");
      AppMethodBeat.o(8227);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(this.uzu.url))
      {
        dbg();
        AppMethodBeat.o(8227);
      }
      else
      {
        if (this.uzr == null);
        for (boolean bool = true; ; bool = false)
        {
          if (this.uzr == null)
          {
            this.uzs = new a(new l.2(this));
            this.uzr = new WebViewBag(ah.getContext(), null);
            this.uzr.setListener(new l.3(this));
            this.uzr.setOnClickListener(new l.4(this));
          }
          bi(1.0F);
          this.uzr.setTouchEnable(true);
          this.uzr.setIcon(this.uzu.cIY);
          dbl();
          ab.i("MicroMsg.WebViewBagMgr", "bag showed needAttach:%b mCurrentBagId:%s", new Object[] { Boolean.valueOf(bool), this.uzu.id });
          if (!bool)
            break label280;
          if (!paramBoolean)
            break label267;
          this.uzr.setVisibility(4);
          dbj();
          this.uzr.setVisibility(0);
          this.uzr.dbe();
          AppMethodBeat.o(8227);
          break;
        }
        label267: dbj();
        AppMethodBeat.o(8227);
        continue;
        label280: if (this.uzr.getVisibility() != 0)
        {
          this.uzr.setVisibility(0);
          if (paramBoolean)
          {
            this.uzr.dbe();
            AppMethodBeat.o(8227);
          }
        }
        else
        {
          ab.i("MicroMsg.WebViewBagMgr", "already showed");
          AppMethodBeat.o(8227);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.l
 * JD-Core Version:    0.6.2
 */