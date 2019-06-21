package com.tencent.luggage.sdk.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.plugin.appbrand.page.aj;
import com.tencent.mm.plugin.appbrand.page.q;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.f;
import java.util.HashMap;
import java.util.Map;

public class a extends u
  implements com.tencent.mm.plugin.appbrand.jsapi.h
{
  public final Runnable bQS;
  public final Map<String, Object> bQT;

  public a()
  {
    AppMethodBeat.i(101639);
    this.bQS = new a.2(this);
    this.bQT = new HashMap();
    AppMethodBeat.o(101639);
  }

  private void xS()
  {
    AppMethodBeat.i(101649);
    FrameLayout localFrameLayout = (FrameLayout)aBk().findViewById(2131820571);
    if (localFrameLayout != null)
    {
      localFrameLayout.setVisibility(8);
      if (!(localFrameLayout.getBackground() instanceof BitmapDrawable))
        break label68;
    }
    label68: for (Bitmap localBitmap = ((BitmapDrawable)localFrameLayout.getBackground()).getBitmap(); ; localBitmap = null)
    {
      localFrameLayout.setBackground(null);
      if (localBitmap != null)
        localBitmap.recycle();
      AppMethodBeat.o(101649);
      return;
    }
  }

  public <T> T a(int paramInt, Bundle paramBundle, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(101650);
    if (1 == paramInt)
    {
      runOnUiThread(new a.4(this));
      a(new a.5(this));
    }
    paramBundle = super.a(paramInt, paramBundle, paramArrayOfObject);
    AppMethodBeat.o(101650);
    return paramBundle;
  }

  public void a(Context paramContext, i parami)
  {
    AppMethodBeat.i(101643);
    super.a(paramContext, parami);
    aJz().setOnTrimListener(new a.1(this));
    AppMethodBeat.o(101643);
  }

  public void bN(String paramString)
  {
    AppMethodBeat.i(101646);
    if (!xL().xY().b(this, a.a.class))
    {
      xQ();
      AppMethodBeat.o(101646);
    }
    while (true)
    {
      return;
      d.i("MicroMsg.AppBrandPageViewLU", "publishPageNotFound url:%s", new Object[] { paramString });
      HashMap localHashMap = new HashMap();
      localHashMap.put("path", com.tencent.luggage.g.h.bO(paramString));
      localHashMap.put("query", com.tencent.luggage.g.h.bP(paramString));
      localHashMap.put("rawPath", paramString);
      localHashMap.put("isEntryPage", Boolean.valueOf(bo.nullAsNil(paramString).equals(xL().atc())));
      b(new a.a((byte)0).s(localHashMap));
      al.n(this.bQS, 2000L);
      AppMethodBeat.o(101646);
    }
  }

  public final void d(String paramString, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(101651);
    runOnUiThread(new a.6(this, paramMap, paramString));
    AppMethodBeat.o(101651);
  }

  public com.tencent.luggage.sdk.b.b xL()
  {
    AppMethodBeat.i(101640);
    com.tencent.luggage.sdk.b.b localb = (com.tencent.luggage.sdk.b.b)super.getRuntime();
    AppMethodBeat.o(101640);
    return localb;
  }

  public b xM()
  {
    AppMethodBeat.i(101641);
    b localb = (b)super.xT();
    AppMethodBeat.o(101641);
    return localb;
  }

  public void xN()
  {
    AppMethodBeat.i(101642);
    super.xN();
    al.af(this.bQS);
    AppMethodBeat.o(101642);
  }

  protected void xO()
  {
    AppMethodBeat.i(101644);
    aBf().removeAll();
    AppMethodBeat.o(101644);
  }

  public final boolean xP()
  {
    AppMethodBeat.i(101645);
    boolean bool = super.xP();
    if (bool)
      t.d(this);
    AppMethodBeat.o(101645);
    return bool;
  }

  public final void xQ()
  {
    AppMethodBeat.i(101647);
    aJG();
    if (xL().asV().getPageCount() < 2)
      xL().gNR = true;
    com.tencent.mm.plugin.appbrand.page.e locale = new com.tencent.mm.plugin.appbrand.page.e(this.mContext, xL());
    aBk().addView(locale);
    AppMethodBeat.o(101647);
  }

  public c<Bitmap> xR()
  {
    AppMethodBeat.i(101648);
    c localc = f.dMn().f(new a.3(this));
    AppMethodBeat.o(101648);
    return localc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.a.a.a
 * JD-Core Version:    0.6.2
 */