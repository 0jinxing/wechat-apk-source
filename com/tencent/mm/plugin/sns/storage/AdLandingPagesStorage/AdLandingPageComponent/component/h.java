package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.v;
import com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.ae;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class h
{
  protected int backgroundColor;
  protected View contentView;
  protected Context context;
  private long iBA;
  protected int ieu;
  protected int iev;
  protected r qZo;
  private int qZp;
  private long qZq;
  boolean qZr;
  protected ViewGroup qZs;

  public h(Context paramContext, r paramr, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(37066);
    this.qZp = 0;
    this.qZq = 0L;
    this.iBA = 0L;
    this.qZr = false;
    this.contentView = null;
    this.context = paramContext;
    this.qZo = paramr;
    this.qZs = paramViewGroup;
    paramr = ad.eP(paramContext);
    this.ieu = paramr[0];
    this.iev = paramr[1];
    if (ae.hD(paramContext))
      this.iev -= ae.hC(paramContext);
    AppMethodBeat.o(37066);
  }

  public void a(r paramr)
  {
    AppMethodBeat.i(37067);
    r localr = this.qZo;
    if (localr == paramr)
      AppMethodBeat.o(37067);
    while (true)
    {
      return;
      if ((localr != null) && (localr.equals(paramr)))
      {
        AppMethodBeat.o(37067);
      }
      else
      {
        this.qZo = paramr;
        cpp();
        cpz();
        AppMethodBeat.o(37067);
      }
    }
  }

  public void ae(Map<String, Object> paramMap)
  {
  }

  public boolean al(JSONObject paramJSONObject)
  {
    boolean bool = false;
    AppMethodBeat.i(37075);
    if (this.qZp == 0)
      AppMethodBeat.o(37075);
    while (true)
    {
      return bool;
      if (this.qZo.qXb)
        AppMethodBeat.o(37075);
      else
        try
        {
          paramJSONObject.put("cid", this.qZo.qWO);
          paramJSONObject.put("exposureCount", this.qZp);
          paramJSONObject.put("stayTime", this.iBA);
          bool = true;
          AppMethodBeat.o(37075);
        }
        catch (JSONException paramJSONObject)
        {
          ab.printErrStackTrace("MicroMsg.Sns.AdLandingPageBaseComponent", paramJSONObject, "", new Object[0]);
          AppMethodBeat.o(37075);
        }
    }
  }

  public void coZ()
  {
    AppMethodBeat.i(37074);
    cpb();
    AppMethodBeat.o(37074);
  }

  public void cpA()
  {
  }

  protected final <T> T cpB()
  {
    try
    {
      r localr = this.qZo;
      return localr;
    }
    catch (Exception localException)
    {
      while (true)
        Object localObject = null;
    }
  }

  public final v cpC()
  {
    AppMethodBeat.i(37077);
    Object localObject1;
    if ((this.context instanceof SnsAdNativeLandingPagesUI))
    {
      localObject1 = (SnsAdNativeLandingPagesUI)this.context;
      if (((SnsAdNativeLandingPagesUI)localObject1).roz != null)
      {
        localObject1 = ((SnsAdNativeLandingPagesUI)localObject1).roz;
        AppMethodBeat.o(37077);
      }
    }
    while (true)
    {
      return localObject1;
      ((SnsAdNativeLandingPagesUI)localObject1).roz = new v();
      Object localObject2 = ((SnsAdNativeLandingPagesUI)localObject1).roz;
      if (((SnsAdNativeLandingPagesUI)localObject1).qXp == 0);
      for (int i = ((SnsAdNativeLandingPagesUI)localObject1).cvd; ; i = ((SnsAdNativeLandingPagesUI)localObject1).qXp)
      {
        ((v)localObject2).qXp = i;
        ((SnsAdNativeLandingPagesUI)localObject1).roz.qXq = ((SnsAdNativeLandingPagesUI)localObject1).rob;
        ((SnsAdNativeLandingPagesUI)localObject1).roz.qPj = ((SnsAdNativeLandingPagesUI)localObject1).qPj;
        ((SnsAdNativeLandingPagesUI)localObject1).roz.uin = ((SnsAdNativeLandingPagesUI)localObject1).uin;
        ((SnsAdNativeLandingPagesUI)localObject1).roz.qXr = ((SnsAdNativeLandingPagesUI)localObject1).qXr;
        ((SnsAdNativeLandingPagesUI)localObject1).roz.qTL = ((SnsAdNativeLandingPagesUI)localObject1).qTL;
        ((SnsAdNativeLandingPagesUI)localObject1).roz.hcx = ((SnsAdNativeLandingPagesUI)localObject1).hcx;
        v localv = ((SnsAdNativeLandingPagesUI)localObject1).roz;
        localObject2 = ((SnsAdNativeLandingPagesUI)localObject1).qXs;
        localv.qXs.putAll((Map)localObject2);
        localObject1 = ((SnsAdNativeLandingPagesUI)localObject1).roz;
        AppMethodBeat.o(37077);
        break;
      }
      localObject1 = new v();
      AppMethodBeat.o(37077);
    }
  }

  public void cpa()
  {
    AppMethodBeat.i(37070);
    if (this.qZr)
      AppMethodBeat.o(37070);
    while (true)
    {
      return;
      this.qZr = true;
      this.qZq = System.currentTimeMillis();
      this.qZp += 1;
      AppMethodBeat.o(37070);
    }
  }

  public void cpb()
  {
    AppMethodBeat.i(37071);
    if (!this.qZr)
      AppMethodBeat.o(37071);
    while (true)
    {
      return;
      this.qZr = false;
      if (this.qZq > 0L)
        this.iBA += System.currentTimeMillis() - this.qZq;
      this.qZq = 0L;
      AppMethodBeat.o(37071);
    }
  }

  public void cpc()
  {
  }

  public void cpk()
  {
  }

  protected void cpp()
  {
    AppMethodBeat.i(37069);
    ab.w("MicroMsg.Sns.AdLandingPageBaseComponent", "for component reuse, subclass must implement this method");
    AppMethodBeat.o(37069);
  }

  protected void cpq()
  {
  }

  protected View cpr()
  {
    return null;
  }

  public final r cpv()
  {
    return this.qZo;
  }

  public final int cpw()
  {
    AppMethodBeat.i(37072);
    View localView = getView();
    int[] arrayOfInt = new int[2];
    localView.getLocationOnScreen(arrayOfInt);
    int i = arrayOfInt[1];
    int j = localView.getHeight() + i;
    ab.v("MicroMsg.Sns.AdLandingPageBaseComponent", "comp %s , top %d,bottom %d ", new Object[] { this, Integer.valueOf(i), Integer.valueOf(j) });
    int k;
    if ((i >= 0) && (j <= this.iev))
      k = localView.getHeight();
    while (true)
    {
      AppMethodBeat.o(37072);
      return k;
      if ((i < 0) && (j > 0))
      {
        k = j;
        if (j <= this.iev);
      }
      else if ((i < 0) && (j > this.iev))
      {
        k = this.iev;
      }
      else if ((i < this.iev) && (j > this.iev))
      {
        k = this.iev - i;
      }
      else
      {
        k = 0;
      }
    }
  }

  public boolean cpx()
  {
    AppMethodBeat.i(37073);
    boolean bool;
    if (cpw() >= Math.min(getView().getHeight() >>> 1, this.iev >>> 1))
    {
      bool = true;
      AppMethodBeat.o(37073);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37073);
    }
  }

  public final String cpy()
  {
    return this.qZo.qWO;
  }

  public final void cpz()
  {
    AppMethodBeat.i(37076);
    Object localObject1;
    if (this.contentView == null)
    {
      localObject1 = new IllegalStateException("set field contentView first");
      AppMethodBeat.o(37076);
      throw ((Throwable)localObject1);
    }
    Object localObject2;
    int i;
    if (this.qZo != null)
    {
      localObject1 = this.contentView.getLayoutParams();
      if (localObject1 != null)
      {
        if (this.qZo.qWU != 2.147484E+009F)
          ((ViewGroup.LayoutParams)localObject1).width = ((int)this.qZo.qWU);
        if (this.qZo.qWV != 2.147484E+009F)
          ((ViewGroup.LayoutParams)localObject1).height = ((int)this.qZo.qWV);
        if ((localObject1 instanceof LinearLayout.LayoutParams))
        {
          localObject2 = (LinearLayout.LayoutParams)localObject1;
          i = getGravity();
          if (i != 0)
            ((LinearLayout.LayoutParams)localObject2).gravity = i;
        }
      }
    }
    label212: 
    while (true)
    {
      this.contentView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      AppMethodBeat.o(37076);
      while (true)
      {
        return;
        if (!(localObject1 instanceof FrameLayout.LayoutParams))
          break label212;
        localObject2 = (FrameLayout.LayoutParams)localObject1;
        i = getGravity();
        if (i == 0)
          break;
        ((FrameLayout.LayoutParams)localObject2).gravity = i;
        break;
        ab.i("MicroMsg.Sns.AdLandingPageBaseComponent", this + " has no layoutParams in container " + this.qZs);
        AppMethodBeat.o(37076);
      }
    }
  }

  public final int getGravity()
  {
    int i = 0;
    switch (this.qZo.qWY)
    {
    default:
      switch (this.qZo.qWZ)
      {
      default:
      case 1:
      case 0:
      case 2:
      }
      break;
    case 2:
    case 1:
    case 0:
    }
    while (true)
    {
      return i;
      i = 80;
      break;
      i = 16;
      break;
      i = 48;
      break;
      i |= 1;
      continue;
      i |= 3;
      continue;
      i |= 5;
    }
  }

  protected int getLayout()
  {
    return 2147483647;
  }

  public final View getView()
  {
    AppMethodBeat.i(37068);
    Object localObject;
    if (this.contentView != null)
    {
      localObject = this.contentView;
      AppMethodBeat.o(37068);
    }
    while (true)
    {
      return localObject;
      if (this.contentView == null)
      {
        int i = getLayout();
        if (i != 2147483647)
          this.contentView = ((LayoutInflater)this.context.getSystemService("layout_inflater")).inflate(i, this.qZs, false);
        while (this.contentView == null)
        {
          localObject = new IllegalStateException("implement getLayout() or customLayout() to get a valid root view");
          AppMethodBeat.o(37068);
          throw ((Throwable)localObject);
          this.contentView = cpr();
          if ((this.contentView != null) && (this.contentView.getLayoutParams() == null))
          {
            this.qZs.addView(this.contentView);
            localObject = this.contentView.getLayoutParams();
            this.qZs.removeView(this.contentView);
            this.contentView.setLayoutParams((ViewGroup.LayoutParams)localObject);
          }
        }
      }
      cpk();
      cpp();
      cpq();
      cpz();
      localObject = this.contentView;
      AppMethodBeat.o(37068);
    }
  }

  public final void setBackgroundColor(int paramInt)
  {
    this.backgroundColor = paramInt;
  }

  public boolean x(JSONArray paramJSONArray)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h
 * JD-Core Version:    0.6.2
 */