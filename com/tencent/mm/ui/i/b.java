package com.tencent.mm.ui.i;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import com.tencent.xweb.p;

@SuppressLint({"SetJavaScriptEnabled"})
@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public final class b extends Dialog
{
  static final float[] zxQ;
  static final float[] zxR;
  static final FrameLayout.LayoutParams zxS;
  private String mUrl;
  private b.a zLh;
  private ProgressDialog zxU;
  private ImageView zxV;
  private WebView zxW;
  private FrameLayout zxX;

  static
  {
    AppMethodBeat.i(80369);
    zxQ = new float[] { 20.0F, 60.0F };
    zxR = new float[] { 40.0F, 60.0F };
    zxS = new FrameLayout.LayoutParams(-1, -1);
    AppMethodBeat.o(80369);
  }

  public b(Context paramContext, String paramString, b.a parama)
  {
    super(paramContext, 16973840);
    this.mUrl = paramString;
    this.zLh = parama;
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(80367);
    super.onCreate(paramBundle);
    this.zxU = new ProgressDialog(getContext());
    this.zxU.requestWindowFeature(1);
    this.zxU.setMessage(getContext().getString(2131304132));
    requestWindowFeature(1);
    this.zxX = new FrameLayout(getContext());
    this.zxV = new ImageView(getContext());
    this.zxV.setOnClickListener(new b.1(this));
    paramBundle = getContext().getResources().getDrawable(2130838349);
    this.zxV.setImageDrawable(paramBundle);
    this.zxV.setVisibility(4);
    int i = this.zxV.getDrawable().getIntrinsicWidth() / 2;
    paramBundle = new LinearLayout(getContext());
    this.zxW = new WebView(getContext());
    this.zxW.setVerticalScrollBarEnabled(false);
    this.zxW.setHorizontalScrollBarEnabled(false);
    this.zxW.setWebViewClient(new b.b(this, (byte)0));
    this.zxW.getSettings().setJavaScriptEnabled(true);
    this.zxW.loadUrl(this.mUrl);
    this.zxW.setLayoutParams(zxS);
    this.zxW.setVisibility(4);
    paramBundle.setPadding(i, i, i, i);
    paramBundle.addView(this.zxW);
    this.zxX.addView(paramBundle);
    this.zxX.addView(this.zxV, new ViewGroup.LayoutParams(-2, -2));
    addContentView(this.zxX, new ViewGroup.LayoutParams(-1, -1));
    AppMethodBeat.o(80367);
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(80368);
    boolean bool;
    if (paramInt == 4)
    {
      this.zLh.onCancel();
      dismiss();
      bool = true;
      AppMethodBeat.o(80368);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(80368);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.i.b
 * JD-Core Version:    0.6.2
 */