package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Looper;
import android.support.v7.widget.Toolbar.LayoutParams;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.me;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelcontrol.d;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.model.aw.a;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView;
import com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView.2;
import com.tencent.mm.plugin.story.api.k.b;
import com.tencent.mm.plugin.story.api.k.c;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.g;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.t;
import java.util.List;
import java.util.Set;

public class SnsUIAction
  implements aw.a, b.b
{
  private static int rBS = 0;
  private static int rBT = 1;
  private static int rBU = 2;
  private String cvF;
  protected String filePath;
  private String gHT;
  protected View iVh;
  int iZo = 0;
  private String igi;
  protected boolean koC = false;
  private int lastIndex;
  private Activity mActivity;
  private String mSignature;
  protected View miL;
  protected ListView nDp;
  int omW = 0;
  protected MMPullDownView ooW;
  public int qDc = 0;
  private boolean qGc = false;
  protected SnsHeader qQt;
  String qSf;
  protected LoadingMoreView rBL;
  private int rBM = 0;
  private boolean rBN = false;
  public int rBO = 0;
  a rBP;
  View rBQ;
  private Toolbar.LayoutParams rBR;
  private int rBV;
  int rBW = 0;
  float rBX = 1.0F;
  float rBY = 1.0F;
  int rBZ = rBS;
  int rCa = rBS;
  int rCb = 0;
  boolean rCc = false;
  com.tencent.mm.modelsns.b rCd = null;
  private boolean rjn;
  private String ryC;
  private boolean ryD;
  private int ryE;
  int start = 0;
  protected p tipDialog = null;
  protected String title;

  public SnsUIAction(Activity paramActivity)
  {
    this.mActivity = paramActivity;
  }

  private void ap(Intent paramIntent)
  {
    AppMethodBeat.i(39660);
    new ak(Looper.getMainLooper()).post(new SnsUIAction.4(this));
    ab.d("MicroMsg.SnsActivity", "onActivityResult CONTEXT_CHOSE_IMAGE_CONFIRM");
    ab.d("MicroMsg.SnsActivity", "CONTEXT_CHOSE_IMAGE_CONFIRM filePath " + this.filePath);
    if (this.filePath == null)
    {
      AppMethodBeat.o(39660);
      return;
    }
    Object localObject = "pre_temp_sns_pic" + com.tencent.mm.a.g.x(new StringBuilder().append(this.filePath).append(System.currentTimeMillis()).toString().getBytes());
    s.aj(af.getAccSnsTmpPath(), this.filePath, (String)localObject);
    this.filePath = (af.getAccSnsTmpPath() + (String)localObject);
    ab.d("MicroMsg.SnsActivity", "newPath " + this.filePath);
    if (paramIntent != null);
    for (int i = paramIntent.getIntExtra("CropImage_filterId", 0); ; i = 0)
    {
      localObject = new Intent(this.mActivity, SnsUploadUI.class);
      ((Intent)localObject).putExtra("KSnsPostManu", true);
      ((Intent)localObject).putExtra("KTouchCameraTime", bo.anT());
      if (this.rCd != null)
      {
        this.rCd.b((Intent)localObject, "intent_key_StatisticsOplog");
        this.rCd = null;
      }
      ((Intent)localObject).putExtra("sns_kemdia_path", this.filePath);
      ((Intent)localObject).putExtra("KFilterId", i);
      if (this.qGc)
        ((Intent)localObject).putExtra("Kis_take_photo", true);
      if (this.rjn)
        ((Intent)localObject).putExtra("Ksnsupload_source", 11);
      ((Intent)localObject).putExtra("KSessionID", paramIntent.getStringExtra("KSessionID"));
      this.mActivity.startActivityForResult((Intent)localObject, 6);
      this.qGc = false;
      AppMethodBeat.o(39660);
      break;
    }
  }

  protected final boolean Em(int paramInt)
  {
    int i = 3;
    int j = 0;
    boolean bool = true;
    AppMethodBeat.i(39661);
    com.tencent.mm.kernel.g.RQ();
    if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
    {
      t.hO(this.mActivity);
      AppMethodBeat.o(39661);
      bool = false;
    }
    Intent localIntent;
    while (true)
    {
      return bool;
      ab.d("MicroMsg.SnsActivity", "selectPhoto ".concat(String.valueOf(paramInt)));
      if (paramInt == 2)
      {
        localIntent = new Intent();
        localIntent.putExtra("username", this.ryC);
        localIntent.setClass(this.mActivity, SettingSnsBackgroundUI.class);
        this.mActivity.startActivityForResult(localIntent, 7);
        AppMethodBeat.o(39661);
      }
      else if (paramInt == 1)
      {
        com.tencent.mm.kernel.g.RQ();
        int k = bo.a((Integer)com.tencent.mm.kernel.g.RP().Ry().get(68385, null), 0);
        com.tencent.mm.kernel.g.RQ();
        int m = bo.a((Integer)com.tencent.mm.kernel.g.RP().Ry().get(68386, null), 0);
        if ((!this.rBN) && (k < 3) && (m == 0))
        {
          this.rBN = true;
          ay.b(this.mActivity, new SnsUIAction.5(this, paramInt));
          AppMethodBeat.o(39661);
        }
        else
        {
          if (!this.mActivity.getSharedPreferences(ah.doA(), 0).getString("gallery", "1").equalsIgnoreCase("0"))
            break;
          com.tencent.mm.pluginsdk.ui.tools.n.a(this.mActivity, 2, null);
        }
      }
      else
      {
        AppMethodBeat.o(39661);
      }
    }
    paramInt = com.tencent.mm.m.g.Nu().getInt("SnsCanPickVideoFromAlbum", 1);
    ab.i("MicroMsg.SnsActivity", "takeVideo %d", new Object[] { Integer.valueOf(paramInt) });
    if (ae.gjt)
      paramInt = j;
    while (true)
    {
      if (paramInt == 1);
      while (true)
      {
        localIntent = new Intent();
        localIntent.putExtra("key_edit_video_max_time_length", d.afF().afI().duration);
        com.tencent.mm.pluginsdk.ui.tools.n.a(this.mActivity, 14, 9, 4, i, localIntent);
        break;
        if (paramInt == 0)
          i = 1;
      }
    }
  }

  public final void Xw(String paramString)
  {
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    this.ryC = paramString1;
    this.igi = paramString2;
    this.gHT = paramString3;
    this.mSignature = paramString4;
    this.ryD = paramBoolean1;
    this.rjn = paramBoolean2;
    this.ryE = paramInt;
  }

  public final void ad(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(39666);
    this.rBP.ad(paramInt, paramBoolean);
    AppMethodBeat.o(39666);
  }

  protected final void bf(int paramInt, String paramString)
  {
    AppMethodBeat.i(138387);
    ab.d("MicroMsg.SnsActivity", "snsactivty onIsRecent ");
    this.rBL.bf(paramInt, paramString);
    AppMethodBeat.o(138387);
  }

  public final void bj(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(39668);
    if ((this.rBP.getType() == 1) && (this.nDp != null) && (this.nDp.getAdapter() != null) && ((this.nDp.getAdapter() instanceof com.tencent.mm.plugin.sns.ui.a.a)))
      ((com.tencent.mm.plugin.sns.ui.a.a)this.nDp.getAdapter()).notifyDataSetChanged();
    AppMethodBeat.o(39668);
  }

  public final void bk(String paramString, boolean paramBoolean)
  {
  }

  public final void cmu()
  {
    AppMethodBeat.i(39663);
    this.qQt.cti();
    AppMethodBeat.o(39663);
  }

  public final void coo()
  {
    AppMethodBeat.i(39667);
    if (this.qQt != null)
      this.qQt.cti();
    AppMethodBeat.o(39667);
  }

  public ListView getSnsListView()
  {
    AppMethodBeat.i(39669);
    ListView localListView = this.rBP.getSnsListView();
    AppMethodBeat.o(39669);
    return localListView;
  }

  protected final void lc(boolean paramBoolean)
  {
    AppMethodBeat.i(39664);
    ab.d("MicroMsg.SnsActivity", "snsactivty onIsAll ");
    this.rBL.lc(paramBoolean);
    AppMethodBeat.o(39664);
  }

  public final void ln(boolean paramBoolean)
  {
    AppMethodBeat.i(39655);
    this.rBP.ln(paramBoolean);
    AppMethodBeat.o(39655);
  }

  // ERROR //
  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    // Byte code:
    //   0: ldc_w 598
    //   3: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 160
    //   8: ldc_w 600
    //   11: iload_1
    //   12: invokestatic 404	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   15: invokevirtual 407	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   18: invokestatic 602	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: iload_2
    //   22: iconst_m1
    //   23: if_icmpeq +47 -> 70
    //   26: iload_1
    //   27: iconst_5
    //   28: if_icmpeq +13 -> 41
    //   31: iload_1
    //   32: iconst_2
    //   33: if_icmpeq +8 -> 41
    //   36: iload_1
    //   37: iconst_4
    //   38: if_icmpne +25 -> 63
    //   41: new 140	com/tencent/mm/sdk/platformtools/ak
    //   44: dup
    //   45: invokestatic 146	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   48: invokespecial 149	com/tencent/mm/sdk/platformtools/ak:<init>	(Landroid/os/Looper;)V
    //   51: new 604	com/tencent/mm/plugin/sns/ui/SnsUIAction$14
    //   54: dup
    //   55: aload_0
    //   56: invokespecial 605	com/tencent/mm/plugin/sns/ui/SnsUIAction$14:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsUIAction;)V
    //   59: invokevirtual 158	com/tencent/mm/sdk/platformtools/ak:post	(Ljava/lang/Runnable;)Z
    //   62: pop
    //   63: ldc_w 598
    //   66: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: return
    //   70: iload_1
    //   71: tableswitch	default:+77 -> 148, 2:+519->590, 3:+77->148, 4:+1483->1554, 5:+394->465, 6:+1521->1592, 7:+1578->1649, 8:+1608->1679, 9:+1671->1742, 10:+1693->1764, 11:+77->148, 12:+1793->1864, 13:+1854->1925, 14:+654->725, 15:+1870->1941, 16:+77->148, 17:+94->165
    //   149: if_icmpne +4866 -> 5015
    //   152: swap
    //   153: invokestatic 609	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   156: ldc_w 598
    //   159: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   162: goto -93 -> 69
    //   165: aload_3
    //   166: ldc_w 611
    //   169: invokevirtual 615	android/content/Intent:getParcelableExtra	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   172: checkcast 617	com/tencent/mm/plugin/mmsight/SightCaptureResult
    //   175: astore 4
    //   177: aload 4
    //   179: ifnull +1771 -> 1950
    //   182: aload 4
    //   184: getfield 620	com/tencent/mm/plugin/mmsight/SightCaptureResult:osA	Z
    //   187: ifeq +41 -> 228
    //   190: aload_0
    //   191: aload 4
    //   193: getfield 623	com/tencent/mm/plugin/mmsight/SightCaptureResult:osI	Ljava/lang/String;
    //   196: putfield 177	com/tencent/mm/plugin/sns/ui/SnsUIAction:filePath	Ljava/lang/String;
    //   199: aload_0
    //   200: getfield 177	com/tencent/mm/plugin/sns/ui/SnsUIAction:filePath	Ljava/lang/String;
    //   203: invokestatic 626	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   206: ifne +1744 -> 1950
    //   209: aload_0
    //   210: iconst_1
    //   211: putfield 96	com/tencent/mm/plugin/sns/ui/SnsUIAction:qGc	Z
    //   214: aload_0
    //   215: aload_3
    //   216: invokespecial 628	com/tencent/mm/plugin/sns/ui/SnsUIAction:ap	(Landroid/content/Intent;)V
    //   219: ldc_w 598
    //   222: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   225: goto -156 -> 69
    //   228: ldc 160
    //   230: ldc_w 630
    //   233: iconst_2
    //   234: anewarray 4	java/lang/Object
    //   237: dup
    //   238: iconst_0
    //   239: aload 4
    //   241: getfield 633	com/tencent/mm/plugin/mmsight/SightCaptureResult:osC	Ljava/lang/String;
    //   244: aastore
    //   245: dup
    //   246: iconst_1
    //   247: aload 4
    //   249: getfield 636	com/tencent/mm/plugin/mmsight/SightCaptureResult:osD	Ljava/lang/String;
    //   252: aastore
    //   253: invokestatic 496	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   256: new 229	android/content/Intent
    //   259: dup
    //   260: invokespecial 408	android/content/Intent:<init>	()V
    //   263: astore 5
    //   265: aload 5
    //   267: ldc_w 638
    //   270: aload 4
    //   272: getfield 633	com/tencent/mm/plugin/mmsight/SightCaptureResult:osC	Ljava/lang/String;
    //   275: invokevirtual 267	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   278: pop
    //   279: aload 5
    //   281: ldc_w 640
    //   284: aload 4
    //   286: getfield 636	com/tencent/mm/plugin/mmsight/SightCaptureResult:osD	Ljava/lang/String;
    //   289: invokevirtual 267	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   292: pop
    //   293: aload 4
    //   295: getfield 643	com/tencent/mm/plugin/mmsight/SightCaptureResult:osF	Ljava/lang/String;
    //   298: invokestatic 626	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   301: ifne +121 -> 422
    //   304: aload 5
    //   306: ldc_w 645
    //   309: aload 4
    //   311: getfield 643	com/tencent/mm/plugin/mmsight/SightCaptureResult:osF	Ljava/lang/String;
    //   314: invokevirtual 267	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   317: pop
    //   318: aload 5
    //   320: ldc 240
    //   322: iconst_1
    //   323: invokevirtual 244	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   326: pop
    //   327: aload 5
    //   329: ldc 246
    //   331: invokestatic 251	com/tencent/mm/sdk/platformtools/bo:anT	()J
    //   334: invokevirtual 254	android/content/Intent:putExtra	(Ljava/lang/String;J)Landroid/content/Intent;
    //   337: pop
    //   338: aload 5
    //   340: ldc_w 647
    //   343: bipush 14
    //   345: invokevirtual 272	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   348: pop
    //   349: aload 5
    //   351: ldc_w 274
    //   354: iconst_0
    //   355: invokevirtual 244	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   358: pop
    //   359: aload 5
    //   361: ldc_w 280
    //   364: aload_3
    //   365: ldc_w 280
    //   368: invokevirtual 284	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   371: invokevirtual 267	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   374: pop
    //   375: aload 4
    //   377: getfield 651	com/tencent/mm/plugin/mmsight/SightCaptureResult:osH	Lcom/tencent/mm/protocal/protobuf/baa;
    //   380: invokevirtual 656	com/tencent/mm/protocal/protobuf/baa:toByteArray	()[B
    //   383: astore_3
    //   384: aload_3
    //   385: ifnull +13 -> 398
    //   388: aload 5
    //   390: ldc_w 658
    //   393: aload_3
    //   394: invokevirtual 661	android/content/Intent:putExtra	(Ljava/lang/String;[B)Landroid/content/Intent;
    //   397: pop
    //   398: aload_0
    //   399: getfield 124	com/tencent/mm/plugin/sns/ui/SnsUIAction:mActivity	Landroid/app/Activity;
    //   402: ldc_w 663
    //   405: ldc_w 665
    //   408: aload 5
    //   410: invokestatic 670	com/tencent/mm/bp/d:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V
    //   413: ldc_w 598
    //   416: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   419: goto -350 -> 69
    //   422: aload 5
    //   424: ldc_w 645
    //   427: aload 4
    //   429: getfield 633	com/tencent/mm/plugin/mmsight/SightCaptureResult:osC	Ljava/lang/String;
    //   432: invokestatic 675	com/tencent/mm/vfs/e:atg	(Ljava/lang/String;)Ljava/lang/String;
    //   435: invokevirtual 267	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   438: pop
    //   439: goto -121 -> 318
    //   442: astore_3
    //   443: ldc 160
    //   445: ldc_w 677
    //   448: iconst_1
    //   449: anewarray 4	java/lang/Object
    //   452: dup
    //   453: iconst_0
    //   454: aload_3
    //   455: invokevirtual 680	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   458: aastore
    //   459: invokestatic 496	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   462: goto -64 -> 398
    //   465: aload_0
    //   466: aload_0
    //   467: getfield 124	com/tencent/mm/plugin/sns/ui/SnsUIAction:mActivity	Landroid/app/Activity;
    //   470: invokevirtual 684	android/app/Activity:getApplicationContext	()Landroid/content/Context;
    //   473: aload_3
    //   474: invokestatic 217	com/tencent/mm/plugin/sns/model/af:getAccSnsTmpPath	()Ljava/lang/String;
    //   477: invokestatic 687	com/tencent/mm/pluginsdk/ui/tools/n:h	(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;
    //   480: putfield 177	com/tencent/mm/plugin/sns/ui/SnsUIAction:filePath	Ljava/lang/String;
    //   483: ldc 160
    //   485: new 170	java/lang/StringBuilder
    //   488: dup
    //   489: ldc_w 689
    //   492: invokespecial 175	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   495: aload_0
    //   496: getfield 177	com/tencent/mm/plugin/sns/ui/SnsUIAction:filePath	Ljava/lang/String;
    //   499: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   502: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   505: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   508: aload_0
    //   509: getfield 177	com/tencent/mm/plugin/sns/ui/SnsUIAction:filePath	Ljava/lang/String;
    //   512: ifnonnull +12 -> 524
    //   515: ldc_w 598
    //   518: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   521: goto -452 -> 69
    //   524: invokestatic 385	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   527: pop
    //   528: invokestatic 389	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   531: invokevirtual 422	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   534: ldc_w 690
    //   537: aconst_null
    //   538: invokevirtual 429	com/tencent/mm/storage/z:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   541: checkcast 431	java/lang/Integer
    //   544: iconst_0
    //   545: invokestatic 434	com/tencent/mm/sdk/platformtools/bo:a	(Ljava/lang/Integer;I)I
    //   548: istore_1
    //   549: invokestatic 385	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   552: pop
    //   553: invokestatic 389	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   556: invokevirtual 422	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   559: ldc_w 690
    //   562: iload_1
    //   563: iconst_1
    //   564: iadd
    //   565: invokestatic 493	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   568: invokevirtual 694	com/tencent/mm/storage/z:set	(ILjava/lang/Object;)V
    //   571: aload_0
    //   572: iconst_1
    //   573: putfield 96	com/tencent/mm/plugin/sns/ui/SnsUIAction:qGc	Z
    //   576: aload_0
    //   577: aload_3
    //   578: invokespecial 628	com/tencent/mm/plugin/sns/ui/SnsUIAction:ap	(Landroid/content/Intent;)V
    //   581: ldc_w 598
    //   584: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   587: goto -518 -> 69
    //   590: aload_3
    //   591: ifnonnull +12 -> 603
    //   594: ldc_w 598
    //   597: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   600: goto -531 -> 69
    //   603: invokestatic 385	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   606: pop
    //   607: invokestatic 389	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   610: invokevirtual 422	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   613: ldc_w 695
    //   616: aconst_null
    //   617: invokevirtual 429	com/tencent/mm/storage/z:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   620: checkcast 431	java/lang/Integer
    //   623: iconst_0
    //   624: invokestatic 434	com/tencent/mm/sdk/platformtools/bo:a	(Ljava/lang/Integer;I)I
    //   627: istore_1
    //   628: invokestatic 385	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   631: pop
    //   632: invokestatic 389	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   635: invokevirtual 422	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   638: ldc_w 695
    //   641: iload_1
    //   642: iconst_1
    //   643: iadd
    //   644: invokestatic 493	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   647: invokevirtual 694	com/tencent/mm/storage/z:set	(ILjava/lang/Object;)V
    //   650: new 229	android/content/Intent
    //   653: dup
    //   654: invokespecial 408	android/content/Intent:<init>	()V
    //   657: astore 5
    //   659: aload 5
    //   661: ldc_w 697
    //   664: iconst_4
    //   665: invokevirtual 272	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   668: pop
    //   669: aload 5
    //   671: ldc_w 699
    //   674: iconst_1
    //   675: invokevirtual 244	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   678: pop
    //   679: aload 5
    //   681: ldc_w 701
    //   684: iconst_1
    //   685: invokevirtual 244	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   688: pop
    //   689: getstatic 707	com/tencent/mm/plugin/sns/c/a:gkE	Lcom/tencent/mm/pluginsdk/n;
    //   692: aload_0
    //   693: getfield 124	com/tencent/mm/plugin/sns/ui/SnsUIAction:mActivity	Landroid/app/Activity;
    //   696: aload_3
    //   697: aload 5
    //   699: invokestatic 217	com/tencent/mm/plugin/sns/model/af:getAccSnsTmpPath	()Ljava/lang/String;
    //   702: iconst_4
    //   703: new 709	com/tencent/mm/plugin/sns/ui/SnsUIAction$2
    //   706: dup
    //   707: aload_0
    //   708: invokespecial 710	com/tencent/mm/plugin/sns/ui/SnsUIAction$2:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsUIAction;)V
    //   711: invokeinterface 715 7 0
    //   716: ldc_w 598
    //   719: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   722: goto -653 -> 69
    //   725: new 140	com/tencent/mm/sdk/platformtools/ak
    //   728: dup
    //   729: invokestatic 146	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   732: invokespecial 149	com/tencent/mm/sdk/platformtools/ak:<init>	(Landroid/os/Looper;)V
    //   735: new 717	com/tencent/mm/plugin/sns/ui/SnsUIAction$3
    //   738: dup
    //   739: aload_0
    //   740: invokespecial 718	com/tencent/mm/plugin/sns/ui/SnsUIAction$3:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsUIAction;)V
    //   743: invokevirtual 158	com/tencent/mm/sdk/platformtools/ak:post	(Ljava/lang/Runnable;)Z
    //   746: pop
    //   747: aload_3
    //   748: ldc_w 720
    //   751: invokevirtual 724	android/content/Intent:getStringArrayListExtra	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   754: astore 5
    //   756: aload 5
    //   758: ifnull +11 -> 769
    //   761: aload 5
    //   763: invokevirtual 729	java/util/ArrayList:size	()I
    //   766: ifgt +16 -> 782
    //   769: aload_3
    //   770: ldc_w 731
    //   773: invokevirtual 284	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   776: invokestatic 626	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   779: ifne +444 -> 1223
    //   782: aload 5
    //   784: ifnull +126 -> 910
    //   787: aload 5
    //   789: invokevirtual 729	java/util/ArrayList:size	()I
    //   792: ifle +118 -> 910
    //   795: aload 5
    //   797: iconst_0
    //   798: invokevirtual 734	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   801: checkcast 202	java/lang/String
    //   804: astore 5
    //   806: aload_3
    //   807: ldc_w 736
    //   810: invokevirtual 284	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   813: astore 4
    //   815: aload 4
    //   817: invokestatic 626	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   820: ifne +14 -> 834
    //   823: aload 4
    //   825: astore_3
    //   826: aload 4
    //   828: invokestatic 739	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   831: ifne +192 -> 1023
    //   834: new 170	java/lang/StringBuilder
    //   837: dup
    //   838: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   841: invokestatic 217	com/tencent/mm/plugin/sns/model/af:getAccSnsTmpPath	()Ljava/lang/String;
    //   844: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   847: aload 5
    //   849: invokestatic 675	com/tencent/mm/vfs/e:atg	(Ljava/lang/String;)Ljava/lang/String;
    //   852: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   855: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   858: astore_3
    //   859: new 741	android/media/MediaMetadataRetriever
    //   862: dup
    //   863: invokespecial 742	android/media/MediaMetadataRetriever:<init>	()V
    //   866: astore 4
    //   868: aload 4
    //   870: aload 5
    //   872: invokevirtual 745	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   875: aload 4
    //   877: lconst_0
    //   878: invokevirtual 749	android/media/MediaMetadataRetriever:getFrameAtTime	(J)Landroid/graphics/Bitmap;
    //   881: astore 6
    //   883: aload 6
    //   885: ifnonnull +47 -> 932
    //   888: ldc 160
    //   890: ldc_w 751
    //   893: invokestatic 609	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   896: aload 4
    //   898: invokevirtual 754	android/media/MediaMetadataRetriever:release	()V
    //   901: ldc_w 598
    //   904: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   907: goto -838 -> 69
    //   910: aload_3
    //   911: ldc_w 731
    //   914: invokevirtual 284	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   917: astore 5
    //   919: goto -113 -> 806
    //   922: astore_3
    //   923: ldc_w 598
    //   926: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   929: goto -860 -> 69
    //   932: ldc 160
    //   934: ldc_w 756
    //   937: iconst_2
    //   938: anewarray 4	java/lang/Object
    //   941: dup
    //   942: iconst_0
    //   943: aload 6
    //   945: invokevirtual 761	android/graphics/Bitmap:getWidth	()I
    //   948: invokestatic 493	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   951: aastore
    //   952: dup
    //   953: iconst_1
    //   954: aload 6
    //   956: invokevirtual 764	android/graphics/Bitmap:getHeight	()I
    //   959: invokestatic 493	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   962: aastore
    //   963: invokestatic 496	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   966: aload 6
    //   968: bipush 80
    //   970: getstatic 770	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   973: aload_3
    //   974: iconst_1
    //   975: invokestatic 775	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   978: aload_3
    //   979: invokestatic 779	com/tencent/mm/sdk/platformtools/d:amj	(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;
    //   982: astore 6
    //   984: ldc 160
    //   986: ldc_w 781
    //   989: iconst_2
    //   990: anewarray 4	java/lang/Object
    //   993: dup
    //   994: iconst_0
    //   995: aload 6
    //   997: getfield 786	android/graphics/BitmapFactory$Options:outWidth	I
    //   1000: invokestatic 493	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1003: aastore
    //   1004: dup
    //   1005: iconst_1
    //   1006: aload 6
    //   1008: getfield 789	android/graphics/BitmapFactory$Options:outHeight	I
    //   1011: invokestatic 493	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1014: aastore
    //   1015: invokestatic 496	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1018: aload 4
    //   1020: invokevirtual 754	android/media/MediaMetadataRetriever:release	()V
    //   1023: ldc 160
    //   1025: ldc_w 791
    //   1028: iconst_4
    //   1029: anewarray 4	java/lang/Object
    //   1032: dup
    //   1033: iconst_0
    //   1034: aload 5
    //   1036: aastore
    //   1037: dup
    //   1038: iconst_1
    //   1039: aload_3
    //   1040: aastore
    //   1041: dup
    //   1042: iconst_2
    //   1043: aload 5
    //   1045: invokestatic 795	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   1048: invokestatic 800	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1051: aastore
    //   1052: dup
    //   1053: iconst_3
    //   1054: aload_3
    //   1055: invokestatic 795	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   1058: invokestatic 800	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1061: aastore
    //   1062: invokestatic 496	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1065: new 229	android/content/Intent
    //   1068: dup
    //   1069: invokespecial 408	android/content/Intent:<init>	()V
    //   1072: astore 4
    //   1074: aload 4
    //   1076: ldc_w 638
    //   1079: aload 5
    //   1081: invokevirtual 267	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1084: pop
    //   1085: aload 4
    //   1087: ldc_w 640
    //   1090: aload_3
    //   1091: invokevirtual 267	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1094: pop
    //   1095: aload 4
    //   1097: ldc_w 645
    //   1100: aload 5
    //   1102: invokestatic 675	com/tencent/mm/vfs/e:atg	(Ljava/lang/String;)Ljava/lang/String;
    //   1105: invokevirtual 267	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1108: pop
    //   1109: aload 4
    //   1111: ldc 240
    //   1113: iconst_1
    //   1114: invokevirtual 244	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   1117: pop
    //   1118: aload 4
    //   1120: ldc 246
    //   1122: invokestatic 251	com/tencent/mm/sdk/platformtools/bo:anT	()J
    //   1125: invokevirtual 254	android/content/Intent:putExtra	(Ljava/lang/String;J)Landroid/content/Intent;
    //   1128: pop
    //   1129: aload 4
    //   1131: ldc_w 647
    //   1134: bipush 14
    //   1136: invokevirtual 272	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   1139: pop
    //   1140: aload 4
    //   1142: ldc_w 274
    //   1145: iconst_0
    //   1146: invokevirtual 244	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   1149: pop
    //   1150: aload_0
    //   1151: getfield 124	com/tencent/mm/plugin/sns/ui/SnsUIAction:mActivity	Landroid/app/Activity;
    //   1154: ldc_w 663
    //   1157: ldc_w 665
    //   1160: aload 4
    //   1162: invokestatic 670	com/tencent/mm/bp/d:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V
    //   1165: ldc_w 598
    //   1168: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1171: goto -1102 -> 69
    //   1174: astore 6
    //   1176: ldc 160
    //   1178: ldc_w 802
    //   1181: iconst_1
    //   1182: anewarray 4	java/lang/Object
    //   1185: dup
    //   1186: iconst_0
    //   1187: aload 6
    //   1189: invokevirtual 680	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1192: aastore
    //   1193: invokestatic 804	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1196: aload 4
    //   1198: invokevirtual 754	android/media/MediaMetadataRetriever:release	()V
    //   1201: goto -178 -> 1023
    //   1204: astore 4
    //   1206: goto -183 -> 1023
    //   1209: astore_3
    //   1210: aload 4
    //   1212: invokevirtual 754	android/media/MediaMetadataRetriever:release	()V
    //   1215: ldc_w 598
    //   1218: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1221: aload_3
    //   1222: athrow
    //   1223: aload_3
    //   1224: ldc_w 806
    //   1227: invokevirtual 724	android/content/Intent:getStringArrayListExtra	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   1230: astore 5
    //   1232: aload 5
    //   1234: ifnull +11 -> 1245
    //   1237: aload 5
    //   1239: invokevirtual 729	java/util/ArrayList:size	()I
    //   1242: ifne +20 -> 1262
    //   1245: ldc 160
    //   1247: ldc_w 808
    //   1250: invokestatic 602	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1253: ldc_w 598
    //   1256: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1259: goto -1190 -> 69
    //   1262: new 726	java/util/ArrayList
    //   1265: dup
    //   1266: invokespecial 809	java/util/ArrayList:<init>	()V
    //   1269: astore 4
    //   1271: aload 5
    //   1273: invokevirtual 813	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   1276: astore 6
    //   1278: aload 6
    //   1280: invokeinterface 818 1 0
    //   1285: ifeq +76 -> 1361
    //   1288: aload 6
    //   1290: invokeinterface 822 1 0
    //   1295: checkcast 202	java/lang/String
    //   1298: astore 7
    //   1300: aload 7
    //   1302: invokestatic 828	com/tencent/mm/compatible/util/Exif:fromFile	(Ljava/lang/String;)Lcom/tencent/mm/compatible/util/Exif;
    //   1305: invokevirtual 832	com/tencent/mm/compatible/util/Exif:getLocation	()Lcom/tencent/mm/compatible/util/Exif$a;
    //   1308: astore 8
    //   1310: aload 8
    //   1312: ifnull -34 -> 1278
    //   1315: aload 4
    //   1317: ldc_w 834
    //   1320: iconst_3
    //   1321: anewarray 4	java/lang/Object
    //   1324: dup
    //   1325: iconst_0
    //   1326: aload 7
    //   1328: aastore
    //   1329: dup
    //   1330: iconst_1
    //   1331: aload 8
    //   1333: getfield 840	com/tencent/mm/compatible/util/Exif$a:latitude	D
    //   1336: invokestatic 845	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   1339: aastore
    //   1340: dup
    //   1341: iconst_2
    //   1342: aload 8
    //   1344: getfield 848	com/tencent/mm/compatible/util/Exif$a:longitude	D
    //   1347: invokestatic 845	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   1350: aastore
    //   1351: invokestatic 852	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1354: invokevirtual 856	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1357: pop
    //   1358: goto -80 -> 1278
    //   1361: aload_0
    //   1362: aload_3
    //   1363: ldc_w 858
    //   1366: iconst_0
    //   1367: invokevirtual 862	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   1370: putfield 96	com/tencent/mm/plugin/sns/ui/SnsUIAction:qGc	Z
    //   1373: new 229	android/content/Intent
    //   1376: dup
    //   1377: aload_0
    //   1378: getfield 124	com/tencent/mm/plugin/sns/ui/SnsUIAction:mActivity	Landroid/app/Activity;
    //   1381: ldc 235
    //   1383: invokespecial 238	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   1386: astore 6
    //   1388: aload 6
    //   1390: ldc 240
    //   1392: iconst_1
    //   1393: invokevirtual 244	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   1396: pop
    //   1397: aload 6
    //   1399: ldc 246
    //   1401: invokestatic 251	com/tencent/mm/sdk/platformtools/bo:anT	()J
    //   1404: invokevirtual 254	android/content/Intent:putExtra	(Ljava/lang/String;J)Landroid/content/Intent;
    //   1407: pop
    //   1408: aload_0
    //   1409: getfield 122	com/tencent/mm/plugin/sns/ui/SnsUIAction:rCd	Lcom/tencent/mm/modelsns/b;
    //   1412: ifnull +20 -> 1432
    //   1415: aload_0
    //   1416: getfield 122	com/tencent/mm/plugin/sns/ui/SnsUIAction:rCd	Lcom/tencent/mm/modelsns/b;
    //   1419: aload 6
    //   1421: ldc_w 256
    //   1424: invokevirtual 262	com/tencent/mm/modelsns/b:b	(Landroid/content/Intent;Ljava/lang/String;)V
    //   1427: aload_0
    //   1428: aconst_null
    //   1429: putfield 122	com/tencent/mm/plugin/sns/ui/SnsUIAction:rCd	Lcom/tencent/mm/modelsns/b;
    //   1432: aload_0
    //   1433: getfield 276	com/tencent/mm/plugin/sns/ui/SnsUIAction:rjn	Z
    //   1436: ifeq +14 -> 1450
    //   1439: aload 6
    //   1441: ldc_w 278
    //   1444: bipush 11
    //   1446: invokevirtual 272	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   1449: pop
    //   1450: aload_3
    //   1451: ldc 227
    //   1453: iconst_0
    //   1454: invokevirtual 233	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   1457: istore_1
    //   1458: aload 6
    //   1460: ldc_w 864
    //   1463: aload 5
    //   1465: invokevirtual 867	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
    //   1468: pop
    //   1469: aload 6
    //   1471: ldc_w 269
    //   1474: iload_1
    //   1475: invokevirtual 272	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   1478: pop
    //   1479: aload_0
    //   1480: getfield 96	com/tencent/mm/plugin/sns/ui/SnsUIAction:qGc	Z
    //   1483: ifeq +13 -> 1496
    //   1486: aload 6
    //   1488: ldc_w 274
    //   1491: iconst_1
    //   1492: invokevirtual 244	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   1495: pop
    //   1496: aload 6
    //   1498: ldc_w 869
    //   1501: aload 4
    //   1503: invokevirtual 873	android/content/Intent:putStringArrayListExtra	(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;
    //   1506: pop
    //   1507: ldc 160
    //   1509: ldc_w 875
    //   1512: iconst_1
    //   1513: anewarray 4	java/lang/Object
    //   1516: dup
    //   1517: iconst_0
    //   1518: aload 6
    //   1520: ldc_w 647
    //   1523: iconst_m1
    //   1524: invokevirtual 233	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   1527: invokestatic 493	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1530: aastore
    //   1531: invokestatic 877	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1534: aload_0
    //   1535: getfield 124	com/tencent/mm/plugin/sns/ui/SnsUIAction:mActivity	Landroid/app/Activity;
    //   1538: aload 6
    //   1540: bipush 6
    //   1542: invokevirtual 290	android/app/Activity:startActivityForResult	(Landroid/content/Intent;I)V
    //   1545: ldc_w 598
    //   1548: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1551: goto -1482 -> 69
    //   1554: aload_3
    //   1555: ifnonnull +12 -> 1567
    //   1558: ldc_w 598
    //   1561: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1564: goto -1495 -> 69
    //   1567: aload_0
    //   1568: aload_3
    //   1569: ldc_w 879
    //   1572: invokevirtual 284	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   1575: putfield 177	com/tencent/mm/plugin/sns/ui/SnsUIAction:filePath	Ljava/lang/String;
    //   1578: aload_0
    //   1579: aload_3
    //   1580: invokespecial 628	com/tencent/mm/plugin/sns/ui/SnsUIAction:ap	(Landroid/content/Intent;)V
    //   1583: ldc_w 598
    //   1586: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1589: goto -1520 -> 69
    //   1592: ldc 160
    //   1594: ldc_w 881
    //   1597: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1600: aload_3
    //   1601: ifnonnull +12 -> 1613
    //   1604: ldc_w 598
    //   1607: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1610: goto -1541 -> 69
    //   1613: aload_3
    //   1614: ldc_w 883
    //   1617: iconst_m1
    //   1618: invokevirtual 233	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   1621: istore_1
    //   1622: aload_0
    //   1623: getfield 299	com/tencent/mm/plugin/sns/ui/SnsUIAction:rBP	Lcom/tencent/mm/plugin/sns/ui/SnsUIAction$a;
    //   1626: iload_1
    //   1627: aconst_null
    //   1628: aconst_null
    //   1629: invokeinterface 886 4 0
    //   1634: invokestatic 890	com/tencent/mm/plugin/sns/model/af:cnB	()Lcom/tencent/mm/plugin/sns/model/aw;
    //   1637: invokevirtual 895	com/tencent/mm/plugin/sns/model/aw:cmp	()V
    //   1640: ldc_w 598
    //   1643: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1646: goto -1577 -> 69
    //   1649: ldc 160
    //   1651: ldc_w 897
    //   1654: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1657: aload_0
    //   1658: getfield 570	com/tencent/mm/plugin/sns/ui/SnsUIAction:qQt	Lcom/tencent/mm/plugin/sns/ui/SnsHeader;
    //   1661: invokevirtual 575	com/tencent/mm/plugin/sns/ui/SnsHeader:cti	()V
    //   1664: invokestatic 890	com/tencent/mm/plugin/sns/model/af:cnB	()Lcom/tencent/mm/plugin/sns/model/aw;
    //   1667: invokevirtual 895	com/tencent/mm/plugin/sns/model/aw:cmp	()V
    //   1670: ldc_w 598
    //   1673: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1676: goto -1607 -> 69
    //   1679: aload_3
    //   1680: ifnonnull +12 -> 1692
    //   1683: ldc_w 598
    //   1686: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1689: goto -1620 -> 69
    //   1692: ldc 160
    //   1694: ldc_w 899
    //   1697: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1700: aload_3
    //   1701: ldc_w 901
    //   1704: invokevirtual 615	android/content/Intent:getParcelableExtra	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   1707: checkcast 903	com/tencent/mm/plugin/sns/data/SnsCmdList
    //   1710: astore_3
    //   1711: aload_3
    //   1712: ifnull +238 -> 1950
    //   1715: aload_0
    //   1716: getfield 299	com/tencent/mm/plugin/sns/ui/SnsUIAction:rBP	Lcom/tencent/mm/plugin/sns/ui/SnsUIAction$a;
    //   1719: iconst_m1
    //   1720: aload_3
    //   1721: getfield 907	com/tencent/mm/plugin/sns/data/SnsCmdList:qFN	Ljava/util/List;
    //   1724: aload_3
    //   1725: getfield 910	com/tencent/mm/plugin/sns/data/SnsCmdList:qFO	Ljava/util/List;
    //   1728: invokeinterface 886 4 0
    //   1733: ldc_w 598
    //   1736: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1739: goto -1670 -> 69
    //   1742: invokestatic 890	com/tencent/mm/plugin/sns/model/af:cnB	()Lcom/tencent/mm/plugin/sns/model/aw;
    //   1745: invokevirtual 895	com/tencent/mm/plugin/sns/model/aw:cmp	()V
    //   1748: aload_0
    //   1749: getfield 554	com/tencent/mm/plugin/sns/ui/SnsUIAction:nDp	Landroid/widget/ListView;
    //   1752: invokestatic 915	com/tencent/mm/sdk/platformtools/BackwardSupportUtil$c:a	(Landroid/widget/ListView;)V
    //   1755: ldc_w 598
    //   1758: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1761: goto -1692 -> 69
    //   1764: aload_3
    //   1765: ifnonnull +12 -> 1777
    //   1768: ldc_w 598
    //   1771: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1774: goto -1705 -> 69
    //   1777: iload_2
    //   1778: iconst_m1
    //   1779: if_icmpne +171 -> 1950
    //   1782: aload_3
    //   1783: invokevirtual 919	android/content/Intent:getData	()Landroid/net/Uri;
    //   1786: astore_3
    //   1787: aload_0
    //   1788: getfield 124	com/tencent/mm/plugin/sns/ui/SnsUIAction:mActivity	Landroid/app/Activity;
    //   1791: aload_3
    //   1792: aconst_null
    //   1793: aconst_null
    //   1794: aconst_null
    //   1795: aconst_null
    //   1796: invokevirtual 923	android/app/Activity:managedQuery	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   1799: astore_3
    //   1800: aload_3
    //   1801: invokeinterface 928 1 0
    //   1806: ifeq +49 -> 1855
    //   1809: new 229	android/content/Intent
    //   1812: dup
    //   1813: ldc_w 930
    //   1816: ldc_w 932
    //   1819: aload_3
    //   1820: aload_3
    //   1821: ldc_w 934
    //   1824: invokeinterface 938 2 0
    //   1829: invokeinterface 940 2 0
    //   1834: invokestatic 943	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1837: invokevirtual 407	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1840: invokestatic 949	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   1843: invokespecial 952	android/content/Intent:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   1846: astore_3
    //   1847: aload_0
    //   1848: getfield 124	com/tencent/mm/plugin/sns/ui/SnsUIAction:mActivity	Landroid/app/Activity;
    //   1851: aload_3
    //   1852: invokevirtual 955	android/app/Activity:startActivity	(Landroid/content/Intent;)V
    //   1855: ldc_w 598
    //   1858: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1861: goto -1792 -> 69
    //   1864: aload_3
    //   1865: ldc_w 957
    //   1868: iconst_m1
    //   1869: invokevirtual 233	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   1872: istore_1
    //   1873: iload_1
    //   1874: ifle +76 -> 1950
    //   1877: ldc 160
    //   1879: ldc_w 959
    //   1882: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1885: new 903	com/tencent/mm/plugin/sns/data/SnsCmdList
    //   1888: dup
    //   1889: invokespecial 960	com/tencent/mm/plugin/sns/data/SnsCmdList:<init>	()V
    //   1892: astore_3
    //   1893: aload_3
    //   1894: iload_1
    //   1895: invokevirtual 963	com/tencent/mm/plugin/sns/data/SnsCmdList:CK	(I)V
    //   1898: aload_0
    //   1899: getfield 299	com/tencent/mm/plugin/sns/ui/SnsUIAction:rBP	Lcom/tencent/mm/plugin/sns/ui/SnsUIAction$a;
    //   1902: iconst_m1
    //   1903: aload_3
    //   1904: getfield 907	com/tencent/mm/plugin/sns/data/SnsCmdList:qFN	Ljava/util/List;
    //   1907: aload_3
    //   1908: getfield 910	com/tencent/mm/plugin/sns/data/SnsCmdList:qFO	Ljava/util/List;
    //   1911: invokeinterface 886 4 0
    //   1916: ldc_w 598
    //   1919: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1922: goto -1853 -> 69
    //   1925: invokestatic 967	com/tencent/mm/plugin/sns/model/af:cnK	()Lcom/tencent/mm/plugin/sns/storage/k;
    //   1928: invokevirtual 972	com/tencent/mm/plugin/sns/storage/k:baT	()Z
    //   1931: pop
    //   1932: ldc_w 598
    //   1935: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1938: goto -1869 -> 69
    //   1941: ldc_w 598
    //   1944: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1947: goto -1878 -> 69
    //   1950: ldc_w 598
    //   1953: invokestatic 188	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1956: goto -1887 -> 69
    //   1959: astore 4
    //   1961: goto -938 -> 1023
    //   1964: astore 5
    //   1966: goto -751 -> 1215
    //
    // Exception table:
    //   from	to	target	type
    //   375	384	442	java/lang/Exception
    //   388	398	442	java/lang/Exception
    //   896	901	922	java/lang/Exception
    //   868	883	1174	java/lang/Exception
    //   888	896	1174	java/lang/Exception
    //   932	1018	1174	java/lang/Exception
    //   1196	1201	1204	java/lang/Exception
    //   868	883	1209	finally
    //   888	896	1209	finally
    //   932	1018	1209	finally
    //   1176	1196	1209	finally
    //   1018	1023	1959	java/lang/Exception
    //   1210	1215	1964	java/lang/Exception
  }

  public final void onCreate()
  {
    AppMethodBeat.i(39654);
    this.qDc = this.mActivity.getWindowManager().getDefaultDisplay().getHeight();
    af.cnC().start();
    if (this.rBQ != null)
      this.rBR = ((Toolbar.LayoutParams)this.rBQ.getLayoutParams());
    this.nDp = this.rBP.getSnsListView();
    this.nDp.post(new SnsUIAction.1(this));
    Object localObject = new StringBuilder("list is null ? ");
    boolean bool;
    label300: SnsHeader localSnsHeader;
    label452: String str1;
    String str2;
    String str3;
    if (this.nDp != null)
    {
      bool = true;
      ab.i("MicroMsg.SnsActivity", bool);
      this.nDp.setScrollingCacheEnabled(false);
      this.qQt = new SnsHeader(this.mActivity);
      this.qQt.setSessionId(this.cvF);
      this.qQt.setEnterObjectId(this.qSf);
      this.qQt.setBackClickListener(new SnsHeader.a()
      {
        public final boolean ctk()
        {
          AppMethodBeat.i(39645);
          SnsUIAction.c(SnsUIAction.this).cum();
          AppMethodBeat.o(39645);
          return false;
        }

        public final boolean kH(long paramAnonymousLong)
        {
          AppMethodBeat.i(39644);
          if ((SnsUIAction.b(SnsUIAction.this)) || (SnsUIAction.c(SnsUIAction.this).getType() == 1))
          {
            SnsUIAction.this.Em(2);
            AppMethodBeat.o(39644);
            return false;
          }
          Object localObject1 = new com.tencent.mm.plugin.sns.storage.n();
          ((com.tencent.mm.plugin.sns.storage.n)localObject1).field_snsId = paramAnonymousLong;
          ((com.tencent.mm.plugin.sns.storage.n)localObject1).field_userName = SnsUIAction.d(SnsUIAction.this);
          Object localObject2 = com.tencent.mm.modelsns.e.ajM();
          ((TimeLineObject)localObject2).jBB = SnsUIAction.d(SnsUIAction.this);
          ((com.tencent.mm.plugin.sns.storage.n)localObject1).c((TimeLineObject)localObject2);
          localObject2 = aj.XX(SnsUIAction.d(SnsUIAction.this));
          ab.d("MicroMsg.SnsActivity", "friend like %s", new Object[] { SnsUIAction.d(SnsUIAction.this) });
          if (localObject2 == null)
            am.a.a((com.tencent.mm.plugin.sns.storage.n)localObject1, 1, "", 0);
          while (true)
          {
            localObject1 = af.cnJ().YX(SnsUIAction.d(SnsUIAction.this));
            ((l)localObject1).field_local_flag |= 2;
            af.cnJ().c((l)localObject1);
            SnsUIAction.e(SnsUIAction.this);
            break;
            if (((com.tencent.mm.plugin.sns.storage.n)localObject2).cqT())
              am.a.a((com.tencent.mm.plugin.sns.storage.n)localObject1, 1, "", 0);
            else
              am.a.a((com.tencent.mm.plugin.sns.storage.n)localObject1, 5, "", 0);
          }
        }
      });
      this.miL = this.rBP.cui();
      this.iVh = this.rBP.getMaskView();
      this.qQt.setHeadBgListener(new SnsUIAction.8(this));
      this.rBL = new LoadingMoreView(this.mActivity);
      this.nDp.addHeaderView(this.qQt);
      this.nDp.addFooterView(this.rBL);
      this.nDp.setOnScrollListener(new SnsUIAction.9(this));
      this.ooW = this.rBP.cuj();
      localObject = new StringBuilder("pullDownView is null ? ");
      if (this.ooW == null)
        break label567;
      bool = true;
      ab.i("MicroMsg.SnsActivity", bool);
      this.ooW.setOnTopLoadDataListener(new MMPullDownView.g()
      {
        public final boolean bhn()
        {
          AppMethodBeat.i(39649);
          SnsUIAction.c(SnsUIAction.this).cul();
          AppMethodBeat.o(39649);
          return true;
        }
      });
      this.ooW.setTopViewVisible(false);
      this.ooW.setIsTopShowAll(false);
      this.ooW.setAtBottomCallBack(new SnsUIAction.11(this));
      this.ooW.setAtTopCallBack(new SnsUIAction.12(this));
      this.ooW.setIsBottomShowAll(false);
      this.ooW.setOnBottomLoadDataListener(new SnsUIAction.13(this));
      this.ooW.setShowBackground(true);
      this.ooW.setBgColor("#f4f4f4");
      this.title = this.mActivity.getIntent().getStringExtra("sns_title");
      localSnsHeader = this.qQt;
      if (!bo.isNullOrNil(this.igi))
        break label572;
      localObject = this.ryC;
      str1 = this.ryC;
      str2 = this.gHT;
      str3 = this.mSignature;
      if ((localObject != null) && (str1 != null))
        break label580;
      ab.e("MicroMsg.SnsHeader", "userName or selfName is null ");
      this.qQt.setType(this.rBP.getType());
      this.qQt.cti();
      if (Build.VERSION.SDK_INT >= 11)
        break label792;
      ab.d("MicroMsg.SnsActivity", "sdk not support dragdrop event");
    }
    while (true)
    {
      af.cnB().epg.add(this);
      aw.qHB += 1;
      af.cnA().a(this);
      AppMethodBeat.o(39654);
      return;
      bool = false;
      break;
      label567: bool = false;
      break label300;
      label572: localObject = this.igi;
      break label452;
      label580: localSnsHeader.userName = ((String)localObject).trim();
      localSnsHeader.ecX = str1.trim();
      localSnsHeader.czr = str1.equals(localObject);
      ab.d("MicroMsg.SnsHeader", "userNamelen " + ((String)localObject).length() + "  " + (String)localObject);
      localSnsHeader.rrU.jAJ.setText((CharSequence)localObject);
      if ((localSnsHeader.rrU == null) || (localSnsHeader.rrU.eks == null));
      while (true)
      {
        if ((localObject != null) && (((String)localObject).length() > 0))
        {
          localObject = com.tencent.mm.plugin.sns.data.i.K(str2);
          localSnsHeader.rrU.jAJ.setText(j.b(localSnsHeader.context, (CharSequence)localObject));
          localSnsHeader.rrU.rgK.setText(j.b(localSnsHeader.context, str3, localSnsHeader.rrU.rgK.getTextSize()));
        }
        localSnsHeader.rrU.eks.setContentDescription(localSnsHeader.context.getString(2131303600, new Object[] { localSnsHeader.rrU.jAJ.getText() }));
        break;
        a.b.t(localSnsHeader.rrU.eks, localSnsHeader.userName);
      }
      label792: new SnsUIAction.6(this).run();
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(39662);
    if (this.qQt != null)
    {
      Object localObject = this.qQt;
      if ((((SnsHeader)localObject).rsa != null) && (!((SnsHeader)localObject).rsa.isRecycled()))
        ((SnsHeader)localObject).rsa.recycle();
      if ((((SnsHeader)localObject).rrU != null) && (((SnsHeader)localObject).rrU.rsk != null))
      {
        localObject = ((SnsHeader)localObject).rrU.rsk;
        ab.i("MicroMsg.SnsStoryHeaderView", "destroy: ");
        ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getContactFetcher().b((k.b)localObject);
      }
    }
    com.tencent.mm.kernel.g.RQ();
    if (com.tencent.mm.kernel.g.RN().QY())
    {
      af.cnC().ab(this.mActivity);
      af.cnA().b(this);
    }
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    com.tencent.mm.kernel.g.RQ();
    if (com.tencent.mm.kernel.g.RN().QY())
    {
      af.cnB().epg.remove(this);
      aw.qHB -= 1;
    }
    this.rBL.setVisibility(8);
    aa.crX();
    com.tencent.mm.kernel.g.RQ();
    if (com.tencent.mm.kernel.g.RN().QY())
      af.cnC().start();
    this.nDp.setAdapter(null);
    AppMethodBeat.o(39662);
  }

  public final void onPause()
  {
    AppMethodBeat.i(39657);
    Object localObject = new me();
    ((me)localObject).cHX.cHY = false;
    com.tencent.mm.sdk.b.a.xxA.a((com.tencent.mm.sdk.b.b)localObject, Looper.getMainLooper());
    ab.d("MicroMsg.SnsActivity", "AppAttachDownloadUI cancel pause auto download logic");
    if (this.qQt != null)
    {
      localObject = this.qQt;
      if ((((SnsHeader)localObject).rrU != null) && (((SnsHeader)localObject).rrU.rsk != null))
      {
        localObject = ((SnsHeader)localObject).rrU.rsk;
        ((SnsStoryHeaderView)localObject).rMk = false;
        ((SnsStoryHeaderView)localObject).cAY = true;
      }
    }
    AppMethodBeat.o(39657);
  }

  public final void onResume()
  {
    AppMethodBeat.i(39656);
    af.cnA().aa(2, false);
    com.tencent.mm.pluginsdk.wallet.i.Lt(7);
    Object localObject = new me();
    ((me)localObject).cHX.cHY = true;
    com.tencent.mm.sdk.b.a.xxA.a((com.tencent.mm.sdk.b.b)localObject, Looper.getMainLooper());
    ab.d("MicroMsg.SnsActivity", "SnsActivity req pause auto download logic");
    if (this.qQt != null)
    {
      localObject = this.qQt;
      if ((((SnsHeader)localObject).rrU != null) && (((SnsHeader)localObject).rrU.rsk != null))
      {
        localObject = ((SnsHeader)localObject).rrU.rsk;
        ab.i("MicroMsg.SnsStoryHeaderView", "resume: ");
        ((SnsStoryHeaderView)localObject).cAY = false;
        ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getContactFetcher().cxd();
        ((SnsStoryHeaderView)localObject).post(new SnsStoryHeaderView.2((SnsStoryHeaderView)localObject));
      }
    }
    AppMethodBeat.o(39656);
  }

  public final void setSessionId(String paramString)
  {
    AppMethodBeat.i(39658);
    this.cvF = paramString;
    if (this.qQt != null)
      this.qQt.setSessionId(paramString);
    AppMethodBeat.o(39658);
  }

  public static abstract interface a
  {
    public abstract void Eh(int paramInt);

    public abstract void ad(int paramInt, boolean paramBoolean);

    public abstract void b(int paramInt, List<Integer> paramList1, List<Integer> paramList2);

    public abstract void cuh();

    public abstract View cui();

    public abstract MMPullDownView cuj();

    public abstract boolean cuk();

    public abstract void cul();

    public abstract void cum();

    public abstract void fA(int paramInt1, int paramInt2);

    public abstract View getMaskView();

    public abstract ListView getSnsListView();

    public abstract int getType();

    public abstract void ln(boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUIAction
 * JD-Core Version:    0.6.2
 */