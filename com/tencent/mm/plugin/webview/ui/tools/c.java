package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.modeltools.f;
import com.tencent.mm.plugin.webview.modeltools.j;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.r;
import java.lang.ref.WeakReference;

public class c extends com.tencent.xweb.x5.a.a.a.a.b
{
  private final WeakReference<WebViewUI> uqV;

  public c(WebViewUI paramWebViewUI)
  {
    AppMethodBeat.i(7380);
    this.uqV = new WeakReference(paramWebViewUI);
    AppMethodBeat.o(7380);
  }

  private WebViewUI cZv()
  {
    AppMethodBeat.i(7390);
    WebViewUI localWebViewUI = (WebViewUI)this.uqV.get();
    AppMethodBeat.o(7390);
    return localWebViewUI;
  }

  public void computeScroll(View paramView)
  {
    AppMethodBeat.i(7388);
    cZv().uwQ.aGs();
    AppMethodBeat.o(7388);
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent, View paramView)
  {
    AppMethodBeat.i(7384);
    boolean bool = cZv().uwQ.B(paramMotionEvent);
    AppMethodBeat.o(7384);
    return bool;
  }

  public void invalidate()
  {
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent, View paramView)
  {
    AppMethodBeat.i(7383);
    boolean bool = cZv().uwQ.C(paramMotionEvent);
    AppMethodBeat.o(7383);
    return bool;
  }

