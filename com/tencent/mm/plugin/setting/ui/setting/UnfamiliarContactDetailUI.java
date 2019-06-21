package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.HandlerThread;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.mo;
import com.tencent.mm.g.a.ro;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.setting.model.l;
import com.tencent.mm.plugin.setting.model.l.1;
import com.tencent.mm.plugin.setting.model.l.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.RealAlphabetScrollBar;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.List<Lcom.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.b;>;

public class UnfamiliarContactDetailUI extends MMActivity
  implements f
{
  public static final String emJ;
  private com.tencent.mm.ui.base.p ejZ;
  private ArrayList<UnfamiliarContactDetailUI.b> hUW;
  private boolean qjN;
  private boolean qjO;
  private boolean qjP;
  private RecyclerView qpG;
  private TextView qpH;
  private View qpI;
  private View qpJ;
  private View qpK;
  private View qpL;
  private TextView qpM;
  private UnfamiliarContactDetailUI.a qpN;
  private RealAlphabetScrollBar qpO;
  HashMap<String, Integer> qpP;
  private HashMap<Integer, String> qpQ;
  private HashSet<Integer> qpR;
  private UnfamiliarContactDetailUI.d qpS;
  private int qpT;
  private HashSet<String> qpU;
  private l qpV;
  private boolean qpW;

  static
  {
    AppMethodBeat.i(127683);
    emJ = new String(Character.toChars(123));
    AppMethodBeat.o(127683);
  }

  public UnfamiliarContactDetailUI()
  {
    AppMethodBeat.i(127669);
    this.qpP = new HashMap();
    this.qpQ = new HashMap();
    this.hUW = new ArrayList();
    this.qpR = new HashSet();
    this.qpT = -1;
    this.qpU = new HashSet();
    this.ejZ = null;
    AppMethodBeat.o(127669);
  }

  private void da(List<UnfamiliarContactDetailUI.b> paramList)
  {
    AppMethodBeat.i(127676);
    this.qpP.clear();
    this.qpQ.clear();
    int i = 0;
    Iterator localIterator = paramList.iterator();
    Object localObject;
    for (paramList = null; localIterator.hasNext(); paramList = (List<UnfamiliarContactDetailUI.b>)localObject)
    {
      localObject = (UnfamiliarContactDetailUI.b)localIterator.next();
      if (emJ.equalsIgnoreCase(((UnfamiliarContactDetailUI.b)localObject).qqd))
        ((UnfamiliarContactDetailUI.b)localObject).qqd = "#";
      localObject = ((UnfamiliarContactDetailUI.b)localObject).qqd;
      if (!((String)localObject).equalsIgnoreCase(paramList))
      {
        this.qpP.put(((String)localObject).toUpperCase(), Integer.valueOf(i));
        this.qpQ.put(Integer.valueOf(i), ((String)localObject).toUpperCase());
      }
      i++;
    }
    AppMethodBeat.o(127676);
  }

  private void fE(boolean paramBoolean)
  {
    AppMethodBeat.i(127677);
    ab.i("MicroMsg.UnfamiliarContactUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.ejZ = com.tencent.mm.ui.base.p.b(this, getString(2131304147), true, null);
      AppMethodBeat.o(127677);
    }
    while (true)
    {
      return;
      if ((this.ejZ != null) && (this.ejZ.isShowing()))
      {
        this.ejZ.dismiss();
        this.ejZ = null;
      }
      AppMethodBeat.o(127677);
    }
  }

  public final int getLayoutId()
  {
    return 2130970648;
  }

  public final void initView()
  {
    int i = 0;
    AppMethodBeat.i(127673);
    super.initView();
    setMMTitle(2131303330);
    addTextOptionMenu(1, getString(2131304150), new UnfamiliarContactDetailUI.1(this));
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(127637);
        UnfamiliarContactDetailUI.this.finish();
        AppMethodBeat.o(127637);
        return true;
      }
    });
    View localView = findViewById(2131827452);
    if (this.qjN)
    {
      j = 0;
      localView.setVisibility(j);
      localView = findViewById(2131827453);
      if (!this.qjP)
        break label351;
      j = 0;
      label90: localView.setVisibility(j);
      localView = findViewById(2131827454);
      if (!this.qjO)
        break label357;
    }
    label351: label357: for (int j = i; ; j = 8)
    {
      localView.setVisibility(j);
      this.qpG = ((RecyclerView)findViewById(2131827456));
      this.qpI = findViewById(2131823622);
      this.qpH = ((TextView)findViewById(2131827451));
      this.qpS = new UnfamiliarContactDetailUI.d(this, this.qpR, new UnfamiliarContactDetailUI.6(this));
      this.qpJ = findViewById(2131827460);
      this.qpJ.setOnClickListener(new UnfamiliarContactDetailUI.7(this));
      this.qpK = findViewById(2131827459);
      this.qpK.setOnClickListener(new UnfamiliarContactDetailUI.8(this));
      this.qpL = findViewById(2131827458);
      this.qpL.setOnClickListener(new UnfamiliarContactDetailUI.9(this));
      this.qpM = ((TextView)findViewById(2131821051));
      this.qpG.setLayoutManager(new LinearLayoutManager());
      this.qpN = new UnfamiliarContactDetailUI.a(this);
      this.qpG.setAdapter(this.qpN);
      this.qpO = ((RealAlphabetScrollBar)findViewById(2131827457));
      this.qpO.setOnScrollBarTouchListener(new UnfamiliarContactDetailUI.10(this));
      AppMethodBeat.o(127673);
      return;
      j = 8;
      break;
      j = 8;
      break label90;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127670);
    super.onCreate(paramBundle);
    g.Rg().a(291, this);
    this.qjN = getIntent().getBooleanExtra("half_year_not_chat", false);
    this.qjO = getIntent().getBooleanExtra("half_year_not_response", false);
    this.qjP = getIntent().getBooleanExtra("has_not_same_chatroom", false);
    initView();
    paramBundle = new UnfamiliarContactDetailUI.11(this);
    this.qpV = new l(this.qjN, this.qjO, this.qjP, paramBundle);
    paramBundle = this.qpV;
    paramBundle.qjX = System.currentTimeMillis();
    paramBundle.qjW.a(UnfamiliarContactDetailUI.e.qqs);
    paramBundle.eKj.aa(new l.1(paramBundle));
    AppMethodBeat.o(127670);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127672);
    super.onDestroy();
    int i;
    int j;
    if (this.qjN)
    {
      i = 1;
      if (!this.qjP)
        break label357;
      j = 2;
      label28: if (!this.qjO)
        break label362;
    }
    label357: label362: for (int k = 4; ; k = 0)
    {
      i = k | (j | i);
      h.pYm.e(14434, new Object[] { Integer.valueOf(i), Integer.valueOf(UnfamiliarContactDetailUI.f.qqv), Integer.valueOf(UnfamiliarContactDetailUI.f.qqu), Integer.valueOf(UnfamiliarContactDetailUI.f.qqz), Integer.valueOf(UnfamiliarContactDetailUI.f.qqw), Integer.valueOf(UnfamiliarContactDetailUI.f.qqy), Integer.valueOf(UnfamiliarContactDetailUI.f.qqx) });
      ab.i("MicroMsg.UnfamiliarContactUI", "[%s:%s:%s:%s:%s:%s:%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(UnfamiliarContactDetailUI.f.qqv), Integer.valueOf(UnfamiliarContactDetailUI.f.qqu), Integer.valueOf(UnfamiliarContactDetailUI.f.qqz), Integer.valueOf(UnfamiliarContactDetailUI.f.qqw), Integer.valueOf(UnfamiliarContactDetailUI.f.qqy), Integer.valueOf(UnfamiliarContactDetailUI.f.qqx) });
      UnfamiliarContactDetailUI.f.qqu = 0;
      UnfamiliarContactDetailUI.f.qqv = 0;
      UnfamiliarContactDetailUI.f.qqw = 0;
      UnfamiliarContactDetailUI.f.qqx = 0;
      UnfamiliarContactDetailUI.f.qqy = 0;
      UnfamiliarContactDetailUI.f.qqz = 0;
      g.Rg().b(291, this);
      g.Rg().b(681, this.qpS);
      l locall = this.qpV;
      ab.i("MicroMsg.UnfamiliarContactEngine", "[onDestroy] [%s:%s:%s]", new Object[] { Boolean.valueOf(locall.qjO), Boolean.valueOf(locall.qjN), Boolean.valueOf(locall.qjP) });
      if (locall.qjV != null)
      {
        l.a locala = locall.qjV;
        g.Rg().b(292, locala);
      }
      d.xDG.remove(locall.mRunnable);
      locall.eKj.oAl.quit();
      AppMethodBeat.o(127672);
      return;
      i = 0;
      break;
      j = 0;
      break label28;
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(127674);
    boolean bool;
    if (paramInt == 4)
    {
      onBackPressed();
      bool = true;
      AppMethodBeat.o(127674);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(127674);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(127671);
    super.onResume();
    int i;
    if (-1 != this.qpT)
    {
      if (-1 != this.qpT)
        break label76;
      i = 0;
    }
    while (true)
    {
      if (i != 0)
        UnfamiliarContactDetailUI.f.qqv += 1;
      this.qpT = -1;
      this.qpU.clear();
      if (this.qpN != null)
        this.qpN.aop.notifyChanged();
      AppMethodBeat.o(127671);
      return;
      label76: UnfamiliarContactDetailUI.b localb = (UnfamiliarContactDetailUI.b)this.hUW.get(this.qpT);
      ad localad1 = localb.ehM;
      ad localad2 = ((j)g.K(j.class)).XM().aoO(localad1.field_username);
      if ((!com.tencent.mm.n.a.jh(localad2.field_type)) && (com.tencent.mm.n.a.jh(localad1.field_type)))
      {
        this.hUW.remove(this.qpT);
        i = 1;
      }
      else
      {
        localb.ehM = localad2;
        i = 0;
      }
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(127675);
    ab.i("MicroMsg.UnfamiliarContactUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " " + paramm.getType());
    if ((paramInt1 != 0) || (paramInt2 != 0))
      Toast.makeText(this, getString(2131304152), 1).show();
    if (paramm.getType() == 291)
    {
      fE(false);
      this.qpU.clear();
      this.qpN.aop.notifyChanged();
    }
    AppMethodBeat.o(127675);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public static abstract interface h
  {
    public abstract void a(UnfamiliarContactDetailUI.e parame);

    public abstract void e(HashSet paramHashSet);

    public abstract void onError();

    public abstract void onSuccess();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI
 * JD-Core Version:    0.6.2
 */