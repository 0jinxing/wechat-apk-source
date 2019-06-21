package com.tencent.mm.plugin.fav.ui.detail;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.fav.ui.c;
import com.tencent.mm.plugin.fav.ui.i.5;
import com.tencent.mm.plugin.fav.ui.widget.FavVideoView;
import com.tencent.mm.plugin.webview.ui.tools.widget.o;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.Iterator;
import java.util.List;

@a(3)
public class FavoriteVideoPlayUI extends MMActivity
{
  private boolean cHc;
  private String ePJ;
  private int eWK;
  private Bundle jWy;
  private boolean jYD;
  private com.tencent.mm.ui.tools.e jYE;
  private int kkq;
  private int kkr;
  private int kks;
  private int kkt;
  private View.OnClickListener mjE;
  private View.OnLongClickListener mlV;
  private boolean mmD;
  private String mmV;
  private RelativeLayout mmW;
  private ImageView mmX;
  private FavVideoView mmY;
  private LinearLayout mmZ;
  private boolean mna;
  private int mnb;
  private boolean mnc;
  private String mnd;
  private String thumbPath;

  public FavoriteVideoPlayUI()
  {
    AppMethodBeat.i(74466);
    this.mmD = true;
    this.jYD = false;
    this.kkq = 0;
    this.kkr = 0;
    this.kks = 0;
    this.kkt = 0;
    this.mna = true;
    this.cHc = true;
    this.mnc = false;
    this.mnd = "";
    this.mjE = new FavoriteVideoPlayUI.1(this);
    this.mlV = new FavoriteVideoPlayUI.2(this);
    AppMethodBeat.o(74466);
  }

  public static void f(String paramString, Context paramContext)
  {
    AppMethodBeat.i(74469);
    String str = u.uu(paramString);
    ab.i("MicroMsg.FavoriteVideoPlayUI", "save video now video path %s out path %s", new Object[] { paramString, str });
    if (bo.isNullOrNil(str))
    {
      Toast.makeText(paramContext, paramContext.getString(2131304256), 1).show();
      AppMethodBeat.o(74469);
    }
    while (true)
    {
      return;
      Toast.makeText(paramContext, paramContext.getString(2131304257, new Object[] { str }), 1).show();
      n.a(str, paramContext);
      AppMethodBeat.o(74469);
    }
  }

  private void g(ImageView paramImageView)
  {
    AppMethodBeat.i(74468);
    this.mmY.a(this.ePJ, this.mnc, this.mnd);
    if (paramImageView != null)
    {
      if (!com.tencent.mm.vfs.e.ct(this.thumbPath))
        break label63;
      paramImageView.setImageBitmap(BackwardSupportUtil.b.i(this.thumbPath, 1.0F));
    }
    while (true)
    {
      ab.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: fullPath is not null,but not exist videoView.setVideoData(null)");
      AppMethodBeat.o(74468);
      return;
      label63: paramImageView.setImageResource(2130838213);
    }
  }

  public final void bcW()
  {
    AppMethodBeat.i(74476);
    this.mmZ.setVisibility(8);
    int i = this.mmW.getWidth();
    int j = this.mmW.getHeight();
    int k = j;
    if (this.kks != 0)
    {
      k = j;
      if (this.kkt != 0)
        k = (int)(i / this.kks * this.kkt);
    }
    this.jYE.hw(i, k);
    this.jYE.L(this.kkr, this.kkq, this.kks, this.kkt);
    this.jYE.a(this.mmY, this.mmX, new FavoriteVideoPlayUI.5(this), null);
    AppMethodBeat.o(74476);
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(74474);
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    AppMethodBeat.o(74474);
    return bool;
  }

