package com.tencent.mm.plugin.account.bind.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.modelsimple.BindWordingContent;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.protobuf.act;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMWizardActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class BindMobileStatusUI extends MMWizardActivity
{
  private SharedPreferences ehZ;
  private TextView grB;
  private Button grC;
  private TextView grR;
  private ImageView grS;
  private ImageView grT;
  private Boolean grU;
  private Boolean grV;
  private RelativeLayout grW;
  private RelativeLayout grX;
  private BindWordingContent grY;
  private int grZ;
  private ImageView gri;
  private boolean gsa;
  private boolean gsb;

  @SuppressLint({"UseSparseArrays"})
  private HashMap<Integer, Integer> gsc;
  private SparseArray<String> gsd;
  private int status;

  public BindMobileStatusUI()
  {
    AppMethodBeat.i(13499);
    this.grU = Boolean.TRUE;
    this.grV = Boolean.TRUE;
    this.gsc = new HashMap();
    this.gsd = new SparseArray(3);
    AppMethodBeat.o(13499);
  }

  private boolean b(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(13502);
    ab.d("MicroMsg.BindMobileStatusUI", "switch change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    label65: String str;
    Boolean localBoolean;
    if (paramBoolean)
    {
      this.status |= paramInt1;
      if (!paramBoolean)
        break label194;
      paramInt1 = 1;
      this.gsc.put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
      str = (String)this.gsd.get(paramInt2);
      if ((this.ehZ != null) && (str != null) && (str.length() > 0))
      {
        localBoolean = Boolean.valueOf(paramBoolean);
        if ((paramInt2 == 8) || (paramInt2 == 7))
          if (paramBoolean)
            break label199;
      }
    }
    label194: label199: for (paramBoolean = true; ; paramBoolean = false)
    {
      localBoolean = Boolean.valueOf(paramBoolean);
      this.ehZ.edit().putBoolean(str, localBoolean.booleanValue()).commit();
      AppMethodBeat.o(13502);
      return true;
      this.status &= (paramInt1 ^ 0xFFFFFFFF);
      break;
      paramInt1 = 2;
      break label65;
    }
  }

  public static void c(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = false;
    int i = 1;
    AppMethodBeat.i(13505);
    paramContext = paramContext.getSharedPreferences(paramContext.getPackageName() + "_preferences", 0);
    Object localObject = paramContext.edit();
    boolean bool2;
    if (!paramBoolean1)
    {
      bool2 = true;
      ((SharedPreferences.Editor)localObject).putBoolean("settings_find_me_by_mobile", bool2).commit();
      paramContext = paramContext.edit();
      bool2 = bool1;
      if (!paramBoolean2)
        bool2 = true;
      paramContext.putBoolean("settings_recommend_mobilefriends_to_me", bool2).commit();
      j = r.YD();
      if (!paramBoolean1)
        break label286;
      j |= 512;
      label121: if (!paramBoolean2)
        break label297;
      j |= 256;
      label133: g.RP().Ry().set(7, Integer.valueOf(j));
      localObject = new act();
      ((act)localObject).wkw = 8;
      if (!paramBoolean2)
        break label308;
      j = 1;
      label172: ((act)localObject).pvD = j;
      ((j)g.K(j.class)).XL().c(new j.a(23, (com.tencent.mm.bt.a)localObject));
      paramContext = new act();
      paramContext.wkw = 7;
      if (!paramBoolean1)
        break label314;
    }
    label286: label297: label308: label314: for (int j = i; ; j = 2)
    {
      ((act)localObject).pvD = j;
      ((j)g.K(j.class)).XL().c(new j.a(23, paramContext));
      com.tencent.mm.plugin.account.a.a.gkF.BS();
      AppMethodBeat.o(13505);
      return;
      bool2 = false;
      break;
      j &= -513;
      break label121;
      j &= -257;
      break label133;
      j = 2;
      break label172;
    }
  }

  public final int getLayoutId()
  {
    return 2130968836;
  }

  public final void initView()
  {
    boolean bool1 = true;
    AppMethodBeat.i(13503);
    this.gri = ((ImageView)findViewById(2131821737));
    this.grR = ((TextView)findViewById(2131821738));
    this.grB = ((TextView)findViewById(2131821739));
    this.grC = ((Button)findViewById(2131821740));
    this.grS = ((ImageView)findViewById(2131821742));
    this.grT = ((ImageView)findViewById(2131821744));
    this.grW = ((RelativeLayout)findViewById(2131821741));
    this.grX = ((RelativeLayout)findViewById(2131821743));
    switch (this.grZ)
    {
    default:
      if (this.grY != null);
      switch (this.grY.bWu.intValue())
      {
      case 0:
      case 1:
      default:
        label188: this.grC.setVisibility(8);
        addTextOptionMenu(0, getString(2131296944), new BindMobileStatusUI.1(this));
        if ((l.apS() == l.a.gvz) || (l.apS() == l.a.gvA))
        {
          this.gri.setImageResource(2130837900);
          String str = (String)g.RP().Ry().get(6, null);
          if ((str == null) || (str.equals("")))
            g.RP().Ry().get(4097, null);
        }
        break;
      case 2:
      }
      break;
    case 0:
    case 1:
    }
    while (true)
    {
      this.grS.setOnClickListener(new BindMobileStatusUI.2(this));
      this.grT.setOnClickListener(new BindMobileStatusUI.3(this));
      this.grC.setOnClickListener(new BindMobileStatusUI.4(this));
      AppMethodBeat.o(13503);
      return;
      this.grW.setVisibility(8);
      this.grX.setVisibility(8);
      if (!this.gsa)
      {
        bool2 = true;
        label368: b(bool2, 512, 8);
        if (this.gsb)
          break label407;
      }
      label407: for (boolean bool2 = bool1; ; bool2 = false)
      {
        b(bool2, 256, 7);
        break;
        bool2 = false;
        break label368;
      }
      this.grW.setVisibility(0);
      this.grW.setBackgroundResource(2130837904);
      this.grX.setVisibility(8);
      break;
      this.grB.setVisibility(8);
      break label188;
      this.gri.setImageResource(2130837897);
      this.grB.setVisibility(8);
      this.grR.setText(getString(2131297523));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13500);
    super.onCreate(paramBundle);
    this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.status = r.YD();
    this.gsd.put(8, "settings_find_me_by_mobile");
    this.gsd.put(7, "settings_recommend_mobilefriends_to_me");
    this.gsd.put(32, "settings_autoadd_mobilefriends");
    b(false, 512, 8);
    b(false, 256, 7);
    setMMTitle(2131297564);
    this.grY = ((BindWordingContent)getIntent().getParcelableExtra("kstyle_bind_wording"));
    this.grZ = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
    this.gsa = getIntent().getBooleanExtra("Kfind_friend_by_mobile_flag", false);
    this.gsb = getIntent().getBooleanExtra("Krecom_friends_by_mobile_flag", false);
    initView();
    AppMethodBeat.o(13500);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(13504);
    if (paramInt == 4)
    {
      Ni(1);
      AppMethodBeat.o(13504);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(13504);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(13501);
    g.RP().Ry().set(7, Integer.valueOf(this.status));
    Iterator localIterator = this.gsc.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      int i = ((Integer)((Map.Entry)localObject).getKey()).intValue();
      int j = ((Integer)((Map.Entry)localObject).getValue()).intValue();
      localObject = new act();
      ((act)localObject).wkw = i;
      ((act)localObject).pvD = j;
      ((j)g.K(j.class)).XL().c(new j.a(23, (com.tencent.mm.bt.a)localObject));
      ab.d("MicroMsg.BindMobileStatusUI", "switch  " + i + " " + j);
    }
    this.gsc.clear();
    super.onPause();
    AppMethodBeat.o(13501);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI
 * JD-Core Version:    0.6.2
 */