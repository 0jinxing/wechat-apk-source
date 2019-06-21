package com.tencent.mm.ay;

import android.view.View;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import junit.framework.Assert;

public abstract class a
{
  public static String fKU = "";
  public static String fKV = "";
  public String TEXT;
  public String TYPE;
  public bi cKd;
  public String fKW = "";
  public String fKX;
  public LinkedList<String> fKY = new LinkedList();
  public LinkedList<Integer> fKZ = new LinkedList();
  public LinkedList<Integer> fLa = new LinkedList();
  public Map<String, String> values;

  public a(Map<String, String> paramMap)
  {
    this.values = paramMap;
  }

  public a(Map<String, String> paramMap, bi parambi)
  {
    this.values = paramMap;
    this.cKd = parambi;
  }

  protected abstract boolean Yt();

  public final boolean aip()
  {
    if ((this.values != null) && (this.values.size() > 0))
    {
      if (this.values.containsKey(".sysmsg.$type"))
        this.TYPE = ((String)this.values.get(".sysmsg.$type"));
      fKU = ".sysmsg." + this.TYPE + ".text";
      if (this.values.containsKey(fKU))
        this.TEXT = ((String)this.values.get(fKU));
      fKV = ".sysmsg." + this.TYPE + ".link.scene";
      if (this.values.containsKey(fKV))
        this.fKX = ((String)this.values.get(fKV));
    }
    for (boolean bool = Yt(); ; bool = false)
    {
      return bool;
      ab.e("MicroMsg.BaseNewXmlMsg", "values == null || values.size() == 0 ");
    }
  }

  public static abstract class a
  {
    private static HashMap<String, a> fLb = new HashMap();

    public static void a(String paramString, a parama)
    {
      Assert.assertNotNull(paramString);
      Assert.assertNotNull(parama);
      synchronized (fLb)
      {
        fLb.put(paramString.toLowerCase(), parama);
        return;
      }
    }

    public static a b(Map<String, String> paramMap, bi parambi)
    {
      if (paramMap == null)
      {
        ab.e("MicroMsg.BaseNewXmlMsg", "values is null !!!");
        paramMap = null;
      }
      while (true)
      {
        return paramMap;
        String str = bo.bc((String)paramMap.get(".sysmsg.$type"), "");
        synchronized (fLb)
        {
          a locala = (a)fLb.get(str.toLowerCase());
          if (locala == null)
          {
            ab.w("MicroMsg.BaseNewXmlMsg", "TYPE %s is unDefine", new Object[] { str });
            paramMap = null;
            continue;
          }
          paramMap = locala.a(paramMap, parambi);
        }
      }
    }

    public abstract a a(Map<String, String> paramMap, bi parambi);
  }

  public static abstract interface b
  {
    public abstract void a(View paramView, bi parambi, a parama, int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ay.a
 * JD-Core Version:    0.6.2
 */