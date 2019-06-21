package com.tencent.mm.ui.f.a;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.i;
import com.tencent.xweb.WebView;
import com.tencent.xweb.p;
import com.tencent.xweb.s;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public final class g extends i
{
  static final float[] zxQ;
  static final float[] zxR;
  static final FrameLayout.LayoutParams zxS;
  private String mUrl;
  private c.a zxT;
  private ProgressDialog zxU;
  private ImageView zxV;
  private WebView zxW;
  private FrameLayout zxX;

  static
  {
    AppMethodBeat.i(80339);
    zxQ = new float[] { 20.0F, 60.0F };
    zxR = new float[] { 40.0F, 60.0F };
    zxS = new FrameLayout.LayoutParams(-1, -1);
    AppMethodBeat.o(80339);
  }

  public g(Context paramContext, String paramString, c.a parama)
  {
    super(paramContext, 16973840);
    this.mUrl = paramString;
    this.zxT = parama;
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(80337);
    super.onCreate(paramBundle);
    this.zxU = new ProgressDialog(getContext());
    this.zxU.requestWindowFeature(1);
    this.zxU.setMessage(getContext().getString(2131299549));
    requestWindowFeature(1);
    this.zxX = new FrameLayout(getContext());
    this.zxV = new ImageView(getContext());
    this.zxV.setOnClickListener(new g.1(this));
    paramBundle = getContext().getResources().getDrawable(2130838349);
    this.zxV.setImageDrawable(paramBundle);
    this.zxV.setVisibility(4);
    int i = this.zxV.getDrawable().getIntrinsicWidth() / 2;
    paramBundle = new LinearLayout(getContext());
    this.zxW = new WebView(getContext());
    this.zxW.setVerticalScrollBarEnabled(false);
    this.zxW.setHorizontalScrollBarEnabled(false);
    this.zxW.setWebViewClient(new a((byte)0));
    this.zxW.getSettings().setJavaScriptEnabled(true);
    this.zxW.loadUrl(this.mUrl);
    this.zxW.setLayoutParams(zxS);
    this.zxW.setVisibility(4);
    paramBundle.setPadding(i, i, i, i);
    paramBundle.addView(this.zxW);
    this.zxX.addView(paramBundle);
    this.zxX.addView(this.zxV, new ViewGroup.LayoutParams(-2, -2));
    addContentView(this.zxX, new ViewGroup.LayoutParams(-1, -1));
    AppMethodBeat.o(80337);
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(80338);
    boolean bool;
    if (paramInt == 4)
    {
      this.zxT.onCancel();
      dismiss();
      bool = true;
      AppMethodBeat.o(80338);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(80338);
    }
  }

  final class a extends s
  {
    boolean zxZ = true;

    private a()
    {
    }

    public final void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
    {
      AppMethodBeat.i(80334);
      super.a(paramWebView, paramInt, paramString1, paramString2);
      this.zxZ = false;
      g.a(g.this).a(new b(paramString1, paramInt, paramString2));
      try
      {
        g.this.dismiss();
        g.b(g.this).dismiss();
        AppMethodBeat.o(80334);
        return;
      }
      catch (Exception paramWebView)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.FbDialog", paramWebView, "", new Object[0]);
          AppMethodBeat.o(80334);
        }
      }
    }

    public final boolean a(WebView paramWebView, String paramString)
    {
      boolean bool = true;
      AppMethodBeat.i(80333);
      ab.d("Facebook-WebView", "Redirect URL: ".concat(String.valueOf(paramString)));
      if (paramString.startsWith("fbconnect://success"))
      {
        Bundle localBundle = f.asa(paramString);
        paramString = localBundle.getString("error");
        paramWebView = paramString;
        if (paramString == null)
          paramWebView = localBundle.getString("error_type");
        if (paramWebView == null)
        {
          g.a(g.this).p(localBundle);
          g.this.dismiss();
          AppMethodBeat.o(80333);
        }
      }
      while (true)
      {
        return bool;
        if ((paramWebView.equals("access_denied")) || (paramWebView.equals("OAuthAccessDeniedException")))
        {
          g.a(g.this).onCancel();
          break;
        }
        g.a(g.this).a(new e(paramWebView));
        break;
        if (paramString.startsWith("fbconnect://cancel"))
        {
          g.a(g.this).onCancel();
          try
          {
            g.this.dismiss();
            AppMethodBeat.o(80333);
          }
          catch (Exception paramWebView)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.FbDialog", paramWebView, "", new Object[0]);
          }
        }
        else if (paramString.contains("touch"))
        {
          AppMethodBeat.o(80333);
          bool = false;
        }
        else
        {
          g.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
          AppMethodBeat.o(80333);
        }
      }
    }

    public final void b(WebView paramWebView, String paramString)
    {
      AppMethodBeat.i(80336);
      super.b(paramWebView, paramString);
      this.zxZ = false;
      try
      {
        g.b(g.this).dismiss();
        g.c(g.this).setBackgroundColor(0);
        g.d(g.this).setVisibility(0);
        g.e(g.this).setVisibility(0);
        AppMethodBeat.o(80336);
        return;
      }
      catch (Exception paramWebView)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.FbDialog", paramWebView, "", new Object[0]);
      }
    }

    public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      AppMethodBeat.i(80335);
      ab.d("Facebook-WebView", "Webview loading URL: ".concat(String.valueOf(paramString)));
      super.b(paramWebView, paramString, paramBitmap);
      try
      {
        g.b(g.this).show();
        paramString = g.b(g.this);
        paramWebView = new com/tencent/mm/ui/f/a/g$a$1;
        paramWebView.<init>(this);
        paramString.setOnDismissListener(paramWebView);
        AppMethodBeat.o(80335);
        return;
      }
      catch (Exception paramWebView)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.FbDialog", paramWebView, "", new Object[0]);
          AppMethodBeat.o(80335);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.a.g
 * JD-Core Version:    0.6.2
 */