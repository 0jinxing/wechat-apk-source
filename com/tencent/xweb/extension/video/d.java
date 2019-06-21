package com.tencent.xweb.extension.video;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import com.tencent.xweb.util.f;
import java.util.Timer;
import org.xwalk.core.Log;
import org.xwalk.core.ReflectMethod;

public final class d
  implements GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, b
{
  private ViewGroup ANC;
  SurfaceView AND;
  private View ANE;
  ViewGroup ANF;
  VideoStatusLayout ANG;
  ProgressBar ANH;
  TextView ANI;
  TextView ANJ;
  ClickableFrameLayout ANK;
  LinearLayout ANL;
  ImageView ANM;
  ImageView ANN;
  ImageView ANO;
  c ANP;
  private WebChromeClient.CustomViewCallback ANQ;
  ScaleGestureDetector ANR;
  private boolean ANS;
  private long ANT;
  private double ANU;
  private double ANV;
  private final int ANW = 0;
  private final int ANX = 1;
  private final int ANY = 2;
  private final int ANZ = 3;
  private int AOa = -3;
  private int AOb = 0;
  private double AOc = 0.0D;
  private float AOd = 0.0F;
  private float AOe = 0.0F;
  private a AOf;
  String AOg;
  private Timer AOh;
  private boolean AOi;
  private int AOj = 0;
  private double AOk;
  private int AOl = 200;
  private Drawable AOm;
  private Drawable AOn;
  private boolean AOo;
  private boolean AOp;
  private boolean AOq = false;
  private int AOr;
  GestureDetector Mh;
  private Window Ti;
  private WindowManager.LayoutParams auN;
  private AudioManager euK;
  private int hiG;
  private double idN;
  Activity mActivity;
  private float mBrightness = 1.0F;
  private int mMode = 0;
  FrameLayout odV;
  WebView zxW;

  private void aC(Runnable paramRunnable)
  {
    AppMethodBeat.i(84603);
    Activity localActivity = dUp();
    if (localActivity != null)
    {
      localActivity.runOnUiThread(paramRunnable);
      AppMethodBeat.o(84603);
    }
    while (true)
    {
      return;
      this.zxW.getView().post(paramRunnable);
      AppMethodBeat.o(84603);
    }
  }

  private Activity dUp()
  {
    AppMethodBeat.i(84596);
    if (this.mActivity != null)
    {
      localObject = this.mActivity;
      AppMethodBeat.o(84596);
      return localObject;
    }
    Object localObject = this.zxW.getContext();
    label32: if ((localObject instanceof Activity))
    {
      localObject = (Activity)localObject;
      label44: if (localObject == null)
        break label96;
      this.mActivity = ((Activity)localObject);
    }
    while (true)
    {
      AppMethodBeat.o(84596);
      break;
      if ((localObject instanceof ContextWrapper))
      {
        Context localContext = ((ContextWrapper)localObject).getBaseContext();
        if (localContext != localObject)
        {
          localObject = localContext;
          break label32;
        }
        localObject = null;
        break label44;
      }
      localObject = null;
      break label44;
      label96: Log.e("XWebNativeInterface", "royle:tryGetActivity but no Activity");
    }
  }

  // ERROR //
  public static String dUq()
  {
    // Byte code:
    //   0: ldc 212
    //   2: invokestatic 137	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 214
    //   7: invokestatic 220	com/tencent/xweb/xwalk/a/e:avu	(Ljava/lang/String;)Lcom/tencent/xweb/xwalk/a/c;
    //   10: astore_0
    //   11: aload_0
    //   12: ifnull +453 -> 465
    //   15: aload_0
    //   16: getfield 225	com/tencent/xweb/xwalk/a/c:ASG	I
    //   19: iconst_m1
    //   20: if_icmpeq +445 -> 465
    //   23: aload_0
    //   24: getfield 225	com/tencent/xweb/xwalk/a/c:ASG	I
    //   27: istore_1
    //   28: new 227	java/io/File
    //   31: dup
    //   32: aload_0
    //   33: aload_0
    //   34: getfield 225	com/tencent/xweb/xwalk/a/c:ASG	I
    //   37: iconst_0
    //   38: invokevirtual 231	com/tencent/xweb/xwalk/a/c:aM	(IZ)Ljava/lang/String;
    //   41: invokespecial 234	java/io/File:<init>	(Ljava/lang/String;)V
    //   44: astore_2
    //   45: aload_2
    //   46: invokevirtual 238	java/io/File:isFile	()Z
    //   49: ifeq +258 -> 307
    //   52: aload_2
    //   53: invokevirtual 241	java/io/File:exists	()Z
    //   56: ifeq +251 -> 307
    //   59: new 243	java/io/FileInputStream
    //   62: astore_0
    //   63: aload_0
    //   64: aload_2
    //   65: invokespecial 246	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   68: aload_0
    //   69: ifnull +391 -> 460
    //   72: new 248	java/io/InputStreamReader
    //   75: astore_3
    //   76: aload_3
    //   77: aload_0
    //   78: ldc 250
    //   80: invokespecial 253	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   83: new 255	java/io/BufferedReader
    //   86: astore_2
    //   87: aload_2
    //   88: aload_3
    //   89: invokespecial 258	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   92: aload_3
    //   93: astore 4
    //   95: aload_2
    //   96: astore 5
    //   98: new 260	java/lang/StringBuffer
    //   101: astore 6
    //   103: aload_3
    //   104: astore 4
    //   106: aload_2
    //   107: astore 5
    //   109: aload 6
    //   111: ldc_w 262
    //   114: invokespecial 263	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   117: aload_3
    //   118: astore 4
    //   120: aload_2
    //   121: astore 5
    //   123: aload_2
    //   124: invokevirtual 266	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   127: astore 7
    //   129: aload 7
    //   131: ifnull +187 -> 318
    //   134: aload_3
    //   135: astore 4
    //   137: aload_2
    //   138: astore 5
    //   140: aload 6
    //   142: aload 7
    //   144: invokevirtual 270	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   147: pop
    //   148: aload_3
    //   149: astore 4
    //   151: aload_2
    //   152: astore 5
    //   154: aload 6
    //   156: ldc_w 272
    //   159: invokevirtual 270	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   162: pop
    //   163: goto -46 -> 117
    //   166: astore 7
    //   168: aload_3
    //   169: astore 4
    //   171: aload_2
    //   172: astore 5
    //   174: new 274	java/lang/StringBuilder
    //   177: astore 6
    //   179: aload_3
    //   180: astore 4
    //   182: aload_2
    //   183: astore 5
    //   185: aload 6
    //   187: ldc_w 276
    //   190: invokespecial 277	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   193: aload_3
    //   194: astore 4
    //   196: aload_2
    //   197: astore 5
    //   199: ldc 195
    //   201: aload 6
    //   203: aload 7
    //   205: invokevirtual 280	java/io/IOException:getMessage	()Ljava/lang/String;
    //   208: invokevirtual 283	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: invokevirtual 286	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   214: invokestatic 203	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   217: aload_3
    //   218: ifnull +7 -> 225
    //   221: aload_3
    //   222: invokevirtual 289	java/io/InputStreamReader:close	()V
    //   225: aload_2
    //   226: ifnull +7 -> 233
    //   229: aload_2
    //   230: invokevirtual 290	java/io/BufferedReader:close	()V
    //   233: aload_0
    //   234: ifnull +7 -> 241
    //   237: aload_0
    //   238: invokevirtual 293	java/io/InputStream:close	()V
    //   241: aconst_null
    //   242: astore_0
    //   243: aload_0
    //   244: ifnull +10 -> 254
    //   247: aload_0
    //   248: invokevirtual 298	java/lang/String:isEmpty	()Z
    //   251: ifeq +154 -> 405
    //   254: ldc 195
    //   256: ldc_w 300
    //   259: invokestatic 302	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   262: ldc_w 304
    //   265: astore_0
    //   266: invokestatic 309	com/tencent/xweb/util/f:dVv	()V
    //   269: ldc 212
    //   271: invokestatic 144	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   274: aload_0
    //   275: areturn
    //   276: astore_0
    //   277: ldc 195
    //   279: new 274	java/lang/StringBuilder
    //   282: dup
    //   283: ldc_w 311
    //   286: invokespecial 277	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   289: aload_0
    //   290: invokevirtual 312	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   293: invokevirtual 283	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: invokevirtual 286	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   299: invokestatic 203	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   302: aconst_null
    //   303: astore_0
    //   304: goto -236 -> 68
    //   307: aload_0
    //   308: iconst_m1
    //   309: invokevirtual 316	com/tencent/xweb/xwalk/a/c:SD	(I)Z
    //   312: pop
    //   313: aconst_null
    //   314: astore_0
    //   315: goto -247 -> 68
    //   318: aload_3
    //   319: astore 4
    //   321: aload_2
    //   322: astore 5
    //   324: aload 6
    //   326: invokevirtual 317	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   329: astore 7
    //   331: aload_3
    //   332: invokevirtual 289	java/io/InputStreamReader:close	()V
    //   335: aload_2
    //   336: invokevirtual 290	java/io/BufferedReader:close	()V
    //   339: aload_0
    //   340: ifnull +7 -> 347
    //   343: aload_0
    //   344: invokevirtual 293	java/io/InputStream:close	()V
    //   347: aload 7
    //   349: astore_0
    //   350: goto -107 -> 243
    //   353: astore_0
    //   354: aload 7
    //   356: astore_0
    //   357: goto -114 -> 243
    //   360: astore_0
    //   361: aconst_null
    //   362: astore_0
    //   363: goto -120 -> 243
    //   366: astore_2
    //   367: aconst_null
    //   368: astore_3
    //   369: aconst_null
    //   370: astore 5
    //   372: aload_3
    //   373: ifnull +7 -> 380
    //   376: aload_3
    //   377: invokevirtual 289	java/io/InputStreamReader:close	()V
    //   380: aload 5
    //   382: ifnull +8 -> 390
    //   385: aload 5
    //   387: invokevirtual 290	java/io/BufferedReader:close	()V
    //   390: aload_0
    //   391: ifnull +7 -> 398
    //   394: aload_0
    //   395: invokevirtual 293	java/io/InputStream:close	()V
    //   398: ldc 212
    //   400: invokestatic 144	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   403: aload_2
    //   404: athrow
    //   405: ldc 195
    //   407: ldc_w 319
    //   410: iload_1
    //   411: invokestatic 323	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   414: invokevirtual 327	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   417: invokestatic 302	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   420: invokestatic 330	com/tencent/xweb/util/f:dVu	()V
    //   423: goto -154 -> 269
    //   426: astore_0
    //   427: goto -29 -> 398
    //   430: astore_2
    //   431: aconst_null
    //   432: astore 5
    //   434: goto -62 -> 372
    //   437: astore_2
    //   438: aload 4
    //   440: astore_3
    //   441: goto -69 -> 372
    //   444: astore 7
    //   446: aconst_null
    //   447: astore_3
    //   448: aconst_null
    //   449: astore_2
    //   450: goto -282 -> 168
    //   453: astore 7
    //   455: aconst_null
    //   456: astore_2
    //   457: goto -289 -> 168
    //   460: aconst_null
    //   461: astore_0
    //   462: goto -219 -> 243
    //   465: iconst_m1
    //   466: istore_1
    //   467: aconst_null
    //   468: astore_0
    //   469: goto -401 -> 68
    //
    // Exception table:
    //   from	to	target	type
    //   98	103	166	java/io/IOException
    //   109	117	166	java/io/IOException
    //   123	129	166	java/io/IOException
    //   140	148	166	java/io/IOException
    //   154	163	166	java/io/IOException
    //   324	331	166	java/io/IOException
    //   59	68	276	java/io/FileNotFoundException
    //   331	339	353	java/lang/Exception
    //   343	347	353	java/lang/Exception
    //   221	225	360	java/lang/Exception
    //   229	233	360	java/lang/Exception
    //   237	241	360	java/lang/Exception
    //   72	83	366	finally
    //   376	380	426	java/lang/Exception
    //   385	390	426	java/lang/Exception
    //   394	398	426	java/lang/Exception
    //   83	92	430	finally
    //   98	103	437	finally
    //   109	117	437	finally
    //   123	129	437	finally
    //   140	148	437	finally
    //   154	163	437	finally
    //   174	179	437	finally
    //   185	193	437	finally
    //   199	217	437	finally
    //   324	331	437	finally
    //   72	83	444	java/io/IOException
    //   83	92	453	java/io/IOException
  }

  private SurfaceView fB(View paramView)
  {
    AppMethodBeat.i(84627);
    if ((paramView instanceof SurfaceView))
    {
      paramView = (SurfaceView)paramView;
      AppMethodBeat.o(84627);
    }
    while (true)
    {
      return paramView;
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        for (int i = 0; ; i++)
        {
          if (i >= localViewGroup.getChildCount())
            break label77;
          paramView = fB(localViewGroup.getChildAt(i));
          if (paramView != null)
          {
            AppMethodBeat.o(84627);
            break;
          }
        }
      }
      label77: paramView = null;
      AppMethodBeat.o(84627);
    }
  }

  private static String q(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(84613);
    String str1 = String.format("%02d", new Object[] { Integer.valueOf((int)(paramDouble1 / 3600.0D)) });
    String str2 = String.format("%02d", new Object[] { Integer.valueOf((int)(paramDouble1 % 3600.0D) / 60) });
    String str3 = String.format("%02d", new Object[] { Integer.valueOf((int)(paramDouble1 % 3600.0D) % 60) });
    if (paramDouble2 > 3600.0D);
    for (str1 = String.format("%s:%s:%s", new Object[] { str1, str2, str3 }); ; str1 = String.format("%s:%s", new Object[] { str2, str3 }))
    {
      AppMethodBeat.o(84613);
      return str1;
    }
  }

  private void rA(boolean paramBoolean)
  {
    AppMethodBeat.i(84628);
    Activity localActivity = dUp();
    if (localActivity == null)
      AppMethodBeat.o(84628);
    while (true)
    {
      return;
      if (paramBoolean)
      {
        if ((localActivity.getWindow().getAttributes().flags & 0x800) != 0)
        {
          this.AOp = true;
          localActivity.getWindow().clearFlags(2048);
          label58: if (this.AOq)
            break label176;
          if ((localActivity.getWindow().getAttributes().flags & 0x400) == 0)
            break label109;
          this.AOo = true;
        }
        while (true)
        {
          this.AOq = true;
          AppMethodBeat.o(84628);
          break;
          this.AOp = false;
          break label58;
          label109: this.AOo = false;
          localActivity.getWindow().addFlags(1024);
        }
      }
      else
      {
        if (this.AOp)
          localActivity.getWindow().addFlags(2048);
        if (!this.AOo)
          localActivity.getWindow().clearFlags(1024);
        this.AOr = 0;
        this.AOq = false;
        this.ANS = false;
      }
      label176: AppMethodBeat.o(84628);
    }
  }

  private void reset()
  {
    AppMethodBeat.i(84600);
    if (this.euK == null)
      this.euK = ((AudioManager)this.zxW.getContext().getSystemService("audio"));
    this.AOb = this.euK.getStreamMaxVolume(3);
    this.AOc = this.euK.getStreamVolume(3);
    if (this.AOf == null)
      this.AOf = new a(this.zxW.getContext());
    if (this.Ti == null)
    {
      Activity localActivity = dUp();
      if (localActivity != null)
        this.Ti = localActivity.getWindow();
    }
    if ((this.Ti != null) && (this.auN == null))
      this.auN = this.Ti.getAttributes();
    if (this.auN != null)
    {
      this.mBrightness = this.auN.screenBrightness;
      if (this.mBrightness != -1.0F);
    }
    while (true)
    {
      try
      {
        this.mBrightness = ((float)(Settings.System.getInt(this.zxW.getContext().getContentResolver(), "screen_brightness") / 256.0D));
        AppMethodBeat.o(84600);
        return;
      }
      catch (Settings.SettingNotFoundException localSettingNotFoundException)
      {
        Log.e("XWebNativeInterface", "brightness get error:" + localSettingNotFoundException.getMessage());
      }
      AppMethodBeat.o(84600);
    }
  }

  private void rz(boolean paramBoolean)
  {
    AppMethodBeat.i(84611);
    aC(new d.2(this, paramBoolean));
    AppMethodBeat.o(84611);
  }

  public final void am(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(84598);
    if ((this.zxW != null) && (paramBoolean2) && (this.AOg != null))
    {
      Log.i("XWebNativeInterface", "evaluteJavascript:".concat(String.valueOf(paramBoolean1)));
      String str = this.AOg;
      if (paramBoolean1)
      {
        str = this.AOg;
        str = "window.addEventListener('DOMContentLoaded', function() {" + str + "});this.xwebReturn = function (){return \"1\";};this.xwebReturn()";
      }
      this.zxW.evaluateJavascript(str, new d.17(this));
    }
    AppMethodBeat.o(84598);
  }

  public final void dUr()
  {
    AppMethodBeat.i(84604);
    if (this.AOh != null)
    {
      this.AOh.cancel();
      this.AOh.purge();
      this.AOh = null;
    }
    this.AOh = new Timer();
    this.AOh.schedule(new d.18(this), 4000L);
    AppMethodBeat.o(84604);
  }

  public final void dUs()
  {
    AppMethodBeat.i(84605);
    if (this.AOh != null)
    {
      this.AOh.cancel();
      this.AOh.purge();
      this.AOh = null;
    }
    AppMethodBeat.o(84605);
  }

  public final void dUt()
  {
    AppMethodBeat.i(84609);
    aC(new d.19(this));
    AppMethodBeat.o(84609);
  }

  public final void dUu()
  {
    AppMethodBeat.i(84610);
    aC(new d.20(this));
    AppMethodBeat.o(84610);
  }

  public final void dh(Object paramObject)
  {
    AppMethodBeat.i(84597);
    new ReflectMethod(paramObject, "addJavascriptInterface", new Class[] { Object.class, String.class }).invoke(new Object[] { this, "xwebToNative" });
    AppMethodBeat.o(84597);
  }

  public final void f(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(84612);
    aC(new d.3(this, paramBoolean, paramDouble));
    AppMethodBeat.o(84612);
  }

  public final boolean hasEnteredFullscreen()
  {
    return this.AOq;
  }

  public final void ii(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(84629);
    Object localObject = dUp();
    if (localObject == null)
    {
      AppMethodBeat.o(84629);
      return;
    }
    if ((this.AOa == -3) && (localObject != null))
      this.AOa = ((Activity)localObject).getRequestedOrientation();
    int i;
    label56: Point localPoint;
    int j;
    label150: double d1;
    if (paramInt1 <= paramInt2)
    {
      ((Activity)localObject).setRequestedOrientation(1);
      i = 1;
      this.hiG = i;
      if (this.ANE != null)
      {
        localObject = this.ANE;
        Display localDisplay = ((WindowManager)this.zxW.getContext().getSystemService("window")).getDefaultDisplay();
        localPoint = new Point(0, 0);
        localDisplay.getSize(localPoint);
        if (i != 0)
          break label226;
        j = Math.max(localPoint.x, localPoint.y);
        i = Math.min(localPoint.x, localPoint.y);
        d1 = paramInt1 * 1.0D / paramInt2;
        if (d1 < j * 1.0D / i)
          break label259;
        double d2 = j;
        i = (int)(1.0D / d1 * d2);
      }
    }
    while (true)
    {
      ((View)localObject).setLayoutParams(new FrameLayout.LayoutParams(j, i, 17));
      AppMethodBeat.o(84629);
      break;
      ((Activity)localObject).setRequestedOrientation(0);
      i = 0;
      break label56;
      label226: i = Math.max(localPoint.x, localPoint.y);
      j = Math.min(localPoint.x, localPoint.y);
      break label150;
      label259: j = (int)(d1 * i);
    }
  }

  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    this.AOj = 0;
    return true;
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public final void onHideCustomView()
  {
    AppMethodBeat.i(84602);
    if (this.ANQ != null)
      this.ANQ.onCustomViewHidden();
    Log.i("XWebNativeInterface", "detach");
    if (!this.AOq)
    {
      Log.i("XWebNativeInterface", "detach has exited fullscreen");
      AppMethodBeat.o(84602);
    }
    while (true)
    {
      return;
      Activity localActivity = dUp();
      if (localActivity != null)
      {
        if (this.AOm != null)
        {
          if ((this.AOm instanceof ColorDrawable))
            this.zxW.getWebViewUI().setBackgroundColor(((ColorDrawable)this.AOm).getColor());
          this.AOm = null;
          label103: if (this.AOn == null)
            break label166;
          this.zxW.setBackground(this.AOn);
        }
        while (true)
        {
          ViewGroup localViewGroup = (ViewGroup)localActivity.getWindow().getDecorView();
          if (this.odV.getParent() == localViewGroup)
            break label177;
          AppMethodBeat.o(84602);
          break;
          this.zxW.getWebViewUI().setBackgroundColor(0);
          break label103;
          label166: this.zxW.setBackgroundColor(0);
        }
        label177: if (this.zxW.isXWalkKernel())
        {
          this.odV.removeView(this.zxW);
          this.ANC.addView(this.zxW, 0);
        }
        if (this.ANE != null)
          this.odV.removeView(this.ANE);
        this.odV.removeView(this.ANF);
        this.ANF.setVisibility(8);
        if (this.AOa != -3)
        {
          localActivity.setRequestedOrientation(this.AOa);
          this.AOa = -3;
        }
        rA(false);
        if ((this.odV.getParent() instanceof ViewGroup))
          ((ViewGroup)this.odV.getParent()).removeView(this.odV);
      }
      AppMethodBeat.o(84602);
    }
  }

  public final void onLongPress(MotionEvent paramMotionEvent)
  {
  }

  public final boolean onScale(ScaleGestureDetector paramScaleGestureDetector)
  {
    boolean bool = true;
    AppMethodBeat.i(84608);
    if ((this.mMode == 1) && (this.ANE != null))
    {
      float f = paramScaleGestureDetector.getScaleFactor();
      this.ANE.getLeft();
      this.ANE.getTop();
      this.ANE.getBottom();
      this.ANE.getRight();
      int i = (int)(this.ANE.getWidth() * f);
      int j = (int)(f * this.ANE.getHeight());
      paramScaleGestureDetector = new FrameLayout.LayoutParams(-2, -2, 17);
      paramScaleGestureDetector.width = i;
      paramScaleGestureDetector.height = j;
      if (this.ANE != null)
        this.ANE.setLayoutParams(paramScaleGestureDetector);
      AppMethodBeat.o(84608);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84608);
    }
  }

  public final boolean onScaleBegin(ScaleGestureDetector paramScaleGestureDetector)
  {
    return true;
  }

  public final void onScaleEnd(ScaleGestureDetector paramScaleGestureDetector)
  {
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(84607);
    if ((paramMotionEvent1 == null) || (paramMotionEvent2 == null))
    {
      AppMethodBeat.o(84607);
      return true;
    }
    float f1 = paramMotionEvent2.getX();
    float f2 = paramMotionEvent1.getX();
    float f3 = paramMotionEvent2.getY() - paramMotionEvent1.getY();
    if (this.ANF.getHeight() > this.ANF.getWidth())
    {
      paramFloat2 = this.ANF.getWidth();
      paramFloat1 = this.ANF.getHeight();
    }
    label81: double d1;
    switch (this.AOj)
    {
    default:
    case 0:
      while (true)
      {
        AppMethodBeat.o(84607);
        break;
        paramFloat2 = this.ANF.getHeight();
        paramFloat1 = this.ANF.getWidth();
        break label81;
        if (Math.abs(f1 - f2) - Math.abs(f3) > 1.0F)
        {
          this.AOj = 3;
        }
        else
        {
          reset();
          d1 = Math.ceil(25.0F * this.zxW.getContext().getResources().getDisplayMetrics().density);
          if ((paramMotionEvent1.getY() < 2.0D * d1) || (paramMotionEvent1.getY() > this.ANF.getHeight() - d1 * 2.0D))
            this.AOj = 0;
          else if (paramMotionEvent1.getX() < this.ANF.getWidth() / 2.0F)
            this.AOj = 2;
          else
            this.AOj = 1;
        }
      }
    case 1:
      paramFloat1 = f3 * -1.0F;
      d1 = this.AOb * paramFloat1 / paramFloat2 * 1.2F;
      int i = (int)d1;
      int j = i;
      if (i == 0)
      {
        j = i;
        if (Math.abs(d1) > 0.2000000029802322D)
        {
          if (paramFloat1 <= 0.0F)
            break label427;
          j = 1;
        }
      }
      d1 = this.AOc;
      double d2 = j + d1;
      if (d2 > this.AOb)
        d1 = this.AOb;
      while (true)
      {
        this.euK.setStreamVolume(3, (int)d1, 4);
        j = (int)(d1 / this.AOb * 100.0D);
        this.ANG.setVolumnProgress(j);
        this.ANG.show();
        break;
        j = i;
        if (paramFloat1 >= 0.0F)
          break label348;
        j = -1;
        break label348;
        d1 = d2;
        if (d2 < 0.0D)
          d1 = 0.0D;
      }
    case 2:
      label348: paramFloat2 = -1.0F * f3 / paramFloat2 * 1.2F + this.mBrightness;
      label427: if (paramFloat2 < 0.0F)
        paramFloat1 = 0.0F;
      while (true)
      {
        this.auN.screenBrightness = paramFloat1;
        this.Ti.setAttributes(this.auN);
        this.ANG.setBrightProgress((int)(paramFloat1 * 100.0F));
        this.ANG.show();
        break;
        paramFloat1 = paramFloat2;
        if (paramFloat2 > 1.0F)
          paramFloat1 = 1.0F;
      }
    case 3:
    }
    paramFloat2 = paramMotionEvent2.getX() - paramMotionEvent1.getX();
    this.AOe = this.ANP.Yn;
    if (paramFloat2 > 0.0F)
    {
      f2 = this.AOe;
      this.AOd = ((int)(paramFloat2 / paramFloat1 * 100.0F + f2));
      if (this.AOd > 100.0F)
        this.AOd = 100.0F;
    }
    while (true)
    {
      d1 = this.idN * this.AOd / 100.0D;
      this.ANG.setVideoTimeProgress(q(d1, this.idN) + "/" + q(this.idN, this.idN));
      this.ANG.show();
      this.AOk = d1;
      break;
      f2 = this.AOe;
      this.AOd = ((int)(paramFloat2 / paramFloat1 * 100.0F + f2));
      if (this.AOd < 0.0F)
        this.AOd = 0.0F;
    }
  }

  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    AppMethodBeat.i(84601);
    Log.i("XWebNativeInterface", "onShowCustomView");
    this.ANE = paramView;
    this.ANQ = paramCustomViewCallback;
    if ((this.ANE != null) || (this.zxW.isXWalkKernel()))
    {
      if (!this.zxW.isXWalkKernel())
        break label92;
      f.dUT();
      Log.i("XWebNativeInterface", "attach");
      if (!this.AOq)
        break label108;
      Log.i("XWebNativeInterface", "attach has entered fullscreen");
    }
    while (true)
    {
      this.zxW.requestFocus();
      AppMethodBeat.o(84601);
      return;
      label92: if (!this.zxW.isSysKernel())
        break;
      f.dUX();
      break;
      label108: paramView = dUp();
      if (paramView != null)
      {
        reset();
        rA(true);
        paramView = (FrameLayout)paramView.getWindow().getDecorView();
        if ((this.zxW.isXWalkKernel()) && (this.odV.getParent() == paramView) && (this.ANE != null))
        {
          this.odV.addView(this.ANE, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        }
        else if (this.odV.getParent() != paramView)
        {
          paramView.addView(this.odV, new FrameLayout.LayoutParams(-1, -1, 17));
          if (this.ANE != null)
          {
            this.odV.addView(this.ANE, this.odV.getChildCount(), new FrameLayout.LayoutParams(-1, -1, 17));
            if (this.zxW.isSysKernel())
              this.ANE.setVisibility(4);
          }
          if (this.zxW.isSysKernel())
          {
            paramView = fB(this.ANE);
            if (paramView != null)
              paramView.setZOrderMediaOverlay(true);
          }
          if (this.zxW.isXWalkKernel())
          {
            this.ANC = ((ViewGroup)this.zxW.getParent());
            this.ANC.removeView(this.zxW);
            this.odV.addView(this.zxW, this.odV.getChildCount());
          }
          this.odV.addView(this.ANF, this.odV.getChildCount(), new FrameLayout.LayoutParams(-1, -1, 17));
          this.AOm = this.zxW.getWebViewUI().getBackground();
          this.zxW.getWebViewUI().setBackgroundColor(-16777216);
          this.AOn = this.zxW.getBackground();
          this.zxW.setBackgroundColor(-16777216);
          if (this.zxW.isSysKernel())
            this.odV.postDelayed(new d.13(this), this.AOl);
        }
      }
    }
  }

  public final void onShowPress(MotionEvent paramMotionEvent)
  {
  }

  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(84606);
    dUs();
    if (this.AOi)
      dUu();
    while (true)
    {
      AppMethodBeat.o(84606);
      return true;
      dUt();
    }
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onSpecialVideoEnterFullscreen(int paramInt)
  {
    AppMethodBeat.i(84625);
    Log.i("XWebNativeInterface", "onSpecialVideoEnterFullscreen:".concat(String.valueOf(paramInt)));
    f.aK(paramInt, this.zxW.isXWalkKernel());
    AppMethodBeat.o(84625);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onSpecialVideoHook(int paramInt)
  {
    AppMethodBeat.i(84626);
    Log.i("XWebNativeInterface", "onSpecialVideoHook:".concat(String.valueOf(paramInt)));
    f.aL(paramInt, this.zxW.isXWalkKernel());
    AppMethodBeat.o(84626);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoEnterFullscreen(boolean paramBoolean1, long paramLong, double paramDouble1, double paramDouble2, boolean paramBoolean2, boolean paramBoolean3, double paramDouble3, double paramDouble4, double[] paramArrayOfDouble)
  {
    AppMethodBeat.i(84621);
    Log.i("XWebNativeInterface", "onVideoEnterFullscreen:isVideoTag:" + paramBoolean1 + ",width:" + paramDouble1 + ",height:" + paramDouble2 + ",pause:" + paramBoolean2 + ",seeking:" + paramBoolean3 + ",currentTime:" + paramDouble3 + ",duration:" + paramDouble4);
    if (this.zxW.isXWalkKernel())
    {
      f.dUU();
      if (paramBoolean1)
      {
        if (!this.zxW.isXWalkKernel())
          break label217;
        f.dUV();
        label124: this.ANS = true;
      }
      this.ANT = paramLong;
      this.idN = paramDouble4;
      this.ANU = paramDouble1;
      this.ANV = paramDouble2;
      if (!paramBoolean3)
        break label233;
      onVideoSeeking();
    }
    while (true)
    {
      aC(new d.9(this, paramBoolean1, paramDouble1, paramDouble2));
      onVideoTimeUpdate(paramDouble3, paramDouble4, paramArrayOfDouble);
      rz(paramBoolean2);
      AppMethodBeat.o(84621);
      return;
      if (!this.zxW.isSysKernel())
        break;
      f.dUY();
      break;
      label217: if (!this.zxW.isSysKernel())
        break label124;
      f.dUZ();
      break label124;
      label233: onVideoSeeked();
    }
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoExitFullscreen()
  {
    AppMethodBeat.i(84622);
    Log.i("XWebNativeInterface", "onVideoExitFullscreen");
    this.ANS = false;
    aC(new d.10(this));
    AppMethodBeat.o(84622);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoGetFrame(long paramLong, double paramDouble, String paramString)
  {
    AppMethodBeat.i(84614);
    if ((paramLong == this.ANT) && (this.AOk == paramDouble) && (paramString != null) && (paramString.startsWith("data:image/png;base64,")))
    {
      paramString = Base64.decode(paramString.substring(22), 0);
      paramString = BitmapFactory.decodeByteArray(paramString, 0, paramString.length);
      this.ANM.setImageBitmap(paramString);
      this.ANM.setVisibility(0);
    }
    AppMethodBeat.o(84614);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoPause()
  {
    AppMethodBeat.i(84620);
    Log.i("XWebNativeInterface", "onVideoPause");
    rz(true);
    AppMethodBeat.o(84620);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoPlay()
  {
    AppMethodBeat.i(84619);
    Log.i("XWebNativeInterface", "onVideoPlay");
    rz(false);
    AppMethodBeat.o(84619);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoPlaying()
  {
    AppMethodBeat.i(84615);
    Log.i("XWebNativeInterface", "onVideoPlaying");
    aC(new d.5(this));
    AppMethodBeat.o(84615);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoSeeked()
  {
    AppMethodBeat.i(84618);
    Log.i("XWebNativeInterface", "onVideoSeeked");
    aC(new d.8(this));
    AppMethodBeat.o(84618);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoSeeking()
  {
    AppMethodBeat.i(84617);
    Log.i("XWebNativeInterface", "onVideoSeeking");
    aC(new d.7(this));
    AppMethodBeat.o(84617);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoSizeUpdate(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(84624);
    if ((this.ANV != paramDouble2) || (this.ANU != paramDouble1))
    {
      this.ANU = paramDouble1;
      this.ANV = paramDouble2;
      Log.i("XWebNativeInterface", "onVideoSizeUpdate width:" + paramDouble1 + ", height:" + paramDouble2);
      aC(new d.11(this, paramDouble1, paramDouble2));
    }
    AppMethodBeat.o(84624);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoTimeUpdate(double paramDouble1, double paramDouble2, double[] paramArrayOfDouble)
  {
    AppMethodBeat.i(84623);
    this.idN = paramDouble2;
    f(paramDouble1, true);
    aC(new d.4(this, paramDouble2, paramArrayOfDouble));
    AppMethodBeat.o(84623);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoWaiting()
  {
    AppMethodBeat.i(84616);
    Log.i("XWebNativeInterface", "onVideoWaiting");
    aC(new d.6(this));
    AppMethodBeat.o(84616);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.d
 * JD-Core Version:    0.6.2
 */