package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public final class n
  implements h
{
  private int gOW;
  private final g uyr;
  private final f uys;
  private h.a uzE;
  private d uzF;
  private c uzG;
  private String uzH;
  private String uzI;
  private final e uzJ;
  private boolean uzK;
  private boolean uzL;
  private String uzM;

  public n(g paramg)
  {
    AppMethodBeat.i(8255);
    this.gOW = 0;
    this.uyr = paramg;
    if (this.uyr.getIntent().getExtras() != null)
      this.gOW = this.uyr.getIntent().getIntExtra("minimize_secene", this.gOW);
    this.uys = new n.1(this);
    this.uzJ = new n.2(this);
    this.uzK = this.uyr.getIntent().getBooleanExtra("from_bag", false);
    this.uzM = this.uyr.getIntent().getStringExtra("from_bag_id");
    this.uzI = this.uyr.getIntent().getStringExtra("from_bag_icon");
    if (cXe())
      if (!this.uzK)
      {
        ab.i("MicroMsg.WebViewUIBagHelper", "not from bag, can swipe to bag");
        this.uzF = new d(this.uyr, this.uys);
        AppMethodBeat.o(8255);
      }
    while (true)
    {
      return;
      this.uzG = new c(this.uyr, this.uys);
      AppMethodBeat.o(8255);
      continue;
      ab.i("MicroMsg.WebViewUIBagHelper", "not support swipeback");
      AppMethodBeat.o(8255);
    }
  }

  private void Jy(int paramInt)
  {
    AppMethodBeat.i(8265);
    ab.v("MicroMsg.WebViewUIBagHelper", "kvReport op:%d", new Object[] { Integer.valueOf(paramInt) });
    if (this.uzE == null)
    {
      ab.w("MicroMsg.WebViewUIBagHelper", "kvReport mIPCDelegate null");
      AppMethodBeat.o(8265);
    }
    while (true)
    {
      return;
      dbn();
      String str1 = this.uzH;
      String str2 = this.uzM;
      this.uzE.y(new Object[] { str1, Integer.valueOf(paramInt), Integer.valueOf(0), str2 });
      AppMethodBeat.o(8265);
    }
  }

  private Bundle Jz(int paramInt)
  {
    AppMethodBeat.i(8262);
    Bundle localBundle = u(paramInt, new Bundle());
    AppMethodBeat.o(8262);
    return localBundle;
  }

  private boolean cXe()
  {
    AppMethodBeat.i(8266);
    boolean bool = this.uyr.cXe();
    AppMethodBeat.o(8266);
    return bool;
  }

  private void dbn()
  {
    AppMethodBeat.i(8264);
    if (bo.isNullOrNil(this.uzH))
      this.uzH = this.uyr.getUrl();
    AppMethodBeat.o(8264);
  }

  private Bundle u(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(8263);
    if (9 != paramInt)
      ab.i("MicroMsg.WebViewUIBagHelper", "Tools doBagLogic : %d, hashcode:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(hashCode()) });
    if (this.uzE == null)
    {
      ab.w("MicroMsg.WebViewUIBagHelper", "doBagLogic mIPCDelegate null");
      paramBundle = null;
      AppMethodBeat.o(8263);
      return paramBundle;
    }
    paramBundle.putInt("key_action", paramInt);
    switch (paramInt)
    {
    case 2:
    case 3:
    default:
    case 1:
    case 5:
    case 6:
    case 7:
    case 4:
    }
    while (true)
    {
      paramBundle = this.uzE.T(paramBundle);
      AppMethodBeat.o(8263);
      break;
      this.uzL = true;
      dbn();
      paramBundle.putString("key_url", this.uzH);
      paramBundle.putString("key_bag_icon", this.uzI);
      paramBundle.putInt("key_scene", this.gOW);
      paramBundle.putBundle("key_extras", k.aC(this.uyr.getIntent()));
      paramBundle.putBoolean("key_from_bag", this.uzK);
      continue;
      paramBundle.putBoolean("key_in_webviewui_from_bag", true);
      continue;
      paramBundle.putBoolean("key_in_webviewui_from_bag", false);
      continue;
      paramBundle.putString("key_bag_id", this.uzM);
      continue;
      this.uzL = false;
    }
  }

  public final boolean Jx(int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(8258);
    boolean bool2 = dbd();
    ab.i("MicroMsg.WebViewUIBagHelper", "onWebViewClose hasBag:%b", new Object[] { Boolean.valueOf(bool2) });
    if (bool2)
    {
      Jy(paramInt);
      Point localPoint = (Point)Jz(8).getParcelable("key_current_bag_pos");
      i.a(this.uyr, localPoint, this.uzJ);
      AppMethodBeat.o(8258);
      bool1 = true;
    }
    while (true)
    {
      return bool1;
      AppMethodBeat.o(8258);
    }
  }

  public final void a(h.a parama)
  {
    AppMethodBeat.i(8256);
    ab.i("MicroMsg.WebViewUIBagHelper", "onIPCReady");
    this.uzE = parama;
    if (!this.uzK)
    {
      if ((!cXe()) || (this.uzF == null))
        break label96;
      this.uzF.start();
      AppMethodBeat.o(8256);
    }
    while (true)
    {
      return;
      Jz(5);
      if ((cXe()) && (this.uzG != null))
      {
        parama = this.uzG;
        parama.uyr.a(new c.1(parama));
      }
      label96: AppMethodBeat.o(8256);
    }
  }

  public final void afX(String paramString)
  {
    this.uzI = paramString;
  }

  public final void afY(String paramString)
  {
    AppMethodBeat.i(8260);
    ab.i("MicroMsg.WebViewUIBagHelper", "updateUrl url:%s", new Object[] { paramString });
    this.uzH = paramString;
    AppMethodBeat.o(8260);
  }

  public final void dbc()
  {
    AppMethodBeat.i(8257);
    ab.i("MicroMsg.WebViewUIBagHelper", "onWebViewUIDestroy %b", new Object[] { Boolean.valueOf(this.uzK) });
    Jz(6);
    if (this.uzF != null)
    {
      d locald = this.uzF;
      al.d(new d.2(locald));
      locald.uyr.a(null);
      locald.uyr = null;
    }
    if (this.uzK)
      Jz(3);
    AppMethodBeat.o(8257);
  }

  public final boolean dbd()
  {
    boolean bool1 = true;
    AppMethodBeat.i(8261);
    ab.i("MicroMsg.WebViewUIBagHelper", "hasBagOfCurrentPage fromBag:%b，isTransformBag:%b, hashcode:%d", new Object[] { Boolean.valueOf(this.uzK), Boolean.valueOf(this.uzL), Integer.valueOf(hashCode()) });
    if (this.uzL)
      AppMethodBeat.o(8261);
    while (true)
    {
      return bool1;
      if (!this.uzK)
      {
        AppMethodBeat.o(8261);
        bool1 = false;
      }
      else
      {
        Bundle localBundle = Jz(7);
        if (localBundle == null)
        {
          AppMethodBeat.o(8261);
          bool1 = false;
        }
        else
        {
          boolean bool2 = localBundle.getBoolean("key_has_bag");
          ab.i("MicroMsg.WebViewUIBagHelper", "hasBagOfCurrentPage  hasBag:%b", new Object[] { Boolean.valueOf(bool2) });
          if ((bool2) && (this.uzK))
          {
            AppMethodBeat.o(8261);
          }
          else
          {
            AppMethodBeat.o(8261);
            bool1 = false;
          }
        }
      }
    }
  }

  public final void nT(boolean paramBoolean)
  {
    AppMethodBeat.i(8259);
    ab.i("MicroMsg.WebViewUIBagHelper", "onMenuMinimizeSelected cancelCurrentBag:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      Jz(4);
      if (this.uzG != null)
        this.uzG.uyr.a(null);
      Jy(18);
      com.tencent.mm.ui.widget.snackbar.b.i(this.uyr.getActivity(), this.uyr.getActivity().getString(2131302139));
      if (cXe())
      {
        this.uzF = new d(this.uyr, this.uys);
        this.uzF.start();
      }
      AppMethodBeat.o(8259);
      return;
    }
    Jy(16);
    Object localObject = Jz(8);
    int i;
    if (localObject == null)
      i = b.uyk;
    for (localObject = new Point(i, i); ; localObject = (Point)((Bundle)localObject).getParcelable("key_current_bag_pos"))
    {
      i.a(this.uyr, (Point)localObject, this.uzJ);
      AppMethodBeat.o(8259);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.n
 * JD-Core Version:    0.6.2
 */