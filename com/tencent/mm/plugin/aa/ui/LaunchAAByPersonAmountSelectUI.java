package com.tencent.mm.plugin.aa.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.aa.a.c.c;
import com.tencent.mm.plugin.aa.a.c.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LaunchAAByPersonAmountSelectUI extends BaseAAPresenterActivity
{
  private String cuP;
  private ak fbD;
  private c goe;
  private ListView gof;
  private TextView gog;
  private TextView goh;
  private View goi;
  private TextView goj;
  private boolean gok;
  private Map<String, String> gol;
  private LaunchAAByPersonAmountSelectUI.a gom;
  private double gon;
  private long goo;
  private int goq;
  private boolean gor;
  private boolean gos;
  private Runnable got;

  public LaunchAAByPersonAmountSelectUI()
  {
    AppMethodBeat.i(40805);
    this.goe = ((c)Z(c.class));
    this.gok = false;
    this.gol = new HashMap();
    this.gom = null;
    this.goo = -1L;
    this.goq = -1;
    this.gos = false;
    this.fbD = new ak(Looper.getMainLooper());
    this.got = new LaunchAAByPersonAmountSelectUI.1(this);
    AppMethodBeat.o(40805);
  }

  private void aoC()
  {
    AppMethodBeat.i(40807);
    try
    {
      this.gon = 0.0D;
      this.gor = false;
      if (this.gol != null)
      {
        Iterator localIterator = this.gol.values().iterator();
        while (localIterator.hasNext())
        {
          double d = bo.getDouble((String)localIterator.next(), 0.0D);
          this.gon += d;
          if ((this.goo > 0L) && (d * 100.0D > this.goo))
            this.gor = true;
        }
      }
    }
    catch (Exception localException)
    {
      ab.e("MicroMsg.LaunchAAByPersonAmountSelectUI", "updateTotalAmount error: %s", new Object[] { localException.getMessage() });
      AppMethodBeat.o(40807);
    }
    while (true)
    {
      return;
      Object localObject1;
      if (this.gom != null)
      {
        Object localObject2 = this.gom;
        localObject1 = this.gol;
        Object localObject3 = ((LaunchAAByPersonAmountSelectUI.a)localObject2).dataList.iterator();
        while (((Iterator)localObject3).hasNext())
          ((LaunchAAByPersonAmountSelectUI.b)((Iterator)localObject3).next()).goB = "";
        if ((localObject1 != null) && (((Map)localObject1).size() > 0))
        {
          localObject2 = ((LaunchAAByPersonAmountSelectUI.a)localObject2).dataList.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = (LaunchAAByPersonAmountSelectUI.b)((Iterator)localObject2).next();
            if (((Map)localObject1).containsKey(((LaunchAAByPersonAmountSelectUI.b)localObject3).username))
              ((LaunchAAByPersonAmountSelectUI.b)localObject3).goB = ((String)((Map)localObject1).get(((LaunchAAByPersonAmountSelectUI.b)localObject3).username));
          }
        }
      }
      this.goh.setText(getString(2131300914, new Object[] { Double.valueOf(this.gon) }));
      if ((this.gol != null) && (this.gol.size() > 0))
        updateOptionMenuText(233, getString(2131296340, new Object[] { Integer.valueOf(this.gol.size()) }));
      while (true)
      {
        if (!this.gor)
          break label477;
        h.pYm.e(13722, new Object[] { Integer.valueOf(7) });
        enableOptionMenu(233, false);
        localObject1 = getString(2131300927, new Object[] { Float.valueOf((float)this.goo / 100.0F) });
        if (!bo.isNullOrNil((String)localObject1))
        {
          this.goj.setText((CharSequence)localObject1);
          if (!this.goj.isShown())
          {
            this.goj.startAnimation(AnimationUtils.loadAnimation(this, 2131034193));
            this.goj.setVisibility(0);
          }
        }
        AppMethodBeat.o(40807);
        break;
        updateOptionMenuText(233, getString(2131296994));
      }
      label477: enableOptionMenu(233, true);
      if (this.goj.isShown())
      {
        this.goj.setText("");
        this.goj.startAnimation(AnimationUtils.loadAnimation(this, 2131034213));
        this.goj.setVisibility(8);
      }
      AppMethodBeat.o(40807);
    }
  }

  private void aoD()
  {
    AppMethodBeat.i(40808);
    if (this.gon > 0.0D)
    {
      this.gok = true;
      this.gog.setTextColor(getResources().getColor(2131689792));
      AppMethodBeat.o(40808);
    }
    while (true)
    {
      return;
      this.gok = false;
      this.gog.setTextColor(getResources().getColor(2131689791));
      AppMethodBeat.o(40808);
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969918;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(40806);
    super.onCreate(paramBundle);
    setMMTitle(2131300915);
    setBackBtn(new LaunchAAByPersonAmountSelectUI.2(this));
    a(233, getString(2131296994), new LaunchAAByPersonAmountSelectUI.3(this), q.b.ymu);
    this.gof = ((ListView)findViewById(2131825208));
    this.gog = ((TextView)findViewById(2131825210));
    this.goh = ((TextView)findViewById(2131825211));
    this.goh.setText(getString(2131300914, new Object[] { Float.valueOf(0.0F) }));
    this.goi = findViewById(2131825209);
    this.goj = ((TextView)findViewById(2131825212));
    this.gnR = this.gof;
    this.goi.setVisibility(8);
    this.gog.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        AppMethodBeat.i(40792);
        boolean bool;
        if (!LaunchAAByPersonAmountSelectUI.k(LaunchAAByPersonAmountSelectUI.this))
        {
          bool = true;
          AppMethodBeat.o(40792);
          return bool;
        }
        if ((paramAnonymousMotionEvent.getAction() == 0) || (paramAnonymousMotionEvent.getAction() == 2))
          LaunchAAByPersonAmountSelectUI.l(LaunchAAByPersonAmountSelectUI.this).setTextColor(LaunchAAByPersonAmountSelectUI.this.getResources().getColor(2131689793));
        while (true)
        {
          bool = false;
          AppMethodBeat.o(40792);
          break;
          if (LaunchAAByPersonAmountSelectUI.k(LaunchAAByPersonAmountSelectUI.this))
            LaunchAAByPersonAmountSelectUI.l(LaunchAAByPersonAmountSelectUI.this).setTextColor(LaunchAAByPersonAmountSelectUI.this.getResources().getColor(2131689792));
          else
            LaunchAAByPersonAmountSelectUI.l(LaunchAAByPersonAmountSelectUI.this).setTextColor(LaunchAAByPersonAmountSelectUI.this.getResources().getColor(2131689791));
        }
      }
    });
    this.gog.setOnClickListener(new LaunchAAByPersonAmountSelectUI.6(this));
    this.gok = true;
    this.gof.setOnScrollListener(new LaunchAAByPersonAmountSelectUI.7(this));
    this.cuP = getIntent().getStringExtra("chatroom");
    this.goo = getIntent().getLongExtra("maxPerAmount", -1L);
    this.goq = getIntent().getIntExtra("maxUserNumber", -1);
    Object localObject = getIntent().getStringArrayListExtra("oldAmountData");
    ab.i("MicroMsg.LaunchAAByPersonAmountSelectUI", "onCreate, chatroom: %s, maxPerAmount: %s, oldDataList: %s", new Object[] { this.cuP, Long.valueOf(this.goo), localObject });
    this.gol = new HashMap();
    paramBundle = new HashMap();
    if (localObject != null)
      try
      {
        if (((ArrayList)localObject).size() > 0)
        {
          Iterator localIterator = ((ArrayList)localObject).iterator();
          while (localIterator.hasNext())
          {
            localObject = ((String)localIterator.next()).split(",");
            if ((localObject != null) && (localObject.length == 2))
            {
              double d = bo.getDouble(localObject[1], 0.0D);
              paramBundle.put(localObject[0], Double.valueOf(d));
              this.gol.put(localObject[0], getString(2131296331, new Object[] { Double.valueOf(d) }));
            }
          }
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.LaunchAAByPersonAmountSelectUI", "onCreate parse old data error: %s", new Object[] { localException.getMessage() });
      }
    this.goe.aG(c.a.class);
    this.goe.a(c.a.class, new LaunchAAByPersonAmountSelectUI.4(this, paramBundle));
    AppMethodBeat.o(40806);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(40809);
    super.onDestroy();
    if (this.gol != null)
      this.gol.clear();
    AppMethodBeat.o(40809);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI
 * JD-Core Version:    0.6.2
 */