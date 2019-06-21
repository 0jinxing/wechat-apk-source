package com.tencent.mm.plugin.fav.ui.widget;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.q;
import com.tencent.mm.plugin.record.a.a;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

public class FavVideoView extends RelativeLayout
  implements e.a
{
  private String ePJ;
  private ak kkp;
  public com.tencent.mm.pluginsdk.ui.tools.e klq;
  private ImageView mmB;
  private boolean mmE;
  public LinearLayout mmZ;
  private String mnd;
  private TextView mqf;
  private boolean mqg;
  private boolean mqh;
  private int mqi;
  private ProgressBar mqj;
  private MMPinProgressBtn mqk;
  private int mql;
  private FavVideoView.a mqm;

  public FavVideoView(Context paramContext)
  {
    this(paramContext, null);
  }

  public FavVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public FavVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(74724);
    this.kkp = new ak(Looper.getMainLooper());
    this.mqg = false;
    this.mqh = false;
    this.mqi = 0;
    this.mmE = false;
    this.mnd = "";
    this.mql = 0;
    this.mqm = new FavVideoView.a(this, (byte)0);
    ab.i("MicroMsg.FavVideoView", "%d ui init view.", new Object[] { Integer.valueOf(hashCode()) });
    LayoutInflater.from(paramContext).inflate(2130969534, this);
    this.mmB = ((ImageView)findViewById(2131822133));
    paramAttributeSet = (RelativeLayout)findViewById(2131820629);
    ((TextView)findViewById(2131822135)).setVisibility(8);
    this.mqk = ((MMPinProgressBtn)findViewById(2131822136));
    this.mqj = ((ProgressBar)findViewById(2131821891));
    this.mmZ = ((LinearLayout)findViewById(2131823884));
    this.mqf = ((TextView)findViewById(2131822138));
    if (com.tencent.mm.modelcontrol.d.afO())
      this.mqh = true;
    for (this.klq = new VideoPlayerTextureView(paramContext); ; this.klq = new VideoTextureView(paramContext))
    {
      this.klq.setVideoCallback(this);
      paramContext = new RelativeLayout.LayoutParams(-1, -2);
      paramContext.addRule(13);
      paramAttributeSet.addView((View)this.klq, paramContext);
      ((a)g.M(a.class)).getRecordMsgCDNStorage().a(this.mqm);
      ((ae)g.M(ae.class)).getFavCdnStorage().a(this.mqm);
      AppMethodBeat.o(74724);
      return;
      this.mqh = false;
    }
  }

  private void aNt()
  {
    AppMethodBeat.i(74736);
    this.kkp.post(new FavVideoView.5(this));
    AppMethodBeat.o(74736);
  }

  private void bwD()
  {
    AppMethodBeat.i(74730);
    if ((!bo.isNullOrNil(this.ePJ)) && (com.tencent.mm.vfs.e.ct(this.ePJ)))
    {
      ab.i("MicroMsg.FavVideoView", "VideoPlay: fullPath is not null,exist,  toggleVideo()");
      Mj(this.ePJ);
      AppMethodBeat.o(74730);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.FavVideoView", "VideoPlay: fullPath is  null, show error, toggleVideo()");
      ho(false);
      AppMethodBeat.o(74730);
    }
  }

  private static boolean bwE()
  {
    AppMethodBeat.i(74731);
    boolean bool = g.RP().Ry().getBoolean(ac.a.xQl, false);
    AppMethodBeat.o(74731);
    return bool;
  }

  private void ho(boolean paramBoolean)
  {
    AppMethodBeat.i(74729);
    this.kkp.post(new FavVideoView.1(this, paramBoolean));
    AppMethodBeat.o(74729);
  }

  public final void EA()
  {
    AppMethodBeat.i(74734);
    ab.i("MicroMsg.FavVideoView", "%d on completion", new Object[] { Integer.valueOf(hashCode()) });
    if ((com.tencent.mm.compatible.util.d.iX(18)) || (!this.mqh))
    {
      ab.i("MicroMsg.FavVideoView", "VideoPlay: seek second is %d", new Object[] { Integer.valueOf(0) });
      this.klq.B(0.0D);
      AppMethodBeat.o(74734);
    }
    while (true)
    {
      return;
      if (this.klq != null)
        this.klq.stop();
      AppMethodBeat.o(74734);
    }
  }

  public final void Mj(String paramString)
  {
    AppMethodBeat.i(74732);
    ab.i("MicroMsg.FavVideoView", "VideoPlay: prepareVideo");
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.FavVideoView", "VideoPlay: %d prepare video but filepath is null.", new Object[] { Integer.valueOf(hashCode()) });
      AppMethodBeat.o(74732);
    }
    while (true)
    {
      return;
      if (this.klq != null)
      {
        if ((this.klq instanceof VideoPlayerTextureView))
          ((VideoPlayerTextureView)this.klq).setNeedResetExtractor(bwE());
        ((View)this.klq).setVisibility(0);
        ((View)this.klq).setAlpha(0.0F);
        this.mmB.setVisibility(0);
        this.klq.setVideoPath(paramString);
      }
      if (((Integer)g.RP().Ry().get(ac.a.xPd, Integer.valueOf(0))).intValue() == 1)
      {
        this.mqf.setText(com.tencent.mm.plugin.sight.base.d.RK(paramString));
        this.mqf.setVisibility(0);
      }
      AppMethodBeat.o(74732);
    }
  }

  public final void a(String paramString1, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(74725);
    this.ePJ = paramString1;
    if (paramBoolean)
    {
      aNt();
      this.mnd = paramString2;
    }
    AppMethodBeat.o(74725);
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    return 0;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(74728);
    ab.i("MicroMsg.FavVideoView", "VideoPlay:   onDestroy()");
    try
    {
      ((a)g.M(a.class)).getRecordMsgCDNStorage().b(this.mqm);
      ((ae)g.M(ae.class)).getFavCdnStorage().b(this.mqm);
      this.klq.stop();
      AppMethodBeat.o(74728);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(74728);
    }
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(74735);
    ab.e("MicroMsg.FavVideoView", "VideoPlay: %d on play video error what %d extra %d. isMMVideoPlayer[%b]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.mqh) });
    if (this.mmE)
    {
      EA();
      AppMethodBeat.o(74735);
    }
    while (true)
    {
      return;
      this.mqi = paramInt2;
      String str = this.klq.getVideoPath();
      this.klq.stop();
      this.mqg = true;
      ho(false);
      if (this.mqi == -1)
      {
        this.mql += 1;
        if (this.mql <= 3)
        {
          al.d(new FavVideoView.2(this));
          AppMethodBeat.o(74735);
        }
      }
      else
      {
        if ((!bo.isNullOrNil(str)) && (com.tencent.mm.vfs.e.ct(str)))
        {
          ab.e("MicroMsg.FavVideoView", "VideoPlay: start third player to play");
          this.kkp.post(new FavVideoView.3(this, str));
        }
        AppMethodBeat.o(74735);
      }
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(74727);
    ab.i("MicroMsg.FavVideoView", "VideoPlay:   onResume()");
    if (!this.mqg)
      bwD();
    AppMethodBeat.o(74727);
  }

  public final void pL()
  {
    AppMethodBeat.i(74733);
    this.mqi = 0;
    ho(true);
    this.mmE = this.klq.start();
    ab.i("MicroMsg.FavVideoView", "VideoPlay: startPlay(),duration is %d", new Object[] { Integer.valueOf(this.klq.getDuration() / 1000) });
    AppMethodBeat.o(74733);
  }

  public void setThumbView(String paramString)
  {
    AppMethodBeat.i(74726);
    this.mmB.setImageBitmap(BackwardSupportUtil.b.i(paramString, 1.0F));
    AppMethodBeat.o(74726);
  }

  public void setVideoData(String paramString)
  {
    this.ePJ = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavVideoView
 * JD-Core Version:    0.6.2
 */