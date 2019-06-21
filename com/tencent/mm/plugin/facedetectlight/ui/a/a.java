package com.tencent.mm.plugin.facedetectlight.ui.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetectlight.ui.FaceReflectMask;
import com.tencent.mm.plugin.facedetectlight.ui.PreviewFrameLayout;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMTextureView;

public final class a extends com.tencent.mm.plugin.facedetectlight.ui.a
  implements b
{
  PreviewFrameLayout mcO;
  MMTextureView mcQ;
  private ImageView mcR;
  public TextView mcS;
  public com.tencent.mm.plugin.facedetectlight.ui.b mcZ;
  public FaceReflectMask mdz;
  public ImageView mee;
  private TextView mef;
  ImageView meg;

  public a(ViewGroup paramViewGroup, com.tencent.mm.plugin.facedetectlight.ui.container.a parama)
  {
    super(paramViewGroup, parama);
  }

  public final void Ly(String paramString)
  {
    AppMethodBeat.i(834);
    ab.i(this.TAG, "callbackDetectSuccess()");
    Bundle localBundle = new Bundle();
    localBundle.putString("key_bio_buffer_path", paramString);
    this.mds.a(0, 0, "collect data ok", localBundle);
    AppMethodBeat.o(834);
  }

  public final void a(byte[] paramArrayOfByte, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(827);
    ab.d(this.TAG, "initCamera : bioID=%s ,appID=%s ,userName=%s", new Object[] { paramString1, paramString2, paramString3 });
    this.mcZ = new com.tencent.mm.plugin.facedetectlight.ui.b(this.BE.getContext(), this);
    this.mcZ.mdy = this.mcS;
    this.mcZ.mdz = this.mdz;
    this.mcZ.mdA = this.mcO;
    this.mcZ.lWX = paramArrayOfByte;
    this.mcZ.mdC = paramString1;
    this.mcZ.mAppId = paramString2;
    this.mcZ.edV = paramString3;
    this.mcZ.mdD = this.mcR;
    AppMethodBeat.o(827);
  }

  public final void aB(int paramInt, String paramString)
  {
    AppMethodBeat.i(833);
    this.mds.a(1, paramInt, paramString, null);
    AppMethodBeat.o(833);
  }

  // ERROR //
  public final void bsk()
  {
    // Byte code:
    //   0: sipush 832
    //   3: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 138	com/tencent/mm/plugin/facedetectlight/ui/c$a:btY	()Lcom/tencent/mm/plugin/facedetectlight/ui/c;
    //   9: pop
    //   10: ldc 140
    //   12: ldc 142
    //   14: invokestatic 45	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: invokestatic 145	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   20: ldc 147
    //   22: iconst_0
    //   23: iconst_0
    //   24: invokestatic 153	com/tencent/youtu/ytcommon/YTCommonExInterface:initAuth	(Landroid/content/Context;Ljava/lang/String;IZ)I
    //   27: istore_1
    //   28: aload_0
    //   29: getfield 38	com/tencent/mm/plugin/facedetectlight/ui/a/a:TAG	Ljava/lang/String;
    //   32: ldc 155
    //   34: iload_1
    //   35: invokestatic 161	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   38: invokevirtual 165	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   41: invokestatic 45	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   44: iload_1
    //   45: ifeq +33 -> 78
    //   48: aload_0
    //   49: getfield 38	com/tencent/mm/plugin/facedetectlight/ui/a/a:TAG	Ljava/lang/String;
    //   52: ldc 167
    //   54: invokestatic 45	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   57: getstatic 173	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   60: ldc2_w 174
    //   63: ldc2_w 176
    //   66: lconst_1
    //   67: iconst_0
    //   68: invokevirtual 180	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   71: sipush 832
    //   74: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   77: return
    //   78: aload_0
    //   79: getfield 38	com/tencent/mm/plugin/facedetectlight/ui/a/a:TAG	Ljava/lang/String;
    //   82: ldc 182
    //   84: invokestatic 45	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   87: getstatic 173	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   90: ldc2_w 174
    //   93: ldc2_w 183
    //   96: lconst_1
    //   97: iconst_0
    //   98: invokevirtual 180	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   101: invokestatic 138	com/tencent/mm/plugin/facedetectlight/ui/c$a:btY	()Lcom/tencent/mm/plugin/facedetectlight/ui/c;
    //   104: astore_2
    //   105: aload_0
    //   106: getfield 85	com/tencent/mm/plugin/facedetectlight/ui/a/a:BE	Landroid/view/ViewGroup;
    //   109: invokevirtual 91	android/view/ViewGroup:getContext	()Landroid/content/Context;
    //   112: checkcast 186	android/app/Activity
    //   115: astore_3
    //   116: ldc 140
    //   118: ldc 188
    //   120: invokestatic 45	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   123: invokestatic 145	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   126: invokevirtual 194	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   129: astore 4
    //   131: new 196	java/lang/StringBuilder
    //   134: astore 5
    //   136: aload 5
    //   138: ldc 198
    //   140: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   143: aload 4
    //   145: aload 5
    //   147: getstatic 205	java/io/File:separator	Ljava/lang/String;
    //   150: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: ldc 211
    //   155: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   161: invokevirtual 221	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   164: astore 6
    //   166: invokestatic 145	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   169: invokevirtual 194	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   172: astore 5
    //   174: new 196	java/lang/StringBuilder
    //   177: astore 4
    //   179: aload 4
    //   181: ldc 198
    //   183: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   186: aload 5
    //   188: aload 4
    //   190: getstatic 205	java/io/File:separator	Ljava/lang/String;
    //   193: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: ldc 223
    //   198: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   204: invokevirtual 221	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   207: astore 7
    //   209: aload 6
    //   211: invokevirtual 229	java/io/InputStream:available	()I
    //   214: newarray byte
    //   216: astore 5
    //   218: aload 6
    //   220: aload 5
    //   222: invokevirtual 233	java/io/InputStream:read	([B)I
    //   225: pop
    //   226: aload 7
    //   228: invokevirtual 229	java/io/InputStream:available	()I
    //   231: newarray byte
    //   233: astore 4
    //   235: aload 7
    //   237: aload 4
    //   239: invokevirtual 233	java/io/InputStream:read	([B)I
    //   242: pop
    //   243: aload 6
    //   245: invokevirtual 236	java/io/InputStream:close	()V
    //   248: aload 7
    //   250: invokevirtual 236	java/io/InputStream:close	()V
    //   253: aload 5
    //   255: aload 4
    //   257: invokestatic 242	com/tencent/youtu/ytfacetrace/YTFaceTraceInterface:initModel	([B[B)I
    //   260: istore_1
    //   261: ldc 140
    //   263: ldc 244
    //   265: iconst_1
    //   266: anewarray 75	java/lang/Object
    //   269: dup
    //   270: iconst_0
    //   271: iload_1
    //   272: invokestatic 249	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   275: aastore
    //   276: invokestatic 251	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   279: iload_1
    //   280: ifeq +87 -> 367
    //   283: ldc 140
    //   285: ldc 253
    //   287: iload_1
    //   288: invokestatic 161	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   291: invokevirtual 165	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   294: invokestatic 45	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   297: iconst_0
    //   298: istore_1
    //   299: iload_1
    //   300: ifeq +11 -> 311
    //   303: aload_3
    //   304: sipush 255
    //   307: invokestatic 257	com/tencent/youtu/ytcommon/YTCommonExInterface:setAppBrightness	(Landroid/app/Activity;I)F
    //   310: pop
    //   311: aload_2
    //   312: iconst_0
    //   313: putfield 263	com/tencent/mm/plugin/facedetectlight/ui/c:mState	I
    //   316: aload_2
    //   317: aload_0
    //   318: putfield 267	com/tencent/mm/plugin/facedetectlight/ui/c:mdI	Lcom/tencent/mm/plugin/facedetectlight/ui/a/b;
    //   321: sipush 832
    //   324: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   327: goto -250 -> 77
    //   330: astore 6
    //   332: aconst_null
    //   333: astore 4
    //   335: aconst_null
    //   336: astore 5
    //   338: ldc 140
    //   340: new 196	java/lang/StringBuilder
    //   343: dup
    //   344: ldc_w 269
    //   347: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   350: aload 6
    //   352: invokevirtual 272	java/io/IOException:getMessage	()Ljava/lang/String;
    //   355: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   358: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   361: invokestatic 45	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   364: goto -111 -> 253
    //   367: aload 5
    //   369: aload 4
    //   371: invokestatic 275	com/tencent/youtu/ytagreflectlivecheck/YTAGReflectLiveCheckInterface:initModel	([B[B)I
    //   374: istore_1
    //   375: iload_1
    //   376: ifeq +22 -> 398
    //   379: ldc 140
    //   381: ldc 253
    //   383: iload_1
    //   384: invokestatic 161	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   387: invokevirtual 165	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   390: invokestatic 45	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   393: iconst_0
    //   394: istore_1
    //   395: goto -96 -> 299
    //   398: iconst_1
    //   399: istore_1
    //   400: goto -101 -> 299
    //   403: astore 6
    //   405: aconst_null
    //   406: astore 4
    //   408: goto -70 -> 338
    //   411: astore 6
    //   413: goto -75 -> 338
    //
    // Exception table:
    //   from	to	target	type
    //   123	218	330	java/io/IOException
    //   218	235	403	java/io/IOException
    //   235	253	411	java/io/IOException
  }

  public final int btU()
  {
    return 2130969466;
  }

  public final void bua()
  {
    AppMethodBeat.i(828);
    ab.i(this.TAG, "finish ReflectUI");
    FaceReflectMask localFaceReflectMask = this.mdz;
    localFaceReflectMask.mdZ = true;
    localFaceReflectMask.mcM = true;
    localFaceReflectMask.invalidate();
    this.mdz.setBackgroundColor(-16777216);
    this.mcZ.stopPreview();
    setVisibility(8);
    this.meg.setVisibility(0);
    AppMethodBeat.o(828);
  }

  public final void bub()
  {
    AppMethodBeat.i(829);
    ab.i(this.TAG, "reflectLoadAnimation()");
    int i = this.mdz.getWidth();
    int j = this.mdz.getHeight();
    RotateAnimation localRotateAnimation = new RotateAnimation(0.0F, 360.0F, 1, 0.5F, 1, 0.5F);
    localRotateAnimation.setDuration(2500L);
    localRotateAnimation.setRepeatCount(-1);
    this.meg.setVisibility(4);
    this.meg.post(new a.2(this, i, j, localRotateAnimation));
    this.mee.setVisibility(4);
    AppMethodBeat.o(829);
  }

  public final void buc()
  {
    AppMethodBeat.i(830);
    this.mef.setVisibility(0);
    AppMethodBeat.o(830);
  }

  public final void initView()
  {
    AppMethodBeat.i(825);
    this.mcR = ((ImageView)findViewById(2131823758));
    this.mcO = ((PreviewFrameLayout)findViewById(2131823756));
    this.mcQ = ((MMTextureView)findViewById(2131823757));
    this.mdz = ((FaceReflectMask)findViewById(2131823760));
    this.mee = ((ImageView)findViewById(2131823782));
    this.mcS = ((TextView)findViewById(2131823761));
    this.meg = ((ImageView)findViewById(2131823783));
    this.mef = ((TextView)findViewById(2131823775));
    AppMethodBeat.o(825);
  }

  public final void resume()
  {
    AppMethodBeat.i(831);
    ab.i(this.TAG, " FaceReflect Preview UI resume");
    if (this.mcZ != null)
    {
      this.mcZ.a(this.mcQ);
      this.mcZ.btX();
      this.mcZ.mdx = true;
      this.mcS.setText(2131299505);
    }
    AppMethodBeat.o(831);
  }

  public final void setBusinessTip(String paramString)
  {
    AppMethodBeat.i(826);
    if ((TextUtils.isEmpty(paramString)) || (this.mef == null))
      AppMethodBeat.o(826);
    while (true)
    {
      return;
      ab.d(this.TAG, "business tip is : ".concat(String.valueOf(paramString)));
      this.mef.setText(paramString);
      AppMethodBeat.o(826);
    }
  }

  public final void u(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(835);
    ab.i(this.TAG, "callbackDetectFailed()");
    Bundle localBundle = new Bundle();
    localBundle.putString("show_err_msg", paramString2);
    this.mds.a(4, paramInt, paramString1, localBundle);
    AppMethodBeat.o(835);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.a.a
 * JD-Core Version:    0.6.2
 */