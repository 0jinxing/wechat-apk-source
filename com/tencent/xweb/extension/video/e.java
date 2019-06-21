package com.tencent.xweb.extension.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import dalvik.system.DexClassLoader;
import java.io.File;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;

public final class e
{
  private static ClassLoader mClassLoader;

  // ERROR //
  public static b a(android.app.Activity paramActivity, com.tencent.xweb.WebView paramWebView, android.view.View paramView, String paramString)
  {
    // Byte code:
    //   0: ldc 15
    //   2: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 27	org/xwalk/core/XWalkCoreWrapper:getInstance	()Lorg/xwalk/core/XWalkCoreWrapper;
    //   8: ifnull +123 -> 131
    //   11: ldc 29
    //   13: ldc 31
    //   15: invokestatic 36	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   18: invokestatic 27	org/xwalk/core/XWalkCoreWrapper:getInstance	()Lorg/xwalk/core/XWalkCoreWrapper;
    //   21: ldc 38
    //   23: invokevirtual 42	org/xwalk/core/XWalkCoreWrapper:getClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   26: astore 4
    //   28: aconst_null
    //   29: astore 5
    //   31: aload 4
    //   33: ifnull +205 -> 238
    //   36: ldc 29
    //   38: ldc 44
    //   40: invokestatic 36	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: new 6	com/tencent/xweb/extension/video/e$a
    //   46: astore 6
    //   48: aload 6
    //   50: aload 4
    //   52: invokevirtual 50	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   55: invokespecial 54	com/tencent/xweb/extension/video/e$a:<init>	(Ljava/lang/Object;)V
    //   58: new 56	org/xwalk/core/resource/XWalkContextWrapper
    //   61: astore 4
    //   63: aload 4
    //   65: aload_1
    //   66: invokevirtual 62	com/tencent/xweb/WebView:getContext	()Landroid/content/Context;
    //   69: invokestatic 68	org/xwalk/core/XWalkEnvironment:getAvailableVersion	()I
    //   72: invokespecial 71	org/xwalk/core/resource/XWalkContextWrapper:<init>	(Landroid/content/Context;I)V
    //   75: aload 5
    //   77: ifnull +10 -> 87
    //   80: aload 4
    //   82: aload 5
    //   84: invokevirtual 75	org/xwalk/core/resource/XWalkContextWrapper:setClassLoader	(Ljava/lang/ClassLoader;)V
    //   87: aload 6
    //   89: getfield 79	com/tencent/xweb/extension/video/e$a:AOF	Lorg/xwalk/core/ReflectMethod;
    //   92: iconst_5
    //   93: anewarray 4	java/lang/Object
    //   96: dup
    //   97: iconst_0
    //   98: aload_0
    //   99: aastore
    //   100: dup
    //   101: iconst_1
    //   102: aload_1
    //   103: aastore
    //   104: dup
    //   105: iconst_2
    //   106: aload_2
    //   107: aastore
    //   108: dup
    //   109: iconst_3
    //   110: aload 4
    //   112: aastore
    //   113: dup
    //   114: iconst_4
    //   115: aload_3
    //   116: aastore
    //   117: invokevirtual 85	org/xwalk/core/ReflectMethod:invoke	([Ljava/lang/Object;)Ljava/lang/Object;
    //   120: pop
    //   121: ldc 15
    //   123: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   126: aload 6
    //   128: astore_0
    //   129: aload_0
    //   130: areturn
    //   131: ldc 29
    //   133: ldc 90
    //   135: invokestatic 36	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   138: ldc 92
    //   140: iconst_0
    //   141: invokestatic 96	org/xwalk/core/XWalkEnvironment:getXWebInitArgs	(Ljava/lang/String;Z)Z
    //   144: invokestatic 102	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   147: astore 5
    //   149: aload 5
    //   151: ifnull +71 -> 222
    //   154: aload 5
    //   156: instanceof 98
    //   159: ifeq +63 -> 222
    //   162: aload 5
    //   164: checkcast 98	java/lang/Boolean
    //   167: invokevirtual 106	java/lang/Boolean:booleanValue	()Z
    //   170: ifne +36 -> 206
    //   173: invokestatic 110	com/tencent/xweb/extension/video/e:dUv	()Ljava/lang/ClassLoader;
    //   176: astore 5
    //   178: aload 5
    //   180: ifnull +649 -> 829
    //   183: aload 5
    //   185: ldc 38
    //   187: invokevirtual 115	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   190: astore 4
    //   192: goto -161 -> 31
    //   195: astore 5
    //   197: aconst_null
    //   198: astore 5
    //   200: aconst_null
    //   201: astore 4
    //   203: goto -172 -> 31
    //   206: ldc 29
    //   208: ldc 117
    //   210: invokestatic 120	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   213: aconst_null
    //   214: astore 5
    //   216: aconst_null
    //   217: astore 4
    //   219: goto -188 -> 31
    //   222: ldc 29
    //   224: ldc 122
    //   226: invokestatic 120	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   229: aconst_null
    //   230: astore 5
    //   232: aconst_null
    //   233: astore 4
    //   235: goto -204 -> 31
    //   238: ldc 29
    //   240: ldc 124
    //   242: invokestatic 36	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   245: ldc 29
    //   247: ldc 126
    //   249: invokestatic 36	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   252: new 128	com/tencent/xweb/extension/video/d
    //   255: dup
    //   256: invokespecial 131	com/tencent/xweb/extension/video/d:<init>	()V
    //   259: astore 5
    //   261: aload_2
    //   262: invokevirtual 134	android/view/View:getContext	()Landroid/content/Context;
    //   265: pop
    //   266: aload 5
    //   268: aload_0
    //   269: putfield 138	com/tencent/xweb/extension/video/d:mActivity	Landroid/app/Activity;
    //   272: aload 5
    //   274: aload_1
    //   275: checkcast 58	com/tencent/xweb/WebView
    //   278: putfield 142	com/tencent/xweb/extension/video/d:zxW	Lcom/tencent/xweb/WebView;
    //   281: aload 5
    //   283: aload_3
    //   284: putfield 146	com/tencent/xweb/extension/video/d:AOg	Ljava/lang/String;
    //   287: aload 5
    //   289: new 148	android/widget/FrameLayout
    //   292: dup
    //   293: aload 5
    //   295: getfield 142	com/tencent/xweb/extension/video/d:zxW	Lcom/tencent/xweb/WebView;
    //   298: invokevirtual 62	com/tencent/xweb/WebView:getContext	()Landroid/content/Context;
    //   301: invokespecial 151	android/widget/FrameLayout:<init>	(Landroid/content/Context;)V
    //   304: putfield 155	com/tencent/xweb/extension/video/d:odV	Landroid/widget/FrameLayout;
    //   307: aload 5
    //   309: getfield 155	com/tencent/xweb/extension/video/d:odV	Landroid/widget/FrameLayout;
    //   312: ldc 156
    //   314: invokevirtual 159	android/widget/FrameLayout:setBackgroundColor	(I)V
    //   317: aload 5
    //   319: getfield 142	com/tencent/xweb/extension/video/d:zxW	Lcom/tencent/xweb/WebView;
    //   322: invokevirtual 162	com/tencent/xweb/WebView:isXWalkKernel	()Z
    //   325: ifeq +91 -> 416
    //   328: aload 5
    //   330: new 164	android/view/SurfaceView
    //   333: dup
    //   334: aload 5
    //   336: getfield 142	com/tencent/xweb/extension/video/d:zxW	Lcom/tencent/xweb/WebView;
    //   339: invokevirtual 62	com/tencent/xweb/WebView:getContext	()Landroid/content/Context;
    //   342: invokespecial 165	android/view/SurfaceView:<init>	(Landroid/content/Context;)V
    //   345: putfield 169	com/tencent/xweb/extension/video/d:AND	Landroid/view/SurfaceView;
    //   348: aload 5
    //   350: getfield 169	com/tencent/xweb/extension/video/d:AND	Landroid/view/SurfaceView;
    //   353: invokevirtual 173	android/view/SurfaceView:getHolder	()Landroid/view/SurfaceHolder;
    //   356: bipush 253
    //   358: invokeinterface 178 2 0
    //   363: aload 5
    //   365: getfield 169	com/tencent/xweb/extension/video/d:AND	Landroid/view/SurfaceView;
    //   368: invokevirtual 173	android/view/SurfaceView:getHolder	()Landroid/view/SurfaceHolder;
    //   371: new 180	com/tencent/xweb/extension/video/d$1
    //   374: dup
    //   375: aload 5
    //   377: invokespecial 183	com/tencent/xweb/extension/video/d$1:<init>	(Lcom/tencent/xweb/extension/video/d;)V
    //   380: invokeinterface 187 2 0
    //   385: aload 5
    //   387: getfield 169	com/tencent/xweb/extension/video/d:AND	Landroid/view/SurfaceView;
    //   390: iconst_0
    //   391: invokevirtual 191	android/view/SurfaceView:setZOrderOnTop	(Z)V
    //   394: aload 5
    //   396: getfield 169	com/tencent/xweb/extension/video/d:AND	Landroid/view/SurfaceView;
    //   399: iconst_0
    //   400: invokevirtual 194	android/view/SurfaceView:setZOrderMediaOverlay	(Z)V
    //   403: aload 5
    //   405: getfield 155	com/tencent/xweb/extension/video/d:odV	Landroid/widget/FrameLayout;
    //   408: aload 5
    //   410: getfield 169	com/tencent/xweb/extension/video/d:AND	Landroid/view/SurfaceView;
    //   413: invokevirtual 198	android/widget/FrameLayout:addView	(Landroid/view/View;)V
    //   416: aload 5
    //   418: new 200	android/view/GestureDetector
    //   421: dup
    //   422: aload 5
    //   424: getfield 142	com/tencent/xweb/extension/video/d:zxW	Lcom/tencent/xweb/WebView;
    //   427: invokevirtual 62	com/tencent/xweb/WebView:getContext	()Landroid/content/Context;
    //   430: aload 5
    //   432: invokespecial 203	android/view/GestureDetector:<init>	(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V
    //   435: putfield 207	com/tencent/xweb/extension/video/d:Mh	Landroid/view/GestureDetector;
    //   438: aload 5
    //   440: new 209	android/view/ScaleGestureDetector
    //   443: dup
    //   444: aload 5
    //   446: getfield 142	com/tencent/xweb/extension/video/d:zxW	Lcom/tencent/xweb/WebView;
    //   449: invokevirtual 62	com/tencent/xweb/WebView:getContext	()Landroid/content/Context;
    //   452: aload 5
    //   454: invokespecial 212	android/view/ScaleGestureDetector:<init>	(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V
    //   457: putfield 216	com/tencent/xweb/extension/video/d:ANR	Landroid/view/ScaleGestureDetector;
    //   460: aload 5
    //   462: getfield 207	com/tencent/xweb/extension/video/d:Mh	Landroid/view/GestureDetector;
    //   465: iconst_0
    //   466: invokevirtual 219	android/view/GestureDetector:setIsLongpressEnabled	(Z)V
    //   469: aload 5
    //   471: aload 5
    //   473: getfield 142	com/tencent/xweb/extension/video/d:zxW	Lcom/tencent/xweb/WebView;
    //   476: invokevirtual 62	com/tencent/xweb/WebView:getContext	()Landroid/content/Context;
    //   479: invokestatic 225	android/view/LayoutInflater:from	(Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   482: ldc 226
    //   484: aconst_null
    //   485: invokevirtual 230	android/view/LayoutInflater:inflate	(ILandroid/view/ViewGroup;)Landroid/view/View;
    //   488: checkcast 232	android/view/ViewGroup
    //   491: putfield 236	com/tencent/xweb/extension/video/d:ANF	Landroid/view/ViewGroup;
    //   494: aload 5
    //   496: getfield 236	com/tencent/xweb/extension/video/d:ANF	Landroid/view/ViewGroup;
    //   499: bipush 8
    //   501: invokevirtual 239	android/view/ViewGroup:setVisibility	(I)V
    //   504: aload 5
    //   506: new 241	com/tencent/xweb/extension/video/c
    //   509: dup
    //   510: aload 5
    //   512: getfield 236	com/tencent/xweb/extension/video/d:ANF	Landroid/view/ViewGroup;
    //   515: ldc 242
    //   517: invokevirtual 246	android/view/ViewGroup:findViewById	(I)Landroid/view/View;
    //   520: checkcast 148	android/widget/FrameLayout
    //   523: new 248	com/tencent/xweb/extension/video/d$12
    //   526: dup
    //   527: aload 5
    //   529: invokespecial 249	com/tencent/xweb/extension/video/d$12:<init>	(Lcom/tencent/xweb/extension/video/d;)V
    //   532: invokespecial 252	com/tencent/xweb/extension/video/c:<init>	(Landroid/widget/FrameLayout;Lcom/tencent/xweb/extension/video/c$a;)V
    //   535: putfield 256	com/tencent/xweb/extension/video/d:ANP	Lcom/tencent/xweb/extension/video/c;
    //   538: aload 5
    //   540: aload 5
    //   542: getfield 236	com/tencent/xweb/extension/video/d:ANF	Landroid/view/ViewGroup;
    //   545: ldc_w 257
    //   548: invokevirtual 246	android/view/ViewGroup:findViewById	(I)Landroid/view/View;
    //   551: checkcast 259	android/widget/ProgressBar
    //   554: putfield 263	com/tencent/xweb/extension/video/d:ANH	Landroid/widget/ProgressBar;
    //   557: aload 5
    //   559: aload 5
    //   561: getfield 236	com/tencent/xweb/extension/video/d:ANF	Landroid/view/ViewGroup;
    //   564: ldc_w 264
    //   567: invokevirtual 246	android/view/ViewGroup:findViewById	(I)Landroid/view/View;
    //   570: checkcast 266	android/widget/TextView
    //   573: putfield 270	com/tencent/xweb/extension/video/d:ANI	Landroid/widget/TextView;
    //   576: aload 5
    //   578: aload 5
    //   580: getfield 236	com/tencent/xweb/extension/video/d:ANF	Landroid/view/ViewGroup;
    //   583: ldc_w 271
    //   586: invokevirtual 246	android/view/ViewGroup:findViewById	(I)Landroid/view/View;
    //   589: checkcast 266	android/widget/TextView
    //   592: putfield 274	com/tencent/xweb/extension/video/d:ANJ	Landroid/widget/TextView;
    //   595: aload 5
    //   597: aload 5
    //   599: getfield 236	com/tencent/xweb/extension/video/d:ANF	Landroid/view/ViewGroup;
    //   602: ldc_w 275
    //   605: invokevirtual 246	android/view/ViewGroup:findViewById	(I)Landroid/view/View;
    //   608: checkcast 277	android/widget/ImageView
    //   611: putfield 281	com/tencent/xweb/extension/video/d:ANM	Landroid/widget/ImageView;
    //   614: aload 5
    //   616: aload 5
    //   618: getfield 236	com/tencent/xweb/extension/video/d:ANF	Landroid/view/ViewGroup;
    //   621: ldc_w 282
    //   624: invokevirtual 246	android/view/ViewGroup:findViewById	(I)Landroid/view/View;
    //   627: checkcast 284	com/tencent/xweb/extension/video/VideoStatusLayout
    //   630: putfield 288	com/tencent/xweb/extension/video/d:ANG	Lcom/tencent/xweb/extension/video/VideoStatusLayout;
    //   633: aload 5
    //   635: aload 5
    //   637: getfield 236	com/tencent/xweb/extension/video/d:ANF	Landroid/view/ViewGroup;
    //   640: ldc_w 289
    //   643: invokevirtual 246	android/view/ViewGroup:findViewById	(I)Landroid/view/View;
    //   646: checkcast 291	com/tencent/xweb/extension/video/ClickableFrameLayout
    //   649: putfield 295	com/tencent/xweb/extension/video/d:ANK	Lcom/tencent/xweb/extension/video/ClickableFrameLayout;
    //   652: aload 5
    //   654: getfield 295	com/tencent/xweb/extension/video/d:ANK	Lcom/tencent/xweb/extension/video/ClickableFrameLayout;
    //   657: aload 5
    //   659: getfield 207	com/tencent/xweb/extension/video/d:Mh	Landroid/view/GestureDetector;
    //   662: invokevirtual 299	com/tencent/xweb/extension/video/ClickableFrameLayout:setGestureDetector	(Landroid/view/GestureDetector;)V
    //   665: aload 5
    //   667: getfield 295	com/tencent/xweb/extension/video/d:ANK	Lcom/tencent/xweb/extension/video/ClickableFrameLayout;
    //   670: new 301	com/tencent/xweb/extension/video/d$14
    //   673: dup
    //   674: aload 5
    //   676: invokespecial 302	com/tencent/xweb/extension/video/d$14:<init>	(Lcom/tencent/xweb/extension/video/d;)V
    //   679: invokevirtual 306	com/tencent/xweb/extension/video/ClickableFrameLayout:setOnTouchListener	(Landroid/view/View$OnTouchListener;)V
    //   682: aload 5
    //   684: aload 5
    //   686: getfield 236	com/tencent/xweb/extension/video/d:ANF	Landroid/view/ViewGroup;
    //   689: ldc_w 307
    //   692: invokevirtual 246	android/view/ViewGroup:findViewById	(I)Landroid/view/View;
    //   695: checkcast 277	android/widget/ImageView
    //   698: putfield 310	com/tencent/xweb/extension/video/d:ANN	Landroid/widget/ImageView;
    //   701: aload 5
    //   703: getfield 310	com/tencent/xweb/extension/video/d:ANN	Landroid/widget/ImageView;
    //   706: new 312	com/tencent/xweb/extension/video/d$15
    //   709: dup
    //   710: aload 5
    //   712: invokespecial 313	com/tencent/xweb/extension/video/d$15:<init>	(Lcom/tencent/xweb/extension/video/d;)V
    //   715: invokevirtual 317	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   718: aload 5
    //   720: aload 5
    //   722: getfield 236	com/tencent/xweb/extension/video/d:ANF	Landroid/view/ViewGroup;
    //   725: ldc_w 318
    //   728: invokevirtual 246	android/view/ViewGroup:findViewById	(I)Landroid/view/View;
    //   731: checkcast 320	android/widget/LinearLayout
    //   734: putfield 324	com/tencent/xweb/extension/video/d:ANL	Landroid/widget/LinearLayout;
    //   737: aload 5
    //   739: getfield 324	com/tencent/xweb/extension/video/d:ANL	Landroid/widget/LinearLayout;
    //   742: iconst_4
    //   743: invokevirtual 325	android/widget/LinearLayout:setVisibility	(I)V
    //   746: aload 5
    //   748: aload 5
    //   750: getfield 236	com/tencent/xweb/extension/video/d:ANF	Landroid/view/ViewGroup;
    //   753: ldc_w 326
    //   756: invokevirtual 246	android/view/ViewGroup:findViewById	(I)Landroid/view/View;
    //   759: checkcast 277	android/widget/ImageView
    //   762: putfield 329	com/tencent/xweb/extension/video/d:ANO	Landroid/widget/ImageView;
    //   765: aload 5
    //   767: getfield 329	com/tencent/xweb/extension/video/d:ANO	Landroid/widget/ImageView;
    //   770: new 331	com/tencent/xweb/extension/video/d$16
    //   773: dup
    //   774: aload 5
    //   776: invokespecial 332	com/tencent/xweb/extension/video/d$16:<init>	(Lcom/tencent/xweb/extension/video/d;)V
    //   779: invokevirtual 317	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   782: ldc 15
    //   784: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   787: aload 5
    //   789: astore_0
    //   790: goto -661 -> 129
    //   793: astore 5
    //   795: ldc 29
    //   797: new 334	java/lang/StringBuilder
    //   800: dup
    //   801: ldc_w 336
    //   804: invokespecial 339	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   807: aload 5
    //   809: invokevirtual 343	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   812: invokevirtual 347	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   815: invokevirtual 350	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   818: invokestatic 120	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   821: goto -576 -> 245
    //   824: astore 4
    //   826: goto -626 -> 200
    //   829: aconst_null
    //   830: astore 4
    //   832: goto -640 -> 192
    //
    // Exception table:
    //   from	to	target	type
    //   173	178	195	java/lang/ClassNotFoundException
    //   36	75	793	java/lang/Exception
    //   80	87	793	java/lang/Exception
    //   87	121	793	java/lang/Exception
    //   238	245	793	java/lang/Exception
    //   183	192	824	java/lang/ClassNotFoundException
  }

