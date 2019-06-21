package com.tencent.mm.plugin.nearlife.ui;

import android.content.Context;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.axw;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.LatLongData;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class a extends BaseAdapter
{
  Context mContext;
  String mKey = "";
  View.OnClickListener mjE;
  protected String oRh = "";
  boolean oRm = false;
  private ArrayList<com.tencent.mm.plugin.nearlife.b.a> oRn = new ArrayList();
  private HashSet<String> oRo = new HashSet();
  ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> oRp = null;
  private Map<BackwardSupportUtil.ExifHelper.LatLongData, SKBuiltinBuffer_t> oRq;
  private Map<BackwardSupportUtil.ExifHelper.LatLongData, Integer> oRr;
  private Map<String, BackwardSupportUtil.ExifHelper.LatLongData> oRs;
  BackwardSupportUtil.ExifHelper.LatLongData oRt;
  boolean oRu = true;
  int oRv = 0;

  public a(Context paramContext, View.OnClickListener paramOnClickListener, String paramString, boolean paramBoolean)
  {
    this.mContext = paramContext;
    this.mjE = paramOnClickListener;
    this.mKey = paramString;
    this.oRm = paramBoolean;
    this.oRp = new ArrayList();
    this.oRq = new HashMap();
    this.oRr = new HashMap();
    this.oRs = new HashMap();
  }

  public static String cs(List<bts> paramList)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < paramList.size(); i++)
    {
      bts localbts = (bts)paramList.get(i);
      if ((localbts != null) && (localbts.wVI != null) && (!localbts.wVI.equals("")) && (!localbts.wVI.toLowerCase().equals("null")))
      {
        localStringBuffer.append(localbts.wVI);
        if (i < paramList.size() - 1)
          localStringBuffer.append("·");
      }
    }
    return localStringBuffer.toString();
  }

  public final com.tencent.mm.plugin.nearlife.b.a Ad(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.oRn.size()));
    for (com.tencent.mm.plugin.nearlife.b.a locala = (com.tencent.mm.plugin.nearlife.b.a)this.oRn.get(paramInt); ; locala = new com.tencent.mm.plugin.nearlife.b.a("", new axw()))
      return locala;
  }

  public final void L(ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> paramArrayList)
  {
    if (paramArrayList != null)
      this.oRp = paramArrayList;
  }

  public final void TB(String paramString)
  {
    if (paramString != null)
      this.oRh = paramString;
  }

  public final BackwardSupportUtil.ExifHelper.LatLongData TC(String paramString)
  {
    if (this.oRs.containsKey(paramString));
    for (paramString = (BackwardSupportUtil.ExifHelper.LatLongData)this.oRs.get(paramString); ; paramString = null)
      return paramString;
  }

  public final boolean TD(String paramString)
  {
    String str = paramString.trim();
    Iterator localIterator = this.oRn.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      paramString = (com.tencent.mm.plugin.nearlife.b.a)localIterator.next();
    }
    while ((bo.isNullOrNil(paramString.Title)) || (!str.equals(paramString.Title.trim())));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int TE(String paramString)
  {
    Iterator localIterator = this.oRn.iterator();
    int i = -1;
    int j;
    com.tencent.mm.plugin.nearlife.b.a locala;
    do
    {
      j = i;
      if (!localIterator.hasNext())
        break;
      locala = (com.tencent.mm.plugin.nearlife.b.a)localIterator.next();
      j = i + 1;
      i = j;
    }
    while (!locala.oQU.equals(paramString));
    return j;
  }

  public final SKBuiltinBuffer_t a(BackwardSupportUtil.ExifHelper.LatLongData paramLatLongData)
  {
    if (this.oRq.containsKey(paramLatLongData));
    for (paramLatLongData = (SKBuiltinBuffer_t)this.oRq.get(paramLatLongData); ; paramLatLongData = null)
      return paramLatLongData;
  }

  public final void a(com.tencent.mm.plugin.nearlife.b.a parama, int paramInt)
  {
    if ((!this.oRo.contains(parama.oQU)) && (paramInt <= this.oRn.size()))
    {
      this.oRn.add(paramInt, parama);
      this.oRo.add(parama.oQU);
      this.oRs.put(parama.oQU, this.oRt);
    }
  }

  public final void a(BackwardSupportUtil.ExifHelper.LatLongData paramLatLongData, int paramInt, SKBuiltinBuffer_t paramSKBuiltinBuffer_t)
  {
    int i = 0;
    float f1 = paramLatLongData.cEB;
    float f2 = paramLatLongData.fFz;
    if (paramSKBuiltinBuffer_t == null);
    while (true)
    {
      ab.d("MicroMsg.BaseLifeAdapter", "set flag & buf, lat:%f long:%f flag:%d len:%d", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(paramInt), Integer.valueOf(i) });
      if ((this.oRp.contains(paramLatLongData)) || ((this.oRt != null) && (this.oRt.equals(paramLatLongData))))
      {
        this.oRr.put(paramLatLongData, Integer.valueOf(paramInt));
        this.oRq.put(paramLatLongData, paramSKBuiltinBuffer_t);
      }
      return;
      i = paramSKBuiltinBuffer_t.getILen();
    }
  }

  public final void a(BackwardSupportUtil.ExifHelper.LatLongData paramLatLongData, List<com.tencent.mm.plugin.nearlife.b.a> paramList)
  {
    ab.i("MicroMsg.BaseLifeAdapter", "mkey %s addlifes %d", new Object[] { this.mKey, Integer.valueOf(paramList.size()) });
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      com.tencent.mm.plugin.nearlife.b.a locala = (com.tencent.mm.plugin.nearlife.b.a)paramList.next();
      if (!this.oRo.contains(locala.oQU))
      {
        this.oRn.add(locala);
        this.oRo.add(locala.oQU);
        this.oRs.put(locala.oQU, paramLatLongData);
      }
    }
    notifyDataSetChanged();
  }

  public final int b(BackwardSupportUtil.ExifHelper.LatLongData paramLatLongData)
  {
    if (this.oRr.containsKey(paramLatLongData));
    for (int i = ((Integer)this.oRr.get(paramLatLongData)).intValue(); ; i = 1)
      return i;
  }

  public final void bVj()
  {
    this.oRn.clear();
    this.oRo.clear();
    this.oRr.clear();
    this.oRq.clear();
    this.oRs.clear();
    this.oRv = 0;
    notifyDataSetChanged();
  }

  public final String bVk()
  {
    return this.oRh;
  }

  public final boolean bVl()
  {
    Iterator localIterator = this.oRp.iterator();
    boolean bool;
    while (localIterator.hasNext())
      if (b((BackwardSupportUtil.ExifHelper.LatLongData)localIterator.next()) > 0)
        bool = true;
    while (true)
    {
      return bool;
      if (this.oRu)
      {
        if (b(this.oRt) > 0)
          bool = true;
        else
          bool = false;
      }
      else
        bool = false;
    }
  }

  public int getCount()
  {
    return this.oRn.size();
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.a
 * JD-Core Version:    0.6.2
 */