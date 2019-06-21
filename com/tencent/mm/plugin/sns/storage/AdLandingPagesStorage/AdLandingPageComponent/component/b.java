package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends h
{
  int qYI;
  private RecyclerView qYJ;
  private b.b qYK;
  private Map<Integer, b.a> qYL;
  LinearLayoutManager qYM;
  Set<Integer> qYN;

  public b(Context paramContext, l paraml, ViewGroup paramViewGroup)
  {
    super(paramContext, paraml, paramViewGroup);
    AppMethodBeat.i(37024);
    this.qYI = a.fromDPToPix(paramContext, 12);
    this.qYL = new HashMap();
    this.qYN = new HashSet();
    AppMethodBeat.o(37024);
  }

  private void cpl()
  {
    AppMethodBeat.i(37026);
    if (this.qYM != null)
      fm(this.qYM.iQ(), this.qYM.iS());
    AppMethodBeat.o(37026);
  }

  private void fm(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37027);
    while (paramInt1 <= paramInt2)
    {
      b.a locala1 = (b.a)this.qYL.get(Integer.valueOf(paramInt1));
      b.a locala2 = locala1;
      if (locala1 == null)
      {
        locala2 = new b.a(this, (byte)0);
        this.qYL.put(Integer.valueOf(paramInt1), locala2);
      }
      locala2.cpm();
      paramInt1++;
    }
    AppMethodBeat.o(37027);
  }

  public final void cpa()
  {
    AppMethodBeat.i(37028);
    super.cpa();
    cpl();
    AppMethodBeat.o(37028);
  }

  public final void cpb()
  {
    AppMethodBeat.i(37029);
    super.cpb();
    if (this.qYM != null)
    {
      int i = this.qYM.iQ();
      int j = this.qYM.iS();
      while (i <= j)
      {
        b.a locala = (b.a)this.qYL.get(Integer.valueOf(i));
        if (locala != null)
          locala.cpn();
        i++;
      }
    }
    AppMethodBeat.o(37029);
  }

  public final void cpk()
  {
    AppMethodBeat.i(37025);
    this.qYJ = ((RecyclerView)this.contentView.findViewById(2131827630));
    this.qYJ.setBackgroundColor(((l)this.qZo).backgroundColor);
    Iterator localIterator = ((l)this.qZo).qWB.iterator();
    int i = 0;
    Object localObject;
    int j;
    do
    {
      if (!localIterator.hasNext())
        break;
      r localr = (r)localIterator.next();
      if (!(localr instanceof n))
        break label253;
      localObject = (n)localr;
      float f = localr.qWR;
      j = (int)(localr.qWQ + f + ((n)localObject).height) + (this.qYI << 1);
    }
    while (i > j);
    label253: 
    while (true)
    {
      i = j;
      continue;
      localObject = this.qYJ.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).height = i;
      this.qYJ.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.qYK = new b.b(this, (byte)0);
      this.qYJ.setAdapter(this.qYK);
      this.qYM = new LinearLayoutManager();
      this.qYM.setOrientation(0);
      this.qYJ.setLayoutManager(this.qYM);
      this.qYJ.a(new b.c(this, this.qYJ, this.qYM));
      this.qYJ.setNestedScrollingEnabled(false);
      this.qYJ.setHasFixedSize(true);
      AppMethodBeat.o(37025);
      return;
    }
  }

  protected final int getLayout()
  {
    return 2130970721;
  }

  public final boolean x(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(37030);
    boolean bool;
    if (paramJSONArray == null)
    {
      AppMethodBeat.o(37030);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject1 = new JSONObject();
      if (super.al((JSONObject)localObject1))
        paramJSONArray.put(localObject1);
      try
      {
        Object localObject2 = this.qYL;
        localObject1 = this.qYN;
        Object localObject3 = new java/util/HashSet;
        ((HashSet)localObject3).<init>();
        this.qYN = ((Set)localObject3);
        localObject3 = new java/util/HashMap;
        ((HashMap)localObject3).<init>();
        this.qYL = ((Map)localObject3);
        localObject2 = ((Map)localObject2).entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          Object localObject4 = (Map.Entry)((Iterator)localObject2).next();
          localObject3 = (r)((l)this.qZo).qWB.get(((Integer)((Map.Entry)localObject4).getKey()).intValue());
          if ((!((r)localObject3).qXb) && ((localObject3 instanceof n)))
          {
            Object localObject5 = (n)localObject3;
            localObject3 = new org/json/JSONObject;
            ((JSONObject)localObject3).<init>();
            ((JSONObject)localObject3).put("cid", ((r)((l)this.qZo).qWB.get(((Integer)((Map.Entry)localObject4).getKey()).intValue())).qWO);
            ((JSONObject)localObject3).put("exposureCount", ((b.a)((Map.Entry)localObject4).getValue()).count);
            ((JSONObject)localObject3).put("stayTime", ((b.a)((Map.Entry)localObject4).getValue()).time);
            if (((Set)localObject1).contains(((Map.Entry)localObject4).getKey()))
            {
              localObject4 = ag.ck(((n)localObject5).qWD);
              localObject5 = new org/json/JSONObject;
              ((JSONObject)localObject5).<init>();
              ((JSONObject)localObject5).put("urlMd5", localObject4);
              ((JSONObject)localObject5).put("needDownload", 1);
              ((JSONObject)localObject3).put("imgUrlInfo", localObject5);
            }
            paramJSONArray.put(localObject3);
          }
        }
      }
      catch (JSONException paramJSONArray)
      {
        ab.e("AdLandingCarouselComp", bo.l(paramJSONArray));
        AppMethodBeat.o(37030);
        bool = false;
      }
      continue;
      AppMethodBeat.o(37030);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b
 * JD-Core Version:    0.6.2
 */