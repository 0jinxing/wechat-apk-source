package com.tencent.mm.ui.chatting.gallery;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.am;
import com.tencent.mm.g.a.au;
import com.tencent.mm.g.a.au.b;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.a.gs;
import com.tencent.mm.g.a.gs.b;
import com.tencent.mm.g.a.np;
import com.tencent.mm.g.a.pv;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bh;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.network.n;
import com.tencent.mm.plugin.scanner.c.a.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.o;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMNewPhotoEditUI;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.MMViewPager;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.WxImageView;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.e.b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

@com.tencent.mm.kernel.i
@com.tencent.mm.ui.base.a(3)
public class ImageGalleryUI extends MMActivity
  implements View.OnClickListener, a.a<String, Integer>, ap.a
{
  protected String chatroomName;
  private View contentView;
  public long cvx;
  private int icC;
  private int icD;
  public long jMj;
  Bundle jWy;
  private boolean jYD;
  com.tencent.mm.ui.tools.e jYE;
  int kkq;
  int kkr;
  int kks;
  int kkt;
  private n.d lcJ;
  private ak mHandler;
  protected MMViewPager mQT;
  public boolean mgP;
  private com.tencent.mm.sdk.b.c mip;
  private ImageView mmX;
  private boolean osu;
  private ImageView qbx;
  private ValueAnimator qfZ;
  private n qgg;
  private String riC;
  private boolean riD;
  private com.tencent.mm.sdk.b.c riJ;
  private com.tencent.mm.ui.widget.a.d riy;
  private String riz;
  private int rpA;
  private int rpB;
  int rpw;
  int rpx;
  int rpy;
  private float rpz;
  private boolean suk;
  protected String talker;
  private HashSet<Long> yOW;
  private boolean yRs;
  protected boolean yRt;
  public c yTG;
  private final boolean yTR;
  private c.b yVI;
  private RelativeLayout yVJ;
  private RelativeLayout yVK;
  private boolean yVL;
  private ImageView yVM;
  private RelativeLayout yVN;
  private RelativeLayout yVO;
  private FrameLayout yVP;
  View yVQ;
  Button yVR;
  Button yVS;
  View yVT;
  private View yVU;
  protected VideoPlayerSeekBar yVV;
  int yVW;
  int yVX;
  boolean yVY;
  ArrayList<Integer> yVZ;
  private boolean yWA;
  private boolean yWB;
  private boolean yWa;
  protected boolean yWb;
  protected boolean yWc;
  private boolean yWd;
  private int yWe;
  private com.tencent.mm.plugin.scanner.c.a<String, Integer> yWf;
  private volatile int yWg;
  private boolean yWh;
  private int yWi;
  private String yWj;
  private ImageView yWk;
  private ImageView yWl;
  public ImageGalleryUI.a yWm;
  private View yWn;
  private CheckBox yWo;
  private View yWp;
  private boolean yWq;
  private com.tencent.mm.sdk.b.c<pv> yWr;
  private int yWs;
  private ViewPager.OnPageChangeListener yWt;
  boolean yWu;
  ap yWv;
  private HashMap<Long, String> yWw;
  private boolean yWx;
  private boolean yWy;
  private ap yWz;

  public ImageGalleryUI()
  {
    AppMethodBeat.i(32227);
    this.suk = false;
    this.rpy = 0;
    this.yVW = 0;
    this.yVX = 0;
    this.kkq = 0;
    this.kkr = 0;
    this.kks = 0;
    this.kkt = 0;
    this.yVZ = new ArrayList();
    this.yRs = false;
    this.mgP = false;
    this.riD = false;
    this.yWb = false;
    this.yRt = false;
    this.yWc = false;
    this.jYD = false;
    this.yWi = 0;
    this.yTR = false;
    this.yWj = null;
    this.mip = new ImageGalleryUI.1(this);
    this.riJ = new ImageGalleryUI.12(this);
    this.qgg = new ImageGalleryUI.19(this);
    this.yWq = true;
    this.rpz = 1.0F;
    this.rpA = 0;
    this.rpB = 0;
    this.lcJ = new ImageGalleryUI.9(this);
    this.yWr = new ImageGalleryUI.10(this);
    this.yWs = 0;
    this.yWt = new ViewPager.OnPageChangeListener()
    {
      private boolean yWG = false;

      public final void onPageScrollStateChanged(int paramAnonymousInt)
      {
        AppMethodBeat.i(32209);
        ab.d("MicroMsg.ImageGalleryUI", "onPageScrollStateChanged: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (paramAnonymousInt == 2)
        {
          this.yWG = true;
          ImageGalleryUI.J(ImageGalleryUI.this);
          ImageGalleryUI.K(ImageGalleryUI.this);
          ImageGalleryUI.L(ImageGalleryUI.this);
        }
        if (paramAnonymousInt == 0)
        {
          if (this.yWG)
            ImageGalleryUI.this.dGt();
          this.yWG = false;
        }
        if (ImageGalleryUI.j(ImageGalleryUI.this) != null)
        {
          Object localObject = ImageGalleryUI.j(ImageGalleryUI.this);
          if (((c)localObject).yTN != null)
          {
            localObject = ((c)localObject).yTN;
            ((e)localObject).mScrollState = paramAnonymousInt;
            if (((e)localObject).yVa != null)
              ((e)localObject).yVa.onPageScrollStateChanged(paramAnonymousInt);
          }
        }
        AppMethodBeat.o(32209);
      }

      public final void onPageScrolled(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2)
      {
      }

      public final void onPageSelected(int paramAnonymousInt)
      {
        AppMethodBeat.i(32208);
        if (ImageGalleryUI.j(ImageGalleryUI.this) == null)
        {
          AppMethodBeat.o(32208);
          return;
        }
        if (ImageGalleryUI.G(ImageGalleryUI.this) != paramAnonymousInt)
        {
          if (ImageGalleryUI.f(ImageGalleryUI.this) == 1)
            ImageGalleryUI.g(ImageGalleryUI.this);
          ImageGalleryUI.I(ImageGalleryUI.this);
          ImageGalleryUI.i(ImageGalleryUI.this);
        }
        if (ImageGalleryUI.j(ImageGalleryUI.this).Fp(paramAnonymousInt) == null)
          ab.e("MicroMsg.ImageGalleryUI", "onPageSelected the view is null, position = %s ", new Object[] { Integer.valueOf(paramAnonymousInt) });
        ImageGalleryUI.u(ImageGalleryUI.this);
        ImageGalleryUI.f(ImageGalleryUI.this, paramAnonymousInt);
        Object localObject1;
        Object localObject2;
        label220: long l;
        if (ImageGalleryUI.j(ImageGalleryUI.this) != null)
        {
          localObject1 = ImageGalleryUI.j(ImageGalleryUI.this);
          ((c)localObject1).yTO.Du();
          ((c)localObject1).yTP.Du();
          localObject1 = ImageGalleryUI.j(ImageGalleryUI.this).Ou(paramAnonymousInt);
          if ((c.c((bi)localObject1)) || (c.bq((bi)localObject1)))
          {
            localObject2 = ImageGalleryUI.a(ImageGalleryUI.this, ImageGalleryUI.j(ImageGalleryUI.this), ImageGalleryUI.this.mQT);
            if ((localObject2 != null) && ((localObject2 instanceof com.tencent.mm.ui.base.g)))
            {
              if (!(localObject2 instanceof MultiTouchImageView))
                break label401;
              ((MultiTouchImageView)localObject2).dzA();
            }
            ((com.tencent.mm.plugin.comm.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.comm.a.b.class)).T((bi)localObject1);
          }
          if (localObject1 != null)
            ImageGalleryUI.this.nq(((cy)localObject1).field_msgId);
          if (ImageGalleryUI.j(ImageGalleryUI.this) == null)
            break label489;
          localObject2 = ImageGalleryUI.j(ImageGalleryUI.this).f((bi)localObject1, false);
          ImageGalleryUI.j(ImageGalleryUI.this);
          if (!c.b((bi)localObject1, (com.tencent.mm.at.e)localObject2))
            break label424;
          localObject1 = com.tencent.mm.at.f.a((com.tencent.mm.at.e)localObject2);
          int i = ((com.tencent.mm.at.e)localObject1).frO;
          int j = ((com.tencent.mm.at.e)localObject1).offset;
          if (i == 0)
            break label418;
          l = j * 100L / i - 1L;
          label325: j = Math.max(1, (int)l);
          ab.d("MicroMsg.ImageGalleryUI", "jacks loading hd from imgInfo : %d, time: %d", new Object[] { Integer.valueOf(j), Long.valueOf(System.currentTimeMillis()) });
          ImageGalleryUI.this.Pe(j);
        }
        while (true)
        {
          if (ImageGalleryUI.j(ImageGalleryUI.this) != null)
            ImageGalleryUI.j(ImageGalleryUI.this).onPageSelected(paramAnonymousInt);
          AppMethodBeat.o(32208);
          break;
          label401: if (!(localObject2 instanceof WxImageView))
            break label220;
          ((WxImageView)localObject2).dzA();
          break label220;
          label418: l = 0L;
          break label325;
          label424: if ((localObject1 != null) && (!((bi)localObject1).bws()) && (ImageGalleryUI.j(ImageGalleryUI.this).bs((bi)localObject1)))
          {
            ImageGalleryUI.this.hG(false);
          }
          else
          {
            ImageGalleryUI.this.hG(true);
            while (true)
            {
              if (localObject1 != null)
                break label500;
              ab.e("MicroMsg.ImageGalleryUI", "update footer fail, msg is null, position = ".concat(String.valueOf(paramAnonymousInt)));
              break;
              label489: ab.e("MicroMsg.ImageGalleryUI", "[arthurdan.ImageGallery] Notice!!! adapter is null");
            }
            label500: ImageGalleryUI.this.bF((bi)localObject1);
            ImageGalleryUI.k(ImageGalleryUI.this);
          }
        }
      }
    };
    this.yWu = false;
    this.yWv = new ap(new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(32212);
        if (ImageGalleryUI.M(ImageGalleryUI.this))
          ImageGalleryUI.this.dGm();
        AppMethodBeat.o(32212);
        return false;
      }
    }
    , false);
    this.yWw = new HashMap();
    this.yWx = false;
    this.yWy = false;
    this.mHandler = new ak(Looper.getMainLooper());
    this.yWA = false;
    this.yWB = false;
    this.yOW = new HashSet();
    AppMethodBeat.o(32227);
  }

  private void Pb(int paramInt)
  {
    AppMethodBeat.i(32263);
    ab.i("MicroMsg.ImageGalleryUI", "enterGrid source : ".concat(String.valueOf(paramInt)));
    if (this.yTG == null)
    {
      ab.w("MicroMsg.ImageGalleryUI", "try to enterGrid, but adapter is NULL");
      AppMethodBeat.o(32263);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(219L, 13L, 1L, true);
      int i = this.yTG.getRealCount();
      if (this.yTG.dFO() == null)
      {
        ab.e("MicroMsg.ImageGalleryUI", "msgInfo is null");
        AppMethodBeat.o(32263);
      }
      else
      {
        int j = this.yTG.yTJ.OU(this.mQT.getCurrentItem());
        if (!this.yWb)
        {
          Intent localIntent = new Intent();
          localIntent.setClass(this.mController.ylL, MediaHistoryGalleryUI.class);
          localIntent.addFlags(67108864);
          localIntent.putExtra("kintent_intent_source", paramInt);
          localIntent.putExtra("kintent_talker", dGc());
          localIntent.putExtra("kintent_image_count", i);
          localIntent.putExtra("kintent_image_index", j);
          localIntent.putExtra("key_biz_chat_id", this.jMj);
          localIntent.putExtra("key_is_biz_chat", this.mgP);
          startActivity(localIntent);
          this.mHandler.postDelayed(new ImageGalleryUI.14(this), 50L);
          AppMethodBeat.o(32263);
        }
        else
        {
          bcW();
          AppMethodBeat.o(32263);
        }
      }
    }
  }

  static Animation Pd(int paramInt)
  {
    AppMethodBeat.i(32275);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation.setDuration(paramInt);
    localAlphaAnimation.setFillAfter(true);
    localAlphaAnimation.setInterpolator(new AccelerateInterpolator(10.0F));
    AppMethodBeat.o(32275);
    return localAlphaAnimation;
  }

  private View a(c paramc, MMViewPager paramMMViewPager)
  {
    Object localObject = null;
    AppMethodBeat.i(32243);
    boolean bool1;
    if (paramc == null)
    {
      bool1 = true;
      if (paramMMViewPager != null)
        break label82;
    }
    label82: for (boolean bool2 = true; ; bool2 = false)
    {
      ab.d("MicroMsg.ImageGalleryUI", "get current view adapter is null %b, gallery is null %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((paramc == null) || (paramMMViewPager == null))
        break label178;
      if (paramc.dFO() != null)
        break label88;
      AppMethodBeat.o(32243);
      paramc = (c)localObject;
      return paramc;
      bool1 = false;
      break;
    }
    label88: if ((paramc.dFO().drE()) || (paramc.dFO().dtA()))
    {
      MultiTouchImageView localMultiTouchImageView = paramc.wx(paramMMViewPager.getCurrentItem());
      localObject = localMultiTouchImageView;
      if (localMultiTouchImageView == null)
        localObject = paramc.wy(paramMMViewPager.getCurrentItem());
    }
    while (true)
    {
      AppMethodBeat.o(32243);
      paramc = (c)localObject;
      break;
      if ((paramc.dFO().bws()) || (paramc.dFO().bwt()))
      {
        localObject = paramc.OO(paramMMViewPager.getCurrentItem());
        continue;
        label178: ab.w("MicroMsg.ImageGalleryUI", "%d get current view but adapter or gallery is null", new Object[] { Integer.valueOf(hashCode()) });
      }
      else
      {
        localObject = null;
      }
    }
  }

  private void a(String paramString, com.tencent.mm.at.e parame)
  {
    AppMethodBeat.i(32291);
    String str1 = getIntent().getStringExtra("GalleryUI_FromUser");
    String str2 = getIntent().getStringExtra("GalleryUI_ToUser");
    Intent localIntent = new Intent();
    ab.i("MicroMsg.ImageGalleryUI", "edit image path:%s", new Object[] { paramString });
    localIntent.putExtra("raw_photo_path", paramString);
    localIntent.putExtra("raw_photo_img_id", parame.fDy);
    localIntent.putExtra("GalleryUI_FromUser", str1);
    localIntent.putExtra("GalleryUI_ToUser", str2);
    localIntent.putExtra("from_scene", 291);
    localIntent.putExtra("after_photo_edit", "");
    localIntent.setClass(this, MMNewPhotoEditUI.class);
    startActivityForResult(localIntent, 4369);
    overridePendingTransition(0, 0);
    AppMethodBeat.o(32291);
  }

  private static void al(View paramView, int paramInt)
  {
    AppMethodBeat.i(32233);
    if (paramView != null)
      paramView.setVisibility(paramInt);
    AppMethodBeat.o(32233);
  }

  private boolean ary(String paramString)
  {
    AppMethodBeat.i(32247);
    boolean bool;
    if (this.yWe == 1)
    {
      AppMethodBeat.o(32247);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramString))
      {
        AppMethodBeat.o(32247);
        bool = false;
      }
      else if (!this.yWd)
      {
        AppMethodBeat.o(32247);
        bool = true;
      }
      else
      {
        String[] arrayOfString = ((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xOB, "")).split("\\|");
        if ((arrayOfString != null) && (arrayOfString.length > 0))
        {
          int i = arrayOfString.length;
          for (int j = 0; ; j++)
          {
            if (j >= i)
              break label170;
            String str = arrayOfString[j];
            if ((!bo.isNullOrNil(str)) && (paramString.startsWith(str)))
            {
              ab.i("MicroMsg.ImageGalleryUI", "curDealQBarStr:%s, blockQrcodeStr:%s", new Object[] { paramString, str });
              AppMethodBeat.o(32247);
              bool = false;
              break;
            }
          }
        }
        label170: AppMethodBeat.o(32247);
        bool = true;
      }
    }
  }

  private boolean av(Activity paramActivity)
  {
    boolean bool = false;
    AppMethodBeat.i(32289);
    paramActivity = paramActivity.getWindowManager().getDefaultDisplay();
    int i = paramActivity.getWidth();
    int j = paramActivity.getHeight();
    int k;
    if (i < j)
    {
      k = 1;
      ab.d("MicroMsg.ImageGalleryUI", "%d is vertical screen orient %d [%d, %d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j) });
      if (k != 0)
        break label103;
      AppMethodBeat.o(32289);
    }
    while (true)
    {
      return bool;
      k = 0;
      break;
      label103: AppMethodBeat.o(32289);
      bool = true;
    }
  }

  private void bcW()
  {
    AppMethodBeat.i(32244);
    if ((this.suk) || (this.yTG == null))
    {
      ab.i("MicroMsg.ImageGalleryUI", "isRunningExitAnimation");
      AppMethodBeat.o(32244);
    }
    int i;
    int j;
    int k;
    int m;
    int n;
    label421: Object localObject2;
    while (true)
    {
      return;
      dGf();
      if (this.yVL)
      {
        finish();
        com.tencent.mm.ui.base.b.hL(this.mController.ylL);
        AppMethodBeat.o(32244);
      }
      else
      {
        ab.i("MicroMsg.ImageGalleryUI", "runExitAnimation");
        i = this.mQT.getWidth() / 2;
        j = this.mQT.getHeight() / 2;
        this.yTG.dFM();
        if (!this.yWb)
          break;
        localObject1 = new gs();
        ((gs)localObject1).cBr.cvx = this.yTG.Ou(this.mQT.getCurrentItem()).field_msgId;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        k = ((gs)localObject1).cBs.ctV;
        m = ((gs)localObject1).cBs.ctW;
        i = ((gs)localObject1).cBs.ctT;
        j = ((gs)localObject1).cBs.ctU;
        this.rpw = this.mQT.getWidth();
        this.rpx = this.mQT.getHeight();
        n = m;
        if (this.yTG.dFO() != null)
        {
          if ((this.yTG.dFO().bwt()) || (this.yTG.dFO().bws()))
            this.rpx = ((int)(this.rpw / k * m));
          if (!this.yTG.dFO().drE())
          {
            n = m;
            if (!this.yTG.dFO().dtA());
          }
          else
          {
            localObject1 = (com.tencent.mm.ui.base.g)a(this.yTG, this.mQT);
            n = m;
            if (localObject1 != null)
            {
              float f = this.rpw / ((com.tencent.mm.ui.base.g)localObject1).getImageWidth();
              this.rpx = ((int)(((com.tencent.mm.ui.base.g)localObject1).getImageHeight() * f));
              n = m;
              if (this.rpx > this.mQT.getHeight())
              {
                n = m;
                if (this.rpx < this.mQT.getHeight() * 1.5D)
                {
                  if (!this.yWb)
                    break label830;
                  this.rpy = (this.rpx - this.mQT.getHeight());
                  n = m;
                }
                this.rpx = this.mQT.getHeight();
              }
            }
          }
        }
        this.jYE.hx(this.yVW, this.yVX);
        this.jYE.zFd = this.rpy;
        this.jYE.hw(this.rpw, this.rpx);
        this.jYE.L(i, j, k, n);
        localObject1 = this.mQT;
        localObject2 = a(this.yTG, this.mQT);
        if (localObject2 == null)
          break label850;
        localObject1 = localObject2;
        if (this.rpz != 1.0D)
        {
          this.jYE.zEZ = (1.0F / this.rpz);
          if (this.rpA == 0)
          {
            localObject1 = localObject2;
            if (this.rpB == 0);
          }
          else
          {
            j = (int)(this.mQT.getWidth() / 2 * (1.0F - this.rpz));
            m = this.rpA;
            n = (int)(this.mQT.getHeight() / 2 + this.rpB - this.rpx / 2 * this.rpz);
            this.jYE.hy(j + m, n);
            localObject1 = localObject2;
          }
        }
        label625: this.jYE.a((View)localObject1, this.mmX, new e.b()
        {
          public final void onAnimationEnd()
          {
            AppMethodBeat.i(32202);
            ab.i("MicroMsg.ImageGalleryUI", "runExitAnimation onAnimationEnd");
            ImageGalleryUI.t(ImageGalleryUI.this).post(new Runnable()
            {
              public final void run()
              {
                AppMethodBeat.i(32200);
                ImageGalleryUI.this.finish();
                ImageGalleryUI.this.overridePendingTransition(0, 0);
                AppMethodBeat.o(32200);
              }
            });
            ImageGalleryUI.a(ImageGalleryUI.this, false);
            AppMethodBeat.o(32202);
          }

          public final void onAnimationStart()
          {
            AppMethodBeat.i(32201);
            ImageGalleryUI.a(ImageGalleryUI.this, true);
            ImageGalleryUI.eO(ImageGalleryUI.x(ImageGalleryUI.this));
            ImageGalleryUI.eO(ImageGalleryUI.y(ImageGalleryUI.this));
            new ak().postDelayed(new ImageGalleryUI.6.1(this), 20L);
            AppMethodBeat.o(32201);
          }
        }
        , null);
        AppMethodBeat.o(32244);
      }
    }
    Object localObject1 = this.yTG.Ou(this.mQT.getCurrentItem());
    if (localObject1 != null)
    {
      localObject2 = new au();
      ((au)localObject2).ctR.csG = ((bi)localObject1);
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
      n = ((au)localObject2).ctS.ctV;
      m = ((au)localObject2).ctS.ctW;
      i = ((au)localObject2).ctS.ctT;
      j = ((au)localObject2).ctS.ctU;
    }
    while (true)
    {
      if ((i == 0) && (j == 0))
      {
        i = this.mQT.getWidth() / 2;
        j = this.mQT.getHeight() / 2;
        k = n;
        break;
      }
      if (localObject1 != null)
      {
        if (((cy)localObject1).field_isSend == 0)
          this.yVW = com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, 5);
        if (((cy)localObject1).field_isSend == 1)
          this.yVX = com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, 5);
      }
      k = n;
      break;
      label830: n = this.mQT.getHeight() * m / this.rpx;
      break label421;
      label850: break label625;
      m = 0;
      n = 0;
    }
  }

  private void chI()
  {
    AppMethodBeat.i(32250);
    this.qfZ.setRepeatMode(1);
    this.qfZ.setRepeatCount(0);
    this.qfZ.end();
    AppMethodBeat.o(32250);
  }

  private ImageGalleryUI dGa()
  {
    AppMethodBeat.i(32231);
    if (this.yVN == null)
      this.yVN = ((RelativeLayout)((ViewStub)findViewById(2131824957)).inflate());
    AppMethodBeat.o(32231);
    return this;
  }

  private ImageGalleryUI dGb()
  {
    AppMethodBeat.i(32232);
    if (this.yVO == null)
    {
      this.yVO = ((RelativeLayout)((ViewStub)findViewById(2131824961)).inflate());
      this.yVO.findViewById(2131824965).setOnClickListener(this);
    }
    AppMethodBeat.o(32232);
    return this;
  }

  private String dGc()
  {
    AppMethodBeat.i(32240);
    String str;
    if ((this.chatroomName != null) && (this.chatroomName.length() > 0))
    {
      str = this.chatroomName;
      AppMethodBeat.o(32240);
    }
    while (true)
    {
      return str;
      str = this.talker;
      AppMethodBeat.o(32240);
    }
  }

  private void dGd()
  {
    AppMethodBeat.i(32242);
    this.qbx = ((ImageView)findViewById(2131824954));
    this.qfZ = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.qfZ.setDuration(5000L);
    this.qfZ.addListener(new ImageGalleryUI.2(this));
    int i = getWindowManager().getDefaultDisplay().getHeight();
    this.qfZ.addUpdateListener(new ImageGalleryUI.3(this, i));
    AppMethodBeat.o(32242);
  }

  private String dGe()
  {
    AppMethodBeat.i(32245);
    bi localbi = this.yTG.Ou(this.yWs);
    String str = null;
    if (c.c(localbi))
    {
      com.tencent.mm.at.e locale = this.yTG.f(localbi, true);
      if (locale != null)
        str = e.a(localbi, locale);
    }
    while (true)
    {
      AppMethodBeat.o(32245);
      return str;
      if (c.br(localbi))
        str = c.e(localbi);
    }
  }

  private void dGf()
  {
    AppMethodBeat.i(32248);
    this.yWi = 0;
    this.qbx.setVisibility(8);
    this.yWk.setVisibility(8);
    this.yWl.setVisibility(8);
    dGh();
    dGt();
    hG(true);
    chI();
    AppMethodBeat.o(32248);
  }

  private void dGg()
  {
    AppMethodBeat.i(32253);
    if ((this.yTG == null) || (this.yVL))
      AppMethodBeat.o(32253);
    while (true)
    {
      return;
      if (!this.yTG.dFN())
      {
        AppMethodBeat.o(32253);
      }
      else if (dGa().yVN == null)
      {
        AppMethodBeat.o(32253);
      }
      else if (h.a.dFX().mnY)
      {
        dGi();
        AppMethodBeat.o(32253);
      }
      else if (this.yRs)
      {
        dGi();
        AppMethodBeat.o(32253);
      }
      else
      {
        ab.d("MicroMsg.ImageGalleryUI", "%d show enter grid is video %b", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(dGj()) });
        if ((this.yWi == 0) || (this.yWi == 2))
          dGh();
        dGt();
        AppMethodBeat.o(32253);
      }
    }
  }

  private void dGh()
  {
    int i = 0;
    AppMethodBeat.i(32254);
    Object localObject = dGa().yVN;
    int j;
    if (this.yWa)
    {
      j = 0;
      al((View)localObject, j);
      localObject = null;
      if (this.yTG != null)
        localObject = this.yTG.dFO();
      j = 1;
      if (this.yVI != c.b.yUn)
        j = 0;
      if ((localObject == null) || (!bh.o((bi)localObject)))
        break label112;
      j = 0;
    }
    label112: 
    while (true)
    {
      localObject = dGb().yVO;
      if (j != 0);
      for (j = i; ; j = 8)
      {
        al((View)localObject, j);
        AppMethodBeat.o(32254);
        return;
        j = 8;
        break;
      }
    }
  }

  private void dGi()
  {
    AppMethodBeat.i(32255);
    al(dGa().yVN, 8);
    al(dGb().yVO, 8);
    AppMethodBeat.o(32255);
  }

  private boolean dGj()
  {
    if (this.yVI == c.b.yUo);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void dGn()
  {
    AppMethodBeat.i(32270);
    if ((dGa().yVN == null) || (this.yWA))
    {
      AppMethodBeat.o(32270);
      return;
    }
    if (this.yVN.getVisibility() == 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.ImageGalleryUI", "fadeOutEnterGirdBtn: %B", new Object[] { Boolean.valueOf(bool) });
      Animation localAnimation = Pd(300);
      localAnimation.setFillAfter(false);
      localAnimation.setAnimationListener(new ImageGalleryUI.16(this));
      dGa().yVN.startAnimation(localAnimation);
      this.yWA = true;
      AppMethodBeat.o(32270);
      break;
    }
  }

  private void dGo()
  {
    AppMethodBeat.i(32271);
    if ((dGa().yVP == null) || (this.yWB))
      AppMethodBeat.o(32271);
    while (true)
    {
      return;
      dGa().yVP.startAnimation(Pd(300));
      this.yWB = true;
      AppMethodBeat.o(32271);
    }
  }

  private void dGp()
  {
    AppMethodBeat.i(32272);
    if ((dGa().yVN == null) || (!this.yWA) || (dGj()))
    {
      AppMethodBeat.o(32272);
      return;
    }
    if (dGa().yVN.getVisibility() == 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.ImageGalleryUI", "fadeInEnterGirdBtn: %B %s", new Object[] { Boolean.valueOf(bool), bo.dpG() });
      dGa().yVN.startAnimation(dGr());
      dGb().yVO.startAnimation(dGr());
      this.yWA = false;
      AppMethodBeat.o(32272);
      break;
    }
  }

  private void dGq()
  {
    boolean bool = true;
    AppMethodBeat.i(32273);
    if ((dGa().yVP == null) || (!this.yWB))
    {
      AppMethodBeat.o(32273);
      return;
    }
    if (dGa().yVP.getVisibility() == 0);
    while (true)
    {
      ab.d("MicroMsg.ImageGalleryUI", "fadeInPositionAtChatRecordBtn: %B", new Object[] { Boolean.valueOf(bool) });
      dGa().yVP.startAnimation(dGr());
      this.yWB = false;
      AppMethodBeat.o(32273);
      break;
      bool = false;
    }
  }

  private static Animation dGr()
  {
    AppMethodBeat.i(32274);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setDuration(150L);
    localAlphaAnimation.setFillAfter(true);
    AppMethodBeat.o(32274);
    return localAlphaAnimation;
  }

  private boolean dGs()
  {
    AppMethodBeat.i(32277);
    boolean bool;
    if ((eN(this.yVQ) == 0) && (eN(this.yVR) == 0))
    {
      bool = true;
      AppMethodBeat.o(32277);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(32277);
    }
  }

  private void dGu()
  {
    AppMethodBeat.i(32279);
    ab.d("MicroMsg.ImageGalleryUI", "jacks stop Hide Timer");
    this.yWz.stopTimer();
    AppMethodBeat.o(32279);
  }

  private void dGw()
  {
    AppMethodBeat.i(32287);
    boolean bool = ae.hw(this);
    int i = ae.fr(this);
    ab.i("MicroMsg.ImageGalleryUI", "%d handleVerticalUI image gallery ui isNavigationBarTint %b isNavBarVisibility %b navBarHeight %d", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.osu), Boolean.valueOf(bool), Integer.valueOf(i) });
    if ((this.osu) && (bool))
    {
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(this.yVJ.getLayoutParams());
      localLayoutParams.addRule(12);
      localLayoutParams.setMargins(localLayoutParams.leftMargin, localLayoutParams.topMargin, localLayoutParams.rightMargin, i);
      this.yVJ.setLayoutParams(localLayoutParams);
      localLayoutParams = new RelativeLayout.LayoutParams(this.yVK.getLayoutParams());
      localLayoutParams.addRule(10);
      localLayoutParams.setMargins(localLayoutParams.leftMargin, localLayoutParams.topMargin, 0, localLayoutParams.bottomMargin);
      this.yVK.setLayoutParams(localLayoutParams);
    }
    AppMethodBeat.o(32287);
  }

  private void dGx()
  {
    AppMethodBeat.i(32288);
    boolean bool = ae.hw(this);
    int i = ae.fr(this);
    ab.i("MicroMsg.ImageGalleryUI", "%d handleHorizontalUI image gallery ui isNavigationBarTint %b isNavBarVisibility %b navBarHeight %d", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.osu), Boolean.valueOf(bool), Integer.valueOf(i) });
    if ((this.osu) && (bool))
    {
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(this.yVJ.getLayoutParams());
      localLayoutParams.addRule(12);
      localLayoutParams.setMargins(localLayoutParams.leftMargin, localLayoutParams.topMargin, i, 0);
      this.yVJ.setLayoutParams(localLayoutParams);
      localLayoutParams = new RelativeLayout.LayoutParams(this.yVK.getLayoutParams());
      localLayoutParams.addRule(10);
      localLayoutParams.setMargins(localLayoutParams.leftMargin, localLayoutParams.topMargin, i, localLayoutParams.bottomMargin);
      this.yVK.setLayoutParams(localLayoutParams);
    }
    AppMethodBeat.o(32288);
  }

  private void dGy()
  {
    AppMethodBeat.i(32290);
    bi localbi = this.yTG.dFO();
    com.tencent.mm.at.e locale = e.d(localbi);
    String str = e.a(localbi, locale);
    ab.i("MicroMsg.ImageGalleryUI", "edit image path:%s msgId:%s", new Object[] { str, Long.valueOf(localbi.field_msgId) });
    a(str, locale);
    AppMethodBeat.o(32290);
  }

  private static int eN(View paramView)
  {
    AppMethodBeat.i(32234);
    int i;
    if (paramView != null)
    {
      i = paramView.getVisibility();
      AppMethodBeat.o(32234);
    }
    while (true)
    {
      return i;
      i = 8;
      AppMethodBeat.o(32234);
    }
  }

  private static boolean f(bi parambi, com.tencent.mm.at.e parame)
  {
    boolean bool1 = false;
    AppMethodBeat.i(32256);
    if (parame == null)
      AppMethodBeat.o(32256);
    while (true)
    {
      return bool1;
      try
      {
        if ((c.c(parambi, parame) == 0) && (parame.agQ()))
        {
          boolean bool2 = parambi.dtH();
          if (!bool2)
          {
            bool1 = true;
            AppMethodBeat.o(32256);
          }
        }
      }
      catch (NullPointerException parambi)
      {
        ab.e("MicroMsg.ImageGalleryUI", "error:".concat(String.valueOf(parambi)));
        AppMethodBeat.o(32256);
      }
    }
  }

  private static void qw(boolean paramBoolean)
  {
    AppMethodBeat.i(32261);
    ab.d("MicroMsg.ImageGalleryUI", "switch tool bar bg %b", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(32261);
  }

  public final boolean BI()
  {
    AppMethodBeat.i(32276);
    dGn();
    dGo();
    AppMethodBeat.o(32276);
    return false;
  }

  public final void Pa(int paramInt)
  {
    AppMethodBeat.i(32257);
    bF(this.yTG.Ou(paramInt));
    AppMethodBeat.o(32257);
  }

  public final void Pc(int paramInt)
  {
    AppMethodBeat.i(32268);
    if (dFZ().yVU == null)
      AppMethodBeat.o(32268);
    while (true)
    {
      return;
      dFZ().yVU.post(new ImageGalleryUI.15(this, paramInt));
      AppMethodBeat.o(32268);
    }
  }

  public final void Pe(int paramInt)
  {
    AppMethodBeat.i(32280);
    hG(true);
    dGm();
    dFY().yVQ.setVisibility(0);
    dFY().yVR.setVisibility(8);
    dFY().yVS.setVisibility(0);
    dFY().yVT.setVisibility(8);
    dGn();
    dGo();
    dFY().yVS.setText(paramInt + "%");
    AppMethodBeat.o(32280);
  }

  protected final void ak(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(138626);
    if (this.yTG == null)
      AppMethodBeat.o(138626);
    while (true)
    {
      return;
      if (this.yWs < 0)
      {
        AppMethodBeat.o(138626);
      }
      else
      {
        Object localObject1 = this.yTG.Ou(this.yWs);
        int i = this.yTG.yTN.bA((bi)localObject1);
        if ((i == 5) || (i == 6))
        {
          ab.w("MicroMsg.ImageGalleryUI", "jacks fail downloaded img, return");
          AppMethodBeat.o(138626);
        }
        else if (this.yTG.bs((bi)localObject1))
        {
          ab.w("MicroMsg.ImageGalleryUI", "jacks downloading, return");
          AppMethodBeat.o(138626);
        }
        else if ((c.f((bi)localObject1)) && (j.bG((bi)localObject1) == null))
        {
          ab.w("MicroMsg.ImageGalleryUI", "video info is null, return now.");
          AppMethodBeat.o(138626);
        }
        else
        {
          ArrayList localArrayList = new ArrayList();
          Object localObject2 = new ArrayList();
          localArrayList.add(Integer.valueOf(0));
          ((List)localObject2).add(getString(2131302498));
          if (com.tencent.mm.bp.d.afj("favorite"))
          {
            localArrayList.add(Integer.valueOf(2));
            ((List)localObject2).add(getString(2131301955));
          }
          label275: long l;
          if ((c.c((bi)localObject1)) || (c.br((bi)localObject1)))
          {
            localArrayList.add(Integer.valueOf(1));
            ((List)localObject2).add(getString(2131302709));
            Object localObject3;
            if ((this.yWh) && (!bo.isNullOrNil(dGe())))
            {
              localArrayList.add(Integer.valueOf(7));
              ((List)localObject2).add(getString(2131305855));
              localObject3 = new com.tencent.mm.g.b.a.k();
              if (this.yWi != 2)
                break label817;
              l = 1L;
              label340: ((com.tencent.mm.g.b.a.k)localObject3).cVR = l;
              ((com.tencent.mm.g.b.a.k)localObject3).cVS = 2L;
              ((com.tencent.mm.g.b.a.k)localObject3).ajK();
            }
            if ((c.c((bi)localObject1)) || (c.bp((bi)localObject1)))
            {
              localObject3 = new dq();
              ((dq)localObject3).cxc.cvx = ((cy)localObject1).field_msgId;
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
              if ((((dq)localObject3).cxd.cwB) || (com.tencent.mm.pluginsdk.model.app.g.ad(this.mController.ylL, ((bi)localObject1).getType())))
              {
                localArrayList.add(Integer.valueOf(4));
                ((List)localObject2).add(getString(2131298160));
              }
            }
            if (c.c((bi)localObject1))
            {
              if (this.yWe != 1)
                break label823;
              i = 0;
              label478: if (i != 0)
              {
                localArrayList.add(Integer.valueOf(6));
                ((List)localObject2).add(getString(2131298118));
              }
            }
            if ((this.riC != null) && (ary(this.riC)))
            {
              localArrayList.add(Integer.valueOf(3));
              if (!com.tencent.mm.plugin.scanner.a.BR(this.icC))
                break label829;
              ((List)localObject2).add(getString(2131302187));
            }
            label566: if (bh.o((bi)localObject1))
            {
              localArrayList.clear();
              ((List)localObject2).clear();
            }
            if ((this.yWd) || (this.yWe == 1) || (this.yRs) || (this.mgP) || (h.a.dFX().mnY))
              break label907;
            i = 1;
            label628: if (i != 0)
            {
              localArrayList.add(Integer.valueOf(5));
              ((List)localObject2).add(getString(2131298117));
            }
            if ((this.riy == null) || ((!this.riD) && (!this.yWh)))
              break label913;
            if (this.riD)
              this.riD = false;
            if (this.yWh)
              this.yWh = false;
          }
          while (true)
          {
            this.riy.rBl = new ImageGalleryUI.7(this, localArrayList, (List)localObject2);
            if (localArrayList.size() != 0)
              break label936;
            AppMethodBeat.o(138626);
            break;
            if ((c.f((bi)localObject1)) || (c.bp((bi)localObject1)))
            {
              localArrayList.add(Integer.valueOf(1));
              ((List)localObject2).add(getString(2131302712));
              break label275;
            }
            localArrayList.add(Integer.valueOf(1));
            ((List)localObject2).add(getString(2131302711));
            break label275;
            label817: l = 0L;
            break label340;
            label823: i = 1;
            break label478;
            label829: if (com.tencent.mm.plugin.scanner.a.ba(this.icC, this.riC))
            {
              ((List)localObject2).add(getString(2131302188));
              break label566;
            }
            if (com.tencent.mm.plugin.scanner.a.BQ(this.icC))
            {
              ((List)localObject2).add(getString(2131302186));
              break label566;
            }
            ((List)localObject2).add(getString(2131302187));
            break label566;
            label907: i = 0;
            break label628;
            label913: this.riy = new com.tencent.mm.ui.widget.a.d(this.mController.ylL, 1, false);
          }
          label936: this.riy.rBm = this.lcJ;
          this.riy.zQf = new ImageGalleryUI.8(this);
          this.riy.cpD();
          localObject2 = dGe();
          if (!bo.isNullOrNil((String)localObject2))
          {
            if ((paramBoolean1) && (aw.Rg().acS() != 0))
            {
              localObject1 = new np();
              ((np)localObject1).cJU.filePath = ((String)localObject2);
              this.riz = ((String)localObject2);
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
            }
            if (paramBoolean2)
            {
              if (this.yWf == null)
                this.yWf = new com.tencent.mm.plugin.scanner.c.b(this);
              this.yWf.a(localObject2, this);
            }
          }
          AppMethodBeat.o(138626);
        }
      }
    }
  }

  public final void bF(bi parambi)
  {
    int i = 0;
    while (true)
    {
      Object localObject1;
      try
      {
        AppMethodBeat.i(32262);
        this.yVI = c.bt(parambi);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("updateFooterInfo currGalleryType : ");
        ab.i("MicroMsg.ImageGalleryUI", this.yVI);
        if ((h.a.dFX().mnY) && (this.yWo != null))
          this.yWo.setChecked(h.a.dFX().bE(parambi));
        switch (ImageGalleryUI.18.yTX[this.yVI.ordinal()])
        {
        default:
          AppMethodBeat.o(32262);
          return;
        case 1:
          dGm();
          al(this.yVQ, 8);
          qx(true);
          parambi = j.bG(parambi);
          if (parambi == null)
          {
            AppMethodBeat.o(32262);
            continue;
          }
          break;
        case 2:
        case 3:
        case 4:
        }
      }
      finally
      {
      }
      dFZ().yVV.setVideoTotalTime(parambi.fXd);
      int j = i;
      try
      {
        if (this.yTG.dFP() != null)
        {
          j = i;
          if (this.yTG.dFP().yXp != null)
            j = this.yTG.dFP().yXp.getCurrentPosition() / 1000;
        }
        dFZ().yVV.seek(j);
        AppMethodBeat.o(32262);
      }
      catch (Exception parambi)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.ImageGalleryUI", parambi, "", new Object[0]);
          j = i;
        }
      }
      com.tencent.mm.at.e locale = this.yTG.f(parambi, false);
      dGm();
      dGg();
      if (locale == null)
      {
        ab.w("MicroMsg.ImageGalleryUI", "updateFooterInfo img info is null");
        AppMethodBeat.o(32262);
      }
      else
      {
        this.mQT.getCurrentItem();
        Object localObject2;
        if ((f(parambi, locale)) && (!parambi.dtH()) && (locale.agP()))
        {
          dFY().yVR.setVisibility(0);
          dFY().yVS.setVisibility(8);
          dFY().yVT.setVisibility(8);
          localObject2 = (String)this.yWw.get(Long.valueOf(locale.fDy));
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = br.z(locale.fDK, "msg");
            if (localObject1 == null)
            {
              ab.e("MicroMsg.ImageGalleryUI", "parse cdnInfo failed. [%s]", new Object[] { locale.fDK });
              j = -1;
              label449: l = j;
              if (l >= 0L)
                break label644;
              localObject1 = "";
              label465: this.yWw.put(Long.valueOf(locale.fDy), localObject1);
            }
          }
          else
          {
            dFY().yVR.setText(getString(2131298811, new Object[] { localObject1 }));
            al(this.yVQ, 0);
          }
        }
        while (true)
        {
          if ((!this.yVY) || (!locale.agP()) || (this.yTG.dFO() == null) || (parambi.field_msgId != this.yTG.dFO().field_msgId))
            break label781;
          ab.i("MicroMsg.ImageGalleryUI", "get image successfully! -> gotoPhotoEditUI msgId:%s", new Object[] { Long.valueOf(parambi.field_msgId) });
          dGy();
          this.yVY = false;
          AppMethodBeat.o(32262);
          break;
          i = bo.getInt((String)((Map)localObject1).get(".msg.img.$hdlength"), 0);
          j = i;
          if (i != 0)
            break label449;
          j = bo.getInt((String)((Map)localObject1).get(".msg.img.$tphdlength"), 0);
          break label449;
          label644: localObject1 = new java/math/BigDecimal;
          ((BigDecimal)localObject1).<init>(l);
          localObject2 = new java/math/BigDecimal;
          ((BigDecimal)localObject2).<init>(1048576);
          float f = ((BigDecimal)localObject1).divide((BigDecimal)localObject2, 2, 0).floatValue();
          if (f > 1.0F)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject1 = (int)f + "M";
            break label465;
          }
          localObject2 = new java/math/BigDecimal;
          ((BigDecimal)localObject2).<init>(1024);
          f = ((BigDecimal)localObject1).divide((BigDecimal)localObject2, 2, 0).floatValue();
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = (int)f + "K";
          break label465;
          al(this.yVQ, 8);
        }
        label781: localObject1 = this.yTG.dFO();
        boolean bool = this.yVY;
        long l = parambi.field_msgId;
        if (localObject1 == null);
        for (parambi = "null"; ; parambi = Long.valueOf(((cy)localObject1).field_msgId))
        {
          ab.w("MicroMsg.ImageGalleryUI", "isSoonEnterPhotoEdit:%s msgId:%s curMsgId:%s getCompleted:%s", new Object[] { Boolean.valueOf(bool), Long.valueOf(l), parambi, Boolean.valueOf(locale.agP()) });
          AppMethodBeat.o(32262);
          break;
        }
        dGm();
        dGg();
        AppMethodBeat.o(32262);
        continue;
        dGm();
        dGg();
        al(this.yVQ, 8);
        this.yTG.OT(this.mQT.getCurrentItem());
      }
    }
  }

  public final boolean cGZ()
  {
    AppMethodBeat.i(32267);
    boolean bool = dFZ().yVV.buH();
    AppMethodBeat.o(32267);
    return bool;
  }

  final ImageGalleryUI dFY()
  {
    AppMethodBeat.i(32229);
    if (this.yVQ == null)
    {
      this.yVQ = ((ViewStub)findViewById(2131824960)).inflate();
      this.yVR = ((Button)this.yVQ.findViewById(2131823182));
      this.yVS = ((Button)this.yVQ.findViewById(2131824967));
      this.yVT = this.yVQ.findViewById(2131824968);
    }
    AppMethodBeat.o(32229);
    return this;
  }

  protected final ImageGalleryUI dFZ()
  {
    AppMethodBeat.i(32230);
    if (this.yVU == null)
    {
      this.yVU = ((ViewStub)findViewById(2131822904)).inflate();
      this.yVV = ((VideoPlayerSeekBar)findViewById(2131822905));
      this.yVV.setPlayBtnOnClickListener(this);
    }
    AppMethodBeat.o(32230);
    return this;
  }

  protected final void dGk()
  {
    AppMethodBeat.i(32258);
    if (this.yWu)
      this.yWv.ae(4000L, 4000L);
    AppMethodBeat.o(32258);
  }

  public final void dGl()
  {
    AppMethodBeat.i(32259);
    ab.i("MicroMsg.ImageGalleryUI", "show video tool bar");
    hG(true);
    qw(true);
    al(this.yVQ, 8);
    al(dFZ().yVU, 0);
    al(this.yVM, 0);
    dGa().yVN.clearAnimation();
    if (this.yVL)
      dGi();
    while (true)
    {
      dGu();
      this.yWu = true;
      dGk();
      AppMethodBeat.o(32259);
      return;
      if ((this.yWi == 0) || (this.yWi == 2))
        dGh();
    }
  }

  public final void dGm()
  {
    AppMethodBeat.i(32260);
    ab.i("MicroMsg.ImageGalleryUI", "hide video tool bar");
    qw(false);
    al(dFZ().yVU, 8);
    al(this.yVM, 8);
    if (dGj())
    {
      dGu();
      dGi();
    }
    this.yWu = false;
    AppMethodBeat.o(32260);
  }

  protected final void dGt()
  {
    AppMethodBeat.i(32278);
    if ((dGs()) || (this.yTG == null))
      AppMethodBeat.o(32278);
    while (true)
    {
      return;
      ab.d("MicroMsg.ImageGalleryUI", "jacks start Hide Timer");
      this.yWz.ae(4000L, 4000L);
      AppMethodBeat.o(32278);
    }
  }

  public final void dGv()
  {
    AppMethodBeat.i(32281);
    hG(true);
    dGm();
    dFY().yVQ.setVisibility(0);
    dFY().yVR.setVisibility(8);
    dFY().yVS.setVisibility(0);
    dFY().yVT.setVisibility(8);
    dGn();
    dGo();
    dFY().yVS.setText("0%");
    AppMethodBeat.o(32281);
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(32269);
    if ((paramKeyEvent.getKeyCode() == 82) && (paramKeyEvent.getAction() == 1))
      if (this.riy != null)
      {
        this.riy.cpE();
        this.riy = null;
        AppMethodBeat.o(32269);
      }
    while (true)
    {
      return bool;
      if ((this.yWi == 0) || (this.yWi == 2))
      {
        ak(true, com.tencent.mm.plugin.scanner.d.cgx());
        break;
      }
      ak(true, false);
      break;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(32269);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(32283);
    this.yOW.clear();
    super.finish();
    AppMethodBeat.o(32283);
  }

  public final int getCurrentItem()
  {
    AppMethodBeat.i(138627);
    int i = this.mQT.getCurrentItem();
    AppMethodBeat.o(138627);
    return i;
  }

  public final int getForceOrientation()
  {
    return 2;
  }

  public final int getLayoutId()
  {
    return 2130969843;
  }

  public final void hG(boolean paramBoolean)
  {
    int i = 8;
    AppMethodBeat.i(32251);
    if (this.yVJ == null)
      AppMethodBeat.o(32251);
    while (true)
    {
      return;
      if (((!paramBoolean) || (this.yVJ.getVisibility() != 0)) && ((paramBoolean) || (this.yVJ.getVisibility() != 8)))
        break;
      AppMethodBeat.o(32251);
    }
    Object localObject = this.yVJ;
    if (paramBoolean)
      i = 0;
    ((RelativeLayout)localObject).setVisibility(i);
    localObject = this.mController.ylL;
    if (paramBoolean);
    for (i = 2131034125; ; i = 2131034126)
    {
      localObject = AnimationUtils.loadAnimation((Context)localObject, i);
      this.yVJ.startAnimation((Animation)localObject);
      AppMethodBeat.o(32251);
      break;
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(32241);
    this.jYE = new com.tencent.mm.ui.tools.e(this.mController.ylL);
    this.yWz = new ap(this, false);
    this.jYD = false;
    this.talker = getIntent().getStringExtra("img_gallery_talker");
    this.yWb = getIntent().getBooleanExtra("img_gallery_enter_from_grid", false);
    this.yRt = getIntent().getBooleanExtra("img_gallery_enter_from_chatting_ui", false);
    this.yWd = getIntent().getBooleanExtra("img_gallery_enter_from_appbrand_service_chatting_ui", false);
    this.yRs = getIntent().getBooleanExtra("show_search_chat_content_result", false);
    this.yWa = getIntent().getBooleanExtra("show_enter_grid", true);
    this.mgP = getIntent().getBooleanExtra("key_is_biz_chat", false);
    this.jMj = getIntent().getLongExtra("key_biz_chat_id", -1L);
    this.yVL = getIntent().getBooleanExtra("img_preview_only", false);
    this.yWe = getIntent().getIntExtra("img_gallery_enter_from_scene", 0);
    Object localObject1;
    boolean bool;
    Object localObject2;
    long l;
    if (!this.yVL)
    {
      localObject1 = "MicroMsg.ImageGalleryUI initView, talker is null, stack = " + bo.dpG();
      if (this.talker != null)
      {
        bool = true;
        Assert.assertTrue((String)localObject1, bool);
      }
    }
    else
    {
      this.chatroomName = getIntent().getStringExtra("img_gallery_chatroom_name");
      this.yWc = getIntent().getBooleanExtra("img_gallery_back_from_grid", false);
      this.yWj = getIntent().getStringExtra("img_gallery_enter_video_opcode");
      bool = getIntent().getBooleanExtra("img_gallery_is_restransmit_after_download", false);
      localObject1 = getIntent().getStringExtra("img_gallery_directly_send_name");
      this.yWk = ((ImageView)findViewById(2131824953));
      this.yWl = ((ImageView)findViewById(2131824955));
      localObject2 = (FrameLayout.LayoutParams)this.yWl.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject2).bottomMargin += ae.fr(this);
      this.yWl.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      this.yWl.setOnClickListener(new ImageGalleryUI.20(this));
      dGd();
      this.cvx = getIntent().getLongExtra("img_gallery_msg_id", 0L);
      l = getIntent().getLongExtra("img_gallery_msg_svr_id", 0L);
      if ((this.cvx > 0L) || (l != 0L))
        break label488;
      ab.e("MicroMsg.ImageGalleryUI", " initView, msgId is invalid, msgId = " + this.cvx + ", msgSvrId = " + l + ", stack = " + bo.dpG());
      finish();
      AppMethodBeat.o(32241);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label488: if (this.cvx == 0L)
      {
        aw.ZK();
        this.cvx = com.tencent.mm.model.c.XO().Q(dGc(), l).field_msgId;
      }
      aw.ZK();
      localObject2 = com.tencent.mm.model.c.XO().jf(this.cvx);
      if (((cy)localObject2).field_msgId > 0L)
        break label610;
      ab.e("MicroMsg.ImageGalleryUI", " initView, msgId is invalid, msgId = " + this.cvx + ", msgSvrId = " + l + ", stack = " + bo.dpG());
      finish();
      AppMethodBeat.o(32241);
    }
    label610: this.yTG = new c(this, this.cvx, dGc(), this.mgP, this.jMj, bool, (String)localObject1, Boolean.valueOf(this.yWc));
    this.yTG.yTR = false;
    this.yTG.yTL = getIntent().getBooleanExtra("start_chatting_ui", true);
    this.yTG.yTQ = new ImageGalleryUI.21(this);
    this.yVJ = ((RelativeLayout)findViewById(2131823181));
    this.yVK = ((RelativeLayout)findViewById(2131824956));
    int i = this.yVK.getPaddingTop();
    int j = i;
    if (ae.hD(this.mController.ylL))
      j = i + ae.hC(this.mController.ylL);
    this.yVK.setPadding(0, j, 0, 0);
    this.yVM = ((ImageView)findViewById(2131824958));
    this.yVM.setOnClickListener(this);
    if (av(this))
    {
      dGw();
      label803: this.mmX = ((ImageView)findViewById(2131822079));
      this.mmX.setLayerType(2, null);
      this.mQT = ((MMViewPager)findViewById(2131822081));
      this.mQT.setLayerType(2, null);
      this.mQT.setVerticalFadingEdgeEnabled(false);
      this.mQT.setHorizontalFadingEdgeEnabled(false);
      this.mQT.setSingleClickOverListener(new ImageGalleryUI.22(this));
      if (!this.yVL)
      {
        this.mQT.setOnPageChangeListener(this.yWt);
        this.mQT.setLongClickOverListener(new ImageGalleryUI.23(this));
      }
      this.mQT.setOffscreenPageLimit(1);
      this.mQT.setAdapter(this.yTG);
      Pa(100000);
      this.mQT.setCurrentItem(100000);
      this.mQT.postDelayed(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(32225);
          if (ImageGalleryUI.j(ImageGalleryUI.this) == null)
            AppMethodBeat.o(32225);
          while (true)
          {
            return;
            if ((h.a.dFX().mnY) && (ImageGalleryUI.n(ImageGalleryUI.this) != null))
            {
              ImageGalleryUI.n(ImageGalleryUI.this).setChecked(h.a.dFX().bE(ImageGalleryUI.j(ImageGalleryUI.this).dFO()));
              ImageGalleryUI.o(ImageGalleryUI.this).setOnClickListener(ImageGalleryUI.this);
            }
            if (ImageGalleryUI.this.mQT.getCurrentItem() != 100000)
            {
              AppMethodBeat.o(32225);
            }
            else
            {
              ImageGalleryUI.this.dGt();
              c.b localb = c.bt(ImageGalleryUI.j(ImageGalleryUI.this).Ou(100000));
              if ((!ImageGalleryUI.this.yWc) && (localb == c.b.yUo))
                ImageGalleryUI.j(ImageGalleryUI.this).OP(100000);
              if (localb == c.b.yUp)
                ImageGalleryUI.j(ImageGalleryUI.this).OT(100000);
              AppMethodBeat.o(32225);
            }
          }
        }
      }
      , 0L);
      if (h.a.dFX().mnY)
      {
        this.yWn = ((ViewStub)findViewById(2131824952)).inflate();
        this.yWn.setVisibility(0);
        this.yWo = ((CheckBox)this.yWn.findViewById(2131823909));
        this.yWp = this.yWn.findViewById(2131823910);
      }
      this.yVY = getIntent().getBooleanExtra("img_gallery_enter_PhotoEditUI", false);
      localObject1 = this.yTG.f((bi)localObject2, true);
      if (localObject1 == null)
        ab.e("MicroMsg.ImageGalleryUI", "[initView] imgInfo is null!!! isSoonEnterPhotoEdit:%s", new Object[] { Boolean.valueOf(this.yVY) });
      if ((!this.yVY) || (localObject1 == null) || (!((com.tencent.mm.at.e)localObject1).agP()))
        break label1141;
      dGy();
      this.yVY = false;
    }
    while (true)
    {
      this.mQT.setOnTouchListener(new ImageGalleryUI.25(this));
      AppMethodBeat.o(32241);
      break;
      dGx();
      break label803;
      label1141: if (this.yVY)
        ab.w("MicroMsg.ImageGalleryUI", "img not GetCompleted!");
    }
  }

  public final boolean noActionBar()
  {
    return true;
  }

  public final int np(long paramLong)
  {
    int i = 0;
    AppMethodBeat.i(32284);
    int j;
    if (bo.isNullOrNil(this.yWj))
    {
      AppMethodBeat.o(32284);
      j = i;
    }
    while (true)
    {
      return j;
      try
      {
        int k = u.f(paramLong, this.yWj);
        j = k;
        if (k == -1)
        {
          this.yWj = null;
          j = 0;
        }
        ab.d("MicroMsg.ImageGalleryUI", "get enter video op code %d %s", new Object[] { Integer.valueOf(j), this.yWj });
        AppMethodBeat.o(32284);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.ImageGalleryUI", "get enter video op code error : " + localException.toString());
        AppMethodBeat.o(32284);
        j = i;
      }
    }
  }

  public final void nq(long paramLong)
  {
    AppMethodBeat.i(32285);
    if ((bo.isNullOrNil(this.yWj)) || (paramLong == 0L))
      AppMethodBeat.o(32285);
    while (true)
    {
      return;
      if (u.f(paramLong, this.yWj) == -1)
      {
        this.yWj = null;
        ab.d("MicroMsg.ImageGalleryUI", "reset enter video op code %s", new Object[] { this.yWj });
      }
      AppMethodBeat.o(32285);
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(32239);
    ab.i("MicroMsg.ImageGalleryUI", "onBackPressed");
    if (this.yWb)
    {
      Pb(1);
      AppMethodBeat.o(32239);
    }
    while (true)
    {
      return;
      try
      {
        h.a.dFX().detach();
        bcW();
        AppMethodBeat.o(32239);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.ImageGalleryUI", localException.getMessage());
        finish();
        AppMethodBeat.o(32239);
      }
    }
  }

  public void onClick(View paramView)
  {
    boolean bool1 = true;
    AppMethodBeat.i(32265);
    if (this.yTG == null)
      AppMethodBeat.o(32265);
    while (true)
    {
      return;
      if (paramView.getId() == 2131824957)
      {
        Pb(0);
        AppMethodBeat.o(32265);
      }
      else if (paramView.getId() == 2131824965)
      {
        ab.i("MicroMsg.ImageGalleryUI", "[oreh download_and_save] hdImg suc, curPos:%d", new Object[] { Integer.valueOf(this.mQT.getCurrentItem()) });
        al(dGb().yVO, 8);
        bi localbi = this.yTG.Ou(this.mQT.getCurrentItem());
        paramView = this.yTG.f(localbi, false);
        this.mQT.getCurrentItem();
        if ((f(localbi, paramView)) && (!localbi.dtH()) && (paramView.agP()))
        {
          this.yTG.aF(this.mQT.getCurrentItem(), true);
          AppMethodBeat.o(32265);
        }
        else
        {
          c.b(this.mController.ylL, this.yTG.dFO(), true);
          AppMethodBeat.o(32265);
        }
      }
      else if (paramView.getId() == 2131823182)
      {
        this.yWi = 2;
        this.yWg = 0;
        this.yTG.aF(this.mQT.getCurrentItem(), false);
        AppMethodBeat.o(32265);
      }
      else if (paramView.getId() == 2131824967)
      {
        this.yTG.OS(this.mQT.getCurrentItem());
        Pa(this.mQT.getCurrentItem());
        dGp();
        dGq();
        dGt();
        AppMethodBeat.o(32265);
      }
      else if (paramView.getId() == 2131820973)
      {
        onBackPressed();
        AppMethodBeat.o(32265);
      }
      else if (paramView.getId() == 2131824958)
      {
        onBackPressed();
        AppMethodBeat.o(32265);
      }
      else if (paramView.getId() == 2131823910)
      {
        boolean bool2 = this.yWo.isChecked();
        if ((!bool2) && (h.a.dFX().mnX.size() >= 9))
        {
          Toast.makeText(this, getResources().getString(2131300199, new Object[] { Integer.valueOf(9) }), 1).show();
          AppMethodBeat.o(32265);
        }
        else
        {
          paramView = this.yWo;
          if (!bool2);
          while (true)
          {
            paramView.setChecked(bool1);
            if (!this.yWo.isChecked())
              break label476;
            h.a.dFX().bC(this.yTG.dFO());
            AppMethodBeat.o(32265);
            break;
            bool1 = false;
          }
          label476: h.a.dFX().bD(this.yTG.dFO());
          AppMethodBeat.o(32265);
        }
      }
      else
      {
        if (paramView.getId() == 2131821279)
          this.yTG.OP(this.mQT.getCurrentItem());
        AppMethodBeat.o(32265);
      }
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(32286);
    super.onConfigurationChanged(paramConfiguration);
    if (paramConfiguration.orientation == 1)
    {
      ab.d("MicroMsg.ImageGalleryUI", "%d image gallery ui is vertical screen", new Object[] { Integer.valueOf(hashCode()) });
      dGw();
      AppMethodBeat.o(32286);
    }
    while (true)
    {
      return;
      if (paramConfiguration.orientation == 2)
      {
        ab.d("MicroMsg.ImageGalleryUI", "%d image gallery ui is horizontal screen", new Object[] { Integer.valueOf(hashCode()) });
        dGx();
        AppMethodBeat.o(32286);
      }
      else
      {
        AppMethodBeat.o(32286);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(32235);
    requestWindowFeature(1);
    long l = System.currentTimeMillis();
    this.yWq = true;
    super.onCreate(paramBundle);
    if (com.tencent.mm.compatible.util.d.iW(19))
      getWindow().setFlags(201327616, 201327616);
    for (this.osu = true; ; this.osu = false)
    {
      dya();
      initView();
      this.jWy = paramBundle;
      com.tencent.mm.sdk.b.a.xxA.c(this.mip);
      com.tencent.mm.sdk.b.a.xxA.c(this.riJ);
      com.tencent.mm.sdk.b.a.xxA.c(this.yWr);
      this.suk = false;
      ab.d("MicroMsg.ImageGalleryUI", "ImageGallery onCreate spent : %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(32235);
      return;
      getWindow().setFlags(1024, 1024);
    }
  }

  public final void onCreateBeforeSetContentView()
  {
    AppMethodBeat.i(32252);
    super.onCreateBeforeSetContentView();
    AppMethodBeat.o(32252);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(32238);
    ab.i("MicroMsg.ImageGalleryUI", "%d image gallery ui on destroy", new Object[] { Integer.valueOf(hashCode()) });
    try
    {
      if (this.yTG != null)
      {
        this.yTG.detach();
        this.yTG = null;
      }
      dGu();
      this.yWv.stopTimer();
      chI();
      this.qfZ.removeAllUpdateListeners();
      com.tencent.mm.sdk.b.a.xxA.d(this.mip);
      com.tencent.mm.sdk.b.a.xxA.d(this.riJ);
      com.tencent.mm.sdk.b.a.xxA.d(this.yWr);
      com.tencent.mm.kernel.g.RO().b(this.qgg);
      if (this.yVV != null)
        this.yVV.setPlayBtnOnClickListener(null);
      this.yVV = null;
      super.onDestroy();
      AppMethodBeat.o(32238);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.ImageGalleryUI", localException, "", new Object[0]);
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(32282);
    boolean bool;
    if (paramInt == 82)
    {
      bool = true;
      AppMethodBeat.o(32282);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(32282);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(32228);
    ab.i("MicroMsg.ImageGalleryUI", "on pause");
    super.onPause();
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().setFlags(2048, 2048);
    Object localObject;
    if ((!isFinishing()) && (this.yTG != null))
    {
      localObject = this.yTG;
      ((c)localObject).yTO.yWT.sendEmptyMessageDelayed(1, 200L);
      ((c)localObject).yTP.Du();
    }
    if (this.riC != null)
    {
      localObject = new am();
      ((am)localObject).ctA.activity = this;
      ((am)localObject).ctA.ctB = this.riC;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      this.riC = null;
      this.icD = 0;
      this.icC = 0;
    }
    com.tencent.mm.graphics.b.d.eCO.Pz();
    if (com.tencent.mm.graphics.b.c.eCI.eCM)
      com.tencent.mm.graphics.b.c.eCI.stop();
    o.JV(2);
    AppMethodBeat.o(32228);
  }

  public void onResume()
  {
    AppMethodBeat.i(32236);
    super.onResume();
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().clearFlags(2048);
    if ((!this.yWq) && (this.yTG != null))
      Pa(this.mQT.getCurrentItem());
    this.yWq = false;
    if (this.yTG != null)
      this.yTG.dFQ();
    com.tencent.mm.kernel.g.RO().a(this.qgg);
    o.JV(1);
    AppMethodBeat.o(32236);
  }

  public void onStart()
  {
    AppMethodBeat.i(32237);
    this.yWc = getIntent().getBooleanExtra("img_gallery_back_from_grid", false);
    if (!this.yVL)
    {
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
          if ((this.kkq == 0) && (this.kkr == 0) && (this.kks == 0) && (this.kkt == 0))
          {
            bi localbi = this.yTG.Ou(this.mQT.getCurrentItem());
            if (localbi != null)
            {
              au localau = new au();
              localau.ctR.csG = localbi;
              com.tencent.mm.sdk.b.a.xxA.m(localau);
              this.kks = localau.ctS.ctV;
              this.kkt = localau.ctS.ctW;
              this.kkr = localau.ctS.ctT;
              this.kkq = localau.ctS.ctU;
            }
          }
          this.jYE.L(this.kkr, this.kkq, this.kks, this.kkt);
          if (localBundle == null)
            this.mQT.getViewTreeObserver().addOnPreDrawListener(new ImageGalleryUI.4(this));
        }
      }
    }
    super.onStart();
    AppMethodBeat.o(32237);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void qx(boolean paramBoolean)
  {
    AppMethodBeat.i(32266);
    try
    {
      VideoPlayerSeekBar localVideoPlayerSeekBar = dFZ().yVV;
      if (!paramBoolean);
      for (paramBoolean = true; ; paramBoolean = false)
      {
        localVideoPlayerSeekBar.setIsPlay(paramBoolean);
        AppMethodBeat.o(32266);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ImageGalleryUI", "set video state iv error : " + localException.toString());
        AppMethodBeat.o(32266);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryUI
 * JD-Core Version:    0.6.2
 */