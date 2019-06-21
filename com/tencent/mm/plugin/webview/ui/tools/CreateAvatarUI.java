package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Activity;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.i.c;
import com.tencent.mm.plugin.webview.e.b.b;
import com.tencent.mm.plugin.webview.model.n;
import com.tencent.mm.protocal.protobuf.and;
import com.tencent.mm.protocal.protobuf.bet;
import com.tencent.mm.protocal.protobuf.bv;
import com.tencent.mm.protocal.protobuf.bx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.ui.MMActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;

public class CreateAvatarUI extends MMActivity
  implements f, com.tencent.mm.ui.tools.b.c.a
{
  private String appId;
  private com.tencent.mm.ui.base.p ejZ;
  private String fileId;
  private InputMethodManager urd;
  private EditText ure;
  private String urf;
  private boolean urg = true;
  private boolean urh = false;
  private volatile com.tencent.mm.plugin.webview.e.b urj;
  private String urk;
  private boolean urm = false;

  private boolean II(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(7376);
    if ((paramInt == 1) || (paramInt == 2) || (paramInt == 7) || (paramInt == 8))
    {
      ab.e("MicroMsg.CreateAvatarUI", "isNetworkAvailable false, errType = ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(7376);
    }
    while (true)
    {
      return bool;
      if (!at.isConnected(this))
      {
        ab.e("MicroMsg.CreateAvatarUI", "isNetworkAvailable false, not connected");
        AppMethodBeat.o(7376);
      }
      else
      {
        AppMethodBeat.o(7376);
        bool = true;
      }
    }
  }

  private static byte[] ae(Bitmap paramBitmap)
  {
    AppMethodBeat.i(7371);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    com.tencent.mm.sdk.platformtools.d.a(paramBitmap, Bitmap.CompressFormat.JPEG, 85, localByteArrayOutputStream);
    paramBitmap = localByteArrayOutputStream.toByteArray();
    try
    {
      localByteArrayOutputStream.close();
      AppMethodBeat.o(7371);
      return paramBitmap;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.CreateAvatarUI", localException, "", new Object[0]);
    }
  }

  private static void aw(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(7374);
    ab.i("MicroMsg.CreateAvatarUI", "doAddAvatar appid: %s", new Object[] { paramString1 });
    paramString1 = new com.tencent.mm.plugin.webview.model.g(paramString1, paramString2, paramString3);
    com.tencent.mm.kernel.g.Rg().a(paramString1, 0);
    AppMethodBeat.o(7374);
  }

  private void cZw()
  {
    AppMethodBeat.i(7377);
    if ((this.ejZ != null) && (!this.ejZ.isShowing()))
    {
      this.ejZ.show();
      AppMethodBeat.o(7377);
    }
    while (true)
    {
      return;
      this.ejZ = com.tencent.mm.ui.base.h.b(this, getString(2131298800), true, new CreateAvatarUI.3(this));
      AppMethodBeat.o(7377);
    }
  }

  private void cZx()
  {
    AppMethodBeat.i(7378);
    if (this.ejZ == null)
      AppMethodBeat.o(7378);
    while (true)
    {
      return;
      this.ejZ.dismiss();
      AppMethodBeat.o(7378);
    }
  }

  public final void JW()
  {
    AppMethodBeat.i(7369);
    com.tencent.mm.ui.base.h.g(this, 2131303149, 2131303152);
    AppMethodBeat.o(7369);
  }

  public final void JX()
  {
    AppMethodBeat.i(7370);
    com.tencent.mm.ui.base.h.g(this, 2131303150, 2131303152);
    AppMethodBeat.o(7370);
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    int i = 1;
    AppMethodBeat.i(7373);
    if (paramMotionEvent.getAction() == 0)
    {
      View localView = getCurrentFocus();
      int i1;
      if ((localView != null) && ((localView instanceof EditText)))
      {
        int[] arrayOfInt = new int[2];
        int[] tmp43_41 = arrayOfInt;
        tmp43_41[0] = 0;
        int[] tmp47_43 = tmp43_41;
        tmp47_43[1] = 0;
        tmp47_43;
        localView.getLocationInWindow(arrayOfInt);
        int j = arrayOfInt[0];
        int k = arrayOfInt[1];
        int m = localView.getHeight();
        int n = localView.getWidth();
        i1 = i;
        if (paramMotionEvent.getX() > j)
        {
          i1 = i;
          if (paramMotionEvent.getX() < n + j)
          {
            i1 = i;
            if (paramMotionEvent.getY() > k)
            {
              i1 = i;
              if (paramMotionEvent.getY() < m + k)
                this.ure.setCursorVisible(true);
            }
          }
        }
      }
      else
      {
        i1 = 0;
      }
      if (i1 != 0)
      {
        this.urd = ((InputMethodManager)getSystemService("input_method"));
        if (this.urd != null)
        {
          this.urd.hideSoftInputFromWindow(localView.getWindowToken(), 0);
          this.ure.setCursorVisible(false);
          getWindow().getDecorView().requestFocus();
        }
      }
      bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(7373);
    }
    while (true)
    {
      return bool;
      if ((getWindow().superDispatchTouchEvent(paramMotionEvent)) || (onTouchEvent(paramMotionEvent)))
      {
        AppMethodBeat.o(7373);
      }
      else
      {
        AppMethodBeat.o(7373);
        bool = false;
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969251;
  }

  public final void ki(String paramString)
  {
    AppMethodBeat.i(7368);
    this.urm = true;
    if ((this.urh) || (this.urj == null) || (this.urg))
      if ((this.fileId == null) || (this.fileId.isEmpty()))
      {
        Object localObject = com.tencent.mm.sdk.platformtools.d.b(com.tencent.mm.sdk.platformtools.d.LV(2131231172), 500, 500, false);
        String str = this.appId;
        localObject = ae((Bitmap)localObject);
        ab.i("MicroMsg.CreateAvatarUI", "doAddAvatar appid: %s", new Object[] { str });
        cZw();
        paramString = new com.tencent.mm.plugin.webview.model.g(str, paramString, (byte[])localObject);
        com.tencent.mm.kernel.g.Rg().a(paramString, 0);
        AppMethodBeat.o(7368);
      }
    while (true)
    {
      return;
      aw(this.appId, paramString, this.fileId);
      AppMethodBeat.o(7368);
      continue;
      if (this.urj.uKO == b.b.uKS)
      {
        aw(this.appId, paramString, this.urk);
        AppMethodBeat.o(7368);
      }
      else if (this.urj.uKO == b.b.uKT)
      {
        cZw();
        this.urj.ho(this.urf, this.appId);
        AppMethodBeat.o(7368);
      }
      else
      {
        cZw();
        AppMethodBeat.o(7368);
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(7372);
    ab.i("MicroMsg.CreateAvatarUI", "onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      ab.e("MicroMsg.CreateAvatarUI", "Get image from album failed");
      AppMethodBeat.o(7372);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(7372);
      break;
      if (paramIntent == null)
      {
        AppMethodBeat.o(7372);
        break;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("CropImageMode", 1);
      localIntent.putExtra("CropImage_Filter", true);
      com.tencent.mm.ah.o.acd();
      localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.ah.d.D(r.Yz() + ".crop", true));
      localIntent.putExtra("CropImage_ImgPath", null);
      localIntent.setClassName(this, "com.tencent.mm.ui.tools.CropImageNewUI");
      com.tencent.mm.ui.tools.a.b(this, paramIntent, localIntent, c.XW(), 5, null);
      AppMethodBeat.o(7372);
      break;
      if (paramIntent == null)
      {
        AppMethodBeat.o(7372);
        break;
      }
      paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
      if (paramIntent == null)
      {
        ab.e("MicroMsg.CreateAvatarUI", "crop picture failed");
        AppMethodBeat.o(7372);
        break;
      }
      ab.i("MicroMsg.CreateAvatarUI", "onActivityResult(CROP_PICTURE_FOR_AVATAR)  file:%s, size:%d", new Object[] { paramIntent, Long.valueOf(new File(paramIntent).length()) });
      this.urf = paramIntent;
      this.urm = false;
      this.urg = false;
      this.urh = false;
      ((ImageView)findViewById(2131823160)).setImageBitmap(BitmapFactory.decodeFile(paramIntent));
      if (this.urj == null)
      {
        this.urj = new com.tencent.mm.plugin.webview.e.b();
        this.urj.uKN.observe(this, new Observer()
        {
        });
      }
      this.urk = null;
      this.urj.ho(this.urf, this.appId);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(7364);
    super.onCreate(paramBundle);
    xE(getResources().getColor(2131689613));
    dyb();
    setMMTitle(getString(2131298801));
    setBackBtn(new CreateAvatarUI.1(this));
    this.appId = getIntent().getStringExtra("0");
    this.fileId = getIntent().getStringExtra("default_fileid");
    this.ure = ((EditText)findViewById(2131823161));
    this.ure.setOnEditorActionListener(new CreateAvatarUI.4(this));
    this.ure.setOnKeyListener(new CreateAvatarUI.5(this));
    this.ure.addTextChangedListener(new CreateAvatarUI.6(this));
    this.ure.setOnTouchListener(new CreateAvatarUI.7(this));
    findViewById(2131823159).setOnClickListener(new CreateAvatarUI.8(this));
    findViewById(2131823163).setOnClickListener(new CreateAvatarUI.9(this));
    findViewById(2131823164).setOnClickListener(new CreateAvatarUI.10(this));
    findViewById(2131823165).setOnClickListener(new CreateAvatarUI.11(this));
    AppMethodBeat.o(7364);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(7367);
    super.onDestroy();
    if (this.ejZ != null)
      this.ejZ.dismiss();
    AppMethodBeat.o(7367);
  }

  public void onPause()
  {
    AppMethodBeat.i(7366);
    super.onPause();
    com.tencent.mm.kernel.g.Rg().b(2500, this);
    com.tencent.mm.kernel.g.Rg().b(2785, this);
    com.tencent.mm.kernel.g.Rg().a(2667, this);
    AppMethodBeat.o(7366);
  }

  public void onResume()
  {
    AppMethodBeat.i(7365);
    super.onResume();
    com.tencent.mm.kernel.g.Rg().a(2500, this);
    com.tencent.mm.kernel.g.Rg().a(2785, this);
    com.tencent.mm.kernel.g.Rg().a(2667, this);
    AppMethodBeat.o(7365);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(7375);
    if ((paramm instanceof com.tencent.mm.plugin.webview.model.g))
    {
      ab.i("MicroMsg.CreateAvatarUI", "onAddAvatarEnd errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      cZx();
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramm = ((bx)((com.tencent.mm.plugin.webview.model.g)paramm).ehh.fsH.fsP).vEe;
        paramString = new Intent();
        paramString.putExtra("id", paramm.id);
        paramString.putExtra("nickname", paramm.nickname);
        paramString.putExtra("avatarurl", paramm.wrK);
        setResult(-1, paramString);
        finish();
        AppMethodBeat.o(7375);
      }
    }
    while (true)
    {
      return;
      if (!II(paramInt1))
      {
        com.tencent.mm.ui.base.h.b(this, getString(2131305622), getString(2131298793), true);
        AppMethodBeat.o(7375);
      }
      else
      {
        com.tencent.mm.ui.base.h.b(this, paramString, getString(2131298793), true);
        AppMethodBeat.o(7375);
        continue;
        if ((paramm instanceof n))
        {
          ab.i("MicroMsg.CreateAvatarUI", "onGetRandomAvatarEnd errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            paramString = (and)((n)paramm).ehh.fsH.fsP;
            paramm = new com.tencent.mm.at.a.a.c.a();
            paramm.ePT = 2131231172;
            paramm.eQg = getResources().getDimension(2131428615);
            paramm.eQf = true;
            com.tencent.mm.at.o.ahp().a(paramString.wrK, (ImageView)findViewById(2131823160), paramm.ahG());
            this.ure.setText(paramString.nickname);
            this.urh = true;
            this.urg = false;
            this.fileId = paramString.fileid;
            if (!this.ure.getText().toString().equals(""))
            {
              findViewById(2131823165).setEnabled(true);
              AppMethodBeat.o(7375);
            }
            else
            {
              findViewById(2131823165).setEnabled(false);
              AppMethodBeat.o(7375);
            }
          }
          else if (!II(paramInt1))
          {
            com.tencent.mm.ui.base.h.b(this, getString(2131305622), getString(2131298795), true);
            AppMethodBeat.o(7375);
          }
          else
          {
            com.tencent.mm.ui.base.h.b(this, paramString, getString(2131298795), true);
            AppMethodBeat.o(7375);
          }
        }
        else if ((paramm instanceof com.tencent.mm.plugin.webview.model.h))
        {
          ab.i("MicroMsg.CreateAvatarUI", "onGetCreateAvatarEnd errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          if (this.urj == null)
          {
            ab.e("MicroMsg.CreateAvatarUI", "uploadEngine == null, multi-Thread Error, thread name = " + Thread.currentThread().getName());
            AppMethodBeat.o(7375);
          }
          else
          {
            com.tencent.mm.plugin.webview.e.b localb = this.urj;
            String str = ((com.tencent.mm.plugin.webview.model.h)paramm).mnu;
            if (!str.equals(localb.hWL))
              ab.i("MicroMsg.VestImgUploadEngine", "currentPath=%s,callbackPath=%s, path updated after onSceneEnd", new Object[] { localb.hWL, str });
            while (true)
              if (this.urm)
              {
                cZx();
                if (this.urj.uKO != b.b.uKS)
                {
                  cZx();
                  if (!II(paramInt1))
                  {
                    cZx();
                    com.tencent.mm.ui.base.h.b(this, getString(2131305622), getString(2131298793), true);
                    AppMethodBeat.o(7375);
                    break;
                    if ((paramInt1 == 0) && (paramInt2 == 0))
                    {
                      localb.uKO = b.b.uKS;
                      paramm = (bv)((com.tencent.mm.plugin.webview.model.h)paramm).ehh.fsH.fsP;
                      localb.uKN.postValue(paramm.fileid);
                      ab.i("MicroMsg.VestImgUploadEngine", "file id create success: %s", new Object[] { paramm.fileid });
                      continue;
                    }
                    localb.uKO = b.b.uKT;
                    ab.i("MicroMsg.VestImgUploadEngine", "file id create failed: errType = %s, errCode = %s, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
                    continue;
                  }
                  com.tencent.mm.ui.base.h.b(this, paramString, getString(2131298793), true);
                }
              }
          }
        }
        else
        {
          AppMethodBeat.o(7375);
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI
 * JD-Core Version:    0.6.2
 */