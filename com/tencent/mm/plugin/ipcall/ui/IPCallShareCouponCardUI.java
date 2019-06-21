package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.ipcall.a.e.e;
import com.tencent.mm.protocal.protobuf.aqq;
import com.tencent.mm.protocal.protobuf.csc;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.i.a.a;
import com.tencent.mm.ui.i.a.c;
import com.tencent.mm.ui.q;
import java.util.HashMap;

public class IPCallShareCouponCardUI extends MMActivity
  implements f, a.a, com.tencent.mm.ui.i.a.b
{
  private String eeO;
  private ProgressDialog ehJ;
  private int mFrom;
  private String mTitle;
  private ProgressDialog nBv;
  private TextView nED;
  private TextView nEE;
  private TextView nEF;
  private TextView nEG;
  private Button nEH;
  private ImageView nEI;
  private com.tencent.mm.ui.i.a nEJ;
  private ProgressDialog nEK;
  private i nEL;
  private ImageView nEM;
  private ProgressBar nEN;
  private e nEO;
  private String nEP;
  private String nEQ;
  private String nER;
  private String nES;
  private String nET;
  private String nEU;
  private String nEV;
  private String nEW;
  private String nEX;
  private csc nEY;
  private String nEZ;
  private View nFa;
  private View qQ;

  public IPCallShareCouponCardUI()
  {
    AppMethodBeat.i(22297);
    this.nEJ = new com.tencent.mm.ui.i.a();
    this.ehJ = null;
    this.nEK = null;
    this.nEL = null;
    this.nBv = null;
    this.nEM = null;
    this.nEN = null;
    this.nEO = new e();
    this.nEP = null;
    this.eeO = null;
    this.nEQ = null;
    this.mTitle = null;
    this.nER = null;
    this.nES = null;
    this.nET = null;
    this.nEU = null;
    this.nEV = null;
    this.nEW = null;
    this.nEX = null;
    this.nEY = null;
    this.nEZ = null;
    this.mFrom = 0;
    AppMethodBeat.o(22297);
  }

  // ERROR //
  private static byte[] Pj(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: sipush 22309
    //   5: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: invokestatic 128	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   11: pop
    //   12: invokestatic 134	com/tencent/mm/model/c:XW	()Ljava/lang/String;
    //   15: astore_2
    //   16: invokestatic 128	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   19: pop
    //   20: aload_2
    //   21: invokestatic 137	com/tencent/mm/model/c:XX	()Ljava/lang/String;
    //   24: ldc 139
    //   26: aload_0
    //   27: invokevirtual 145	java/lang/String:getBytes	()[B
    //   30: invokestatic 151	com/tencent/mm/a/g:x	([B)Ljava/lang/String;
    //   33: ldc 153
    //   35: invokestatic 159	com/tencent/mm/sdk/platformtools/j:g	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   38: astore_0
    //   39: aload_0
    //   40: invokestatic 165	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   43: ifeq +20 -> 63
    //   46: ldc 167
    //   48: ldc 169
    //   50: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   53: sipush 22309
    //   56: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   59: aload_1
    //   60: astore_0
    //   61: aload_0
    //   62: areturn
    //   63: new 177	java/io/RandomAccessFile
    //   66: astore_2
    //   67: aload_2
    //   68: aload_0
    //   69: ldc 179
    //   71: invokespecial 181	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   74: aload_2
    //   75: astore_0
    //   76: aload_2
    //   77: invokevirtual 185	java/io/RandomAccessFile:length	()J
    //   80: l2i
    //   81: newarray byte
    //   83: astore_3
    //   84: aload_2
    //   85: astore_0
    //   86: aload_2
    //   87: aload_3
    //   88: invokevirtual 189	java/io/RandomAccessFile:read	([B)I
    //   91: pop
    //   92: aload_2
    //   93: invokevirtual 192	java/io/RandomAccessFile:close	()V
    //   96: sipush 22309
    //   99: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   102: aload_3
    //   103: astore_0
    //   104: goto -43 -> 61
    //   107: astore_3
    //   108: aconst_null
    //   109: astore_2
    //   110: aload_2
    //   111: astore_0
    //   112: ldc 167
    //   114: aload_3
    //   115: ldc 194
    //   117: iconst_0
    //   118: anewarray 196	java/lang/Object
    //   121: invokestatic 200	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: aload_2
    //   125: ifnull +7 -> 132
    //   128: aload_2
    //   129: invokevirtual 192	java/io/RandomAccessFile:close	()V
    //   132: sipush 22309
    //   135: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   138: aload_1
    //   139: astore_0
    //   140: goto -79 -> 61
    //   143: astore_2
    //   144: aconst_null
    //   145: astore_0
    //   146: aload_0
    //   147: ifnull +7 -> 154
    //   150: aload_0
    //   151: invokevirtual 192	java/io/RandomAccessFile:close	()V
    //   154: sipush 22309
    //   157: invokestatic 117	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   160: aload_2
    //   161: athrow
    //   162: astore_0
    //   163: goto -67 -> 96
    //   166: astore_0
    //   167: goto -35 -> 132
    //   170: astore_0
    //   171: goto -17 -> 154
    //   174: astore_2
    //   175: goto -29 -> 146
    //   178: astore_3
    //   179: goto -69 -> 110
    //
    // Exception table:
    //   from	to	target	type
    //   63	74	107	java/lang/Exception
    //   63	74	143	finally
    //   92	96	162	java/lang/Exception
    //   128	132	166	java/lang/Exception
    //   150	154	170	java/lang/Exception
    //   76	84	174	finally
    //   86	92	174	finally
    //   112	124	174	finally
    //   76	84	178	java/lang/Exception
    //   86	92	178	java/lang/Exception
  }

  public static String Q(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(22303);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(8), paramContext.getString(2131300767));
    localHashMap.put(Integer.valueOf(0), paramContext.getString(2131305630));
    localHashMap.put(Integer.valueOf(1), paramContext.getString(2131300772));
    localHashMap.put(Integer.valueOf(3), paramContext.getString(2131300768));
    localHashMap.put(Integer.valueOf(2), paramContext.getString(2131300771));
    localHashMap.put(Integer.valueOf(5), paramContext.getString(2131300773));
    localHashMap.put(Integer.valueOf(4), paramContext.getString(2131300774));
    localHashMap.put(Integer.valueOf(6), paramContext.getString(2131300770));
    localHashMap.put(Integer.valueOf(7), paramContext.getString(2131300769));
    if (localHashMap.containsKey(Integer.valueOf(paramInt)))
    {
      paramContext = (String)localHashMap.get(Integer.valueOf(paramInt));
      AppMethodBeat.o(22303);
    }
    while (true)
    {
      return paramContext;
      paramContext = null;
      AppMethodBeat.o(22303);
    }
  }

  public static void a(Context paramContext, int paramInt, TextView paramTextView, ImageView paramImageView)
  {
    AppMethodBeat.i(22302);
    paramContext = Q(paramContext, paramInt);
    if (paramContext != null)
      paramTextView.setText(paramContext);
    paramInt = xu(paramInt);
    if (paramInt != -1)
      paramImageView.setImageResource(paramInt);
    AppMethodBeat.o(22302);
  }

  private static boolean aD(Context paramContext, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(22305);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(22305);
    while (true)
    {
      return bool;
      try
      {
        paramContext.getPackageManager().getApplicationInfo(paramString, 8192);
        bool = true;
        AppMethodBeat.o(22305);
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        AppMethodBeat.o(22305);
      }
    }
  }

  private static Bitmap bIu()
  {
    AppMethodBeat.i(22308);
    Object localObject = Pj(r.Yz());
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(22308);
    }
    while (true)
    {
      return localObject;
      localObject = d.bQ((byte[])localObject);
      AppMethodBeat.o(22308);
    }
  }

  private void w(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(22310);
    this.nFa = View.inflate(this.mController.ylL, 2130969183, null);
    EditText localEditText = (EditText)this.nFa.findViewById(2131822921);
    this.nEM = ((ImageView)this.nFa.findViewById(2131822920));
    this.nEN = ((ProgressBar)this.nFa.findViewById(2131821605));
    localEditText.setText(paramString1);
    Object localObject = bIu();
    if (localObject == null)
    {
      localObject = r.Yz();
      aw.ZK();
      localObject = new com.tencent.mm.bb.a((String)localObject, bo.h((Integer)com.tencent.mm.model.c.Ry().get(66561, null)));
      aw.Rg().a((com.tencent.mm.ai.m)localObject, 0);
      this.nEN.setVisibility(0);
    }
    while (true)
    {
      com.tencent.mm.pluginsdk.ui.applet.g.a(this.mController, paramString2, this.nFa, getResources().getString(2131297041), new IPCallShareCouponCardUI.5(this, localEditText, paramString1, paramInt));
      AppMethodBeat.o(22310);
      return;
      if (this.nEM != null)
        this.nEM.setImageBitmap((Bitmap)localObject);
    }
  }

  public static int xu(int paramInt)
  {
    AppMethodBeat.i(22304);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(8), Integer.valueOf(2131230979));
    localHashMap.put(Integer.valueOf(0), Integer.valueOf(2131231028));
    localHashMap.put(Integer.valueOf(1), Integer.valueOf(2131231027));
    localHashMap.put(Integer.valueOf(3), Integer.valueOf(2131230980));
    localHashMap.put(Integer.valueOf(2), Integer.valueOf(2131231029));
    localHashMap.put(Integer.valueOf(5), Integer.valueOf(2131231030));
    localHashMap.put(Integer.valueOf(4), Integer.valueOf(2131231031));
    localHashMap.put(Integer.valueOf(6), Integer.valueOf(2131230981));
    localHashMap.put(Integer.valueOf(7), Integer.valueOf(2131231026));
    if (localHashMap.containsKey(Integer.valueOf(paramInt)))
    {
      paramInt = ((Integer)localHashMap.get(Integer.valueOf(paramInt))).intValue();
      AppMethodBeat.o(22304);
    }
    while (true)
    {
      return paramInt;
      paramInt = -1;
      AppMethodBeat.o(22304);
    }
  }

  private void xv(int paramInt)
  {
    AppMethodBeat.i(22307);
    h.a(this.mController.ylL, paramInt, 2131297061, new IPCallShareCouponCardUI.14(this), new IPCallShareCouponCardUI.15(this));
    AppMethodBeat.o(22307);
  }

  public final void a(a.c paramc)
  {
    AppMethodBeat.i(22306);
    if (this.nEK != null)
      this.nEK.cancel();
    switch (IPCallShareCouponCardUI.8.nFi[paramc.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(22306);
      while (true)
      {
        return;
        xv(2131304134);
        AppMethodBeat.o(22306);
        continue;
        AppMethodBeat.o(22306);
      }
      xv(2131304133);
    }
  }

  public final void b(a.c paramc)
  {
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969886;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(22311);
    if ((paramInt1 == 1) && (paramIntent != null))
    {
      paramIntent = paramIntent.getStringExtra("Select_Conv_User");
      if (!bo.isNullOrNil(paramIntent))
        com.tencent.mm.pluginsdk.ui.applet.g.a(this.mController, this.mTitle, this.nEQ, this.eeO, true, getResources().getString(2131297041), new IPCallShareCouponCardUI.7(this, paramIntent));
    }
    AppMethodBeat.o(22311);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22298);
    super.onCreate(paramBundle);
    setMMTitle(2131300840);
    setBackBtn(new IPCallShareCouponCardUI.1(this));
    this.qQ = findViewById(2131824244);
    this.nED = ((TextView)findViewById(2131825044));
    this.nEE = ((TextView)findViewById(2131825045));
    this.nEF = ((TextView)findViewById(2131825047));
    this.nEG = ((TextView)findViewById(2131825048));
    this.nEH = ((Button)findViewById(2131825049));
    this.nEI = ((ImageView)findViewById(2131821043));
    this.qQ.setVisibility(8);
    com.tencent.mm.pluginsdk.ui.a.b.a(this.nEI, r.Yz(), 0.5F, false);
    paramBundle = this.mController.ylL;
    getString(2131297061);
    this.nBv = h.b(paramBundle, getString(2131300739), true, new IPCallShareCouponCardUI.9(this));
    com.tencent.mm.plugin.ipcall.a.f.b.bHU().it(false);
    this.mFrom = getIntent().getIntExtra("IPCallShareCouponCardUI_KFrom", 0);
    aw.Rg().a(257, this);
    aw.Rg().a(1804, this);
    AppMethodBeat.o(22298);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22300);
    super.onDestroy();
    aw.Rg().b(257, this);
    aw.Rg().b(1804, this);
    AppMethodBeat.o(22300);
  }

  public void onResume()
  {
    AppMethodBeat.i(22299);
    super.onResume();
    AppMethodBeat.o(22299);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(22301);
    String str;
    Object localObject1;
    label305: Object localObject2;
    if ((paramm instanceof com.tencent.mm.plugin.ipcall.a.d.g))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.qQ.setVisibility(0);
        paramString = com.tencent.mm.plugin.ipcall.b.c.bIU();
        if (paramString != null)
        {
          this.nEP = paramString.wut;
          this.eeO = paramString.Desc;
          this.nEQ = paramString.wuu;
          this.mTitle = paramString.Title;
          this.nER = paramString.nzz;
          this.nES = paramString.wuv;
          this.nEU = paramString.wuw;
          this.nEV = paramString.wux;
          this.nEW = paramString.wuy;
          this.nEX = paramString.wuA;
          this.nEY = paramString.wuz;
          this.nEZ = paramString.wuB;
        }
        this.nED.setText(this.nEX);
        this.nEE.setText(String.format(this.mController.ylL.getString(2131300833), new Object[] { this.nEP }));
        this.nEH.setOnClickListener(new IPCallShareCouponCardUI.11(this));
        this.nEF.setText(String.format(getString(2131300835), new Object[] { this.nEX }));
        paramm = this.nEG;
        str = String.format(getString(2131300834), new Object[] { this.nEX });
        localObject1 = getString(2131300839);
        if (bo.isNullOrNil((String)localObject1))
        {
          paramm.setText(str);
          if ((this.nBv != null) && (this.nBv.isShowing()))
            this.nBv.dismiss();
          AppMethodBeat.o(22301);
          return;
        }
        paramString = getString(2131300842);
        localObject2 = paramm.getPaint();
        float f1 = ((TextPaint)localObject2).measureText(str);
        float f2 = ((TextPaint)localObject2).measureText(paramString);
        paramInt2 = com.tencent.mm.bz.a.gd(this.mController.ylL);
        paramInt1 = ((LinearLayout.LayoutParams)paramm.getLayoutParams()).leftMargin;
        paramInt1 = paramInt2 - (((LinearLayout.LayoutParams)paramm.getLayoutParams()).rightMargin + paramInt1);
        paramInt2 = (int)Math.ceil(f1 / paramInt1);
        int i = (int)Math.ceil((f1 + f2) / paramInt1);
        paramInt1 = paramInt2;
        if (paramInt2 == 0)
          paramInt1 = 1;
        if (i <= paramInt1)
          break label770;
        paramString = "\n".concat(String.valueOf(paramString));
      }
    label770: 
    while (true)
    {
      paramm.setGravity(17);
      localObject2 = Spannable.Factory.getInstance().newSpannable(str + paramString);
      localObject1 = new IPCallShareCouponCardUI.6(this, (String)localObject1);
      paramInt1 = str.length();
      paramInt2 = str.length();
      ((Spannable)localObject2).setSpan(localObject1, paramInt1, paramString.length() + paramInt2, 33);
      paramm.setText((CharSequence)localObject2);
      paramm.setMovementMethod(LinkMovementMethod.getInstance());
      break;
      if ((this.nBv != null) && (this.nBv.isShowing()))
      {
        this.nBv.dismiss();
        h.a(this.mController.ylL, getString(2131300737), getString(2131300730), new IPCallShareCouponCardUI.10(this));
        AppMethodBeat.o(22301);
        break label305;
        if ((paramm instanceof com.tencent.mm.modelmulti.g))
        {
          if (this.ehJ != null)
          {
            this.ehJ.dismiss();
            this.ehJ = null;
          }
          if (com.tencent.mm.plugin.subapp.b.gkF.b(this.mController.ylL, paramInt1, paramInt2, paramString))
          {
            AppMethodBeat.o(22301);
            break label305;
          }
          if ((paramInt1 != 0) || (paramInt2 != 0))
          {
            h.g(this.mController.ylL, 2131302960, 2131297061);
            AppMethodBeat.o(22301);
            break label305;
          }
          h.bQ(this, getResources().getString(2131298422));
          AppMethodBeat.o(22301);
          break label305;
        }
        if ((paramm instanceof com.tencent.mm.bb.a))
        {
          if ((paramInt1 != 0) || (paramInt2 != 0))
          {
            AppMethodBeat.o(22301);
            break label305;
          }
          if (this.nEM != null)
          {
            if (this.nEN != null)
              this.nEN.setVisibility(8);
            this.nEM.setImageBitmap(bIu());
          }
        }
      }
      AppMethodBeat.o(22301);
      break label305;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI
 * JD-Core Version:    0.6.2
 */