  private static ClassLoader dUv()
  {
    ClassLoader localClassLoader = null;
    AppMethodBeat.i(84638);
    if (mClassLoader != null)
    {
      localClassLoader = mClassLoader;
      AppMethodBeat.o(84638);
    }
    while (true)
    {
      return localClassLoader;
      try
      {
        int i = XWalkEnvironment.getAvailableVersion();
        if (i == -1)
        {
          Log.i("VideoNativeInterface", "getXWalkClassLoader version = -1");
          AppMethodBeat.o(84638);
        }
        else
        {
          String str1 = XWalkEnvironment.getExtractedCoreDir(i);
          String str2 = XWalkEnvironment.getClassDexFilePath(i);
          Object localObject = new java/io/File;
          ((File)localObject).<init>(str2);
          boolean bool = ((File)localObject).exists();
          if (!bool)
          {
            AppMethodBeat.o(84638);
          }
          else
          {
            String str3 = XWalkEnvironment.getOptimizedDexDir(i);
            localObject = ClassLoader.getSystemClassLoader();
            DexClassLoader localDexClassLoader = new dalvik/system/DexClassLoader;
            localDexClassLoader.<init>(str2, str3, str1, (ClassLoader)localObject);
            mClassLoader = localDexClassLoader;
            localClassLoader = mClassLoader;
            AppMethodBeat.o(84638);
          }
        }
      }
      catch (Exception localException)
      {
        Log.e("VideoNativeInterface", "getXWalkClassLoader error:" + localException.getMessage());
        AppMethodBeat.o(84638);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.e
 * JD-Core Version:    0.6.2
 */