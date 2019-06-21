package com.tencent.mm.plugin.voip.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.os.Build.VERSION;
import android.view.SurfaceHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.c;
import com.tencent.mm.compatible.e.d.a.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.compatible.e.z;
import com.tencent.mm.g.a.mi;
import com.tencent.mm.plugin.video.ObservableSurfaceView;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class a
  implements com.tencent.mm.plugin.video.a, com.tencent.mm.plugin.video.b
{
  private static final Pattern qhR;
  private static int sZl;
  private static int sZm;
  protected int mHeight;
  protected int mWidth;
  protected t mdw;
  protected boolean mdx;
  protected boolean sZA;
  protected ObservableSurfaceView sZB;
  protected ObservableTextureView sZC;
  protected g sZD;
  protected boolean sZE;
  protected boolean sZF;
  protected byte[] sZG;
  protected int[] sZH;
  protected List<byte[]> sZI;
  protected boolean sZJ;
  protected int sZK;
  protected int sZL;
  protected int sZM;
  protected int sZN;
  protected boolean sZO;
  Camera.PreviewCallback sZP;
  protected boolean sZn;
  protected boolean sZo;
  protected boolean sZp;
  protected boolean sZq;
  protected boolean sZr;
  protected long sZs;
  protected long sZt;
  protected int sZu;
  protected Camera.Parameters sZv;
  protected z sZw;
  protected int sZx;
  protected boolean sZy;
  protected boolean sZz;

  static
  {
    AppMethodBeat.i(5041);
    qhR = Pattern.compile(",");
    sZl = 20;
    sZm = 70;
    AppMethodBeat.o(5041);
  }

  public a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5022);
    this.sZn = false;
    this.sZo = false;
    this.sZp = false;
    this.sZq = false;
    this.sZr = false;
    this.sZs = 0L;
    this.sZt = 30000L;
    this.sZu = 0;
    this.sZy = false;
    this.sZz = false;
    this.sZA = false;
    this.sZB = null;
    this.sZE = false;
    this.sZF = false;
    this.sZG = null;
    this.sZH = null;
    this.mWidth = 320;
    this.mHeight = 240;
    this.sZJ = true;
    this.sZL = 0;
    this.sZM = 0;
    this.sZN = 0;
    this.mdx = false;
    this.sZO = false;
    this.sZP = new a.2(this);
    this.mWidth = paramInt1;
    this.mHeight = paramInt2;
    j.fi(ah.getContext().getApplicationContext());
    ab.d("MicroMsg.Voip.CaptureRender", "width: %d, height: %d", new Object[] { Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight) });
    AppMethodBeat.o(5022);
  }

  private static Point a(CharSequence paramCharSequence, Point paramPoint)
  {
    AppMethodBeat.i(5033);
    int i = 2147483647;
    String[] arrayOfString = qhR.split(paramCharSequence);
    int j = arrayOfString.length;
    int k = 0;
    int m = 0;
    String str;
    int i1;
    int i2;
    int i3;
    int i4;
    for (int n = 0; ; n = i2)
    {
      if (k >= j)
        break label285;
      str = arrayOfString[k].trim();
      i1 = str.indexOf('x');
      if (i1 >= 0)
        break;
      ab.w("MicroMsg.Voip.CaptureRender", "Bad preview-size: ".concat(String.valueOf(str)));
      i2 = n;
      i3 = m;
      i4 = i;
      k++;
      i = i4;
      m = i3;
    }
    while (true)
    {
      int i5;
      int i6;
      try
      {
        i5 = bo.getInt(str.substring(0, i1), 0);
        i1 = bo.getInt(str.substring(i1 + 1), 0);
        i6 = Math.abs(i5 - paramPoint.x) + Math.abs(i1 - paramPoint.y);
        if (i6 != 0)
          break label224;
        n = i5;
        if ((n <= 0) || (i1 <= 0))
          break label274;
        paramCharSequence = new Point(n, i1);
        AppMethodBeat.o(5033);
        return paramCharSequence;
      }
      catch (NumberFormatException paramCharSequence)
      {
        ab.w("MicroMsg.Voip.CaptureRender", "Bad preview-size: ".concat(String.valueOf(str)));
        i4 = i;
        i3 = m;
        i2 = n;
      }
      break;
      label224: i4 = i;
      i3 = m;
      i2 = n;
      if (i6 >= i)
        break;
      i4 = i;
      i3 = m;
      i2 = n;
      if (i5 == i1)
        break;
      i4 = i6;
      i3 = i1;
      i2 = i5;
      break;
      label274: paramCharSequence = null;
      AppMethodBeat.o(5033);
      continue;
      label285: i1 = m;
    }
  }

  private static boolean a(t paramt, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(5031);
    if (paramt == null)
      AppMethodBeat.o(5031);
    while (true)
    {
      return bool;
      try
      {
        Camera.Parameters localParameters = paramt.getParameters();
        if ((paramInt1 > 0) && (paramInt2 > 0))
          localParameters.setPreviewSize(paramInt1, paramInt2);
        paramt.setParameters(localParameters);
        bool = true;
        AppMethodBeat.o(5031);
      }
      catch (Exception paramt)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(159L, 0L, 1L, false);
        ab.e("MicroMsg.Voip.CaptureRender", "TryPreviewSize fail:" + paramt.toString());
        AppMethodBeat.o(5031);
      }
    }
  }

  private boolean c(t paramt, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(5032);
    if (paramt == null)
    {
      AppMethodBeat.o(5032);
      paramBoolean = bool;
    }
    Camera.Parameters localParameters;
    List localList;
    while (true)
    {
      return paramBoolean;
      try
      {
        ab.i("MicroMsg.Voip.CaptureRender", "trySetAutoFocus, isFrontCamera:%s", new Object[] { Boolean.valueOf(paramBoolean) });
        localParameters = paramt.getParameters();
        localList = localParameters.getSupportedFocusModes();
        if (localList == null)
          break label240;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("supported focus modes size = ");
        ab.d("MicroMsg.Voip.CaptureRender", localList.size());
        localObject = localList.iterator();
        while (((Iterator)localObject).hasNext())
          ab.d("MicroMsg.Voip.CaptureRender", "supported focus modes : ".concat(String.valueOf((String)((Iterator)localObject).next())));
      }
      catch (Exception paramt)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(159L, 0L, 1L, false);
        ab.e("MicroMsg.Voip.CaptureRender", "TrySetAutoFocus fail:" + paramt.toString());
        AppMethodBeat.o(5032);
        paramBoolean = bool;
      }
    }
    if ((q.etc.ery == 0) && (paramBoolean))
      if (localList.contains("auto"))
      {
        ab.d("MicroMsg.Voip.CaptureRender", "camera support auto focus");
        localParameters.setFocusMode("auto");
        this.sZz = false;
      }
    while (true)
    {
      paramt.setParameters(localParameters);
      label240: AppMethodBeat.o(5032);
      paramBoolean = true;
      break;
      if (localList.contains("continuous-video"))
      {
        ab.d("MicroMsg.Voip.CaptureRender", "camera support continuous video focus");
        localParameters.setFocusMode("continuous-video");
        this.sZz = true;
        continue;
        if ((q.etc.ery == 1) || (!paramBoolean))
          if (localList.contains("continuous-video"))
          {
            ab.d("MicroMsg.Voip.CaptureRender", "camera support continuous video focus");
            localParameters.setFocusMode("continuous-video");
            this.sZz = true;
          }
          else if (localList.contains("auto"))
          {
            ab.d("MicroMsg.Voip.CaptureRender", "camera support auto focus");
            localParameters.setFocusMode("auto");
            this.sZz = false;
          }
      }
    }
  }

  private void cLA()
  {
    AppMethodBeat.i(5028);
    try
    {
      if ((this.mdw != null) && (this.sZy))
        if ((this.sZw != null) && (this.sZw.height > 0) && (this.sZw.width > 0))
        {
          int i = this.sZw.height * this.sZw.width * 3 / 2;
          if (this.sZI == null)
          {
            ArrayList localArrayList = new java/util/ArrayList;
            localArrayList.<init>(3);
            this.sZI = localArrayList;
            for (j = 0; j < 3; j++)
              this.sZI.add(new byte[i]);
          }
          for (int j = 0; j < this.sZI.size(); j++)
            if (this.mdw != null)
              this.mdw.addCallbackBuffer((byte[])this.sZI.get(j));
          this.mdw.setPreviewCallbackWithBuffer(this.sZP);
          AppMethodBeat.o(5028);
        }
      while (true)
      {
        return;
        this.mdw.setPreviewCallback(this.sZP);
        AppMethodBeat.o(5028);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Voip.CaptureRender", localException, "setPreviewCallback error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(5028);
      }
    }
  }

  private int g(t paramt)
  {
    AppMethodBeat.i(5039);
    int i;
    if (paramt == null)
    {
      AppMethodBeat.o(5039);
      i = 0;
    }
    while (true)
    {
      return i;
      try
      {
        localObject = paramt.getParameters().getSupportedPreviewSizes();
        if ((localObject != null) && (((List)localObject).size() != 0))
        {
          localObject = ((List)localObject).iterator();
          i = 0;
        }
      }
      catch (Exception paramt)
      {
        while (true)
        {
          try
          {
            Object localObject;
            if (((Iterator)localObject).hasNext())
            {
              Camera.Size localSize = (Camera.Size)((Iterator)localObject).next();
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>("support Size:");
              ab.d("MicroMsg.Voip.CaptureRender", localSize.width + "," + localSize.height);
              if (i == 0)
              {
                this.sZL = localSize.width;
                this.sZM = localSize.height;
              }
              i++;
              continue;
            }
            try
            {
              paramt = paramt.getParameters().getSupportedPreviewFormats();
              if ((paramt == null) || (paramt.size() == 0))
                continue;
              paramt = paramt.iterator();
              if (!paramt.hasNext())
                continue;
              ab.i("MicroMsg.Voip.CaptureRender", "support Format:".concat(String.valueOf(((Integer)paramt.next()).intValue())));
              continue;
            }
            catch (Exception paramt)
            {
            }
            ab.printErrStackTrace("MicroMsg.Voip.CaptureRender", paramt, "", new Object[0]);
            AppMethodBeat.o(5039);
            break;
            continue;
            paramt = paramt;
            i = 0;
            continue;
          }
          catch (Exception paramt)
          {
            continue;
          }
          i = 0;
        }
      }
    }
  }

  private static void h(t paramt)
  {
    AppMethodBeat.i(5040);
    try
    {
      localList = paramt.getParameters().getSupportedPreviewFrameRates();
      paramt = "supportFps:";
      localt = paramt;
      if (localList != null)
        for (int i = 0; ; i++)
        {
          localt = paramt;
          if (i >= localList.size())
            break;
          int j = ((Integer)localList.get(i)).intValue();
          paramt = paramt + j + ",";
        }
    }
    catch (Exception paramt)
    {
      t localt;
      while (true)
      {
        ab.d("MicroMsg.Voip.CaptureRender", "getSupportedPreviewFrameRates:error:" + paramt.toString());
        List localList = null;
      }
      ab.i("MicroMsg.Voip.CaptureRender", localt);
      AppMethodBeat.o(5040);
    }
  }

  // ERROR //
  private int i(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: sipush 5034
    //   3: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 165
    //   8: ldc_w 443
    //   11: iload_1
    //   12: invokestatic 446	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   15: invokevirtual 207	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   18: invokestatic 428	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: aload_0
    //   22: iconst_0
    //   23: putfield 111	com/tencent/mm/plugin/voip/video/a:sZz	Z
    //   26: iconst_1
    //   27: istore 4
    //   29: iload 4
    //   31: istore 5
    //   33: aload_0
    //   34: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   37: ifnull +42 -> 79
    //   40: aload_0
    //   41: getfield 91	com/tencent/mm/plugin/voip/video/a:sZn	Z
    //   44: iload_1
    //   45: if_icmpeq +70 -> 115
    //   48: aload_0
    //   49: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   52: aconst_null
    //   53: invokevirtual 396	com/tencent/mm/compatible/e/t:setPreviewCallback	(Landroid/hardware/Camera$PreviewCallback;)V
    //   56: aload_0
    //   57: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   60: invokevirtual 449	com/tencent/mm/compatible/e/t:stopPreview	()V
    //   63: aload_0
    //   64: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   67: invokevirtual 452	com/tencent/mm/compatible/e/t:release	()V
    //   70: aload_0
    //   71: aconst_null
    //   72: putfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   75: iload 4
    //   77: istore 5
    //   79: iload 5
    //   81: ifeq +48 -> 129
    //   84: aload_0
    //   85: aload_0
    //   86: iload_1
    //   87: invokespecial 456	com/tencent/mm/plugin/voip/video/a:mC	(Z)Lcom/tencent/mm/compatible/e/t;
    //   90: putfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   93: aload_0
    //   94: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   97: ifnonnull +27 -> 124
    //   100: aload_0
    //   101: iconst_0
    //   102: putfield 109	com/tencent/mm/plugin/voip/video/a:sZy	Z
    //   105: iconst_m1
    //   106: istore_2
    //   107: sipush 5034
    //   110: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   113: iload_2
    //   114: ireturn
    //   115: aload_0
    //   116: getfield 139	com/tencent/mm/plugin/voip/video/a:sZO	Z
    //   119: istore 5
    //   121: goto -42 -> 79
    //   124: aload_0
    //   125: iconst_0
    //   126: putfield 139	com/tencent/mm/plugin/voip/video/a:sZO	Z
    //   129: aload_0
    //   130: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   133: ifnull +11 -> 144
    //   136: aload_0
    //   137: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   140: invokevirtual 248	com/tencent/mm/compatible/e/t:getParameters	()Landroid/hardware/Camera$Parameters;
    //   143: pop
    //   144: aload_0
    //   145: iconst_1
    //   146: putfield 109	com/tencent/mm/plugin/voip/video/a:sZy	Z
    //   149: aload_0
    //   150: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   153: astore 6
    //   155: getstatic 460	com/tencent/mm/plugin/voip/video/j:tbr	Lcom/tencent/mm/plugin/voip/video/h;
    //   158: getfield 465	com/tencent/mm/plugin/voip/video/h:taj	I
    //   161: istore 7
    //   163: aload 6
    //   165: ifnull +263 -> 428
    //   168: ldc 165
    //   170: ldc_w 467
    //   173: iconst_1
    //   174: anewarray 4	java/lang/Object
    //   177: dup
    //   178: iconst_0
    //   179: iload 7
    //   181: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   184: aastore
    //   185: invokestatic 297	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   188: aload 6
    //   190: invokevirtual 248	com/tencent/mm/compatible/e/t:getParameters	()Landroid/hardware/Camera$Parameters;
    //   193: astore 8
    //   195: ldc_w 469
    //   198: invokestatic 475	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   201: checkcast 469	com/tencent/mm/plugin/zero/b/a
    //   204: invokeinterface 479 1 0
    //   209: ldc_w 481
    //   212: bipush 26
    //   214: invokevirtual 484	com/tencent/mm/m/e:getInt	(Ljava/lang/String;I)I
    //   217: istore 9
    //   219: ldc 165
    //   221: ldc_w 486
    //   224: iconst_1
    //   225: anewarray 4	java/lang/Object
    //   228: dup
    //   229: iconst_0
    //   230: iload 9
    //   232: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   235: aastore
    //   236: invokestatic 297	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   239: invokestatic 491	com/tencent/mm/compatible/util/l:IN	()Z
    //   242: ifne +11 -> 253
    //   245: iload 9
    //   247: invokestatic 497	com/tencent/mm/compatible/util/d:iW	(I)Z
    //   250: ifeq +1147 -> 1397
    //   253: ldc 184
    //   255: istore 10
    //   257: iconst_0
    //   258: istore 5
    //   260: iconst_m1
    //   261: istore 11
    //   263: iconst_0
    //   264: istore 12
    //   266: getstatic 338	com/tencent/mm/compatible/e/q:etc	Lcom/tencent/mm/compatible/e/c;
    //   269: ifnull +27 -> 296
    //   272: getstatic 338	com/tencent/mm/compatible/e/q:etc	Lcom/tencent/mm/compatible/e/c;
    //   275: getfield 500	com/tencent/mm/compatible/e/c:erA	I
    //   278: sipush 1000
    //   281: imul
    //   282: istore 11
    //   284: getstatic 338	com/tencent/mm/compatible/e/q:etc	Lcom/tencent/mm/compatible/e/c;
    //   287: getfield 503	com/tencent/mm/compatible/e/c:erB	I
    //   290: sipush 1000
    //   293: imul
    //   294: istore 12
    //   296: iload 11
    //   298: ifle +730 -> 1028
    //   301: iload 12
    //   303: ifle +725 -> 1028
    //   306: iload 12
    //   308: iload 11
    //   310: if_icmplt +718 -> 1028
    //   313: iconst_1
    //   314: istore 4
    //   316: ldc 165
    //   318: ldc_w 505
    //   321: iconst_4
    //   322: anewarray 4	java/lang/Object
    //   325: dup
    //   326: iconst_0
    //   327: iload 11
    //   329: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   332: aastore
    //   333: dup
    //   334: iconst_1
    //   335: iload 12
    //   337: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   340: aastore
    //   341: dup
    //   342: iconst_2
    //   343: iload 7
    //   345: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   348: aastore
    //   349: dup
    //   350: iconst_3
    //   351: iload 4
    //   353: invokestatic 295	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   356: aastore
    //   357: invokestatic 297	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   360: iload 11
    //   362: ldc 184
    //   364: if_icmpeq +15 -> 379
    //   367: iload 12
    //   369: ldc 184
    //   371: if_icmpeq +8 -> 379
    //   374: iload 4
    //   376: ifne +963 -> 1339
    //   379: iconst_1
    //   380: istore 9
    //   382: iload 9
    //   384: ifeq +44 -> 428
    //   387: ldc 165
    //   389: ldc_w 507
    //   392: iconst_1
    //   393: anewarray 4	java/lang/Object
    //   396: dup
    //   397: iconst_0
    //   398: iload 7
    //   400: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   403: aastore
    //   404: invokestatic 297	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   407: aload 6
    //   409: invokevirtual 248	com/tencent/mm/compatible/e/t:getParameters	()Landroid/hardware/Camera$Parameters;
    //   412: astore 8
    //   414: aload 8
    //   416: iload 7
    //   418: invokevirtual 510	android/hardware/Camera$Parameters:setPreviewFrameRate	(I)V
    //   421: aload 6
    //   423: aload 8
    //   425: invokevirtual 257	com/tencent/mm/compatible/e/t:setParameters	(Landroid/hardware/Camera$Parameters;)V
    //   428: ldc 165
    //   430: new 270	java/lang/StringBuilder
    //   433: dup
    //   434: ldc_w 512
    //   437: invokespecial 275	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   440: iload_2
    //   441: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   444: ldc 69
    //   446: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   449: iload_3
    //   450: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   453: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   456: invokestatic 428	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   459: iload_1
    //   460: ifeq +1008 -> 1468
    //   463: getstatic 460	com/tencent/mm/plugin/voip/video/j:tbr	Lcom/tencent/mm/plugin/voip/video/h;
    //   466: getfield 516	com/tencent/mm/plugin/voip/video/h:tao	Landroid/graphics/Point;
    //   469: astore 6
    //   471: aload 6
    //   473: ifnull +1006 -> 1479
    //   476: iconst_1
    //   477: istore 9
    //   479: aconst_null
    //   480: astore 13
    //   482: aload 6
    //   484: ifnull +1589 -> 2073
    //   487: new 365	com/tencent/mm/compatible/e/z
    //   490: dup
    //   491: aload 6
    //   493: getfield 229	android/graphics/Point:x	I
    //   496: aload 6
    //   498: getfield 237	android/graphics/Point:y	I
    //   501: invokespecial 517	com/tencent/mm/compatible/e/z:<init>	(II)V
    //   504: astore 8
    //   506: ldc 165
    //   508: new 270	java/lang/StringBuilder
    //   511: dup
    //   512: ldc_w 519
    //   515: invokespecial 275	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   518: aload 8
    //   520: getfield 371	com/tencent/mm/compatible/e/z:width	I
    //   523: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   526: ldc 69
    //   528: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   531: aload 8
    //   533: getfield 368	com/tencent/mm/compatible/e/z:height	I
    //   536: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   539: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   542: invokestatic 428	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   545: aload_0
    //   546: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   549: invokevirtual 248	com/tencent/mm/compatible/e/t:getParameters	()Landroid/hardware/Camera$Parameters;
    //   552: astore 6
    //   554: new 226	android/graphics/Point
    //   557: astore 14
    //   559: aload 14
    //   561: iload_2
    //   562: iload_3
    //   563: invokespecial 239	android/graphics/Point:<init>	(II)V
    //   566: aload 6
    //   568: ldc_w 521
    //   571: invokevirtual 523	android/hardware/Camera$Parameters:get	(Ljava/lang/String;)Ljava/lang/String;
    //   574: astore 15
    //   576: aload 15
    //   578: ifnonnull +1492 -> 2070
    //   581: aload 6
    //   583: ldc_w 525
    //   586: invokevirtual 523	android/hardware/Camera$Parameters:get	(Ljava/lang/String;)Ljava/lang/String;
    //   589: astore 15
    //   591: aconst_null
    //   592: astore 6
    //   594: aload 15
    //   596: ifnull +28 -> 624
    //   599: ldc 165
    //   601: ldc_w 527
    //   604: aload 15
    //   606: invokestatic 203	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   609: invokevirtual 207	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   612: invokestatic 428	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   615: aload 15
    //   617: aload 14
    //   619: invokestatic 529	com/tencent/mm/plugin/voip/video/a:a	(Ljava/lang/CharSequence;Landroid/graphics/Point;)Landroid/graphics/Point;
    //   622: astore 6
    //   624: aload 6
    //   626: astore 15
    //   628: aload 6
    //   630: ifnonnull +31 -> 661
    //   633: new 226	android/graphics/Point
    //   636: astore 15
    //   638: aload 15
    //   640: aload 14
    //   642: getfield 229	android/graphics/Point:x	I
    //   645: iconst_3
    //   646: ishr
    //   647: iconst_3
    //   648: ishl
    //   649: aload 14
    //   651: getfield 237	android/graphics/Point:y	I
    //   654: iconst_3
    //   655: ishr
    //   656: iconst_3
    //   657: ishl
    //   658: invokespecial 239	android/graphics/Point:<init>	(II)V
    //   661: new 365	com/tencent/mm/compatible/e/z
    //   664: astore 6
    //   666: aload 6
    //   668: aload 15
    //   670: getfield 229	android/graphics/Point:x	I
    //   673: aload 15
    //   675: getfield 237	android/graphics/Point:y	I
    //   678: invokespecial 517	com/tencent/mm/compatible/e/z:<init>	(II)V
    //   681: new 270	java/lang/StringBuilder
    //   684: astore 15
    //   686: aload 15
    //   688: ldc_w 531
    //   691: invokespecial 275	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   694: ldc 165
    //   696: aload 15
    //   698: aload 6
    //   700: getfield 371	com/tencent/mm/compatible/e/z:width	I
    //   703: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   706: ldc 69
    //   708: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   711: aload 6
    //   713: getfield 368	com/tencent/mm/compatible/e/z:height	I
    //   716: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   719: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   722: invokestatic 428	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   725: iload 9
    //   727: ifeq +787 -> 1514
    //   730: aload_0
    //   731: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   734: aload 8
    //   736: getfield 371	com/tencent/mm/compatible/e/z:width	I
    //   739: aload 8
    //   741: getfield 368	com/tencent/mm/compatible/e/z:height	I
    //   744: invokestatic 533	com/tencent/mm/plugin/voip/video/a:a	(Lcom/tencent/mm/compatible/e/t;II)Z
    //   747: istore_1
    //   748: ldc 165
    //   750: new 270	java/lang/StringBuilder
    //   753: dup
    //   754: ldc_w 535
    //   757: invokespecial 275	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   760: aload 8
    //   762: getfield 371	com/tencent/mm/compatible/e/z:width	I
    //   765: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   768: ldc_w 537
    //   771: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   774: aload 8
    //   776: getfield 368	com/tencent/mm/compatible/e/z:height	I
    //   779: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   782: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   785: invokestatic 428	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   788: iload_1
    //   789: ifne +849 -> 1638
    //   792: aload 6
    //   794: ifnull +844 -> 1638
    //   797: ldc 165
    //   799: new 270	java/lang/StringBuilder
    //   802: dup
    //   803: ldc_w 539
    //   806: invokespecial 275	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   809: aload 6
    //   811: getfield 371	com/tencent/mm/compatible/e/z:width	I
    //   814: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   817: ldc_w 537
    //   820: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   823: aload 6
    //   825: getfield 368	com/tencent/mm/compatible/e/z:height	I
    //   828: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   831: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   834: invokestatic 286	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   837: aload_0
    //   838: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   841: aload 6
    //   843: getfield 371	com/tencent/mm/compatible/e/z:width	I
    //   846: aload 6
    //   848: getfield 368	com/tencent/mm/compatible/e/z:height	I
    //   851: invokestatic 533	com/tencent/mm/plugin/voip/video/a:a	(Lcom/tencent/mm/compatible/e/t;II)Z
    //   854: ifne +784 -> 1638
    //   857: ldc 165
    //   859: new 270	java/lang/StringBuilder
    //   862: dup
    //   863: ldc_w 541
    //   866: invokespecial 275	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   869: aload 6
    //   871: getfield 371	com/tencent/mm/compatible/e/z:width	I
    //   874: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   877: ldc_w 537
    //   880: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   883: aload 6
    //   885: getfield 368	com/tencent/mm/compatible/e/z:height	I
    //   888: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   891: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   894: invokestatic 286	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   897: iconst_m1
    //   898: istore_2
    //   899: sipush 5034
    //   902: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   905: goto -792 -> 113
    //   908: astore 6
    //   910: getstatic 263	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   913: ldc2_w 264
    //   916: lconst_0
    //   917: lconst_1
    //   918: iconst_0
    //   919: invokevirtual 268	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   922: ldc 165
    //   924: ldc_w 543
    //   927: iconst_1
    //   928: anewarray 4	java/lang/Object
    //   931: dup
    //   932: iconst_0
    //   933: aload 6
    //   935: invokevirtual 401	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   938: aastore
    //   939: invokestatic 545	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   942: aload_0
    //   943: getfield 547	com/tencent/mm/plugin/voip/video/a:sZD	Lcom/tencent/mm/plugin/voip/video/g;
    //   946: ifnull +44 -> 990
    //   949: aload_0
    //   950: getfield 547	com/tencent/mm/plugin/voip/video/a:sZD	Lcom/tencent/mm/plugin/voip/video/g;
    //   953: invokeinterface 552 1 0
    //   958: aload_0
    //   959: iconst_1
    //   960: putfield 139	com/tencent/mm/plugin/voip/video/a:sZO	Z
    //   963: aload_0
    //   964: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   967: aconst_null
    //   968: invokevirtual 396	com/tencent/mm/compatible/e/t:setPreviewCallback	(Landroid/hardware/Camera$PreviewCallback;)V
    //   971: aload_0
    //   972: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   975: invokevirtual 449	com/tencent/mm/compatible/e/t:stopPreview	()V
    //   978: aload_0
    //   979: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   982: invokevirtual 452	com/tencent/mm/compatible/e/t:release	()V
    //   985: aload_0
    //   986: aconst_null
    //   987: putfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   990: iconst_m1
    //   991: istore_2
    //   992: sipush 5034
    //   995: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   998: goto -885 -> 113
    //   1001: astore 8
    //   1003: ldc 165
    //   1005: aload 8
    //   1007: ldc_w 554
    //   1010: iconst_1
    //   1011: anewarray 4	java/lang/Object
    //   1014: dup
    //   1015: iconst_0
    //   1016: aload 6
    //   1018: invokevirtual 401	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1021: aastore
    //   1022: invokestatic 405	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1025: goto -35 -> 990
    //   1028: iload 11
    //   1030: ifne +24 -> 1054
    //   1033: iload 12
    //   1035: ifne +19 -> 1054
    //   1038: iconst_0
    //   1039: istore 4
    //   1041: ldc_w 555
    //   1044: istore 12
    //   1046: ldc_w 555
    //   1049: istore 11
    //   1051: goto -735 -> 316
    //   1054: aload 8
    //   1056: invokevirtual 558	android/hardware/Camera$Parameters:getSupportedPreviewFpsRange	()Ljava/util/List;
    //   1059: astore 15
    //   1061: aload 15
    //   1063: ifnull +13 -> 1076
    //   1066: aload 15
    //   1068: invokeinterface 309 1 0
    //   1073: ifne +9 -> 1082
    //   1076: iconst_1
    //   1077: istore 9
    //   1079: goto -697 -> 382
    //   1082: aload 15
    //   1084: invokeinterface 309 1 0
    //   1089: istore 16
    //   1091: iconst_0
    //   1092: istore 17
    //   1094: ldc_w 555
    //   1097: istore 18
    //   1099: ldc_w 555
    //   1102: istore 9
    //   1104: iload 5
    //   1106: istore 4
    //   1108: iload 18
    //   1110: istore 12
    //   1112: iload 9
    //   1114: istore 11
    //   1116: iload 17
    //   1118: iload 16
    //   1120: if_icmpge -804 -> 316
    //   1123: aload 15
    //   1125: iload 17
    //   1127: invokeinterface 384 2 0
    //   1132: checkcast 559	[I
    //   1135: astore 13
    //   1137: aload 13
    //   1139: ifnull +940 -> 2079
    //   1142: aload 13
    //   1144: arraylength
    //   1145: iconst_1
    //   1146: if_icmple +933 -> 2079
    //   1149: aload 13
    //   1151: iconst_0
    //   1152: iaload
    //   1153: istore 19
    //   1155: aload 13
    //   1157: iconst_1
    //   1158: iaload
    //   1159: istore 11
    //   1161: ldc 165
    //   1163: ldc_w 561
    //   1166: iconst_3
    //   1167: anewarray 4	java/lang/Object
    //   1170: dup
    //   1171: iconst_0
    //   1172: iload 17
    //   1174: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1177: aastore
    //   1178: dup
    //   1179: iconst_1
    //   1180: iload 19
    //   1182: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1185: aastore
    //   1186: dup
    //   1187: iconst_2
    //   1188: iload 11
    //   1190: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1193: aastore
    //   1194: invokestatic 297	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1197: iload 19
    //   1199: iflt +880 -> 2079
    //   1202: iload 11
    //   1204: iload 19
    //   1206: if_icmplt +873 -> 2079
    //   1209: iload 11
    //   1211: sipush 1000
    //   1214: idiv
    //   1215: istore 20
    //   1217: iload 19
    //   1219: sipush 1000
    //   1222: idiv
    //   1223: istore 21
    //   1225: iload 7
    //   1227: iconst_5
    //   1228: iadd
    //   1229: bipush 30
    //   1231: invokestatic 565	java/lang/Math:min	(II)I
    //   1234: istore 12
    //   1236: iload 7
    //   1238: iconst_5
    //   1239: isub
    //   1240: iconst_5
    //   1241: invokestatic 568	java/lang/Math:max	(II)I
    //   1244: istore 22
    //   1246: iload 20
    //   1248: iload 22
    //   1250: if_icmplt +83 -> 1333
    //   1253: iload 20
    //   1255: iload 12
    //   1257: if_icmpgt +76 -> 1333
    //   1260: iload 21
    //   1262: iload 22
    //   1264: if_icmplt +69 -> 1333
    //   1267: iload 21
    //   1269: iload 12
    //   1271: if_icmpgt +62 -> 1333
    //   1274: iconst_1
    //   1275: istore 12
    //   1277: iload 12
    //   1279: ifeq +800 -> 2079
    //   1282: iload 7
    //   1284: iload 21
    //   1286: isub
    //   1287: invokestatic 234	java/lang/Math:abs	(I)I
    //   1290: istore 12
    //   1292: iload 20
    //   1294: iload 7
    //   1296: isub
    //   1297: invokestatic 234	java/lang/Math:abs	(I)I
    //   1300: iload 12
    //   1302: iadd
    //   1303: istore 12
    //   1305: iload 12
    //   1307: iload 10
    //   1309: if_icmpge +770 -> 2079
    //   1312: iconst_1
    //   1313: istore 5
    //   1315: iload 19
    //   1317: istore 9
    //   1319: iload 11
    //   1321: istore 18
    //   1323: iload 12
    //   1325: istore 10
    //   1327: iinc 17 1
    //   1330: goto -226 -> 1104
    //   1333: iconst_0
    //   1334: istore 12
    //   1336: goto -59 -> 1277
    //   1339: ldc 165
    //   1341: ldc_w 570
    //   1344: iconst_3
    //   1345: anewarray 4	java/lang/Object
    //   1348: dup
    //   1349: iconst_0
    //   1350: iload 11
    //   1352: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1355: aastore
    //   1356: dup
    //   1357: iconst_1
    //   1358: iload 12
    //   1360: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1363: aastore
    //   1364: dup
    //   1365: iconst_2
    //   1366: iload 7
    //   1368: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1371: aastore
    //   1372: invokestatic 297	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1375: aload 8
    //   1377: iload 11
    //   1379: iload 12
    //   1381: invokevirtual 573	android/hardware/Camera$Parameters:setPreviewFpsRange	(II)V
    //   1384: aload 6
    //   1386: aload 8
    //   1388: invokevirtual 257	com/tencent/mm/compatible/e/t:setParameters	(Landroid/hardware/Camera$Parameters;)V
    //   1391: iconst_0
    //   1392: istore 9
    //   1394: goto -1012 -> 382
    //   1397: iconst_1
    //   1398: istore 9
    //   1400: goto -1018 -> 382
    //   1403: astore 8
    //   1405: ldc 165
    //   1407: new 270	java/lang/StringBuilder
    //   1410: dup
    //   1411: ldc_w 575
    //   1414: invokespecial 275	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1417: aload 8
    //   1419: invokevirtual 278	java/lang/Exception:toString	()Ljava/lang/String;
    //   1422: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1425: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1428: invokestatic 286	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1431: iconst_1
    //   1432: istore 9
    //   1434: goto -1052 -> 382
    //   1437: astore 6
    //   1439: ldc 165
    //   1441: new 270	java/lang/StringBuilder
    //   1444: dup
    //   1445: ldc_w 577
    //   1448: invokespecial 275	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1451: aload 6
    //   1453: invokevirtual 278	java/lang/Exception:toString	()Ljava/lang/String;
    //   1456: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1459: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1462: invokestatic 286	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1465: goto -1037 -> 428
    //   1468: getstatic 460	com/tencent/mm/plugin/voip/video/j:tbr	Lcom/tencent/mm/plugin/voip/video/h;
    //   1471: getfield 580	com/tencent/mm/plugin/voip/video/h:tap	Landroid/graphics/Point;
    //   1474: astore 6
    //   1476: goto -1005 -> 471
    //   1479: iconst_0
    //   1480: istore 9
    //   1482: goto -1003 -> 479
    //   1485: astore 15
    //   1487: aload 13
    //   1489: astore 6
    //   1491: ldc 165
    //   1493: ldc_w 582
    //   1496: iconst_1
    //   1497: anewarray 4	java/lang/Object
    //   1500: dup
    //   1501: iconst_0
    //   1502: aload 15
    //   1504: invokevirtual 401	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1507: aastore
    //   1508: invokestatic 545	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1511: goto -786 -> 725
    //   1514: ldc 165
    //   1516: ldc_w 584
    //   1519: invokestatic 428	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1522: aload 6
    //   1524: ifnull +114 -> 1638
    //   1527: ldc 165
    //   1529: new 270	java/lang/StringBuilder
    //   1532: dup
    //   1533: ldc_w 586
    //   1536: invokespecial 275	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1539: aload 6
    //   1541: getfield 371	com/tencent/mm/compatible/e/z:width	I
    //   1544: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1547: ldc_w 537
    //   1550: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1553: aload 6
    //   1555: getfield 368	com/tencent/mm/compatible/e/z:height	I
    //   1558: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1561: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1564: invokestatic 428	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1567: aload_0
    //   1568: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   1571: aload 6
    //   1573: getfield 371	com/tencent/mm/compatible/e/z:width	I
    //   1576: aload 6
    //   1578: getfield 368	com/tencent/mm/compatible/e/z:height	I
    //   1581: invokestatic 533	com/tencent/mm/plugin/voip/video/a:a	(Lcom/tencent/mm/compatible/e/t;II)Z
    //   1584: ifne +54 -> 1638
    //   1587: ldc 165
    //   1589: new 270	java/lang/StringBuilder
    //   1592: dup
    //   1593: ldc_w 588
    //   1596: invokespecial 275	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1599: aload 6
    //   1601: getfield 371	com/tencent/mm/compatible/e/z:width	I
    //   1604: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1607: ldc_w 537
    //   1610: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1613: aload 6
    //   1615: getfield 368	com/tencent/mm/compatible/e/z:height	I
    //   1618: invokevirtual 312	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1621: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1624: invokestatic 286	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1627: iconst_m1
    //   1628: istore_2
    //   1629: sipush 5034
    //   1632: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1635: goto -1522 -> 113
    //   1638: aload_0
    //   1639: aload_0
    //   1640: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   1643: aload_0
    //   1644: getfield 91	com/tencent/mm/plugin/voip/video/a:sZn	Z
    //   1647: invokespecial 590	com/tencent/mm/plugin/voip/video/a:c	(Lcom/tencent/mm/compatible/e/t;Z)Z
    //   1650: pop
    //   1651: aload_0
    //   1652: aload_0
    //   1653: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   1656: invokevirtual 248	com/tencent/mm/compatible/e/t:getParameters	()Landroid/hardware/Camera$Parameters;
    //   1659: putfield 592	com/tencent/mm/plugin/voip/video/a:sZv	Landroid/hardware/Camera$Parameters;
    //   1662: aload_0
    //   1663: getfield 592	com/tencent/mm/plugin/voip/video/a:sZv	Landroid/hardware/Camera$Parameters;
    //   1666: invokevirtual 596	android/hardware/Camera$Parameters:getPreviewSize	()Landroid/hardware/Camera$Size;
    //   1669: astore 8
    //   1671: aload 8
    //   1673: ifnull +29 -> 1702
    //   1676: new 365	com/tencent/mm/compatible/e/z
    //   1679: astore 6
    //   1681: aload 6
    //   1683: aload 8
    //   1685: getfield 415	android/hardware/Camera$Size:width	I
    //   1688: aload 8
    //   1690: getfield 416	android/hardware/Camera$Size:height	I
    //   1693: invokespecial 517	com/tencent/mm/compatible/e/z:<init>	(II)V
    //   1696: aload_0
    //   1697: aload 6
    //   1699: putfield 363	com/tencent/mm/plugin/voip/video/a:sZw	Lcom/tencent/mm/compatible/e/z;
    //   1702: aload_0
    //   1703: getfield 592	com/tencent/mm/plugin/voip/video/a:sZv	Landroid/hardware/Camera$Parameters;
    //   1706: invokevirtual 599	android/hardware/Camera$Parameters:getPreviewFrameRate	()I
    //   1709: istore_3
    //   1710: aload_0
    //   1711: getstatic 602	com/tencent/mm/plugin/voip/video/j:tbw	I
    //   1714: putfield 604	com/tencent/mm/plugin/voip/video/a:sZx	I
    //   1717: aload_0
    //   1718: getfield 604	com/tencent/mm/plugin/voip/video/a:sZx	I
    //   1721: ifgt +9 -> 1730
    //   1724: aload_0
    //   1725: bipush 7
    //   1727: putfield 604	com/tencent/mm/plugin/voip/video/a:sZx	I
    //   1730: aload_0
    //   1731: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   1734: astore 8
    //   1736: new 606	android/hardware/Camera$CameraInfo
    //   1739: astore 6
    //   1741: aload 6
    //   1743: invokespecial 607	android/hardware/Camera$CameraInfo:<init>	()V
    //   1746: aload_0
    //   1747: getfield 91	com/tencent/mm/plugin/voip/video/a:sZn	Z
    //   1750: ifeq +239 -> 1989
    //   1753: getstatic 610	com/tencent/mm/plugin/voip/video/j:tbs	I
    //   1756: istore_2
    //   1757: iload_2
    //   1758: aload 6
    //   1760: invokestatic 616	android/hardware/Camera:getCameraInfo	(ILandroid/hardware/Camera$CameraInfo;)V
    //   1763: invokestatic 152	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   1766: ldc_w 618
    //   1769: invokevirtual 622	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   1772: checkcast 624	android/view/WindowManager
    //   1775: invokeinterface 628 1 0
    //   1780: invokevirtual 633	android/view/Display:getRotation	()I
    //   1783: istore 9
    //   1785: iconst_0
    //   1786: istore_2
    //   1787: iload 9
    //   1789: tableswitch	default:+31 -> 1820, 0:+207->1996, 1:+212->2001, 2:+218->2007, 3:+225->2014
    //   1821: getfield 91	com/tencent/mm/plugin/voip/video/a:sZn	Z
    //   1824: ifeq +197 -> 2021
    //   1827: sipush 360
    //   1830: iload_2
    //   1831: aload 6
    //   1833: getfield 636	android/hardware/Camera$CameraInfo:orientation	I
    //   1836: iadd
    //   1837: sipush 360
    //   1840: irem
    //   1841: isub
    //   1842: sipush 360
    //   1845: irem
    //   1846: istore_2
    //   1847: aload 8
    //   1849: iload_2
    //   1850: invokevirtual 639	com/tencent/mm/compatible/e/t:setDisplayOrientation	(I)V
    //   1853: aload_0
    //   1854: iload_2
    //   1855: putfield 641	com/tencent/mm/plugin/voip/video/a:sZK	I
    //   1858: ldc 165
    //   1860: ldc_w 643
    //   1863: bipush 6
    //   1865: anewarray 4	java/lang/Object
    //   1868: dup
    //   1869: iconst_0
    //   1870: iload_3
    //   1871: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1874: aastore
    //   1875: dup
    //   1876: iconst_1
    //   1877: aload_0
    //   1878: getfield 363	com/tencent/mm/plugin/voip/video/a:sZw	Lcom/tencent/mm/compatible/e/z;
    //   1881: getfield 371	com/tencent/mm/compatible/e/z:width	I
    //   1884: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1887: aastore
    //   1888: dup
    //   1889: iconst_2
    //   1890: aload_0
    //   1891: getfield 363	com/tencent/mm/plugin/voip/video/a:sZw	Lcom/tencent/mm/compatible/e/z;
    //   1894: getfield 368	com/tencent/mm/compatible/e/z:height	I
    //   1897: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1900: aastore
    //   1901: dup
    //   1902: iconst_3
    //   1903: aload_0
    //   1904: getfield 604	com/tencent/mm/plugin/voip/video/a:sZx	I
    //   1907: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1910: aastore
    //   1911: dup
    //   1912: iconst_4
    //   1913: getstatic 646	com/tencent/mm/plugin/voip/video/j:tbu	I
    //   1916: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1919: aastore
    //   1920: dup
    //   1921: iconst_5
    //   1922: aload_0
    //   1923: getfield 641	com/tencent/mm/plugin/voip/video/a:sZK	I
    //   1926: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1929: aastore
    //   1930: invokestatic 297	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1933: iconst_1
    //   1934: istore_2
    //   1935: sipush 5034
    //   1938: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1941: goto -1828 -> 113
    //   1944: astore 6
    //   1946: getstatic 263	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1949: ldc2_w 264
    //   1952: lconst_0
    //   1953: lconst_1
    //   1954: iconst_0
    //   1955: invokevirtual 268	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   1958: ldc 165
    //   1960: ldc_w 648
    //   1963: iconst_1
    //   1964: anewarray 4	java/lang/Object
    //   1967: dup
    //   1968: iconst_0
    //   1969: aload 6
    //   1971: invokevirtual 401	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1974: aastore
    //   1975: invokestatic 545	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1978: iconst_m1
    //   1979: istore_2
    //   1980: sipush 5034
    //   1983: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1986: goto -1873 -> 113
    //   1989: getstatic 651	com/tencent/mm/plugin/voip/video/j:tbt	I
    //   1992: istore_2
    //   1993: goto -236 -> 1757
    //   1996: iconst_0
    //   1997: istore_2
    //   1998: goto -178 -> 1820
    //   2001: bipush 90
    //   2003: istore_2
    //   2004: goto -184 -> 1820
    //   2007: sipush 180
    //   2010: istore_2
    //   2011: goto -191 -> 1820
    //   2014: sipush 270
    //   2017: istore_2
    //   2018: goto -198 -> 1820
    //   2021: aload 6
    //   2023: getfield 636	android/hardware/Camera$CameraInfo:orientation	I
    //   2026: iload_2
    //   2027: isub
    //   2028: sipush 360
    //   2031: iadd
    //   2032: sipush 360
    //   2035: irem
    //   2036: istore_2
    //   2037: goto -190 -> 1847
    //   2040: astore 6
    //   2042: ldc 165
    //   2044: ldc_w 653
    //   2047: iconst_1
    //   2048: anewarray 4	java/lang/Object
    //   2051: dup
    //   2052: iconst_0
    //   2053: aload 6
    //   2055: invokevirtual 401	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   2058: aastore
    //   2059: invokestatic 545	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2062: goto -204 -> 1858
    //   2065: astore 15
    //   2067: goto -576 -> 1491
    //   2070: goto -1479 -> 591
    //   2073: aconst_null
    //   2074: astore 8
    //   2076: goto -1531 -> 545
    //   2079: goto -752 -> 1327
    //
    // Exception table:
    //   from	to	target	type
    //   129	144	908	java/lang/Exception
    //   949	990	1001	java/lang/Exception
    //   168	253	1403	java/lang/Exception
    //   266	296	1403	java/lang/Exception
    //   316	360	1403	java/lang/Exception
    //   1054	1061	1403	java/lang/Exception
    //   1066	1076	1403	java/lang/Exception
    //   1082	1091	1403	java/lang/Exception
    //   1123	1137	1403	java/lang/Exception
    //   1142	1149	1403	java/lang/Exception
    //   1161	1197	1403	java/lang/Exception
    //   1209	1246	1403	java/lang/Exception
    //   1282	1305	1403	java/lang/Exception
    //   1339	1391	1403	java/lang/Exception
    //   387	428	1437	java/lang/Exception
    //   545	576	1485	java/lang/Exception
    //   581	591	1485	java/lang/Exception
    //   599	624	1485	java/lang/Exception
    //   633	661	1485	java/lang/Exception
    //   661	681	1485	java/lang/Exception
    //   1651	1671	1944	java/lang/Exception
    //   1676	1702	1944	java/lang/Exception
    //   1730	1757	2040	java/lang/Exception
    //   1757	1785	2040	java/lang/Exception
    //   1820	1847	2040	java/lang/Exception
    //   1847	1858	2040	java/lang/Exception
    //   1989	1993	2040	java/lang/Exception
    //   2021	2037	2040	java/lang/Exception
    //   681	725	2065	java/lang/Exception
  }

  private static t mB(boolean paramBoolean)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(5029);
    if (j.tbr.eqQ <= 0)
      AppMethodBeat.o(5029);
    while (true)
    {
      return localObject2;
      if (!j.tbx)
      {
        AppMethodBeat.o(5029);
        continue;
      }
      if (paramBoolean == true);
      try
      {
        d.a.a locala = com.tencent.mm.compatible.e.d.a(ah.getContext(), j.tbs, null);
        ab.i("Camera", "Use front");
        while (true)
        {
          localObject2 = localObject1;
          if (locala != null)
            localObject2 = locala.erH;
          AppMethodBeat.o(5029);
          break;
          locala = com.tencent.mm.compatible.e.d.a(ah.getContext(), j.tbt, null);
          ab.i("Camera", "Use back");
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(159L, 0L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.a(159L, 1L, 1L, false);
          ab.e("MicroMsg.Voip.CaptureRender", "openCameraByHighApiLvl:error:" + localException.toString());
          Object localObject3 = localObject1;
        }
      }
    }
  }

  private t mC(boolean paramBoolean)
  {
    AppMethodBeat.i(5030);
    Object localObject1 = mB(paramBoolean);
    Object localObject2 = localObject1;
    if (localObject1 == null);
    try
    {
      localObject2 = new com/tencent/mm/compatible/e/t;
      ((t)localObject2).<init>(Camera.open());
    }
    catch (Exception localException2)
    {
      try
      {
        localObject1 = ((t)localObject2).getParameters();
        if (paramBoolean);
        for (int i = 2; ; i = 1)
        {
          ((Camera.Parameters)localObject1).set("camera-id", i);
          ((t)localObject2).setParameters((Camera.Parameters)localObject1);
          this.sZn = paramBoolean;
          h((t)localObject2);
          g((t)localObject2);
          AppMethodBeat.o(5030);
          while (true)
          {
            return localObject2;
            localException2 = localException2;
            ab.e("MicroMsg.Voip.CaptureRender", "OpenCameraError:" + localException2.toString());
            com.tencent.mm.plugin.report.service.h.pYm.a(159L, 0L, 1L, false);
            com.tencent.mm.plugin.report.service.h.pYm.a(159L, 1L, 1L, false);
            if (this.sZD != null)
              this.sZD.bSo();
            Object localObject3 = null;
            AppMethodBeat.o(5030);
          }
        }
      }
      catch (Exception localException1)
      {
        while (true)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(159L, 0L, 1L, false);
          ab.e("MicroMsg.Voip.CaptureRender", "set camera-id error:" + localException1.toString());
        }
      }
    }
  }

  public final int a(g paramg, boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(5027);
    if (j.tbr.eqQ <= 0)
    {
      this.sZu = 1;
      i = -1;
      AppMethodBeat.o(5027);
    }
    while (true)
    {
      return i;
      if (paramBoolean)
        if (!j.tbr.tak)
          paramBoolean = false;
      while (true)
      {
        this.sZD = paramg;
        if (i(paramBoolean, this.mWidth, this.mHeight) > 0)
          break label119;
        int j = i(paramBoolean, this.mWidth, this.mHeight);
        if (j > 0)
          break label119;
        this.sZu = 1;
        AppMethodBeat.o(5027);
        i = j;
        break;
        if (!j.tbr.tal)
          paramBoolean = true;
      }
      label119: cLA();
      this.sZu = 0;
      AppMethodBeat.o(5027);
    }
  }

  public final void a(SurfaceHolder paramSurfaceHolder)
  {
    boolean bool1 = false;
    AppMethodBeat.i(5025);
    ab.d("MicroMsg.Voip.CaptureRender", "surfaceChange");
    if ((!this.sZy) || (paramSurfaceHolder.getSurface() == null))
    {
      boolean bool2 = this.sZy;
      if (paramSurfaceHolder.getSurface() == null)
        bool1 = true;
      ab.e("MicroMsg.Voip.CaptureRender", "surfaceChange failed, CameraOpen: %b, surface: %b, apiLevel: %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1), Integer.valueOf(Build.VERSION.SDK_INT) });
      AppMethodBeat.o(5025);
    }
    while (true)
    {
      return;
      try
      {
        this.mdw.setPreviewCallback(null);
        this.mdw.stopPreview();
        this.mdw.setPreviewDisplay(paramSurfaceHolder);
        cLA();
        this.mdw.startPreview();
        this.mdx = true;
        if (this.sZF)
        {
          cLC();
          this.sZF = false;
        }
        com.tencent.mm.plugin.voip.b.cIj().Gw(this.sZu);
        AppMethodBeat.o(5025);
      }
      catch (Exception paramSurfaceHolder)
      {
        while (true)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(159L, 0L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.a(159L, 2L, 1L, false);
          ab.e("MicroMsg.Voip.CaptureRender", "surfaceChange failed" + paramSurfaceHolder.getMessage());
          this.sZu = 1;
        }
      }
    }
  }

  public final void a(ObservableSurfaceView paramObservableSurfaceView)
  {
    AppMethodBeat.i(5023);
    ab.d("MicroMsg.Voip.CaptureRender", "bind ObservableSurfaceView");
    if (paramObservableSurfaceView == null)
      AppMethodBeat.o(5023);
    while (true)
    {
      return;
      this.sZB = paramObservableSurfaceView;
      this.sZB.setSurfaceChangeCallback(this);
      this.sZA = true;
      AppMethodBeat.o(5023);
    }
  }

  public final void a(ObservableTextureView paramObservableTextureView)
  {
    AppMethodBeat.i(5024);
    ab.i("MicroMsg.Voip.CaptureRender", "bind ObservableTextureView");
    if (paramObservableTextureView == null)
      AppMethodBeat.o(5024);
    while (true)
    {
      return;
      this.sZC = paramObservableTextureView;
      this.sZC.setTextureChangeCallback(this);
      this.sZA = false;
      AppMethodBeat.o(5024);
    }
  }

  public final boolean bPu()
  {
    return this.mdx;
  }

  public final void cLB()
  {
    AppMethodBeat.i(5035);
    if (j.tbr.eqQ < 2)
    {
      ab.e("MicroMsg.Voip.CaptureRender", "ExchangeCapture...gCameraNum= " + j.tbr.eqQ);
      AppMethodBeat.o(5035);
      return;
    }
    ab.i("MicroMsg.Voip.CaptureRender", "ExchangeCapture start, gCameraNum= " + j.tbr.eqQ);
    cLD();
    g localg = this.sZD;
    if (!this.sZn);
    for (boolean bool = true; ; bool = false)
    {
      a(localg, bool);
      cLC();
      com.tencent.mm.plugin.voip.b.cIj().Gw(this.sZu);
      this.sZJ = true;
      AppMethodBeat.o(5035);
      break;
    }
  }

  // ERROR //
  public final int cLC()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: sipush 5036
    //   5: invokestatic 67	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 109	com/tencent/mm/plugin/voip/video/a:sZy	Z
    //   12: ifne +26 -> 38
    //   15: ldc 165
    //   17: ldc_w 785
    //   20: invokestatic 286	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: aload_0
    //   24: iconst_1
    //   25: putfield 107	com/tencent/mm/plugin/voip/video/a:sZu	I
    //   28: iconst_m1
    //   29: istore_1
    //   30: sipush 5036
    //   33: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   36: iload_1
    //   37: ireturn
    //   38: aload_0
    //   39: getfield 117	com/tencent/mm/plugin/voip/video/a:sZE	Z
    //   42: ifeq +22 -> 64
    //   45: ldc 165
    //   47: ldc_w 787
    //   50: invokestatic 286	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   53: iconst_m1
    //   54: istore_1
    //   55: sipush 5036
    //   58: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   61: goto -25 -> 36
    //   64: aload_0
    //   65: getfield 115	com/tencent/mm/plugin/voip/video/a:sZB	Lcom/tencent/mm/plugin/video/ObservableSurfaceView;
    //   68: ifnull +35 -> 103
    //   71: aload_0
    //   72: getfield 115	com/tencent/mm/plugin/voip/video/a:sZB	Lcom/tencent/mm/plugin/video/ObservableSurfaceView;
    //   75: invokevirtual 790	com/tencent/mm/plugin/video/ObservableSurfaceView:cHK	()Z
    //   78: ifne +25 -> 103
    //   81: ldc 165
    //   83: ldc_w 792
    //   86: invokestatic 314	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   89: aload_0
    //   90: iconst_1
    //   91: putfield 119	com/tencent/mm/plugin/voip/video/a:sZF	Z
    //   94: sipush 5036
    //   97: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: goto -64 -> 36
    //   103: ldc 165
    //   105: ldc_w 794
    //   108: iconst_1
    //   109: anewarray 4	java/lang/Object
    //   112: dup
    //   113: iconst_0
    //   114: aload_0
    //   115: getfield 113	com/tencent/mm/plugin/voip/video/a:sZA	Z
    //   118: invokestatic 295	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   121: aastore
    //   122: invokestatic 179	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   125: aload_0
    //   126: getfield 115	com/tencent/mm/plugin/voip/video/a:sZB	Lcom/tencent/mm/plugin/video/ObservableSurfaceView;
    //   129: ifnull +112 -> 241
    //   132: aload_0
    //   133: getfield 113	com/tencent/mm/plugin/voip/video/a:sZA	Z
    //   136: ifeq +105 -> 241
    //   139: aload_0
    //   140: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   143: aload_0
    //   144: getfield 115	com/tencent/mm/plugin/voip/video/a:sZB	Lcom/tencent/mm/plugin/video/ObservableSurfaceView;
    //   147: invokevirtual 798	com/tencent/mm/plugin/video/ObservableSurfaceView:getSurfaceHolder	()Landroid/view/SurfaceHolder;
    //   150: invokevirtual 731	com/tencent/mm/compatible/e/t:setPreviewDisplay	(Landroid/view/SurfaceHolder;)V
    //   153: aload_0
    //   154: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   157: invokevirtual 734	com/tencent/mm/compatible/e/t:startPreview	()V
    //   160: aload_0
    //   161: iconst_1
    //   162: putfield 137	com/tencent/mm/plugin/voip/video/a:mdx	Z
    //   165: aload_0
    //   166: iconst_1
    //   167: putfield 117	com/tencent/mm/plugin/voip/video/a:sZE	Z
    //   170: sipush 5036
    //   173: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   176: iconst_1
    //   177: istore_1
    //   178: goto -142 -> 36
    //   181: astore_2
    //   182: getstatic 263	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   185: ldc2_w 264
    //   188: lconst_0
    //   189: lconst_1
    //   190: iconst_0
    //   191: invokevirtual 268	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   194: getstatic 263	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   197: ldc2_w 264
    //   200: ldc2_w 749
    //   203: lconst_1
    //   204: iconst_0
    //   205: invokevirtual 268	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   208: aload_0
    //   209: iconst_1
    //   210: putfield 107	com/tencent/mm/plugin/voip/video/a:sZu	I
    //   213: ldc 165
    //   215: new 270	java/lang/StringBuilder
    //   218: dup
    //   219: ldc_w 800
    //   222: invokespecial 275	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   225: aload_2
    //   226: invokevirtual 278	java/lang/Exception:toString	()Ljava/lang/String;
    //   229: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   235: invokestatic 286	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   238: goto -85 -> 153
    //   241: aload_0
    //   242: getfield 766	com/tencent/mm/plugin/voip/video/a:sZC	Lcom/tencent/mm/plugin/video/ObservableTextureView;
    //   245: ifnull -92 -> 153
    //   248: aload_0
    //   249: getfield 113	com/tencent/mm/plugin/voip/video/a:sZA	Z
    //   252: ifne -99 -> 153
    //   255: aload_0
    //   256: getfield 361	com/tencent/mm/plugin/voip/video/a:mdw	Lcom/tencent/mm/compatible/e/t;
    //   259: aload_0
    //   260: getfield 766	com/tencent/mm/plugin/voip/video/a:sZC	Lcom/tencent/mm/plugin/video/ObservableTextureView;
    //   263: invokevirtual 804	com/tencent/mm/plugin/video/ObservableTextureView:getSurfaceTexture	()Landroid/graphics/SurfaceTexture;
    //   266: invokevirtual 808	com/tencent/mm/compatible/e/t:setPreviewTexture	(Landroid/graphics/SurfaceTexture;)V
    //   269: goto -116 -> 153
    //   272: astore_2
    //   273: getstatic 263	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   276: ldc2_w 264
    //   279: lconst_0
    //   280: lconst_1
    //   281: iconst_0
    //   282: invokevirtual 268	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   285: getstatic 263	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   288: ldc2_w 264
    //   291: ldc2_w 749
    //   294: lconst_1
    //   295: iconst_0
    //   296: invokevirtual 268	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   299: aload_0
    //   300: iconst_1
    //   301: putfield 107	com/tencent/mm/plugin/voip/video/a:sZu	I
    //   304: ldc 165
    //   306: new 270	java/lang/StringBuilder
    //   309: dup
    //   310: ldc_w 800
    //   313: invokespecial 275	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   316: aload_2
    //   317: invokevirtual 278	java/lang/Exception:toString	()Ljava/lang/String;
    //   320: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   326: invokestatic 286	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   329: goto -176 -> 153
    //   332: astore_2
    //   333: getstatic 263	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   336: ldc2_w 264
    //   339: lconst_0
    //   340: lconst_1
    //   341: iconst_0
    //   342: invokevirtual 268	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   345: getstatic 263	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   348: ldc2_w 264
    //   351: ldc2_w 749
    //   354: lconst_1
    //   355: iconst_0
    //   356: invokevirtual 268	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   359: aload_0
    //   360: iconst_1
    //   361: putfield 107	com/tencent/mm/plugin/voip/video/a:sZu	I
    //   364: aload_0
    //   365: getfield 547	com/tencent/mm/plugin/voip/video/a:sZD	Lcom/tencent/mm/plugin/voip/video/g;
    //   368: ifnull +12 -> 380
    //   371: aload_0
    //   372: getfield 547	com/tencent/mm/plugin/voip/video/a:sZD	Lcom/tencent/mm/plugin/voip/video/g;
    //   375: invokeinterface 552 1 0
    //   380: ldc 165
    //   382: new 270	java/lang/StringBuilder
    //   385: dup
    //   386: ldc_w 810
    //   389: invokespecial 275	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   392: aload_2
    //   393: invokevirtual 278	java/lang/Exception:toString	()Ljava/lang/String;
    //   396: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   399: invokevirtual 283	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   402: invokestatic 286	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   405: goto -240 -> 165
    //
    // Exception table:
    //   from	to	target	type
    //   139	153	181	java/lang/Exception
    //   255	269	272	java/lang/Exception
    //   153	165	332	java/lang/Exception
  }

  public final void cLD()
  {
    AppMethodBeat.i(5037);
    ab.d("MicroMsg.Voip.CaptureRender", "StopCapture....mIsInCapture = " + this.sZE);
    if ((this.sZE) && (this.mdw != null))
    {
      this.sZF = false;
      this.mdw.setPreviewCallback(null);
    }
    try
    {
      this.mdw.stopPreview();
      this.mdx = false;
      this.sZE = false;
      if (1 == this.sZu)
      {
        mi localmi = new mi();
        localmi.cIm.type = 2;
        com.tencent.mm.sdk.b.a.xxA.m(localmi);
      }
      ab.d("MicroMsg.Voip.CaptureRender", "UnInitCapture....mCameraOpen = " + this.sZy);
      if (this.sZy)
      {
        this.sZu = 0;
        this.sZF = false;
        if (this.mdw != null)
        {
          this.mdw.setPreviewCallback(null);
          this.mdw.release();
        }
        this.mdw = null;
        this.sZy = false;
        this.sZG = null;
        if (this.sZI != null)
          this.sZI.clear();
        this.sZI = null;
        this.sZz = false;
        AppMethodBeat.o(5037);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.Voip.CaptureRender", "stopPreview:error" + localException.toString());
        continue;
        if (this.mdw != null)
        {
          this.mdw.setPreviewCallback(null);
          this.mdw.release();
          this.mdw = null;
          this.sZy = false;
        }
      }
    }
  }

  public final boolean cLE()
  {
    return this.sZn;
  }

  public final boolean cLF()
  {
    return this.sZo;
  }

  public final int cLG()
  {
    return this.sZu;
  }

  public final void e(SurfaceTexture paramSurfaceTexture)
  {
    boolean bool1 = false;
    AppMethodBeat.i(5026);
    ab.d("MicroMsg.Voip.CaptureRender", "onSurfaceTextureAvailable");
    if ((!this.sZy) || (paramSurfaceTexture == null))
    {
      boolean bool2 = this.sZy;
      if (paramSurfaceTexture == null)
        bool1 = true;
      ab.e("MicroMsg.Voip.CaptureRender", "onSurfaceTextureAvailable failed, CameraOpen: %b, surface: %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      AppMethodBeat.o(5026);
    }
    while (true)
    {
      return;
      try
      {
        this.mdw.setPreviewCallback(null);
        this.mdw.stopPreview();
        this.mdw.setPreviewTexture(paramSurfaceTexture);
        cLA();
        this.mdw.startPreview();
        this.mdx = true;
        if (this.sZF)
        {
          cLC();
          this.sZF = false;
        }
        com.tencent.mm.plugin.voip.b.cIj().Gw(this.sZu);
        AppMethodBeat.o(5026);
      }
      catch (Exception paramSurfaceTexture)
      {
        while (true)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(159L, 0L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.a(159L, 2L, 1L, false);
          ab.e("MicroMsg.Voip.CaptureRender", "surfaceChange failed" + paramSurfaceTexture.getMessage());
          this.sZu = 1;
        }
      }
    }
  }

  @TargetApi(14)
  public final void y(int[] paramArrayOfInt)
  {
    boolean bool1 = true;
    AppMethodBeat.i(5038);
    if ((q.etc.ery == 1) && (this.sZz))
      AppMethodBeat.o(5038);
    while (true)
    {
      return;
      if (q.etc.erx > 2000)
        this.sZt = q.etc.erx;
      if (paramArrayOfInt != null)
        break;
      ab.e("MicroMsg.Voip.CaptureRender", "focusOnFace error, faceLocation is null");
      boolean bool2;
      label85: boolean bool3;
      if (System.currentTimeMillis() - this.sZs > this.sZt)
      {
        bool2 = true;
        if ((this.sZp) && (!bool2) && (this.sZq == this.sZn))
          break label329;
        paramArrayOfInt = new StringBuilder("now i need autoFocus! and !mIsCameraNoParamAutoFocus: ");
        if (this.sZp)
          break label292;
        bool3 = true;
        label128: paramArrayOfInt = paramArrayOfInt.append(bool3).append(",isAutoFocusTimeout: ").append(bool2).append(",mAutoFocusTimeOut:").append(this.sZt).append(",mIsLastAutoFocusFaceCamera != mIsCurrentFaceCamera :");
        if (this.sZq == this.sZn)
          break label298;
        bool2 = bool1;
        ab.i("MicroMsg.Voip.CaptureRender", bool2 + ",isClickScreen :false");
      }
      try
      {
        if ((this.mdw != null) && (this.mdw.getParameters() != null) && (this.mdw.getParameters().getFocusMode() != null) && (this.mdw.getParameters().getFocusMode().equals("auto")))
        {
          this.mdw.autoFocus(null);
          this.sZH = null;
          this.sZs = System.currentTimeMillis();
          this.sZp = true;
          this.sZq = this.sZn;
        }
        AppMethodBeat.o(5038);
        continue;
        bool2 = false;
        break label85;
        label292: bool3 = false;
        break label128;
        label298: bool2 = false;
      }
      catch (Exception paramArrayOfInt)
      {
        ab.e("MicroMsg.Voip.CaptureRender", "mCamera.getParameters() or autoFocus fail!" + paramArrayOfInt.toString());
      }
      label329: AppMethodBeat.o(5038);
    }
    if (this.sZH == null)
      this.sZH = paramArrayOfInt;
    for (int i = 1; ; i = 0)
    {
      Object localObject = this.sZH;
      int j = Math.abs(localObject[0] - paramArrayOfInt[0]);
      int k = Math.abs(localObject[1] - paramArrayOfInt[1]);
      int m = Math.abs(localObject[2] - paramArrayOfInt[2]);
      j = Math.abs(localObject[3] - paramArrayOfInt[3]) + (j + k + m);
      ab.d("MicroMsg.Voip.CaptureRender", "face location diff:%d", new Object[] { Integer.valueOf(j) });
      if (j <= sZm)
      {
        k = i;
        if (j <= sZl);
      }
      else
      {
        this.sZH = paramArrayOfInt;
        if (j > sZm)
          i = 1;
        k = i;
        if (j <= sZl);
      }
      for (k = 1; ; k = j)
      {
        while (true)
          if ((i != 0) || (k != 0))
          {
            int n = this.sZH[0];
            j = this.sZH[1];
            int i1 = this.sZH[2];
            m = this.sZH[3];
            try
            {
              localObject = new android/graphics/Rect;
              ((Rect)localObject).<init>(n, j, i1, m);
              paramArrayOfInt = this.mdw.getParameters();
              j = k;
              ArrayList localArrayList;
              Camera.Area localArea;
              if (k != 0)
              {
                if ((com.tencent.mm.compatible.util.d.iW(14)) && (paramArrayOfInt.getMaxNumMeteringAreas() > 0))
                {
                  localArrayList = new java/util/ArrayList;
                  localArrayList.<init>();
                  localArea = new android/hardware/Camera$Area;
                  localArea.<init>((Rect)localObject, 1000);
                  localArrayList.add(localArea);
                  paramArrayOfInt.setMeteringAreas(localArrayList);
                  j = k;
                }
              }
              else
              {
                label626: k = i;
                if (i != 0)
                {
                  if ((!com.tencent.mm.compatible.util.d.iW(14)) || (paramArrayOfInt.getMaxNumFocusAreas() <= 0))
                    break label800;
                  localArrayList = new java/util/ArrayList;
                  localArrayList.<init>();
                  localArea = new android/hardware/Camera$Area;
                  localArea.<init>((Rect)localObject, 1000);
                  localArrayList.add(localArea);
                  paramArrayOfInt.setFocusAreas(localArrayList);
                }
              }
              for (k = i; ; k = 0)
              {
                if ((k != 0) || (j != 0))
                  this.mdw.setParameters(paramArrayOfInt);
                if (k != 0)
                {
                  ab.d("MicroMsg.Voip.CaptureRender", "refocus, mIsFocusOnFace:%b", new Object[] { Boolean.valueOf(this.sZJ) });
                  if (this.sZJ)
                  {
                    this.sZp = false;
                    this.sZJ = false;
                    paramArrayOfInt = this.mdw;
                    localObject = new com/tencent/mm/plugin/voip/video/a$1;
                    ((a.1)localObject).<init>(this);
                    paramArrayOfInt.autoFocus((Camera.AutoFocusCallback)localObject);
                  }
                }
                AppMethodBeat.o(5038);
                break;
                ab.d("MicroMsg.Voip.CaptureRender", "camera not support metering area");
                j = 0;
                break label626;
                label800: ab.d("MicroMsg.Voip.CaptureRender", "camera not support area focus");
              }
            }
            catch (Exception paramArrayOfInt)
            {
              ab.e("MicroMsg.Voip.CaptureRender", "focusOnFace exception:%s", new Object[] { paramArrayOfInt.getMessage() });
            }
          }
        AppMethodBeat.o(5038);
        break;
        j = 0;
        i = k;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.a
 * JD-Core Version:    0.6.2
 */