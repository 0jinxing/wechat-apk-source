package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.kernel.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.mogic.WxViewPager;
import java.util.HashMap;

@i
public class EmojiStoreV2UI extends MMActivity
{
  private int lfO;
  private HashMap<Integer, EmojiStoreV2BaseFragment> lfZ;
  EmojiStoreV2TabView lga;
  private EmojiStoreV2ViewPager lgb;
  private a lgc;
  private boolean lgd;
  private boolean lge;
  private int lgf;

  public EmojiStoreV2UI()
  {
    AppMethodBeat.i(53828);
    this.lfZ = new HashMap();
    this.lfO = 0;
    this.lgd = true;
    this.lge = false;
    this.lgf = -1;
    AppMethodBeat.o(53828);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969385;
  }

  public final void initView()
  {
    AppMethodBeat.i(53831);
    addIconOptionMenu(0, 2131230741, new EmojiStoreV2UI.1(this));
    addIconOptionMenu(1, 2131230758, new EmojiStoreV2UI.2(this));
    this.lga = ((EmojiStoreV2TabView)findViewById(2131823595));
    this.lgb = ((EmojiStoreV2ViewPager)findViewById(2131823596));
    this.lgb.setOffscreenPageLimit(0);
    this.lgc = new a(this, this.lgb, this.lgd);
    if (!this.lgd)
    {
      this.lga.setVisibility(8);
      AppMethodBeat.o(53831);
    }
    while (true)
    {
      return;
      this.lga.setVisibility(0);
      this.lga.bms();
      AppMethodBeat.o(53831);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(53834);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.d("MicroMsg.emoji.EmojiStoreV2UI", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    if ((this.lgc != null) && (this.lgc.un(this.lfO) != null))
      this.lgc.un(this.lfO).onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(53834);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53829);
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    this.lgf = getIntent().getIntExtra("download_entrance_scene", -1);
    paramBundle = com.tencent.mm.m.g.Nu().getValue("ShowPersonalEmotion");
    ab.i("MicroMsg.emoji.EmojiStoreV2UI", "get dynamic config value:%s", new Object[] { paramBundle });
    if ((!bo.isNullOrNil(paramBundle)) && (bo.ank(paramBundle) == 1));
    for (this.lgd = true; ; this.lgd = false)
    {
      if (this.lgd)
        this.lfO = getIntent().getIntExtra("emoji_tab", 0);
      initView();
      com.tencent.mm.kernel.g.RS().aa(new EmojiStoreV2UI.b((byte)0));
      boolean bool = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xJj, Boolean.FALSE)).booleanValue();
      if (this.lga != null)
        this.lga.gz(bool);
      h.pYm.a(406L, 0L, 1L, false);
      h.pYm.a(406L, 2L, System.currentTimeMillis() - l, false);
      AppMethodBeat.o(53829);
      return;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(53832);
    super.onDestroy();
    if (this.lfZ != null)
      this.lfZ.clear();
    if (this.lga != null)
    {
      EmojiStoreV2TabView localEmojiStoreV2TabView = this.lga;
      com.tencent.mm.sdk.b.a.xxA.d(localEmojiStoreV2TabView.lfW);
    }
    AppMethodBeat.o(53832);
  }

