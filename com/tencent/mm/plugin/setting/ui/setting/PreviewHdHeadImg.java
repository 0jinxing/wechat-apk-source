package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.m;
import com.tencent.mm.ah.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.i.c;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;

public class PreviewHdHeadImg extends MMActivity
{
  private final int qli = 1;
  private final int qlj = 2;
  private final int qlk = 3;
  private GetHdHeadImageGalleryView qll;
  private com.tencent.mm.ah.e qlm;
  private String qln;
  private String username;

  private void civ()
  {
    AppMethodBeat.i(126997);
    if (!g.RP().isSDCardAvailable())
    {
      t.hO(this.mController.ylL);
      d(o.acd().bU(this.mController.ylL), null);
      AppMethodBeat.o(126997);
    }
    while (true)
    {
      return;
      Bitmap localBitmap1 = ciw();
      if ((localBitmap1 != null) && (!localBitmap1.isRecycled()))
      {
        ab.i("MicroMsg.PreviewHdHeadImg", "The avatar of %s is in the cache", new Object[] { this.username });
        this.qll.setThumbImage(localBitmap1);
      }
      while (true)
      {
        o.acd();
        Bitmap localBitmap2 = com.tencent.mm.ah.d.qg(this.username);
        if ((localBitmap2 == null) || (localBitmap2.isRecycled()))
          break label177;
        ab.i("MicroMsg.PreviewHdHeadImg", "The HDAvatar of %s is already exists", new Object[] { this.username });
        o.acd();
        d(localBitmap2, com.tencent.mm.ah.d.C(this.username, true));
        AppMethodBeat.o(126997);
        break;
        ab.i("MicroMsg.PreviewHdHeadImg", "The avatar of %s is not in the cache, use default avatar", new Object[] { this.username });
      }
      label177: this.qlm = new com.tencent.mm.ah.e();
      this.qlm.a(this.username, new PreviewHdHeadImg.3(this, localBitmap1));
      AppMethodBeat.o(126997);
    }
  }

  private Bitmap ciw()
  {
    AppMethodBeat.i(126998);
    Bitmap localBitmap1 = com.tencent.mm.ah.b.a(this.username, true, -1);
    Bitmap localBitmap2 = localBitmap1;
    if (localBitmap1 == null)
      localBitmap2 = BitmapFactory.decodeResource(getResources(), 2130838444);
    AppMethodBeat.o(126998);
    return localBitmap2;
  }

  private void d(Bitmap paramBitmap, String paramString)
  {
    AppMethodBeat.i(126999);
    if (paramBitmap == null)
    {
      AppMethodBeat.o(126999);
      return;
    }
    while (true)
    {
      try
      {
        if (paramBitmap.getWidth() >= 480)
          break label177;
        float f = 480.0F / paramBitmap.getWidth();
        localObject = new android/graphics/Matrix;
        ((Matrix)localObject).<init>();
        ((Matrix)localObject).postScale(f, f);
        localObject = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
        ab.d("MicroMsg.PreviewHdHeadImg", "dkhdbm old[%d %d] new[%d %d]", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), Integer.valueOf(((Bitmap)localObject).getWidth()), Integer.valueOf(((Bitmap)localObject).getHeight()) });
        this.qll.setHdHeadImage((Bitmap)localObject);
        this.qll.setHdHeadImagePath(paramString);
        this.qln = paramString;
        AppMethodBeat.o(126999);
      }
      catch (Exception paramBitmap)
      {
        ab.printErrStackTrace("MicroMsg.PreviewHdHeadImg", paramBitmap, "", new Object[0]);
        AppMethodBeat.o(126999);
      }
      break;
      label177: Object localObject = paramBitmap;
    }
  }

  public static boolean e(Bitmap paramBitmap, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(127001);
    if ((paramString != null) && (!paramString.equals("")));
    while (true)
    {
      try
      {
        com.tencent.mm.sdk.platformtools.d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, paramString, true);
        AppMethodBeat.o(127001);
        return bool;
      }
      catch (Exception paramBitmap)
      {
        ab.printErrStackTrace("MicroMsg.PreviewHdHeadImg", paramBitmap, "", new Object[0]);
        ab.e("MicroMsg.PreviewHdHeadImg", "saveBitmapToImage failed:" + paramBitmap.toString());
      }
      AppMethodBeat.o(127001);
      bool = false;
    }
  }

  public final int getLayoutId()
  {
    return 2130969799;
  }

  public final void initView()
  {
    AppMethodBeat.i(126996);
    setMMTitle(2131303047);
    xE(getResources().getColor(2131690597));
    Nb(getResources().getColor(2131689481));
    this.username = r.Yz();
    this.qll = ((GetHdHeadImageGalleryView)findViewById(2131822081));
    this.qll.setUsername(this.username);
    civ();
    addIconOptionMenu(0, 2130839555, new PreviewHdHeadImg.1(this));
    setBackBtn(new PreviewHdHeadImg.2(this));
    AppMethodBeat.o(126996);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(127000);
    ab.i("MicroMsg.PreviewHdHeadImg", "onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      if ((paramInt1 == 2) || (paramInt1 == 4))
        new ak(Looper.getMainLooper()).post(new PreviewHdHeadImg.4(this));
      AppMethodBeat.o(127000);
    }
    while (true)
    {
      return;
      Object localObject;
      switch (paramInt1)
      {
      case 3:
      default:
        AppMethodBeat.o(127000);
        break;
      case 2:
        if (paramIntent == null)
        {
          AppMethodBeat.o(127000);
        }
        else
        {
          localObject = new Intent();
          ((Intent)localObject).putExtra("CropImageMode", 1);
          ((Intent)localObject).putExtra("CropImage_Filter", true);
          o.acd();
          ((Intent)localObject).putExtra("CropImage_OutputPath", com.tencent.mm.ah.d.C(r.Yz() + ".crop", true));
          ((Intent)localObject).putExtra("CropImage_ImgPath", null);
          com.tencent.mm.plugin.setting.b.gkE.a(this, paramIntent, (Intent)localObject, c.XW(), 4, null);
          AppMethodBeat.o(127000);
        }
        break;
      case 4:
        new ak(Looper.getMainLooper()).post(new PreviewHdHeadImg.5(this));
        if (paramIntent == null)
        {
          AppMethodBeat.o(127000);
        }
        else
        {
          paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
          localObject = com.tencent.mm.sdk.platformtools.d.aml(this.qln);
          if (paramIntent == null)
          {
            ab.e("MicroMsg.PreviewHdHeadImg", "crop picture failed");
            AppMethodBeat.o(127000);
          }
          else
          {
            d(com.tencent.mm.sdk.platformtools.d.aml(paramIntent), null);
            new m(this.mController.ylL, paramIntent).w(new PreviewHdHeadImg.6(this, (Bitmap)localObject));
            AppMethodBeat.o(127000);
          }
        }
        break;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(126995);
    this.ylm = true;
    super.onCreate(paramBundle);
    getWindow().getDecorView().setSystemUiVisibility(1280);
    initView();
    AppMethodBeat.o(126995);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg
 * JD-Core Version:    0.6.2
 */