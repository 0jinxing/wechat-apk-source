package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.Exif.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.kernel.i;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.sns.model.j;
import com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.KeyboardLinearLayout;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.e.k;
import com.tencent.mm.ui.i.a.a;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@i
@com.tencent.mm.ui.base.a(17)
public class SnsUploadUI extends MMActivity
  implements LocationWidget.a
{
  private String desc;
  private KeyboardLinearLayout mJB;
  private AtContactWidget rCD;
  private LocationWidget rCE;
  private RangeWidget rCF;
  private SnsUploadSayFooter rCG;
  private DynamicGridView rCH;
  private boolean rCI;
  private boolean rCJ;
  private String rCK;
  private Map<Integer, y> rCL;
  private FrameLayout rCM;
  private long rCN;
  private SnsUploadConfigView rhg;
  private int rjO;
  private String rkC;
  private boolean rkD;
  private String rmH;
  private String rmI;
  private SnsEditText rnb;
  private y rnc;
  private LinearLayout rnd;
  private int rnf;
  private int rng;
  private ArrayList<String> rnh;
  private boolean rni;
  private boolean rnk;
  private long rnl;

  public SnsUploadUI()
  {
    AppMethodBeat.i(39757);
    this.rkD = false;
    this.rjO = 0;
    this.rnk = false;
    this.rnl = 0L;
    this.rnc = null;
    this.rmH = "";
    this.rmI = "";
    this.rnf = 0;
    this.rng = 0;
    this.rni = false;
    this.rCI = false;
    this.rCJ = false;
    this.rCK = null;
    this.rkC = "";
    this.rCL = new HashMap();
    this.rCM = null;
    this.rCN = 0L;
    AppMethodBeat.o(39757);
  }

  private y En(int paramInt)
  {
    AppMethodBeat.i(39777);
    Object localObject1 = (y)this.rCL.get(Integer.valueOf(paramInt));
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      if (paramInt != 0)
        break label65;
      localObject1 = new ag(this);
    }
    while (true)
    {
      this.rCL.put(Integer.valueOf(paramInt), localObject1);
      localObject2 = localObject1;
      AppMethodBeat.o(39777);
      return localObject2;
      label65: if (paramInt == 14)
        localObject1 = new ac(this);
    }
  }

  private void Kh()
  {
    AppMethodBeat.i(39765);
    this.rnk = getIntent().getBooleanExtra("KSnsPostManu", false);
    this.rnl = getIntent().getLongExtra("KTouchCameraTime", 0L);
    this.rjO = getIntent().getIntExtra("Ksnsupload_type", 0);
    this.rkD = getIntent().getBooleanExtra("Kis_take_photo", false);
    this.rCI = getIntent().getBooleanExtra("need_result", false);
    this.rCJ = getIntent().getBooleanExtra("K_go_to_SnsTimeLineUI", false);
    this.rCK = getIntent().getStringExtra("Ksnsupload_canvas_info");
    this.rkC = getIntent().getStringExtra("KSessionID");
    if (bo.isNullOrNil(this.rkC))
    {
      this.rkC = (bo.anU() + "_" + bo.Mb(5));
      getIntent().putExtra("KSessionID", this.rkC);
    }
    AppMethodBeat.o(39765);
  }

  private void P(Bundle paramBundle)
  {
    AppMethodBeat.i(39778);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SnsUploadUI", "attachWidget. share type %d, isManuSnsPost:%b", new Object[] { Integer.valueOf(this.rjO), Boolean.valueOf(this.rnk) });
    Object localObject;
    if ((this.rjO == 0) || (this.rjO == 14) || (this.rjO == 9))
    {
      localObject = Parcel.obtain();
      getIntent().writeToParcel((Parcel)localObject, 0);
      ((Parcel)localObject).marshall();
      if (this.rjO != 9)
        break label424;
      setMMTitle(this.mController.ylL.getResources().getString(2131303815));
    }
    View localView;
    label424: int i;
    switch (this.rjO)
    {
    default:
    case 0:
    case 14:
    case 1:
    case 11:
    case 15:
    case 16:
    case 2:
    case 3:
    case 6:
    case 4:
    case 10:
    case 13:
    case 12:
    case 5:
    case 7:
      while (true)
      {
        this.rnc.M(paramBundle);
        if (!(this.rnc instanceof a))
          break label783;
        paramBundle = findViewById(2131827934);
        localObject = findViewById(2131827936);
        this.rCH = ((DynamicGridView)findViewById(2131827932));
        this.rCH.setOnTouchListener(new SnsUploadUI.9(this));
        paramBundle = ((a)this.rnc).a(paramBundle, findViewById(2131827942), this.rCH, (View)localObject);
        this.rCH.setVisibility(0);
        localView = findViewById(2131827938);
        localObject = (RelativeLayout.LayoutParams)localView.getLayoutParams();
        ((RelativeLayout.LayoutParams)localObject).topMargin = 0;
        ((RelativeLayout.LayoutParams)localObject).addRule(3, 2131827932);
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
        if ((this.rnc instanceof z))
        {
          localObject = (LinearLayout.LayoutParams)paramBundle.getLayoutParams();
          ((LinearLayout.LayoutParams)localObject).width = -1;
          paramBundle.setLayoutParams((ViewGroup.LayoutParams)localObject);
        }
        if (((this.rnc instanceof o)) || ((this.rnc instanceof m)) || ((this.rnc instanceof n)))
        {
          localObject = (LinearLayout.LayoutParams)paramBundle.getLayoutParams();
          ((LinearLayout.LayoutParams)localObject).width = -1;
          paramBundle.setLayoutParams((ViewGroup.LayoutParams)localObject);
        }
        cuE();
        if (this.rjO == 0)
          cuB();
        AppMethodBeat.o(39778);
        return;
        setMMTitle("");
        break;
        this.rnc = En(this.rjO);
        this.rnb.addTextChangedListener(new SnsUploadUI.7(this));
        continue;
        this.rnc = En(this.rjO);
        continue;
        this.rnc = new z(this);
        continue;
        this.rnc = new ab(this);
        continue;
        this.rnc = new ah(this, 9);
        continue;
        this.rnc = new ah(this, 12);
        continue;
        this.rnc = new o(this);
        continue;
        this.rnc = new m(this);
        continue;
        this.rnc = new p(this);
        continue;
        this.rnc = new n(this);
        continue;
        this.rnc = new ah(this, 14);
        continue;
        this.rnc = new ah(this, 13);
      }
    case 9:
      g.RQ();
      localObject = bo.bc((String)g.RP().Ry().get(68408, ""), "");
      g.RQ();
      i = bo.a((Integer)g.RP().Ry().get(7489, Integer.valueOf(0)), 0);
      if (bo.isNullOrNil((String)localObject))
        break;
    case 8:
    }
    for (boolean bool = true; ; bool = false)
    {
      this.rnc = new ad(this, bool);
      this.rnb.setPasterLen(i);
      this.rnb.setText(com.tencent.mm.ui.e.c.b.c(this.mController.ylL, (CharSequence)localObject, this.rnb.getTextSize()));
      this.rnb.addTextChangedListener(new SnsUploadUI.8(this));
      break;
      this.rnc = new ba(this);
      break;
      label783: paramBundle = this.rnc.crH();
      this.rnd = ((LinearLayout)findViewById(2131827848));
      this.rnd.setVisibility(0);
      this.rnd.setClipChildren(false);
      label843: float f;
      if (paramBundle != null)
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SnsUploadUI", "will add widget view in widgetLL.");
        this.rnd.addView(paramBundle);
        if ((this.rjO == 9) || (this.rjO == 14))
        {
          localView = findViewById(2131827938);
          localObject = (RelativeLayout.LayoutParams)localView.getLayoutParams();
          ((RelativeLayout.LayoutParams)localObject).addRule(3, 2131827848);
          f = d.anS().density;
          if (this.rjO != 9)
            break label938;
        }
      }
      label938: for (i = 128; ; i = 96)
      {
        ((RelativeLayout.LayoutParams)localObject).topMargin = ((int)(i * f));
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
        break;
        this.rnd.setVisibility(8);
        break label843;
      }
    }
  }

  private void aq(Intent paramIntent)
  {
    List localList = null;
    AppMethodBeat.i(39770);
    this.rCF.a(5, -1, paramIntent, this.rCD);
    int i = paramIntent.getIntExtra("Ktag_range_index", 0);
    if (i >= 2)
    {
      this.rmH = paramIntent.getStringExtra("Klabel_name_list");
      this.rmI = paramIntent.getStringExtra("Kother_user_name_list");
      if (bo.isNullOrNil(this.rmH))
        break label144;
    }
    label144: for (paramIntent = Arrays.asList(this.rmH.split(",")); ; paramIntent = null)
    {
      if (!bo.isNullOrNil(this.rmI))
        localList = Arrays.asList(this.rmI.split(","));
      l(paramIntent, localList);
      if (i == 2)
      {
        this.rni = false;
        AppMethodBeat.o(39770);
      }
      while (true)
      {
        return;
        this.rni = true;
        AppMethodBeat.o(39770);
      }
    }
  }

  @TargetApi(11)
  private void cuB()
  {
    AppMethodBeat.i(39760);
    if (!(this.rnc instanceof ag))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SnsUploadUI", "!(widget instanceof PicWidget)");
      AppMethodBeat.o(39760);
    }
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT < 11)
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SnsUploadUI", "sdk not support dragdrop event");
        AppMethodBeat.o(39760);
      }
      else
      {
        new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(39749);
            SnsUploadUI.10.1 local1 = new SnsUploadUI.10.1(this);
            if (SnsUploadUI.e(SnsUploadUI.this) != null)
              SnsUploadUI.e(SnsUploadUI.this).setOnDragListener(local1);
            AppMethodBeat.o(39749);
          }
        }
        .run();
        AppMethodBeat.o(39760);
      }
    }
  }

  private void cuC()
  {
    AppMethodBeat.i(39762);
    if (((this.rjO == 0) && (((ag)this.rnc).css() > 0)) || ((this.rjO == 14) && ((this.rnc instanceof ac)) && (!((ac)this.rnc).rkE)) || ((this.rjO == 9) && (!bo.isNullOrNil(this.rnb.getText().toString()))))
    {
      h.a(this, 2131303844, 0, 2131303846, 2131303845, true, new SnsUploadUI.11(this), new SnsUploadUI.12(this), 2131689664);
      AppMethodBeat.o(39762);
    }
    while (true)
    {
      return;
      h.a(this, 2131303843, 0, 2131296526, 2131296868, false, new SnsUploadUI.13(this), null, 2131689665);
      AppMethodBeat.o(39762);
    }
  }

  private void cuD()
  {
    AppMethodBeat.i(39763);
    setResult(0, new Intent());
    finish();
    AppMethodBeat.o(39763);
  }

  private void l(List<String> paramList1, List<String> paramList2)
  {
    AppMethodBeat.i(39771);
    this.rnh = new ArrayList();
    this.rnf = 0;
    HashSet localHashSet;
    Object localObject;
    int i;
    if ((paramList1 != null) && (paramList1.size() > 0))
    {
      Iterator localIterator1 = paramList1.iterator();
      localHashSet = new HashSet();
      if (localIterator1.hasNext())
      {
        localObject = (String)localIterator1.next();
        localObject = com.tencent.mm.plugin.label.a.a.bJa().PH(com.tencent.mm.plugin.label.a.a.bJa().PE((String)localObject));
        if ((localObject == null) || (((List)localObject).size() == 0))
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SnsUploadUI", "dz: getContactNamesFromLabelsAndOtherUserName,namelist get bu label is null");
      }
      else
      {
        this.rnh = new ArrayList(localHashSet);
      }
    }
    else
    {
      if (paramList1 == null)
        break label246;
      paramList1 = paramList1.iterator();
      i = 0;
      label141: if (!paramList1.hasNext())
        break label240;
      if (bo.isNullOrNil((String)paramList1.next()))
        break label330;
      i++;
    }
    label330: 
    while (true)
    {
      break label141;
      Iterator localIterator2 = ((List)localObject).iterator();
      while (localIterator2.hasNext())
      {
        localObject = (String)localIterator2.next();
        localHashSet.add(localObject);
        this.rnf += 1;
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SnsUploadUI", "dz:name : %s", new Object[] { localObject });
      }
      break;
      label240: this.rnf = i;
      label246: this.rng = 0;
      if ((paramList2 != null) && (paramList2.size() > 0))
      {
        paramList2 = paramList2.iterator();
        while (paramList2.hasNext())
        {
          paramList1 = (String)paramList2.next();
          if (!this.rnh.contains(paramList1))
          {
            this.rnh.add(paramList1);
            this.rng += 1;
          }
        }
      }
      AppMethodBeat.o(39771);
      return;
    }
  }

  public final void a(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(39775);
    getIntent().getExtras().clear();
    getIntent().putExtra("KSightPath", paramString1);
    getIntent().putExtra("KSightThumbPath", paramString2);
    getIntent().putExtra("sight_md5", paramString3);
    getIntent().putExtra("KSnsPostManu", true);
    getIntent().putExtra("Ksnsupload_type", 14);
    getIntent().putExtra("Kis_take_photo", false);
    getIntent().putExtra("KMMSightExtInfo", paramArrayOfByte);
    if (paramBoolean)
      getIntent().putExtra("KSessionID", bo.anU() + "_" + bo.Mb(5));
    AppMethodBeat.o(39775);
  }

  public final void a(String paramString, boolean paramBoolean, int paramInt1, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, int paramInt2)
  {
    AppMethodBeat.i(39774);
    getIntent().getExtras().clear();
    getIntent().putExtra("KTouchCameraTime", bo.anT());
    getIntent().putExtra("KSnsPostManu", true);
    getIntent().putExtra("Ksnsupload_type", 0);
    getIntent().putExtra("KFilterId", paramInt1);
    if (!bo.isNullOrNil(paramString))
      getIntent().putExtra("sns_kemdia_path", paramString);
    if (!bo.ek(paramArrayList1))
      getIntent().putExtra("sns_kemdia_path_list", paramArrayList1);
    if (!bo.ek(paramArrayList2))
      getIntent().putStringArrayListExtra("sns_media_latlong_list", paramArrayList2);
    if (paramBoolean)
      getIntent().putExtra("Kis_take_photo", paramBoolean);
    if (paramInt2 != 0)
      getIntent().putExtra("Ksnsupload_source", 11);
    AppMethodBeat.o(39774);
  }

  public final ArrayList<Exif.a> crV()
  {
    AppMethodBeat.i(39772);
    ArrayList localArrayList;
    if ((this.rnc instanceof ag))
    {
      ag localag = (ag)this.rnc;
      Object localObject1 = localag.rlP.rma;
      localArrayList = new ArrayList();
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (String)((Iterator)localObject1).next();
        localObject2 = (Exif.a)localag.rlR.get(localObject2);
        if (localObject2 != null)
          localArrayList.add(localObject2);
      }
      AppMethodBeat.o(39772);
    }
    while (true)
    {
      return localArrayList;
      localArrayList = null;
      AppMethodBeat.o(39772);
    }
  }

  public final boolean crW()
  {
    return this.rkD;
  }

  public final void cuE()
  {
    AppMethodBeat.i(39764);
    if (this.rnc.crG())
    {
      enableOptionMenu(true);
      AppMethodBeat.o(39764);
    }
    while (true)
    {
      return;
      enableOptionMenu(false);
      AppMethodBeat.o(39764);
    }
  }

  public final void cuF()
  {
    AppMethodBeat.i(39776);
    if (this.rCH != null)
      this.rCH.setVisibility(8);
    if (this.rnd != null)
    {
      this.rnd.removeAllViews();
      this.rnd.setVisibility(8);
    }
    if (this.rnc != null)
      this.rnc.crI();
    Kh();
    P(null);
    AppMethodBeat.o(39776);
  }

  public final int getLayoutId()
  {
    return 2130970827;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(39769);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.rnb != null)
      this.rnb.clearFocus();
    if (paramInt2 != -1)
      AppMethodBeat.o(39769);
    while (true)
    {
      return;
      if (paramInt1 != 30764)
        break;
      paramIntent = paramIntent.getBundleExtra("result_data");
      if ((paramIntent != null) && (paramIntent.getString("go_next", "").equals("gdpr_auth_location")))
      {
        g.RP().Ry().set(ac.a.xVP, Boolean.TRUE);
        com.tencent.mm.pluginsdk.permission.b.b(this.mController.ylL, "android.permission.ACCESS_COARSE_LOCATION", 64);
      }
      AppMethodBeat.o(39769);
    }
    if (this.rnc.f(paramInt1, paramIntent))
      cuE();
    switch (paramInt1)
    {
    case 7:
    case 9:
    default:
    case 5:
    case 6:
    case 8:
    case 10:
    }
    while (true)
    {
      AppMethodBeat.o(39769);
      break;
      if (paramIntent == null)
      {
        AppMethodBeat.o(39769);
        break;
      }
      getIntent().putExtras(paramIntent.getExtras());
      aq(paramIntent);
      AppMethodBeat.o(39769);
      break;
      if (paramIntent == null)
      {
        AppMethodBeat.o(39769);
        break;
      }
      getIntent().putExtras(paramIntent.getExtras());
      this.rCD.ao(paramIntent);
      AppMethodBeat.o(39769);
      break;
      if (paramIntent == null)
      {
        AppMethodBeat.o(39769);
        break;
      }
      boolean bool = paramIntent.getBooleanExtra("bind_facebook_succ", false);
      paramIntent = this.rhg;
      if (bool)
      {
        paramIntent.rCp = true;
        paramIntent.setSyncFacebook(true);
      }
      AppMethodBeat.o(39769);
      break;
      if (paramIntent == null)
      {
        AppMethodBeat.o(39769);
        break;
      }
      getIntent().putExtras(paramIntent.getExtras());
      this.rCE.ao(paramIntent);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = true;
    AppMethodBeat.i(39759);
    com.tencent.mm.pluginsdk.f.m(this);
    super.onCreate(paramBundle);
    xE(this.mController.ylL.getResources().getColor(2131690691));
    dyb();
    getIntent().setExtrasClassLoader(getClass().getClassLoader());
    Kh();
    this.rnb = ((SnsEditText)findViewById(2131825373));
    Object localObject1;
    boolean bool2;
    if (!bo.isNullOrNil(getIntent().getStringExtra(e.k.ygd)))
    {
      this.rnb.setText(com.tencent.mm.ui.e.c.b.c(this.mController.ylL, getIntent().getStringExtra(e.k.ygd), this.rnb.getTextSize()));
      if (this.rjO == 8)
      {
        localObject1 = getIntent().getStringExtra(e.k.ygd);
        this.rnb.setText(com.tencent.mm.ui.e.c.b.c(this.mController.ylL, (CharSequence)localObject1, this.rnb.getTextSize()));
      }
      this.mJB = ((KeyboardLinearLayout)findViewById(2131820987));
      this.rCG = ((SnsUploadSayFooter)findViewById(2131827849));
      this.rCG.setMMEditText(this.rnb);
      this.rCG.setVisibility(8);
      this.rCM = ((FrameLayout)findViewById(2131827847));
      this.rCM.post(new SnsUploadUI.14(this));
      this.rnb.setOnClickListener(new SnsUploadUI.15(this));
      this.rnb.setOnLongClickListener(new SnsUploadUI.16(this));
      localObject1 = (WrapScollview)findViewById(2131823999);
      ((WrapScollview)localObject1).setContentView(this.rnb);
      ((WrapScollview)localObject1).setDoComputeScrollDeltaToGetChildRectOnScreen(false);
      Object localObject2 = bo.bc(getIntent().getStringExtra("reportSessionId"), "");
      this.rhg = ((SnsUploadConfigView)findViewById(2131827941));
      localObject1 = this.rhg;
      if ((this.rjO != 14) || (((String)localObject2).contains("wx5dfbe0a95623607b")))
        break label920;
      bool2 = true;
      label359: ((SnsUploadConfigView)localObject1).rCv = bool2;
      if (bool2)
      {
        g.RQ();
        g.RO().eJo.a(2842, (com.tencent.mm.ai.f)localObject1);
        localObject2 = new j();
        g.RQ();
        g.RO().eJo.a((com.tencent.mm.ai.m)localObject2, 0);
      }
      ((SnsUploadConfigView)localObject1).rCw.vRq = -1000.0F;
      ((SnsUploadConfigView)localObject1).rCw.vRp = -1000.0F;
      if (!((SnsUploadConfigView)localObject1).rwo)
      {
        g.RQ();
        int i = bo.h((Integer)g.RP().Ry().get(68404, null));
        if ((i & 0x2) == 0)
          break label926;
        bool2 = true;
        label475: ((SnsUploadConfigView)localObject1).rCp = bool2;
        if ((i & 0x8) == 0)
          break label932;
        bool2 = bool1;
        label492: ((SnsUploadConfigView)localObject1).rCq = bool2;
        if (!com.tencent.mm.au.b.ahP())
          ((SnsUploadConfigView)localObject1).rCq = false;
        if (!r.YX())
          ((SnsUploadConfigView)localObject1).rCp = false;
      }
      ((SnsUploadConfigView)localObject1).setSyncFacebook(false);
      ((SnsUploadConfigView)localObject1).cuy();
      ((SnsUploadConfigView)localObject1).cuA();
      ((SnsUploadConfigView)localObject1).cuz();
      if (((SnsUploadConfigView)localObject1).rCq)
        ((SnsUploadConfigView)localObject1).rCx.a((a.a)localObject1);
      if (this.rjO != 0)
      {
        localObject1 = this.rhg;
        ((SnsUploadConfigView)localObject1).rCk.setVisibility(8);
        ((SnsUploadConfigView)localObject1).rCl.setVisibility(8);
        ((SnsUploadConfigView)localObject1).rCm.setVisibility(8);
        ((SnsUploadConfigView)localObject1).rCn.setVisibility(8);
      }
      if (this.rjO == 9)
        this.rhg.rCm.setVisibility(0);
      setBackBtn(new SnsUploadUI.17(this));
      a(0, getString(2131303759), new SnsUploadUI.2(this), q.b.ymu);
      findViewById(2131827931).setOnTouchListener(new SnsUploadUI.3(this));
      this.rCD = ((AtContactWidget)findViewById(2131827940));
      this.rCD.rhg = this.rhg;
      this.rCE = ((LocationWidget)findViewById(2131827846));
      this.rCE.setLocationWidgetListener(this);
      switch (this.rjO)
      {
      default:
      case 0:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 9:
      case 10:
      case 12:
      case 13:
      case 14:
      case 1:
      case 11:
      case 15:
      case 16:
      case 2:
      case 8:
      }
    }
    while (true)
    {
      this.rCF.rhg = this.rhg;
      this.rCE.ao(getIntent());
      this.rCD.ao(getIntent());
      aq(getIntent());
      aqX();
      P(paramBundle);
      this.mJB.setOnkbdStateListener(new SnsUploadUI.1(this));
      com.tencent.mm.pluginsdk.f.n(this);
      AppMethodBeat.o(39759);
      return;
      if ((this.rnb == null) || (paramBundle == null))
        break;
      localObject1 = paramBundle.getString("contentdesc");
      if (localObject1 == null)
        break;
      this.rnb.setText((CharSequence)localObject1);
      break;
      label920: bool2 = false;
      break label359;
      label926: bool2 = false;
      break label475;
      label932: bool2 = false;
      break label492;
      this.rCF = ((RangeWidget)findViewById(2131827939));
      findViewById(2131827933).setVisibility(8);
      continue;
      this.rCF = ((RangeWidget)findViewById(2131827939));
      findViewById(2131827933).setVisibility(8);
      continue;
      this.rCF = ((RangeWidget)findViewById(2131827939));
      findViewById(2131827933).setVisibility(8);
      this.rCD.setVisibility(8);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39768);
    super.onDestroy();
    Object localObject;
    if (this.rhg != null)
    {
      localObject = this.rhg;
      g.RQ();
      g.RO().eJo.b(2842, (com.tencent.mm.ai.f)localObject);
    }
    if (this.rnc != null)
      this.rnc.crI();
    if (this.rCE != null)
      this.rCE.stop();
    if (this.rCG != null)
    {
      localObject = this.rCG;
      if (((SnsUploadSayFooter)localObject).eAk != null)
      {
        ((SnsUploadSayFooter)localObject).eAk.AC();
        ((SnsUploadSayFooter)localObject).eAk.destroy();
      }
    }
    this.rCL.clear();
    AppMethodBeat.o(39768);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(39761);
    if (paramKeyEvent.getKeyCode() == 4)
    {
      paramKeyEvent = this.rCG;
      if ((paramKeyEvent.aYV()) || (paramKeyEvent.getVisibility() == 0))
      {
        paramInt = 1;
        if (paramInt == 0)
          break label61;
        this.rCG.aYW();
        AppMethodBeat.o(39761);
      }
    }
    while (true)
    {
      return bool;
      paramInt = 0;
      break;
      label61: cuC();
      AppMethodBeat.o(39761);
      continue;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(39761);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(39766);
    if (this.rjO == 9)
    {
      String str = this.rnb.getText().toString().trim();
      g.RQ();
      g.RP().Ry().set(68408, str);
      if (bo.isNullOrNil(str))
        break label94;
      g.RQ();
      g.RP().Ry().set(7489, Integer.valueOf(this.rnb.getPasterLen()));
    }
    while (true)
    {
      super.aqX();
      super.onPause();
      AppMethodBeat.o(39766);
      return;
      label94: g.RQ();
      g.RP().Ry().set(7489, Integer.valueOf(0));
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(39773);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SnsUploadUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(39773);
      return;
    }
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SnsUploadUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 64:
    }
    while (true)
    {
      AppMethodBeat.o(39773);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        this.rCE.crS();
        AppMethodBeat.o(39773);
        break;
      }
      h.a(this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131296868), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(39743);
          SnsUploadUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          paramAnonymousDialogInterface.dismiss();
          AppMethodBeat.o(39743);
        }
      }
      , new SnsUploadUI.6(this));
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(39767);
    super.onResume();
    this.rCG.post(new SnsUploadUI.4(this));
    ac localac;
    if ((this.rnc != null) && ((this.rnc instanceof ac)))
    {
      localac = (ac)this.rnc;
      if (localac.rkx != null)
        if (!localac.rkE)
        {
          localac.crZ();
          AppMethodBeat.o(39767);
        }
    }
    while (true)
    {
      return;
      localac.csa();
      AppMethodBeat.o(39767);
    }
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(39758);
    if (this.rnb != null)
      paramBundle.putString("contentdesc", this.rnb.getText().toString());
    paramBundle.getString("contentdesc");
    this.rnc.N(paramBundle);
    super.onSaveInstanceState(paramBundle);
    AppMethodBeat.o(39758);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadUI
 * JD-Core Version:    0.6.2
 */