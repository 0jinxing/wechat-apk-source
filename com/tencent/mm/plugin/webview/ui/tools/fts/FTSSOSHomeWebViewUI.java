package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.FTSMainUIEducationLayout;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.fts.widget.FTSMainUIEducationLayoutWithAll;
import com.tencent.mm.ui.fts.widget.FTSMainUIHotWordLayout;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.f;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class FTSSOSHomeWebViewUI extends BaseSOSWebViewUI
{
  private View.OnClickListener mJH;
  private FTSMainUIEducationLayout mJe;
  private View qpb;
  private View qzN;
  private TextView titleView;
  private View uAV;
  private View uAW;
  private View uAX;
  private FTSSOSHomeWebViewUI.a uAY;
  private b uAZ;
  private String uBA;
  int uBB;
  private View.OnClickListener uBC;
  private AdapterView.OnItemClickListener uBD;
  private View.OnClickListener uBE;
  private boolean uBF;
  private c uBa;
  private d uBb;
  private float uBc;
  private FTSMainUIHotWordLayout uBd;
  private FTSMainUIEducationLayoutWithAll uBe;
  private View uBf;
  private TextView uBg;
  private View uBh;
  private View uBi;
  private View uBj;
  private FTSSOSHomeWebViewUI.b uBk;
  private int uBl;
  private boolean uBm;
  private int uBn;
  private String uBo;
  boolean uBp;
  boolean uBq;
  private int uBr;
  private int uBs;
  private String uBt;
  private WeappWebSearchFragment uBu;
  private boolean uBv;
  private View.OnClickListener uBw;
  private a.a uBx;
  private a.a uBy;
  private a.a uBz;

  public FTSSOSHomeWebViewUI()
  {
    AppMethodBeat.i(8475);
    this.uBc = 3.4028235E+38F;
    this.uBn = 0;
    this.uBo = "";
    this.uBr = 0;
    this.uBs = 0;
    this.uBt = "";
    this.mJH = new FTSSOSHomeWebViewUI.1(this);
    this.uBw = new FTSSOSHomeWebViewUI.2(this);
    this.uBx = new FTSSOSHomeWebViewUI.3(this);
    this.uBy = new FTSSOSHomeWebViewUI.4(this);
    this.uBz = new FTSSOSHomeWebViewUI.5(this);
    this.uBC = new FTSSOSHomeWebViewUI.6(this);
    this.uBD = new FTSSOSHomeWebViewUI.7(this);
    this.uBE = new FTSSOSHomeWebViewUI.8(this);
    AppMethodBeat.o(8475);
  }

  private void JB(int paramInt)
  {
    AppMethodBeat.i(8492);
    this.uBe.setSelected(paramInt);
    this.uBg.setText(this.uBe.wg(paramInt));
    dby().setIconRes(com.tencent.mm.bd.a.b(paramInt, this.mController.ylL));
    AppMethodBeat.o(8492);
  }

  private String JC(int paramInt)
  {
    AppMethodBeat.i(8498);
    JD(paramInt);
    int i = -1;
    String str;
    switch (paramInt)
    {
    default:
      paramInt = i;
      if ((dbG()) || (this.scene == 53))
        paramInt = 2131302857;
      if (paramInt < 0)
      {
        str = getString(2131302835, new Object[] { this.uBt });
        AppMethodBeat.o(8498);
      }
      break;
    case 1:
    case 8:
    case 2:
    case 16:
    case 64:
    case 256:
    case 384:
    case 128:
    case 512:
    case 1024:
    }
    while (true)
    {
      return str;
      paramInt = 2131302837;
      break;
      paramInt = 2131300120;
      break;
      paramInt = 2131302836;
      break;
      paramInt = 2131300118;
      break;
      paramInt = 2131296613;
      break;
      paramInt = 2131300107;
      break;
      paramInt = 2131300108;
      break;
      paramInt = 2131300116;
      break;
      paramInt = 2131300117;
      break;
      str = getString(2131302835, new Object[] { getString(paramInt) });
      AppMethodBeat.o(8498);
    }
  }

  private void JD(int paramInt)
  {
    AppMethodBeat.i(8499);
    if ((this.uBk != null) && (this.uBk.dbC()))
    {
      dby().setEditTextDrawableLeft(JE(paramInt));
      AppMethodBeat.o(8499);
    }
    while (true)
    {
      return;
      dby().setEditTextDrawableLeft(-1);
      AppMethodBeat.o(8499);
    }
  }

  private static int JE(int paramInt)
  {
    switch (paramInt)
    {
    default:
      paramInt = 2131232150;
    case 16777728:
    case 16777248:
    case 12582912:
    case 1:
    case 8:
    case 2:
    case 64:
    case 2359360:
    case 256:
    case 384:
    case 16793600:
    case 512:
    case 1024:
    case 16777220:
    }
    while (true)
    {
      return paramInt;
      paramInt = 2131232142;
      continue;
      paramInt = 2131232149;
      continue;
      paramInt = 2131232145;
      continue;
      paramInt = 2131232140;
      continue;
      paramInt = 2131232144;
      continue;
      paramInt = 2131232141;
      continue;
      paramInt = 2131232151;
      continue;
      paramInt = 2131232143;
      continue;
      paramInt = 2131232148;
      continue;
      paramInt = 2131232146;
      continue;
      paramInt = 2131232147;
      continue;
      paramInt = 2131232152;
    }
  }

  private static String agb(String paramString)
  {
    AppMethodBeat.i(8481);
    Object localObject = paramString;
    if (paramString != null)
      localObject = paramString;
    while (true)
    {
      try
      {
        int i = f.asg(paramString);
        if (i <= 100)
        {
          AppMethodBeat.o(8481);
          return paramString;
        }
        String str = paramString;
        localObject = paramString;
        if (paramString.length() > 200)
        {
          localObject = paramString;
          str = paramString.substring(0, 200);
        }
        localObject = str;
        paramString = str.toCharArray();
        localObject = str;
        int j = paramString.length;
        int k = 0;
        i = 0;
        int m = 0;
        localObject = str;
        if (k < j)
        {
          localObject = str;
          m += f.asg(String.valueOf(paramString[k]));
          if (m >= 100)
          {
            localObject = str;
            paramString = new java/lang/StringBuilder;
            localObject = str;
            paramString.<init>();
            localObject = str;
            paramString = str.substring(0, i) + '…';
            AppMethodBeat.o(8481);
            continue;
          }
          k++;
          i++;
          continue;
        }
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(8481);
        paramString = (String)localObject;
        continue;
      }
      AppMethodBeat.o(8481);
      paramString = (String)localObject;
    }
  }

  private boolean dbG()
  {
    if (this.scene == 36);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void dbH()
  {
    AppMethodBeat.i(8479);
    if (this.pzf == null)
      AppMethodBeat.o(8479);
    while (true)
    {
      return;
      AbsoluteLayout localAbsoluteLayout = (AbsoluteLayout)this.pzf.getView();
      localAbsoluteLayout.setOnTouchListener(new FTSSOSHomeWebViewUI.18(this, localAbsoluteLayout));
      AppMethodBeat.o(8479);
    }
  }

  private void dbK()
  {
    AppMethodBeat.i(8489);
    try
    {
      this.uAY.clear();
      ab.i("MicroMsg.FTS.FTSSOSHomeWebViewUI", "start to update history");
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putInt("webview_id", hashCode());
      localBundle.putString("query", getInEditTextQuery());
      localBundle.putInt("count", 6);
      localBundle.putInt("scene", bFf());
      this.icy.j(3, localBundle);
      AppMethodBeat.o(8489);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        AppMethodBeat.o(8489);
    }
  }

  private void dbL()
  {
    AppMethodBeat.i(8500);
    if ((this.uBe.getVisibility() == 0) && (!this.uBF))
    {
      this.uBF = true;
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.uBe, View.TRANSLATION_Y, new float[] { 0.0F, -this.uBe.getHeight() });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.uBh, View.ALPHA, new float[] { 1.0F, 0.0F });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.setInterpolator(new AccelerateInterpolator());
      localAnimatorSet.playTogether(new Animator[] { localObjectAnimator2, localObjectAnimator1 });
      localAnimatorSet.addListener(new FTSSOSHomeWebViewUI.10(this));
      localAnimatorSet.start();
    }
    AppMethodBeat.o(8500);
  }

  public final void Jw(int paramInt)
  {
    AppMethodBeat.i(8506);
    if ((this.pzf == null) || (this.pzf.getSettings() == null))
      AppMethodBeat.o(8506);
    while (true)
    {
      return;
      float f = this.mController.ylL.getSharedPreferences(ah.doA(), 0).getFloat("current_text_size_scale_key", 1.0F);
      if (f >= 2.025F)
      {
        this.pzf.getSettings().setTextZoom(160);
        AppMethodBeat.o(8506);
      }
      else if (f >= 1.875F)
      {
        this.pzf.getSettings().setTextZoom(150);
        AppMethodBeat.o(8506);
      }
      else if (f >= 1.625F)
      {
        this.pzf.getSettings().setTextZoom(140);
        AppMethodBeat.o(8506);
      }
      else if (f >= 1.375F)
      {
        this.pzf.getSettings().setTextZoom(130);
        AppMethodBeat.o(8506);
      }
      else if (f >= 1.25F)
      {
        this.pzf.getSettings().setTextZoom(120);
        AppMethodBeat.o(8506);
      }
      else if (f >= 1.125F)
      {
        this.pzf.getSettings().setTextZoom(110);
        AppMethodBeat.o(8506);
      }
      else if (f >= 1.0F)
      {
        this.pzf.getSettings().setTextZoom(100);
        AppMethodBeat.o(8506);
      }
      else if (f >= 0.875F)
      {
        this.pzf.getSettings().setTextZoom(90);
        AppMethodBeat.o(8506);
      }
      else
      {
        this.pzf.getSettings().setTextZoom(80);
        AppMethodBeat.o(8506);
      }
    }
  }

  public final void a(String paramString1, String paramString2, List<com.tencent.mm.plugin.fts.ui.widget.a.b> paramList, FTSEditTextView.b paramb)
  {
    AppMethodBeat.i(8490);
    if (paramb == FTSEditTextView.b.mLX)
      this.uBB = 0;
    if (this.uBk.dbC())
    {
      super.a(paramString1, paramString2, paramList, paramb);
      AppMethodBeat.o(8490);
    }
    while (true)
    {
      return;
      if (getTotalQuery().length() == 0)
      {
        this.mJe.setVisibility(0);
        this.uBd.setVisibility(0);
        this.uAV.setVisibility(0);
        this.uAY.clear();
        AppMethodBeat.o(8490);
      }
      else
      {
        this.mJe.setVisibility(8);
        this.uBd.setVisibility(8);
        this.uAV.setVisibility(4);
        if (paramb != FTSEditTextView.b.mLZ)
          dbK();
        AppMethodBeat.o(8490);
      }
    }
  }

  public final void aMh()
  {
    AppMethodBeat.i(8478);
    super.aMh();
    this.uBk = new FTSSOSHomeWebViewUI.b(this, "sos_home_webview_ui", getMainLooper());
    this.qpb = findViewById(2131827963);
    this.uBj = findViewById(2131827964);
    this.uBh = findViewById(2131827952);
    this.uBf = findViewById(2131827957);
    this.uBg = ((TextView)findViewById(2131827958));
    this.uBf.setOnClickListener(this.uBE);
    this.uAW = findViewById(2131827951);
    this.uAX = findViewById(2131821064);
    this.titleView = ((TextView)findViewById(2131821185));
    this.uAV = findViewById(2131823600);
    ((WebViewKeyboardLinearLayout)this.uAV).setOnkbdStateListener(new FTSSOSHomeWebViewUI.11(this));
    this.mJe = ((FTSMainUIEducationLayout)findViewById(2131824241));
    this.mJe.setOnCellClickListener(this.mJH);
    this.mJe.setCellClickable(false);
    this.mJe.getViewTreeObserver().addOnGlobalLayoutListener(new FTSSOSHomeWebViewUI.12(this));
    this.uBe = ((FTSMainUIEducationLayoutWithAll)findViewById(2131827953));
    this.uBe.setOnCellClickListener(this.mJH);
    this.uBe.setCellClickable(true);
    this.uBd = ((FTSMainUIHotWordLayout)findViewById(2131827960));
    this.uBd.setOnCellClickListener(this.uBw);
    this.uAZ = new b(this, this.uAr, this.titleView, dby().getIconView(), this.oOO, this.oOO, dby().getEditText(), this.uBi, this.qpb, this.uBj);
    this.uAZ.a(this.uBx);
    this.uBa = new c(this, this.uAr, this.titleView, dby().getIconView(), this.oOO, this.oOO, dby().getEditText(), this.uBi, this.qpb, this.uBj);
    this.uBa.a(this.uBz);
    this.uBb = new d(this, this.uAr, this.titleView, dby().getIconView(), this.oOO, this.oOO, dby().getEditText(), this.uBi, this.qpb, this.uBj);
    this.uBb.a(this.uBy);
    this.uAY = new FTSSOSHomeWebViewUI.a(this, (byte)0);
    this.qzN = findViewById(2131827962);
    try
    {
      Object localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      ((Bundle)localObject1).putString("key", "educationTab");
      Object localObject2 = this.icy.p(2, (Bundle)localObject1);
      localObject1 = ((Bundle)localObject2).getString("result");
      localObject2 = ((Bundle)localObject2).getString("result_1");
      JSONObject localJSONObject = new org/json/JSONObject;
      if (localObject2 == null);
      while (true)
      {
        localJSONObject.<init>((String)localObject1);
        this.mJe.S(localJSONObject);
        try
        {
          label558: localObject1 = new android/os/Bundle;
          ((Bundle)localObject1).<init>();
          ((Bundle)localObject1).putString("key", "tabSlice");
          localObject2 = this.icy.p(2, (Bundle)localObject1).getString("result");
          localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>((String)localObject2);
          this.uBe.S((JSONObject)localObject1);
          label611: findViewById(2131821686).setOnTouchListener(new FTSSOSHomeWebViewUI.13(this));
          this.uBh.setOnClickListener(new FTSSOSHomeWebViewUI.14(this));
          localObject1 = getIntent().getStringExtra("title");
          this.titleView.setText((CharSequence)localObject1);
          this.uBl = (((RelativeLayout.LayoutParams)this.titleView.getLayoutParams()).leftMargin - (int)getResources().getDimension(2131428689));
          dby().dJf();
          boolean bool;
          if ((getIntent() != null) && (getIntent().getBooleanExtra("ftsInitToSearch", false)))
          {
            bool = true;
            label723: this.uBp = bool;
            if ((getIntent() == null) || (!getIntent().getBooleanExtra("hideSearchInput", false)))
              break label1053;
            bool = true;
            label753: this.uBq = bool;
            if (this.uBk != null)
            {
              if (!this.uBp)
                break label1059;
              this.uBj.setBackgroundColor(getResources().getColor(2131690597));
              localObject1 = this.uBk;
              ((FTSSOSHomeWebViewUI.b)localObject1).b(((FTSSOSHomeWebViewUI.b)localObject1).uBR);
              if ((com.tencent.mm.compatible.util.d.iW(23)) && (!com.tencent.mm.compatible.util.h.Mt()))
                at(getResources().getColor(2131690691), true);
              if (this.type == 64)
              {
                this.uBv = true;
                this.uAX.setVisibility(8);
                this.uAW.setVisibility(0);
              }
              label863: this.uBk.start();
            }
          }
          try
          {
            localObject1 = new android/os/Bundle;
            ((Bundle)localObject1).<init>();
            ((Bundle)localObject1).putString("key", "searchID");
            this.uBo = this.icy.p(6, (Bundle)localObject1).getString("result");
            an.as(this.uBo, getSessionId(), this.mJe.getVertBizTypes());
            label928: an.Ij(bFf());
            dbH();
            this.uAr.getViewTreeObserver().addOnPreDrawListener(new FTSSOSHomeWebViewUI.15(this));
            if (!this.uCf)
              this.uAV.setVisibility(4);
            while (true)
            {
              this.uAs.setVoiceBtnClickListener(new FTSSOSHomeWebViewUI.16(this));
              this.uAs.setCancelTextViewClickListener(new FTSSOSHomeWebViewUI.17(this));
              JB(this.uAO);
              localObject1 = dby().getClearBtn();
              if (localObject1 != null)
                ((ImageButton)localObject1).getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
              AppMethodBeat.o(8478);
              return;
              localObject1 = localObject2;
              break;
              bool = false;
              break label723;
              label1053: bool = false;
              break label753;
              label1059: this.uBk.dbM();
              break label863;
              this.uAV.setVisibility(0);
            }
          }
          catch (Exception localException1)
          {
            break label928;
          }
        }
        catch (Exception localException2)
        {
          break label611;
        }
      }
    }
    catch (Exception localException3)
    {
      break label558;
    }
  }

  public final int aMi()
  {
    boolean bool1 = false;
    AppMethodBeat.i(8486);
    boolean bool2 = bool1;
    if (getIntent() != null)
    {
      bool2 = bool1;
      if (getIntent().getBooleanExtra("ftsInitToSearch", false))
        bool2 = true;
    }
    this.uBp = bool2;
    int i;
    if ((com.tencent.mm.compatible.util.d.iW(23)) && (!com.tencent.mm.sdk.h.b.Mt()))
      if (this.uBp)
      {
        i = -1;
        AppMethodBeat.o(8486);
      }
    while (true)
    {
      return i;
      i = getResources().getColor(2131690672);
      AppMethodBeat.o(8486);
      continue;
      i = super.aMi();
      AppMethodBeat.o(8486);
    }
  }

  public final boolean aMo()
  {
    AppMethodBeat.i(8491);
    if (!this.uAy)
      AppMethodBeat.o(8491);
    while (true)
    {
      return true;
      this.uBk.sendMessage(0);
      super.aMo();
      AppMethodBeat.o(8491);
    }
  }

  public final boolean cZA()
  {
    return true;
  }

  public final boolean dbC()
  {
    AppMethodBeat.i(8502);
    boolean bool;
    if (this.uBk == null)
    {
      bool = false;
      AppMethodBeat.o(8502);
    }
    while (true)
    {
      return bool;
      bool = this.uBk.dbC();
      AppMethodBeat.o(8502);
    }
  }

  protected final boolean dbD()
  {
    AppMethodBeat.i(8503);
    boolean bool;
    if ((dbC()) && (!this.uAZ.isAnimating) && (!this.uBa.isAnimating) && (!this.uBb.isAnimating))
    {
      bool = true;
      AppMethodBeat.o(8503);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(8503);
    }
  }

  public final int dbI()
  {
    return 1;
  }

  protected final Map<String, Object> dbJ()
  {
    AppMethodBeat.i(8485);
    HashMap localHashMap = new HashMap();
    if ((this.mJe == null) || (this.qpb == null))
      AppMethodBeat.o(8485);
    while (true)
    {
      return localHashMap;
      ab.i("MicroMsg.FTS.FTSSOSHomeWebViewUI", "getOnUiInitParams edu.bottom %d, title.bottom %d", new Object[] { Integer.valueOf(this.mJe.getBottom()), Integer.valueOf(this.qpb.getBottom()) });
      int i;
      if (this.mJe.getTop() < this.qpb.getBottom())
      {
        i = this.mJe.getBottom() - this.qpb.getBottom();
        label107: localHashMap.put("nativeHeight", Integer.valueOf(com.tencent.mm.bz.a.ao(this, i)));
      }
      try
      {
        Object localObject = this.icy.p(7, null);
        if (localObject == null);
        for (localObject = ""; ; localObject = ((Bundle)localObject).getString("data"))
        {
          if (!TextUtils.isEmpty((CharSequence)localObject))
            localHashMap.put("operationData", localObject);
          AppMethodBeat.o(8485);
          break;
          i = this.mJe.getBottom();
          break label107;
        }
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.FTS.FTSSOSHomeWebViewUI", localRemoteException, "", new Object[0]);
      }
    }
  }

  protected final void dbs()
  {
    AppMethodBeat.i(8493);
    super.dbs();
    this.uBk.sendMessage(11);
    AppMethodBeat.o(8493);
  }

  protected final void dbt()
  {
    AppMethodBeat.i(8488);
    super.dbt();
    JB(this.uAO);
    dby().setHint(JC(this.uAO));
    AppMethodBeat.o(8488);
  }

  protected final void dbu()
  {
    AppMethodBeat.i(8494);
    if (this.uBn > 0)
      AppMethodBeat.o(8494);
    while (true)
    {
      return;
      super.dbu();
      dby().setHint(getHint());
      this.uBk.sendMessage(2);
      this.uAr.setBackgroundResource(2130840310);
      this.qzN.setVisibility(8);
      this.uBA = null;
      this.uBB = 0;
      this.uBv = false;
      this.uAX.setVisibility(0);
      this.uAW.setVisibility(8);
      com.tencent.mm.plugin.report.service.h.pYm.e(15521, new Object[] { Integer.valueOf(this.scene), Integer.valueOf(1), dby().getInEditTextQuery(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(this.uAO) });
      AppMethodBeat.o(8494);
    }
  }

  protected final void dbv()
  {
    AppMethodBeat.i(8495);
    super.dbv();
    if (!this.uCf)
    {
      this.uAV.setVisibility(0);
      if ((this.pzf.getTopView() != null) && ((this.pzf.getTopView() instanceof AbsoluteLayout)))
      {
        ((ViewGroup)this.mJe.getParent()).removeView(this.mJe);
        AbsoluteLayout.LayoutParams localLayoutParams = new AbsoluteLayout.LayoutParams(-1, -2, 0, this.uBs - this.qpb.getHeight());
        ((AbsoluteLayout)this.pzf.getTopView()).addView(this.mJe, localLayoutParams);
      }
    }
    AppMethodBeat.o(8495);
  }

  public final String dbw()
  {
    if (this.uBB == 0);
    for (String str = ""; ; str = this.uBA)
      return str;
  }

  public final int dbx()
  {
    return this.uBB;
  }

  protected final String getHint()
  {
    AppMethodBeat.i(8496);
    String str = JC(dbA());
    AppMethodBeat.o(8496);
    return str;
  }

  protected final com.tencent.mm.plugin.webview.ui.tools.jsapi.d getJsapi()
  {
    AppMethodBeat.i(8504);
    com.tencent.mm.plugin.webview.ui.tools.jsapi.d locald;
    if (this.uBv)
    {
      locald = this.uBu.getJsapi();
      AppMethodBeat.o(8504);
    }
    while (true)
    {
      return locald;
      locald = super.getJsapi();
      AppMethodBeat.o(8504);
    }
  }

  public final int getLayoutId()
  {
    return 2130970837;
  }

  public final void hz(boolean paramBoolean)
  {
    AppMethodBeat.i(8487);
    if (this.uBk == null)
      AppMethodBeat.o(8487);
    while (true)
    {
      return;
      if (this.uBk.dbC())
        super.hz(paramBoolean);
      this.uBk.sendMessage(5);
      AppMethodBeat.o(8487);
    }
  }

  public final void j(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(8497);
    if ((this.uBv) && (this.uBu.x(paramInt, paramBundle)))
    {
      AppMethodBeat.o(8497);
      return;
    }
    super.j(paramInt, paramBundle);
    switch (paramInt)
    {
    default:
    case 126:
    case 127:
    case 119:
    case 122:
    case 130:
    case 136:
    }
    while (true)
    {
      AppMethodBeat.o(8497);
      break;
      ArrayList localArrayList = new ArrayList();
      Object localObject;
      String str;
      if (dby().mLL.hasFocus())
      {
        localObject = paramBundle.getString("query");
        if (getInEditTextQuery().equals(localObject))
        {
          Iterator localIterator = paramBundle.getStringArrayList("result").iterator();
          paramInt = 0;
          while (localIterator.hasNext())
          {
            str = (String)localIterator.next();
            if (com.tencent.mm.bd.a.aO(str, (String)localObject))
            {
              paramInt++;
              if (paramInt > 2)
                break;
              paramBundle = new FTSSOSHomeWebViewUI.c(this, (byte)0);
              paramBundle.type = 1;
              paramBundle.icon = 2131231986;
              paramBundle.content = str;
              paramBundle.uBV = 2130840309;
              localArrayList.add(paramBundle);
            }
          }
        }
      }
      al.d(new FTSSOSHomeWebViewUI.a.1(this.uAY, localArrayList));
      AppMethodBeat.o(8497);
      break;
      localArrayList = new ArrayList();
      if (dby().mLL.hasFocus())
      {
        localObject = paramBundle.getString("query");
        if (getInEditTextQuery().equals(localObject))
        {
          this.uBA = paramBundle.getString("suggestionId");
          localObject = paramBundle.getStringArrayList("result").iterator();
          while (((Iterator)localObject).hasNext())
          {
            str = (String)((Iterator)localObject).next();
            paramBundle = new FTSSOSHomeWebViewUI.c(this, (byte)0);
            paramBundle.type = 2;
            paramBundle.icon = 0;
            paramBundle.content = str;
            paramBundle.uBV = 2130840312;
            localArrayList.add(paramBundle);
          }
        }
      }
      al.d(new FTSSOSHomeWebViewUI.a.3(this.uAY, localArrayList));
      AppMethodBeat.o(8497);
      break;
      this.uBk.sendMessage(8);
      AppMethodBeat.o(8497);
      break;
      this.uBk.sendMessage(10);
      AppMethodBeat.o(8497);
      break;
      AppMethodBeat.o(8497);
      break;
      paramBundle.getString("fts_key_new_query", "");
      this.uBk.sendMessage(13);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(8480);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default:
      AppMethodBeat.o(8480);
    case 1:
    }
    while (true)
    {
      return;
      if (paramIntent != null)
      {
        paramIntent = paramIntent.getStringExtra("text");
        if (!TextUtils.isEmpty(paramIntent))
        {
          paramIntent = agb(paramIntent);
          ab.i("MicroMsg.FTS.FTSSOSHomeWebViewUI", "voice input final text len %d , text %s", new Object[] { Integer.valueOf(paramIntent.length()), paramIntent });
          this.uAs.n(paramIntent, null);
          aMo();
          AppMethodBeat.o(8480);
        }
      }
      else
      {
        AppMethodBeat.o(8480);
      }
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(8501);
    if (this.uBe.getVisibility() == 0)
      dbL();
    while (true)
    {
      dby().bBs();
      AppMethodBeat.o(8501);
      return;
      super.onBackPressed();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = false;
    AppMethodBeat.i(8476);
    super.onCreate(paramBundle);
    boolean bool2 = bool1;
    if (getIntent() != null)
    {
      bool2 = bool1;
      if (getIntent().getBooleanExtra("ftsInitToSearch", false))
        bool2 = true;
    }
    this.uBp = bool2;
    this.uBu = new WeappWebSearchFragment();
    paramBundle = new Bundle();
    paramBundle.putString("url", getIntent().getStringExtra("key_weapp_url"));
    this.uBu.setArguments(paramBundle);
    getSupportFragmentManager().beginTransaction().a(2131827951, this.uBu).commit();
    AppMethodBeat.o(8476);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(8484);
    super.onDestroy();
    an.cVx();
    an.cVy();
    AppMethodBeat.o(8484);
  }

  public void onPause()
  {
    AppMethodBeat.i(8483);
    super.onPause();
    an.cVw();
    AppMethodBeat.o(8483);
  }

  public void onResume()
  {
    AppMethodBeat.i(8482);
    super.onResume();
    an.cVv();
    AppMethodBeat.o(8482);
  }

  public final void onWebViewScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(8505);
    super.onWebViewScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt1 = Math.min(paramInt2, Math.max(com.tencent.mm.bz.a.fromDPToPix(this, this.pzf.getContentHeight()) - this.pzf.getHeight(), 0));
    this.uAZ.JG(this.uBr - paramInt1);
    this.uBa.JG(this.uBr - paramInt1);
    this.uBb.JG(this.uBr - paramInt1);
    if (!this.uBk.dbC())
      this.uAr.setTranslationY(-paramInt1);
    if (paramInt2 != 0)
    {
      dby().mLL.clearFocus();
      aqX();
    }
    AppMethodBeat.o(8505);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class b$b extends com.tencent.mm.sdk.d.b
  {
    private b$b()
    {
    }

    public final void enter()
    {
      AppMethodBeat.i(8462);
      super.enter();
      FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this.uBG, a.b.uCI);
      FTSSOSHomeWebViewUI.this.uBG.uAr.setBackgroundResource(2131690691);
      FTSSOSHomeWebViewUI.this.uBG.uAs.mLL.clearFocus();
      FTSSOSHomeWebViewUI.this.uBG.aqX();
      FTSSOSHomeWebViewUI.K(FTSSOSHomeWebViewUI.this.uBG).setVisibility(0);
      FTSSOSHomeWebViewUI.this.uBG.uAr.setPadding(FTSSOSHomeWebViewUI.L(FTSSOSHomeWebViewUI.this.uBG), 0, 0, 0);
      FTSSOSHomeWebViewUI.this.uBG.dby().bBs();
      FTSSOSHomeWebViewUI.this.uBG.oOO.setVisibility(0);
      FTSSOSHomeWebViewUI.this.uBG.dby().bBq();
      FTSSOSHomeWebViewUI.z(FTSSOSHomeWebViewUI.this.uBG).clear();
      FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.this.uBG).setVisibility(0);
      FTSSOSHomeWebViewUI.c(FTSSOSHomeWebViewUI.this.uBG).setVisibility(8);
      FTSSOSHomeWebViewUI.s(FTSSOSHomeWebViewUI.this.uBG).setVisibility(8);
      FTSSOSHomeWebViewUI.this.uBG.uAs.setSearchBarCancelTextContainerVisibile(0);
      FTSSOSHomeWebViewUI.this.uBG.uAs.setVoiceImageButtonVisibile(0);
      FTSSOSHomeWebViewUI.this.uBG.uAs.bBs();
      FTSSOSHomeWebViewUI.M(FTSSOSHomeWebViewUI.this.uBG);
      if (!FTSSOSHomeWebViewUI.this.uBG.uBp)
        FTSSOSHomeWebViewUI.this.uBG.dby().bBq();
      FTSSOSHomeWebViewUI.N(FTSSOSHomeWebViewUI.this.uBG).setVisibility(0);
      if ((com.tencent.mm.compatible.util.d.iW(23)) && (!com.tencent.mm.sdk.h.b.Mt()))
        FTSSOSHomeWebViewUI.g(FTSSOSHomeWebViewUI.this.uBG, FTSSOSHomeWebViewUI.this.uBG.getResources().getColor(2131690691));
      FTSSOSHomeWebViewUI.O(FTSSOSHomeWebViewUI.this.uBG).setAlpha(0.0F);
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)FTSSOSHomeWebViewUI.this.uBG.uAr.getLayoutParams();
      localLayoutParams.leftMargin = 0;
      localLayoutParams.rightMargin = 0;
      if (FTSSOSHomeWebViewUI.this.uBG.uBp)
        localLayoutParams.topMargin = 0;
      localLayoutParams.width = -1;
      FTSSOSHomeWebViewUI.this.uBG.uAr.setLayoutParams(localLayoutParams);
      FTSSOSHomeWebViewUI.this.uBG.uAr.setY(0.0F);
      FTSSOSHomeWebViewUI.this.uBG.uAr.setX(0.0F);
      if (FTSSOSHomeWebViewUI.this.uBG.uBp)
      {
        FTSSOSHomeWebViewUI.this.uBG.uAr.setTranslationX(0.0F);
        FTSSOSHomeWebViewUI.this.uBG.uAr.setTranslationY(0.0F);
      }
      if ((FTSSOSHomeWebViewUI.this.uBG.uBp) && (FTSSOSHomeWebViewUI.this.uBG.uBq))
      {
        FTSSOSHomeWebViewUI.this.uBG.uAr.setVisibility(8);
        FTSSOSHomeWebViewUI.O(FTSSOSHomeWebViewUI.this.uBG).setAlpha(1.0F);
        FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.this.uBG).setVisibility(0);
        FTSSOSHomeWebViewUI.O(FTSSOSHomeWebViewUI.this.uBG).setVisibility(0);
        if ((FTSSOSHomeWebViewUI.this.uBG.getIntent() != null) && (FTSSOSHomeWebViewUI.this.uBG.getIntent().hasExtra("customize_status_bar_color")))
        {
          FTSSOSHomeWebViewUI.G(FTSSOSHomeWebViewUI.this.uBG).setBackgroundColor(FTSSOSHomeWebViewUI.P(FTSSOSHomeWebViewUI.this.uBG));
          if (FTSSOSHomeWebViewUI.this.uBG.getIntent().hasExtra("status_bar_style"))
            FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this.uBG, FTSSOSHomeWebViewUI.Q(FTSSOSHomeWebViewUI.this.uBG), "black".equals(FTSSOSHomeWebViewUI.R(FTSSOSHomeWebViewUI.this.uBG)));
        }
      }
      FTSSOSHomeWebViewUI.h(FTSSOSHomeWebViewUI.this.uBG, FTSSOSHomeWebViewUI.this.uBG.uAO);
      AppMethodBeat.o(8462);
    }

    public final void exit()
    {
      AppMethodBeat.i(8463);
      super.exit();
      AppMethodBeat.o(8463);
    }

    public final String getName()
    {
      return "SearchNoFocusState";
    }

    public final boolean k(Message paramMessage)
    {
      AppMethodBeat.i(8464);
      switch (paramMessage.what)
      {
      case 1:
      case 6:
      case 7:
      default:
      case 2:
      case 3:
      case 4:
      case 5:
      case 0:
      }
      while (true)
      {
        boolean bool = super.k(paramMessage);
        AppMethodBeat.o(8464);
        return bool;
        if (!FTSSOSHomeWebViewUI.this.uBG.uBp)
        {
          FTSSOSHomeWebViewUI.S(FTSSOSHomeWebViewUI.this.uBG);
          FTSSOSHomeWebViewUI.T(FTSSOSHomeWebViewUI.this.uBG).setVisibility(8);
          FTSSOSHomeWebViewUI.d(FTSSOSHomeWebViewUI.this.uBG, 0);
          FTSSOSHomeWebViewUI.H(FTSSOSHomeWebViewUI.this.uBG).b(a.b.uCH);
          FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this.uBG, a.b.uCH);
        }
        else
        {
          FTSSOSHomeWebViewUI.this.uBG.finish();
          continue;
          FTSSOSHomeWebViewUI.this.b(FTSSOSHomeWebViewUI.this.uBP);
          continue;
          if (FTSSOSHomeWebViewUI.this.uBG.dby().getEditText().hasFocus())
          {
            FTSSOSHomeWebViewUI.this.b(FTSSOSHomeWebViewUI.this.uBQ);
            com.tencent.mm.plugin.report.service.h.pYm.e(15521, new Object[] { Integer.valueOf(FTSSOSHomeWebViewUI.this.uBG.scene), Integer.valueOf(2), FTSSOSHomeWebViewUI.this.uBG.dby().getInEditTextQuery(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(FTSSOSHomeWebViewUI.this.uBG.uAO) });
            continue;
            FTSSOSHomeWebViewUI.this.uBG.dby().bBs();
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI
 * JD-Core Version:    0.6.2
 */