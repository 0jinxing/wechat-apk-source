package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.ComponentName;
import android.net.Uri;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.ah;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.stub.d.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.k.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.k.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.Map;

public class b extends com.tencent.mm.plugin.webview.ui.tools.widget.k
{
  public b(MMWebView paramMMWebView)
  {
    super(paramMMWebView, (byte)0);
    AppMethodBeat.i(8678);
    this.uJC = new a((byte)0);
    AppMethodBeat.o(8678);
  }

  public boolean agc(String paramString)
  {
    AppMethodBeat.i(8679);
    boolean bool = super.agc(paramString);
    AppMethodBeat.o(8679);
    return bool;
  }

  public void dbU()
  {
    AppMethodBeat.i(8680);
    try
    {
      this.uzS.a(this.uJt, true, null);
      if (agD(this.uJt))
      {
        AppMethodBeat.o(8680);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.GameFloatWebViewClient", "postBinded, jumpToActivity, ex = " + localException.getMessage());
        continue;
        Uri localUri = Uri.parse(this.uJt);
        Object localObject = localUri;
        if (localUri.getScheme() == null)
        {
          this.uJt += "http://";
          localObject = Uri.parse(this.uJt);
        }
        if (((Uri)localObject).getScheme().startsWith("http"))
        {
          ab.i("MicroMsg.GameFloatWebViewClient", "uri scheme not startwith http, scheme = " + ((Uri)localObject).getScheme());
          if (this.uJy);
          for (localObject = ""; ; localObject = this.uJt)
          {
            this.uJr = new k.a((String)localObject);
            this.uJy = false;
            if ((!this.uJn) && (!this.uFu.has(this.uJt)))
              break label310;
            if (ah.aes(this.uJt))
              break label262;
            ab.f("MicroMsg.GameFloatWebViewClient", "loadInitialUrl, canLoadUrl fail, url = " + this.uJt);
            agd(this.uJt);
            AppMethodBeat.o(8680);
            break;
          }
          label262: if (afI(this.uJt))
          {
            NT(this.uJt);
            AppMethodBeat.o(8680);
          }
          else
          {
            this.fow.loadUrl(this.uJt);
            AppMethodBeat.o(8680);
            continue;
            label310: if (afI(this.uJt))
            {
              NT(this.uJt);
              this.uJu = this.uJt;
            }
            bI(this.uJt, false);
            AppMethodBeat.o(8680);
          }
        }
        else if (!ah.aes(this.uJt))
        {
          agd(this.uJt);
          AppMethodBeat.o(8680);
        }
        else
        {
          this.fow.loadUrl(this.uJt);
          AppMethodBeat.o(8680);
        }
      }
    }
  }

  public final boolean dbV()
  {
    return this.uJz;
  }

  public final String dbW()
  {
    return this.mTH;
  }

  public final Map dbX()
  {
    return this.uJB;
  }

  final class a extends k.c
  {
    private a()
    {
      super();
    }

    public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      AppMethodBeat.i(8676);
      ab.i("MicroMsg.GameFloatWebViewClient", "onServiceConnected");
      if (b.this.fow == null)
      {
        ab.e("MicroMsg.GameFloatWebViewClient", "onServiceConnected, activity destroyed");
        AppMethodBeat.o(8676);
      }
      while (true)
      {
        return;
        try
        {
          b.this.uzS = d.a.G(paramIBinder);
          b.this.uzS.a(b.this.uJD, b.this.fow.hashCode());
          b.this.dcU();
          b.this.a(b.this.uzS, b.this.uFu);
          b.this.dbU();
          AppMethodBeat.o(8676);
        }
        catch (Exception paramComponentName)
        {
          ab.e("MicroMsg.GameFloatWebViewClient", "addCallback fail, ex = %s", new Object[] { paramComponentName.getMessage() });
          AppMethodBeat.o(8676);
        }
      }
    }

    public final void onServiceDisconnected(ComponentName paramComponentName)
    {
      AppMethodBeat.i(8677);
      super.onServiceDisconnected(paramComponentName);
      AppMethodBeat.o(8677);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.b
 * JD-Core Version:    0.6.2
 */