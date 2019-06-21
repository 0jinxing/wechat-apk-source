package com.tencent.mm.plugin.fts.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.fts.ui.m;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class FTSMainUIEducationLayout extends LinearLayout
{
  private float hke;
  private float hkf;
  private float ibD;
  protected View.OnClickListener mJH;
  protected List<LinearLayout> mMf;
  protected Map<Integer, TextView> mMg;
  private String mMh;
  private long mMi;
  private boolean mMj;
  private TextView mMk;
  protected boolean mMl;
  private boolean mMm;
  public View.OnClickListener mMn;
  private View.OnClickListener mMo;

  public FTSMainUIEducationLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(62144);
    this.mMg = new HashMap();
    this.mMh = "";
    this.ibD = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.mMj = true;
    this.mMl = true;
    initView();
    AppMethodBeat.o(62144);
  }

  public FTSMainUIEducationLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(62145);
    this.mMg = new HashMap();
    this.mMh = "";
    this.ibD = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.mMj = true;
    this.mMl = true;
    initView();
    AppMethodBeat.o(62145);
  }

  private void bBu()
  {
    AppMethodBeat.i(62149);
    Iterator localIterator = this.mMf.iterator();
    while (localIterator.hasNext())
      removeView((LinearLayout)localIterator.next());
    this.mMf.clear();
    this.mMg.clear();
    this.mMh = "";
    AppMethodBeat.o(62149);
  }

  private void bBv()
  {
    AppMethodBeat.i(62151);
    a(getContext().getString(2131302840), null, getContext().getString(2131302836), null, getContext().getString(2131302837), null, a.al(getContext(), 2131427813));
    bBw();
    AppMethodBeat.o(62151);
  }

  private void bU(Object paramObject)
  {
    AppMethodBeat.i(62153);
    String str;
    if ((paramObject != null) && ((paramObject instanceof JSONObject)))
    {
      str = ((JSONObject)paramObject).optString("businessType");
      if (!bo.isNullOrNil(str))
        if (this.mMh != null)
          break label115;
    }
    label115: for (paramObject = ""; ; paramObject = this.mMh)
    {
      this.mMh = paramObject;
      if (this.mMh.length() > 0)
        this.mMh += "|";
      this.mMh += str;
      AppMethodBeat.o(62153);
      return;
    }
  }

  private void initView()
  {
    AppMethodBeat.i(62146);
    setOrientation(1);
    this.mMf = new ArrayList();
    AppMethodBeat.o(62146);
  }

  public final void H(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(62156);
    ab.v("MicroMsg.FTS.FTSMainUIEducationLayout", "action %d", new Object[] { Integer.valueOf(paramMotionEvent.getAction()) });
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 1:
    case 9:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(62156);
      while (true)
      {
        label77: return;
        Iterator localIterator = this.mMg.values().iterator();
        TextView localTextView;
        int[] arrayOfInt;
        do
        {
          if (!localIterator.hasNext())
            break;
          localTextView = (TextView)localIterator.next();
          arrayOfInt = new int[2];
          localTextView.getLocationOnScreen(arrayOfInt);
        }
        while (!new Rect(arrayOfInt[0], arrayOfInt[1], arrayOfInt[0] + localTextView.getWidth(), arrayOfInt[1] + localTextView.getHeight()).contains((int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY()));
        while (localTextView != null)
        {
          this.mMk = localTextView;
          this.hke = paramMotionEvent.getRawX();
          this.hkf = paramMotionEvent.getRawY();
          this.mMi = System.currentTimeMillis();
          AppMethodBeat.o(62156);
          break label77;
          localTextView = null;
        }
        if (this.mMk == null)
          break;
        float f1 = paramMotionEvent.getRawX() - this.hke;
        float f2 = paramMotionEvent.getRawY() - this.hkf;
        ab.v("MicroMsg.FTS.FTSMainUIEducationLayout", "action up deltaX %f, deltaY %f, time interval %d", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Long.valueOf(System.currentTimeMillis() - this.mMi) });
        if ((Math.abs(f1) <= this.ibD) && (Math.abs(f2) <= this.ibD) && (System.currentTimeMillis() - this.mMi < 200L) && (this.mJH != null))
          this.mJH.onClick(this.mMk);
        this.mMk = null;
        AppMethodBeat.o(62156);
      }
      this.mMk = null;
    }
  }

  public final void S(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(62148);
    bBu();
    try
    {
      if (!T(paramJSONObject))
        bBv();
      AppMethodBeat.o(62148);
      return;
    }
    catch (Exception paramJSONObject)
    {
      while (true)
      {
        bBv();
        AppMethodBeat.o(62148);
      }
    }
  }

  protected boolean T(JSONObject paramJSONObject)
  {
    boolean bool = false;
    AppMethodBeat.i(62150);
    if (paramJSONObject == null)
      AppMethodBeat.o(62150);
    while (true)
    {
      return bool;
      paramJSONObject.optString("title");
      JSONArray localJSONArray = paramJSONObject.optJSONArray("items");
      if (localJSONArray == null)
      {
        AppMethodBeat.o(62150);
      }
      else
      {
        int i;
        int j;
        Object localObject1;
        Object localObject2;
        String str;
        label90: JSONObject localJSONObject;
        if (aa.gw(ah.getContext()).equalsIgnoreCase("en"))
        {
          i = a.al(getContext(), 2131427508);
          j = 0;
          localObject1 = null;
          localObject2 = null;
          str = null;
          paramJSONObject = null;
          if (j >= Math.min(localJSONArray.length(), 9))
            break label214;
          localJSONObject = localJSONArray.optJSONObject(j);
          if (j % 3 != 0)
            break label152;
          paramJSONObject = localJSONObject.optString("hotword");
          localObject2 = localJSONObject;
        }
        while (true)
        {
          j++;
          break label90;
          i = a.al(getContext(), 2131427813);
          break;
          label152: if (j % 3 == 1)
          {
            str = localJSONObject.optString("hotword");
            localObject1 = localJSONObject;
          }
          else
          {
            a(paramJSONObject, localObject2, str, localObject1, localJSONObject.optString("hotword"), localJSONObject, i);
            localObject1 = null;
            localObject2 = null;
            str = null;
            paramJSONObject = null;
          }
        }
        label214: if ((paramJSONObject != null) && (localObject2 != null))
          a(paramJSONObject, localObject2, str, localObject1, null, null, i);
        AppMethodBeat.o(62150);
        bool = true;
      }
    }
  }

  protected final void a(String paramString1, Object paramObject1, String paramString2, Object paramObject2, String paramString3, Object paramObject3, int paramInt)
  {
    AppMethodBeat.i(62152);
    ab.i("MicroMsg.FTS.FTSMainUIEducationLayout", "addCellLayout %s %s %s", new Object[] { paramString1, paramString2, paramString3 });
    if (!bo.isNullOrNil(paramString1))
    {
      LinearLayout localLinearLayout = (LinearLayout)inflate(getContext(), 2130969630, null);
      TextView localTextView = (TextView)localLinearLayout.findViewById(2131824245);
      localTextView.setText(paramString1);
      localTextView.setTag(paramObject1);
      localTextView.setVisibility(0);
      localTextView.setOnClickListener(this.mJH);
      localTextView.setClickable(this.mMj);
      this.mMg.put(Integer.valueOf(m.a((JSONObject)paramObject1, paramString1, getContext())), localTextView);
      bU(paramObject1);
      if (!bo.isNullOrNil(paramString2))
      {
        paramObject1 = (TextView)localLinearLayout.findViewById(2131824247);
        paramObject1.setText(paramString2);
        paramObject1.setTag(paramObject2);
        paramObject1.setVisibility(0);
        paramObject1.setOnClickListener(this.mJH);
        paramObject1.setClickable(this.mMj);
        paramString1 = localLinearLayout.findViewById(2131824246);
        paramString1.getLayoutParams().height = paramInt;
        paramString1.setVisibility(0);
        this.mMg.put(Integer.valueOf(m.a((JSONObject)paramObject2, paramString2, getContext())), paramObject1);
        bU(paramObject2);
        if (!bo.isNullOrNil(paramString3))
        {
          paramString1 = (TextView)localLinearLayout.findViewById(2131824249);
          paramString1.setText(paramString3);
          paramString1.setTag(paramObject3);
          paramString1.setVisibility(0);
          paramString1.setOnClickListener(this.mJH);
          paramString1.setClickable(this.mMj);
          paramObject1 = localLinearLayout.findViewById(2131824248);
          paramObject1.getLayoutParams().height = paramInt;
          paramObject1.setVisibility(0);
          this.mMg.put(Integer.valueOf(m.a((JSONObject)paramObject3, paramString3, getContext())), paramString1);
          bU(paramObject3);
        }
      }
      this.mMf.add(localLinearLayout);
      addView(localLinearLayout);
    }
    AppMethodBeat.o(62152);
  }

  protected void bBw()
  {
  }

  // ERROR //
  public final void cu()
  {
    // Byte code:
    //   0: ldc_w 400
    //   3: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokespecial 287	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:bBu	()V
    //   10: aload_0
    //   11: ldc_w 402
    //   14: invokestatic 408	com/tencent/mm/plugin/websearch/api/ac:adL	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   17: invokevirtual 291	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:T	(Lorg/json/JSONObject;)Z
    //   20: ifne +7 -> 27
    //   23: aload_0
    //   24: invokespecial 293	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:bBv	()V
    //   27: aload_0
    //   28: getfield 70	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:mMl	Z
    //   31: ifeq +91 -> 122
    //   34: ldc_w 410
    //   37: invokestatic 408	com/tencent/mm/plugin/websearch/api/ac:adL	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   40: ldc_w 298
    //   43: invokevirtual 302	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   46: iconst_0
    //   47: invokevirtual 328	org/json/JSONArray:optJSONObject	(I)Lorg/json/JSONObject;
    //   50: ldc_w 330
    //   53: invokevirtual 147	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   56: astore_1
    //   57: aload_1
    //   58: invokestatic 153	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   61: ifne +61 -> 122
    //   64: aload_0
    //   65: invokevirtual 54	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:getContext	()Landroid/content/Context;
    //   68: ldc_w 411
    //   71: aconst_null
    //   72: invokestatic 340	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:inflate	(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   75: checkcast 4	android/widget/LinearLayout
    //   78: astore_2
    //   79: aload_2
    //   80: ldc_w 412
    //   83: invokevirtual 345	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   86: checkcast 213	android/widget/TextView
    //   89: aload_1
    //   90: invokevirtual 349	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   93: aload_2
    //   94: aload_0
    //   95: getfield 414	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:mMn	Landroid/view/View$OnClickListener;
    //   98: invokevirtual 415	android/widget/LinearLayout:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   101: aload_2
    //   102: aload_1
    //   103: invokevirtual 416	android/widget/LinearLayout:setTag	(Ljava/lang/Object;)V
    //   106: aload_0
    //   107: aload_2
    //   108: invokevirtual 398	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:addView	(Landroid/view/View;)V
    //   111: aload_0
    //   112: getfield 85	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:mMf	Ljava/util/List;
    //   115: aload_2
    //   116: invokeinterface 395 2 0
    //   121: pop
    //   122: aload_0
    //   123: getfield 418	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:mMm	Z
    //   126: ifeq +446 -> 572
    //   129: ldc_w 420
    //   132: invokestatic 426	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   135: checkcast 420	com/tencent/mm/plugin/appbrand/service/i
    //   138: invokeinterface 430 1 0
    //   143: astore_2
    //   144: aload_2
    //   145: getfield 434	com/tencent/mm/plugin/appbrand/service/i$b:items	Ljava/util/List;
    //   148: ifnull +424 -> 572
    //   151: aload_2
    //   152: getfield 434	com/tencent/mm/plugin/appbrand/service/i$b:items	Ljava/util/List;
    //   155: invokeinterface 437 1 0
    //   160: ifle +412 -> 572
    //   163: aload_0
    //   164: invokevirtual 54	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:getContext	()Landroid/content/Context;
    //   167: ldc_w 438
    //   170: aconst_null
    //   171: invokestatic 340	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:inflate	(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   174: checkcast 4	android/widget/LinearLayout
    //   177: astore_3
    //   178: aload_3
    //   179: ldc_w 439
    //   182: invokevirtual 345	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   185: checkcast 213	android/widget/TextView
    //   188: aload_2
    //   189: getfield 442	com/tencent/mm/plugin/appbrand/service/i$b:cEh	Ljava/lang/String;
    //   192: invokevirtual 349	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   195: iconst_4
    //   196: anewarray 444	android/widget/ImageView
    //   199: astore 4
    //   201: aload 4
    //   203: iconst_0
    //   204: aload_3
    //   205: ldc_w 445
    //   208: invokevirtual 345	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   211: checkcast 444	android/widget/ImageView
    //   214: aastore
    //   215: aload 4
    //   217: iconst_1
    //   218: aload_3
    //   219: ldc_w 446
    //   222: invokevirtual 345	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   225: checkcast 444	android/widget/ImageView
    //   228: aastore
    //   229: aload 4
    //   231: iconst_2
    //   232: aload_3
    //   233: ldc_w 447
    //   236: invokevirtual 345	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   239: checkcast 444	android/widget/ImageView
    //   242: aastore
    //   243: aload 4
    //   245: iconst_3
    //   246: aload_3
    //   247: ldc_w 448
    //   250: invokevirtual 345	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   253: checkcast 444	android/widget/ImageView
    //   256: aastore
    //   257: aload_3
    //   258: ldc_w 449
    //   261: invokevirtual 345	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   264: checkcast 444	android/widget/ImageView
    //   267: astore 5
    //   269: iconst_0
    //   270: istore 6
    //   272: iload 6
    //   274: aload_2
    //   275: getfield 434	com/tencent/mm/plugin/appbrand/service/i$b:items	Ljava/util/List;
    //   278: invokeinterface 437 1 0
    //   283: if_icmpge +117 -> 400
    //   286: iload 6
    //   288: iconst_4
    //   289: if_icmpge +111 -> 400
    //   292: aload_2
    //   293: getfield 434	com/tencent/mm/plugin/appbrand/service/i$b:items	Ljava/util/List;
    //   296: iload 6
    //   298: invokeinterface 452 2 0
    //   303: checkcast 454	com/tencent/mm/plugin/appbrand/service/i$c
    //   306: astore 7
    //   308: new 456	com/tencent/mm/at/a/a/c$a
    //   311: dup
    //   312: invokespecial 457	com/tencent/mm/at/a/a/c$a:<init>	()V
    //   315: astore_1
    //   316: aload_1
    //   317: ldc_w 458
    //   320: putfield 461	com/tencent/mm/at/a/a/c$a:ePT	I
    //   323: aload_1
    //   324: iconst_1
    //   325: putfield 464	com/tencent/mm/at/a/a/c$a:eQf	Z
    //   328: invokestatic 470	com/tencent/mm/at/o:ahp	()Lcom/tencent/mm/at/a/a;
    //   331: aload 7
    //   333: getfield 473	com/tencent/mm/plugin/appbrand/service/i$c:haO	Ljava/lang/String;
    //   336: aload 4
    //   338: iload 6
    //   340: aaload
    //   341: aload_1
    //   342: invokevirtual 477	com/tencent/mm/at/a/a/c$a:ahG	()Lcom/tencent/mm/at/a/a/c;
    //   345: invokevirtual 482	com/tencent/mm/at/a/a:a	(Ljava/lang/String;Landroid/widget/ImageView;Lcom/tencent/mm/at/a/a/c;)V
    //   348: aload 4
    //   350: iload 6
    //   352: aaload
    //   353: iconst_0
    //   354: invokevirtual 483	android/widget/ImageView:setVisibility	(I)V
    //   357: aload 4
    //   359: iload 6
    //   361: aaload
    //   362: aload 7
    //   364: invokevirtual 484	android/widget/ImageView:setTag	(Ljava/lang/Object;)V
    //   367: aload_0
    //   368: getfield 486	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:mMo	Landroid/view/View$OnClickListener;
    //   371: ifnull +15 -> 386
    //   374: aload 4
    //   376: iload 6
    //   378: aaload
    //   379: aload_0
    //   380: getfield 486	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:mMo	Landroid/view/View$OnClickListener;
    //   383: invokevirtual 487	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   386: iinc 6 1
    //   389: goto -117 -> 272
    //   392: astore_1
    //   393: aload_0
    //   394: invokespecial 293	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:bBv	()V
    //   397: goto -370 -> 27
    //   400: aload_2
    //   401: getfield 434	com/tencent/mm/plugin/appbrand/service/i$b:items	Ljava/util/List;
    //   404: invokeinterface 437 1 0
    //   409: ifle +26 -> 435
    //   412: aload 5
    //   414: iconst_0
    //   415: invokevirtual 483	android/widget/ImageView:setVisibility	(I)V
    //   418: aload 5
    //   420: ldc_w 489
    //   423: invokevirtual 484	android/widget/ImageView:setTag	(Ljava/lang/Object;)V
    //   426: aload 5
    //   428: aload_0
    //   429: getfield 486	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:mMo	Landroid/view/View$OnClickListener;
    //   432: invokevirtual 487	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   435: aload_0
    //   436: aload_3
    //   437: invokevirtual 398	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:addView	(Landroid/view/View;)V
    //   440: aload_0
    //   441: getfield 85	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:mMf	Ljava/util/List;
    //   444: aload_3
    //   445: invokeinterface 395 2 0
    //   450: pop
    //   451: aload_2
    //   452: getfield 434	com/tencent/mm/plugin/appbrand/service/i$b:items	Ljava/util/List;
    //   455: invokeinterface 91 1 0
    //   460: astore 4
    //   462: ldc 48
    //   464: astore_1
    //   465: aload 4
    //   467: invokeinterface 97 1 0
    //   472: ifeq +47 -> 519
    //   475: aload 4
    //   477: invokeinterface 101 1 0
    //   482: checkcast 454	com/tencent/mm/plugin/appbrand/service/i$c
    //   485: astore 7
    //   487: new 160	java/lang/StringBuilder
    //   490: dup
    //   491: invokespecial 161	java/lang/StringBuilder:<init>	()V
    //   494: aload_1
    //   495: invokevirtual 165	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   498: aload 7
    //   500: getfield 492	com/tencent/mm/plugin/appbrand/service/i$c:username	Ljava/lang/String;
    //   503: invokevirtual 165	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   506: ldc_w 494
    //   509: invokevirtual 165	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: invokevirtual 171	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   515: astore_1
    //   516: goto -51 -> 465
    //   519: getstatic 500	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   522: sipush 14630
    //   525: iconst_5
    //   526: anewarray 187	java/lang/Object
    //   529: dup
    //   530: iconst_0
    //   531: getstatic 505	com/tencent/mm/plugin/fts/a/e:mCM	Ljava/lang/String;
    //   534: aastore
    //   535: dup
    //   536: iconst_1
    //   537: aload_2
    //   538: getfield 442	com/tencent/mm/plugin/appbrand/service/i$b:cEh	Ljava/lang/String;
    //   541: aastore
    //   542: dup
    //   543: iconst_2
    //   544: aload_1
    //   545: aastore
    //   546: dup
    //   547: iconst_3
    //   548: aload_2
    //   549: getfield 508	com/tencent/mm/plugin/appbrand/service/i$b:iDI	I
    //   552: invokestatic 198	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   555: aastore
    //   556: dup
    //   557: iconst_4
    //   558: invokestatic 251	java/lang/System:currentTimeMillis	()J
    //   561: ldc2_w 509
    //   564: ldiv
    //   565: invokestatic 265	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   568: aastore
    //   569: invokevirtual 514	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   572: ldc_w 400
    //   575: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   578: return
    //   579: astore_1
    //   580: goto -458 -> 122
    //
    // Exception table:
    //   from	to	target	type
    //   10	27	392	java/lang/Exception
    //   27	122	579	java/lang/Exception
  }

  public String getVertBizTypes()
  {
    if (this.mMh == null);
    for (String str = ""; ; str = this.mMh)
      return str;
  }

  public void setCellClickable(boolean paramBoolean)
  {
    this.mMj = paramBoolean;
  }

  public void setNeedHotWord(boolean paramBoolean)
  {
    this.mMl = paramBoolean;
  }

  public void setNeedWXAPP(boolean paramBoolean)
  {
    this.mMm = paramBoolean;
  }

  public void setOnCellClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mJH = paramOnClickListener;
  }

  public void setOnHotwordClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mMn = paramOnClickListener;
  }

  public void setOnWxAppClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mMo = paramOnClickListener;
  }

  public void setSelected(int paramInt)
  {
    AppMethodBeat.i(62154);
    Iterator localIterator = this.mMg.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((Integer)localEntry.getKey()).intValue() == paramInt)
        ((TextView)localEntry.getValue()).setTextColor(Color.parseColor("#B5B5B5"));
      else
        ((TextView)localEntry.getValue()).setTextColor(getContext().getResources().getColor(2131690683));
    }
    AppMethodBeat.o(62154);
  }

  public final String wg(int paramInt)
  {
    AppMethodBeat.i(62155);
    Object localObject = (TextView)this.mMg.get(Integer.valueOf(paramInt));
    if (localObject == null)
    {
      localObject = "";
      AppMethodBeat.o(62155);
    }
    while (true)
    {
      return localObject;
      localObject = ((TextView)localObject).getText().toString();
      AppMethodBeat.o(62155);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.FTSMainUIEducationLayout
 * JD-Core Version:    0.6.2
 */