  public final int getLayoutId()
  {
    return 2130969533;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(74475);
    Object localObject;
    label28: Runnable local3;
    if ((paramInt1 == 1) && (-1 == paramInt2))
      if (paramIntent == null)
      {
        localObject = null;
        if (paramIntent != null)
          break label82;
        paramIntent = null;
        local3 = new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(74461);
            this.mhZ.dismiss();
            AppMethodBeat.o(74461);
          }
        };
        if (!bo.isNullOrNil((String)localObject))
          break label93;
        AppMethodBeat.o(74475);
      }
    while (true)
    {
      return;
      localObject = paramIntent.getStringExtra("Select_Conv_User");
      break;
      label82: paramIntent = paramIntent.getStringExtra("custom_send_text");
      break label28;
      label93: Iterator localIterator = bo.P(((String)localObject).split(",")).iterator();
      label292: 
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        AppCompatActivity localAppCompatActivity = this.mController.ylL;
        String str2 = this.ePJ;
        String str3 = this.thumbPath;
        paramInt1 = this.eWK;
        String str4 = this.mmV;
        if (localAppCompatActivity == null)
          ab.w("MicroMsg.FavSendLogic", "want to send fav video, but context is null");
        while (true)
        {
          if (bo.isNullOrNil(paramIntent))
            break label292;
          com.tencent.mm.plugin.messenger.a.g.bOk().F(str1, paramIntent, t.nK(str1));
          break;
          if (bo.isNullOrNil(str1))
          {
            ab.w("MicroMsg.FavSendLogic", "want to send fav video, but to user is null");
          }
          else
          {
            localObject = new com.tencent.mm.vfs.b(str2);
            if ((bo.isNullOrNil(str2)) && (!((com.tencent.mm.vfs.b)localObject).exists()))
              ab.w("MicroMsg.FavSendLogic", "want to send fav video, but datapath is null or is not exist ");
            else
              com.tencent.mm.kernel.g.RS().aa(new i.5(localAppCompatActivity, str1, str2, str3, paramInt1, str4, local3));
          }
        }
      }
      com.tencent.mm.ui.widget.snackbar.b.i(this, getString(2131299583));
      AppMethodBeat.o(74475);
      continue;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(74475);
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(74477);
    bcW();
    AppMethodBeat.o(74477);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(74467);
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    if (com.tencent.mm.compatible.util.d.iW(19))
      getWindow().setFlags(201327616, 201327616);
    while (true)
    {
      this.jWy = paramBundle;
      getWindow().addFlags(128);
      this.mna = getIntent().getBooleanExtra("key_detail_data_valid", true);
      this.ePJ = getIntent().getStringExtra("key_detail_fav_path");
      this.thumbPath = getIntent().getStringExtra("key_detail_fav_thumb_path");
      this.eWK = getIntent().getIntExtra("key_detail_fav_video_duration", 0);
      this.mmV = getIntent().getStringExtra("key_detail_statExtStr");
      this.mnb = getIntent().getIntExtra("key_detail_fav_video_scene_from", 0);
      this.cHc = getIntent().getBooleanExtra("show_share", true);
      this.mnc = getIntent().getBooleanExtra("key_detail_fav_video_show_download_status", false);
      this.mnd = getIntent().getStringExtra("key_detail_data_id");
      if (!com.tencent.mm.vfs.e.ct(this.thumbPath))
      {
        paramBundle = c.LY(this.ePJ);
        if (paramBundle == null);
      }
      try
      {
        ab.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: create thumbpath bitmap, saveBitmapToImage ");
        com.tencent.mm.sdk.platformtools.d.a(paramBundle, 60, Bitmap.CompressFormat.JPEG, this.thumbPath, true);
        boolean bool = this.mna;
        if (bo.isNullOrNil(this.thumbPath))
        {
          paramBundle = "";
          if (!bo.isNullOrNil(this.ePJ))
            break label519;
          str = "";
          ab.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: init data, isVideoValid: %B. thumbPath: %s, fullPath: %s", new Object[] { Boolean.valueOf(bool), paramBundle, str });
          this.mmW = ((RelativeLayout)findViewById(2131822132));
          this.mmY = ((FavVideoView)findViewById(2131821402));
          paramBundle = (ImageView)findViewById(2131822133);
          this.mmX = ((ImageView)findViewById(2131822079));
          this.mmZ = ((LinearLayout)findViewById(2131823884));
          if ((!this.mna) && (this.mmZ != null))
            this.mmZ.setVisibility(0);
          if (this.mmX != null)
            this.mmX.setLayerType(2, null);
          if (bo.isNullOrNil(this.ePJ))
            break label535;
          if (!com.tencent.mm.vfs.e.ct(this.ePJ))
            break label527;
          this.mmY.setVideoData(this.ePJ);
          ab.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay:  videoView.setVideoData(fullPath)");
          this.mmY.setOnClickListener(this.mjE);
          if (this.cHc)
            this.mmY.setOnLongClickListener(this.mlV);
          this.jYE = new com.tencent.mm.ui.tools.e(null);
          AppMethodBeat.o(74467);
          return;
          getWindow().setFlags(1024, 1024);
        }
      }
      catch (Exception paramBundle)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.FavoriteVideoPlayUI", paramBundle, "", new Object[0]);
          continue;
          paramBundle = this.thumbPath;
          continue;
          label519: String str = this.ePJ;
          continue;
          label527: g(paramBundle);
          continue;
          label535: g(paramBundle);
        }
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(74473);
    setResult(0, getIntent().putExtra("key_activity_browse_time", dyi()));
    this.mmY.onDestroy();
    getWindow().clearFlags(128);
    super.onDestroy();
    AppMethodBeat.o(74473);
  }

  public void onPause()
  {
    AppMethodBeat.i(74472);
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().setFlags(2048, 2048);
    FavVideoView localFavVideoView = this.mmY;
    ab.i("MicroMsg.FavVideoView", "VideoPlay:   onPause()");
    if (localFavVideoView.klq.isPlaying())
    {
      ab.i("MicroMsg.FavVideoView", "VideoPlay: pausePlay()");
      localFavVideoView.klq.pause();
    }
    super.onPause();
    o.JV(2);
    AppMethodBeat.o(74472);
  }

  public void onResume()
  {
    AppMethodBeat.i(74471);
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().clearFlags(2048);
    ab.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay:  onResume,hadOnStart is %B", new Object[] { Boolean.valueOf(this.mmD) });
    if (!this.mmD)
      this.mmY.onResume();
    this.mmD = false;
    super.onResume();
    o.JV(1);
    AppMethodBeat.o(74471);
  }

  public void onStart()
  {
    AppMethodBeat.i(74470);
    Bundle localBundle = this.jWy;
    if (!this.jYD)
    {
      this.jYD = true;
      if (Build.VERSION.SDK_INT >= 12)
      {
        this.kkq = getIntent().getIntExtra("img_gallery_top", 0);
        this.kkr = getIntent().getIntExtra("img_gallery_left", 0);
        this.kks = getIntent().getIntExtra("img_gallery_width", 0);
        this.kkt = getIntent().getIntExtra("img_gallery_height", 0);
        this.jYE.L(this.kkr, this.kkq, this.kks, this.kkt);
        if (localBundle == null)
          this.mmY.getViewTreeObserver().addOnPreDrawListener(new FavoriteVideoPlayUI.4(this));
      }
    }
    super.onStart();
    AppMethodBeat.o(74470);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI
 * JD-Core Version:    0.6.2
 */