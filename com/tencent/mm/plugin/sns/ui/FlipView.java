package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.Gallery;
import android.widget.LinearLayout;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.am;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.a.np;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMNewPhotoEditUI;
import com.tencent.mm.ui.base.f;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.List;

public abstract class FlipView extends LinearLayout
  implements View.OnTouchListener, b.b
{
  Context context;
  private int cvn;
  private int cvo;
  private long eRt = 0L;
  protected ak handler;
  protected int infoType = -1;
  private c mip = new FlipView.5(this);
  private String riA;
  private String riB;
  private String riC;
  private boolean riD = false;
  private FlipView.a riE = new FlipView.a(this);
  float riF = 0.0F;
  float riG = 0.0F;
  boolean riH = false;
  float riI = 1.0F;
  private c riJ = new FlipView.6(this);
  private double rip = 0.0D;
  private double riq = 0.0D;
  protected u rir;
  protected s.a ris;
  protected int rit;
  protected int riu;
  private boolean riv = false;
  private long riw = 0L;
  private boolean rix = false;
  private com.tencent.mm.ui.widget.a.d riy;
  private String riz;

  public FlipView(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }

  public FlipView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }

  private void crJ()
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((Activity)this.context).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    this.rit = localDisplayMetrics.widthPixels;
    this.riu = localDisplayMetrics.heightPixels;
  }

  // ERROR //
  public static String g(String paramString, Context paramContext)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_3
    //   5: astore 4
    //   7: aload_0
    //   8: ifnull +116 -> 124
    //   11: aload_3
    //   12: astore 4
    //   14: aload_0
    //   15: ldc 204
    //   17: invokevirtual 210	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   20: ifne +104 -> 124
    //   23: new 212	java/lang/StringBuilder
    //   26: dup
    //   27: invokespecial 213	java/lang/StringBuilder:<init>	()V
    //   30: getstatic 218	com/tencent/mm/compatible/util/e:euR	Ljava/lang/String;
    //   33: invokevirtual 222	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: ldc 224
    //   38: iconst_3
    //   39: anewarray 226	java/lang/Object
    //   42: dup
    //   43: iconst_0
    //   44: ldc 228
    //   46: aastore
    //   47: dup
    //   48: iconst_1
    //   49: aload_0
    //   50: invokevirtual 232	java/lang/String:hashCode	()I
    //   53: invokestatic 238	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   56: aastore
    //   57: dup
    //   58: iconst_2
    //   59: ldc 240
    //   61: aastore
    //   62: invokestatic 244	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   65: invokevirtual 222	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: invokevirtual 248	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: astore 5
    //   73: new 250	java/io/File
    //   76: dup
    //   77: invokestatic 256	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   80: invokevirtual 262	android/content/Context:getCacheDir	()Ljava/io/File;
    //   83: new 212	java/lang/StringBuilder
    //   86: dup
    //   87: ldc_w 264
    //   90: invokespecial 266	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   93: invokestatic 272	java/lang/System:currentTimeMillis	()J
    //   96: invokevirtual 275	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   99: invokevirtual 248	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: invokespecial 278	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   105: invokevirtual 281	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   108: astore 6
    //   110: aload_0
    //   111: aload 6
    //   113: invokestatic 287	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   116: lconst_0
    //   117: lcmp
    //   118: ifge +9 -> 127
    //   121: aload_3
    //   122: astore 4
    //   124: aload 4
    //   126: areturn
    //   127: aload 6
    //   129: invokestatic 293	com/tencent/mm/sdk/platformtools/MMNativeJpeg:isProgressive	(Ljava/lang/String;)Z
    //   132: ifeq +251 -> 383
    //   135: aload 6
    //   137: invokestatic 297	com/tencent/mm/sdk/platformtools/MMNativeJpeg:decodeAsBitmap	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   140: astore 7
    //   142: aload 7
    //   144: ifnull +231 -> 375
    //   147: aload 5
    //   149: iconst_0
    //   150: invokestatic 301	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   153: astore 4
    //   155: aload 4
    //   157: astore 8
    //   159: aload 7
    //   161: getstatic 307	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   164: bipush 80
    //   166: aload 4
    //   168: invokevirtual 313	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   171: pop
    //   172: aload 4
    //   174: ifnull +8 -> 182
    //   177: aload 4
    //   179: invokevirtual 318	java/io/OutputStream:close	()V
    //   182: aload 6
    //   184: invokestatic 321	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   187: pop
    //   188: iload_2
    //   189: ifne +17 -> 206
    //   192: aload_3
    //   193: astore 4
    //   195: aload_0
    //   196: aload 5
    //   198: invokestatic 287	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   201: lconst_0
    //   202: lcmp
    //   203: iflt -79 -> 124
    //   206: aload_1
    //   207: new 323	android/content/Intent
    //   210: dup
    //   211: ldc_w 325
    //   214: aload 5
    //   216: invokestatic 329	com/tencent/mm/vfs/e:asY	(Ljava/lang/String;)Landroid/net/Uri;
    //   219: invokespecial 332	android/content/Intent:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   222: invokevirtual 336	android/content/Context:sendBroadcast	(Landroid/content/Intent;)V
    //   225: aload 5
    //   227: astore 4
    //   229: goto -105 -> 124
    //   232: astore 7
    //   234: aconst_null
    //   235: astore 4
    //   237: aload 4
    //   239: astore 8
    //   241: ldc_w 338
    //   244: aload 7
    //   246: ldc 204
    //   248: iconst_0
    //   249: anewarray 226	java/lang/Object
    //   252: invokestatic 344	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   255: aload 4
    //   257: ifnull +8 -> 265
    //   260: aload 4
    //   262: invokevirtual 318	java/io/OutputStream:close	()V
    //   265: aload 6
    //   267: invokestatic 321	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   270: pop
    //   271: iconst_0
    //   272: istore_2
    //   273: goto -85 -> 188
    //   276: astore 7
    //   278: aconst_null
    //   279: astore 4
    //   281: aload 4
    //   283: astore 8
    //   285: ldc_w 338
    //   288: aload 7
    //   290: ldc 204
    //   292: iconst_0
    //   293: anewarray 226	java/lang/Object
    //   296: invokestatic 344	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   299: aload 4
    //   301: ifnull +8 -> 309
    //   304: aload 4
    //   306: invokevirtual 318	java/io/OutputStream:close	()V
    //   309: aload 6
    //   311: invokestatic 321	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   314: pop
    //   315: iconst_0
    //   316: istore_2
    //   317: goto -129 -> 188
    //   320: astore_0
    //   321: aconst_null
    //   322: astore 8
    //   324: aload 8
    //   326: ifnull +8 -> 334
    //   329: aload 8
    //   331: invokevirtual 318	java/io/OutputStream:close	()V
    //   334: aload 6
    //   336: invokestatic 321	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   339: pop
    //   340: aload_0
    //   341: athrow
    //   342: astore 4
    //   344: goto -162 -> 182
    //   347: astore 4
    //   349: goto -84 -> 265
    //   352: astore 4
    //   354: goto -45 -> 309
    //   357: astore_1
    //   358: goto -24 -> 334
    //   361: astore_0
    //   362: goto -38 -> 324
    //   365: astore 7
    //   367: goto -86 -> 281
    //   370: astore 7
    //   372: goto -135 -> 237
    //   375: aconst_null
    //   376: astore 4
    //   378: iconst_0
    //   379: istore_2
    //   380: goto -208 -> 172
    //   383: iconst_0
    //   384: istore_2
    //   385: goto -197 -> 188
    //
    // Exception table:
    //   from	to	target	type
    //   135	142	232	java/io/FileNotFoundException
    //   147	155	232	java/io/FileNotFoundException
    //   135	142	276	java/lang/OutOfMemoryError
    //   147	155	276	java/lang/OutOfMemoryError
    //   135	142	320	finally
    //   147	155	320	finally
    //   177	182	342	java/lang/Exception
    //   260	265	347	java/lang/Exception
    //   304	309	352	java/lang/Exception
    //   329	334	357	java/lang/Exception
    //   159	172	361	finally
    //   241	255	361	finally
    //   285	299	361	finally
    //   159	172	365	java/lang/OutOfMemoryError
    //   159	172	370	java/io/FileNotFoundException
  }

  private void init(Context paramContext)
  {
    this.context = paramContext;
    this.handler = new ak();
    crJ();
    com.tencent.mm.sdk.b.a.xxA.c(this.mip);
    com.tencent.mm.sdk.b.a.xxA.c(this.riJ);
  }

  public final void Xw(String paramString)
  {
  }

  public final void Zs(String paramString)
  {
    if (e.ct(paramString))
    {
      Intent localIntent = new Intent();
      ab.i("MicroMsg.FlipView", "edit image path:%s", new Object[] { paramString });
      localIntent.putExtra("raw_photo_path", paramString);
      localIntent.putExtra("from_scene", 293);
      localIntent.putExtra("after_photo_edit", "");
      localIntent.putExtra("Retr_Compress_Type", 0);
      localIntent.putExtra("Retr_Msg_Type", 0);
      localIntent.putExtra("Retr_FromMainTimeline", crK());
      localIntent.setClass(this.context, MMNewPhotoEditUI.class);
      this.context.startActivity(localIntent);
    }
  }

  public void bj(String paramString, boolean paramBoolean)
  {
  }

  public void bk(String paramString, boolean paramBoolean)
  {
  }

  public final void cmu()
  {
  }

  public abstract boolean crK();

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      ab.d("MicroMsg.FlipView", "onTouchEvent down");
      this.rip = paramMotionEvent.getX();
      this.riq = paramMotionEvent.getY();
      this.eRt = System.currentTimeMillis();
      if (f.O(paramMotionEvent) == 1)
        this.riv = false;
    }
    if (f.O(paramMotionEvent) > 1)
      this.riv = true;
    long l;
    if ((paramMotionEvent.getAction() == 1) && (!this.riv))
    {
      ab.d("MicroMsg.FlipView", "onTouchEvent up " + (System.currentTimeMillis() - this.eRt));
      l = bo.yz();
      ab.d("MicroMsg.FlipView", "deltTime: " + (l - this.riw));
      if (l - this.riw < 300L)
      {
        this.handler.removeCallbacks(this.riE);
        this.handler.post(new FlipView.1(this));
      }
    }
    for (boolean bool = super.dispatchTouchEvent(paramMotionEvent); ; bool = super.dispatchTouchEvent(paramMotionEvent))
    {
      return bool;
      this.riw = l;
      if ((System.currentTimeMillis() - this.eRt < 500L) && (Math.abs(paramMotionEvent.getX() - this.rip) <= 10.0D) && (Math.abs(paramMotionEvent.getY() - this.riq) <= 10.0D) && (paramMotionEvent.getY() > 110.0F) && (paramMotionEvent.getY() < this.riu - 100))
      {
        FlipView.a locala = this.riE;
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        locala.x = f1;
        locala.y = f2;
        this.handler.postDelayed(this.riE, 10L);
      }
    }
  }

  protected final void f(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    n localn = af.cnF().YT(paramString2);
    if (localn == null)
    {
      ab.e("MicroMsg.FlipView", "error!!show long click Alert snsInfo is null!!");
      return;
    }
    if (localn.field_type == 21)
    {
      if (!localn.field_userName.equals(r.Yz()))
      {
        localArrayList1.add(this.context.getString(2131303634));
        localArrayList2.add(Integer.valueOf(3));
      }
      label96: if ((this.riy == null) || (!this.riD))
        break label690;
      this.riD = false;
    }
    while (true)
    {
      this.riy.rBl = new FlipView.2(this, localArrayList1, localArrayList2);
      this.riy.zQf = new FlipView.3(this);
      this.riy.rBm = new FlipView.4(this, paramString2, paramString1, paramString3);
      this.riy.cpD();
      if ((!this.rix) || (true != paramBoolean))
        break;
      g.RQ();
      if (g.RO().eJo.acS() == 0)
        break;
      this.riz = paramString1;
      this.riA = paramString2;
      this.riB = paramString3;
      paramString2 = new np();
      paramString2.cJU.filePath = paramString1;
      com.tencent.mm.sdk.b.a.xxA.m(paramString2);
      break;
      localArrayList1.add(this.context.getString(2131303749));
      localArrayList2.add(Integer.valueOf(1));
      if (com.tencent.mm.bp.d.afj("favorite"))
      {
        localArrayList1.add(this.context.getString(2131301955));
        localArrayList2.add(Integer.valueOf(2));
      }
      if ((localn.field_type == 15) || (localn.field_type == 5))
      {
        localArrayList1.add(this.context.getString(2131302712));
        localArrayList2.add(Integer.valueOf(0));
        label363: dq localdq = new dq();
        localdq.cxc.cwT = paramString2;
        com.tencent.mm.sdk.b.a.xxA.m(localdq);
        if (localdq.cxd.cwB)
        {
          localArrayList1.add(this.context.getString(2131296995));
          localArrayList2.add(Integer.valueOf(5));
        }
        if ((!v.Zl(paramString2)) && (localn.field_type == 1))
        {
          localArrayList1.add(this.context.getString(2131298118));
          localArrayList2.add(Integer.valueOf(6));
        }
        if (this.riC == null)
          break label96;
        if (!com.tencent.mm.plugin.scanner.a.BR(this.cvn))
          break label603;
        localArrayList1.add(this.context.getString(2131303755));
      }
      while (true)
      {
        localArrayList2.add(Integer.valueOf(4));
        break;
        if (localn.field_type == 1)
        {
          localArrayList1.add(this.context.getString(2131302709));
          localArrayList2.add(Integer.valueOf(0));
          break label363;
        }
        localArrayList1.add(this.context.getString(2131303753));
        localArrayList2.add(Integer.valueOf(0));
        break label363;
        label603: if (com.tencent.mm.plugin.scanner.a.ba(this.cvn, this.riC))
          localArrayList1.add(this.context.getString(2131303756));
        else if (com.tencent.mm.plugin.scanner.a.BQ(this.cvn))
          localArrayList1.add(this.context.getString(2131303754));
        else
          localArrayList1.add(this.context.getString(2131303755));
      }
      label690: this.riy = new com.tencent.mm.ui.widget.a.d(this.context, 1, false);
    }
  }

  public bau getCntMedia()
  {
    return null;
  }

  public abstract Gallery getGallery();

  public abstract int getPosition();

  public abstract long getSnsId();

  protected final void onDestroy()
  {
    com.tencent.mm.sdk.b.a.xxA.d(this.mip);
    com.tencent.mm.sdk.b.a.xxA.d(this.riJ);
  }

  protected void onPause()
  {
    this.riz = null;
    this.riA = "";
    this.riB = null;
    if (this.riC != null)
    {
      am localam = new am();
      localam.ctA.activity = ((Activity)this.context);
      localam.ctA.ctB = this.riC;
      com.tencent.mm.sdk.b.a.xxA.m(localam);
      this.riC = null;
      this.cvo = 0;
      this.cvn = 0;
    }
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (!f.dzs());
    return false;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }

  public void setNeedScanImage(boolean paramBoolean)
  {
    this.rix = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.FlipView
 * JD-Core Version:    0.6.2
 */