package com.tencent.mm.plugin.music.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.gk;
import com.tencent.mm.g.a.gk.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.plugin.music.e.k;
import com.tencent.mm.plugin.music.f.a.d.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

@com.tencent.mm.ui.base.a(19)
public class MusicMainUI extends MMActivity
  implements ViewPager.OnPageChangeListener, com.tencent.mm.ai.f
{
  private ak eet;
  private com.tencent.mm.sdk.b.c hAA;
  private long mfT;
  private int mode;
  private d.a oKa;
  private boolean oMH;
  private CheckBox oON;
  private ImageButton oOO;
  private ImageButton oOP;
  private MusicSeekBar oOQ;
  private MusicViewPager oOR;
  private com.tencent.mm.pluginsdk.i.d oOS;
  private b oOT;
  private boolean oOU;
  private int oOV;
  private Timer oOW;
  private int oOX;
  private ak oOY;
  private int scene;

  public MusicMainUI()
  {
    AppMethodBeat.i(105107);
    this.oOV = 0;
    this.hAA = new MusicMainUI.3(this);
    this.eet = new ak(Looper.getMainLooper());
    this.oOX = -1;
    this.oKa = new MusicMainUI.8(this);
    this.oOY = new MusicMainUI.9(this, Looper.getMainLooper());
    AppMethodBeat.o(105107);
  }

  private void bUQ()
  {
    AppMethodBeat.i(105111);
    com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.e.class);
    this.oOT.count = 200000;
    this.oOT.notifyDataSetChanged();
    if (((com.tencent.mm.plugin.music.e.e)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.e.class)).bUc())
    {
      this.oOR.setCanSlide(true);
      AppMethodBeat.o(105111);
    }
    while (true)
    {
      return;
      this.oOR.setCanSlide(false);
      AppMethodBeat.o(105111);
    }
  }

  private void bUR()
  {
    AppMethodBeat.i(105112);
    if (this.oOW != null)
      this.oOW.cancel();
    this.oOW = null;
    AppMethodBeat.o(105112);
  }

  private void bUS()
  {
    AppMethodBeat.i(105119);
    int i = k.bUf().bTS().bTi();
    int j = k.bUf().bTS().getDuration();
    if ((i > 0) && (j > 0))
    {
      this.oOQ.setProgress(i);
      this.oOQ.setMaxProgress(j);
    }
    AppMethodBeat.o(105119);
  }

  private void h(com.tencent.mm.plugin.music.model.e.a parama)
  {
    AppMethodBeat.i(105116);
    if ((com.tencent.mm.plugin.music.model.d.a(parama)) && (!this.oMH))
    {
      this.oON.setVisibility(0);
      this.oOP.setVisibility(0);
      AppMethodBeat.o(105116);
    }
    while (true)
    {
      return;
      this.oON.setVisibility(8);
      this.oOP.setVisibility(8);
      AppMethodBeat.o(105116);
    }
  }

  public final int getLayoutId()
  {
    return 2130970274;
  }

  public final void i(com.tencent.mm.plugin.music.model.e.a parama)
  {
    AppMethodBeat.i(105120);
    com.tencent.mm.plugin.music.model.e.a locala = ((com.tencent.mm.plugin.music.e.e)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.e.class)).bTU();
    if (locala == null)
      AppMethodBeat.o(105120);
    while (true)
    {
      return;
      if ((locala.g(parama)) && (this.oOP != null) && (this.oOO != null) && (this.oON != null) && (this.oOP.getBackground() != null) && (this.oOO.getBackground() != null) && (this.oON.getBackground() != null) && (this.oOQ != null))
      {
        if (parama.bUu())
        {
          int i = parama.field_songLyricColor;
          this.oOP.getBackground().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
          this.oOO.getBackground().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
          this.oON.getBackground().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
          this.oOQ.setColor(i);
          AppMethodBeat.o(105120);
        }
        else
        {
          this.oOP.getBackground().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
          this.oOO.getBackground().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
          this.oON.getBackground().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
          this.oOQ.setColor(-1);
        }
      }
      else
        AppMethodBeat.o(105120);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(105118);
    WXMediaMessage localWXMediaMessage;
    if ((-1 == paramInt2) && (1 == paramInt1))
    {
      com.tencent.mm.aw.e locale = k.bUf().bTQ();
      String str1 = paramIntent.getStringExtra("Select_Conv_User");
      paramIntent = new WXMusicObject();
      paramIntent.musicUrl = locale.fKc;
      paramIntent.musicDataUrl = locale.fKa;
      paramIntent.musicLowBandUrl = locale.fKb;
      paramIntent.musicLowBandDataUrl = locale.fKb;
      localWXMediaMessage = new WXMediaMessage();
      localWXMediaMessage.mediaObject = paramIntent;
      localWXMediaMessage.title = locale.fJW;
      localWXMediaMessage.description = locale.fJX;
      Object localObject = null;
      String str2 = com.tencent.mm.plugin.music.model.d.u(locale);
      paramIntent = localObject;
      if (str2 != null)
      {
        paramIntent = localObject;
        if (com.tencent.mm.vfs.e.ct(str2))
        {
          paramInt1 = (int)getResources().getDimension(2131427804);
          paramIntent = com.tencent.mm.sdk.platformtools.d.ap(str2, paramInt1, paramInt1);
        }
      }
      if (paramIntent != null)
      {
        localWXMediaMessage.thumbData = bo.an(paramIntent);
        com.tencent.mm.plugin.music.model.b.gkE.a(this, com.tencent.mm.plugin.music.model.d.v(locale), localWXMediaMessage, str1, com.tencent.mm.plugin.music.model.d.w(locale));
        ab.i("MicroMsg.Music.MusicUtil", "succeed to share to friend:%s", new Object[] { str1 });
        AppMethodBeat.o(105118);
      }
    }
    while (true)
    {
      return;
      localWXMediaMessage.thumbData = bo.an(com.tencent.mm.sdk.platformtools.d.LV(2130838448));
      break;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(105118);
    }
  }

  public void onClickBack(View paramView)
  {
    AppMethodBeat.i(105114);
    finish();
    AppMethodBeat.o(105114);
  }

  public void onClickSend(View paramView)
  {
    AppMethodBeat.i(105115);
    Object localObject1 = k.bUf().bTQ();
    ab.i("MicroMsg.Music.MusicMainUI", "MusicType:%d, SongWebUrl ", new Object[] { Integer.valueOf(((com.tencent.mm.aw.e)localObject1).fJS), ((com.tencent.mm.aw.e)localObject1).fKc });
    String str1;
    Object localObject2;
    String str2;
    int i;
    Object localObject3;
    if (((com.tencent.mm.aw.e)localObject1).fJS == 11)
    {
      paramView = new gk();
      com.tencent.mm.sdk.b.a.xxA.m(paramView);
      str1 = paramView.cBa.appId;
      localObject2 = paramView.cBa.cwz;
      str2 = paramView.cBa.cBb;
      i = paramView.cBa.cBc;
      paramView = (View)localObject2;
      if (TextUtils.isEmpty((CharSequence)localObject2))
        paramView = "";
      ab.i("MicroMsg.Music.MusicMainUI", "from app brand, appId:%s, brandName:%s, pkgType:%d, appUserName:%s", new Object[] { str1, paramView, Integer.valueOf(i), str2 });
      paramView = getString(2131300417, new Object[] { paramView });
      if (!TextUtils.isEmpty(((com.tencent.mm.aw.e)localObject1).fKc))
      {
        ArrayList localArrayList = new ArrayList();
        localObject2 = getString(2131301598);
        localObject3 = getString(2131301599);
        String str3 = getString(2131298092);
        localArrayList.add(Integer.valueOf(0));
        localArrayList.add(Integer.valueOf(1));
        localArrayList.add(Integer.valueOf(2));
        localArrayList.add(Integer.valueOf(3));
        localObject1 = new MusicMainUI.5(this, (com.tencent.mm.aw.e)localObject1, str1, str2, i);
        com.tencent.mm.ui.base.h.a(this, "", new String[] { localObject2, localObject3, str3, paramView }, "", (h.c)localObject1);
        AppMethodBeat.o(105115);
      }
    }
    while (true)
    {
      return;
      new ArrayList().add(Integer.valueOf(0));
      localObject2 = new MusicMainUI.6(this, str1, str2, i);
      com.tencent.mm.ui.base.h.a(this, "", new String[] { paramView }, "", (h.c)localObject2);
      AppMethodBeat.o(105115);
      continue;
      if (!TextUtils.isEmpty(((com.tencent.mm.aw.e)localObject1).fKc))
      {
        localObject3 = new ArrayList();
        str1 = getString(2131301598);
        str2 = getString(2131301599);
        localObject2 = getString(2131298092);
        paramView = getString(2131299587);
        ((List)localObject3).add(Integer.valueOf(0));
        ((List)localObject3).add(Integer.valueOf(1));
        ((List)localObject3).add(Integer.valueOf(2));
        ((List)localObject3).add(Integer.valueOf(3));
        localObject1 = new MusicMainUI.7(this, (com.tencent.mm.aw.e)localObject1);
        com.tencent.mm.ui.base.h.a(this, "", new String[] { str1, str2, localObject2, paramView }, "", (h.c)localObject1);
      }
      AppMethodBeat.o(105115);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(105108);
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    getWindow().setFlags(67109888, 67109888);
    this.mode = getIntent().getIntExtra("key_mode", 2);
    this.scene = getIntent().getIntExtra("key_scene", 0);
    this.oMH = getIntent().getBooleanExtra("KGlobalShakeMusic", false);
    this.oOR = ((MusicViewPager)findViewById(2131826264));
    this.oOT = new b(this, this.scene, this.oMH);
    this.oOR.setAdapter(this.oOT);
    this.oOR.setOnPageChangeListener(this);
    this.oOR.setSystemUiVisibility(4096);
    this.oOO = ((ImageButton)findViewById(2131826267));
    this.oOP = ((ImageButton)findViewById(2131826268));
    paramBundle = (RelativeLayout.LayoutParams)this.oOO.getLayoutParams();
    int i = paramBundle.topMargin;
    int j = i;
    if (ae.hD(this.mController.ylL))
      j = i + ae.getStatusBarHeight(this.mController.ylL);
    paramBundle.setMargins(paramBundle.leftMargin, j, paramBundle.rightMargin, paramBundle.bottomMargin);
    this.oOO.setLayoutParams(paramBundle);
    paramBundle = (RelativeLayout.LayoutParams)this.oOP.getLayoutParams();
    i = paramBundle.topMargin;
    j = i;
    if (ae.hD(this.mController.ylL))
      j = i + ae.getStatusBarHeight(this.mController.ylL);
    paramBundle.setMargins(paramBundle.leftMargin, j, paramBundle.rightMargin, paramBundle.bottomMargin);
    this.oOP.setLayoutParams(paramBundle);
    this.oON = ((CheckBox)findViewById(2131826265));
    paramBundle = this.oON;
    boolean bool;
    if (!k.bUf().bTS().aie())
    {
      bool = true;
      paramBundle.setChecked(bool);
      this.oOS = new com.tencent.mm.pluginsdk.i.d(this);
      this.oON.setOnClickListener(new MusicMainUI.1(this));
      com.tencent.mm.sdk.b.a.xxA.c(this.hAA);
      this.oOQ = ((MusicSeekBar)findViewById(2131826266));
      this.oOQ.setOnSeekBarChange(new MusicMainUI.2(this));
      if (!this.oOS.diK())
        ab.w("MicroMsg.Music.MusicMainUI", "not support shake");
      bUQ();
      this.oOR.setCurrentItem(((com.tencent.mm.plugin.music.e.e)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.e.class)).bUa() + 100000);
      j = this.scene;
      paramBundle = ((com.tencent.mm.plugin.music.e.e)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.e.class)).bTU();
      if (paramBundle != null)
      {
        ab.v("MicroMsg.Music.MusicReportUtil", "kvReportEnterMusicUI: %d, %d, %s, %s, %s, %s, %s, %s", new Object[] { Integer.valueOf(13041), Integer.valueOf(j), paramBundle.field_musicId, paramBundle.field_songName, paramBundle.field_songAlbum, Integer.valueOf(paramBundle.field_songId), paramBundle.field_songSinger, paramBundle.field_appId });
        com.tencent.mm.plugin.report.service.h.pYm.e(13041, new Object[] { Integer.valueOf(j), paramBundle.field_musicId, paramBundle.field_songName, paramBundle.field_songAlbum, Integer.valueOf(paramBundle.field_songId), paramBundle.field_songSinger, paramBundle.field_appId });
      }
      com.tencent.mm.plugin.report.service.h.pYm.a(285L, 1L, 1L, false);
      paramBundle = ((com.tencent.mm.plugin.music.e.e)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.e.class)).bTU();
      if (paramBundle != null)
        break label675;
      finish();
      AppMethodBeat.o(105108);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label675: if ((this.scene == 4) && (((com.tencent.mm.plugin.music.e.e)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.e.class)).getMode() == 2))
      {
        j = g.RP().Ry().getInt(83, 0);
        if (j < 3)
        {
          Toast.makeText(this, 2131300135, 0).show();
          g.RP().Ry().set(83, Integer.valueOf(j + 1));
        }
      }
      if (this.scene == 5)
        com.tencent.mm.plugin.music.model.d.d.a(0, paramBundle);
      h(paramBundle);
      if (this.mode == 1)
      {
        if (this.oOW == null)
          this.oOW = new Timer();
        this.oOW.schedule(new MusicMainUI.4(this), 0L, 500L);
      }
      AppMethodBeat.o(105108);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(105113);
    super.onDestroy();
    if (this.oOS != null)
      this.oOS.bgr();
    if (this.oOT != null)
    {
      Object localObject = this.oOT;
      ((b)localObject).oMs.removeCallbacksAndMessages(null);
      localObject = ((b)localObject).oOv;
      ((com.tencent.mm.plugin.music.model.c)localObject).oMs.removeCallbacksAndMessages(null);
      ((com.tencent.mm.plugin.music.model.c)localObject).edn.clear();
    }
    if (this.oOQ != null)
      this.oOQ.jA(false);
    bUR();
    com.tencent.mm.sdk.b.a.xxA.d(this.hAA);
    k.bUf().bTS().a(null);
    if (!k.bUf().bTS().aie())
      k.bUf().bTS().stopPlay();
    ((com.tencent.mm.plugin.music.e.e)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.e.class)).bUb();
    AppMethodBeat.o(105113);
  }

  public void onPageScrollStateChanged(int paramInt)
  {
  }

  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(105117);
    ab.i("MicroMsg.Music.MusicMainUI", "onPageSelected %d", new Object[] { Integer.valueOf(paramInt) });
    if (((com.tencent.mm.plugin.music.e.e)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.e.class)).bUc())
      this.oOR.setCanSlide(false);
    this.eet.removeCallbacksAndMessages(null);
    this.eet.postDelayed(new MusicMainUI.a(this, paramInt), 500L);
    if (this.oOX == -1)
      this.oOX = paramInt;
    if (this.oOX != paramInt)
    {
      this.oOX = paramInt;
      com.tencent.mm.plugin.music.model.d.d.oNi = true;
      com.tencent.mm.plugin.report.service.h.pYm.a(285L, 3L, 1L, false);
      com.tencent.mm.plugin.music.model.d.d.eJ(1, this.scene);
    }
    AppMethodBeat.o(105117);
  }

  public void onPause()
  {
    AppMethodBeat.i(105110);
    super.onPause();
    if (this.oOS != null)
      this.oOS.bgr();
    k.bUf().bTS().a(null);
    AppMethodBeat.o(105110);
  }

  public void onResume()
  {
    AppMethodBeat.i(105109);
    super.onResume();
    if (((com.tencent.mm.plugin.music.e.e)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.e.class)).bTV())
      if (!this.oMH)
      {
        if ((this.oOS != null) && (this.oOS.diK()) && (!this.oOS.diI()))
          this.oOS.a(new MusicMainUI.b(this, (byte)0));
        this.mfT = bo.yz();
      }
    while (true)
    {
      k.bUf().bTS().a(this.oKa);
      bUS();
      AppMethodBeat.o(105109);
      return;
      ab.i("MicroMsg.Music.MusicMainUI", "no need to shake music");
      ((com.tencent.mm.plugin.music.e.e)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.e.class)).bTX();
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicMainUI
 * JD-Core Version:    0.6.2
 */