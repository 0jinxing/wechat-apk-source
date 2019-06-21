package com.tencent.mm.plugin.downloader_app.detail;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.tencent.luggage.d.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.statusbar.b;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import java.lang.reflect.Field;

public class DownloadDetailUI extends MMActivity
{
  private a kOf;

  public final int getLayoutId()
  {
    return -1;
  }

  public void initSwipeBack()
  {
    AppMethodBeat.i(136038);
    super.initSwipeBack();
    if (getSwipeBackLayout() == null)
    {
      AppMethodBeat.o(136038);
      return;
    }
    View localView1 = getSwipeBackLayout().getChildAt(0);
    getSwipeBackLayout().removeView(localView1);
    b localb = new b(this);
    if ((localView1 instanceof FrameLayout))
    {
      View localView2 = ((FrameLayout)localView1).getChildAt(0);
      ViewGroup.LayoutParams localLayoutParams = localView2.getLayoutParams();
      ((FrameLayout)localView1).removeView(localView2);
      localb.addView(localView2, localLayoutParams);
    }
    while (true)
    {
      getSwipeBackLayout().addView(localb);
      getSwipeBackLayout().setContentView(localb);
      AppMethodBeat.o(136038);
      break;
      localb.addView(localView1);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(136040);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.kOf.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(136040);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(136037);
    if (!this.kOf.wY())
      finish();
    AppMethodBeat.o(136037);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(136033);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.DownloadDetailUI", "onCreate");
    paramBundle = getIntent().getStringExtra("rawUrl");
    if (bo.isNullOrNil(paramBundle))
    {
      ab.e("MicroMsg.DownloadDetailUI", "url is null");
      AppMethodBeat.o(136033);
    }
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 11)
        getWindow().setFlags(16777216, 16777216);
      getWindow().setFormat(-3);
      setMMTitle(getResources().getString(2131301954));
      xE(getResources().getColor(2131689971));
      setBackBtn(new DownloadDetailUI.1(this));
      int i = getResources().getColor(2131689971);
      if ((Build.VERSION.SDK_INT >= 21) && (getSwipeBackLayout() == null))
        com.tencent.mm.plugin.webview.luggage.c.a.c(this, i, true);
      this.kOf = new a(this);
      setContentView(this.kOf.bPj);
      this.kOf.a(new DownloadDetailUI.2(this));
      this.kOf.h(paramBundle, getIntent().getExtras());
      AppMethodBeat.o(136033);
    }
  }

  public final void onCreateBeforeSetContentView()
  {
    AppMethodBeat.i(136039);
    super.onCreateBeforeSetContentView();
    AppMethodBeat.o(136039);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(136036);
    super.onDestroy();
    ab.i("MicroMsg.DownloadDetailUI", "onDestroy");
    this.kOf.destroy();
    ab.i("MicroMsg.DownloadDetailUI", "fixInputMethodManagerLeak");
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (localInputMethodManager != null)
    {
      ab.i("MicroMsg.DownloadDetailUI", "fixInputMethodManagerLeak, imm");
      int i = 0;
      while (true)
        if (i < 3)
        {
          Object localObject1 = new String[] { "mCurRootView", "mServedView", "mNextServedView" }[i];
          try
          {
            localObject1 = localInputMethodManager.getClass().getDeclaredField((String)localObject1);
            if (!((Field)localObject1).isAccessible())
              ((Field)localObject1).setAccessible(true);
            Object localObject2 = ((Field)localObject1).get(localInputMethodManager);
            if ((localObject2 != null) && ((localObject2 instanceof View)))
            {
              localObject2 = (View)localObject2;
              if (!(((View)localObject2).getContext() instanceof ContextWrapper))
                break label166;
              if (((ContextWrapper)((View)localObject2).getContext()).getBaseContext() == this)
                ((Field)localObject1).set(localInputMethodManager, null);
            }
            while (true)
            {
              i++;
              break;
              label166: if (((View)localObject2).getContext() != this)
                break label201;
              ((Field)localObject1).set(localInputMethodManager, null);
            }
          }
          catch (Throwable localThrowable)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.DownloadDetailUI", localThrowable, "", new Object[0]);
          }
        }
    }
    label201: System.gc();
    AppMethodBeat.o(136036);
  }

  public void onPause()
  {
    AppMethodBeat.i(136035);
    super.onPause();
    ab.i("MicroMsg.DownloadDetailUI", "onPause");
    this.kOf.onPause();
    AppMethodBeat.o(136035);
  }

  public void onResume()
  {
    AppMethodBeat.i(136034);
    super.onResume();
    ab.i("MicroMsg.DownloadDetailUI", "onResume");
    this.kOf.onResume();
    AppMethodBeat.o(136034);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.detail.DownloadDetailUI
 * JD-Core Version:    0.6.2
 */