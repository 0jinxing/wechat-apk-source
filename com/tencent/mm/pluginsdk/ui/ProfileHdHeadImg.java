package com.tencent.mm.pluginsdk.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.e;
import com.tencent.mm.ah.o;
import com.tencent.mm.aj.m;
import com.tencent.mm.bv.a.a.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;

@com.tencent.mm.ui.base.a(3)
public class ProfileHdHeadImg extends MMActivity
{
  private String hix = null;
  private GetHdHeadImageGalleryView qll;
  private e qlm;
  private String username = null;
  private String viu = null;

  private void d(Bitmap paramBitmap, String paramString)
  {
    AppMethodBeat.i(27528);
    try
    {
      Object localObject = com.tencent.mm.sdk.platformtools.d.a(paramBitmap, false, 0.1F);
      a.a.xtT.p(this.username, (Bitmap)localObject);
      if (paramBitmap.getWidth() < 480)
      {
        float f = 480 / paramBitmap.getWidth();
        localObject = new android/graphics/Matrix;
        ((Matrix)localObject).<init>();
        ((Matrix)localObject).postScale(f, f);
        localObject = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
      }
      ab.d("MicroMsg.ProfileHdHeadImg", "dkhdbm old[%d %d] new[%d %d]", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), Integer.valueOf(((Bitmap)localObject).getWidth()), Integer.valueOf(((Bitmap)localObject).getHeight()) });
      this.qll.setHdHeadImage((Bitmap)localObject);
      this.qll.setHdHeadImagePath(paramString);
      AppMethodBeat.o(27528);
      return;
    }
    catch (Exception paramBitmap)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ProfileHdHeadImg", paramBitmap, "", new Object[0]);
        AppMethodBeat.o(27528);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969799;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(27526);
    super.onCreate(paramBundle);
    getSupportActionBar().hide();
    this.username = getIntent().getStringExtra("username");
    this.hix = getIntent().getStringExtra("brand_icon_url");
    xE(getResources().getColor(2131689481));
    Nb(getResources().getColor(2131689481));
    this.qll = ((GetHdHeadImageGalleryView)findViewById(2131822081));
    this.qll.setUsername(this.username);
    this.qll.setSingleClickOverListener(new ProfileHdHeadImg.1(this));
    aw.ZK();
    if (!c.isSDCardAvailable())
    {
      t.hO(this);
      d(o.acd().bU(this), null);
      AppMethodBeat.o(27526);
    }
    while (true)
    {
      return;
      label164: Object localObject;
      if (!bo.isNullOrNil(this.hix))
      {
        paramBundle = m.aA(this.username, this.hix);
        localObject = paramBundle;
        if (paramBundle == null)
          localObject = BitmapFactory.decodeResource(getResources(), 2130838444);
        if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
          break label315;
        ab.i("MicroMsg.ProfileHdHeadImg", "The avatar of %s is in the cache", new Object[] { this.username });
        this.qll.setThumbImage((Bitmap)localObject);
      }
      while (true)
      {
        if (!bo.isNullOrNil(this.viu))
          this.username = this.viu;
        o.acd();
        paramBundle = com.tencent.mm.ah.d.qg(this.username);
        if ((paramBundle == null) || (paramBundle.isRecycled()))
          break label337;
        ab.i("MicroMsg.ProfileHdHeadImg", "The HDAvatar of %s is already exists", new Object[] { this.username });
        o.acd();
        d(paramBundle, com.tencent.mm.ah.d.C(this.username, true));
        AppMethodBeat.o(27526);
        break;
        paramBundle = b.a(this.username, true, -1);
        break label164;
        label315: ab.i("MicroMsg.ProfileHdHeadImg", "The avatar of %s is not in the cache, use default avatar", new Object[] { this.username });
      }
      label337: this.qlm = new e();
      this.qlm.a(this.username, new ProfileHdHeadImg.2(this, (Bitmap)localObject));
      AppMethodBeat.o(27526);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(27527);
    super.onDestroy();
    AppMethodBeat.o(27527);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg
 * JD-Core Version:    0.6.2
 */