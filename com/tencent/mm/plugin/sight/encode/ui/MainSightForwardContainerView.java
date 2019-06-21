package com.tencent.mm.plugin.sight.encode.ui;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.compatible.b.k;
import com.tencent.mm.g.a.qt;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.sight.encode.a.b.3;
import com.tencent.mm.plugin.sight.encode.a.b.4;
import com.tencent.mm.plugin.sight.encode.a.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMFragmentActivity;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainSightForwardContainerView extends RelativeLayout
  implements AdapterView.OnItemClickListener, a
{
  public MMFragmentActivity iWA;
  private int mDuration;
  private boolean mIsPause;
  private boolean mIsPlaying;
  public View ofJ;
  private boolean qAA;
  public String qAB;
  private boolean qAC;
  public String qAD;
  public float qAE;
  private com.tencent.mm.plugin.sight.encode.a.b qAF;
  private boolean qAG;
  private boolean qAH;
  private com.tencent.mm.sdk.b.c qAI;
  private boolean qAJ;
  private MediaPlayer qAK;
  public MainSightSelectContactView qAt;
  public SightCameraView qAu;
  private b qAv;
  public View qAw;
  public View qAx;
  public View qAy;
  private Dialog qAz;

  public MainSightForwardContainerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MainSightForwardContainerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(25043);
    this.qAz = null;
    this.mIsPlaying = false;
    this.qAA = true;
    this.qAB = "";
    this.qAC = false;
    this.qAD = "";
    this.mDuration = 1;
    this.qAE = 1.0F;
    this.mIsPause = false;
    this.qAF = new com.tencent.mm.plugin.sight.encode.a.b();
    this.qAG = false;
    this.qAH = false;
    this.qAI = new com.tencent.mm.sdk.b.c()
    {
    };
    this.qAJ = false;
    AppMethodBeat.o(25043);
  }

  public final boolean DX()
  {
    if (!this.qAA);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void clC()
  {
    AppMethodBeat.i(25057);
    this.qAu.setVisibility(0);
    kF(true);
    AppMethodBeat.o(25057);
  }

  public final void clD()
  {
    AppMethodBeat.i(25058);
    this.qAu.setVisibility(4);
    kF(false);
    AppMethodBeat.o(25058);
  }

  public final void clE()
  {
    boolean bool1 = true;
    AppMethodBeat.i(25045);
    ab.i("MicroMsg.MainSightContainerView", "toggle play video, path %s, mute %B, playing %B", new Object[] { this.qAD, Boolean.valueOf(this.qAA), Boolean.valueOf(this.mIsPlaying) });
    if (!this.qAu.isPlaying())
      this.qAA = true;
    boolean bool2 = this.qAA;
    this.qAu.bg(this.qAD, bool2);
    if (!this.qAA)
    {
      kF(false);
      this.mIsPlaying = true;
      if (this.qAA)
        break label122;
    }
    while (true)
    {
      this.qAA = bool1;
      AppMethodBeat.o(25045);
      return;
      kF(true);
      break;
      label122: bool1 = false;
    }
  }

  public final void clF()
  {
    AppMethodBeat.i(25055);
    this.qAy.setVisibility(8);
    AppMethodBeat.o(25055);
  }

  public final void clH()
  {
    AppMethodBeat.i(25050);
    if (this.qAz == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.MainSightContainerView", "do send to friend, loadingDialog null %B", new Object[] { Boolean.valueOf(bool) });
      if ((!bo.isNullOrNil(this.qAD)) && (!this.qAt.clR()))
        break;
      AppMethodBeat.o(25050);
      return;
    }
    Object localObject1 = this.qAt.getSelectedContact();
    com.tencent.mm.plugin.report.service.h.pYm.e(11443, new Object[] { Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(((List)localObject1).size()) });
    Object localObject2 = new MainSightForwardContainerView.6(this, (List)localObject1);
    com.tencent.mm.plugin.sight.encode.a.b localb;
    Object localObject3;
    int i;
    String str1;
    String str2;
    if (((List)localObject1).size() == 1)
    {
      localb = this.qAF;
      localObject3 = this.qAD;
      i = this.mDuration;
      str1 = this.qAB;
      str2 = (String)((List)localObject1).get(0);
      if (bo.isNullOrNil((String)localObject3))
      {
        ab.w("MicroMsg.SightRecorderHelper", "remux and send sight error: in path is null");
        com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
        if ((this.qAt.getSelectedContact().size() > 1) || (this.qAv == null))
          break label866;
        localObject2 = (String)this.qAt.getSelectedContact().get(0);
        this.qAv.startChattingUI((String)localObject2);
      }
    }
    label866: for (bool = false; ; bool = true)
    {
      while (true)
      {
        if (this.iWA != null)
          localObject2 = this.iWA.getAssets();
        try
        {
          localObject3 = ((AssetManager)localObject2).openFd("sight_send_song.wav");
          localObject2 = new com/tencent/mm/compatible/b/k;
          ((k)localObject2).<init>();
          this.qAK = ((MediaPlayer)localObject2);
          this.qAK.setDataSource(((AssetFileDescriptor)localObject3).getFileDescriptor(), ((AssetFileDescriptor)localObject3).getStartOffset(), ((AssetFileDescriptor)localObject3).getLength());
          ((AssetFileDescriptor)localObject3).close();
          localObject3 = this.qAK;
          localObject2 = new com/tencent/mm/plugin/sight/encode/ui/MainSightForwardContainerView$7;
          ((MainSightForwardContainerView.7)localObject2).<init>(this);
          ((MediaPlayer)localObject3).setOnCompletionListener((MediaPlayer.OnCompletionListener)localObject2);
          this.qAK.setLooping(false);
          this.qAK.prepare();
          this.qAK.start();
          kE(bool);
          localObject1 = ((List)localObject1).iterator();
          while (true)
            if (((Iterator)localObject1).hasNext())
              if (((String)((Iterator)localObject1).next()).toLowerCase().endsWith("@chatroom"))
              {
                com.tencent.mm.plugin.report.service.h.pYm.e(11442, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
                continue;
                if (bo.isNullOrNil(str2))
                {
                  ab.w("MicroMsg.SightRecorderHelper", "remux and send sight error: toUser null");
                  com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
                  break;
                }
                if ((!e.ct((String)localObject3)) || (e.cs((String)localObject3) <= 0))
                {
                  ab.w("MicroMsg.SightRecorderHelper", "file not exist or file size error");
                  com.tencent.mm.ui.base.h.bQ(ah.getContext(), ah.getContext().getString(2131303511));
                  break;
                }
                String str3 = com.tencent.mm.a.g.cz((String)localObject3);
                ab.i("MicroMsg.SightRecorderHelper", "do share to friends, check md5 target[%s] current[%s]", new Object[] { str1, str3 });
                if (!bo.bc(str1, "").equals(str3))
                {
                  ab.e("MicroMsg.SightRecorderHelper", "error md5, return");
                  com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
                  break;
                }
                com.tencent.mm.kernel.g.RQ();
                if (com.tencent.mm.kernel.g.RS().aa(new b.3(localb, str2, (b.a)localObject2, (String)localObject3, i)) >= 0)
                  break;
                ab.e("MicroMsg.SightRecorderHelper", "post short video encoder error");
                com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
                break;
                localb = this.qAF;
                str3 = this.qAD;
                i = this.mDuration;
                str2 = this.qAB;
                if (bo.isNullOrNil(str3))
                {
                  ab.w("MicroMsg.SightRecorderHelper", "remux and send sight error: in path is null");
                  com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
                  break;
                }
                if ((localObject1 == null) || (((List)localObject1).isEmpty()))
                {
                  ab.w("MicroMsg.SightRecorderHelper", "remux and send sight error: toUser list empty");
                  com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
                  break;
                }
                if ((!e.ct(str3)) || (e.cs(str3) <= 0))
                {
                  ab.w("MicroMsg.SightRecorderHelper", "file not exist or file size error");
                  com.tencent.mm.ui.base.h.bQ(ah.getContext(), ah.getContext().getString(2131303511));
                  break;
                }
                localObject3 = com.tencent.mm.a.g.cz(str3);
                ab.i("MicroMsg.SightRecorderHelper", "do share to friends, check md5 target[%s] current[%s]", new Object[] { str2, localObject3 });
                if (!bo.bc(str2, "").equals(localObject3))
                {
                  ab.e("MicroMsg.SightRecorderHelper", "error md5, return");
                  com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
                  break;
                }
                com.tencent.mm.kernel.g.RQ();
                if (com.tencent.mm.kernel.g.RS().aa(new b.4(localb, str3, (List)localObject1, str2, (b.a)localObject2, i)) >= 0)
                  break;
                ab.e("MicroMsg.SightRecorderHelper", "post short video encoder error");
                com.tencent.mm.plugin.sight.encode.a.b.a((b.a)localObject2, -1);
              }
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.MainSightContainerView", localIOException, "", new Object[0]);
            continue;
            com.tencent.mm.plugin.report.service.h.pYm.e(11442, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
          }
          AppMethodBeat.o(25050);
        }
      }
      break;
    }
  }

  public int getViewHeight()
  {
    AppMethodBeat.i(25059);
    int i = getHeight();
    if (i <= 0)
    {
      i = getResources().getDisplayMetrics().heightPixels;
      AppMethodBeat.o(25059);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(25059);
    }
  }

  public final void kD(boolean paramBoolean)
  {
    AppMethodBeat.i(25056);
    if (paramBoolean)
    {
      this.qAy.setVisibility(0);
      setIsMute(true);
      AppMethodBeat.o(25056);
    }
    while (true)
    {
      return;
      clF();
      setIsMute(DX());
      AppMethodBeat.o(25056);
    }
  }

  public final void kE(boolean paramBoolean)
  {
    AppMethodBeat.i(25047);
    if (this.qAC)
      AppMethodBeat.o(25047);
    while (true)
    {
      return;
      this.qAC = true;
      bo.hideVKB(this);
      this.mIsPlaying = false;
      this.qAA = true;
      ab.d("MicroMsg.MainSightContainerView", "dismiss sight view");
      this.qAH = false;
      this.qAu.clS();
      if ((this.qAv != null) && (paramBoolean))
        this.qAv.clG();
      if (this.qAt != null)
      {
        MainSightSelectContactView localMainSightSelectContactView = this.qAt;
        localMainSightSelectContactView.qAC = true;
        bo.hideVKB(localMainSightSelectContactView);
        localMainSightSelectContactView.qBg.clN();
        localMainSightSelectContactView.qBq.clear();
        localMainSightSelectContactView.qBp.clear();
        localMainSightSelectContactView.mListView.setAdapter(null);
        localMainSightSelectContactView.mListView.clearAnimation();
        localMainSightSelectContactView.setVisibility(8);
      }
      setCameraShadowAlpha(0.85F);
      clF();
      kF(false);
      this.qAB = "";
      removeListener();
      AppMethodBeat.o(25047);
    }
  }

  public final void kF(boolean paramBoolean)
  {
    AppMethodBeat.i(25048);
    if (this.qAG == paramBoolean)
      AppMethodBeat.o(25048);
    while (true)
    {
      return;
      this.qAG = paramBoolean;
      if (paramBoolean)
      {
        if (this.qAx.getVisibility() == 0)
        {
          AppMethodBeat.o(25048);
        }
        else
        {
          this.qAu.postDelayed(new MainSightForwardContainerView.4(this), 100L);
          AppMethodBeat.o(25048);
        }
      }
      else
      {
        this.qAx.setVisibility(8);
        this.ofJ.setVisibility(8);
        AppMethodBeat.o(25048);
      }
    }
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(25049);
    paramInt--;
    if ((MainSightSelectContactView.CH(paramInt)) && (this.mIsPlaying))
    {
      clE();
      AppMethodBeat.o(25049);
    }
    while (true)
    {
      return;
      if (c.WU(this.qAt.mW(paramInt)))
      {
        this.qAt.qBg.clL();
        AppMethodBeat.o(25049);
      }
      else
      {
        if (!c.WT(this.qAt.mW(paramInt)))
          break;
        if (c.qAQ)
        {
          this.qAH = true;
          this.qAu.clS();
          paramAdapterView = this.iWA;
          String str1 = com.tencent.mm.plugin.sight.base.d.WO(this.qAD);
          paramView = this.qAD;
          String str2 = this.qAB;
          ab.i("MicroMsg.SightRecorderHelper", "share video path %s, thumb path %s", new Object[] { paramView, str1 });
          Object localObject;
          if (!e.ct(str1))
            localObject = com.tencent.mm.plugin.sight.base.d.ag(paramView, 320, 240);
          try
          {
            com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, 60, Bitmap.CompressFormat.JPEG, str1, true);
            localObject = new Intent();
            ((Intent)localObject).putExtra("KSightPath", paramView);
            ((Intent)localObject).putExtra("KSightThumbPath", str1);
            ((Intent)localObject).putExtra("sight_md5", str2);
            ((Intent)localObject).putExtra("KSightDraftEntrance", false);
            ((Intent)localObject).putExtra("Ksnsupload_source", 0);
            ((Intent)localObject).putExtra("KSnsPostManu", true);
            ((Intent)localObject).putExtra("KTouchCameraTime", bo.anT());
            com.tencent.mm.bp.d.b(paramAdapterView, "sns", ".ui.SightUploadUI", (Intent)localObject, 5985);
            if (this.qAJ)
            {
              com.tencent.mm.plugin.report.service.h.pYm.e(11442, new Object[] { Integer.valueOf(3), Integer.valueOf(3) });
              AppMethodBeat.o(25049);
            }
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.SightRecorderHelper", localException, "", new Object[0]);
              ab.e("MicroMsg.SightRecorderHelper", "save bitmap to image error");
            }
            com.tencent.mm.plugin.report.service.h.pYm.e(11442, new Object[] { Integer.valueOf(1), Integer.valueOf(3) });
          }
        }
        else
        {
          AppMethodBeat.o(25049);
        }
      }
    }
    ab.d("MicroMsg.MainSightContainerView", "on item click Item : %d", new Object[] { Integer.valueOf(paramInt) });
    paramView = this.qAt;
    label420: label450: boolean bool;
    if ((paramInt < 0) || (paramInt > paramView.qBi.getCount()))
    {
      paramAdapterView = this.qAt;
      if (paramAdapterView.qBi != null)
        paramAdapterView.qBi.notifyDataSetChanged();
      if (DX())
        break label606;
      clE();
      if (this.qAt.qBg.clK())
      {
        paramAdapterView = this.qAt;
        if (paramAdapterView.qBi.Pn(paramInt) != null)
          break label693;
        bool = false;
      }
    }
    while (true)
    {
      if (bool)
        this.qAt.qBg.clL();
      AppMethodBeat.o(25049);
      break;
      paramAdapterView = paramView.qBi.Pn(paramInt);
      if (paramAdapterView == null)
        break label420;
      if (paramView.qBq.contains(paramAdapterView.ehM.field_username))
      {
        paramView.qBq.remove(paramAdapterView.ehM.field_username);
        label551: c.qAQ = paramView.qBq.isEmpty();
        if (paramView.qBq.isEmpty())
          break label600;
      }
      label600: for (bool = true; ; bool = false)
      {
        c.qAR = bool;
        break;
        paramView.qBq.add(paramAdapterView.ehM.field_username);
        break label551;
      }
      label606: if (this.qAt.clR())
      {
        if (this.ofJ.getVisibility() != 0)
          break label450;
        this.ofJ.setVisibility(8);
        this.ofJ.startAnimation(AnimationUtils.loadAnimation(this.iWA, 2131034181));
        break label450;
      }
      if (this.ofJ.getVisibility() == 0)
        break label450;
      this.ofJ.setVisibility(0);
      this.ofJ.startAnimation(AnimationUtils.loadAnimation(this.iWA, 2131034180));
      break label450;
      label693: if (paramAdapterView.qBi.Pn(paramInt).ehM == null)
        bool = false;
      else
        bool = paramAdapterView.qBq.contains(paramAdapterView.qBi.Pn(paramInt).ehM.field_username);
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(25053);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) && (!this.qAC) && (this.qAt != null))
    {
      ab.d("MicroMsg.MainSightContainerView", "change size l: %d, t: %d, r: %d, b: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
      this.qAt.clQ();
    }
    AppMethodBeat.o(25053);
  }

  public final void onPause()
  {
    AppMethodBeat.i(25051);
    if (this.qAH)
      AppMethodBeat.o(25051);
    while (true)
    {
      return;
      this.qAu.setVisibility(0);
      kF(false);
      this.qAu.clS();
      this.mIsPause = true;
      AppMethodBeat.o(25051);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(25052);
    int i;
    if (!this.qAC)
    {
      i = 1;
      if (i == 0)
        break label69;
      com.tencent.mm.sdk.b.a.xxA.d(this.qAI);
      com.tencent.mm.sdk.b.a.xxA.c(this.qAI);
    }
    while (true)
    {
      if (this.mIsPause)
      {
        clE();
        this.mIsPause = false;
      }
      AppMethodBeat.o(25052);
      return;
      i = 0;
      break;
      label69: removeListener();
    }
  }

  public final void removeListener()
  {
    AppMethodBeat.i(25044);
    com.tencent.mm.sdk.b.a.xxA.d(this.qAI);
    AppMethodBeat.o(25044);
  }

  @TargetApi(11)
  public void setCameraShadowAlpha(float paramFloat)
  {
    AppMethodBeat.i(25054);
    paramFloat = Math.min(1.0F, Math.max(0.0F, paramFloat));
    AlphaAnimation localAlphaAnimation;
    if (com.tencent.mm.compatible.util.d.iW(11))
    {
      this.qAw.setAlpha(paramFloat);
      ab.d("MicroMsg.MainSightContainerView", "set alpha: %f", new Object[] { Float.valueOf(paramFloat) });
      if (paramFloat > 0.0F)
        break label129;
      this.qAw.setVisibility(8);
      localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
      localAlphaAnimation.setDuration(500L);
      this.qAw.startAnimation(localAlphaAnimation);
      AppMethodBeat.o(25054);
    }
    while (true)
    {
      return;
      localAlphaAnimation = new AlphaAnimation(paramFloat, paramFloat);
      localAlphaAnimation.setDuration(0L);
      localAlphaAnimation.setFillAfter(true);
      this.qAw.startAnimation(localAlphaAnimation);
      break;
      label129: this.qAw.setVisibility(0);
      AppMethodBeat.o(25054);
    }
  }

  public void setIMainSightViewCallback(b paramb)
  {
    this.qAv = paramb;
  }

  public void setIsForSns(boolean paramBoolean)
  {
    this.qAJ = paramBoolean;
  }

  public void setIsMute(boolean paramBoolean)
  {
    AppMethodBeat.i(25046);
    if (this.qAu == null)
      AppMethodBeat.o(25046);
    while (true)
    {
      return;
      this.qAu.setIsMute(paramBoolean);
      AppMethodBeat.o(25046);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.MainSightForwardContainerView
 * JD-Core Version:    0.6.2
 */