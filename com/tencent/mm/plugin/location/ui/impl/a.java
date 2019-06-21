package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.c.a;
import com.tencent.mm.plugin.k.b;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.model.e;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public abstract class a extends com.tencent.mm.plugin.k.a
{
  public Activity activity;
  protected int czL = 0;
  protected String eUu = "";
  protected ProgressDialog ehJ = null;
  ak handler = new ak(Looper.getMainLooper());
  int nJw;
  protected String nKN = "";
  protected String nLz;
  public String nOE = "";
  protected boolean nOF = false;
  public boolean nOG = false;
  protected Addr nOH = null;
  protected com.tencent.mm.plugin.location.ui.d nOI;
  protected LocationInfo nOJ = new LocationInfo((byte)0);
  protected LocationInfo nOK = new LocationInfo((byte)0);
  protected a.a nOL;
  protected boolean nOM = false;
  protected HashMap<String, com.tencent.mm.plugin.location.ui.c> nON = new HashMap();
  protected com.tencent.mm.modelgeo.c nOO;
  protected boolean nOP = false;
  protected ArrayList<String> nOQ = new ArrayList();
  protected boolean nOR = false;
  protected boolean nOS = false;
  protected com.tencent.mm.plugin.location.model.c nOT = null;
  protected com.tencent.mm.modelgeo.d nOU;
  public c.a nOV = new a.3(this);
  protected float neG = 0.0F;
  protected float neH = 0.0F;
  DisplayMetrics njz = null;
  protected int type = 0;

  public a(Activity paramActivity)
  {
    this.activity = paramActivity;
    this.nOO = com.tencent.mm.modelgeo.c.agw();
  }

  protected abstract String aoy();

  protected final void aqX()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this.activity.getSystemService("input_method");
    if (localInputMethodManager == null);
    while (true)
    {
      return;
      Object localObject = this.activity.getCurrentFocus();
      if (localObject != null)
      {
        localObject = ((View)localObject).getWindowToken();
        if (localObject != null)
          localInputMethodManager.hideSoftInputFromWindow((IBinder)localObject, 0);
      }
    }
  }

  protected final boolean b(LocationInfo paramLocationInfo)
  {
    boolean bool = false;
    if (this.nOL.nLY.getIController() == null);
    while (true)
    {
      return bool;
      if (e.j(paramLocationInfo.nJu, paramLocationInfo.nJv))
      {
        this.nOL.nLY.getIController().animateTo(paramLocationInfo.nJu, paramLocationInfo.nJv);
        bool = true;
      }
    }
  }

  protected final void bKi()
  {
    if ((this.nOL.nPd == null) || (this.nOL.nPe == null));
    while (true)
    {
      return;
      this.nOL.nPd.setText(j.b(this.nOL.nPd.getContext(), this.nLz, this.nOL.nPd.getTextSize()));
      if ((this.nOQ == null) || (this.nOQ.isEmpty()))
      {
        this.nOL.nPe.setText("");
      }
      else
      {
        String str1 = (String)this.nOQ.get(0);
        String str2 = this.activity.getResources().getString(2131299752);
        for (int i = 1; i < this.nOQ.size(); i++)
          str1 = str1 + str2 + (String)this.nOQ.get(i);
        this.nOL.nPe.setText(j.b(this.nOL.nPe.getContext(), str1, this.nOL.nPe.getTextSize()));
      }
    }
  }

  protected final void bKj()
  {
    this.nOL.nOY.removeAllViews();
    View localView = View.inflate(this.activity, 2130969944, null);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    this.nOL.nOY.addView(localView, localLayoutParams);
    this.nOL.nPd = ((TextView)localView.findViewById(2131825270));
    this.nOL.nPd.setOnClickListener(new a.1(this));
    this.nOL.nPe = ((TextView)localView.findViewById(2131825271));
    this.nOL.nPe.setOnClickListener(new a.2(this));
    bKi();
  }

  protected final String bKk()
  {
    return bo.bc(this.nLz, "");
  }

  protected abstract void bKl();

  abstract void bKm();

  public boolean bKn()
  {
    return true;
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      ab.d("MicroMsg.BaseMapUI", "dispatchKeyEvent");
      bKl();
      this.activity.finish();
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public final View findViewById(int paramInt)
  {
    return this.activity.findViewById(paramInt);
  }

  public final String getString(int paramInt)
  {
    return this.activity.getString(paramInt);
  }

  protected final void initView()
  {
    ab.d("MicroMsg.BaseMapUI", "initView");
    this.nOL.nPc = ((LinearLayout)findViewById(2131825945));
    this.nOL.nLY = ((com.tencent.mm.plugin.k.d)findViewById(2131820622));
    this.nOL.nOX = ((FrameLayout)findViewById(2131824671));
    this.nOL.nOY = ((RelativeLayout)findViewById(2131824673));
    this.nOL.lnh = ((ImageView)findViewById(2131825947));
    this.nOL.nOZ = ((ImageButton)findViewById(2131825951));
    this.nOL.nPa = findViewById(2131825952);
    this.nOL.nPb = ((TextView)findViewById(2131820958));
    this.nOL.titleView = ((TextView)findViewById(2131825948));
    this.nOL.nHi = ((TextView)findViewById(2131824676));
    this.nOL.titleView.setText(aoy());
    this.nOL.nLY.getIController().setZoom(com.tencent.mm.plugin.location.ui.d.bJM());
    if ((this.type != 0) && (this.type != 3))
    {
      this.nOL.nOZ.setVisibility(0);
      this.nOL.nPa.setVisibility(8);
      this.nOL.nOZ.setEnabled(false);
      this.nOL.nOZ.setImageResource(2130839555);
    }
    this.nOL.nLY.setBuiltInZoomControls(false);
    this.nOL.lnh.setOnClickListener(new a.4(this));
    this.nOL.nPb.setOnClickListener(new a.5(this));
    bKm();
    xE(com.tencent.mm.sdk.platformtools.ah.getResources().getColor(2131690310));
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (-1 != paramInt2);
    while (true)
    {
      return;
      if (4096 == paramInt1)
      {
        if (this.nOL.nPd != null)
        {
          paramIntent = paramIntent.getCharSequenceExtra("key_result");
          if (paramIntent == null);
          for (paramIntent = ""; ; paramIntent = paramIntent.toString())
          {
            this.nLz = paramIntent;
            bKi();
            break;
          }
        }
      }
      else if ((4100 == paramInt1) && (this.nOL.nPe != null))
      {
        this.nOQ = paramIntent.getStringArrayListExtra("key_fav_result_list");
        bKi();
      }
    }
  }

  public void onBackPressed()
  {
    this.activity.finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    this.nOU = com.tencent.mm.modelgeo.d.agz();
    LocationInfo localLocationInfo1 = this.nOK;
    LocationInfo localLocationInfo2 = this.nOJ;
    paramBundle = aa.g(com.tencent.mm.sdk.platformtools.ah.doB());
    ab.d("MicroMsg.BaseMapUI", " initLanguage ".concat(String.valueOf(paramBundle)));
    if (paramBundle.equals("language_default"))
    {
      aa.a(this.activity, Locale.ENGLISH);
      paramBundle = "en";
    }
    while (true)
    {
      localLocationInfo2.nJy = paramBundle;
      localLocationInfo1.nJy = paramBundle;
      ab.d("MicroMsg.BaseMapUI", "sosomap " + this.nOJ.nJy);
      this.activity.requestWindowFeature(1);
      this.activity.setContentView(2130969801);
      ((FrameLayout)findViewById(2131824670)).addView(d.ep(this.activity));
      this.nOI = new com.tencent.mm.plugin.location.ui.d(this.activity);
      this.nOL = new a.a(this);
      this.nLz = this.activity.getIntent().getStringExtra("kRemark");
      this.nOQ = this.activity.getIntent().getStringArrayListExtra("kTags");
      this.type = this.activity.getIntent().getIntExtra("map_view_type", 0);
      this.nOG = this.activity.getIntent().getBooleanExtra("kIs_pick_poi", false);
      ab.i("MicroMsg.BaseMapUI", "isPickPoi " + this.nOG);
      return;
      Locale localLocale = aa.amw(paramBundle);
      aa.a(this.activity, localLocale);
    }
  }

  public void onDestroy()
  {
    this.nOO.a(this.nOV);
    ab.d("MicroMsg.BaseMapUI", "destroy");
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    this.nOL.nLY.destroy();
    System.gc();
  }

  public void onPause()
  {
    y.d(false, new Intent().putExtra("classname", getClass().getName()));
  }

  public void onResume()
  {
    y.d(true, new Intent().putExtra("classname", getClass().getName()));
  }

  protected final void xE(int paramInt)
  {
    this.nOL.nPc.setBackgroundColor(paramInt);
    Boolean localBoolean = Boolean.valueOf(com.tencent.mm.ui.ah.Nw(paramInt));
    Object localObject;
    if (localBoolean.booleanValue())
    {
      this.nOL.lnh.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
      this.nOL.nOZ.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
      this.nOL.titleView.setTextColor(com.tencent.mm.sdk.platformtools.ah.getResources().getColor(2131690693));
      if (Build.VERSION.SDK_INT >= 21)
      {
        localObject = this.activity.getWindow();
        ((Window)localObject).clearFlags(201326592);
        ((Window)localObject).addFlags(-2147483648);
        if ((Build.VERSION.SDK_INT < 23) || (h.Mt()))
          break label237;
      }
    }
    while (true)
    {
      label123: this.activity.getWindow().setStatusBarColor(paramInt);
      if (Build.VERSION.SDK_INT >= 23)
      {
        localObject = this.activity.getWindow().getDecorView();
        paramInt = ((View)localObject).getSystemUiVisibility();
        if (!localBoolean.booleanValue())
          break label266;
        paramInt &= -8193;
      }
      while (true)
      {
        ((View)localObject).setSystemUiVisibility(paramInt);
        return;
        this.nOL.lnh.getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.nOL.nOZ.getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.nOL.titleView.setTextColor(com.tencent.mm.sdk.platformtools.ah.getResources().getColor(2131689764));
        break;
        label237: if (Build.VERSION.SDK_INT < 21)
          break label275;
        paramInt = com.tencent.mm.ui.ah.s(this.activity.getResources().getColor(2131690515), paramInt);
        break label123;
        label266: paramInt |= 8192;
      }
      label275: paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.a
 * JD-Core Version:    0.6.2
 */