  public void onResume()
  {
    AppMethodBeat.i(53830);
    super.onResume();
    Looper.myQueue().addIdleHandler(new EmojiStoreV2UI.4(this));
    AppMethodBeat.o(53830);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final EmojiStoreV2BaseFragment um(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(53833);
    if (paramInt < 0)
      AppMethodBeat.o(53833);
    while (true)
    {
      return localObject2;
      if (!this.lfZ.containsKey(Integer.valueOf(paramInt)))
        break;
      localObject2 = (EmojiStoreV2BaseFragment)this.lfZ.get(Integer.valueOf(paramInt));
      AppMethodBeat.o(53833);
    }
    switch (paramInt)
    {
    default:
      ab.w("MicroMsg.emoji.EmojiStoreV2UI", "create fragment failed.");
      localObject2 = localObject1;
    case 0:
    case 1:
    }
    while (true)
    {
      ab.d("MicroMsg.emoji.EmojiStoreV2UI", "create fragment index:%d", new Object[] { Integer.valueOf(paramInt) });
      if (localObject2 != null)
        ((EmojiStoreV2BaseFragment)localObject2).setParent(this);
      this.lfZ.put(Integer.valueOf(paramInt), localObject2);
      AppMethodBeat.o(53833);
      break;
      localObject2 = (EmojiStoreV2BaseFragment)Fragment.instantiate(this, EmojiStoreV2MainFragment.class.getName(), null);
      continue;
      localObject2 = (EmojiStoreV2BaseFragment)Fragment.instantiate(this, EmojiStoreV2PersonFragment.class.getName(), null);
    }
  }

  final class a extends l
    implements ViewPager.OnPageChangeListener, EmojiStoreV2TabView.a
  {
    private boolean lgd;
    private WxViewPager lgh;

    public a(FragmentActivity paramWxViewPager, WxViewPager paramBoolean, boolean arg4)
    {
      super();
      AppMethodBeat.i(53820);
      this.lgd = false;
      boolean bool;
      this.lgd = bool;
      this.lgh = paramBoolean;
      this.lgh.setAdapter(this);
      this.lgh.setOnPageChangeListener(this);
      this.lgh.setCurrentItem(EmojiStoreV2UI.b(EmojiStoreV2UI.this));
      d.fP(11);
      if (EmojiStoreV2UI.c(EmojiStoreV2UI.this) != null)
        EmojiStoreV2UI.c(EmojiStoreV2UI.this).setOnTabClickListener(this);
      AppMethodBeat.o(53820);
    }

    public final int getCount()
    {
      if (this.lgd);
      for (int i = 2; ; i = 1)
        return i;
    }

    public final void onPageScrollStateChanged(int paramInt)
    {
      AppMethodBeat.i(53824);
      ab.d("MicroMsg.emoji.EmojiStoreV2UI", "onPageScrollStateChanged state:%d", new Object[] { Integer.valueOf(paramInt) });
      if ((paramInt == 0) && (EmojiStoreV2UI.this.um(EmojiStoreV2UI.b(EmojiStoreV2UI.this)) != null))
      {
        EmojiStoreV2BaseFragment localEmojiStoreV2BaseFragment = EmojiStoreV2UI.this.um(EmojiStoreV2UI.b(EmojiStoreV2UI.this));
        if ((localEmojiStoreV2BaseFragment.mListView != null) && (localEmojiStoreV2BaseFragment.kVA != null) && (localEmojiStoreV2BaseFragment.bmd()))
          localEmojiStoreV2BaseFragment.kVA.refreshView();
      }
      AppMethodBeat.o(53824);
    }

    public final void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
    {
      AppMethodBeat.i(53822);
      if (EmojiStoreV2UI.c(EmojiStoreV2UI.this) != null)
        EmojiStoreV2UI.c(EmojiStoreV2UI.this).l(paramInt1, paramFloat);
      AppMethodBeat.o(53822);
    }

    public final void onPageSelected(int paramInt)
    {
      AppMethodBeat.i(53823);
      ab.d("MicroMsg.emoji.EmojiStoreV2UI", "onPageSelected :%d", new Object[] { Integer.valueOf(paramInt) });
      EmojiStoreV2UI.a(EmojiStoreV2UI.this, paramInt);
      if (EmojiStoreV2UI.c(EmojiStoreV2UI.this) != null)
        EmojiStoreV2UI.c(EmojiStoreV2UI.this).setTo(paramInt);
      if ((EmojiStoreV2UI.b(EmojiStoreV2UI.this) == 1) && (!EmojiStoreV2UI.d(EmojiStoreV2UI.this)))
      {
        h.pYm.e(12090, new Object[0]);
        EmojiStoreV2UI localEmojiStoreV2UI = EmojiStoreV2UI.this;
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJj, Boolean.FALSE);
        if (localEmojiStoreV2UI.lga != null)
          localEmojiStoreV2UI.lga.gz(false);
        EmojiStoreV2UI.e(EmojiStoreV2UI.this);
      }
      AppMethodBeat.o(53823);
    }

    public final void onTabClick(int paramInt)
    {
      AppMethodBeat.i(53825);
      if (paramInt != EmojiStoreV2UI.b(EmojiStoreV2UI.this))
        this.lgh.setCurrentItem(paramInt, false);
      EmojiStoreV2UI.a(EmojiStoreV2UI.this, paramInt);
      AppMethodBeat.o(53825);
    }

    public final EmojiStoreV2BaseFragment un(int paramInt)
    {
      AppMethodBeat.i(53821);
      EmojiStoreV2BaseFragment localEmojiStoreV2BaseFragment = EmojiStoreV2UI.this.um(paramInt);
      AppMethodBeat.o(53821);
      return localEmojiStoreV2BaseFragment;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI
 * JD-Core Version:    0.6.2
 */