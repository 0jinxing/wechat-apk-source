package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.p;

@com.tencent.mm.ui.base.a(3)
public class FTSSearchTabWebViewUI extends FTSBaseWebViewUI
{
  public final void Jw(int paramInt)
  {
    AppMethodBeat.i(8538);
    if ((this.pzf == null) || (this.pzf.getSettings() == null))
      AppMethodBeat.o(8538);
    while (true)
    {
      return;
      float f = this.mController.ylL.getSharedPreferences(ah.doA(), 0).getFloat("current_text_size_scale_key", 1.0F);
      if (f >= 2.025F)
      {
        this.pzf.getSettings().setTextZoom(160);
        AppMethodBeat.o(8538);
      }
      else if (f >= 1.875F)
      {
        this.pzf.getSettings().setTextZoom(150);
        AppMethodBeat.o(8538);
      }
      else if (f >= 1.625F)
      {
        this.pzf.getSettings().setTextZoom(140);
        AppMethodBeat.o(8538);
      }
      else if (f >= 1.375F)
      {
        this.pzf.getSettings().setTextZoom(130);
        AppMethodBeat.o(8538);
      }
      else if (f >= 1.25F)
      {
        this.pzf.getSettings().setTextZoom(120);
        AppMethodBeat.o(8538);
      }
      else if (f >= 1.125F)
      {
        this.pzf.getSettings().setTextZoom(110);
        AppMethodBeat.o(8538);
      }
      else if (f >= 1.0F)
      {
        this.pzf.getSettings().setTextZoom(100);
        AppMethodBeat.o(8538);
      }
      else if (f >= 0.875F)
      {
        this.pzf.getSettings().setTextZoom(90);
        AppMethodBeat.o(8538);
      }
      else
      {
        this.pzf.getSettings().setTextZoom(80);
        AppMethodBeat.o(8538);
      }
    }
  }

  public boolean aMo()
  {
    AppMethodBeat.i(8534);
    if (this.mIr != null)
      this.mIr.getFtsEditText().mLL.clearFocus();
    boolean bool = super.aMo();
    AppMethodBeat.o(8534);
    return bool;
  }

  protected String getHint()
  {
    AppMethodBeat.i(8533);
    String str = getIntent().getStringExtra("key_search_input_hint");
    if (!TextUtils.isEmpty(str))
      AppMethodBeat.o(8533);
    while (true)
    {
      return str;
      int i = -1;
      switch (this.type)
      {
      default:
      case 1:
      case 8:
      case 2:
      case 16:
      case 64:
      case 256:
      case 384:
      case 128:
      case 512:
      case 1024:
      }
      while (true)
      {
        if (this.scene == 56)
          i = 2131305953;
        if (i >= 0)
          break label219;
        str = ah.getContext().getResources().getString(2131297040);
        AppMethodBeat.o(8533);
        break;
        i = 2131302837;
        continue;
        i = 2131300120;
        continue;
        i = 2131302836;
        continue;
        i = 2131300118;
        continue;
        i = 2131296613;
        continue;
        i = 2131300107;
        continue;
        i = 2131300108;
        continue;
        i = 2131300116;
        continue;
        i = 2131300117;
      }
      label219: str = ah.getContext().getResources().getString(2131302835, new Object[] { ah.getContext().getResources().getString(i) });
      AppMethodBeat.o(8533);
    }
  }

  public void onClickCancelBtn(View paramView)
  {
    AppMethodBeat.i(8537);
    super.onClickCancelBtn(paramView);
    finish();
    AppMethodBeat.o(8537);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(8532);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = TransitionInflater.from(this).inflateTransition(17760258);
      paramBundle.excludeTarget(getWindow().getDecorView().findViewById(2131820940), true);
      paramBundle.excludeTarget(16908335, true);
      getWindow().setEnterTransition(paramBundle);
    }
    AppMethodBeat.o(8532);
  }

  public void onPause()
  {
    AppMethodBeat.i(8536);
    super.onPause();
    an.cVw();
    AppMethodBeat.o(8536);
  }

  public void onResume()
  {
    AppMethodBeat.i(8535);
    super.onResume();
    an.cVv();
    AppMethodBeat.o(8535);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI
 * JD-Core Version:    0.6.2
 */