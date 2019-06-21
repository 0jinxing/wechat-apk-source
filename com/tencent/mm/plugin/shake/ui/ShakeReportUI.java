package com.tencent.mm.plugin.shake.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.ds;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.c;
import com.tencent.mm.model.as;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bp;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.shake.b.l;
import com.tencent.mm.plugin.shake.b.l.a;
import com.tencent.mm.plugin.shake.b.l.b;
import com.tencent.mm.plugin.shake.c.a.f.a;
import com.tencent.mm.plugin.shake.d.a.h.a;
import com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bt;
import com.tencent.mm.storage.bu;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.y;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c.a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ShakeReportUI extends MMActivity
  implements as, x.a, l.a, f.a, k.a, n.b
{
  private static List<h.a> ecw;
  private com.tencent.mm.modelgeo.d ecr;
  private boolean ecu;
  private Map<String, h.a> ecv;
  private b.a ecy;
  private ImageView eks;
  private com.tencent.mm.at.a.a fGv;
  private boolean gwZ;
  private boolean nPX;
  private com.tencent.mm.pluginsdk.i.d oOS;
  private boolean quU;
  private boolean quV;
  private boolean quW;
  private boolean quX;
  private boolean quY;
  private boolean quZ;
  private ImageView qvA;
  private com.tencent.mm.plugin.shake.b.d qvB;
  private ImageView qvC;
  private ImageView qvD;
  private ImageView qvE;
  private ImageView qvF;
  private ImageView qvG;
  private ImageView qvH;
  private TextView qvI;
  private int qvJ;
  private int qvK;
  private View qvL;
  private ImageView qvM;
  private ImageView qvN;
  private ImageView qvO;
  private ImageView qvP;
  private View qvQ;
  private View qvR;
  private View qvS;
  private View qvT;
  private View qvU;
  private int qvV;
  private com.tencent.mm.plugin.shake.c.b.a qvW;
  private boolean qvX;

  @SuppressLint({"UseSparseArrays"})
  private Map<Integer, Boolean> qvY;
  private boolean qvZ;
  private boolean qva;
  private int qvb;
  private c qvc;
  private l qvd;
  private com.tencent.mm.pluginsdk.ui.f qve;
  private View qvf;
  private View qvg;
  private TextView qvh;
  private TextView qvi;
  private TextView qvj;
  private View qvk;
  private View qvl;
  private View qvm;
  private View qvn;
  private Animation qvo;
  private Animation qvp;
  private Animation qvq;
  private Animation qvr;
  private View qvs;
  private View qvt;
  private MMImageView qvu;
  private TextView qvv;
  private ImageView qvw;
  private String qvx;
  private Bitmap qvy;
  private Dialog qvz;
  private boolean qwa;
  private boolean qwb;
  private boolean qwc;
  private int qwd;
  private long qwe;
  private boolean qwf;
  private com.tencent.mm.sdk.b.c qwg;
  private com.tencent.mm.sdk.b.c qwh;
  private View.OnClickListener qwi;

  static
  {
    AppMethodBeat.i(24872);
    ecw = new CopyOnWriteArrayList();
    AppMethodBeat.o(24872);
  }

  public ShakeReportUI()
  {
    AppMethodBeat.i(24814);
    this.quU = false;
    this.quV = false;
    this.quX = false;
    this.quY = false;
    this.quZ = false;
    this.qva = false;
    this.qvb = 22;
    this.qvd = new l();
    this.qvs = null;
    this.qvt = null;
    this.qvu = null;
    this.qvv = null;
    this.qvw = null;
    this.qvx = "";
    this.qvy = null;
    this.qvA = null;
    this.fGv = null;
    this.qvB = null;
    this.qvJ = 1;
    this.qvK = 0;
    this.qvU = null;
    this.qvV = 0;
    this.qvX = false;
    this.qvY = new HashMap();
    this.qvZ = false;
    this.qwa = false;
    this.qwb = false;
    this.qwc = false;
    this.qwd = 1;
    this.gwZ = true;
    this.ecu = false;
    this.ecy = new b.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        AppMethodBeat.i(24775);
        if (paramAnonymousBoolean)
        {
          ab.d("MicroMsg.ShakeReportUI", "on location get ok");
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xKb, String.valueOf(paramAnonymousFloat2));
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xKc, String.valueOf(paramAnonymousFloat1));
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xMC, String.valueOf(paramAnonymousDouble2));
          ShakeReportUI.a(ShakeReportUI.this);
          if (ShakeReportUI.b(ShakeReportUI.this) != null)
            ShakeReportUI.b(ShakeReportUI.this).c(ShakeReportUI.c(ShakeReportUI.this));
        }
        while (true)
        {
          AppMethodBeat.o(24775);
          return false;
          if ((!ShakeReportUI.d(ShakeReportUI.this)) && (!com.tencent.mm.modelgeo.d.agA()))
          {
            ShakeReportUI.e(ShakeReportUI.this);
            com.tencent.mm.ui.base.h.a(ShakeReportUI.this, ShakeReportUI.this.getString(2131300421), ShakeReportUI.this.getString(2131297061), ShakeReportUI.this.getString(2131300878), ShakeReportUI.this.getString(2131296868), false, new ShakeReportUI.1.1(this), null);
          }
          ab.w("MicroMsg.ShakeReportUI", "getLocation fail");
        }
      }
    };
    this.ecv = new ConcurrentHashMap();
    this.qwe = 0L;
    this.qwf = false;
    this.qwg = new ShakeReportUI.24(this);
    this.qwh = new ShakeReportUI.25(this);
    this.qwi = new ShakeReportUI.18(this);
    AppMethodBeat.o(24814);
  }

  private void CD(int paramInt)
  {
    AppMethodBeat.i(24834);
    boolean bool;
    if (paramInt == 1)
    {
      bool = true;
      ky(bool);
      if (paramInt != 2)
        break label40;
      kx(true);
      AppMethodBeat.o(24834);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label40: kx(false);
      AppMethodBeat.o(24834);
    }
  }

  private void WM(String paramString)
  {
    AppMethodBeat.i(24836);
    this.quX = false;
    if (this.quW)
      ay.au(this.mController.ylL, 2131303442);
    if (this.qvr == null)
      this.qvr = AnimationUtils.loadAnimation(this.mController.ylL, 2131034173);
    CD(2);
    if ((paramString != null) && (paramString.length() > 1))
      this.qvi.setText(paramString);
    while (true)
    {
      this.qvi.startAnimation(this.qvr);
      this.qva = true;
      al.n(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(24792);
          ShakeReportUI.K(ShakeReportUI.this);
          ShakeReportUI.d(ShakeReportUI.this, false);
          AppMethodBeat.o(24792);
        }
      }
      , this.qvr.getDuration());
      AppMethodBeat.o(24836);
      return;
      this.qvi.setText(2131303408);
    }
  }

  private void a(com.tencent.mm.plugin.shake.c.a.e parame)
  {
    AppMethodBeat.i(24839);
    this.qvW = com.tencent.mm.plugin.shake.c.b.a.a(this, parame, new ShakeReportUI.16(this), new ShakeReportUI.17(this));
    AppMethodBeat.o(24839);
  }

  private void be(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(24850);
    this.quX = false;
    if (this.qvr == null)
      this.qvr = AnimationUtils.loadAnimation(this.mController.ylL, 2131034173);
    CD(2);
    kx(true);
    if ((paramString != null) && (paramString.length() > 1))
      this.qvi.setText(paramString);
    while (true)
    {
      this.qva = true;
      AppMethodBeat.o(24850);
      return;
      if (paramBoolean)
      {
        this.qvi.setText(2131303398);
      }
      else
      {
        this.qvi.setText("");
        kx(false);
      }
    }
  }

  private void c(com.tencent.mm.plugin.shake.b.d paramd)
  {
    AppMethodBeat.i(24844);
    if (bo.isNullOrNil(paramd.field_username))
    {
      AppMethodBeat.o(24844);
      return;
    }
    this.qvf.setTag(paramd.field_username);
    this.qvf.setVisibility(0);
    aw.ZK();
    ad localad = com.tencent.mm.model.c.XM().aoO(paramd.field_username);
    StringBuilder localStringBuilder = new StringBuilder().append(paramd.field_nickname);
    Object localObject;
    label93: String str;
    label157: label215: label369: int i;
    if (com.tencent.mm.n.a.jh(localad.field_type))
    {
      localObject = getString(2131303435);
      str = (String)localObject;
      if (paramd.field_sex != 1)
        break label516;
      this.qvf.setContentDescription(str + paramd.field_distance + this.mController.ylL.getString(2131303464));
      TextView localTextView = (TextView)this.qvf.findViewById(2131827502);
      AppCompatActivity localAppCompatActivity = this.mController.ylL;
      localStringBuilder = new StringBuilder().append(paramd.field_nickname);
      if (!com.tencent.mm.n.a.jh(localad.field_type))
        break label604;
      localObject = getString(2131303435);
      localTextView.setText(com.tencent.mm.pluginsdk.ui.e.j.b(localAppCompatActivity, (String)localObject, localTextView.getTextSize()));
      if (this.eks != null)
      {
        if (bo.isNullOrNil(str))
          break label611;
        this.eks.setContentDescription(String.format(getString(2131303390), new Object[] { str }));
      }
      label280: ((TextView)this.qvf.findViewById(2131827505)).setText(paramd.field_distance);
      a.b.b((ImageView)this.qvf.findViewById(2131827501), paramd.field_username);
      localObject = (ImageView)this.qvf.findViewById(2131827504);
      if (paramd.field_reserved1 == 0)
        break label628;
      ((ImageView)localObject).setVisibility(0);
      ((ImageView)localObject).setImageBitmap(BackwardSupportUtil.b.i(ao.a.flw.ky(paramd.field_reserved1), 2.0F));
      if ((paramd.field_reserved1 != 0) || (paramd.field_sex == 0))
        break label646;
      if (paramd.field_sex != 1)
        break label638;
      i = 2131231387;
      label396: localObject = com.tencent.mm.bz.a.g(this, i);
      this.qvf.findViewById(2131827503).setVisibility(0);
      ((ImageView)this.qvf.findViewById(2131827503)).setImageDrawable((Drawable)localObject);
    }
    while (true)
    {
      if (paramd.getProvince() == null)
      {
        ab.e("MicroMsg.ShakeReportUI", "PROVINCE NULL");
        paramd.field_province = "";
      }
      if (paramd.getCity() == null)
      {
        ab.e("MicroMsg.ShakeReportUI", "CITY NULL");
        paramd.field_city = "";
      }
      this.qvf.startAnimation(AnimationUtils.loadAnimation(this.mController.ylL, 2131034250));
      AppMethodBeat.o(24844);
      break;
      localObject = "";
      break label93;
      label516: if (paramd.field_sex == 2)
      {
        this.qvf.setContentDescription(str + paramd.field_distance + this.mController.ylL.getString(2131303463));
        break label157;
      }
      this.qvf.setContentDescription(str + paramd.field_distance);
      break label157;
      label604: localObject = "";
      break label215;
      label611: this.eks.setContentDescription(getString(2131303391));
      break label280;
      label628: ((ImageView)localObject).setVisibility(8);
      break label369;
      label638: i = 2131231386;
      break label396;
      label646: this.qvf.findViewById(2131827503).setVisibility(8);
    }
  }

  private void cdJ()
  {
    AppMethodBeat.i(24817);
    ckF();
    aw.ZK();
    com.tencent.mm.model.c.a(this);
    aw.ZK();
    com.tencent.mm.model.c.Ry().a(this);
    com.tencent.mm.plugin.shake.b.m.cjS().c(this);
    if (this.qvd.qrS != null)
      this.qvd.qrS.resume();
    ckG();
    new ak().postDelayed(new ShakeReportUI.22(this), 1000L);
    if (this.oOS != null)
      this.oOS.diJ();
    kx(false);
    ky(false);
    ckI();
    aw.ZK();
    Object localObject = (String)com.tencent.mm.model.c.Ry().get(327696, "1");
    if (com.tencent.mm.plugin.shake.d.a.k.cjQ())
    {
      if (this.qvJ == 4)
        kt(true);
      if (((String)localObject).equals("4"))
        dy(findViewById(2131827518));
    }
    boolean bool;
    if (((String)localObject).equals("3"))
    {
      dy(findViewById(2131827515));
      bool = com.tencent.mm.x.c.PK().bY(262154, 266258);
      if ((!getIntent().getBooleanExtra("shake_music", false)) || (!com.tencent.mm.aw.d.aim()) || (this.qvd.qrR == 3))
        break label357;
      getIntent().putExtra("shake_music", false);
      this.qvJ = 3;
    }
    while (true)
    {
      ckH();
      ku(true);
      ab.d("MicroMsg.ShakeReportUI", "isShakeGetConfigList = %s", new Object[] { Boolean.valueOf(ae.gip) });
      if (ae.gip)
      {
        localObject = new com.tencent.mm.ba.k(7);
        aw.Rg().a((com.tencent.mm.ai.m)localObject, 0);
      }
      ckR();
      ckO();
      ckC();
      AppMethodBeat.o(24817);
      return;
      if ((!((String)localObject).equals("6")) || (!com.tencent.mm.plugin.shake.c.c.a.cks()))
        break;
      dy(findViewById(2131827509));
      break;
      label357: if ((getIntent().getBooleanExtra("shake_tv", false)) && (this.qvd.qrR != 4) && (com.tencent.mm.plugin.shake.d.a.k.cjQ()))
      {
        getIntent().putExtra("shake_tv", false);
        this.qvJ = 4;
      }
      else if ((this.qvd.qrR != 6) && (com.tencent.mm.plugin.shake.c.c.a.cks()) && ((bool) || (getIntent().getBooleanExtra("shake_card", false))))
      {
        this.qvV = getIntent().getIntExtra("shake_card", 0);
        getIntent().putExtra("shake_card", false);
        ab.i("MicroMsg.ShakeReportUI", "onresume shake card tab is open, activity type is 0 or open from specialview");
        this.qvJ = 6;
      }
    }
  }

  private void ckC()
  {
    AppMethodBeat.i(24820);
    if (!ckQ())
      AppMethodBeat.o(24820);
    while (true)
    {
      return;
      if (BluetoothAdapter.getDefaultAdapter() != null)
      {
        Object localObject = com.tencent.mm.m.g.Nv().Nl();
        if (localObject != null)
        {
          this.qwe = System.currentTimeMillis();
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            String str = (String)((Iterator)localObject).next();
            ab.i("MicroMsg.ShakeReportUI", "op=true,iBeacon = %s", new Object[] { str });
            ds localds = new ds();
            localds.cxg.cxi = str;
            localds.cxg.cxf = true;
            com.tencent.mm.sdk.b.a.xxA.m(localds);
          }
        }
      }
      AppMethodBeat.o(24820);
    }
  }

  private void ckD()
  {
    AppMethodBeat.i(24821);
    aw.ZK();
    if (!bo.a((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xMr, null), false))
    {
      this.ecv.clear();
      ecw = new CopyOnWriteArrayList();
    }
    if (Build.VERSION.SDK_INT >= 18)
    {
      Object localObject = com.tencent.mm.m.g.Nv().Nl();
      if (localObject != null)
      {
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          ds localds = new ds();
          ab.i("MicroMsg.ShakeReportUI", "op=false,iBeacon = %s", new Object[] { str });
          localds.cxg.cxi = str;
          localds.cxg.cxf = false;
          com.tencent.mm.sdk.b.a.xxA.m(localds);
        }
      }
    }
    AppMethodBeat.o(24821);
  }

  private void ckE()
  {
    AppMethodBeat.i(24823);
    if (com.tencent.mm.aw.d.ain())
    {
      aw.ZK();
      if (com.tencent.mm.model.c.Ry().getInt(4118, 0) == 0)
      {
        c.a locala = new c.a(this.mController.ylL);
        locala.PV(2131297061);
        locala.PZ(2131303418);
        locala.Qc(2131303417).a(new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(24776);
            if (ShakeReportUI.s(ShakeReportUI.this) != null)
              ShakeReportUI.s(ShakeReportUI.this).cancel();
            AppMethodBeat.o(24776);
          }
        });
        locala.rc(true);
        locala.f(new ShakeReportUI.3(this));
        this.qvz = locala.aMb();
        this.qvz.show();
      }
    }
    AppMethodBeat.o(24823);
  }

  private void ckF()
  {
    AppMethodBeat.i(24824);
    aw.ZK();
    int i = bo.a((Integer)com.tencent.mm.model.c.Ry().get(12290, null), 0);
    ImageView localImageView1 = (ImageView)findViewById(2131827488);
    if ((this.qvy != null) && (!this.qvy.isRecycled()))
      this.qvy.recycle();
    aw.ZK();
    Object localObject1;
    ImageView localImageView2;
    if (bo.d((Boolean)com.tencent.mm.model.c.Ry().get(4110, null)))
    {
      localObject1 = new StringBuilder();
      aw.ZK();
      localObject1 = com.tencent.mm.model.c.XW() + "default_shake_img_filename.jpg";
      if (com.tencent.mm.vfs.e.ct((String)localObject1))
      {
        this.qvy = x.vv((String)localObject1);
        localImageView1.setImageDrawable(new BitmapDrawable(this.qvy));
        localImageView2 = (ImageView)findViewById(2131827490);
        localImageView1 = (ImageView)findViewById(2131827493);
        if (i != 2)
          break label389;
        j = 2130840160;
        label178: localImageView2.setImageResource(j);
        if (i != 2)
          break label397;
      }
    }
    label389: label397: for (int j = 2130840159; ; j = 2130840158)
    {
      while (true)
      {
        localImageView1.setImageResource(j);
        localObject1 = new ShakeReportUI.7(this);
        localImageView2.setOnClickListener((View.OnClickListener)localObject1);
        localImageView1.setOnClickListener((View.OnClickListener)localObject1);
        if (this.qvm == null)
          this.qvm = findViewById(2131827498);
        this.qvm.setOnClickListener((View.OnClickListener)localObject1);
        if (this.qvn == null)
          this.qvn = findViewById(2131827491);
        this.qvn.setOnClickListener((View.OnClickListener)localObject1);
        AppMethodBeat.o(24824);
        return;
        try
        {
          localObject1 = new android/graphics/drawable/BitmapDrawable;
          ((BitmapDrawable)localObject1).<init>(com.tencent.mm.sdk.platformtools.d.decodeStream(this.mController.ylL.getAssets().open("resource/shakehideimg_man.jpg")));
          localImageView1.setImageDrawable((Drawable)localObject1);
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            ab.w("MicroMsg.ShakeReportUI", "Bg decode exp:" + localIOException.getLocalizedMessage());
            Object localObject2 = null;
          }
        }
      }
      aw.ZK();
      this.qvy = x.vv((String)com.tencent.mm.model.c.Ry().get(4111, null));
      localImageView1.setImageDrawable(new BitmapDrawable(this.qvy));
      break;
      j = 2130840161;
      break label178;
    }
  }

  private void ckG()
  {
    AppMethodBeat.i(24825);
    this.quZ = true;
    if ((this.qvW != null) && (this.qvW.isShowing()) && (!this.qvW.qsZ))
      this.quZ = false;
    ab.i("MicroMsg.ShakeReportUI", "tryStartShake");
    if ((this.oOS != null) && (!this.oOS.diI()))
    {
      this.oOS.a(new ShakeReportUI.a(this));
      if ((this.oOS.diK()) && (this.qvh != null))
      {
        this.qvh.setText(getString(2131303381));
        AppMethodBeat.o(24825);
      }
    }
    while (true)
    {
      return;
      this.qvh.setText(getString(2131303443));
      AppMethodBeat.o(24825);
    }
  }

  private void ckH()
  {
    AppMethodBeat.i(24827);
    if ((this.qvJ == 3) && (com.tencent.mm.aw.d.aim()))
    {
      this.qvJ = 3;
      this.qvj.setText(2131303459);
      this.qvA.setBackgroundResource(2130840144);
      this.qvC.setBackgroundResource(2130840150);
      this.qvD.setBackgroundResource(2130840149);
      this.qvE.setBackgroundResource(2130840153);
      this.qvF.setBackgroundResource(2130840140);
      findViewById(2131827506).setVisibility(0);
      setMMTitle(2131303455);
      com.tencent.mm.plugin.report.service.h.pYm.e(11720, new Object[] { Integer.valueOf(2) });
      com.tencent.mm.plugin.report.service.h.pYm.k(834L, 2L, 1L);
    }
    while (true)
    {
      l.b localb = this.qvd.a(this, this.qvJ, this);
      if (!this.quX)
        ky(false);
      if ((com.tencent.mm.plugin.shake.c.c.a.cks()) && ((localb instanceof com.tencent.mm.plugin.shake.c.a.g)))
      {
        ((com.tencent.mm.plugin.shake.c.a.g)localb).setFromScene(this.qvV);
        if (this.qvV == 3)
        {
          ab.i("MicroMsg.ShakeReportUI", "open shake card from specialview");
          ((com.tencent.mm.plugin.shake.c.a.g)localb).Ix(getIntent().getStringExtra("key_shake_card_ext_info"));
        }
      }
      AppMethodBeat.o(24827);
      return;
      if ((this.qvJ == 4) && (com.tencent.mm.plugin.shake.d.a.k.cjQ()))
      {
        this.qvJ = 4;
        this.qvj.setText(2131303460);
        this.qvA.setBackgroundResource(2130840144);
        this.qvC.setBackgroundResource(2130840150);
        this.qvD.setBackgroundResource(2130840147);
        this.qvE.setBackgroundResource(2130840155);
        this.qvF.setBackgroundResource(2130840140);
        findViewById(2131827506).setVisibility(0);
        setMMTitle(2131303456);
        com.tencent.mm.plugin.report.service.h.pYm.e(11720, new Object[] { Integer.valueOf(3) });
        com.tencent.mm.plugin.report.service.h.pYm.k(834L, 3L, 1L);
      }
      else if ((this.qvJ == 5) && (ckP()))
      {
        this.qvJ = 5;
        this.qvj.setText(2131303458);
        this.qvA.setBackgroundResource(2130840146);
        this.qvC.setBackgroundResource(2130840150);
        this.qvD.setBackgroundResource(2130840147);
        this.qvE.setBackgroundResource(2130840153);
        this.qvF.setBackgroundResource(2130840140);
        findViewById(2131827506).setVisibility(0);
        setMMTitle(2131303454);
        com.tencent.mm.plugin.report.service.h.pYm.e(11720, new Object[] { Integer.valueOf(4) });
        com.tencent.mm.plugin.report.service.h.pYm.k(834L, 4L, 1L);
      }
      else if ((this.qvJ == 6) && (com.tencent.mm.plugin.shake.c.c.a.cks()))
      {
        this.qvJ = 6;
        this.qvj.setText(2131303457);
        this.qvA.setBackgroundResource(2130840144);
        this.qvC.setBackgroundResource(2130840150);
        this.qvD.setBackgroundResource(2130840147);
        this.qvE.setBackgroundResource(2130840153);
        this.qvF.setBackgroundResource(2130840141);
        findViewById(2131827506).setVisibility(0);
        setMMTitle(2131303453);
        ckK();
        ckN();
        com.tencent.mm.plugin.report.service.h.pYm.e(11720, new Object[] { Integer.valueOf(5) });
        com.tencent.mm.plugin.report.service.h.pYm.k(834L, 5L, 1L);
      }
      else
      {
        this.qvJ = 1;
        this.qvj.setText(2131303401);
        this.qvA.setBackgroundResource(2130840144);
        this.qvC.setBackgroundResource(2130840152);
        this.qvD.setBackgroundResource(2130840147);
        this.qvE.setBackgroundResource(2130840153);
        this.qvF.setBackgroundResource(2130840140);
        if (com.tencent.mm.aw.d.aim())
          findViewById(2131827506).setVisibility(0);
        setMMTitle(2131303452);
        com.tencent.mm.plugin.report.service.h.pYm.e(11720, new Object[] { Integer.valueOf(1) });
        com.tencent.mm.plugin.report.service.h.pYm.k(834L, 1L, 1L);
      }
    }
  }

  private void ckI()
  {
    AppMethodBeat.i(24828);
    aw.ZK();
    this.quW = bo.d((Boolean)com.tencent.mm.model.c.Ry().get(4112, null));
    if (this.quW)
    {
      setTitleMuteIconVisibility(8);
      AppMethodBeat.o(24828);
    }
    while (true)
    {
      return;
      setTitleMuteIconVisibility(0);
      AppMethodBeat.o(24828);
    }
  }

  private void ckJ()
  {
    AppMethodBeat.i(24848);
    if (com.tencent.mm.plugin.shake.c.c.a.cks())
      if (com.tencent.mm.x.c.PK().bY(262155, 266259))
      {
        this.qvH.setVisibility(0);
        AppMethodBeat.o(24848);
      }
    while (true)
    {
      return;
      this.qvH.setVisibility(8);
      AppMethodBeat.o(24848);
    }
  }

  private void ckK()
  {
    AppMethodBeat.i(24849);
    boolean bool2;
    if ((this.qvJ == 6) && (com.tencent.mm.plugin.shake.c.c.a.cks()))
    {
      boolean bool1 = com.tencent.mm.x.c.PK().bY(262154, 266258);
      bool2 = com.tencent.mm.x.c.PK().bY(262155, 266259);
      if (bool1)
      {
        be(com.tencent.mm.plugin.shake.c.c.a.ckn(), true);
        AppMethodBeat.o(24849);
      }
    }
    while (true)
    {
      return;
      if (bool2)
      {
        be(com.tencent.mm.plugin.shake.c.c.a.ckp(), true);
        AppMethodBeat.o(24849);
      }
      else if (!this.qvX)
      {
        if (!TextUtils.isEmpty(com.tencent.mm.plugin.shake.c.c.a.ckl()))
        {
          be(com.tencent.mm.plugin.shake.c.c.a.ckl(), true);
          AppMethodBeat.o(24849);
        }
        else
        {
          be(getString(2131303398), true);
        }
      }
      else
      {
        AppMethodBeat.o(24849);
      }
    }
  }

  private void ckL()
  {
    AppMethodBeat.i(24851);
    if ((this.qvW != null) && (this.qvW.isShowing()))
      this.qvW.dismiss();
    this.qvW = null;
    AppMethodBeat.o(24851);
  }

  private void ckM()
  {
    int i = 1;
    AppMethodBeat.i(24852);
    boolean bool1 = com.tencent.mm.plugin.shake.c.c.a.cjN();
    boolean bool2 = com.tencent.mm.x.c.PK().bY(262154, 266258);
    boolean bool3 = com.tencent.mm.x.c.PK().bY(262155, 266259);
    if (getIntent().getBooleanExtra("shake_card", false));
    for (int j = getIntent().getIntExtra("shake_card", 0); ; j = 0)
    {
      com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.pYm;
      int k;
      if (bool2)
      {
        k = 1;
        if (!bool1)
          break label236;
        m = 1;
        label85: localh.e(11668, new Object[] { Integer.valueOf(1), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), com.tencent.mm.plugin.shake.c.c.a.cko(), Integer.valueOf(com.tencent.mm.plugin.shake.c.c.a.ckk()) });
        localh = com.tencent.mm.plugin.report.service.h.pYm;
        if (!bool3)
          break label242;
        k = 1;
        label157: if (!bool1)
          break label248;
      }
      label236: label242: label248: for (int m = i; ; m = 0)
      {
        localh.e(11668, new Object[] { Integer.valueOf(2), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), com.tencent.mm.plugin.shake.c.c.a.cko(), Integer.valueOf(com.tencent.mm.plugin.shake.c.c.a.ckk()) });
        AppMethodBeat.o(24852);
        return;
        k = 0;
        break;
        m = 0;
        break label85;
        k = 0;
        break label157;
      }
    }
  }

  private void ckN()
  {
    AppMethodBeat.i(24853);
    if (!TextUtils.isEmpty(com.tencent.mm.plugin.shake.c.c.a.ckm()))
      this.qvI.setText(com.tencent.mm.plugin.shake.c.c.a.ckm());
    AppMethodBeat.o(24853);
  }

  private void ckO()
  {
    AppMethodBeat.i(24854);
    label123: Object localObject;
    label167: label208: int i;
    if (com.tencent.mm.aw.d.aim())
    {
      ab.i("MicroMsg.ShakeReportUI", "is not oversea user, show shake music");
      this.qvY.put(Integer.valueOf(3), Boolean.TRUE);
      findViewById(2131827515).setVisibility(0);
      if (com.tencent.mm.aw.d.ain())
      {
        aw.ZK();
        if (com.tencent.mm.model.c.Ry().getInt(4118, 0) == 0)
          this.qvG.setVisibility(0);
      }
      else
      {
        if (!com.tencent.mm.plugin.shake.d.a.k.cjQ())
          break label308;
        this.qvY.put(Integer.valueOf(4), Boolean.TRUE);
        findViewById(2131827518).setVisibility(0);
        ab.i("MicroMsg.ShakeReportUI", "show shake tv tab");
        if (!com.tencent.mm.plugin.shake.c.c.a.cks())
          break label349;
        this.qvY.put(Integer.valueOf(6), Boolean.TRUE);
        findViewById(2131827509).setVisibility(0);
        ab.i("MicroMsg.ShakeReportUI", "show shake card tab");
        if (!ckP())
          break label391;
        this.qvY.put(Integer.valueOf(5), Boolean.TRUE);
        this.qvU.setVisibility(0);
        ab.i("MicroMsg.ShakeReportUI", "[shakezb]show shake ibeacon tab");
        localObject = this.qvY.values().iterator();
        i = 0;
        label225: if (!((Iterator)localObject).hasNext())
          break label429;
        if (!((Boolean)((Iterator)localObject).next()).booleanValue())
          break label568;
        i++;
      }
    }
    label308: label568: 
    while (true)
    {
      break label225;
      this.qvG.setVisibility(8);
      break;
      this.qvY.put(Integer.valueOf(3), Boolean.FALSE);
      findViewById(2131827515).setVisibility(8);
      ab.i("MicroMsg.ShakeReportUI", "is oversea user, hide shake music");
      break;
      this.qvY.put(Integer.valueOf(4), Boolean.FALSE);
      findViewById(2131827518).setVisibility(8);
      ab.i("MicroMsg.ShakeReportUI", "hide shake tv tab");
      break label123;
      label349: findViewById(2131827509).setVisibility(8);
      this.qvY.put(Integer.valueOf(6), Boolean.FALSE);
      ab.i("MicroMsg.ShakeReportUI", "hide shake card tab");
      break label167;
      this.qvY.put(Integer.valueOf(5), Boolean.FALSE);
      this.qvU.setVisibility(8);
      ab.i("MicroMsg.ShakeReportUI", "[shakezb]hide shake ibeacon tab");
      break label208;
      this.qvK = i;
      localObject = (LinearLayout)findViewById(2131827506);
      if (i == 1)
      {
        ((LinearLayout)localObject).setVisibility(8);
        if ((i <= 4) || (!this.qwf))
          break label514;
        findViewById(2131827518).setVisibility(8);
        ab.i("MicroMsg.ShakeReportUI", "show tab count is > 4 and beaconMap.size() > 0.");
        this.qvK -= 1;
        AppMethodBeat.o(24854);
      }
      while (true)
      {
        return;
        ((LinearLayout)localObject).setVisibility(0);
        break;
        if ((i > 4) && (!this.qwf))
        {
          this.qvU.setVisibility(8);
          this.qvZ = false;
          this.qvK -= 1;
          ab.i("MicroMsg.ShakeReportUI", "show tab count is > 4 and beaconMap.size() <= 0.");
        }
        AppMethodBeat.o(24854);
      }
    }
  }

  private boolean ckP()
  {
    AppMethodBeat.i(24855);
    ab.i("MicroMsg.ShakeReportUI", "[shakezb] isChineseAppLang :" + aa.don() + " ,getApplicationLanguage[en or zh_CN or zh_HK or zh_TW is avaliable] :" + aa.dor());
    boolean bool;
    if ((this.qvZ) && (ckQ()))
    {
      bool = true;
      AppMethodBeat.o(24855);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(24855);
    }
  }

  private static boolean ckQ()
  {
    AppMethodBeat.i(24856);
    boolean bool;
    if ((aa.don()) || (aa.dor().equals("en")) || (aa.dor().equals("ja")))
    {
      bool = true;
      AppMethodBeat.o(24856);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(24856);
    }
  }

  private void ckR()
  {
    AppMethodBeat.i(24857);
    this.qvL.setVisibility(8);
    AppMethodBeat.o(24857);
  }

  private void d(com.tencent.mm.plugin.shake.b.d paramd)
  {
    AppMethodBeat.i(24845);
    if (bo.isNullOrNil(paramd.field_username))
      AppMethodBeat.o(24845);
    while (true)
    {
      return;
      this.qvf.setTag(paramd.field_username);
      ((TextView)this.qvf.findViewById(2131827502)).setText(paramd.field_username);
      this.qvf.setContentDescription(bo.nullAsNil(paramd.field_nickname));
      ((TextView)this.qvf.findViewById(2131827505)).setText(paramd.field_signature);
      this.fGv.a(paramd.getProvince(), (ImageView)this.qvf.findViewById(2131827501));
      this.qvf.findViewById(2131827503).setVisibility(8);
      this.qvf.startAnimation(AnimationUtils.loadAnimation(this.mController.ylL, 2131034250));
      this.qvf.setVisibility(0);
      AppMethodBeat.o(24845);
    }
  }

  private void dy(View paramView)
  {
    AppMethodBeat.i(24840);
    if (paramView == null)
      AppMethodBeat.o(24840);
    while (true)
    {
      return;
      bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.RECORD_AUDIO", 80, "", "");
      ab.i("MicroMsg.ShakeReportUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this });
      if (bool)
        break;
      AppMethodBeat.o(24840);
    }
    be("", false);
    if (paramView.getId() == 2131827513)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(11722, new Object[] { Integer.valueOf(1) });
      if (this.qvJ != 1)
      {
        if (this.qvJ == 4)
          kt(false);
        this.qvJ = 1;
        ckH();
        kv(false);
        if (this.qvf != null)
          this.qvf.setVisibility(8);
      }
    }
    label429: 
    do
    {
      while (true)
      {
        ku(true);
        ky(false);
        ckR();
        AppMethodBeat.o(24840);
        break;
        if (paramView.getId() == 2131827515)
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(11722, new Object[] { Integer.valueOf(2) });
          if ((!this.ecu) && (this.ecr != null))
            this.ecr.a(this.ecy, true);
          if ((!com.tencent.mm.r.a.bJ(this)) && (!com.tencent.mm.r.a.bH(this)) && (this.qvJ != 3))
          {
            if (this.qvJ == 4)
              kt(false);
            this.qvJ = 3;
            ckH();
            kv(false);
            if (this.qvf != null)
              this.qvf.setVisibility(8);
          }
          ckE();
        }
        else
        {
          if (paramView.getId() != 2131827518)
            break label429;
          com.tencent.mm.plugin.report.service.h.pYm.e(11722, new Object[] { Integer.valueOf(3) });
          if ((!this.ecu) && (this.ecr != null))
            this.ecr.a(this.ecy, true);
          if ((!com.tencent.mm.r.a.bJ(this)) && (!com.tencent.mm.r.a.bH(this)) && (this.qvJ != 4))
          {
            kt(true);
            this.qvJ = 4;
            ckH();
            kv(false);
            if (this.qvf != null)
              this.qvf.setVisibility(8);
          }
        }
      }
      if ((paramView.getId() != 2131827520) && (paramView.getId() != 2131827507))
        break label628;
      com.tencent.mm.plugin.report.service.h.pYm.e(11722, new Object[] { Integer.valueOf(4) });
    }
    while (this.qvJ == 5);
    this.qvJ = 5;
    ckH();
    kv(false);
    if (this.qvf != null)
      this.qvf.setVisibility(8);
    if ((!Build.VERSION.RELEASE.equals("6.0")) && (!Build.VERSION.RELEASE.equals("6.0.0")) && (Build.VERSION.SDK_INT >= 23))
    {
      paramView = (LocationManager)ah.getContext().getSystemService("location");
      if (paramView == null)
        break label733;
    }
    label733: for (boolean bool = paramView.isProviderEnabled("gps"); ; bool = true)
    {
      if (!bool)
        WM(getString(2131303412));
      paramView = BluetoothAdapter.getDefaultAdapter();
      if ((paramView != null) && (paramView.getState() != 12))
      {
        WM(getString(2131303411));
        break;
      }
      if (paramView != null)
        break;
      WM(getString(2131303415));
      break;
      label628: if (paramView.getId() != 2131827509)
        break;
      com.tencent.mm.plugin.report.service.h.pYm.e(11722, new Object[] { Integer.valueOf(5) });
      if (this.qvJ == 6)
        break;
      if (this.qvJ == 4)
        kt(false);
      this.qvJ = 6;
      ckH();
      kv(false);
      if (this.qvf != null)
        this.qvf.setVisibility(8);
      com.tencent.mm.x.c.PK().y(262155, false);
      this.qvH.setVisibility(8);
      break;
    }
  }

  private void kt(boolean paramBoolean)
  {
    AppMethodBeat.i(24826);
    String str = String.format("%1$s-shaketype-%2$d", new Object[] { getClass().getName(), Integer.valueOf(4) });
    ab.d("MicroMsg.ShakeReportUI", "activate change report , class name=" + str + ", isActive=" + paramBoolean);
    y.d(paramBoolean, new Intent().putExtra("classname", str));
    AppMethodBeat.o(24826);
  }

  private void ku(boolean paramBoolean)
  {
    AppMethodBeat.i(24829);
    kv(paramBoolean);
    kw(paramBoolean);
    AppMethodBeat.o(24829);
  }

  private void kv(boolean paramBoolean)
  {
    AppMethodBeat.i(24830);
    if (this.qvs == null)
      this.qvs = findViewById(2131824685);
    if ((this.qvd.qrR == 3) || (this.qvd.qrR == 4) || (this.qvd.qrR == 5) || (this.qvd.qrR == 6) || (!paramBoolean))
    {
      this.qvs.setVisibility(8);
      AppMethodBeat.o(24830);
    }
    while (true)
    {
      return;
      int i = com.tencent.mm.bi.d.akR().baS();
      if (i <= 0)
      {
        this.qvs.setVisibility(8);
        AppMethodBeat.o(24830);
      }
      else
      {
        this.qvs.setVisibility(0);
        ((TextView)this.qvs.findViewById(2131824687)).setText(getResources().getQuantityString(2131361819, i, new Object[] { Integer.valueOf(i) }));
        this.qvs.setOnClickListener(new ShakeReportUI.8(this));
        if (this.qvw == null)
          this.qvw = ((ImageView)findViewById(2131824686));
        bt localbt = com.tencent.mm.bi.d.akR().duu();
        if (localbt != null)
        {
          this.qvx = localbt.field_sayhiuser;
          a.b.b(this.qvw, this.qvx);
        }
        AppMethodBeat.o(24830);
      }
    }
  }

  private void kw(boolean paramBoolean)
  {
    AppMethodBeat.i(24831);
    if (this.qvt == null)
      this.qvt = findViewById(2131824688);
    if (!paramBoolean)
    {
      this.qvt.setVisibility(8);
      AppMethodBeat.o(24831);
    }
    int i;
    while (true)
    {
      return;
      i = com.tencent.mm.plugin.shake.b.m.cjT().baS();
      if (i > 0)
        break;
      this.qvt.setVisibility(8);
      AppMethodBeat.o(24831);
    }
    if (this.qvv == null)
      this.qvv = ((TextView)this.qvt.findViewById(2131824690));
    this.qvv.setText(getString(2131303436, new Object[] { Integer.valueOf(i) }));
    this.qvt.setOnClickListener(new ShakeReportUI.9(this));
    if (this.qvu == null)
      this.qvu = ((MMImageView)findViewById(2131824689));
    Object localObject = com.tencent.mm.plugin.shake.b.m.cjT().cjJ();
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.plugin.shake.b.f)localObject).field_thumburl;
      if (bo.isNullOrNil((String)localObject))
        break label258;
      com.tencent.mm.plugin.shake.e.b localb = new com.tencent.mm.plugin.shake.e.b((String)localObject);
      localObject = x.a(localb);
      this.qvu.setTag(localb.anL());
      if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
        break label245;
      this.qvu.setImageBitmap((Bitmap)localObject);
    }
    while (true)
    {
      this.qvt.setVisibility(0);
      AppMethodBeat.o(24831);
      break;
      label245: this.qvu.setImageResource(2131230820);
      continue;
      label258: this.qvu.setImageResource(2131230820);
    }
  }

  private void kx(boolean paramBoolean)
  {
    AppMethodBeat.i(24832);
    if (this.qvi != null)
      if (paramBoolean)
      {
        this.qvi.setVisibility(0);
        AppMethodBeat.o(24832);
      }
    while (true)
    {
      return;
      this.qvi.setVisibility(8);
      this.qvi.cancelLongPress();
      AppMethodBeat.o(24832);
    }
  }

  private void ky(boolean paramBoolean)
  {
    AppMethodBeat.i(24833);
    if (this.qvg != null)
      if (paramBoolean)
      {
        this.qvg.setVisibility(0);
        AppMethodBeat.o(24833);
      }
    while (true)
    {
      return;
      this.qvg.setVisibility(4);
      AppMethodBeat.o(24833);
    }
  }

  public final void ZB()
  {
    AppMethodBeat.i(24835);
    ckH();
    AppMethodBeat.o(24835);
  }

  public final void a(int paramInt, com.tencent.mm.plugin.shake.c.a.e parame, long paramLong)
  {
    AppMethodBeat.i(24838);
    this.qvX = true;
    if (paramInt == 1251)
      if (parame == null)
        AppMethodBeat.o(24838);
    while (true)
    {
      return;
      ab.i("MicroMsg.ShakeReportUI", "onShakeCardReturn MMFunc_Biz_GetLbsCard");
      com.tencent.mm.plugin.shake.c.c.a.cjM();
      ckO();
      ckJ();
      ckM();
      this.qvV = 4;
      com.tencent.mm.plugin.shake.b.m.cjY().putValue("key_shake_card_item", parame);
      AppMethodBeat.o(24838);
      continue;
      if (paramInt != 1250)
        break label224;
      if (parame == null)
      {
        this.qvB = null;
        WM(null);
        AppMethodBeat.o(24838);
      }
      else
      {
        if (((parame != null) && (!this.quX)) || (this.quX))
          break;
        this.qvB = null;
        WM(null);
        AppMethodBeat.o(24838);
      }
    }
    this.quX = false;
    ab.i("MicroMsg.ShakeReportUI", "onShakeCardReturn MMFunc_Biz_ShakeCard");
    Object localObject;
    if (this.qvd.qrR == 6)
    {
      localObject = this.qvd.qrS;
      if ((localObject != null) && ((localObject instanceof com.tencent.mm.plugin.shake.c.a.g)))
      {
        localObject = (com.tencent.mm.plugin.shake.c.a.g)localObject;
        switch ((int)paramLong)
        {
        default:
        case 1:
        case 2:
        }
      }
    }
    while (true)
    {
      label224: AppMethodBeat.o(24838);
      break;
      ab.i("MicroMsg.ShakeReportUI", "onShakeGetReturn() ShakeCardService RETURN_OK");
      if (((com.tencent.mm.plugin.shake.c.a.g)localObject).kdC == 3)
      {
        ab.i("MicroMsg.ShakeReportUI", "onShakeGetReturn() actionType is  MMBIZ_SHAKE_CARD_ACTION_TYPE_NO_CARD");
        if ((parame != null) && (!TextUtils.isEmpty(parame.qsu)))
        {
          WM(parame.qsu);
          AppMethodBeat.o(24838);
          break;
        }
        WM(getString(2131303397));
        AppMethodBeat.o(24838);
        break;
      }
      ab.i("MicroMsg.ShakeReportUI", "onShakeGetReturn() actionType is " + ((com.tencent.mm.plugin.shake.c.a.g)localObject).kdC);
      CD(3);
      if (parame.kdC == 1)
        this.quZ = false;
      if ((this.qvW != null) && (this.qvW.isShowing()))
      {
        AppMethodBeat.o(24838);
        break;
      }
      if (parame.qsw)
      {
        localObject = (ViewStub)findViewById(2131827499);
        if (localObject != null)
          ((ViewStub)localObject).inflate();
        ((ShakeEggAnimFrame)findViewById(2131822727)).aa(this);
        new ak().postDelayed(new ShakeReportUI.15(this, parame), 1000L);
        AppMethodBeat.o(24838);
        break;
      }
      a(parame);
      AppMethodBeat.o(24838);
      break;
      ab.i("MicroMsg.ShakeReportUI", "onShakeGetReturn() ShakeCardService RETURN_ERR_REPORT");
      WM(getString(2131303397));
    }
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(24843);
    a("", null);
    AppMethodBeat.o(24843);
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(24842);
    ckI();
    if (!this.quY)
      ku(true);
    AppMethodBeat.o(24842);
  }

  public final void b(List<com.tencent.mm.plugin.shake.b.d> paramList, long paramLong)
  {
    AppMethodBeat.i(24837);
    ckR();
    if ((paramList == null) || (!this.quX) || (paramLong == 6L))
    {
      this.qvB = null;
      if (paramLong == 6L)
      {
        WM(getString(2131303416));
        AppMethodBeat.o(24837);
      }
    }
    Object localObject;
    while (true)
    {
      return;
      if (paramLong == 7L)
      {
        WM(getString(2131303414));
        AppMethodBeat.o(24837);
      }
      else if (paramLong == 8L)
      {
        WM(getString(2131303412));
        AppMethodBeat.o(24837);
      }
      else if (paramLong == 9L)
      {
        WM(getString(2131303411));
        AppMethodBeat.o(24837);
      }
      else if (paramLong == 10L)
      {
        WM(getString(2131303415));
        AppMethodBeat.o(24837);
      }
      else
      {
        WM(null);
        AppMethodBeat.o(24837);
        continue;
        this.quX = false;
        if (paramList.size() > 0)
          this.qvB = ((com.tencent.mm.plugin.shake.b.d)paramList.get(0));
        int i;
        if (this.qvd.qrR == 1)
        {
          if ((paramList.size() > 0) && (((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_type != 0))
          {
            WM(null);
            AppMethodBeat.o(24837);
          }
          else
          {
            this.qvb = ((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).scene;
            i = paramList.size();
            if (i == 0)
            {
              WM(null);
              AppMethodBeat.o(24837);
            }
            else if (i == 1)
            {
              String str = ((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_username;
              localObject = ((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_nickname;
              ab.i("MicroMsg.ShakeReportUI", "1 u:" + str + " n:" + (String)localObject + " d:" + ((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_distance);
              if (this.quW)
                ay.au(this.mController.ylL, 2131303434);
              CD(3);
              c((com.tencent.mm.plugin.shake.b.d)paramList.get(0));
              AppMethodBeat.o(24837);
            }
            else
            {
              if (this.quW)
                ay.au(this.mController.ylL, 2131303434);
              CD(3);
              kv(false);
              paramList = new Intent(this, ShakeItemListUI.class);
              paramList.putExtra("_key_show_type_", -1);
              paramList.putExtra("_key_title_", getString(2131303429));
              startActivity(paramList);
              AppMethodBeat.o(24837);
            }
          }
        }
        else if (this.qvd.qrR == 3)
        {
          i = paramList.size();
          if (i == 0)
          {
            WM(getString(2131303441));
            AppMethodBeat.o(24837);
          }
          else if (i == 1)
          {
            if (this.quW)
              ay.au(this.mController.ylL, 2131303434);
            CD(3);
            if (((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_type == 4)
            {
              paramList = com.tencent.mm.plugin.shake.d.a.i.d(((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_lvbuffer, paramLong);
              com.tencent.mm.aw.a.c(paramList);
              localObject = new Intent();
              ((Intent)localObject).putExtra("key_mode", 1);
              ((Intent)localObject).putExtra("key_offset", paramList.fJV);
              ((Intent)localObject).putExtra("music_player_beg_time", paramList.fKn);
              ((Intent)localObject).putExtra("key_scene", 3);
              if (com.tencent.mm.aw.d.ain())
                ((Intent)localObject).putExtra("KGlobalShakeMusic", true);
              com.tencent.mm.bp.d.b(this, "music", ".ui.MusicMainUI", (Intent)localObject);
              AppMethodBeat.o(24837);
            }
            else
            {
              ab.w("MicroMsg.ShakeReportUI", "Unexpected type, ignore.");
            }
          }
          else
          {
            AppMethodBeat.o(24837);
          }
        }
        else
        {
          if (this.qvd.qrR != 4)
            break;
          ckR();
          i = paramList.size();
          if (i == 0)
          {
            WM(getString(2131303485));
            AppMethodBeat.o(24837);
          }
          else
          {
            if (i == 1)
            {
              if (this.quW)
                ay.au(this.mController.ylL, 2131303434);
              CD(3);
              com.tencent.mm.plugin.shake.d.a.k.a((com.tencent.mm.plugin.shake.b.d)paramList.get(0), this);
            }
            AppMethodBeat.o(24837);
          }
        }
      }
    }
    if (this.qvd.qrR == 5)
      switch ((int)paramLong)
      {
      default:
      case 1:
      case 6:
      }
    while (true)
    {
      AppMethodBeat.o(24837);
      break;
      if ((!paramList.isEmpty()) && (((com.tencent.mm.plugin.shake.b.d)paramList.get(0)).field_type == 11))
      {
        if (paramList.size() == 1)
        {
          if (this.quW)
            ay.au(this.mController.ylL, 2131303434);
          CD(3);
          d((com.tencent.mm.plugin.shake.b.d)paramList.get(0));
          AppMethodBeat.o(24837);
          break;
        }
        if (this.quW)
          ay.au(this.mController.ylL, 2131303434);
        CD(3);
        kv(false);
        localObject = new Intent(this, ShakeItemListUI.class);
        ((Intent)localObject).putExtra("_key_show_type_", -12);
        ((Intent)localObject).putExtra("_key_title_", getString(2131303427));
        ((Intent)localObject).putExtra("_key_show_from_shake_", true);
        ((Intent)localObject).putExtra("_ibeacon_new_insert_size", paramList.size());
        startActivity((Intent)localObject);
        AppMethodBeat.o(24837);
        break;
      }
      WM(null);
      AppMethodBeat.o(24837);
      break;
      WM(getString(2131303416));
    }
  }

  public final void ckb()
  {
    AppMethodBeat.i(24847);
    com.tencent.mm.plugin.shake.c.c.a.cjM();
    ckJ();
    ckK();
    ckN();
    ckO();
    ckM();
    AppMethodBeat.o(24847);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130970658;
  }

  public final void initView()
  {
    AppMethodBeat.i(24822);
    com.tencent.mm.plugin.shake.c.c.a.cjM();
    this.qvY.put(Integer.valueOf(1), Boolean.TRUE);
    this.qvY.put(Integer.valueOf(3), Boolean.FALSE);
    this.qvY.put(Integer.valueOf(4), Boolean.FALSE);
    this.qvY.put(Integer.valueOf(5), Boolean.FALSE);
    this.qvY.put(Integer.valueOf(6), Boolean.FALSE);
    this.fGv = new com.tencent.mm.at.a.a(this);
    this.qvh = ((TextView)findViewById(2131827494));
    this.qvg = findViewById(2131827495);
    this.qvi = ((TextView)findViewById(2131827497));
    this.qvj = ((TextView)findViewById(2131827496));
    this.qvL = findViewById(2131827522);
    this.qvM = ((ImageView)findViewById(2131827524));
    this.qvN = ((ImageView)findViewById(2131827526));
    this.qvO = ((ImageView)findViewById(2131827528));
    this.qvP = ((ImageView)findViewById(2131827530));
    this.qvQ = findViewById(2131827523);
    this.qvR = findViewById(2131827525);
    this.qvS = findViewById(2131827527);
    this.qvT = findViewById(2131827529);
    this.qvf = findViewById(2131827500);
    this.qvf.setOnClickListener(this.qwi);
    this.eks = ((ImageView)this.qvf.findViewById(2131827501));
    this.eks.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(24808);
        if (ShakeReportUI.q(ShakeReportUI.this) != 5)
        {
          paramAnonymousView = new Intent(ShakeReportUI.this.mController.ylL, ProfileHdHeadImg.class);
          paramAnonymousView.putExtra("username", (String)ShakeReportUI.r(ShakeReportUI.this).getTag());
          ShakeReportUI.this.startActivity(paramAnonymousView);
        }
        AppMethodBeat.o(24808);
      }
    });
    ckF();
    Object localObject = View.inflate(this.mController.ylL, 2130970654, null);
    this.qvz = new com.tencent.mm.ui.base.i(this.mController.ylL, 2131493867);
    this.qvz.setContentView((View)localObject);
    this.qvz.setOnCancelListener(new ShakeReportUI.4(this));
    ((Button)((View)localObject).findViewById(2131827481)).setOnClickListener(new ShakeReportUI.5(this));
    aw.ZK();
    boolean bool1 = bo.e((Boolean)com.tencent.mm.model.c.Ry().get(4108, null));
    aw.ZK();
    boolean bool2 = bo.e((Boolean)com.tencent.mm.model.c.Ry().get(4117, null));
    if (!bool1)
    {
      ((View)localObject).setVisibility(0);
      this.qvz.show();
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(4108, Boolean.TRUE);
      setBackBtn(new ShakeReportUI.27(this));
      addIconOptionMenu(0, 2131296398, 2131230758, new ShakeReportUI.28(this));
      localObject = new ShakeReportUI.29(this);
      if ((!this.qwc) && (!this.qwa))
        break label778;
    }
    label778: for (this.qvA = ((ImageView)findViewById(2131827521)); ; this.qvA = ((ImageView)findViewById(2131827508)))
    {
      this.qvC = ((ImageView)findViewById(2131827514));
      this.qvD = ((ImageView)findViewById(2131827516));
      this.qvE = ((ImageView)findViewById(2131827519));
      this.qvF = ((ImageView)findViewById(2131827510));
      this.qvI = ((TextView)findViewById(2131827512));
      this.qvH = ((ImageView)findViewById(2131827511));
      this.qvG = ((ImageView)findViewById(2131827517));
      ckN();
      this.qvU.setOnClickListener((View.OnClickListener)localObject);
      findViewById(2131827520).setOnClickListener((View.OnClickListener)localObject);
      findViewById(2131827513).setOnClickListener((View.OnClickListener)localObject);
      findViewById(2131827515).setOnClickListener((View.OnClickListener)localObject);
      findViewById(2131827518).setOnClickListener((View.OnClickListener)localObject);
      findViewById(2131827509).setOnClickListener((View.OnClickListener)localObject);
      com.tencent.mm.sdk.b.a.xxA.c(this.qwg);
      com.tencent.mm.sdk.b.a.xxA.c(this.qwh);
      ckJ();
      ckM();
      ckR();
      AppMethodBeat.o(24822);
      return;
      if (bool2)
        break;
      Looper.myQueue().addIdleHandler(new ShakeReportUI.6(this));
      break;
    }
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(24846);
    if ((paramString == null) || (paramBitmap == null) || (paramBitmap.isRecycled()))
      AppMethodBeat.o(24846);
    while (true)
    {
      return;
      if ((this.qvu != null) && (this.qvu.getTag() != null) && (paramString.equals((String)this.qvu.getTag())))
        this.qvu.setImageBitmap(paramBitmap);
      AppMethodBeat.o(24846);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(24841);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default:
      AppMethodBeat.o(24841);
    case 1:
    case 2:
    case 30764:
    }
    while (true)
    {
      return;
      if (paramIntent == null)
      {
        AppMethodBeat.o(24841);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("CropImageMode", 4);
        localIntent.putExtra("CropImage_Filter", true);
        localIntent.putExtra("CropImage_DirectlyIntoFilter", true);
        StringBuilder localStringBuilder = new StringBuilder();
        aw.ZK();
        localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.model.c.XW() + "custom_shake_img_filename.jpg");
        com.tencent.mm.plugin.shake.a.gkE.a(localIntent, 2, this, paramIntent);
        AppMethodBeat.o(24841);
        continue;
        if (paramIntent == null)
        {
          AppMethodBeat.o(24841);
        }
        else
        {
          paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(4110, Boolean.FALSE);
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(4111, paramIntent);
          ckF();
          AppMethodBeat.o(24841);
          continue;
          if (paramIntent != null)
          {
            paramIntent = paramIntent.getBundleExtra("result_data");
            if ((paramIntent != null) && (paramIntent.getString("go_next", "").equals("gdpr_auth_location")))
            {
              com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVP, Boolean.TRUE);
              com.tencent.mm.pluginsdk.permission.b.b(this, "android.permission.ACCESS_COARSE_LOCATION", 64);
              this.gwZ = false;
              AppMethodBeat.o(24841);
            }
            else
            {
              this.gwZ = true;
              finish();
              AppMethodBeat.o(24841);
            }
          }
          else
          {
            this.gwZ = true;
            finish();
            AppMethodBeat.o(24841);
          }
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(24815);
    super.onCreate(paramBundle);
    setMMTitle(2131303452);
    xE(getResources().getColor(2131689913));
    Nb(getResources().getColor(2131689913));
    dyb();
    this.ecr = com.tencent.mm.modelgeo.d.agz();
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xKb, "");
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xKc, "");
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xMC, "");
    this.qvU = findViewById(2131827507);
    paramBundle = bp.aao();
    Object localObject1 = bo.nullAsNil(paramBundle.fnp);
    Object localObject2 = bo.nullAsNil(paramBundle.fno);
    paramBundle = com.tencent.mm.m.g.Nv().O("IBeacon", "GatedLaunch");
    if (!bo.isNullOrNil(paramBundle));
    while (true)
    {
      this.qwa = false;
      this.qwb = false;
      if (paramBundle != null);
      try
      {
        localObject3 = new org/json/JSONObject;
        ((JSONObject)localObject3).<init>(paramBundle);
        i = ((JSONObject)localObject3).getInt("gatedlaunch");
        aw.RK();
        if (i != 0)
        {
          int j;
          label221: String str;
          int m;
          if (i == 1)
          {
            paramBundle = ((JSONObject)localObject3).getJSONArray("citylist");
            j = paramBundle.length();
            i = 0;
            if (i < j)
            {
              localObject3 = paramBundle.getJSONObject(i);
              str = ((JSONObject)localObject3).getString("province");
              k = ((JSONObject)localObject3).getInt("allgatedlaunch");
              if ((str.equals(localObject1)) && (k == 1))
                this.qwa = true;
              while (true)
              {
                i++;
                break label221;
                paramBundle = null;
                break;
                if ((str.equals(localObject1)) && (k == 0))
                {
                  localObject3 = ((JSONObject)localObject3).getJSONArray("cities");
                  m = ((JSONArray)localObject3).length();
                  for (k = 0; k < m; k++)
                    if (((JSONArray)localObject3).getString(k).equals(localObject2))
                      this.qwa = true;
                }
              }
            }
          }
          else if (i == 2)
          {
            paramBundle = ((JSONObject)localObject3).getJSONArray("citylist");
            j = paramBundle.length();
            i = 0;
            if (i < j)
            {
              localObject3 = paramBundle.getJSONObject(i);
              str = ((JSONObject)localObject3).getString("province");
              k = ((JSONObject)localObject3).getInt("allgatedlaunch");
              if ((str.equals(localObject1)) && (k == 1))
              {
                this.qwb = true;
                this.qwa = true;
              }
              while (true)
              {
                i++;
                break;
                if ((str.equals(localObject1)) && (k == 0))
                {
                  localObject3 = ((JSONObject)localObject3).getJSONArray("cities");
                  m = ((JSONArray)localObject3).length();
                  for (k = 0; k < m; k++)
                    if (((JSONArray)localObject3).getString(k).equals(localObject2))
                    {
                      this.qwb = true;
                      this.qwa = true;
                    }
                }
              }
            }
          }
          else
          {
            if (i != 3)
              break label1431;
            this.qwa = true;
            this.qwb = false;
          }
        }
        if (aw.RK())
        {
          aw.ZK();
          if (((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xMu, Integer.valueOf(0))).intValue() == 1)
            this.qwc = true;
        }
        paramBundle = BluetoothAdapter.getDefaultAdapter();
        boolean bool = ah.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        if ((paramBundle != null) && (bool) && (Build.VERSION.SDK_INT >= 18) && (paramBundle.getState() == 12))
        {
          this.qwd = 0;
          if ((paramBundle == null) || (paramBundle.getState() != 12))
            break label1578;
          i = 1;
          if (!bool)
            break label1572;
          k = 1;
          if (!this.qwa)
            break label1481;
          com.tencent.mm.plugin.report.service.h.pYm.e(13139, new Object[] { localObject1, localObject2, Integer.valueOf(1), Integer.valueOf(this.qwd), Integer.valueOf(i), Integer.valueOf(k) });
          if ((this.qwc) || (this.qwa))
          {
            this.qvZ = true;
            this.qvU = findViewById(2131827520);
            if (this.qwb)
            {
              if ((paramBundle != null) && (paramBundle.getState() == 12))
                break label1539;
              this.qvZ = false;
            }
          }
          paramBundle = com.tencent.mm.plugin.shake.b.m.cjX();
          if (paramBundle.kaD == null)
            paramBundle.kaD = new ArrayList();
          paramBundle.kaD.add(new WeakReference(this));
          paramBundle = Boolean.FALSE;
          long l1 = bo.anT();
          long l2 = 0L;
          long l3 = 0L;
          if (aw.RK())
          {
            aw.ZK();
            com.tencent.mm.model.c.Ry().set(ac.a.xMr, Boolean.TRUE);
            aw.ZK();
            bool = bo.a((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xMp, null), false);
            aw.ZK();
            l2 = bo.a((Long)com.tencent.mm.model.c.Ry().get(ac.a.xMq, null), 0L);
            aw.ZK();
            l3 = bo.a((Long)com.tencent.mm.model.c.Ry().get(ac.a.xMk, null), 0L);
            paramBundle = Boolean.valueOf(bool);
          }
          if ((!paramBundle.booleanValue()) || (l1 - l2 >= l3))
            break label1565;
          this.qvJ = 5;
          this.qvZ = true;
          this.quX = true;
          initView();
          ckH();
          aw.ZK();
          paramBundle = bo.bc((String)com.tencent.mm.model.c.Ry().get(ac.a.xMo, null), "");
          aw.ZK();
          localObject1 = bo.bc((String)com.tencent.mm.model.c.Ry().get(ac.a.xMn, null), "");
          if ((localObject1 != null) && (!((String)localObject1).equals("")))
          {
            localObject2 = ((String)localObject1).split(",");
            localObject1 = new com.tencent.mm.plugin.shake.b.d();
            ((com.tencent.mm.plugin.shake.b.d)localObject1).field_type = 11;
            ((com.tencent.mm.plugin.shake.b.d)localObject1).field_username = localObject2[0];
            ((com.tencent.mm.plugin.shake.b.d)localObject1).field_nickname = localObject2[0];
            ((com.tencent.mm.plugin.shake.b.d)localObject1).field_signature = localObject2[1];
            ((com.tencent.mm.plugin.shake.b.d)localObject1).field_province = localObject2[2];
            ((com.tencent.mm.plugin.shake.b.d)localObject1).field_city = localObject2[3];
            ((com.tencent.mm.plugin.shake.b.d)localObject1).field_sex = 1;
          }
        }
      }
      catch (JSONException paramBundle)
      {
        while (true)
        {
          try
          {
            Object localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            ((com.tencent.mm.plugin.shake.b.d)localObject1).field_lvbuffer = (String.valueOf(localObject2[4]) + "," + String.valueOf(localObject2[5]) + "," + String.valueOf(localObject2[6])).getBytes("utf-8");
            ((com.tencent.mm.plugin.shake.b.d)localObject1).field_insertBatch = 2;
            localObject3 = com.tencent.mm.plugin.shake.b.m.cjS();
            ((com.tencent.mm.plugin.shake.b.e)localObject3).cjI();
            ((com.tencent.mm.plugin.shake.b.e)localObject3).a((com.tencent.mm.plugin.shake.b.d)localObject1, true);
            localObject3 = new LinkedList();
            ((List)localObject3).add(localObject1);
            b((List)localObject3, 1L);
            aw.ZK();
            com.tencent.mm.model.c.Ry().set(ac.a.xMn, "");
            paramBundle = paramBundle + "," + localObject2[4] + localObject2[5] + localObject2[6];
            aw.ZK();
            com.tencent.mm.model.c.Ry().set(ac.a.xMo, paramBundle);
            this.qvc = new c(this.mController.ylv);
            this.oOS = new com.tencent.mm.pluginsdk.i.d(this);
            if (!this.oOS.diK())
              com.tencent.mm.ui.base.h.a(this, 2131303443, 2131297061, new ShakeReportUI.12(this));
            if (com.tencent.mm.plugin.shake.a.gkF != null)
              com.tencent.mm.plugin.shake.a.gkF.BS();
            x.b(this);
            ab.i("MicroMsg.ShakeReportUI", "%s", new Object[] { getResources().getDisplayMetrics().toString() });
            i = com.tencent.mm.plugin.shake.b.m.cjT().baS();
            com.tencent.mm.plugin.report.service.h.pYm.e(11317, new Object[] { Integer.valueOf(i), e.ckT() });
            com.tencent.mm.plugin.report.service.h.pYm.e(11710, new Object[] { Integer.valueOf(1) });
            com.tencent.mm.plugin.report.service.h.pYm.k(834L, 0L, 1L);
            AppMethodBeat.o(24815);
            return;
            label1431: if (i != 4)
              continue;
            this.qwa = true;
            this.qwb = true;
            continue;
            paramBundle = paramBundle;
            ab.e("MicroMsg.ShakeReportUI", "[shakezb]parse dymanic setting json fail!!");
            this.qwa = false;
            this.qwb = false;
            continue;
            this.qwd = 1;
            continue;
            label1481: com.tencent.mm.plugin.report.service.h.pYm.e(13139, new Object[] { localObject1, localObject2, Integer.valueOf(0), Integer.valueOf(this.qwd), Integer.valueOf(i), Integer.valueOf(k) });
            continue;
            label1539: if (paramBundle == null)
              continue;
            paramBundle.getState();
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException)
          {
            ab.e("MicroMsg.ShakeReportUI", "[kevinkma]parst shakeItem error!");
            continue;
          }
          label1565: initView();
          continue;
          label1572: int k = 0;
          continue;
          label1578: int i = 0;
        }
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(24819);
    if ((this.qvy != null) && (!this.qvy.isRecycled()))
      this.qvy.recycle();
    if ((this.qvz != null) && (this.qvz.isShowing()))
    {
      this.qvz.dismiss();
      this.qvz = null;
    }
    if (this.qvd.qrS != null)
      this.qvd.qrS.cjw();
    if (this.oOS != null)
    {
      this.oOS.bgr();
      this.oOS = null;
    }
    Object localObject = com.tencent.mm.plugin.shake.d.a.j.a(null);
    if (com.tencent.mm.plugin.shake.d.a.j.isInited)
    {
      com.tencent.mm.plugin.shake.d.a.j.isInited = false;
      if (!((com.tencent.mm.plugin.shake.d.a.j)localObject).qtU.cku())
        ab.e("Micromsg.ShakeMusicMgr", "release MusicFingerPrintRecorder error");
    }
    com.tencent.mm.plugin.shake.d.a.j.qtV = null;
    x.c(this);
    com.tencent.mm.sdk.b.a.xxA.d(this.qwg);
    com.tencent.mm.sdk.b.a.xxA.d(this.qwh);
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xMr, Boolean.FALSE);
    ckD();
    if (com.tencent.mm.plugin.shake.c.c.a.cks())
      com.tencent.mm.x.c.PK().y(262154, false);
    ckL();
    localObject = com.tencent.mm.plugin.shake.b.m.cjX();
    if (((com.tencent.mm.plugin.shake.c.a.f)localObject).kaD != null);
    for (int i = 0; ; i++)
      if (i < ((com.tencent.mm.plugin.shake.c.a.f)localObject).kaD.size())
      {
        WeakReference localWeakReference = (WeakReference)((com.tencent.mm.plugin.shake.c.a.f)localObject).kaD.get(i);
        if (localWeakReference != null)
        {
          f.a locala = (f.a)localWeakReference.get();
          if ((locala != null) && (locala.equals(this)))
            ((com.tencent.mm.plugin.shake.c.a.f)localObject).kaD.remove(localWeakReference);
        }
      }
      else
      {
        localObject = com.tencent.mm.plugin.shake.b.m.cjY();
        ((com.tencent.mm.plugin.shake.c.a.d)localObject).ecs = -85.0F;
        ((com.tencent.mm.plugin.shake.c.a.d)localObject).ect = -1000.0F;
        if (this.ecr != null)
          this.ecr.c(this.ecy);
        super.onDestroy();
        AppMethodBeat.o(24819);
        return;
      }
  }

  public void onPause()
  {
    AppMethodBeat.i(24818);
    aw.ZK();
    com.tencent.mm.model.c.b(this);
    aw.ZK();
    com.tencent.mm.model.c.Ry().b(this);
    com.tencent.mm.plugin.shake.b.m.cjS().d(this);
    if (this.qvd.qrS != null)
      this.qvd.qrS.pause();
    this.quZ = false;
    if (this.oOS != null)
      this.oOS.bgr();
    this.qvc.ckz();
    if (this.qvJ != 5)
    {
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(327696, this.qvJ);
    }
    if (this.qvJ == 4)
      kt(false);
    ckD();
    super.onPause();
    AppMethodBeat.o(24818);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(24858);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.ShakeReportUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(24858);
      return;
    }
    ab.i("MicroMsg.ShakeReportUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 80:
    case 64:
    }
    while (true)
    {
      AppMethodBeat.o(24858);
      break;
      if (paramArrayOfInt[0] != 0)
      {
        com.tencent.mm.ui.base.h.a(this, getString(2131301928), getString(2131301936), getString(2131300878), getString(2131297773), false, new ShakeReportUI.19(this), new ShakeReportUI.20(this));
        AppMethodBeat.o(24858);
        break;
        if (paramArrayOfInt[0] == 0)
        {
          cdJ();
          AppMethodBeat.o(24858);
          break;
        }
        this.gwZ = false;
        com.tencent.mm.ui.base.h.a(this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131297773), false, new ShakeReportUI.21(this), new ShakeReportUI.23(this));
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(24816);
    super.onResume();
    if (this.gwZ)
      if (com.tencent.mm.au.b.sO((String)com.tencent.mm.kernel.g.RP().Ry().get(274436, null)))
      {
        if (com.tencent.mm.pluginsdk.permission.b.o(this, "android.permission.ACCESS_COARSE_LOCATION"))
          break label180;
        if (!((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVP, Boolean.FALSE)).booleanValue())
        {
          com.tencent.mm.plugin.account.a.b.a.b(this, getString(2131305910, new Object[] { aa.dor() }), 30764, true);
          AppMethodBeat.o(24816);
        }
      }
    while (true)
    {
      return;
      com.tencent.mm.pluginsdk.permission.b.b(this, "android.permission.ACCESS_COARSE_LOCATION", 64);
      AppMethodBeat.o(24816);
      continue;
      boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.ACCESS_COARSE_LOCATION", 64, "", "");
      ab.i("MicroMsg.ShakeReportUI", "summerper checkPermission checkposition[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this });
      if (!bool)
      {
        AppMethodBeat.o(24816);
      }
      else
      {
        label180: cdJ();
        AppMethodBeat.o(24816);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI
 * JD-Core Version:    0.6.2
 */