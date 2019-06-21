package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.rf;
import com.tencent.mm.g.a.rg;
import com.tencent.mm.model.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.messenger.a.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.aq;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class SnsOnlineVideoActivity extends MMActivity
{
  private float aKM;
  private float aKN;
  private bau cNr;
  private String czD;
  private String ePJ;
  private boolean eif;
  private GestureDetector iay;
  n.d jOb;
  private Bundle jWy;
  private boolean jYD;
  private com.tencent.mm.ui.tools.e jYE;
  private int kkq;
  private int kkr;
  private int kks;
  private int kkt;
  private boolean mOO;
  private VelocityTracker mVelocityTracker;
  private boolean mmD;
  private RelativeLayout mmW;
  private ImageView mmX;
  private boolean osu;
  private com.tencent.mm.ui.widget.a.d riy;
  private boolean rkM;
  private n ros;
  private int rpA;
  private int rpB;
  private boolean rpn;
  private Button rpq;
  private float rpz;
  private OnlineVideoView ruX;
  private boolean ruY;
  private boolean ruZ;
  private boolean rva;
  private boolean rvb;
  private boolean rvc;
  private boolean rvd;
  n.c rve;
  private int scene;
  private String thumbPath;

  public SnsOnlineVideoActivity()
  {
    AppMethodBeat.i(39162);
    this.mmD = true;
    this.scene = 0;
    this.ruY = false;
    this.jYD = false;
    this.kkq = 0;
    this.kkr = 0;
    this.kks = 0;
    this.kkt = 0;
    this.rva = false;
    this.rpn = true;
    this.rkM = false;
    this.aKM = 0.0F;
    this.aKN = 0.0F;
    this.rvb = false;
    this.rvc = false;
    this.rvd = false;
    this.rpz = 1.0F;
    this.rpA = 0;
    this.rpB = 0;
    this.rve = new SnsOnlineVideoActivity.5(this);
    this.jOb = new SnsOnlineVideoActivity.6(this);
    AppMethodBeat.o(39162);
  }

  private void bdd()
  {
    AppMethodBeat.i(39166);
    if (this.mOO)
    {
      ab.i("MicroMsg.SnsOnlineVideoActivity", "it is preview mode, don't register menu.");
      AppMethodBeat.o(39166);
    }
    while (true)
    {
      return;
      this.ruX.setOnLongClickListener(new SnsOnlineVideoActivity.13(this));
      AppMethodBeat.o(39166);
    }
  }

  private void ctH()
  {
    AppMethodBeat.i(39165);
    boolean bool = ae.hw(this);
    int i = ae.fr(this);
    if ((this.osu) && (bool) && (this.rpq != null) && (this.rpq.getVisibility() == 0))
    {
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.rpq.getLayoutParams();
      localMarginLayoutParams.bottomMargin = (i + localMarginLayoutParams.bottomMargin);
      this.rpq.setLayoutParams(localMarginLayoutParams);
    }
    AppMethodBeat.o(39165);
  }

  public final void bcW()
  {
    AppMethodBeat.i(39171);
    if ((this.rpq != null) && (this.rpq.getVisibility() == 0))
      this.rpq.setVisibility(8);
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
    if (this.rpz != 1.0D)
    {
      this.jYE.zEZ = (1.0F / this.rpz);
      if ((this.rpA != 0) || (this.rpB != 0))
      {
        i = (int)(this.mmW.getWidth() / 2 * (1.0F - this.rpz));
        j = this.rpA;
        k = (int)(this.mmW.getHeight() / 2 + this.rpB - k / 2 * this.rpz);
        this.jYE.hy(i + j, k);
      }
    }
    this.jYE.a(this.ruX, this.mmX, new SnsOnlineVideoActivity.4(this), null);
    AppMethodBeat.o(39171);
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(39172);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      ab.d("MicroMsg.SnsOnlineVideoActivity", "dispatchKeyEvent");
      bcW();
      bool = true;
      AppMethodBeat.o(39172);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(39172);
    }
  }

  public final int getForceOrientation()
  {
    return 2;
  }

  public final int getLayoutId()
  {
    return 2130970830;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(39173);
    ab.i("MicroMsg.SnsOnlineVideoActivity", "on activity result reqCode %d resultCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((4097 == paramInt1) && (-1 == paramInt2))
    {
      Object localObject1 = paramIntent.getStringExtra("Select_Conv_User");
      String str1 = paramIntent.getStringExtra("custom_send_text");
      Iterator localIterator = bo.P(((String)localObject1).split(",")).iterator();
      if (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        if (this.scene == 0)
        {
          localObject1 = af.cnF().YT(this.czD);
          if (localObject1 != null)
          {
            if (!t.kH(str2))
              break label350;
            localObject2 = new rf();
            ((rf)localObject2).cNk.cFc = i.j((n)localObject1);
            ((rf)localObject2).cNk.cwT = ((n)localObject1).cqU();
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
          }
        }
        label178: Object localObject2 = this.ros.cqu();
        int i = i.Xr(this.ePJ);
        bau localbau;
        if (bo.isNullOrNil(this.thumbPath))
        {
          localbau = this.cNr;
          if (localbau == null)
            localObject1 = "";
        }
        while (true)
        {
          this.thumbPath = ((String)localObject1);
          ab.i("MicroMsg.SnsOnlineVideoActivity", "send sight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", new Object[] { str2, this.ePJ, this.thumbPath, this.cNr.wEO, Integer.valueOf(this.cNr.rEd), Integer.valueOf(i) });
          g.bOk().a(this, str2, this.ePJ, this.thumbPath, 43, i, ((TimeLineObject)localObject2).rjC);
          if (str1 != null)
            g.bOk().eZ(str1, str2);
          com.tencent.mm.ui.widget.snackbar.b.i(this, getString(2131300520));
          break;
          label350: localObject2 = new rg();
          ((rg)localObject2).cNl.cFc = i.j((n)localObject1);
          ((rg)localObject2).cNl.cwT = ((n)localObject1).cqU();
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
          break label178;
          String str3 = an.fZ(af.getAccSnsPath(), localbau.Id);
          localObject1 = str3 + i.e(localbau);
          boolean bool = com.tencent.mm.vfs.e.ct((String)localObject1);
          ab.d("MicroMsg.SnsVideoLogic", "get sns video thumb path %s [%b]", new Object[] { localObject1, Boolean.valueOf(bool) });
          if (!bool)
          {
            localObject1 = str3 + i.n(localbau);
            ab.i("MicroMsg.SnsVideoLogic", "get sns video thumb path %s", new Object[] { localObject1 });
            continue;
            localObject1 = this.thumbPath;
          }
        }
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(39173);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(39164);
    super.onConfigurationChanged(paramConfiguration);
    if (paramConfiguration.orientation == 1)
    {
      ab.d("MicroMsg.SnsOnlineVideoActivity", "vertical orientation");
      ctH();
      AppMethodBeat.o(39164);
    }
    while (true)
    {
      return;
      if (paramConfiguration.orientation == 2)
      {
        ab.d("MicroMsg.SnsOnlineVideoActivity", "horizontal orientation");
        if ((this.rpq != null) && (this.rpq.getVisibility() == 0))
        {
          paramConfiguration = (ViewGroup.MarginLayoutParams)this.rpq.getLayoutParams();
          if (paramConfiguration.bottomMargin != getResources().getDimensionPixelSize(2131428665))
          {
            paramConfiguration.bottomMargin = getResources().getDimensionPixelSize(2131428665);
            this.rpq.setLayoutParams(paramConfiguration);
          }
        }
        AppMethodBeat.o(39164);
      }
      else
      {
        AppMethodBeat.o(39164);
      }
    }
  }

  // ERROR //
  public void onCreate(Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc_w 558
    //   3: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokevirtual 562	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:getIntent	()Landroid/content/Intent;
    //   10: aload_0
    //   11: invokevirtual 566	java/lang/Object:getClass	()Ljava/lang/Class;
    //   14: invokevirtual 572	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   17: invokevirtual 576	android/content/Intent:setExtrasClassLoader	(Ljava/lang/ClassLoader;)V
    //   20: aload_0
    //   21: aload_1
    //   22: invokespecial 578	com/tencent/mm/ui/MMActivity:onCreate	(Landroid/os/Bundle;)V
    //   25: aload_0
    //   26: aload_1
    //   27: putfield 580	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:jWy	Landroid/os/Bundle;
    //   30: aload_0
    //   31: aload_0
    //   32: invokevirtual 562	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:getIntent	()Landroid/content/Intent;
    //   35: ldc_w 582
    //   38: invokevirtual 327	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   41: putfield 239	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:thumbPath	Ljava/lang/String;
    //   44: aload_0
    //   45: aload_0
    //   46: invokevirtual 562	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:getIntent	()Landroid/content/Intent;
    //   49: ldc_w 584
    //   52: invokevirtual 327	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   55: putfield 245	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:czD	Ljava/lang/String;
    //   58: aload_0
    //   59: aload_0
    //   60: invokevirtual 562	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:getIntent	()Landroid/content/Intent;
    //   63: ldc_w 586
    //   66: iconst_m1
    //   67: invokevirtual 590	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   70: putfield 80	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:scene	I
    //   73: aload_0
    //   74: aload_0
    //   75: invokevirtual 562	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:getIntent	()Landroid/content/Intent;
    //   78: ldc_w 592
    //   81: iconst_0
    //   82: invokevirtual 596	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   85: putfield 149	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:mOO	Z
    //   88: aload_0
    //   89: aload_0
    //   90: invokevirtual 562	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:getIntent	()Landroid/content/Intent;
    //   93: ldc_w 598
    //   96: iconst_0
    //   97: invokevirtual 596	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   100: putfield 600	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:eif	Z
    //   103: aload_0
    //   104: aload_0
    //   105: invokevirtual 562	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:getIntent	()Landroid/content/Intent;
    //   108: ldc_w 602
    //   111: iconst_0
    //   112: invokevirtual 596	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   115: putfield 98	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:rkM	Z
    //   118: aload_0
    //   119: invokevirtual 562	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:getIntent	()Landroid/content/Intent;
    //   122: ldc_w 604
    //   125: invokevirtual 327	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   128: astore_1
    //   129: ldc 151
    //   131: ldc_w 606
    //   134: bipush 6
    //   136: anewarray 310	java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: aload_0
    //   142: getfield 239	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:thumbPath	Ljava/lang/String;
    //   145: aastore
    //   146: dup
    //   147: iconst_1
    //   148: aload_0
    //   149: getfield 245	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:czD	Ljava/lang/String;
    //   152: aastore
    //   153: dup
    //   154: iconst_2
    //   155: aload_0
    //   156: getfield 80	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:scene	I
    //   159: invokestatic 316	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   162: aastore
    //   163: dup
    //   164: iconst_3
    //   165: aload_0
    //   166: getfield 149	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:mOO	Z
    //   169: invokestatic 518	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   172: aastore
    //   173: dup
    //   174: iconst_4
    //   175: aload_0
    //   176: getfield 600	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:eif	Z
    //   179: invokestatic 518	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   182: aastore
    //   183: dup
    //   184: iconst_5
    //   185: aload_1
    //   186: aastore
    //   187: invokestatic 319	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: aload_0
    //   191: getfield 149	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:mOO	Z
    //   194: ifne +456 -> 650
    //   197: aload_0
    //   198: invokestatic 365	com/tencent/mm/plugin/sns/model/af:cnF	()Lcom/tencent/mm/plugin/sns/storage/o;
    //   201: aload_0
    //   202: getfield 245	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:czD	Ljava/lang/String;
    //   205: invokevirtual 371	com/tencent/mm/plugin/sns/storage/o:YT	(Ljava/lang/String;)Lcom/tencent/mm/plugin/sns/storage/n;
    //   208: putfield 414	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:ros	Lcom/tencent/mm/plugin/sns/storage/n;
    //   211: aload_0
    //   212: aload_0
    //   213: getfield 414	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:ros	Lcom/tencent/mm/plugin/sns/storage/n;
    //   216: invokevirtual 418	com/tencent/mm/plugin/sns/storage/n:cqu	()Lcom/tencent/mm/protocal/protobuf/TimeLineObject;
    //   219: getfield 610	com/tencent/mm/protocal/protobuf/TimeLineObject:xfI	Lcom/tencent/mm/protocal/protobuf/uf;
    //   222: getfield 616	com/tencent/mm/protocal/protobuf/uf:wbK	Ljava/util/LinkedList;
    //   225: iconst_0
    //   226: invokevirtual 622	java/util/LinkedList:get	(I)Ljava/lang/Object;
    //   229: checkcast 433	com/tencent/mm/protocal/protobuf/bau
    //   232: putfield 427	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:cNr	Lcom/tencent/mm/protocal/protobuf/bau;
    //   235: new 493	java/lang/StringBuilder
    //   238: astore_1
    //   239: aload_1
    //   240: invokespecial 494	java/lang/StringBuilder:<init>	()V
    //   243: aload_0
    //   244: aload_1
    //   245: invokestatic 482	com/tencent/mm/plugin/sns/model/af:getAccSnsPath	()Ljava/lang/String;
    //   248: aload_0
    //   249: getfield 427	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:cNr	Lcom/tencent/mm/protocal/protobuf/bau;
    //   252: getfield 485	com/tencent/mm/protocal/protobuf/bau:Id	Ljava/lang/String;
    //   255: invokestatic 491	com/tencent/mm/plugin/sns/model/an:fZ	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   258: invokevirtual 498	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: aload_0
    //   262: getfield 427	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:cNr	Lcom/tencent/mm/protocal/protobuf/bau;
    //   265: invokestatic 624	com/tencent/mm/plugin/sns/data/i:j	(Lcom/tencent/mm/protocal/protobuf/bau;)Ljava/lang/String;
    //   268: invokevirtual 498	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: invokevirtual 504	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   274: putfield 242	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:ePJ	Ljava/lang/String;
    //   277: ldc 151
    //   279: ldc_w 626
    //   282: iconst_1
    //   283: anewarray 310	java/lang/Object
    //   286: dup
    //   287: iconst_0
    //   288: aload_0
    //   289: getfield 414	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:ros	Lcom/tencent/mm/plugin/sns/storage/n;
    //   292: invokevirtual 400	com/tencent/mm/plugin/sns/storage/n:cqU	()Ljava/lang/String;
    //   295: aastore
    //   296: invokestatic 319	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   299: bipush 19
    //   301: invokestatic 632	com/tencent/mm/compatible/util/d:iW	(I)Z
    //   304: ifeq +354 -> 658
    //   307: aload_0
    //   308: getfield 149	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:mOO	Z
    //   311: ifne +16 -> 327
    //   314: aload_0
    //   315: invokevirtual 636	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:getWindow	()Landroid/view/Window;
    //   318: ldc_w 637
    //   321: ldc_w 637
    //   324: invokevirtual 642	android/view/Window:setFlags	(II)V
    //   327: aload_0
    //   328: iconst_1
    //   329: putfield 184	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:osu	Z
    //   332: aload_0
    //   333: invokevirtual 636	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:getWindow	()Landroid/view/Window;
    //   336: sipush 128
    //   339: invokevirtual 645	android/view/Window:addFlags	(I)V
    //   342: aload_0
    //   343: aload_0
    //   344: ldc_w 646
    //   347: invokevirtual 650	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:findViewById	(I)Landroid/view/View;
    //   350: checkcast 255	android/widget/RelativeLayout
    //   353: putfield 145	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:mmW	Landroid/widget/RelativeLayout;
    //   356: aload_0
    //   357: aload_0
    //   358: ldc_w 651
    //   361: invokevirtual 650	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:findViewById	(I)Landroid/view/View;
    //   364: checkcast 165	com/tencent/mm/plugin/sns/ui/OnlineVideoView
    //   367: putfield 160	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:ruX	Lcom/tencent/mm/plugin/sns/ui/OnlineVideoView;
    //   370: aload_0
    //   371: getfield 149	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:mOO	Z
    //   374: ifne +329 -> 703
    //   377: aload_0
    //   378: getfield 160	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:ruX	Lcom/tencent/mm/plugin/sns/ui/OnlineVideoView;
    //   381: aload_0
    //   382: getfield 427	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:cNr	Lcom/tencent/mm/protocal/protobuf/bau;
    //   385: aload_0
    //   386: getfield 414	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:ros	Lcom/tencent/mm/plugin/sns/storage/n;
    //   389: invokevirtual 400	com/tencent/mm/plugin/sns/storage/n:cqU	()Ljava/lang/String;
    //   392: aload_0
    //   393: getfield 414	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:ros	Lcom/tencent/mm/plugin/sns/storage/n;
    //   396: getfield 654	com/tencent/mm/plugin/sns/storage/n:field_createTime	I
    //   399: invokevirtual 657	com/tencent/mm/plugin/sns/ui/OnlineVideoView:a	(Lcom/tencent/mm/protocal/protobuf/bau;Ljava/lang/String;I)V
    //   402: aload_0
    //   403: getfield 160	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:ruX	Lcom/tencent/mm/plugin/sns/ui/OnlineVideoView;
    //   406: aload_0
    //   407: getfield 600	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:eif	Z
    //   410: invokevirtual 661	com/tencent/mm/plugin/sns/ui/OnlineVideoView:setMute	(Z)V
    //   413: aload_0
    //   414: aload_0
    //   415: ldc_w 662
    //   418: invokevirtual 650	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:findViewById	(I)Landroid/view/View;
    //   421: checkcast 664	android/widget/ImageView
    //   424: putfield 222	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:mmX	Landroid/widget/ImageView;
    //   427: aload_0
    //   428: getfield 222	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:mmX	Landroid/widget/ImageView;
    //   431: iconst_2
    //   432: aconst_null
    //   433: invokevirtual 668	android/widget/ImageView:setLayerType	(ILandroid/graphics/Paint;)V
    //   436: aload_0
    //   437: getfield 149	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:mOO	Z
    //   440: ifeq +340 -> 780
    //   443: aload_0
    //   444: ldc_w 669
    //   447: invokevirtual 672	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:setMMTitle	(I)V
    //   450: aload_0
    //   451: getfield 160	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:ruX	Lcom/tencent/mm/plugin/sns/ui/OnlineVideoView;
    //   454: new 674	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$1
    //   457: dup
    //   458: aload_0
    //   459: invokespecial 675	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$1:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity;)V
    //   462: invokevirtual 679	com/tencent/mm/plugin/sns/ui/OnlineVideoView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   465: aload_0
    //   466: new 681	android/view/GestureDetector
    //   469: dup
    //   470: aload_0
    //   471: getfield 685	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   474: getfield 691	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   477: new 6	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$8
    //   480: dup
    //   481: aload_0
    //   482: invokespecial 692	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$8:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity;)V
    //   485: invokespecial 695	android/view/GestureDetector:<init>	(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V
    //   488: putfield 212	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:iay	Landroid/view/GestureDetector;
    //   491: aload_0
    //   492: getfield 160	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:ruX	Lcom/tencent/mm/plugin/sns/ui/OnlineVideoView;
    //   495: new 697	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$9
    //   498: dup
    //   499: aload_0
    //   500: invokespecial 698	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$9:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity;)V
    //   503: invokevirtual 702	com/tencent/mm/plugin/sns/ui/OnlineVideoView:setOnTouchListener	(Landroid/view/View$OnTouchListener;)V
    //   506: aload_0
    //   507: new 263	com/tencent/mm/ui/tools/e
    //   510: dup
    //   511: aload_0
    //   512: getfield 685	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   515: getfield 691	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   518: invokespecial 705	com/tencent/mm/ui/tools/e:<init>	(Landroid/content/Context;)V
    //   521: putfield 234	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:jYE	Lcom/tencent/mm/ui/tools/e;
    //   524: aload_0
    //   525: getfield 414	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:ros	Lcom/tencent/mm/plugin/sns/storage/n;
    //   528: astore_1
    //   529: aload_1
    //   530: ifnonnull +275 -> 805
    //   533: ldc 151
    //   535: ldc_w 707
    //   538: invokestatic 158	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   541: aload_0
    //   542: getfield 149	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:mOO	Z
    //   545: ifeq +41 -> 586
    //   548: aload_0
    //   549: getfield 98	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:rkM	Z
    //   552: ifne +22 -> 574
    //   555: aload_0
    //   556: iconst_0
    //   557: ldc_w 708
    //   560: ldc_w 709
    //   563: new 711	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$10
    //   566: dup
    //   567: aload_0
    //   568: invokespecial 712	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$10:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity;)V
    //   571: invokevirtual 716	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:addIconOptionMenu	(IIILandroid/view/MenuItem$OnMenuItemClickListener;)V
    //   574: aload_0
    //   575: new 718	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$11
    //   578: dup
    //   579: aload_0
    //   580: invokespecial 719	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$11:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity;)V
    //   583: invokevirtual 723	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:setBackBtn	(Landroid/view/MenuItem$OnMenuItemClickListener;)V
    //   586: aload_0
    //   587: invokespecial 218	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:bdd	()V
    //   590: new 725	com/tencent/mm/g/a/tn
    //   593: dup
    //   594: invokespecial 726	com/tencent/mm/g/a/tn:<init>	()V
    //   597: astore_1
    //   598: aload_1
    //   599: getfield 730	com/tencent/mm/g/a/tn:cPI	Lcom/tencent/mm/g/a/tn$a;
    //   602: iconst_1
    //   603: putfield 735	com/tencent/mm/g/a/tn$a:type	I
    //   606: getstatic 409	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   609: aload_1
    //   610: invokevirtual 412	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   613: pop
    //   614: ldc_w 558
    //   617: invokestatic 129	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   620: return
    //   621: astore_1
    //   622: ldc 151
    //   624: new 493	java/lang/StringBuilder
    //   627: dup
    //   628: ldc_w 737
    //   631: invokespecial 740	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   634: aload_1
    //   635: invokevirtual 741	java/lang/Exception:toString	()Ljava/lang/String;
    //   638: invokevirtual 498	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   641: invokevirtual 504	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   644: invokestatic 743	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   647: goto -348 -> 299
    //   650: aload_0
    //   651: aload_1
    //   652: putfield 242	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:ePJ	Ljava/lang/String;
    //   655: goto -356 -> 299
    //   658: aload_0
    //   659: getfield 149	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:mOO	Z
    //   662: ifne +16 -> 678
    //   665: aload_0
    //   666: invokevirtual 636	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:getWindow	()Landroid/view/Window;
    //   669: sipush 1024
    //   672: sipush 1024
    //   675: invokevirtual 642	android/view/Window:setFlags	(II)V
    //   678: aload_0
    //   679: iconst_0
    //   680: putfield 184	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:osu	Z
    //   683: goto -351 -> 332
    //   686: astore_1
    //   687: ldc 151
    //   689: aload_1
    //   690: ldc_w 429
    //   693: iconst_0
    //   694: anewarray 310	java/lang/Object
    //   697: invokestatic 747	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   700: goto -358 -> 342
    //   703: aload_0
    //   704: getfield 160	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:ruX	Lcom/tencent/mm/plugin/sns/ui/OnlineVideoView;
    //   707: astore_2
    //   708: aload_0
    //   709: getfield 242	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:ePJ	Ljava/lang/String;
    //   712: astore_1
    //   713: aload_0
    //   714: getfield 239	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:thumbPath	Ljava/lang/String;
    //   717: astore_3
    //   718: aload_2
    //   719: aload_1
    //   720: putfield 750	com/tencent/mm/plugin/sns/ui/OnlineVideoView:rlg	Ljava/lang/String;
    //   723: aload_2
    //   724: iconst_1
    //   725: putfield 751	com/tencent/mm/plugin/sns/ui/OnlineVideoView:mOO	Z
    //   728: aload_2
    //   729: getfield 754	com/tencent/mm/plugin/sns/ui/OnlineVideoView:mmB	Landroid/widget/ImageView;
    //   732: aload_3
    //   733: fconst_1
    //   734: invokestatic 759	com/tencent/mm/sdk/platformtools/BackwardSupportUtil$b:i	(Ljava/lang/String;F)Landroid/graphics/Bitmap;
    //   737: invokevirtual 763	android/widget/ImageView:setImageBitmap	(Landroid/graphics/Bitmap;)V
    //   740: ldc_w 765
    //   743: ldc_w 767
    //   746: iconst_3
    //   747: anewarray 310	java/lang/Object
    //   750: dup
    //   751: iconst_0
    //   752: aload_2
    //   753: invokevirtual 770	java/lang/Object:hashCode	()I
    //   756: invokestatic 316	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   759: aastore
    //   760: dup
    //   761: iconst_1
    //   762: aload_1
    //   763: aastore
    //   764: dup
    //   765: iconst_2
    //   766: aload_2
    //   767: getfield 751	com/tencent/mm/plugin/sns/ui/OnlineVideoView:mOO	Z
    //   770: invokestatic 518	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   773: aastore
    //   774: invokestatic 319	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   777: goto -375 -> 402
    //   780: aload_0
    //   781: getfield 685	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   784: invokevirtual 773	com/tencent/mm/ui/q:hideTitleView	()V
    //   787: aload_0
    //   788: getfield 145	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:mmW	Landroid/widget/RelativeLayout;
    //   791: new 775	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$7
    //   794: dup
    //   795: aload_0
    //   796: invokespecial 776	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$7:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity;)V
    //   799: invokevirtual 777	android/widget/RelativeLayout:setOnTouchListener	(Landroid/view/View$OnTouchListener;)V
    //   802: goto -337 -> 465
    //   805: aload_0
    //   806: aload_0
    //   807: ldc_w 778
    //   810: invokevirtual 650	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:findViewById	(I)Landroid/view/View;
    //   813: checkcast 188	android/widget/Button
    //   816: putfield 186	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:rpq	Landroid/widget/Button;
    //   819: aload_1
    //   820: invokevirtual 418	com/tencent/mm/plugin/sns/storage/n:cqu	()Lcom/tencent/mm/protocal/protobuf/TimeLineObject;
    //   823: astore_3
    //   824: aload_3
    //   825: ifnull +82 -> 907
    //   828: aload_3
    //   829: getfield 782	com/tencent/mm/protocal/protobuf/TimeLineObject:qNO	Lcom/tencent/mm/protocal/protobuf/av;
    //   832: astore_1
    //   833: new 784	com/tencent/mm/plugin/sns/ui/av
    //   836: dup
    //   837: invokespecial 785	com/tencent/mm/plugin/sns/ui/av:<init>	()V
    //   840: astore_2
    //   841: aload_0
    //   842: aload_2
    //   843: aload_3
    //   844: getfield 782	com/tencent/mm/protocal/protobuf/TimeLineObject:qNO	Lcom/tencent/mm/protocal/protobuf/av;
    //   847: invokestatic 790	com/tencent/mm/plugin/sns/ui/af:a	(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ui/av;Lcom/tencent/mm/protocal/protobuf/av;)V
    //   850: aload_2
    //   851: getfield 793	com/tencent/mm/plugin/sns/ui/av:rBh	Z
    //   854: ifeq +58 -> 912
    //   857: aload_0
    //   858: getfield 186	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:rpq	Landroid/widget/Button;
    //   861: iconst_0
    //   862: invokevirtual 253	android/widget/Button:setVisibility	(I)V
    //   865: aload_0
    //   866: getfield 186	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:rpq	Landroid/widget/Button;
    //   869: aload_2
    //   870: getfield 796	com/tencent/mm/plugin/sns/ui/av:rBi	Ljava/lang/String;
    //   873: invokevirtual 800	android/widget/Button:setText	(Ljava/lang/CharSequence;)V
    //   876: aload_0
    //   877: getfield 186	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:rpq	Landroid/widget/Button;
    //   880: new 802	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$12
    //   883: dup
    //   884: aload_0
    //   885: aload_1
    //   886: aload_3
    //   887: invokespecial 805	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$12:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity;Lcom/tencent/mm/protocal/protobuf/av;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;)V
    //   890: invokevirtual 806	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   893: aload_0
    //   894: invokevirtual 809	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:getRequestedOrientation	()I
    //   897: ifeq -356 -> 541
    //   900: aload_0
    //   901: invokespecial 540	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:ctH	()V
    //   904: goto -363 -> 541
    //   907: aconst_null
    //   908: astore_1
    //   909: goto -76 -> 833
    //   912: aload_0
    //   913: getfield 186	com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity:rpq	Landroid/widget/Button;
    //   916: bipush 8
    //   918: invokevirtual 253	android/widget/Button:setVisibility	(I)V
    //   921: goto -380 -> 541
    //
    // Exception table:
    //   from	to	target	type
    //   197	299	621	java/lang/Exception
    //   299	327	686	java/lang/Exception
    //   327	332	686	java/lang/Exception
    //   332	342	686	java/lang/Exception
    //   658	678	686	java/lang/Exception
    //   678	683	686	java/lang/Exception
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39170);
    this.ruX.onDestroy();
    try
    {
      getWindow().clearFlags(128);
      label23: super.onDestroy();
      if ((this.ros != null) && (this.ros.cqu().xfI.wbK.size() > 0))
      {
        String str = ((bau)this.ros.cqu().xfI.wbK.get(0)).Url;
        int i = this.ros.cqu().xfP;
        PInt localPInt = new PInt();
        u.a(aq.D((bau)this.ros.cqu().xfI.wbK.get(0)), localPInt, new PInt());
        int j = this.ruX.getPlayVideoDuration();
        h.pYm.e(15534, new Object[] { str, this.ros.cqu().Id, Integer.valueOf(i), Integer.valueOf(localPInt.value * 1000), Integer.valueOf(j * 1000) });
      }
      AppMethodBeat.o(39170);
      return;
    }
    catch (Exception localException)
    {
      break label23;
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(39169);
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().setFlags(2048, 2048);
    this.ruX.onPause();
    if (!this.ruY)
    {
      ab.d("MicroMsg.SnsOnlineVideoActivity", "close Popup");
      if (!this.ruZ)
        break label93;
      new ak().postDelayed(new SnsOnlineVideoActivity.14(this), 500L);
    }
    while (true)
    {
      super.onPause();
      com.tencent.mm.plugin.webview.ui.tools.widget.o.JV(2);
      AppMethodBeat.o(39169);
      return;
      label93: new ak().post(new SnsOnlineVideoActivity.2(this));
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(39168);
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().clearFlags(2048);
    if (!this.mmD)
      this.ruX.onResume();
    this.mmD = false;
    if (this.ruY)
      this.ruY = false;
    super.onResume();
    com.tencent.mm.plugin.webview.ui.tools.widget.o.JV(1);
    AppMethodBeat.o(39168);
  }

  public void onStart()
  {
    AppMethodBeat.i(39167);
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
          this.ruX.getViewTreeObserver().addOnPreDrawListener(new SnsOnlineVideoActivity.3(this));
      }
    }
    super.onStart();
    AppMethodBeat.o(39167);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity
 * JD-Core Version:    0.6.2
 */