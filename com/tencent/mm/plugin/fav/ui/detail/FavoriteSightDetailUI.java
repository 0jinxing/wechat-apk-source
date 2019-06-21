package com.tencent.mm.plugin.fav.ui.detail;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.n;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.c;
import com.tencent.mm.plugin.fav.a.k;
import com.tencent.mm.plugin.fav.a.m.c;
import com.tencent.mm.plugin.fav.a.m.d;
import com.tencent.mm.plugin.fav.a.p;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.ui.i;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMLoadScrollView;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.vfs.e;

public class FavoriteSightDetailUI extends BaseFavDetailReportUI
  implements p, k.a
{
  private aar cAv;
  private k mjD;
  private com.tencent.mm.plugin.fav.a.g mjP;
  private boolean mlN;
  private boolean mlT;
  private VideoPlayerTextureView mmA;
  private ImageView mmB;
  private long mmC;
  private boolean mmD;
  private boolean mmE;
  private Runnable mmF;
  private boolean mmG;
  private View mmx;
  private ImageView mmy;
  private MMPinProgressBtn mmz;

  public FavoriteSightDetailUI()
  {
    AppMethodBeat.i(74423);
    this.mmD = true;
    this.mlN = false;
    this.mmE = false;
    this.mlT = false;
    this.mjD = new k();
    this.mmF = new FavoriteSightDetailUI.5(this);
    this.mmG = false;
    AppMethodBeat.o(74423);
  }

  private void bwo()
  {
    AppMethodBeat.i(74433);
    String str = com.tencent.mm.plugin.fav.a.b.b(this.cAv);
    if (!e.ct(str))
      AppMethodBeat.o(74433);
    while (true)
    {
      return;
      this.mmA.stop();
      this.mmA.setMute(true);
      this.mmA.setVideoPath(str);
      AppMethodBeat.o(74433);
    }
  }

  @SuppressLint({"ResourceType"})
  private void hm(boolean paramBoolean)
  {
    AppMethodBeat.i(74429);
    if (this.mjP.isDone())
    {
      if (com.tencent.mm.plugin.fav.a.b.f(this.cAv))
      {
        this.mmy.setVisibility(8);
        this.mmz.setVisibility(8);
        bwo();
        AppMethodBeat.o(74429);
        return;
      }
      if (bo.isNullOrNil(this.cAv.wfZ))
        this.mmy.setImageResource(2131231923);
    }
    while (true)
    {
      this.mmy.setVisibility(0);
      this.mmz.setVisibility(8);
      this.mmB.setVisibility(0);
      AppMethodBeat.o(74429);
      break;
      ab.w("MicroMsg.FavoriteSightDetailUI", "? info is done, source file not exist, cdn data url is not null");
      this.mmy.setImageResource(2131231923);
      continue;
      if (this.mjP.buy())
      {
        if (bo.isNullOrNil(this.cAv.wfZ))
        {
          this.mmy.setImageResource(2131231923);
          if (!paramBoolean);
        }
        else
        {
          this.mmy.setImageResource(2131231923);
          if (paramBoolean)
            h.bQ(this.mController.ylL, getString(2131298922));
        }
      }
      else if (this.mjP.bux())
      {
        this.mmy.setImageResource(2131231923);
        if (paramBoolean)
          h.bQ(this.mController.ylL, getString(2131299588));
      }
      else
      {
        if ((this.mjP.isDownloading()) || (this.mjP.buw()))
        {
          this.mmy.setVisibility(8);
          this.mmz.setVisibility(0);
          c localc = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(this.cAv.mnd);
          if (localc != null)
            this.mmz.setProgress((int)localc.getProgress());
          while (true)
          {
            this.mmB.setVisibility(0);
            AppMethodBeat.o(74429);
            break;
            this.mmz.setProgress(0);
          }
        }
        ab.w("MicroMsg.FavoriteSightDetailUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
        this.mmy.setImageResource(2131231923);
      }
    }
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(74430);
    ab.i("MicroMsg.FavoriteSightDetailUI", "on favitem change, notifyId:%s, curId:%d", new Object[] { paramString, Long.valueOf(this.mjP.field_localId) });
    paramString = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(this.mjP.field_localId);
    if (paramString == null)
    {
      ab.w("MicroMsg.FavoriteSightDetailUI", "error, on notify change, cannot find info");
      finish();
      AppMethodBeat.o(74430);
    }
    while (true)
    {
      return;
      this.mjP = paramString;
      this.cAv = com.tencent.mm.plugin.fav.a.b.c(paramString);
      paramString = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(this.cAv.mnd);
      boolean bool;
      if (paramString == null)
        bool = false;
      while (true)
      {
        if (!bool)
          break label243;
        AppMethodBeat.o(74430);
        break;
        if (this.mlT)
        {
          bool = false;
        }
        else
        {
          if ((paramString.field_status == 4) && (((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(this.cAv.mnd).field_extFlag != 0))
          {
            com.tencent.mm.plugin.fav.a.b.a(this.mjP, this.cAv, true);
            this.mlT = true;
          }
          ab.i("MicroMsg.FavoriteSightDetailUI", "FavoriteFileDetail download, check retry, return %B", new Object[] { Boolean.valueOf(this.mlT) });
          bool = this.mlT;
        }
      }
      label243: al.af(this.mmF);
      al.n(this.mmF, 500L);
      AppMethodBeat.o(74430);
    }
  }

  protected final MMLoadScrollView bwd()
  {
    AppMethodBeat.i(74424);
    MMLoadScrollView localMMLoadScrollView = (MMLoadScrollView)findViewById(2131823999);
    AppMethodBeat.o(74424);
    return localMMLoadScrollView;
  }

  public final void d(c paramc)
  {
    AppMethodBeat.i(74431);
    if ((paramc == null) || (paramc.field_dataId == null))
    {
      ab.w("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, item is null");
      AppMethodBeat.o(74431);
      return;
    }
    ab.i("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, dataID is %s, field id is %s,offset is %d, total is %d,cdn status is %d, cdn type is %d (send or recieve)", new Object[] { this.cAv.mnd, paramc.field_dataId, Integer.valueOf(paramc.field_offset), Integer.valueOf(paramc.field_totalLen), Integer.valueOf(paramc.field_status), Integer.valueOf(paramc.field_type) });
    if (paramc.field_offset > paramc.field_totalLen)
    {
      ab.e("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, cdn offset length > cdn total length, do cdnLengthError()");
      if (1 != paramc.field_type)
        break label231;
    }
    label231: for (paramc.field_status = 2; ; paramc.field_status = 4)
    {
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().a(paramc, new String[0]);
      if (paramc.field_type == 0)
        com.tencent.mm.plugin.fav.a.b.a(paramc);
      if (paramc.field_type == 1)
        com.tencent.mm.plugin.fav.a.b.b(paramc);
      if (paramc.field_dataId.equals(this.cAv.mnd))
      {
        int i = (int)paramc.getProgress();
        this.mmz.post(new FavoriteSightDetailUI.6(this, i));
      }
      AppMethodBeat.o(74431);
      break;
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969540;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(74432);
    String str;
    if ((paramInt1 == 1) && (-1 == paramInt2))
      if (paramIntent == null)
      {
        str = null;
        if (paramIntent != null)
          break label154;
        paramIntent = null;
        label29: Object localObject = new FavoriteSightDetailUI.7(this, h.b(this.mController.ylL, getString(2131299643), false, null));
        i.a(this.mController.ylL, str, paramIntent, this.mjP, (Runnable)localObject);
        boolean bool = t.kH(str);
        if (!bool)
          break label165;
        paramIntent = m.c.mfH;
        label93: com.tencent.mm.plugin.fav.a.g localg = this.mjP;
        localObject = m.d.mfK;
        if (!bool)
          break label172;
        paramInt1 = n.mA(str);
        label115: com.tencent.mm.plugin.fav.a.m.a(paramIntent, localg, (m.d)localObject, paramInt1);
        com.tencent.mm.ui.widget.snackbar.b.i(this, getString(2131299583));
        AppMethodBeat.o(74432);
      }
    while (true)
    {
      return;
      str = paramIntent.getStringExtra("Select_Conv_User");
      break;
      label154: paramIntent = paramIntent.getStringExtra("custom_send_text");
      break label29;
      label165: paramIntent = m.c.mfG;
      break label93;
      label172: paramInt1 = 0;
      break label115;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(74432);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(74425);
    f.m(this);
    super.onCreate(paramBundle);
    this.mmC = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.mjP = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(this.mmC);
    if (this.mjP == null)
    {
      ab.w("MicroMsg.FavoriteSightDetailUI", "id[%d] info is null, return", new Object[] { Long.valueOf(this.mmC) });
      finish();
      AppMethodBeat.o(74425);
      return;
    }
    F(this.mjP);
    com.tencent.mm.plugin.fav.a.m.w(this.mjP);
    a.a(this, this.mjP);
    this.cAv = com.tencent.mm.plugin.fav.a.b.c(this.mjP);
    this.mmy = ((ImageView)findViewById(2131820981));
    this.mmz = ((MMPinProgressBtn)findViewById(2131822136));
    this.mmx = findViewById(2131824001);
    this.mmA = ((VideoPlayerTextureView)findViewById(2131821402));
    this.mmB = ((ImageView)findViewById(2131822133));
    this.mmx.setOnClickListener(new FavoriteSightDetailUI.1(this));
    this.mmA.setVideoCallback(new FavoriteSightDetailUI.2(this));
    setMMTitle(getString(2131299596));
    setBackBtn(new FavoriteSightDetailUI.3(this));
    addIconOptionMenu(0, 2131304081, 2130839555, new FavoriteSightDetailUI.4(this));
    if (!e.ct(com.tencent.mm.plugin.fav.a.b.c(this.cAv)))
      if (!bo.isNullOrNil(this.cAv.fgE))
        com.tencent.mm.plugin.fav.a.b.a(this.mjP, this.cAv);
    Bitmap localBitmap;
    do
    {
      hm(false);
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().c(this);
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().a(this);
      f.n(this);
      AppMethodBeat.o(74425);
      break;
      localBitmap = l.a(this.cAv, this.mjP);
    }
    while (localBitmap == null);
    int i = localBitmap.getWidth();
    int j = localBitmap.getHeight();
    DisplayMetrics localDisplayMetrics;
    float f;
    if (!this.mmG)
    {
      this.mmG = true;
      localDisplayMetrics = this.mmx.getResources().getDisplayMetrics();
      f = localDisplayMetrics.density;
      paramBundle = this.mmx.getLayoutParams();
      if (paramBundle != null)
        break label463;
      ab.e("MicroMsg.FavoriteSightDetailUI", "setViewResize, but params is null");
    }
    while (true)
    {
      this.mmB.setImageBitmap(localBitmap);
      this.mmB.setVisibility(0);
      break;
      label463: paramBundle.width = (localDisplayMetrics.widthPixels - (int)(f * 36.0F + 0.5F));
      paramBundle.height = (j * paramBundle.width / i);
      this.mmx.setLayoutParams(paramBundle);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(74426);
    if (this.mmA != null)
    {
      this.mmA.setVideoCallback(null);
      this.mmA.stop();
    }
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().d(this);
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().b(this);
    super.onDestroy();
    AppMethodBeat.o(74426);
  }

  public void onPause()
  {
    AppMethodBeat.i(74428);
    if (this.mmA != null)
      this.mmA.stop();
    super.onPause();
    AppMethodBeat.o(74428);
  }

  public void onResume()
  {
    AppMethodBeat.i(74427);
    super.onResume();
    if (this.mmA != null)
    {
      if (this.mmD)
        break label40;
      bwo();
    }
    while (true)
    {
      this.mmD = false;
      AppMethodBeat.o(74427);
      return;
      label40: if (!this.mmA.isPlaying())
        this.mmA.start();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI
 * JD-Core Version:    0.6.2
 */