  public Object onMiscCallBack(String paramString, Bundle paramBundle)
  {
    Object localObject = null;
    AppMethodBeat.i(7381);
    boolean bool1;
    boolean bool2;
    label35: int i;
    if (paramBundle == null)
    {
      bool1 = true;
      if ((cZv() != null) && (cZv().icy != null))
        break label128;
      bool2 = true;
      ab.i("MicroMsg.WebViewLongClickHelper", "method = %s, bundler == null ? %b, invoker == null ? %b", new Object[] { paramString, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((!bo.isNullOrNil(paramString)) && (paramBundle != null))
      {
        if ((cZv() != null) && (!cZv().isFinishing()))
          break label134;
        i = 1;
        label97: if ((i == 0) && (cZv().icy != null))
          break label140;
      }
      AppMethodBeat.o(7381);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      bool1 = false;
      break;
      label128: bool2 = false;
      break label35;
      label134: i = 0;
      break label97;
      try
      {
        label140: String str1 = cZv().icy.afk("WebviewEnableTbsDownload");
        ab.i("MicroMsg.WebViewLongClickHelper", "enable value = %s", new Object[] { str1 });
        if ((!bo.isNullOrNil(str1)) && (str1.equals("0")))
        {
          ab.e("MicroMsg.WebViewLongClickHelper", "config closed, not allows tbs download");
          AppMethodBeat.o(7381);
          paramString = localObject;
        }
      }
      catch (Exception localException1)
      {
        Bundle localBundle1;
        while (true)
        {
          ab.e("MicroMsg.WebViewLongClickHelper", "get dynamic config failed");
          localBundle1 = null;
        }
        if (paramString.equals("addDownloadTask"))
        {
          try
          {
            localBundle1 = cZv().icy.g(14, paramBundle);
            if (localBundle1 != null)
            {
              long l = localBundle1.getLong("download_id", 0L);
              paramString = Long.valueOf(l);
              AppMethodBeat.o(7381);
            }
          }
          catch (RemoteException localRemoteException1)
          {
            ab.e("MicroMsg.WebViewLongClickHelper", "invoke the add downloadtask failed");
          }
        }
        else if (paramString.equals("cancelDownloadTask"))
        {
          try
          {
            Bundle localBundle2 = cZv().icy.g(16, paramBundle);
            if (localBundle2 != null)
            {
              bool1 = localBundle2.getBoolean("cancel_result", false);
              paramString = Boolean.valueOf(bool1);
              AppMethodBeat.o(7381);
            }
          }
          catch (RemoteException localRemoteException2)
          {
            ab.e("MicroMsg.WebViewLongClickHelper", "invoke the cancel downloadtask failed");
          }
        }
        else if (paramString.equals("queryDownloadTask"))
        {
          try
          {
            Bundle localBundle3 = cZv().icy.g(15, paramBundle);
            if (localBundle3 != null)
            {
              i = localBundle3.getInt("download_state", 0);
              paramString = Integer.valueOf(i);
              AppMethodBeat.o(7381);
            }
          }
          catch (RemoteException localRemoteException3)
          {
            ab.e("MicroMsg.WebViewLongClickHelper", "invoke the queryDownloadTask downloadtask failed");
          }
        }
        else if (paramString.equals("installDownloadTask"))
        {
          try
          {
            Bundle localBundle4 = cZv().icy.g(17, paramBundle);
            if (localBundle4 != null)
            {
              bool1 = localBundle4.getBoolean("install_result");
              paramString = Boolean.valueOf(bool1);
              AppMethodBeat.o(7381);
            }
          }
          catch (RemoteException localRemoteException4)
          {
            ab.e("MicroMsg.WebViewLongClickHelper", "invoke the install downloadtask failed");
          }
        }
        else if (paramString.equals("getDrawable"))
        {
          String str3 = paramBundle.getString("packageName");
          i = paramBundle.getInt("resourceId");
          if ((!bo.isNullOrNil(str3)) && (i > 0))
            try
            {
              Drawable localDrawable = com.tencent.mm.ca.b.e(ah.getContext().getPackageManager().getResourcesForApplication(str3), i);
              paramString = localDrawable;
              AppMethodBeat.o(7381);
            }
            catch (Exception localException2)
            {
              ab.e("MicroMsg.WebViewLongClickHelper", "get resource for package : %s, fail, : %s", new Object[] { str3, localException2.getMessage() });
            }
        }
        else if (paramString.equals("getShareUrl"))
        {
          try
          {
            String str2 = cZv().icy.aek(cZv().pzf.getUrl());
            ab.i("MicroMsg.WebViewLongClickHelper", "getShareUrl by x5 core, shareurl = %s", new Object[] { str2 });
            AppMethodBeat.o(7381);
            paramString = str2;
          }
          catch (Exception localException3)
          {
            ab.e("MicroMsg.WebViewLongClickHelper", "getShare url failed");
          }
        }
        else
        {
          if (paramString.equals("smartPickWord"))
          {
            if (cZv().mController.getMMTitle() != null);
            for (paramString = cZv().mController.getMMTitle().toString(); ; paramString = "")
            {
              paramString = f.a(paramBundle, cZv().dae(), paramString);
              AppMethodBeat.o(7381);
              break;
            }
          }
          if (paramString.equals("jumpToSos"))
          {
            try
            {
              f.U(paramBundle);
              paramString = cZv().icy.g(104, paramBundle);
              f.hc(paramBundle.getString("query"), cZv().dae());
              if (paramString != null)
              {
                bool1 = paramString.getBoolean("open_result");
                paramString = Boolean.valueOf(bool1);
                AppMethodBeat.o(7381);
              }
            }
            catch (RemoteException paramString)
            {
              ab.e("MicroMsg.WebViewLongClickHelper", "jumpToSos failed");
              AppMethodBeat.o(7381);
              paramString = localObject;
            }
          }
          else if (paramString.equals("supportSmartPickWord"))
          {
            paramString = Boolean.TRUE;
            AppMethodBeat.o(7381);
          }
          else if (paramString.equals("onShowSos"))
          {
            f.p(cZv().dae(), paramBundle);
            AppMethodBeat.o(7381);
            paramString = localObject;
          }
          else if (paramString.equals("supportImagePreview"))
          {
            paramString = Boolean.TRUE;
            AppMethodBeat.o(7381);
          }
          else if (paramString.equals("onClickCopyBtn"))
          {
            f.aeU(cZv().dae());
            AppMethodBeat.o(7381);
            paramString = localObject;
          }
          else if (paramString.equals("imagePreview"))
          {
            j.a(paramBundle, cZv().umI, cZv().uvf);
            paramString = Boolean.TRUE;
            AppMethodBeat.o(7381);
          }
          else if (paramString.equals("closeImagePreview"))
          {
            j.d(cZv().icy);
            paramString = Boolean.TRUE;
            AppMethodBeat.o(7381);
          }
          else if (paramString.equals("onTranslateFinish"))
          {
            paramString = cZv().uwL;
            if ((paramString.tipDialog != null) && (paramString.tipDialog.isShowing()))
            {
              paramString.tipDialog.dismiss();
              paramString.tipDialog = null;
            }
            AppMethodBeat.o(7381);
            paramString = localObject;
          }
          else if (paramString.equals("onTranslateStart"))
          {
            paramBundle = cZv().uwL;
            paramString = cZv();
            if ((paramBundle.tipDialog != null) && (paramBundle.tipDialog.isShowing()))
            {
              paramBundle.tipDialog.dismiss();
              paramBundle.tipDialog = null;
            }
            paramString.getString(2131297061);
            paramBundle.tipDialog = h.b(paramString, paramString.getString(2131305585), true, null);
            AppMethodBeat.o(7381);
            paramString = localObject;
          }
          else
          {
            AppMethodBeat.o(7381);
            paramString = localObject;
          }
        }
      }
    }
  }

  public void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, View paramView)
  {
    AppMethodBeat.i(7387);
    cZv().uwQ.d(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    AppMethodBeat.o(7387);
  }

  public void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
  {
    AppMethodBeat.i(7386);
    cZv().uwQ.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4, paramView);
    AppMethodBeat.o(7386);
  }

  public boolean onShowLongClickPopupMenu()
  {
    boolean bool = true;
    AppMethodBeat.i(7389);
    if (cZv().getIntent().getBooleanExtra("show_long_click_popup_menu", true))
    {
      bool = false;
      AppMethodBeat.o(7389);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(7389);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent, View paramView)
  {
    AppMethodBeat.i(7382);
    boolean bool = cZv().uwQ.A(paramMotionEvent);
    AppMethodBeat.o(7382);
    return bool;
  }

  public boolean overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean, View paramView)
  {
    AppMethodBeat.i(7385);
    paramBoolean = cZv().uwQ.b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
    AppMethodBeat.o(7385);
    return paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.c
 * JD-Core Version:    0.6.2
 */